/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class DH
implements com.jcraft.jsch.DH {
    BigInteger a;
    BigInteger b;
    BigInteger c;
    byte[] d;
    BigInteger e;
    private KeyPairGenerator f;
    private KeyAgreement g;

    @Override
    public byte[] a() throws Exception {
        if (this.c == null) {
            Object object = new DHParameterSpec(this.a, this.b);
            this.f.initialize((AlgorithmParameterSpec)object);
            object = this.f.generateKeyPair();
            this.g.init(((KeyPair)object).getPrivate());
            this.c = object = ((DHPublicKey)((KeyPair)object).getPublic()).getY();
            this.d = ((BigInteger)object).toByteArray();
        }
        return this.d;
    }

    @Override
    public void b() throws Exception {
    }

    @Override
    public byte[] c() throws Exception {
        PublicKey publicKey = KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(this.e, this.a, this.b));
        this.g.doPhase(publicKey, true);
        return this.g.generateSecret();
    }

    @Override
    public void d(byte[] byArray) {
        this.j(new BigInteger(1, byArray));
    }

    @Override
    public void e() throws Exception {
        this.f = KeyPairGenerator.getInstance("DH");
        this.g = KeyAgreement.getInstance("DH");
    }

    @Override
    public void f(byte[] byArray) {
        this.i(new BigInteger(1, byArray));
    }

    @Override
    public void g(byte[] byArray) {
        this.h(new BigInteger(1, byArray));
    }

    void h(BigInteger bigInteger) {
        this.e = bigInteger;
    }

    void i(BigInteger bigInteger) {
        this.b = bigInteger;
    }

    void j(BigInteger bigInteger) {
        this.a = bigInteger;
    }
}

