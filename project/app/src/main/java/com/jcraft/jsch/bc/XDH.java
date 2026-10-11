/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.bc;

import ax.Dd.m;
import ax.Dd.n;
import ax.Dd.o;
import ax.Dd.p;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class XDH
implements com.jcraft.jsch.XDH {
    byte[] a;
    Object b;
    int c;
    String d;

    @Override
    public byte[] a() throws Exception {
        return this.a;
    }

    @Override
    public byte[] b(byte[] object) throws Exception {
        byte[] byArray = new byte[this.c];
        if (this.d.equals("X25519")) {
            try {
                object = new n((byte[])object, 0);
            }
            catch (Exception exception) {
                throw new InvalidKeyException(exception);
            }
            m m8 = (m)this.b;
            try {
                m8.b((n)object, byArray, 0);
                return byArray;
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception);
            }
        }
        try {
            object = new p((byte[])object, 0);
        }
        catch (Exception exception) {
            throw new InvalidKeyException(exception);
        }
        o o8 = (o)this.b;
        try {
            o8.b((p)object, byArray, 0);
            return byArray;
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception);
        }
    }

    @Override
    public boolean c(byte[] byArray) throws Exception {
        return byArray.length == this.c;
    }

    @Override
    public void d(String object, int n8) throws Exception {
        if (!((String)object).equals("X25519") && !((String)object).equals("X448")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid curve ");
            stringBuilder.append((String)object);
            throw new NoSuchAlgorithmException(stringBuilder.toString());
        }
        this.c = n8;
        this.d = object;
        if (((String)object).equals("X25519")) {
            object = new m(new SecureRandom());
            this.a = ((m)object).a().b();
            this.b = object;
            return;
        }
        object = new o(new SecureRandom());
        this.a = ((o)object).a().b();
        this.b = object;
    }
}

