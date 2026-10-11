package com.jcraft.jsch;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.KeyPair;
import java.math.BigInteger;

/* loaded from: classes3.dex */
class KeyPairPKCS8 extends KeyPair {
    private KeyPair q;
    private static final byte[] r = {42, -122, 72, -122, -9, 13, 1, 1, 1};
    private static final byte[] s = {42, -122, 72, -50, 56, 4, 1};
    private static final byte[] t = {42, -122, 72, -50, 61, 2, 1};
    private static final byte[] u = {43, 101, 112};
    private static final byte[] v = {43, 101, 113};
    private static final byte[] w = {42, -122, 72, -50, 61, 3, 1, 7};
    private static final byte[] x = {43, -127, 4, 0, 34};
    private static final byte[] y = {43, -127, 4, 0, 35};
    private static final byte[] z = {42, -122, 72, -122, -9, 13, 1, 5, 13};
    private static final byte[] A = {42, -122, 72, -122, -9, 13, 1, 5, 12};
    private static final byte[] B = {43, 6, 1, 4, 1, -38, 71, 4, 11};
    private static final byte[] C = {42, -122, 72, -122, -9, 13, 2, 7};
    private static final byte[] D = {42, -122, 72, -122, -9, 13, 2, 8};
    private static final byte[] E = {42, -122, 72, -122, -9, 13, 2, 9};
    private static final byte[] F = {42, -122, 72, -122, -9, 13, 2, 10};
    private static final byte[] G = {42, -122, 72, -122, -9, 13, 2, 11};
    private static final byte[] H = {42, -122, 72, -122, -9, 13, 2, 12};
    private static final byte[] I = {42, -122, 72, -122, -9, 13, 2, 13};
    private static final byte[] J = {96, -122, 72, 1, 101, 3, 4, 1, 2};
    private static final byte[] K = {96, -122, 72, 1, 101, 3, 4, 1, 22};
    private static final byte[] L = {96, -122, 72, 1, 101, 3, 4, 1, 42};
    private static final byte[] M = {43, 14, 3, 2, 7};
    private static final byte[] N = {42, -122, 72, -122, -9, 13, 3, 7};
    private static final byte[] O = {42, -122, 72, -122, -9, 13, 3, 2};
    private static final byte[] P = {42, -122, 72, -122, -9, 13, 3, 9};
    private static final byte[] Q = {42, -122, 72, -122, -9, 13, 1, 5, 1};
    private static final byte[] R = {42, -122, 72, -122, -9, 13, 1, 5, 4};
    private static final byte[] S = {42, -122, 72, -122, -9, 13, 1, 5, 3};
    private static final byte[] T = {42, -122, 72, -122, -9, 13, 1, 5, 6};
    private static final byte[] U = {42, -122, 72, -122, -9, 13, 1, 5, 10};
    private static final byte[] V = {42, -122, 72, -122, -9, 13, 1, 5, 11};
    private static final byte[] W = Util.v("-----BEGIN DSA PRIVATE KEY-----");
    private static final byte[] X = Util.v("-----END DSA PRIVATE KEY-----");

    KeyPairPKCS8(JSch.InstanceLogger instanceLogger) {
        super(instanceLogger);
        this.q = null;
    }

    static Cipher H(byte[] bArr, KeyPair.ASN1 asn1, byte[][] bArr2) throws Exception {
        String str;
        if (Util.a(bArr, J)) {
            str = "aes128-cbc";
        } else if (Util.a(bArr, K)) {
            str = "aes192-cbc";
        } else if (Util.a(bArr, L)) {
            str = "aes256-cbc";
        } else {
            if (Util.a(bArr, M)) {
                throw new JSchException("unsupported cipher function: des-cbc");
            }
            if (Util.a(bArr, N)) {
                throw new JSchException("unsupported cipher function: 3des-cbc");
            }
            if (Util.a(bArr, O)) {
                throw new JSchException("unsupported cipher function: rc2-cbc");
            }
            if (Util.a(bArr, P)) {
                throw new JSchException("unsupported cipher function: rc5-cbc");
            }
            str = null;
        }
        if (str == null) {
            throw new JSchException("unsupported cipher function oid: " + Util.y(bArr));
        }
        if (!asn1.j()) {
            throw new KeyPair.ASN1Exception();
        }
        bArr2[0] = asn1.a();
        try {
            return (Cipher) Class.forName(JSch.f(str)).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new JSchException(str + " is not supported", e);
        }
    }

