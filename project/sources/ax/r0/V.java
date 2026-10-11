package ax.r0;

import ax.r0.AbstractC2921h;
import ax.r0.C2904A;
import ax.r0.K;
import ax.r0.u0;
import ax.r0.v0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class V<T> implements h0<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = s0.B();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final S e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final X m;
    private final AbstractC2911H n;
    private final o0<?, ?> o;
    private final AbstractC2930q<?> p;
    private final M q;

    private V(int[] iArr, Object[] objArr, int i, int i2, S s2, boolean z, boolean z2, int[] iArr2, int i3, int i4, X x, AbstractC2911H abstractC2911H, o0<?, ?> o0Var, AbstractC2930q<?> abstractC2930q, M m) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = s2 instanceof AbstractC2937y;
        this.h = z;
        this.f = abstractC2930q != null && abstractC2930q.e(s2);
        this.i = z2;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = x;
        this.n = abstractC2911H;
        this.o = o0Var;
        this.p = abstractC2930q;
        this.e = s2;
        this.q = m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Object obj, int i, h0 h0Var) {
        return h0Var.c(s0.A(obj, R(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean B(Object obj, int i, int i2) {
        List list = (List) s0.A(obj, R(i));
        if (list.isEmpty()) {
            return true;
        }
        h0 s2 = s(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!s2.c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [ax.r0.h0] */
    private boolean C(T t, int i, int i2) {
        Map<?, ?> h = this.q.h(s0.A(t, R(i)));
        if (h.isEmpty()) {
            return true;
        }
        if (this.q.c(r(i2)).c.d() != u0.c.MESSAGE) {
            return true;
        }
        ?? r5 = 0;
        for (Object obj : h.values()) {
            r5 = r5;
            if (r5 == 0) {
                r5 = d0.a().d(obj.getClass());
            }
            if (!r5.c(obj)) {
                return false;
            }
        }
        return true;
    }

    private boolean D(T t, T t2, int i) {
        long Y = Y(i) & 1048575;
        return s0.x(t, Y) == s0.x(t2, Y);
    }

    private boolean E(T t, int i, int i2) {
        return s0.x(t, (long) (Y(i2) & 1048575)) == i;
    }

    private static boolean F(int i) {
        return (i & 268435456) != 0;
    }

    private static List<?> G(Object obj, long j) {
        return (List) s0.A(obj, j);
    }

    private static <T> long H(T t, long j) {
        return s0.y(t, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x0083, code lost:
    
        r0 = r14.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0087, code lost:
    
        if (r0 >= r14.l) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0089, code lost:
    
        r7 = n(r9, r14.j[r0], r7, r15);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0094, code lost:
    
        if (r7 == null) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x060f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x05f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0638 A[LOOP:3: B:62:0x0634->B:64:0x0638, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0645  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends ax.r0.C2933u.b<ET>> void I(ax.r0.o0<UT, UB> r15, ax.r0.AbstractC2930q<ET> r16, T r17, ax.r0.g0 r18, ax.r0.C2929p r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.r0.V.I(ax.r0.o0, ax.r0.q, java.lang.Object, ax.r0.g0, ax.r0.p):void");
    }

    private final <K, V> void J(Object obj, int i, Object obj2, C2929p c2929p, g0 g0Var) throws IOException {
        long R = R(i0(i));
        Object A = s0.A(obj, R);
        if (A == null) {
            A = this.q.e(obj2);
            s0.O(obj, R, A);
        } else if (this.q.g(A)) {
            Object e = this.q.e(obj2);
            this.q.a(e, A);
            s0.O(obj, R, e);
            A = e;
        }
        g0Var.a(this.q.d(A), this.q.c(obj2), c2929p);
    }

    private void K(T t, T t2, int i) {
        long R = R(i0(i));
        if (y(t2, i)) {
            Object A = s0.A(t, R);
            Object A2 = s0.A(t2, R);
            if (A != null && A2 != null) {
                s0.O(t, R, C2904A.h(A, A2));
                e0(t, i);
            } else if (A2 != null) {
                s0.O(t, R, A2);
                e0(t, i);
            }
        }
    }

    private void L(T t, T t2, int i) {
        int i0 = i0(i);
        int Q = Q(i);
        long R = R(i0);
        if (E(t2, Q, i)) {
            Object A = s0.A(t, R);
            Object A2 = s0.A(t2, R);
            if (A != null && A2 != null) {
                s0.O(t, R, C2904A.h(A, A2));
                f0(t, Q, i);
            } else if (A2 != null) {
                s0.O(t, R, A2);
                f0(t, Q, i);
            }
        }
    }

    private void M(T t, T t2, int i) {
        int i0 = i0(i);
        long R = R(i0);
        int Q = Q(i);
        switch (h0(i0)) {
            case 0:
                if (y(t2, i)) {
                    s0.K(t, R, s0.v(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 1:
                if (y(t2, i)) {
                    s0.L(t, R, s0.w(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 2:
                if (y(t2, i)) {
                    s0.N(t, R, s0.y(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 3:
                if (y(t2, i)) {
                    s0.N(t, R, s0.y(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 4:
                if (y(t2, i)) {
                    s0.M(t, R, s0.x(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 5:
                if (y(t2, i)) {
                    s0.N(t, R, s0.y(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 6:
                if (y(t2, i)) {
                    s0.M(t, R, s0.x(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 7:
                if (y(t2, i)) {
                    s0.E(t, R, s0.p(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 8:
                if (y(t2, i)) {
                    s0.O(t, R, s0.A(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 9:
                K(t, t2, i);
                break;
            case 10:
                if (y(t2, i)) {
                    s0.O(t, R, s0.A(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 11:
                if (y(t2, i)) {
                    s0.M(t, R, s0.x(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 12:
                if (y(t2, i)) {
                    s0.M(t, R, s0.x(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 13:
                if (y(t2, i)) {
                    s0.M(t, R, s0.x(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 14:
                if (y(t2, i)) {
                    s0.N(t, R, s0.y(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 15:
                if (y(t2, i)) {
                    s0.M(t, R, s0.x(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 16:
                if (y(t2, i)) {
                    s0.N(t, R, s0.y(t2, R));
                    e0(t, i);
                    break;
                }
                break;
            case 17:
                K(t, t2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.n.d(t, t2, R);
                break;
            case 50:
                j0.F(this.q, t, t2, R);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (E(t2, Q, i)) {
                    s0.O(t, R, s0.A(t2, R));
                    f0(t, Q, i);
                    break;
                }
                break;
            case 60:
                L(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t2, Q, i)) {
                    s0.O(t, R, s0.A(t2, R));
                    f0(t, Q, i);
                    break;
                }
                break;
            case 68:
                L(t, t2, i);
                break;
        }
    }

    static <T> V<T> N(Class<T> cls, P p, X x, AbstractC2911H abstractC2911H, o0<?, ?> o0Var, AbstractC2930q<?> abstractC2930q, M m) {
        return p instanceof f0 ? P((f0) p, x, abstractC2911H, o0Var, abstractC2930q, m) : O((l0) p, x, abstractC2911H, o0Var, abstractC2930q, m);
    }

    static <T> V<T> O(l0 l0Var, X x, AbstractC2911H abstractC2911H, o0<?, ?> o0Var, AbstractC2930q<?> abstractC2930q, M m) {
        boolean z = l0Var.c() == c0.PROTO3;
        C2932t[] e = l0Var.e();
        if (e.length != 0) {
            C2932t c2932t = e[0];
            throw null;
        }
        int length = e.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (e.length > 0) {
            C2932t c2932t2 = e[0];
            throw null;
        }
        int[] d = l0Var.d();
        if (d == null) {
            d = r;
        }
        if (e.length > 0) {
            C2932t c2932t3 = e[0];
            throw null;
        }
        int[] iArr2 = r;
        int[] iArr3 = r;
        int[] iArr4 = new int[d.length + iArr2.length + iArr3.length];
        System.arraycopy(d, 0, iArr4, 0, d.length);
        System.arraycopy(iArr2, 0, iArr4, d.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, d.length + iArr2.length, iArr3.length);
        return new V<>(iArr, objArr, 0, 0, l0Var.b(), z, true, iArr4, d.length, d.length + iArr2.length, x, abstractC2911H, o0Var, abstractC2930q, m);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> ax.r0.V<T> P(ax.r0.f0 r35, ax.r0.X r36, ax.r0.AbstractC2911H r37, ax.r0.o0<?, ?> r38, ax.r0.AbstractC2930q<?> r39, ax.r0.M r40) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.r0.V.P(ax.r0.f0, ax.r0.X, ax.r0.H, ax.r0.o0, ax.r0.q, ax.r0.M):ax.r0.V");
    }

    private int Q(int i) {
        return this.a[i];
    }

    private static long R(int i) {
        return i & 1048575;
    }

    private static <T> boolean S(T t, long j) {
        return ((Boolean) s0.A(t, j)).booleanValue();
    }

    private static <T> double T(T t, long j) {
        return ((Double) s0.A(t, j)).doubleValue();
    }

    private static <T> float U(T t, long j) {
        return ((Float) s0.A(t, j)).floatValue();
    }

    private static <T> int V(T t, long j) {
        return ((Integer) s0.A(t, j)).intValue();
    }

    private static <T> long W(T t, long j) {
        return ((Long) s0.A(t, j)).longValue();
    }

    private int X(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return g0(i, 0);
    }

    private int Y(int i) {
        return this.a[i + 2];
    }

    private <E> void Z(Object obj, long j, g0 g0Var, h0<E> h0Var, C2929p c2929p) throws IOException {
        g0Var.j(this.n.e(obj, j), h0Var, c2929p);
    }

    private <E> void a0(Object obj, int i, g0 g0Var, h0<E> h0Var, C2929p c2929p) throws IOException {
        g0Var.r(this.n.e(obj, R(i)), h0Var, c2929p);
    }

    private void b0(Object obj, int i, g0 g0Var) throws IOException {
        if (x(i)) {
            s0.O(obj, R(i), g0Var.O());
        } else if (this.g) {
            s0.O(obj, R(i), g0Var.C());
        } else {
            s0.O(obj, R(i), g0Var.G());
        }
    }

    private void c0(Object obj, int i, g0 g0Var) throws IOException {
        if (x(i)) {
            g0Var.F(this.n.e(obj, R(i)));
        } else {
            g0Var.E(this.n.e(obj, R(i)));
        }
    }

    private static Field d0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void e0(T t, int i) {
        if (this.h) {
            return;
        }
        int Y = Y(i);
        long j = Y & 1048575;
        s0.M(t, j, s0.x(t, j) | (1 << (Y >>> 20)));
    }

    private void f0(T t, int i, int i2) {
        s0.M(t, Y(i2) & 1048575, i);
    }

    private int g0(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int Q = Q(i4);
            if (i == Q) {
                return i4;
            }
            if (i < Q) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int h0(int i) {
        return (i & 267386880) >>> 20;
    }

    private int i0(int i) {
        return this.a[i + 1];
    }

    private boolean j(T t, T t2, int i) {
        return y(t, i) == y(t2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j0(T r19, ax.r0.v0 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.r0.V.j0(java.lang.Object, ax.r0.v0):void");
    }

    private static <T> boolean k(T t, long j) {
        return s0.p(t, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(T r13, ax.r0.v0 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.r0.V.k0(java.lang.Object, ax.r0.v0):void");
    }

    private static <T> double l(T t, long j) {
        return s0.v(t, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l0(T r11, ax.r0.v0 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.r0.V.l0(java.lang.Object, ax.r0.v0):void");
    }

    private boolean m(T t, T t2, int i) {
        int i0 = i0(i);
        long R = R(i0);
        switch (h0(i0)) {
            case 0:
                if (!j(t, t2, i) || Double.doubleToLongBits(s0.v(t, R)) != Double.doubleToLongBits(s0.v(t2, R))) {
                }
                break;
            case 1:
                if (!j(t, t2, i) || Float.floatToIntBits(s0.w(t, R)) != Float.floatToIntBits(s0.w(t2, R))) {
                }
                break;
            case 2:
                if (!j(t, t2, i) || s0.y(t, R) != s0.y(t2, R)) {
                }
                break;
            case 3:
                if (!j(t, t2, i) || s0.y(t, R) != s0.y(t2, R)) {
                }
                break;
            case 4:
                if (!j(t, t2, i) || s0.x(t, R) != s0.x(t2, R)) {
                }
                break;
            case 5:
                if (!j(t, t2, i) || s0.y(t, R) != s0.y(t2, R)) {
                }
                break;
            case 6:
                if (!j(t, t2, i) || s0.x(t, R) != s0.x(t2, R)) {
                }
                break;
            case 7:
                if (!j(t, t2, i) || s0.p(t, R) != s0.p(t2, R)) {
                }
                break;
            case 8:
                if (!j(t, t2, i) || !j0.K(s0.A(t, R), s0.A(t2, R))) {
                }
                break;
            case 9:
                if (!j(t, t2, i) || !j0.K(s0.A(t, R), s0.A(t2, R))) {
                }
                break;
            case 10:
                if (!j(t, t2, i) || !j0.K(s0.A(t, R), s0.A(t2, R))) {
                }
                break;
            case 11:
                if (!j(t, t2, i) || s0.x(t, R) != s0.x(t2, R)) {
                }
                break;
            case 12:
                if (!j(t, t2, i) || s0.x(t, R) != s0.x(t2, R)) {
                }
                break;
            case 13:
                if (!j(t, t2, i) || s0.x(t, R) != s0.x(t2, R)) {
                }
                break;
            case 14:
                if (!j(t, t2, i) || s0.y(t, R) != s0.y(t2, R)) {
                }
                break;
            case 15:
                if (!j(t, t2, i) || s0.x(t, R) != s0.x(t2, R)) {
                }
                break;
            case 16:
                if (!j(t, t2, i) || s0.y(t, R) != s0.y(t2, R)) {
                }
                break;
            case 17:
                if (!j(t, t2, i) || !j0.K(s0.A(t, R), s0.A(t2, R))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!D(t, t2, i) || !j0.K(s0.A(t, R), s0.A(t2, R))) {
                }
                break;
        }
        return true;
    }

    private <K, V> void m0(v0 v0Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            v0Var.x(i, this.q.c(r(i2)), this.q.h(obj));
        }
    }

    private final <UT, UB> UB n(Object obj, int i, UB ub, o0<UT, UB> o0Var) {
        C2904A.e q;
        int Q = Q(i);
        Object A = s0.A(obj, R(i0(i)));
        return (A == null || (q = q(i)) == null) ? ub : (UB) o(i, Q, this.q.d(A), q, ub, o0Var);
    }

    private void n0(int i, Object obj, v0 v0Var) throws IOException {
        if (obj instanceof String) {
            v0Var.l(i, (String) obj);
        } else {
            v0Var.r(i, (AbstractC2921h) obj);
        }
    }

    private final <K, V, UT, UB> UB o(int i, int i2, Map<K, V> map, C2904A.e eVar, UB ub, o0<UT, UB> o0Var) {
        K.a<?, ?> c = this.q.c(r(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = o0Var.n();
                }
                AbstractC2921h.C0433h t = AbstractC2921h.t(K.b(c, next.getKey(), next.getValue()));
                try {
                    K.e(t.b(), c, next.getKey(), next.getValue());
                    o0Var.d(ub, i2, t.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private <UT, UB> void o0(o0<UT, UB> o0Var, T t, v0 v0Var) throws IOException {
        o0Var.t(o0Var.g(t), v0Var);
    }

    private static <T> float p(T t, long j) {
        return s0.w(t, j);
    }

    private C2904A.e q(int i) {
        return (C2904A.e) this.b[((i / 3) * 2) + 1];
    }

    private Object r(int i) {
        return this.b[(i / 3) * 2];
    }

    private h0 s(int i) {
        int i2 = (i / 3) * 2;
        h0 h0Var = (h0) this.b[i2];
        if (h0Var != null) {
            return h0Var;
        }
        h0<T> d = d0.a().d((Class) this.b[i2 + 1]);
        this.b[i2] = d;
        return d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int t(T t) {
        int i;
        int i2;
        int i3;
        int d;
        int i4;
        int V;
        int X;
        Unsafe unsafe = s;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < this.a.length) {
            int i0 = i0(i6);
            int Q = Q(i6);
            int h0 = h0(i0);
            if (h0 <= 17) {
                i = this.a[i6 + 2];
                int i9 = 1048575 & i;
                int i10 = 1 << (i >>> 20);
                if (i9 != i5) {
                    i8 = unsafe.getInt(t, i9);
                    i5 = i9;
                }
                i2 = i10;
            } else {
                i = (!this.i || h0 < EnumC2934v.P0.d() || h0 > EnumC2934v.c1.d()) ? 0 : this.a[i6 + 2] & 1048575;
                i2 = 0;
            }
            long R = R(i0);
            int i11 = i5;
            switch (h0) {
                case 0:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = AbstractC2924k.i(Q, 0.0d);
                        i7 += i3;
                        break;
                    }
                case 1:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = AbstractC2924k.q(Q, 0.0f);
                        i7 += i3;
                        break;
                    }
                case 2:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = AbstractC2924k.x(Q, unsafe.getLong(t, R));
                        i7 += i3;
                        break;
                    }
                case 3:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = AbstractC2924k.Y(Q, unsafe.getLong(t, R));
                        i7 += i3;
                        break;
                    }
                case 4:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = AbstractC2924k.v(Q, unsafe.getInt(t, R));
                        i7 += i3;
                        break;
                    }
                case 5:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = AbstractC2924k.o(Q, 0L);
                        i7 += i3;
                        break;
                    }
                case 6:
                    if ((i8 & i2) != 0) {
                        i3 = AbstractC2924k.m(Q, 0);
                        i7 += i3;
                        break;
                    }
                    break;
                case 7:
                    if ((i8 & i2) != 0) {
                        d = AbstractC2924k.d(Q, true);
                        i7 += d;
                    }
                    break;
                case 8:
                    if ((i8 & i2) != 0) {
                        Object object = unsafe.getObject(t, R);
                        d = object instanceof AbstractC2921h ? AbstractC2924k.g(Q, (AbstractC2921h) object) : AbstractC2924k.T(Q, (String) object);
                        i7 += d;
                    }
                    break;
                case 9:
                    if ((i8 & i2) != 0) {
                        d = j0.o(Q, unsafe.getObject(t, R), s(i6));
                        i7 += d;
                    }
                    break;
                case 10:
                    if ((i8 & i2) != 0) {
                        d = AbstractC2924k.g(Q, (AbstractC2921h) unsafe.getObject(t, R));
                        i7 += d;
                    }
                    break;
                case 11:
                    if ((i8 & i2) != 0) {
                        d = AbstractC2924k.W(Q, unsafe.getInt(t, R));
                        i7 += d;
                    }
                    break;
                case 12:
                    if ((i8 & i2) != 0) {
                        d = AbstractC2924k.k(Q, unsafe.getInt(t, R));
                        i7 += d;
                    }
                    break;
                case 13:
                    if ((i8 & i2) != 0) {
                        d = AbstractC2924k.L(Q, 0);
                        i7 += d;
                    }
                    break;
                case 14:
                    if ((i8 & i2) != 0) {
                        d = AbstractC2924k.N(Q, 0L);
                        i7 += d;
                    }
                    break;
                case 15:
                    if ((i8 & i2) != 0) {
                        d = AbstractC2924k.P(Q, unsafe.getInt(t, R));
                        i7 += d;
                    }
                    break;
                case 16:
                    if ((i8 & i2) != 0) {
                        d = AbstractC2924k.R(Q, unsafe.getLong(t, R));
                        i7 += d;
                    }
                    break;
                case 17:
                    if ((i8 & i2) != 0) {
                        d = AbstractC2924k.s(Q, (S) unsafe.getObject(t, R), s(i6));
                        i7 += d;
                    }
                    break;
                case 18:
                    d = j0.h(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 19:
                    d = j0.f(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 20:
                    d = j0.m(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 21:
                    d = j0.x(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 22:
                    d = j0.k(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 23:
                    d = j0.h(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 24:
                    d = j0.f(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 25:
                    d = j0.a(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 26:
                    d = j0.u(Q, (List) unsafe.getObject(t, R));
                    i7 += d;
                    break;
                case 27:
                    d = j0.p(Q, (List) unsafe.getObject(t, R), s(i6));
                    i7 += d;
                    break;
                case 28:
                    d = j0.c(Q, (List) unsafe.getObject(t, R));
                    i7 += d;
                    break;
                case 29:
                    d = j0.v(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 30:
                    d = j0.d(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 31:
                    d = j0.f(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 32:
                    d = j0.h(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 33:
                    d = j0.q(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 34:
                    d = j0.s(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 35:
                    i4 = j0.i((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 36:
                    i4 = j0.g((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 37:
                    i4 = j0.n((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 38:
                    i4 = j0.y((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 39:
                    i4 = j0.l((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 40:
                    i4 = j0.i((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 41:
                    i4 = j0.g((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 42:
                    i4 = j0.b((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 43:
                    i4 = j0.w((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 44:
                    i4 = j0.e((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 45:
                    i4 = j0.g((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 46:
                    i4 = j0.i((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 47:
                    i4 = j0.r((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 48:
                    i4 = j0.t((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i4);
                        i7 += V + X + i4;
                    }
                    break;
                case 49:
                    d = j0.j(Q, (List) unsafe.getObject(t, R), s(i6));
                    i7 += d;
                    break;
                case 50:
                    d = this.q.f(Q, unsafe.getObject(t, R), r(i6));
                    i7 += d;
                    break;
                case 51:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.i(Q, 0.0d);
                        i7 += d;
                    }
                    break;
                case 52:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.q(Q, 0.0f);
                        i7 += d;
                    }
                    break;
                case 53:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.x(Q, W(t, R));
                        i7 += d;
                    }
                    break;
                case 54:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.Y(Q, W(t, R));
                        i7 += d;
                    }
                    break;
                case 55:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.v(Q, V(t, R));
                        i7 += d;
                    }
                    break;
                case 56:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.o(Q, 0L);
                        i7 += d;
                    }
                    break;
                case 57:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.m(Q, 0);
                        i7 += d;
                    }
                    break;
                case 58:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.d(Q, true);
                        i7 += d;
                    }
                    break;
                case 59:
                    if (E(t, Q, i6)) {
                        Object object2 = unsafe.getObject(t, R);
                        d = object2 instanceof AbstractC2921h ? AbstractC2924k.g(Q, (AbstractC2921h) object2) : AbstractC2924k.T(Q, (String) object2);
                        i7 += d;
                    }
                    break;
                case 60:
                    if (E(t, Q, i6)) {
                        d = j0.o(Q, unsafe.getObject(t, R), s(i6));
                        i7 += d;
                    }
                    break;
                case 61:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.g(Q, (AbstractC2921h) unsafe.getObject(t, R));
                        i7 += d;
                    }
                    break;
                case 62:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.W(Q, V(t, R));
                        i7 += d;
                    }
                    break;
                case 63:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.k(Q, V(t, R));
                        i7 += d;
                    }
                    break;
                case 64:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.L(Q, 0);
                        i7 += d;
                    }
                    break;
                case 65:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.N(Q, 0L);
                        i7 += d;
                    }
                    break;
                case 66:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.P(Q, V(t, R));
                        i7 += d;
                    }
                    break;
                case 67:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.R(Q, W(t, R));
                        i7 += d;
                    }
                    break;
                case 68:
                    if (E(t, Q, i6)) {
                        d = AbstractC2924k.s(Q, (S) unsafe.getObject(t, R), s(i6));
                        i7 += d;
                    }
                    break;
            }
            i6 += 3;
            i5 = i11;
        }
        int v = i7 + v(this.o, t);
        return this.f ? v + this.p.c(t).l() : v;
    }

    private int u(T t) {
        int i;
        int i2;
        int V;
        int X;
        Unsafe unsafe = s;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a.length; i4 += 3) {
            int i0 = i0(i4);
            int h0 = h0(i0);
            int Q = Q(i4);
            long R = R(i0);
            int i5 = (h0 < EnumC2934v.P0.d() || h0 > EnumC2934v.c1.d()) ? 0 : this.a[i4 + 2] & 1048575;
            switch (h0) {
                case 0:
                    if (y(t, i4)) {
                        i = AbstractC2924k.i(Q, 0.0d);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y(t, i4)) {
                        i = AbstractC2924k.q(Q, 0.0f);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (y(t, i4)) {
                        i = AbstractC2924k.x(Q, s0.y(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (y(t, i4)) {
                        i = AbstractC2924k.Y(Q, s0.y(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (y(t, i4)) {
                        i = AbstractC2924k.v(Q, s0.x(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (y(t, i4)) {
                        i = AbstractC2924k.o(Q, 0L);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (y(t, i4)) {
                        i = AbstractC2924k.m(Q, 0);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (y(t, i4)) {
                        i = AbstractC2924k.d(Q, true);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (y(t, i4)) {
                        Object A = s0.A(t, R);
                        i = A instanceof AbstractC2921h ? AbstractC2924k.g(Q, (AbstractC2921h) A) : AbstractC2924k.T(Q, (String) A);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (y(t, i4)) {
                        i = j0.o(Q, s0.A(t, R), s(i4));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (y(t, i4)) {
                        i = AbstractC2924k.g(Q, (AbstractC2921h) s0.A(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (y(t, i4)) {
                        i = AbstractC2924k.W(Q, s0.x(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (y(t, i4)) {
                        i = AbstractC2924k.k(Q, s0.x(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (y(t, i4)) {
                        i = AbstractC2924k.L(Q, 0);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (y(t, i4)) {
                        i = AbstractC2924k.N(Q, 0L);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (y(t, i4)) {
                        i = AbstractC2924k.P(Q, s0.x(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (y(t, i4)) {
                        i = AbstractC2924k.R(Q, s0.y(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (y(t, i4)) {
                        i = AbstractC2924k.s(Q, (S) s0.A(t, R), s(i4));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i = j0.h(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 19:
                    i = j0.f(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 20:
                    i = j0.m(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 21:
                    i = j0.x(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 22:
                    i = j0.k(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 23:
                    i = j0.h(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 24:
                    i = j0.f(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 25:
                    i = j0.a(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 26:
                    i = j0.u(Q, G(t, R));
                    i3 += i;
                    break;
                case 27:
                    i = j0.p(Q, G(t, R), s(i4));
                    i3 += i;
                    break;
                case 28:
                    i = j0.c(Q, G(t, R));
                    i3 += i;
                    break;
                case 29:
                    i = j0.v(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 30:
                    i = j0.d(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 31:
                    i = j0.f(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 32:
                    i = j0.h(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 33:
                    i = j0.q(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 34:
                    i = j0.s(Q, G(t, R), false);
                    i3 += i;
                    break;
                case 35:
                    i2 = j0.i((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 36:
                    i2 = j0.g((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 37:
                    i2 = j0.n((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 38:
                    i2 = j0.y((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 39:
                    i2 = j0.l((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 40:
                    i2 = j0.i((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 41:
                    i2 = j0.g((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 42:
                    i2 = j0.b((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 43:
                    i2 = j0.w((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 44:
                    i2 = j0.e((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 45:
                    i2 = j0.g((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 46:
                    i2 = j0.i((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 47:
                    i2 = j0.r((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 48:
                    i2 = j0.t((List) unsafe.getObject(t, R));
                    if (i2 <= 0) {
                        break;
                    } else {
                        if (this.i) {
                            unsafe.putInt(t, i5, i2);
                        }
                        V = AbstractC2924k.V(Q);
                        X = AbstractC2924k.X(i2);
                        i = V + X + i2;
                        i3 += i;
                        break;
                    }
                case 49:
                    i = j0.j(Q, G(t, R), s(i4));
                    i3 += i;
                    break;
                case 50:
                    i = this.q.f(Q, s0.A(t, R), r(i4));
                    i3 += i;
                    break;
                case 51:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.i(Q, 0.0d);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.q(Q, 0.0f);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.x(Q, W(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.Y(Q, W(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.v(Q, V(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.o(Q, 0L);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.m(Q, 0);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.d(Q, true);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t, Q, i4)) {
                        Object A2 = s0.A(t, R);
                        i = A2 instanceof AbstractC2921h ? AbstractC2924k.g(Q, (AbstractC2921h) A2) : AbstractC2924k.T(Q, (String) A2);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (E(t, Q, i4)) {
                        i = j0.o(Q, s0.A(t, R), s(i4));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.g(Q, (AbstractC2921h) s0.A(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.W(Q, V(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.k(Q, V(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.L(Q, 0);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.N(Q, 0L);
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.P(Q, V(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.R(Q, W(t, R));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t, Q, i4)) {
                        i = AbstractC2924k.s(Q, (S) s0.A(t, R), s(i4));
                        i3 += i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i3 + v(this.o, t);
    }

    private <UT, UB> int v(o0<UT, UB> o0Var, T t) {
        return o0Var.h(o0Var.g(t));
    }

    private static <T> int w(T t, long j) {
        return s0.x(t, j);
    }

    private static boolean x(int i) {
        return (i & 536870912) != 0;
    }

    private boolean y(T t, int i) {
        if (!this.h) {
            int Y = Y(i);
            return (s0.x(t, (long) (Y & 1048575)) & (1 << (Y >>> 20))) != 0;
        }
        int i0 = i0(i);
        long R = R(i0);
        switch (h0(i0)) {
            case 0:
                return s0.v(t, R) != 0.0d;
            case 1:
                return s0.w(t, R) != 0.0f;
            case 2:
                return s0.y(t, R) != 0;
            case 3:
                return s0.y(t, R) != 0;
            case 4:
                return s0.x(t, R) != 0;
            case 5:
                return s0.y(t, R) != 0;
            case 6:
                return s0.x(t, R) != 0;
            case 7:
                return s0.p(t, R);
            case 8:
                Object A = s0.A(t, R);
                if (A instanceof String) {
                    return !((String) A).isEmpty();
                }
                if (A instanceof AbstractC2921h) {
                    return !AbstractC2921h.c0.equals(A);
                }
                throw new IllegalArgumentException();
            case 9:
                return s0.A(t, R) != null;
            case 10:
                return !AbstractC2921h.c0.equals(s0.A(t, R));
            case 11:
                return s0.x(t, R) != 0;
            case 12:
                return s0.x(t, R) != 0;
            case 13:
                return s0.x(t, R) != 0;
            case 14:
                return s0.y(t, R) != 0;
            case 15:
                return s0.x(t, R) != 0;
            case 16:
                return s0.y(t, R) != 0;
            case 17:
                return s0.A(t, R) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean z(T t, int i, int i2, int i3) {
        return this.h ? y(t, i) : (i2 & i3) != 0;
    }

    @Override // ax.r0.h0
    public void a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            M(t, t2, i);
        }
        if (this.h) {
            return;
        }
        j0.G(this.o, t, t2);
        if (this.f) {
            j0.E(this.p, t, t2);
        }
    }

    @Override // ax.r0.h0
    public void b(T t) {
        int i;
        int i2 = this.k;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long R = R(i0(this.j[i2]));
            Object A = s0.A(t, R);
            if (A != null) {
                s0.O(t, R, this.q.b(A));
            }
            i2++;
        }
        int length = this.j.length;
        while (i < length) {
            this.n.c(t, this.j[i]);
            i++;
        }
        this.o.j(t);
        if (this.f) {
            this.p.f(t);
        }
    }

    @Override // ax.r0.h0
    public final boolean c(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.k; i4++) {
            int i5 = this.j[i4];
            int Q = Q(i5);
            int i0 = i0(i5);
            if (this.h) {
                i = 0;
            } else {
                int i6 = this.a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = s.getInt(t, i7);
                    i2 = i7;
                }
            }
            if (F(i0) && !z(t, i5, i3, i)) {
                return false;
            }
            int h0 = h0(i0);
            if (h0 != 9 && h0 != 17) {
                if (h0 != 27) {
                    if (h0 == 60 || h0 == 68) {
                        if (E(t, Q, i5) && !A(t, i0, s(i5))) {
                            return false;
                        }
                    } else if (h0 != 49) {
                        if (h0 == 50 && !C(t, i0, i5)) {
                            return false;
                        }
                    }
                }
                if (!B(t, i0, i5)) {
                    return false;
                }
            } else if (z(t, i5, i3, i) && !A(t, i0, s(i5))) {
                return false;
            }
        }
        return !this.f || this.p.c(t).p();
    }

    @Override // ax.r0.h0
    public void d(T t, v0 v0Var) throws IOException {
        if (v0Var.j() == v0.a.DESCENDING) {
            l0(t, v0Var);
        } else if (this.h) {
            k0(t, v0Var);
        } else {
            j0(t, v0Var);
        }
    }

    @Override // ax.r0.h0
    public boolean e(T t, T t2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m(t, t2, i)) {
                return false;
            }
        }
        if (!this.o.g(t).equals(this.o.g(t2))) {
            return false;
        }
        if (this.f) {
            return this.p.c(t).equals(this.p.c(t2));
        }
        return true;
    }

    @Override // ax.r0.h0
    public int f(T t) {
        return this.h ? u(t) : t(t);
    }

    @Override // ax.r0.h0
    public T g() {
        return (T) this.m.a(this.e);
    }

    @Override // ax.r0.h0
    public void h(T t, g0 g0Var, C2929p c2929p) throws IOException {
        c2929p.getClass();
        I(this.o, this.p, t, g0Var, c2929p);
    }

    @Override // ax.r0.h0
    public int i(T t) {
        int i;
        int f;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i0 = i0(i3);
            int Q = Q(i3);
            long R = R(i0);
            int i4 = 37;
            switch (h0(i0)) {
                case 0:
                    i = i2 * 53;
                    f = C2904A.f(Double.doubleToLongBits(s0.v(t, R)));
                    i2 = i + f;
                    break;
                case 1:
                    i = i2 * 53;
                    f = Float.floatToIntBits(s0.w(t, R));
                    i2 = i + f;
                    break;
                case 2:
                    i = i2 * 53;
                    f = C2904A.f(s0.y(t, R));
                    i2 = i + f;
                    break;
                case 3:
                    i = i2 * 53;
                    f = C2904A.f(s0.y(t, R));
                    i2 = i + f;
                    break;
                case 4:
                    i = i2 * 53;
                    f = s0.x(t, R);
                    i2 = i + f;
                    break;
                case 5:
                    i = i2 * 53;
                    f = C2904A.f(s0.y(t, R));
                    i2 = i + f;
                    break;
                case 6:
                    i = i2 * 53;
                    f = s0.x(t, R);
                    i2 = i + f;
                    break;
                case 7:
                    i = i2 * 53;
                    f = C2904A.c(s0.p(t, R));
                    i2 = i + f;
                    break;
                case 8:
                    i = i2 * 53;
                    f = ((String) s0.A(t, R)).hashCode();
                    i2 = i + f;
                    break;
                case 9:
                    Object A = s0.A(t, R);
                    if (A != null) {
                        i4 = A.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    f = s0.A(t, R).hashCode();
                    i2 = i + f;
                    break;
                case 11:
                    i = i2 * 53;
                    f = s0.x(t, R);
                    i2 = i + f;
                    break;
                case 12:
                    i = i2 * 53;
                    f = s0.x(t, R);
                    i2 = i + f;
                    break;
                case 13:
                    i = i2 * 53;
                    f = s0.x(t, R);
                    i2 = i + f;
                    break;
                case 14:
                    i = i2 * 53;
                    f = C2904A.f(s0.y(t, R));
                    i2 = i + f;
                    break;
                case 15:
                    i = i2 * 53;
                    f = s0.x(t, R);
                    i2 = i + f;
                    break;
                case 16:
                    i = i2 * 53;
                    f = C2904A.f(s0.y(t, R));
                    i2 = i + f;
                    break;
                case 17:
                    Object A2 = s0.A(t, R);
                    if (A2 != null) {
                        i4 = A2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    f = s0.A(t, R).hashCode();
                    i2 = i + f;
                    break;
                case 50:
                    i = i2 * 53;
                    f = s0.A(t, R).hashCode();
                    i2 = i + f;
                    break;
                case 51:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = C2904A.f(Double.doubleToLongBits(T(t, R)));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = Float.floatToIntBits(U(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = C2904A.f(W(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = C2904A.f(W(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = C2904A.f(W(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = C2904A.c(S(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = ((String) s0.A(t, R)).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = s0.A(t, R).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = s0.A(t, R).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = C2904A.f(W(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = C2904A.f(W(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = s0.A(t, R).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.o.g(t).hashCode();
        return this.f ? (hashCode * 53) + this.p.c(t).hashCode() : hashCode;
    }
}
