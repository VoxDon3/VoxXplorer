package ax.l1;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.C0622s;
import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.N0;
import ax.P0.C0894c;
import ax.P0.C0912v;
import ax.P0.N;
import ax.P0.P;
import ax.P0.Q;
import ax.P0.T;
import ax.S0.C0968a;
import ax.S0.C0974g;
import ax.S0.C0987u;
import ax.S0.d0;
import ax.Y0.V;
import ax.Y0.W;
import ax.i1.InterfaceC2209F;
import ax.i1.q0;
import ax.l1.AbstractC2448G;
import ax.l1.C2452a;
import ax.l1.InterfaceC2445D;
import ax.l1.n;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2980n;
import ax.r7.AbstractC2991z;
import ax.r7.T;
import ax.u7.C3218f;
import ax.v0.ExecutorC3244a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class n extends AbstractC2448G implements N0.a {
    private static final T<Integer> l = T.b(new Comparator() { // from class: ax.l1.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.w((Integer) obj, (Integer) obj2);
        }
    });
    private final Object d;
    public final Context e;
    private final InterfaceC2445D.b f;
    private e g;
    private Thread h;
    private h i;
    private C0894c j;
    private Boolean k;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends j<b> implements Comparable<b> {
        private final int f0;
        private final boolean g0;
        private final String h0;
        private final e i0;
        private final boolean j0;
        private final int k0;
        private final int l0;
        private final int m0;
        private final boolean n0;
        private final boolean o0;
        private final int p0;
        private final int q0;
        private final boolean r0;
        private final int s0;
        private final int t0;
        private final int u0;
        private final int v0;
        private final boolean w0;
        private final boolean x0;
        private final boolean y0;

        public b(int i, P p, int i2, e eVar, int i3, boolean z, ax.q7.o<C0912v> oVar, int i4) {
            super(i, p, i2);
            int i5;
            int i6;
            int i7;
            this.i0 = eVar;
            int i8 = eVar.y0 ? 24 : 16;
            this.n0 = eVar.u0 && (i4 & i8) != 0;
            this.h0 = n.V(this.e0.d);
            this.j0 = V.l(i3, false);
            int i9 = 0;
            while (true) {
                int size = eVar.p.size();
                i5 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                if (i9 >= size) {
                    i9 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    i6 = 0;
                    break;
                } else {
                    i6 = n.I(this.e0, eVar.p.get(i9), false);
                    if (i6 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.l0 = i9;
            this.k0 = i6;
            this.m0 = n.M(this.e0.f, eVar.q);
            C0912v c0912v = this.e0;
            int i10 = c0912v.f;
            this.o0 = i10 == 0 || (i10 & 1) != 0;
            this.r0 = (c0912v.e & 1) != 0;
            this.y0 = n.Q(c0912v);
            C0912v c0912v2 = this.e0;
            int i11 = c0912v2.G;
            this.s0 = i11;
            this.t0 = c0912v2.H;
            int i12 = c0912v2.j;
            this.u0 = i12;
            this.g0 = (i12 == -1 || i12 <= eVar.s) && (i11 == -1 || i11 <= eVar.r) && oVar.apply(c0912v2);
            String[] r0 = d0.r0();
            int i13 = 0;
            while (true) {
                if (i13 >= r0.length) {
                    i13 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    i7 = 0;
                    break;
                } else {
                    i7 = n.I(this.e0, r0[i13], false);
                    if (i7 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.p0 = i13;
            this.q0 = i7;
            int i14 = 0;
            while (true) {
                if (i14 < eVar.t.size()) {
                    String str = this.e0.o;
                    if (str != null && str.equals(eVar.t.get(i14))) {
                        i5 = i14;
                        break;
                    }
                    i14++;
                } else {
                    break;
                }
            }
            this.v0 = i5;
            this.w0 = V.h(i3) == 128;
            this.x0 = V.j(i3) == 64;
            this.f0 = p(i3, z, i8);
        }

        public static int j(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static AbstractC2991z<b> n(int i, P p, e eVar, int[] iArr, boolean z, ax.q7.o<C0912v> oVar, int i2) {
            AbstractC2991z.a r = AbstractC2991z.r();
            for (int i3 = 0; i3 < p.a; i3++) {
                r.a(new b(i, p, i3, eVar, iArr[i3], z, oVar, i2));
            }
            return r.k();
        }

        private int p(int i, boolean z, int i2) {
            if (!V.l(i, this.i0.A0)) {
                return 0;
            }
            if (!this.g0 && !this.i0.t0) {
                return 0;
            }
            e eVar = this.i0;
            if (eVar.u.a == 2 && !n.W(eVar, i, this.e0)) {
                return 0;
            }
            if (!V.l(i, false) || !this.g0 || this.e0.j == -1) {
                return 1;
            }
            e eVar2 = this.i0;
            if (eVar2.C || eVar2.B) {
                return 1;
            }
            return ((!eVar2.C0 && z) || eVar2.u.a == 2 || (i & i2) == 0) ? 1 : 2;
        }

        @Override // ax.l1.n.j
        public int d() {
            return this.f0;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            T g = (this.g0 && this.j0) ? n.l : n.l.g();
            AbstractC2980n f = AbstractC2980n.j().g(this.j0, bVar.j0).f(Integer.valueOf(this.l0), Integer.valueOf(bVar.l0), T.d().g()).d(this.k0, bVar.k0).d(this.m0, bVar.m0).g(this.r0, bVar.r0).g(this.o0, bVar.o0).f(Integer.valueOf(this.p0), Integer.valueOf(bVar.p0), T.d().g()).d(this.q0, bVar.q0).g(this.g0, bVar.g0).f(Integer.valueOf(this.v0), Integer.valueOf(bVar.v0), T.d().g());
            if (this.i0.B) {
                f = f.f(Integer.valueOf(this.u0), Integer.valueOf(bVar.u0), n.l.g());
            }
            AbstractC2980n f2 = f.g(this.w0, bVar.w0).g(this.x0, bVar.x0).g(this.y0, bVar.y0).f(Integer.valueOf(this.s0), Integer.valueOf(bVar.s0), g).f(Integer.valueOf(this.t0), Integer.valueOf(bVar.t0), g);
            if (Objects.equals(this.h0, bVar.h0)) {
                f2 = f2.f(Integer.valueOf(this.u0), Integer.valueOf(bVar.u0), g);
            }
            return f2.i();
        }

        @Override // ax.l1.n.j
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean h(b bVar) {
            int i;
            String str;
            int i2;
            if (!this.i0.w0 && ((i2 = this.e0.G) == -1 || i2 != bVar.e0.G)) {
                return false;
            }
            if (!this.n0 && ((str = this.e0.o) == null || !TextUtils.equals(str, bVar.e0.o))) {
                return false;
            }
            e eVar = this.i0;
            if (!eVar.v0 && ((i = this.e0.H) == -1 || i != bVar.e0.H)) {
                return false;
            }
            if (eVar.x0) {
                return true;
            }
            return this.w0 == bVar.w0 && this.x0 == bVar.x0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends j<c> implements Comparable<c> {
        private final int f0;
        private final int g0;

        public c(int i, P p, int i2, e eVar, int i3) {
            super(i, p, i2);
            this.f0 = V.l(i3, eVar.A0) ? 1 : 0;
            this.g0 = this.e0.g();
        }

        public static int j(List<c> list, List<c> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static AbstractC2991z<c> n(int i, P p, e eVar, int[] iArr) {
            AbstractC2991z.a r = AbstractC2991z.r();
            for (int i2 = 0; i2 < p.a; i2++) {
                r.a(new c(i, p, i2, eVar, iArr[i2]));
            }
            return r.k();
        }

        @Override // ax.l1.n.j
        public int d() {
            return this.f0;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.g0, cVar.g0);
        }

        @Override // ax.l1.n.j
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean h(c cVar) {
            return false;
        }
    }

    private static final class d implements Comparable<d> {
        private final boolean c0;
        private final boolean q;

        public d(C0912v c0912v, int i) {
            this.q = (c0912v.e & 1) != 0;
            this.c0 = V.l(i, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return AbstractC2980n.j().g(this.c0, dVar.c0).g(this.q, dVar.q).i();
        }
    }

    public static final class e extends ax.P0.T {
        public static final e G0;

        @Deprecated
        public static final e H0;
        private static final String I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        private static final String N0;
        private static final String O0;
        private static final String P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        private static final String U0;
        private static final String V0;
        private static final String W0;
        private static final String X0;
        private static final String Y0;
        private static final String Z0;
        private static final String a1;
        public final boolean A0;
        public final boolean B0;
        public final boolean C0;
        public final boolean D0;
        private final SparseArray<Map<q0, g>> E0;
        private final SparseBooleanArray F0;
        public final boolean p0;
        public final boolean q0;
        public final boolean r0;
        public final boolean s0;
        public final boolean t0;
        public final boolean u0;
        public final boolean v0;
        public final boolean w0;
        public final boolean x0;
        public final boolean y0;
        public final boolean z0;

        static {
            e F = new a().F();
            G0 = F;
            H0 = F;
            I0 = d0.G0(1000);
            J0 = d0.G0(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
            K0 = d0.G0(1002);
            L0 = d0.G0(1003);
            M0 = d0.G0(1004);
            N0 = d0.G0(WebSocketProtocol.CLOSE_NO_STATUS_CODE);
            O0 = d0.G0(1006);
            P0 = d0.G0(1007);
            Q0 = d0.G0(1008);
            R0 = d0.G0(1009);
            S0 = d0.G0(1010);
            T0 = d0.G0(1011);
            U0 = d0.G0(1012);
            V0 = d0.G0(1013);
            W0 = d0.G0(1014);
            X0 = d0.G0(1015);
            Y0 = d0.G0(1016);
            Z0 = d0.G0(1017);
            a1 = d0.G0(1018);
        }

        private static boolean M(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean N(SparseArray<Map<q0, g>> sparseArray, SparseArray<Map<q0, g>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !O(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean O(Map<q0, g> map, Map<q0, g> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<q0, g> entry : map.entrySet()) {
                q0 key = entry.getKey();
                if (!map2.containsKey(key) || !Objects.equals(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static e Q(Bundle bundle) {
            return new a(bundle).F();
        }

        @Deprecated
        public static e R(Context context) {
            return G0;
        }

        private static int[] S(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        private static void W(Bundle bundle, SparseArray<Map<q0, g>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                for (Map.Entry<q0, g> entry : sparseArray.valueAt(i).entrySet()) {
                    g value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                bundle.putIntArray(S0, C3218f.o(arrayList));
                bundle.putParcelableArrayList(T0, C0974g.d(arrayList2, new InterfaceC2879f() { // from class: ax.l1.o
                    @Override // ax.q7.InterfaceC2879f
                    public final Object apply(Object obj) {
                        return ((q0) obj).f();
                    }
                }));
                bundle.putSparseParcelableArray(U0, C0974g.e(sparseArray2, new InterfaceC2879f() { // from class: ax.l1.p
                    @Override // ax.q7.InterfaceC2879f
                    public final Object apply(Object obj) {
                        return ((n.g) obj).b();
                    }
                }));
            }
        }

        @Override // ax.P0.T
        public Bundle J() {
            Bundle J = super.J();
            J.putBoolean(I0, this.p0);
            J.putBoolean(J0, this.q0);
            J.putBoolean(K0, this.r0);
            J.putBoolean(W0, this.s0);
            J.putBoolean(L0, this.t0);
            J.putBoolean(M0, this.u0);
            J.putBoolean(N0, this.v0);
            J.putBoolean(O0, this.w0);
            J.putBoolean(X0, this.x0);
            J.putBoolean(a1, this.y0);
            J.putBoolean(Y0, this.z0);
            J.putBoolean(P0, this.A0);
            J.putBoolean(Q0, this.B0);
            J.putBoolean(R0, this.C0);
            J.putBoolean(Z0, this.D0);
            W(J, this.E0);
            J.putIntArray(V0, S(this.F0));
            return J;
        }

        @Override // ax.P0.T
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public a I() {
            return new a();
        }

        public boolean T(int i) {
            return this.F0.get(i);
        }

        @Deprecated
        public g U(int i, q0 q0Var) {
            Map<q0, g> map = this.E0.get(i);
            if (map != null) {
                return map.get(q0Var);
            }
            return null;
        }

        @Deprecated
        public boolean V(int i, q0 q0Var) {
            Map<q0, g> map = this.E0.get(i);
            return map != null && map.containsKey(q0Var);
        }

        @Override // ax.P0.T
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.p0 == eVar.p0 && this.q0 == eVar.q0 && this.r0 == eVar.r0 && this.s0 == eVar.s0 && this.t0 == eVar.t0 && this.u0 == eVar.u0 && this.v0 == eVar.v0 && this.w0 == eVar.w0 && this.x0 == eVar.x0 && this.y0 == eVar.y0 && this.z0 == eVar.z0 && this.A0 == eVar.A0 && this.B0 == eVar.B0 && this.C0 == eVar.C0 && this.D0 == eVar.D0 && M(this.F0, eVar.F0) && N(this.E0, eVar.E0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ax.P0.T
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.p0 ? 1 : 0)) * 31) + (this.q0 ? 1 : 0)) * 31) + (this.r0 ? 1 : 0)) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 31) + (this.u0 ? 1 : 0)) * 31) + (this.v0 ? 1 : 0)) * 31) + (this.w0 ? 1 : 0)) * 31) + (this.x0 ? 1 : 0)) * 31) + (this.y0 ? 1 : 0)) * 31) + (this.z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0)) * 31) + (this.D0 ? 1 : 0);
        }

        public static final class a extends T.c {
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private boolean O;
            private boolean P;
            private boolean Q;
            private boolean R;
            private boolean S;
            private boolean T;
            private final SparseArray<Map<q0, g>> U;
            private final SparseBooleanArray V;

            /* JADX WARN: Multi-variable type inference failed */
            private void Q0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(e.S0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(e.T0);
                AbstractC2991z z = parcelableArrayList == null ? AbstractC2991z.z() : C0974g.b(new InterfaceC2879f() { // from class: ax.l1.q
                    @Override // ax.q7.InterfaceC2879f
                    public final Object apply(Object obj) {
                        return q0.b((Bundle) obj);
                    }
                }, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(e.U0);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : C0974g.c(new InterfaceC2879f() { // from class: ax.l1.r
                    @Override // ax.q7.InterfaceC2879f
                    public final Object apply(Object obj) {
                        return n.g.a((Bundle) obj);
                    }
                }, sparseParcelableArray);
                if (intArray == null || intArray.length != z.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    P0(intArray[i], (q0) z.get(i), (g) sparseArray.get(i));
                }
            }

            private static SparseArray<Map<q0, g>> o0(SparseArray<Map<q0, g>> sparseArray) {
                SparseArray<Map<q0, g>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            private void p0() {
                this.F = true;
                this.G = false;
                this.H = true;
                this.I = false;
                this.J = true;
                this.K = false;
                this.L = false;
                this.M = false;
                this.N = false;
                this.O = true;
                this.P = true;
                this.Q = true;
                this.R = false;
                this.S = true;
                this.T = false;
            }

            private SparseBooleanArray q0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }

            public a A0(boolean z) {
                this.G = z;
                return this;
            }

            public a B0(boolean z) {
                this.H = z;
                return this;
            }

            public a C0(boolean z) {
                this.P = z;
                return this;
            }

            @Override // ax.P0.T.c
            /* renamed from: D0, reason: merged with bridge method [inline-methods] */
            public a L(Set<Integer> set) {
                super.L(set);
                return this;
            }

            public a E0(boolean z) {
                this.J = z;
                return this;
            }

            public a F0(boolean z) {
                this.Q = z;
                return this;
            }

            public a G0(boolean z) {
                this.F = z;
                return this;
            }

            @Override // ax.P0.T.c
            /* renamed from: H0, reason: merged with bridge method [inline-methods] */
            public a M(int i) {
                super.M(i);
                return this;
            }

            @Override // ax.P0.T.c
            /* renamed from: I0, reason: merged with bridge method [inline-methods] */
            public a N(Q q) {
                super.N(q);
                return this;
            }

            public a J0(String str) {
                super.O(str);
                return this;
            }

            @Override // ax.P0.T.c
            /* renamed from: K0, reason: merged with bridge method [inline-methods] */
            public a P(String... strArr) {
                super.P(strArr);
                return this;
            }

            @Override // ax.P0.T.c
            /* renamed from: L0, reason: merged with bridge method [inline-methods] */
            public a Q(String str) {
                super.Q(str);
                return this;
            }

            @Override // ax.P0.T.c
            /* renamed from: M0, reason: merged with bridge method [inline-methods] */
            public a R(String... strArr) {
                super.R(strArr);
                return this;
            }

            @Override // ax.P0.T.c
            /* renamed from: N0, reason: merged with bridge method [inline-methods] */
            public a S(int i) {
                super.S(i);
                return this;
            }

            public a O0(boolean z) {
                super.T(z);
                return this;
            }

            @Deprecated
            public a P0(int i, q0 q0Var, g gVar) {
                Map<q0, g> map = this.U.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.U.put(i, map);
                }
                if (map.containsKey(q0Var) && Objects.equals(map.get(q0Var), gVar)) {
                    return this;
                }
                map.put(q0Var, gVar);
                return this;
            }

            @Override // ax.P0.T.c
            /* renamed from: R0, reason: merged with bridge method [inline-methods] */
            public a U(int i, boolean z) {
                super.U(i, z);
                return this;
            }

            public a S0(boolean z) {
                this.R = z;
                return this;
            }

            @Override // ax.P0.T.c
            /* renamed from: m0, reason: merged with bridge method [inline-methods] */
            public e F() {
                return new e(this);
            }

            @Override // ax.P0.T.c
            /* renamed from: n0, reason: merged with bridge method [inline-methods] */
            public a G(int i) {
                super.G(i);
                return this;
            }

            protected a r0(ax.P0.T t) {
                super.K(t);
                return this;
            }

            public a s0(boolean z) {
                this.M = z;
                return this;
            }

            public a t0(boolean z) {
                this.N = z;
                return this;
            }

            public a u0(boolean z) {
                this.K = z;
                return this;
            }

            public a v0(boolean z) {
                this.L = z;
                return this;
            }

            public a w0(boolean z) {
                this.O = z;
                return this;
            }

            public a x0(boolean z) {
                this.T = z;
                return this;
            }

            public a y0(boolean z) {
                this.S = z;
                return this;
            }

            public a z0(boolean z) {
                this.I = z;
                return this;
            }

            public a() {
                this.U = new SparseArray<>();
                this.V = new SparseBooleanArray();
                p0();
            }

            @Deprecated
            public a(Context context) {
                this();
            }

            private a(e eVar) {
                super(eVar);
                this.F = eVar.p0;
                this.G = eVar.q0;
                this.H = eVar.r0;
                this.I = eVar.s0;
                this.J = eVar.t0;
                this.K = eVar.u0;
                this.L = eVar.v0;
                this.M = eVar.w0;
                this.N = eVar.x0;
                this.O = eVar.y0;
                this.P = eVar.z0;
                this.Q = eVar.A0;
                this.R = eVar.B0;
                this.S = eVar.C0;
                this.T = eVar.D0;
                this.U = o0(eVar.E0);
                this.V = eVar.F0.clone();
            }

            private a(Bundle bundle) {
                super(bundle);
                p0();
                e eVar = e.G0;
                G0(bundle.getBoolean(e.I0, eVar.p0));
                A0(bundle.getBoolean(e.J0, eVar.q0));
                B0(bundle.getBoolean(e.K0, eVar.r0));
                z0(bundle.getBoolean(e.W0, eVar.s0));
                E0(bundle.getBoolean(e.L0, eVar.t0));
                u0(bundle.getBoolean(e.M0, eVar.u0));
                v0(bundle.getBoolean(e.N0, eVar.v0));
                s0(bundle.getBoolean(e.O0, eVar.w0));
                t0(bundle.getBoolean(e.X0, eVar.x0));
                w0(bundle.getBoolean(e.a1, eVar.y0));
                C0(bundle.getBoolean(e.Y0, eVar.z0));
                F0(bundle.getBoolean(e.P0, eVar.A0));
                S0(bundle.getBoolean(e.Q0, eVar.B0));
                y0(bundle.getBoolean(e.R0, eVar.C0));
                x0(bundle.getBoolean(e.Z0, eVar.D0));
                this.U = new SparseArray<>();
                Q0(bundle);
                this.V = q0(bundle.getIntArray(e.V0));
            }
        }

        private e(a aVar) {
            super(aVar);
            this.p0 = aVar.F;
            this.q0 = aVar.G;
            this.r0 = aVar.H;
            this.s0 = aVar.I;
            this.t0 = aVar.J;
            this.u0 = aVar.K;
            this.v0 = aVar.L;
            this.w0 = aVar.M;
            this.x0 = aVar.N;
            this.y0 = aVar.O;
            this.z0 = aVar.P;
            this.A0 = aVar.Q;
            this.B0 = aVar.R;
            this.C0 = aVar.S;
            this.D0 = aVar.T;
            this.E0 = aVar.U;
            this.F0 = aVar.V;
        }
    }

    @Deprecated
    public static final class f extends T.c {
        private final e.a F;

        public f(Context context) {
            this.F = new e.a(context);
        }

        @Override // ax.P0.T.c
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public e F() {
            return this.F.F();
        }

        @Override // ax.P0.T.c
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public f G(int i) {
            this.F.G(i);
            return this;
        }

        @Override // ax.P0.T.c
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public f L(Set<Integer> set) {
            this.F.L(set);
            return this;
        }

        @Override // ax.P0.T.c
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public f M(int i) {
            this.F.M(i);
            return this;
        }

        @Override // ax.P0.T.c
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public f N(Q q) {
            this.F.N(q);
            return this;
        }

        public f a0(String str) {
            this.F.J0(str);
            return this;
        }

        @Override // ax.P0.T.c
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public f P(String... strArr) {
            this.F.P(strArr);
            return this;
        }

        @Override // ax.P0.T.c
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public f Q(String str) {
            this.F.Q(str);
            return this;
        }

        @Override // ax.P0.T.c
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public f R(String... strArr) {
            this.F.R(strArr);
            return this;
        }

        @Override // ax.P0.T.c
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public f S(int i) {
            this.F.S(i);
            return this;
        }

        public f f0(boolean z) {
            this.F.O0(z);
            return this;
        }

        @Override // ax.P0.T.c
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public f U(int i, boolean z) {
            this.F.U(i, z);
            return this;
        }
    }

    public static final class g {
        private static final String e = d0.G0(0);
        private static final String f = d0.G0(1);
        private static final String g = d0.G0(2);
        public final int a;
        public final int[] b;
        public final int c;
        public final int d;

        public g(int i, int[] iArr, int i2) {
            this.a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.b = copyOf;
            this.c = iArr.length;
            this.d = i2;
            Arrays.sort(copyOf);
        }

        public static g a(Bundle bundle) {
            int i = bundle.getInt(e, -1);
            int[] intArray = bundle.getIntArray(f);
            int i2 = bundle.getInt(g, -1);
            C0968a.a(i >= 0 && i2 >= 0);
            C0968a.e(intArray);
            return new g(i, intArray, i2);
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putInt(e, this.a);
            bundle.putIntArray(f, this.b);
            bundle.putInt(g, this.d);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.a == gVar.a && Arrays.equals(this.b, gVar.b) && this.d == gVar.d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.d;
        }
    }

    private static class h {
        private final Spatializer a;
        private final boolean b;
        private final Handler c;
        private final Spatializer.OnSpatializerStateChangedListener d;

        class a implements Spatializer.OnSpatializerStateChangedListener {
            final /* synthetic */ n a;

            a(n nVar) {
                this.a = nVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.a.T();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.a.T();
            }
        }

        public h(Context context, n nVar, Boolean bool) {
            Spatializer spatializer;
            int immersiveAudioLevel;
            AudioManager c = context == null ? null : ax.Q0.m.c(context);
            if (c == null || (bool != null && bool.booleanValue())) {
                this.a = null;
                this.b = false;
                this.c = null;
                this.d = null;
                return;
            }
            spatializer = c.getSpatializer();
            this.a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.b = immersiveAudioLevel != 0;
            a aVar = new a(nVar);
            this.d = aVar;
            Handler handler = new Handler((Looper) C0968a.i(Looper.myLooper()));
            this.c = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new ExecutorC3244a(handler), aVar);
        }

        public boolean a(C0894c c0894c, C0912v c0912v) {
            int i;
            boolean canBeSpatialized;
            if (Objects.equals(c0912v.o, "audio/eac3-joc")) {
                i = c0912v.G;
                if (i == 16) {
                    i = 12;
                }
            } else if (Objects.equals(c0912v.o, "audio/iamf")) {
                i = c0912v.G;
                if (i == -1) {
                    i = 6;
                }
            } else if (Objects.equals(c0912v.o, "audio/ac4")) {
                i = c0912v.G;
                if (i == 18 || i == 21) {
                    i = 24;
                }
            } else {
                i = c0912v.G;
            }
            int M = d0.M(i);
            if (M == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(M);
            int i2 = c0912v.H;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            canBeSpatialized = w.a(C0968a.e(this.a)).canBeSpatialized(c0894c.a().a, channelMask.build());
            return canBeSpatialized;
        }

        public boolean b() {
            boolean isAvailable;
            isAvailable = w.a(C0968a.e(this.a)).isAvailable();
            return isAvailable;
        }

        public boolean c() {
            boolean isEnabled;
            isEnabled = w.a(C0968a.e(this.a)).isEnabled();
            return isEnabled;
        }

        public boolean d() {
            return this.b;
        }

        public void e() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
            Spatializer spatializer = this.a;
            if (spatializer == null || (onSpatializerStateChangedListener = this.d) == null || this.c == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            this.c.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i extends j<i> implements Comparable<i> {
        private final int f0;
        private final boolean g0;
        private final boolean h0;
        private final boolean i0;
        private final int j0;
        private final int k0;
        private final int l0;
        private final int m0;
        private final boolean n0;

        public i(int i, P p, int i2, e eVar, int i3, String str, String str2) {
            super(i, p, i2);
            int i4;
            int i5 = 0;
            this.g0 = V.l(i3, false);
            int i6 = this.e0.e & (~eVar.y);
            this.h0 = (i6 & 1) != 0;
            this.i0 = (i6 & 2) != 0;
            AbstractC2991z<String> A = str2 != null ? AbstractC2991z.A(str2) : eVar.v.isEmpty() ? AbstractC2991z.A(HttpUrl.FRAGMENT_ENCODE_SET) : eVar.v;
            int i7 = 0;
            while (true) {
                if (i7 >= A.size()) {
                    i7 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    i4 = 0;
                    break;
                } else {
                    i4 = n.I(this.e0, A.get(i7), eVar.z);
                    if (i4 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.j0 = i7;
            this.k0 = i4;
            int M = n.M(this.e0.f, str2 != null ? 1088 : eVar.w);
            this.l0 = M;
            this.n0 = (1088 & this.e0.f) != 0;
            int I = n.I(this.e0, str, n.V(str) == null);
            this.m0 = I;
            boolean z = i4 > 0 || (eVar.v.isEmpty() && M > 0) || this.h0 || (this.i0 && I > 0);
            if (V.l(i3, eVar.A0) && z) {
                i5 = 1;
            }
            this.f0 = i5;
        }

        public static int j(List<i> list, List<i> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static AbstractC2991z<i> n(int i, P p, e eVar, int[] iArr, String str, String str2) {
            AbstractC2991z.a r = AbstractC2991z.r();
            for (int i2 = 0; i2 < p.a; i2++) {
                r.a(new i(i, p, i2, eVar, iArr[i2], str, str2));
            }
            return r.k();
        }

        @Override // ax.l1.n.j
        public int d() {
            return this.f0;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(i iVar) {
            AbstractC2980n d = AbstractC2980n.j().g(this.g0, iVar.g0).f(Integer.valueOf(this.j0), Integer.valueOf(iVar.j0), ax.r7.T.d().g()).d(this.k0, iVar.k0).d(this.l0, iVar.l0).g(this.h0, iVar.h0).f(Boolean.valueOf(this.i0), Boolean.valueOf(iVar.i0), this.k0 == 0 ? ax.r7.T.d() : ax.r7.T.d().g()).d(this.m0, iVar.m0);
            if (this.l0 == 0) {
                d = d.h(this.n0, iVar.n0);
            }
            return d.i();
        }

        @Override // ax.l1.n.j
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean h(i iVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class j<T extends j<T>> {
        public final P c0;
        public final int d0;
        public final C0912v e0;
        public final int q;

        public interface a<T extends j<T>> {
            List<T> a(int i, P p, int[] iArr);
        }

        public j(int i, P p, int i2) {
            this.q = i;
            this.c0 = p;
            this.d0 = i2;
            this.e0 = p.b(i2);
        }

        public abstract int d();

        public abstract boolean h(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k extends j<k> {
        private final boolean f0;
        private final e g0;
        private final boolean h0;
        private final boolean i0;
        private final boolean j0;
        private final int k0;
        private final int l0;
        private final int m0;
        private final int n0;
        private final int o0;
        private final int p0;
        private final boolean q0;
        private final int r0;
        private final boolean s0;
        private final int t0;
        private final boolean u0;
        private final boolean v0;
        private final int w0;

        /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0113 A[EDGE_INSN: B:89:0x0113->B:76:0x0113 BREAK  A[LOOP:1: B:68:0x00f4->B:87:0x0110], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x00bf A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public k(int r5, ax.P0.P r6, int r7, ax.l1.n.e r8, int r9, java.lang.String r10, int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 319
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.l1.n.k.<init>(int, ax.P0.P, int, ax.l1.n$e, int, java.lang.String, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int n(k kVar, k kVar2) {
            AbstractC2980n g = AbstractC2980n.j().g(kVar.i0, kVar2.i0).f(Integer.valueOf(kVar.n0), Integer.valueOf(kVar2.n0), ax.r7.T.d().g()).d(kVar.o0, kVar2.o0).d(kVar.p0, kVar2.p0).g(kVar.q0, kVar2.q0).d(kVar.r0, kVar2.r0).g(kVar.j0, kVar2.j0).g(kVar.f0, kVar2.f0).g(kVar.h0, kVar2.h0).f(Integer.valueOf(kVar.m0), Integer.valueOf(kVar2.m0), ax.r7.T.d().g()).g(kVar.u0, kVar2.u0).g(kVar.v0, kVar2.v0);
            if (kVar.u0 && kVar.v0) {
                g = g.d(kVar.w0, kVar2.w0);
            }
            return g.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int p(k kVar, k kVar2) {
            ax.r7.T g = (kVar.f0 && kVar.i0) ? n.l : n.l.g();
            AbstractC2980n j = AbstractC2980n.j();
            if (kVar.g0.B) {
                j = j.f(Integer.valueOf(kVar.k0), Integer.valueOf(kVar2.k0), n.l.g());
            }
            return j.f(Integer.valueOf(kVar.l0), Integer.valueOf(kVar2.l0), g).f(Integer.valueOf(kVar.k0), Integer.valueOf(kVar2.k0), g).i();
        }

        public static int q(List<k> list, List<k> list2) {
            return AbstractC2980n.j().f((k) Collections.max(list, new Comparator() { // from class: ax.l1.A
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int n;
                    n = n.k.n((n.k) obj, (n.k) obj2);
                    return n;
                }
            }), (k) Collections.max(list2, new Comparator() { // from class: ax.l1.A
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int n;
                    n = n.k.n((n.k) obj, (n.k) obj2);
                    return n;
                }
            }), new Comparator() { // from class: ax.l1.A
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int n;
                    n = n.k.n((n.k) obj, (n.k) obj2);
                    return n;
                }
            }).d(list.size(), list2.size()).f((k) Collections.max(list, new Comparator() { // from class: ax.l1.B
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int p;
                    p = n.k.p((n.k) obj, (n.k) obj2);
                    return p;
                }
            }), (k) Collections.max(list2, new Comparator() { // from class: ax.l1.B
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int p;
                    p = n.k.p((n.k) obj, (n.k) obj2);
                    return p;
                }
            }), new Comparator() { // from class: ax.l1.B
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int p;
                    p = n.k.p((n.k) obj, (n.k) obj2);
                    return p;
                }
            }).i();
        }

        public static AbstractC2991z<k> r(int i, P p, e eVar, int[] iArr, String str, int i2, Point point) {
            int J = n.J(p, point != null ? point.x : eVar.i, point != null ? point.y : eVar.j, eVar.l);
            AbstractC2991z.a r = AbstractC2991z.r();
            for (int i3 = 0; i3 < p.a; i3++) {
                int g = p.b(i3).g();
                r.a(new k(i, p, i3, eVar, iArr[i3], str, i2, J == Integer.MAX_VALUE || (g != -1 && g <= J)));
            }
            return r.k();
        }

        private int s(int i, int i2) {
            if ((this.e0.f & Http2.INITIAL_MAX_FRAME_SIZE) != 0 || !V.l(i, this.g0.A0)) {
                return 0;
            }
            if (!this.f0 && !this.g0.p0) {
                return 0;
            }
            if (!V.l(i, false) || !this.h0 || !this.f0 || this.e0.j == -1) {
                return 1;
            }
            e eVar = this.g0;
            return (eVar.C || eVar.B || (i & i2) == 0) ? 1 : 2;
        }

        @Override // ax.l1.n.j
        public int d() {
            return this.t0;
        }

        @Override // ax.l1.n.j
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public boolean h(k kVar) {
            if (!this.s0 && !Objects.equals(this.e0.o, kVar.e0.o)) {
                return false;
            }
            if (this.g0.s0) {
                return true;
            }
            return this.u0 == kVar.u0 && this.v0 == kVar.v0;
        }
    }

    public n(Context context) {
        this(context, new C2452a.b());
    }

    private static void F(AbstractC2448G.a aVar, e eVar, InterfaceC2445D.a[] aVarArr) {
        int d2 = aVar.d();
        for (int i2 = 0; i2 < d2; i2++) {
            q0 g2 = aVar.g(i2);
            if (eVar.V(i2, g2)) {
                g U = eVar.U(i2, g2);
                aVarArr[i2] = (U == null || U.b.length == 0) ? null : new InterfaceC2445D.a(g2.c(U.a), U.b, U.d);
            }
        }
    }

    private static void G(AbstractC2448G.a aVar, ax.P0.T t, InterfaceC2445D.a[] aVarArr) {
        int d2 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < d2; i2++) {
            H(aVar.g(i2), t, hashMap);
        }
        H(aVar.j(), t, hashMap);
        for (int i3 = 0; i3 < d2; i3++) {
            Q q = (Q) hashMap.get(Integer.valueOf(aVar.f(i3)));
            if (q != null) {
                aVarArr[i3] = (q.b.isEmpty() || aVar.g(i3).e(q.a) == -1) ? null : new InterfaceC2445D.a(q.a, C3218f.o(q.b));
            }
        }
    }

    private static void H(q0 q0Var, ax.P0.T t, Map<Integer, Q> map) {
        Q q;
        for (int i2 = 0; i2 < q0Var.a; i2++) {
            Q q2 = t.D.get(q0Var.c(i2));
            if (q2 != null && ((q = map.get(Integer.valueOf(q2.b()))) == null || (q.b.isEmpty() && !q2.b.isEmpty()))) {
                map.put(Integer.valueOf(q2.b()), q2);
            }
        }
    }

    protected static int I(C0912v c0912v, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c0912v.d)) {
            return 4;
        }
        String V = V(str);
        String V2 = V(c0912v.d);
        if (V2 == null || V == null) {
            return (z && V2 == null) ? 1 : 0;
        }
        if (V2.startsWith(V) || V.startsWith(V2)) {
            return 3;
        }
        return d0.y1(V2, "-")[0].equals(d0.y1(V, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int J(P p, int i2, int i3, boolean z) {
        int i4;
        int i5 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            for (int i6 = 0; i6 < p.a; i6++) {
                C0912v b2 = p.b(i6);
                int i7 = b2.v;
                if (i7 > 0 && (i4 = b2.w) > 0) {
                    Point d2 = C2450I.d(z, i2, i3, i7, i4);
                    int i8 = b2.v;
                    int i9 = b2.w;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (d2.x * 0.98f)) && i9 >= ((int) (d2.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
        }
        return i5;
    }

    private static String L(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return d0.f0(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int M(int i2, int i3) {
        return (i2 == 0 || i2 != i3) ? Integer.bitCount(i2 & i3) : SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int N(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O(C0912v c0912v, e eVar) {
        int i2;
        h hVar;
        h hVar2;
        if (!eVar.z0) {
            return true;
        }
        Boolean bool = this.k;
        if ((bool != null && bool.booleanValue()) || (i2 = c0912v.G) == -1 || i2 <= 2) {
            return true;
        }
        if (!P(c0912v) || (Build.VERSION.SDK_INT >= 32 && (hVar2 = this.i) != null && hVar2.d())) {
            return Build.VERSION.SDK_INT >= 32 && (hVar = this.i) != null && hVar.d() && this.i.b() && this.i.c() && this.i.a(this.j, c0912v);
        }
        return true;
    }

    private static boolean P(C0912v c0912v) {
        String str = c0912v.o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Q(C0912v c0912v) {
        String str = c0912v.o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    private static void R(e eVar, AbstractC2448G.a aVar, int[][][] iArr, W[] wArr, InterfaceC2445D[] interfaceC2445DArr) {
        int i2 = -1;
        boolean z = false;
        int i3 = 0;
        for (int i4 = 0; i4 < aVar.d(); i4++) {
            int f2 = aVar.f(i4);
            InterfaceC2445D interfaceC2445D = interfaceC2445DArr[i4];
            if (f2 != 1 && interfaceC2445D != null) {
                return;
            }
            if (f2 == 1 && interfaceC2445D != null && interfaceC2445D.length() == 1) {
                if (W(eVar, iArr[i4][aVar.g(i4).e(interfaceC2445D.b())][interfaceC2445D.j(0)], interfaceC2445D.m())) {
                    i3++;
                    i2 = i4;
                }
            }
        }
        if (i3 == 1) {
            int i5 = eVar.u.b ? 1 : 2;
            W w = wArr[i2];
            if (w != null && w.b) {
                z = true;
            }
            wArr[i2] = new W(i5, z);
        }
    }

    private static void S(AbstractC2448G.a aVar, int[][][] iArr, W[] wArr, InterfaceC2445D[] interfaceC2445DArr) {
        boolean z;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < aVar.d(); i4++) {
            int f2 = aVar.f(i4);
            InterfaceC2445D interfaceC2445D = interfaceC2445DArr[i4];
            if ((f2 == 1 || f2 == 2) && interfaceC2445D != null && X(iArr[i4], aVar.g(i4), interfaceC2445D)) {
                if (f2 == 1) {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                } else {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                }
            }
        }
        z = true;
        if (z && ((i3 == -1 || i2 == -1) ? false : true)) {
            W w = new W(0, true);
            wArr[i3] = w;
            wArr[i2] = w;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        boolean z;
        h hVar;
        synchronized (this.d) {
            try {
                z = this.g.z0 && Build.VERSION.SDK_INT >= 32 && (hVar = this.i) != null && hVar.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            f();
        }
    }

    private void U(M0 m0) {
        boolean z;
        synchronized (this.d) {
            z = this.g.D0;
        }
        if (z) {
            g(m0);
        }
    }

    protected static String V(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean W(e eVar, int i2, C0912v c0912v) {
        if (V.g(i2) == 0) {
            return false;
        }
        if (eVar.u.c && (V.g(i2) & 2048) == 0) {
            return false;
        }
        if (eVar.u.b) {
            boolean z = (c0912v.J == 0 && c0912v.K == 0) ? false : true;
            boolean z2 = (V.g(i2) & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    private static boolean X(int[][] iArr, q0 q0Var, InterfaceC2445D interfaceC2445D) {
        if (interfaceC2445D == null) {
            return false;
        }
        int e2 = q0Var.e(interfaceC2445D.b());
        for (int i2 = 0; i2 < interfaceC2445D.length(); i2++) {
            if (V.k(iArr[e2][interfaceC2445D.j(i2)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends j<T>> Pair<InterfaceC2445D.a, Integer> d0(int i2, AbstractC2448G.a aVar, int[][][] iArr, j.a<T> aVar2, Comparator<List<T>> comparator) {
        int i3;
        RandomAccess randomAccess;
        AbstractC2448G.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d2 = aVar3.d();
        int i4 = 0;
        while (i4 < d2) {
            if (i2 == aVar3.f(i4)) {
                q0 g2 = aVar3.g(i4);
                for (int i5 = 0; i5 < g2.a; i5++) {
                    P c2 = g2.c(i5);
                    List<T> a2 = aVar2.a(i4, c2, iArr[i4][i5]);
                    boolean[] zArr = new boolean[c2.a];
                    int i6 = 0;
                    while (i6 < c2.a) {
                        T t = a2.get(i6);
                        int d3 = t.d();
                        if (zArr[i6] || d3 == 0) {
                            i3 = d2;
                        } else {
                            if (d3 == 1) {
                                randomAccess = AbstractC2991z.A(t);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i7 = i6 + 1;
                                while (i7 < c2.a) {
                                    T t2 = a2.get(i7);
                                    int i8 = d2;
                                    if (t2.d() == 2 && t.h(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    d2 = i8;
                                }
                                randomAccess = arrayList2;
                            }
                            i3 = d2;
                            arrayList.add(randomAccess);
                        }
                        i6++;
                        d2 = i3;
                    }
                }
            }
            i4++;
            aVar3 = aVar;
            d2 = d2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((j) list.get(i9)).d0;
        }
        j jVar = (j) list.get(0);
        return Pair.create(new InterfaceC2445D.a(jVar.c0, iArr2), Integer.valueOf(jVar.q));
    }

    private void f0(e eVar) {
        boolean equals;
        C0968a.e(eVar);
        synchronized (this.d) {
            equals = this.g.equals(eVar);
            this.g = eVar;
        }
        if (equals) {
            return;
        }
        if (eVar.z0 && this.e == null) {
            C0987u.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        f();
    }

    public static /* synthetic */ List s(final n nVar, final e eVar, boolean z, int[] iArr, int i2, P p, int[] iArr2) {
        nVar.getClass();
        return b.n(i2, p, eVar, iArr2, z, new ax.q7.o() { // from class: ax.l1.m
            @Override // ax.q7.o
            public final boolean apply(Object obj) {
                boolean O;
                O = n.this.O((C0912v) obj, eVar);
                return O;
            }
        }, iArr[i2]);
    }

    public static /* synthetic */ int w(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @Override // ax.l1.AbstractC2451J
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public e c() {
        e eVar;
        synchronized (this.d) {
            eVar = this.g;
        }
        return eVar;
    }

    protected InterfaceC2445D.a[] Y(AbstractC2448G.a aVar, int[][][] iArr, int[] iArr2, e eVar) throws C0622s {
        String str;
        int d2 = aVar.d();
        InterfaceC2445D.a[] aVarArr = new InterfaceC2445D.a[d2];
        Pair<InterfaceC2445D.a, Integer> Z = Z(aVar, iArr, iArr2, eVar);
        if (Z != null) {
            aVarArr[((Integer) Z.second).intValue()] = (InterfaceC2445D.a) Z.first;
        }
        if (Z == null) {
            str = null;
        } else {
            Object obj = Z.first;
            str = ((InterfaceC2445D.a) obj).a.b(((InterfaceC2445D.a) obj).b[0]).d;
        }
        Pair<InterfaceC2445D.a, Integer> e0 = e0(aVar, iArr, iArr2, eVar, str);
        String str2 = str;
        Pair<InterfaceC2445D.a, Integer> a0 = (eVar.A || e0 == null) ? a0(aVar, iArr, eVar) : null;
        if (a0 != null) {
            aVarArr[((Integer) a0.second).intValue()] = (InterfaceC2445D.a) a0.first;
        } else if (e0 != null) {
            aVarArr[((Integer) e0.second).intValue()] = (InterfaceC2445D.a) e0.first;
        }
        Pair<InterfaceC2445D.a, Integer> c0 = c0(aVar, iArr, eVar, str2);
        if (c0 != null) {
            aVarArr[((Integer) c0.second).intValue()] = (InterfaceC2445D.a) c0.first;
        }
        for (int i2 = 0; i2 < d2; i2++) {
            int f2 = aVar.f(i2);
            if (f2 != 2 && f2 != 1 && f2 != 3 && f2 != 4) {
                aVarArr[i2] = b0(f2, aVar.g(i2), iArr[i2], eVar);
            }
        }
        return aVarArr;
    }

    protected Pair<InterfaceC2445D.a, Integer> Z(AbstractC2448G.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) throws C0622s {
        final boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < aVar.d()) {
                if (2 == aVar.f(i2) && aVar.g(i2).a > 0) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return d0(1, aVar, iArr, new j.a() { // from class: ax.l1.i
            @Override // ax.l1.n.j.a
            public final List a(int i3, P p, int[] iArr3) {
                return n.s(n.this, eVar, z, iArr2, i3, p, iArr3);
            }
        }, new Comparator() { // from class: ax.l1.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.j((List) obj, (List) obj2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.N0.a
    public void a(M0 m0) {
        U(m0);
    }

    protected Pair<InterfaceC2445D.a, Integer> a0(AbstractC2448G.a aVar, int[][][] iArr, final e eVar) throws C0622s {
        if (eVar.u.a == 2) {
            return null;
        }
        return d0(4, aVar, iArr, new j.a() { // from class: ax.l1.e
            @Override // ax.l1.n.j.a
            public final List a(int i2, P p, int[] iArr2) {
                List n;
                n = n.c.n(i2, p, n.e.this, iArr2);
                return n;
            }
        }, new Comparator() { // from class: ax.l1.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.j((List) obj, (List) obj2);
            }
        });
    }

    protected InterfaceC2445D.a b0(int i2, q0 q0Var, int[][] iArr, e eVar) throws C0622s {
        if (eVar.u.a == 2) {
            return null;
        }
        P p = null;
        d dVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < q0Var.a; i4++) {
            P c2 = q0Var.c(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < c2.a; i5++) {
                if (V.l(iArr2[i5], eVar.A0)) {
                    d dVar2 = new d(c2.b(i5), iArr2[i5]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        p = c2;
                        i3 = i5;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (p == null) {
            return null;
        }
        return new InterfaceC2445D.a(p, i3);
    }

    protected Pair<InterfaceC2445D.a, Integer> c0(AbstractC2448G.a aVar, int[][][] iArr, final e eVar, final String str) throws C0622s {
        if (eVar.u.a == 2) {
            return null;
        }
        final String L = eVar.x ? L(this.e) : null;
        return d0(3, aVar, iArr, new j.a() { // from class: ax.l1.k
            @Override // ax.l1.n.j.a
            public final List a(int i2, P p, int[] iArr2) {
                List n;
                n = n.i.n(i2, p, n.e.this, iArr2, str, L);
                return n;
            }
        }, new Comparator() { // from class: ax.l1.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.i.j((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<InterfaceC2445D.a, Integer> e0(AbstractC2448G.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, final String str) throws C0622s {
        Context context;
        final Point point = null;
        if (eVar.u.a == 2) {
            return null;
        }
        if (eVar.k && (context = this.e) != null) {
            point = d0.V(context);
        }
        return d0(2, aVar, iArr, new j.a() { // from class: ax.l1.g
            @Override // ax.l1.n.j.a
            public final List a(int i2, P p, int[] iArr3) {
                List r;
                r = n.k.r(i2, p, n.e.this, iArr3, str, iArr2[i2], point);
                return r;
            }
        }, new Comparator() { // from class: ax.l1.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.k.q((List) obj, (List) obj2);
            }
        });
    }

    @Override // ax.l1.AbstractC2451J
    public boolean h() {
        return true;
    }

    @Override // ax.l1.AbstractC2451J
    public void j() {
        h hVar;
        synchronized (this.d) {
            try {
                Thread thread = this.h;
                if (thread != null) {
                    C0968a.h(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (hVar = this.i) != null) {
            hVar.e();
            this.i = null;
        }
        super.j();
    }

    @Override // ax.l1.AbstractC2451J
    public void l(C0894c c0894c) {
        if (this.j.equals(c0894c)) {
            return;
        }
        this.j = c0894c;
        T();
    }

    @Override // ax.l1.AbstractC2451J
    public void m(ax.P0.T t) {
        if (t instanceof e) {
            f0((e) t);
        }
        f0(new e.a().r0(t).F());
    }

    @Override // ax.l1.AbstractC2448G
    protected final Pair<W[], InterfaceC2445D[]> r(AbstractC2448G.a aVar, int[][][] iArr, int[] iArr2, InterfaceC2209F.b bVar, N n) throws C0622s {
        e eVar;
        Context context;
        synchronized (this.d) {
            this.h = Thread.currentThread();
            eVar = this.g;
        }
        if (this.k == null && (context = this.e) != null) {
            this.k = Boolean.valueOf(d0.S0(context));
        }
        if (eVar.z0 && Build.VERSION.SDK_INT >= 32 && this.i == null) {
            this.i = new h(this.e, this, this.k);
        }
        int d2 = aVar.d();
        InterfaceC2445D.a[] Y = Y(aVar, iArr, iArr2, eVar);
        G(aVar, eVar, Y);
        F(aVar, eVar, Y);
        for (int i2 = 0; i2 < d2; i2++) {
            int f2 = aVar.f(i2);
            if (eVar.T(i2) || eVar.E.contains(Integer.valueOf(f2))) {
                Y[i2] = null;
            }
        }
        InterfaceC2445D[] a2 = this.f.a(Y, b(), bVar, n);
        W[] wArr = new W[d2];
        for (int i3 = 0; i3 < d2; i3++) {
            wArr[i3] = (eVar.T(i3) || eVar.E.contains(Integer.valueOf(aVar.f(i3))) || (aVar.f(i3) != -2 && a2[i3] == null)) ? null : W.c;
        }
        if (eVar.B0) {
            S(aVar, iArr, wArr, a2);
        }
        if (eVar.u.a != 0) {
            R(eVar, aVar, iArr, wArr, a2);
        }
        return Pair.create(wArr, a2);
    }

    public n(Context context, InterfaceC2445D.b bVar) {
        this(context, e.G0, bVar);
    }

    @Deprecated
    public n(ax.P0.T t, InterfaceC2445D.b bVar) {
        this(t, bVar, (Context) null);
    }

    public n(Context context, ax.P0.T t, InterfaceC2445D.b bVar) {
        this(t, bVar, context);
    }

    private n(ax.P0.T t, InterfaceC2445D.b bVar, Context context) {
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = bVar;
        if (t instanceof e) {
            this.g = (e) t;
        } else {
            this.g = e.G0.I().r0(t).F();
        }
        this.j = C0894c.h;
        if (this.g.z0 && context == null) {
            C0987u.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // ax.l1.AbstractC2451J
    public N0.a d() {
        return this;
    }
}
