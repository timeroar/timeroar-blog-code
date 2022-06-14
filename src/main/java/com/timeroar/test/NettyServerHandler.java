package com.timeroar.test;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * <p>NettyServerHandler</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2022/5/15 21:49
 */
public class NettyServerHandler extends ChannelInboundHandlerAdapter {

    /**
     * 注册通道
     *
     * @param ctx ctx
     * @throws Exception 异常
     */
    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        super.channelRegistered(ctx);
    }

    /**
     * 通道未注册
     *
     * @param ctx ctx
     * @throws Exception 异常
     */
    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        super.channelUnregistered(ctx);
    }

    /**
     * 通道活性
     *
     * @param ctx ctx
     * @throws Exception 异常
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }

    /**
     * 频道不活跃
     *
     * @param ctx ctx
     * @throws Exception 异常
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
        super.channelReadComplete(ctx);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        TestEntity msg1 = (TestEntity) msg;
        System.out.println("服务端接收到的消息：" + msg1);
        ctx.writeAndFlush(msg1);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }
}
