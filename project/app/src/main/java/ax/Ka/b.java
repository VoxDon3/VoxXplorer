/*
 * Decompiled with CFR 0.152.
 */
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

final class b
implements NTLMEngine {
    private static final SecureRandom b;
    private static final byte[] c;
    private String a = "ASCII";

    static {
        Object object;
        try {
            object = SecureRandom.getInstance("SHA1PRNG");
        }
        catch (Exception exception) {
            object = null;
        }
        b = object;
        object = EncodingUtils.getBytes((String)"NTLMSSP", (String)"ASCII");
        byte[] byArray = new byte[((Object)object).length + 1];
        c = byArray;
        System.arraycopy(object, 0, byArray, 0, ((Object)object).length);
        byArray[((Object)object).length] = 0;
    }

    b() {
    }

    private static byte[] A(String object) throws NTLMEngineException {
        try {
            object = ((String)object).toUpperCase(Locale.ENGLISH).getBytes("US-ASCII");
            int n8 = Math.min(((Object)object).length, 14);
            Object object2 = new byte[14];
            System.arraycopy(object, 0, object2, 0, n8);
            object = ax.Ka.b.w(object2, 0);
            object2 = ax.Ka.b.w(object2, 7);
            byte[] byArray = "KGS!@#$%".getBytes("US-ASCII");
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, (Key)object);
            object = cipher.doFinal(byArray);
            cipher.init(1, (Key)object2);
            object2 = cipher.doFinal(byArray);
            byArray = new byte[16];
            System.arraycopy(object, 0, byArray, 0, 8);
            System.arraycopy(object2, 0, byArray, 8, 8);
            return byArray;
        }
        catch (Exception exception) {
            throw new NTLMEngineException(exception.getMessage(), (Throwable)exception);
        }
    }

    private static byte[] B(byte[] object, byte[] byArray) throws NTLMEngineException {
        try {
            Object object2 = new byte[21];
            System.arraycopy(object, 0, object2, 0, 16);
            object = ax.Ka.b.w(object2, 0);
            Object object3 = ax.Ka.b.w(object2, 7);
            Key key = ax.Ka.b.w(object2, 14);
            object2 = Cipher.getInstance("DES/ECB/NoPadding");
            object2.init(1, (Key)object);
            object = object2.doFinal(byArray);
            object2.init(1, (Key)object3);
            object3 = object2.doFinal(byArray);
            object2.init(1, key);
            object2 = object2.doFinal(byArray);
            byArray = new byte[24];
            System.arraycopy(object, 0, byArray, 0, 8);
            System.arraycopy(object3, 0, byArray, 8, 8);
            System.arraycopy(object2, 0, byArray, 16, 8);
            return byArray;
        }
        catch (Exception exception) {
            throw new NTLMEngineException(exception.getMessage(), (Throwable)exception);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static byte[] C(String object, String charSequence, byte[] object2) throws NTLMEngineException {
        Locale locale;
        b b8;
        try {
            b8 = new b((byte[])object2);
            locale = Locale.ENGLISH;
            b8.b(((String)charSequence).toUpperCase(locale).getBytes("UnicodeLittleUnmarked"));
            if (object == null) return b8.a();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unicode not supported! ");
            ((StringBuilder)charSequence).append(unsupportedEncodingException.getMessage());
            throw new NTLMEngineException(((StringBuilder)charSequence).toString(), (Throwable)unsupportedEncodingException);
        }
        b8.b(((String)object).toUpperCase(locale).getBytes("UnicodeLittleUnmarked"));
        return b8.a();
    }

    private static byte[] D(byte[] object, byte[] byArray, byte[] byArray2) throws NTLMEngineException {
        object = new b((byte[])object);
        object.b(byArray);
        object.b(byArray2);
        object = object.a();
        byArray = new byte[((byte[])object).length + byArray2.length];
        System.arraycopy(object, 0, byArray, 0, ((byte[])object).length);
        System.arraycopy(byArray2, 0, byArray, ((byte[])object).length, byArray2.length);
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] E() throws NTLMEngineException {
        SecureRandom secureRandom = b;
        if (secureRandom != null) {
            byte[] byArray = new byte[8];
            synchronized (secureRandom) {
                secureRandom.nextBytes(byArray);
                return byArray;
            }
        }
        throw new NTLMEngineException("Random generator not available");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] F() throws NTLMEngineException {
        SecureRandom secureRandom = b;
        if (secureRandom != null) {
            byte[] byArray = new byte[16];
            synchronized (secureRandom) {
                secureRandom.nextBytes(byArray);
                return byArray;
            }
        }
        throw new NTLMEngineException("Random generator not available");
    }

    static byte[] G(byte[] byArray, byte[] byArray2, byte[] byArray3) throws NTLMEngineException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(byArray2);
            messageDigest.update(byArray3);
            byArray2 = messageDigest.digest();
            byArray3 = new byte[8];
            System.arraycopy(byArray2, 0, byArray3, 0, 8);
            byArray = ax.Ka.b.B(byArray, byArray3);
            return byArray;
        }
        catch (Exception exception) {
            if (exception instanceof NTLMEngineException) {
                throw (NTLMEngineException)((Object)exception);
            }
            throw new NTLMEngineException(exception.getMessage(), (Throwable)exception);
        }
    }

    private static byte[] H(String object) throws NTLMEngineException {
        try {
            object = ((String)object).getBytes("UnicodeLittleUnmarked");
            c c8 = new c();
            c8.f((byte[])object);
            object = c8.a();
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unicode not supported: ");
            stringBuilder.append(unsupportedEncodingException.getMessage());
            throw new NTLMEngineException(stringBuilder.toString(), (Throwable)unsupportedEncodingException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static byte[] I(String object, String string, byte[] byArray) throws NTLMEngineException {
        b b8;
        try {
            b8 = new b(byArray);
            b8.b(string.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            if (object == null) return b8.a();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Unicode not supported! ");
            ((StringBuilder)object).append(unsupportedEncodingException.getMessage());
            throw new NTLMEngineException(((StringBuilder)object).toString(), (Throwable)unsupportedEncodingException);
        }
        b8.b(((String)object).getBytes("UnicodeLittleUnmarked"));
        return b8.a();
    }

    private static void J(byte[] byArray) {
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            byte by = byArray[i8];
            byArray[i8] = ((by >>> 7 ^ by >>> 6 ^ by >>> 5 ^ by >>> 4 ^ by >>> 3 ^ by >>> 2 ^ by >>> 1) & 1) == 0 ? (byte)(by | 1) : (byte)(by & 0xFFFFFFFE);
        }
    }

    private static byte[] K(byte[] byArray, int n8) throws NTLMEngineException {
        int n9 = ax.Ka.b.M(byArray, n8);
        if (byArray.length >= (n8 = ax.Ka.b.L(byArray, n8 + 4)) + n9) {
            byte[] byArray2 = new byte[n9];
            System.arraycopy(byArray, n8, byArray2, 0, n9);
            return byArray2;
        }
        throw new NTLMEngineException("NTLM authentication - buffer too small for data item");
    }

    private static int L(byte[] byArray, int n8) throws NTLMEngineException {
        if (byArray.length >= n8 + 4) {
            byte by = byArray[n8];
            byte by2 = byArray[n8 + 1];
            byte by3 = byArray[n8 + 2];
            return (byArray[n8 + 3] & 0xFF) << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
        }
        throw new NTLMEngineException("NTLM authentication - buffer too small for DWORD");
    }

    private static int M(byte[] byArray, int n8) throws NTLMEngineException {
        if (byArray.length >= n8 + 2) {
            byte by = byArray[n8];
            return (byArray[n8 + 1] & 0xFF) << 8 | by & 0xFF;
        }
        throw new NTLMEngineException("NTLM authentication - buffer too small for WORD");
    }

    static int N(int n8, int n9) {
        return n8 >>> 32 - n9 | n8 << n9;
    }

    private static String O(String string) {
        if (string == null) {
            return null;
        }
        int n8 = string.indexOf(".");
        String string2 = string;
        if (n8 != -1) {
            string2 = string.substring(0, n8);
        }
        return string2;
    }

    static void P(byte[] byArray, int n8, int n9) {
        byArray[n9] = (byte)(n8 & 0xFF);
        byArray[n9 + 1] = (byte)(n8 >> 8 & 0xFF);
        byArray[n9 + 2] = (byte)(n8 >> 16 & 0xFF);
        byArray[n9 + 3] = (byte)(n8 >> 24 & 0xFF);
    }

    static int a(int n8, int n9, int n10) {
        return ~n8 & n10 | n9 & n8;
    }

    static int b(int n8, int n9, int n10) {
        return n8 & (n9 | n10) | n9 & n10;
    }

    static int c(int n8, int n9, int n10) {
        return n8 ^ n9 ^ n10;
    }

    static byte[] d(byte[] byArray, byte[] byArray2) throws NTLMEngineException {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            SecretKeySpec secretKeySpec = new SecretKeySpec(byArray2, "RC4");
            cipher.init(1, secretKeySpec);
            byArray = cipher.doFinal(byArray);
            return byArray;
        }
        catch (Exception exception) {
            throw new NTLMEngineException(exception.getMessage(), (Throwable)exception);
        }
    }

    private static String t(String string) {
        return ax.Ka.b.O(string);
    }

    private static String u(String string) {
        return ax.Ka.b.O(string);
    }

    private static byte[] v(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        byte[] byArray4 = new byte[byArray3.length + 20 + byArray2.length + 4];
        System.arraycopy(new byte[]{1, 1, 0, 0}, 0, byArray4, 0, 4);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, byArray4, 4, 4);
        System.arraycopy(byArray3, 0, byArray4, 8, byArray3.length);
        int n8 = byArray3.length;
        System.arraycopy(byArray, 0, byArray4, 8 + n8, 8);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, byArray4, n8 + 16, 4);
        System.arraycopy(byArray2, 0, byArray4, n8 += 20, byArray2.length);
        int n9 = byArray2.length;
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, byArray4, n8 + n9, 4);
        return byArray4;
    }

    private static Key w(byte[] byArray, int n8) {
        byte[] byArray2 = new byte[7];
        System.arraycopy(byArray, n8, byArray2, 0, 7);
        byte by = byArray2[0];
        byte by2 = byArray2[1];
        byte by3 = (byte)(by << 7 | (by2 & 0xFF) >>> 1);
        n8 = byArray2[2];
        byte by4 = (byte)(by2 << 6 | (n8 & 0xFF) >>> 2);
        by2 = byArray2[3];
        byte by5 = (byte)(n8 << 5 | (by2 & 0xFF) >>> 3);
        n8 = byArray2[4];
        byte by6 = (byte)(by2 << 4 | (n8 & 0xFF) >>> 4);
        by2 = byArray2[5];
        byte by7 = (byte)((by2 & 0xFF) >>> 5 | n8 << 3);
        n8 = byArray2[6];
        byte by8 = (byte)(by2 << 2 | (n8 & 0xFF) >>> 6);
        byte by9 = (byte)(n8 << 1);
        byArray = new byte[]{by, by3, by4, by5, by6, by7, by8, by9};
        ax.Ka.b.J(byArray);
        return new SecretKeySpec(byArray, "DES");
    }

    static byte[] z(byte[] byArray, byte[] object) throws NTLMEngineException {
        object = new b((byte[])object);
        ((b)object).b(byArray);
        return ((b)object).a();
    }

    public String generateType1Msg(String string, String string2) throws NTLMEngineException {
        return this.x(string2, string);
    }

    public String generateType3Msg(String string, String string2, String string3, String string4, String object) throws NTLMEngineException {
        object = new f((String)object);
        return this.y(string, string2, string4, string3, ((f)object).k(), ((f)object).l(), ((f)object).m(), ((f)object).n());
    }

    String x(String string, String string2) throws NTLMEngineException {
        return new e(string2, string).f();
    }

    String y(String string, String string2, String string3, String string4, byte[] byArray, int n8, String string5, byte[] byArray2) throws NTLMEngineException {
        return new g(string4, string3, string, string2, byArray, n8, string5, byArray2).f();
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
        protected byte[] k = null;
        protected byte[] l = null;
        protected byte[] m = null;
        protected byte[] n = null;
        protected byte[] o = null;
        protected byte[] p = null;
        protected byte[] q = null;
        protected byte[] r = null;
        protected byte[] s = null;
        protected byte[] t = null;
        protected byte[] u = null;
        protected byte[] v = null;
        protected byte[] w = null;
        protected byte[] x = null;
        protected byte[] y = null;
        protected byte[] z = null;

        public a(String string, String string2, String string3, byte[] byArray, String string4, byte[] byArray2) {
            this(string, string2, string3, byArray, string4, byArray2, null, null, null, null);
        }

        public a(String string, String string2, String string3, byte[] byArray, String string4, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5, byte[] byArray6) {
            this.a = string;
            this.e = string4;
            this.b = string2;
            this.c = string3;
            this.d = byArray;
            this.f = byArray2;
            this.g = byArray3;
            this.h = byArray4;
            this.i = byArray5;
            this.j = byArray6;
        }

        public byte[] a() throws NTLMEngineException {
            if (this.g == null) {
                this.g = ax.Ka.b.E();
            }
            return this.g;
        }

        public byte[] b() throws NTLMEngineException {
            if (this.h == null) {
                this.h = ax.Ka.b.E();
            }
            return this.h;
        }

        public byte[] c() throws NTLMEngineException {
            if (this.u == null) {
                byte[] byArray = this.a();
                byte[] byArray2 = new byte[24];
                this.u = byArray2;
                System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
                byArray2 = this.u;
                Arrays.fill(byArray2, byArray.length, byArray2.length, (byte)0);
            }
            return this.u;
        }

        public byte[] d() throws NTLMEngineException {
            if (this.k == null) {
                this.k = ax.Ka.b.A(this.c);
            }
            return this.k;
        }

        public byte[] e() throws NTLMEngineException {
            if (this.l == null) {
                this.l = ax.Ka.b.B(this.d(), this.d);
            }
            return this.l;
        }

        public byte[] f() throws NTLMEngineException {
            if (this.v == null) {
                this.v = new byte[16];
                System.arraycopy(this.d(), 0, this.v, 0, 8);
                Arrays.fill(this.v, 8, 16, (byte)0);
            }
            return this.v;
        }

        public byte[] g() throws NTLMEngineException {
            if (this.p == null) {
                this.p = ax.Ka.b.C(this.a, this.b, this.l());
            }
            return this.p;
        }

        public byte[] h() throws NTLMEngineException {
            if (this.q == null) {
                this.q = ax.Ka.b.D(this.g(), this.d, this.a());
            }
            return this.q;
        }

        public byte[] i() throws NTLMEngineException {
            if (this.z == null) {
                try {
                    Object object = new byte[14];
                    System.arraycopy(this.d(), 0, object, 0, 8);
                    Arrays.fill(object, 8, 14, (byte)-67);
                    Object object2 = ax.Ka.b.w(object, 0);
                    object = ax.Ka.b.w(object, 7);
                    byte[] byArray = new byte[8];
                    System.arraycopy(this.e(), 0, byArray, 0, 8);
                    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher.init(1, (Key)object2);
                    object2 = cipher.doFinal(byArray);
                    cipher = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher.init(1, (Key)object);
                    object = cipher.doFinal(byArray);
                    byArray = new byte[16];
                    this.z = byArray;
                    System.arraycopy(object2, 0, byArray, 0, ((Object)object2).length);
                    System.arraycopy(object, 0, this.z, ((Object)object2).length, ((byte[])object).length);
                }
                catch (Exception exception) {
                    throw new NTLMEngineException(exception.getMessage(), (Throwable)exception);
                }
            }
            return this.z;
        }

        public byte[] j() throws NTLMEngineException {
            if (this.t == null) {
                this.t = ax.Ka.b.G(this.l(), this.d, this.a());
            }
            return this.t;
        }

        public byte[] k() throws NTLMEngineException {
            if (this.y == null) {
                byte[] byArray = this.c();
                byte[] byArray2 = this.d;
                byte[] byArray3 = new byte[byArray2.length + byArray.length];
                System.arraycopy(byArray2, 0, byArray3, 0, byArray2.length);
                System.arraycopy(byArray, 0, byArray3, this.d.length, byArray.length);
                this.y = ax.Ka.b.z(byArray3, this.n());
            }
            return this.y;
        }

        public byte[] l() throws NTLMEngineException {
            if (this.m == null) {
                this.m = ax.Ka.b.H(this.c);
            }
            return this.m;
        }

        public byte[] m() throws NTLMEngineException {
            if (this.n == null) {
                this.n = ax.Ka.b.B(this.l(), this.d);
            }
            return this.n;
        }

        public byte[] n() throws NTLMEngineException {
            if (this.w == null) {
                c c8 = new c();
                c8.f(this.l());
                this.w = c8.a();
            }
            return this.w;
        }

        public byte[] o() throws NTLMEngineException {
            if (this.r == null) {
                this.r = ax.Ka.b.v(this.b(), this.f, this.t());
            }
            return this.r;
        }

        public byte[] p() throws NTLMEngineException {
            if (this.o == null) {
                this.o = ax.Ka.b.I(this.a, this.b, this.l());
            }
            return this.o;
        }

        public byte[] q() throws NTLMEngineException {
            if (this.s == null) {
                this.s = ax.Ka.b.D(this.p(), this.d, this.o());
            }
            return this.s;
        }

        public byte[] r() throws NTLMEngineException {
            if (this.x == null) {
                byte[] byArray = this.p();
                byte[] byArray2 = new byte[16];
                System.arraycopy(this.q(), 0, byArray2, 0, 16);
                this.x = ax.Ka.b.z(byArray2, byArray);
            }
            return this.x;
        }

        public byte[] s() throws NTLMEngineException {
            if (this.i == null) {
                this.i = ax.Ka.b.F();
            }
            return this.i;
        }

        public byte[] t() {
            if (this.j == null) {
                long l8 = (System.currentTimeMillis() + 11644473600000L) * 10000L;
                this.j = new byte[8];
                for (int i8 = 0; i8 < 8; ++i8) {
                    this.j[i8] = (byte)l8;
                    l8 >>>= 8;
                }
            }
            return this.j;
        }
    }

    static class b {
        protected byte[] a;
        protected byte[] b;
        protected MessageDigest c;

        b(byte[] object) throws NTLMEngineException {
            int n8;
            MessageDigest messageDigest;
            try {
                this.c = messageDigest = MessageDigest.getInstance("MD5");
            }
            catch (Exception exception) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Error getting md5 message digest implementation: ");
                ((StringBuilder)object).append(exception.getMessage());
                throw new NTLMEngineException(((StringBuilder)object).toString(), (Throwable)exception);
            }
            this.a = new byte[64];
            this.b = new byte[64];
            int n9 = n8 = ((Object)object).length;
            Object object2 = object;
            if (n8 > 64) {
                messageDigest.update((byte[])object);
                object2 = this.c.digest();
                n9 = ((Object)object2).length;
            }
            n8 = 0;
            while (true) {
                if (n8 >= n9) break;
                this.a[n8] = (byte)(0x36 ^ object2[n8]);
                this.b[n8] = (byte)(0x5C ^ object2[n8]);
            }
            for (int i8 = ++n8; i8 < 64; ++i8) {
                this.a[i8] = 54;
                this.b[i8] = 92;
            }
            this.c.reset();
            this.c.update(this.a);
            return;
        }

        byte[] a() {
            byte[] byArray = this.c.digest();
            this.c.update(this.b);
            return this.c.digest(byArray);
        }

        void b(byte[] byArray) {
            this.c.update(byArray);
        }
    }

    static class c {
        protected int a = 1732584193;
        protected int b = -271733879;
        protected int c = -1732584194;
        protected int d = 271733878;
        protected long e = 0L;
        protected byte[] f = new byte[64];

        c() {
        }

        byte[] a() {
            int n8 = (int)(this.e & 0x3FL);
            n8 = n8 < 56 ? 56 - n8 : 120 - n8;
            byte[] byArray = new byte[n8 + 8];
            byArray[0] = -128;
            for (int i8 = 0; i8 < 8; ++i8) {
                byArray[n8 + i8] = (byte)(this.e * 8L >>> i8 * 8);
            }
            this.f(byArray);
            byArray = new byte[16];
            ax.Ka.b.P(byArray, this.a, 0);
            ax.Ka.b.P(byArray, this.b, 4);
            ax.Ka.b.P(byArray, this.c, 8);
            ax.Ka.b.P(byArray, this.d, 12);
            return byArray;
        }

        protected void b() {
            int n8;
            int n9;
            int[] nArray = new int[16];
            for (n9 = 0; n9 < 16; ++n9) {
                byte[] byArray = this.f;
                n8 = n9 * 4;
                nArray[n9] = (byArray[n8] & 0xFF) + ((byArray[n8 + 1] & 0xFF) << 8) + ((byArray[n8 + 2] & 0xFF) << 16) + ((byArray[n8 + 3] & 0xFF) << 24);
            }
            n8 = this.a;
            int n10 = this.b;
            int n11 = this.c;
            n9 = this.d;
            this.c(nArray);
            this.d(nArray);
            this.e(nArray);
            this.a += n8;
            this.b += n10;
            this.c += n11;
            this.d += n9;
        }

        protected void c(int[] nArray) {
            int n8;
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.a(this.b, this.c, this.d) + nArray[0], 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.a(n8, this.b, this.c) + nArray[1], 7);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.a(n8, this.a, this.b) + nArray[2], 11);
            this.b = n8 = ax.Ka.b.N(this.b + ax.Ka.b.a(n8, this.d, this.a) + nArray[3], 19);
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.a(n8, this.c, this.d) + nArray[4], 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.a(n8, this.b, this.c) + nArray[5], 7);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.a(n8, this.a, this.b) + nArray[6], 11);
            this.b = n8 = ax.Ka.b.N(this.b + ax.Ka.b.a(n8, this.d, this.a) + nArray[7], 19);
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.a(n8, this.c, this.d) + nArray[8], 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.a(n8, this.b, this.c) + nArray[9], 7);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.a(n8, this.a, this.b) + nArray[10], 11);
            this.b = n8 = ax.Ka.b.N(this.b + ax.Ka.b.a(n8, this.d, this.a) + nArray[11], 19);
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.a(n8, this.c, this.d) + nArray[12], 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.a(n8, this.b, this.c) + nArray[13], 7);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.a(n8, this.a, this.b) + nArray[14], 11);
            this.b = ax.Ka.b.N(this.b + ax.Ka.b.a(n8, this.d, this.a) + nArray[15], 19);
        }

        protected void d(int[] nArray) {
            int n8;
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.b(this.b, this.c, this.d) + nArray[0] + 1518500249, 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.b(n8, this.b, this.c) + nArray[4] + 1518500249, 5);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.b(n8, this.a, this.b) + nArray[8] + 1518500249, 9);
            this.b = n8 = ax.Ka.b.N(this.b + ax.Ka.b.b(n8, this.d, this.a) + nArray[12] + 1518500249, 13);
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.b(n8, this.c, this.d) + nArray[1] + 1518500249, 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.b(n8, this.b, this.c) + nArray[5] + 1518500249, 5);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.b(n8, this.a, this.b) + nArray[9] + 1518500249, 9);
            this.b = n8 = ax.Ka.b.N(this.b + ax.Ka.b.b(n8, this.d, this.a) + nArray[13] + 1518500249, 13);
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.b(n8, this.c, this.d) + nArray[2] + 1518500249, 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.b(n8, this.b, this.c) + nArray[6] + 1518500249, 5);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.b(n8, this.a, this.b) + nArray[10] + 1518500249, 9);
            this.b = n8 = ax.Ka.b.N(this.b + ax.Ka.b.b(n8, this.d, this.a) + nArray[14] + 1518500249, 13);
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.b(n8, this.c, this.d) + nArray[3] + 1518500249, 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.b(n8, this.b, this.c) + nArray[7] + 1518500249, 5);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.b(n8, this.a, this.b) + nArray[11] + 1518500249, 9);
            this.b = ax.Ka.b.N(this.b + ax.Ka.b.b(n8, this.d, this.a) + nArray[15] + 1518500249, 13);
        }

        protected void e(int[] nArray) {
            int n8;
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.c(this.b, this.c, this.d) + nArray[0] + 1859775393, 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.c(n8, this.b, this.c) + nArray[8] + 1859775393, 9);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.c(n8, this.a, this.b) + nArray[4] + 1859775393, 11);
            this.b = n8 = ax.Ka.b.N(this.b + ax.Ka.b.c(n8, this.d, this.a) + nArray[12] + 1859775393, 15);
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.c(n8, this.c, this.d) + nArray[2] + 1859775393, 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.c(n8, this.b, this.c) + nArray[10] + 1859775393, 9);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.c(n8, this.a, this.b) + nArray[6] + 1859775393, 11);
            this.b = n8 = ax.Ka.b.N(this.b + ax.Ka.b.c(n8, this.d, this.a) + nArray[14] + 1859775393, 15);
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.c(n8, this.c, this.d) + nArray[1] + 1859775393, 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.c(n8, this.b, this.c) + nArray[9] + 1859775393, 9);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.c(n8, this.a, this.b) + nArray[5] + 1859775393, 11);
            this.b = n8 = ax.Ka.b.N(this.b + ax.Ka.b.c(n8, this.d, this.a) + nArray[13] + 1859775393, 15);
            this.a = n8 = ax.Ka.b.N(this.a + ax.Ka.b.c(n8, this.c, this.d) + nArray[3] + 1859775393, 3);
            this.d = n8 = ax.Ka.b.N(this.d + ax.Ka.b.c(n8, this.b, this.c) + nArray[11] + 1859775393, 9);
            this.c = n8 = ax.Ka.b.N(this.c + ax.Ka.b.c(n8, this.a, this.b) + nArray[7] + 1859775393, 11);
            this.b = ax.Ka.b.N(this.b + ax.Ka.b.c(n8, this.d, this.a) + nArray[15] + 1859775393, 15);
        }

        void f(byte[] byArray) {
            byte[] byArray2;
            int n8;
            int n9 = (int)(this.e & 0x3FL);
            int n10 = 0;
            while ((n8 = byArray.length) - n10 + n9 >= (byArray2 = this.f).length) {
                n8 = byArray2.length - n9;
                System.arraycopy(byArray, n10, byArray2, n9, n8);
                this.e += (long)n8;
                n10 += n8;
                this.b();
                n9 = 0;
            }
            if (n10 < byArray.length) {
                n8 = byArray.length - n10;
                System.arraycopy(byArray, n10, byArray2, n9, n8);
                this.e += (long)n8;
            }
        }
    }

    static class d {
        private byte[] a = null;
        private int b = 0;

        d() {
        }

        d(String object, int n8) throws NTLMEngineException {
            object = Base64.decodeBase64((byte[])EncodingUtils.getBytes((String)object, (String)"ASCII"));
            this.a = (byte[])object;
            if (((Object)object).length >= c.length) {
                int n9;
                for (n9 = 0; n9 < c.length; ++n9) {
                    if (this.a[n9] == c[n9]) {
                        continue;
                    }
                    throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                }
                n9 = this.j(c.length);
                if (n9 == n8) {
                    this.b = this.a.length;
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("NTLM type ");
                ((StringBuilder)object).append(Integer.toString(n8));
                ((StringBuilder)object).append(" message expected - instead got type ");
                ((StringBuilder)object).append(Integer.toString(n9));
                throw new NTLMEngineException(((StringBuilder)object).toString());
            }
            throw new NTLMEngineException("NTLM message decoding error - packet too short");
        }

        protected void a(byte by) {
            byte[] byArray = this.a;
            int n8 = this.b;
            byArray[n8] = by;
            this.b = n8 + 1;
        }

        protected void b(byte[] byArray) {
            if (byArray != null) {
                for (byte by : byArray) {
                    byte[] byArray2 = this.a;
                    int n8 = this.b;
                    byArray2[n8] = by;
                    this.b = n8 + 1;
                }
            }
        }

        protected void c(int n8) {
            this.a((byte)(n8 & 0xFF));
            this.a((byte)(n8 >> 8 & 0xFF));
            this.a((byte)(n8 >> 16 & 0xFF));
            this.a((byte)(n8 >> 24 & 0xFF));
        }

        protected void d(int n8) {
            this.a((byte)(n8 & 0xFF));
            this.a((byte)(n8 >> 8 & 0xFF));
        }

        protected int e() {
            return this.b;
        }

        String f() {
            byte[] byArray = this.a;
            int n8 = byArray.length;
            int n9 = this.b;
            byte[] byArray2 = byArray;
            if (n8 > n9) {
                byArray2 = new byte[n9];
                System.arraycopy(byArray, 0, byArray2, 0, n9);
            }
            return EncodingUtils.getAsciiString((byte[])Base64.encodeBase64((byte[])byArray2));
        }

        protected void g(int n8, int n9) {
            this.a = new byte[n8];
            this.b = 0;
            this.b(c);
            this.c(n9);
        }

        protected void h(byte[] byArray, int n8) throws NTLMEngineException {
            byte[] byArray2 = this.a;
            if (byArray2.length >= byArray.length + n8) {
                System.arraycopy(byArray2, n8, byArray, 0, byArray.length);
                return;
            }
            throw new NTLMEngineException("NTLM: Message too short");
        }

        protected byte[] i(int n8) throws NTLMEngineException {
            return ax.Ka.b.K(this.a, n8);
        }

        protected int j(int n8) throws NTLMEngineException {
            return ax.Ka.b.L(this.a, n8);
        }
    }

    static class e
    extends d {
        protected byte[] c;
        protected byte[] d;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        e(String object, String string) throws NTLMEngineException {
            UnsupportedEncodingException unsupportedEncodingException2;
            block3: {
                String string2;
                try {
                    String string3 = ax.Ka.b.u(string);
                    string2 = ax.Ka.b.t((String)object);
                    string = null;
                    object = string3 != null ? (Object)string3.getBytes("ASCII") : null;
                }
                catch (UnsupportedEncodingException unsupportedEncodingException2) {
                    break block3;
                }
                this.c = (byte[])object;
                object = string;
                if (string2 != null) {
                    object = string2.toUpperCase(Locale.ENGLISH).getBytes("ASCII");
                }
                this.d = (byte[])object;
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unicode unsupported: ");
            ((StringBuilder)object).append(unsupportedEncodingException2.getMessage());
            throw new NTLMEngineException(((StringBuilder)object).toString(), (Throwable)unsupportedEncodingException2);
        }

        @Override
        String f() {
            this.g(40, 1);
            this.c(-1576500735);
            this.d(0);
            this.d(0);
            this.c(40);
            this.d(0);
            this.d(0);
            this.c(40);
            this.d(261);
            this.c(2600);
            this.d(3840);
            return super.f();
        }
    }

    static class f
    extends d {
        protected byte[] c;
        protected String d;
        protected byte[] e;
        protected int f;

        f(String object) throws NTLMEngineException {
            super((String)object, 2);
            int n8;
            object = new byte[8];
            this.c = (byte[])object;
            this.h((byte[])object, 24);
            this.f = n8 = this.j(20);
            if ((n8 & 1) != 0) {
                byte[] byArray;
                this.d = null;
                if (this.e() >= 20 && (byArray = this.i(12)).length != 0) {
                    try {
                        this.d = object = new String(byArray, "UnicodeLittleUnmarked");
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                        throw new NTLMEngineException(unsupportedEncodingException.getMessage(), (Throwable)unsupportedEncodingException);
                    }
                }
                this.e = null;
                if (this.e() >= 48 && ((Object)(object = (Object)this.i(40))).length != 0) {
                    this.e = (byte[])object;
                }
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("NTLM type 2 message indicates no support for Unicode. Flags are: ");
            ((StringBuilder)object).append(Integer.toString(this.f));
            throw new NTLMEngineException(((StringBuilder)object).toString());
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

    static class g
    extends d {
        protected int c;
        protected byte[] d;
        protected byte[] e;
        protected byte[] f;
        protected byte[] g;
        protected byte[] h;
        protected byte[] i;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        g(String object, String charSequence, String string, String object2, byte[] byArray, int n8, String string2, byte[] byArray2) throws NTLMEngineException {
            UnsupportedEncodingException unsupportedEncodingException2;
            block14: {
                String string3;
                block13: {
                    String string4;
                    block11: {
                        block12: {
                            this.c = n8;
                            string4 = ax.Ka.b.u((String)charSequence);
                            string3 = ax.Ka.b.t((String)object);
                            object2 = new a(string3, string, (String)object2, byArray, string2, byArray2);
                            if ((0x800000 & n8) != 0 && byArray2 != null && string2 != null) {
                                block10: {
                                    try {
                                        this.h = ((a)object2).q();
                                        this.g = ((a)object2).h();
                                        if ((n8 & 0x80) == 0) break block10;
                                        object = ((a)object2).i();
                                        break block11;
                                    }
                                    catch (NTLMEngineException nTLMEngineException) {
                                        break block12;
                                    }
                                }
                                object = ((a)object2).r();
                            } else if ((0x80000 & n8) != 0) {
                                this.h = ((a)object2).j();
                                this.g = ((a)object2).c();
                                object = (n8 & 0x80) != 0 ? (Object)((a)object2).i() : (Object)((a)object2).k();
                                break block11;
                            } else {
                                this.h = ((a)object2).m();
                                this.g = ((a)object2).e();
                                object = (n8 & 0x80) != 0 ? (Object)((a)object2).i() : (Object)((a)object2).n();
                            }
                            break block11;
                        }
                        this.h = new byte[0];
                        this.g = ((a)object2).e();
                        object = (n8 & 0x80) != 0 ? (Object)((a)object2).i() : (Object)((a)object2).f();
                    }
                    charSequence = null;
                    this.i = (byte[])((n8 & 0x10) != 0 ? ((0x40000000 & n8) != 0 ? ax.Ka.b.d(((a)object2).s(), (byte[])object) : (byte[])object) : null);
                    if (string4 != null) {
                        try {
                            object = string4.getBytes("UnicodeLittleUnmarked");
                            break block13;
                        }
                        catch (UnsupportedEncodingException unsupportedEncodingException2) {
                            break block14;
                        }
                    }
                    object = null;
                }
                this.e = (byte[])object;
                object = charSequence;
                if (string3 != null) {
                    object = string3.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked");
                }
                this.d = (byte[])object;
                this.f = string.getBytes("UnicodeLittleUnmarked");
                return;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unicode not supported: ");
            ((StringBuilder)charSequence).append(unsupportedEncodingException2.getMessage());
            throw new NTLMEngineException(((StringBuilder)charSequence).toString(), (Throwable)unsupportedEncodingException2);
        }

        @Override
        String f() {
            int n8 = this.h.length;
            int n9 = this.g.length;
            byte[] byArray = this.d;
            int n10 = 0;
            int n11 = byArray != null ? byArray.length : 0;
            byArray = this.e;
            int n12 = byArray != null ? byArray.length : 0;
            int n13 = this.f.length;
            byArray = this.i;
            if (byArray != null) {
                n10 = byArray.length;
            }
            int n14 = n9 + 72;
            int n15 = n14 + n8;
            int n16 = n15 + n11;
            int n17 = n16 + n13;
            int n18 = n17 + n12;
            this.g(n18 + n10, 3);
            this.d(n9);
            this.d(n9);
            this.c(72);
            this.d(n8);
            this.d(n8);
            this.c(n14);
            this.d(n11);
            this.d(n11);
            this.c(n15);
            this.d(n13);
            this.d(n13);
            this.c(n16);
            this.d(n12);
            this.d(n12);
            this.c(n17);
            this.d(n10);
            this.d(n10);
            this.c(n18);
            n11 = this.c;
            this.c(n11 & 4 | (0x80280 & n11 | 0x2000000 | 0x8000 & n11 | n11 & 0x20 | n11 & 0x10 | 0x20000000 & n11 | Integer.MIN_VALUE & n11 | 0x40000000 & n11 | 0x800000 & n11 | n11 & 1));
            this.d(261);
            this.c(2600);
            this.d(3840);
            this.b(this.g);
            this.b(this.h);
            this.b(this.d);
            this.b(this.f);
            this.b(this.e);
            byArray = this.i;
            if (byArray != null) {
                this.b(byArray);
            }
            return super.f();
        }
    }
}

