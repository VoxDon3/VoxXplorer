/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelX11;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Request;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.Util;

class RequestX11
extends Request {
    RequestX11() {
    }

    @Override
    public void a(Session session, Channel channel) throws Exception {
        super.a(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte)98);
        buffer.v(channel.o());
        buffer.y(Util.v("x11-req"));
        buffer.s((byte)(this.c() ? 1 : 0));
        buffer.s((byte)0);
        buffer.y(Util.v("MIT-MAGIC-COOKIE-1"));
        buffer.y(ChannelX11.I(session));
        buffer.v(0);
        this.d(packet);
        session.K = true;
    }
}

