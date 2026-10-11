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

class RequestPtyReq
extends Request {
    private String d = "vt100";
    private int e = 80;
    private int f = 24;
    private int g = 640;
    private int h = 480;
    private byte[] i = Util.c;

    RequestPtyReq() {
    }

    @Override
    public void a(Session object, Channel channel) throws Exception {
        super.a((Session)object, channel);
        Buffer buffer = new Buffer();
        object = new Packet(buffer);
        ((Packet)object).c();
        buffer.s((byte)98);
        buffer.v(channel.o());
        buffer.y(Util.v("pty-req"));
        buffer.s((byte)(this.c() ? 1 : 0));
        buffer.y(Util.v(this.d));
        buffer.v(this.e);
        buffer.v(this.f);
        buffer.v(this.g);
        buffer.v(this.h);
        buffer.y(this.i);
        this.d((Packet)object);
    }

    void e(int n8, int n9, int n10, int n11) {
        this.e = n8;
        this.f = n9;
        this.g = n10;
        this.h = n11;
    }

    void f(String string) {
        this.d = string;
    }

    void g(byte[] byArray) {
        this.i = byArray;
    }
}

