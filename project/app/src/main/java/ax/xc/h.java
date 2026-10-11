/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.i;
import ax.xc.F;
import ax.xc.b;
import ax.xc.e;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

public class h
implements Serializable,
Comparable<h> {
    public static final a e0 = new a(null);
    public static final h f0 = new h(new byte[0]);
    private transient int c0;
    private transient String d0;
    private final byte[] q;

    public h(byte[] byArray) {
        l.f(byArray, "data");
        this.q = byArray;
    }

    public static final h j(String string) {
        return e0.b(string);
    }

    public boolean A(int n8, h h8, int n9, int n10) {
        l.f(h8, "other");
        return h8.B(n9, this.p(), n8, n10);
    }

    public boolean B(int n8, byte[] byArray, int n9, int n10) {
        l.f(byArray, "other");
        return n8 >= 0 && n8 <= this.p().length - n10 && n9 >= 0 && n9 <= byArray.length - n10 && b.a(this.p(), n8, byArray, n9, n10);
    }

    public final void C(int n8) {
        this.c0 = n8;
    }

    public final void D(String string) {
        this.d0 = string;
    }

    public final h E() {
        return this.l("SHA-1");
    }

    public final h F() {
        return this.l("SHA-256");
    }

    public final int G() {
        return this.r();
    }

    public final boolean H(h h8) {
        l.f(h8, "prefix");
        return this.A(0, h8, 0, h8.G());
    }

    public h I() {
        for (int i8 = 0; i8 < this.p().length; ++i8) {
            byte by = this.p()[i8];
            if (by < 65 || by > 90) continue;
            byte[] byArray = this.p();
            byArray = Arrays.copyOf(byArray, byArray.length);
            l.e(byArray, "copyOf(this, size)");
            int n8 = i8 + 1;
            byArray[i8] = (byte)(by + 32);
            for (i8 = n8; i8 < byArray.length; ++i8) {
                n8 = byArray[i8];
                if (n8 < 65 || n8 > 90) continue;
                byArray[i8] = (byte)(n8 + 32);
            }
            return new h(byArray);
        }
        return this;
    }

    public byte[] J() {
        byte[] byArray = this.p();
        byArray = Arrays.copyOf(byArray, byArray.length);
        l.e(byArray, "copyOf(this, size)");
        return byArray;
    }

    public String K() {
        String string;
        String string2 = string = this.s();
        if (string == null) {
            string2 = F.b(this.u());
            this.D(string2);
        }
        return string2;
    }

    public void L(e e8, int n8, int n9) {
        l.f(e8, "buffer");
        ax.yc.b.d(this, e8, n8, n9);
    }

    public String d() {
        return ax.xc.a.c(this.p(), null, 1, null);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof h && ((h)(object = (h)object)).G() == this.p().length && ((h)object).B(0, this.p(), 0, this.p().length);
    }

    public int h(h h8) {
        l.f(h8, "other");
        int n8 = this.G();
        int n9 = h8.G();
        int n10 = Math.min(n8, n9);
        for (int i8 = 0; i8 < n10; ++i8) {
            int n11;
            int n12 = this.n(i8) & 0xFF;
            if (n12 == (n11 = h8.n(i8) & 0xFF)) {
                continue;
            }
            if (n12 < n11) {
                return -1;
            }
            return 1;
        }
        if (n8 == n9) {
            return 0;
        }
        if (n8 < n9) {
            return -1;
        }
        return 1;
    }

    public int hashCode() {
        int n8 = this.q();
        if (n8 != 0) {
            return n8;
        }
        n8 = Arrays.hashCode(this.p());
        this.C(n8);
        return n8;
    }

    public h l(String object) {
        l.f(object, "algorithm");
        object = MessageDigest.getInstance((String)object);
        ((MessageDigest)object).update(this.q, 0, this.G());
        object = ((MessageDigest)object).digest();
        l.c(object);
        return new h((byte[])object);
    }

    public final byte n(int n8) {
        return this.w(n8);
    }

    public final byte[] p() {
        return this.q;
    }

    public final int q() {
        return this.c0;
    }

    public int r() {
        return this.p().length;
    }

    public final String s() {
        return this.d0;
    }

    public String t() {
        char[] cArray = new char[this.p().length * 2];
        byte[] byArray = this.p();
        int n8 = byArray.length;
        int n9 = 0;
        int n10 = 0;
        while (true) {
            int n11 = n10;
            if (n9 >= n8) break;
            byte by = byArray[n9];
            cArray[n11] = ax.yc.b.f()[by >> 4 & 0xF];
            n10 = n11 + 2;
            cArray[n11 + 1] = ax.yc.b.f()[by & 0xF];
            ++n9;
        }
        return ax.Ob.h.q(cArray);
    }

    public String toString() {
        if (this.p().length == 0) {
            return "[size=0]";
        }
        int n8 = ax.yc.b.a(this.p(), 64);
        if (n8 == -1) {
            if (this.p().length <= 64) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[hex=");
                stringBuilder.append(this.t());
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[size=");
            stringBuilder.append(this.p().length);
            stringBuilder.append(" hex=");
            n8 = b.e(this, 64);
            if (n8 <= this.p().length) {
                if (n8 >= 0) {
                    h h8 = n8 == this.p().length ? this : new h(i.k(this.p(), 0, n8));
                    stringBuilder.append(h8.t());
                    stringBuilder.append("\u2026]");
                    return stringBuilder.toString();
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("endIndex > length(");
            stringBuilder2.append(this.p().length);
            stringBuilder2.append(')');
            throw new IllegalArgumentException(stringBuilder2.toString().toString());
        }
        CharSequence charSequence = this.K();
        String string = ((String)charSequence).substring(0, n8);
        l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        string = ax.Ob.h.D(ax.Ob.h.D(ax.Ob.h.D(string, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        if (n8 < ((String)charSequence).length()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("[size=");
            ((StringBuilder)charSequence).append(this.p().length);
            ((StringBuilder)charSequence).append(" text=");
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append("\u2026]");
            return ((StringBuilder)charSequence).toString();
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("[text=");
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(']');
        return ((StringBuilder)charSequence).toString();
    }

    public byte[] u() {
        return this.p();
    }

    public byte w(int n8) {
        return this.p()[n8];
    }

    public final h x() {
        return this.l("MD5");
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public static /* synthetic */ h f(a a8, byte[] byArray, int n8, int n9, int n10, Object object) {
            if ((n10 & 1) != 0) {
                n8 = 0;
            }
            if ((n10 & 2) != 0) {
                n9 = b.c();
            }
            return a8.e(byArray, n8, n9);
        }

        public final h a(String object) {
            l.f(object, "<this>");
            object = ax.xc.a.a((String)object);
            if (object != null) {
                return new h((byte[])object);
            }
            return null;
        }

        public final h b(String string) {
            l.f(string, "<this>");
            if (string.length() % 2 == 0) {
                int n8 = string.length() / 2;
                byte[] byArray = new byte[n8];
                for (int i8 = 0; i8 < n8; ++i8) {
                    int n9 = i8 * 2;
                    byArray[i8] = (byte)((ax.yc.b.b(string.charAt(n9)) << 4) + ax.yc.b.b(string.charAt(n9 + 1)));
                }
                return new h(byArray);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected hex string: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }

        public final h c(String object, Charset charset) {
            l.f(object, "<this>");
            l.f(charset, "charset");
            object = ((String)object).getBytes(charset);
            l.e(object, "this as java.lang.String).getBytes(charset)");
            return new h((byte[])object);
        }

        public final h d(String string) {
            l.f(string, "<this>");
            h h8 = new h(F.a(string));
            h8.D(string);
            return h8;
        }

        public final h e(byte[] byArray, int n8, int n9) {
            l.f(byArray, "<this>");
            n9 = b.f(byArray, n9);
            b.b(byArray.length, n8, n9);
            return new h(i.k(byArray, n8, n9 + n8));
        }
    }
}

