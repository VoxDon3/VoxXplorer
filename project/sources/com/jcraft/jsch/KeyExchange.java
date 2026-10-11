package com.jcraft.jsch;

import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public abstract class KeyExchange {
    static final String[] l = {"KEX algorithms", "host key algorithms", "ciphers c2s", "ciphers s2c", "MACs c2s", "MACs s2c", "compression c2s", "compression s2c", "languages c2s", "languages s2c"};
    static String m = "diffie-hellman-group1-sha1";
    static String n = "ssh-rsa,ssh-dss";
    static String o = "blowfish-cbc";
    static String p = "blowfish-cbc";
    static String q = "hmac-md5";
    static String r = "hmac-md5";
    static String s = HttpUrl.FRAGMENT_ENCODE_SET;
    static String t = HttpUrl.FRAGMENT_ENCODE_SET;
    protected Session a = null;
    protected HASH b = null;
    protected byte[] c = null;
    protected byte[] d = null;
    protected byte[] e = null;
    protected final int f = 0;
    protected final int g = 1;
    protected final int h = 2;
    protected final int i = 3;
    private int j = 0;
    private String k = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
    
        if (r11 != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fe, code lost:
    
        r3[r5] = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
    
        r5 = r5 + 1;
        r2 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0105, code lost:
    
        if (r3[r5] == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0119, code lost:
    
        throw new com.jcraft.jsch.JSchAlgoNegoFailException(r5, com.jcraft.jsch.Util.c(r10), com.jcraft.jsch.Util.c(r7));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static java.lang.String[] l(com.jcraft.jsch.Session r16, byte[] r17, byte[] r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.KeyExchange.l(com.jcraft.jsch.Session, byte[], byte[]):java.lang.String[]");
    }

    void a() {
        Util.g(this.c);
        this.c = null;
    }

    void b(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        this.a = session;
        m(session, bArr, bArr2, bArr3, bArr4);
    }

    protected byte[] c(byte[] bArr) {
        int i = (bArr[0] & 128) >>> 7;
        int length = bArr.length + i;
        byte[] bArr2 = new byte[length + 4];
        byte[] bArr3 = new byte[i ^ 1];
        bArr2[0] = (byte) (length >>> 24);
        bArr2[1] = (byte) (length >>> 16);
        bArr2[2] = (byte) (length >>> 8);
        bArr2[3] = (byte) length;
        System.arraycopy(bArr, 0, bArr2, i + 4, length - i);
        Util.g(bArr);
        return bArr2;
    }

    public String d() {
        HASH hash = null;
        try {
            hash = (HASH) Class.forName(this.a.w(this.a.w("FingerprintHash").toLowerCase(Locale.ROOT))).asSubclass(HASH.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            if (this.a.A().isEnabled(3)) {
                this.a.A().b(3, "getFingerPrint: " + e.getMessage(), e);
            }
        }
        return Util.m(hash, g(), true, false);
    }

    byte[] e() {
        return this.d;
    }

    HASH f() {
        return this.b;
    }

    byte[] g() {
        return this.e;
    }

    byte[] h() {
        return this.c;
    }

    public String i() {
        return this.k;
    }

    public String j() {
        int i = this.j;
        return i == 1 ? "DSA" : i == 0 ? "RSA" : i == 3 ? "EDDSA" : "ECDSA";
    }

    public abstract int k();

    public abstract void m(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception;

    public abstract boolean n(Buffer buffer) throws Exception;

    protected byte[] o(byte[] bArr) {
        int length = bArr.length;
        if (length < 2) {
            return bArr;
        }
        int i = bArr[0] & 255;
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            i2 |= (i >>> i3) & 1;
        }
        int i4 = i2 ^ 1;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            int i7 = bArr[i6];
            i4 &= ((i7 & 128) >>> 7) ^ 1;
            i5 += i4;
            int i8 = i7 & 127;
            for (int i9 = 0; i9 < 7; i9++) {
                i4 &= ((i8 >>> i9) & 1) ^ 1;
            }
        }
        int i10 = length - i5;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, new byte[i5], 0, i5);
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        Util.g(bArr);
        return bArr2;
    }

    protected boolean p(String str, byte[] bArr, int i, byte[] bArr2) throws Exception {
        if (str.equals("ssh-rsa")) {
            this.j = 0;
            this.k = str;
            int i2 = i + 3;
            int i3 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216)) | ((bArr[i + 2] << 8) & 65280);
            int i4 = i + 4;
            int i5 = i3 | (bArr[i2] & 255);
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr, i4, bArr3, 0, i5);
            int i6 = i4 + i5;
            int i7 = ((bArr[i6 + 1] << 16) & 16711680) | ((-16777216) & (bArr[i6] << 24)) | (65280 & (bArr[i6 + 2] << 8)) | (bArr[i6 + 3] & 255);
            byte[] bArr4 = new byte[i7];
            System.arraycopy(bArr, i6 + 4, bArr4, 0, i7);
            String c = Util.c(new Buffer(bArr2).p());
            try {
                SignatureRSA signatureRSA = (SignatureRSA) Class.forName(this.a.w(c)).asSubclass(SignatureRSA.class).getDeclaredConstructor(null).newInstance(null);
                signatureRSA.e();
                signatureRSA.b(bArr3, bArr4);
                signatureRSA.f(this.d);
                boolean d = signatureRSA.d(bArr2);
                if (this.a.A().isEnabled(1)) {
                    this.a.A().a(1, "ssh_rsa_verify: " + c + " signature " + d);
                }
                return d;
            } catch (Exception e) {
                throw new JSchException(e.toString(), e);
            }
        }
        if (str.equals("ssh-dss")) {
            this.j = 1;
            this.k = str;
            int i8 = i + 3;
            int i9 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216)) | ((bArr[i + 2] << 8) & 65280);
            int i10 = i + 4;
            int i11 = i9 | (bArr[i8] & 255);
            byte[] bArr5 = new byte[i11];
            System.arraycopy(bArr, i10, bArr5, 0, i11);
            int i12 = i10 + i11;
            int i13 = i12 + 3;
            int i14 = ((bArr[i12 + 1] << 16) & 16711680) | ((bArr[i12] << 24) & (-16777216)) | ((bArr[i12 + 2] << 8) & 65280);
            int i15 = i12 + 4;
            int i16 = i14 | (bArr[i13] & 255);
            byte[] bArr6 = new byte[i16];
            System.arraycopy(bArr, i15, bArr6, 0, i16);
            int i17 = i15 + i16;
            int i18 = i17 + 3;
            int i19 = ((bArr[i17 + 1] << 16) & 16711680) | ((bArr[i17] << 24) & (-16777216)) | ((bArr[i17 + 2] << 8) & 65280);
            int i20 = i17 + 4;
            int i21 = i19 | (bArr[i18] & 255);
            byte[] bArr7 = new byte[i21];
            System.arraycopy(bArr, i20, bArr7, 0, i21);
            int i22 = i20 + i21;
            int i23 = ((bArr[i22 + 1] << 16) & 16711680) | ((-16777216) & (bArr[i22] << 24)) | (65280 & (bArr[i22 + 2] << 8)) | (bArr[i22 + 3] & 255);
            byte[] bArr8 = new byte[i23];
            System.arraycopy(bArr, i22 + 4, bArr8, 0, i23);
            try {
                SignatureDSA signatureDSA = (SignatureDSA) Class.forName(this.a.w("signature.dss")).asSubclass(SignatureDSA.class).getDeclaredConstructor(null).newInstance(null);
                signatureDSA.e();
                signatureDSA.h(bArr8, bArr5, bArr6, bArr7);
                signatureDSA.f(this.d);
                boolean d2 = signatureDSA.d(bArr2);
                if (this.a.A().isEnabled(1)) {
                    this.a.A().a(1, "ssh_dss_verify: signature " + d2);
                }
                return d2;
            } catch (Exception e2) {
                throw new JSchException(e2.toString(), e2);
            }
        }
        if (!str.equals("ecdsa-sha2-nistp256") && !str.equals("ecdsa-sha2-nistp384") && !str.equals("ecdsa-sha2-nistp521")) {
            if (!str.equals("ssh-ed25519") && !str.equals("ssh-ed448")) {
                if (this.a.A().isEnabled(3)) {
                    this.a.A().a(3, "unknown alg: " + str);
                }
                return false;
            }
            this.j = 3;
            this.k = str;
            int i24 = ((bArr[i + 1] << 16) & 16711680) | ((-16777216) & (bArr[i] << 24)) | (65280 & (bArr[i + 2] << 8)) | (bArr[i + 3] & 255);
            byte[] bArr9 = new byte[i24];
            System.arraycopy(bArr, i + 4, bArr9, 0, i24);
            try {
                SignatureEdDSA signatureEdDSA = (SignatureEdDSA) Class.forName(this.a.w(str)).asSubclass(SignatureEdDSA.class).getDeclaredConstructor(null).newInstance(null);
                signatureEdDSA.e();
                signatureEdDSA.i(bArr9);
                signatureEdDSA.f(this.d);
                boolean d3 = signatureEdDSA.d(bArr2);
                if (this.a.A().isEnabled(1)) {
                    this.a.A().a(1, "ssh_eddsa_verify: " + str + " signature " + d3);
                }
                return d3;
            } catch (Exception | NoClassDefFoundError e3) {
                throw new JSchException(e3.toString(), e3);
            }
        }
        this.j = 2;
        this.k = str;
        int i25 = i + 3;
        int i26 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216)) | ((bArr[i + 2] << 8) & 65280);
        int i27 = i + 4;
        int i28 = i26 | (bArr[i25] & 255);
        System.arraycopy(bArr, i27, new byte[i28], 0, i28);
        int i29 = i27 + i28;
        int i30 = (65280 & (bArr[i29 + 2] << 8)) | (16711680 & (bArr[i29 + 1] << 16)) | ((-16777216) & (bArr[i29] << 24)) | (bArr[i29 + 3] & 255);
        int i31 = i29 + 5;
        int i32 = (i30 - 1) / 2;
        byte[] bArr10 = new byte[i32];
        System.arraycopy(bArr, i31, bArr10, 0, i32);
        byte[] bArr11 = new byte[i32];
        System.arraycopy(bArr, i31 + i32, bArr11, 0, i32);
        try {
            SignatureECDSA signatureECDSA = (SignatureECDSA) Class.forName(this.a.w(str)).asSubclass(SignatureECDSA.class).getDeclaredConstructor(null).newInstance(null);
            signatureECDSA.e();
            signatureECDSA.b(bArr10, bArr11);
            signatureECDSA.f(this.d);
            boolean d4 = signatureECDSA.d(bArr2);
            if (this.a.A().isEnabled(1)) {
                this.a.A().a(1, "ssh_ecdsa_verify: " + str + " signature " + d4);
            }
            return d4;
        } catch (Exception e4) {
            throw new JSchException(e4.toString(), e4);
        }
    }
}
