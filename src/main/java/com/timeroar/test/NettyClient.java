package com.timeroar.test;

import com.timeroar.test.codec.MarshallingCodeCfactory;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * <p>NettyClient</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2022/5/16 13:39
 */
public class NettyClient {
    public static void main(String[] args) throws Exception {
        int port = 8888;
        String host = "127.0.0.1";
        //配置客户端NIO线程组
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(MarshallingCodeCfactory.buildMarshallingDecoder());
                            socketChannel.pipeline().addLast(MarshallingCodeCfactory.buildMarshallingEecoder());
                            socketChannel.pipeline().addLast(new NettyServerHandler());
                        }
                    });
            //发起异步连接操作
            ChannelFuture f = b.connect(host, port).syncUninterruptibly();

            TestEntity book = new TestEntity();
            book.setName("十万个为什么");
            book.setAge("22");
            f.channel().writeAndFlush(book);


            //等待客户端链路关闭
            f.channel().closeFuture().syncUninterruptibly();

        } catch (Exception e) {

        } finally {
            //优雅关闭
            group.shutdownGracefully();
        }
    }

}
