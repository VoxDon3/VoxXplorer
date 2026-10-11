package ax.b6;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ax.b6.n5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1625n5 {
    private static final G5<?, ?> a = new I5();

    static int A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * S3.T(i, 0L);
    }

    static int B(List<?> list) {
        return list.size() << 3;
    }

    public static void C(int i, List<Integer> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.z(i, list, z);
    }

    static int D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * S3.w0(i));
    }

    static int E(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1624n4)) {
            int i2 = 0;
            while (i < size) {
                i2 += S3.k0(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        C1624n4 c1624n4 = (C1624n4) list;
        int i3 = 0;
        while (i < size) {
            i3 += S3.k0(c1624n4.g(i));
            i++;
        }
        return i3;
    }

    public static void F(int i, List<Long> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.w(i, list, z);
    }

    static int G(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * S3.w0(i));
    }

    static int H(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F4)) {
            int i2 = 0;
            while (i < size) {
                i2 += S3.e0(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        F4 f4 = (F4) list;
        int i3 = 0;
        while (i < size) {
            i3 += S3.e0(f4.m(i));
            i++;
        }
        return i3;
    }

    public static void I(int i, List<Float> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.J(i, list, z);
    }

    static int J(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return K(list) + (size * S3.w0(i));
    }

    static int K(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1624n4)) {
            int i2 = 0;
            while (i < size) {
                i2 += S3.s0(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        C1624n4 c1624n4 = (C1624n4) list;
        int i3 = 0;
        while (i < size) {
            i3 += S3.s0(c1624n4.g(i));
            i++;
        }
        return i3;
    }

    public static void L(int i, List<Integer> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.C(i, list, z);
    }

    static int M(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * S3.w0(i));
    }

    static int N(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F4)) {
            int i2 = 0;
            while (i < size) {
                i2 += S3.n0(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        F4 f4 = (F4) list;
        int i3 = 0;
        while (i < size) {
            i3 += S3.n0(f4.m(i));
            i++;
        }
        return i3;
    }

    public static void O(int i, List<Long> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.h(i, list, z);
    }

    static int P(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * S3.w0(i));
    }

    static int Q(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1624n4)) {
            int i2 = 0;
            while (i < size) {
                i2 += S3.z0(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        C1624n4 c1624n4 = (C1624n4) list;
        int i3 = 0;
        while (i < size) {
            i3 += S3.z0(c1624n4.g(i));
            i++;
        }
        return i3;
    }

    public static void R(int i, List<Integer> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.c(i, list, z);
    }

    static int S(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * S3.w0(i));
    }

    static int T(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F4)) {
            int i2 = 0;
            while (i < size) {
                i2 += S3.r0(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        F4 f4 = (F4) list;
        int i3 = 0;
        while (i < size) {
            i3 += S3.r0(f4.m(i));
            i++;
        }
        return i3;
    }

    public static void U(int i, List<Long> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.q(i, list, z);
    }

    public static void V(int i, List<Integer> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.r(i, list, z);
    }

    public static void W(int i, List<Long> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.n(i, list, z);
    }

    public static void X(int i, List<Integer> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.A(i, list, z);
    }

    public static void Y(int i, List<Long> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.y(i, list, z);
    }

    static int a(int i, Object obj, InterfaceC1609l5 interfaceC1609l5) {
        return obj instanceof C4 ? S3.z(i, (C4) obj) : S3.V(i, (U4) obj, interfaceC1609l5);
    }

    static int b(int i, List<B3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w0 = size * S3.w0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            w0 += S3.E(list.get(i2));
        }
        return w0;
    }

    static int c(int i, List<U4> list, InterfaceC1609l5 interfaceC1609l5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += S3.B(i, list.get(i3), interfaceC1609l5);
        }
        return i2;
    }

    static int d(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * S3.D(i, true);
    }

    static int e(List<?> list) {
        return list.size();
    }

    public static G5<?, ?> f() {
        return a;
    }

    static <UT, UB> UB g(Object obj, int i, int i2, UB ub, G5<UT, UB> g5) {
        if (ub == null) {
            ub = g5.i(obj);
        }
        g5.f(ub, i, i2);
        return ub;
    }

    static <UT, UB> UB h(Object obj, int i, List<Integer> list, InterfaceC1632o4 interfaceC1632o4, UB ub, G5<UT, UB> g5) {
        if (interfaceC1632o4 == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!interfaceC1632o4.d(intValue)) {
                    ub = (UB) g(obj, i, intValue, ub, g5);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int intValue2 = num.intValue();
            if (interfaceC1632o4.d(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) g(obj, i, intValue2, ub, g5);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static void i(int i, List<B3> list, InterfaceC1529c6 interfaceC1529c6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.O(i, list);
    }

    public static void j(int i, List<?> list, InterfaceC1529c6 interfaceC1529c6, InterfaceC1609l5 interfaceC1609l5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.H(i, list, interfaceC1609l5);
    }

    public static void k(int i, List<Boolean> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.g(i, list, z);
    }

    static <T, FT extends InterfaceC1554f4<FT>> void l(Y3<FT> y3, T t, T t2) {
        C1536d4<FT> b = y3.b(t2);
        if (b.a.isEmpty()) {
            return;
        }
        y3.f(t).h(b);
    }

    static <T> void m(N4 n4, T t, T t2, long j) {
        H5.j(t, j, n4.g(H5.B(t, j), H5.B(t2, j)));
    }

    static <T, UT, UB> void n(G5<UT, UB> g5, T t, T t2) {
        g5.j(t, g5.b(g5.k(t), g5.k(t2)));
    }

    public static void o(Class<?> cls) {
        AbstractC1599k4.class.isAssignableFrom(cls);
    }

    static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int q(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int w0 = S3.w0(i) * size;
        if (!(list instanceof B4)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                w0 += obj instanceof B3 ? S3.E((B3) obj) : S3.G((String) obj);
                i2++;
            }
            return w0;
        }
        B4 b4 = (B4) list;
        while (i2 < size) {
            Object d = b4.d(i2);
            w0 += d instanceof B3 ? S3.E((B3) d) : S3.G((String) d);
            i2++;
        }
        return w0;
    }

    static int r(int i, List<?> list, InterfaceC1609l5 interfaceC1609l5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w0 = S3.w0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            w0 += obj instanceof C4 ? S3.h((C4) obj) : S3.i((U4) obj, interfaceC1609l5);
        }
        return w0;
    }

    static int s(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * S3.w0(i));
    }

    static int t(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1624n4)) {
            int i2 = 0;
            while (i < size) {
                i2 += S3.b0(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        C1624n4 c1624n4 = (C1624n4) list;
        int i3 = 0;
        while (i < size) {
            i3 += S3.b0(c1624n4.g(i));
            i++;
        }
        return i3;
    }

    public static void u(int i, List<String> list, InterfaceC1529c6 interfaceC1529c6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.D(i, list);
    }

    public static void v(int i, List<?> list, InterfaceC1529c6 interfaceC1529c6, InterfaceC1609l5 interfaceC1609l5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.F(i, list, interfaceC1609l5);
    }

    public static void w(int i, List<Double> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.o(i, list, z);
    }

    static int x(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * S3.l0(i, 0);
    }

    static int y(List<?> list) {
        return list.size() << 2;
    }

    public static void z(int i, List<Integer> list, InterfaceC1529c6 interfaceC1529c6, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1529c6.l(i, list, z);
    }
}
