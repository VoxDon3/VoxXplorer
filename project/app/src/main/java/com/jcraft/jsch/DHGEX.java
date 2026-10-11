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

abstract class DHGEX
extends KeyExchange {
    byte[] A;
    byte[] B;
    byte[] C;
    private Buffer D;
    private Packet E;
    private byte[] F;
    private byte[] G;
    private byte[] H;
    protected String I;
    int u;
    int v;
    int w;
    private int x;
    DH y;
    byte[] z;

    DHGEX() {
    }

    static boolean q(int n8) {
        return n8 < 1024 || n8 > 8192 || n8 % 1024 != 0;
        {
        }
    }

    @Override
    public int k() {
        return this.x;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void m(Session object, byte[] object2, byte[] object3, byte[] byArray, byte[] byArray2) throws Exception {
        block6: {
            this.z = (byte[])object2;
            this.A = (byte[])object3;
            this.B = byArray;
            this.C = byArray2;
            this.b = object2 = Class.forName(((Session)object).w(this.I)).asSubclass(HASH.class).getDeclaredConstructor(null).newInstance(null);
            object2.e();
            this.D = new Buffer();
            this.E = new Packet(this.D);
            try {
                int n8;
                object2 = Class.forName(((Session)object).w("dh")).asSubclass(DH.class);
                this.u = Integer.parseInt(((Session)object).w("dhgex_min"));
                this.w = Integer.parseInt(((Session)object).w("dhgex_max"));
                this.v = Integer.parseInt(((Session)object).w("dhgex_preferred"));
                if (DHGEX.q(this.u) || DHGEX.q(this.w) || DHGEX.q(this.v) || (n8 = this.v) < this.u || this.w < n8) break block6;
                this.y = object2 = (DH)((Class)object2).getDeclaredConstructor(null).newInstance(null);
                object2.e();
                this.E.c();
                this.D.s((byte)34);
                this.D.v(this.u);
                this.D.v(this.v);
                this.D.v(this.w);
            }
            catch (Exception exception) {
                throw new JSchException(((Object)exception).toString(), exception);
            }
            ((Session)object).m0(this.E);
            if (((Session)object).A().isEnabled(1)) {
                object2 = ((Session)object).A();
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("SSH_MSG_KEX_DH_GEX_REQUEST(");
                ((StringBuilder)object3).append(this.u);
                ((StringBuilder)object3).append("<");
                ((StringBuilder)object3).append(this.v);
                ((StringBuilder)object3).append("<");
                ((StringBuilder)object3).append(this.w);
                ((StringBuilder)object3).append(") sent");
                object2.a(1, ((StringBuilder)object3).toString());
                ((Session)object).A().a(1, "expecting SSH_MSG_KEX_DH_GEX_GROUP");
            }
            this.x = 31;
            return;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Invalid DHGEX sizes: min=");
        ((StringBuilder)object2).append(this.u);
        ((StringBuilder)object2).append(" max=");
        ((StringBuilder)object2).append(this.w);
        ((StringBuilder)object2).append(" preferred=");
        ((StringBuilder)object2).append(this.v);
        object = new JSchException(((StringBuilder)object2).toString());
        throw object;
        catch (Exception exception) {
            throw new JSchException(((Object)exception).toString(), exception);
        }
    }

    @Override
    public boolean n(Buffer object) throws Exception {
        int n8 = this.x;
        if (n8 != 31) {
            if (n8 != 33) {
                return false;
            }
            ((Buffer)object).i();
            ((Buffer)object).c();
            n8 = ((Buffer)object).c();
            if (n8 != 33) {
                if (this.a.A().isEnabled(3)) {
                    object = this.a.A();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("type: must be SSH_MSG_KEX_DH_GEX_REPLY ");
                    stringBuilder.append(n8);
                    object.a(3, stringBuilder.toString());
                }
                return false;
            }
            this.e = ((Buffer)object).p();
            Object object2 = ((Buffer)object).l();
            object = ((Buffer)object).p();
            this.y.g((byte[])object2);
            this.y.b();
            this.c = this.c(this.o(this.y.c()));
            this.D.A();
            this.D.y(this.A);
            this.D.y(this.z);
            this.D.y(this.C);
            this.D.y(this.B);
            this.D.y(this.e);
            this.D.v(this.u);
            this.D.v(this.v);
            this.D.v(this.w);
            this.D.x(this.F);
            this.D.x(this.G);
            this.D.x(this.H);
            this.D.x((byte[])object2);
            n8 = this.D.j();
            object2 = new byte[n8];
            this.D.e((byte[])object2);
            this.b.b((byte[])object2, 0, n8);
            object2 = this.b;
            byte[] byArray = this.c;
            object2.b(byArray, 0, byArray.length);
            this.d = this.b.c();
            object2 = this.e;
            n8 = object2[0] << 24 & 0xFF000000 | object2[1] << 16 & 0xFF0000 | object2[2] << 8 & 0xFF00 | object2[3] & 0xFF;
            boolean bl = this.p(Util.d(object2, 4, n8), this.e, 4 + n8, (byte[])object);
            this.x = 0;
            return bl;
        }
        ((Buffer)object).i();
        ((Buffer)object).c();
        n8 = ((Buffer)object).c();
        if (n8 != 31) {
            if (this.a.A().isEnabled(3)) {
                Logger logger = this.a.A();
                object = new StringBuilder();
                ((StringBuilder)object).append("type: must be SSH_MSG_KEX_DH_GEX_GROUP ");
                ((StringBuilder)object).append(n8);
                logger.a(3, ((StringBuilder)object).toString());
            }
            return false;
        }
        this.F = ((Buffer)object).l();
        this.G = ((Buffer)object).l();
        this.y.d(this.F);
        this.y.f(this.G);
        this.H = this.y.a();
        this.E.c();
        this.D.s((byte)32);
        this.D.x(this.H);
        this.a.m0(this.E);
        if (this.a.A().isEnabled(1)) {
            this.a.A().a(1, "SSH_MSG_KEX_DH_GEX_INIT sent");
            this.a.A().a(1, "expecting SSH_MSG_KEX_DH_GEX_REPLY");
        }
        this.x = 33;
        return true;
    }
}

