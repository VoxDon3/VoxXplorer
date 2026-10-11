/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.G;
import ax.r0.K;
import ax.r0.S;
import ax.r0.h;
import ax.r0.h0;
import ax.r0.k;
import ax.r0.v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class l
implements v0 {
    private final k a;

    private l(k k8) {
        this.a = k8 = A.b(k8, "output");
        k8.a = this;
    }

    public static l P(k k8) {
        l l8 = k8.a;
        if (l8 != null) {
            return l8;
        }
        return new l(k8);
    }

    private <V> void Q(int n8, boolean bl, V v8, K.a<Boolean, V> a8) throws IOException {
        this.a.W0(n8, 2);
        this.a.Y0(K.b(a8, bl, v8));
        K.e(this.a, a8, bl, v8);
    }

    private <V> void R(int n8, K.a<Integer, V> a8, Map<Integer, V> map) throws IOException {
        int n9 = map.size();
        int[] nArray = new int[n9];
        Iterator<Integer> iterator = map.keySet().iterator();
        int n10 = 0;
        int n11 = 0;
        while (iterator.hasNext()) {
            nArray[n11] = iterator.next();
            ++n11;
        }
        Arrays.sort(nArray);
        for (n11 = n10; n11 < n9; ++n11) {
            n10 = nArray[n11];
            iterator = map.get(n10);
            this.a.W0(n8, 2);
            this.a.Y0(K.b(a8, n10, iterator));
            K.e(this.a, a8, n10, iterator);
        }
    }

    private <V> void S(int n8, K.a<Long, V> a8, Map<Long, V> map) throws IOException {
        int n9 = map.size();
        long[] lArray = new long[n9];
        Iterator<Long> iterator = map.keySet().iterator();
        int n10 = 0;
        int n11 = 0;
        while (iterator.hasNext()) {
            lArray[n11] = iterator.next();
            ++n11;
        }
        Arrays.sort(lArray);
        for (n11 = n10; n11 < n9; ++n11) {
            long l8 = lArray[n11];
            iterator = map.get(l8);
            this.a.W0(n8, 2);
            this.a.Y0(K.b(a8, l8, iterator));
            K.e(this.a, a8, l8, iterator);
        }
    }

    private <K, V> void T(int n8, K.a<K, V> a8, Map<K, V> object) throws IOException {
        switch (ax.r0.l$a.a[a8.a.ordinal()]) {
            default: {
                object = new StringBuilder();
                ((StringBuilder)object).append("does not support key type: ");
                ((StringBuilder)object).append((Object)a8.a);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            case 12: {
                this.U(n8, (K.a<String, V>)a8, (Map<String, V>)object);
                return;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                this.S(n8, (K.a<Long, V>)a8, (Map<Long, V>)object);
                return;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                this.R(n8, (K.a<Integer, V>)a8, (Map<Integer, V>)object);
                return;
            }
            case 1: 
        }
        V v8 = object.get(Boolean.FALSE);
        if (v8 != null) {
            this.Q(n8, false, v8, a8);
        }
        if ((object = object.get(Boolean.TRUE)) != null) {
            this.Q(n8, true, object, a8);
        }
    }

    private <V> void U(int n8, K.a<String, V> a8, Map<String, V> map) throws IOException {
        int n9 = map.size();
        Object[] objectArray = new String[n9];
        Iterator<String> iterator = map.keySet().iterator();
        int n10 = 0;
        int n11 = 0;
        while (iterator.hasNext()) {
            objectArray[n11] = iterator.next();
            ++n11;
        }
        Arrays.sort(objectArray);
        for (n11 = n10; n11 < n9; ++n11) {
            Object object = objectArray[n11];
            iterator = map.get(object);
            this.a.W0(n8, 2);
            this.a.Y0(K.b(a8, object, iterator));
            K.e(this.a, a8, object, iterator);
        }
    }

    private void V(int n8, Object object) throws IOException {
        if (object instanceof String) {
            this.a.U0(n8, (String)object);
            return;
        }
        this.a.o0(n8, (h)object);
    }

    @Override
    public void A(int n8, List<Boolean> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < list.size(); ++n9) {
                n8 += k.e(list.get(n9));
            }
            this.a.Y0(n8);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.l0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.k0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void B(int n8, List<Integer> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < list.size(); ++n8) {
                n9 += k.X(list.get(n8));
            }
            this.a.Y0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.Y0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.X0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void C(int n8, List<Long> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < list.size(); ++n9) {
                n8 += k.S(list.get(n9));
            }
            this.a.Y0(n8);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.T0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.S0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void D(int n8, long l8) throws IOException {
        this.a.S0(n8, l8);
    }

    @Override
    public void E(int n8, float f8) throws IOException {
        this.a.y0(n8, f8);
    }

    @Override
    public void F(int n8) throws IOException {
        this.a.W0(n8, 4);
    }

    @Override
    public void G(int n8, List<?> list, h0 h02) throws IOException {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.I(n8, list.get(i8), h02);
        }
    }

    @Override
    public void H(int n8, List<Integer> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < list.size(); ++n8) {
                n9 += k.Q(list.get(n8));
            }
            this.a.Y0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.R0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.Q0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void I(int n8, Object object, h0 h02) throws IOException {
        this.a.I0(n8, (S)object, h02);
    }

    @Override
    public void J(int n8, int n9) throws IOException {
        this.a.s0(n8, n9);
    }

    @Override
    public void K(int n8, List<Long> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < list.size(); ++n8) {
                n9 += k.y(list.get(n8));
            }
            this.a.Y0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.H0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.G0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void L(int n8, List<Integer> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < list.size(); ++n9) {
                n8 += k.l(list.get(n9));
            }
            this.a.Y0(n8);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.t0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.s0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void M(int n8, List<Double> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < list.size(); ++n9) {
                n8 += k.j(list.get(n9));
            }
            this.a.Y0(n8);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.r0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.q0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void N(int n8, int n9) throws IOException {
        this.a.Q0(n8, n9);
    }

    @Override
    public void O(int n8, List<h> list) throws IOException {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.a.o0(n8, list.get(i8));
        }
    }

    @Override
    public void a(int n8, List<Float> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < list.size(); ++n9) {
                n8 += k.r(list.get(n9).floatValue());
            }
            this.a.Y0(n8);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.z0(list.get(n8).floatValue());
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.y0(n8, list.get(n9).floatValue());
            }
        }
    }

    @Override
    public void b(int n8, int n9) throws IOException {
        this.a.X0(n8, n9);
    }

    @Override
    public final void c(int n8, Object object) throws IOException {
        if (object instanceof h) {
            this.a.L0(n8, (h)object);
            return;
        }
        this.a.K0(n8, (S)object);
    }

    @Override
    public void d(int n8, int n9) throws IOException {
        this.a.u0(n8, n9);
    }

    @Override
    public void e(int n8, double d8) throws IOException {
        this.a.q0(n8, d8);
    }

    @Override
    public void f(int n8, List<Long> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < list.size(); ++n9) {
                n8 += k.O(list.get(n9));
            }
            this.a.Y0(n8);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.P0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.O0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void g(int n8, List<Long> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < list.size(); ++n9) {
                n8 += k.Z(list.get(n9));
            }
            this.a.Y0(n8);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.a1(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.Z0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void h(int n8, List<?> list, h0 h02) throws IOException {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.s(n8, list.get(i8), h02);
        }
    }

    @Override
    public void i(int n8, long l8) throws IOException {
        this.a.w0(n8, l8);
    }

    @Override
    public v0.a j() {
        return v0.a.q;
    }

    @Override
    public void k(int n8, List<String> list) throws IOException {
        int n9;
        boolean bl = list instanceof G;
        int n10 = 0;
        if (bl) {
            G g8 = (G)list;
            for (n9 = n10; n9 < list.size(); ++n9) {
                this.V(n8, g8.D0(n9));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.U0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void l(int n8, String string) throws IOException {
        this.a.U0(n8, string);
    }

    @Override
    public void m(int n8, long l8) throws IOException {
        this.a.Z0(n8, l8);
    }

    @Override
    public void n(int n8, List<Integer> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < list.size(); ++n8) {
                n9 += k.w(list.get(n8));
            }
            this.a.Y0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.F0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.E0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void o(int n8, long l8) throws IOException {
        this.a.G0(n8, l8);
    }

    @Override
    public void p(int n8, boolean bl) throws IOException {
        this.a.k0(n8, bl);
    }

    @Override
    public void q(int n8, int n9) throws IOException {
        this.a.M0(n8, n9);
    }

    @Override
    public void r(int n8, h h8) throws IOException {
        this.a.o0(n8, h8);
    }

    @Override
    public void s(int n8, Object object, h0 h02) throws IOException {
        this.a.B0(n8, (S)object, h02);
    }

    @Override
    public void t(int n8) throws IOException {
        this.a.W0(n8, 3);
    }

    @Override
    public void u(int n8, int n9) throws IOException {
        this.a.E0(n8, n9);
    }

    @Override
    public void v(int n8, List<Long> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < list.size(); ++n8) {
                n9 += k.p(list.get(n8));
            }
            this.a.Y0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.x0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.w0(n8, list.get(n9));
            }
        }
    }

    @Override
    public void w(int n8, List<Integer> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < list.size(); ++n9) {
                n8 += k.M(list.get(n9));
            }
            this.a.Y0(n8);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.N0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.M0(n8, list.get(n9));
            }
        }
    }

    @Override
    public <K, V> void x(int n8, K.a<K, V> a8, Map<K, V> object2) throws IOException {
        if (this.a.e0()) {
            this.T(n8, a8, (Map<K, V>)object2);
            return;
        }
        for (Map.Entry entry : object2.entrySet()) {
            this.a.W0(n8, 2);
            this.a.Y0(K.b(a8, entry.getKey(), entry.getValue()));
            K.e(this.a, a8, entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void y(int n8, long l8) throws IOException {
        this.a.O0(n8, l8);
    }

    @Override
    public void z(int n8, List<Integer> list, boolean bl) throws IOException {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.W0(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < list.size(); ++n8) {
                n9 += k.n(list.get(n8));
            }
            this.a.Y0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.v0(list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.u0(n8, list.get(n9));
            }
        }
    }
}

