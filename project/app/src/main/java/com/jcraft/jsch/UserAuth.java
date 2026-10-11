/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

public abstract class UserAuth {
    protected UserInfo a;
    protected Packet b;
    protected Buffer c;
    protected String d;

    public boolean a(Session session) throws Exception {
        Packet packet;
        this.a = session.F();
        this.b = packet = session.P;
        this.c = packet.a();
        this.d = session.G();
        return true;
    }
}

