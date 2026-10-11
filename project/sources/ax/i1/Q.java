package ax.i1;

import androidx.media3.exoplayer.C0618p0;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.i1.InterfaceC2206C;
import ax.l1.C2447F;
import ax.l1.InterfaceC2445D;
import ax.q7.InterfaceC2879f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class Q implements InterfaceC2206C, InterfaceC2206C.a {
    private final boolean[] c0;
    private final InterfaceC2220j e0;
    private InterfaceC2206C.a h0;
    private q0 i0;
    private f0 k0;
    private final InterfaceC2206C[] q;
    private final ArrayList<InterfaceC2206C> f0 = new ArrayList<>();
    private final HashMap<ax.P0.P, ax.P0.P> g0 = new HashMap<>();
    private final IdentityHashMap<e0, Integer> d0 = new IdentityHashMap<>();
    private InterfaceC2206C[] j0 = new InterfaceC2206C[0];

    private static final class a extends C2447F {
        private final ax.P0.P b;

        public a(InterfaceC2445D interfaceC2445D, ax.P0.P p) {
            super(interfaceC2445D);
            this.b = p;
        }

        @Override // ax.l1.C2447F, ax.l1.InterfaceC2449H
        public ax.P0.P b() {
            return this.b;
        }

        @Override // ax.l1.C2447F
        public boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.b.equals(((a) obj).b);
            }
            return false;
        }

        @Override // ax.l1.C2447F, ax.l1.InterfaceC2449H
        public C0912v h(int i) {
            return this.b.b(u().j(i));
        }

        @Override // ax.l1.C2447F
        public int hashCode() {
            return (super.hashCode() * 31) + this.b.hashCode();
        }

        @Override // ax.l1.C2447F, ax.l1.InterfaceC2445D
        public C0912v m() {
            return this.b.b(u().l());
        }
    }

    public Q(InterfaceC2220j interfaceC2220j, long[] jArr, InterfaceC2206C... interfaceC2206CArr) {
        this.e0 = interfaceC2220j;
        this.q = interfaceC2206CArr;
        this.k0 = interfaceC2220j.empty();
        this.c0 = new boolean[interfaceC2206CArr.length];
        for (int i = 0; i < interfaceC2206CArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.c0[i] = true;
                this.q[i] = new l0(interfaceC2206CArr[i], j);
            }
        }
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean a(C0618p0 c0618p0) {
        if (this.f0.isEmpty()) {
            return this.k0.a(c0618p0);
        }
        int size = this.f0.size();
        for (int i = 0; i < size; i++) {
            this.f0.get(i).a(c0618p0);
        }
        return false;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long b() {
        return this.k0.b();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean c() {
        return this.k0.c();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long d() {
        return this.k0.d();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public void e(long j) {
        this.k0.e(j);
    }

    @Override // ax.i1.InterfaceC2206C.a
    public void f(InterfaceC2206C interfaceC2206C) {
        this.f0.remove(interfaceC2206C);
        if (!this.f0.isEmpty()) {
            return;
        }
        int i = 0;
        for (InterfaceC2206C interfaceC2206C2 : this.q) {
            i += interfaceC2206C2.t().a;
        }
        ax.P0.P[] pArr = new ax.P0.P[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            InterfaceC2206C[] interfaceC2206CArr = this.q;
            if (i2 >= interfaceC2206CArr.length) {
                this.i0 = new q0(pArr);
                ((InterfaceC2206C.a) C0968a.e(this.h0)).f(this);
                return;
            }
            q0 t = interfaceC2206CArr[i2].t();
            int i4 = t.a;
            int i5 = 0;
            while (i5 < i4) {
                ax.P0.P c = t.c(i5);
                C0912v[] c0912vArr = new C0912v[c.a];
                for (int i6 = 0; i6 < c.a; i6++) {
                    C0912v b = c.b(i6);
                    C0912v.b b2 = b.b();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append(":");
                    String str = b.a;
                    if (str == null) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    sb.append(str);
                    c0912vArr[i6] = b2.j0(sb.toString()).P();
                }
                ax.P0.P p = new ax.P0.P(i2 + ":" + c.b, c0912vArr);
                this.g0.put(p, c);
                pArr[i3] = p;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // ax.i1.InterfaceC2206C
    public long g(InterfaceC2445D[] interfaceC2445DArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j) {
        int[] iArr = new int[interfaceC2445DArr.length];
        int[] iArr2 = new int[interfaceC2445DArr.length];
        for (int i = 0; i < interfaceC2445DArr.length; i++) {
            e0 e0Var = e0VarArr[i];
            Integer num = e0Var == null ? null : this.d0.get(e0Var);
            iArr[i] = num == null ? -1 : num.intValue();
            InterfaceC2445D interfaceC2445D = interfaceC2445DArr[i];
            if (interfaceC2445D != null) {
                String str = interfaceC2445D.b().b;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
        }
        this.d0.clear();
        int length = interfaceC2445DArr.length;
        e0[] e0VarArr2 = new e0[length];
        e0[] e0VarArr3 = new e0[interfaceC2445DArr.length];
        InterfaceC2445D[] interfaceC2445DArr2 = new InterfaceC2445D[interfaceC2445DArr.length];
        ArrayList arrayList = new ArrayList(this.q.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < this.q.length) {
            for (int i3 = 0; i3 < interfaceC2445DArr.length; i3++) {
                e0VarArr3[i3] = iArr[i3] == i2 ? e0VarArr[i3] : null;
                if (iArr2[i3] == i2) {
                    InterfaceC2445D interfaceC2445D2 = (InterfaceC2445D) C0968a.e(interfaceC2445DArr[i3]);
                    interfaceC2445DArr2[i3] = new a(interfaceC2445D2, (ax.P0.P) C0968a.e(this.g0.get(interfaceC2445D2.b())));
                } else {
                    interfaceC2445DArr2[i3] = null;
                }
            }
            int i4 = i2;
            long g = this.q[i2].g(interfaceC2445DArr2, zArr, e0VarArr3, zArr2, j2);
            if (i4 == 0) {
                j2 = g;
            } else if (g != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < interfaceC2445DArr.length; i5++) {
                if (iArr2[i5] == i4) {
                    e0 e0Var2 = (e0) C0968a.e(e0VarArr3[i5]);
                    e0VarArr2[i5] = e0VarArr3[i5];
                    this.d0.put(e0Var2, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    C0968a.g(e0VarArr3[i5] == null);
                }
            }
            if (z) {
                arrayList.add(this.q[i4]);
            }
            i2 = i4 + 1;
        }
        System.arraycopy(e0VarArr2, 0, e0VarArr, 0, length);
        this.j0 = (InterfaceC2206C[]) arrayList.toArray(new InterfaceC2206C[0]);
        this.k0 = this.e0.a(arrayList, ax.r7.I.i(arrayList, new InterfaceC2879f() { // from class: ax.i1.P
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                List d;
                d = ((InterfaceC2206C) obj).t().d();
                return d;
            }
        }));
        return j2;
    }

    @Override // ax.i1.InterfaceC2206C
    public void l() throws IOException {
        for (InterfaceC2206C interfaceC2206C : this.q) {
            interfaceC2206C.l();
        }
    }

    @Override // ax.i1.InterfaceC2206C
    public long m(long j) {
        long m = this.j0[0].m(j);
        int i = 1;
        while (true) {
            InterfaceC2206C[] interfaceC2206CArr = this.j0;
            if (i >= interfaceC2206CArr.length) {
                return m;
            }
            if (interfaceC2206CArr[i].m(m) != m) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // ax.i1.InterfaceC2206C
    public void n(InterfaceC2206C.a aVar, long j) {
        this.h0 = aVar;
        Collections.addAll(this.f0, this.q);
        for (InterfaceC2206C interfaceC2206C : this.q) {
            interfaceC2206C.n(this, j);
        }
    }

    public InterfaceC2206C o(int i) {
        return this.c0[i] ? ((l0) this.q[i]).j() : this.q[i];
    }

    @Override // ax.i1.f0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void i(InterfaceC2206C interfaceC2206C) {
        ((InterfaceC2206C.a) C0968a.e(this.h0)).i(this);
    }

    @Override // ax.i1.InterfaceC2206C
    public long q(long j, ax.Y0.Z z) {
        InterfaceC2206C[] interfaceC2206CArr = this.j0;
        return (interfaceC2206CArr.length > 0 ? interfaceC2206CArr[0] : this.q[0]).q(j, z);
    }

    @Override // ax.i1.InterfaceC2206C
    public long s() {
        long j = -9223372036854775807L;
        for (InterfaceC2206C interfaceC2206C : this.j0) {
            long s = interfaceC2206C.s();
            if (s != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (InterfaceC2206C interfaceC2206C2 : this.j0) {
                        if (interfaceC2206C2 == interfaceC2206C) {
                            break;
                        }
                        if (interfaceC2206C2.m(s) != s) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = s;
                } else if (s != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && interfaceC2206C.m(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // ax.i1.InterfaceC2206C
    public q0 t() {
        return (q0) C0968a.e(this.i0);
    }

    @Override // ax.i1.InterfaceC2206C
    public void v(long j, boolean z) {
        for (InterfaceC2206C interfaceC2206C : this.j0) {
            interfaceC2206C.v(j, z);
        }
    }
}
