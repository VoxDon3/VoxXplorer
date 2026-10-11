/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.E;
import ax.r0.G;
import ax.r0.I;
import ax.r0.M;
import ax.r0.S;
import ax.r0.h;
import ax.r0.h0;
import ax.r0.k;
import ax.r0.o0;
import ax.r0.q;
import ax.r0.q0;
import ax.r0.s0;
import ax.r0.u;
import ax.r0.v0;
import ax.r0.y;
import ax.r0.z;
import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;

final class j0 {
    private static final Class<?> a = j0.B();
    private static final o0<?, ?> b = j0.C(false);
    private static final o0<?, ?> c = j0.C(true);
    private static final o0<?, ?> d = new q0();

    static <UT, UB> UB A(int n8, List<Integer> object, A.e e8, UB UB, o0<UT, UB> o02) {
        if (e8 == null) {
            return UB;
        }
        if (object instanceof RandomAccess) {
            int n9 = object.size();
            int n10 = 0;
            for (int i8 = 0; i8 < n9; ++i8) {
                Integer n11 = (Integer)object.get(i8);
                int n12 = n11;
                if (e8.a(n12)) {
                    if (i8 != n10) {
                        object.set(n10, n11);
                    }
                    ++n10;
                    continue;
                }
                UB = j0.L(n8, n12, UB, o02);
            }
            if (n10 != n9) {
                object.subList(n10, n9).clear();
            }
            return UB;
        }
        object = object.iterator();
        while (object.hasNext()) {
            int n13 = (Integer)object.next();
            if (e8.a(n13)) continue;
            UB = j0.L(n8, n13, UB, o02);
            object.remove();
        }
        return UB;
    }

