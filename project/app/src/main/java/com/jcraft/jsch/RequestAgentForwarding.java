/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Request;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.Util;

class RequestAgentForwarding
extends Request {
    RequestAgentForwarding() {
    }

    @Override
    public void a(Session session, Channel channel) throws Exception {
        super.a(session, channel);
        this.b(false);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte)98);
        buffer.v(channel.o());
        buffer.y(Util.v("auth-agent-req@openssh.com"));
        buffer.s((byte)(this.c() ? 1 : 0));
        this.d(packet);
        session.L = true;
    }
}

