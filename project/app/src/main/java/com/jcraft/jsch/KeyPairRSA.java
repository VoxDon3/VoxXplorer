/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.KeyPair;
import com.jcraft.jsch.SignatureRSA;
import com.jcraft.jsch.Util;
import java.math.BigInteger;

class KeyPairRSA
extends KeyPair {
    private static final byte[] A;
    private static final byte[] B;
    private static final byte[] z;
    private byte[] q;
    private byte[] r;
    private byte[] s;
    private byte[] t;
    private byte[] u;
    private byte[] v;
    private byte[] w;
    private byte[] x;
    private int y = 1024;

    static {
        z = Util.v("-----BEGIN RSA PRIVATE KEY-----");
        A = Util.v("-----END RSA PRIVATE KEY-----");
        B = Util.v("ssh-rsa");
    }

    KeyPairRSA(JSch.InstanceLogger instanceLogger) {
        this(instanceLogger, null, null, null);
    }

    KeyPairRSA(JSch.InstanceLogger instanceLogger, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        super(instanceLogger);
        this.q = byArray;
        this.r = byArray2;
        this.s = byArray3;
        if (byArray != null) {
            this.y = new BigInteger(byArray).bitLength();
        }
    }

    static KeyPair H(JSch.InstanceLogger object, Buffer object2) throws JSchException {
        object2 = ((Buffer)object2).g(8, "invalid key format");
        object = new KeyPairRSA((JSch.InstanceLogger)object, (byte[])object2[1], (byte[])object2[2], (byte[])object2[3]);
        ((KeyPairRSA)object).x = (byte[])object2[4];
        ((KeyPairRSA)object).t = (byte[])object2[5];
        ((KeyPairRSA)object).u = (byte[])object2[6];
        ((KeyPair)object).b = Util.c((byte[])object2[7]);
        ((KeyPair)object).a = 0;
        return object;
    }

    private byte[] I() {
        if (this.x == null) {
            this.x = new BigInteger(this.u).modInverse(new BigInteger(this.t)).toByteArray();
        }
        return this.x;
    }

    private byte[] J() {
        if (this.v == null) {
            this.v = new BigInteger(this.s).mod(new BigInteger(this.t).subtract(BigInteger.ONE)).toByteArray();
        }
        return this.v;
    }

    private byte[] K() {
        if (this.w == null) {
            this.w = new BigInteger(this.s).mod(new BigInteger(this.u).subtract(BigInteger.ONE)).toByteArray();
        }
        return this.w;
    }

    @Override
    public void f() {
        super.f();
        Util.g(this.s);
    }

    @Override
    public byte[] g() throws JSchException {
        if (!this.r()) {
            Buffer buffer = new Buffer();
            buffer.y(B);
            buffer.y(this.q);
            buffer.y(this.r);
            buffer.y(this.s);
            buffer.y(this.I());
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
        return B;
    }

    @Override
    byte[] n() {
        int n8 = this.c(1) + 3 + this.c(this.q.length) + this.q.length + 1 + this.c(this.r.length) + this.r.length + 1 + this.c(this.s.length) + this.s.length + 1 + this.c(this.t.length) + this.t.length + 1 + this.c(this.u.length) + this.u.length + 1 + this.c(this.v.length) + this.v.length + 1 + this.c(this.w.length) + this.w.length + 1 + this.c(this.x.length) + this.x.length;
        byte[] byArray = new byte[this.c(n8) + 1 + n8];
        this.D(byArray, this.D(byArray, this.D(byArray, this.D(byArray, this.D(byArray, this.D(byArray, this.D(byArray, this.D(byArray, this.D(byArray, this.G(byArray, 0, n8), new byte[1]), this.q), this.r), this.s), this.t), this.u), this.v), this.w), this.x);
        return byArray;
    }

    @Override
    public byte[] o() {
        byte[] byArray = super.o();
        if (byArray != null) {
            return byArray;
        }
        byte[] byArray2 = this.r;
        if (byArray2 == null) {
            return null;
        }
        byArray = this.q;
        return Buffer.b((byte[][])new byte[][]{KeyPairRSA.B, byArray2, byArray}).b;
    }

    @Override
    public byte[] p(byte[] byArray) {
        return this.q(byArray, "ssh-rsa");
    }

    @Override
    public byte[] q(byte[] byArray, String string) {
        try {
            SignatureRSA signatureRSA = Class.forName(JSch.f(string)).asSubclass(SignatureRSA.class).getDeclaredConstructor(null).newInstance(null);
            signatureRSA.e();
            signatureRSA.g(this.s, this.q);
            signatureRSA.f(byArray);
            byArray = signatureRSA.j();
            byArray = Buffer.b((byte[][])new byte[][]{Util.v((String)string), byArray}).b;
            return byArray;
        }
        catch (Exception exception) {
            if (this.c.a().isEnabled(3)) {
                this.c.a().b(3, "failed to generate signature", exception);
            }
            return null;
        }
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
        block39: {
            block38: {
                try {
                    var2_4 /* !! */  = this.a;
                    if (var2_4 /* !! */  != 2 && var2_4 /* !! */  != 5) {
                        if (var2_4 /* !! */  != 1) break block38;
                    }
                    ** GOTO lbl251
                }
                catch (Exception var1_2) {
                    break block39;
                }
                if (var1_1[0] != 48) {
                    var7_5 = new Buffer((byte[])var1_1);
                    this.r = var7_5.m();
                    this.s = var7_5.m();
                    this.q = var7_5.m();
                    var7_5.m();
                    this.t = var7_5.m();
                    this.u = var7_5.m();
                    if (this.q != null) {
                        var1_1 = new BigInteger;
                        var1_1(this.q);
                        this.y = var1_1.bitLength();
                    }
                    this.J();
                    this.K();
                    this.I();
                    return true;
                }
                if (this.c.a().isEnabled(3)) {
                    this.c.a().a(3, "failed to parse key");
                }
                return false;
            }
            if (var2_4 /* !! */  == 4) {
                var7_6 = new Buffer((byte[])var1_1);
                if (var7_6.i() != var7_6.i()) {
                    var1_1 = new JSchException;
                    var1_1 = new JSchException("check failed");
                    throw var1_1;
                }
                Util.c(var7_6.p());
                this.q = var7_6.l();
                this.r = var7_6.l();
                this.s = var7_6.l();
                this.x = var7_6.l();
                this.t = var7_6.l();
                this.u = var7_6.l();
                if (this.q != null) {
                    var1_1 = new BigInteger(this.q);
                    this.y = var1_1.bitLength();
                }
                this.b = Util.c(var7_6.p());
                this.J();
                this.K();
                return true;
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
                this.q = var7_7;
                System.arraycopy(var1_1, var5_12 /* !! */ , var7_7, 0, var6_11);
                var2_4 /* !! */  = var5_12 /* !! */  + var6_11;
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
                var2_4 /* !! */  = var5_12 /* !! */  + var6_11;
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
                this.v = var7_7;
                System.arraycopy(var1_1, var5_12 /* !! */ , var7_7, 0, var6_11);
                var2_4 /* !! */  = var5_12 /* !! */  + var6_11;
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
                this.w = var7_7;
                System.arraycopy(var1_1, var5_12 /* !! */ , var7_7, 0, var6_11);
                var2_4 /* !! */  = var5_12 /* !! */  + var6_11;
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
                this.x = var7_7;
                System.arraycopy(var1_1, var5_12 /* !! */ , var7_7, 0, var6_11);
                if (this.q != null) {
                    var1_1 = new BigInteger(this.q);
                    this.y = var1_1.bitLength();
                }
                return true;
lbl251:
                // 1 sources

                var7_8 = new Buffer((byte[])var1_1);
                var7_8.E(((byte[])var1_1).length);
                try {
                    var1_1 = var7_8.g(4, "");
                    this.s = (byte[])var1_1[0];
                    this.t = (byte[])var1_1[1];
                    this.u = (byte[])var1_1[2];
                    this.x = (byte[])var1_1[3];
                    this.J();
                }
                catch (JSchException var1_3) {
                    if (this.c.a().isEnabled(3)) {
                        this.c.a().b(3, "failed to parse key", var1_3);
                    }
                    return false;
                }
                this.K();
                return true;
            }
        }
        if (this.c.a().isEnabled(3)) {
            this.c.a().b(3, "failed to parse key", var1_2);
        }
        return false;
    }
}

