/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.KeyPair;
import com.jcraft.jsch.SignatureDSA;
import com.jcraft.jsch.Util;
import java.math.BigInteger;

class KeyPairDSA
extends KeyPair {
    private static final byte[] w = Util.v("-----BEGIN DSA PRIVATE KEY-----");
    private static final byte[] x = Util.v("-----END DSA PRIVATE KEY-----");
    private static final byte[] y = Util.v("ssh-dss");
    private byte[] q;
    private byte[] r;
    private byte[] s;
    private byte[] t;
    private byte[] u;
    private int v = 1024;

    KeyPairDSA(JSch.InstanceLogger instanceLogger) {
        this(instanceLogger, null, null, null, null, null);
    }

    KeyPairDSA(JSch.InstanceLogger instanceLogger, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5) {
        super(instanceLogger);
        this.q = byArray;
        this.r = byArray2;
        this.s = byArray3;
        this.t = byArray4;
        this.u = byArray5;
        if (byArray != null) {
            this.v = new BigInteger(byArray).bitLength();
        }
    }

    static KeyPair H(JSch.InstanceLogger object, Buffer object2) throws JSchException {
        object2 = ((Buffer)object2).g(7, "invalid key format");
        object = new KeyPairDSA((JSch.InstanceLogger)object, (byte[])object2[1], (byte[])object2[2], (byte[])object2[3], (byte[])object2[4], (byte[])object2[5]);
        ((KeyPair)object).b = Util.c((byte[])object2[6]);
        ((KeyPair)object).a = 0;
        return object;
    }

    @Override
    public void f() {
        super.f();
        Util.g(this.u);
    }

    @Override
    public byte[] g() throws JSchException {
        if (!this.r()) {
            Buffer buffer = new Buffer();
            buffer.y(y);
            buffer.y(this.q);
            buffer.y(this.r);
            buffer.y(this.s);
            buffer.y(this.t);
            buffer.y(this.u);
            buffer.y(Util.v(this.b));
            int n8 = buffer.j();
            byte[] byArray = new byte[n8];
            buffer.f(byArray, 0, n8);
            return byArray;
        }
        throw new JSchException("key is encrypted.");
    }

    @Override
    byte[] l() {
        return y;
    }

    @Override
    byte[] n() {
        int n8 = this.c(1) + 3 + this.c(this.q.length) + this.q.length + 1 + this.c(this.r.length) + this.r.length + 1 + this.c(this.s.length) + this.s.length + 1 + this.c(this.t.length) + this.t.length + 1 + this.c(this.u.length) + this.u.length;
        byte[] byArray = new byte[this.c(n8) + 1 + n8];
        this.D(byArray, this.D(byArray, this.D(byArray, this.D(byArray, this.D(byArray, this.D(byArray, this.G(byArray, 0, n8), new byte[1]), this.q), this.r), this.s), this.t), this.u);
        return byArray;
    }

    @Override
    public byte[] o() {
        byte[] byArray = super.o();
        if (byArray != null) {
            return byArray;
        }
        byArray = this.q;
        if (byArray == null) {
            return null;
        }
        byte[] byArray2 = this.r;
        byte[] byArray3 = this.s;
        byte[] byArray4 = this.t;
        return Buffer.b((byte[][])new byte[][]{KeyPairDSA.y, byArray, byArray2, byArray3, byArray4}).b;
    }

    @Override
    public byte[] p(byte[] byArray) {
        try {
            SignatureDSA signatureDSA = Class.forName(JSch.f("signature.dss")).asSubclass(SignatureDSA.class).getDeclaredConstructor(null).newInstance(null);
            signatureDSA.e();
            signatureDSA.c(this.u, this.q, this.r, this.s);
            signatureDSA.f(byArray);
            byArray = signatureDSA.j();
            byArray = Buffer.b((byte[][])new byte[][]{KeyPairDSA.y, byArray}).b;
            return byArray;
        }
        catch (Exception exception) {
            if (this.c.a().isEnabled(3)) {
                this.c.a().b(3, "failed to generate signature", exception);
            }
            return null;
        }
    }

    @Override
    public byte[] q(byte[] byArray, String string) {
        return this.p(byArray);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    boolean y(byte[] var1_1) {
        block26: {
            block25: {
                try {
                    var2_4 /* !! */  = this.a;
                    if (var2_4 /* !! */  != 1) break block25;
                }
                catch (Exception var1_2) {
                    break block26;
                }
                if (var1_1[0] == 48) return false;
                var7_5 = new Buffer((byte[])var1_1);
                var7_5.i();
                this.q = var7_5.m();
                this.s = var7_5.m();
                this.r = var7_5.m();
                this.t = var7_5.m();
                this.u = var7_5.m();
                if (this.q == null) return true;
                var1_1 = new BigInteger;
                var1_1(this.q);
                this.v = var1_1.bitLength();
                return true;
            }
            if (var2_4 /* !! */  == 2 || var2_4 /* !! */  == 5) ** GOTO lbl175
            if (var2_4 /* !! */  == 4) {
                var7_6 = new Buffer((byte[])var1_1);
                if (var7_6.i() == var7_6.i()) {
                    Util.c(var7_6.p());
                    this.q = var7_6.l();
                    this.r = var7_6.l();
                    this.s = var7_6.l();
                    this.t = var7_6.l();
                    this.u = var7_6.l();
                    this.b = Util.c(var7_6.p());
                    return true;
                }
                var1_1 = new JSchException;
                var1_1("check failed");
                throw var1_1;
            }
            if (var1_1[0] != 48) {
                return false;
            }
            var2_4 /* !! */  = var1_1[1];
            if ((var2_4 /* !! */  & 128) != 0) {
                var3_9 = var2_4 /* !! */  & 127;
                var2_4 /* !! */  = 2;
                while (true) {
                    var4_10 /* !! */  = var2_4 /* !! */ ;
                    if (var3_9 > 0) {
                        var4_10 /* !! */  = var1_1[var2_4 /* !! */ ];
                        ++var2_4 /* !! */ ;
                        --var3_9;
                        continue;
                    }
                    break;
                }
            } else {
                var4_10 /* !! */  = 2;
            }
            if (var1_1[var4_10 /* !! */ ] != 2) {
                return false;
            }
            var3_9 = var4_10 /* !! */  + 2;
            var2_4 /* !! */  = var1_1[var4_10 /* !! */  + 1];
            var6_11 = var2_4 /* !! */  & 255;
            var4_10 /* !! */  = var3_9;
            if ((var2_4 /* !! */  & 128) != 0) {
                var5_12 /* !! */  = var2_4 /* !! */  & 127;
                var2_4 /* !! */  = 0;
                while (true) {
                    var4_10 /* !! */  = var3_9;
                    var6_11 = var2_4 /* !! */ ;
                    if (var5_12 /* !! */  <= 0) break;
                    var4_10 /* !! */  = (int)var1_1[var3_9];
                    ++var3_9;
                    var2_4 /* !! */  = (var2_4 /* !! */  << 8) + (var4_10 /* !! */  & 255);
                    --var5_12 /* !! */ ;
                }
            }
            var2_4 /* !! */  = var4_10 /* !! */  + var6_11;
            var3_9 = var2_4 /* !! */  + 2;
            var2_4 /* !! */  = (int)var1_1[var2_4 /* !! */  + 1];
            var6_11 = var2_4 /* !! */  & 255;
            var4_10 /* !! */  = var3_9;
            if ((var2_4 /* !! */  & 128) == 0) ** GOTO lbl-1000
            var5_12 /* !! */  = var2_4 /* !! */  & 127;
            var2_4 /* !! */  = 0;
            while (true) {
                var4_10 /* !! */  = var3_9;
                var6_11 = var2_4 /* !! */ ;
                if (var5_12 /* !! */  <= 0) break;
                var4_10 /* !! */  = (int)var1_1[var3_9];
                ++var3_9;
                var2_4 /* !! */  = (var2_4 /* !! */  << 8) + (var4_10 /* !! */  & 255);
                --var5_12 /* !! */ ;
            }
lbl-1000:
            // 2 sources

            {
                var7_7 = new byte[var6_11];
                this.q = var7_7;
                System.arraycopy(var1_1, var4_10 /* !! */ , var7_7, 0, var6_11);
                var2_4 /* !! */  = var4_10 /* !! */  + var6_11;
                var3_9 = var2_4 /* !! */  + 2;
            }
            var2_4 /* !! */  = (int)var1_1[var2_4 /* !! */  + 1];
            var6_11 = var2_4 /* !! */  & 255;
            var4_10 /* !! */  = var3_9;
            if ((var2_4 /* !! */  & 128) == 0) ** GOTO lbl-1000
            var5_12 /* !! */  = var2_4 /* !! */  & 127;
            var2_4 /* !! */  = 0;
            while (true) {
                var4_10 /* !! */  = var3_9;
                var6_11 = var2_4 /* !! */ ;
                if (var5_12 /* !! */  <= 0) break;
                var4_10 /* !! */  = (int)var1_1[var3_9];
                ++var3_9;
                var2_4 /* !! */  = (var2_4 /* !! */  << 8) + (var4_10 /* !! */  & 255);
                --var5_12 /* !! */ ;
            }
lbl-1000:
            // 2 sources

            {
                var7_7 = new byte[var6_11];
                this.r = var7_7;
                System.arraycopy(var1_1, var4_10 /* !! */ , var7_7, 0, var6_11);
                var2_4 /* !! */  = var4_10 /* !! */  + var6_11;
                var3_9 = var2_4 /* !! */  + 2;
            }
            var2_4 /* !! */  = (int)var1_1[var2_4 /* !! */  + 1];
            var6_11 = var2_4 /* !! */  & 255;
            var4_10 /* !! */  = var3_9;
            if ((var2_4 /* !! */  & 128) == 0) ** GOTO lbl-1000
            var5_12 /* !! */  = var2_4 /* !! */  & 127;
            var2_4 /* !! */  = 0;
            while (true) {
                var4_10 /* !! */  = var3_9;
                var6_11 = var2_4 /* !! */ ;
                if (var5_12 /* !! */  <= 0) break;
                var4_10 /* !! */  = (int)var1_1[var3_9];
                ++var3_9;
                var2_4 /* !! */  = (var2_4 /* !! */  << 8) + (var4_10 /* !! */  & 255);
                --var5_12 /* !! */ ;
            }
lbl-1000:
            // 2 sources

            {
                var7_7 = new byte[var6_11];
                this.s = var7_7;
                System.arraycopy(var1_1, var4_10 /* !! */ , var7_7, 0, var6_11);
                var2_4 /* !! */  = var4_10 /* !! */  + var6_11;
                var3_9 = var2_4 /* !! */  + 2;
            }
            var2_4 /* !! */  = (int)var1_1[var2_4 /* !! */  + 1];
            var6_11 = var2_4 /* !! */  & 255;
            var4_10 /* !! */  = var3_9;
            if ((var2_4 /* !! */  & 128) == 0) ** GOTO lbl-1000
            var5_12 /* !! */  = var2_4 /* !! */  & 127;
            var2_4 /* !! */  = 0;
            while (true) {
                var4_10 /* !! */  = var3_9;
                var6_11 = var2_4 /* !! */ ;
                if (var5_12 /* !! */  <= 0) break;
                var4_10 /* !! */  = (int)var1_1[var3_9];
                ++var3_9;
                var2_4 /* !! */  = (var2_4 /* !! */  << 8) + (var4_10 /* !! */  & 255);
                --var5_12 /* !! */ ;
            }
lbl-1000:
            // 2 sources

            {
                var7_7 = new byte[var6_11];
                this.t = var7_7;
                System.arraycopy(var1_1, var4_10 /* !! */ , var7_7, 0, var6_11);
                var2_4 /* !! */  = var4_10 /* !! */  + var6_11;
                var3_9 = var2_4 /* !! */  + 2;
            }
            var2_4 /* !! */  = (int)var1_1[var2_4 /* !! */  + 1];
            var6_11 = var2_4 /* !! */  & 255;
            var5_12 /* !! */  = var3_9;
            if ((var2_4 /* !! */  & 128) == 0) ** GOTO lbl-1000
            var4_10 /* !! */  = var2_4 /* !! */  & 127;
            var2_4 /* !! */  = 0;
            while (true) {
                var5_12 /* !! */  = var3_9;
                var6_11 = var2_4 /* !! */ ;
                if (var4_10 /* !! */  <= 0) break;
                var5_12 /* !! */  = (int)var1_1[var3_9];
                ++var3_9;
                var2_4 /* !! */  = (var2_4 /* !! */  << 8) + (var5_12 /* !! */  & 255);
                --var4_10 /* !! */ ;
            }
lbl-1000:
            // 2 sources

            {
                var7_7 = new byte[var6_11];
                this.u = var7_7;
                System.arraycopy(var1_1, var5_12 /* !! */ , var7_7, 0, var6_11);
                if (this.q == null) return true;
                var1_1 = new BigInteger(this.q);
                this.v = var1_1.bitLength();
                return true;
lbl175:
                // 1 sources

                var7_8 = new Buffer((byte[])var1_1);
                var7_8.E(((byte[])var1_1).length);
                try {
                    this.u = var7_8.g(1, "")[0];
                    return true;
                }
                catch (JSchException var1_3) {
                    if (this.c.a().isEnabled(3) == false) return false;
                    this.c.a().b(3, "failed to parse key", var1_3);
                    return false;
                }
            }
        }
        if (this.c.a().isEnabled(3) == false) return false;
        this.c.a().b(3, "failed to parse key", var1_2);
        return false;
    }
}

