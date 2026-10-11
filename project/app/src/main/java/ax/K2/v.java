/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import ax.B2.i;
import ax.B2.m;
import ax.B2.r;
import ax.Gb.g;
import ax.Gb.l;
import ax.K2.t;
import ax.K2.u;
import ax.Lb.f;
import java.util.List;

public final class v {
    public static final a u = new a(null);
    private static final String v;
    public static final ax.x.a<List<Object>, List<Object>> w;
    public final String a;
    public r b;
    public String c;
    public String d;
    public androidx.work.b e;
    public androidx.work.b f;
    public long g;
    public long h;
    public long i;
    public ax.B2.b j;
    public int k;
    public ax.B2.a l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public m r;
    private int s;
    private final int t;

    static {
        String string = ax.B2.i.i("WorkSpec");
        ax.Gb.l.e(string, "tagWithPrefix(\"WorkSpec\")");
        v = string;
        w = new u();
    }

    public v(String string, r r8, String string2, String string3, androidx.work.b b8, androidx.work.b b9, long l8, long l9, long l10, ax.B2.b b10, int n8, ax.B2.a a8, long l11, long l12, long l13, long l14, boolean bl, m m8, int n9, int n10) {
        ax.Gb.l.f(string, "id");
        ax.Gb.l.f((Object)r8, "state");
        ax.Gb.l.f(string2, "workerClassName");
        ax.Gb.l.f(b8, "input");
        ax.Gb.l.f(b9, "output");
        ax.Gb.l.f(b10, "constraints");
        ax.Gb.l.f((Object)a8, "backoffPolicy");
        ax.Gb.l.f((Object)m8, "outOfQuotaPolicy");
        this.a = string;
        this.b = r8;
        this.c = string2;
        this.d = string3;
        this.e = b8;
        this.f = b9;
        this.g = l8;
        this.h = l9;
        this.i = l10;
        this.j = b10;
        this.k = n8;
        this.l = a8;
        this.m = l11;
        this.n = l12;
        this.o = l13;
        this.p = l14;
        this.q = bl;
        this.r = m8;
        this.s = n9;
        this.t = n10;
    }

    public /* synthetic */ v(String string, r r8, String string2, String string3, androidx.work.b b8, androidx.work.b b9, long l8, long l9, long l10, ax.B2.b b10, int n8, ax.B2.a a8, long l11, long l12, long l13, long l14, boolean bl, m m8, int n9, int n10, int n11, g g8) {
        if ((n11 & 2) != 0) {
            r8 = ax.B2.r.q;
        }
        if ((n11 & 8) != 0) {
            string3 = null;
        }
        if ((n11 & 0x10) != 0) {
            b8 = androidx.work.b.c;
            ax.Gb.l.e(b8, "EMPTY");
        }
        if ((n11 & 0x20) != 0) {
            b9 = androidx.work.b.c;
            ax.Gb.l.e(b9, "EMPTY");
        }
        if ((n11 & 0x40) != 0) {
            l8 = 0L;
        }
        if ((n11 & 0x80) != 0) {
            l9 = 0L;
        }
        if ((n11 & 0x100) != 0) {
            l10 = 0L;
        }
        if ((n11 & 0x200) != 0) {
            b10 = ax.B2.b.j;
        }
        if ((n11 & 0x400) != 0) {
            n8 = 0;
        }
        if ((n11 & 0x800) != 0) {
            a8 = ax.B2.a.q;
        }
        if ((n11 & 0x1000) != 0) {
            l11 = 30000L;
        }
        if ((n11 & 0x2000) != 0) {
            l12 = 0L;
        }
        if ((n11 & 0x4000) != 0) {
            l13 = 0L;
        }
        if ((0x8000 & n11) != 0) {
            l14 = -1L;
        }
        if ((0x10000 & n11) != 0) {
            bl = false;
        }
        if ((0x20000 & n11) != 0) {
            m8 = ax.B2.m.q;
        }
        if ((0x40000 & n11) != 0) {
            n9 = 0;
        }
        if ((n11 & 0x80000) != 0) {
            n10 = 0;
        }
        this(string, r8, string2, string3, b8, b9, l8, l9, l10, b10, n8, a8, l11, l12, l13, l14, bl, m8, n9, n10);
    }

