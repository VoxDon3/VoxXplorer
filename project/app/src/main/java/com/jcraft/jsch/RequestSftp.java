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

class RequestSftp
extends Request {
    RequestSftp() {
        this.b(true);
    }

    @Override
    public void a(Session object, Channel channel) throws Exception {
        super.a((Session)object, channel);
        Buffer buffer = new Buffer();
        object = new Packet(buffer);
        ((Packet)object).c();
        buffer.s((byte)98);
        buffer.v(channel.o());
        buffer.y(Util.v("subsystem"));
        buffer.s((byte)(this.c() ? 1 : 0));
        buffer.y(Util.v("sftp"));
        this.d((Packet)object);
    }
}

