package ax.r0;

import ax.r0.C2904A;
import ax.r0.C2933u;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class j0 {
    private static final Class<?> a = B();
    private static final o0<?, ?> b = C(false);
    private static final o0<?, ?> c = C(true);
    private static final o0<?, ?> d = new q0();

    static <UT, UB> UB A(int i, List<Integer> list, C2904A.e eVar, UB ub, o0<UT, UB> o0Var) {
        if (eVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!eVar.a(intValue)) {
                    ub = (UB) L(i, intValue, ub, o0Var);
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
            if (eVar.a(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) L(i, intValue2, ub, o0Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static o0<?, ?> C(boolean z) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (o0) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends C2933u.b<FT>> void E(AbstractC2930q<FT> abstractC2930q, T t, T t2) {
        C2933u<FT> c2 = abstractC2930q.c(t2);
        if (c2.n()) {
            return;
        }
        abstractC2930q.d(t).u(c2);
    }

    static <T> void F(M m, T t, T t2, long j) {
        s0.O(t, j, m.a(s0.A(t, j), s0.A(t2, j)));
    }

    static <T, UT, UB> void G(o0<UT, UB> o0Var, T t, T t2) {
        o0Var.p(t, o0Var.k(o0Var.g(t), o0Var.g(t2)));
    }

    public static o0<?, ?> H() {
        return b;
    }

    public static o0<?, ?> I() {
        return c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC2937y.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <UT, UB> UB L(int i, int i2, UB ub, o0<UT, UB> o0Var) {
        if (ub == null) {
            ub = o0Var.n();
        }
        o0Var.e(ub, i, i2);
        return ub;
    }

    public static o0<?, ?> M() {
        return d;
    }

    public static void N(int i, List<Boolean> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.A(i, list, z);
    }

    public static void O(int i, List<AbstractC2921h> list, v0 v0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.O(i, list);
    }

    public static void P(int i, List<Double> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.M(i, list, z);
    }

    public static void Q(int i, List<Integer> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.L(i, list, z);
    }

    public static void R(int i, List<Integer> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.z(i, list, z);
    }

    public static void S(int i, List<Long> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.v(i, list, z);
    }

    public static void T(int i, List<Float> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.a(i, list, z);
    }

    public static void U(int i, List<?> list, v0 v0Var, h0 h0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.h(i, list, h0Var);
    }

    public static void V(int i, List<Integer> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.n(i, list, z);
    }

    public static void W(int i, List<Long> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.K(i, list, z);
    }

    public static void X(int i, List<?> list, v0 v0Var, h0 h0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.G(i, list, h0Var);
    }

    public static void Y(int i, List<Integer> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.w(i, list, z);
    }

    public static void Z(int i, List<Long> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.f(i, list, z);
    }

    static int a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? AbstractC2924k.V(i) + AbstractC2924k.C(size) : size * AbstractC2924k.d(i, true);
    }

    public static void a0(int i, List<Integer> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.H(i, list, z);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i, List<Long> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.C(i, list, z);
    }

    static int c(int i, List<AbstractC2921h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * AbstractC2924k.V(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            V += AbstractC2924k.h(list.get(i2));
        }
        return V;
    }

    public static void c0(int i, List<String> list, v0 v0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.k(i, list);
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = e(list);
        return z ? AbstractC2924k.V(i) + AbstractC2924k.C(e) : e + (size * AbstractC2924k.V(i));
    }

    public static void d0(int i, List<Integer> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.B(i, list, z);
    }

    static int e(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2938z)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC2924k.l(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        C2938z c2938z = (C2938z) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC2924k.l(c2938z.p(i));
            i++;
        }
        return i3;
    }

    public static void e0(int i, List<Long> list, v0 v0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0Var.g(i, list, z);
    }

    static int f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? AbstractC2924k.V(i) + AbstractC2924k.C(size * 4) : size * AbstractC2924k.m(i, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? AbstractC2924k.V(i) + AbstractC2924k.C(size * 8) : size * AbstractC2924k.o(i, 0L);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i, List<S> list, h0 h0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC2924k.s(i, list.get(i3), h0Var);
        }
        return i2;
    }

    static int k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = l(list);
        return z ? AbstractC2924k.V(i) + AbstractC2924k.C(l) : l + (size * AbstractC2924k.V(i));
    }

    static int l(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2938z)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC2924k.w(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        C2938z c2938z = (C2938z) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC2924k.w(c2938z.p(i));
            i++;
        }
        return i3;
    }

    static int m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = n(list);
        return z ? AbstractC2924k.V(i) + AbstractC2924k.C(n) : n + (list.size() * AbstractC2924k.V(i));
    }

    static int n(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2912I)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC2924k.y(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        C2912I c2912i = (C2912I) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC2924k.y(c2912i.p(i));
            i++;
        }
        return i3;
    }

    static int o(int i, Object obj, h0 h0Var) {
        return obj instanceof C2908E ? AbstractC2924k.A(i, (C2908E) obj) : AbstractC2924k.F(i, (S) obj, h0Var);
    }

    static int p(int i, List<?> list, h0 h0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = AbstractC2924k.V(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            V += obj instanceof C2908E ? AbstractC2924k.B((C2908E) obj) : AbstractC2924k.H((S) obj, h0Var);
        }
        return V;
    }

    static int q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = r(list);
        return z ? AbstractC2924k.V(i) + AbstractC2924k.C(r) : r + (size * AbstractC2924k.V(i));
    }

    static int r(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2938z)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC2924k.Q(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        C2938z c2938z = (C2938z) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC2924k.Q(c2938z.p(i));
            i++;
        }
        return i3;
    }

    static int s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = t(list);
        return z ? AbstractC2924k.V(i) + AbstractC2924k.C(t) : t + (size * AbstractC2924k.V(i));
    }

    static int t(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2912I)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC2924k.S(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        C2912I c2912i = (C2912I) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC2924k.S(c2912i.p(i));
            i++;
        }
        return i3;
    }

    static int u(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int V = AbstractC2924k.V(i) * size;
        if (!(list instanceof InterfaceC2910G)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                V += obj instanceof AbstractC2921h ? AbstractC2924k.h((AbstractC2921h) obj) : AbstractC2924k.U((String) obj);
                i2++;
            }
            return V;
        }
        InterfaceC2910G interfaceC2910G = (InterfaceC2910G) list;
        while (i2 < size) {
            Object D0 = interfaceC2910G.D0(i2);
            V += D0 instanceof AbstractC2921h ? AbstractC2924k.h((AbstractC2921h) D0) : AbstractC2924k.U((String) D0);
            i2++;
        }
        return V;
    }

    static int v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = w(list);
        return z ? AbstractC2924k.V(i) + AbstractC2924k.C(w) : w + (size * AbstractC2924k.V(i));
    }

    static int w(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2938z)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC2924k.X(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        C2938z c2938z = (C2938z) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC2924k.X(c2938z.p(i));
            i++;
        }
        return i3;
    }

    static int x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = y(list);
        return z ? AbstractC2924k.V(i) + AbstractC2924k.C(y) : y + (size * AbstractC2924k.V(i));
    }

    static int y(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2912I)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC2924k.Z(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        C2912I c2912i = (C2912I) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC2924k.Z(c2912i.p(i));
            i++;
        }
        return i3;
    }

    static <UT, UB> UB z(int i, List<Integer> list, C2904A.d<?> dVar, UB ub, o0<UT, UB> o0Var) {
        if (dVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (dVar.a(intValue) == null) {
                    ub = (UB) L(i, intValue, ub, o0Var);
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
            if (dVar.a(intValue2) != null) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) L(i, intValue2, ub, o0Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }
}
