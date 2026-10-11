/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.HASH;
import java.security.MessageDigest;

public class SHA256
implements HASH {
    MessageDigest a;

    @Override
    public String a() {
        return "SHA256";
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) throws Exception {
        this.a.update(byArray, n8, n9);
    }

    @Override
    public byte[] c() throws Exception {
        return this.a.digest();
    }

    @Override
    public int d() {
        return 32;
    }

    @Override
    public void e() throws Exception {
        this.a = MessageDigest.getInstance("SHA-256");
    }
}

