/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.SignatureRSA;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.KeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

abstract class SignatureRSAN
implements SignatureRSA {
    Signature a;
    KeyFactory b;

    SignatureRSAN() {
    }

    @Override
    public void b(byte[] object, byte[] byArray) throws Exception {
        object = new RSAPublicKeySpec(new BigInteger(byArray), new BigInteger((byte[])object));
        object = this.b.generatePublic((KeySpec)object);
        this.a.initVerify((PublicKey)object);
    }

    @Override
    public boolean d(byte[] byArray) throws Exception {
        byte[] byArray2;
        block5: {
            String string;
            Buffer buffer;
            block4: {
                buffer = new Buffer(byArray);
                string = new String(buffer.p(), StandardCharsets.UTF_8);
                if (string.equals("ssh-rsa") || string.equals("rsa-sha2-256") || string.equals("rsa-sha2-512") || string.equals("ssh-rsa-sha224@ssh.com") || string.equals("ssh-rsa-sha256@ssh.com") || string.equals("ssh-rsa-sha384@ssh.com")) break block4;
                byArray2 = byArray;
                if (!string.equals("ssh-rsa-sha512@ssh.com")) break block5;
            }
            if (!string.equals(this.k())) {
                return false;
            }
            int n8 = buffer.i();
            int n9 = buffer.n();
            byArray2 = new byte[n8];
            System.arraycopy(byArray, n9, byArray2, 0, n8);
        }
        return this.a.verify(byArray2);
    }

    @Override
    public void e() throws Exception {
        String string = this.k();
        string = !string.equals("rsa-sha2-256") && !string.equals("ssh-rsa-sha256@ssh.com") ? (!string.equals("rsa-sha2-512") && !string.equals("ssh-rsa-sha512@ssh.com") ? (string.equals("ssh-rsa-sha384@ssh.com") ? "SHA384withRSA" : (string.equals("ssh-rsa-sha224@ssh.com") ? "SHA224withRSA" : "SHA1withRSA")) : "SHA512withRSA") : "SHA256withRSA";
        this.a = Signature.getInstance(string);
        this.b = KeyFactory.getInstance("RSA");
    }

    @Override
    public void f(byte[] byArray) throws Exception {
        this.a.update(byArray);
    }

    @Override
    public void g(byte[] object, byte[] byArray) throws Exception {
        object = new RSAPrivateKeySpec(new BigInteger(byArray), new BigInteger((byte[])object));
        object = this.b.generatePrivate((KeySpec)object);
        this.a.initSign((PrivateKey)object);
    }

    @Override
    public byte[] j() throws Exception {
        return this.a.sign();
    }

    abstract String k();
}

