package ax.l1;

import ax.P0.C0912v;
import ax.P0.N;
import ax.P0.P;
import ax.S0.C0987u;
import ax.S0.InterfaceC0975h;
import ax.S0.d0;
import ax.i1.InterfaceC2209F;
import ax.j1.AbstractC2306d;
import ax.j1.InterfaceC2307e;
import ax.l1.InterfaceC2445D;
import ax.r7.AbstractC2991z;
import ax.r7.L;
import ax.r7.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ax.l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2452a extends AbstractC2454c {
    private final ax.m1.e i;
    private final long j;
    private final long k;
    private final long l;
    private final int m;
    private final int n;
    private final float o;
    private final float p;
    private final AbstractC2991z<C0360a> q;
    private final InterfaceC0975h r;
    private float s;
    private int t;
    private int u;
    private long v;
    private AbstractC2306d w;
    private long x;

    /* renamed from: ax.l1.a$a, reason: collision with other inner class name */
    public static final class C0360a {
        public final long a;
        public final long b;

        public C0360a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0360a)) {
                return false;
            }
            C0360a c0360a = (C0360a) obj;
            return this.a == c0360a.a && this.b == c0360a.b;
        }

        public int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    /* renamed from: ax.l1.a$b */
    public static class b implements InterfaceC2445D.b {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final float f;
        private final float g;
        private final InterfaceC0975h h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.l1.InterfaceC2445D.b
        public final InterfaceC2445D[] a(InterfaceC2445D.a[] aVarArr, ax.m1.e eVar, InterfaceC2209F.b bVar, N n) {
            ax.m1.e eVar2;
            InterfaceC2445D b;
            AbstractC2991z A = C2452a.A(aVarArr);
            InterfaceC2445D[] interfaceC2445DArr = new InterfaceC2445D[aVarArr.length];
            int i = 0;
            while (i < aVarArr.length) {
                InterfaceC2445D.a aVar = aVarArr[i];
                if (aVar != null) {
                    int[] iArr = aVar.b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            b = new C2446E(aVar.a, iArr[0], aVar.c);
                            eVar2 = eVar;
                        } else {
                            eVar2 = eVar;
                            b = b(aVar.a, iArr, aVar.c, eVar2, (AbstractC2991z) A.get(i));
                        }
                        interfaceC2445DArr[i] = b;
                        i++;
                        eVar = eVar2;
                    }
                }
                eVar2 = eVar;
                i++;
                eVar = eVar2;
            }
            return interfaceC2445DArr;
        }

        protected C2452a b(P p, int[] iArr, int i, ax.m1.e eVar, AbstractC2991z<C0360a> abstractC2991z) {
            return new C2452a(p, iArr, i, eVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, abstractC2991z, this.h);
        }

        public b(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, InterfaceC0975h.a);
        }

        public b(int i, int i2, int i3, int i4, int i5, float f, float f2, InterfaceC0975h interfaceC0975h) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = f;
            this.g = f2;
            this.h = interfaceC0975h;
        }
    }

    protected C2452a(P p, int[] iArr, int i, ax.m1.e eVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List<C0360a> list, InterfaceC0975h interfaceC0975h) {
        super(p, iArr, i);
        long j4;
        if (j3 < j) {
            C0987u.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j;
        } else {
            j4 = j3;
        }
        this.i = eVar;
        this.j = j * 1000;
        this.k = j2 * 1000;
        this.l = j4 * 1000;
        this.m = i2;
        this.n = i3;
        this.o = f;
        this.p = f2;
        this.q = AbstractC2991z.u(list);
        this.r = interfaceC0975h;
        this.s = 1.0f;
        this.u = 0;
        this.v = -9223372036854775807L;
        this.x = -2147483647L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC2991z<AbstractC2991z<C0360a>> A(InterfaceC2445D.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2445D.a aVar : aVarArr) {
            if (aVar == null || aVar.b.length <= 1) {
                arrayList.add(null);
            } else {
                AbstractC2991z.a r = AbstractC2991z.r();
                r.a(new C0360a(0L, 0L));
                arrayList.add(r);
            }
        }
        long[][] F = F(aVarArr);
        int[] iArr = new int[F.length];
        long[] jArr = new long[F.length];
        for (int i = 0; i < F.length; i++) {
            long[] jArr2 = F[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        x(arrayList, jArr);
        AbstractC2991z<Integer> G = G(F);
        for (int i2 = 0; i2 < G.size(); i2++) {
            int intValue = G.get(i2).intValue();
            int i3 = iArr[intValue] + 1;
            iArr[intValue] = i3;
            jArr[intValue] = F[intValue][i3];
            x(arrayList, jArr);
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        x(arrayList, jArr);
        AbstractC2991z.a r2 = AbstractC2991z.r();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            AbstractC2991z.a aVar2 = (AbstractC2991z.a) arrayList.get(i5);
            r2.a(aVar2 == null ? AbstractC2991z.z() : aVar2.k());
        }
        return r2.k();
    }

    private long B(long j) {
        long H = H(j);
        if (this.q.isEmpty()) {
            return H;
        }
        int i = 1;
        while (i < this.q.size() - 1 && this.q.get(i).a < H) {
            i++;
        }
        C0360a c0360a = this.q.get(i - 1);
        C0360a c0360a2 = this.q.get(i);
        long j2 = c0360a.a;
        float f = (H - j2) / (c0360a2.a - j2);
        return c0360a.b + ((long) (f * (c0360a2.b - r2)));
    }

    private long C(List<? extends AbstractC2306d> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC2306d abstractC2306d = (AbstractC2306d) ax.r7.F.e(list);
        long j = abstractC2306d.g;
        if (j != -9223372036854775807L) {
            long j2 = abstractC2306d.h;
            if (j2 != -9223372036854775807L) {
                return j2 - j;
            }
        }
        return -9223372036854775807L;
    }

    private long E(InterfaceC2307e[] interfaceC2307eArr, List<? extends AbstractC2306d> list) {
        int i = this.t;
        if (i < interfaceC2307eArr.length && interfaceC2307eArr[i].next()) {
            InterfaceC2307e interfaceC2307e = interfaceC2307eArr[this.t];
            return interfaceC2307e.b() - interfaceC2307e.a();
        }
        for (InterfaceC2307e interfaceC2307e2 : interfaceC2307eArr) {
            if (interfaceC2307e2.next()) {
                return interfaceC2307e2.b() - interfaceC2307e2.a();
            }
        }
        return C(list);
    }

    private static long[][] F(InterfaceC2445D.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i = 0; i < aVarArr.length; i++) {
            InterfaceC2445D.a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = aVar.b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    long j = aVar.a.b(iArr[i2]).j;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i2] = j;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    private static AbstractC2991z<Integer> G(long[][] jArr) {
        L e = M.c().a().e();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double d = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        d = Math.log(j);
                    }
                    dArr[i2] = d;
                    i2++;
                }
                int i3 = length - 1;
                double d2 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d3 = dArr[i4];
                    i4++;
                    e.put(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i4]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i));
                }
            }
        }
        return AbstractC2991z.u(e.values());
    }

    private long H(long j) {
        long f = this.i.f();
        this.x = f;
        long j2 = (long) (f * this.o);
        long a = this.i.a();
        if (a == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (j2 / this.s);
        }
        float f2 = j;
        return (long) ((j2 * Math.max((f2 / this.s) - a, 0.0f)) / f2);
    }

    private long I(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.j;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return Math.min((long) (j * this.p), this.j);
    }

    private static void x(List<AbstractC2991z.a<C0360a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            AbstractC2991z.a<C0360a> aVar = list.get(i);
            if (aVar != null) {
                aVar.a(new C0360a(j, jArr[i]));
            }
        }
    }

    private int z(long j, long j2) {
        long B = B(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            if (j == Long.MIN_VALUE || !a(i2, j)) {
                C0912v h = h(i2);
                if (y(h, h.j, B)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    protected long D() {
        return this.l;
    }

    protected boolean J(long j, List<? extends AbstractC2306d> list) {
        long j2 = this.v;
        if (j2 == -9223372036854775807L || j - j2 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((AbstractC2306d) ax.r7.F.e(list)).equals(this.w)) ? false : true;
    }

    @Override // ax.l1.InterfaceC2445D
    public void c(long j, long j2, long j3, List<? extends AbstractC2306d> list, InterfaceC2307e[] interfaceC2307eArr) {
        long b2 = this.r.b();
        long E = E(interfaceC2307eArr, list);
        int i = this.u;
        if (i == 0) {
            this.u = 1;
            this.t = z(b2, E);
            return;
        }
        int i2 = this.t;
        int v = list.isEmpty() ? -1 : v(((AbstractC2306d) ax.r7.F.e(list)).d);
        if (v != -1) {
            i = ((AbstractC2306d) ax.r7.F.e(list)).e;
            i2 = v;
        }
        int z = z(b2, E);
        if (z != i2 && !a(i2, b2)) {
            C0912v h = h(i2);
            C0912v h2 = h(z);
            long I = I(j3, E);
            int i3 = h2.j;
            int i4 = h.j;
            if ((i3 > i4 && j2 < I) || (i3 < i4 && j2 >= this.k)) {
                z = i2;
            }
        }
        if (z != i2) {
            i = 3;
        }
        this.u = i;
        this.t = z;
    }

    @Override // ax.l1.InterfaceC2445D
    public int d() {
        return this.t;
    }

    @Override // ax.l1.AbstractC2454c, ax.l1.InterfaceC2445D
    public void f() {
        this.w = null;
    }

    @Override // ax.l1.AbstractC2454c, ax.l1.InterfaceC2445D
    public void i() {
        this.v = -9223372036854775807L;
        this.w = null;
    }

    @Override // ax.l1.AbstractC2454c, ax.l1.InterfaceC2445D
    public int k(long j, List<? extends AbstractC2306d> list) {
        int i;
        int i2;
        long b2 = this.r.b();
        if (!J(b2, list)) {
            return list.size();
        }
        this.v = b2;
        this.w = list.isEmpty() ? null : (AbstractC2306d) ax.r7.F.e(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long n0 = d0.n0(list.get(size - 1).g - j, this.s);
        long D = D();
        if (n0 >= D) {
            C0912v h = h(z(b2, C(list)));
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC2306d abstractC2306d = list.get(i3);
                C0912v c0912v = abstractC2306d.d;
                if (d0.n0(abstractC2306d.g - j, this.s) >= D && c0912v.j < h.j && (i = c0912v.w) != -1 && i <= this.n && (i2 = c0912v.v) != -1 && i2 <= this.m && i < h.w) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // ax.l1.InterfaceC2445D
    public int n() {
        return this.u;
    }

    @Override // ax.l1.AbstractC2454c, ax.l1.InterfaceC2445D
    public void p(float f) {
        this.s = f;
    }

    @Override // ax.l1.InterfaceC2445D
    public Object q() {
        return null;
    }

    protected boolean y(C0912v c0912v, int i, long j) {
        return ((long) i) <= j;
    }
}
