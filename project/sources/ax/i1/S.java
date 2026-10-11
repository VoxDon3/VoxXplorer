package ax.i1;

import ax.P0.C0915y;
import ax.P0.N;
import ax.S0.C0968a;
import ax.i1.InterfaceC2209F;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class S extends AbstractC2218h<Integer> {
    private static final C0915y w = new C0915y.c().c("MergingMediaSource").a();
    private final boolean k;
    private final boolean l;
    private final InterfaceC2209F[] m;
    private final List<List<d>> n;
    private final ax.P0.N[] o;
    private final ArrayList<InterfaceC2209F> p;
    private final InterfaceC2220j q;
    private final Map<Object, Long> r;
    private final ax.r7.L<Object, C2215e> s;
    private int t;
    private long[][] u;
    private c v;

    private static final class b extends AbstractC2232w {
        private final long[] f;
        private final long[] g;

        public b(ax.P0.N n, Map<Object, Long> map) {
            super(n);
            int p = n.p();
            this.g = new long[n.p()];
            N.c cVar = new N.c();
            for (int i = 0; i < p; i++) {
                this.g[i] = n.n(i, cVar).m;
            }
            int i2 = n.i();
            this.f = new long[i2];
            N.b bVar = new N.b();
            for (int i3 = 0; i3 < i2; i3++) {
                n.g(i3, bVar, true);
                long longValue = ((Long) C0968a.e(map.get(bVar.b))).longValue();
                long[] jArr = this.f;
                longValue = longValue == Long.MIN_VALUE ? bVar.d : longValue;
                jArr[i3] = longValue;
                long j = bVar.d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.g;
                    int i4 = bVar.c;
                    jArr2[i4] = jArr2[i4] - (j - longValue);
                }
            }
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public N.b g(int i, N.b bVar, boolean z) {
            super.g(i, bVar, z);
            bVar.d = this.f[i];
            return bVar;
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public N.c o(int i, N.c cVar, long j) {
            long j2;
            super.o(i, cVar, j);
            long j3 = this.g[i];
            cVar.m = j3;
            if (j3 != -9223372036854775807L) {
                long j4 = cVar.l;
                if (j4 != -9223372036854775807L) {
                    j2 = Math.min(j4, j3);
                    cVar.l = j2;
                    return cVar;
                }
            }
            j2 = cVar.l;
            cVar.l = j2;
            return cVar;
        }
    }

    public static final class c extends IOException {
        public final int q;

        public c(int i) {
            this.q = i;
        }
    }

    private static final class d {
        private final InterfaceC2209F.b a;
        private final InterfaceC2206C b;

        private d(InterfaceC2209F.b bVar, InterfaceC2206C interfaceC2206C) {
            this.a = bVar;
            this.b = interfaceC2206C;
        }
    }

    public S(InterfaceC2209F... interfaceC2209FArr) {
        this(false, interfaceC2209FArr);
    }

    private void J() {
        N.b bVar = new N.b();
        for (int i = 0; i < this.t; i++) {
            long j = -this.o[0].f(i, bVar).o();
            int i2 = 1;
            while (true) {
                ax.P0.N[] nArr = this.o;
                if (i2 < nArr.length) {
                    this.u[i][i2] = j - (-nArr[i2].f(i, bVar).o());
                    i2++;
                }
            }
        }
    }

    private void M() {
        ax.P0.N[] nArr;
        N.b bVar = new N.b();
        for (int i = 0; i < this.t; i++) {
            long j = Long.MIN_VALUE;
            int i2 = 0;
            while (true) {
                nArr = this.o;
                if (i2 >= nArr.length) {
                    break;
                }
                long k = nArr[i2].f(i, bVar).k();
                if (k != -9223372036854775807L) {
                    long j2 = k + this.u[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object m = nArr[0].m(i);
            this.r.put(m, Long.valueOf(j));
            Iterator<C2215e> it = this.s.get(m).iterator();
            while (it.hasNext()) {
                it.next().x(0L, j);
            }
        }
    }

    @Override // ax.i1.AbstractC2218h, ax.i1.AbstractC2211a
    protected void A(ax.U0.z zVar) {
        super.A(zVar);
        for (int i = 0; i < this.m.length; i++) {
            I(Integer.valueOf(i), this.m[i]);
        }
    }

    @Override // ax.i1.AbstractC2218h, ax.i1.AbstractC2211a
    protected void C() {
        super.C();
        Arrays.fill(this.o, (Object) null);
        this.t = -1;
        this.v = null;
        this.p.clear();
        Collections.addAll(this.p, this.m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.i1.AbstractC2218h
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public InterfaceC2209F.b E(Integer num, InterfaceC2209F.b bVar) {
        List<d> list = this.n.get(num.intValue());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).a.equals(bVar)) {
                return this.n.get(0).get(i).a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.i1.AbstractC2218h
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void H(Integer num, InterfaceC2209F interfaceC2209F, ax.P0.N n) {
        if (this.v != null) {
            return;
        }
        if (this.t == -1) {
            this.t = n.i();
        } else if (n.i() != this.t) {
            this.v = new c(0);
            return;
        }
        if (this.u.length == 0) {
            this.u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.t, this.o.length);
        }
        this.p.remove(interfaceC2209F);
        this.o[num.intValue()] = n;
        if (this.p.isEmpty()) {
            if (this.k) {
                J();
            }
            ax.P0.N n2 = this.o[0];
            if (this.l) {
                M();
                n2 = new b(n2, this.r);
            }
            B(n2);
        }
    }

    @Override // ax.i1.AbstractC2211a, ax.i1.InterfaceC2209F
    public void a(C0915y c0915y) {
        this.m[0].a(c0915y);
    }

    @Override // ax.i1.InterfaceC2209F
    public void e(InterfaceC2206C interfaceC2206C) {
        if (this.l) {
            C2215e c2215e = (C2215e) interfaceC2206C;
            Iterator<Map.Entry<Object, C2215e>> it = this.s.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, C2215e> next = it.next();
                if (next.getValue().equals(c2215e)) {
                    this.s.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            interfaceC2206C = c2215e.q;
        }
        Q q = (Q) interfaceC2206C;
        for (int i = 0; i < this.m.length; i++) {
            List<d> list = this.n.get(i);
            InterfaceC2206C o = q.o(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (list.get(i2).b.equals(o)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            this.m[i].e(q.o(i));
        }
    }

    @Override // ax.i1.InterfaceC2209F
    public InterfaceC2206C i(InterfaceC2209F.b bVar, ax.m1.b bVar2, long j) {
        int length = this.m.length;
        InterfaceC2206C[] interfaceC2206CArr = new InterfaceC2206C[length];
        int b2 = this.o[0].b(bVar.a);
        for (int i = 0; i < length; i++) {
            InterfaceC2209F.b a2 = bVar.a(this.o[i].m(b2));
            interfaceC2206CArr[i] = this.m[i].i(a2, bVar2, j - this.u[b2][i]);
            this.n.get(i).add(new d(a2, interfaceC2206CArr[i]));
        }
        Q q = new Q(this.q, this.u[b2], interfaceC2206CArr);
        if (!this.l) {
            return q;
        }
        C2215e c2215e = new C2215e(q, false, 0L, ((Long) C0968a.e(this.r.get(bVar.a))).longValue());
        this.s.put(bVar.a, c2215e);
        return c2215e;
    }

    @Override // ax.i1.InterfaceC2209F
    public C0915y j() {
        InterfaceC2209F[] interfaceC2209FArr = this.m;
        return interfaceC2209FArr.length > 0 ? interfaceC2209FArr[0].j() : w;
    }

    @Override // ax.i1.AbstractC2218h, ax.i1.InterfaceC2209F
    public void k() throws IOException {
        c cVar = this.v;
        if (cVar != null) {
            throw cVar;
        }
        super.k();
    }

    public S(boolean z, InterfaceC2209F... interfaceC2209FArr) {
        this(z, false, interfaceC2209FArr);
    }

    public S(boolean z, boolean z2, InterfaceC2209F... interfaceC2209FArr) {
        this(z, z2, new C2221k(), interfaceC2209FArr);
    }

    public S(boolean z, boolean z2, InterfaceC2220j interfaceC2220j, InterfaceC2209F... interfaceC2209FArr) {
        this.k = z;
        this.l = z2;
        this.m = interfaceC2209FArr;
        this.q = interfaceC2220j;
        this.p = new ArrayList<>(Arrays.asList(interfaceC2209FArr));
        this.t = -1;
        this.n = new ArrayList(interfaceC2209FArr.length);
        for (int i = 0; i < interfaceC2209FArr.length; i++) {
            this.n.add(new ArrayList());
        }
        this.o = new ax.P0.N[interfaceC2209FArr.length];
        this.u = new long[0][];
        this.r = new HashMap();
        this.s = ax.r7.M.a().a().e();
    }
}
