/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.KeyPair;
import com.jcraft.jsch.SignatureECDSA;
import com.jcraft.jsch.Util;
import java.util.Arrays;

class KeyPairECDSA
extends KeyPair {
    private static byte[][] v = new byte[][]{{6, 8, 42, -122, 72, -50, 61, 3, 1, 7}, {6, 5, 43, -127, 4, 0, 34}, {6, 5, 43, -127, 4, 0, 35}};
    private static String[] w = new String[]{"nistp256", "nistp384", "nistp521"};
    private static final byte[] x = Util.v("-----BEGIN EC PRIVATE KEY-----");
    private static final byte[] y = Util.v("-----END EC PRIVATE KEY-----");
    private byte[] q = Util.v(w[0]);
    private byte[] r;
    private byte[] s;
    private byte[] t;
    private int u;

    KeyPairECDSA(JSch.InstanceLogger instanceLogger) {
        this(instanceLogger, null, null, null, null);
    }

    KeyPairECDSA(JSch.InstanceLogger object, byte[] byArray) {
        this((JSch.InstanceLogger)object, null, null, null, null);
        if (byArray != null) {
            object = new byte[8];
            System.arraycopy(byArray, 11, object, 0, 8);
            if (Util.a((byte[])object, Util.v("nistp384"))) {
                this.u = 384;
                this.q = (byte[])object;
            }
            if (Util.a((byte[])object, Util.v("nistp521"))) {
                this.u = 521;
                this.q = (byte[])object;
            }
        }
    }

    KeyPairECDSA(JSch.InstanceLogger instanceLogger, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) {
        super(instanceLogger);
        int n8 = 256;
        this.u = 256;
        if (byArray != null) {
            this.q = byArray;
        }
        this.r = byArray2;
        this.s = byArray3;
        this.t = byArray4;
        if (byArray4 != null) {
            if (byArray4.length >= 64) {
                n8 = 521;
            } else if (byArray4.length >= 48) {
                n8 = 384;
            }
            this.u = n8;
        }
    }

    static byte[][] H(byte[] byArray) {
        int n8 = 0;
        while (byArray[n8] != 4) {
            ++n8;
        }
        int n9 = (byArray.length - ++n8) / 2;
        byte[] byArray2 = new byte[n9];
        int n10 = (byArray.length - n8) / 2;
        byte[] byArray3 = new byte[n10];
        System.arraycopy(byArray, n8, byArray2, 0, n9);
        System.arraycopy(byArray, n8 + n9, byArray3, 0, n10);
        return new byte[][]{byArray2, byArray3};
    }

    static KeyPair I(JSch.InstanceLogger object, Buffer object2) throws JSchException {
        object2 = ((Buffer)object2).g(5, "invalid key format");
        Object object3 = object2[1];
        byte[][] byArray = KeyPairECDSA.H((byte[])object2[2]);
        object = new KeyPairECDSA((JSch.InstanceLogger)object, (byte[])object3, byArray[0], byArray[1], (byte[])object2[3]);
        ((KeyPair)object).b = Util.c((byte[])object2[4]);
        ((KeyPair)object).a = 0;
        return object;
    }

    static byte[] J(byte[] byArray, byte[] byArray2) {
        byte[] byArray3 = new byte[byArray.length + 1 + byArray2.length];
        byArray3[0] = 4;
        System.arraycopy(byArray, 0, byArray3, 1, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length + 1, byArray2.length);
        return byArray3;
    }

    @Override
    public void f() {
        super.f();
        Util.g(this.t);
    }

    @Override
    public byte[] g() throws JSchException {
        if (!this.r()) {
            Buffer buffer = new Buffer();
            Object object = new StringBuilder();
            ((StringBuilder)object).append("ecdsa-sha2-");
            ((StringBuilder)object).append(Util.c(this.q));
            buffer.y(Util.v(((StringBuilder)object).toString()));
            buffer.y(this.q);
            buffer.y(KeyPairECDSA.J(this.r, this.s));
            buffer.y(this.t);
            buffer.y(Util.v(this.b));
            int n8 = buffer.j();
            object = new byte[n8];
            buffer.f((byte[])object, 0, n8);
            return object;
        }
        throw new JSchException("key is encrypted.");
    }

    @Override
    byte[] l() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ecdsa-sha2-");
        stringBuilder.append(Util.c(this.q));
        return Util.v(stringBuilder.toString());
    }

    @Override
    byte[] n() {
        Object object = v;
        byte[] byArray = this.r;
        int n8 = byArray.length >= 64 ? 2 : (byArray.length >= 48 ? 1 : 0);
        object = object[n8];
        byte[] byArray2 = KeyPairECDSA.J(byArray, this.s);
        n8 = (byArray2.length + 1 & 0x80) == 0 ? 3 : 4;
        int n9 = byArray2.length + n8;
        byArray = new byte[n9];
        System.arraycopy(byArray2, 0, byArray, n8, byArray2.length);
        byArray[0] = 3;
        if (n8 == 3) {
            byArray[1] = (byte)(byArray2.length + 1);
        } else {
            byArray[1] = -127;
            byArray[2] = (byte)(byArray2.length + 1);
        }
        n8 = this.c(1) + 3 + this.c(this.t.length) + this.t.length + 1 + this.c(((byte[][])object).length) + ((byte[][])object).length + 1 + this.c(n9) + n9;
        byArray2 = new byte[this.c(n8) + 1 + n8];
        this.C(byArray2, (byte)-95, this.C(byArray2, (byte)-96, this.F(byArray2, this.D(byArray2, this.G(byArray2, 0, n8), new byte[]{1}), this.t), (byte[])object), byArray);
        return byArray2;
    }

    @Override
    public byte[] o() {
        Object object = super.o();
        if (object != null) {
            return object;
        }
        if (this.r == null) {
            return null;
        }
        object = new StringBuilder();
        object.append("ecdsa-sha2-");
        object.append(Util.c(this.q));
        Object object2 = Util.v(object.toString());
        byte[] byArray = this.q;
        byte[] byArray2 = this.r;
        byte[] byArray3 = new byte[byArray2.length + 1 + this.s.length];
        object = new byte[3][];
        object[0] = (byte)object2;
        object[1] = (byte)byArray;
        object[2] = (byte)byArray3;
        object2 = object[2];
        object2[0] = 4;
        System.arraycopy(byArray2, 0, object2, 1, byArray2.length);
        byArray2 = this.s;
        System.arraycopy(byArray2, 0, object[2], this.r.length + 1, byArray2.length);
        return Buffer.b((byte[][])object).b;
    }

    @Override
    public byte[] p(byte[] object) {
        try {
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append("ecdsa-sha2-");
            ((StringBuilder)object2).append(Util.c(this.q));
            object2 = Class.forName(JSch.f(((StringBuilder)object2).toString())).asSubclass(SignatureECDSA.class).getDeclaredConstructor(null).newInstance(null);
            object2.e();
            object2.a(this.t);
            object2.f((byte[])object);
            object2 = object2.j();
            object = new StringBuilder;
            object();
            object.append("ecdsa-sha2-");
            object.append(Util.c(this.q));
            object = Buffer.b((byte[][])new byte[][]{Util.v((String)object.toString()), (byte[])object2}).b;
            return object;
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
        block28: {
            block25: {
                block26: {
                    block27: {
                        try {
                            var2_4 = this.a;
                            if (var2_4 == 1) {
                                return false;
                            }
                            if (var2_4 != 2 && var2_4 != 5) {
                                if (var2_4 != 4) break block25;
                                var7_5 = new Buffer(var1_1 /* !! */ );
                                if (var7_5.i() != var7_5.i()) break block26;
                                Util.c(var7_5.p());
                                this.q = var7_5.p();
                                if (!Arrays.asList(KeyPairECDSA.w).contains(Util.c(this.q))) break block27;
                                var2_4 = var7_5.i();
                                var7_5.c();
                            }
                            ** GOTO lbl148
                        }
                        catch (Exception var1_2) {
                            break block28;
                        }
                        var3_8 = --var2_4 / 2;
                        var8_10 = new byte[var3_8];
                        var1_1 /* !! */  = new byte[var2_4 / 2];
                        var7_5.e(var8_10);
                        var7_5.e(var1_1 /* !! */ );
                        this.t = var7_5.p();
                        this.b = Util.c(var7_5.p());
                        this.r = var8_10;
                        this.s = var1_1 /* !! */ ;
                        var2_4 = var3_8 >= 64 ? 521 : (var3_8 >= 48 ? 384 : 256);
                        this.u = var2_4;
                        return true;
                    }
                    var1_1 /* !! */  = (byte[])new StringBuilder;
                    var1_1 /* !! */ ();
                    var1_1 /* !! */ .append("unknown curve name ");
                    var1_1 /* !! */ .append(Util.c(this.q));
                    var7_5 = new IllegalArgumentException(var1_1 /* !! */ .toString());
                    throw var7_5;
                }
                var1_1 /* !! */  = (byte[])new JSchException;
                var1_1 /* !! */ ("check failed");
                throw var1_1 /* !! */ ;
            }
            if (var1_1 /* !! */ [0] != 48) {
                return false;
            }
            var2_4 = var1_1 /* !! */ [1];
            if ((var2_4 & 128) != 0) {
                var3_9 = var2_4 & 127;
                var2_4 = 2;
                while (true) {
                    var4_12 = var2_4;
                    if (var3_9 > 0) {
                        var4_12 = var1_1 /* !! */ [var2_4];
                        ++var2_4;
                        --var3_9;
                        continue;
                    }
                    break;
                }
            } else {
                var4_12 = 2;
            }
            if (var1_1 /* !! */ [var4_12] != 2) {
                return false;
            }
            var3_9 = var4_12 + 2;
            var2_4 = var1_1 /* !! */ [var4_12 + 1];
            var6_13 = var2_4 & 255;
            var4_12 = var3_9;
            if ((var2_4 & 128) != 0) {
                var5_14 = var2_4 & 127;
                var2_4 = 0;
                while (true) {
                    var4_12 = var3_9;
                    var6_13 = var2_4;
                    if (var5_14 <= 0) break;
                    var4_12 = var1_1 /* !! */ [var3_9];
                    ++var3_9;
                    var2_4 = (var2_4 << 8) + (var4_12 & 255);
                    --var5_14;
                }
            }
            var2_4 = var4_12 + var6_13;
            var3_9 = var2_4 + 2;
            var2_4 = var1_1 /* !! */ [var2_4 + 1];
            var6_13 = var2_4 & 255;
            var5_14 = var3_9;
            if ((var2_4 & 128) == 0) ** GOTO lbl-1000
            var4_12 = var2_4 & 127;
            var2_4 = 0;
            while (true) {
                var5_14 = var3_9;
                var6_13 = var2_4;
                if (var4_12 <= 0) break;
                var5_14 = var1_1 /* !! */ [var3_9];
                ++var3_9;
                var2_4 = (var2_4 << 8) + (var5_14 & 255);
                --var4_12;
            }
lbl-1000:
            // 2 sources

            {
                var7_6 /* !! */  = new byte[var6_13];
                this.t = var7_6 /* !! */ ;
                System.arraycopy(var1_1 /* !! */ , var5_14, var7_6 /* !! */ , 0, var6_13);
                var2_4 = var5_14 + var6_13;
                var3_9 = var2_4 + 2;
            }
            var2_4 = var1_1 /* !! */ [var2_4 + 1];
            var6_13 = var2_4 & 255;
            var5_14 = var3_9;
            if ((var2_4 & 128) == 0) ** GOTO lbl-1000
            var4_12 = var2_4 & 127;
            var2_4 = 0;
            while (true) {
                var5_14 = var3_9;
                var6_13 = var2_4;
                if (var4_12 <= 0) break;
                var5_14 = var1_1 /* !! */ [var3_9];
                ++var3_9;
                var2_4 = (var2_4 << 8) + (var5_14 & 255);
                --var4_12;
            }
lbl-1000:
            // 2 sources

            {
                var8_11 = new byte[var6_13];
                System.arraycopy(var1_1 /* !! */ , var5_14, var8_11, 0, var6_13);
                var3_9 = var5_14 + var6_13;
                for (var2_4 = 0; var2_4 < (var7_6 /* !! */  = (byte[])KeyPairECDSA.v).length; ++var2_4) {
                    if (!Util.a((byte[])var7_6 /* !! */ [var2_4], var8_11)) continue;
                    this.q = Util.v(KeyPairECDSA.w[var2_4]);
                    break;
                }
                var2_4 = var3_9 + 2;
            }
            var3_9 = var1_1 /* !! */ [var3_9 + 1];
            var5_14 = var3_9 & 255;
            var6_13 = var2_4;
            if ((var3_9 & 128) == 0) ** GOTO lbl-1000
            var4_12 = var3_9 & 127;
            var3_9 = 0;
            while (true) {
                var5_14 = var3_9;
                var6_13 = ++var2_4;
                if (var4_12 <= 0) break;
                var5_14 = var1_1 /* !! */ [var2_4];
                var3_9 = (var3_9 << 8) + (var5_14 & 255);
                --var4_12;
            }
lbl-1000:
            // 2 sources

            {
                var7_6 /* !! */  = new byte[var5_14];
                System.arraycopy(var1_1 /* !! */ , var6_13, var7_6 /* !! */ , 0, var5_14);
                var1_1 /* !! */  = (byte[])KeyPairECDSA.H(var7_6 /* !! */ );
                this.r = (byte[])var1_1 /* !! */ [0];
                this.s = (byte[])var1_1 /* !! */ [1];
                var1_1 /* !! */  = this.t;
                if (var1_1 /* !! */  != null) {
                    var2_4 = var1_1 /* !! */ .length >= 64 ? 521 : (var1_1 /* !! */ .length >= 48 ? 384 : 256);
                    this.u = var2_4;
                }
                return true;
lbl148:
                // 1 sources

                var7_7 = new Buffer(var1_1 /* !! */ );
                var7_7.E(var1_1 /* !! */ .length);
                try {
                    var1_1 /* !! */  = var7_7.g(1, "")[0];
                    this.t = var1_1 /* !! */ ;
                    var2_4 = var1_1 /* !! */ .length >= 64 ? 521 : (var1_1 /* !! */ .length >= 48 ? 384 : 256);
                    this.u = var2_4;
                    return true;
                }
                catch (JSchException var1_3) {
                    if (this.c.a().isEnabled(3)) {
                        this.c.a().b(3, "failed to parse key", var1_3);
                    }
                    return false;
                }
            }
        }
        if (this.c.a().isEnabled(3)) {
            this.c.a().b(3, "failed to parse key", var1_2);
        }
        return false;
    }
}

