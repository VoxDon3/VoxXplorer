package ax.xc;

import ax.tb.C3133i;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class h implements Serializable, Comparable<h> {
    public static final a e0 = new a(null);
    public static final h f0 = new h(new byte[0]);
    private transient int c0;
    private transient String d0;
    private final byte[] q;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public static /* synthetic */ h f(a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = C3484b.c();
            }
            return aVar.e(bArr, i, i2);
        }

        public final h a(String str) {
            ax.Gb.l.f(str, "<this>");
            byte[] a = C3483a.a(str);
            if (a != null) {
                return new h(a);
            }
            return null;
        }

        public final h b(String str) {
            int e;
            int e2;
            ax.Gb.l.f(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                e = ax.yc.b.e(str.charAt(i2));
                e2 = ax.yc.b.e(str.charAt(i2 + 1));
                bArr[i] = (byte) ((e << 4) + e2);
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            ax.Gb.l.f(str, "<this>");
            ax.Gb.l.f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            ax.Gb.l.e(bytes, "this as java.lang.String).getBytes(charset)");
            return new h(bytes);
        }

        public final h d(String str) {
            ax.Gb.l.f(str, "<this>");
            h hVar = new h(F.a(str));
            hVar.D(str);
            return hVar;
        }

        public final h e(byte[] bArr, int i, int i2) {
            ax.Gb.l.f(bArr, "<this>");
            int f = C3484b.f(bArr, i2);
            C3484b.b(bArr.length, i, f);
            return new h(C3133i.k(bArr, i, f + i));
        }

        private a() {
        }
    }

    public h(byte[] bArr) {
        ax.Gb.l.f(bArr, "data");
        this.q = bArr;
    }

    public static final h j(String str) {
        return e0.b(str);
    }

    public boolean A(int i, h hVar, int i2, int i3) {
        ax.Gb.l.f(hVar, "other");
        return hVar.B(i2, p(), i, i3);
    }

    public boolean B(int i, byte[] bArr, int i2, int i3) {
        ax.Gb.l.f(bArr, "other");
        return i >= 0 && i <= p().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C3484b.a(p(), i, bArr, i2, i3);
    }

    public final void C(int i) {
        this.c0 = i;
    }

    public final void D(String str) {
        this.d0 = str;
    }

    public final h E() {
        return l("SHA-1");
    }

    public final h F() {
        return l("SHA-256");
    }

    public final int G() {
        return r();
    }

    public final boolean H(h hVar) {
        ax.Gb.l.f(hVar, "prefix");
        return A(0, hVar, 0, hVar.G());
    }

    public h I() {
        for (int i = 0; i < p().length; i++) {
            byte b = p()[i];
            if (b >= 65 && b <= 90) {
                byte[] p = p();
                byte[] copyOf = Arrays.copyOf(p, p.length);
                ax.Gb.l.e(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new h(copyOf);
            }
        }
        return this;
    }

    public byte[] J() {
        byte[] p = p();
        byte[] copyOf = Arrays.copyOf(p, p.length);
        ax.Gb.l.e(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public String K() {
        String s = s();
        if (s != null) {
            return s;
        }
        String b = F.b(u());
        D(b);
        return b;
    }

    public void L(C3487e c3487e, int i, int i2) {
        ax.Gb.l.f(c3487e, "buffer");
        ax.yc.b.d(this, c3487e, i, i2);
    }

    public String d() {
        return C3483a.c(p(), null, 1, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.G() == p().length && hVar.B(0, p(), 0, p().length)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        ax.Gb.l.f(hVar, "other");
        int G = G();
        int G2 = hVar.G();
        int min = Math.min(G, G2);
        for (int i = 0; i < min; i++) {
            int n = n(i) & 255;
            int n2 = hVar.n(i) & 255;
            if (n != n2) {
                return n < n2 ? -1 : 1;
            }
        }
        if (G == G2) {
            return 0;
        }
        return G < G2 ? -1 : 1;
    }

    public int hashCode() {
        int q = q();
        if (q != 0) {
            return q;
        }
        int hashCode = Arrays.hashCode(p());
        C(hashCode);
        return hashCode;
    }

    public h l(String str) {
        ax.Gb.l.f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.q, 0, G());
        byte[] digest = messageDigest.digest();
        ax.Gb.l.c(digest);
        return new h(digest);
    }

    public final byte n(int i) {
        return w(i);
    }

    public final byte[] p() {
        return this.q;
    }

    public final int q() {
        return this.c0;
    }

    public int r() {
        return p().length;
    }

    public final String s() {
        return this.d0;
    }

    public String t() {
        char[] cArr = new char[p().length * 2];
        int i = 0;
        for (byte b : p()) {
            int i2 = i + 1;
            cArr[i] = ax.yc.b.f()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = ax.yc.b.f()[b & 15];
        }
        return ax.Ob.h.q(cArr);
    }

    public String toString() {
        int c;
        if (p().length == 0) {
            return "[size=0]";
        }
        c = ax.yc.b.c(p(), 64);
        if (c != -1) {
            String K = K();
            String substring = K.substring(0, c);
            ax.Gb.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String D = ax.Ob.h.D(ax.Ob.h.D(ax.Ob.h.D(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (c >= K.length()) {
                return "[text=" + D + ']';
            }
            return "[size=" + p().length + " text=" + D + "…]";
        }
        if (p().length <= 64) {
            return "[hex=" + t() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(p().length);
        sb.append(" hex=");
        int e = C3484b.e(this, 64);
        if (e <= p().length) {
            if (e < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb.append((e == p().length ? this : new h(C3133i.k(p(), 0, e))).t());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + p().length + ')').toString());
    }

    public byte[] u() {
        return p();
    }

    public byte w(int i) {
        return p()[i];
    }

    public final h x() {
        return l("MD5");
    }
}
