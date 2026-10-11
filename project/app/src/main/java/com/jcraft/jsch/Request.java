/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Session;

abstract class Request {
    private boolean a = false;
    private Session b = null;
    private Channel c = null;

    Request() {
    }

    void a(Session session, Channel channel) throws Exception {
        this.b = session;
        this.c = channel;
        if (channel.r > 0) {
            this.b(true);
        }
    }

    void b(boolean bl) {
        this.a = bl;
    }

    boolean c() {
        return this.a;
    }

    void d(Packet packet) throws Exception {
        if (this.a) {
            this.c.q = -1;
        }
        this.b.m0(packet);
        if (this.a) {
            long l8 = System.currentTimeMillis();
            long l9 = this.c.r;
            while (this.c.s() && this.c.q == -1) {
                try {
                    Thread.sleep(10L);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (l9 <= 0L || System.currentTimeMillis() - l8 <= l9) continue;
                this.c.q = 0;
                throw new JSchException("channel request: timeout");
            }
            if (this.c.q == 0) {
                throw new JSchException("failed to send channel request");
            }
        }
    }
}

