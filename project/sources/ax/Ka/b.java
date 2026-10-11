package ax.Ka;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.impl.auth.NTLMEngine;
import org.apache.http.impl.auth.NTLMEngineException;
import org.apache.http.util.EncodingUtils;

/* loaded from: classes3.dex */
final class b implements NTLMEngine {
    private static final SecureRandom b;
    private static final byte[] c;
    private String a = "ASCII";

    /* renamed from: ax.Ka.b$b, reason: collision with other inner class name */
    static class C0114b {
        protected byte[] a;
        protected byte[] b;
        protected MessageDigest c;

        C0114b(byte[] bArr) throws NTLMEngineException {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                this.c = messageDigest;
                this.a = new byte[64];
                this.b = new byte[64];
                int length = bArr.length;
                if (length > 64) {
                    messageDigest.update(bArr);
                    bArr = this.c.digest();
                    length = bArr.length;
                }
                int i = 0;
                while (i < length) {
                    this.a[i] = (byte) (54 ^ bArr[i]);
                    this.b[i] = (byte) (92 ^ bArr[i]);
                    i++;
                }
                while (i < 64) {
                    this.a[i] = 54;
                    this.b[i] = 92;
                    i++;
                }
                this.c.reset();
                this.c.update(this.a);
            } catch (Exception e) {
                throw new NTLMEngineException("Error getting md5 message digest implementation: " + e.getMessage(), e);
            }
        }

        byte[] a() {
            byte[] digest = this.c.digest();
            this.c.update(this.b);
            return this.c.digest(digest);
        }

