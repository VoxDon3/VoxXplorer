/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.IO;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Request;
import com.jcraft.jsch.RequestAgentForwarding;
import com.jcraft.jsch.RequestEnv;
import com.jcraft.jsch.RequestPtyReq;
import com.jcraft.jsch.RequestX11;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.Util;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;

class ChannelSession
extends Channel {
    private static byte[] G = Util.v("session");
    protected String A = "vt100";
    protected int B = 80;
    protected int C = 24;
    protected int D = 640;
    protected int E = 480;
    protected byte[] F = null;
    protected boolean w = false;
    protected boolean x = false;
    protected Hashtable<byte[], byte[]> y = null;
    protected boolean z = false;

    ChannelSession() {
        this.c = G;
        this.i = new IO();
    }

    private byte[] J(Object object) {
        if (object instanceof String) {
            return Util.v((String)object);
        }
        return (byte[])object;
    }

    protected void G() throws Exception {
        Object object;
        Request request;
        Session session = this.p();
        if (this.w) {
            ((Request)new RequestAgentForwarding()).a(session, this);
        }
        if (this.x) {
            ((Request)new RequestX11()).a(session, this);
        }
        if (this.z) {
            request = new RequestPtyReq();
            ((RequestPtyReq)request).f(this.A);
            ((RequestPtyReq)request).e(this.B, this.C, this.D, this.E);
            object = this.F;
            if (object != null) {
                ((RequestPtyReq)request).g((byte[])object);
            }
            request.a(session, this);
        }
        if ((object = this.y) != null) {
            Enumeration<byte[]> enumeration = ((Hashtable)object).keys();
            while (enumeration.hasMoreElements()) {
                byte[] byArray = enumeration.nextElement();
                object = this.y.get(byArray);
                request = new RequestEnv();
                ((RequestEnv)request).e(this.J(byArray), this.J(object));
                request.a(session, this);
            }
        }
    }

    public void H(boolean bl) {
        this.w = bl;
    }

    public void I(boolean bl) {
        this.z = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    void t() {
        Object object;
        block7: {
            InputStream inputStream;
            Object object2;
            Session session;
            object = new Buffer(this.h);
            Packet packet = new Packet((Buffer)object);
            try {
                session = this.p();
            }
            catch (Exception exception) {
                break block7;
            }
            while (this.s() && this.j != null && (object2 = this.i) != null && (inputStream = ((IO)object2).a) != null) {
                object2 = ((Buffer)object).b;
                int n8 = inputStream.read((byte[])object2, 14, ((Object)object2).length - 14 - session.v());
                if (n8 == 0) continue;
                if (n8 == -1) {
                    this.h();
                    break;
                }
                if (this.m) break;
                packet.c();
                ((Buffer)object).s((byte)94);
                ((Buffer)object).v(this.b);
                ((Buffer)object).v(n8);
                ((Buffer)object).E(n8);
                session.n0(packet, this, n8);
            }
        }
        if ((object = this.j) != null) {
            synchronized (object) {
                object.notifyAll();
            }
        }
        this.j = null;
    }
}

