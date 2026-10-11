package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.C0618p0;
import androidx.media3.exoplayer.hls.l;
import ax.P0.C;
import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.P0.C0914x;
import ax.P0.D;
import ax.P0.P;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.U0.z;
import ax.Y0.Z;
import ax.Z0.I1;
import ax.b1.InterfaceC1471u;
import ax.b1.w;
import ax.d1.i;
import ax.d1.m;
import ax.i1.InterfaceC2206C;
import ax.i1.InterfaceC2220j;
import ax.i1.N;
import ax.i1.e0;
import ax.i1.f0;
import ax.i1.q0;
import ax.l1.InterfaceC2445D;
import ax.m1.m;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import ax.r7.I;
import ax.u7.C3218f;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class g implements InterfaceC2206C, m.b {
    private f0 A0;
    private final m c0;
    private final ax.c1.d d0;
    private final z e0;
    private final w f0;
    private final InterfaceC1471u.a g0;
    private final ax.m1.m h0;
    private final N.a i0;
    private final ax.m1.b j0;
    private final InterfaceC2220j m0;
    private final boolean n0;
    private final int o0;
    private final boolean p0;
    private final ax.c1.e q;
    private final I1 q0;
    private final long s0;
    private InterfaceC2206C.a t0;
    private int u0;
    private q0 v0;
    private int z0;
    private final l.b r0 = new b();
    private final IdentityHashMap<e0, Integer> k0 = new IdentityHashMap<>();
    private final ax.c1.j l0 = new ax.c1.j();
    private l[] w0 = new l[0];
    private l[] x0 = new l[0];
    private int[][] y0 = new int[0][];

    private class b implements l.b {
        private b() {
        }

        @Override // ax.i1.f0.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void i(l lVar) {
            g.this.t0.i(g.this);
        }

        @Override // androidx.media3.exoplayer.hls.l.b
        public void h() {
            if (g.j(g.this) > 0) {
                return;
            }
            int i = 0;
            for (l lVar : g.this.w0) {
                i += lVar.t().a;
            }
            P[] pArr = new P[i];
            int i2 = 0;
            for (l lVar2 : g.this.w0) {
                int i3 = lVar2.t().a;
                int i4 = 0;
                while (i4 < i3) {
                    pArr[i2] = lVar2.t().c(i4);
                    i4++;
                    i2++;
                }
            }
            g.this.v0 = new q0(pArr);
            g.this.t0.f(g.this);
        }

        @Override // androidx.media3.exoplayer.hls.l.b
        public void k(Uri uri) {
            g.this.c0.m(uri);
        }
    }

    public g(ax.c1.e eVar, m mVar, ax.c1.d dVar, z zVar, ax.m1.f fVar, w wVar, InterfaceC1471u.a aVar, ax.m1.m mVar2, N.a aVar2, ax.m1.b bVar, InterfaceC2220j interfaceC2220j, boolean z, int i, boolean z2, I1 i1, long j) {
        this.q = eVar;
        this.c0 = mVar;
        this.d0 = dVar;
        this.e0 = zVar;
        this.f0 = wVar;
        this.g0 = aVar;
        this.h0 = mVar2;
        this.i0 = aVar2;
        this.j0 = bVar;
        this.m0 = interfaceC2220j;
        this.n0 = z;
        this.o0 = i;
        this.p0 = z2;
        this.q0 = i1;
        this.s0 = j;
        this.A0 = interfaceC2220j.empty();
    }

    private static C0912v A(C0912v c0912v, C0912v c0912v2, boolean z) {
        C c;
        int i;
        String str;
        String str2;
        List<C0914x> list;
        String str3;
        int i2;
        int i3;
        AbstractC2991z z2 = AbstractC2991z.z();
        if (c0912v2 != null) {
            str2 = c0912v2.k;
            c = c0912v2.l;
            i2 = c0912v2.G;
            i = c0912v2.e;
            i3 = c0912v2.f;
            str = c0912v2.d;
            str3 = c0912v2.b;
            list = c0912v2.c;
        } else {
            String S = d0.S(c0912v.k, 1);
            c = c0912v.l;
            if (z) {
                i2 = c0912v.G;
                i = c0912v.e;
                i3 = c0912v.f;
                str = c0912v.d;
                str3 = c0912v.b;
                str2 = S;
                list = c0912v.c;
            } else {
                i = 0;
                str = null;
                str2 = S;
                list = z2;
                str3 = null;
                i2 = -1;
                i3 = 0;
            }
        }
        return new C0912v.b().j0(c0912v.a).l0(str3).m0(list).W(c0912v.n).y0(D.g(str2)).U(str2).r0(c).S(z ? c0912v.h : -1).t0(z ? c0912v.i : -1).T(i2).A0(i).w0(i3).n0(str).P();
    }

    private static Map<String, C0906o> B(List<C0906o> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            C0906o c0906o = list.get(i);
            String str = c0906o.d0;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                C0906o c0906o2 = (C0906o) arrayList.get(i2);
                if (TextUtils.equals(c0906o2.d0, str)) {
                    c0906o = c0906o.f(c0906o2);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            hashMap.put(str, c0906o);
        }
        return hashMap;
    }

    private static C0912v C(C0912v c0912v) {
        String S = d0.S(c0912v.k, 2);
        return new C0912v.b().j0(c0912v.a).l0(c0912v.b).m0(c0912v.c).W(c0912v.n).y0(D.g(S)).U(S).r0(c0912v.l).S(c0912v.h).t0(c0912v.i).F0(c0912v.v).h0(c0912v.w).f0(c0912v.z).A0(c0912v.e).w0(c0912v.f).P();
    }

    static /* synthetic */ int j(g gVar) {
        int i = gVar.u0 - 1;
        gVar.u0 = i;
        return i;
    }

    private void u(long j, List<i.a> list, List<l> list2, List<int[]> list3, Map<String, C0906o> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (Objects.equals(str, list.get(i2).d)) {
                        i.a aVar = list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.a);
                        arrayList2.add(aVar.b);
                        z &= d0.R(aVar.b.k, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                l z2 = z(str2, 1, (Uri[]) arrayList.toArray((Uri[]) d0.j(new Uri[0])), (C0912v[]) arrayList2.toArray(new C0912v[0]), null, Collections.EMPTY_LIST, map, j);
                list3.add(C3218f.o(arrayList3));
                list2.add(z2);
                if (this.n0 && z) {
                    z2.h0(new P[]{new P(str2, (C0912v[]) arrayList2.toArray(new C0912v[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w(ax.d1.i r19, long r20, java.util.List<androidx.media3.exoplayer.hls.l> r22, java.util.List<int[]> r23, java.util.Map<java.lang.String, ax.P0.C0906o> r24) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.g.w(ax.d1.i, long, java.util.List, java.util.List, java.util.Map):void");
    }

    private void x(long j) {
        long j2;
        ax.d1.i iVar = (ax.d1.i) C0968a.e(this.c0.h());
        Map<String, C0906o> B = this.p0 ? B(iVar.m) : Collections.EMPTY_MAP;
        boolean isEmpty = iVar.e.isEmpty();
        List<i.a> list = iVar.g;
        List<i.a> list2 = iVar.h;
        this.u0 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (isEmpty) {
            j2 = j;
        } else {
            w(iVar, j, arrayList, arrayList2, B);
            arrayList = arrayList;
            j2 = j;
        }
        u(j2, list, arrayList, arrayList2, B);
        this.z0 = arrayList.size();
        y(j2, list2, arrayList, arrayList2, B);
        this.w0 = (l[]) arrayList.toArray(new l[0]);
        this.y0 = (int[][]) arrayList2.toArray(new int[0][]);
        this.u0 = this.w0.length;
        for (int i = 0; i < this.z0; i++) {
            this.w0[i].q0(true);
        }
        for (l lVar : this.w0) {
            lVar.D();
        }
        this.x0 = this.w0;
    }

    private void y(long j, List<i.a> list, List<l> list2, List<int[]> list3, Map<String, C0906o> map) {
        List<i.a> list4 = list;
        int i = 1;
        ArrayList arrayList = new ArrayList(list4.size());
        ArrayList arrayList2 = new ArrayList(list4.size());
        ArrayList arrayList3 = new ArrayList(list4.size());
        HashSet hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        while (i3 < list4.size()) {
            String str = list4.get(i3).d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                for (int i4 = 0; i4 < list4.size(); i4 += i) {
                    if (Objects.equals(str, list4.get(i4).d)) {
                        i.a aVar = list4.get(i4);
                        arrayList3.add(Integer.valueOf(i4));
                        arrayList.add(aVar.a);
                        arrayList2.add(aVar.b);
                    }
                }
                String str2 = "subtitle:" + str;
                C0912v[] c0912vArr = (C0912v[]) arrayList2.toArray(new C0912v[i2]);
                l z = z(str2, 3, (Uri[]) arrayList.toArray((Uri[]) d0.j(new Uri[i2])), c0912vArr, null, AbstractC2991z.z(), map, j);
                list3.add(C3218f.o(arrayList3));
                list2.add(z);
                int length = c0912vArr.length;
                C0912v[] c0912vArr2 = new C0912v[length];
                for (int i5 = 0; i5 < length; i5++) {
                    c0912vArr2[i5] = this.q.d(c0912vArr[i5]);
                }
                i = 1;
                z.h0(new P[]{new P(str2, c0912vArr2)}, 0, new int[0]);
            }
            i3 += i;
            list4 = list;
            i2 = 0;
        }
    }

    private l z(String str, int i, Uri[] uriArr, C0912v[] c0912vArr, C0912v c0912v, List<C0912v> list, Map<String, C0906o> map, long j) {
        return new l(str, i, this.r0, new c(this.q, this.c0, uriArr, c0912vArr, this.d0, this.e0, this.l0, this.s0, list, this.q0, null), map, this.j0, j, c0912v, this.f0, this.g0, this.h0, this.i0, this.o0);
    }

    public void D() {
        this.c0.f(this);
        for (l lVar : this.w0) {
            lVar.j0();
        }
        this.t0 = null;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean a(C0618p0 c0618p0) {
        if (this.v0 != null) {
            return this.A0.a(c0618p0);
        }
        for (l lVar : this.w0) {
            lVar.D();
        }
        return false;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long b() {
        return this.A0.b();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean c() {
        return this.A0.c();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long d() {
        return this.A0.d();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public void e(long j) {
        this.A0.e(j);
    }

    @Override // ax.d1.m.b
    public void f() {
        for (l lVar : this.w0) {
            lVar.f0();
        }
        this.t0.i(this);
    }

    @Override // ax.i1.InterfaceC2206C
    public long g(InterfaceC2445D[] interfaceC2445DArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j) {
        int[] iArr = new int[interfaceC2445DArr.length];
        int[] iArr2 = new int[interfaceC2445DArr.length];
        for (int i = 0; i < interfaceC2445DArr.length; i++) {
            e0 e0Var = e0VarArr[i];
            iArr[i] = e0Var == null ? -1 : this.k0.get(e0Var).intValue();
            iArr2[i] = -1;
            InterfaceC2445D interfaceC2445D = interfaceC2445DArr[i];
            if (interfaceC2445D != null) {
                P b2 = interfaceC2445D.b();
                int i2 = 0;
                while (true) {
                    l[] lVarArr = this.w0;
                    if (i2 >= lVarArr.length) {
                        break;
                    }
                    if (lVarArr[i2].t().e(b2) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.k0.clear();
        int length = interfaceC2445DArr.length;
        e0[] e0VarArr2 = new e0[length];
        e0[] e0VarArr3 = new e0[interfaceC2445DArr.length];
        InterfaceC2445D[] interfaceC2445DArr2 = new InterfaceC2445D[interfaceC2445DArr.length];
        l[] lVarArr2 = new l[this.w0.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 < this.w0.length) {
            for (int i5 = 0; i5 < interfaceC2445DArr.length; i5++) {
                InterfaceC2445D interfaceC2445D2 = null;
                e0VarArr3[i5] = iArr[i5] == i3 ? e0VarArr[i5] : null;
                if (iArr2[i5] == i3) {
                    interfaceC2445D2 = interfaceC2445DArr[i5];
                }
                interfaceC2445DArr2[i5] = interfaceC2445D2;
            }
            l lVar = this.w0[i3];
            int[] iArr3 = iArr;
            int i6 = i3;
            int i7 = i4;
            boolean n0 = lVar.n0(interfaceC2445DArr2, zArr, e0VarArr3, zArr2, j, z);
            boolean z2 = false;
            for (int i8 = 0; i8 < interfaceC2445DArr.length; i8++) {
                e0 e0Var2 = e0VarArr3[i8];
                if (iArr2[i8] == i6) {
                    C0968a.e(e0Var2);
                    e0VarArr2[i8] = e0Var2;
                    this.k0.put(e0Var2, Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr3[i8] == i6) {
                    C0968a.g(e0Var2 == null);
                }
            }
            if (z2) {
                lVarArr2[i7] = lVar;
                i4 = i7 + 1;
                if (i7 == 0) {
                    lVar.q0(true);
                    if (!n0) {
                        l[] lVarArr3 = this.x0;
                        if (lVarArr3.length != 0 && lVar == lVarArr3[0]) {
                        }
                    }
                    this.l0.b();
                    z = true;
                } else {
                    lVar.q0(i6 < this.z0);
                }
            } else {
                i4 = i7;
            }
            i3 = i6 + 1;
            iArr = iArr3;
        }
        System.arraycopy(e0VarArr2, 0, e0VarArr, 0, length);
        l[] lVarArr4 = (l[]) d0.g1(lVarArr2, i4);
        this.x0 = lVarArr4;
        AbstractC2991z w = AbstractC2991z.w(lVarArr4);
        this.A0 = this.m0.a(w, I.i(w, new InterfaceC2879f() { // from class: androidx.media3.exoplayer.hls.f
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                List d;
                d = ((l) obj).t().d();
                return d;
            }
        }));
        return j;
    }

    @Override // ax.d1.m.b
    public boolean h(Uri uri, m.c cVar, boolean z) {
        boolean z2 = true;
        for (l lVar : this.w0) {
            z2 &= lVar.e0(uri, cVar, z);
        }
        this.t0.i(this);
        return z2;
    }

    @Override // ax.i1.InterfaceC2206C
    public void l() throws IOException {
        for (l lVar : this.w0) {
            lVar.l();
        }
    }

    @Override // ax.i1.InterfaceC2206C
    public long m(long j) {
        l[] lVarArr = this.x0;
        if (lVarArr.length > 0) {
            boolean m0 = lVarArr[0].m0(j, false);
            int i = 1;
            while (true) {
                l[] lVarArr2 = this.x0;
                if (i >= lVarArr2.length) {
                    break;
                }
                lVarArr2[i].m0(j, m0);
                i++;
            }
            if (m0) {
                this.l0.b();
            }
        }
        return j;
    }

    @Override // ax.i1.InterfaceC2206C
    public void n(InterfaceC2206C.a aVar, long j) {
        this.t0 = aVar;
        this.c0.o(this);
        x(j);
    }

    @Override // ax.i1.InterfaceC2206C
    public long q(long j, Z z) {
        for (l lVar : this.x0) {
            if (lVar.T()) {
                return lVar.q(j, z);
            }
        }
        return j;
    }

    @Override // ax.i1.InterfaceC2206C
    public long s() {
        return -9223372036854775807L;
    }

    @Override // ax.i1.InterfaceC2206C
    public q0 t() {
        return (q0) C0968a.e(this.v0);
    }

    @Override // ax.i1.InterfaceC2206C
    public void v(long j, boolean z) {
        for (l lVar : this.x0) {
            lVar.v(j, z);
        }
    }
}