    private static Class<?> B() {
        try {
            Class<?> clazz = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
            return clazz;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static o0<?, ?> C(boolean bl) {
        Object object;
        block3: {
            try {
                object = j0.D();
                if (object != null) break block3;
                return null;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        object = (o0)((Class)object).getConstructor(Boolean.TYPE).newInstance(bl);
        return object;
    }

    private static Class<?> D() {
        try {
            Class<?> clazz = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            return clazz;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    static <T, FT extends u.b<FT>> void E(q<FT> q8, T t8, T object) {
        if (!((u)(object = q8.c(object))).n()) {
            q8.d(t8).u((u<FT>)object);
        }
    }

    static <T> void F(M m8, T t8, T t9, long l8) {
        s0.O(t8, l8, m8.a(s0.A(t8, l8), s0.A(t9, l8)));
    }

    static <T, UT, UB> void G(o0<UT, UB> o02, T t8, T t9) {
        o02.p(t8, o02.k(o02.g(t8), o02.g(t9)));
    }

    public static o0<?, ?> H() {
        return b;
    }

    public static o0<?, ?> I() {
        return c;
    }

    public static void J(Class<?> clazz) {
        Class<?> clazz2;
        if (!y.class.isAssignableFrom(clazz) && (clazz2 = a) != null && !clazz2.isAssignableFrom(clazz)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean K(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    static <UT, UB> UB L(int n8, int n9, UB UB, o0<UT, UB> o02) {
        UB UB2 = UB;
        if (UB == null) {
            UB2 = o02.n();
        }
        o02.e(UB2, n8, n9);
        return UB2;
    }

    public static o0<?, ?> M() {
        return d;
    }

    public static void N(int n8, List<Boolean> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.A(n8, list, bl);
        }
    }

    public static void O(int n8, List<h> list, v0 v02) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.O(n8, list);
        }
    }

    public static void P(int n8, List<Double> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.M(n8, list, bl);
        }
    }

    public static void Q(int n8, List<Integer> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.L(n8, list, bl);
        }
    }

    public static void R(int n8, List<Integer> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.z(n8, list, bl);
        }
    }

    public static void S(int n8, List<Long> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.v(n8, list, bl);
        }
    }

    public static void T(int n8, List<Float> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.a(n8, list, bl);
        }
    }

    public static void U(int n8, List<?> list, v0 v02, h0 h02) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.h(n8, list, h02);
        }
    }

    public static void V(int n8, List<Integer> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.n(n8, list, bl);
        }
    }

    public static void W(int n8, List<Long> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.K(n8, list, bl);
        }
    }

    public static void X(int n8, List<?> list, v0 v02, h0 h02) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.G(n8, list, h02);
        }
    }

    public static void Y(int n8, List<Integer> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.w(n8, list, bl);
        }
    }

    public static void Z(int n8, List<Long> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.f(n8, list, bl);
        }
    }

    static int a(int n8, List<?> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        if (bl) {
            return k.V(n8) + k.C(n9);
        }
        return n9 * k.d(n8, true);
    }

    public static void a0(int n8, List<Integer> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.H(n8, list, bl);
        }
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int n8, List<Long> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.C(n8, list, bl);
        }
    }

    static int c(int n8, List<h> list) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        n9 *= k.V(n8);
        n8 = n10;
        n10 = n9;
        while (n8 < list.size()) {
            n10 += k.h(list.get(n8));
            ++n8;
        }
        return n10;
    }

    public static void c0(int n8, List<String> list, v0 v02) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.k(n8, list);
        }
    }

    static int d(int n8, List<Integer> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = j0.e(list);
        if (bl) {
            return k.V(n8) + k.C(n10);
        }
        return n10 + n9 * k.V(n8);
    }

    public static void d0(int n8, List<Integer> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.B(n8, list, bl);
        }
    }

    static int e(List<Integer> z8) {
        int n8;
        int n9 = z8.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        if (z8 instanceof z) {
            z8 = z8;
            int n11 = 0;
            for (n8 = n10; n8 < n9; ++n8) {
                n11 += k.l(z8.p(n8));
            }
            return n11;
        }
        int n12 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n12 += k.l((Integer)z8.get(n8));
        }
        return n12;
    }

    public static void e0(int n8, List<Long> list, v0 v02, boolean bl) throws IOException {
        if (list != null && !list.isEmpty()) {
            v02.g(n8, list, bl);
        }
    }

    static int f(int n8, List<?> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        if (bl) {
            return k.V(n8) + k.C(n9 * 4);
        }
        return n9 * k.m(n8, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int n8, List<?> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        if (bl) {
            return k.V(n8) + k.C(n9 * 8);
        }
        return n9 * k.o(n8, 0L);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int n8, List<S> list, h0 h02) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            n10 += k.s(n8, list.get(i8), h02);
        }
        return n10;
    }

    static int k(int n8, List<Integer> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = j0.l(list);
        if (bl) {
            return k.V(n8) + k.C(n10);
        }
        return n10 + n9 * k.V(n8);
    }

    static int l(List<Integer> z8) {
        int n8;
        int n9;
        int n10 = z8.size();
        if (n10 == 0) {
            return 0;
        }
        if (z8 instanceof z) {
            z8 = z8;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                n9 += k.w(z8.p(n8));
            }
            return n9;
        }
        n8 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            n8 += k.w((Integer)z8.get(n9));
        }
        return n8;
    }

    static int m(int n8, List<Long> list, boolean bl) {
        if (list.size() == 0) {
            return 0;
        }
        int n9 = j0.n(list);
        if (bl) {
            return k.V(n8) + k.C(n9);
        }
        return n9 + list.size() * k.V(n8);
    }

    static int n(List<Long> i8) {
        int n8;
        int n9 = i8.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        if (i8 instanceof I) {
            i8 = i8;
            int n11 = 0;
            for (n8 = n10; n8 < n9; ++n8) {
                n11 += k.y(i8.p(n8));
            }
            return n11;
        }
        int n12 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n12 += k.y((Long)i8.get(n8));
        }
        return n12;
    }

    static int o(int n8, Object object, h0 h02) {
        if (object instanceof E) {
            return k.A(n8, (E)object);
        }
        return k.F(n8, (S)object, h02);
    }

    /*
     * Enabled aggressive block sorting
     */
    static int p(int n8, List<?> list, h0 h02) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        n8 = k.V(n8) * n9;
        while (n10 < n9) {
            Object obj = list.get(n10);
            int n11 = obj instanceof E ? k.B((E)obj) : k.H((S)obj, h02);
            n8 += n11;
            ++n10;
        }
        return n8;
    }

    static int q(int n8, List<Integer> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = j0.r(list);
        if (bl) {
            return k.V(n8) + k.C(n10);
        }
        return n10 + n9 * k.V(n8);
    }

    static int r(List<Integer> z8) {
        int n8;
        int n9;
        int n10 = z8.size();
        if (n10 == 0) {
            return 0;
        }
        if (z8 instanceof z) {
            z8 = z8;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                n9 += k.Q(z8.p(n8));
            }
            return n9;
        }
        n8 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            n8 += k.Q((Integer)z8.get(n9));
        }
        return n8;
    }

    static int s(int n8, List<Long> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = j0.t(list);
        if (bl) {
            return k.V(n8) + k.C(n10);
        }
        return n10 + n9 * k.V(n8);
    }

    static int t(List<Long> i8) {
        int n8;
        int n9 = i8.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        if (i8 instanceof I) {
            i8 = i8;
            int n11 = 0;
            for (n8 = n10; n8 < n9; ++n8) {
                n11 += k.S(i8.p(n8));
            }
            return n11;
        }
        int n12 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n12 += k.S((Long)i8.get(n8));
        }
        return n12;
    }

    /*
     * Enabled aggressive block sorting
     */
    static int u(int n8, List<?> g8) {
        int n9 = g8.size();
        int n10 = 0;
        int n11 = 0;
        if (n9 == 0) {
            return 0;
        }
        int n12 = k.V(n8) * n9;
        n8 = n10;
        n10 = n12;
        if (g8 instanceof G) {
            n10 = n12;
            n8 = n11;
            while (true) {
                if (n8 >= n9) {
                    return n10;
                }
                Object object = g8.D0(n8);
                n12 = object instanceof h ? k.h((h)object) : k.U((String)object);
                n10 += n12;
                ++n8;
            }
        }
        while (n8 < n9) {
            Object e8 = g8.get(n8);
            n12 = e8 instanceof h ? k.h((h)e8) : k.U((String)e8);
            n10 += n12;
            ++n8;
        }
        return n10;
    }

    static int v(int n8, List<Integer> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = j0.w(list);
        if (bl) {
            return k.V(n8) + k.C(n10);
        }
        return n10 + n9 * k.V(n8);
    }

    static int w(List<Integer> z8) {
        int n8;
        int n9;
        int n10 = z8.size();
        if (n10 == 0) {
            return 0;
        }
        if (z8 instanceof z) {
            z8 = z8;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                n9 += k.X(z8.p(n8));
            }
            return n9;
        }
        n8 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            n8 += k.X((Integer)z8.get(n9));
        }
        return n8;
    }

    static int x(int n8, List<Long> list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = j0.y(list);
        if (bl) {
            return k.V(n8) + k.C(n10);
        }
        return n10 + n9 * k.V(n8);
    }

    static int y(List<Long> i8) {
        int n8;
        int n9;
        int n10 = i8.size();
        if (n10 == 0) {
            return 0;
        }
        if (i8 instanceof I) {
            i8 = i8;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                n9 += k.Z(i8.p(n8));
            }
            return n9;
        }
        n8 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            n8 += k.Z((Long)i8.get(n9));
        }
        return n8;
    }

    static <UT, UB> UB z(int n8, List<Integer> object, A.d<?> d8, UB UB, o0<UT, UB> o02) {
        if (d8 == null) {
            return UB;
        }
        if (object instanceof RandomAccess) {
            int n9 = object.size();
            int n10 = 0;
            for (int i8 = 0; i8 < n9; ++i8) {
                Integer n11 = (Integer)object.get(i8);
                int n12 = n11;
                if (d8.a(n12) != null) {
                    if (i8 != n10) {
                        object.set(n10, n11);
                    }
                    ++n10;
                    continue;
                }
                UB = j0.L(n8, n12, UB, o02);
            }
            if (n10 != n9) {
                object.subList(n10, n9).clear();
            }
            return UB;
        }
        object = object.iterator();
        while (object.hasNext()) {
            int n13 = (Integer)object.next();
            if (d8.a(n13) != null) continue;
            UB = j0.L(n8, n13, UB, o02);
            object.remove();
        }
        return UB;
    }
}

