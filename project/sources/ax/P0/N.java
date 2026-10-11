package ax.P0;

import android.net.Uri;
import android.util.Pair;
import ax.P0.C0893b;
import ax.P0.C0915y;
import ax.S0.C0968a;
import ax.S0.d0;
import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class N {
    public static final N a = new a();
    private static final String b = d0.G0(0);
    private static final String c = d0.G0(1);
    private static final String d = d0.G0(2);

    class a extends N {
        a() {
        }

        @Override // ax.P0.N
        public int b(Object obj) {
            return -1;
        }

        @Override // ax.P0.N
        public b g(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // ax.P0.N
        public int i() {
            return 0;
        }

        @Override // ax.P0.N
        public Object m(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // ax.P0.N
        public c o(int i, c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // ax.P0.N
        public int p() {
            return 0;
        }
    }

    public static final class b {
        private static final String h = d0.G0(0);
        private static final String i = d0.G0(1);
        private static final String j = d0.G0(2);
        private static final String k = d0.G0(3);
        private static final String l = d0.G0(4);
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public C0893b g = C0893b.g;

        public int a(int i2) {
            return this.g.a(i2).b;
        }

        public long b(int i2, int i3) {
            C0893b.a a = this.g.a(i2);
            if (a.b != -1) {
                return a.g[i3];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.g.b;
        }

        public int d(long j2) {
            return this.g.b(j2, this.d);
        }

        public int e(long j2) {
            return this.g.c(j2, this.d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && Objects.equals(this.g, bVar.g)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int i2) {
            return this.g.a(i2).a;
        }

        public long g() {
            return this.g.c;
        }

        public int h(int i2, int i3) {
            C0893b.a a = this.g.a(i2);
            if (a.b != -1) {
                return a.f[i3];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j2 = this.d;
            int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.e;
            return ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
        }

        public long i(int i2) {
            return this.g.a(i2).i;
        }

        public long j() {
            return d0.E1(this.d);
        }

        public long k() {
            return this.d;
        }

        public int l(int i2) {
            return this.g.a(i2).c();
        }

        public int m(int i2, int i3) {
            return this.g.a(i2).d(i3);
        }

        public long n() {
            return d0.E1(this.e);
        }

        public long o() {
            return this.e;
        }

        public int p() {
            return this.g.e;
        }

        public boolean q(int i2) {
            return !this.g.a(i2).e();
        }

        public boolean r(int i2) {
            return i2 == c() - 1 && this.g.d(i2);
        }

        public boolean s(int i2) {
            return this.g.a(i2).j;
        }

        public b t(Object obj, Object obj2, int i2, long j2, long j3) {
            return u(obj, obj2, i2, j2, j3, C0893b.g, false);
        }

        public b u(Object obj, Object obj2, int i2, long j2, long j3, C0893b c0893b, boolean z) {
            this.a = obj;
            this.b = obj2;
            this.c = i2;
            this.d = j2;
            this.e = j3;
            this.g = c0893b;
            this.f = z;
            return this;
        }
    }

    public static final class c {

        @Deprecated
        public Object b;
        public Object d;
        public long e;
        public long f;
        public long g;
        public boolean h;
        public boolean i;
        public C0915y.g j;
        public boolean k;
        public long l;
        public long m;
        public int n;
        public int o;
        public long p;
        public static final Object q = new Object();
        private static final Object r = new Object();
        private static final C0915y s = new C0915y.c().c("androidx.media3.common.Timeline").f(Uri.EMPTY).a();
        private static final String t = d0.G0(1);
        private static final String u = d0.G0(2);
        private static final String v = d0.G0(3);
        private static final String w = d0.G0(4);
        private static final String x = d0.G0(5);
        private static final String y = d0.G0(6);
        private static final String z = d0.G0(7);
        private static final String A = d0.G0(8);
        private static final String B = d0.G0(9);
        private static final String C = d0.G0(10);
        private static final String D = d0.G0(11);
        private static final String E = d0.G0(12);
        private static final String F = d0.G0(13);
        public Object a = q;
        public C0915y c = s;

        public long a() {
            return d0.i0(this.g);
        }

        public long b() {
            return d0.E1(this.l);
        }

        public long c() {
            return this.l;
        }

        public long d() {
            return d0.E1(this.m);
        }

        public long e() {
            return this.p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (Objects.equals(this.a, cVar.a) && Objects.equals(this.c, cVar.c) && Objects.equals(this.d, cVar.d) && Objects.equals(this.j, cVar.j) && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o && this.p == cVar.p) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.j != null;
        }

        public c g(Object obj, C0915y c0915y, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, C0915y.g gVar, long j4, long j5, int i, int i2, long j6) {
            C0915y.h hVar;
            this.a = obj;
            this.c = c0915y != null ? c0915y : s;
            this.b = (c0915y == null || (hVar = c0915y.b) == null) ? null : hVar.h;
            this.d = obj2;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = z2;
            this.i = z3;
            this.j = gVar;
            this.l = j4;
            this.m = j5;
            this.n = i;
            this.o = i2;
            this.p = j6;
            this.k = false;
            return this;
        }

        public int hashCode() {
            int hashCode = (((217 + this.a.hashCode()) * 31) + this.c.hashCode()) * 31;
            Object obj = this.d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C0915y.g gVar = this.j;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j = this.e;
            int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.g;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
            long j4 = this.l;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.m;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
            long j6 = this.p;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    protected N() {
    }

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, b bVar, c cVar, int i2, boolean z) {
        int i3 = f(i, bVar).c;
        if (n(i3, cVar).o != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return n(e, cVar).n;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int c2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        if (n.p() != p() || n.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i = 0; i < p(); i++) {
            if (!n(i, cVar).equals(n.n(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, bVar, true).equals(n.g(i2, bVar2, true))) {
                return false;
            }
        }
        int a2 = a(true);
        if (a2 != n.a(true) || (c2 = c(true)) != n.c(true)) {
            return false;
        }
        while (a2 != c2) {
            int e = e(a2, 0, true);
            if (e != n.e(a2, 0, true)) {
                return false;
            }
            a2 = e;
        }
        return true;
    }

    public final b f(int i, b bVar) {
        return g(i, bVar, false);
    }

    public abstract b g(int i, b bVar, boolean z);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p = 217 + p();
        for (int i = 0; i < p(); i++) {
            p = (p * 31) + n(i, cVar).hashCode();
        }
        int i2 = (p * 31) + i();
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, bVar, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            i2 = (i2 * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return i2;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i, long j) {
        return (Pair) C0968a.e(k(cVar, bVar, i, j, 0L));
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i, long j, long j2) {
        C0968a.c(i, 0, p());
        o(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.c();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.n;
        f(i2, bVar);
        while (i2 < cVar.o && bVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, bVar).e > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, bVar, true);
        long j3 = j - bVar.e;
        long j4 = bVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(C0968a.e(bVar.b), Long.valueOf(Math.max(0L, j3)));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i);

    public final c n(int i, c cVar) {
        return o(i, cVar, 0L);
    }

    public abstract c o(int i, c cVar, long j);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i, b bVar, c cVar, int i2, boolean z) {
        return d(i, bVar, cVar, i2, z) == -1;
    }
}