    static PBKDF2 I(String str) throws JSchException {
        try {
            return (PBKDF2) Class.forName(JSch.f(str)).asSubclass(PBKDF2.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new JSchException(str + " is not supported", e);
        }
    }

    static String J(byte[] bArr) throws JSchException {
        String str;
        if (bArr == null || Util.a(bArr, C)) {
            str = "pbkdf2-hmac-sha1";
        } else if (Util.a(bArr, D)) {
            str = "pbkdf2-hmac-sha224";
        } else if (Util.a(bArr, E)) {
            str = "pbkdf2-hmac-sha256";
        } else if (Util.a(bArr, F)) {
            str = "pbkdf2-hmac-sha384";
        } else if (Util.a(bArr, G)) {
            str = "pbkdf2-hmac-sha512";
        } else {
            if (Util.a(bArr, H)) {
                throw new JSchException("unsupported pbkdf2 function: pbkdf2-hmac-sha512-224");
            }
            if (Util.a(bArr, I)) {
                throw new JSchException("unsupported pbkdf2 function: pbkdf2-hmac-sha512-256");
            }
            str = null;
        }
        if (str != null) {
            return str;
        }
        throw new JSchException("unsupported pbkdf2 function oid: " + Util.y(bArr));
    }

    static SCrypt K() throws JSchException {
        try {
            return (SCrypt) Class.forName(JSch.f("scrypt")).asSubclass(SCrypt.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new JSchException("scrypt is not supported", e);
        }
    }

    static int L(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(bArr);
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // com.jcraft.jsch.KeyPair
    public boolean d(byte[] bArr) {
        Throwable th;
        byte[] bArr2;
        Exception exc;
        byte[] bArr3;
        KeyPair.ASN1Exception aSN1Exception;
        byte[] bArr4;
        byte[] bArr5;
        String str;
        String str2;
        SCrypt sCrypt;
        KeyPair.ASN1 asn1;
        byte[] bArr6;
        byte[] bArr7 = 1;
        if (!r()) {
            return true;
        }
        if (bArr == null) {
            return !r();
        }
        byte[] bArr8 = null;
        try {
            try {
                KeyPair.ASN1 asn12 = new KeyPair.ASN1(this.j);
                if (!asn12.k()) {
                    throw new KeyPair.ASN1Exception();
                }
                KeyPair.ASN1[] b = asn12.b();
                if (b.length != 2) {
                    throw new KeyPair.ASN1Exception();
                }
                if (!b[0].k()) {
                    throw new KeyPair.ASN1Exception();
                }
                if (!b[1].j()) {
                    throw new KeyPair.ASN1Exception();
                }
                byte[] a = b[1].a();
                try {
                    KeyPair.ASN1[] b2 = b[0].b();
                    if (b2.length != 2) {
                        throw new KeyPair.ASN1Exception();
                    }
                    if (!b2[0].i()) {
                        throw new KeyPair.ASN1Exception();
                    }
                    if (!b2[1].k()) {
                        throw new KeyPair.ASN1Exception();
                    }
                    byte[] a2 = b2[0].a();
                    KeyPair.ASN1 asn13 = b2[1];
                    if (!Util.a(a2, z)) {
                        if (Util.a(a2, Q)) {
                            str = "pbeWithMD2AndDES-CBC unsupported";
                        } else if (Util.a(a2, R)) {
                            str = "pbeWithMD2AndRC2-CBC unsupported";
                        } else if (Util.a(a2, S)) {
                            str = "pbeWithMD5AndDES-CBC unsupported";
                        } else if (Util.a(a2, T)) {
                            str = "pbeWithMD5AndRC2-CBC unsupported";
                        } else if (Util.a(a2, U)) {
                            str = "pbeWithSHA1AndDES-CBC unsupported";
                        } else if (Util.a(a2, V)) {
                            str = "pbeWithSHA1AndRC2-CBC unsupported";
                        } else {
                            str = "unsupported encryption oid: " + Util.y(a2);
                        }
                        throw new JSchException(str);
                    }
                    KeyPair.ASN1[] b3 = asn13.b();
                    if (b3.length != 2) {
                        throw new KeyPair.ASN1Exception();
                    }
                    KeyPair.ASN1 asn14 = b3[0];
                    KeyPair.ASN1 asn15 = b3[1];
                    if (!asn14.k()) {
                        throw new KeyPair.ASN1Exception();
                    }
                    if (!asn15.k()) {
                        throw new KeyPair.ASN1Exception();
                    }
                    KeyPair.ASN1[] b4 = asn15.b();
                    if (b4.length != 2) {
                        throw new KeyPair.ASN1Exception();
                    }
                    if (!b4[0].i()) {
                        throw new KeyPair.ASN1Exception();
                    }
                    byte[] a3 = b4[0].a();
                    KeyPair.ASN1 asn16 = b4[1];
                    KeyPair.ASN1[] b5 = asn14.b();
                    if (b5.length != 2) {
                        throw new KeyPair.ASN1Exception();
                    }
                    if (!b5[0].i()) {
                        throw new KeyPair.ASN1Exception();
                    }
                    if (!b5[1].k()) {
                        throw new KeyPair.ASN1Exception();
                    }
                    byte[] a4 = b5[0].a();
                    if (Util.a(a4, A)) {
                        KeyPair.ASN1 asn17 = b5[1];
                        if (!asn17.k()) {
                            throw new KeyPair.ASN1Exception();
                        }
                        KeyPair.ASN1[] b6 = asn17.b();
                        if (b6.length < 2 || b6.length > 4) {
                            throw new KeyPair.ASN1Exception();
                        }
                        if (!b6[0].j()) {
                            throw new KeyPair.ASN1Exception();
                        }
                        if (!b6[1].g()) {
                            throw new KeyPair.ASN1Exception();
                        }
                        if (b6.length != 4) {
                            if (b6.length == 3) {
                                if (b6[2].k()) {
                                    asn1 = b6[2];
                                } else if (!b6[2].g()) {
                                    throw new KeyPair.ASN1Exception();
                                }
                            }
                            asn1 = null;
                        } else {
                            if (!b6[2].g()) {
                                throw new KeyPair.ASN1Exception();
                            }
                            if (!b6[3].k()) {
                                throw new KeyPair.ASN1Exception();
                            }
                            asn1 = b6[3];
                        }
                        byte[] a5 = b6[0].a();
                        int L2 = L(b6[1].a());
                        if (asn1 != null) {
                            KeyPair.ASN1[] b7 = asn1.b();
                            if (b7.length != 2) {
                                throw new KeyPair.ASN1Exception();
                            }
                            if (!b7[0].i()) {
                                throw new KeyPair.ASN1Exception();
                            }
                            if (!b7[1].h()) {
                                throw new KeyPair.ASN1Exception();
                            }
                            bArr6 = b7[0].a();
                        } else {
                            bArr6 = null;
                        }
                        str2 = J(bArr6);
                        PBKDF2 I2 = I(str2);
                        I2.a(a5, L2);
                        sCrypt = I2;
                    } else {
                        if (!Util.a(a4, B)) {
                            throw new JSchException("unsupported kdf oid: " + Util.y(a4));
                        }
                        KeyPair.ASN1[] b8 = b5[1].b();
                        if (b8.length < 4 || b8.length > 5) {
                            throw new KeyPair.ASN1Exception();
                        }
                        if (!b8[0].j()) {
                            throw new KeyPair.ASN1Exception();
                        }
                        if (!b8[1].g()) {
                            throw new KeyPair.ASN1Exception();
                        }
                        if (!b8[2].g()) {
                            throw new KeyPair.ASN1Exception();
                        }
                        if (!b8[3].g()) {
                            throw new KeyPair.ASN1Exception();
                        }
                        if (b8.length > 4 && !b8[4].g()) {
                            throw new KeyPair.ASN1Exception();
                        }
                        byte[] a6 = b8[0].a();
                        int L3 = L(b8[1].a());
                        int L4 = L(b8[2].a());
                        int L5 = L(b8[3].a());
                        SCrypt K2 = K();
                        K2.d(a6, L3, L4, L5);
                        str2 = "scrypt";
                        sCrypt = K2;
                    }
                    byte[][] bArr9 = new byte[1][];
                    Cipher H2 = H(a3, asn16, bArr9);
                    byte[] bArr10 = bArr9[0];
                    byte[] c = sCrypt.c(bArr, H2.d());
                    try {
                        if (c == null) {
                            throw new JSchException("failed to generate key from KDF " + str2);
                        }
                        H2.k(1, c, bArr10);
                        bArr2 = new byte[a.length];
                        try {
                            H2.a(a, 0, a.length, bArr2, 0);
                            if (!y(bArr2)) {
                                throw new JSchException("failed to parse decrypted key");
                            }
                            this.i = false;
                            Util.g(this.j);
                            Util.g(a);
                            Util.g(c);
                            Util.g(bArr2);
                            return true;
                        } catch (KeyPair.ASN1Exception e) {
                            bArr4 = c;
                            aSN1Exception = e;
                            bArr8 = a;
                            if (this.c.a().isEnabled(3)) {
                                this.c.a().b(3, "PKCS8: failed to decrypt key: ASN1 parsing error", aSN1Exception);
                            }
                            Util.g(bArr8);
                            Util.g(bArr4);
                            Util.g(bArr2);
                            return false;
                        } catch (Exception e2) {
                            bArr3 = c;
                            exc = e2;
                            bArr8 = a;
                            if (this.c.a().isEnabled(3)) {
                                this.c.a().b(3, "PKCS8: failed to decrypt key: " + exc.getMessage(), exc);
                            }
                            Util.g(bArr8);
                            Util.g(bArr3);
                            Util.g(bArr2);
                            return false;
                        } catch (Throwable th2) {
                            bArr5 = c;
                            th = th2;
                            bArr8 = a;
                            bArr7 = bArr5;
                            Util.g(bArr8);
                            Util.g(bArr7);
                            Util.g(bArr2);
                            throw th;
                        }
                    } catch (KeyPair.ASN1Exception e3) {
                        bArr4 = c;
                        aSN1Exception = e3;
                        bArr2 = null;
                    } catch (Exception e4) {
                        bArr3 = c;
                        exc = e4;
                        bArr2 = null;
                    } catch (Throwable th3) {
                        bArr5 = c;
                        th = th3;
                        bArr2 = null;
                    }
                } catch (KeyPair.ASN1Exception e5) {
                    aSN1Exception = e5;
                    bArr4 = null;
                    bArr2 = null;
                } catch (Exception e6) {
                    exc = e6;
                    bArr3 = null;
                    bArr2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    bArr5 = null;
                    bArr2 = null;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (KeyPair.ASN1Exception e7) {
            aSN1Exception = e7;
            bArr4 = null;
            bArr2 = null;
        } catch (Exception e8) {
            exc = e8;
            bArr3 = null;
            bArr2 = null;
        } catch (Throwable th6) {
            th = th6;
            bArr7 = 0;
            bArr2 = null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] g() throws JSchException {
        return this.q.g();
    }

    @Override // com.jcraft.jsch.KeyPair
    byte[] l() {
        KeyPair keyPair = this.q;
        return keyPair != null ? keyPair.l() : new byte[0];
    }

    @Override // com.jcraft.jsch.KeyPair
    byte[] n() {
        return null;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] o() {
        KeyPair keyPair = this.q;
        return keyPair != null ? keyPair.o() : super.o();
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] p(byte[] bArr) {
        return this.q.p(bArr);
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] q(byte[] bArr, String str) {
        return this.q.q(bArr, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x052e A[Catch: all -> 0x0511, TRY_LEAVE, TryCatch #20 {all -> 0x0511, blocks: (B:119:0x04e6, B:121:0x04f2, B:109:0x0522, B:111:0x052e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04f2 A[Catch: all -> 0x0511, TRY_LEAVE, TryCatch #20 {all -> 0x0511, blocks: (B:119:0x04e6, B:121:0x04f2, B:109:0x0522, B:111:0x052e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0553  */
    @Override // com.jcraft.jsch.KeyPair
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean y(byte[] r19) {
        /*
            Method dump skipped, instructions count: 1367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.KeyPairPKCS8.y(byte[]):boolean");
    }
}
