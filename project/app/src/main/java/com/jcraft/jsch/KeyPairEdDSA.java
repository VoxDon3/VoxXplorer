/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.KeyPair;
import com.jcraft.jsch.KeyPairGenEdDSA;
import com.jcraft.jsch.SignatureEdDSA;
import com.jcraft.jsch.Util;
import java.util.Arrays;

abstract class KeyPairEdDSA
extends KeyPair {
    private byte[] q;
    private byte[] r;

    KeyPairEdDSA(JSch.InstanceLogger instanceLogger, byte[] byArray, byte[] byArray2) {
        super(instanceLogger);
        this.q = byArray;
        this.r = byArray2;
    }

    abstract String H();

    abstract String I();

    @Override
    public void f() {
        super.f();
        Util.g(this.r);
    }

    @Override
    public byte[] g() throws JSchException {
        if (!this.r()) {
            Buffer buffer = new Buffer();
            buffer.y(this.l());
            buffer.y(this.q);
            byte[] byArray = this.r;
            byte[] byArray2 = new byte[byArray.length + this.q.length];
            System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
            byArray = this.q;
            System.arraycopy(byArray, 0, byArray2, this.r.length, byArray.length);
            buffer.y(byArray2);
            buffer.y(Util.v(this.b));
            int n8 = buffer.j();
            byArray2 = new byte[n8];
            buffer.f(byArray2, 0, n8);
            return byArray2;
        }
        throw new JSchException("key is encrypted.");
    }

    @Override
    byte[] l() {
        return Util.v(this.I());
    }

    @Override
    byte[] n() {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] o() {
        byte[] byArray = super.o();
        if (byArray != null) {
            return byArray;
        }
        if (this.q == null) {
            return null;
        }
        return Buffer.b((byte[][])new byte[][]{this.l(), this.q}).b;
    }

    @Override
    public byte[] p(byte[] byArray) {
        return this.q(byArray, this.I());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] q(byte[] byArray, String string) {
        try {
            SignatureEdDSA signatureEdDSA = Class.forName(JSch.f(string)).asSubclass(SignatureEdDSA.class).getDeclaredConstructor(null).newInstance(null);
            signatureEdDSA.e();
            signatureEdDSA.a(this.r);
            signatureEdDSA.f(byArray);
            byArray = signatureEdDSA.j();
            byArray = Buffer.b((byte[][])new byte[][]{Util.v((String)string), byArray}).b;
            return byArray;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (this.c.a().isEnabled(3)) {
            Throwable var1_4;
            this.c.a().b(3, "failed to generate signature", (Throwable)var1_4);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    boolean y(byte[] object) {
        int n8 = this.a;
        if (n8 != 2 && n8 != 5) {
            if (n8 == 4) {
                Exception exception2;
                block15: {
                    try {
                        Buffer buffer = new Buffer((byte[])object);
                        if (buffer.i() == buffer.i()) {
                            Util.c(buffer.p());
                            this.q = buffer.p();
                            this.r = Arrays.copyOf(buffer.p(), this.k());
                            this.b = Util.c(buffer.p());
                            return true;
                        }
                    }
                    catch (Exception exception2) {
                        break block15;
                    }
                    object = new JSchException;
                    object("check failed");
                    throw object;
                }
                if (this.c.a().isEnabled(3)) {
                    this.c.a().b(3, "failed to parse key", exception2);
                }
                return false;
            }
            if (n8 == 3) {
                try {
                    KeyPairGenEdDSA keyPairGenEdDSA = Class.forName(JSch.f("keypairgen_fromprivate.eddsa")).asSubclass(KeyPairGenEdDSA.class).getDeclaredConstructor(null).newInstance(null);
                    keyPairGenEdDSA.a(this.H(), (byte[])object);
                    this.q = keyPairGenEdDSA.b();
                    this.r = keyPairGenEdDSA.c();
                    return true;
                }
                catch (NoClassDefFoundError noClassDefFoundError) {
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (this.c.a().isEnabled(3)) {
                    Throwable var1_5;
                    this.c.a().b(3, "failed to parse key", (Throwable)var1_5);
                }
                return false;
            }
            if (this.c.a().isEnabled(3)) {
                this.c.a().a(3, "failed to parse key");
            }
            return false;
        }
        Buffer buffer = new Buffer((byte[])object);
        buffer.E(((byte[])object).length);
        try {
            this.r = buffer.g(1, "")[0];
            return true;
        }
        catch (JSchException jSchException) {
            if (this.c.a().isEnabled(3)) {
                this.c.a().b(3, "failed to parse key", jSchException);
            }
            return false;
        }
    }
}