    public v(String string, v v8) {
        ax.Gb.l.f(string, "newId");
        ax.Gb.l.f(v8, "other");
        String string2 = v8.c;
        this(string, v8.b, string2, v8.d, new androidx.work.b(v8.e), new androidx.work.b(v8.f), v8.g, v8.h, v8.i, new ax.B2.b(v8.j), v8.k, v8.l, v8.m, v8.n, v8.o, v8.p, v8.q, v8.r, v8.s, 0, 524288, null);
    }

    public v(String string, String string2) {
        ax.Gb.l.f(string, "id");
        ax.Gb.l.f(string2, "workerClassName_");
        this(string, null, string2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
    }

    public static /* synthetic */ v c(v v8, String string, r r8, String string2, String string3, androidx.work.b b8, androidx.work.b b9, long l8, long l9, long l10, ax.B2.b b10, int n8, ax.B2.a a8, long l11, long l12, long l13, long l14, boolean bl, m m8, int n9, int n10, int n11, Object object) {
        block19: {
            if ((n11 & 1) != 0) {
                string = v8.a;
            }
            if ((n11 & 2) != 0) {
                r8 = v8.b;
            }
            if ((n11 & 4) != 0) {
                string2 = v8.c;
            }
            if ((n11 & 8) != 0) {
                string3 = v8.d;
            }
            if ((n11 & 0x10) != 0) {
                b8 = v8.e;
            }
            if ((n11 & 0x20) != 0) {
                b9 = v8.f;
            }
            if ((n11 & 0x40) != 0) {
                l8 = v8.g;
            }
            if ((n11 & 0x80) != 0) {
                l9 = v8.h;
            }
            if ((n11 & 0x100) != 0) {
                l10 = v8.i;
            }
            if ((n11 & 0x200) != 0) {
                b10 = v8.j;
            }
            if ((n11 & 0x400) != 0) {
                n8 = v8.k;
            }
            if ((n11 & 0x800) != 0) {
                a8 = v8.l;
            }
            if ((n11 & 0x1000) != 0) {
                l11 = v8.m;
            }
            if ((n11 & 0x2000) != 0) {
                l12 = v8.n;
            }
            if ((n11 & 0x4000) != 0) {
                l13 = v8.o;
            }
            if ((n11 & 0x8000) != 0) {
                l14 = v8.p;
            }
            if ((n11 & 0x10000) != 0) {
                bl = v8.q;
            }
            if ((n11 & 0x20000) != 0) {
                m8 = v8.r;
            }
            if ((n11 & 0x40000) != 0) {
                n9 = v8.s;
            }
            if ((n11 & 0x80000) == 0) break block19;
            n10 = v8.t;
        }
        return v8.b(string, r8, string2, string3, b8, b9, l8, l9, l10, b10, n8, a8, l11, l12, l13, l14, bl, m8, n9, n10);
    }

    public final long a() {
        if (this.g()) {
            long l8 = this.l == ax.B2.a.c0 ? this.m * (long)this.k : (long)Math.scalb(this.m, this.k - 1);
            return this.n + ax.Lb.f.e(l8, 18000000L);
        }
        boolean bl = this.h();
        long l9 = 0L;
        if (bl) {
            long l10;
            long l11;
            int n8 = this.s;
            long l12 = l11 = this.n;
            if (n8 == 0) {
                l12 = l11 + this.g;
            }
            if ((l10 = this.i) != (l11 = this.h)) {
                if (n8 == 0) {
                    l9 = (long)-1 * l10;
                }
                return l12 + l11 + l9;
            }
            if (n8 != 0) {
                l9 = l11;
            }
            return l12 + l9;
        }
        long l13 = l9 = this.n;
        if (l9 == 0L) {
            l13 = System.currentTimeMillis();
        }
        return l13 + this.g;
    }

    public final v b(String string, r r8, String string2, String string3, androidx.work.b b8, androidx.work.b b9, long l8, long l9, long l10, ax.B2.b b10, int n8, ax.B2.a a8, long l11, long l12, long l13, long l14, boolean bl, m m8, int n9, int n10) {
        ax.Gb.l.f(string, "id");
        ax.Gb.l.f((Object)r8, "state");
        ax.Gb.l.f(string2, "workerClassName");
        ax.Gb.l.f(b8, "input");
        ax.Gb.l.f(b9, "output");
        ax.Gb.l.f(b10, "constraints");
        ax.Gb.l.f((Object)a8, "backoffPolicy");
        ax.Gb.l.f((Object)m8, "outOfQuotaPolicy");
        return new v(string, r8, string2, string3, b8, b9, l8, l9, l10, b10, n8, a8, l11, l12, l13, l14, bl, m8, n9, n10);
    }

    public final int d() {
        return this.t;
    }

    public final int e() {
        return this.s;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof v)) {
            return false;
        }
        object = (v)object;
        if (!ax.Gb.l.a(this.a, ((v)object).a)) {
            return false;
        }
        if (this.b != ((v)object).b) {
            return false;
        }
        if (!ax.Gb.l.a(this.c, ((v)object).c)) {
            return false;
        }
        if (!ax.Gb.l.a(this.d, ((v)object).d)) {
            return false;
        }
        if (!ax.Gb.l.a(this.e, ((v)object).e)) {
            return false;
        }
        if (!ax.Gb.l.a(this.f, ((v)object).f)) {
            return false;
        }
        if (this.g != ((v)object).g) {
            return false;
        }
        if (this.h != ((v)object).h) {
            return false;
        }
        if (this.i != ((v)object).i) {
            return false;
        }
        if (!ax.Gb.l.a(this.j, ((v)object).j)) {
            return false;
        }
        if (this.k != ((v)object).k) {
            return false;
        }
        if (this.l != ((v)object).l) {
            return false;
        }
        if (this.m != ((v)object).m) {
            return false;
        }
        if (this.n != ((v)object).n) {
            return false;
        }
        if (this.o != ((v)object).o) {
            return false;
        }
        if (this.p != ((v)object).p) {
            return false;
        }
        if (this.q != ((v)object).q) {
            return false;
        }
        if (this.r != ((v)object).r) {
            return false;
        }
        if (this.s != ((v)object).s) {
            return false;
        }
        return this.t == ((v)object).t;
    }

    public final boolean f() {
        return ax.Gb.l.a(ax.B2.b.j, this.j) ^ true;
    }

    public final boolean g() {
        return this.b == ax.B2.r.q && this.k > 0;
    }

    public final boolean h() {
        return this.h != 0L;
    }

    public int hashCode() {
        int n8;
        int n9 = this.a.hashCode();
        int n10 = ((Object)((Object)this.b)).hashCode();
        int n11 = this.c.hashCode();
        String string = this.d;
        int n12 = string == null ? 0 : string.hashCode();
        int n13 = this.e.hashCode();
        int n14 = this.f.hashCode();
        int n15 = ax.K2.t.a(this.g);
        int n16 = ax.K2.t.a(this.h);
        int n17 = ax.K2.t.a(this.i);
        int n18 = this.j.hashCode();
        int n19 = this.k;
        int n20 = ((Object)((Object)this.l)).hashCode();
        int n21 = ax.K2.t.a(this.m);
        int n22 = ax.K2.t.a(this.n);
        int n23 = ax.K2.t.a(this.o);
        int n24 = ax.K2.t.a(this.p);
        int n25 = n8 = this.q;
        if (n8 != 0) {
            n25 = 1;
        }
        return ((((((((((((((((((n9 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n20) * 31 + n21) * 31 + n22) * 31 + n23) * 31 + n24) * 31 + n25) * 31 + ((Object)((Object)this.r)).hashCode()) * 31 + this.s) * 31 + this.t;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{WorkSpec: ");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b {
        public String a;
        public r b;

        public b(String string, r r8) {
            ax.Gb.l.f(string, "id");
            ax.Gb.l.f((Object)r8, "state");
            this.a = string;
            this.b = r8;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            if (!ax.Gb.l.a(this.a, ((b)object).a)) {
                return false;
            }
            return this.b == ((b)object).b;
        }

        public int hashCode() {
            return this.a.hashCode() * 31 + ((Object)((Object)this.b)).hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IdAndState(id=");
            stringBuilder.append(this.a);
            stringBuilder.append(", state=");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}

