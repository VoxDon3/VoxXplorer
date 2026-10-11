package ax.W5;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: ax.W5.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1053n1<T> implements InterfaceC1076v1<T> {
    private static final int[] n = new int[0];
    private static final Unsafe o = X1.g();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final InterfaceC1041j1 e;
    private final int[] f;
    private final int g;
    private final int h;
    private final X0 i;
    private final M1 j;
    private final A0 k;
    private final C1059p1 l;
    private final C1026e1 m;

    private C1053n1(int[] iArr, Object[] objArr, int i, int i2, InterfaceC1041j1 interfaceC1041j1, int i3, boolean z, int[] iArr2, int i4, int i5, C1059p1 c1059p1, X0 x0, M1 m1, A0 a0, C1026e1 c1026e1) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i4;
        this.h = i5;
        this.l = c1059p1;
        this.i = x0;
        this.j = m1;
        this.k = a0;
        this.e = interfaceC1041j1;
        this.m = c1026e1;
    }

    private final InterfaceC1076v1 A(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC1076v1 interfaceC1076v1 = (InterfaceC1076v1) this.b[i3];
        if (interfaceC1076v1 != null) {
            return interfaceC1076v1;
        }
        InterfaceC1076v1 b = C1067s1.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b;
        return b;
    }

    private final Object B(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    private final Object C(Object obj, int i) {
        InterfaceC1076v1 A = A(i);
        int x = x(i) & 1048575;
        if (!l(obj, i)) {
            return A.e();
        }
        Object object = o.getObject(obj, x);
        if (o(object)) {
            return object;
        }
        Object e = A.e();
        if (object != null) {
            A.f(e, object);
        }
        return e;
    }

    private final Object D(Object obj, int i, int i2) {
        InterfaceC1076v1 A = A(i2);
        if (!p(obj, i, i2)) {
            return A.e();
        }
        Object object = o.getObject(obj, x(i2) & 1048575);
        if (o(object)) {
            return object;
        }
        Object e = A.e();
        if (object != null) {
            A.f(e, object);
        }
        return e;
    }

    private static Field E(Class cls, String str) {
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

    private static void F(Object obj) {
        if (!o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void G(Object obj, Object obj2, int i) {
        if (l(obj2, i)) {
            int x = x(i) & 1048575;
            Unsafe unsafe = o;
            long j = x;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC1076v1 A = A(i);
            if (!l(obj, i)) {
                if (o(object)) {
                    Object e = A.e();
                    A.f(e, object);
                    unsafe.putObject(obj, j, e);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                I(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!o(object2)) {
                Object e2 = A.e();
                A.f(e2, object2);
                unsafe.putObject(obj, j, e2);
                object2 = e2;
            }
            A.f(object2, object);
        }
    }

    private final void H(Object obj, Object obj2, int i) {
        int i2 = this.a[i];
        if (p(obj2, i2, i)) {
            int x = x(i) & 1048575;
            Unsafe unsafe = o;
            long j = x;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC1076v1 A = A(i);
            if (!p(obj, i2, i)) {
                if (o(object)) {
                    Object e = A.e();
                    A.f(e, object);
                    unsafe.putObject(obj, j, e);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                a(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!o(object2)) {
                Object e2 = A.e();
                A.f(e2, object2);
                unsafe.putObject(obj, j, e2);
                object2 = e2;
            }
            A.f(object2, object);
        }
    }

    private final void I(Object obj, int i) {
        int u = u(i);
        long j = 1048575 & u;
        if (j == 1048575) {
            return;
        }
        X1.n(obj, j, (1 << (u >>> 20)) | X1.c(obj, j));
    }

    private final void a(Object obj, int i, int i2) {
        X1.n(obj, u(i2) & 1048575, i);
    }

    private final void i(Object obj, int i, Object obj2) {
        o.putObject(obj, x(i) & 1048575, obj2);
        I(obj, i);
    }

    private final void j(Object obj, int i, int i2, Object obj2) {
        o.putObject(obj, x(i2) & 1048575, obj2);
        a(obj, i, i2);
    }

    private final boolean k(Object obj, Object obj2, int i) {
        return l(obj, i) == l(obj2, i);
    }

    private final boolean l(Object obj, int i) {
        int u = u(i);
        long j = u & 1048575;
        if (j != 1048575) {
            return (X1.c(obj, j) & (1 << (u >>> 20))) != 0;
        }
        int x = x(i);
        long j2 = x & 1048575;
        switch (w(x)) {
            case 0:
                return Double.doubleToRawLongBits(X1.a(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(X1.b(obj, j2)) != 0;
            case 2:
                return X1.d(obj, j2) != 0;
            case 3:
                return X1.d(obj, j2) != 0;
            case 4:
                return X1.c(obj, j2) != 0;
            case 5:
                return X1.d(obj, j2) != 0;
            case 6:
                return X1.c(obj, j2) != 0;
            case 7:
                return X1.t(obj, j2);
            case 8:
                Object f = X1.f(obj, j2);
                if (f instanceof String) {
                    return !((String) f).isEmpty();
                }
                if (f instanceof AbstractC1069t0) {
                    return !AbstractC1069t0.c0.equals(f);
                }
                throw new IllegalArgumentException();
            case 9:
                return X1.f(obj, j2) != null;
            case 10:
                return !AbstractC1069t0.c0.equals(X1.f(obj, j2));
            case 11:
                return X1.c(obj, j2) != 0;
            case 12:
                return X1.c(obj, j2) != 0;
            case 13:
                return X1.c(obj, j2) != 0;
            case 14:
                return X1.d(obj, j2) != 0;
            case 15:
                return X1.c(obj, j2) != 0;
            case 16:
                return X1.d(obj, j2) != 0;
            case 17:
                return X1.f(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean m(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? l(obj, i) : (i3 & i4) != 0;
    }

    private static boolean n(Object obj, int i, InterfaceC1076v1 interfaceC1076v1) {
        return interfaceC1076v1.g(X1.f(obj, i & 1048575));
    }

    private static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof J0) {
            return ((J0) obj).n();
        }
        return true;
    }

    private final boolean p(Object obj, int i, int i2) {
        return X1.c(obj, (long) (u(i2) & 1048575)) == i;
    }

    static O1 r(Object obj) {
        J0 j0 = (J0) obj;
        O1 o1 = j0.zzc;
        if (o1 != O1.a()) {
            return o1;
        }
        O1 d = O1.d();
        j0.zzc = d;
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static ax.W5.C1053n1 s(java.lang.Class r31, ax.W5.InterfaceC1032g1 r32, ax.W5.C1059p1 r33, ax.W5.X0 r34, ax.W5.M1 r35, ax.W5.A0 r36, ax.W5.C1026e1 r37) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W5.C1053n1.s(java.lang.Class, ax.W5.g1, ax.W5.p1, ax.W5.X0, ax.W5.M1, ax.W5.A0, ax.W5.e1):ax.W5.n1");
    }

    private static int t(Object obj, long j) {
        return ((Integer) X1.f(obj, j)).intValue();
    }

    private final int u(int i) {
        return this.a[i + 2];
    }

    private final int v(int i, int i2) {
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

    private static int w(int i) {
        return (i >>> 20) & 255;
    }

    private final int x(int i) {
        return this.a[i + 1];
    }

    private static long y(Object obj, long j) {
        return ((Long) X1.f(obj, j)).longValue();
    }

    private final L0 z(int i) {
        int i2 = i / 3;
        return (L0) this.b[i2 + i2 + 1];
    }

    @Override // ax.W5.InterfaceC1076v1
    public final int b(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int length = this.a.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int x = x(i4);
            int i5 = this.a[i4];
            long j = 1048575 & x;
            int i6 = 37;
            switch (w(x)) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(X1.a(obj, j));
                    byte[] bArr = O0.d;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(X1.b(obj, j));
                    i3 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = X1.d(obj, j);
                    byte[] bArr2 = O0.d;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = X1.d(obj, j);
                    byte[] bArr3 = O0.d;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i3 * 53;
                    floatToIntBits = X1.c(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = X1.d(obj, j);
                    byte[] bArr4 = O0.d;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i3 * 53;
                    floatToIntBits = X1.c(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i3 * 53;
                    floatToIntBits = O0.a(X1.t(obj, j));
                    i3 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i3 * 53;
                    floatToIntBits = ((String) X1.f(obj, j)).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 9:
                    Object f = X1.f(obj, j);
                    if (f != null) {
                        i6 = f.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    floatToIntBits = X1.f(obj, j).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i3 * 53;
                    floatToIntBits = X1.c(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i3 * 53;
                    floatToIntBits = X1.c(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i3 * 53;
                    floatToIntBits = X1.c(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = X1.d(obj, j);
                    byte[] bArr5 = O0.d;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i3 * 53;
                    floatToIntBits = X1.c(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = X1.d(obj, j);
                    byte[] bArr6 = O0.d;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object f2 = X1.f(obj, j);
                    if (f2 != null) {
                        i6 = f2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
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
                    i2 = i3 * 53;
                    floatToIntBits = X1.f(obj, j).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i3 * 53;
                    floatToIntBits = X1.f(obj, j).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 51:
                    if (p(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) X1.f(obj, j)).doubleValue());
                        byte[] bArr7 = O0.d;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) X1.f(obj, j)).floatValue());
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (p(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = y(obj, j);
                        byte[] bArr8 = O0.d;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (p(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = y(obj, j);
                        byte[] bArr9 = O0.d;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = t(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (p(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = y(obj, j);
                        byte[] bArr10 = O0.d;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = t(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = O0.a(((Boolean) X1.f(obj, j)).booleanValue());
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = ((String) X1.f(obj, j)).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = X1.f(obj, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = X1.f(obj, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = t(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = t(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = t(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (p(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = y(obj, j);
                        byte[] bArr11 = O0.d;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = t(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (p(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = y(obj, j);
                        byte[] bArr12 = O0.d;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (p(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = X1.f(obj, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i3 * 53) + this.j.b(obj).hashCode();
    }

    @Override // ax.W5.InterfaceC1076v1
    public final void c(Object obj) {
        if (o(obj)) {
            if (obj instanceof J0) {
                J0 j0 = (J0) obj;
                j0.m(SubsamplingScaleImageView.TILE_SIZE_AUTO);
                j0.zza = 0;
                j0.k();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int x = x(i);
                int i2 = 1048575 & x;
                int w = w(x);
                long j = i2;
                if (w != 9) {
                    if (w != 60 && w != 68) {
                        switch (w) {
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
                                this.i.a(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((C1023d1) object).d();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (p(obj, this.a[i], i)) {
                        A(i).c(o.getObject(obj, j));
                    }
                }
                if (l(obj, i)) {
                    A(i).c(o.getObject(obj, j));
                }
            }
            this.j.e(obj);
        }
    }

    @Override // ax.W5.InterfaceC1076v1
    public final void d(Object obj, byte[] bArr, int i, int i2, C1031g0 c1031g0) throws IOException {
        q(obj, bArr, i, i2, 0, c1031g0);
    }

    @Override // ax.W5.InterfaceC1076v1
    public final Object e() {
        return ((J0) this.e).c();
    }

    @Override // ax.W5.InterfaceC1076v1
    public final void f(Object obj, Object obj2) {
        F(obj);
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int x = x(i);
            int i2 = this.a[i];
            long j = 1048575 & x;
            switch (w(x)) {
                case 0:
                    if (l(obj2, i)) {
                        X1.l(obj, j, X1.a(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (l(obj2, i)) {
                        X1.m(obj, j, X1.b(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (l(obj2, i)) {
                        X1.o(obj, j, X1.d(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (l(obj2, i)) {
                        X1.o(obj, j, X1.d(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (l(obj2, i)) {
                        X1.n(obj, j, X1.c(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (l(obj2, i)) {
                        X1.o(obj, j, X1.d(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (l(obj2, i)) {
                        X1.n(obj, j, X1.c(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (l(obj2, i)) {
                        X1.k(obj, j, X1.t(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (l(obj2, i)) {
                        X1.p(obj, j, X1.f(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    G(obj, obj2, i);
                    break;
                case 10:
                    if (l(obj2, i)) {
                        X1.p(obj, j, X1.f(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (l(obj2, i)) {
                        X1.n(obj, j, X1.c(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (l(obj2, i)) {
                        X1.n(obj, j, X1.c(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (l(obj2, i)) {
                        X1.n(obj, j, X1.c(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (l(obj2, i)) {
                        X1.o(obj, j, X1.d(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (l(obj2, i)) {
                        X1.n(obj, j, X1.c(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (l(obj2, i)) {
                        X1.o(obj, j, X1.d(obj2, j));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    G(obj, obj2, i);
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
                    this.i.b(obj, obj2, j);
                    break;
                case 50:
                    int i3 = C1082x1.d;
                    X1.p(obj, j, C1026e1.a(X1.f(obj, j), X1.f(obj2, j)));
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
                    if (p(obj2, i2, i)) {
                        X1.p(obj, j, X1.f(obj2, j));
                        a(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    H(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(obj2, i2, i)) {
                        X1.p(obj, j, X1.f(obj2, j));
                        a(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    H(obj, obj2, i);
                    break;
            }
        }
        C1082x1.d(this.j, obj, obj2);
    }

    @Override // ax.W5.InterfaceC1076v1
    public final boolean g(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < this.g) {
            int i6 = this.f[i3];
            int i7 = this.a[i6];
            int x = x(i6);
            int i8 = this.a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i4) {
                if (i9 != 1048575) {
                    i5 = o.getInt(obj, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i4;
                i2 = i5;
            }
            Object obj2 = obj;
            if ((268435456 & x) != 0 && !m(obj2, i6, i, i2, i10)) {
                return false;
            }
            int w = w(x);
            if (w != 9 && w != 17) {
                if (w != 27) {
                    if (w == 60 || w == 68) {
                        if (p(obj2, i7, i6) && !n(obj2, x, A(i6))) {
                            return false;
                        }
                    } else if (w != 49) {
                        if (w == 50 && !((C1023d1) X1.f(obj2, x & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) X1.f(obj2, x & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC1076v1 A = A(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!A.g(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (m(obj2, i6, i, i2, i10) && !n(obj2, x, A(i6))) {
                return false;
            }
            i3++;
            obj = obj2;
            i4 = i;
            i5 = i2;
        }
        return true;
    }

    @Override // ax.W5.InterfaceC1076v1
    public final boolean h(Object obj, Object obj2) {
        boolean f;
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int x = x(i);
            long j = x & 1048575;
            switch (w(x)) {
                case 0:
                    if (k(obj, obj2, i) && Double.doubleToLongBits(X1.a(obj, j)) == Double.doubleToLongBits(X1.a(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (k(obj, obj2, i) && Float.floatToIntBits(X1.b(obj, j)) == Float.floatToIntBits(X1.b(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (k(obj, obj2, i) && X1.d(obj, j) == X1.d(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (k(obj, obj2, i) && X1.d(obj, j) == X1.d(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (k(obj, obj2, i) && X1.c(obj, j) == X1.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (k(obj, obj2, i) && X1.d(obj, j) == X1.d(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (k(obj, obj2, i) && X1.c(obj, j) == X1.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (k(obj, obj2, i) && X1.t(obj, j) == X1.t(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (k(obj, obj2, i) && C1082x1.f(X1.f(obj, j), X1.f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (k(obj, obj2, i) && C1082x1.f(X1.f(obj, j), X1.f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (k(obj, obj2, i) && C1082x1.f(X1.f(obj, j), X1.f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (k(obj, obj2, i) && X1.c(obj, j) == X1.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (k(obj, obj2, i) && X1.c(obj, j) == X1.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (k(obj, obj2, i) && X1.c(obj, j) == X1.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (k(obj, obj2, i) && X1.d(obj, j) == X1.d(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (k(obj, obj2, i) && X1.c(obj, j) == X1.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (k(obj, obj2, i) && X1.d(obj, j) == X1.d(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (k(obj, obj2, i) && C1082x1.f(X1.f(obj, j), X1.f(obj2, j))) {
                        continue;
                    }
                    return false;
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
                    f = C1082x1.f(X1.f(obj, j), X1.f(obj2, j));
                    break;
                case 50:
                    f = C1082x1.f(X1.f(obj, j), X1.f(obj2, j));
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
                    long u = u(i) & 1048575;
                    if (X1.c(obj, u) == X1.c(obj2, u) && C1082x1.f(X1.f(obj, j), X1.f(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!f) {
                return false;
            }
        }
        return this.j.b(obj).equals(this.j.b(obj2));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int q(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, ax.W5.C1031g0 r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W5.C1053n1.q(java.lang.Object, byte[], int, int, int, ax.W5.g0):int");
    }
}
