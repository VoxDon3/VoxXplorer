package ax.r0;

import ax.r0.K;
import ax.r0.u0;
import ax.r0.v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ax.r0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2925l implements v0 {
    private final AbstractC2924k a;

    /* renamed from: ax.r0.l$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u0.b.values().length];
            a = iArr;
            try {
                iArr[u0.b.k0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u0.b.j0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u0.b.h0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u0.b.r0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u0.b.t0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u0.b.p0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u0.b.i0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u0.b.f0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u0.b.s0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u0.b.u0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u0.b.g0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u0.b.l0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C2925l(AbstractC2924k abstractC2924k) {
        AbstractC2924k abstractC2924k2 = (AbstractC2924k) C2904A.b(abstractC2924k, "output");
        this.a = abstractC2924k2;
        abstractC2924k2.a = this;
    }

    public static C2925l P(AbstractC2924k abstractC2924k) {
        C2925l c2925l = abstractC2924k.a;
        return c2925l != null ? c2925l : new C2925l(abstractC2924k);
    }

    private <V> void Q(int i, boolean z, V v, K.a<Boolean, V> aVar) throws IOException {
        this.a.W0(i, 2);
        this.a.Y0(K.b(aVar, Boolean.valueOf(z), v));
        K.e(this.a, aVar, Boolean.valueOf(z), v);
    }

    private <V> void R(int i, K.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.a.W0(i, 2);
            this.a.Y0(K.b(aVar, Integer.valueOf(i4), v));
            K.e(this.a, aVar, Integer.valueOf(i4), v);
        }
    }

    private <V> void S(int i, K.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.a.W0(i, 2);
            this.a.Y0(K.b(aVar, Long.valueOf(j), v));
            K.e(this.a, aVar, Long.valueOf(j), v);
        }
    }

    private <K, V> void T(int i, K.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.a[aVar.a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    Q(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    Q(i, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i, aVar, map);
                return;
            case 12:
                U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.a);
        }
    }

    private <V> void U(int i, K.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            V v = map.get(str);
            this.a.W0(i, 2);
            this.a.Y0(K.b(aVar, str, v));
            K.e(this.a, aVar, str, v);
        }
    }

    private void V(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.a.U0(i, (String) obj);
        } else {
            this.a.o0(i, (AbstractC2921h) obj);
        }
    }

    @Override // ax.r0.v0
    public void A(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k0(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.e(list.get(i4).booleanValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.l0(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void B(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.X0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.X(list.get(i4).intValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.Y0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void C(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.S0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.S(list.get(i4).longValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.T0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void D(int i, long j) throws IOException {
        this.a.S0(i, j);
    }

    @Override // ax.r0.v0
    public void E(int i, float f) throws IOException {
        this.a.y0(i, f);
    }

    @Override // ax.r0.v0
    public void F(int i) throws IOException {
        this.a.W0(i, 4);
    }

    @Override // ax.r0.v0
    public void G(int i, List<?> list, h0 h0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            I(i, list.get(i2), h0Var);
        }
    }

    @Override // ax.r0.v0
    public void H(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.Q0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.Q(list.get(i4).intValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.R0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void I(int i, Object obj, h0 h0Var) throws IOException {
        this.a.I0(i, (S) obj, h0Var);
    }

    @Override // ax.r0.v0
    public void J(int i, int i2) throws IOException {
        this.a.s0(i, i2);
    }

    @Override // ax.r0.v0
    public void K(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.G0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.y(list.get(i4).longValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.H0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void L(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.s0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.l(list.get(i4).intValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.t0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void M(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.q0(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.j(list.get(i4).doubleValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.r0(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void N(int i, int i2) throws IOException {
        this.a.Q0(i, i2);
    }

    @Override // ax.r0.v0
    public void O(int i, List<AbstractC2921h> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.o0(i, list.get(i2));
        }
    }

    @Override // ax.r0.v0
    public void a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.y0(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.r(list.get(i4).floatValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.z0(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void b(int i, int i2) throws IOException {
        this.a.X0(i, i2);
    }

    @Override // ax.r0.v0
    public final void c(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC2921h) {
            this.a.L0(i, (AbstractC2921h) obj);
        } else {
            this.a.K0(i, (S) obj);
        }
    }

    @Override // ax.r0.v0
    public void d(int i, int i2) throws IOException {
        this.a.u0(i, i2);
    }

    @Override // ax.r0.v0
    public void e(int i, double d) throws IOException {
        this.a.q0(i, d);
    }

    @Override // ax.r0.v0
    public void f(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.O0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.O(list.get(i4).longValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.P0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void g(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.Z0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.Z(list.get(i4).longValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.a1(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void h(int i, List<?> list, h0 h0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            s(i, list.get(i2), h0Var);
        }
    }

    @Override // ax.r0.v0
    public void i(int i, long j) throws IOException {
        this.a.w0(i, j);
    }

    @Override // ax.r0.v0
    public v0.a j() {
        return v0.a.ASCENDING;
    }

    @Override // ax.r0.v0
    public void k(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof InterfaceC2910G)) {
            while (i2 < list.size()) {
                this.a.U0(i, list.get(i2));
                i2++;
            }
        } else {
            InterfaceC2910G interfaceC2910G = (InterfaceC2910G) list;
            while (i2 < list.size()) {
                V(i, interfaceC2910G.D0(i2));
                i2++;
            }
        }
    }

    @Override // ax.r0.v0
    public void l(int i, String str) throws IOException {
        this.a.U0(i, str);
    }

    @Override // ax.r0.v0
    public void m(int i, long j) throws IOException {
        this.a.Z0(i, j);
    }

    @Override // ax.r0.v0
    public void n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.E0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.w(list.get(i4).intValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.F0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void o(int i, long j) throws IOException {
        this.a.G0(i, j);
    }

    @Override // ax.r0.v0
    public void p(int i, boolean z) throws IOException {
        this.a.k0(i, z);
    }

    @Override // ax.r0.v0
    public void q(int i, int i2) throws IOException {
        this.a.M0(i, i2);
    }

    @Override // ax.r0.v0
    public void r(int i, AbstractC2921h abstractC2921h) throws IOException {
        this.a.o0(i, abstractC2921h);
    }

    @Override // ax.r0.v0
    public void s(int i, Object obj, h0 h0Var) throws IOException {
        this.a.B0(i, (S) obj, h0Var);
    }

    @Override // ax.r0.v0
    public void t(int i) throws IOException {
        this.a.W0(i, 3);
    }

    @Override // ax.r0.v0
    public void u(int i, int i2) throws IOException {
        this.a.E0(i, i2);
    }

    @Override // ax.r0.v0
    public void v(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.w0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.p(list.get(i4).longValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.x0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public void w(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.M0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.M(list.get(i4).intValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.N0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // ax.r0.v0
    public <K, V> void x(int i, K.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.a.e0()) {
            T(i, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.W0(i, 2);
            this.a.Y0(K.b(aVar, entry.getKey(), entry.getValue()));
            K.e(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // ax.r0.v0
    public void y(int i, long j) throws IOException {
        this.a.O0(i, j);
    }

    @Override // ax.r0.v0
    public void z(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.u0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.W0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC2924k.n(list.get(i4).intValue());
        }
        this.a.Y0(i3);
        while (i2 < list.size()) {
            this.a.v0(list.get(i2).intValue());
            i2++;
        }
    }
}
