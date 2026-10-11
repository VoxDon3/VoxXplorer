/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Cipher;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.KeyPair;
import com.jcraft.jsch.KeyPairDSA;
import com.jcraft.jsch.KeyPairECDSA;
import com.jcraft.jsch.KeyPairEd25519;
import com.jcraft.jsch.KeyPairEd448;
import com.jcraft.jsch.KeyPairRSA;
import com.jcraft.jsch.PBKDF2;
import com.jcraft.jsch.SCrypt;
import com.jcraft.jsch.Util;
import java.math.BigInteger;
import java.util.ArrayList;

class KeyPairPKCS8
extends KeyPair {
    private static final byte[] A;
    private static final byte[] B;
    private static final byte[] C;
    private static final byte[] D;
    private static final byte[] E;
    private static final byte[] F;
    private static final byte[] G;
    private static final byte[] H;
    private static final byte[] I;
    private static final byte[] J;
    private static final byte[] K;
    private static final byte[] L;
    private static final byte[] M;
    private static final byte[] N;
    private static final byte[] O;
    private static final byte[] P;
    private static final byte[] Q;
    private static final byte[] R;
    private static final byte[] S;
    private static final byte[] T;
    private static final byte[] U;
    private static final byte[] V;
    private static final byte[] W;
    private static final byte[] X;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static final byte[] v;
    private static final byte[] w;
    private static final byte[] x;
    private static final byte[] y;
    private static final byte[] z;
    private KeyPair q = null;

    static {
        r = new byte[]{42, -122, 72, -122, -9, 13, 1, 1, 1};
        s = new byte[]{42, -122, 72, -50, 56, 4, 1};
        t = new byte[]{42, -122, 72, -50, 61, 2, 1};
        u = new byte[]{43, 101, 112};
        v = new byte[]{43, 101, 113};
        w = new byte[]{42, -122, 72, -50, 61, 3, 1, 7};
        x = new byte[]{43, -127, 4, 0, 34};
        y = new byte[]{43, -127, 4, 0, 35};
        z = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 13};
        A = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 12};
        B = new byte[]{43, 6, 1, 4, 1, -38, 71, 4, 11};
        C = new byte[]{42, -122, 72, -122, -9, 13, 2, 7};
        D = new byte[]{42, -122, 72, -122, -9, 13, 2, 8};
        E = new byte[]{42, -122, 72, -122, -9, 13, 2, 9};
        F = new byte[]{42, -122, 72, -122, -9, 13, 2, 10};
        G = new byte[]{42, -122, 72, -122, -9, 13, 2, 11};
        H = new byte[]{42, -122, 72, -122, -9, 13, 2, 12};
        I = new byte[]{42, -122, 72, -122, -9, 13, 2, 13};
        J = new byte[]{96, -122, 72, 1, 101, 3, 4, 1, 2};
        K = new byte[]{96, -122, 72, 1, 101, 3, 4, 1, 22};
        L = new byte[]{96, -122, 72, 1, 101, 3, 4, 1, 42};
        M = new byte[]{43, 14, 3, 2, 7};
        N = new byte[]{42, -122, 72, -122, -9, 13, 3, 7};
        O = new byte[]{42, -122, 72, -122, -9, 13, 3, 2};
        P = new byte[]{42, -122, 72, -122, -9, 13, 3, 9};
        Q = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 1};
        R = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 4};
        S = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 3};
        T = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 6};
        U = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 10};
        V = new byte[]{42, -122, 72, -122, -9, 13, 1, 5, 11};
        W = Util.v("-----BEGIN DSA PRIVATE KEY-----");
        X = Util.v("-----END DSA PRIVATE KEY-----");
    }

    KeyPairPKCS8(JSch.InstanceLogger instanceLogger) {
        super(instanceLogger);
    }

    static Cipher H(byte[] object, KeyPair.ASN1 object2, byte[][] byArray) throws Exception {
        block11: {
            block12: {
                block13: {
                    block14: {
                        String string;
                        block8: {
                            block10: {
                                block9: {
                                    block7: {
                                        if (!Util.a((byte[])object, J)) break block7;
                                        string = "aes128-cbc";
                                        break block8;
                                    }
                                    if (!Util.a((byte[])object, K)) break block9;
                                    string = "aes192-cbc";
                                    break block8;
                                }
                                if (!Util.a((byte[])object, L)) break block10;
                                string = "aes256-cbc";
                                break block8;
                            }
                            if (Util.a((byte[])object, M)) break block11;
                            if (Util.a((byte[])object, N)) break block12;
                            if (Util.a((byte[])object, O)) break block13;
                            if (Util.a((byte[])object, P)) break block14;
                            string = null;
                        }
                        if (string != null) {
                            if (((KeyPair.ASN1)object2).j()) {
                                byArray[0] = ((KeyPair.ASN1)object2).a();
                                try {
                                    object = Class.forName(JSch.f(string)).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null);
                                    return object;
                                }
                                catch (Exception exception) {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append(string);
                                    ((StringBuilder)object).append(" is not supported");
                                    throw new JSchException(((StringBuilder)object).toString(), exception);
                                }
                            }
                            throw new KeyPair.ASN1Exception();
                        }
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("unsupported cipher function oid: ");
                        ((StringBuilder)object2).append(Util.y((byte[])object));
                        throw new JSchException(((StringBuilder)object2).toString());
                    }
                    throw new JSchException("unsupported cipher function: rc5-cbc");
                }
                throw new JSchException("unsupported cipher function: rc2-cbc");
            }
            throw new JSchException("unsupported cipher function: 3des-cbc");
        }
        throw new JSchException("unsupported cipher function: des-cbc");
    }

    static PBKDF2 I(String string) throws JSchException {
        try {
            PBKDF2 pBKDF2 = Class.forName(JSch.f(string)).asSubclass(PBKDF2.class).getDeclaredConstructor(null).newInstance(null);
            return pBKDF2;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" is not supported");
            throw new JSchException(stringBuilder.toString(), exception);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static String J(byte[] byArray) throws JSchException {
        if (byArray == null) return "pbkdf2-hmac-sha1";
        if (Util.a(byArray, C)) return "pbkdf2-hmac-sha1";
        if (Util.a(byArray, D)) {
            return "pbkdf2-hmac-sha224";
        }
        if (Util.a(byArray, E)) {
            return "pbkdf2-hmac-sha256";
        }
        if (Util.a(byArray, F)) {
            return "pbkdf2-hmac-sha384";
        }
        if (Util.a(byArray, G)) {
            return "pbkdf2-hmac-sha512";
        }
        if (Util.a(byArray, H)) throw new JSchException("unsupported pbkdf2 function: pbkdf2-hmac-sha512-224");
        if (Util.a(byArray, I)) throw new JSchException("unsupported pbkdf2 function: pbkdf2-hmac-sha512-256");
        CharSequence charSequence = null;
        if (charSequence != null) {
            return charSequence;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("unsupported pbkdf2 function oid: ");
        ((StringBuilder)charSequence).append(Util.y(byArray));
        throw new JSchException(((StringBuilder)charSequence).toString());
    }

    static SCrypt K() throws JSchException {
        try {
            SCrypt sCrypt = Class.forName(JSch.f("scrypt")).asSubclass(SCrypt.class).getDeclaredConstructor(null).newInstance(null);
            return sCrypt;
        }
        catch (Exception exception) {
            throw new JSchException("scrypt is not supported", exception);
        }
    }

    static int L(byte[] object) {
        if (((BigInteger)(object = (Object)new BigInteger((byte[])object))).bitLength() <= 31) {
            return ((BigInteger)object).intValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean d(byte[] var1_1) {
        block48: {
            block53: {
                block50: {
                    block52: {
                        block49: {
                            if (!this.r()) {
                                return true;
                            }
                            if (var1_1 /* !! */  == null) {
                                return this.r() ^ true;
                            }
                            var5_4 /* !! */  = null;
                            var8_10 = null;
                            var6_15 /* !! */  = null;
                            try {
                                var7_16 = new KeyPair.ASN1(this.j);
                                if (!var7_16.k()) ** GOTO lbl292
                                var9_17 /* !! */  = var7_16.b();
                                if (var9_17 /* !! */ .length != 2) ** GOTO lbl289
                                if (!var9_17 /* !! */ [0].k()) ** GOTO lbl286
                                if (var9_17 /* !! */ [1].j()) {
                                    var7_16 = (KeyPair.ASN1[])var9_17 /* !! */ [1].a();
                                }
                                ** GOTO lbl-1000
                            }
                            catch (Throwable var5_9) {
                                var6_15 /* !! */  = null;
                                var1_1 /* !! */  = null;
                                var7_16 = var8_10;
                                break block48;
                            }
                            catch (Exception var10_19) {
                                var7_16 = null;
                                var9_17 /* !! */  = null;
                                var8_10 = var6_15 /* !! */ ;
                                break block49;
                            }
                            catch (KeyPair.ASN1Exception var10_20) {
                                var7_16 = null;
                                var9_17 /* !! */  = null;
                                var8_10 = var5_4 /* !! */ ;
                                break block50;
                            }
                            try {
                                var6_15 /* !! */  = var9_17 /* !! */ [0].b();
                                if (var6_15 /* !! */ .length != 2) ** GOTO lbl280
                                if (!var6_15 /* !! */ [0].i()) ** GOTO lbl277
                                if (var6_15 /* !! */ [1].k()) {
                                    var5_4 /* !! */  = (KeyPair.ASN1[])var6_15 /* !! */ [0].a();
                                }
                                ** GOTO lbl274
                            }
                            catch (Throwable var5_5) {
                                var6_15 /* !! */  = null;
                                var1_1 /* !! */  = null;
                                break block48;
                            }
                            catch (Exception var1_2) {
                                var6_15 /* !! */  = null;
                                var5_4 /* !! */  = null;
lbl48:
                                // 3 sources

                                while (true) {
                                    var8_10 = var7_16;
                                    var7_16 = var6_15 /* !! */ ;
                                    var9_17 /* !! */  = var5_4 /* !! */ ;
                                    var10_18 /* !! */  = var1_1 /* !! */ ;
                                    break block49;
                                    break;
                                }
                            }
                            catch (KeyPair.ASN1Exception var1_3) {
                                var6_15 /* !! */  = null;
                                var5_4 /* !! */  = null;
lbl57:
                                // 3 sources

                                while (true) {
                                    var8_10 = var7_16;
                                    var7_16 = var6_15 /* !! */ ;
                                    var9_17 /* !! */  = var5_4 /* !! */ ;
                                    var10_18 /* !! */  = var1_1 /* !! */ ;
                                    break block50;
                                    break;
                                }
                            }
                            var6_15 /* !! */  = var6_15 /* !! */ [1];
                            {
                                if (!Util.a((byte[])var5_4 /* !! */ , KeyPairPKCS8.z)) ** GOTO lbl242
                                if ((var6_15 /* !! */  = var6_15 /* !! */ .b()).length != 2) ** GOTO lbl239
                            }
                            var5_4 /* !! */  = var6_15 /* !! */ [0];
                            var6_15 /* !! */  = var6_15 /* !! */ [1];
                            {
                                if (!var5_4 /* !! */ .k()) ** GOTO lbl236
                                if (!var6_15 /* !! */ .k()) ** GOTO lbl233
                                if ((var6_15 /* !! */  = var6_15 /* !! */ .b()).length != 2) ** GOTO lbl230
                                if (!var6_15 /* !! */ [0].i()) ** GOTO lbl227
                                var8_10 = var6_15 /* !! */ [0].a();
                            }
                            var9_17 /* !! */  = var6_15 /* !! */ [1];
                            {
                                var6_15 /* !! */  = var5_4 /* !! */ .b();
                                if (var6_15 /* !! */ .length != 2) ** GOTO lbl225
                                if (!var6_15 /* !! */ [0].i()) ** GOTO lbl223
                                if (!var6_15 /* !! */ [1].k()) ** GOTO lbl221
                                var5_4 /* !! */  = (KeyPair.ASN1[])var6_15 /* !! */ [0].a();
                                if (!Util.a((byte[])var5_4 /* !! */ , KeyPairPKCS8.A)) ** GOTO lbl130
                            }
                            {
                                var5_4 /* !! */  = var6_15 /* !! */ [1];
                                if (!var5_4 /* !! */ .k()) ** GOTO lbl128
                                var6_15 /* !! */  = var5_4 /* !! */ .b();
                                if (var6_15 /* !! */ .length < 2 || var6_15 /* !! */ .length > 4) ** GOTO lbl126
                                if (!var6_15 /* !! */ [0].j()) ** GOTO lbl124
                                if (!var6_15 /* !! */ [1].g()) ** GOTO lbl122
                                if (var6_15 /* !! */ .length != 4) ** GOTO lbl95
                                if (!var6_15 /* !! */ [2].g()) ** GOTO lbl93
                                if (!var6_15 /* !! */ [3].k()) ** GOTO lbl-1000
                            }
                            var5_4 /* !! */  = var6_15 /* !! */ [3];
                            ** GOTO lbl103
lbl-1000:
                            // 1 sources

                            {
                                var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                throw var1_1 /* !! */ ;
lbl93:
                                // 1 sources

                                var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                throw var1_1 /* !! */ ;
lbl95:
                                // 1 sources

                                if (var6_15 /* !! */ .length != 3) ** GOTO lbl102
                                if (!var6_15 /* !! */ [2].k()) ** GOTO lbl-1000
                            }
                            var5_4 /* !! */  = var6_15 /* !! */ [2];
                            ** GOTO lbl103
lbl-1000:
                            // 1 sources

                            {
                                block54: {
                                    if (!var6_15 /* !! */ [2].g()) {
                                        var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                        throw var1_1 /* !! */ ;
                                    }
lbl102:
                                    // 3 sources

                                    var5_4 /* !! */  = null;
lbl103:
                                    // 3 sources

                                    var10_18 /* !! */  = var6_15 /* !! */ [0].a();
                                    var2_21 = KeyPairPKCS8.L(var6_15 /* !! */ [1].a());
                                    if (var5_4 /* !! */  != null) {
                                        if ((var5_4 /* !! */  = var5_4 /* !! */ .b()).length != 2) {
                                            var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                            throw var1_1 /* !! */ ;
                                        }
                                        if (!var5_4 /* !! */ [0].i()) {
                                            var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                            throw var1_1 /* !! */ ;
                                        }
                                        if (!var5_4 /* !! */ [1].h()) {
                                            var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                            throw var1_1 /* !! */ ;
                                        }
                                        var5_4 /* !! */  = (KeyPair.ASN1[])var5_4 /* !! */ [0].a();
                                    } else {
                                        var5_4 /* !! */  = null;
                                    }
                                    var5_4 /* !! */  = KeyPairPKCS8.J((byte[])var5_4 /* !! */ );
                                    var6_15 /* !! */  = KeyPairPKCS8.I((String)var5_4 /* !! */ );
                                    var6_15 /* !! */ .a(var10_18 /* !! */ , var2_21);
                                    break block54;
lbl122:
                                    // 1 sources

                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var1_1 /* !! */ ;
lbl124:
                                    // 1 sources

                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var1_1 /* !! */ ;
lbl126:
                                    // 1 sources

                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var1_1 /* !! */ ;
lbl128:
                                    // 1 sources

                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var1_1 /* !! */ ;
lbl130:
                                    // 1 sources

                                    if (!Util.a((byte[])var5_4 /* !! */ , KeyPairPKCS8.B)) ** GOTO lbl214
                                    if ((var6_15 /* !! */  = var6_15 /* !! */ [1].b()).length < 4 || var6_15 /* !! */ .length > 5) ** GOTO lbl212
                                    if (!var6_15 /* !! */ [0].j()) ** GOTO lbl210
                                    if (!var6_15 /* !! */ [1].g()) ** GOTO lbl208
                                    if (!var6_15 /* !! */ [2].g()) ** GOTO lbl206
                                    if (!var6_15 /* !! */ [3].g()) ** GOTO lbl-1000
                                    if (var6_15 /* !! */ .length > 4 && !var6_15 /* !! */ [4].g()) {
                                        var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                        throw var1_1 /* !! */ ;
                                    }
                                    var5_4 /* !! */  = (KeyPair.ASN1[])var6_15 /* !! */ [0].a();
                                    var4_23 = KeyPairPKCS8.L(var6_15 /* !! */ [1].a());
                                    var2_22 = KeyPairPKCS8.L(var6_15 /* !! */ [2].a());
                                    var3_24 = KeyPairPKCS8.L(var6_15 /* !! */ [3].a());
                                    var6_15 /* !! */  = KeyPairPKCS8.K();
                                    var6_15 /* !! */ .d((byte[])var5_4 /* !! */ , var4_23, var2_22, var3_24);
                                    var5_4 /* !! */  = "scrypt";
                                }
                                var10_18 /* !! */  = (byte[])new byte[1][];
                                var8_10 = KeyPairPKCS8.H((byte[])var8_10, (KeyPair.ASN1)var9_17 /* !! */ , (byte[][])var10_18 /* !! */ );
                            }
                            var9_17 /* !! */  = (KeyPair.ASN1[])var10_18 /* !! */ [0];
                            {
                                var1_1 /* !! */  = var6_15 /* !! */ .c(var1_1 /* !! */ , var8_10.d());
                                if (var1_1 /* !! */  == null) ** GOTO lbl-1000
                            }
                            try {
                                var8_10.k(1, var1_1 /* !! */ , (byte[])var9_17 /* !! */ );
                                var5_4 /* !! */  = (KeyPair.ASN1[])new byte[var7_16.length];
                            }
                            catch (Throwable var5_6) {
                                var8_10 = null;
                                var6_15 /* !! */  = (KeyPair.ASN1[])var1_1 /* !! */ ;
                                var1_1 /* !! */  = (byte[])var8_10;
                                break block48;
                            }
                            catch (Exception var5_7) {
                                var6_15 /* !! */  = (KeyPair.ASN1[])var1_1 /* !! */ ;
                                var1_1 /* !! */  = (byte[])var5_7;
                                var5_4 /* !! */  = null;
                                ** GOTO lbl48
                            }
                            catch (KeyPair.ASN1Exception var5_8) {
                                var6_15 /* !! */  = (KeyPair.ASN1[])var1_1 /* !! */ ;
                                var1_1 /* !! */  = (byte[])var5_8;
                                var5_4 /* !! */  = null;
                                ** GOTO lbl57
                            }
                            try {
                                var8_10.a((byte[])var7_16, 0, var7_16.length, (byte[])var5_4 /* !! */ , 0);
                                if (this.y((byte[])var5_4 /* !! */ )) {
                                    this.i = false;
                                    Util.g(this.j);
                                }
                                ** GOTO lbl-1000
                            }
                            catch (Throwable var8_11) {
                                var6_15 /* !! */  = (KeyPair.ASN1[])var1_1 /* !! */ ;
                                var1_1 /* !! */  = (byte[])var5_4 /* !! */ ;
                                var5_4 /* !! */  = var8_11;
                                break block48;
                            }
                            catch (Exception var8_12) {
                                var6_15 /* !! */  = (KeyPair.ASN1[])var1_1 /* !! */ ;
                                var1_1 /* !! */  = (byte[])var8_12;
                                ** continue;
                            }
                            catch (KeyPair.ASN1Exception var8_13) {
                                var6_15 /* !! */  = (KeyPair.ASN1[])var1_1 /* !! */ ;
                                var1_1 /* !! */  = (byte[])var8_13;
                                ** continue;
                            }
                            Util.g((byte[])var7_16);
                            Util.g(var1_1 /* !! */ );
                            Util.g((byte[])var5_4 /* !! */ );
                            return true;
lbl-1000:
                            // 1 sources

                            {
                                var6_15 /* !! */  = new JSchException("failed to parse decrypted key");
                                throw var6_15 /* !! */ ;
                            }
lbl-1000:
                            // 1 sources

                            {
                                var8_10 = new StringBuilder();
                                var8_10.append("failed to generate key from KDF ");
                                var8_10.append((String)var5_4 /* !! */ );
                                var6_15 /* !! */  = new JSchException(var8_10.toString());
                                throw var6_15 /* !! */ ;
                            }
lbl-1000:
                            // 1 sources

                            {
                                block51: {
                                    block55: {
                                        block56: {
                                            block57: {
                                                block58: {
                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl206:
                                                    // 1 sources

                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl208:
                                                    // 1 sources

                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl210:
                                                    // 1 sources

                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl212:
                                                    // 1 sources

                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl214:
                                                    // 1 sources

                                                    var6_15 /* !! */  = new StringBuilder();
                                                    var6_15 /* !! */ .append("unsupported kdf oid: ");
                                                    var6_15 /* !! */ .append(Util.y((byte[])var5_4 /* !! */ ));
                                                    var1_1 /* !! */  = new JSchException(var6_15 /* !! */ .toString());
                                                    throw var1_1 /* !! */ ;
lbl221:
                                                    // 1 sources

                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl223:
                                                    // 1 sources

                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl225:
                                                    // 1 sources

                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl227:
                                                    // 1 sources

                                                    var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl230:
                                                    // 1 sources

                                                    var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl233:
                                                    // 1 sources

                                                    var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl236:
                                                    // 1 sources

                                                    var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl239:
                                                    // 1 sources

                                                    var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                                    var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var1_1 /* !! */ ;
lbl242:
                                                    // 1 sources

                                                    if (Util.a((byte[])var5_4 /* !! */ , KeyPairPKCS8.Q)) break block55;
                                                    if (Util.a((byte[])var5_4 /* !! */ , KeyPairPKCS8.R)) break block56;
                                                    if (Util.a((byte[])var5_4 /* !! */ , KeyPairPKCS8.S)) break block57;
                                                    if (Util.a((byte[])var5_4 /* !! */ , KeyPairPKCS8.T)) break block58;
                                                    if (!Util.a((byte[])var5_4 /* !! */ , KeyPairPKCS8.U)) {
                                                        if (Util.a((byte[])var5_4 /* !! */ , KeyPairPKCS8.V)) {
                                                            var1_1 /* !! */  = (byte[])"pbeWithSHA1AndRC2-CBC unsupported";
                                                            break block51;
                                                        } else {
                                                            var1_1 /* !! */  = (byte[])new StringBuilder;
                                                            var1_1 /* !! */  = new StringBuilder();
                                                            var1_1 /* !! */ .append("unsupported encryption oid: ");
                                                            var1_1 /* !! */ .append(Util.y((byte[])var5_4 /* !! */ ));
                                                            var1_1 /* !! */  = var1_1 /* !! */ .toString();
                                                        }
                                                        break block51;
                                                    } else {
                                                        var1_1 /* !! */  = (byte[])"pbeWithSHA1AndDES-CBC unsupported";
                                                    }
                                                    break block51;
                                                }
                                                var1_1 /* !! */  = (byte[])"pbeWithMD5AndRC2-CBC unsupported";
                                                break block51;
                                            }
                                            var1_1 /* !! */  = (byte[])"pbeWithMD5AndDES-CBC unsupported";
                                            break block51;
                                        }
                                        var1_1 /* !! */  = (byte[])"pbeWithMD2AndRC2-CBC unsupported";
                                        break block51;
                                    }
                                    var1_1 /* !! */  = (byte[])"pbeWithMD2AndDES-CBC unsupported";
                                }
                                var5_4 /* !! */  = new JSchException((String)var1_1 /* !! */ );
                                throw var5_4 /* !! */ ;
lbl274:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                throw var1_1 /* !! */ ;
lbl277:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                throw var1_1 /* !! */ ;
lbl280:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                throw var1_1 /* !! */ ;
                            }
lbl-1000:
                            // 1 sources

                            {
                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                throw var1_1 /* !! */ ;
lbl286:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                throw var1_1 /* !! */ ;
lbl289:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                throw var1_1 /* !! */ ;
lbl292:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */  = new KeyPair.ASN1Exception();
                                throw var1_1 /* !! */ ;
                            }
                        }
                        var6_15 /* !! */  = var7_16;
                        var5_4 /* !! */  = var8_10;
                        var1_1 /* !! */  = (byte[])var9_17 /* !! */ ;
                        try {
                            if (!this.c.a().isEnabled(3)) break block52;
                            var6_15 /* !! */  = var7_16;
                            var5_4 /* !! */  = var8_10;
                            var1_1 /* !! */  = (byte[])var9_17 /* !! */ ;
                            var12_25 = this.c.a();
                            var6_15 /* !! */  = var7_16;
                            var5_4 /* !! */  = var8_10;
                            var1_1 /* !! */  = (byte[])var9_17 /* !! */ ;
                            var6_15 /* !! */  = var7_16;
                            var5_4 /* !! */  = var8_10;
                            var1_1 /* !! */  = (byte[])var9_17 /* !! */ ;
                            var11_26 = new StringBuilder();
                            var6_15 /* !! */  = var7_16;
                            var5_4 /* !! */  = var8_10;
                            var1_1 /* !! */  = (byte[])var9_17 /* !! */ ;
                            var11_26.append("PKCS8: failed to decrypt key: ");
                            var6_15 /* !! */  = var7_16;
                            var5_4 /* !! */  = var8_10;
                            var1_1 /* !! */  = (byte[])var9_17 /* !! */ ;
                            var11_26.append(var10_18 /* !! */ .getMessage());
                            var6_15 /* !! */  = var7_16;
                            var5_4 /* !! */  = var8_10;
                            var1_1 /* !! */  = (byte[])var9_17 /* !! */ ;
                            var12_25.b(3, var11_26.toString(), (Throwable)var10_18 /* !! */ );
                        }
                        catch (Throwable var8_14) {
                            var7_16 = var5_4 /* !! */ ;
                            var5_4 /* !! */  = var8_14;
                            break block48;
                        }
                    }
                    Util.g((byte[])var8_10);
                    Util.g((byte[])var7_16);
                    Util.g((byte[])var9_17 /* !! */ );
                    return false;
                }
                var6_15 /* !! */  = var7_16;
                var5_4 /* !! */  = var8_10;
                var1_1 /* !! */  = (byte[])var9_17 /* !! */ ;
                {
                    if (!this.c.a().isEnabled(3)) break block53;
                    var6_15 /* !! */  = var7_16;
                    var5_4 /* !! */  = var8_10;
                    var1_1 /* !! */  = (byte[])var9_17 /* !! */ ;
                    this.c.a().b(3, "PKCS8: failed to decrypt key: ASN1 parsing error", (Throwable)var10_18 /* !! */ );
                }
            }
            Util.g((byte[])var8_10);
            Util.g((byte[])var7_16);
            Util.g((byte[])var9_17 /* !! */ );
            return false;
        }
        Util.g((byte[])var7_16);
        Util.g((byte[])var6_15 /* !! */ );
        Util.g(var1_1 /* !! */ );
        throw var5_4 /* !! */ ;
    }

    @Override
    public byte[] g() throws JSchException {
        return this.q.g();
    }

    @Override
    byte[] l() {
        KeyPair keyPair = this.q;
        if (keyPair != null) {
            return keyPair.l();
        }
        return new byte[0];
    }

    @Override
    byte[] n() {
        return null;
    }

    @Override
    public byte[] o() {
        KeyPair keyPair = this.q;
        if (keyPair != null) {
            return keyPair.o();
        }
        return super.o();
    }

    @Override
    public byte[] p(byte[] byArray) {
        return this.q.p(byArray);
    }

    @Override
    public byte[] q(byte[] byArray, String string) {
        return this.q.q(byArray, string);
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
        block73: {
            block81: {
                block75: {
                    block80: {
                        block74: {
                            block82: {
                                block79: {
                                    block78: {
                                        block77: {
                                            block76: {
                                                var5_2 /* !! */  = null;
                                                var7_11 /* !! */  = null;
                                                var9_12 /* !! */  = null;
                                                var8_13 = null;
                                                var6_14 = null;
                                                var10_17 = null;
                                                var11_18 = null;
                                                var3_19 = null;
                                                var4_26 = null;
                                                try {
                                                    var2_27 /* !! */  = new KeyPair.ASN1(var1_1 /* !! */ );
                                                    if (!var2_27 /* !! */ .k()) ** GOTO lbl476
                                                    var1_1 /* !! */  = (byte[])var2_27 /* !! */ .b();
                                                    if (var1_1 /* !! */ .length < 3 || var1_1 /* !! */ .length > 4) ** GOTO lbl473
                                                    if (!var1_1 /* !! */ [0].g()) ** GOTO lbl470
                                                    if (!var1_1 /* !! */ [1].k()) ** GOTO lbl467
                                                    if (var1_1 /* !! */ [2].j()) {
                                                        if (var1_1 /* !! */ .length > 3 && !var1_1 /* !! */ [3].f(0)) {
                                                            var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                                            var1_1 /* !! */ ();
                                                            throw var1_1 /* !! */ ;
                                                        }
                                                    }
                                                    ** GOTO lbl464
                                                }
                                                catch (Throwable var2_28) {
                                                    var6_14 = null;
                                                    var4_26 = null;
                                                    var5_2 /* !! */  = var4_26;
                                                    var1_1 /* !! */  = var3_19;
                                                    var3_19 = var6_14;
                                                    break block73;
                                                }
                                                catch (Exception var2_29) {
                                                    var3_19 = null;
                                                    var4_26 = null;
                                                    var5_2 /* !! */  = var4_26;
                                                    var1_1 /* !! */  = var10_17;
                                                    break block74;
                                                }
                                                catch (KeyPair.ASN1Exception var2_30) {
                                                    var3_19 = null;
                                                    var4_26 = null;
                                                    var5_2 /* !! */  = var4_26;
                                                    var1_1 /* !! */  = var11_18;
                                                    break block75;
                                                }
                                                if (KeyPairPKCS8.L(var1_1 /* !! */ [0].a()) != 0) ** GOTO lbl461
                                                var2_27 /* !! */  = (KeyPair.ASN1[])var1_1 /* !! */ [1];
                                                var1_1 /* !! */  = (byte[])var1_1 /* !! */ [2];
                                                {
                                                    if ((var2_27 /* !! */  = var2_27 /* !! */ .b()).length == 0) ** GOTO lbl458
                                                    if (!var2_27 /* !! */ [0].i()) ** GOTO lbl-1000
                                                    var12_40 = var2_27 /* !! */ [0].a();
                                                    var1_1 /* !! */  = var1_1 /* !! */ .a();
                                                }
                                                try {
                                                    if (!Util.a(var12_40, KeyPairPKCS8.r)) ** GOTO lbl84
                                                    if (var2_27 /* !! */ .length != 2) ** GOTO lbl82
                                                    if (!var2_27 /* !! */ [1].h()) ** GOTO lbl80
                                                    var2_27 /* !! */  = new KeyPairRSA(this.c);
                                                    var2_27 /* !! */ .b(this);
                                                    if (var2_27 /* !! */ .y(var1_1 /* !! */ )) {
                                                        this.q = var2_27 /* !! */ ;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                catch (Throwable var2_31) {
                                                    var3_19 = null;
                                                    var4_26 = null;
                                                    var5_2 /* !! */  = var4_26;
                                                    break block73;
                                                }
                                                catch (Exception var2_32) {
                                                    var3_19 = null;
                                                    var4_26 = null;
                                                    var5_2 /* !! */  = var4_26;
                                                    break block74;
                                                }
                                                catch (KeyPair.ASN1Exception var2_33) {
                                                    var3_19 = null;
                                                    var4_26 = null;
                                                    var5_2 /* !! */  = var4_26;
                                                    break block75;
                                                }
                                                Util.g(var1_1 /* !! */ );
                                                Util.g(null);
                                                break block82;
lbl-1000:
                                                // 1 sources

                                                {
                                                    var2_27 /* !! */  = new JSchException("failed to parse RSA");
                                                    throw var2_27 /* !! */ ;
lbl80:
                                                    // 1 sources

                                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var2_27 /* !! */ ;
lbl82:
                                                    // 1 sources

                                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var2_27 /* !! */ ;
lbl84:
                                                    // 1 sources

                                                    if (!Util.a(var12_40, KeyPairPKCS8.s)) ** GOTO lbl266
                                                    var3_19 = new ArrayList(3);
                                                    if (var2_27 /* !! */ .length > 1 && var2_27 /* !! */ [1].k()) {
                                                        if ((var2_27 /* !! */  = var2_27 /* !! */ [1].b()).length != 3) {
                                                            var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                            throw var2_27 /* !! */ ;
                                                        }
                                                        if (!var2_27 /* !! */ [0].g()) {
                                                            var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                            throw var2_27 /* !! */ ;
                                                        }
                                                        if (!var2_27 /* !! */ [1].g()) {
                                                            var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                            throw var2_27 /* !! */ ;
                                                        }
                                                        if (!var2_27 /* !! */ [2].g()) {
                                                            var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                            throw var2_27 /* !! */ ;
                                                        }
                                                        var3_19.add(var2_27 /* !! */ [0].a());
                                                        var3_19.add(var2_27 /* !! */ [1].a());
                                                        var3_19.add(var2_27 /* !! */ [2].a());
                                                    }
                                                    var2_27 /* !! */  = new KeyPair.ASN1(var1_1 /* !! */ );
                                                    if (var3_19.size() != 0) ** GOTO lbl163
                                                    if (!var2_27 /* !! */ .k()) ** GOTO lbl161
                                                    var6_14 = var2_27 /* !! */ .b();
                                                    if (((KeyPair.ASN1[])var6_14).length != 2) ** GOTO lbl159
                                                    if (!var6_14[0].k()) ** GOTO lbl157
                                                    if (!var6_14[1].g()) ** GOTO lbl-1000
                                                    var2_27 /* !! */  = (KeyPair.ASN1[])var6_14[1].a();
                                                }
                                                try {
                                                    var6_14 = var6_14[0].b();
                                                    if (((Object)var6_14).length != 3) {
                                                        var3_19 = new KeyPair.ASN1Exception();
                                                        throw var3_19;
                                                    }
                                                    if (!var6_14[0].g()) {
                                                        var3_19 = new KeyPair.ASN1Exception();
                                                        throw var3_19;
                                                    }
                                                    if (!var6_14[1].g()) {
                                                        var3_19 = new KeyPair.ASN1Exception();
                                                        throw var3_19;
                                                    }
                                                    if (!var6_14[2].g()) {
                                                        var3_19 = new KeyPair.ASN1Exception();
                                                        throw var3_19;
                                                    }
                                                    var3_19.add(var6_14[0].a());
                                                    var3_19.add(var6_14[1].a());
                                                    var3_19.add(var6_14[2].a());
                                                    break block76;
                                                }
                                                catch (Throwable var3_20) {
                                                    var6_14 = null;
                                                    var4_26 = null;
                                                    var5_2 /* !! */  = var2_27 /* !! */ ;
                                                    var2_27 /* !! */  = var3_20;
                                                    var3_19 = var6_14;
                                                    break block73;
                                                }
                                                catch (Exception var3_21) {
                                                    var6_14 = null;
                                                    var4_26 = null;
                                                    var5_2 /* !! */  = var2_27 /* !! */ ;
                                                    var2_27 /* !! */  = var3_21;
                                                    var3_19 = var6_14;
                                                    break block74;
                                                }
                                                catch (KeyPair.ASN1Exception var3_22) {
                                                    var6_14 = null;
                                                    var4_26 = null;
                                                    var5_2 /* !! */  = var2_27 /* !! */ ;
                                                    var2_27 /* !! */  = var3_22;
                                                    var3_19 = var6_14;
                                                    break block75;
                                                }
lbl-1000:
                                                // 1 sources

                                                {
                                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var2_27 /* !! */ ;
lbl157:
                                                    // 1 sources

                                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var2_27 /* !! */ ;
lbl159:
                                                    // 1 sources

                                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var2_27 /* !! */ ;
lbl161:
                                                    // 1 sources

                                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                    throw var2_27 /* !! */ ;
lbl163:
                                                    // 1 sources

                                                    if (!var2_27 /* !! */ .g()) ** GOTO lbl-1000
                                                    var2_27 /* !! */  = (KeyPair.ASN1[])var2_27 /* !! */ .a();
                                                }
                                            }
                                            var8_13 = (byte[])var3_19.get(0);
                                            var6_14 = (byte[])var3_19.get(1);
                                            var9_12 /* !! */  = (byte[])var3_19.get(2);
                                            var11_18 = new BigInteger(var9_12 /* !! */ );
                                            var10_17 = new BigInteger((byte[])var2_27 /* !! */ );
                                            var3_19 = new BigInteger((byte[])var8_13);
                                            var11_18 = var11_18.modPow((BigInteger)var10_17, (BigInteger)var3_19).toByteArray();
                                            var10_17 = this.c;
lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    var6_14 = var2_27 /* !! */ ;
                                                    var2_27 /* !! */  = var5_2 /* !! */ ;
                                                    var5_2 /* !! */  = var6_14;
                                                    break block75;
                                                    break;
                                                }
lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        var3_19 = null;
                                                        var4_26 = null;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                }
                                                catch (Throwable var5_8) {
                                                    ** GOTO lbl-1000
                                                }
                                                catch (Exception var5_9) {
                                                    ** GOTO lbl-1000
                                                }
                                                catch (KeyPair.ASN1Exception var5_10) {
                                                    ** GOTO lbl-1000
                                                }
                                                var3_19 = new KeyPairDSA((JSch.InstanceLogger)var10_17, (byte[])var8_13, (byte[])var6_14, var9_12 /* !! */ , (byte[])var11_18, (byte[])var2_27 /* !! */ );
                                                var6_14 = var7_11 /* !! */ ;
                                                try {
                                                    var7_11 /* !! */  = (KeyPair.ASN1[])var3_19.n();
                                                    var4_26 = var7_11 /* !! */ ;
                                                    var5_2 /* !! */  = var7_11 /* !! */ ;
                                                    var6_14 = var7_11 /* !! */ ;
                                                    var4_26 = var7_11 /* !! */ ;
                                                    var5_2 /* !! */  = var7_11 /* !! */ ;
                                                    var6_14 = var7_11 /* !! */ ;
                                                    var8_13 = new KeyPairDSA(this.c);
                                                    var4_26 = var7_11 /* !! */ ;
                                                    var5_2 /* !! */  = var7_11 /* !! */ ;
                                                    var6_14 = var7_11 /* !! */ ;
                                                    var8_13.b(this);
                                                    var4_26 = var7_11 /* !! */ ;
                                                    var5_2 /* !! */  = var7_11 /* !! */ ;
                                                    var6_14 = var7_11 /* !! */ ;
                                                    if (!var8_13.y((byte[])var7_11 /* !! */ )) break block77;
                                                    var4_26 = var7_11 /* !! */ ;
                                                    var5_2 /* !! */  = var7_11 /* !! */ ;
                                                    var6_14 = var7_11 /* !! */ ;
                                                    this.q = var8_13;
                                                }
                                                catch (Throwable var5_3) {
                                                    var6_14 = var4_26;
                                                    var4_26 = var3_19;
                                                    var3_19 = var6_14;
lbl224:
                                                    // 2 sources

                                                    while (true) {
                                                        var6_14 = var2_27 /* !! */ ;
                                                        var2_27 /* !! */  = var5_2 /* !! */ ;
                                                        var5_2 /* !! */  = var6_14;
                                                        break block73;
                                                        break;
                                                    }
                                                }
                                                catch (Exception var6_15) {
                                                    var4_26 = var3_19;
                                                    var3_19 = var5_2 /* !! */ ;
                                                    var5_2 /* !! */  = var6_15;
lbl233:
                                                    // 2 sources

                                                    while (true) {
                                                        var6_14 = var2_27 /* !! */ ;
                                                        var2_27 /* !! */  = var5_2 /* !! */ ;
                                                        var5_2 /* !! */  = var6_14;
                                                        break block74;
                                                        break;
                                                    }
                                                }
                                                catch (KeyPair.ASN1Exception var5_4) {}
                                                Util.g(var1_1 /* !! */ );
                                                Util.g((byte[])var2_27 /* !! */ );
                                                Util.g((byte[])var7_11 /* !! */ );
                                                var3_19.f();
                                                return true;
                                                var4_26 = var3_19;
                                                var3_19 = var6_14;
                                                ** continue;
                                            }
                                        }
                                        var4_26 = var7_11 /* !! */ ;
                                        var5_2 /* !! */  = var7_11 /* !! */ ;
                                        var6_14 = var7_11 /* !! */ ;
                                        {
                                            var4_26 = var7_11 /* !! */ ;
                                            var5_2 /* !! */  = var7_11 /* !! */ ;
                                            var6_14 = var7_11 /* !! */ ;
                                            var8_13 = new JSchException("failed to parse DSA");
                                            var4_26 = var7_11 /* !! */ ;
                                            var5_2 /* !! */  = var7_11 /* !! */ ;
                                            var6_14 = var7_11 /* !! */ ;
                                            throw var8_13;
                                        }
                                        catch (Throwable var5_5) lbl-1000:
                                        // 2 sources

                                        {
                                            var3_19 = null;
                                            var4_26 = null;
                                            ** continue;
                                        }
                                        catch (Exception var5_6) lbl-1000:
                                        // 2 sources

                                        {
                                            var3_19 = null;
                                            var4_26 = null;
                                            ** continue;
                                        }
                                        catch (KeyPair.ASN1Exception var5_7) {}
                                        ** while (true)
lbl-1000:
                                        // 1 sources

                                        {
                                            block84: {
                                                block85: {
                                                    block83: {
                                                        var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                                        throw var2_27 /* !! */ ;
lbl266:
                                                        // 1 sources

                                                        if (!Util.a(var12_40, KeyPairPKCS8.t)) ** GOTO lbl403
                                                        if (var2_27 /* !! */ .length != 2) ** GOTO lbl401
                                                        if (!var2_27 /* !! */ [1].i()) ** GOTO lbl399
                                                        var4_26 = var2_27 /* !! */ [1].a();
                                                        if (Util.a((byte[])var4_26, KeyPairPKCS8.w)) break block83;
                                                        var2_27 /* !! */  = (KeyPair.ASN1[])Util.v("nistp256");
                                                        break block84;
                                                    }
                                                    if (Util.a((byte[])var4_26, KeyPairPKCS8.x)) break block85;
                                                    var2_27 /* !! */  = (KeyPair.ASN1[])Util.v("nistp384");
                                                    break block84;
                                                }
                                                if (Util.a((byte[])var4_26, KeyPairPKCS8.y)) ** GOTO lbl392
                                                var2_27 /* !! */  = (KeyPair.ASN1[])Util.v("nistp521");
                                            }
                                            var3_19 = new KeyPair.ASN1(var1_1 /* !! */ );
                                            if (!var3_19.k()) ** GOTO lbl390
                                            var7_11 /* !! */  = var3_19.b();
                                            if (var7_11 /* !! */ .length < 3 || var7_11 /* !! */ .length > 4) ** GOTO lbl388
                                            if (!var7_11 /* !! */ [0].g()) ** GOTO lbl386
                                            if (!var7_11 /* !! */ [1].j()) ** GOTO lbl384
                                            if (KeyPairPKCS8.L(var7_11 /* !! */ [0].a()) != 1) ** GOTO lbl-1000
                                            var5_2 /* !! */  = (KeyPair.ASN1[])var7_11 /* !! */ [1].a();
                                        }
                                        try {
                                            if (var7_11 /* !! */ .length != 3) break block78;
                                        }
                                        catch (Throwable var2_34) {
                                            var3_19 = null;
                                            var4_26 = null;
                                            break block73;
                                        }
                                        catch (Exception var2_35) {
                                            var3_19 = null;
                                            var4_26 = null;
                                            break block74;
                                        }
                                        catch (KeyPair.ASN1Exception var2_36) {
                                            var3_19 = null;
                                            var4_26 = null;
                                            break block75;
                                        }
                                        var3_19 = var7_11 /* !! */ [2];
                                        ** GOTO lbl312
                                    }
                                    var3_19 = var7_11 /* !! */ [3];
                                    {
                                        if (!var7_11 /* !! */ [2].f(0)) ** GOTO lbl380
                                        if ((var7_11 /* !! */  = var7_11 /* !! */ [2].b()).length != 1) ** GOTO lbl378
                                        if (!var7_11 /* !! */ [0].i()) ** GOTO lbl376
                                        if (!Util.a(var7_11 /* !! */ [0].a(), (byte[])var4_26)) ** GOTO lbl374
lbl312:
                                        // 2 sources

                                        if (!var3_19.f(1)) ** GOTO lbl372
                                        if (((Object)(var3_19 = var3_19.b())).length != 1) ** GOTO lbl370
                                        if (!var3_19[0].e()) ** GOTO lbl-1000
                                        var4_26 = KeyPairECDSA.H(var3_19[0].a());
                                    }
                                    var3_19 = var4_26[0];
                                    var7_11 /* !! */  = var4_26[1];
                                    {
                                        var4_26 = new KeyPairECDSA(this.c, (byte[])var2_27 /* !! */ , (byte[])var3_19, (byte[])var7_11 /* !! */ , (byte[])var5_2 /* !! */ );
                                    }
                                    var2_27 /* !! */  = (KeyPair.ASN1[])var9_12 /* !! */ ;
                                    var3_19 = var8_13;
                                    try {
                                        var2_27 /* !! */  = var7_11 /* !! */  = (KeyPair.ASN1[])var4_26.n();
                                        var3_19 = var7_11 /* !! */ ;
                                        var6_14 = var7_11 /* !! */ ;
                                        var2_27 /* !! */  = var7_11 /* !! */ ;
                                        var3_19 = var7_11 /* !! */ ;
                                        var6_14 = var7_11 /* !! */ ;
                                        var8_13 = new KeyPairECDSA(this.c);
                                        var2_27 /* !! */  = var7_11 /* !! */ ;
                                        var3_19 = var7_11 /* !! */ ;
                                        var6_14 = var7_11 /* !! */ ;
                                        var8_13.b(this);
                                        var2_27 /* !! */  = var7_11 /* !! */ ;
                                        var3_19 = var7_11 /* !! */ ;
                                        var6_14 = var7_11 /* !! */ ;
                                        if (!var8_13.y((byte[])var7_11 /* !! */ )) break block79;
                                        var2_27 /* !! */  = var7_11 /* !! */ ;
                                        var3_19 = var7_11 /* !! */ ;
                                        var6_14 = var7_11 /* !! */ ;
                                        this.q = var8_13;
                                    }
                                    catch (Throwable var6_16) {
                                        var3_19 = var2_27 /* !! */ ;
                                        var2_27 /* !! */  = var6_16;
                                        break block73;
                                    }
                                    catch (Exception var2_37) {
                                        break block74;
                                    }
                                    catch (KeyPair.ASN1Exception var2_38) {
                                        var3_19 = var6_14;
                                        break block75;
                                    }
                                    Util.g(var1_1 /* !! */ );
                                    Util.g((byte[])var5_2 /* !! */ );
                                    Util.g((byte[])var7_11 /* !! */ );
                                    var4_26.f();
                                    return true;
                                }
                                var2_27 /* !! */  = var7_11 /* !! */ ;
                                var3_19 = var7_11 /* !! */ ;
                                var6_14 = var7_11 /* !! */ ;
                                {
                                    var2_27 /* !! */  = var7_11 /* !! */ ;
                                    var3_19 = var7_11 /* !! */ ;
                                    var6_14 = var7_11 /* !! */ ;
                                    var8_13 = new JSchException("failed to parse ECDSA");
                                    var2_27 /* !! */  = var7_11 /* !! */ ;
                                    var3_19 = var7_11 /* !! */ ;
                                    var6_14 = var7_11 /* !! */ ;
                                    throw var8_13;
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl370:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl372:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl374:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl376:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl378:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl380:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl384:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl386:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl388:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl390:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl392:
                                    // 1 sources

                                    var2_27 /* !! */  = new StringBuilder();
                                    var2_27 /* !! */ .append("unsupported named curve oid: ");
                                    var2_27 /* !! */ .append(Util.y((byte[])var4_26));
                                    var3_19 = new JSchException(var2_27 /* !! */ .toString());
                                    throw var3_19;
lbl399:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl401:
                                    // 1 sources

                                    var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                    throw var2_27 /* !! */ ;
lbl403:
                                    // 1 sources

                                    var3_19 = KeyPairPKCS8.u;
                                    if (!Util.a(var12_40, (byte[])var3_19) && !Util.a(var12_40, KeyPairPKCS8.v)) {
                                        var3_19 = new StringBuilder();
                                        var3_19.append("unsupported privateKeyAlgorithm oid: ");
                                        var3_19.append(Util.y(var12_40));
                                        var2_27 /* !! */  = new JSchException(var3_19.toString());
                                        throw var2_27 /* !! */ ;
                                    }
                                    if (var2_27 /* !! */ .length != 1) ** GOTO lbl453
                                    var2_27 /* !! */  = new KeyPair.ASN1(var1_1 /* !! */ );
                                    if (!var2_27 /* !! */ .j()) ** GOTO lbl-1000
                                    var2_27 /* !! */  = (KeyPair.ASN1[])var2_27 /* !! */ .a();
                                }
                                try {
                                    var3_19 = Util.a(var12_40, (byte[])var3_19) != false ? new KeyPairEd25519(this.c) : new KeyPairEd448(this.c);
                                }
                                catch (Throwable var3_23) {
                                    var6_14 = null;
                                    var4_26 = null;
                                    var5_2 /* !! */  = var2_27 /* !! */ ;
                                    var2_27 /* !! */  = var3_23;
                                    var3_19 = var6_14;
                                    break block73;
                                }
                                catch (Exception var3_24) {
                                    var6_14 = null;
                                    var4_26 = null;
                                    var5_2 /* !! */  = var2_27 /* !! */ ;
                                    var2_27 /* !! */  = var3_24;
                                    var3_19 = var6_14;
                                    break block74;
                                }
                                catch (KeyPair.ASN1Exception var3_25) {
                                    var6_14 = null;
                                    var4_26 = null;
                                    var5_2 /* !! */  = var2_27 /* !! */ ;
                                    var2_27 /* !! */  = var3_25;
                                    var3_19 = var6_14;
                                    break block75;
                                }
                            }
lbl440:
                            // 2 sources

                            while (true) {
                                Util.g(null);
                                return true;
                            }
                            var3_19.b(this);
                            if (!var3_19.y((byte[])var2_27 /* !! */ )) ** GOTO lbl-1000
                            this.q = var3_19;
                            Util.g(var1_1 /* !! */ );
                            Util.g((byte[])var2_27 /* !! */ );
                            ** while (true)
lbl-1000:
                            // 1 sources

                            {
                                var3_19 = new JSchException("failed to parse EdDSA");
                                throw var3_19;
                            }
lbl-1000:
                            // 1 sources

                            {
                                var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                throw var2_27 /* !! */ ;
lbl453:
                                // 1 sources

                                var2_27 /* !! */  = new KeyPair.ASN1Exception();
                                throw var2_27 /* !! */ ;
                            }
lbl-1000:
                            // 1 sources

                            {
                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */ ();
                                throw var1_1 /* !! */ ;
lbl458:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */ ();
                                throw var1_1 /* !! */ ;
lbl461:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */ ();
                                throw var1_1 /* !! */ ;
lbl464:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */ ();
                                throw var1_1 /* !! */ ;
lbl467:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */ ();
                                throw var1_1 /* !! */ ;
lbl470:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */ ();
                                throw var1_1 /* !! */ ;
lbl473:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */ ();
                                throw var1_1 /* !! */ ;
lbl476:
                                // 1 sources

                                var1_1 /* !! */  = (byte[])new KeyPair.ASN1Exception;
                                var1_1 /* !! */ ();
                                throw var1_1 /* !! */ ;
                            }
                        }
                        var9_12 /* !! */  = var1_1 /* !! */ ;
                        var8_13 = var3_19;
                        var7_11 /* !! */  = var4_26;
                        var6_14 = var5_2 /* !! */ ;
                        try {
                            if (!this.c.a().isEnabled(3)) break block80;
                            var9_12 /* !! */  = var1_1 /* !! */ ;
                            var8_13 = var3_19;
                            var7_11 /* !! */  = var4_26;
                            var6_14 = var5_2 /* !! */ ;
                            var11_18 = this.c.a();
                            var9_12 /* !! */  = var1_1 /* !! */ ;
                            var8_13 = var3_19;
                            var7_11 /* !! */  = var4_26;
                            var6_14 = var5_2 /* !! */ ;
                            var9_12 /* !! */  = var1_1 /* !! */ ;
                            var8_13 = var3_19;
                            var7_11 /* !! */  = var4_26;
                            var6_14 = var5_2 /* !! */ ;
                            var10_17 = new StringBuilder();
                            var9_12 /* !! */  = var1_1 /* !! */ ;
                            var8_13 = var3_19;
                            var7_11 /* !! */  = var4_26;
                            var6_14 = var5_2 /* !! */ ;
                            var10_17.append("PKCS8: failed to parse key: ");
                            var9_12 /* !! */  = var1_1 /* !! */ ;
                            var8_13 = var3_19;
                            var7_11 /* !! */  = var4_26;
                            var6_14 = var5_2 /* !! */ ;
                            var10_17.append(var2_27 /* !! */ .getMessage());
                            var9_12 /* !! */  = var1_1 /* !! */ ;
                            var8_13 = var3_19;
                            var7_11 /* !! */  = var4_26;
                            var6_14 = var5_2 /* !! */ ;
                            var11_18.b(3, var10_17.toString(), (Throwable)var2_27 /* !! */ );
                        }
                        catch (Throwable var2_39) {
                            var1_1 /* !! */  = var9_12 /* !! */ ;
                            var3_19 = var8_13;
                            var4_26 = var7_11 /* !! */ ;
                            var5_2 /* !! */  = var6_14;
                            break block73;
                        }
                    }
                    Util.g(var1_1 /* !! */ );
                    Util.g((byte[])var5_2 /* !! */ );
                    Util.g((byte[])var3_19);
                    if (var4_26 != null) {
                        var4_26.f();
                    }
                    return false;
                }
                var9_12 /* !! */  = var1_1 /* !! */ ;
                var8_13 = var3_19;
                var7_11 /* !! */  = var4_26;
                var6_14 = var5_2 /* !! */ ;
                {
                    if (!this.c.a().isEnabled(3)) break block81;
                    var9_12 /* !! */  = var1_1 /* !! */ ;
                    var8_13 = var3_19;
                    var7_11 /* !! */  = var4_26;
                    var6_14 = var5_2 /* !! */ ;
                    this.c.a().b(3, "PKCS8: failed to parse key: ASN1 parsing error", (Throwable)var2_27 /* !! */ );
                }
            }
            Util.g(var1_1 /* !! */ );
            Util.g((byte[])var5_2 /* !! */ );
            Util.g((byte[])var3_19);
            if (var4_26 != null) {
                var4_26.f();
            }
            return false;
        }
        Util.g(var1_1 /* !! */ );
        Util.g(var5_2 /* !! */ );
        Util.g(var3_19);
        if (var4_26 != null) {
            var4_26.f();
        }
        throw var2_27 /* !! */ ;
    }
}

