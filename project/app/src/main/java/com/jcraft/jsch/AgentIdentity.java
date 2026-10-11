/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.AgentProxy;
import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Identity;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Util;

class AgentIdentity
implements Identity {
    private AgentProxy a;
    private byte[] b;
    private String c;
    private String d;

    AgentIdentity(AgentProxy agentProxy, byte[] byArray, String string) {
        this.a = agentProxy;
        this.b = byArray;
        this.c = string;
        this.d = Util.c(new Buffer(byArray).p());
    }

    @Override
    public byte[] a(byte[] byArray, String string) {
        return this.a.e(this.b, byArray, string);
    }

    @Override
    public String b() {
        return this.d;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public byte[] d() {
        return this.b;
    }

    @Override
    public boolean e(byte[] byArray) throws JSchException {
        return true;
    }

    @Override
    public byte[] f(byte[] byArray) {
        return this.a.e(this.b, byArray, null);
    }

    @Override
    public String getName() {
        return this.c;
    }
}

