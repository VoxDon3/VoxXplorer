package com.jcraft.jsch;

/* loaded from: classes3.dex */
public class UserAuthNone extends UserAuth {
    private String e;

    @Override // com.jcraft.jsch.UserAuth
    public boolean a(Session session) throws Exception {
        super.a(session);
        this.b.c();
        this.c.s((byte) 5);
        this.c.y(Util.v("ssh-userauth"));
        session.m0(this.b);
        if (session.A().isEnabled(1)) {
            session.A().a(1, "SSH_MSG_SERVICE_REQUEST sent");
        }
        Buffer M = session.M(this.c);
        this.c = M;
        boolean z = M.h() == 6;
        if (session.A().isEnabled(1)) {
            session.A().a(1, "SSH_MSG_SERVICE_ACCEPT received");
        }
        if (!z || !session.w("enable_auth_none").equals("yes")) {
            return false;
        }
        byte[] v = Util.v(this.d);
        this.b.c();
        this.c.s((byte) 50);
        this.c.y(v);
        this.c.y(Util.v("ssh-connection"));
        this.c.y(Util.v("none"));
        session.m0(this.b);
        while (true) {
            Buffer M2 = session.M(this.c);
            this.c = M2;
            int h = M2.h() & 255;
            if (h == 52) {
                return true;
            }
            if (h != 53) {
                if (h != 51) {
                    throw new JSchException("USERAUTH fail (" + h + ")");
                }
                this.c.i();
                this.c.c();
                this.c.c();
                byte[] p = this.c.p();
                this.c.c();
                c(Util.c(p));
                return false;
            }
            this.c.i();
            this.c.c();
            this.c.c();
            byte[] p2 = this.c.p();
            this.c.p();
            String c = Util.c(p2);
            UserInfo userInfo = this.a;
            if (userInfo != null) {
                try {
                    userInfo.d(c);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    protected String b() {
        return this.e;
    }

    protected void c(String str) {
        this.e = str;
    }
}