        void b(byte[] bArr) {
            this.c.update(bArr);
        }
    }

    static class c {
        protected int a = 1732584193;
        protected int b = -271733879;
        protected int c = -1732584194;
        protected int d = 271733878;
        protected long e = 0;
        protected byte[] f = new byte[64];

        c() {
        }

        byte[] a() {
            int i = (int) (this.e & 63);
            int i2 = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[i2 + 8];
            bArr[0] = Byte.MIN_VALUE;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((this.e * 8) >>> (i3 * 8));
            }
            f(bArr);
            byte[] bArr2 = new byte[16];
            b.P(bArr2, this.a, 0);
            b.P(bArr2, this.b, 4);
            b.P(bArr2, this.c, 8);
            b.P(bArr2, this.d, 12);
            return bArr2;
        }

        protected void b() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                byte[] bArr = this.f;
                int i2 = i * 4;
                iArr[i] = (bArr[i2] & 255) + ((bArr[i2 + 1] & 255) << 8) + ((bArr[i2 + 2] & 255) << 16) + ((bArr[i2 + 3] & 255) << 24);
            }
            int i3 = this.a;
            int i4 = this.b;
            int i5 = this.c;
            int i6 = this.d;
            c(iArr);
            d(iArr);
            e(iArr);
            this.a += i3;
            this.b += i4;
            this.c += i5;
            this.d += i6;
        }

        protected void c(int[] iArr) {
            int N = b.N(this.a + b.a(this.b, this.c, this.d) + iArr[0], 3);
            this.a = N;
            int N2 = b.N(this.d + b.a(N, this.b, this.c) + iArr[1], 7);
            this.d = N2;
            int N3 = b.N(this.c + b.a(N2, this.a, this.b) + iArr[2], 11);
            this.c = N3;
            int N4 = b.N(this.b + b.a(N3, this.d, this.a) + iArr[3], 19);
            this.b = N4;
            int N5 = b.N(this.a + b.a(N4, this.c, this.d) + iArr[4], 3);
            this.a = N5;
            int N6 = b.N(this.d + b.a(N5, this.b, this.c) + iArr[5], 7);
            this.d = N6;
            int N7 = b.N(this.c + b.a(N6, this.a, this.b) + iArr[6], 11);
            this.c = N7;
            int N8 = b.N(this.b + b.a(N7, this.d, this.a) + iArr[7], 19);
            this.b = N8;
            int N9 = b.N(this.a + b.a(N8, this.c, this.d) + iArr[8], 3);
            this.a = N9;
            int N10 = b.N(this.d + b.a(N9, this.b, this.c) + iArr[9], 7);
            this.d = N10;
            int N11 = b.N(this.c + b.a(N10, this.a, this.b) + iArr[10], 11);
            this.c = N11;
            int N12 = b.N(this.b + b.a(N11, this.d, this.a) + iArr[11], 19);
            this.b = N12;
            int N13 = b.N(this.a + b.a(N12, this.c, this.d) + iArr[12], 3);
            this.a = N13;
            int N14 = b.N(this.d + b.a(N13, this.b, this.c) + iArr[13], 7);
            this.d = N14;
            int N15 = b.N(this.c + b.a(N14, this.a, this.b) + iArr[14], 11);
            this.c = N15;
            this.b = b.N(this.b + b.a(N15, this.d, this.a) + iArr[15], 19);
        }

        protected void d(int[] iArr) {
            int N = b.N(this.a + b.b(this.b, this.c, this.d) + iArr[0] + 1518500249, 3);
            this.a = N;
            int N2 = b.N(this.d + b.b(N, this.b, this.c) + iArr[4] + 1518500249, 5);
            this.d = N2;
            int N3 = b.N(this.c + b.b(N2, this.a, this.b) + iArr[8] + 1518500249, 9);
            this.c = N3;
            int N4 = b.N(this.b + b.b(N3, this.d, this.a) + iArr[12] + 1518500249, 13);
            this.b = N4;
            int N5 = b.N(this.a + b.b(N4, this.c, this.d) + iArr[1] + 1518500249, 3);
            this.a = N5;
            int N6 = b.N(this.d + b.b(N5, this.b, this.c) + iArr[5] + 1518500249, 5);
            this.d = N6;
            int N7 = b.N(this.c + b.b(N6, this.a, this.b) + iArr[9] + 1518500249, 9);
            this.c = N7;
            int N8 = b.N(this.b + b.b(N7, this.d, this.a) + iArr[13] + 1518500249, 13);
            this.b = N8;
            int N9 = b.N(this.a + b.b(N8, this.c, this.d) + iArr[2] + 1518500249, 3);
            this.a = N9;
            int N10 = b.N(this.d + b.b(N9, this.b, this.c) + iArr[6] + 1518500249, 5);
            this.d = N10;
            int N11 = b.N(this.c + b.b(N10, this.a, this.b) + iArr[10] + 1518500249, 9);
            this.c = N11;
            int N12 = b.N(this.b + b.b(N11, this.d, this.a) + iArr[14] + 1518500249, 13);
            this.b = N12;
            int N13 = b.N(this.a + b.b(N12, this.c, this.d) + iArr[3] + 1518500249, 3);
            this.a = N13;
            int N14 = b.N(this.d + b.b(N13, this.b, this.c) + iArr[7] + 1518500249, 5);
            this.d = N14;
            int N15 = b.N(this.c + b.b(N14, this.a, this.b) + iArr[11] + 1518500249, 9);
            this.c = N15;
            this.b = b.N(this.b + b.b(N15, this.d, this.a) + iArr[15] + 1518500249, 13);
        }

        protected void e(int[] iArr) {
            int N = b.N(this.a + b.c(this.b, this.c, this.d) + iArr[0] + 1859775393, 3);
            this.a = N;
            int N2 = b.N(this.d + b.c(N, this.b, this.c) + iArr[8] + 1859775393, 9);
            this.d = N2;
            int N3 = b.N(this.c + b.c(N2, this.a, this.b) + iArr[4] + 1859775393, 11);
            this.c = N3;
            int N4 = b.N(this.b + b.c(N3, this.d, this.a) + iArr[12] + 1859775393, 15);
            this.b = N4;
            int N5 = b.N(this.a + b.c(N4, this.c, this.d) + iArr[2] + 1859775393, 3);
            this.a = N5;
            int N6 = b.N(this.d + b.c(N5, this.b, this.c) + iArr[10] + 1859775393, 9);
            this.d = N6;
            int N7 = b.N(this.c + b.c(N6, this.a, this.b) + iArr[6] + 1859775393, 11);
            this.c = N7;
            int N8 = b.N(this.b + b.c(N7, this.d, this.a) + iArr[14] + 1859775393, 15);
            this.b = N8;
            int N9 = b.N(this.a + b.c(N8, this.c, this.d) + iArr[1] + 1859775393, 3);
            this.a = N9;
            int N10 = b.N(this.d + b.c(N9, this.b, this.c) + iArr[9] + 1859775393, 9);
            this.d = N10;
            int N11 = b.N(this.c + b.c(N10, this.a, this.b) + iArr[5] + 1859775393, 11);
            this.c = N11;
            int N12 = b.N(this.b + b.c(N11, this.d, this.a) + iArr[13] + 1859775393, 15);
            this.b = N12;
            int N13 = b.N(this.a + b.c(N12, this.c, this.d) + iArr[3] + 1859775393, 3);
            this.a = N13;
            int N14 = b.N(this.d + b.c(N13, this.b, this.c) + iArr[11] + 1859775393, 9);
            this.d = N14;
            int N15 = b.N(this.c + b.c(N14, this.a, this.b) + iArr[7] + 1859775393, 11);
            this.c = N15;
            this.b = b.N(this.b + b.c(N15, this.d, this.a) + iArr[15] + 1859775393, 15);
        }

        void f(byte[] bArr) {
            byte[] bArr2;
            int i = (int) (this.e & 63);
            int i2 = 0;
            while (true) {
                int length = (bArr.length - i2) + i;
                bArr2 = this.f;
                if (length < bArr2.length) {
                    break;
                }
                int length2 = bArr2.length - i;
                System.arraycopy(bArr, i2, bArr2, i, length2);
                this.e += length2;
                i2 += length2;
                b();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length3 = bArr.length - i2;
                System.arraycopy(bArr, i2, bArr2, i, length3);
                this.e += length3;
            }
        }
    }

    static class e extends d {
        protected byte[] c;
        protected byte[] d;

        e(String str, String str2) throws NTLMEngineException {
            try {
                String u = b.u(str2);
                String t = b.t(str);
                this.c = u != null ? u.getBytes("ASCII") : null;
                this.d = t != null ? t.toUpperCase(Locale.ENGLISH).getBytes("ASCII") : null;
            } catch (UnsupportedEncodingException e) {
                throw new NTLMEngineException("Unicode unsupported: " + e.getMessage(), e);
            }
        }

        @Override // ax.Ka.b.d
        String f() {
            g(40, 1);
            c(-1576500735);
            d(0);
            d(0);
            c(40);
            d(0);
            d(0);
            c(40);
            d(261);
            c(2600);
            d(3840);
            return super.f();
        }
    }

    static class f extends d {
        protected byte[] c;
        protected String d;
        protected byte[] e;
        protected int f;

        f(String str) throws NTLMEngineException {
            super(str, 2);
            byte[] bArr = new byte[8];
            this.c = bArr;
            h(bArr, 24);
            int j = j(20);
            this.f = j;
            if ((j & 1) == 0) {
                throw new NTLMEngineException("NTLM type 2 message indicates no support for Unicode. Flags are: " + Integer.toString(this.f));
            }
            this.d = null;
            if (e() >= 20) {
                byte[] i = i(12);
                if (i.length != 0) {
                    try {
                        this.d = new String(i, "UnicodeLittleUnmarked");
                    } catch (UnsupportedEncodingException e) {
                        throw new NTLMEngineException(e.getMessage(), e);
                    }
                }
            }
            this.e = null;
            if (e() >= 48) {
                byte[] i2 = i(40);
                if (i2.length != 0) {
                    this.e = i2;
                }
            }
        }

        byte[] k() {
            return this.c;
        }

        int l() {
            return this.f;
        }

        String m() {
            return this.d;
        }

        byte[] n() {
            return this.e;
        }
    }

    static class g extends d {
        protected int c;
        protected byte[] d;
        protected byte[] e;
        protected byte[] f;
        protected byte[] g;
        protected byte[] h;
        protected byte[] i;

        g(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws NTLMEngineException {
            byte[] i2;
            byte[] bytes;
            this.c = i;
            String u = b.u(str2);
            String t = b.t(str);
            a aVar = new a(t, str3, str4, bArr, str5, bArr2);
            try {
                if ((8388608 & i) != 0 && bArr2 != null && str5 != null) {
                    this.h = aVar.q();
                    this.g = aVar.h();
                    i2 = (i & 128) != 0 ? aVar.i() : aVar.r();
                } else if ((524288 & i) != 0) {
                    this.h = aVar.j();
                    this.g = aVar.c();
                    i2 = (i & 128) != 0 ? aVar.i() : aVar.k();
                } else {
                    this.h = aVar.m();
                    this.g = aVar.e();
                    i2 = (i & 128) != 0 ? aVar.i() : aVar.n();
                }
            } catch (NTLMEngineException unused) {
                this.h = new byte[0];
                this.g = aVar.e();
                i2 = (i & 128) != 0 ? aVar.i() : aVar.f();
            }
            if ((i & 16) == 0) {
                this.i = null;
            } else if ((1073741824 & i) != 0) {
                this.i = b.d(aVar.s(), i2);
            } else {
                this.i = i2;
            }
            if (u != null) {
                try {
                    bytes = u.getBytes("UnicodeLittleUnmarked");
                } catch (UnsupportedEncodingException e) {
                    throw new NTLMEngineException("Unicode not supported: " + e.getMessage(), e);
                }
            } else {
                bytes = null;
            }
            this.e = bytes;
            this.d = t != null ? t.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked") : null;
            this.f = str3.getBytes("UnicodeLittleUnmarked");
        }

        @Override // ax.Ka.b.d
        String f() {
            int length = this.h.length;
            int length2 = this.g.length;
            byte[] bArr = this.d;
            int length3 = bArr != null ? bArr.length : 0;
            byte[] bArr2 = this.e;
            int length4 = bArr2 != null ? bArr2.length : 0;
            int length5 = this.f.length;
            byte[] bArr3 = this.i;
            int length6 = bArr3 != null ? bArr3.length : 0;
            int i = length2 + 72;
            int i2 = i + length;
            int i3 = i2 + length3;
            int i4 = i3 + length5;
            int i5 = i4 + length4;
            g(i5 + length6, 3);
            d(length2);
            d(length2);
            c(72);
            d(length);
            d(length);
            c(i);
            d(length3);
            d(length3);
            c(i2);
            d(length5);
            d(length5);
            c(i3);
            d(length4);
            d(length4);
            c(i4);
            d(length6);
            d(length6);
            c(i5);
            int i6 = this.c;
            c((i6 & 4) | (524928 & i6) | 33554432 | (32768 & i6) | (i6 & 32) | (i6 & 16) | (536870912 & i6) | (Integer.MIN_VALUE & i6) | (1073741824 & i6) | (8388608 & i6) | (i6 & 1));
            d(261);
            c(2600);
            d(3840);
            b(this.g);
            b(this.h);
            b(this.d);
            b(this.f);
            b(this.e);
            byte[] bArr4 = this.i;
            if (bArr4 != null) {
                b(bArr4);
            }
            return super.f();
        }
    }

    static {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception unused) {
            secureRandom = null;
        }
        b = secureRandom;
        byte[] bytes = EncodingUtils.getBytes("NTLMSSP", "ASCII");
        byte[] bArr = new byte[bytes.length + 1];
        c = bArr;
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 0;
    }

    b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] A(String str) throws NTLMEngineException {
        try {
            byte[] bytes = str.toUpperCase(Locale.ENGLISH).getBytes("US-ASCII");
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key w = w(bArr, 0);
            Key w2 = w(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes("US-ASCII");
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, w);
            byte[] doFinal = cipher.doFinal(bytes2);
            cipher.init(1, w2);
            byte[] doFinal2 = cipher.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            System.arraycopy(doFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e2) {
            throw new NTLMEngineException(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] B(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key w = w(bArr3, 0);
            Key w2 = w(bArr3, 7);
            Key w3 = w(bArr3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, w);
            byte[] doFinal = cipher.doFinal(bArr2);
            cipher.init(1, w2);
            byte[] doFinal2 = cipher.doFinal(bArr2);
            cipher.init(1, w3);
            byte[] doFinal3 = cipher.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(doFinal, 0, bArr4, 0, 8);
            System.arraycopy(doFinal2, 0, bArr4, 8, 8);
            System.arraycopy(doFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e2) {
            throw new NTLMEngineException(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] C(String str, String str2, byte[] bArr) throws NTLMEngineException {
        try {
            C0114b c0114b = new C0114b(bArr);
            Locale locale = Locale.ENGLISH;
            c0114b.b(str2.toUpperCase(locale).getBytes("UnicodeLittleUnmarked"));
            if (str != null) {
                c0114b.b(str.toUpperCase(locale).getBytes("UnicodeLittleUnmarked"));
            }
            return c0114b.a();
        } catch (UnsupportedEncodingException e2) {
            throw new NTLMEngineException("Unicode not supported! " + e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] D(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NTLMEngineException {
        C0114b c0114b = new C0114b(bArr);
        c0114b.b(bArr2);
        c0114b.b(bArr3);
        byte[] a2 = c0114b.a();
        byte[] bArr4 = new byte[a2.length + bArr3.length];
        System.arraycopy(a2, 0, bArr4, 0, a2.length);
        System.arraycopy(bArr3, 0, bArr4, a2.length, bArr3.length);
        return bArr4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] E() throws NTLMEngineException {
        SecureRandom secureRandom = b;
        if (secureRandom == null) {
            throw new NTLMEngineException("Random generator not available");
        }
        byte[] bArr = new byte[8];
        synchronized (secureRandom) {
            secureRandom.nextBytes(bArr);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] F() throws NTLMEngineException {
        SecureRandom secureRandom = b;
        if (secureRandom == null) {
            throw new NTLMEngineException("Random generator not available");
        }
        byte[] bArr = new byte[16];
        synchronized (secureRandom) {
            secureRandom.nextBytes(bArr);
        }
        return bArr;
    }

    static byte[] G(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NTLMEngineException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr2);
            messageDigest.update(bArr3);
            byte[] digest = messageDigest.digest();
            byte[] bArr4 = new byte[8];
            System.arraycopy(digest, 0, bArr4, 0, 8);
            return B(bArr, bArr4);
        } catch (Exception e2) {
            if (e2 instanceof NTLMEngineException) {
                throw ((NTLMEngineException) e2);
            }
            throw new NTLMEngineException(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] H(String str) throws NTLMEngineException {
        try {
            byte[] bytes = str.getBytes("UnicodeLittleUnmarked");
            c cVar = new c();
            cVar.f(bytes);
            return cVar.a();
        } catch (UnsupportedEncodingException e2) {
            throw new NTLMEngineException("Unicode not supported: " + e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] I(String str, String str2, byte[] bArr) throws NTLMEngineException {
        try {
            C0114b c0114b = new C0114b(bArr);
            c0114b.b(str2.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            if (str != null) {
                c0114b.b(str.getBytes("UnicodeLittleUnmarked"));
            }
            return c0114b.a();
        } catch (UnsupportedEncodingException e2) {
            throw new NTLMEngineException("Unicode not supported! " + e2.getMessage(), e2);
        }
    }

    private static void J(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            if (((((((((b2 >>> 7) ^ (b2 >>> 6)) ^ (b2 >>> 5)) ^ (b2 >>> 4)) ^ (b2 >>> 3)) ^ (b2 >>> 2)) ^ (b2 >>> 1)) & 1) == 0) {
                bArr[i] = (byte) (b2 | 1);
            } else {
                bArr[i] = (byte) (b2 & (-2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] K(byte[] bArr, int i) throws NTLMEngineException {
        int M = M(bArr, i);
        int L = L(bArr, i + 4);
        if (bArr.length < L + M) {
            throw new NTLMEngineException("NTLM authentication - buffer too small for data item");
        }
        byte[] bArr2 = new byte[M];
        System.arraycopy(bArr, L, bArr2, 0, M);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L(byte[] bArr, int i) throws NTLMEngineException {
        if (bArr.length < i + 4) {
            throw new NTLMEngineException("NTLM authentication - buffer too small for DWORD");
        }
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static int M(byte[] bArr, int i) throws NTLMEngineException {
        if (bArr.length < i + 2) {
            throw new NTLMEngineException("NTLM authentication - buffer too small for WORD");
        }
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    static int N(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private static String O(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(".");
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    static void P(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    static int a(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    static int b(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    static int c(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    static byte[] d(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr2, "RC4"));
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            throw new NTLMEngineException(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(String str) {
        return O(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(String str) {
        return O(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] v(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr3.length + 20 + bArr2.length + 4];
        System.arraycopy(new byte[]{1, 1, 0, 0}, 0, bArr4, 0, 4);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, 4, 4);
        System.arraycopy(bArr3, 0, bArr4, 8, bArr3.length);
        int length = bArr3.length;
        System.arraycopy(bArr, 0, bArr4, 8 + length, 8);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, length + 16, 4);
        int i = length + 20;
        System.arraycopy(bArr2, 0, bArr4, i, bArr2.length);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, i + bArr2.length, 4);
        return bArr4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Key w(byte[] bArr, int i) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i, bArr2, 0, 7);
        byte b2 = bArr2[0];
        byte b3 = bArr2[1];
        byte b4 = bArr2[2];
        byte b5 = bArr2[3];
        byte b6 = bArr2[4];
        byte b7 = bArr2[5];
        byte b8 = bArr2[6];
        byte[] bArr3 = {b2, (byte) ((b2 << 7) | ((b3 & 255) >>> 1)), (byte) ((b3 << 6) | ((b4 & 255) >>> 2)), (byte) ((b4 << 5) | ((b5 & 255) >>> 3)), (byte) ((b5 << 4) | ((b6 & 255) >>> 4)), (byte) (((b7 & 255) >>> 5) | (b6 << 3)), (byte) ((b7 << 2) | ((b8 & 255) >>> 6)), (byte) (b8 << 1)};
        J(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    static byte[] z(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        C0114b c0114b = new C0114b(bArr2);
        c0114b.b(bArr);
        return c0114b.a();
    }

    @Override // org.apache.http.impl.auth.NTLMEngine
    public String generateType1Msg(String str, String str2) throws NTLMEngineException {
        return x(str2, str);
    }

    @Override // org.apache.http.impl.auth.NTLMEngine
    public String generateType3Msg(String str, String str2, String str3, String str4, String str5) throws NTLMEngineException {
        f fVar = new f(str5);
        return y(str, str2, str4, str3, fVar.k(), fVar.l(), fVar.m(), fVar.n());
    }

    String x(String str, String str2) throws NTLMEngineException {
        return new e(str2, str).f();
    }

    String y(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws NTLMEngineException {
        return new g(str4, str3, str, str2, bArr, i, str5, bArr2).f();
    }

    static class d {
        private byte[] a;
        private int b;

        d() {
            this.a = null;
            this.b = 0;
        }

        protected void a(byte b) {
            byte[] bArr = this.a;
            int i = this.b;
            bArr[i] = b;
            this.b = i + 1;
        }

        protected void b(byte[] bArr) {
            if (bArr == null) {
                return;
            }
            for (byte b : bArr) {
                byte[] bArr2 = this.a;
                int i = this.b;
                bArr2[i] = b;
                this.b = i + 1;
            }
        }

        protected void c(int i) {
            a((byte) (i & 255));
            a((byte) ((i >> 8) & 255));
            a((byte) ((i >> 16) & 255));
            a((byte) ((i >> 24) & 255));
        }

        protected void d(int i) {
            a((byte) (i & 255));
            a((byte) ((i >> 8) & 255));
        }

        protected int e() {
            return this.b;
        }

        String f() {
            byte[] bArr = this.a;
            int length = bArr.length;
            int i = this.b;
            if (length > i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                bArr = bArr2;
            }
            return EncodingUtils.getAsciiString(Base64.encodeBase64(bArr));
        }

        protected void g(int i, int i2) {
            this.a = new byte[i];
            this.b = 0;
            b(b.c);
            c(i2);
        }

        protected void h(byte[] bArr, int i) throws NTLMEngineException {
            byte[] bArr2 = this.a;
            if (bArr2.length < bArr.length + i) {
                throw new NTLMEngineException("NTLM: Message too short");
            }
            System.arraycopy(bArr2, i, bArr, 0, bArr.length);
        }

        protected byte[] i(int i) throws NTLMEngineException {
            return b.K(this.a, i);
        }

        protected int j(int i) throws NTLMEngineException {
            return b.L(this.a, i);
        }

        d(String str, int i) throws NTLMEngineException {
            this.a = null;
            this.b = 0;
            byte[] decodeBase64 = Base64.decodeBase64(EncodingUtils.getBytes(str, "ASCII"));
            this.a = decodeBase64;
            if (decodeBase64.length >= b.c.length) {
                for (int i2 = 0; i2 < b.c.length; i2++) {
                    if (this.a[i2] != b.c[i2]) {
                        throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                    }
                }
                int j = j(b.c.length);
                if (j == i) {
                    this.b = this.a.length;
                    return;
                }
                throw new NTLMEngineException("NTLM type " + Integer.toString(i) + " message expected - instead got type " + Integer.toString(j));
            }
            throw new NTLMEngineException("NTLM message decoding error - packet too short");
        }
    }

    protected static class a {
        protected final String a;
        protected final String b;
        protected final String c;
        protected final byte[] d;
        protected final String e;
        protected final byte[] f;
        protected byte[] g;
        protected byte[] h;
        protected byte[] i;
        protected byte[] j;
        protected byte[] k;
        protected byte[] l;
        protected byte[] m;
        protected byte[] n;
        protected byte[] o;
        protected byte[] p;
        protected byte[] q;
        protected byte[] r;
        protected byte[] s;
        protected byte[] t;
        protected byte[] u;
        protected byte[] v;
        protected byte[] w;
        protected byte[] x;
        protected byte[] y;
        protected byte[] z;

        public a(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.a = str;
            this.e = str4;
            this.b = str2;
            this.c = str3;
            this.d = bArr;
            this.f = bArr2;
            this.g = bArr3;
            this.h = bArr4;
            this.i = bArr5;
            this.j = bArr6;
        }

        public byte[] a() throws NTLMEngineException {
            if (this.g == null) {
                this.g = b.E();
            }
            return this.g;
        }

        public byte[] b() throws NTLMEngineException {
            if (this.h == null) {
                this.h = b.E();
            }
            return this.h;
        }

        public byte[] c() throws NTLMEngineException {
            if (this.u == null) {
                byte[] a = a();
                byte[] bArr = new byte[24];
                this.u = bArr;
                System.arraycopy(a, 0, bArr, 0, a.length);
                byte[] bArr2 = this.u;
                Arrays.fill(bArr2, a.length, bArr2.length, (byte) 0);
            }
            return this.u;
        }

        public byte[] d() throws NTLMEngineException {
            if (this.k == null) {
                this.k = b.A(this.c);
            }
            return this.k;
        }

        public byte[] e() throws NTLMEngineException {
            if (this.l == null) {
                this.l = b.B(d(), this.d);
            }
            return this.l;
        }

        public byte[] f() throws NTLMEngineException {
            if (this.v == null) {
                this.v = new byte[16];
                System.arraycopy(d(), 0, this.v, 0, 8);
                Arrays.fill(this.v, 8, 16, (byte) 0);
            }
            return this.v;
        }

        public byte[] g() throws NTLMEngineException {
            if (this.p == null) {
                this.p = b.C(this.a, this.b, l());
            }
            return this.p;
        }

        public byte[] h() throws NTLMEngineException {
            if (this.q == null) {
                this.q = b.D(g(), this.d, a());
            }
            return this.q;
        }

        public byte[] i() throws NTLMEngineException {
            if (this.z == null) {
                try {
                    byte[] bArr = new byte[14];
                    System.arraycopy(d(), 0, bArr, 0, 8);
                    Arrays.fill(bArr, 8, 14, (byte) -67);
                    Key w = b.w(bArr, 0);
                    Key w2 = b.w(bArr, 7);
                    byte[] bArr2 = new byte[8];
                    System.arraycopy(e(), 0, bArr2, 0, 8);
                    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher.init(1, w);
                    byte[] doFinal = cipher.doFinal(bArr2);
                    Cipher cipher2 = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher2.init(1, w2);
                    byte[] doFinal2 = cipher2.doFinal(bArr2);
                    byte[] bArr3 = new byte[16];
                    this.z = bArr3;
                    System.arraycopy(doFinal, 0, bArr3, 0, doFinal.length);
                    System.arraycopy(doFinal2, 0, this.z, doFinal.length, doFinal2.length);
                } catch (Exception e) {
                    throw new NTLMEngineException(e.getMessage(), e);
                }
            }
            return this.z;
        }

        public byte[] j() throws NTLMEngineException {
            if (this.t == null) {
                this.t = b.G(l(), this.d, a());
            }
            return this.t;
        }

        public byte[] k() throws NTLMEngineException {
            if (this.y == null) {
                byte[] c = c();
                byte[] bArr = this.d;
                byte[] bArr2 = new byte[bArr.length + c.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                System.arraycopy(c, 0, bArr2, this.d.length, c.length);
                this.y = b.z(bArr2, n());
            }
            return this.y;
        }

        public byte[] l() throws NTLMEngineException {
            if (this.m == null) {
                this.m = b.H(this.c);
            }
            return this.m;
        }

        public byte[] m() throws NTLMEngineException {
            if (this.n == null) {
                this.n = b.B(l(), this.d);
            }
            return this.n;
        }

        public byte[] n() throws NTLMEngineException {
            if (this.w == null) {
                c cVar = new c();
                cVar.f(l());
                this.w = cVar.a();
            }
            return this.w;
        }

        public byte[] o() throws NTLMEngineException {
            if (this.r == null) {
                this.r = b.v(b(), this.f, t());
            }
            return this.r;
        }

        public byte[] p() throws NTLMEngineException {
            if (this.o == null) {
                this.o = b.I(this.a, this.b, l());
            }
            return this.o;
        }

        public byte[] q() throws NTLMEngineException {
            if (this.s == null) {
                this.s = b.D(p(), this.d, o());
            }
            return this.s;
        }

        public byte[] r() throws NTLMEngineException {
            if (this.x == null) {
                byte[] p = p();
                byte[] bArr = new byte[16];
                System.arraycopy(q(), 0, bArr, 0, 16);
                this.x = b.z(bArr, p);
            }
            return this.x;
        }

        public byte[] s() throws NTLMEngineException {
            if (this.i == null) {
                this.i = b.F();
            }
            return this.i;
        }

        public byte[] t() {
            if (this.j == null) {
                long currentTimeMillis = (System.currentTimeMillis() + 11644473600000L) * 10000;
                this.j = new byte[8];
                for (int i = 0; i < 8; i++) {
                    this.j[i] = (byte) currentTimeMillis;
                    currentTimeMillis >>>= 8;
                }
            }
            return this.j;
        }

        public a(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(str, str2, str3, bArr, str4, bArr2, null, null, null, null);
        }
    }
}
