/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.AgentProxy;
import com.jcraft.jsch.Identity;
import com.jcraft.jsch.IdentityRepository;
import java.util.Vector;

public class AgentIdentityRepository
implements IdentityRepository {
    private AgentProxy a;

    @Override
    public Vector<Identity> a() {
        return this.a.b();
    }

    @Override
    public boolean b(byte[] byArray) {
        return this.a.a(byArray);
    }

    @Override
    public boolean c(byte[] byArray) {
        return this.a.d(byArray);
    }

    @Override
    public void d() {
        this.a.c();
    }
}

