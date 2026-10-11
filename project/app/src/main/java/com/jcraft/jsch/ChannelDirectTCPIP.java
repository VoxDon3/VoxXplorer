/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.IO;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.Util;
import com.jcraft.jsch.a;
import java.io.InputStream;
import java.io.OutputStream;

public class ChannelDirectTCPIP
extends Channel {
    private static final byte[] A = Util.v("direct-tcpip");
    String w;
    int x;
    String y = "127.0.0.1";
    int z = 0;

    ChannelDirectTCPIP() {
        this.c = A;
        this.d = 131072;
        this.e = 131072;
        this.f = 16384;
    }

    public void G(String string) {
        this.w = string;
    }

    public void H(InputStream inputStream) {
        this.i.h(inputStream);
    }

    public void I(String string) {
        this.y = string;
    }

    public void J(int n8) {
        this.z = n8;
    }

    public void K(OutputStream outputStream) {
        this.i.j(outputStream);
    }

    public void L(int n8) {
        this.x = n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d(int n8) throws JSchException {
        Exception exception2;
        block6: {
            block5: {
                this.r = n8;
                try {
                    Thread thread;
                    Session session = this.p();
                    if (!session.J()) {
                        JSchException jSchException = new JSchException("session is down");
                        throw jSchException;
                    }
                    if (this.i.a == null) {
                        this.u();
                        return;
                    }
                    Object object = new a(this);
                    this.j = thread = new Thread((Runnable)object);
                    object = new StringBuilder();
                    ((StringBuilder)object).append("DirectTCPIP thread ");
                    ((StringBuilder)object).append(session.x());
                    thread.setName(((StringBuilder)object).toString());
                    boolean bl = session.c0;
                    if (!bl) break block5;
                    this.j.setDaemon(bl);
                }
                catch (Exception exception2) {
                    break block6;
                }
            }
            this.j.start();
            return;
        }
        this.i.a();
        this.i = null;
        Channel.e(this);
        if (!(exception2 instanceof JSchException)) {
            return;
        }
        throw (JSchException)exception2;
    }

    @Override
    protected Packet j() {
        Buffer buffer = new Buffer(this.w.length() + 50 + this.y.length() + this.s.v());
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte)90);
        buffer.y(this.c);
        buffer.v(this.a);
        buffer.v(this.e);
        buffer.v(this.f);
        buffer.y(Util.v(this.w));
        buffer.v(this.x);
        buffer.y(Util.v(this.y));
        buffer.v(this.z);
        return packet;
    }

    @Override
    void q() {
        this.i = new IO();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    void t() {
        block10: {
            block9: {
                block8: {
                    try {
                        this.u();
                        var4_1 = new Buffer(this.h);
                        var2_2 = new Packet(var4_1);
                        var3_5 = this.p();
lbl6:
                        // 2 sources

                        while (this.s() && this.j != null && (var5_7 = this.i) != null && (var5_7 = var5_7.a) != null) {
                            var6_8 = var4_1.b;
                            var1_6 = var5_7.read(var6_8, 14, var6_8.length - 14 - var3_5.v());
                            if (var1_6 > 0) break block8;
                            this.h();
                            break block9;
                        }
                        break block9;
                    }
                    catch (Exception var2_3) {
                        break block10;
                    }
                }
                var2_2.c();
                var4_1.s((byte)94);
                var4_1.v(this.b);
                var4_1.v(var1_6);
                var4_1.E(var1_6);
                synchronized (this) {
                    block11: {
                        try {
                            if (!this.m) break block11;
                        }
                        catch (Throwable var2_4) {
                            ** break block12
                        }
                    }
                    var3_5.n0(var2_2, this, var1_6);
                    ** GOTO lbl6
lbl-1000:
                    // 1 sources

                    {
                        throw var2_4;
                    }
                }
            }
            this.h();
            this.f();
            return;
        }
        if (!this.n) {
            this.n = true;
        }
        this.f();
    }
}

