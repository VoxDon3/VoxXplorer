/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.JSchPartialAuthException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserAuth;
import com.jcraft.jsch.Util;
import java.util.Locale;

class UserAuthKeyboardInteractive
extends UserAuth {
    UserAuthKeyboardInteractive() {
    }

    @Override
    public boolean a(Session session) throws Exception {
        super.a(session);
        Object object = this.a;
        if (object != null && !(object instanceof UIKeyboardInteractive)) {
            return false;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(this.d);
        ((StringBuilder)object).append("@");
        ((StringBuilder)object).append(session.g0);
        Object object2 = object = ((StringBuilder)object).toString();
        if (session.i0 != 22) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(":");
            ((StringBuilder)object2).append(session.i0);
            object2 = ((StringBuilder)object2).toString();
        }
        byte[] byArray = session.k0;
        object = Util.v(this.d);
        if (session.f0 >= session.e0) {
            return false;
        }
        this.b.c();
        this.c.s((byte)50);
        this.c.y((byte[])object);
        this.c.y(Util.v("ssh-connection"));
        this.c.y(Util.v("keyboard-interactive"));
        object = this.c;
        Object object3 = Util.c;
        ((Buffer)object).y((byte[])object3);
        this.c.y((byte[])object3);
        session.m0(this.b);
        int n8 = 1;
        while (true) {
            int n9;
            block23: {
                byte[][] byArrayArray;
                boolean[] blArray;
                String[] stringArray;
                String string;
                String string2;
                block24: {
                    block22: {
                        this.c = object = session.M(this.c);
                        n9 = ((Buffer)object).h() & 0xFF;
                        if (n9 == 52) {
                            return true;
                        }
                        if (n9 == 53) {
                            this.c.i();
                            this.c.c();
                            this.c.c();
                            object = this.c.p();
                            this.c.p();
                            object3 = Util.c((byte[])object);
                            object = this.a;
                            if (object == null) continue;
                            object.d((String)object3);
                            continue;
                        }
                        if (n9 == 51) {
                            this.c.i();
                            this.c.c();
                            this.c.c();
                            object = this.c.p();
                            if (this.c.c() == 0) {
                                if (n8 != 0) {
                                    return false;
                                }
                                ++session.f0;
                                return false;
                            }
                            throw new JSchPartialAuthException(Util.c((byte[])object));
                        }
                        if (n9 != 60) break;
                        this.c.i();
                        this.c.c();
                        this.c.c();
                        string2 = Util.c(this.c.p());
                        string = Util.c(this.c.p());
                        Util.c(this.c.p());
                        n9 = this.c.i();
                        stringArray = new String[n9];
                        blArray = new boolean[n9];
                        for (n8 = 0; n8 < n9; ++n8) {
                            stringArray[n8] = Util.c(this.c.p());
                            boolean bl = this.c.c() != 0;
                            blArray[n8] = bl;
                        }
                        byArrayArray = null;
                        if (byArray == null || n9 != 1 || blArray[0] || stringArray[0].toLowerCase(Locale.ROOT).indexOf("password:") < 0) break block22;
                        object3 = null;
                        object = new byte[][]{byArray};
                        break block23;
                    }
                    if (n9 > 0 || string2.length() > 0) break block24;
                    object3 = byArray;
                    object = byArrayArray;
                    if (string.length() <= 0) break block23;
                }
                String[] stringArray2 = this.a;
                object3 = byArray;
                object = byArrayArray;
                if (stringArray2 != null) {
                    stringArray2 = ((UIKeyboardInteractive)stringArray2).e((String)object2, string2, string, stringArray, blArray);
                    object3 = byArray;
                    object = byArrayArray;
                    if (stringArray2 != null) {
                        byArrayArray = new byte[stringArray2.length][];
                        n8 = 0;
                        while (true) {
                            object3 = byArray;
                            object = byArrayArray;
                            if (n8 >= stringArray2.length) break;
                            object = stringArray2[n8];
                            object = object != null ? (Object)Util.v((String)object) : (Object)Util.c;
                            byArrayArray[n8] = (byte[])object;
                            ++n8;
                        }
                    }
                }
            }
            this.b.c();
            this.c.s((byte)61);
            if (n9 > 0 && (object == null || n9 != ((Object)object).length)) {
                if (object == null) {
                    this.c.v(n9);
                    for (n8 = 0; n8 < n9; ++n8) {
                        this.c.y(Util.c);
                    }
                } else {
                    this.c.v(0);
                }
            } else {
                this.c.v(n9);
                for (n8 = 0; n8 < n9; ++n8) {
                    this.c.y((byte[])object[n8]);
                }
            }
            session.m0(this.b);
            n8 = 0;
            byArray = object3;
        }
        return false;
    }
}

