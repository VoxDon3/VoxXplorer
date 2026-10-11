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

class RequestEnv
extends Request {
    byte[] d = new byte[0];
    byte[] e = new byte[0];

    RequestEnv() {
    }

    @Override
    public void a(Session object, Channel channel) throws Exception {
        super.a((Session)object, channel);
        this.b(false);
        object = new Buffer();
        Packet packet = new Packet((Buffer)object);
        packet.c();
        ((Buffer)object).s((byte)98);
        ((Buffer)object).v(channel.o());
        ((Buffer)object).y(Util.v("env"));
        ((Buffer)object).s((byte)0);
        ((Buffer)object).y(this.d);
        ((Buffer)object).y(this.e);
        this.d(packet);
    }

    void e(byte[] byArray, byte[] byArray2) {
        this.d = byArray;
        this.e = byArray2;
    }
}

