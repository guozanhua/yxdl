package com.wanniu.db.connet;

import com.wanniu.core.logfs.Out;
import com.wanniu.core.tcp.protocol.Packet;
import com.wanniu.db.DBServer;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;


@Sharable
public class DBServerHandler
        extends ChannelInboundHandlerAdapter {
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        Out.debug(

                new Object[]{"建立与游戏服务器的连接:", ctx.channel().localAddress(), "->", ctx.channel().remoteAddress()});
        channelRegistered(ctx);
    }

    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        Out.debug(


                new Object[]{"游戏服务器连接被关闭:", ctx.channel().remoteAddress()});
        channelUnregistered(ctx);
        DBServer.onClose(ctx.channel());
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        Out.error(

                new Object[]{"连接出现异常，Session:", ctx.channel().remoteAddress(), "; Exception:", cause.getMessage()});
        ctx.channel().close();
    }

    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        DBServer.handlePacket((Packet) msg);
    }
}


