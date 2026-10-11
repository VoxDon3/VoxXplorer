/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserAuth;
import com.jcraft.jsch.UserInfo;
import com.jcraft.jsch.Util;

public class UserAuthNone
extends UserAuth {
    private String e;

    @Override
    public boolean a(Session object) throws Exception {
        super.a((Session)object);
        this.b.c();
        this.c.s((byte)5);
        this.c.y(Util.v("ssh-userauth"));
        ((Session)object).m0(this.b);
        if (((Session)object).A().isEnabled(1)) {
            ((Session)object).A().a(1, "SSH_MSG_SERVICE_REQUEST sent");
        }
        Object object2 = ((Session)object).M(this.c);
        this.c = object2;
        int n8 = ((Buffer)object2).h() == 6 ? 1 : 0;
        if (((Session)object).A().isEnabled(1)) {
            ((Session)object).A().a(1, "SSH_MSG_SERVICE_ACCEPT received");
        }
        if (n8 == 0) {
            return false;
        }
        if (!((Session)object).w("enable_auth_none").equals("yes")) {
            return false;
        }
        object2 = Util.v(this.d);
        this.b.c();
        this.c.s((byte)50);
        this.c.y((byte[])object2);
        this.c.y(Util.v("ssh-connection"));
        this.c.y(Util.v("none"));
        ((Session)object).m0(this.b);
        while (true) {
            this.c = object2 = ((Session)object).M(this.c);
            n8 = ((Buffer)object2).h() & 0xFF;
            if (n8 == 52) {
                return true;
            }
            if (n8 != 53) break;
            this.c.i();
            this.c.c();
            this.c.c();
            object2 = this.c.p();
            this.c.p();
            object2 = Util.c((byte[])object2);
            UserInfo userInfo = this.a;
            if (userInfo == null) continue;
            try {
                userInfo.d((String)object2);
            }
            catch (RuntimeException runtimeException) {}
        }
        if (n8 == 51) {
            this.c.i();
            this.c.c();
            this.c.c();
            object = this.c.p();
            this.c.c();
            this.c(Util.c((byte[])object));
            return false;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("USERAUTH fail (");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(")");
        throw new JSchException(((StringBuilder)object).toString());
    }

    protected String b() {
        return this.e;
    }

    protected void c(String string) {
        this.e = string;
    }
}

