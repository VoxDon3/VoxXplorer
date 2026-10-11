/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.E4;
import ax.b6.F4;
import ax.b6.F5;
import ax.b6.G3;
import ax.b6.G5;
import ax.b6.H5;
import ax.b6.L5;
import ax.b6.M4;
import ax.b6.N4;
import ax.b6.P3;
import ax.b6.S3;
import ax.b6.S4;
import ax.b6.U3;
import ax.b6.U4;
import ax.b6.W3;
import ax.b6.Y3;
import ax.b6.c5;
import ax.b6.c6;
import ax.b6.d4;
import ax.b6.e4;
import ax.b6.f4;
import ax.b6.f5;
import ax.b6.i5;
import ax.b6.j4;
import ax.b6.j5;
import ax.b6.k4;
import ax.b6.l5;
import ax.b6.m4;
import ax.b6.n4;
import ax.b6.n5;
import ax.b6.o4;
import ax.b6.s4;
import ax.b6.t4;
import ax.b6.v3;
import ax.b6.w3;
import ax.b6.y3;
import ax.b6.y5;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class X4<T>
implements l5<T> {
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
    private final c5 l;
    private final E4 m;
    private final G5<?, ?> n;
    private final Y3<?> o;
    private final N4 p;

    private X4(int[] nArray, Object[] objectArray, int n8, int n9, U4 u42, f5 f52, boolean bl, int[] nArray2, int n10, int n11, c5 c52, E4 e42, G5<?, ?> g52, Y3<?> y32, N4 n42) {
        this.a = nArray;
        this.b = objectArray;
        this.c = n8;
        this.d = n9;
        this.g = u42 instanceof k4;
        bl = y32 != null && y32.e(u42);
        this.f = bl;
        this.h = false;
        this.i = nArray2;
        this.j = n10;
        this.k = n11;
        this.l = c52;
        this.m = e42;
        this.n = g52;
        this.o = y32;
        this.e = u42;
        this.p = n42;
    }

    private static boolean A(Object object, int n8, l5 l52) {
        return l52.d(H5.B(object, n8 & 0xFFFFF));
    }

    private static <T> float B(T t8, long l8) {
        return ((Float)H5.B(t8, l8)).floatValue();
    }

    private final int C(int n8) {
        return this.a[n8 + 2];
    }

    private final void D(T t8, int n8) {
        long l8 = 0xFFFFF & (n8 = this.C(n8));
        if (l8 == 1048575L) {
            return;
        }
        H5.h(t8, l8, 1 << (n8 >>> 20) | H5.t(t8, l8));
    }

    private final void E(T t8, int n8, int n9) {
        H5.h(t8, this.C(n9) & 0xFFFFF, n8);
    }

    private final void F(T object, T object2, int n8) {
        int n9 = this.a[n8];
        if (!this.J(object2, n9, n8)) {
            return;
        }
        Unsafe unsafe = r;
        long l8 = this.G(n8) & 0xFFFFF;
        Object object3 = unsafe.getObject(object2, l8);
        if (object3 != null) {
            Object object4;
            l5 l52 = this.N(n8);
            if (!this.J(object, n9, n8)) {
                if (!X4.T(object3)) {
                    unsafe.putObject(object, l8, object3);
                } else {
                    object2 = l52.a();
                    l52.g(object2, object3);
                    unsafe.putObject(object, l8, object2);
                }
                this.E(object, n9, n8);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l8);
            if (!X4.T(object4)) {
                object2 = l52.a();
                l52.g(object2, object4);
                unsafe.putObject(object, l8, object2);
            }
            l52.g(object2, object3);
            return;
        }
        n8 = this.a[n8];
        object = String.valueOf(object2);
        object2 = new StringBuilder("Source subfield ");
        ((StringBuilder)object2).append(n8);
        ((StringBuilder)object2).append(" is present but null: ");
        ((StringBuilder)object2).append((String)object);
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }

    private final int G(int n8) {
        return this.a[n8 + 1];
    }

    private static <T> int H(T t8, long l8) {
        return (Integer)H5.B(t8, l8);
    }

    private final boolean I(T object, int n8) {
        int n9 = this.C(n8);
        long l8 = n9 & 0xFFFFF;
        if (l8 == 1048575L) {
            n8 = this.G(n8);
            l8 = n8 & 0xFFFFF;
            switch ((n8 & 0xFF00000) >>> 20) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 17: {
                    return H5.B(object, l8) != null;
                }
                case 16: {
                    return H5.x(object, l8) != 0L;
                }
                case 15: {
                    return H5.t(object, l8) != 0;
                }
                case 14: {
                    return H5.x(object, l8) != 0L;
                }
                case 13: {
                    return H5.t(object, l8) != 0;
                }
                case 12: {
                    return H5.t(object, l8) != 0;
                }
                case 11: {
                    return H5.t(object, l8) != 0;
                }
                case 10: {
                    return !B3.c0.equals(H5.B(object, l8));
                }
                case 9: {
                    return H5.B(object, l8) != null;
                }
                case 8: {
                    object = H5.B(object, l8);
                    if (object instanceof String) {
                        return !((String)object).isEmpty();
                    }
                    if (object instanceof B3) {
                        return !B3.c0.equals(object);
                    }
                    throw new IllegalArgumentException();
                }
                case 7: {
                    return H5.F(object, l8);
                }
                case 6: {
                    return H5.t(object, l8) != 0;
                }
                case 5: {
                    return H5.x(object, l8) != 0L;
                }
                case 4: {
                    return H5.t(object, l8) != 0;
                }
                case 3: {
                    return H5.x(object, l8) != 0L;
                }
                case 2: {
                    return H5.x(object, l8) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(H5.n(object, l8)) != 0;
                }
                case 0: 
            }
            return Double.doubleToRawLongBits(H5.a(object, l8)) != 0L;
        }
        return (H5.t(object, l8) & 1 << (n9 >>> 20)) != 0;
    }

    private final boolean J(T t8, int n8, int n9) {
        return H5.t(t8, this.C(n9) & 0xFFFFF) == n8;
    }

    private final boolean K(T t8, T t9, int n8) {
        return this.I(t8, n8) == this.I(t9, n8);
    }

    private static <T> long L(T t8, long l8) {
        return (Long)H5.B(t8, l8);
    }

    private final o4 M(int n8) {
        return (o4)this.b[(n8 / 3 << 1) + 1];
    }

    private final l5 N(int n8) {
        l5 l52 = (l5)this.b[n8 = n8 / 3 << 1];
        if (l52 != null) {
            return l52;
        }
        this.b[n8] = l52 = i5.a().b((Class)this.b[n8 + 1]);
        return l52;
    }

    private static F5 O(Object object) {
        k4 k42 = (k4)object;
        F5 f52 = k42.zzb;
        object = f52;
        if (f52 == F5.k()) {
            k42.zzb = object = F5.l();
        }
        return object;
    }

    private static <T> boolean P(T t8, long l8) {
        return (Boolean)H5.B(t8, l8);
    }

    private final Object Q(int n8) {
        return this.b[n8 / 3 << 1];
    }

    private static void R(Object object) {
        if (X4.T(object)) {
            return;
        }
        String string = String.valueOf(object);
        object = new StringBuilder("Mutating immutable message: ");
        ((StringBuilder)object).append(string);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private static boolean S(int n8) {
        return (n8 & 0x20000000) != 0;
    }

    private static boolean T(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof k4) {
            return ((k4)object).H();
        }
        return true;
    }

    private static <T> double j(T t8, long l8) {
        return (Double)H5.B(t8, l8);
    }

    private final int k(int n8) {
        if (n8 >= this.c && n8 <= this.d) {
            return this.l(n8, 0);
        }
        return -1;
    }

    private final int l(int n8, int n9) {
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    static <T> X4<T> n(Class<T> object, S4 object2, c5 c52, E4 e42, G5<?, ?> g52, Y3<?> y32, N4 n42) {
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
        if (!(object2 instanceof j5)) {
            object = (y5)object2;
            throw new NoSuchMethodError();
        }
        j5 j52 = (j5)object2;
        String string = j52.d();
        int n18 = string.length();
        if (string.charAt(0) >= '\ud800') {
            n17 = 1;
            while (true) {
                n15 = n16 = n17 + 1;
                if (string.charAt(n17) >= '\ud800') {
                    n17 = n16;
                    continue;
                }
                break;
            }
        } else {
            n15 = 1;
        }
        n16 = n15 + 1;
        int n19 = string.charAt(n15);
        n15 = n16;
        n17 = n19;
        if (n19 >= 55296) {
            n17 = n19 & 0x1FFF;
            n15 = 13;
            n19 = n16;
            while (true) {
                n16 = n19 + 1;
                if ((n19 = (int)string.charAt(n19)) < 55296) break;
                n17 |= (n19 & 0x1FFF) << n15;
                n15 += 13;
                n19 = n16;
            }
            n17 |= n19 << n15;
            n15 = n16;
        }
        if (n17 == 0) {
            object = q;
            n14 = 0;
            n16 = 0;
            n19 = 0;
            n13 = 0;
            n12 = 0;
            n11 = 0;
            n17 = 0;
        } else {
            n16 = n15 + 1;
            n15 = n19 = (int)string.charAt(n15);
            n17 = n16;
            if (n19 >= 55296) {
                n15 = n19 & 0x1FFF;
                n17 = 13;
                n19 = n16;
                n16 = n15;
                while (true) {
                    n15 = n19 + 1;
                    if ((n19 = (int)string.charAt(n19)) < 55296) break;
                    n16 |= (n19 & 0x1FFF) << n17;
                    n17 += 13;
                    n19 = n15;
                }
                n16 |= n19 << n17;
                n17 = n15;
                n15 = n16;
            }
            n16 = n17 + 1;
            n14 = n17 = (int)string.charAt(n17);
            n19 = n16;
            if (n17 >= 55296) {
                n19 = n17 & 0x1FFF;
                n17 = 13;
                n11 = n16;
                while (true) {
                    n16 = n11 + 1;
                    if ((n11 = (int)string.charAt(n11)) < 55296) break;
                    n19 |= (n11 & 0x1FFF) << n17;
                    n17 += 13;
                    n11 = n16;
                }
                n14 = n19 | n11 << n17;
                n19 = n16;
            }
            n17 = n19 + 1;
            n16 = n19 = (int)string.charAt(n19);
            n11 = n17;
            if (n19 >= 55296) {
                n19 &= 0x1FFF;
                n16 = 13;
                n11 = n17;
                while (true) {
                    n17 = n11 + 1;
                    if ((n11 = (int)string.charAt(n11)) < 55296) break;
                    n19 |= (n11 & 0x1FFF) << n16;
                    n16 += 13;
                    n11 = n17;
                }
                n16 = n19 | n11 << n16;
                n11 = n17;
            }
            n19 = n11 + 1;
            n17 = n11 = (int)string.charAt(n11);
            n10 = n19;
            if (n11 >= 55296) {
                n11 &= 0x1FFF;
                n17 = 13;
                n10 = n19;
                while (true) {
                    n19 = n10 + 1;
                    if ((n10 = (int)string.charAt(n10)) < 55296) break;
                    n11 |= (n10 & 0x1FFF) << n17;
                    n17 += 13;
                    n10 = n19;
                }
                n17 = n11 | n10 << n17;
                n10 = n19;
            }
            n11 = n10 + 1;
            n19 = n10 = (int)string.charAt(n10);
            n9 = n11;
            if (n10 >= 55296) {
                n10 &= 0x1FFF;
                n19 = 13;
                n9 = n11;
                while (true) {
                    n11 = n9 + 1;
                    if ((n9 = (int)string.charAt(n9)) < 55296) break;
                    n10 |= (n9 & 0x1FFF) << n19;
                    n19 += 13;
                    n9 = n11;
                }
                n19 = n10 | n9 << n19;
                n9 = n11;
            }
            n10 = n9 + 1;
            n11 = n9 = (int)string.charAt(n9);
            n13 = n10;
            if (n9 >= 55296) {
                n11 = n9 & 0x1FFF;
                n9 = 13;
                n13 = n10;
                n10 = n11;
                while (true) {
                    n11 = n13 + 1;
                    if ((n13 = (int)string.charAt(n13)) < 55296) break;
                    n10 |= (n13 & 0x1FFF) << n9;
                    n9 += 13;
                    n13 = n11;
                }
                n10 |= n13 << n9;
                n13 = n11;
                n11 = n10;
            }
            n9 = n13 + 1;
            n13 = n12 = (int)string.charAt(n13);
            n10 = n9;
            if (n12 >= 55296) {
                n13 = n12 & 0x1FFF;
                n10 = 13;
                n12 = n9;
                while (true) {
                    n9 = n12 + 1;
                    if ((n12 = (int)string.charAt(n12)) < 55296) break;
                    n13 |= (n12 & 0x1FFF) << n10;
                    n10 += 13;
                    n12 = n9;
                }
                n13 |= n12 << n10;
                n10 = n9;
            }
            n12 = n10 + 1;
            n9 = n8 = (int)string.charAt(n10);
            n10 = n12;
            if (n8 >= 55296) {
                n10 = n8 & 0x1FFF;
                n9 = 13;
                n8 = n12;
                n12 = n10;
                while (true) {
                    n10 = n8 + 1;
                    if ((n8 = (int)string.charAt(n8)) < 55296) break;
                    n12 |= (n8 & 0x1FFF) << n9;
                    n9 += 13;
                    n8 = n10;
                }
                n9 = n12 | n8 << n9;
            }
            object = new int[n9 + n11 + n13];
            n14 = (n15 << 1) + n14;
            n13 = n16;
            n16 = n11;
            n12 = n17;
            n17 = n9;
            n11 = n14;
            n14 = n15;
            n15 = n10;
        }
        Unsafe unsafe = r;
        Object[] objectArray = j52.e();
        Class<?> clazz = j52.a().getClass();
        object2 = new int[n19 * 3];
        Object[] objectArray2 = new Object[n19 << 1];
        int n20 = n17 + n16;
        n16 = n17;
        int n21 = n20;
        n9 = 0;
        n10 = 0;
        n19 = n11;
        n11 = n9;
        n8 = n18;
        while (true) {
            int n22;
            int n23;
            int n24;
            int n25;
            int n26;
            int n27;
            int n28;
            int n29;
            int n30;
            block54: {
                Field field;
                block60: {
                    block61: {
                        block55: {
                            block56: {
                                block62: {
                                    block57: {
                                        block58: {
                                            block59: {
                                                block49: {
                                                    Field var34_45;
                                                    Field var34_41;
                                                    Object object3;
                                                    block51: {
                                                        block53: {
                                                            block50: {
                                                                block52: {
                                                                    n30 = n11;
                                                                    if (n15 >= n8) {
                                                                        return new X4<T>((int[])object2, objectArray2, n13, n12, j52.a(), j52.b(), false, (int[])object, n17, n20, c52, e42, g52, y32, n42);
                                                                    }
                                                                    n11 = n15 + 1;
                                                                    n18 = string.charAt(n15);
                                                                    if (n18 >= 55296) {
                                                                        n9 = n18 & 0x1FFF;
                                                                        n18 = n11;
                                                                        n11 = 13;
                                                                        while (true) {
                                                                            n15 = n18 + 1;
                                                                            if ((n18 = (int)string.charAt(n18)) < 55296) break;
                                                                            n9 |= (n18 & 0x1FFF) << n11;
                                                                            n11 += 13;
                                                                            n18 = n15;
                                                                        }
                                                                        n18 = n9 | n18 << n11;
                                                                    } else {
                                                                        n15 = n11;
                                                                    }
                                                                    n29 = n15 + 1;
                                                                    n28 = string.charAt(n15);
                                                                    if (n28 >= 55296) {
                                                                        n9 = n28 & 0x1FFF;
                                                                        n15 = 13;
                                                                        while (true) {
                                                                            n11 = n29 + 1;
                                                                            if ((n29 = (int)string.charAt(n29)) < 55296) break;
                                                                            n9 |= (n29 & 0x1FFF) << n15;
                                                                            n15 += 13;
                                                                            n29 = n11;
                                                                        }
                                                                        n28 = n9 | n29 << n15;
                                                                    } else {
                                                                        n11 = n29;
                                                                    }
                                                                    n27 = n28 & 0xFF;
                                                                    n29 = n10;
                                                                    if ((n28 & 0x400) != 0) {
                                                                        object[n10] = n30;
                                                                        n29 = n10 + 1;
                                                                    }
                                                                    if (n27 < 51) break block49;
                                                                    n9 = n11 + 1;
                                                                    n11 = string.charAt(n11);
                                                                    n15 = n9;
                                                                    n10 = n11;
                                                                    if (n11 >= 55296) {
                                                                        n10 = n11 & 0x1FFF;
                                                                        n11 = 13;
                                                                        while (true) {
                                                                            n15 = n9 + 1;
                                                                            if ((n9 = (int)string.charAt(n9)) < 55296) break;
                                                                            n10 |= (n9 & 0x1FFF) << n11;
                                                                            n11 += 13;
                                                                            n9 = n15;
                                                                        }
                                                                        n10 |= n9 << n11;
                                                                    }
                                                                    if ((n9 = n27 - 51) == 9 || n9 == 17) break block50;
                                                                    n11 = n19;
                                                                    if (n9 != 12) break block51;
                                                                    if (((Object)((Object)j52.b())).equals((Object)f5.q)) break block52;
                                                                    n11 = n19;
                                                                    if ((n28 & 0x800) == 0) break block51;
                                                                }
                                                                n9 = n30 / 3;
                                                                n11 = n19 + 1;
                                                                objectArray2[(n9 << 1) + 1] = objectArray[n19];
                                                                n19 = n11;
                                                                break block53;
                                                            }
                                                            n9 = n30 / 3;
                                                            n11 = n19 + 1;
                                                            objectArray2[(n9 << 1) + 1] = objectArray[n19];
                                                            n19 = n11;
                                                        }
                                                        n11 = n19;
                                                    }
                                                    if ((object3 = objectArray[n19 = n10 << 1]) instanceof Field) {
                                                        Field field2 = (Field)object3;
                                                    } else {
                                                        Field field3 = X4.s(clazz, (String)object3);
                                                        objectArray[n19] = field3;
                                                    }
                                                    n26 = (int)unsafe.objectFieldOffset((Field)var34_41);
                                                    Object object4 = objectArray[++n19];
                                                    if (object4 instanceof Field) {
                                                        Field field4 = (Field)object4;
                                                    } else {
                                                        Field field5 = X4.s(clazz, (String)object4);
                                                        objectArray[n19] = field5;
                                                    }
                                                    n25 = (int)unsafe.objectFieldOffset((Field)var34_45);
                                                    n24 = 0;
                                                    n19 = n11;
                                                    n23 = n16;
                                                    n22 = n21;
                                                    break block54;
                                                }
                                                n15 = n19 + 1;
                                                field = X4.s(clazz, (String)objectArray[n19]);
                                                if (n27 == 9 || n27 == 17) break block55;
                                                if (n27 == 27 || n27 == 49) break block56;
                                                if (n27 == 12 || n27 == 30 || n27 == 44) break block57;
                                                if (n27 != 50) break block58;
                                                n10 = n16 + 1;
                                                object[n16] = n30;
                                                n9 = n30 / 3 << 1;
                                                n16 = n19 + 2;
                                                objectArray2[n9] = objectArray[n15];
                                                if ((n28 & 0x800) == 0) break block59;
                                                n15 = n19 + 3;
                                                objectArray2[n9 + 1] = objectArray[n16];
                                                n16 = n10;
                                                break block60;
                                            }
                                            n15 = n16;
                                            break block61;
                                        }
                                        n10 = n16;
                                        break block61;
                                    }
                                    f5 f52 = j52.b();
                                    n9 = n15;
                                    if (f52 == f5.q) break block62;
                                    n10 = n16;
                                    n15 = n9;
                                    if ((n28 & 0x800) == 0) break block61;
                                }
                                n10 = n30 / 3;
                                n15 = n19 + 2;
                                objectArray2[(n10 << 1) + 1] = objectArray[n9];
                                break block60;
                            }
                            n10 = n30 / 3;
                            objectArray2[(n10 << 1) + 1] = objectArray[n15];
                            n15 = n19 += 2;
                            break block60;
                        }
                        objectArray2[(n30 / 3 << 1) + 1] = field.getType();
                        n10 = n16;
                    }
                    n16 = n10;
                }
                int n31 = (int)unsafe.objectFieldOffset(field);
                if ((n28 & 0x1000) != 0 && n27 <= 17) {
                    Field var34_51;
                    n10 = n11 + 1;
                    n19 = string.charAt(n11);
                    if (n19 >= 55296) {
                        n11 = n19 & 0x1FFF;
                        n19 = 13;
                        while (true) {
                            n9 = n10 + 1;
                            if ((n10 = (int)string.charAt(n10)) < 55296) break;
                            n11 |= (n10 & 0x1FFF) << n19;
                            n19 += 13;
                            n10 = n9;
                        }
                        n19 = n11 | n10 << n19;
                    } else {
                        n9 = n10;
                    }
                    n11 = (n14 << 1) + n19 / 32;
                    Object object5 = objectArray[n11];
                    if (object5 instanceof Field) {
                        Field field6 = (Field)object5;
                    } else {
                        Field field7 = X4.s(clazz, (String)object5);
                        objectArray[n11] = field7;
                    }
                    n11 = (int)unsafe.objectFieldOffset((Field)var34_51);
                    n10 = n19 % 32;
                } else {
                    n19 = 1048575;
                    n10 = 0;
                    n9 = n11;
                    n11 = n19;
                }
                int n32 = n15;
                n25 = n11;
                n26 = n31;
                n24 = n10;
                n19 = n32;
                n23 = n16;
                n22 = n21;
                n15 = n9;
                if (n27 >= 18) {
                    n25 = n11;
                    n26 = n31;
                    n24 = n10;
                    n19 = n32;
                    n23 = n16;
                    n22 = n21;
                    n15 = n9;
                    if (n27 <= 49) {
                        object[n21] = n31;
                        n22 = n21 + 1;
                        n15 = n9;
                        n23 = n16;
                        n19 = n32;
                        n24 = n10;
                        n26 = n31;
                        n25 = n11;
                    }
                }
            }
            object2[n30] = n18;
            n16 = (n28 & 0x200) != 0 ? 0x20000000 : 0;
            n11 = (n28 & 0x100) != 0 ? 0x10000000 : 0;
            n10 = (n28 & 0x800) != 0 ? Integer.MIN_VALUE : 0;
            object2[n30 + 1] = n11 | n16 | n10 | n27 << 20 | n26;
            n11 = n30 + 3;
            object2[n30 + 2] = n24 << 20 | n25;
            n10 = n29;
            n16 = n23;
            n21 = n22;
        }
    }

    private final <K, V, UT, UB> UB o(int n8, int n9, Map<K, V> map, o4 o42, UB object, G5<UT, UB> g52, Object object2) {
        this.p.b(this.Q(n8));
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (o42.d((Integer)entry.getValue())) continue;
            map = object;
            if (object == null) {
                map = g52.i(object2);
            }
            G3 g32 = B3.u(M4.a(null, entry.getKey(), entry.getValue()));
            object = g32.b();
            try {
                M4.b(object, null, entry.getKey(), entry.getValue());
                g52.c(map, n9, g32.a());
                iterator.remove();
                object = map;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        return object;
    }

    private final Object p(T object, int n8) {
        l5 l52 = this.N(n8);
        long l8 = this.G(n8) & 0xFFFFF;
        if (!this.I(object, n8)) {
            return l52.a();
        }
        if (X4.T(object = r.getObject(object, l8))) {
            return object;
        }
        Object t8 = l52.a();
        if (object != null) {
            l52.g(t8, object);
        }
        return t8;
    }

    private final Object q(T t8, int n8, int n9) {
        l5 l52 = this.N(n9);
        if (!this.J(t8, n8, n9)) {
            return l52.a();
        }
        Object object = r.getObject(t8, this.G(n9) & 0xFFFFF);
        if (X4.T(object)) {
            return object;
        }
        t8 = l52.a();
        if (object != null) {
            l52.g(t8, object);
        }
        return t8;
    }

    private final <UT, UB> UB r(Object object, int n8, UB UB, G5<UT, UB> g52, Object object2) {
        int n9 = this.a[n8];
        Object object3 = H5.B(object, this.G(n8) & 0xFFFFF);
        if (object3 == null || (object = this.M(n8)) == null) {
            return UB;
        }
        return this.o(n8, n9, this.p.c(object3), (o4)object, UB, g52, object2);
    }

    private static Field s(Class<?> object, String string) {
        try {
            Field field = ((Class)object).getDeclaredField(string);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Object object2;
            Object object3 = ((Class)object).getDeclaredFields();
            int n8 = ((Field[])object3).length;
            for (int i8 = 0; i8 < n8; ++i8) {
                object2 = object3[i8];
                if (!string.equals(((Field)object2).getName())) continue;
                return object2;
            }
            object = ((Class)object).getName();
            object2 = Arrays.toString((Object[])object3);
            object3 = new StringBuilder("Field ");
            ((StringBuilder)object3).append(string);
            ((StringBuilder)object3).append(" for ");
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(" not found. Known fields are ");
            ((StringBuilder)object3).append((String)object2);
            throw new RuntimeException(((StringBuilder)object3).toString());
        }
    }

    private static void t(int n8, Object object, c6 c62) throws IOException {
        if (object instanceof String) {
            c62.p(n8, (String)object);
            return;
        }
        c62.M(n8, (B3)object);
    }

    private static <UT, UB> void u(G5<UT, UB> g52, T t8, c6 c62) throws IOException {
        g52.g(g52.k(t8), c62);
    }

    private final <K, V> void v(c6 c62, int n8, Object object, int n9) throws IOException {
        if (object != null) {
            this.p.b(this.Q(n9));
            c62.K(n8, null, this.p.d(object));
        }
    }

    private final void w(T t8, int n8, int n9, Object object) {
        r.putObject(t8, this.G(n9) & 0xFFFFF, object);
        this.E(t8, n8, n9);
    }

    private final void x(T t8, int n8, Object object) {
        r.putObject(t8, this.G(n8) & 0xFFFFF, object);
        this.D(t8, n8);
    }

    private final void y(T object, T object2, int n8) {
        if (!this.I(object2, n8)) {
            return;
        }
        Unsafe unsafe = r;
        long l8 = this.G(n8) & 0xFFFFF;
        Object object3 = unsafe.getObject(object2, l8);
        if (object3 != null) {
            l5 l52 = this.N(n8);
            if (!this.I(object, n8)) {
                if (!X4.T(object3)) {
                    unsafe.putObject(object, l8, object3);
                } else {
                    object2 = l52.a();
                    l52.g(object2, object3);
                    unsafe.putObject(object, l8, object2);
                }
                this.D(object, n8);
                return;
            }
            Object object4 = unsafe.getObject(object, l8);
            object2 = object4;
            if (!X4.T(object4)) {
                object2 = l52.a();
                l52.g(object2, object4);
                unsafe.putObject(object, l8, object2);
            }
            l52.g(object2, object3);
            return;
        }
        n8 = this.a[n8];
        object2 = String.valueOf(object2);
        object = new StringBuilder("Source subfield ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" is present but null: ");
        ((StringBuilder)object).append((String)object2);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private final boolean z(T t8, int n8, int n9, int n10, int n11) {
        if (n9 == 1048575) {
            return this.I(t8, n8);
        }
        return (n10 & n11) != 0;
    }

    @Override
    public final T a() {
        return (T)this.l.b(this.e);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public final int b(T var1_1) {
        var17_2 = this;
        var16_3 /* !! */  = var1_1;
        var19_4 = X4.r;
        var9_5 = 0;
        var3_7 = 1048575;
        var4_8 = 0;
        var5_9 = 0;
        for (var6_6 = 0; var6_6 < var17_2.a.length; var6_6 += 3) {
            block87: {
                var11_14 = var17_2.G(var6_6);
                var12_15 = (0xFF00000 & var11_14) >>> 20;
                var15_17 = var17_2.a;
                var10_13 = var15_17[var6_6];
                var8_12 = var15_17[var6_6 + 2];
                var7_11 = var8_12 & 1048575;
                if (var12_15 <= 17) {
                    var2_10 = var3_7;
                    if (var7_11 != var3_7) {
                        var4_8 = var7_11 == 1048575 ? 0 : var19_4.getInt(var16_3 /* !! */ , var7_11);
                        var2_10 = var7_11;
                    }
                    var3_7 = 1 << (var8_12 >>> 20);
                    var7_11 = var2_10;
                    var8_12 = var4_8;
                    var2_10 = var3_7;
                } else {
                    var2_10 = 0;
                    var8_12 = var4_8;
                    var7_11 = var3_7;
                }
                var13_16 = var11_14 & 1048575;
                if (var12_15 >= e4.L0.a()) {
                    e4.Y0.a();
                }
                block0 : switch (var12_15) {
                    default: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        break;
                    }
                    case 68: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.B(var10_13, (U4)var19_4.getObject(var16_3 /* !! */ , var13_16), super.N(var6_6));
lbl42:
                        // 41 sources

                        while (true) {
                            var2_10 = var5_9 + var2_10;
                            var15_17 = var17_2;
                            break block87;
                            break;
                        }
                    }
                    case 67: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.m0(var10_13, X4.L(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl42
                    }
                    case 66: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.x0(var10_13, X4.H(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl42
                    }
                    case 65: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.i0(var10_13, 0L);
                        ** GOTO lbl42
                    }
                    case 64: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.t0(var10_13, 0);
                        ** GOTO lbl42
                    }
                    case 63: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.h0(var10_13, X4.H(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl42
                    }
                    case 62: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.A0(var10_13, X4.H(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl42
                    }
                    case 61: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.U(var10_13, (B3)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl42
                    }
                    case 60: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = n5.a(var10_13, var19_4.getObject(var16_3 /* !! */ , var13_16), super.N(var6_6));
                        ** GOTO lbl42
                    }
                    case 59: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var15_17 = var19_4.getObject(var16_3 /* !! */ , var13_16);
                        if (!(var15_17 instanceof B3)) ** GOTO lbl102
                        var2_10 = S3.U(var10_13, (B3)var15_17);
                        ** GOTO lbl42
lbl102:
                        // 1 sources

                        var2_10 = S3.C(var10_13, (String)var15_17);
                        ** GOTO lbl42
                    }
                    case 58: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.D(var10_13, true);
                        ** GOTO lbl42
                    }
                    case 57: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.l0(var10_13, 0);
                        ** GOTO lbl42
                    }
                    case 56: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.T(var10_13, 0L);
                        ** GOTO lbl42
                    }
                    case 55: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.p0(var10_13, X4.H(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl42
                    }
                    case 54: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.q0(var10_13, X4.L(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl42
                    }
                    case 53: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.c0(var10_13, X4.L(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl42
                    }
                    case 52: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.f(var10_13, 0.0f);
                        ** GOTO lbl42
                    }
                    case 51: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.J(var16_3 /* !! */ , var10_13, var6_6)) break;
                        var2_10 = S3.e(var10_13, 0.0);
                        ** GOTO lbl42
                    }
                    case 50: {
                        var2_10 = var17_2.p.i(var10_13, var19_4.getObject(var16_3 /* !! */ , var13_16), var17_2.Q(var6_6));
                        ** GOTO lbl42
                    }
                    case 49: {
                        var2_10 = n5.c(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), var17_2.N(var6_6));
                        ** GOTO lbl42
                    }
                    case 48: {
                        var2_10 = n5.N((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
lbl165:
                        // 14 sources

                        while (true) {
                            var2_10 = var5_9 + (var3_7 + var4_8 + var2_10);
                            var15_17 = var17_2;
                            break block87;
                            break;
                        }
                    }
                    case 47: {
                        var2_10 = n5.K((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 46: {
                        var2_10 = n5.B((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 45: {
                        var2_10 = n5.y((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 44: {
                        var2_10 = n5.t((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 43: {
                        var2_10 = n5.Q((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 42: {
                        var2_10 = n5.e((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 41: {
                        var2_10 = n5.y((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 40: {
                        var2_10 = n5.B((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 39: {
                        var2_10 = n5.E((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 38: {
                        var2_10 = n5.T((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 37: {
                        var2_10 = n5.H((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 36: {
                        var2_10 = n5.y((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** GOTO lbl165
                    }
                    case 35: {
                        var2_10 = n5.B((List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (var2_10 <= 0) break;
                        var3_7 = S3.w0(var10_13);
                        var4_8 = S3.z0(var2_10);
                        ** continue;
                    }
                    case 34: {
                        var2_10 = n5.M(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 33: {
                        var2_10 = n5.J(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 32: {
                        var2_10 = n5.A(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 31: {
                        var2_10 = n5.x(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 30: {
                        var2_10 = n5.s(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 29: {
                        var2_10 = n5.P(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 28: {
                        var2_10 = n5.b(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl42
                    }
                    case 27: {
                        var2_10 = n5.r(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), var17_2.N(var6_6));
                        ** GOTO lbl42
                    }
                    case 26: {
                        var2_10 = n5.q(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl42
                    }
                    case 25: {
                        var2_10 = n5.d(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 24: {
                        var2_10 = n5.x(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 23: {
                        var2_10 = n5.A(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 22: {
                        var2_10 = n5.D(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 21: {
                        var2_10 = n5.S(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 20: {
                        var2_10 = n5.G(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 19: {
                        var2_10 = n5.x(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 18: {
                        var2_10 = n5.A(var10_13, (List)var19_4.getObject(var16_3 /* !! */ , var13_16), false);
                        ** GOTO lbl42
                    }
                    case 17: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) break;
                        var2_10 = S3.B(var10_13, (U4)var19_4.getObject(var16_3 /* !! */ , var13_16), super.N(var6_6));
                        ** GOTO lbl42
                    }
                    case 16: {
                        if (var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) {
                            var2_10 = S3.m0(var10_13, var19_4.getLong(var16_3 /* !! */ , var13_16));
lbl333:
                            // 10 sources

                            while (true) {
                                var2_10 = var5_9 + var2_10;
                                var15_17 = this;
                                break block87;
                                break;
                            }
                        }
lbl337:
                        // 10 sources

                        while (true) {
                            var15_17 = this;
                            var18_18 /* !! */  = var16_3 /* !! */ ;
                            break block0;
                            break;
                        }
                    }
                    case 15: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl337
                        var2_10 = S3.x0(var10_13, var19_4.getInt(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl333
                    }
                    case 14: {
                        if (var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) {
                            var2_10 = S3.i0(var10_13, 0L);
lbl348:
                            // 6 sources

                            while (true) {
                                var2_10 = var5_9 + var2_10;
                                var15_17 = this;
                                var16_3 /* !! */  = var1_1;
                                break block87;
                                break;
                            }
                        }
lbl353:
                        // 7 sources

                        while (true) {
                            var15_17 = this;
                            var18_18 /* !! */  = var1_1;
                            break block0;
                            break;
                        }
                    }
                    case 13: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl353
                        var2_10 = S3.t0(var10_13, 0);
                        ** GOTO lbl348
                    }
                    case 12: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl337
                        var2_10 = S3.h0(var10_13, var19_4.getInt(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl333
                    }
                    case 11: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl337
                        var2_10 = S3.A0(var10_13, var19_4.getInt(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl333
                    }
                    case 10: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl337
                        var2_10 = S3.U(var10_13, (B3)var19_4.getObject(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl333
                    }
                    case 9: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) break;
                        var2_10 = n5.a(var10_13, var19_4.getObject(var16_3 /* !! */ , var13_16), super.N(var6_6));
                        ** GOTO lbl42
                    }
                    case 8: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl337
                        var15_17 = var19_4.getObject(var16_3 /* !! */ , var13_16);
                        if (!(var15_17 instanceof B3)) ** GOTO lbl385
                        var2_10 = S3.U(var10_13, (B3)var15_17);
                        ** GOTO lbl333
lbl385:
                        // 1 sources

                        var2_10 = S3.C(var10_13, (String)var15_17);
                        ** GOTO lbl333
                    }
                    case 7: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl353
                        var2_10 = S3.D(var10_13, true);
                        ** GOTO lbl348
                    }
                    case 6: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl353
                        var2_10 = S3.l0(var10_13, 0);
                        ** GOTO lbl348
                    }
                    case 5: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl353
                        var2_10 = S3.T(var10_13, 0L);
                        ** GOTO lbl348
                    }
                    case 4: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl337
                        var2_10 = S3.p0(var10_13, var19_4.getInt(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl333
                    }
                    case 3: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** GOTO lbl337
                        var2_10 = S3.q0(var10_13, var19_4.getLong(var16_3 /* !! */ , var13_16));
                        ** GOTO lbl333
                    }
                    case 2: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** continue;
                        var2_10 = S3.c0(var10_13, var19_4.getLong(var16_3 /* !! */ , var13_16));
                        ** continue;
                    }
                    case 1: {
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) ** continue;
                        var2_10 = S3.f(var10_13, 0.0f);
                        ** continue;
                    }
                    case 0: {
                        var15_17 = var17_2;
                        var18_18 /* !! */  = var16_3 /* !! */ ;
                        if (!var17_2.z(var16_3 /* !! */ , var6_6, var7_11, var8_12, var2_10)) break;
                        var2_10 = S3.e(var10_13, 0.0);
                        ** continue;
                    }
                }
                var2_10 = var5_9;
                var16_3 /* !! */  = var18_18 /* !! */ ;
            }
            var17_2 = var15_17;
            var3_7 = var7_11;
            var4_8 = var8_12;
            var5_9 = var2_10;
        }
        var1_1 = var17_2.n;
        var2_10 = var4_8 = var5_9 + var1_1.a(var1_1.k(var16_3 /* !! */ ));
        if (var17_2.f) {
            var1_1 = var17_2.o.b(var16_3 /* !! */ );
            var2_10 = 0;
            for (var3_7 = var9_5; var3_7 < var1_1.a.a(); ++var3_7) {
                var15_17 = var1_1.a.f(var3_7);
                var2_10 += d4.b((f4)var15_17.getKey(), var15_17.getValue());
            }
            for (Object var15_17 : var1_1.a.g()) {
                var2_10 += d4.b((f4)var15_17.getKey(), var15_17.getValue());
            }
            var2_10 = var4_8 + var2_10;
        }
        return var2_10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void c(T var1_1, c6 var2_2) throws IOException {
        block162: {
            var17_3 = this;
            if (var2_2.a() != 2) break block162;
            X4.u(var17_3.n, var1_1, var2_2);
            if (!var17_3.f) ** GOTO lbl-1000
            var15_4 = var17_3.o.b(var1_1);
            if (!var15_4.a.isEmpty()) {
                var18_6 = var15_4.m();
                var15_4 = var18_6.next();
            } else lbl-1000:
            // 2 sources

            {
                var18_6 = null;
                var15_4 = null;
            }
            var3_8 = var17_3.a.length - 3;
            while (true) {
                var16_10 = var15_4;
                if (var3_8 < 0) break;
                var4_12 = var17_3.G(var3_8);
                var5_14 = var17_3.a[var3_8];
                while (var15_4 != null && var17_3.o.a(var15_4) > var5_14) {
                    var17_3.o.d(var2_2, var15_4);
                    if (var18_6.hasNext()) {
                        var15_4 = var18_6.next();
                        continue;
                    }
                    var15_4 = null;
                }
                switch ((var4_12 & 0xFF00000) >>> 20) {
                    default: {
                        break;
                    }
                    case 68: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.B(var5_14, H5.B(var1_1, var4_12 & 1048575), var17_3.N(var3_8));
                        break;
                    }
                    case 67: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.G(var5_14, X4.L(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 66: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.L(var5_14, X4.H(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 65: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.j(var5_14, X4.L(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 64: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.E(var5_14, X4.H(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 63: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.s(var5_14, X4.H(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 62: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.x(var5_14, X4.H(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 61: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.M(var5_14, (B3)H5.B(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 60: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.I(var5_14, H5.B(var1_1, var4_12 & 1048575), var17_3.N(var3_8));
                        break;
                    }
                    case 59: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        X4.t(var5_14, H5.B(var1_1, var4_12 & 1048575), var2_2);
                        break;
                    }
                    case 58: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.b(var5_14, X4.P(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 57: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.f(var5_14, X4.H(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 56: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.t(var5_14, X4.L(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 55: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.i(var5_14, X4.H(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 54: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.N(var5_14, X4.L(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 53: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.e(var5_14, X4.L(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 52: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.v(var5_14, X4.B(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 51: {
                        if (!var17_3.J(var1_1, var5_14, var3_8)) break;
                        var2_2.u(var5_14, X4.j(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 50: {
                        var17_3.v(var2_2, var5_14, H5.B(var1_1, var4_12 & 1048575), var3_8);
                        break;
                    }
                    case 49: {
                        n5.j(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, var17_3.N(var3_8));
                        break;
                    }
                    case 48: {
                        n5.W(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 47: {
                        n5.V(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 46: {
                        n5.U(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 45: {
                        n5.R(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 44: {
                        n5.z(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 43: {
                        n5.X(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 42: {
                        n5.k(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 41: {
                        n5.C(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 40: {
                        n5.F(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 39: {
                        n5.L(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 38: {
                        n5.Y(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 37: {
                        n5.O(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 36: {
                        n5.I(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 35: {
                        n5.w(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, true);
                        break;
                    }
                    case 34: {
                        n5.W(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 33: {
                        n5.V(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 32: {
                        n5.U(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 31: {
                        n5.R(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 30: {
                        n5.z(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 29: {
                        n5.X(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 28: {
                        n5.i(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2);
                        break;
                    }
                    case 27: {
                        n5.v(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, var17_3.N(var3_8));
                        break;
                    }
                    case 26: {
                        n5.u(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2);
                        break;
                    }
                    case 25: {
                        n5.k(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 24: {
                        n5.C(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 23: {
                        n5.F(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 22: {
                        n5.L(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 21: {
                        n5.Y(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 20: {
                        n5.O(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 19: {
                        n5.I(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 18: {
                        n5.w(var17_3.a[var3_8], (List)H5.B(var1_1, var4_12 & 1048575), var2_2, false);
                        break;
                    }
                    case 17: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.B(var5_14, H5.B(var1_1, var4_12 & 1048575), var17_3.N(var3_8));
                        break;
                    }
                    case 16: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.G(var5_14, H5.x(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 15: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.L(var5_14, H5.t(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 14: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.j(var5_14, H5.x(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 13: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.E(var5_14, H5.t(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 12: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.s(var5_14, H5.t(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 11: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.x(var5_14, H5.t(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 10: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.M(var5_14, (B3)H5.B(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 9: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.I(var5_14, H5.B(var1_1, var4_12 & 1048575), var17_3.N(var3_8));
                        break;
                    }
                    case 8: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        X4.t(var5_14, H5.B(var1_1, var4_12 & 1048575), var2_2);
                        break;
                    }
                    case 7: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.b(var5_14, H5.F(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 6: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.f(var5_14, H5.t(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 5: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.t(var5_14, H5.x(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 4: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.i(var5_14, H5.t(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 3: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.N(var5_14, H5.x(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 2: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.e(var5_14, H5.x(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 1: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.v(var5_14, H5.n(var1_1, var4_12 & 1048575));
                        break;
                    }
                    case 0: {
                        if (!var17_3.I(var1_1, var3_8)) break;
                        var2_2.u(var5_14, H5.a(var1_1, var4_12 & 1048575));
                    }
                }
                var3_8 -= 3;
            }
            while (var16_10 != null) {
                var17_3.o.d(var2_2, (Map.Entry<?, ?>)var16_10);
                if (var18_6.hasNext()) {
                    var16_10 = var18_6.next();
                    continue;
                }
                var16_10 = null;
            }
            return;
        }
        if (!var17_3.f) ** GOTO lbl-1000
        var15_5 = var17_3.o.b(var1_1);
        if (!var15_5.a.isEmpty()) {
            var16_11 = var15_5.p();
            var15_5 = var16_11.next();
        } else lbl-1000:
        // 2 sources

        {
            var15_5 = null;
            var16_11 = null;
        }
        var8_16 = var17_3.a.length;
        var19_17 = X4.r;
        var4_13 = 1048575;
        var3_9 = 0;
        for (var6_18 = 0; var6_18 < var8_16; var6_18 += 3) {
            var10_21 = var17_3.G(var6_18);
            var18_7 /* !! */  = var17_3.a;
            var11_22 = var18_7 /* !! */ [var6_18];
            var9_20 = (var10_21 & 0xFF00000) >>> 20;
            if (var9_20 <= 17) {
                var12_23 = var18_7 /* !! */ [var6_18 + 2];
                var7_19 = var12_23 & 1048575;
                var5_15 = var4_13;
                if (var7_19 != var4_13) {
                    var3_9 = var7_19 == 1048575 ? 0 : var19_17.getInt(var1_1, var7_19);
                    var5_15 = var7_19;
                }
                var4_13 = var3_9;
                var7_19 = 1 << (var12_23 >>> 20);
                var3_9 = var5_15;
            } else {
                var5_15 = var4_13;
                var7_19 = 0;
                var4_13 = var3_9;
                var3_9 = var5_15;
            }
            while (var15_5 != null && var17_3.o.a(var15_5) <= var11_22) {
                var17_3.o.d(var2_2, var15_5);
                if (var16_11.hasNext()) {
                    var15_5 = var16_11.next();
                    continue;
                }
                var15_5 = null;
            }
            var13_24 = var10_21 & 1048575;
            block71 : switch (var9_20) lbl-1000:
            // 56 sources

            {
                default: {
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 68: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.B(var11_22, var19_17.getObject(var1_1, var13_24), super.N(var6_18));
                    ** GOTO lbl-1000
                }
                case 67: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.G(var11_22, X4.L(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 66: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.L(var11_22, X4.H(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 65: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.j(var11_22, X4.L(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 64: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.E(var11_22, X4.H(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 63: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.s(var11_22, X4.H(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 62: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.x(var11_22, X4.H(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 61: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.M(var11_22, (B3)var19_17.getObject(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 60: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.I(var11_22, var19_17.getObject(var1_1, var13_24), super.N(var6_18));
                    ** GOTO lbl-1000
                }
                case 59: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    X4.t(var11_22, var19_17.getObject(var1_1, var13_24), var2_2);
                    ** GOTO lbl-1000
                }
                case 58: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.b(var11_22, X4.P(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 57: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.f(var11_22, X4.H(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 56: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.t(var11_22, X4.L(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 55: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.i(var11_22, X4.H(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 54: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.N(var11_22, X4.L(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 53: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.e(var11_22, X4.L(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 52: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.v(var11_22, X4.B(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 51: {
                    if (!var17_3.J(var1_1, var11_22, var6_18)) ** GOTO lbl-1000
                    var2_2.u(var11_22, X4.j(var1_1, var13_24));
                    ** GOTO lbl-1000
                }
                case 50: {
                    var17_3.v(var2_2, var11_22, var19_17.getObject(var1_1, var13_24), var6_18);
                    ** GOTO lbl-1000
                }
                case 49: {
                    n5.j(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, super.N(var6_18));
                    ** GOTO lbl-1000
                }
                case 48: {
                    n5.W(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 47: {
                    n5.V(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 46: {
                    n5.U(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 45: {
                    n5.R(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 44: {
                    n5.z(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 43: {
                    n5.X(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 42: {
                    n5.k(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 41: {
                    n5.C(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 40: {
                    n5.F(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 39: {
                    n5.L(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 38: {
                    n5.Y(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 37: {
                    n5.O(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 36: {
                    n5.I(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 35: {
                    n5.w(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, true);
                    ** GOTO lbl-1000
                }
                case 34: {
                    n5.W(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 33: {
                    n5.V(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 32: {
                    n5.U(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 31: {
                    n5.R(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 30: {
                    n5.z(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 29: {
                    n5.X(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 28: {
                    n5.i(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2);
                    ** GOTO lbl-1000
                }
                case 27: {
                    n5.v(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, super.N(var6_18));
                    ** GOTO lbl-1000
                }
                case 26: {
                    n5.u(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2);
                    ** GOTO lbl-1000
                }
                case 25: {
                    n5.k(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 24: {
                    n5.C(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 23: {
                    n5.F(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 22: {
                    n5.L(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 21: {
                    n5.Y(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 20: {
                    n5.O(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 19: {
                    n5.I(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 18: {
                    n5.w(var17_3.a[var6_18], (List)var19_17.getObject(var1_1, var13_24), var2_2, false);
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 17: {
                    var18_7 /* !! */  = (int[])var17_3;
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) break;
                    var2_2.B(var11_22, var19_17.getObject(var1_1, var13_24), super.N(var6_18));
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 16: {
                    if (var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) {
                        var2_2.G(var11_22, var19_17.getLong(var1_1, var13_24));
                    }
lbl519:
                    // 31 sources

                    while (true) {
                        var18_7 /* !! */  = (int[])this;
                        break block71;
                        break;
                    }
                }
                case 15: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.L(var11_22, var19_17.getInt(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 14: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.j(var11_22, var19_17.getLong(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 13: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.E(var11_22, var19_17.getInt(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 12: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.s(var11_22, var19_17.getInt(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 11: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.x(var11_22, var19_17.getInt(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 10: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.M(var11_22, (B3)var19_17.getObject(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 9: {
                    var18_7 /* !! */  = (int[])var17_3;
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) break;
                    var2_2.I(var11_22, var19_17.getObject(var1_1, var13_24), super.N(var6_18));
                    var18_7 /* !! */  = (int[])var17_3;
                    break;
                }
                case 8: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    X4.t(var11_22, var19_17.getObject(var1_1, var13_24), var2_2);
                    ** GOTO lbl519
                }
                case 7: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.b(var11_22, H5.F(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 6: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.f(var11_22, var19_17.getInt(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 5: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.t(var11_22, var19_17.getLong(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 4: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.i(var11_22, var19_17.getInt(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 3: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.N(var11_22, var19_17.getLong(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 2: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.e(var11_22, var19_17.getLong(var1_1, var13_24));
                    ** GOTO lbl519
                }
                case 1: {
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) ** GOTO lbl519
                    var2_2.v(var11_22, H5.n(var1_1, var13_24));
                    ** continue;
                }
                case 0: {
                    var18_7 /* !! */  = (int[])var17_3;
                    if (!var17_3.z(var1_1, var6_18, var3_9, var4_13, var7_19)) break;
                    var2_2.u(var11_22, H5.a(var1_1, var13_24));
                    var18_7 /* !! */  = (int[])var17_3;
                }
            }
            var5_15 = var4_13;
            var17_3 = var18_7 /* !! */ ;
            var4_13 = var3_9;
            var3_9 = var5_15;
        }
        while (var15_5 != null) {
            var17_3.o.d(var2_2, var15_5);
            if (var16_11.hasNext()) {
                var15_5 = var16_11.next();
                continue;
            }
            var15_5 = null;
        }
        X4.u(var17_3.n, var1_1, var2_2);
    }

    @Override
    public final boolean d(T object) {
        int n8 = 1048575;
        int n9 = 0;
        for (int i8 = 0; i8 < this.j; ++i8) {
            int n10 = this.i[i8];
            int n11 = this.a[n10];
            int n12 = this.G(n10);
            int n13 = this.a[n10 + 2];
            int n14 = n13 & 0xFFFFF;
            n13 = 1 << (n13 >>> 20);
            if (n14 != n8) {
                if (n14 != 1048575) {
                    n9 = r.getInt(object, n14);
                }
                n8 = n14;
            }
            if ((0x10000000 & n12) != 0 && !this.z(object, n10, n8, n9, n13)) {
                return false;
            }
            n14 = (0xFF00000 & n12) >>> 20;
            if (n14 != 9 && n14 != 17) {
                List list;
                if (n14 != 27) {
                    if (n14 != 60 && n14 != 68) {
                        if (n14 != 49) {
                            if (n14 != 50 || this.p.d(H5.B(object, n12 & 0xFFFFF)).isEmpty()) continue;
                            object = this.Q(n10);
                            this.p.b(object);
                            throw null;
                        }
                    } else {
                        if (!this.J(object, n11, n10) || X4.A(object, n12, this.N(n10))) continue;
                        return false;
                    }
                }
                if ((list = (List)H5.B(object, n12 & 0xFFFFF)).isEmpty()) continue;
                l5 l52 = this.N(n10);
                for (n14 = 0; n14 < list.size(); ++n14) {
                    if (l52.d(list.get(n14))) continue;
                    return false;
                }
                continue;
            }
            if (!this.z(object, n10, n8, n9, n13) || X4.A(object, n12, this.N(n10))) continue;
            return false;
        }
        return !this.f || this.o.b(object).s();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void e(T var1_1) {
        block8: {
            if (!X4.T(var1_1)) break block8;
            var7_2 = var1_1 instanceof k4;
            var2_3 = 0;
            if (var7_2) {
                var8_4 = (k4)var1_1;
                var8_4.m(0x7FFFFFFF);
                var8_4.zza = 0;
                var8_4.G();
            }
            var3_5 = this.a.length;
            while (var2_3 < var3_5) {
                var4_6 = this.G(var2_3);
                var5_7 = 1048575 & var4_6;
                if ((var4_6 = (var4_6 & 0xFF00000) >>> 20) == 9) ** GOTO lbl-1000
                if (var4_6 == 60 || var4_6 == 68) ** GOTO lbl27
                switch (var4_6) {
                    default: {
                        break;
                    }
                    case 50: {
                        var8_4 = X4.r;
                        var9_8 = var8_4.getObject(var1_1, var5_7);
                        if (var9_8 == null) break;
                        var8_4.putObject(var1_1, var5_7, this.p.e(var9_8));
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
                        this.m.a(var1_1, var5_7);
                        break;
                    }
lbl27:
                    // 1 sources

                    if (!this.J(var1_1, this.a[var2_3], var2_3)) break;
                    this.N(var2_3).e(X4.r.getObject(var1_1, var5_7));
                    break;
                    case 17: lbl-1000:
                    // 2 sources

                    {
                        if (!this.I(var1_1, var2_3)) break;
                        this.N(var2_3).e(X4.r.getObject(var1_1, var5_7));
                    }
                }
                var2_3 += 3;
            }
            this.n.l(var1_1);
            if (this.f) {
                this.o.g(var1_1);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int f(T var1_1) {
        var5_2 = this.a.length;
        var3_4 = 0;
        for (var4_3 = 0; var4_3 < var5_2; var4_3 += 3) {
            var7_7 = this.G(var4_3);
            var6_6 = this.a[var4_3];
            var8_8 = 1048575 & var7_7;
            var2_5 = 37;
            block0 : switch ((var7_7 & 0xFF00000) >>> 20) {
                default: {
                    var2_5 = var3_4;
                    break;
                }
                case 68: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var10_9 = H5.B(var1_1, var8_8);
                    var2_5 = var3_4 * 53;
                    var3_4 = var10_9.hashCode();
lbl18:
                    // 36 sources

                    while (true) {
                        var2_5 += var3_4;
                        break block0;
                        break;
                    }
                }
                case 67: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(X4.L(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 66: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = X4.H(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 65: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(X4.L(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 64: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = X4.H(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 63: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = X4.H(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 62: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = X4.H(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 61: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = H5.B(var1_1, var8_8).hashCode();
                    ** GOTO lbl18
                }
                case 60: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var10_9 = H5.B(var1_1, var8_8);
                    var2_5 = var3_4 * 53;
                    var3_4 = var10_9.hashCode();
                    ** GOTO lbl18
                }
                case 59: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = ((String)H5.B(var1_1, var8_8)).hashCode();
                    ** GOTO lbl18
                }
                case 58: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.c(X4.P(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 57: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = X4.H(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 56: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(X4.L(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 55: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = X4.H(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 54: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(X4.L(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 53: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(X4.L(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 52: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = Float.floatToIntBits(X4.B(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 51: {
                    var2_5 = var3_4;
                    if (!this.J(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(Double.doubleToLongBits(X4.j(var1_1, var8_8)));
                    ** GOTO lbl18
                }
                case 50: {
                    var2_5 = var3_4 * 53;
                    var3_4 = H5.B(var1_1, var8_8).hashCode();
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
                    var2_5 = var3_4 * 53;
                    var3_4 = H5.B(var1_1, var8_8).hashCode();
                    ** GOTO lbl18
                }
                case 17: {
                    var10_9 = H5.B(var1_1, var8_8);
                    if (var10_9 != null) {
                        var2_5 = var10_9.hashCode();
                    }
lbl136:
                    // 5 sources

                    while (true) {
                        var2_5 = var3_4 * 53 + var2_5;
                        break block0;
                        break;
                    }
                }
                case 16: {
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(H5.x(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 15: {
                    var2_5 = var3_4 * 53;
                    var3_4 = H5.t(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 14: {
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(H5.x(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 13: {
                    var2_5 = var3_4 * 53;
                    var3_4 = H5.t(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 12: {
                    var2_5 = var3_4 * 53;
                    var3_4 = H5.t(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 11: {
                    var2_5 = var3_4 * 53;
                    var3_4 = H5.t(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 10: {
                    var2_5 = var3_4 * 53;
                    var3_4 = H5.B(var1_1, var8_8).hashCode();
                    ** GOTO lbl18
                }
                case 9: {
                    var10_9 = H5.B(var1_1, var8_8);
                    if (var10_9 == null) ** GOTO lbl136
                    var2_5 = var10_9.hashCode();
                    ** continue;
                }
                case 8: {
                    var2_5 = var3_4 * 53;
                    var3_4 = ((String)H5.B(var1_1, var8_8)).hashCode();
                    ** GOTO lbl18
                }
                case 7: {
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.c(H5.F(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 6: {
                    var2_5 = var3_4 * 53;
                    var3_4 = H5.t(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 5: {
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(H5.x(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 4: {
                    var2_5 = var3_4 * 53;
                    var3_4 = H5.t(var1_1, var8_8);
                    ** GOTO lbl18
                }
                case 3: {
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(H5.x(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 2: {
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(H5.x(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 1: {
                    var2_5 = var3_4 * 53;
                    var3_4 = Float.floatToIntBits(H5.n(var1_1, var8_8));
                    ** GOTO lbl18
                }
                case 0: {
                    var2_5 = var3_4 * 53;
                    var3_4 = m4.b(Double.doubleToLongBits(H5.a(var1_1, var8_8)));
                    ** continue;
                }
            }
            var3_4 = var2_5;
        }
        var2_5 = var3_4 = var3_4 * 53 + this.n.k(var1_1).hashCode();
        if (this.f) {
            var2_5 = var3_4 * 53 + this.o.b(var1_1).hashCode();
        }
        return var2_5;
    }

    @Override
    public final void g(T t8, T t9) {
        X4.R(t8);
        t9.getClass();
        block26: for (int i8 = 0; i8 < this.a.length; i8 += 3) {
            int n8 = this.G(i8);
            long l8 = 0xFFFFF & n8;
            int n9 = this.a[i8];
            switch ((n8 & 0xFF00000) >>> 20) {
                default: {
                    continue block26;
                }
                case 68: {
                    this.F(t8, t9, i8);
                    continue block26;
                }
                case 61: 
                case 62: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 67: {
                    if (!this.J(t9, n9, i8)) continue block26;
                    H5.j(t8, l8, H5.B(t9, l8));
                    this.E(t8, n9, i8);
                    continue block26;
                }
                case 60: {
                    this.F(t8, t9, i8);
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
                    if (!this.J(t9, n9, i8)) continue block26;
                    H5.j(t8, l8, H5.B(t9, l8));
                    this.E(t8, n9, i8);
                    continue block26;
                }
                case 50: {
                    n5.m(this.p, t8, t9, l8);
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
                    this.m.b(t8, t9, l8);
                    continue block26;
                }
                case 17: {
                    this.y(t8, t9, i8);
                    continue block26;
                }
                case 16: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.i(t8, l8, H5.x(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 15: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.h(t8, l8, H5.t(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 14: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.i(t8, l8, H5.x(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 13: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.h(t8, l8, H5.t(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 12: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.h(t8, l8, H5.t(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 11: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.h(t8, l8, H5.t(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 10: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.j(t8, l8, H5.B(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 9: {
                    this.y(t8, t9, i8);
                    continue block26;
                }
                case 8: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.j(t8, l8, H5.B(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 7: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.v(t8, l8, H5.F(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 6: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.h(t8, l8, H5.t(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 5: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.i(t8, l8, H5.x(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 4: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.h(t8, l8, H5.t(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 3: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.i(t8, l8, H5.x(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 2: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.i(t8, l8, H5.x(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 1: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.g(t8, l8, H5.n(t9, l8));
                    this.D(t8, i8);
                    continue block26;
                }
                case 0: {
                    if (!this.I(t9, i8)) continue block26;
                    H5.f(t8, l8, H5.a(t9, l8));
                    this.D(t8, i8);
                }
            }
        }
        n5.n(this.n, t8, t9);
        if (this.f) {
            n5.l(this.o, t8, t9);
        }
    }

    @Override
    public final void h(T t8, byte[] byArray, int n8, int n9, v3 v32) throws IOException {
        this.m(t8, byArray, n8, n9, 0, v32);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean i(T t8, T t9) {
        int n8 = this.a.length;
        int n9 = 0;
        while (true) {
            boolean bl = true;
            if (n9 >= n8) break;
            int n10 = this.G(n9);
            long l8 = n10 & 0xFFFFF;
            switch ((n10 & 0xFF00000) >>> 20) {
                default: {
                    break;
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
                    long l9 = this.C(n9) & 0xFFFFF;
                    if (H5.t(t8, l9) != H5.t(t9, l9)) return false;
                    if (n5.p(H5.B(t8, l8), H5.B(t9, l8))) break;
                    return false;
                }
                case 50: {
                    bl = n5.p(H5.B(t8, l8), H5.B(t9, l8));
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
                    bl = n5.p(H5.B(t8, l8), H5.B(t9, l8));
                    break;
                }
                case 17: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (n5.p(H5.B(t8, l8), H5.B(t9, l8))) break;
                    return false;
                }
                case 16: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.x(t8, l8) == H5.x(t9, l8)) break;
                    return false;
                }
                case 15: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.t(t8, l8) == H5.t(t9, l8)) break;
                    return false;
                }
                case 14: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.x(t8, l8) == H5.x(t9, l8)) break;
                    return false;
                }
                case 13: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.t(t8, l8) == H5.t(t9, l8)) break;
                    return false;
                }
                case 12: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.t(t8, l8) == H5.t(t9, l8)) break;
                    return false;
                }
                case 11: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.t(t8, l8) == H5.t(t9, l8)) break;
                    return false;
                }
                case 10: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (n5.p(H5.B(t8, l8), H5.B(t9, l8))) break;
                    return false;
                }
                case 9: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (n5.p(H5.B(t8, l8), H5.B(t9, l8))) break;
                    return false;
                }
                case 8: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (n5.p(H5.B(t8, l8), H5.B(t9, l8))) break;
                    return false;
                }
                case 7: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.F(t8, l8) == H5.F(t9, l8)) break;
                    return false;
                }
                case 6: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.t(t8, l8) == H5.t(t9, l8)) break;
                    return false;
                }
                case 5: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.x(t8, l8) == H5.x(t9, l8)) break;
                    return false;
                }
                case 4: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.t(t8, l8) == H5.t(t9, l8)) break;
                    return false;
                }
                case 3: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.x(t8, l8) == H5.x(t9, l8)) break;
                    return false;
                }
                case 2: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (H5.x(t8, l8) == H5.x(t9, l8)) break;
                    return false;
                }
                case 1: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (Float.floatToIntBits(H5.n(t8, l8)) == Float.floatToIntBits(H5.n(t9, l8))) break;
                    return false;
                }
                case 0: {
                    if (!this.K(t8, t9, n9)) return false;
                    if (Double.doubleToLongBits(H5.a(t8, l8)) == Double.doubleToLongBits(H5.a(t9, l8))) break;
                    return false;
                }
            }
            if (!bl) {
                return false;
            }
            n9 += 3;
        }
        if (!this.n.k(t8).equals(this.n.k(t9))) {
            return false;
        }
        if (!this.f) return true;
        return this.o.b(t8).equals(this.o.b(t9));
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final int m(T var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, v3 var6_6) throws IOException {
        block146: {
            var27_7 = this;
            var25_8 /* !! */  = var1_1 /* !! */ ;
            var28_9 = var2_2 /* !! */ ;
            var9_10 = var4_4;
            var29_11 = var6_6;
            X4.R(var25_8 /* !! */ );
            var26_12 = X4.r;
            var11_13 = -1;
            var12_14 = 0;
            var8_15 = 1048575;
            var7_16 = 0;
            var10_17 = 0;
            block48: while (var3_3 < var9_10) {
                block155: {
                    block148: {
                        block145: {
                            block154: {
                                block151: {
                                    block152: {
                                        block153: {
                                            block144: {
                                                block150: {
                                                    block149: {
                                                        block147: {
                                                            var10_17 = var3_3 + 1;
                                                            var9_10 = var13_18 = var28_9[var3_3];
                                                            var3_3 = var10_17;
                                                            if (var13_18 < 0) {
                                                                var3_3 = w3.e(var13_18, (byte[])var28_9, var10_17, (v3)var29_11);
                                                                var9_10 = var29_11.a;
                                                            }
                                                            var10_17 = var9_10;
                                                            var13_18 = var10_17 >>> 3;
                                                            var17_22 = var10_17 & 7;
                                                            if (var13_18 > var11_13) {
                                                                var11_13 = var12_14 / 3;
                                                                var11_13 = var13_18 >= var27_7.c && var13_18 <= var27_7.d ? super.l(var13_18, var11_13) : -1;
                                                            } else {
                                                                var11_13 = var27_7.k(var13_18);
                                                            }
                                                            if (var11_13 != -1) break block147;
                                                            var27_7 = var6_6;
                                                            var11_13 = 0;
                                                            var10_17 = var3_3;
                                                            var3_3 = var8_15;
                                                            var8_15 = var7_16;
                                                            break block148;
                                                        }
                                                        var30_28 = var27_7.a;
                                                        var18_23 = var30_28[var11_13 + 1];
                                                        var19_24 = (var18_23 & 0xFF00000) >>> 20;
                                                        var21_26 = var18_23 & 1048575;
                                                        if (var19_24 > 17) break block149;
                                                        var12_14 = var30_28[var11_13 + 2];
                                                        var14_19 = 1 << (var12_14 >>> 20);
                                                        if ((var12_14 &= 1048575) != var8_15) {
                                                            if (var8_15 != 1048575) {
                                                                var26_12.putInt(var25_8 /* !! */ , var8_15, var7_16);
                                                            }
                                                            var7_16 = var12_14 == 1048575 ? 0 : var26_12.getInt(var25_8 /* !! */ , var12_14);
                                                            var8_15 = var12_14;
                                                            var12_14 = var7_16;
                                                            var7_16 = var8_15;
                                                            var8_15 = var12_14;
                                                        } else {
                                                            var12_14 = var8_15;
                                                            var8_15 = var7_16;
                                                            var7_16 = var12_14;
                                                        }
                                                        block0 : switch (var19_24) {
                                                            default: {
                                                                var27_7 = var25_8 /* !! */ ;
                                                                var27_7 = var2_2 /* !! */ ;
                                                                var12_14 = var3_3;
                                                                var27_7 = var6_6;
                                                                var28_9 = var26_12;
                                                                break;
                                                            }
                                                            case 17: {
                                                                if (var17_22 == 3) {
                                                                    var28_9 = super.p(var25_8 /* !! */ , var11_13);
                                                                    var3_3 = w3.i(var28_9, super.N(var11_13), var2_2 /* !! */ , var3_3, var4_4, var13_18 << 3 | 4, var6_6);
                                                                    super.x(var25_8 /* !! */ , var11_13, var28_9);
                                                                    var8_15 |= var14_19;
lbl69:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var10_17 = var7_16;
                                                                        var7_16 = var8_15;
                                                                        var28_9 = var2_2 /* !! */ ;
                                                                        var8_15 = var10_17;
lbl74:
                                                                        // 3 sources

                                                                        while (true) {
                                                                            var28_9 = var2_2 /* !! */ ;
                                                                            var10_17 = var9_10;
                                                                            var12_14 = var11_13;
                                                                            var29_11 = var6_6;
                                                                            var9_10 = var4_4;
                                                                            var11_13 = var13_18;
                                                                            continue block48;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                var27_7 = var25_8 /* !! */ ;
                                                                var27_7 = var2_2 /* !! */ ;
                                                                var27_7 = var6_6;
                                                                var12_14 = var3_3;
                                                                var28_9 = var26_12;
                                                                break;
                                                            }
                                                            case 16: {
                                                                if (var17_22 == 0) {
                                                                    var3_3 = w3.q(var2_2 /* !! */ , var3_3, var6_6);
                                                                    var26_12.putLong(var25_8 /* !! */ , var21_26, P3.b(var6_6.b));
                                                                    var8_15 |= var14_19;
                                                                    ** continue;
                                                                }
lbl94:
                                                                // 5 sources

                                                                while (true) {
                                                                    var27_7 = var2_2 /* !! */ ;
                                                                    var27_7 = var6_6;
lbl97:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var27_7 = var2_2 /* !! */ ;
                                                                        var27_7 = var6_6;
                                                                        var27_7 = var25_8 /* !! */ ;
                                                                        var12_14 = var3_3;
                                                                        var28_9 = var26_12;
                                                                        break block0;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            case 15: {
                                                                if (var17_22 != 0) ** GOTO lbl94
                                                                var3_3 = w3.p(var2_2 /* !! */ , var3_3, var6_6);
                                                                var26_12.putInt(var25_8 /* !! */ , var21_26, P3.e(var6_6.a));
lbl108:
                                                                // 3 sources

                                                                while (true) {
                                                                    var28_9 = var2_2 /* !! */ ;
                                                                    var29_11 = var6_6;
                                                                    var12_14 = var11_13;
                                                                    var11_13 = var13_18;
                                                                    var13_18 = var8_15 | var14_19;
                                                                    var9_10 = var4_4;
                                                                    var8_15 = var7_16;
                                                                    var7_16 = var13_18;
                                                                    continue block48;
                                                                    break;
                                                                }
                                                            }
                                                            case 12: {
                                                                if (var17_22 != 0) ** GOTO lbl94
                                                                var3_3 = w3.p(var2_2 /* !! */ , var3_3, var6_6);
                                                                var9_10 = var6_6.a;
                                                                var28_9 = super.M(var11_13);
                                                                if ((-2147483648 & var18_23) != 0 && var28_9 != null && !var28_9.d(var9_10)) {
                                                                    X4.O(var25_8 /* !! */ ).e(var10_17, var9_10);
                                                                    var28_9 = var2_2 /* !! */ ;
                                                                    var28_9 = var6_6;
                                                                    var9_10 = var11_13;
                                                                    var14_19 = var8_15;
                                                                    var8_15 = var3_3;
lbl130:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var29_11 = var6_6;
                                                                        var28_9 = var2_2 /* !! */ ;
                                                                        var12_14 = var11_13;
                                                                        var9_10 = var4_4;
                                                                        var11_13 = var13_18;
                                                                        var3_3 = var8_15;
                                                                        var8_15 = var7_16;
                                                                        var7_16 = var14_19;
                                                                        continue block48;
                                                                        break;
                                                                    }
                                                                }
                                                                var26_12.putInt(var25_8 /* !! */ , var21_26, var9_10);
                                                                ** GOTO lbl108
                                                            }
                                                            case 10: {
                                                                if (var17_22 == 2) ** break;
                                                                ** continue;
                                                                var3_3 = w3.k(var2_2 /* !! */ , var3_3, var6_6);
                                                                var26_12.putObject(var25_8 /* !! */ , var21_26, var6_6.c);
                                                                ** continue;
                                                            }
                                                            case 9: {
                                                                if (var17_22 == 2) {
                                                                    var29_11 = super.p(var25_8 /* !! */ , var11_13);
                                                                    var30_28 = super.N(var11_13);
                                                                    var28_9 = var6_6;
                                                                    var9_10 = w3.j(var29_11, (l5)var30_28, var2_2 /* !! */ , var3_3, var4_4, (v3)var28_9);
                                                                    super.x(var25_8 /* !! */ , var11_13, var29_11);
                                                                    var3_3 = var8_15 | var14_19;
                                                                    var28_9 = var2_2 /* !! */ ;
                                                                    var8_15 = var9_10;
lbl158:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var28_9 = var6_6;
                                                                        var28_9 = var2_2 /* !! */ ;
lbl161:
                                                                        // 3 sources

                                                                        while (true) {
                                                                            var28_9 = var6_6;
                                                                            var28_9 = var2_2 /* !! */ ;
                                                                            var9_10 = var11_13;
                                                                            var14_19 = var3_3;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                var27_7 = var2_2 /* !! */ ;
                                                                var27_7 = var6_6;
                                                                ** continue;
                                                            }
                                                            case 8: {
                                                                if (var17_22 == 2) {
                                                                    if (X4.S(var18_23)) {
                                                                        var3_3 = w3.n(var2_2 /* !! */ , var3_3, var6_6);
                                                                    } else {
                                                                        var3_3 = w3.p(var2_2 /* !! */ , var3_3, var6_6);
                                                                        var9_10 = var6_6.a;
                                                                        if (var9_10 < 0) throw s4.d();
                                                                        if (var9_10 == 0) {
                                                                            var6_6.c = "";
                                                                        } else {
                                                                            var6_6.c = new String(var2_2 /* !! */ , var3_3, var9_10, m4.a);
                                                                            var3_3 += var9_10;
                                                                        }
                                                                    }
                                                                    var26_12.putObject(var25_8 /* !! */ , var21_26, var6_6.c);
lbl184:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var9_10 = var8_15 | var14_19;
                                                                        var28_9 = var2_2 /* !! */ ;
                                                                        var28_9 = var6_6;
                                                                        var8_15 = var3_3;
                                                                        var3_3 = var9_10;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
lbl191:
                                                                // 4 sources

                                                                while (true) {
                                                                    var27_7 = var2_2 /* !! */ ;
                                                                    var27_7 = var6_6;
                                                                    var27_7 = var25_8 /* !! */ ;
                                                                    var12_14 = var3_3;
                                                                    var28_9 = var26_12;
                                                                    break block0;
                                                                    break;
                                                                }
                                                            }
                                                            case 7: {
                                                                if (var17_22 != 0) ** GOTO lbl191
                                                                var3_3 = w3.q(var2_2 /* !! */ , var3_3, var6_6);
                                                                var20_25 = var6_6.b != 0L;
                                                                H5.v(var25_8 /* !! */ , var21_26, var20_25);
                                                                ** continue;
                                                            }
                                                            case 6: 
                                                            case 13: {
                                                                if (var17_22 == 5) ** break;
                                                                ** continue;
                                                                var26_12.putInt(var25_8 /* !! */ , var21_26, w3.o(var2_2 /* !! */ , var3_3));
                                                                var3_3 += 4;
                                                                var28_9 = var2_2 /* !! */ ;
                                                                var10_17 = var8_15 | var14_19;
                                                                var8_15 = var7_16;
                                                                var7_16 = var10_17;
                                                                ** GOTO lbl74
                                                            }
                                                            case 5: 
                                                            case 14: {
                                                                if (var17_22 != 1) ** GOTO lbl228
                                                                var23_27 = w3.r(var2_2 /* !! */ , var3_3);
                                                                var26_12.putLong(var25_8 /* !! */ , var21_26, var23_27);
                                                                var3_3 += 8;
lbl219:
                                                                // 2 sources

                                                                while (true) {
                                                                    var8_15 |= var14_19;
lbl221:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var9_10 = var8_15;
                                                                        var28_9 = var2_2 /* !! */ ;
                                                                        var28_9 = var6_6;
                                                                        var8_15 = var3_3;
                                                                        var3_3 = var9_10;
                                                                        ** GOTO lbl161
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl228:
                                                                // 3 sources

                                                                while (true) {
                                                                    var27_7 = var2_2 /* !! */ ;
                                                                    var12_14 = var3_3;
                                                                    var27_7 = var6_6;
                                                                    var27_7 = var25_8 /* !! */ ;
                                                                    var28_9 = var26_12;
                                                                    break block0;
                                                                    break;
                                                                }
                                                            }
                                                            case 4: 
                                                            case 11: {
                                                                if (var17_22 != 0) ** GOTO lbl228
                                                                var3_3 = w3.p(var2_2 /* !! */ , var3_3, var6_6);
                                                                var26_12.putInt(var25_8 /* !! */ , var21_26, var6_6.a);
                                                                ** continue;
                                                            }
                                                            case 2: 
                                                            case 3: {
                                                                if (var17_22 != 0) ** continue;
                                                                var9_10 = w3.q(var2_2 /* !! */ , var3_3, var6_6);
                                                                var26_12.putLong(var25_8 /* !! */ , var21_26, var6_6.b);
                                                                var3_3 = var8_15 | var14_19;
                                                                var28_9 = var2_2 /* !! */ ;
                                                                var28_9 = var6_6;
                                                                var8_15 = var9_10;
                                                                ** continue;
                                                            }
                                                            case 1: {
                                                                var28_9 = var26_12;
                                                                var29_11 = var25_8 /* !! */ ;
                                                                var30_28 = var2_2 /* !! */ ;
                                                                var12_14 = var3_3;
                                                                var31_29 = var6_6;
                                                                if (var17_22 != 5) break;
                                                                H5.g(var29_11, var21_26, w3.m((byte[])var30_28, var12_14));
                                                                var3_3 = var12_14 + 4;
lbl258:
                                                                // 2 sources

                                                                while (true) {
                                                                    var8_15 |= var14_19;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                            }
                                                            case 0: {
                                                                var28_9 = var26_12;
                                                                var29_11 = var25_8 /* !! */ ;
                                                                var30_28 = var2_2 /* !! */ ;
                                                                var12_14 = var3_3;
                                                                var31_29 = var6_6;
                                                                if (var17_22 != 1) break;
                                                                H5.f(var29_11, var21_26, w3.a((byte[])var30_28, var12_14));
                                                                var3_3 = var12_14 + 8;
                                                                ** continue;
                                                            }
                                                        }
                                                        var26_12 = var2_2 /* !! */ ;
                                                        var27_7 = var6_6;
                                                        var26_12 = var28_9;
                                                        var12_14 = var3_3;
                                                        var3_3 = var7_16;
                                                        var10_17 = var12_14;
                                                        break block148;
                                                    }
                                                    var14_19 = var11_13;
                                                    if (var19_24 != 27) break block150;
                                                    if (var17_22 == 2) {
                                                        var29_11 = (t4)var26_12.getObject(var25_8 /* !! */ , var21_26);
                                                        var28_9 = var29_11;
                                                        if (!var29_11.c()) {
                                                            var12_14 = var29_11.size();
                                                            var12_14 = var12_14 == 0 ? 10 : (var12_14 <<= 1);
                                                            var28_9 = var29_11.d(var12_14);
                                                            var26_12.putObject(var25_8 /* !! */ , var21_26, var28_9);
                                                        }
                                                        var29_11 = super.N(var14_19);
                                                        var25_8 /* !! */  = (T)var2_2 /* !! */ ;
                                                        var3_3 = w3.f(var29_11, var10_17, var25_8 /* !! */ , var3_3, var4_4, var28_9, var6_6);
                                                        var25_8 /* !! */  = var1_1 /* !! */ ;
                                                        ** continue;
                                                    }
                                                    break block151;
                                                }
                                                var12_14 = var3_3;
                                                if (var19_24 > 49) break block152;
                                                var29_11 = var26_12;
                                                var23_27 = var18_23;
                                                var31_29 = X4.r;
                                                var28_9 = (t4)var31_29.getObject(var25_8 /* !! */ , var21_26);
                                                var30_28 = var28_9;
                                                if (!var28_9.c()) {
                                                    var11_13 = var28_9.size();
                                                    var11_13 = var11_13 == 0 ? 10 : (var11_13 <<= 1);
                                                    var30_28 = var28_9.d(var11_13);
                                                    var31_29.putObject(var25_8 /* !! */ , var21_26, var30_28);
                                                }
                                                block16 : switch (var19_24) lbl-1000:
                                                // 2 sources

                                                {
                                                    default: {
                                                        var11_13 = var3_3;
                                                        var28_9 = var6_6;
                                                        var10_17 = var4_4;
                                                        var28_9 = var25_8 /* !! */ ;
                                                        break;
                                                    }
                                                    case 49: {
                                                        if (var17_22 != 3) ** GOTO lbl-1000
                                                        var28_9 = super.N(var14_19);
                                                        var11_13 = var10_17 & -8 | 4;
                                                        var26_12 = var2_2 /* !! */ ;
                                                        var3_3 = w3.g((l5)var28_9, (byte[])var26_12, var12_14, var4_4, var11_13, var6_6);
                                                        var30_28.add(var6_6.c);
                                                        while (var3_3 < var4_4) {
                                                            var15_20 = w3.p((byte[])var26_12, var3_3, var6_6);
                                                            if (var10_17 != var6_6.a) break;
                                                            var3_3 = w3.g((l5)var28_9, (byte[])var26_12, var15_20, var4_4, var11_13, var6_6);
                                                            var30_28.add(var6_6.c);
                                                        }
                                                        var11_13 = var4_4;
                                                        var11_13 = var7_16;
                                                        var26_12 = var6_6;
                                                        var26_12 = var29_11;
                                                        var10_17 = var12_14;
                                                        var7_16 = var8_15;
                                                        var8_15 = var11_13;
                                                        break block144;
                                                    }
                                                    case 34: 
                                                    case 48: {
                                                        if (var17_22 == 2) {
                                                            var26_12 = (F4)var30_28;
                                                            var11_13 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                            var10_17 = var6_6.a + var11_13;
                                                            while (var11_13 < var10_17) {
                                                                var11_13 = w3.q(var2_2 /* !! */ , var11_13, var6_6);
                                                                var26_12.g(P3.b(var6_6.b));
                                                            }
                                                            var26_12 = var29_11;
                                                            if (var11_13 != var10_17) throw s4.f();
lbl349:
                                                            // 6 sources

                                                            while (true) {
                                                                var10_17 = var4_4;
                                                                var10_17 = var3_3;
lbl352:
                                                                // 2 sources

                                                                while (true) {
                                                                    var10_17 = var4_4;
                                                                    var10_17 = var3_3;
lbl355:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var10_17 = var4_4;
                                                                        var12_14 = var7_16;
                                                                        var7_16 = var8_15;
                                                                        var8_15 = var9_10;
                                                                        var28_9 = var2_2 /* !! */ ;
                                                                        var28_9 = var6_6;
                                                                        var10_17 = var3_3;
                                                                        var3_3 = var11_13;
                                                                        var8_15 = var12_14;
                                                                        break block144;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        if (var17_22 != 0) ** GOTO lbl381
                                                        var28_9 = (F4)var30_28;
                                                        var12_14 = w3.q(var2_2 /* !! */ , var12_14, var6_6);
                                                        var28_9.g(P3.b(var6_6.b));
                                                        while (true) {
                                                            var11_13 = var12_14;
                                                            var26_12 = var29_11;
                                                            if (var12_14 >= var4_4) ** GOTO lbl349
                                                            var15_20 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                            var11_13 = var12_14;
                                                            var26_12 = var29_11;
                                                            if (var10_17 != var6_6.a) ** GOTO lbl349
                                                            var12_14 = w3.q(var2_2 /* !! */ , var15_20, var6_6);
                                                            var28_9.g(P3.b(var6_6.b));
                                                        }
lbl381:
                                                        // 2 sources

                                                        while (true) {
                                                            var11_13 = var4_4;
                                                            var11_13 = var3_3;
                                                            var28_9 = var6_6;
                                                            var28_9 = var25_8 /* !! */ ;
                                                            break block16;
                                                            break;
                                                        }
                                                    }
                                                    case 33: 
                                                    case 47: {
                                                        if (var17_22 != 2) ** GOTO lbl399
                                                        var26_12 = (n4)var30_28;
                                                        var11_13 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                        var10_17 = var6_6.a + var11_13;
                                                        while (var11_13 < var10_17) {
                                                            var11_13 = w3.p(var2_2 /* !! */ , var11_13, var6_6);
                                                            var26_12.i(P3.e(var6_6.a));
                                                        }
                                                        if (var11_13 != var10_17) throw s4.f();
                                                        var26_12 = var29_11;
                                                        ** GOTO lbl349
lbl399:
                                                        // 1 sources

                                                        if (var17_22 != 0) ** continue;
                                                        var28_9 = (n4)var30_28;
                                                        var12_14 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                        var28_9.i(P3.e(var6_6.a));
                                                        while (true) {
                                                            var11_13 = var12_14;
                                                            var26_12 = var29_11;
                                                            if (var12_14 >= var4_4) ** GOTO lbl349
                                                            var15_20 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                            var11_13 = var12_14;
                                                            var26_12 = var29_11;
                                                            if (var10_17 == var6_6.a) ** break;
                                                            ** continue;
                                                            var12_14 = w3.p(var2_2 /* !! */ , var15_20, var6_6);
                                                            var28_9.i(P3.e(var6_6.a));
                                                        }
                                                    }
                                                    case 30: 
                                                    case 44: {
                                                        if (var17_22 != 2) ** GOTO lbl419
                                                        var10_17 = w3.l(var2_2 /* !! */ , var12_14, var30_28, var6_6);
                                                        ** GOTO lbl421
lbl419:
                                                        // 1 sources

                                                        if (var17_22 != 0) ** GOTO lbl441
                                                        var10_17 = w3.c(var10_17, var2_2 /* !! */ , var12_14, var4_4, var30_28, var6_6);
lbl421:
                                                        // 2 sources

                                                        n5.h(var25_8 /* !! */ , var13_18, (List<Integer>)var30_28, super.M(var14_19), null, var27_7.n);
                                                        var25_8 /* !! */  = var6_6;
                                                        var25_8 /* !! */  = (T)var2_2 /* !! */ ;
                                                        var11_13 = var4_4;
                                                        var11_13 = var3_3;
                                                        var11_13 = var7_16;
                                                        var7_16 = var10_17;
lbl429:
                                                        // 2 sources

                                                        while (true) {
                                                            var10_17 = var4_4;
                                                            var25_8 /* !! */  = (T)var2_2 /* !! */ ;
                                                            var25_8 /* !! */  = var6_6;
                                                            var25_8 /* !! */  = var1_1 /* !! */ ;
                                                            var10_17 = var9_10;
                                                            var10_17 = var3_3;
                                                            var3_3 = var7_16;
                                                            var7_16 = var8_15;
                                                            var8_15 = var11_13;
                                                            var26_12 = var29_11;
                                                            break block144;
                                                            break;
                                                        }
lbl441:
                                                        // 1 sources

                                                        var25_8 /* !! */  = var6_6;
                                                        var10_17 = var4_4;
                                                        var28_9 = var1_1 /* !! */ ;
                                                        break;
                                                    }
                                                    case 28: {
                                                        if (var17_22 != 2) ** GOTO lbl483
                                                        var12_14 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                        var11_13 = var6_6.a;
                                                        if (var11_13 < 0) throw s4.d();
                                                        if (var11_13 > var2_2 /* !! */ .length - var12_14) throw s4.f();
                                                        if (var11_13 != 0) ** GOTO lbl456
                                                        var30_28.add(B3.c0);
                                                        var11_13 = var12_14;
                                                        ** GOTO lbl460
lbl456:
                                                        // 1 sources

                                                        var30_28.add(B3.p(var2_2 /* !! */ , var12_14, var11_13));
                                                        block74: while (true) {
                                                            var11_13 = var12_14 + var11_13;
                                                            while (var11_13 < var4_4) {
                                                                var12_14 = w3.p(var2_2 /* !! */ , var11_13, var6_6);
                                                                if (var10_17 != var6_6.a) break block74;
                                                                var11_13 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                                var15_20 = var6_6.a;
                                                                if (var15_20 < 0) throw s4.d();
                                                                if (var15_20 > var2_2 /* !! */ .length - var11_13) throw s4.f();
                                                                if (var15_20 == 0) {
                                                                    var30_28.add(B3.c0);
                                                                    continue;
                                                                }
                                                                var30_28.add(B3.p(var2_2 /* !! */ , var11_13, var15_20));
                                                                var12_14 = var11_13;
                                                                var11_13 = var15_20;
                                                                continue block74;
                                                            }
                                                            break;
                                                        }
                                                        var25_8 /* !! */  = var6_6;
                                                        var25_8 /* !! */  = (T)var2_2 /* !! */ ;
                                                        var10_17 = var4_4;
                                                        var10_17 = var7_16;
                                                        var7_16 = var11_13;
                                                        var11_13 = var10_17;
                                                        ** continue;
lbl483:
                                                        // 2 sources

                                                        while (true) {
                                                            var28_9 = var1_1 /* !! */ ;
                                                            var10_17 = var4_4;
                                                            var10_17 = var3_3;
                                                            var25_8 /* !! */  = var6_6;
                                                            var10_17 = var9_10;
                                                            break block16;
                                                            break;
                                                        }
                                                    }
                                                    case 27: {
                                                        if (var17_22 != 2) ** continue;
                                                        var26_12 = super.N(var14_19);
                                                        var25_8 /* !! */  = var1_1 /* !! */ ;
                                                        var11_13 = w3.f(var26_12, var10_17, var2_2 /* !! */ , var12_14, var4_4, var30_28, var6_6);
                                                        var10_17 = var4_4;
                                                        var26_12 = var29_11;
                                                        ** continue;
                                                    }
                                                    case 26: {
                                                        if (var17_22 != 2) ** GOTO lbl588
                                                        if ((var23_27 & 0x20000000L) != 0L) ** GOTO lbl552
                                                        var12_14 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                        var11_13 = var6_6.a;
                                                        if (var11_13 < 0) throw s4.d();
                                                        if (var11_13 != 0) ** GOTO lbl509
                                                        var30_28.add("");
                                                        var15_20 = var7_16;
                                                        ** GOTO lbl515
lbl509:
                                                        // 1 sources

                                                        var30_28.add(new String(var2_2 /* !! */ , var12_14, var11_13, m4.a));
                                                        var15_20 = var7_16;
                                                        var7_16 = var11_13;
                                                        block77: while (true) {
                                                            var12_14 += var7_16;
lbl515:
                                                            // 2 sources

                                                            while (true) {
                                                                var26_12 = var27_7;
                                                                var7_16 = var12_14;
                                                                var11_13 = var15_20;
                                                                if (var12_14 >= var4_4) break block77;
                                                                var16_21 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                                var26_12 = var27_7;
                                                                var7_16 = var12_14;
                                                                var11_13 = var15_20;
                                                                if (var10_17 != var6_6.a) break block77;
                                                                var12_14 = w3.p(var2_2 /* !! */ , var16_21, var6_6);
                                                                var7_16 = var6_6.a;
                                                                if (var7_16 < 0) throw s4.d();
                                                                if (var7_16 != 0) break;
                                                                var30_28.add("");
                                                            }
                                                            var30_28.add(new String(var2_2 /* !! */ , var12_14, var7_16, m4.a));
                                                        }
lbl535:
                                                        // 13 sources

                                                        while (true) {
                                                            var27_7 = var6_6;
                                                            var10_17 = var3_3;
                                                            var10_17 = var9_10;
                                                            var10_17 = var4_4;
lbl540:
                                                            // 4 sources

                                                            while (true) {
                                                                var10_17 = var9_10;
                                                                var10_17 = var4_4;
                                                                var27_7 = var6_6;
                                                                var27_7 = var2_2 /* !! */ ;
                                                                var27_7 = var26_12;
                                                                var10_17 = var3_3;
                                                                var3_3 = var7_16;
                                                                var7_16 = var8_15;
                                                                var8_15 = var11_13;
                                                                var26_12 = var29_11;
                                                                break block144;
                                                                break;
                                                            }
                                                            break;
                                                        }
lbl552:
                                                        // 1 sources

                                                        var15_20 = var7_16;
                                                        var12_14 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                        var11_13 = var6_6.a;
                                                        if (var11_13 < 0) throw s4.d();
                                                        if (var11_13 != 0) ** GOTO lbl560
                                                        var30_28.add("");
                                                        ** GOTO lbl566
lbl560:
                                                        // 1 sources

                                                        var7_16 = var12_14 + var11_13;
                                                        if (!L5.e(var2_2 /* !! */ , var12_14, var7_16)) throw s4.c();
                                                        var30_28.add(new String(var2_2 /* !! */ , var12_14, var11_13, m4.a));
                                                        while (true) {
                                                            var12_14 = var7_16;
lbl566:
                                                            // 2 sources

                                                            while (true) {
                                                                var26_12 = var27_7;
                                                                var7_16 = var12_14;
                                                                var11_13 = var15_20;
                                                                if (var12_14 >= var4_4) ** GOTO lbl535
                                                                var16_21 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                                var26_12 = var27_7;
                                                                var7_16 = var12_14;
                                                                var11_13 = var15_20;
                                                                if (var10_17 != var6_6.a) ** GOTO lbl535
                                                                var12_14 = w3.p(var2_2 /* !! */ , var16_21, var6_6);
                                                                var11_13 = var6_6.a;
                                                                if (var11_13 < 0) throw s4.d();
                                                                if (var11_13 != 0) break;
                                                                var30_28.add("");
                                                            }
                                                            var7_16 = var12_14 + var11_13;
                                                            if (!L5.e(var2_2 /* !! */ , var12_14, var7_16)) throw s4.c();
                                                            var30_28.add(new String(var2_2 /* !! */ , var12_14, var11_13, m4.a));
                                                        }
lbl588:
                                                        // 5 sources

                                                        while (true) {
                                                            var28_9 = var6_6;
                                                            var10_17 = var3_3;
                                                            var10_17 = var9_10;
                                                            var10_17 = var4_4;
                                                            var28_9 = var25_8 /* !! */ ;
                                                            break block16;
                                                            break;
                                                        }
                                                    }
                                                    case 25: 
                                                    case 42: {
                                                        var15_20 = var7_16;
                                                        if (var17_22 != 2) ** GOTO lbl610
                                                        var26_12 = (y3)var30_28;
                                                        var7_16 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                        var10_17 = var6_6.a + var7_16;
                                                        while (var7_16 < var10_17) {
                                                            var7_16 = w3.q(var2_2 /* !! */ , var7_16, var6_6);
                                                            var20_25 = var6_6.b != 0L;
                                                            var26_12.g(var20_25);
                                                        }
                                                        if (var7_16 != var10_17) throw s4.f();
                                                        var26_12 = var27_7;
                                                        var11_13 = var15_20;
                                                        ** GOTO lbl535
lbl610:
                                                        // 1 sources

                                                        if (var17_22 != 0) ** GOTO lbl588
                                                        var28_9 = (y3)var30_28;
                                                        var12_14 = w3.q(var2_2 /* !! */ , var12_14, var6_6);
                                                        var20_25 = var6_6.b != 0L;
                                                        var28_9.g(var20_25);
                                                        while (true) {
                                                            var26_12 = var27_7;
                                                            var7_16 = var12_14;
                                                            var11_13 = var15_20;
                                                            if (var12_14 >= var4_4) ** GOTO lbl535
                                                            var16_21 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                            var26_12 = var27_7;
                                                            var7_16 = var12_14;
                                                            var11_13 = var15_20;
                                                            if (var10_17 != var6_6.a) ** GOTO lbl535
                                                            var12_14 = w3.q(var2_2 /* !! */ , var16_21, var6_6);
                                                            var20_25 = var6_6.b != 0L;
                                                            var28_9.g(var20_25);
                                                        }
                                                    }
                                                    case 24: 
                                                    case 31: 
                                                    case 41: 
                                                    case 45: {
                                                        var15_20 = var7_16;
                                                        if (var17_22 != 2) ** GOTO lbl641
                                                        var26_12 = (n4)var30_28;
                                                        var10_17 = var6_6.a + var7_16;
                                                        for (var7_16 = w3.p(var2_2 /* !! */ , var12_14, var6_6); var7_16 < var10_17; var7_16 += 4) {
                                                            var26_12.i(w3.o(var2_2 /* !! */ , var7_16));
                                                        }
                                                        if (var7_16 != var10_17) throw s4.f();
                                                        var26_12 = var27_7;
                                                        var11_13 = var15_20;
                                                        ** GOTO lbl535
lbl641:
                                                        // 1 sources

                                                        if (var17_22 != 5) ** GOTO lbl588
                                                        var28_9 = (n4)var30_28;
                                                        var28_9.i(w3.o(var2_2 /* !! */ , var12_14));
                                                        var12_14 += 4;
                                                        while (true) {
                                                            var26_12 = var27_7;
                                                            var7_16 = var12_14;
                                                            var11_13 = var15_20;
                                                            if (var12_14 >= var4_4) ** GOTO lbl535
                                                            var16_21 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                            var26_12 = var27_7;
                                                            var7_16 = var12_14;
                                                            var11_13 = var15_20;
                                                            if (var10_17 != var6_6.a) ** GOTO lbl535
                                                            var28_9.i(w3.o(var2_2 /* !! */ , var16_21));
                                                            var12_14 = var16_21 + 4;
                                                        }
                                                    }
                                                    case 23: 
                                                    case 32: 
                                                    case 40: 
                                                    case 46: {
                                                        var15_20 = var7_16;
                                                        if (var17_22 != 2) ** GOTO lbl670
                                                        var26_12 = (F4)var30_28;
                                                        var10_17 = var6_6.a + var7_16;
                                                        for (var7_16 = w3.p(var2_2 /* !! */ , var12_14, var6_6); var7_16 < var10_17; var7_16 += 8) {
                                                            var26_12.g(w3.r(var2_2 /* !! */ , var7_16));
                                                        }
                                                        if (var7_16 != var10_17) throw s4.f();
                                                        var26_12 = var27_7;
                                                        var11_13 = var15_20;
                                                        ** GOTO lbl535
lbl670:
                                                        // 1 sources

                                                        if (var17_22 != 1) ** GOTO lbl588
                                                        var28_9 = (F4)var30_28;
                                                        var28_9.g(w3.r(var2_2 /* !! */ , var12_14));
                                                        var12_14 += 8;
                                                        while (true) {
                                                            var26_12 = var27_7;
                                                            var7_16 = var12_14;
                                                            var11_13 = var15_20;
                                                            if (var12_14 >= var4_4) ** GOTO lbl535
                                                            var16_21 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                                            var26_12 = var27_7;
                                                            var7_16 = var12_14;
                                                            var11_13 = var15_20;
                                                            if (var10_17 == var6_6.a) ** break;
                                                            ** continue;
                                                            var28_9.g(w3.r(var2_2 /* !! */ , var16_21));
                                                            var12_14 = var16_21 + 8;
                                                        }
                                                    }
                                                    case 22: 
                                                    case 29: 
                                                    case 39: 
                                                    case 43: {
                                                        var31_29 = var2_2 /* !! */ ;
                                                        var15_20 = var8_15;
                                                        var28_9 = var25_8 /* !! */ ;
                                                        var11_13 = var7_16;
                                                        if (var17_22 == 2) {
                                                            var11_13 = w3.l((byte[])var31_29, var12_14, var30_28, var6_6);
                                                            var10_17 = var4_4;
                                                            var26_12 = var29_11;
                                                            ** continue;
                                                        }
                                                        if (var17_22 == 0) ** break;
                                                        ** continue;
                                                        var3_3 = w3.c(var10_17, (byte[])var31_29, var12_14, var4_4, var30_28, var6_6);
                                                        var7_16 = var4_4;
                                                        var25_8 /* !! */  = var6_6;
                                                        var10_17 = var12_14;
                                                        var25_8 /* !! */  = var28_9;
                                                        var7_16 = var15_20;
                                                        var8_15 = var11_13;
                                                        var26_12 = var29_11;
                                                        break block144;
                                                    }
                                                    case 20: 
                                                    case 21: 
                                                    case 37: 
                                                    case 38: {
                                                        var31_29 = var6_6;
                                                        var11_13 = var12_14;
                                                        var28_9 = var25_8 /* !! */ ;
                                                        var12_14 = var7_16;
                                                        var15_20 = var10_17;
                                                        var16_21 = var4_4;
                                                        if (var17_22 != 2) ** GOTO lbl734
                                                        var26_12 = (F4)var30_28;
                                                        var10_17 = w3.p(var2_2 /* !! */ , var11_13, (v3)var31_29);
                                                        var11_13 = var31_29.a + var10_17;
                                                        while (var10_17 < var11_13) {
                                                            var10_17 = w3.q(var2_2 /* !! */ , var10_17, (v3)var31_29);
                                                            var26_12.g(var31_29.b);
                                                        }
                                                        if (var10_17 != var11_13) throw s4.f();
lbl725:
                                                        // 3 sources

                                                        while (true) {
                                                            var11_13 = var7_16;
                                                            var7_16 = var9_10;
                                                            var7_16 = var4_4;
                                                            var7_16 = var3_3;
                                                            var26_12 = var6_6;
                                                            var26_12 = var27_7;
                                                            var7_16 = var10_17;
                                                            ** GOTO lbl540
                                                            break;
                                                        }
lbl734:
                                                        // 1 sources

                                                        if (var17_22 != 0) break;
                                                        var28_9 = (F4)var30_28;
                                                        var10_17 = w3.q(var2_2 /* !! */ , var11_13, (v3)var31_29);
                                                        var28_9.g(var31_29.b);
                                                        while (true) {
                                                            var26_12 = var27_7;
                                                            var7_16 = var10_17;
                                                            var11_13 = var12_14;
                                                            if (var10_17 >= var16_21) ** GOTO lbl540
                                                            var17_22 = w3.p(var2_2 /* !! */ , var10_17, (v3)var31_29);
                                                            var26_12 = var27_7;
                                                            var7_16 = var10_17;
                                                            var11_13 = var12_14;
                                                            if (var15_20 == var31_29.a) ** break;
                                                            ** continue;
                                                            var10_17 = w3.q(var2_2 /* !! */ , var17_22, (v3)var31_29);
                                                            var28_9.g(var31_29.b);
                                                        }
                                                    }
                                                    case 19: 
                                                    case 36: {
                                                        var31_29 = var6_6;
                                                        var11_13 = var12_14;
                                                        var28_9 = var25_8 /* !! */ ;
                                                        var12_14 = var10_17;
                                                        var15_20 = var4_4;
                                                        if (var17_22 != 2) ** GOTO lbl768
                                                        var26_12 = (j4)var30_28;
                                                        var10_17 = w3.p(var2_2 /* !! */ , var11_13, (v3)var31_29);
                                                        var11_13 = var31_29.a + var10_17;
                                                        while (var10_17 < var11_13) {
                                                            var26_12.g(w3.m(var2_2 /* !! */ , var10_17));
                                                            var10_17 += 4;
                                                        }
                                                        if (var10_17 == var11_13) ** GOTO lbl725
                                                        throw s4.f();
lbl768:
                                                        // 1 sources

                                                        if (var17_22 != 5) break;
                                                        var26_12 = (j4)var30_28;
                                                        var26_12.g(w3.m(var2_2 /* !! */ , var11_13));
                                                        var11_13 += 4;
                                                        while (true) {
                                                            var10_17 = var11_13;
                                                            if (var11_13 >= var15_20) break;
                                                            var16_21 = w3.p(var2_2 /* !! */ , var11_13, (v3)var31_29);
                                                            var10_17 = var11_13;
                                                            if (var12_14 != var31_29.a) break;
                                                            var26_12.g(w3.m(var2_2 /* !! */ , var16_21));
                                                            var11_13 = var16_21 + 4;
                                                        }
lbl781:
                                                        // 4 sources

                                                        while (true) {
                                                            var11_13 = var7_16;
                                                            var7_16 = var8_15;
                                                            var8_15 = var9_10;
                                                            var8_15 = var4_4;
                                                            var26_12 = var2_2 /* !! */ ;
                                                            var26_12 = var6_6;
                                                            var8_15 = var10_17;
                                                            var10_17 = var3_3;
                                                            var3_3 = var8_15;
                                                            var8_15 = var11_13;
                                                            var26_12 = var29_11;
                                                            break block144;
                                                            break;
                                                        }
                                                    }
                                                    case 18: 
                                                    case 35: {
                                                        var31_29 = var6_6;
                                                        var11_13 = var12_14;
                                                        var28_9 = var25_8 /* !! */ ;
                                                        var15_20 = var10_17;
                                                        var12_14 = var4_4;
                                                        if (var17_22 == 2) {
                                                            var26_12 = (U3)var30_28;
                                                            var10_17 = w3.p(var2_2 /* !! */ , var11_13, (v3)var31_29);
                                                            var11_13 = var31_29.a + var10_17;
                                                            while (var10_17 < var11_13) {
                                                                var26_12.g(w3.a(var2_2 /* !! */ , var10_17));
                                                                var10_17 += 8;
                                                            }
                                                            if (var10_17 == var11_13) ** continue;
                                                            throw s4.f();
                                                        }
                                                        if (var17_22 != 1) break;
                                                        var26_12 = (U3)var30_28;
                                                        var26_12.g(w3.a(var2_2 /* !! */ , var11_13));
                                                        var11_13 += 8;
                                                        while (true) {
                                                            var10_17 = var11_13;
                                                            if (var11_13 >= var12_14) ** GOTO lbl781
                                                            var16_21 = w3.p(var2_2 /* !! */ , var11_13, (v3)var31_29);
                                                            var10_17 = var11_13;
                                                            if (var15_20 == var31_29.a) ** break;
                                                            ** continue;
                                                            var26_12.g(w3.a(var2_2 /* !! */ , var16_21));
                                                            var11_13 = var16_21 + 8;
                                                        }
                                                    }
                                                }
                                                var10_17 = var9_10;
                                                var10_17 = var4_4;
                                                var10_17 = var3_3;
                                                var25_8 /* !! */  = var6_6;
                                                var11_13 = var8_15;
                                                var25_8 /* !! */  = (T)var2_2 /* !! */ ;
                                                var3_3 = var10_17;
                                                var8_15 = var7_16;
                                                var7_16 = var11_13;
                                                var25_8 /* !! */  = var28_9;
                                            }
                                            var11_13 = var9_10;
                                            var12_14 = var4_4;
                                            var30_28 = var2_2 /* !! */ ;
                                            var28_9 = var6_6;
                                            if (var3_3 != var10_17) break block153;
                                            var11_13 = var14_19;
                                            var27_7 = var28_9;
                                            var10_17 = var3_3;
                                            var3_3 = var7_16;
                                            break block148;
                                        }
                                        var29_11 = var28_9;
                                        var28_9 = var30_28;
                                        var9_10 = var12_14;
                                        var10_17 = var11_13;
                                        var15_20 = var8_15;
                                        var11_13 = var13_18;
                                        var12_14 = var14_19;
                                        var8_15 = var7_16;
                                        var7_16 = var15_20;
                                        continue;
                                    }
                                    var16_21 = var8_15;
                                    var28_9 = var25_8 /* !! */ ;
                                    var15_20 = var7_16;
                                    if (var19_24 == 50) {
                                        if (var17_22 == 2) {
                                            var29_11 = X4.r;
                                            var26_12 = super.Q(var14_19);
                                            var1_1 /* !! */  = var25_8 /* !! */  = var29_11.getObject(var28_9, var21_26);
                                            if (var27_7.p.h(var25_8 /* !! */ )) {
                                                var1_1 /* !! */  = var27_7.p.f(var26_12);
                                                var27_7.p.g(var1_1 /* !! */ , var25_8 /* !! */ );
                                                var29_11.putObject(var28_9, var21_26, var1_1 /* !! */ );
                                            }
                                            var27_7.p.b(var26_12);
                                            var27_7.p.c(var1_1 /* !! */ );
                                            var5_5 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                            var3_3 = var6_6.a;
                                            if (var3_3 < 0 || var3_3 > var4_4 - var5_5) throw s4.f();
                                            throw null;
                                        } else {
                                            ** GOTO lbl879
                                        }
                                    }
                                    break block154;
                                }
                                var10_17 = var9_10;
                                var11_13 = var14_19;
                                var27_7 = var6_6;
                                var10_17 = var3_3;
                                var3_3 = var8_15;
                                var8_15 = var7_16;
                                break block148;
                            }
                            var29_11 = X4.r;
                            var23_27 = var30_28[var14_19 + 2] & 1048575;
                            block32 : switch (var19_24) lbl-1000:
                            // 3 sources

                            {
                                default: {
                                    var25_8 /* !! */  = var6_6;
                                    break;
                                }
                                case 68: {
                                    if (var17_22 != 3) ** GOTO lbl-1000
                                    var25_8 /* !! */  = super.q(var28_9, var13_18, var14_19);
                                    var7_16 = w3.i(var25_8 /* !! */ , super.N(var14_19), var2_2 /* !! */ , var12_14, var4_4, var10_17 & -8 | 4, var6_6);
                                    super.w(var28_9, var13_18, var14_19, var25_8 /* !! */ );
lbl899:
                                    // 6 sources

                                    while (true) {
                                        var25_8 /* !! */  = var6_6;
                                        break block145;
                                        break;
                                    }
                                }
                                case 67: {
                                    if (var17_22 != 0) ** GOTO lbl908
                                    var7_16 = w3.q(var2_2 /* !! */ , var12_14, var6_6);
                                    var29_11.putObject(var28_9, var21_26, P3.b(var6_6.b));
                                    var29_11.putInt(var28_9, var23_27, var13_18);
                                    ** GOTO lbl899
lbl908:
                                    // 4 sources

                                    while (true) {
                                        var25_8 /* !! */  = var6_6;
                                        break block32;
                                        break;
                                    }
                                }
                                case 66: {
                                    if (var17_22 != 0) ** GOTO lbl908
                                    var7_16 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                    var29_11.putObject(var28_9, var21_26, P3.e(var6_6.a));
                                    var29_11.putInt(var28_9, var23_27, var13_18);
                                    ** GOTO lbl899
                                }
                                case 63: {
                                    if (var17_22 != 0) ** GOTO lbl908
                                    var7_16 = w3.p(var2_2 /* !! */ , var12_14, var6_6);
                                    var8_15 = var6_6.a;
                                    var25_8 /* !! */  = super.M(var14_19);
                                    if (var25_8 /* !! */  == null || var25_8 /* !! */ .d(var8_15)) ** GOTO lbl925
                                    X4.O(var28_9).e(var10_17, var8_15);
                                    ** GOTO lbl899
lbl925:
                                    // 1 sources

                                    var29_11.putObject(var28_9, var21_26, var8_15);
                                    var29_11.putInt(var28_9, var23_27, var13_18);
                                    ** GOTO lbl899
                                }
                                case 61: {
                                    if (var17_22 == 2) ** break;
                                    ** continue;
                                    var7_16 = w3.k(var2_2 /* !! */ , var12_14, var6_6);
                                    var29_11.putObject(var28_9, var21_26, var6_6.c);
                                    var29_11.putInt(var28_9, var23_27, var13_18);
                                    ** continue;
                                }
                                case 60: {
                                    if (var17_22 != 2) ** GOTO lbl-1000
                                    var25_8 /* !! */  = super.q(var28_9, var13_18, var14_19);
                                    var7_16 = w3.j(var25_8 /* !! */ , super.N(var14_19), var2_2 /* !! */ , var12_14, var4_4, var6_6);
                                    super.w(var28_9, var13_18, var14_19, var25_8 /* !! */ );
                                    var25_8 /* !! */  = var6_6;
                                    break block145;
                                }
                                case 59: {
                                    var25_8 /* !! */  = var6_6;
                                    if (var17_22 != 2) break;
                                    var7_16 = w3.p(var2_2 /* !! */ , var12_14, var25_8 /* !! */ );
                                    var8_15 = var25_8 /* !! */ .a;
                                    if (var8_15 == 0) {
                                        var29_11.putObject(var28_9, var21_26, "");
                                    } else {
                                        if ((var18_23 & 0x20000000) != 0 && !L5.e(var2_2 /* !! */ , var7_16, var7_16 + var8_15)) {
                                            throw s4.c();
                                        }
                                        var29_11.putObject(var28_9, var21_26, new String(var2_2 /* !! */ , var7_16, var8_15, m4.a));
                                        var7_16 += var8_15;
                                    }
                                    var29_11.putInt(var28_9, var23_27, var13_18);
                                    break block145;
                                }
                                case 58: {
                                    var25_8 /* !! */  = var6_6;
                                    if (var17_22 != 0) break;
                                    var7_16 = w3.q(var2_2 /* !! */ , var12_14, var25_8 /* !! */ );
                                    var20_25 = var25_8 /* !! */ .b != 0L;
                                    var29_11.putObject(var28_9, var21_26, var20_25);
                                    var29_11.putInt(var28_9, var23_27, var13_18);
lbl963:
                                    // 3 sources

                                    while (true) {
                                        var25_8 /* !! */  = var6_6;
                                        break block145;
                                        break;
                                    }
                                }
                                case 57: 
                                case 64: {
                                    var25_8 /* !! */  = var6_6;
                                    if (var17_22 != 5) break;
                                    var29_11.putObject(var28_9, var21_26, w3.o(var2_2 /* !! */ , var12_14));
                                    var7_16 = var12_14 + 4;
                                    var29_11.putInt(var28_9, var23_27, var13_18);
lbl972:
                                    // 4 sources

                                    while (true) {
                                        var25_8 /* !! */  = var6_6;
                                        break block145;
                                        break;
                                    }
                                }
                                case 56: 
                                case 65: {
                                    var25_8 /* !! */  = var6_6;
                                    if (var17_22 != 1) break;
                                    var29_11.putObject(var28_9, var21_26, w3.r(var2_2 /* !! */ , var12_14));
                                    var7_16 = var12_14 + 8;
                                    var29_11.putInt(var28_9, var23_27, var13_18);
                                    ** GOTO lbl972
                                }
                                case 55: 
                                case 62: {
                                    var25_8 /* !! */  = var6_6;
                                    if (var17_22 != 0) break;
                                    var7_16 = w3.p(var2_2 /* !! */ , var12_14, var25_8 /* !! */ );
                                    var29_11.putObject(var28_9, var21_26, var25_8 /* !! */ .a);
                                    var29_11.putInt(var28_9, var23_27, var13_18);
                                    ** GOTO lbl963
                                }
                                case 53: 
                                case 54: {
                                    var25_8 /* !! */  = var6_6;
                                    if (var17_22 != 0) break;
                                    var7_16 = w3.q(var2_2 /* !! */ , var12_14, var25_8 /* !! */ );
                                    var29_11.putObject(var28_9, var21_26, var25_8 /* !! */ .b);
                                    var29_11.putInt(var28_9, var23_27, var13_18);
                                    ** continue;
                                }
                                case 52: {
                                    var25_8 /* !! */  = var6_6;
                                    if (var17_22 != 5) break;
                                    var29_11.putObject(var28_9, var21_26, Float.valueOf(w3.m(var2_2 /* !! */ , var12_14)));
                                    var7_16 = var12_14 + 4;
                                    var29_11.putInt(var28_9, var23_27, var13_18);
                                    ** GOTO lbl972
                                }
                                case 51: {
                                    var25_8 /* !! */  = var6_6;
                                    if (var17_22 != 1) break;
                                    var29_11.putObject(var28_9, var21_26, w3.a(var2_2 /* !! */ , var12_14));
                                    var7_16 = var12_14 + 8;
                                    var29_11.putInt(var28_9, var23_27, var13_18);
                                    ** continue;
                                }
                            }
                            var25_8 /* !! */  = var6_6;
                            var7_16 = var3_3;
                        }
                        var27_7 = var6_6;
                        if (var7_16 != var3_3) break block155;
                        var8_15 = var15_20;
                        var3_3 = var16_21;
                        var25_8 /* !! */  = (T)var28_9;
                        var10_17 = var7_16;
                    }
                    if (var9_10 == var5_5 && var5_5 != 0) {
                        var27_7 = this;
                        var11_13 = var9_10;
                        var7_16 = var10_17;
                        var9_10 = var3_3;
                        var10_17 = var11_13;
                        var3_3 = var7_16;
                        break block146;
                    }
                    if (this.f && (var28_9 = (Object)var27_7.d) != W3.c) {
                        if (var28_9.b(this.e, var13_18) == null) {
                            var7_16 = w3.d(var9_10, var2_2 /* !! */ , var10_17, var4_4, X4.O(var25_8 /* !! */ ), (v3)var27_7);
lbl1031:
                            // 2 sources

                            while (true) {
                                var10_17 = var13_18;
                                var15_20 = var8_15;
                                var16_21 = var3_3;
                                var12_14 = var11_13;
                                var3_3 = var7_16;
                                var8_15 = var9_10;
lbl1038:
                                // 2 sources

                                while (true) {
                                    var11_13 = var13_18;
                                    var29_11 = var6_6;
                                    var9_10 = var4_4;
                                    var28_9 = var2_2 /* !! */ ;
                                    var27_7 = this;
                                    var7_16 = var15_20;
                                    var10_17 = var8_15;
                                    var8_15 = var16_21;
                                    continue block48;
                                    break;
                                }
                                break;
                            }
                        }
                        var1_1 /* !! */  = (k4.d)var25_8 /* !! */ ;
                        var1_1 /* !! */ .I();
                        var1_1 /* !! */  = var1_1 /* !! */ .zzc;
                        throw new NoSuchMethodError();
                    }
                    var7_16 = w3.d(var9_10, var2_2 /* !! */ , var10_17, var4_4, X4.O(var25_8 /* !! */ ), var6_6);
                    ** continue;
                }
                var8_15 = var10_17;
                var25_8 /* !! */  = var28_9;
                var3_3 = var13_18;
                var3_3 = var7_16;
                var12_14 = var11_13;
                ** continue;
            }
            var4_4 = var9_10;
            var9_10 = var8_15;
            var8_15 = var7_16;
        }
        if (var9_10 != 1048575) {
            var26_12.putInt(var25_8 /* !! */ , var9_10, var8_15);
        }
        var2_2 /* !! */  = null;
        for (var7_16 = var27_7.j; var7_16 < var27_7.k; ++var7_16) {
            var2_2 /* !! */  = (byte[])((F5)var27_7.r(var25_8 /* !! */ , var27_7.i[var7_16], var2_2 /* !! */ , var27_7.n, var1_1 /* !! */ ));
        }
        if (var2_2 /* !! */  != null) {
            var27_7.n.h(var25_8 /* !! */ , var2_2 /* !! */ );
        }
        if (var5_5 == 0) {
            if (var3_3 == var4_4) return var3_3;
            throw s4.e();
        }
        if (var3_3 > var4_4 || var10_17 != var5_5) throw s4.e();
        return var3_3;
    }
}

