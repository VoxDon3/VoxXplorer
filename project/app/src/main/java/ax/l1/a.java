/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import ax.P0.N;
import ax.P0.P;
import ax.P0.v;
import ax.S0.d0;
import ax.S0.h;
import ax.S0.u;
import ax.i1.F;
import ax.j1.d;
import ax.j1.e;
import ax.l1.D;
import ax.l1.E;
import ax.l1.c;
import ax.r7.F;
import ax.r7.H;
import ax.r7.M;
import ax.r7.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a
extends c {
    private final ax.m1.e i;
    private final long j;
    private final long k;
    private final long l;
    private final int m;
    private final int n;
    private final float o;
    private final float p;
    private final z<a> q;
    private final h r;
    private float s;
    private int t;
    private int u;
    private long v;
    private d w;
    private long x;

    protected a(P p8, int[] nArray, int n8, ax.m1.e e8, long l8, long l9, long l10, int n9, int n10, float f8, float f9, List<a> list, h h8) {
        super(p8, nArray, n8);
        if (l10 < l8) {
            ax.S0.u.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            l10 = l8;
        }
        this.i = e8;
        this.j = l8 * 1000L;
        this.k = l9 * 1000L;
        this.l = l10 * 1000L;
        this.m = n9;
        this.n = n10;
        this.o = f8;
        this.p = f9;
        this.q = z.u(list);
        this.r = h8;
        this.s = 1.0f;
        this.u = 0;
        this.v = -9223372036854775807L;
        this.x = -2147483647L;
    }

    private static z<z<a>> A(D.a[] object) {
        Object object2;
        Object object3;
        int n8;
        ArrayList<z.a<a>> arrayList = new ArrayList<z.a<a>>();
        int n9 = 0;
        for (n8 = 0; n8 < ((D.a[])object).length; ++n8) {
            object3 = object[n8];
            if (object3 != null && ((D.a)object3).b.length > 1) {
                object3 = z.r();
                ((z.a)object3).h(new a(0L, 0L));
                arrayList.add((z.a<a>)object3);
                continue;
            }
            arrayList.add(null);
        }
        long[][] lArray = ax.l1.a.F(object);
        int[] nArray = new int[lArray.length];
        object3 = new long[lArray.length];
        for (n8 = 0; n8 < lArray.length; ++n8) {
            object2 = lArray[n8];
            long l8 = ((long[])object2).length == 0 ? 0L : object2[0];
            object3[n8] = (z.a)l8;
        }
        ax.l1.a.x(arrayList, object3);
        object2 = ax.l1.a.G(lArray);
        for (n8 = 0; n8 < object2.size(); ++n8) {
            int n10;
            int n11 = (Integer)object2.get(n8);
            nArray[n11] = n10 = nArray[n11] + 1;
            object3[n11] = (z.a)lArray[n11][n10];
            ax.l1.a.x(arrayList, object3);
        }
        for (n8 = 0; n8 < ((D.a[])object).length; ++n8) {
            if (arrayList.get(n8) == null) continue;
            object3[n8] = object3[n8] * 2L;
        }
        ax.l1.a.x(arrayList, object3);
        object3 = z.r();
        for (n8 = n9; n8 < arrayList.size(); ++n8) {
            object = (z.a)arrayList.get(n8);
            object = object == null ? z.z() : object.k();
            ((z.a)object3).h(object);
        }
        return ((z.a)object3).k();
    }

    private long B(long l8) {
        int n8;
        l8 = this.H(l8);
        if (this.q.isEmpty()) {
            return l8;
        }
        for (n8 = 1; n8 < this.q.size() - 1 && ((a)this.q.get((int)n8)).a < l8; ++n8) {
        }
        a a8 = (a)this.q.get(n8 - 1);
        a a9 = (a)this.q.get(n8);
        long l9 = a8.a;
        float f8 = (float)(l8 - l9) / (float)(a9.a - l9);
        l8 = a8.b;
        return l8 + (long)(f8 * (float)(a9.b - l8));
    }

    private long C(List<? extends d> object) {
        long l8;
        if (object.isEmpty()) {
            return -9223372036854775807L;
        }
        object = F.e(object);
        long l9 = ((ax.j1.b)object).g;
        if (l9 != -9223372036854775807L && (l8 = ((ax.j1.b)object).h) != -9223372036854775807L) {
            return l8 - l9;
        }
        return -9223372036854775807L;
    }

    private long E(e[] object, List<? extends d> list) {
        int n8 = this.t;
        if (n8 < ((e[])object).length && object[n8].next()) {
            object = object[this.t];
            return object.b() - object.a();
        }
        for (e e8 : object) {
            if (!e8.next()) continue;
            return e8.b() - e8.a();
        }
        return this.C(list);
    }

    private static long[][] F(D.a[] aArray) {
        long[][] lArrayArray = new long[aArray.length][];
        for (int i8 = 0; i8 < aArray.length; ++i8) {
            Object[] objectArray;
            D.a a8 = aArray[i8];
            if (a8 == null) {
                lArrayArray[i8] = new long[0];
                continue;
            }
            lArrayArray[i8] = new long[a8.b.length];
            for (int i9 = 0; i9 < (objectArray = a8.b).length; ++i9) {
                long l8 = a8.a.b((int)objectArray[i9]).j;
                objectArray = lArrayArray[i8];
                long l9 = l8;
                if (l8 == -1L) {
                    l9 = 0L;
                }
                objectArray[i9] = (int)l9;
            }
            Arrays.sort(lArrayArray[i8]);
        }
        return lArrayArray;
    }

    private static z<Integer> G(long[][] lArray) {
        H<Double, Integer> h8 = M.c().a().e();
        for (int i8 = 0; i8 < lArray.length; ++i8) {
            double d8;
            Object[] objectArray = lArray[i8];
            if (objectArray.length <= 1) continue;
            int n8 = objectArray.length;
            objectArray = new double[n8];
            int n9 = 0;
            while (true) {
                long[] lArray2 = lArray[i8];
                int n10 = lArray2.length;
                d8 = 0.0;
                if (n9 >= n10) break;
                long l8 = lArray2[n9];
                if (l8 != -1L) {
                    d8 = Math.log(l8);
                }
                objectArray[n9] = (long)d8;
                ++n9;
            }
            long l9 = objectArray[--n8] - objectArray[0];
            n9 = 0;
            while (n9 < n8) {
                d8 = objectArray[n9];
                long l10 = objectArray[++n9];
                d8 = l9 == 0.0 ? 1.0 : ((d8 + l10) * 0.5 - objectArray[0]) / l9;
                h8.put(d8, i8);
            }
        }
        return z.u(h8.values());
    }

    private long H(long l8) {
        long l9;
        this.x = l9 = this.i.f();
        l9 = (long)((float)l9 * this.o);
        long l10 = this.i.a();
        if (l10 != -9223372036854775807L && l8 != -9223372036854775807L) {
            float f8 = l8;
            float f9 = Math.max(f8 / this.s - (float)l10, 0.0f);
            return (long)((float)l9 * f9 / f8);
        }
        return (long)((float)l9 / this.s);
    }

    private long I(long l8, long l9) {
        if (l8 == -9223372036854775807L) {
            return this.j;
        }
        long l10 = l8;
        if (l9 != -9223372036854775807L) {
            l10 = l8 - l9;
        }
        return Math.min((long)((float)l10 * this.p), this.j);
    }

    private static void x(List<z.a<a>> list, long[] lArray) {
        long l8 = 0L;
        int n8 = 0;
        int n9 = 0;
        while (true) {
            if (n9 >= lArray.length) break;
            l8 += lArray[n9];
            ++n9;
        }
        for (int i8 = n8; i8 < list.size(); ++i8) {
            z.a<a> a8 = list.get(i8);
            if (a8 == null) continue;
            a8.h(new a(l8, lArray[i8]));
        }
    }

    private int z(long l8, long l9) {
        l9 = this.B(l9);
        int n8 = 0;
        for (int i8 = 0; i8 < this.b; ++i8) {
            if (l8 != Long.MIN_VALUE && this.a(i8, l8)) continue;
            v v8 = this.h(i8);
            if (this.y(v8, v8.j, l9)) {
                return i8;
            }
            n8 = i8;
        }
        return n8;
    }

    protected long D() {
        return this.l;
    }

    protected boolean J(long l8, List<? extends d> list) {
        long l9 = this.v;
        return l9 == -9223372036854775807L || l8 - l9 >= 1000L || !list.isEmpty() && !F.e(list).equals(this.w);
        {
        }
    }

    @Override
    public void c(long l8, long l9, long l10, List<? extends d> object, e[] object2) {
        int n8;
        int n9;
        int n10;
        block6: {
            block7: {
                int n11;
                long l11 = this.r.b();
                l8 = this.E((e[])object2, (List<? extends d>)object);
                n10 = this.u;
                if (n10 == 0) {
                    this.u = 1;
                    this.t = this.z(l11, l8);
                    return;
                }
                n9 = this.t;
                n8 = object.isEmpty() ? -1 : this.v(F.e(object).d);
                if (n8 != -1) {
                    n10 = F.e(object).e;
                    n9 = n8;
                }
                n8 = n11 = this.z(l11, l8);
                if (n11 == n9) break block6;
                n8 = n11;
                if (this.a(n9, l11)) break block6;
                object = this.h(n9);
                object2 = this.h(n11);
                l8 = this.I(l10, l8);
                int n12 = object2.j;
                int n13 = ((v)object).j;
                if (n12 > n13 && l9 < l8) break block7;
                n8 = n11;
                if (n12 >= n13) break block6;
                n8 = n11;
                if (l9 < this.k) break block6;
            }
            n8 = n9;
        }
        if (n8 != n9) {
            n10 = 3;
        }
        this.u = n10;
        this.t = n8;
    }

    @Override
    public int d() {
        return this.t;
    }

    @Override
    public void f() {
        this.w = null;
    }

    @Override
    public void i() {
        this.v = -9223372036854775807L;
        this.w = null;
    }

    @Override
    public int k(long l8, List<? extends d> list) {
        long l9;
        long l10 = this.r.b();
        if (!this.J(l10, list)) {
            return list.size();
        }
        this.v = l10;
        Object object = list.isEmpty() ? null : F.e(list);
        this.w = object;
        boolean bl = list.isEmpty();
        if (bl) {
            return 0;
        }
        int n8 = list.size();
        long l11 = d0.n0(list.get((int)(n8 - 1)).g - l8, this.s);
        if (l11 >= (l9 = this.D())) {
            v v8 = this.h(this.z(l10, this.C(list)));
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9;
                int n10;
                d d8 = list.get(i8);
                object = d8.d;
                if (d0.n0(d8.g - l8, this.s) < l9 || ((v)object).j >= v8.j || (n10 = ((v)object).w) == -1 || n10 > this.n || (n9 = ((v)object).v) == -1 || n9 > this.m || n10 >= v8.w) continue;
                return i8;
            }
        }
        return n8;
    }

    @Override
    public int n() {
        return this.u;
    }

    @Override
    public void p(float f8) {
        this.s = f8;
    }

    @Override
    public Object q() {
        return null;
    }

    protected boolean y(v v8, int n8, long l8) {
        return (long)n8 <= l8;
    }

    public static final class a {
        public final long a;
        public final long b;

        public a(long l8, long l9) {
            this.a = l8;
            this.b = l9;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            return this.a == ((a)object).a && this.b == ((a)object).b;
        }

        public int hashCode() {
            return (int)this.a * 31 + (int)this.b;
        }
    }

    public static class b
    implements D.b {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final float f;
        private final float g;
        private final h h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public b(int n8, int n9, int n10, float f8) {
            this(n8, n9, n10, 1279, 719, f8, 0.75f, ax.S0.h.a);
        }

        public b(int n8, int n9, int n10, int n11, int n12, float f8, float f9, h h8) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = f8;
            this.g = f9;
            this.h = h8;
        }

        @Override
        public final D[] a(D.a[] aArray, ax.m1.e e8, F.b object, N dArray) {
            z z8 = ax.l1.a.A(aArray);
            dArray = new D[aArray.length];
            for (int i8 = 0; i8 < aArray.length; ++i8) {
                int[] nArray;
                object = aArray[i8];
                if (object == null || (nArray = ((D.a)object).b).length == 0) continue;
                object = nArray.length == 1 ? new E(((D.a)object).a, nArray[0], ((D.a)object).c) : this.b(((D.a)object).a, nArray, ((D.a)object).c, e8, (z)z8.get(i8));
                dArray[i8] = object;
            }
            return dArray;
        }

        protected a b(P p8, int[] nArray, int n8, ax.m1.e e8, z<a> z8) {
            return new a(p8, nArray, n8, e8, (long)this.a, (long)this.b, (long)this.c, this.d, this.e, this.f, this.g, z8, this.h);
        }
    }
}

