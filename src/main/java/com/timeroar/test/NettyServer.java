package com.timeroar.test;

import com.timeroar.test.codec.MarshallingCodeCfactory;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * <p>NettyServer</p>
 * 测试 主从多reactor多线程模型服务
 * @author TimeRoar-Wang Ziming
 * @date 2022/5/15 21:43
 */
public class NettyServer {

    public static void main(String[] args) {

        // 主线程组
        NioEventLoopGroup masterGroup = new NioEventLoopGroup(1);
        // 从线程组
        NioEventLoopGroup workerGroup = new NioEventLoopGroup(4);

        //服务端bootstrap
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(masterGroup, workerGroup)
                // 频道类型
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline()
                                .addLast(MarshallingCodeCfactory.buildMarshallingEecoder())
                                .addLast(MarshallingCodeCfactory.buildMarshallingDecoder())
                                .addLast(new NettyServerHandler()); //处理Io事件
                    }
                });
        try {
            ChannelFuture channelFuture = serverBootstrap.bind(8888).syncUninterruptibly();
            System.out.println("Netty服务端启动成功");
            channelFuture.channel().closeFuture().syncUninterruptibly();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            workerGroup.shutdownGracefully();
            masterGroup.shutdownGracefully();
        }
    }
}
