/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.bc;

import ax.Dd.f;
import ax.Dd.g;
import ax.Dd.h;
import ax.Dd.i;
import ax.Ed.a;
import ax.Ed.b;
import ax.vd.r;
import com.jcraft.jsch.Buffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

abstract class SignatureEdDSA
implements com.jcraft.jsch.SignatureEdDSA {
    r a;

    SignatureEdDSA() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(byte[] byArray) throws Exception {
        try {
            if (this.k().equals("Ed25519")) {
                f f8 = new f(byArray, 0);
                this.a.e(true, f8);
                return;
            }
        }
        catch (Exception exception) {
            throw new InvalidKeyException(exception);
        }
        h h8 = new h(byArray, 0);
        this.a.e(true, h8);
    }

    @Override
    public boolean d(byte[] byArray) throws Exception {
        Buffer buffer = new Buffer(byArray);
        byte[] byArray2 = byArray;
        if (new String(buffer.p(), StandardCharsets.UTF_8).equals(this.l())) {
            int n8 = buffer.i();
            int n9 = buffer.n();
            byArray2 = new byte[n8];
            System.arraycopy(byArray, n9, byArray2, 0, n8);
        }
        try {
            boolean bl = this.a.a(byArray2);
            return bl;
        }
        catch (Exception exception) {
            throw new SignatureException(exception);
        }
    }

    @Override
    public void e() throws Exception {
        if (!this.k().equals("Ed25519") && !this.k().equals("Ed448")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid curve ");
            stringBuilder.append(this.k());
            throw new NoSuchAlgorithmException(stringBuilder.toString());
        }
        if (this.k().equals("Ed25519")) {
            this.a = new a();
            return;
        }
        this.a = new b(new byte[0]);
    }

    @Override
    public void f(byte[] byArray) throws Exception {
        try {
            this.a.b(byArray, 0, byArray.length);
            return;
        }
        catch (Exception exception) {
            throw new SignatureException(exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void i(byte[] byArray) throws Exception {
        try {
            if (this.k().equals("Ed25519")) {
                g g8 = new g(byArray, 0);
                this.a.e(false, g8);
                return;
            }
        }
        catch (Exception exception) {
            throw new InvalidKeyException(exception);
        }
        i i8 = new i(byArray, 0);
        this.a.e(false, i8);
    }

    @Override
    public byte[] j() throws Exception {
        try {
            byte[] byArray = this.a.c();
            return byArray;
        }
        catch (Exception exception) {
            throw new SignatureException(exception);
        }
    }

    abstract String k();

    abstract String l();
}

