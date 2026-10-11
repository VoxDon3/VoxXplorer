/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.B4;
import ax.b6.C4;
import ax.b6.F4;
import ax.b6.G5;
import ax.b6.H5;
import ax.b6.I5;
import ax.b6.N4;
import ax.b6.S3;
import ax.b6.U4;
import ax.b6.Y3;
import ax.b6.c6;
import ax.b6.d4;
import ax.b6.f4;
import ax.b6.k4;
import ax.b6.l5;
import ax.b6.n4;
import ax.b6.o4;
import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;

final class n5 {
    private static final G5<?, ?> a = new I5();

    static int A(int n8, List<?> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n9 * S3.T(n8, 0L);
    }

    static int B(List<?> list) {
        return list.size() << 3;
    }

    public static void C(int n8, List<Integer> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.z(n8, list, bl);
        }
    }

    static int D(int n8, List<Integer> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n5.E(list) + n9 * S3.w0(n8);
    }

    static int E(List<Integer> n42) {
        int n8;
        int n9 = n42.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        if (n42 instanceof n4) {
            n42 = n42;
            int n11 = 0;
            for (n8 = n10; n8 < n9; ++n8) {
                n11 += S3.k0(n42.g(n8));
            }
            return n11;
        }
        int n12 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n12 += S3.k0((Integer)n42.get(n8));
        }
        return n12;
    }

    public static void F(int n8, List<Long> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.w(n8, list, bl);
        }
    }

    static int G(int n8, List<Long> list, boolean bl) {
        if (list.size() == 0) {
            return 0;
        }
        return n5.H(list) + list.size() * S3.w0(n8);
    }

    static int H(List<Long> f42) {
        int n8;
        int n9;
        int n10 = f42.size();
        if (n10 == 0) {
            return 0;
        }
        if (f42 instanceof F4) {
            f42 = f42;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                n9 += S3.e0(f42.m(n8));
            }
            return n9;
        }
        n8 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            n8 += S3.e0((Long)f42.get(n9));
        }
        return n8;
    }

    public static void I(int n8, List<Float> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.J(n8, list, bl);
        }
    }

    static int J(int n8, List<Integer> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n5.K(list) + n9 * S3.w0(n8);
    }

    static int K(List<Integer> n42) {
        int n8;
        int n9;
        int n10 = n42.size();
        if (n10 == 0) {
            return 0;
        }
        if (n42 instanceof n4) {
            n42 = n42;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                n9 += S3.s0(n42.g(n8));
            }
            return n9;
        }
        n8 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            n8 += S3.s0((Integer)n42.get(n9));
        }
        return n8;
    }

    public static void L(int n8, List<Integer> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.C(n8, list, bl);
        }
    }

    static int M(int n8, List<Long> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n5.N(list) + n9 * S3.w0(n8);
    }

    static int N(List<Long> f42) {
        int n8;
        int n9;
        int n10 = f42.size();
        if (n10 == 0) {
            return 0;
        }
        if (f42 instanceof F4) {
            f42 = f42;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                n9 += S3.n0(f42.m(n8));
            }
            return n9;
        }
        n8 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            n8 += S3.n0((Long)f42.get(n9));
        }
        return n8;
    }

    public static void O(int n8, List<Long> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.h(n8, list, bl);
        }
    }

    static int P(int n8, List<Integer> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n5.Q(list) + n9 * S3.w0(n8);
    }

    static int Q(List<Integer> n42) {
        int n8;
        int n9 = n42.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        if (n42 instanceof n4) {
            n42 = n42;
            int n11 = 0;
            for (n8 = n10; n8 < n9; ++n8) {
                n11 += S3.z0(n42.g(n8));
            }
            return n11;
        }
        int n12 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n12 += S3.z0((Integer)n42.get(n8));
        }
        return n12;
    }

    public static void R(int n8, List<Integer> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.c(n8, list, bl);
        }
    }

    static int S(int n8, List<Long> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n5.T(list) + n9 * S3.w0(n8);
    }

    static int T(List<Long> f42) {
        int n8;
        int n9;
        int n10 = f42.size();
        if (n10 == 0) {
            return 0;
        }
        if (f42 instanceof F4) {
            f42 = f42;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                n9 += S3.r0(f42.m(n8));
            }
            return n9;
        }
        n8 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            n8 += S3.r0((Long)f42.get(n9));
        }
        return n8;
    }

    public static void U(int n8, List<Long> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.q(n8, list, bl);
        }
    }

    public static void V(int n8, List<Integer> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.r(n8, list, bl);
        }
    }

    public static void W(int n8, List<Long> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.n(n8, list, bl);
        }
    }

    public static void X(int n8, List<Integer> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.A(n8, list, bl);
        }
    }

    public static void Y(int n8, List<Long> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.y(n8, list, bl);
        }
    }

    static int a(int n8, Object object, l5 l52) {
        if (object instanceof C4) {
            return S3.z(n8, (C4)object);
        }
        return S3.V(n8, (U4)object, l52);
    }

    static int b(int n8, List<B3> list) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        n9 *= S3.w0(n8);
        n8 = n10;
        n10 = n9;
        while (n8 < list.size()) {
            n10 += S3.E(list.get(n8));
            ++n8;
        }
        return n10;
    }

    static int c(int n8, List<U4> list, l5 l52) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            n10 += S3.B(n8, list.get(i8), l52);
        }
        return n10;
    }

    static int d(int n8, List<?> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n9 * S3.D(n8, true);
    }

    static int e(List<?> list) {
        return list.size();
    }

    public static G5<?, ?> f() {
        return a;
    }

    static <UT, UB> UB g(Object object, int n8, int n9, UB UB, G5<UT, UB> g52) {
        UB UB2 = UB;
        if (UB == null) {
            UB2 = g52.i(object);
        }
        g52.f(UB2, n8, n9);
        return UB2;
    }

    static <UT, UB> UB h(Object object, int n8, List<Integer> object2, o4 o42, UB UB, G5<UT, UB> g52) {
        if (o42 == null) {
            return UB;
        }
        if (object2 instanceof RandomAccess) {
            int n9 = object2.size();
            int n10 = 0;
            for (int i8 = 0; i8 < n9; ++i8) {
                Integer n11 = (Integer)object2.get(i8);
                int n12 = n11;
                if (o42.d(n12)) {
                    if (i8 != n10) {
                        object2.set(n10, n11);
                    }
                    ++n10;
                    continue;
                }
                UB = n5.g(object, n8, n12, UB, g52);
            }
            if (n10 != n9) {
                object2.subList(n10, n9).clear();
            }
            return UB;
        }
        object2 = object2.iterator();
        while (object2.hasNext()) {
            int n13 = (Integer)object2.next();
            if (o42.d(n13)) continue;
            UB = n5.g(object, n8, n13, UB, g52);
            object2.remove();
        }
        return UB;
    }

    public static void i(int n8, List<B3> list, c6 c62) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.O(n8, list);
        }
    }

    public static void j(int n8, List<?> list, c6 c62, l5 l52) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.H(n8, list, l52);
        }
    }

    public static void k(int n8, List<Boolean> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.g(n8, list, bl);
        }
    }

    static <T, FT extends f4<FT>> void l(Y3<FT> y32, T t8, T object) {
        object = y32.b(object);
        if (!((d4)object).a.isEmpty()) {
            y32.f(t8).h((d4<FT>)object);
        }
    }

    static <T> void m(N4 n42, T t8, T t9, long l8) {
        H5.j(t8, l8, n42.g(H5.B(t8, l8), H5.B(t9, l8)));
    }

    static <T, UT, UB> void n(G5<UT, UB> g52, T t8, T t9) {
        g52.j(t8, g52.b(g52.k(t8), g52.k(t9)));
    }

    public static void o(Class<?> clazz) {
        k4.class.isAssignableFrom(clazz);
    }

    static boolean p(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static int q(int n8, List<?> b42) {
        int n9 = b42.size();
        int n10 = 0;
        int n11 = 0;
        if (n9 == 0) {
            return 0;
        }
        int n12 = S3.w0(n8) * n9;
        n8 = n10;
        n10 = n12;
        if (b42 instanceof B4) {
            n10 = n12;
            n8 = n11;
            while (true) {
                if (n8 >= n9) {
                    return n10;
                }
                Object object = b42.d(n8);
                n12 = object instanceof B3 ? S3.E((B3)object) : S3.G((String)object);
                n10 += n12;
                ++n8;
            }
        }
        while (n8 < n9) {
            Object e8 = b42.get(n8);
            n12 = e8 instanceof B3 ? S3.E((B3)e8) : S3.G((String)e8);
            n10 += n12;
            ++n8;
        }
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static int r(int n8, List<?> list, l5 l52) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        int n11 = S3.w0(n8) * n9;
        n8 = n10;
        while (n8 < n9) {
            Object obj = list.get(n8);
            n10 = obj instanceof C4 ? S3.h((C4)obj) : S3.i((U4)obj, l52);
            n11 += n10;
            ++n8;
        }
        return n11;
    }

    static int s(int n8, List<Integer> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n5.t(list) + n9 * S3.w0(n8);
    }

    static int t(List<Integer> n42) {
        int n8;
        int n9;
        int n10 = n42.size();
        if (n10 == 0) {
            return 0;
        }
        if (n42 instanceof n4) {
            n42 = n42;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                n9 += S3.b0(n42.g(n8));
            }
            return n9;
        }
        n8 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            n8 += S3.b0((Integer)n42.get(n9));
        }
        return n8;
    }

    public static void u(int n8, List<String> list, c6 c62) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.D(n8, list);
        }
    }

    public static void v(int n8, List<?> list, c6 c62, l5 l52) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.F(n8, list, l52);
        }
    }

    public static void w(int n8, List<Double> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.o(n8, list, bl);
        }
    }

    static int x(int n8, List<?> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        return n9 * S3.l0(n8, 0);
    }

    static int y(List<?> list) {
        return list.size() << 2;
    }

    public static void z(int n8, List<Integer> list, c6 c62, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            c62.l(n8, list, bl);
        }
    }
}

