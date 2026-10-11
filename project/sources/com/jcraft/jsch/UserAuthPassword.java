package com.jcraft.jsch;

/* loaded from: classes3.dex */
class UserAuthPassword extends UserAuth {
    private final int e = 60;

    UserAuthPassword() {
    }

    @Override // com.jcraft.jsch.UserAuth
    public boolean a(Session session) throws Exception {
        UserInfo userInfo;
        super.a(session);
        byte[] bArr = session.k0;
        String str = this.d + "@" + session.g0;
        if (session.i0 != 22) {
            str = str + ":" + session.i0;
        }
        String str2 = str;
        try {
            if (session.f0 >= session.e0) {
                if (bArr != null) {
                    Util.g(bArr);
                }
                return false;
            }
            if (bArr == null) {
                UserInfo userInfo2 = this.a;
                if (userInfo2 == null) {
                    if (bArr != null) {
                        Util.g(bArr);
                    }
                    return false;
                }
                if (!userInfo2.c("Password for " + str2)) {
                    throw new JSchAuthCancelException("password");
                }
                String f = this.a.f();
                if (f == null) {
                    throw new JSchAuthCancelException("password");
                }
                bArr = Util.v(f);
            }
            byte[] v = Util.v(this.d);
            this.b.c();
            this.c.s((byte) 50);
            this.c.y(v);
            this.c.y(Util.v("ssh-connection"));
            this.c.y(Util.v("password"));
            this.c.s((byte) 0);
            this.c.y(bArr);
            session.m0(this.b);
            while (true) {
                Buffer M = session.M(this.c);
                this.c = M;
                int h = M.h() & 255;
                if (h == 52) {
                    if (bArr != null) {
                        Util.g(bArr);
                    }
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
                    if (h != 60) {
                        if (h != 51) {
                            if (bArr != null) {
                                Util.g(bArr);
                            }
                            return false;
                        }
                        this.c.i();
                        this.c.c();
                        this.c.c();
                        byte[] p2 = this.c.p();
                        if (this.c.c() != 0) {
                            throw new JSchPartialAuthException(Util.c(p2));
                        }
                        session.f0++;
                        if (bArr != null) {
                            Util.g(bArr);
                        }
                        return false;
                    }
                    this.c.i();
                    this.c.c();
                    this.c.c();
                    byte[] p3 = this.c.p();
                    this.c.p();
                    userInfo = this.a;
                    if (userInfo == null || !(userInfo instanceof UIKeyboardInteractive)) {
                        break;
                    }
                    String[] e = ((UIKeyboardInteractive) userInfo).e(str2, "Password Change Required", Util.c(p3), new String[]{"New Password: "}, new boolean[]{false});
                    if (e == null) {
                        throw new JSchAuthCancelException("password");
                    }
                    String str3 = e[0];
                    byte[] v2 = str3 != null ? Util.v(str3) : Util.c;
                    this.b.c();
                    this.c.s((byte) 50);
                    this.c.y(v);
                    this.c.y(Util.v("ssh-connection"));
                    this.c.y(Util.v("password"));
                    this.c.s((byte) 1);
                    this.c.y(bArr);
                    this.c.y(v2);
                    Util.g(v2);
                    session.m0(this.b);
                }
            }
            if (userInfo != null) {
                userInfo.d("Password must be changed.");
            }
            if (bArr != null) {
                Util.g(bArr);
            }
            return false;
        } finally {
        }
    }
}
