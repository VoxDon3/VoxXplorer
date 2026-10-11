package ax.pb;

import ax.jb.C2345a;
import ax.qb.C2893a;
import ax.qb.C2894b;
import ax.qb.C2895c;
import ax.qb.C2897e;
import ax.qb.C2898f;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.Arrays;
import java.util.Random;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class r implements Principal, Serializable {
    static String n0;
    static String o0;
    static String p0;
    String c0;
    String d0;
    byte[] e0;
    byte[] f0;
    boolean g0 = false;
    byte[] h0 = null;
    byte[] i0 = null;
    String q;
    private static final int j0 = C2345a.d("jcifs.smb.lmCompatibility", 3);
    private static final Random k0 = new Random();
    private static C2897e l0 = C2897e.a();
    private static final byte[] m0 = {75, 71, 83, 33, 64, 35, 36, 37};
    public static final r q0 = new r(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    static final r r0 = new r(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    static final r s0 = new r("?", "GUEST", HttpUrl.FRAGMENT_ENCODE_SET);
    static final r t0 = new r(null);

    public r(String str) {
        this.d0 = null;
        this.c0 = null;
        this.q = null;
        if (str != null) {
            try {
                str = r(str);
            } catch (UnsupportedEncodingException unused) {
            }
            int length = str.length();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                char charAt = str.charAt(i);
                if (charAt == ';') {
                    this.q = str.substring(0, i);
                    i2 = i + 1;
                } else if (charAt == ':') {
                    this.d0 = str.substring(i + 1);
                    break;
                }
                i++;
            }
            this.c0 = str.substring(i2, i);
        }
        o();
        if (this.q == null) {
            this.q = n0;
        }
        if (this.c0 == null) {
            this.c0 = o0;
        }
        if (this.d0 == null) {
            this.d0 = p0;
        }
    }

    private static void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[7];
        byte[] bArr5 = new byte[8];
        for (int i = 0; i < bArr.length / 7; i++) {
            System.arraycopy(bArr, i * 7, bArr4, 0, 7);
            new C2893a(bArr4).e(bArr2, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i * 8, 8);
        }
    }

    static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) {
        C2895c c2895c = new C2895c(bArr);
        c2895c.update(bArr2);
        c2895c.update(bArr3, i, i2);
        byte[] digest = c2895c.digest();
        byte[] bArr4 = new byte[digest.length + bArr3.length];
        System.arraycopy(digest, 0, bArr4, 0, digest.length);
        System.arraycopy(bArr3, 0, bArr4, digest.length, bArr3.length);
        return bArr4;
    }

    public static byte[] e(String str, String str2, String str3, byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[24];
            C2898f c2898f = new C2898f();
            c2898f.update(str3.getBytes("UTF-16LE"));
            C2895c c2895c = new C2895c(c2898f.digest());
            c2895c.update(str2.toUpperCase().getBytes("UTF-16LE"));
            c2895c.update(str.toUpperCase().getBytes("UTF-16LE"));
            C2895c c2895c2 = new C2895c(c2895c.digest());
            c2895c2.update(bArr);
            c2895c2.update(bArr2);
            c2895c2.digest(bArr3, 0, 16);
            System.arraycopy(bArr2, 0, bArr3, 16, 8);
            return bArr3;
        } catch (Exception e) {
            if (C2897e.c0 <= 0) {
                return null;
            }
            e.printStackTrace(l0);
            return null;
        }
    }

    public static byte[] f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[8];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr2);
            messageDigest.update(bArr3, 0, 8);
            System.arraycopy(messageDigest.digest(), 0, bArr4, 0, 8);
            byte[] bArr5 = new byte[21];
            System.arraycopy(bArr, 0, bArr5, 0, 16);
            byte[] bArr6 = new byte[24];
            a(bArr5, bArr4, bArr6);
            return bArr6;
        } catch (GeneralSecurityException e) {
            if (C2897e.c0 > 0) {
                e.printStackTrace(l0);
            }
            throw new RuntimeException("MD5", e);
        }
    }

    public static byte[] g(String str, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        try {
            bArr2 = str.getBytes("UTF-16LE");
        } catch (UnsupportedEncodingException e) {
            if (C2897e.c0 > 0) {
                e.printStackTrace(l0);
            }
            bArr2 = null;
        }
        C2898f c2898f = new C2898f();
        c2898f.update(bArr2);
        try {
            c2898f.digest(bArr3, 0, 16);
        } catch (Exception e2) {
            if (C2897e.c0 > 0) {
                e2.printStackTrace(l0);
            }
        }
        a(bArr3, bArr, bArr4);
        return bArr4;
    }

    public static byte[] h(byte[] bArr, byte[] bArr2, byte[] bArr3, long j, byte[] bArr4) {
        int length = bArr4 != null ? bArr4.length : 0;
        int i = length + 28;
        int i2 = length + 32;
        byte[] bArr5 = new byte[i2];
        C2894b.n(257, bArr5, 0);
        C2894b.n(0, bArr5, 4);
        C2894b.p(j, bArr5, 8);
        System.arraycopy(bArr3, 0, bArr5, 16, 8);
        C2894b.n(0, bArr5, 24);
        if (bArr4 != null) {
            System.arraycopy(bArr4, 0, bArr5, 28, length);
        }
        C2894b.n(0, bArr5, i);
        return b(bArr, bArr2, bArr5, 0, i2);
    }

    public static byte[] j(String str, byte[] bArr) {
        byte[] bArr2 = new byte[14];
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        try {
            byte[] bytes = str.toUpperCase().getBytes(Z.K);
            int length = bytes.length;
            System.arraycopy(bytes, 0, bArr2, 0, length <= 14 ? length : 14);
            a(bArr2, m0, bArr3);
            a(bArr3, bArr, bArr4);
            return bArr4;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Try setting jcifs.encoding=US-ASCII", e);
        }
    }

    static void o() {
        if (n0 != null) {
            return;
        }
        n0 = C2345a.h("jcifs.smb.client.domain", "?");
        o0 = C2345a.h("jcifs.smb.client.username", "GUEST");
        p0 = C2345a.h("jcifs.smb.client.password", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public static byte[] p(String str) {
        if (str == null) {
            throw new RuntimeException("Password parameter is required");
        }
        try {
            C2898f c2898f = new C2898f();
            c2898f.update(str.getBytes("UTF-16LE"));
            return c2898f.digest();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static byte[] q(String str, String str2, String str3) {
        try {
            C2898f c2898f = new C2898f();
            c2898f.update(str3.getBytes("UTF-16LE"));
            C2895c c2895c = new C2895c(c2898f.digest());
            c2895c.update(str2.toUpperCase().getBytes("UTF-16LE"));
            c2895c.update(str.getBytes("UTF-16LE"));
            return c2895c.digest();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    static String r(String str) throws NumberFormatException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < length) {
            if (!z) {
                char charAt = str.charAt(i);
                if (charAt == '%') {
                    z = true;
                } else {
                    cArr[i2] = charAt;
                    i2++;
                }
            } else if (z) {
                cArr[i2] = new String(new byte[]{(byte) (Integer.parseInt(str.substring(i, i + 2), 16) & 255)}, 0, 1, "ASCII").charAt(0);
                i++;
                i2++;
                z = false;
            }
            i++;
        }
        return new String(cArr, 0, i2);
    }

    public byte[] c(byte[] bArr) {
        if (this.g0) {
            return this.e0;
        }
        int i = j0;
        if (i == 0 || i == 1) {
            return j(this.d0, bArr);
        }
        if (i == 2) {
            return g(this.d0, bArr);
        }
        if (i != 3 && i != 4 && i != 5) {
            return j(this.d0, bArr);
        }
        if (this.h0 == null) {
            byte[] bArr2 = new byte[8];
            this.h0 = bArr2;
            k0.nextBytes(bArr2);
        }
        return e(this.q, this.c0, this.d0, bArr, this.h0);
    }

    public String d() {
        return this.q;
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.q.toUpperCase().equals(this.q.toUpperCase()) && rVar.c0.toUpperCase().equals(this.c0.toUpperCase())) {
                boolean z = this.g0;
                if (z && rVar.g0) {
                    return Arrays.equals(this.e0, rVar.e0) && Arrays.equals(this.f0, rVar.f0);
                }
                if (!z && this.d0.equals(rVar.d0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.security.Principal
    public String getName() {
        if (this.q.length() <= 0 || this.q.equals("?")) {
            return this.c0;
        }
        return this.q + "\\" + this.c0;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return getName().toUpperCase().hashCode();
    }

    public String i() {
        return this.d0;
    }

    public byte[] k(byte[] bArr) throws C2794a0 {
        int i = j0;
        if (i == 0 || i == 1 || i == 2) {
            byte[] bArr2 = new byte[40];
            m(bArr, bArr2, 0);
            System.arraycopy(l(bArr), 0, bArr2, 16, 24);
            return bArr2;
        }
        if (i == 3 || i == 4 || i == 5) {
            throw new C2794a0("NTLMv2 requires extended security (jcifs.smb.client.useExtendedSecurity must be true if jcifs.smb.lmCompatibility >= 3)");
        }
        return null;
    }

    public byte[] l(byte[] bArr) {
        if (this.g0) {
            return this.f0;
        }
        int i = j0;
        return (i == 0 || i == 1 || i == 2) ? g(this.d0, bArr) : (i == 3 || i == 4 || i == 5) ? new byte[0] : g(this.d0, bArr);
    }

    void m(byte[] bArr, byte[] bArr2, int i) throws C2794a0 {
        if (this.g0) {
            return;
        }
        try {
            C2898f c2898f = new C2898f();
            c2898f.update(this.d0.getBytes("UTF-16LE"));
            int i2 = j0;
            if (i2 == 0 || i2 == 1 || i2 == 2) {
                c2898f.update(c2898f.digest());
                c2898f.digest(bArr2, i, 16);
                return;
            }
            if (i2 != 3 && i2 != 4 && i2 != 5) {
                c2898f.update(c2898f.digest());
                c2898f.digest(bArr2, i, 16);
                return;
            }
            if (this.h0 == null) {
                byte[] bArr3 = new byte[8];
                this.h0 = bArr3;
                k0.nextBytes(bArr3);
            }
            C2895c c2895c = new C2895c(c2898f.digest());
            c2895c.update(this.c0.toUpperCase().getBytes("UTF-16LE"));
            c2895c.update(this.q.toUpperCase().getBytes("UTF-16LE"));
            byte[] digest = c2895c.digest();
            C2895c c2895c2 = new C2895c(digest);
            c2895c2.update(bArr);
            c2895c2.update(this.h0);
            C2895c c2895c3 = new C2895c(digest);
            c2895c3.update(c2895c2.digest());
            c2895c3.digest(bArr2, i, 16);
        } catch (Exception e) {
            throw new C2794a0(HttpUrl.FRAGMENT_ENCODE_SET, e);
        }
    }

    public String n() {
        return this.c0;
    }

    @Override // java.security.Principal
    public String toString() {
        return getName();
    }

    public r(String str, String str2, String str3) {
        int indexOf;
        if (str2 != null && (indexOf = str2.indexOf(92)) > 0) {
            str = str2.substring(0, indexOf);
            str2 = str2.substring(indexOf + 1);
        }
        this.q = str;
        this.c0 = str2;
        this.d0 = str3;
        o();
        if (str == null) {
            this.q = n0;
        }
        if (str2 == null) {
            this.c0 = o0;
        }
        if (str3 == null) {
            this.d0 = p0;
        }
    }
}
