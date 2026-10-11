package ax.ob;

import ax.jb.C2345a;
import ax.nb.C2644g;
import ax.pb.r;
import ax.qb.C2895c;
import ax.qb.C2896d;
import ax.qb.C2898f;
import ax.qb.C2899g;
import java.io.IOException;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: ax.ob.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2742d extends AbstractC2739a {
    private static final int k;
    private static final String l;
    private static final String m;
    private static final String n;
    private static final String o;
    private static final int p;
    private static final SecureRandom q = new SecureRandom();
    private byte[] d;
    private byte[] e;
    private String f;
    private String g;
    private String h;
    private byte[] i;
    private byte[] j = null;

    static {
        k = (C2345a.a("jcifs.smb.client.useUnicode", true) ? 1 : 2) | 512;
        String str = null;
        l = C2345a.h("jcifs.smb.client.domain", null);
        m = C2345a.h("jcifs.smb.client.username", null);
        n = C2345a.h("jcifs.smb.client.password", null);
        try {
            str = C2644g.t().r();
        } catch (UnknownHostException unused) {
        }
        o = str;
        p = C2345a.d("jcifs.smb.lmCompatibility", 3);
    }

    public C2742d(C2741c c2741c, String str, String str2, String str3, String str4, int i) {
        this.i = null;
        f(i | j(c2741c));
        B(str4 == null ? k() : str4);
        w(str2);
        A(str3);
        int i2 = p;
        if (i2 == 0 || i2 == 1) {
            if ((a() & 524288) == 0) {
                x(n(c2741c, str));
                y(s(c2741c, str));
                return;
            }
            byte[] bArr = new byte[24];
            SecureRandom secureRandom = q;
            secureRandom.nextBytes(bArr);
            Arrays.fill(bArr, 8, 24, (byte) 0);
            byte[] p2 = r.p(str);
            byte[] f = r.f(p2, c2741c.j(), bArr);
            x(bArr);
            y(f);
            if ((a() & 16) == 16) {
                byte[] bArr2 = new byte[16];
                System.arraycopy(c2741c.j(), 0, bArr2, 0, 8);
                System.arraycopy(bArr, 0, bArr2, 8, 8);
                C2898f c2898f = new C2898f();
                c2898f.update(p2);
                C2895c c2895c = new C2895c(c2898f.digest());
                c2895c.update(bArr2);
                byte[] digest = c2895c.digest();
                if ((a() & 1073741824) == 0) {
                    this.i = digest;
                    z(digest);
                    return;
                }
                byte[] bArr3 = new byte[16];
                this.i = bArr3;
                secureRandom.nextBytes(bArr3);
                byte[] bArr4 = new byte[16];
                new C2899g(digest).b(this.i, 0, 16, bArr4, 0);
                z(bArr4);
                return;
            }
            return;
        }
        if (i2 == 2) {
            byte[] s = s(c2741c, str);
            x(s);
            y(s);
            return;
        }
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            x(n(c2741c, str));
            y(s(c2741c, str));
            return;
        }
        byte[] q2 = r.q(str2, str3, str);
        byte[] bArr5 = new byte[8];
        SecureRandom secureRandom2 = q;
        secureRandom2.nextBytes(bArr5);
        x(o(c2741c, str2, str3, str, bArr5));
        byte[] bArr6 = new byte[8];
        secureRandom2.nextBytes(bArr6);
        y(q(c2741c, q2, bArr6));
        if ((a() & 16) == 16) {
            C2895c c2895c2 = new C2895c(q2);
            c2895c2.update(this.e, 0, 16);
            byte[] digest2 = c2895c2.digest();
            if ((a() & 1073741824) == 0) {
                this.i = digest2;
                z(digest2);
                return;
            }
            byte[] bArr7 = new byte[16];
            this.i = bArr7;
            secureRandom2.nextBytes(bArr7);
            byte[] bArr8 = new byte[16];
            new C2899g(digest2).b(this.i, 0, 16, bArr8, 0);
            z(bArr8);
        }
    }

    public static int j(C2741c c2741c) {
        if (c2741c == null) {
            return k;
        }
        return ((c2741c.a() & 1) == 0 ? 2 : 1) | 512;
    }

    public static String k() {
        return o;
    }

    public static byte[] n(C2741c c2741c, String str) {
        if (c2741c == null || str == null) {
            return null;
        }
        return r.j(str, c2741c.j());
    }

    public static byte[] o(C2741c c2741c, String str, String str2, String str3, byte[] bArr) {
        if (c2741c == null || str == null || str2 == null || str3 == null || bArr == null) {
            return null;
        }
        return r.e(str, str2, str3, c2741c.j(), bArr);
    }

    public static byte[] q(C2741c c2741c, byte[] bArr, byte[] bArr2) {
        if (c2741c == null || bArr == null || bArr2 == null) {
            return null;
        }
        return r.h(bArr, c2741c.j(), bArr2, (System.currentTimeMillis() + 11644473600000L) * 10000, c2741c.m());
    }

    public static byte[] s(C2741c c2741c, String str) {
        if (c2741c == null || str == null) {
            return null;
        }
        return r.g(str, c2741c.j());
    }

    public void A(String str) {
        this.g = str;
    }

    public void B(String str) {
        this.h = str;
    }

    public byte[] C() {
        try {
            int a = a();
            boolean z = (a & 1) != 0;
            byte[] bArr = null;
            String b = z ? null : AbstractC2739a.b();
            String l2 = l();
            byte[] bytes = (l2 == null || l2.length() == 0) ? null : z ? l2.getBytes("UTF-16LE") : l2.getBytes(b);
            int length = bytes != null ? bytes.length : 0;
            String u = u();
            byte[] bytes2 = (u == null || u.length() == 0) ? null : z ? u.getBytes("UTF-16LE") : u.toUpperCase().getBytes(b);
            int length2 = bytes2 != null ? bytes2.length : 0;
            String v = v();
            if (v != null && v.length() != 0) {
                bArr = z ? v.getBytes("UTF-16LE") : v.toUpperCase().getBytes(b);
            }
            int length3 = bArr != null ? bArr.length : 0;
            byte[] m2 = m();
            int length4 = m2 != null ? m2.length : 0;
            byte[] r = r();
            int length5 = r != null ? r.length : 0;
            byte[] t = t();
            byte[] bArr2 = new byte[length + 64 + length2 + length3 + length4 + length5 + (t != null ? t.length : 0)];
            System.arraycopy(AbstractC2739a.b, 0, bArr2, 0, 8);
            AbstractC2739a.h(bArr2, 8, 3);
            AbstractC2739a.g(bArr2, 12, 64, m2);
            int i = length4 + 64;
            AbstractC2739a.g(bArr2, 20, i, r);
            int i2 = i + length5;
            AbstractC2739a.g(bArr2, 28, i2, bytes);
            int i3 = i2 + length;
            AbstractC2739a.g(bArr2, 36, i3, bytes2);
            int i4 = i3 + length2;
            AbstractC2739a.g(bArr2, 44, i4, bArr);
            AbstractC2739a.g(bArr2, 52, i4 + length3, t);
            AbstractC2739a.h(bArr2, 60, a);
            return bArr2;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public String l() {
        return this.f;
    }

    public byte[] m() {
        return this.d;
    }

    public byte[] p() {
        return this.i;
    }

    public byte[] r() {
        return this.e;
    }

    public byte[] t() {
        return this.j;
    }

    public String toString() {
        String str;
        String str2;
        String u = u();
        String l2 = l();
        String v = v();
        byte[] m2 = m();
        byte[] r = r();
        byte[] t = t();
        StringBuilder sb = new StringBuilder();
        sb.append("Type3Message[domain=");
        sb.append(l2);
        sb.append(",user=");
        sb.append(u);
        sb.append(",workstation=");
        sb.append(v);
        sb.append(",lmResponse=");
        String str3 = "null";
        if (m2 == null) {
            str = "null";
        } else {
            str = "<" + m2.length + " bytes>";
        }
        sb.append(str);
        sb.append(",ntResponse=");
        if (r == null) {
            str2 = "null";
        } else {
            str2 = "<" + r.length + " bytes>";
        }
        sb.append(str2);
        sb.append(",sessionKey=");
        if (t != null) {
            str3 = "<" + t.length + " bytes>";
        }
        sb.append(str3);
        sb.append(",flags=0x");
        sb.append(C2896d.c(a(), 8));
        sb.append("]");
        return sb.toString();
    }

    public String u() {
        return this.g;
    }

    public String v() {
        return this.h;
    }

    public void w(String str) {
        this.f = str;
    }

    public void x(byte[] bArr) {
        this.d = bArr;
    }

    public void y(byte[] bArr) {
        this.e = bArr;
    }

    public void z(byte[] bArr) {
        this.j = bArr;
    }
}
