/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Identity;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.KeyPair;

class IdentityFile
implements Identity {
    private KeyPair a;
    private String b;

    private IdentityFile(String string, KeyPair keyPair) {
        this.b = string;
        this.a = keyPair;
    }

    static IdentityFile h(String string, String string2, JSch.InstanceLogger instanceLogger) throws JSchException {
        return new IdentityFile(string, KeyPair.t(instanceLogger, string, string2));
    }

    static IdentityFile i(String string, byte[] byArray, byte[] byArray2, JSch.InstanceLogger instanceLogger) throws JSchException {
        return new IdentityFile(string, KeyPair.u(instanceLogger, byArray, byArray2));
    }

    @Override
    public byte[] a(byte[] byArray, String string) {
        return this.a.q(byArray, string);
    }

    @Override
    public String b() {
        return this.a.m();
    }

    @Override
    public boolean c() {
        return this.a.r();
    }

    @Override
    public void clear() {
        this.a.f();
        this.a = null;
    }

    @Override
    public byte[] d() {
        return this.a.o();
    }

    @Override
    public boolean e(byte[] byArray) throws JSchException {
        return this.a.d(byArray);
    }

    @Override
    public byte[] f(byte[] byArray) {
        return this.a.p(byArray);
    }

    public KeyPair g() {
        return this.a;
    }

    @Override
    public String getName() {
        return this.b;
    }
}

