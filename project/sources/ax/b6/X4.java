package ax.b6;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class X4<T> implements InterfaceC1609l5<T> {
    private static final int[] q = new int[0];
    private static final Unsafe r = H5.p();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final U4 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int[] i;
    private final int j;
    private final int k;
    private final InterfaceC1528c5 l;
    private final E4 m;
    private final G5<?, ?> n;
    private final Y3<?> o;
    private final N4 p;

    private X4(int[] iArr, Object[] objArr, int i, int i2, U4 u4, EnumC1555f5 enumC1555f5, boolean z, int[] iArr2, int i3, int i4, InterfaceC1528c5 interfaceC1528c5, E4 e4, G5<?, ?> g5, Y3<?> y3, N4 n4) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = u4 instanceof AbstractC1599k4;
        this.f = y3 != null && y3.e(u4);
        this.h = false;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = interfaceC1528c5;
        this.m = e4;
        this.n = g5;
        this.o = y3;
        this.e = u4;
        this.p = n4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Object obj, int i, InterfaceC1609l5 interfaceC1609l5) {
        return interfaceC1609l5.d(H5.B(obj, i & 1048575));
    }

    private static <T> float B(T t, long j) {
        return ((Float) H5.B(t, j)).floatValue();
    }

    private final int C(int i) {
        return this.a[i + 2];
    }

    private final void D(T t, int i) {
        int C = C(i);
        long j = 1048575 & C;
        if (j == 1048575) {
            return;
        }
        H5.h(t, j, (1 << (C >>> 20)) | H5.t(t, j));
    }

    private final void E(T t, int i, int i2) {
        H5.h(t, C(i2) & 1048575, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F(T t, T t2, int i) {
        int i2 = this.a[i];
        if (J(t2, i2, i)) {
            long G = G(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(t2, G);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(t2));
            }
            InterfaceC1609l5 N = N(i);
            if (!J(t, i2, i)) {
                if (T(object)) {
                    Object a = N.a();
                    N.g(a, object);
                    unsafe.putObject(t, G, a);
                } else {
                    unsafe.putObject(t, G, object);
                }
                E(t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, G);
            if (!T(object2)) {
                Object a2 = N.a();
                N.g(a2, object2);
                unsafe.putObject(t, G, a2);
                object2 = a2;
            }
            N.g(object2, object);
        }
    }

    private final int G(int i) {
        return this.a[i + 1];
    }

    private static <T> int H(T t, long j) {
        return ((Integer) H5.B(t, j)).intValue();
    }

    private final boolean I(T t, int i) {
        int C = C(i);
        long j = C & 1048575;
        if (j != 1048575) {
            return (H5.t(t, j) & (1 << (C >>> 20))) != 0;
        }
        int G = G(i);
        long j2 = G & 1048575;
        switch ((G & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(H5.a(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(H5.n(t, j2)) != 0;
            case 2:
                return H5.x(t, j2) != 0;
            case 3:
                return H5.x(t, j2) != 0;
            case 4:
                return H5.t(t, j2) != 0;
            case 5:
                return H5.x(t, j2) != 0;
            case 6:
                return H5.t(t, j2) != 0;
            case 7:
                return H5.F(t, j2);
            case 8:
                Object B = H5.B(t, j2);
                if (B instanceof String) {
                    return !((String) B).isEmpty();
                }
                if (B instanceof B3) {
                    return !B3.c0.equals(B);
                }
                throw new IllegalArgumentException();
            case 9:
                return H5.B(t, j2) != null;
            case 10:
                return !B3.c0.equals(H5.B(t, j2));
            case 11:
                return H5.t(t, j2) != 0;
            case 12:
                return H5.t(t, j2) != 0;
            case 13:
                return H5.t(t, j2) != 0;
            case 14:
                return H5.x(t, j2) != 0;
            case 15:
                return H5.t(t, j2) != 0;
            case 16:
                return H5.x(t, j2) != 0;
            case 17:
                return H5.B(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean J(T t, int i, int i2) {
        return H5.t(t, (long) (C(i2) & 1048575)) == i;
    }

    private final boolean K(T t, T t2, int i) {
        return I(t, i) == I(t2, i);
    }

    private static <T> long L(T t, long j) {
        return ((Long) H5.B(t, j)).longValue();
    }

    private final InterfaceC1632o4 M(int i) {
        return (InterfaceC1632o4) this.b[((i / 3) << 1) + 1];
    }

    private final InterfaceC1609l5 N(int i) {
        int i2 = (i / 3) << 1;
        InterfaceC1609l5 interfaceC1609l5 = (InterfaceC1609l5) this.b[i2];
        if (interfaceC1609l5 != null) {
            return interfaceC1609l5;
        }
        InterfaceC1609l5<T> b = C1582i5.a().b((Class) this.b[i2 + 1]);
        this.b[i2] = b;
        return b;
    }

    private static F5 O(Object obj) {
        AbstractC1599k4 abstractC1599k4 = (AbstractC1599k4) obj;
        F5 f5 = abstractC1599k4.zzb;
        if (f5 != F5.k()) {
            return f5;
        }
        F5 l = F5.l();
        abstractC1599k4.zzb = l;
        return l;
    }

    private static <T> boolean P(T t, long j) {
        return ((Boolean) H5.B(t, j)).booleanValue();
    }

    private final Object Q(int i) {
        return this.b[(i / 3) << 1];
    }

    private static void R(Object obj) {
        if (T(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean S(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean T(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1599k4) {
            return ((AbstractC1599k4) obj).H();
        }
        return true;
    }

    private static <T> double j(T t, long j) {
        return ((Double) H5.B(t, j)).doubleValue();
    }

    private final int k(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return l(i, 0);
    }

    private final int l(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> ax.b6.X4<T> n(java.lang.Class<T> r32, ax.b6.S4 r33, ax.b6.InterfaceC1528c5 r34, ax.b6.E4 r35, ax.b6.G5<?, ?> r36, ax.b6.Y3<?> r37, ax.b6.N4 r38) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.X4.n(java.lang.Class, ax.b6.S4, ax.b6.c5, ax.b6.E4, ax.b6.G5, ax.b6.Y3, ax.b6.N4):ax.b6.X4");
    }

    private final <K, V, UT, UB> UB o(int i, int i2, Map<K, V> map, InterfaceC1632o4 interfaceC1632o4, UB ub, G5<UT, UB> g5, Object obj) {
        this.p.b(Q(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!interfaceC1632o4.d(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = g5.i(obj);
                }
                G3 u = B3.u(M4.a(null, next.getKey(), next.getValue()));
                try {
                    M4.b(u.b(), null, next.getKey(), next.getValue());
                    g5.c(ub, i2, u.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object p(T t, int i) {
        InterfaceC1609l5 N = N(i);
        long G = G(i) & 1048575;
        if (!I(t, i)) {
            return N.a();
        }
        Object object = r.getObject(t, G);
        if (T(object)) {
            return object;
        }
        Object a = N.a();
        if (object != null) {
            N.g(a, object);
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object q(T t, int i, int i2) {
        InterfaceC1609l5 N = N(i2);
        if (!J(t, i, i2)) {
            return N.a();
        }
        Object object = r.getObject(t, G(i2) & 1048575);
        if (T(object)) {
            return object;
        }
        Object a = N.a();
        if (object != null) {
            N.g(a, object);
        }
        return a;
    }

    private final <UT, UB> UB r(Object obj, int i, UB ub, G5<UT, UB> g5, Object obj2) {
        InterfaceC1632o4 M;
        int i2 = this.a[i];
        Object B = H5.B(obj, G(i) & 1048575);
        return (B == null || (M = M(i)) == null) ? ub : (UB) o(i, i2, this.p.c(B), M, ub, g5, obj2);
    }

    private static Field s(Class<?> cls, String str) {
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

    private static void t(int i, Object obj, InterfaceC1529c6 interfaceC1529c6) throws IOException {
        if (obj instanceof String) {
            interfaceC1529c6.p(i, (String) obj);
        } else {
            interfaceC1529c6.M(i, (B3) obj);
        }
    }

    private static <UT, UB> void u(G5<UT, UB> g5, T t, InterfaceC1529c6 interfaceC1529c6) throws IOException {
        g5.g(g5.k(t), interfaceC1529c6);
    }

    private final <K, V> void v(InterfaceC1529c6 interfaceC1529c6, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.p.b(Q(i2));
            interfaceC1529c6.K(i, null, this.p.d(obj));
        }
    }

    private final void w(T t, int i, int i2, Object obj) {
        r.putObject(t, G(i2) & 1048575, obj);
        E(t, i, i2);
    }

    private final void x(T t, int i, Object obj) {
        r.putObject(t, G(i) & 1048575, obj);
        D(t, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void y(T t, T t2, int i) {
        if (I(t2, i)) {
            long G = G(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(t2, G);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(t2));
            }
            InterfaceC1609l5 N = N(i);
            if (!I(t, i)) {
                if (T(object)) {
                    Object a = N.a();
                    N.g(a, object);
                    unsafe.putObject(t, G, a);
                } else {
                    unsafe.putObject(t, G, object);
                }
                D(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, G);
            if (!T(object2)) {
                Object a2 = N.a();
                N.g(a2, object2);
                unsafe.putObject(t, G, a2);
                object2 = a2;
            }
            N.g(object2, object);
        }
    }

    private final boolean z(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? I(t, i) : (i3 & i4) != 0;
    }

    @Override // ax.b6.InterfaceC1609l5
    public final T a() {
        return (T) this.l.b(this.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ax.b6.InterfaceC1609l5
    public final int b(T t) {
        int i;
        int e;
        int f;
        int c0;
        int B;
        int w0;
        int z0;
        X4<T> x4 = this;
        T t2 = t;
        Unsafe unsafe = r;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i3 < x4.a.length) {
            int G = x4.G(i3);
            int i7 = (267386880 & G) >>> 20;
            int[] iArr = x4.a;
            int i8 = iArr[i3];
            int i9 = iArr[i3 + 2];
            int i10 = i9 & i2;
            if (i7 <= 17) {
                if (i10 != i4) {
                    i5 = i10 == i2 ? 0 : unsafe.getInt(t2, i10);
                    i4 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = G & i2;
            if (i7 >= EnumC1545e4.L0.a()) {
                EnumC1545e4.Y0.a();
            }
            int i11 = i6;
            switch (i7) {
                case 0:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        e = S3.e(i8, 0.0d);
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 1:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        f = S3.f(i8, 0.0f);
                        i6 = i11 + f;
                        x4 = this;
                        t2 = t;
                        break;
                    }
                    x4 = this;
                    t2 = t;
                    i6 = i11;
                    break;
                case 2:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        c0 = S3.c0(i8, unsafe.getLong(t2, j));
                        i6 = i11 + c0;
                        x4 = this;
                        break;
                    }
                    x4 = this;
                    i6 = i11;
                    break;
                case 3:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        c0 = S3.q0(i8, unsafe.getLong(t2, j));
                        i6 = i11 + c0;
                        x4 = this;
                        break;
                    }
                    x4 = this;
                    i6 = i11;
                    break;
                case 4:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        c0 = S3.p0(i8, unsafe.getInt(t2, j));
                        i6 = i11 + c0;
                        x4 = this;
                        break;
                    }
                    x4 = this;
                    i6 = i11;
                    break;
                case 5:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        f = S3.T(i8, 0L);
                        i6 = i11 + f;
                        x4 = this;
                        t2 = t;
                        break;
                    }
                    x4 = this;
                    t2 = t;
                    i6 = i11;
                    break;
                case 6:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        f = S3.l0(i8, 0);
                        i6 = i11 + f;
                        x4 = this;
                        t2 = t;
                        break;
                    }
                    x4 = this;
                    t2 = t;
                    i6 = i11;
                    break;
                case 7:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        f = S3.D(i8, true);
                        i6 = i11 + f;
                        x4 = this;
                        t2 = t;
                        break;
                    }
                    x4 = this;
                    t2 = t;
                    i6 = i11;
                    break;
                case 8:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        Object object = unsafe.getObject(t2, j);
                        c0 = object instanceof B3 ? S3.U(i8, (B3) object) : S3.C(i8, (String) object);
                        i6 = i11 + c0;
                        x4 = this;
                        break;
                    }
                    x4 = this;
                    i6 = i11;
                    break;
                case 9:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        e = C1625n5.a(i8, unsafe.getObject(t2, j), x4.N(i3));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 10:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        c0 = S3.U(i8, (B3) unsafe.getObject(t2, j));
                        i6 = i11 + c0;
                        x4 = this;
                        break;
                    }
                    x4 = this;
                    i6 = i11;
                    break;
                case 11:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        c0 = S3.A0(i8, unsafe.getInt(t2, j));
                        i6 = i11 + c0;
                        x4 = this;
                        break;
                    }
                    x4 = this;
                    i6 = i11;
                    break;
                case 12:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        c0 = S3.h0(i8, unsafe.getInt(t2, j));
                        i6 = i11 + c0;
                        x4 = this;
                        break;
                    }
                    x4 = this;
                    i6 = i11;
                    break;
                case 13:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        f = S3.t0(i8, 0);
                        i6 = i11 + f;
                        x4 = this;
                        t2 = t;
                        break;
                    }
                    x4 = this;
                    t2 = t;
                    i6 = i11;
                    break;
                case 14:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        f = S3.i0(i8, 0L);
                        i6 = i11 + f;
                        x4 = this;
                        t2 = t;
                        break;
                    }
                    x4 = this;
                    t2 = t;
                    i6 = i11;
                    break;
                case 15:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        c0 = S3.x0(i8, unsafe.getInt(t2, j));
                        i6 = i11 + c0;
                        x4 = this;
                        break;
                    }
                    x4 = this;
                    i6 = i11;
                    break;
                case 16:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        c0 = S3.m0(i8, unsafe.getLong(t2, j));
                        i6 = i11 + c0;
                        x4 = this;
                        break;
                    }
                    x4 = this;
                    i6 = i11;
                    break;
                case 17:
                    if (x4.z(t2, i3, i4, i5, i)) {
                        e = S3.B(i8, (U4) unsafe.getObject(t2, j), x4.N(i3));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 18:
                    e = C1625n5.A(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 19:
                    e = C1625n5.x(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 20:
                    e = C1625n5.G(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 21:
                    e = C1625n5.S(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 22:
                    e = C1625n5.D(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 23:
                    e = C1625n5.A(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 24:
                    e = C1625n5.x(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 25:
                    e = C1625n5.d(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 26:
                    e = C1625n5.q(i8, (List) unsafe.getObject(t2, j));
                    i6 = i11 + e;
                    break;
                case 27:
                    e = C1625n5.r(i8, (List) unsafe.getObject(t2, j), x4.N(i3));
                    i6 = i11 + e;
                    break;
                case 28:
                    e = C1625n5.b(i8, (List) unsafe.getObject(t2, j));
                    i6 = i11 + e;
                    break;
                case 29:
                    e = C1625n5.P(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 30:
                    e = C1625n5.s(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 31:
                    e = C1625n5.x(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 32:
                    e = C1625n5.A(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 33:
                    e = C1625n5.J(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 34:
                    e = C1625n5.M(i8, (List) unsafe.getObject(t2, j), false);
                    i6 = i11 + e;
                    break;
                case 35:
                    B = C1625n5.B((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 36:
                    B = C1625n5.y((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 37:
                    B = C1625n5.H((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 38:
                    B = C1625n5.T((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 39:
                    B = C1625n5.E((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 40:
                    B = C1625n5.B((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 41:
                    B = C1625n5.y((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 42:
                    B = C1625n5.e((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 43:
                    B = C1625n5.Q((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 44:
                    B = C1625n5.t((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 45:
                    B = C1625n5.y((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 46:
                    B = C1625n5.B((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 47:
                    B = C1625n5.K((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 48:
                    B = C1625n5.N((List) unsafe.getObject(t2, j));
                    if (B > 0) {
                        w0 = S3.w0(i8);
                        z0 = S3.z0(B);
                        i6 = i11 + w0 + z0 + B;
                        break;
                    }
                    i6 = i11;
                    break;
                case 49:
                    e = C1625n5.c(i8, (List) unsafe.getObject(t2, j), x4.N(i3));
                    i6 = i11 + e;
                    break;
                case 50:
                    e = x4.p.i(i8, unsafe.getObject(t2, j), x4.Q(i3));
                    i6 = i11 + e;
                    break;
                case 51:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.e(i8, 0.0d);
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 52:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.f(i8, 0.0f);
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 53:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.c0(i8, L(t2, j));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 54:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.q0(i8, L(t2, j));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 55:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.p0(i8, H(t2, j));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 56:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.T(i8, 0L);
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 57:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.l0(i8, 0);
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 58:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.D(i8, true);
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 59:
                    if (x4.J(t2, i8, i3)) {
                        Object object2 = unsafe.getObject(t2, j);
                        e = object2 instanceof B3 ? S3.U(i8, (B3) object2) : S3.C(i8, (String) object2);
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 60:
                    if (x4.J(t2, i8, i3)) {
                        e = C1625n5.a(i8, unsafe.getObject(t2, j), x4.N(i3));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 61:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.U(i8, (B3) unsafe.getObject(t2, j));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 62:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.A0(i8, H(t2, j));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 63:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.h0(i8, H(t2, j));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 64:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.t0(i8, 0);
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 65:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.i0(i8, 0L);
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 66:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.x0(i8, H(t2, j));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 67:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.m0(i8, L(t2, j));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                case 68:
                    if (x4.J(t2, i8, i3)) {
                        e = S3.B(i8, (U4) unsafe.getObject(t2, j), x4.N(i3));
                        i6 = i11 + e;
                        break;
                    }
                    i6 = i11;
                    break;
                default:
                    i6 = i11;
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        G5<?, ?> g5 = x4.n;
        int a = i6 + g5.a(g5.k(t2));
        if (!x4.f) {
            return a;
        }
        C1536d4<?> b = x4.o.b(t2);
        int i12 = 0;
        for (int i13 = 0; i13 < b.a.a(); i13++) {
            Map.Entry<?, Object> f2 = b.a.f(i13);
            i12 += C1536d4.b((InterfaceC1554f4) f2.getKey(), f2.getValue());
        }
        for (Map.Entry<?, Object> entry : b.a.g()) {
            i12 += C1536d4.b((InterfaceC1554f4) entry.getKey(), entry.getValue());
        }
        return a + i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a30  */
    @Override // ax.b6.InterfaceC1609l5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(T r21, ax.b6.InterfaceC1529c6 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.X4.c(java.lang.Object, ax.b6.c6):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.b6.InterfaceC1609l5
    public final boolean d(T t) {
        int i;
        int i2;
        X4<T> x4;
        T t2;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < this.j) {
            int i6 = this.i[i3];
            int i7 = this.a[i6];
            int G = G(i6);
            int i8 = this.a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i4) {
                if (i9 != 1048575) {
                    i5 = r.getInt(t, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i4;
                i2 = i5;
            }
            if ((268435456 & G) != 0) {
                x4 = this;
                t2 = t;
                if (!x4.z(t2, i6, i, i2, i10)) {
                    return false;
                }
            } else {
                x4 = this;
                t2 = t;
            }
            int i11 = (267386880 & G) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (J(t2, i7, i6) && !A(t2, G, N(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 == 50 && !x4.p.d(H5.B(t2, G & 1048575)).isEmpty()) {
                            x4.p.b(Q(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) H5.B(t2, G & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC1609l5 N = N(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!N.d(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (x4.z(t2, i6, i, i2, i10) && !A(t2, G, N(i6))) {
                return false;
            }
            i3++;
            t = t2;
            i4 = i;
            i5 = i2;
        }
        return !this.f || this.o.b(t).s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.b6.InterfaceC1609l5
    public final void e(T t) {
        if (T(t)) {
            if (t instanceof AbstractC1599k4) {
                AbstractC1599k4 abstractC1599k4 = (AbstractC1599k4) t;
                abstractC1599k4.m(SubsamplingScaleImageView.TILE_SIZE_AUTO);
                abstractC1599k4.zza = 0;
                abstractC1599k4.G();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int G = G(i);
                long j = 1048575 & G;
                int i2 = (G & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
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
                                this.m.a(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = r;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.p.e(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (J(t, this.a[i], i)) {
                        N(i).e(r.getObject(t, j));
                    }
                }
                if (I(t, i)) {
                    N(i).e(r.getObject(t, j));
                }
            }
            this.n.l(t);
            if (this.f) {
                this.o.g(t);
            }
        }
    }

    @Override // ax.b6.InterfaceC1609l5
    public final int f(T t) {
        int i;
        int b;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int G = G(i3);
            int i4 = this.a[i3];
            long j = 1048575 & G;
            int i5 = 37;
            switch ((G & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    b = C1616m4.b(Double.doubleToLongBits(H5.a(t, j)));
                    i2 = i + b;
                    break;
                case 1:
                    i = i2 * 53;
                    b = Float.floatToIntBits(H5.n(t, j));
                    i2 = i + b;
                    break;
                case 2:
                    i = i2 * 53;
                    b = C1616m4.b(H5.x(t, j));
                    i2 = i + b;
                    break;
                case 3:
                    i = i2 * 53;
                    b = C1616m4.b(H5.x(t, j));
                    i2 = i + b;
                    break;
                case 4:
                    i = i2 * 53;
                    b = H5.t(t, j);
                    i2 = i + b;
                    break;
                case 5:
                    i = i2 * 53;
                    b = C1616m4.b(H5.x(t, j));
                    i2 = i + b;
                    break;
                case 6:
                    i = i2 * 53;
                    b = H5.t(t, j);
                    i2 = i + b;
                    break;
                case 7:
                    i = i2 * 53;
                    b = C1616m4.c(H5.F(t, j));
                    i2 = i + b;
                    break;
                case 8:
                    i = i2 * 53;
                    b = ((String) H5.B(t, j)).hashCode();
                    i2 = i + b;
                    break;
                case 9:
                    Object B = H5.B(t, j);
                    if (B != null) {
                        i5 = B.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    b = H5.B(t, j).hashCode();
                    i2 = i + b;
                    break;
                case 11:
                    i = i2 * 53;
                    b = H5.t(t, j);
                    i2 = i + b;
                    break;
                case 12:
                    i = i2 * 53;
                    b = H5.t(t, j);
                    i2 = i + b;
                    break;
                case 13:
                    i = i2 * 53;
                    b = H5.t(t, j);
                    i2 = i + b;
                    break;
                case 14:
                    i = i2 * 53;
                    b = C1616m4.b(H5.x(t, j));
                    i2 = i + b;
                    break;
                case 15:
                    i = i2 * 53;
                    b = H5.t(t, j);
                    i2 = i + b;
                    break;
                case 16:
                    i = i2 * 53;
                    b = C1616m4.b(H5.x(t, j));
                    i2 = i + b;
                    break;
                case 17:
                    Object B2 = H5.B(t, j);
                    if (B2 != null) {
                        i5 = B2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                    b = H5.B(t, j).hashCode();
                    i2 = i + b;
                    break;
                case 50:
                    i = i2 * 53;
                    b = H5.B(t, j).hashCode();
                    i2 = i + b;
                    break;
                case 51:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = C1616m4.b(Double.doubleToLongBits(j(t, j)));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = Float.floatToIntBits(B(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = C1616m4.b(L(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = C1616m4.b(L(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = H(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = C1616m4.b(L(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = H(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = C1616m4.c(P(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = ((String) H5.B(t, j)).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = H5.B(t, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = H5.B(t, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = H(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = H(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = H(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = C1616m4.b(L(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = H(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = C1616m4.b(L(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(t, i4, i3)) {
                        i = i2 * 53;
                        b = H5.B(t, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.n.k(t).hashCode();
        return this.f ? (hashCode * 53) + this.o.b(t).hashCode() : hashCode;
    }

    @Override // ax.b6.InterfaceC1609l5
    public final void g(T t, T t2) {
        R(t);
        t2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int G = G(i);
            long j = 1048575 & G;
            int i2 = this.a[i];
            switch ((G & 267386880) >>> 20) {
                case 0:
                    if (I(t2, i)) {
                        H5.f(t, j, H5.a(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (I(t2, i)) {
                        H5.g(t, j, H5.n(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (I(t2, i)) {
                        H5.i(t, j, H5.x(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (I(t2, i)) {
                        H5.i(t, j, H5.x(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (I(t2, i)) {
                        H5.h(t, j, H5.t(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (I(t2, i)) {
                        H5.i(t, j, H5.x(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (I(t2, i)) {
                        H5.h(t, j, H5.t(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (I(t2, i)) {
                        H5.v(t, j, H5.F(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (I(t2, i)) {
                        H5.j(t, j, H5.B(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    y(t, t2, i);
                    break;
                case 10:
                    if (I(t2, i)) {
                        H5.j(t, j, H5.B(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (I(t2, i)) {
                        H5.h(t, j, H5.t(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (I(t2, i)) {
                        H5.h(t, j, H5.t(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (I(t2, i)) {
                        H5.h(t, j, H5.t(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (I(t2, i)) {
                        H5.i(t, j, H5.x(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (I(t2, i)) {
                        H5.h(t, j, H5.t(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (I(t2, i)) {
                        H5.i(t, j, H5.x(t2, j));
                        D(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    y(t, t2, i);
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
                    this.m.b(t, t2, j);
                    break;
                case 50:
                    C1625n5.m(this.p, t, t2, j);
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
                    if (J(t2, i2, i)) {
                        H5.j(t, j, H5.B(t2, j));
                        E(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    F(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (J(t2, i2, i)) {
                        H5.j(t, j, H5.B(t2, j));
                        E(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    F(t, t2, i);
                    break;
            }
        }
        C1625n5.n(this.n, t, t2);
        if (this.f) {
            C1625n5.l(this.o, t, t2);
        }
    }

    @Override // ax.b6.InterfaceC1609l5
    public final void h(T t, byte[] bArr, int i, int i2, C1686v3 c1686v3) throws IOException {
        m(t, bArr, i, i2, 0, c1686v3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (ax.b6.C1625n5.p(ax.b6.H5.B(r10, r6), ax.b6.H5.B(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (ax.b6.H5.x(r10, r6) == ax.b6.H5.x(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (ax.b6.H5.t(r10, r6) == ax.b6.H5.t(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (ax.b6.H5.x(r10, r6) == ax.b6.H5.x(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (ax.b6.H5.t(r10, r6) == ax.b6.H5.t(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (ax.b6.H5.t(r10, r6) == ax.b6.H5.t(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (ax.b6.H5.t(r10, r6) == ax.b6.H5.t(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (ax.b6.C1625n5.p(ax.b6.H5.B(r10, r6), ax.b6.H5.B(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (ax.b6.C1625n5.p(ax.b6.H5.B(r10, r6), ax.b6.H5.B(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (ax.b6.C1625n5.p(ax.b6.H5.B(r10, r6), ax.b6.H5.B(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (ax.b6.H5.F(r10, r6) == ax.b6.H5.F(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (ax.b6.H5.t(r10, r6) == ax.b6.H5.t(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (ax.b6.H5.x(r10, r6) == ax.b6.H5.x(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (ax.b6.H5.t(r10, r6) == ax.b6.H5.t(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (ax.b6.H5.x(r10, r6) == ax.b6.H5.x(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (ax.b6.H5.x(r10, r6) == ax.b6.H5.x(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(ax.b6.H5.n(r10, r6)) == java.lang.Float.floatToIntBits(ax.b6.H5.n(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(ax.b6.H5.a(r10, r6)) == java.lang.Double.doubleToLongBits(ax.b6.H5.a(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (ax.b6.C1625n5.p(ax.b6.H5.B(r10, r6), ax.b6.H5.B(r11, r6)) != false) goto L105;
     */
    @Override // ax.b6.InterfaceC1609l5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.X4.i(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0c19, code lost:
    
        if (r1 == 1048575) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0c1b, code lost:
    
        r25.putInt(r9, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0c21, code lost:
    
        r8 = r0.j;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0c28, code lost:
    
        if (r8 >= r0.k) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0c2a, code lost:
    
        r3 = (ax.b6.F5) r0.r(r9, r0.i[r8], r3, r0.n, r31);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0c3d, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0c3e, code lost:
    
        if (r3 == null) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0c40, code lost:
    
        r0.n.h(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0c45, code lost:
    
        if (r35 != 0) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0c47, code lost:
    
        if (r6 != r7) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0c4e, code lost:
    
        throw ax.b6.C1663s4.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0c53, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0c4f, code lost:
    
        if (r6 > r7) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0c51, code lost:
    
        if (r15 != r35) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0c58, code lost:
    
        throw ax.b6.C1663s4.e();
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x092a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0925 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0b92  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0bff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int m(T r31, byte[] r32, int r33, int r34, int r35, ax.b6.C1686v3 r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.X4.m(java.lang.Object, byte[], int, int, int, ax.b6.v3):int");
    }
}
