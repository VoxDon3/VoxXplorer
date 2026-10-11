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

class RequestWindowChange
extends Request {
    int d = 80;
    int e = 24;
    int f = 640;
    int g = 480;

    RequestWindowChange() {
    }

    @Override
    public void a(Session object, Channel channel) throws Exception {
        super.a((Session)object, channel);
        object = new Buffer();
        Packet packet = new Packet((Buffer)object);
        packet.c();
        ((Buffer)object).s((byte)98);
        ((Buffer)object).v(channel.o());
        ((Buffer)object).y(Util.v("window-change"));
        ((Buffer)object).s((byte)(this.c() ? 1 : 0));
        ((Buffer)object).v(this.d);
        ((Buffer)object).v(this.e);
        ((Buffer)object).v(this.f);
        ((Buffer)object).v(this.g);
        this.d(packet);
    }
}

