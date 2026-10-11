/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.ChannelDirectTCPIP;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Util;

public class ChannelDirectStreamLocal
extends ChannelDirectTCPIP {
    private static final byte[] C = Util.v("direct-streamlocal@openssh.com");
    private String B;

    ChannelDirectStreamLocal() {
        this.c = C;
        this.d = 131072;
        this.e = 131072;
        this.f = 16384;
    }

    public void M(String string) {
        this.B = string;
    }

    @Override
    protected Packet j() {
        Object object = this.B;
        if (object != null) {
            object = new Buffer(((String)object).length() + 50 + this.s.v());
            Packet packet = new Packet((Buffer)object);
            packet.c();
            ((Buffer)object).s((byte)90);
            ((Buffer)object).y(this.c);
            ((Buffer)object).v(this.a);
            ((Buffer)object).v(this.e);
            ((Buffer)object).v(this.f);
            ((Buffer)object).y(Util.v(this.B));
            ((Buffer)object).y(Util.v(this.y));
            ((Buffer)object).v(this.z);
            return packet;
        }
        this.s.A().a(4, "socketPath must be set");
        throw new RuntimeException("socketPath must be set");
    }
}

