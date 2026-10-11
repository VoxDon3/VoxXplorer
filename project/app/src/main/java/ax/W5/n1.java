/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.A0;
import ax.W5.F0;
import ax.W5.J0;
import ax.W5.J1;
import ax.W5.K0;
import ax.W5.L0;
import ax.W5.M0;
import ax.W5.M1;
import ax.W5.O0;
import ax.W5.O1;
import ax.W5.P0;
import ax.W5.X0;
import ax.W5.X1;
import ax.W5.Y0;
import ax.W5.Y1;
import ax.W5.b2;
import ax.W5.c1;
import ax.W5.d1;
import ax.W5.e1;
import ax.W5.g0;
import ax.W5.g1;
import ax.W5.h0;
import ax.W5.i0;
import ax.W5.j1;
import ax.W5.p1;
import ax.W5.s1;
import ax.W5.t0;
import ax.W5.u1;
import ax.W5.v1;
import ax.W5.x0;
import ax.W5.x1;
import ax.W5.y0;
import ax.i.s;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

final class n1<T>
implements v1<T> {
    private static final int[] n = new int[0];
    private static final Unsafe o = X1.g();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final j1 e;
    private final int[] f;
    private final int g;
    private final int h;
    private final X0 i;
    private final M1 j;
    private final A0 k;
    private final p1 l;
    private final e1 m;

    private n1(int[] nArray, Object[] objectArray, int n8, int n9, j1 j12, int n10, boolean bl, int[] nArray2, int n11, int n12, p1 p12, X0 x02, M1 m12, A0 a02, e1 e12) {
        this.a = nArray;
        this.b = objectArray;
        this.c = n8;
        this.d = n9;
        this.f = nArray2;
        this.g = n11;
        this.h = n12;
        this.l = p12;
        this.i = x02;
        this.j = m12;
        this.k = a02;
        this.e = j12;
        this.m = e12;
    }

    private final v1 A(int n8) {
        Object object = this.b;
        n8 /= 3;
        if ((object = (v1)object[n8 += n8]) != null) {
            return object;
        }
        this.b[n8] = object = s1.a().b((Class)this.b[n8 + 1]);
        return object;
    }

    private final Object B(int n8) {
        return this.b[(n8 /= 3) + n8];
    }

    private final Object C(Object object, int n8) {
        v1 v12 = this.A(n8);
        int n9 = this.x(n8);
        if (!this.l(object, n8)) {
            return v12.e();
        }
        long l8 = n9 & 0xFFFFF;
        Object object2 = o.getObject(object, l8);
        if (n1.o(object2)) {
            return object2;
        }
        object = v12.e();
        if (object2 != null) {
            v12.f(object, object2);
        }
        return object;
    }

    private final Object D(Object object, int n8, int n9) {
        v1 v12 = this.A(n9);
        if (!this.p(object, n8, n9)) {
            return v12.e();
        }
        Object object2 = o.getObject(object, this.x(n9) & 0xFFFFF);
        if (n1.o(object2)) {
            return object2;
        }
        object = v12.e();
        if (object2 != null) {
            v12.f(object, object2);
        }
        return object;
    }

    private static Field E(Class object, String string) {
        try {
            Field field = ((Class)object).getDeclaredField(string);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Object[] object2 = ((Class)object).getDeclaredFields();
            int n8 = object2.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                Field field = object2[i8];
                if (!string.equals(field.getName())) continue;
                return field;
            }
            object = ((Class)object).getName();
            String string2 = Arrays.toString(object2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field ");
            stringBuilder.append(string);
            stringBuilder.append(" for ");
            stringBuilder.append((String)object);
            stringBuilder.append(" not found. Known fields are ");
            stringBuilder.append(string2);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void F(Object object) {
        if (n1.o(object)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(object)));
    }

    private final void G(Object object, Object object2, int n8) {
        if (!this.l(object2, n8)) {
            return;
        }
        Unsafe unsafe = o;
        int n9 = this.x(n8);
        long l8 = n9 & 0xFFFFF;
        Object object3 = unsafe.getObject(object2, l8);
        if (object3 != null) {
            Object object4;
            v1 v12 = this.A(n8);
            if (!this.l(object, n8)) {
                if (!n1.o(object3)) {
                    unsafe.putObject(object, l8, object3);
                } else {
                    object2 = v12.e();
                    v12.f(object2, object3);
                    unsafe.putObject(object, l8, object2);
                }
                this.I(object, n8);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l8);
            if (!n1.o(object4)) {
                object2 = v12.e();
                v12.f(object2, object4);
                unsafe.putObject(object, l8, object2);
            }
            v12.f(object2, object3);
            return;
        }
        n8 = this.a[n8];
        object = object2.toString();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Source subfield ");
        ((StringBuilder)object2).append(n8);
        ((StringBuilder)object2).append(" is present but null: ");
        ((StringBuilder)object2).append((String)object);
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }

    private final void H(Object object, Object object2, int n8) {
        int n9 = this.a[n8];
        if (!this.p(object2, n9, n8)) {
            return;
        }
        Unsafe unsafe = o;
        int n10 = this.x(n8);
        long l8 = n10 & 0xFFFFF;
        Object object3 = unsafe.getObject(object2, l8);
        if (object3 != null) {
            Object object4;
            v1 v12 = this.A(n8);
            if (!this.p(object, n9, n8)) {
                if (!n1.o(object3)) {
                    unsafe.putObject(object, l8, object3);
                } else {
                    object2 = v12.e();
                    v12.f(object2, object3);
                    unsafe.putObject(object, l8, object2);
                }
                this.a(object, n9, n8);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l8);
            if (!n1.o(object4)) {
                object2 = v12.e();
                v12.f(object2, object4);
                unsafe.putObject(object, l8, object2);
            }
            v12.f(object2, object3);
            return;
        }
        n8 = this.a[n8];
        object2 = object2.toString();
        object = new StringBuilder();
        ((StringBuilder)object).append("Source subfield ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" is present but null: ");
        ((StringBuilder)object).append((String)object2);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private final void I(Object object, int n8) {
        long l8 = 0xFFFFF & (n8 = this.u(n8));
        if (l8 == 1048575L) {
            return;
        }
        X1.n(object, l8, 1 << (n8 >>> 20) | X1.c(object, l8));
    }

    private final void a(Object object, int n8, int n9) {
        X1.n(object, this.u(n9) & 0xFFFFF, n8);
    }

    private final void i(Object object, int n8, Object object2) {
        o.putObject(object, this.x(n8) & 0xFFFFF, object2);
        this.I(object, n8);
    }

    private final void j(Object object, int n8, int n9, Object object2) {
        o.putObject(object, this.x(n9) & 0xFFFFF, object2);
        this.a(object, n8, n9);
    }

    private final boolean k(Object object, Object object2, int n8) {
        return this.l(object, n8) == this.l(object2, n8);
    }

    private final boolean l(Object object, int n8) {
        int n9 = this.u(n8);
        long l8 = n9 & 0xFFFFF;
        if (l8 == 1048575L) {
            n8 = this.x(n8);
            n9 = n1.w(n8);
            l8 = n8 & 0xFFFFF;
            switch (n9) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 17: {
                    return X1.f(object, l8) != null;
                }
                case 16: {
                    return X1.d(object, l8) != 0L;
                }
                case 15: {
                    return X1.c(object, l8) != 0;
                }
                case 14: {
                    return X1.d(object, l8) != 0L;
                }
                case 13: {
                    return X1.c(object, l8) != 0;
                }
                case 12: {
                    return X1.c(object, l8) != 0;
                }
                case 11: {
                    return X1.c(object, l8) != 0;
                }
                case 10: {
                    return !t0.c0.equals(X1.f(object, l8));
                }
                case 9: {
                    return X1.f(object, l8) != null;
                }
                case 8: {
                    object = X1.f(object, l8);
                    if (object instanceof String) {
                        return !((String)object).isEmpty();
                    }
                    if (object instanceof t0) {
                        return !t0.c0.equals(object);
                    }
                    throw new IllegalArgumentException();
                }
                case 7: {
                    return X1.t(object, l8);
                }
                case 6: {
                    return X1.c(object, l8) != 0;
                }
                case 5: {
                    return X1.d(object, l8) != 0L;
                }
                case 4: {
                    return X1.c(object, l8) != 0;
                }
                case 3: {
                    return X1.d(object, l8) != 0L;
                }
                case 2: {
                    return X1.d(object, l8) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(X1.b(object, l8)) != 0;
                }
                case 0: 
            }
            return Double.doubleToRawLongBits(X1.a(object, l8)) != 0L;
        }
        return (X1.c(object, l8) & 1 << (n9 >>> 20)) != 0;
    }

    private final boolean m(Object object, int n8, int n9, int n10, int n11) {
        if (n9 == 1048575) {
            return this.l(object, n8);
        }
        return (n10 & n11) != 0;
    }

    private static boolean n(Object object, int n8, v1 v12) {
        return v12.g(X1.f(object, n8 & 0xFFFFF));
    }

    private static boolean o(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof J0) {
            return ((J0)object).n();
        }
        return true;
    }

    private final boolean p(Object object, int n8, int n9) {
        return X1.c(object, this.u(n9) & 0xFFFFF) == n8;
    }

    static O1 r(Object object) {
        J0 j02 = (J0)object;
        O1 o12 = j02.zzc;
        object = o12;
        if (o12 == O1.a()) {
            j02.zzc = object = O1.d();
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    static n1 s(Class object, g1 object2, p1 p12, X0 x02, M1 m12, A0 a02, e1 e12) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        if (!(object2 instanceof u1)) {
            object = (J1)object2;
            throw null;
        }
        u1 u12 = (u1)object2;
        object2 = u12.d();
        int n18 = ((String)object2).length();
        if (((String)object2).charAt(0) >= '\ud800') {
            n17 = 1;
            while (true) {
                n15 = n16 = n17 + 1;
                if (((String)object2).charAt(n17) >= '\ud800') {
                    n17 = n16;
                    continue;
                }
                break;
            }
        } else {
            n15 = 1;
        }
        n17 = n15 + 1;
        int n19 = ((String)object2).charAt(n15);
        n15 = n17;
        n16 = n19;
        if (n19 >= 55296) {
            n19 &= 0x1FFF;
            n16 = 13;
            while (true) {
                n15 = n17 + 1;
                if ((n17 = (int)((String)object2).charAt(n17)) < 55296) break;
                n19 |= (n17 & 0x1FFF) << n16;
                n16 += 13;
                n17 = n15;
            }
            n16 = n19 | n17 << n16;
        }
        if (n16 == 0) {
            object = n;
            n14 = 0;
            n17 = 0;
            n19 = 0;
            n13 = 0;
            n12 = 0;
            n11 = 0;
            n16 = 0;
        } else {
            n16 = n15 + 1;
            n15 = n17 = (int)((String)object2).charAt(n15);
            n19 = n16;
            if (n17 >= 55296) {
                n15 = n17 & 0x1FFF;
                n17 = 13;
                n19 = n16;
                n16 = n15;
                while (true) {
                    n15 = n19 + 1;
                    if ((n19 = (int)((String)object2).charAt(n19)) < 55296) break;
                    n16 |= (n19 & 0x1FFF) << n17;
                    n17 += 13;
                    n19 = n15;
                }
                n17 = n16 | n19 << n17;
                n19 = n15;
                n15 = n17;
            }
            n17 = n19 + 1;
            n10 = n16 = (int)((String)object2).charAt(n19);
            n19 = n17;
            if (n16 >= 55296) {
                n19 = n16 & 0x1FFF;
                n16 = 13;
                n11 = n17;
                while (true) {
                    n17 = n11 + 1;
                    if ((n11 = (int)((String)object2).charAt(n11)) < 55296) break;
                    n19 |= (n11 & 0x1FFF) << n16;
                    n16 += 13;
                    n11 = n17;
                }
                n10 = n19 | n11 << n16;
                n19 = n17;
            }
            n16 = n19 + 1;
            n17 = n19 = (int)((String)object2).charAt(n19);
            n11 = n16;
            if (n19 >= 55296) {
                n17 = n19 & 0x1FFF;
                n19 = 13;
                n11 = n16;
                n16 = n17;
                while (true) {
                    n17 = n11 + 1;
                    if ((n11 = (int)((String)object2).charAt(n11)) < 55296) break;
                    n16 |= (n11 & 0x1FFF) << n19;
                    n19 += 13;
                    n11 = n17;
                }
                n16 |= n11 << n19;
                n11 = n17;
                n17 = n16;
            }
            n19 = n11 + 1;
            n9 = ((String)object2).charAt(n11);
            n16 = n9;
            n11 = n19;
            if (n9 >= 55296) {
                n11 = n9 & 0x1FFF;
                n16 = 13;
                n9 = n19;
                while (true) {
                    n19 = n9 + 1;
                    if ((n9 = (int)((String)object2).charAt(n9)) < 55296) break;
                    n11 |= (n9 & 0x1FFF) << n16;
                    n16 += 13;
                    n9 = n19;
                }
                n16 = n11 | n9 << n16;
                n11 = n19;
            }
            n9 = n11 + 1;
            n19 = n8 = (int)((String)object2).charAt(n11);
            n11 = n9;
            if (n8 >= 55296) {
                n19 = n8 & 0x1FFF;
                n11 = 13;
                n8 = n9;
                n9 = n19;
                while (true) {
                    n19 = n8 + 1;
                    if ((n8 = (int)((String)object2).charAt(n8)) < 55296) break;
                    n9 |= (n8 & 0x1FFF) << n11;
                    n11 += 13;
                    n8 = n19;
                }
                n9 |= n8 << n11;
                n11 = n19;
                n19 = n9;
            }
            n9 = n11 + 1;
            n11 = n12 = (int)((String)object2).charAt(n11);
            n8 = n9;
            if (n12 >= 55296) {
                n11 = n12 & 0x1FFF;
                n8 = 13;
                n12 = n9;
                n9 = n11;
                while (true) {
                    n11 = n12 + 1;
                    if ((n12 = (int)((String)object2).charAt(n12)) < 55296) break;
                    n9 |= (n12 & 0x1FFF) << n8;
                    n8 += 13;
                    n12 = n11;
                }
                n9 |= n12 << n8;
                n8 = n11;
                n11 = n9;
            }
            n9 = n8 + 1;
            n12 = n13 = (int)((String)object2).charAt(n8);
            n8 = n9;
            if (n13 >= 55296) {
                n12 = n13 & 0x1FFF;
                n8 = 13;
                n13 = n9;
                while (true) {
                    n9 = n13 + 1;
                    if ((n13 = (int)((String)object2).charAt(n13)) < 55296) break;
                    n12 |= (n13 & 0x1FFF) << n8;
                    n8 += 13;
                    n13 = n9;
                }
                n12 |= n13 << n8;
                n8 = n9;
            }
            n13 = n8 + 1;
            n14 = ((String)object2).charAt(n8);
            n8 = n14;
            n9 = n13;
            if (n14 >= 55296) {
                n9 = n14 & 0x1FFF;
                n8 = 13;
                n14 = n13;
                n13 = n9;
                while (true) {
                    n9 = n14 + 1;
                    if ((n14 = (int)((String)object2).charAt(n14)) < 55296) break;
                    n13 |= (n14 & 0x1FFF) << n8;
                    n8 += 13;
                    n14 = n9;
                }
                n8 = n13 | n14 << n8;
            }
            n10 = n15 + n15 + n10;
            object = new int[n8 + n11 + n12];
            n13 = n17;
            n17 = n11;
            n12 = n16;
            n16 = n8;
            n14 = n15;
            n15 = n9;
            n11 = n10;
        }
        Unsafe unsafe = o;
        Object[] objectArray = u12.e();
        Class<?> clazz = u12.a().getClass();
        int n20 = n16 + n17;
        int[] nArray = new int[n19 * 3];
        Object[] objectArray2 = new Object[n19 + n19];
        n17 = n16;
        n19 = n20;
        n10 = 0;
        n9 = 0;
        while (true) {
            int n21;
            int n22;
            int n23;
            int n24;
            int n25;
            int n26;
            int n27;
            block55: {
                Object object3;
                block59: {
                    block56: {
                        block61: {
                            block57: {
                                block60: {
                                    block58: {
                                        block50: {
                                            block52: {
                                                block54: {
                                                    block51: {
                                                        block53: {
                                                            n27 = n9;
                                                            if (n15 >= n18) {
                                                                return new n1(nArray, objectArray2, n13, n12, u12.a(), u12.c(), false, (int[])object, n16, n20, p12, x02, m12, a02, e12);
                                                            }
                                                            n26 = n15 + 1;
                                                            n9 = ((String)object2).charAt(n15);
                                                            if (n9 >= 55296) {
                                                                n8 = n9 & 0x1FFF;
                                                                n9 = 13;
                                                                while (true) {
                                                                    n15 = n26 + 1;
                                                                    if ((n26 = (int)((String)object2).charAt(n26)) < 55296) break;
                                                                    n8 |= (n26 & 0x1FFF) << n9;
                                                                    n9 += 13;
                                                                    n26 = n15;
                                                                }
                                                                n26 = n8 | n26 << n9;
                                                            } else {
                                                                n15 = n26;
                                                                n26 = n9;
                                                            }
                                                            n25 = n15 + 1;
                                                            n24 = ((String)object2).charAt(n15);
                                                            if (n24 >= 55296) {
                                                                n8 = n24 & 0x1FFF;
                                                                n15 = 13;
                                                                while (true) {
                                                                    n9 = n25 + 1;
                                                                    if ((n25 = (int)((String)object2).charAt(n25)) < 55296) break;
                                                                    n8 |= (n25 & 0x1FFF) << n15;
                                                                    n15 += 13;
                                                                    n25 = n9;
                                                                }
                                                                n24 = n8 | n25 << n15;
                                                                n8 = n9;
                                                            } else {
                                                                n8 = n25;
                                                            }
                                                            n25 = n10;
                                                            if ((n24 & 0x400) != 0) {
                                                                object[n10] = n27;
                                                                n25 = n10 + 1;
                                                            }
                                                            if ((n23 = n24 & 0xFF) < 51) break block50;
                                                            n9 = n8 + 1;
                                                            n10 = ((String)object2).charAt(n8);
                                                            n15 = n9;
                                                            n8 = n10;
                                                            if (n10 >= 55296) {
                                                                n8 = n10 & 0x1FFF;
                                                                n15 = 13;
                                                                n10 = n9;
                                                                while (true) {
                                                                    n9 = n10 + 1;
                                                                    if ((n10 = (int)((String)object2).charAt(n10)) < 55296) break;
                                                                    n8 |= (n10 & 0x1FFF) << n15;
                                                                    n15 += 13;
                                                                    n10 = n9;
                                                                }
                                                                n8 |= n10 << n15;
                                                                n15 = n9;
                                                            }
                                                            if ((n10 = n23 - 51) == 9 || n10 == 17) break block51;
                                                            n9 = n11;
                                                            if (n10 != 12) break block52;
                                                            if (u12.c() == 1) break block53;
                                                            n9 = n11;
                                                            if ((n24 & 0x800) == 0) break block52;
                                                        }
                                                        n10 = n27 / 3;
                                                        n9 = n11 + 1;
                                                        objectArray2[n10 + n10 + 1] = objectArray[n11];
                                                        n11 = n9;
                                                        break block54;
                                                    }
                                                    n10 = n27 / 3;
                                                    n9 = n11 + 1;
                                                    objectArray2[n10 + n10 + 1] = objectArray[n11];
                                                    n11 = n9;
                                                }
                                                n9 = n11;
                                            }
                                            if ((object3 = objectArray[n11 = n8 + n8]) instanceof Field) {
                                                object3 = (Field)object3;
                                            } else {
                                                objectArray[n11] = object3 = n1.E(clazz, (String)object3);
                                            }
                                            n22 = (int)unsafe.objectFieldOffset((Field)object3);
                                            object3 = objectArray[++n11];
                                            if (object3 instanceof Field) {
                                                object3 = (Field)object3;
                                            } else {
                                                objectArray[n11] = object3 = n1.E(clazz, (String)object3);
                                            }
                                            n21 = (int)unsafe.objectFieldOffset((Field)object3);
                                            n10 = 0;
                                            n11 = n9;
                                            n8 = n17;
                                            break block55;
                                        }
                                        n15 = n11 + 1;
                                        object3 = n1.E(clazz, (String)objectArray[n11]);
                                        if (n23 == 9 || n23 == 17) break block56;
                                        if (n23 == 27 || n23 == 49) break block57;
                                        if (n23 == 12 || n23 == 30 || n23 == 44) break block58;
                                        if (n23 == 50) {
                                            object[n17] = n27;
                                            n10 = n27 / 3;
                                            n9 = n11 + 2;
                                            Object object4 = objectArray[n15];
                                            n10 += n10;
                                            objectArray2[n10] = object4;
                                            n15 = n9;
                                            if ((n24 & 0x800) != 0) {
                                                objectArray2[n10 + 1] = objectArray[n9];
                                                n15 = n11 + 3;
                                            }
                                            ++n17;
                                        }
                                        n9 = n17;
                                        break block59;
                                    }
                                    n9 = u12.c();
                                    n10 = n15;
                                    if (n9 == 1) break block60;
                                    n9 = n17;
                                    n15 = n10;
                                    if ((n24 & 0x800) == 0) break block59;
                                }
                                n9 = n27 / 3;
                                n15 = n11 + 2;
                                objectArray2[n9 + n9 + 1] = objectArray[n10];
                                break block61;
                            }
                            n9 = n27 / 3;
                            objectArray2[n9 + n9 + 1] = objectArray[n15];
                            n15 = n11 += 2;
                        }
                        n9 = n17;
                        break block59;
                    }
                    n11 = n27 / 3;
                    objectArray2[n11 + n11 + 1] = ((Field)object3).getType();
                    n9 = n17;
                }
                n22 = (int)unsafe.objectFieldOffset((Field)object3);
                n10 = 1048575;
                if ((n24 & 0x1000) != 0 && n23 <= 17) {
                    n11 = n8 + 1;
                    n17 = ((String)object2).charAt(n8);
                    if (n17 >= 55296) {
                        n8 = n17 & 0x1FFF;
                        n17 = 13;
                        n10 = n11;
                        while (true) {
                            n11 = n10 + 1;
                            if ((n10 = (int)((String)object2).charAt(n10)) < 55296) break;
                            n8 |= (n10 & 0x1FFF) << n17;
                            n17 += 13;
                            n10 = n11;
                        }
                        n17 = n8 | n10 << n17;
                    }
                    if ((object3 = objectArray[n8 = n14 + n14 + n17 / 32]) instanceof Field) {
                        object3 = (Field)object3;
                    } else {
                        objectArray[n8] = object3 = n1.E(clazz, (String)object3);
                    }
                    n10 = (int)unsafe.objectFieldOffset((Field)object3);
                    n17 %= 32;
                } else {
                    n11 = n8;
                    n17 = 0;
                }
                n8 = n19;
                if (n23 >= 18) {
                    n8 = n19;
                    if (n23 <= 49) {
                        object[n19] = n22;
                        n8 = n19 + 1;
                    }
                }
                n21 = n10;
                int n28 = n11;
                n19 = n8;
                n8 = n9;
                n11 = n15;
                n10 = n17;
                n15 = n28;
            }
            nArray[n27] = n26;
            n17 = (n24 & 0x200) != 0 ? 0x20000000 : 0;
            n9 = (n24 & 0x100) != 0 ? 0x10000000 : 0;
            n26 = (n24 & 0x800) != 0 ? Integer.MIN_VALUE : 0;
            nArray[n27 + 1] = n17 | n9 | n26 | n23 << 20 | n22;
            n9 = n27 + 3;
            nArray[n27 + 2] = n10 << 20 | n21;
            n10 = n25;
            n17 = n8;
        }
    }

    private static int t(Object object, long l8) {
        return (Integer)X1.f(object, l8);
    }

    private final int u(int n8) {
        return this.a[n8 + 2];
    }

    private final int v(int n8, int n9) {
        int n10 = this.a.length / 3 - 1;
        while (n9 <= n10) {
            int n11 = n10 + n9 >>> 1;
            int n12 = n11 * 3;
            int n13 = this.a[n12];
            if (n8 == n13) {
                return n12;
            }
            if (n8 < n13) {
                n10 = n11 - 1;
                continue;
            }
            n9 = n11 + 1;
        }
        return -1;
    }

    private static int w(int n8) {
        return n8 >>> 20 & 0xFF;
    }

    private final int x(int n8) {
        return this.a[n8 + 1];
    }

    private static long y(Object object, long l8) {
        return (Long)X1.f(object, l8);
    }

    private final L0 z(int n8) {
        return (L0)this.b[(n8 /= 3) + n8 + 1];
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int b(Object var1_1) {
        var5_2 = this.a.length;
        var3_4 = 0;
        for (var4_3 = 0; var4_3 < var5_2; var4_3 += 3) {
            var2_5 = this.x(var4_3);
            var6_6 = this.a[var4_3];
            var7_7 = n1.w(var2_5);
            var8_8 = 1048575 & var2_5;
            var2_5 = 37;
            block0 : switch (var7_7) {
                default: {
                    var2_5 = var3_4;
                    break;
                }
                case 68: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var10_9 = X1.f(var1_1, var8_8);
                    var2_5 = var3_4 * 53;
                    var3_4 = var10_9.hashCode();
lbl19:
                    // 24 sources

                    while (true) {
                        var2_5 += var3_4;
                        break block0;
                        break;
                    }
                }
                case 67: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var8_8 = n1.y(var1_1, var8_8);
                    var10_9 = O0.d;
lbl28:
                    // 12 sources

                    while (true) {
                        var2_5 += (int)(var8_8 ^ var8_8 >>> 32);
                        break block0;
                        break;
                    }
                }
                case 66: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = n1.t(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 65: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var8_8 = n1.y(var1_1, var8_8);
                    var10_9 = O0.d;
                    ** GOTO lbl28
                }
                case 64: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = n1.t(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 63: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = n1.t(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 62: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = n1.t(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 61: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = X1.f(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
                case 60: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var10_9 = X1.f(var1_1, var8_8);
                    var2_5 = var3_4 * 53;
                    var3_4 = var10_9.hashCode();
                    ** GOTO lbl19
                }
                case 59: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = ((String)X1.f(var1_1, var8_8)).hashCode();
                    ** GOTO lbl19
                }
                case 58: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = O0.a((Boolean)X1.f(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 57: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = n1.t(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 56: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var8_8 = n1.y(var1_1, var8_8);
                    var10_9 = O0.d;
                    ** GOTO lbl28
                }
                case 55: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = n1.t(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 54: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var8_8 = n1.y(var1_1, var8_8);
                    var10_9 = O0.d;
                    ** GOTO lbl28
                }
                case 53: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var8_8 = n1.y(var1_1, var8_8);
                    var10_9 = O0.d;
                    ** GOTO lbl28
                }
                case 52: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = Float.floatToIntBits(((Float)X1.f(var1_1, var8_8)).floatValue());
                    ** GOTO lbl19
                }
                case 51: {
                    var2_5 = var3_4;
                    if (!this.p(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var8_8 = Double.doubleToLongBits((Double)X1.f(var1_1, var8_8));
                    var10_9 = O0.d;
                    ** GOTO lbl28
                }
                case 50: {
                    var2_5 = var3_4 * 53;
                    var3_4 = X1.f(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
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
                case 49: {
                    var2_5 = var3_4 * 53;
                    var3_4 = X1.f(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
                case 17: {
                    var10_9 = X1.f(var1_1, var8_8);
                    if (var10_9 != null) {
                        var2_5 = var10_9.hashCode();
                    }
lbl145:
                    // 5 sources

                    while (true) {
                        var2_5 = var3_4 * 53 + var2_5;
                        break block0;
                        break;
                    }
                }
                case 16: {
                    var2_5 = var3_4 * 53;
                    var8_8 = X1.d(var1_1, var8_8);
                    var10_9 = O0.d;
                    ** GOTO lbl28
                }
                case 15: {
                    var2_5 = var3_4 * 53;
                    var3_4 = X1.c(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 14: {
                    var2_5 = var3_4 * 53;
                    var8_8 = X1.d(var1_1, var8_8);
                    var10_9 = O0.d;
                    ** GOTO lbl28
                }
                case 13: {
                    var2_5 = var3_4 * 53;
                    var3_4 = X1.c(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 12: {
                    var2_5 = var3_4 * 53;
                    var3_4 = X1.c(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 11: {
                    var2_5 = var3_4 * 53;
                    var3_4 = X1.c(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 10: {
                    var2_5 = var3_4 * 53;
                    var3_4 = X1.f(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
                case 9: {
                    var10_9 = X1.f(var1_1, var8_8);
                    if (var10_9 == null) ** GOTO lbl145
                    var2_5 = var10_9.hashCode();
                    ** continue;
                }
                case 8: {
                    var2_5 = var3_4 * 53;
                    var3_4 = ((String)X1.f(var1_1, var8_8)).hashCode();
                    ** GOTO lbl19
                }
                case 7: {
                    var2_5 = var3_4 * 53;
                    var3_4 = O0.a(X1.t(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 6: {
                    var2_5 = var3_4 * 53;
                    var3_4 = X1.c(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 5: {
                    var2_5 = var3_4 * 53;
                    var8_8 = X1.d(var1_1, var8_8);
                    var10_9 = O0.d;
                    ** GOTO lbl28
                }
                case 4: {
                    var2_5 = var3_4 * 53;
                    var3_4 = X1.c(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 3: {
                    var2_5 = var3_4 * 53;
                    var8_8 = X1.d(var1_1, var8_8);
                    var10_9 = O0.d;
                    ** GOTO lbl28
                }
                case 2: {
                    var2_5 = var3_4 * 53;
                    var8_8 = X1.d(var1_1, var8_8);
                    var10_9 = O0.d;
                    ** GOTO lbl28
                }
                case 1: {
                    var2_5 = var3_4 * 53;
                    var3_4 = Float.floatToIntBits(X1.b(var1_1, var8_8));
                    ** continue;
                }
                case 0: {
                    var2_5 = var3_4 * 53;
                    var8_8 = Double.doubleToLongBits(X1.a(var1_1, var8_8));
                    var10_9 = O0.d;
                    ** continue;
                }
            }
            var3_4 = var2_5;
        }
        return var3_4 * 53 + this.j.b(var1_1).hashCode();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void c(Object var1_1) {
        if (!n1.o(var1_1)) {
            return;
        }
        var8_2 = var1_1 instanceof J0;
        var2_3 = 0;
        if (var8_2) {
            var9_4 = (J0)var1_1;
            var9_4.m(0x7FFFFFFF);
            var9_4.zza = 0;
            var9_4.k();
        }
        var3_5 = this.a.length;
        while (var2_3 < var3_5) {
            var4_6 = this.x(var2_3);
            var5_7 = n1.w(var4_6);
            var6_8 = 1048575 & var4_6;
            if (var5_7 == 9) ** GOTO lbl-1000
            if (var5_7 == 60 || var5_7 == 68) ** GOTO lbl30
            switch (var5_7) {
                default: {
                    break;
                }
                case 50: {
                    var9_4 = n1.o;
                    var10_9 = var9_4.getObject(var1_1, var6_8);
                    if (var10_9 == null) break;
                    ((d1)var10_9).d();
                    var9_4.putObject(var1_1, var6_8, var10_9);
                    break;
                }
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
                case 49: {
                    this.i.a(var1_1, var6_8);
                    break;
                }
lbl30:
                // 1 sources

                if (!this.p(var1_1, this.a[var2_3], var2_3)) break;
                this.A(var2_3).c(n1.o.getObject(var1_1, var6_8));
                break;
                case 17: lbl-1000:
                // 2 sources

                {
                    if (!this.l(var1_1, var2_3)) break;
                    this.A(var2_3).c(n1.o.getObject(var1_1, var6_8));
                }
            }
            var2_3 += 3;
        }
        this.j.e(var1_1);
    }

    @Override
    public final void d(Object object, byte[] byArray, int n8, int n9, g0 g02) throws IOException {
        this.q(object, byArray, n8, n9, 0, g02);
    }

    @Override
    public final Object e() {
        return ((J0)this.e).c();
    }

    @Override
    public final void f(Object object, Object object2) {
        n1.F(object);
        object2.getClass();
        block26: for (int i8 = 0; i8 < this.a.length; i8 += 3) {
            int n8 = this.x(i8);
            int n9 = this.a[i8];
            int n10 = n1.w(n8);
            long l8 = 0xFFFFF & n8;
            switch (n10) {
                default: {
                    continue block26;
                }
                case 68: {
                    this.H(object, object2, i8);
                    continue block26;
                }
                case 61: 
                case 62: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 67: {
                    if (!this.p(object2, n9, i8)) continue block26;
                    X1.p(object, l8, X1.f(object2, l8));
                    this.a(object, n9, i8);
                    continue block26;
                }
                case 60: {
                    this.H(object, object2, i8);
                    continue block26;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    if (!this.p(object2, n9, i8)) continue block26;
                    X1.p(object, l8, X1.f(object2, l8));
                    this.a(object, n9, i8);
                    continue block26;
                }
                case 50: {
                    n9 = x1.d;
                    X1.p(object, l8, e1.a(X1.f(object, l8), X1.f(object2, l8)));
                    continue block26;
                }
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
                case 49: {
                    this.i.b(object, object2, l8);
                    continue block26;
                }
                case 17: {
                    this.G(object, object2, i8);
                    continue block26;
                }
                case 16: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.o(object, l8, X1.d(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 15: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.n(object, l8, X1.c(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 14: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.o(object, l8, X1.d(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 13: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.n(object, l8, X1.c(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 12: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.n(object, l8, X1.c(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 11: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.n(object, l8, X1.c(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 10: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.p(object, l8, X1.f(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 9: {
                    this.G(object, object2, i8);
                    continue block26;
                }
                case 8: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.p(object, l8, X1.f(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 7: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.k(object, l8, X1.t(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 6: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.n(object, l8, X1.c(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 5: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.o(object, l8, X1.d(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 4: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.n(object, l8, X1.c(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 3: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.o(object, l8, X1.d(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 2: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.o(object, l8, X1.d(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 1: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.m(object, l8, X1.b(object2, l8));
                    this.I(object, i8);
                    continue block26;
                }
                case 0: {
                    if (!this.l(object2, i8)) continue block26;
                    X1.l(object, l8, X1.a(object2, l8));
                    this.I(object, i8);
                }
            }
        }
        x1.d(this.j, object, object2);
    }

    @Override
    public final boolean g(Object object) {
        int n8 = 1048575;
        int n9 = 0;
        for (int i8 = 0; i8 < this.g; ++i8) {
            int n10 = this.f[i8];
            int n11 = this.a[n10];
            int n12 = this.x(n10);
            int n13 = this.a[n10 + 2];
            int n14 = n13 & 0xFFFFF;
            n13 = 1 << (n13 >>> 20);
            if (n14 != n8) {
                if (n14 != 1048575) {
                    long l8 = n14;
                    n9 = o.getInt(object, l8);
                }
                n8 = n14;
            }
            if ((0x10000000 & n12) != 0 && !this.m(object, n10, n8, n9, n13)) {
                return false;
            }
            n14 = n1.w(n12);
            if (n14 != 9 && n14 != 17) {
                List list;
                if (n14 != 27) {
                    if (n14 != 60 && n14 != 68) {
                        if (n14 != 49) {
                            if (n14 != 50 || ((d1)X1.f(object, n12 & 0xFFFFF)).isEmpty()) continue;
                            object = (c1)this.B(n10);
                            throw null;
                        }
                    } else {
                        if (!this.p(object, n11, n10) || n1.n(object, n12, this.A(n10))) continue;
                        return false;
                    }
                }
                if ((list = (List)X1.f(object, n12 & 0xFFFFF)).isEmpty()) continue;
                v1 v12 = this.A(n10);
                for (n14 = 0; n14 < list.size(); ++n14) {
                    if (v12.g(list.get(n14))) continue;
                    return false;
                }
                continue;
            }
            if (!this.m(object, n10, n8, n9, n13) || n1.n(object, n12, this.A(n10))) continue;
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean h(Object var1_1, Object var2_2) {
        var4_3 = this.a.length;
        block23: for (var3_4 = 0; var3_4 < var4_3; var3_4 += 3) {
            block42: {
                var5_5 = this.x(var3_4);
                var6_6 = n1.w(var5_5);
                var10_9 = var5_5 & 1048575;
                switch (var6_6) {
                    default: {
                        continue block23;
                    }
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
                    case 68: {
                        var8_8 = this.u(var3_4) & 1048575;
                        if (X1.c(var1_1, var8_8) == X1.c(var2_2, var8_8) && x1.f(X1.f(var1_1, var10_9), X1.f(var2_2, var10_9))) continue block23;
                        break block42;
                    }
                    case 50: {
                        var7_7 = x1.f(X1.f(var1_1, var10_9), X1.f(var2_2, var10_9));
                        ** GOTO lbl18
                    }
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
                    case 49: {
                        var7_7 = x1.f(X1.f(var1_1, var10_9), X1.f(var2_2, var10_9));
lbl18:
                        // 2 sources

                        if (var7_7) continue block23;
                        break block42;
                    }
                    case 17: {
                        if (this.k(var1_1, var2_2, var3_4) && x1.f(X1.f(var1_1, var10_9), X1.f(var2_2, var10_9))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 16: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.d(var1_1, var10_9) == X1.d(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 15: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.c(var1_1, var10_9) == X1.c(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 14: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.d(var1_1, var10_9) == X1.d(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 13: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.c(var1_1, var10_9) == X1.c(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 12: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.c(var1_1, var10_9) == X1.c(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 11: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.c(var1_1, var10_9) == X1.c(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 10: {
                        if (this.k(var1_1, var2_2, var3_4) && x1.f(X1.f(var1_1, var10_9), X1.f(var2_2, var10_9))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 9: {
                        if (this.k(var1_1, var2_2, var3_4) && x1.f(X1.f(var1_1, var10_9), X1.f(var2_2, var10_9))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 8: {
                        if (this.k(var1_1, var2_2, var3_4) && x1.f(X1.f(var1_1, var10_9), X1.f(var2_2, var10_9))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 7: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.t(var1_1, var10_9) == X1.t(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 6: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.c(var1_1, var10_9) == X1.c(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 5: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.d(var1_1, var10_9) == X1.d(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 4: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.c(var1_1, var10_9) == X1.c(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 3: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.d(var1_1, var10_9) == X1.d(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 2: {
                        if (this.k(var1_1, var2_2, var3_4) && X1.d(var1_1, var10_9) == X1.d(var2_2, var10_9)) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 1: {
                        if (this.k(var1_1, var2_2, var3_4) && Float.floatToIntBits(X1.b(var1_1, var10_9)) == Float.floatToIntBits(X1.b(var2_2, var10_9))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 0: 
                }
                if (this.k(var1_1, var2_2, var3_4) && Double.doubleToLongBits(X1.a(var1_1, var10_9)) == Double.doubleToLongBits(X1.a(var2_2, var10_9))) {
                    continue;
                }
            }
            return false;
        }
        return this.j.b(var1_1).equals(this.j.b(var2_2)) != false;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final int q(Object var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, g0 var6_6) throws IOException {
        block153: {
            block156: {
                block162: {
                    block160: {
                        block161: {
                            block155: {
                                block159: {
                                    block154: {
                                        var26_7 = this;
                                        var25_8 = var1_1;
                                        var24_9 /* !! */  = var2_2 /* !! */ ;
                                        var11_10 = var4_4;
                                        var27_11 = var6_6;
                                        n1.F(var25_8);
                                        var24_9 /* !! */  = (byte[])n1.o;
                                        var13_12 = -1;
                                        var14_13 = 0;
                                        var12_14 = 0;
                                        var10_15 = 1048575;
                                        var9_16 = 0;
                                        var8_17 = var3_3;
                                        var3_3 = var11_10;
                                        block46: while (true) {
                                            block158: {
                                                block157: {
                                                    var28_26 = var2_2 /* !! */ ;
                                                    if (var8_17 >= var3_3) ** GOTO lbl1113
                                                    var11_10 = var8_17 + 1;
                                                    var3_3 = var8_17 = var28_26[var8_17];
                                                    var9_16 = var11_10;
                                                    if (var8_17 < 0) {
                                                        var9_16 = h0.i(var8_17, (byte[])var28_26, var11_10, (g0)var27_11);
                                                        var3_3 = var27_11.a;
                                                    }
                                                    if ((var11_10 = var3_3 >>> 3) <= var13_12) break block157;
                                                    var8_17 = var14_13 / 3;
                                                    if (var11_10 < var26_7.c || var11_10 > var26_7.d) ** GOTO lbl-1000
                                                    var8_17 = var26_7.v(var11_10, var8_17);
                                                    break block158;
                                                }
                                                if (var11_10 >= var26_7.c && var11_10 <= var26_7.d) {
                                                    var8_17 = var26_7.v(var11_10, 0);
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var8_17 = -1;
                                                }
                                            }
                                            if (var8_17 == -1) {
                                                var28_26 = var24_9 /* !! */ ;
                                                var24_9 /* !! */  = (byte[])var25_8;
                                                var8_17 = 0;
                                                var13_12 = var11_10;
                                                var25_8 = var28_26;
                                                break block153;
                                            }
                                            var17_21 = var3_3 & 7;
                                            var30_28 = var26_7.a;
                                            var18_22 = var30_28[var8_17 + 1];
                                            var16_20 = n1.w(var18_22);
                                            var20_24 = var18_22 & 1048575;
                                            if (var16_20 > 17) break block154;
                                            var13_12 = var30_28[var8_17 + 2];
                                            var15_19 = 1 << (var13_12 >>> 20);
                                            if ((var13_12 &= 1048575) != var10_15) {
                                                if (var10_15 != 1048575) {
                                                    var24_9 /* !! */ .putInt(var25_8, var10_15, var12_14);
                                                }
                                                var10_15 = var13_12 == 1048575 ? 0 : var24_9 /* !! */ .getInt(var25_8, var13_12);
                                                var12_14 = var10_15;
                                                var10_15 = var13_12;
                                            }
                                            switch (var16_20) {
                                                default: {
                                                    if (var17_21 == 3) {
                                                        var27_11 = super.C(var25_8, var8_17);
                                                        var9_16 = h0.l(var27_11, super.A(var8_17), var2_2 /* !! */ , var9_16, var4_4, var11_10 << 3 | 4, (g0)var6_6);
                                                        super.i(var25_8, var8_17, var27_11);
                                                        var12_14 |= var15_19;
lbl63:
                                                        // 5 sources

                                                        while (true) {
                                                            var15_19 = var3_3;
                                                            var14_13 = var8_17;
                                                            var27_11 = var6_6;
                                                            var28_26 = var2_2 /* !! */ ;
                                                            var3_3 = var4_4;
                                                            var8_17 = var9_16;
                                                            var13_12 = var11_10;
                                                            var9_16 = var15_19;
                                                            continue block46;
                                                            break;
                                                        }
                                                    }
                                                    var13_12 = var8_17;
                                                    var13_12 = var3_3;
lbl75:
                                                    // 3 sources

                                                    while (true) {
                                                        var13_12 = var3_3;
                                                        var13_12 = var8_17;
                                                        var27_11 = var6_6;
                                                        var27_11 = var2_2 /* !! */ ;
                                                        var13_12 = var9_16;
                                                        var27_11 = var25_8;
                                                        var28_26 = var24_9 /* !! */ ;
                                                        break block46;
                                                        break;
                                                    }
                                                }
                                                case 16: {
                                                    if (var17_21 == 0) {
                                                        var14_13 = h0.k(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                                        var24_9 /* !! */ .putLong(var25_8, var20_24, x0.b(var6_6.b));
                                                        var13_12 = var4_4;
                                                        var27_11 = var6_6;
                                                        var9_16 = var3_3;
                                                        var15_19 = var12_14 | var15_19;
                                                        var28_26 = var2_2 /* !! */ ;
                                                        var12_14 = var14_13;
                                                        var14_13 = var8_17;
                                                        var3_3 = var13_12;
                                                        var8_17 = var12_14;
                                                        var13_12 = var11_10;
                                                        var12_14 = var15_19;
                                                        continue block46;
                                                    }
                                                    while (true) {
                                                        var13_12 = var3_3;
                                                        var13_12 = var8_17;
lbl103:
                                                        // 2 sources

                                                        while (true) {
                                                            var13_12 = var3_3;
                                                            var13_12 = var8_17;
                                                            ** GOTO lbl75
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                case 15: {
                                                    if (var17_21 != 0) ** continue;
                                                    var9_16 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                                    var24_9 /* !! */ .putInt(var25_8, var20_24, x0.a(var6_6.a));
                                                    var12_14 |= var15_19;
                                                    ** GOTO lbl63
                                                }
                                                case 12: {
                                                    if (var17_21 != 0) ** GOTO lbl130
                                                    var13_12 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                                    var9_16 = var6_6.a;
                                                    var27_11 = super.z(var8_17);
                                                    if ((var18_22 & -2147483648) == 0 || var27_11 == null || var27_11.a()) ** GOTO lbl122
                                                    n1.r(var25_8).h(var3_3, var9_16);
                                                    var9_16 = var13_12;
                                                    ** GOTO lbl63
lbl122:
                                                    // 1 sources

                                                    var24_9 /* !! */ .putInt(var25_8, var20_24, var9_16);
                                                    var9_16 = var12_14 | var15_19;
                                                    var12_14 = var13_12;
lbl125:
                                                    // 2 sources

                                                    while (true) {
                                                        var13_12 = var9_16;
                                                        var9_16 = var12_14;
                                                        var12_14 = var13_12;
                                                        ** GOTO lbl63
                                                        break;
                                                    }
lbl130:
                                                    // 2 sources

                                                    while (true) {
                                                        var13_12 = var8_17;
                                                        var13_12 = var3_3;
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                case 10: {
                                                    if (var17_21 != 2) ** continue;
                                                    var9_16 = h0.a(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                                    var24_9 /* !! */ .putObject(var25_8, var20_24, var6_6.c);
                                                    var13_12 = var12_14 | var15_19;
                                                    var12_14 = var9_16;
                                                    var9_16 = var13_12;
                                                    ** continue;
                                                }
                                                case 9: {
                                                    if (var17_21 == 2) {
                                                        var27_11 = super.C(var25_8, var8_17);
                                                        var9_16 = h0.m(var27_11, super.A(var8_17), var2_2 /* !! */ , var9_16, var4_4, (g0)var6_6);
                                                        super.i(var25_8, var8_17, var27_11);
                                                        var12_14 |= var15_19;
                                                        ** continue;
                                                    }
                                                    var13_12 = var8_17;
                                                    var13_12 = var3_3;
                                                    ** continue;
                                                }
                                                case 8: {
                                                    if (var17_21 == 2) {
                                                        if ((var18_22 & 0x20000000) != 0) {
                                                            var9_16 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                                            var13_12 = var6_6.a;
                                                            if (var13_12 < 0) throw P0.c();
                                                            if (var13_12 == 0) {
                                                                var6_6.c = "";
                                                                var13_12 = var15_19;
                                                            } else {
                                                                var14_13 = b2.b;
                                                                var14_13 = var2_2 /* !! */ .length;
                                                                if ((var14_13 - var9_16 - var13_12 | (var9_16 | var13_12)) < 0) throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{var14_13, var9_16, var13_12}));
                                                                var18_22 = var9_16 + var13_12;
                                                                var28_26 = new char[var13_12];
                                                                var16_20 = 0;
                                                                var17_21 = var9_16;
                                                                while (true) {
                                                                    var14_13 = var17_21;
                                                                    var27_11 = var28_26;
                                                                    var13_12 = var16_20;
                                                                    var9_16 = var15_19;
                                                                    if (var17_21 >= var18_22) break;
                                                                    var7_18 = var2_2 /* !! */ [var17_21];
                                                                    var14_13 = var17_21++;
                                                                    var27_11 = var28_26;
                                                                    var13_12 = var16_20;
                                                                    var9_16 = var15_19;
                                                                    if (!Y1.d(var7_18)) break;
                                                                    var28_26[var16_20] = (char)var7_18;
                                                                    ++var16_20;
                                                                }
                                                                block54: while (var14_13 < var18_22) {
                                                                    var15_19 = var14_13 + 1;
                                                                    var7_18 = var2_2 /* !! */ [var14_13];
                                                                    if (Y1.d(var7_18)) {
                                                                        var14_13 = var13_12 + 1;
                                                                        var27_11[var13_12] = (char)var7_18;
                                                                        var13_12 = var14_13;
                                                                        while (true) {
                                                                            var16_20 = var13_12;
                                                                            var14_13 = var15_19;
                                                                            var13_12 = var16_20;
                                                                            if (var15_19 >= var18_22) continue block54;
                                                                            var7_18 = var2_2 /* !! */ [var15_19];
                                                                            var14_13 = var15_19++;
                                                                            var13_12 = var16_20;
                                                                            if (!Y1.d(var7_18)) continue block54;
                                                                            var13_12 = var16_20 + 1;
                                                                            var27_11[var16_20] = (char)var7_18;
                                                                        }
                                                                    }
                                                                    if (var7_18 < -32) {
                                                                        if (var15_19 >= var18_22) throw P0.b();
                                                                        Y1.c(var7_18, var2_2 /* !! */ [var15_19], (char[])var27_11, var13_12);
                                                                        var14_13 += 2;
                                                                        ++var13_12;
                                                                        continue;
                                                                    }
                                                                    if (var7_18 < -16) {
                                                                        if (var15_19 >= var18_22 - 1) throw P0.b();
                                                                        Y1.b(var7_18, var2_2 /* !! */ [var15_19], var2_2 /* !! */ [var14_13 + 2], (char[])var27_11, var13_12);
                                                                        var14_13 += 3;
                                                                        ++var13_12;
                                                                        continue;
                                                                    }
                                                                    if (var15_19 >= var18_22 - 2) throw P0.b();
                                                                    Y1.a(var7_18, var2_2 /* !! */ [var15_19], var2_2 /* !! */ [var14_13 + 2], var2_2 /* !! */ [var14_13 + 3], (char[])var27_11, var13_12);
                                                                    var13_12 += 2;
                                                                    var14_13 += 4;
                                                                }
                                                                var14_13 = var9_16;
                                                                var6_6.c = new String((char[])var27_11, 0, var13_12);
                                                                var9_16 = var18_22;
                                                                var13_12 = var14_13;
                                                            }
                                                        } else {
                                                            var13_12 = var15_19;
                                                            var9_16 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                                            var14_13 = var6_6.a;
                                                            if (var14_13 < 0) throw P0.c();
                                                            if (var14_13 == 0) {
                                                                var6_6.c = "";
                                                            } else {
                                                                var6_6.c = new String(var2_2 /* !! */ , var9_16, var14_13, O0.b);
                                                                var9_16 += var14_13;
                                                            }
                                                        }
                                                        var24_9 /* !! */ .putObject(var25_8, var20_24, var6_6.c);
                                                        var12_14 |= var13_12;
                                                        var27_11 = var25_8;
                                                        var27_11 = var6_6;
                                                        var13_12 = var8_17;
                                                        var13_12 = var10_15;
                                                        var13_12 = var3_3;
lbl241:
                                                        // 2 sources

                                                        while (true) {
                                                            var15_19 = var3_3;
                                                            var14_13 = var8_17;
                                                            var27_11 = var6_6;
                                                            var3_3 = var4_4;
                                                            var28_26 = var2_2 /* !! */ ;
                                                            var8_17 = var9_16;
                                                            var13_12 = var11_10;
                                                            var9_16 = var15_19;
                                                            continue block46;
                                                            break;
                                                        }
                                                    }
lbl251:
                                                    // 4 sources

                                                    while (true) {
                                                        var13_12 = var3_3;
                                                        var13_12 = var8_17;
                                                        var27_11 = var2_2 /* !! */ ;
                                                        var13_12 = var9_16;
                                                        var27_11 = var6_6;
                                                        var27_11 = var25_8;
                                                        var28_26 = var24_9 /* !! */ ;
                                                        break block46;
                                                        break;
                                                    }
                                                }
                                                case 7: {
                                                    if (var17_21 != 0) ** GOTO lbl251
                                                    var9_16 = h0.k(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                                    var19_23 = var6_6.b != 0L;
                                                    X1.k(var25_8, var20_24, var19_23);
lbl265:
                                                    // 2 sources

                                                    while (true) {
                                                        var12_14 |= var15_19;
                                                        var27_11 = var25_8;
                                                        var27_11 = var6_6;
                                                        var13_12 = var8_17;
                                                        var13_12 = var10_15;
                                                        var13_12 = var3_3;
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                case 6: 
                                                case 13: {
                                                    if (var17_21 == 5) ** break;
                                                    ** continue;
                                                    var24_9 /* !! */ .putInt(var25_8, var20_24, h0.b(var2_2 /* !! */ , var9_16));
                                                    var9_16 += 4;
                                                    ** continue;
                                                }
                                                case 5: 
                                                case 14: {
                                                    if (var17_21 == 1) {
                                                        var22_25 = h0.n(var2_2 /* !! */ , var9_16);
                                                        var27_11 = var25_8;
                                                        var28_26 = var24_9 /* !! */ ;
                                                        var28_26.putLong(var27_11, var20_24, var22_25);
                                                        var9_16 += 8;
                                                        var12_14 |= var15_19;
lbl287:
                                                        // 2 sources

                                                        while (true) {
                                                            var27_11 = var25_8;
                                                            var27_11 = var24_9 /* !! */ ;
                                                            var27_11 = var2_2 /* !! */ ;
                                                            var27_11 = var6_6;
                                                            var15_19 = var9_16;
lbl293:
                                                            // 2 sources

                                                            while (true) {
                                                                var27_11 = var6_6;
                                                                var28_26 = var2_2 /* !! */ ;
                                                                var16_20 = var4_4;
                                                                var9_16 = var3_3;
                                                                var14_13 = var8_17;
                                                                var13_12 = var11_10;
                                                                var8_17 = var15_19;
                                                                var3_3 = var16_20;
                                                                var28_26 = var26_7;
lbl303:
                                                                // 3 sources

                                                                while (true) {
                                                                    var26_7 = var2_2 /* !! */ ;
                                                                    var26_7 = var28_26;
                                                                    continue block46;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    var27_11 = var25_8;
                                                    var28_26 = var24_9 /* !! */ ;
lbl309:
                                                    // 3 sources

                                                    while (true) {
                                                        var13_12 = var3_3;
                                                        var13_12 = var8_17;
                                                        var13_12 = var9_16;
                                                        var24_9 /* !! */  = var6_6;
                                                        var24_9 /* !! */  = var2_2 /* !! */ ;
                                                        break block46;
                                                        break;
                                                    }
                                                }
                                                case 4: 
                                                case 11: {
                                                    var28_26 = var24_9 /* !! */ ;
                                                    var27_11 = var25_8;
                                                    if (var17_21 != 0) ** GOTO lbl309
                                                    var13_12 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                                    var24_9 /* !! */ .putInt(var25_8, var20_24, var6_6.a);
                                                    var15_19 = var12_14 | var15_19;
                                                    var12_14 = var4_4;
                                                    var27_11 = var2_2 /* !! */ ;
                                                    var27_11 = var6_6;
                                                    var14_13 = var8_17;
                                                    var9_16 = var3_3;
                                                    var8_17 = var13_12;
                                                    var3_3 = var12_14;
                                                    var13_12 = var11_10;
                                                    var12_14 = var15_19;
                                                    continue block46;
                                                }
                                                case 2: 
                                                case 3: {
                                                    var28_26 = var24_9 /* !! */ ;
                                                    var27_11 = var25_8;
                                                    if (var17_21 != 0) ** continue;
                                                    var9_16 = h0.k(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                                    var24_9 /* !! */ .putLong(var25_8, var20_24, var6_6.b);
                                                    var12_14 |= var15_19;
                                                    var27_11 = var25_8;
                                                    var27_11 = var24_9 /* !! */ ;
                                                    var27_11 = var2_2 /* !! */ ;
                                                    var27_11 = var6_6;
                                                    var15_19 = var9_16;
                                                    ** continue;
                                                }
                                                case 1: {
                                                    var28_26 = var24_9 /* !! */ ;
                                                    var29_27 = var25_8;
                                                    var30_28 = var2_2 /* !! */ ;
                                                    var13_12 = var3_3;
                                                    var14_13 = var9_16;
                                                    var13_12 = var8_17;
                                                    var27_11 = var6_6;
                                                    var27_11 = var29_27;
                                                    if (var17_21 != 5) break block46;
                                                    X1.m(var29_27, var20_24, Float.intBitsToFloat(h0.b((byte[])var30_28, var14_13)));
                                                    var9_16 = var14_13 + 4;
lbl358:
                                                    // 2 sources

                                                    while (true) {
                                                        var12_14 |= var15_19;
                                                        var27_11 = var25_8;
                                                        var27_11 = var24_9 /* !! */ ;
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                case 0: {
                                                    var28_26 = var24_9 /* !! */ ;
                                                    var29_27 = var25_8;
                                                    var30_28 = var2_2 /* !! */ ;
                                                    var13_12 = var3_3;
                                                    var14_13 = var9_16;
                                                    var13_12 = var8_17;
                                                    var27_11 = var6_6;
                                                    var27_11 = var29_27;
                                                    if (var17_21 != 1) break block46;
                                                    X1.l(var29_27, var20_24, Double.longBitsToDouble(h0.n((byte[])var30_28, var14_13)));
                                                    var9_16 = var14_13 + 8;
                                                    ** continue;
                                                }
                                            }
                                            break;
                                        }
                                        var24_9 /* !! */  = (byte[])var6_6;
                                        var25_8 = var2_2 /* !! */ ;
                                        var13_12 = var11_10;
                                        var25_8 = var28_26;
                                        var28_26 = var24_9 /* !! */ ;
                                        var24_9 /* !! */  = (byte[])var27_11;
                                        var27_11 = var28_26;
                                        break block153;
                                    }
                                    var14_13 = var11_10;
                                    var13_12 = var12_14;
                                    if (var16_20 != 27) break block159;
                                    if (var17_21 != 2) break block160;
                                    var29_27 = (M0)var24_9 /* !! */ .getObject(var25_8, var20_24);
                                    var28_26 = var29_27;
                                    if (!var29_27.c()) {
                                        var11_10 = var29_27.size();
                                        var11_10 = var11_10 == 0 ? 10 : (var11_10 += var11_10);
                                        var28_26 = var29_27.v(var11_10);
                                        var24_9 /* !! */ .putObject(var25_8, var20_24, var28_26);
                                    }
                                    var29_27 = super.A(var8_17);
                                    var25_8 = var2_2 /* !! */ ;
                                    var11_10 = h0.e((v1)var29_27, var3_3, (byte[])var25_8, var9_16, var4_4, (M0)var28_26, (g0)var27_11);
                                    var12_14 = var4_4;
                                    var27_11 = var6_6;
                                    var9_16 = var3_3;
                                    var25_8 = var1_1;
                                    var15_19 = var8_17;
                                    var16_20 = var13_12;
                                    var28_26 = var26_7;
                                    var3_3 = var12_14;
                                    var8_17 = var11_10;
                                    var13_12 = var14_13;
                                    var14_13 = var15_19;
                                    var12_14 = var16_20;
                                    ** GOTO lbl303
                                }
                                var29_27 = var25_8;
                                var27_11 = var24_9 /* !! */ ;
                                if (var16_20 > 49) break block161;
                                var22_25 = var18_22;
                                var30_28 = n1.o;
                                var28_26 = (M0)var30_28.getObject(var29_27, var20_24);
                                if (!var28_26.c()) {
                                    var12_14 = var28_26.size();
                                    var12_14 = var12_14 == 0 ? 10 : (var12_14 += var12_14);
                                    var28_26 = var28_26.v(var12_14);
                                    var30_28.putObject(var29_27, var20_24, var28_26);
                                }
                                block15 : switch (var16_20) {
                                    default: {
                                        if (var17_21 == 3) {
                                            var24_9 /* !! */  = (byte[])super.A(var8_17);
                                            var14_13 = var3_3 & -8 | 4;
                                            var12_14 = h0.c((v1)var24_9 /* !! */ , var2_2 /* !! */ , var9_16, var4_4, var14_13, (g0)var6_6);
                                            var28_26.add(var6_6.c);
                                            while (var12_14 < var4_4) {
                                                var15_19 = h0.h(var2_2 /* !! */ , var12_14, (g0)var6_6);
                                                if (var3_3 != var6_6.a) break;
                                                var12_14 = h0.c((v1)var24_9 /* !! */ , var2_2 /* !! */ , var15_19, var4_4, var14_13, (g0)var6_6);
                                                var28_26.add(var6_6.c);
                                            }
                                            var14_13 = var4_4;
                                            var24_9 /* !! */  = (byte[])var6_6;
lbl441:
                                            // 2 sources

                                            while (true) {
                                                var24_9 /* !! */  = (byte[])var6_6;
                                                var14_13 = var4_4;
                                                var24_9 /* !! */  = (byte[])var27_11;
                                                var14_13 = var3_3;
                                                var14_13 = var9_16;
                                                break block155;
                                                break;
                                            }
                                        }
                                        var12_14 = var4_4;
                                        var27_11 = var6_6;
                                        var12_14 = var9_16;
                                        var12_14 = var3_3;
                                        var27_11 = var26_7;
                                        break;
                                    }
                                    case 34: 
                                    case 48: {
                                        if (var17_21 == 2) {
                                            var24_9 /* !! */  = (byte[])((Y0)var28_26);
                                            var12_14 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                            var14_13 = var6_6.a + var12_14;
                                            while (var12_14 < var14_13) {
                                                var12_14 = h0.k(var2_2 /* !! */ , var12_14, (g0)var6_6);
                                                var24_9 /* !! */ .g(x0.b(var6_6.b));
                                            }
                                            if (var12_14 != var14_13) throw P0.f();
lbl464:
                                            // 6 sources

                                            while (true) {
                                                var14_13 = var4_4;
                                                var24_9 /* !! */  = (byte[])var6_6;
                                                ** continue;
                                                break;
                                            }
                                        }
                                        if (var17_21 != 0) ** GOTO lbl481
                                        var24_9 /* !! */  = (byte[])((Y0)var28_26);
                                        var14_13 = h0.k(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                        var24_9 /* !! */ .g(x0.b(var6_6.b));
                                        while (true) {
                                            var12_14 = var14_13;
                                            if (var14_13 >= var4_4) ** GOTO lbl464
                                            var15_19 = h0.h(var2_2 /* !! */ , var14_13, (g0)var6_6);
                                            var12_14 = var14_13;
                                            if (var3_3 != var6_6.a) ** GOTO lbl464
                                            var14_13 = h0.k(var2_2 /* !! */ , var15_19, (g0)var6_6);
                                            var24_9 /* !! */ .g(x0.b(var6_6.b));
                                        }
lbl481:
                                        // 2 sources

                                        while (true) {
                                            var12_14 = var4_4;
                                            var27_11 = var6_6;
lbl484:
                                            // 2 sources

                                            while (true) {
                                                var27_11 = var6_6;
                                                var12_14 = var4_4;
                                                var12_14 = var3_3;
                                                var27_11 = var26_7;
lbl489:
                                                // 2 sources

                                                while (true) {
                                                    var12_14 = var3_3;
                                                    var26_7 = var6_6;
                                                    var12_14 = var4_4;
                                                    var12_14 = var9_16;
                                                    break block15;
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    case 33: 
                                    case 47: {
                                        if (var17_21 != 2) ** GOTO lbl506
                                        var24_9 /* !! */  = (byte[])((K0)var28_26);
                                        var12_14 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                        var14_13 = var6_6.a + var12_14;
                                        while (var12_14 < var14_13) {
                                            var12_14 = h0.h(var2_2 /* !! */ , var12_14, (g0)var6_6);
                                            var24_9 /* !! */ .g(x0.a(var6_6.a));
                                        }
                                        if (var12_14 == var14_13) ** GOTO lbl464
                                        throw P0.f();
lbl506:
                                        // 1 sources

                                        if (var17_21 != 0) ** continue;
                                        var24_9 /* !! */  = (byte[])((K0)var28_26);
                                        var14_13 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                        var24_9 /* !! */ .g(x0.a(var6_6.a));
                                        while (true) {
                                            var12_14 = var14_13;
                                            if (var14_13 >= var4_4) ** GOTO lbl464
                                            var15_19 = h0.h(var2_2 /* !! */ , var14_13, (g0)var6_6);
                                            var12_14 = var14_13;
                                            if (var3_3 == var6_6.a) ** break;
                                            ** continue;
                                            var14_13 = h0.h(var2_2 /* !! */ , var15_19, (g0)var6_6);
                                            var24_9 /* !! */ .g(x0.a(var6_6.a));
                                        }
                                    }
                                    case 30: 
                                    case 44: {
                                        if (var17_21 != 2) ** GOTO lbl524
                                        var12_14 = h0.f(var2_2 /* !! */ , var9_16, (M0)var28_26, (g0)var6_6);
                                        ** GOTO lbl526
lbl524:
                                        // 1 sources

                                        if (var17_21 != 0) ** GOTO lbl568
                                        var12_14 = h0.j(var3_3, var2_2 /* !! */ , var9_16, var4_4, (M0)var28_26, (g0)var6_6);
lbl526:
                                        // 2 sources

                                        var30_28 = super.z(var8_17);
                                        var31_29 = var26_7.j;
                                        var15_19 = x1.d;
                                        if (var30_28 == null) ** GOTO lbl561
                                        if (!s.a(var28_26)) ** GOTO lbl550
                                        var17_21 = var28_26.size();
                                        var24_9 /* !! */  = null;
                                        var16_20 = 0;
                                        for (var15_19 = 0; var15_19 < var17_21; ++var15_19) {
                                            var26_7 = (Integer)var28_26.get(var15_19);
                                            var18_22 = var26_7.intValue();
                                            if (var30_28.a()) {
                                                if (var15_19 != var16_20) {
                                                    var28_26.set(var16_20, var26_7);
                                                }
                                                ++var16_20;
                                                continue;
                                            }
                                            var24_9 /* !! */  = (byte[])x1.c(var29_27, var14_13, var18_22, var24_9 /* !! */ , var31_29);
                                        }
                                        var24_9 /* !! */  = (byte[])var27_11;
                                        if (var16_20 != var17_21) {
                                            var28_26.subList(var16_20, var17_21).clear();
                                            var24_9 /* !! */  = (byte[])var27_11;
                                        }
                                        ** GOTO lbl562
lbl550:
                                        // 1 sources

                                        var28_26 = var28_26.iterator();
                                        var26_7 = null;
                                        while (true) {
                                            var24_9 /* !! */  = (byte[])var27_11;
                                            if (var28_26.hasNext()) {
                                                var15_19 = (Integer)var28_26.next();
                                                if (var30_28.a()) continue;
                                                var26_7 = x1.c(var29_27, var14_13, var15_19, var26_7, var31_29);
                                                var28_26.remove();
                                                continue;
                                            }
                                            ** GOTO lbl562
                                            break;
                                        }
lbl561:
                                        // 1 sources

                                        var24_9 /* !! */  = (byte[])var27_11;
lbl562:
                                        // 3 sources

                                        var26_7 = this;
                                        var14_13 = var3_3;
                                        var14_13 = var4_4;
                                        var27_11 = var6_6;
                                        var14_13 = var9_16;
                                        break block155;
lbl568:
                                        // 1 sources

                                        var26_7 = this;
                                        var12_14 = var4_4;
                                        var27_11 = var6_6;
                                        ** continue;
                                    }
                                    case 28: {
                                        if (var17_21 != 2) ** GOTO lbl610
                                        var14_13 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                        var12_14 = var6_6.a;
                                        if (var12_14 < 0) throw P0.c();
                                        if (var12_14 > var2_2 /* !! */ .length - var14_13) throw P0.f();
                                        if (var12_14 != 0) ** GOTO lbl583
                                        var28_26.add(t0.c0);
                                        var12_14 = var14_13;
                                        ** GOTO lbl587
lbl583:
                                        // 1 sources

                                        var28_26.add(t0.r(var2_2 /* !! */ , var14_13, var12_14));
                                        block76: while (true) {
                                            var12_14 = var14_13 + var12_14;
                                            while (var12_14 < var4_4) {
                                                var14_13 = h0.h(var2_2 /* !! */ , var12_14, (g0)var6_6);
                                                if (var3_3 != var6_6.a) break block76;
                                                var12_14 = h0.h(var2_2 /* !! */ , var14_13, (g0)var6_6);
                                                var15_19 = var6_6.a;
                                                if (var15_19 < 0) throw P0.c();
                                                if (var15_19 > var2_2 /* !! */ .length - var12_14) throw P0.f();
                                                if (var15_19 == 0) {
                                                    var28_26.add(t0.c0);
                                                    continue;
                                                }
                                                var28_26.add(t0.r(var2_2 /* !! */ , var12_14, var15_19));
                                                var14_13 = var12_14;
                                                var12_14 = var15_19;
                                                continue block76;
                                            }
                                            break;
                                        }
                                        var14_13 = var3_3;
                                        var14_13 = var4_4;
                                        var24_9 /* !! */  = (byte[])var6_6;
                                        var14_13 = var9_16;
                                        var26_7 = this;
                                        var24_9 /* !! */  = (byte[])var27_11;
                                        break block155;
lbl610:
                                        // 2 sources

                                        while (true) {
                                            var27_11 = this;
                                            var12_14 = var3_3;
                                            var12_14 = var4_4;
                                            var26_7 = var6_6;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    case 27: {
                                        if (var17_21 != 2) ** continue;
                                        var26_7 = this;
                                        var27_11 = super.A(var8_17);
                                        var12_14 = var9_16;
                                        var12_14 = h0.e((v1)var27_11, var3_3, var2_2 /* !! */ , var12_14, var4_4, (M0)var28_26, (g0)var6_6);
lbl622:
                                        // 2 sources

                                        while (true) {
                                            var14_13 = var9_16;
                                            var14_13 = var3_3;
                                            var14_13 = var4_4;
                                            var27_11 = var6_6;
                                            break block155;
                                            break;
                                        }
                                    }
                                    case 26: {
                                        if (var17_21 != 2) ** GOTO lbl706
                                        if ((0x20000000L & var22_25) != 0L) ** GOTO lbl670
                                        var12_14 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                        var14_13 = var6_6.a;
                                        if (var14_13 < 0) throw P0.c();
                                        if (var14_13 != 0) ** GOTO lbl639
                                        var28_26.add("");
                                        var24_9 /* !! */  = (byte[])var26_7;
                                        ** GOTO lbl644
lbl639:
                                        // 1 sources

                                        var28_26.add(new String(var2_2 /* !! */ , var12_14, var14_13, O0.b));
                                        var24_9 /* !! */  = (byte[])var26_7;
                                        block80: while (true) {
                                            var12_14 += var14_13;
lbl644:
                                            // 2 sources

                                            while (true) {
                                                var26_7 = var24_9 /* !! */ ;
                                                var14_13 = var12_14;
                                                if (var12_14 >= var4_4) break block80;
                                                var15_19 = h0.h(var2_2 /* !! */ , var12_14, (g0)var6_6);
                                                var26_7 = var24_9 /* !! */ ;
                                                var14_13 = var12_14;
                                                if (var3_3 != var6_6.a) break block80;
                                                var12_14 = h0.h(var2_2 /* !! */ , var15_19, (g0)var6_6);
                                                var14_13 = var6_6.a;
                                                if (var14_13 < 0) throw P0.c();
                                                if (var14_13 != 0) break;
                                                var28_26.add("");
                                            }
                                            var28_26.add(new String(var2_2 /* !! */ , var12_14, var14_13, O0.b));
                                        }
lbl662:
                                        // 4 sources

                                        while (true) {
                                            var12_14 = var3_3;
                                            var12_14 = var4_4;
                                            var24_9 /* !! */  = (byte[])var6_6;
                                            var12_14 = var9_16;
                                            var12_14 = var14_13;
                                            var24_9 /* !! */  = (byte[])var27_11;
                                            break block155;
                                            break;
                                        }
lbl670:
                                        // 1 sources

                                        var14_13 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                        var15_19 = var6_6.a;
                                        if (var15_19 < 0) throw P0.c();
                                        if (var15_19 == 0) {
                                            var28_26.add("");
                                            var24_9 /* !! */  = (byte[])var26_7;
                                            var12_14 = var14_13;
                                        } else {
                                            var12_14 = var14_13 + var15_19;
                                            if (!b2.c(var2_2 /* !! */ , var14_13, var12_14)) throw P0.b();
                                            var28_26.add(new String(var2_2 /* !! */ , var14_13, var15_19, O0.b));
                                            var24_9 /* !! */  = (byte[])var26_7;
                                        }
                                        while (true) {
                                            var26_7 = var24_9 /* !! */ ;
                                            var14_13 = var12_14;
                                            if (var12_14 >= var4_4) ** GOTO lbl662
                                            var15_19 = h0.h(var2_2 /* !! */ , var12_14, (g0)var6_6);
                                            var26_7 = var24_9 /* !! */ ;
                                            var14_13 = var12_14;
                                            if (var3_3 == var6_6.a) ** break;
                                            ** continue;
                                            var14_13 = h0.h(var2_2 /* !! */ , var15_19, (g0)var6_6);
                                            var15_19 = var6_6.a;
                                            if (var15_19 < 0) throw P0.c();
                                            if (var15_19 == 0) {
                                                var28_26.add("");
                                                var12_14 = var14_13;
                                                continue;
                                            }
                                            var12_14 = var14_13 + var15_19;
                                            if (!b2.c(var2_2 /* !! */ , var14_13, var12_14)) throw P0.b();
                                            var28_26.add(new String(var2_2 /* !! */ , var14_13, var15_19, O0.b));
                                        }
lbl706:
                                        // 5 sources

                                        while (true) {
                                            var12_14 = var3_3;
                                            var12_14 = var4_4;
                                            var27_11 = var6_6;
                                            var12_14 = var9_16;
                                            var27_11 = var26_7;
                                            break block15;
                                            break;
                                        }
                                    }
                                    case 25: 
                                    case 42: {
                                        if (var17_21 == 2) {
                                            var27_11 = (i0)var28_26;
                                            var12_14 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                            var14_13 = var6_6.a + var12_14;
                                            while (var12_14 < var14_13) {
                                                var12_14 = h0.k(var2_2 /* !! */ , var12_14, (g0)var6_6);
                                                var19_23 = var6_6.b != 0L;
                                                var27_11.g(var19_23);
                                            }
                                            if (var12_14 != var14_13) throw P0.f();
lbl724:
                                            // 9 sources

                                            while (true) {
                                                var14_13 = var9_16;
                                                ** continue;
                                                break;
                                            }
                                        }
                                        if (var17_21 != 0) ** GOTO lbl706
                                        var27_11 = (i0)var28_26;
                                        var14_13 = h0.k(var2_2 /* !! */ , var9_16, (g0)var6_6);
                                        var19_23 = var6_6.b != 0L;
                                        var27_11.g(var19_23);
                                        while (true) {
                                            var12_14 = var14_13;
                                            if (var14_13 >= var4_4) ** GOTO lbl724
                                            var15_19 = h0.h(var2_2 /* !! */ , var14_13, (g0)var6_6);
                                            var12_14 = var14_13;
                                            if (var3_3 != var6_6.a) ** GOTO lbl724
                                            var14_13 = h0.k(var2_2 /* !! */ , var15_19, (g0)var6_6);
                                            var19_23 = var6_6.b != 0L;
                                            var27_11.g(var19_23);
                                        }
                                    }
                                    case 24: 
                                    case 31: 
                                    case 41: 
                                    case 45: {
                                        if (var17_21 != 2) ** GOTO lbl751
                                        var27_11 = (K0)var28_26;
                                        var14_13 = var6_6.a + var12_14;
                                        for (var12_14 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6); var12_14 < var14_13; var12_14 += 4) {
                                            var27_11.g(h0.b(var2_2 /* !! */ , var12_14));
                                        }
                                        if (var12_14 == var14_13) ** GOTO lbl724
                                        throw P0.f();
lbl751:
                                        // 1 sources

                                        if (var17_21 != 5) ** GOTO lbl706
                                        var27_11 = (K0)var28_26;
                                        var27_11.g(h0.b(var2_2 /* !! */ , var9_16));
                                        var14_13 = var9_16 + 4;
                                        while (true) {
                                            var12_14 = var14_13;
                                            if (var14_13 >= var4_4) ** GOTO lbl724
                                            var15_19 = h0.h(var2_2 /* !! */ , var14_13, (g0)var6_6);
                                            var12_14 = var14_13;
                                            if (var3_3 != var6_6.a) ** GOTO lbl724
                                            var27_11.g(h0.b(var2_2 /* !! */ , var15_19));
                                            var14_13 = var15_19 + 4;
                                        }
                                    }
                                    case 23: 
                                    case 32: 
                                    case 40: 
                                    case 46: {
                                        if (var17_21 != 2) ** GOTO lbl773
                                        var27_11 = (Y0)var28_26;
                                        var14_13 = var6_6.a + var12_14;
                                        for (var12_14 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6); var12_14 < var14_13; var12_14 += 8) {
                                            var27_11.g(h0.n(var2_2 /* !! */ , var12_14));
                                        }
                                        if (var12_14 == var14_13) ** GOTO lbl724
                                        throw P0.f();
lbl773:
                                        // 1 sources

                                        if (var17_21 != 1) ** GOTO lbl706
                                        var27_11 = (Y0)var28_26;
                                        var27_11.g(h0.n(var2_2 /* !! */ , var9_16));
                                        var14_13 = var9_16 + 8;
                                        while (true) {
                                            var12_14 = var14_13;
                                            if (var14_13 >= var4_4) ** GOTO lbl724
                                            var15_19 = h0.h(var2_2 /* !! */ , var14_13, (g0)var6_6);
                                            var12_14 = var14_13;
                                            if (var3_3 == var6_6.a) ** break;
                                            ** continue;
                                            var27_11.g(h0.n(var2_2 /* !! */ , var15_19));
                                            var14_13 = var15_19 + 8;
                                        }
                                    }
                                    case 22: 
                                    case 29: 
                                    case 39: 
                                    case 43: {
                                        if (var17_21 != 2) ** GOTO lbl796
                                        var12_14 = h0.f(var2_2 /* !! */ , var9_16, (M0)var28_26, (g0)var6_6);
                                        var14_13 = var3_3;
                                        var24_9 /* !! */  = (byte[])var6_6;
                                        var14_13 = var9_16;
                                        var14_13 = var4_4;
                                        var24_9 /* !! */  = (byte[])var27_11;
                                        break block155;
lbl796:
                                        // 1 sources

                                        if (var17_21 == 0) ** break;
                                        ** continue;
                                        var12_14 = h0.j(var3_3, var2_2 /* !! */ , var9_16, var4_4, (M0)var28_26, (g0)var6_6);
lbl799:
                                        // 10 sources

                                        while (true) {
                                            var14_13 = var3_3;
                                            var14_13 = var9_16;
                                            var27_11 = var6_6;
                                            var14_13 = var4_4;
                                            break block155;
                                            break;
                                        }
                                    }
                                    case 20: 
                                    case 21: 
                                    case 37: 
                                    case 38: {
                                        var16_20 = var4_4;
                                        var30_28 = var6_6;
                                        var12_14 = var9_16;
                                        var15_19 = var3_3;
                                        if (var17_21 != 2) ** GOTO lbl820
                                        var27_11 = (Y0)var28_26;
                                        var12_14 = h0.h(var2_2 /* !! */ , var12_14, (g0)var30_28);
                                        var14_13 = var30_28.a + var12_14;
                                        while (var12_14 < var14_13) {
                                            var12_14 = h0.k(var2_2 /* !! */ , var12_14, (g0)var30_28);
                                            var27_11.g(var30_28.b);
                                        }
                                        if (var12_14 == var14_13) ** GOTO lbl799
                                        throw P0.f();
lbl820:
                                        // 1 sources

                                        var27_11 = var26_7;
                                        if (var17_21 != 0) break;
                                        var27_11 = (Y0)var28_26;
                                        var14_13 = h0.k(var2_2 /* !! */ , var12_14, (g0)var30_28);
                                        var27_11.g(var30_28.b);
                                        while (true) {
                                            var12_14 = var14_13;
                                            if (var14_13 >= var16_20) ** GOTO lbl799
                                            var17_21 = h0.h(var2_2 /* !! */ , var14_13, (g0)var30_28);
                                            var12_14 = var14_13;
                                            if (var15_19 != var30_28.a) ** GOTO lbl799
                                            var14_13 = h0.k(var2_2 /* !! */ , var17_21, (g0)var30_28);
                                            var27_11.g(var30_28.b);
                                        }
                                    }
                                    case 19: 
                                    case 36: {
                                        var15_19 = var4_4;
                                        var30_28 = var6_6;
                                        var12_14 = var9_16;
                                        var16_20 = var3_3;
                                        if (var17_21 != 2) ** GOTO lbl847
                                        var27_11 = (F0)var28_26;
                                        var14_13 = var30_28.a + var12_14;
                                        for (var12_14 = h0.h(var2_2 /* !! */ , var12_14, (g0)var30_28); var12_14 < var14_13; var12_14 += 4) {
                                            var27_11.g(Float.intBitsToFloat(h0.b(var2_2 /* !! */ , var12_14)));
                                        }
                                        if (var12_14 == var14_13) ** GOTO lbl799
                                        throw P0.f();
lbl847:
                                        // 1 sources

                                        var27_11 = var26_7;
                                        if (var17_21 != 5) break;
                                        var27_11 = (F0)var28_26;
                                        var27_11.g(Float.intBitsToFloat(h0.b(var2_2 /* !! */ , var12_14)));
                                        var14_13 = var12_14 + 4;
                                        while (true) {
                                            var12_14 = var14_13;
                                            if (var14_13 >= var15_19) ** GOTO lbl799
                                            var17_21 = h0.h(var2_2 /* !! */ , var14_13, (g0)var30_28);
                                            var12_14 = var14_13;
                                            if (var16_20 != var30_28.a) ** GOTO lbl799
                                            var27_11.g(Float.intBitsToFloat(h0.b(var2_2 /* !! */ , var17_21)));
                                            var14_13 = var17_21 + 4;
                                        }
                                    }
                                    case 18: 
                                    case 35: {
                                        var16_20 = var4_4;
                                        var30_28 = var6_6;
                                        var12_14 = var9_16;
                                        var15_19 = var3_3;
                                        if (var17_21 != 2) ** GOTO lbl874
                                        var27_11 = (y0)var28_26;
                                        var14_13 = var30_28.a + var12_14;
                                        for (var12_14 = h0.h(var2_2 /* !! */ , var12_14, (g0)var30_28); var12_14 < var14_13; var12_14 += 8) {
                                            var27_11.g(Double.longBitsToDouble(h0.n(var2_2 /* !! */ , var12_14)));
                                        }
                                        if (var12_14 == var14_13) ** GOTO lbl799
                                        throw P0.f();
lbl874:
                                        // 1 sources

                                        var27_11 = var26_7;
                                        if (var17_21 != 1) break;
                                        var27_11 = (y0)var28_26;
                                        var27_11.g(Double.longBitsToDouble(h0.n(var2_2 /* !! */ , var12_14)));
                                        var14_13 = var12_14 + 8;
                                        while (true) {
                                            var12_14 = var14_13;
                                            if (var14_13 >= var16_20) ** GOTO lbl799
                                            var17_21 = h0.h(var2_2 /* !! */ , var14_13, (g0)var30_28);
                                            var12_14 = var14_13;
                                            if (var15_19 == var30_28.a) ** break;
                                            ** continue;
                                            var27_11.g(Double.longBitsToDouble(h0.n(var2_2 /* !! */ , var17_21)));
                                            var14_13 = var17_21 + 8;
                                        }
                                    }
                                }
                                var12_14 = var3_3;
                                var12_14 = var9_16;
                                var26_7 = var6_6;
                                var14_13 = var4_4;
                                var26_7 = var27_11;
                            }
                            var14_13 = var3_3;
                            var15_19 = var9_16;
                            var27_11 = var6_6;
                            var9_16 = var4_4;
                            var28_26 = var2_2 /* !! */ ;
                            if (var12_14 != var15_19) {
                                var3_3 = var9_16;
                                var28_26 = var27_11;
                                var9_16 = var14_13;
                                var14_13 = var8_17;
                                var27_11 = var24_9 /* !! */ ;
                                var24_9 /* !! */  = (byte[])var26_7;
lbl907:
                                // 2 sources

                                while (true) {
                                    var14_13 = var8_17;
                                    var26_7 = var2_2 /* !! */ ;
                                    var26_7 = var25_8;
                                    var25_8 = var27_11;
                                    var8_17 = var13_12;
                                    var13_12 = var11_10;
                                    var11_10 = var12_14;
                                    var27_11 = var28_26;
lbl916:
                                    // 2 sources

                                    while (true) {
                                        var28_26 = var2_2 /* !! */ ;
                                        var12_14 = var8_17;
                                        var28_26 = var24_9 /* !! */ ;
                                        var24_9 /* !! */  = var25_8;
                                        var25_8 = var26_7;
                                        var8_17 = var11_10;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var9_16 = var12_14;
                            var12_14 = var8_17;
                            var25_8 = var24_9 /* !! */ ;
                            var28_26 = var27_11;
lbl928:
                            // 2 sources

                            while (true) {
                                var24_9 /* !! */  = (byte[])var29_27;
                                var27_11 = var28_26;
                                var12_14 = var13_12;
                                break block153;
                                break;
                            }
                        }
                        var15_19 = var3_3;
                        if (var16_20 == 50) {
                            if (var17_21 == 2) {
                                var1_1 = n1.o;
                                var2_2 /* !! */  = (byte[])super.B(var8_17);
                                var24_9 /* !! */  = (byte[])var1_1.getObject(var29_27, var20_24);
                                if (!((d1)var24_9 /* !! */ ).i()) {
                                    var6_6 = d1.b().c();
                                    e1.a(var6_6, var24_9 /* !! */ );
                                    var1_1.putObject(var29_27, var20_24, var6_6);
                                }
                                var1_1 = (c1)var2_2 /* !! */ ;
                                throw null;
                            } else {
                                ** GOTO lbl948
                            }
                        }
                        break block162;
                    }
                    var28_26 = var24_9 /* !! */ ;
                    var24_9 /* !! */  = var25_8;
                    var27_11 = var6_6;
                    var12_14 = var13_12;
                    var25_8 = var28_26;
                    break block153;
                }
                var28_26 = n1.o;
                var22_25 = var30_28[var8_17 + 2] & 1048575;
                block30 : switch (var16_20) lbl-1000:
                // 2 sources

                {
                    default: {
                        var24_9 /* !! */  = var6_6;
                        break;
                    }
                    case 68: {
                        if (var17_21 != 3) ** GOTO lbl-1000
                        var24_9 /* !! */  = (byte[])super.D(var29_27, var14_13, var8_17);
                        var12_14 = h0.l(var24_9 /* !! */ , super.A(var8_17), var2_2 /* !! */ , var9_16, var4_4, var15_19 & -8 | 4, (g0)var6_6);
                        super.j(var29_27, var14_13, var8_17, var24_9 /* !! */ );
lbl967:
                        // 6 sources

                        while (true) {
                            var24_9 /* !! */  = (byte[])var6_6;
                            break block156;
                            break;
                        }
                    }
                    case 67: {
                        if (var17_21 != 0) ** GOTO lbl976
                        var12_14 = h0.k(var2_2 /* !! */ , var9_16, (g0)var6_6);
                        var28_26.putObject(var29_27, var20_24, x0.b(var6_6.b));
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        ** GOTO lbl967
lbl976:
                        // 4 sources

                        while (true) {
                            var24_9 /* !! */  = var6_6;
                            break block30;
                            break;
                        }
                    }
                    case 66: {
                        if (var17_21 != 0) ** GOTO lbl976
                        var12_14 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                        var28_26.putObject(var29_27, var20_24, x0.a(var6_6.a));
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        ** GOTO lbl967
                    }
                    case 63: {
                        if (var17_21 != 0) ** GOTO lbl976
                        var12_14 = h0.h(var2_2 /* !! */ , var9_16, (g0)var6_6);
                        var16_20 = var6_6.a;
                        var24_9 /* !! */  = (byte[])super.z(var8_17);
                        if (var24_9 /* !! */  == null || var24_9 /* !! */ .a()) ** GOTO lbl993
                        n1.r(var29_27).h(var15_19, var16_20);
                        ** GOTO lbl967
lbl993:
                        // 1 sources

                        var28_26.putObject(var29_27, var20_24, var16_20);
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        ** GOTO lbl967
                    }
                    case 61: {
                        if (var17_21 == 2) ** break;
                        ** continue;
                        var12_14 = h0.a(var2_2 /* !! */ , var9_16, (g0)var6_6);
                        var28_26.putObject(var29_27, var20_24, var6_6.c);
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        ** continue;
                    }
                    case 60: {
                        if (var17_21 != 2) ** GOTO lbl1010
                        var28_26 = super.D(var29_27, var14_13, var8_17);
                        var12_14 = h0.m(var28_26, super.A(var8_17), var2_2 /* !! */ , var9_16, var4_4, (g0)var6_6);
                        var24_9 /* !! */  = (byte[])var6_6;
                        super.j(var29_27, var14_13, var8_17, var28_26);
                        break block156;
lbl1010:
                        // 1 sources

                        var24_9 /* !! */  = (byte[])var6_6;
                        break;
                    }
                    case 59: {
                        var24_9 /* !! */  = var6_6;
                        if (var17_21 != 2) break;
                        var12_14 = h0.h(var2_2 /* !! */ , var9_16, (g0)var24_9 /* !! */ );
                        var16_20 = var24_9 /* !! */ .a;
                        if (var16_20 == 0) {
                            var28_26.putObject(var29_27, var20_24, "");
                        } else {
                            if ((var18_22 & 0x20000000) != 0 && !b2.c(var2_2 /* !! */ , var12_14, var12_14 + var16_20)) {
                                throw P0.b();
                            }
                            var28_26.putObject(var29_27, var20_24, new String(var2_2 /* !! */ , var12_14, var16_20, O0.b));
                            var12_14 += var16_20;
                        }
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        break block156;
                    }
                    case 58: {
                        var24_9 /* !! */  = var6_6;
                        if (var17_21 != 0) break;
                        var12_14 = h0.k(var2_2 /* !! */ , var9_16, (g0)var24_9 /* !! */ );
                        var19_23 = var24_9 /* !! */ .b != 0L;
                        var28_26.putObject(var29_27, var20_24, var19_23);
                        var28_26.putInt(var29_27, var22_25, var14_13);
lbl1033:
                        // 7 sources

                        while (true) {
                            var24_9 /* !! */  = (byte[])var6_6;
                            break block156;
                            break;
                        }
                    }
                    case 57: 
                    case 64: {
                        var24_9 /* !! */  = var6_6;
                        if (var17_21 != 5) break;
                        var28_26.putObject(var29_27, var20_24, h0.b(var2_2 /* !! */ , var9_16));
                        var12_14 = var9_16 + 4;
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        ** GOTO lbl1033
                    }
                    case 56: 
                    case 65: {
                        var24_9 /* !! */  = var6_6;
                        if (var17_21 != 1) break;
                        var28_26.putObject(var29_27, var20_24, h0.n(var2_2 /* !! */ , var9_16));
                        var12_14 = var9_16 + 8;
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        ** GOTO lbl1033
                    }
                    case 55: 
                    case 62: {
                        var24_9 /* !! */  = var6_6;
                        if (var17_21 != 0) break;
                        var12_14 = h0.h(var2_2 /* !! */ , var9_16, (g0)var24_9 /* !! */ );
                        var28_26.putObject(var29_27, var20_24, var24_9 /* !! */ .a);
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        ** GOTO lbl1033
                    }
                    case 53: 
                    case 54: {
                        var24_9 /* !! */  = var6_6;
                        if (var17_21 != 0) break;
                        var12_14 = h0.k(var2_2 /* !! */ , var9_16, (g0)var24_9 /* !! */ );
                        var28_26.putObject(var29_27, var20_24, var24_9 /* !! */ .b);
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        ** GOTO lbl1033
                    }
                    case 52: {
                        var24_9 /* !! */  = var6_6;
                        if (var17_21 != 5) break;
                        var28_26.putObject(var29_27, var20_24, Float.valueOf(Float.intBitsToFloat(h0.b(var2_2 /* !! */ , var9_16))));
                        var12_14 = var9_16 + 4;
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        ** GOTO lbl1033
                    }
                    case 51: {
                        var24_9 /* !! */  = var6_6;
                        if (var17_21 != 1) break;
                        var28_26.putObject(var29_27, var20_24, Double.longBitsToDouble(h0.n(var2_2 /* !! */ , var9_16)));
                        var12_14 = var9_16 + 8;
                        var28_26.putInt(var29_27, var22_25, var14_13);
                        ** continue;
                    }
                }
                var24_9 /* !! */  = (byte[])var6_6;
                var12_14 = var9_16;
            }
            var28_26 = var6_6;
            if (var12_14 != var9_16) {
                var3_3 = var4_4;
                var24_9 /* !! */  = var2_2 /* !! */ ;
                var9_16 = var15_19;
                var14_13 = var8_17;
                var24_9 /* !! */  = (byte[])var26_7;
                ** continue;
            }
            var9_16 = var12_14;
            var12_14 = var8_17;
            var25_8 = var27_11;
            ** while (true)
        }
        var13_12 = var11_10;
        if (var3_3 == var5_5 && var5_5 != 0) {
            var8_17 = var9_16;
            var1_1 = var24_9 /* !! */ ;
        } else {
            var28_26 = n1.r(var24_9 /* !! */ );
            var11_10 = var4_4;
            var14_13 = h0.g(var3_3, var2_2 /* !! */ , var9_16, var11_10, (O1)var28_26, (g0)var27_11);
            var27_11 = var2_2 /* !! */ ;
            var27_11 = var6_6;
            var9_16 = var3_3;
            var28_26 = var24_9 /* !! */ ;
            var24_9 /* !! */  = var26_7;
            var26_7 = var28_26;
            var3_3 = var11_10;
            var11_10 = var14_13;
            var14_13 = var8_17;
            var8_17 = var12_14;
            ** continue;
lbl1113:
            // 1 sources

            var1_1 = var25_8;
            var4_4 = var3_3;
            var3_3 = var9_16;
            var25_8 = var24_9 /* !! */ ;
        }
        if (var10_15 != 1048575) {
            var25_8.putInt(var1_1, var10_15, var12_14);
        }
        for (var9_16 = var26_7.g; var9_16 < var26_7.h; ++var9_16) {
            var11_10 = var26_7.f[var9_16];
            var10_15 = var26_7.a[var11_10];
            var2_2 /* !! */  = (byte[])X1.f(var1_1, var26_7.x(var11_10) & 1048575);
            if (var2_2 /* !! */  == null || var26_7.z(var11_10) == null) {
                continue;
            }
            var1_1 = (d1)var2_2 /* !! */ ;
            var1_1 = (c1)var26_7.B(var11_10);
            throw null;
        }
        if (var5_5 == 0) {
            if (var8_17 == var4_4) return var8_17;
            throw P0.d();
        }
        if (var8_17 > var4_4 || var3_3 != var5_5) throw P0.d();
        return var8_17;
    }
}

