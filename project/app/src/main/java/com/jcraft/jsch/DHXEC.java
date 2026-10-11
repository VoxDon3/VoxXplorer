/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.HASH;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.KeyExchange;
import com.jcraft.jsch.Logger;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.Util;
import com.jcraft.jsch.XDH;

abstract class DHXEC
extends KeyExchange {
    private Buffer A;
    private Packet B;
    private XDH C;
    protected String D;
    protected String E;
    protected int F;
    private int u;
    byte[] v;
    byte[] w;
    byte[] x;
    byte[] y;
    byte[] z;

    DHXEC() {
    }

    @Override
    public int k() {
        return this.u;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void m(Session session, byte[] byArray, byte[] object, byte[] byArray2, byte[] byArray3) throws Exception {
        Throwable var1_4;
        block6: {
            this.w = byArray;
            this.x = object;
            this.y = byArray2;
            this.z = byArray3;
            try {
                object = Class.forName(session.w(this.D)).asSubclass(HASH.class).getDeclaredConstructor(null).newInstance(null);
                this.b = object;
                object.e();
                this.A = new Buffer();
                object = new Packet(this.A);
                this.B = object;
                object.c();
                this.A.s((byte)30);
            }
            catch (Exception exception) {
                throw new JSchException(((Object)exception).toString(), exception);
            }
            try {
                object = Class.forName(session.w("xdh")).asSubclass(XDH.class).getDeclaredConstructor(null).newInstance(null);
                this.C = object;
                object.d(this.E, this.F);
                object = this.C.a();
                this.v = object;
                this.A.y((byte[])object);
                if (byArray != null) break block6;
                return;
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        session.m0(this.B);
        if (session.A().isEnabled(1)) {
            session.A().a(1, "SSH_MSG_KEX_ECDH_INIT sent");
            session.A().a(1, "expecting SSH_MSG_KEX_ECDH_REPLY");
        }
        this.u = 31;
        return;
        throw new JSchException(var1_4.toString(), (Throwable)var1_4);
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
                ((StringBuilder)object).append("type: must be SSH_MSG_KEX_ECDH_REPLY ");
                ((StringBuilder)object).append(n8);
                logger.a(3, ((StringBuilder)object).toString());
            }
            return false;
        }
        this.e = ((Buffer)object).p();
        Object object2 = ((Buffer)object).p();
        if (!this.C.c((byte[])object2)) {
            return false;
        }
        this.c = this.c(this.o(this.C.b((byte[])object2)));
        object = ((Buffer)object).p();
        this.A.A();
        this.A.y(this.x);
        this.A.y(this.w);
        this.A.y(this.z);
        this.A.y(this.y);
        this.A.y(this.e);
        this.A.y(this.v);
        this.A.y((byte[])object2);
        n8 = this.A.j();
        object2 = new byte[n8];
        this.A.e((byte[])object2);
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
}

