/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.GSSContext;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.JSchPartialAuthException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserAuth;
import com.jcraft.jsch.Util;

class UserAuthGSSAPIWithMIC
extends UserAuth {
    private static final byte[][] e = new byte[][]{{6, 9, 42, -122, 72, -122, -9, 18, 1, 2, 2}};
    private static final String[] f = new String[]{"gssapi-with-mic.krb5"};

    UserAuthGSSAPIWithMIC() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean a(Session object) throws Exception {
        String var4_12;
        Object object2;
        int n8;
        byte[] byArray;
        block19: {
            byte[] byArray2;
            byte[][] byArray3;
            super.a((Session)object);
            byArray = Util.v(this.d);
            this.b.c();
            this.c.s((byte)50);
            this.c.y(byArray);
            this.c.y(Util.v("ssh-connection"));
            this.c.y(Util.v("gssapi-with-mic"));
            this.c.v(e.length);
            for (n8 = 0; n8 < (byArray3 = e).length; ++n8) {
                this.c.y(byArray3[n8]);
            }
            ((Session)object).m0(this.b);
            while (true) {
                Buffer buffer;
                this.c = buffer = ((Session)object).M(this.c);
                n8 = buffer.h() & 0xFF;
                if (n8 == 51) {
                    return false;
                }
                if (n8 == 60) {
                    this.c.i();
                    this.c.c();
                    this.c.c();
                    byArray2 = this.c.p();
                    break;
                }
                if (n8 != 53) return false;
                this.c.i();
                this.c.c();
                this.c.c();
                byte[] byArray4 = this.c.p();
                this.c.p();
                String string = Util.c(byArray4);
                object2 = this.a;
                if (object2 == null) continue;
                object2.d(string);
            }
            for (n8 = 0; n8 < ((byte[][])(object2 = e)).length; ++n8) {
                if (!Util.a(byArray2, object2[n8])) continue;
                String string = f[n8];
                break block19;
            }
            Object var4_11 = null;
        }
        if (var4_12 == null) {
            return false;
        }
        try {
            object2 = Class.forName(((Session)object).w((String)var4_12)).asSubclass(GSSContext.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch (JSchException | Exception exception) {
            return false;
        }
        object2.c(this.d, ((Session)object).g0);
        byte[] byArray5 = new byte[]{};
        while (!object2.b()) {
            block22: {
                block21: {
                    Buffer buffer;
                    int n9;
                    block20: {
                        Buffer buffer2;
                        try {
                            Buffer buffer3;
                            Object var4_14;
                            byte[] byArray6 = object2.a((byte[])var4_14, 0, ((void)var4_14).length);
                            if (byArray6 != null) {
                                this.b.c();
                                this.c.s((byte)61);
                                this.c.y(byArray6);
                                ((Session)object).m0(this.b);
                            }
                            if (object2.b()) continue;
                            this.c = buffer3 = ((Session)object).M(this.c);
                            n9 = buffer3.h() & 0xFF;
                            if (n9 != 64) break block20;
                            this.c = buffer2 = ((Session)object).M(this.c);
                        }
                        catch (JSchException jSchException) {
                            return false;
                        }
                        n8 = buffer2.h();
                        break block21;
                    }
                    n8 = n9;
                    if (n9 != 65) break block22;
                    this.c = buffer = ((Session)object).M(this.c);
                    n8 = buffer.h();
                }
                n8 &= 0xFF;
            }
            if (n8 == 51) {
                return false;
            }
            this.c.i();
            this.c.c();
            this.c.c();
            byte[] byArray7 = this.c.p();
        }
        Buffer buffer = new Buffer();
        buffer.y(((Session)object).C());
        buffer.s((byte)50);
        buffer.y(byArray);
        buffer.y(Util.v("ssh-connection"));
        buffer.y(Util.v("gssapi-with-mic"));
        byte[] byArray8 = object2.e(buffer.b, 0, buffer.j());
        if (byArray8 == null) {
            return false;
        }
        this.b.c();
        this.c.s((byte)66);
        this.c.y(byArray8);
        ((Session)object).m0(this.b);
        object2.d();
        this.c = object = ((Session)object).M(this.c);
        n8 = ((Buffer)object).h() & 0xFF;
        if (n8 == 52) {
            return true;
        }
        if (n8 != 51) return false;
        this.c.i();
        this.c.c();
        this.c.c();
        object = this.c.p();
        if (this.c.c() != 0) throw new JSchPartialAuthException(Util.c((byte[])object));
        return false;
    }
}

