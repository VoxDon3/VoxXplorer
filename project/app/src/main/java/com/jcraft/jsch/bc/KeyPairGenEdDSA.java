/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.bc;

import ax.Dd.f;
import ax.Dd.h;
import java.security.NoSuchAlgorithmException;

public class KeyPairGenEdDSA
implements com.jcraft.jsch.KeyPairGenEdDSA {
    byte[] a;
    byte[] b;
    int c;
    String d;

    @Override
    public void a(String object, byte[] object2) throws Exception {
        if (!((String)object).equals("Ed25519") && !((String)object).equals("Ed448")) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("invalid curve ");
            ((StringBuilder)object2).append((String)object);
            throw new NoSuchAlgorithmException(((StringBuilder)object2).toString());
        }
        this.d = object;
        if (((String)object).equals("Ed25519")) {
            object = new f((byte[])object2);
            this.b = ((f)object).a().b();
            this.a = ((f)object).b();
        } else {
            object = new h((byte[])object2);
            this.b = ((h)object).a().b();
            this.a = ((h)object).b();
        }
        this.c = this.a.length;
    }

    @Override
    public byte[] b() {
        return this.b;
    }

    @Override
    public byte[] c() {
        return this.a;
    }
}

