package com.jcraft.jsch;

import java.util.Locale;

/* loaded from: classes3.dex */
class UserAuthKeyboardInteractive extends UserAuth {
    UserAuthKeyboardInteractive() {
    }

    @Override // com.jcraft.jsch.UserAuth
    public boolean a(Session session) throws Exception {
        UserInfo userInfo;
        String[] e;
        super.a(session);
        UserInfo userInfo2 = this.a;
        if (userInfo2 != null && !(userInfo2 instanceof UIKeyboardInteractive)) {
            return false;
        }
        String str = this.d + "@" + session.g0;
        if (session.i0 != 22) {
            str = str + ":" + session.i0;
        }
        String str2 = str;
        byte[] bArr = session.k0;
        byte[] v = Util.v(this.d);
        if (session.f0 >= session.e0) {
            return false;
        }
        this.b.c();
        this.c.s((byte) 50);
        this.c.y(v);
        this.c.y(Util.v("ssh-connection"));
        this.c.y(Util.v("keyboard-interactive"));
        Buffer buffer = this.c;
        byte[] bArr2 = Util.c;
        buffer.y(bArr2);
        this.c.y(bArr2);
        session.m0(this.b);
        boolean z = true;
        while (true) {
            Buffer M = session.M(this.c);
            this.c = M;
            int h = M.h() & 255;
            if (h == 52) {
                return true;
            }
            if (h == 53) {
                this.c.i();
                this.c.c();
                this.c.c();
                byte[] p = this.c.p();
                this.c.p();
                String c = Util.c(p);
                UserInfo userInfo3 = this.a;
                if (userInfo3 != null) {
                    userInfo3.d(c);
                }
            } else {
                if (h == 51) {
                    this.c.i();
                    this.c.c();
                    this.c.c();
                    byte[] p2 = this.c.p();
                    if (this.c.c() != 0) {
                        throw new JSchPartialAuthException(Util.c(p2));
                    }
                    if (z) {
                        return false;
                    }
                    session.f0++;
                    return false;
                }
                if (h != 60) {
                    return false;
                }
                this.c.i();
                this.c.c();
                this.c.c();
                String c2 = Util.c(this.c.p());
                String c3 = Util.c(this.c.p());
                Util.c(this.c.p());
                int i = this.c.i();
                String[] strArr = new String[i];
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < i; i2++) {
                    strArr[i2] = Util.c(this.c.p());
                    zArr[i2] = this.c.c() != 0;
                }
                byte[][] bArr3 = null;
                if (bArr != null && i == 1 && !zArr[0] && strArr[0].toLowerCase(Locale.ROOT).indexOf("password:") >= 0) {
                    byte[][] bArr4 = {bArr};
                    bArr = null;
                    bArr3 = bArr4;
                } else if ((i > 0 || c2.length() > 0 || c3.length() > 0) && (userInfo = this.a) != null && (e = ((UIKeyboardInteractive) userInfo).e(str2, c2, c3, strArr, zArr)) != null) {
                    bArr3 = new byte[e.length][];
                    for (int i3 = 0; i3 < e.length; i3++) {
                        String str3 = e[i3];
                        bArr3[i3] = str3 != null ? Util.v(str3) : Util.c;
                    }
                }
                this.b.c();
                this.c.s((byte) 61);
                if (i <= 0 || (bArr3 != null && i == bArr3.length)) {
                    this.c.v(i);
                    for (int i4 = 0; i4 < i; i4++) {
                        this.c.y(bArr3[i4]);
                    }
                } else if (bArr3 == null) {
                    this.c.v(i);
                    for (int i5 = 0; i5 < i; i5++) {
                        this.c.y(Util.c);
                    }
                } else {
                    this.c.v(0);
                }
                session.m0(this.b);
                z = false;
            }
        }
    }
}
