/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.DH;
import com.jcraft.jsch.HASH;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.KeyExchange;
import com.jcraft.jsch.Logger;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.Util;

abstract class DHGN
extends KeyExchange {
    byte[] A;
    private Buffer B;
    private Packet C;
    private int u;
    DH v;
    byte[] w;
    byte[] x;
    byte[] y;
    byte[] z;

    DHGN() {
    }

    @Override
    public int k() {
        return this.u;
    }

    @Override
    public void m(Session session, byte[] byArray, byte[] object, byte[] byArray2, byte[] byArray3) throws Exception {
        this.w = byArray;
        this.x = object;
        this.y = byArray2;
        this.z = byArray3;
        try {
            object = Class.forName(session.w(this.s())).asSubclass(HASH.class).getDeclaredConstructor(null).newInstance(null);
            this.b = object;
            object.e();
            this.B = new Buffer();
            this.C = new Packet(this.B);
        }
        catch (Exception exception) {
            throw new JSchException(((Object)exception).toString(), exception);
        }
        try {
            this.v = object = Class.forName(session.w("dh")).asSubclass(DH.class).getDeclaredConstructor(null).newInstance(null);
            object.e();
            this.v.d(this.r());
            this.v.f(this.q());
        }
        catch (Exception exception) {
            throw new JSchException(((Object)exception).toString(), exception);
        }
        this.A = this.v.a();
        this.C.c();
        this.B.s((byte)30);
        this.B.x(this.A);
        if (byArray == null) {
            return;
        }
        session.m0(this.C);
        if (session.A().isEnabled(1)) {
            session.A().a(1, "SSH_MSG_KEXDH_INIT sent");
            session.A().a(1, "expecting SSH_MSG_KEXDH_REPLY");
        }
        this.u = 31;
    }

    @Override
    public boolean n(Buffer object) throws Exception {
        if (this.u != 31) {
            return false;
        }
        ((Buffer)object).i();
        ((Buffer)object).c();
        int n8 = ((Buffer)object).c();
        if (n8 != 31) {
            if (this.a.A().isEnabled(3)) {
                Logger logger = this.a.A();
                object = new StringBuilder();
                ((StringBuilder)object).append("type: must be SSH_MSG_KEXDH_REPLY ");
                ((StringBuilder)object).append(n8);
                logger.a(3, ((StringBuilder)object).toString());
            }
            return false;
        }
        this.e = ((Buffer)object).p();
        Object object2 = ((Buffer)object).l();
        object = ((Buffer)object).p();
        this.v.g((byte[])object2);
        this.v.b();
        this.c = this.c(this.o(this.v.c()));
        this.B.A();
        this.B.y(this.x);
        this.B.y(this.w);
        this.B.y(this.z);
        this.B.y(this.y);
        this.B.y(this.e);
        this.B.x(this.A);
        this.B.x((byte[])object2);
        n8 = this.B.j();
        object2 = new byte[n8];
        this.B.e((byte[])object2);
        this.b.b((byte[])object2, 0, n8);
        object2 = this.b;
        byte[] byArray = this.c;
        object2.b(byArray, 0, byArray.length);
        this.d = this.b.c();
        object2 = this.e;
        n8 = object2[0] << 24 & 0xFF000000 | object2[1] << 16 & 0xFF0000 | object2[2] << 8 & 0xFF00 | object2[3] & 0xFF;
        boolean bl = this.p(Util.d(object2, 4, n8), this.e, 4 + n8, (byte[])object);
        this.u = 0;
        return bl;
    }

    abstract byte[] q();

    abstract byte[] r();

    abstract String s();
}

