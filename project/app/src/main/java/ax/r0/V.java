/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.H;
import ax.r0.K;
import ax.r0.M;
import ax.r0.P;
import ax.r0.S;
import ax.r0.X;
import ax.r0.c0;
import ax.r0.d0;
import ax.r0.f0;
import ax.r0.g0;
import ax.r0.h;
import ax.r0.h0;
import ax.r0.j0;
import ax.r0.k;
import ax.r0.l0;
import ax.r0.o0;
import ax.r0.p;
import ax.r0.q;
import ax.r0.s0;
import ax.r0.u;
import ax.r0.u0;
import ax.r0.v;
import ax.r0.v0;
import ax.r0.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class V<T>
implements h0<T> {
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
    private final H n;
    private final o0<?, ?> o;
    private final q<?> p;
    private final M q;

    private V(int[] nArray, Object[] objectArray, int n8, int n9, S s8, boolean bl, boolean bl2, int[] nArray2, int n10, int n11, X x8, H h8, o0<?, ?> o02, q<?> q8, M m8) {
        this.a = nArray;
        this.b = objectArray;
        this.c = n8;
        this.d = n9;
        this.g = s8 instanceof y;
        this.h = bl;
        bl = q8 != null && q8.e(s8);
        this.f = bl;
        this.i = bl2;
        this.j = nArray2;
        this.k = n10;
        this.l = n11;
        this.m = x8;
        this.n = h8;
        this.o = o02;
        this.p = q8;
        this.e = s8;
        this.q = m8;
    }

    private static boolean A(Object object, int n8, h0 h02) {
        return h02.c(s0.A(object, V.R(n8)));
    }

    private <N> boolean B(Object object, int n8, int n9) {
        List list = (List)s0.A(object, V.R(n8));
        if (list.isEmpty()) {
            return true;
        }
        object = this.s(n9);
        for (n8 = 0; n8 < list.size(); ++n8) {
            if (object.c(list.get(n8))) continue;
            return false;
        }
        return true;
    }

    private boolean C(T object, int n8, int n9) {
        if ((object = this.q.h(s0.A(object, V.R(n8)))).isEmpty()) {
            return true;
        }
        h0<?> h02 = this.r(n9);
        if (this.q.c((Object)h02).c.d() != u0.c.k0) {
            return true;
        }
        Iterator iterator = object.values().iterator();
        object = null;
        while (iterator.hasNext()) {
            Object v8 = iterator.next();
            h02 = object;
            if (object == null) {
                h02 = d0.a().d(v8.getClass());
            }
            object = h02;
            if (h02.c(v8)) continue;
            return false;
        }
        return true;
    }

    private boolean D(T t8, T t9, int n8) {
        long l8 = this.Y(n8) & 0xFFFFF;
        return s0.x(t8, l8) == s0.x(t9, l8);
    }

    private boolean E(T t8, int n8, int n9) {
        return s0.x(t8, this.Y(n9) & 0xFFFFF) == n8;
    }

    private static boolean F(int n8) {
        return (n8 & 0x10000000) != 0;
    }

    private static List<?> G(Object object, long l8) {
        return (List)s0.A(object, l8);
    }

    private static <T> long H(T t8, long l8) {
        return s0.y(t8, l8);
    }

    /*
     * Exception decompiling
     */
    private <UT, UB, ET extends u.b<ET>> void I(o0<UT, UB> var1_1, q<ET> var2_2, T var3_9, g0 var4_10, p var5_11) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [6 : 237->245)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private final <K, V> void J(Object object, int n8, Object object2, p p8, g0 g02) throws IOException {
        Object object3;
        long l8 = V.R(this.i0(n8));
        Object object4 = s0.A(object, l8);
        if (object4 == null) {
            object3 = this.q.e(object2);
            s0.O(object, l8, object3);
        } else {
            object3 = object4;
            if (this.q.g(object4)) {
                object3 = this.q.e(object2);
                this.q.a(object3, object4);
                s0.O(object, l8, object3);
            }
        }
        g02.a(this.q.d(object3), this.q.c(object2), p8);
    }

    private void K(T t8, T object, int n8) {
        long l8 = V.R(this.i0(n8));
        if (this.y(object, n8)) {
            Object object2 = s0.A(t8, l8);
            object = s0.A(object, l8);
            if (object2 != null && object != null) {
                s0.O(t8, l8, A.h(object2, object));
                this.e0(t8, n8);
                return;
            }
            if (object != null) {
                s0.O(t8, l8, object);
                this.e0(t8, n8);
            }
        }
    }

    private void L(T t8, T object, int n8) {
        int n9 = this.i0(n8);
        int n10 = this.Q(n8);
        long l8 = V.R(n9);
        if (this.E(object, n10, n8)) {
            Object object2 = s0.A(t8, l8);
            object = s0.A(object, l8);
            if (object2 != null && object != null) {
                s0.O(t8, l8, A.h(object2, object));
                this.f0(t8, n10, n8);
                return;
            }
            if (object != null) {
                s0.O(t8, l8, object);
                this.f0(t8, n10, n8);
            }
        }
    }

    private void M(T t8, T t9, int n8) {
        int n9 = this.i0(n8);
        long l8 = V.R(n9);
        int n10 = this.Q(n8);
        switch (V.h0(n9)) {
            default: {
                break;
            }
            case 68: {
                this.L(t8, t9, n8);
                return;
            }
            case 61: 
            case 62: 
            case 63: 
            case 64: 
            case 65: 
            case 66: 
            case 67: {
                if (!this.E(t9, n10, n8)) break;
                s0.O(t8, l8, s0.A(t9, l8));
                this.f0(t8, n10, n8);
                return;
            }
            case 60: {
                this.L(t8, t9, n8);
                return;
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
                if (!this.E(t9, n10, n8)) break;
                s0.O(t8, l8, s0.A(t9, l8));
                this.f0(t8, n10, n8);
                return;
            }
            case 50: {
                j0.F(this.q, t8, t9, l8);
                return;
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
                this.n.d(t8, t9, l8);
                return;
            }
            case 17: {
                this.K(t8, t9, n8);
                return;
            }
            case 16: {
                if (!this.y(t9, n8)) break;
                s0.N(t8, l8, s0.y(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 15: {
                if (!this.y(t9, n8)) break;
                s0.M(t8, l8, s0.x(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 14: {
                if (!this.y(t9, n8)) break;
                s0.N(t8, l8, s0.y(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 13: {
                if (!this.y(t9, n8)) break;
                s0.M(t8, l8, s0.x(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 12: {
                if (!this.y(t9, n8)) break;
                s0.M(t8, l8, s0.x(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 11: {
                if (!this.y(t9, n8)) break;
                s0.M(t8, l8, s0.x(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 10: {
                if (!this.y(t9, n8)) break;
                s0.O(t8, l8, s0.A(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 9: {
                this.K(t8, t9, n8);
                return;
            }
            case 8: {
                if (!this.y(t9, n8)) break;
                s0.O(t8, l8, s0.A(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 7: {
                if (!this.y(t9, n8)) break;
                s0.E(t8, l8, s0.p(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 6: {
                if (!this.y(t9, n8)) break;
                s0.M(t8, l8, s0.x(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 5: {
                if (!this.y(t9, n8)) break;
                s0.N(t8, l8, s0.y(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 4: {
                if (!this.y(t9, n8)) break;
                s0.M(t8, l8, s0.x(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 3: {
                if (!this.y(t9, n8)) break;
                s0.N(t8, l8, s0.y(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 2: {
                if (!this.y(t9, n8)) break;
                s0.N(t8, l8, s0.y(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 1: {
                if (!this.y(t9, n8)) break;
                s0.L(t8, l8, s0.w(t9, l8));
                this.e0(t8, n8);
                return;
            }
            case 0: {
                if (!this.y(t9, n8)) break;
                s0.K(t8, l8, s0.v(t9, l8));
                this.e0(t8, n8);
            }
        }
    }

    static <T> V<T> N(Class<T> clazz, P p8, X x8, H h8, o0<?, ?> o02, q<?> q8, M m8) {
        if (p8 instanceof f0) {
            return V.P((f0)p8, x8, h8, o02, q8, m8);
        }
        return V.O((l0)p8, x8, h8, o02, q8, m8);
    }

    static <T> V<T> O(l0 object, X x8, H h8, o0<?, ?> o02, q<?> q8, M m8) {
        boolean bl = ((l0)object).c() == c0.c0;
        Object[] objectArray = ((l0)object).e();
        if (objectArray.length == 0) {
            int n8 = objectArray.length;
            int[] nArray = new int[n8 * 3];
            Object[] objectArray2 = new Object[n8 * 2];
            if (objectArray.length <= 0) {
                int[] nArray2;
                int[] nArray3 = nArray2 = ((l0)object).d();
                if (nArray2 == null) {
                    nArray3 = r;
                }
                if (objectArray.length <= 0) {
                    nArray2 = r;
                    objectArray = r;
                    int[] nArray4 = new int[nArray3.length + nArray2.length + objectArray.length];
                    System.arraycopy(nArray3, 0, nArray4, 0, nArray3.length);
                    System.arraycopy(nArray2, 0, nArray4, nArray3.length, nArray2.length);
                    System.arraycopy(objectArray, 0, nArray4, nArray3.length + nArray2.length, objectArray.length);
                    return new V<T>(nArray, objectArray2, 0, 0, ((l0)object).b(), bl, true, nArray4, nArray3.length, nArray3.length + nArray2.length, x8, h8, o02, q8, m8);
                }
                object = objectArray[0];
                throw null;
            }
            object = objectArray[0];
            throw null;
        }
        object = objectArray[0];
        throw null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    static <T> V<T> P(f0 f02, X x8, H h8, o0<?, ?> o02, q<?> q8, M m8) {
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
        c0 c02 = f02.c();
        c0 c03 = c0.c0;
        int n18 = 0;
        boolean bl = c02 == c03;
        String string = f02.e();
        int n19 = string.length();
        int n20 = string.charAt(0);
        if (n20 >= 55296) {
            n17 = n20 & 0x1FFF;
            n16 = 1;
            n20 = 13;
            while (true) {
                n15 = n16 + '\u0001';
                if ((n16 = string.charAt(n16)) < 55296) break;
                n17 |= (n16 & 0x1FFF) << n20;
                n20 += 13;
                n16 = n15;
            }
            n20 = n17 | n16 << n20;
            n17 = n15;
        } else {
            n17 = 1;
        }
        n15 = n17 + 1;
        n16 = string.charAt(n17);
        int n21 = n15;
        n17 = n16;
        if (n16 >= 55296) {
            n16 &= 0x1FFF;
            n17 = 13;
            n14 = n15;
            while (true) {
                n15 = n14 + 1;
                if ((n14 = (int)string.charAt(n14)) < 55296) break;
                n16 |= (n14 & 0x1FFF) << n17;
                n17 += 13;
                n14 = n15;
            }
            n17 = n16 | n14 << n17;
            n21 = n15;
        }
        if (n17 == 0) {
            int[] nArray = r;
            n15 = 0;
            n13 = 0;
            n12 = 0;
            n11 = 0;
            n14 = 0;
            n17 = 0;
            n16 = n18;
            n18 = n15;
        } else {
            n17 = n21 + 1;
            n15 = n14 = (int)string.charAt(n21);
            n16 = n17;
            if (n14 >= 55296) {
                n15 = n14 & 0x1FFF;
                n16 = 13;
                n14 = n17;
                n17 = n15;
                while (true) {
                    n15 = n14 + 1;
                    if ((n14 = (int)string.charAt(n14)) < 55296) break;
                    n17 |= (n14 & 0x1FFF) << n16;
                    n16 += 13;
                    n14 = n15;
                }
                n17 |= n14 << n16;
                n16 = n15;
                n15 = n17;
            }
            n17 = n16 + 1;
            n10 = n14 = (int)string.charAt(n16);
            n16 = n17;
            if (n14 >= 55296) {
                n14 &= 0x1FFF;
                n16 = 13;
                n21 = n17;
                while (true) {
                    n17 = n21 + 1;
                    if ((n21 = (int)string.charAt(n21)) < 55296) break;
                    n14 |= (n21 & 0x1FFF) << n16;
                    n16 += 13;
                    n21 = n17;
                }
                n10 = n14 | n21 << n16;
                n16 = n17;
            }
            n14 = n16 + 1;
            n16 = n21 = (int)string.charAt(n16);
            n17 = n14;
            if (n21 >= 55296) {
                n16 = n21 & 0x1FFF;
                n17 = 13;
                n21 = n14;
                n14 = n16;
                while (true) {
                    n16 = n21 + 1;
                    if ((n21 = (int)string.charAt(n21)) < 55296) break;
                    n14 |= (n21 & 0x1FFF) << n17;
                    n17 += 13;
                    n21 = n16;
                }
                n14 |= n21 << n17;
                n17 = n16;
                n16 = n14;
            }
            n14 = n17 + 1;
            n17 = n21 = (int)string.charAt(n17);
            n18 = n14;
            if (n21 >= 55296) {
                n21 &= 0x1FFF;
                n17 = 13;
                n18 = n14;
                while (true) {
                    n14 = n18 + 1;
                    if ((n18 = (int)string.charAt(n18)) < 55296) break;
                    n21 |= (n18 & 0x1FFF) << n17;
                    n17 += 13;
                    n18 = n14;
                }
                n17 = n21 | n18 << n17;
                n18 = n14;
            }
            n21 = n18 + 1;
            n13 = string.charAt(n18);
            n14 = n13;
            n18 = n21;
            if (n13 >= 55296) {
                n14 = n13 & 0x1FFF;
                n18 = 13;
                n13 = n21;
                n21 = n14;
                while (true) {
                    n14 = n13 + 1;
                    if ((n13 = (int)string.charAt(n13)) < 55296) break;
                    n21 |= (n13 & 0x1FFF) << n18;
                    n18 += 13;
                    n13 = n14;
                }
                n21 |= n13 << n18;
                n18 = n14;
                n14 = n21;
            }
            n13 = n18 + 1;
            n21 = n18 = (int)string.charAt(n18);
            n11 = n13;
            if (n18 >= 55296) {
                n21 = n18 & 0x1FFF;
                n18 = 13;
                n11 = n13;
                n13 = n21;
                while (true) {
                    n21 = n11 + 1;
                    if ((n11 = (int)string.charAt(n11)) < 55296) break;
                    n13 |= (n11 & 0x1FFF) << n18;
                    n18 += 13;
                    n11 = n21;
                }
                n18 = n13 | n11 << n18;
                n11 = n21;
                n21 = n18;
            }
            n18 = n11 + 1;
            n11 = n12 = (int)string.charAt(n11);
            n13 = n18;
            if (n12 >= 55296) {
                n11 = n12 & 0x1FFF;
                n13 = 13;
                n12 = n18;
                while (true) {
                    n18 = n12 + 1;
                    if ((n12 = (int)string.charAt(n12)) < 55296) break;
                    n11 |= (n12 & 0x1FFF) << n13;
                    n13 += 13;
                    n12 = n18;
                }
                n11 |= n12 << n13;
                n13 = n18;
            }
            n12 = n13 + 1;
            n18 = n9 = (int)string.charAt(n13);
            n13 = n12;
            if (n9 >= 55296) {
                n13 = n9 & 0x1FFF;
                n9 = n12;
                n18 = 13;
                n12 = n13;
                while (true) {
                    n13 = n9 + 1;
                    if ((n9 = (int)string.charAt(n9)) < 55296) break;
                    n12 |= (n9 & 0x1FFF) << n18;
                    n18 += 13;
                    n9 = n13;
                }
                n18 = n12 | n9 << n18;
            }
            int[] nArray = new int[n18 + n21 + n11];
            n11 = n15 * 2 + n10;
            n10 = n17;
            n12 = n14;
            n9 = n13;
            n17 = n18;
            n14 = n11;
            n11 = n21;
            n13 = n16;
            n18 = n10;
            n21 = n9;
            n16 = n15;
        }
        Unsafe unsafe = s;
        Object[] objectArray = f02.d();
        Class<?> clazz = f02.b().getClass();
        int[] nArray = new int[n12 * 3];
        Object[] objectArray2 = new Object[n12 * 2];
        int n22 = n8 = n11 + n17;
        n15 = n17;
        int n23 = 0;
        n10 = 0;
        n9 = n13;
        n11 = n18;
        n12 = n20;
        n20 = n16;
        while (true) {
            int n24;
            int n25;
            int n26;
            int n27;
            int n28;
            int n29;
            int n30;
            int n31;
            int n32;
            block54: {
                Object object;
                block49: {
                    block58: {
                        block55: {
                            block56: {
                                block57: {
                                    block50: {
                                        block52: {
                                            block53: {
                                                block51: {
                                                    n32 = n10;
                                                    if (n21 >= n19) {
                                                        Object var33_11;
                                                        return new V<T>(nArray, objectArray2, n9, n11, f02.b(), bl, false, (int[])var33_11, n17, n8, x8, h8, o02, q8, m8);
                                                    }
                                                    n16 = n21 + 1;
                                                    n31 = string.charAt(n21);
                                                    if (n31 >= 55296) {
                                                        n18 = n31 & 0x1FFF;
                                                        n21 = 13;
                                                        while (true) {
                                                            n13 = n16 + 1;
                                                            n10 = string.charAt(n16);
                                                            n16 = n20;
                                                            if (n10 < 55296) break;
                                                            n18 |= (n10 & 0x1FFF) << n21;
                                                            n21 += 13;
                                                            n20 = n16;
                                                            n16 = n13;
                                                        }
                                                        n31 = n18 | n10 << n21;
                                                        n20 = n13;
                                                    } else {
                                                        n21 = n20;
                                                        n20 = n16;
                                                        n16 = n21;
                                                    }
                                                    n13 = n20 + 1;
                                                    n30 = string.charAt(n20);
                                                    if (n30 >= 55296) {
                                                        n18 = n30 & 0x1FFF;
                                                        n20 = 13;
                                                        while (true) {
                                                            n21 = n13 + 1;
                                                            if ((n13 = (int)string.charAt(n13)) < 55296) break;
                                                            n18 |= (n13 & 0x1FFF) << n20;
                                                            n20 += 13;
                                                            n13 = n21;
                                                        }
                                                        n30 = n18 | n13 << n20;
                                                    } else {
                                                        n21 = n13;
                                                    }
                                                    n29 = n30 & 0xFF;
                                                    n28 = n23;
                                                    if ((n30 & 0x400) != 0) {
                                                        var33_11[n23] = n32;
                                                        n28 = n23 + 1;
                                                    }
                                                    if (n29 < 51) break block50;
                                                    n13 = n21 + 1;
                                                    n18 = n21 = (int)string.charAt(n21);
                                                    n20 = n13;
                                                    if (n21 >= 55296) {
                                                        n18 = n21 & 0x1FFF;
                                                        n20 = 13;
                                                        while (true) {
                                                            n21 = n13 + 1;
                                                            if ((n13 = (int)string.charAt(n13)) < 55296) break;
                                                            n18 |= (n13 & 0x1FFF) << n20;
                                                            n20 += 13;
                                                            n13 = n21;
                                                        }
                                                        n18 |= n13 << n20;
                                                        n20 = n21;
                                                    }
                                                    if ((n13 = n29 - 51) == 9 || n13 == 17) break block51;
                                                    n21 = n14;
                                                    if (n13 != 12) break block52;
                                                    n21 = n14;
                                                    if ((n12 & 1) != 1) break block52;
                                                    n13 = n32 / 3;
                                                    n21 = n14 + 1;
                                                    objectArray2[n13 * 2 + 1] = objectArray[n14];
                                                    n14 = n21;
                                                    break block53;
                                                }
                                                n13 = n32 / 3;
                                                n21 = n14 + 1;
                                                objectArray2[n13 * 2 + 1] = objectArray[n14];
                                                n14 = n21;
                                            }
                                            n21 = n14;
                                        }
                                        if ((object = objectArray[n14 = n18 * 2]) instanceof Field) {
                                            object = (Field)object;
                                        } else {
                                            objectArray[n14] = object = V.d0(clazz, (String)object);
                                        }
                                        n27 = (int)unsafe.objectFieldOffset((Field)object);
                                        object = objectArray[++n14];
                                        if (object instanceof Field) {
                                            object = (Field)object;
                                        } else {
                                            objectArray[n14] = object = V.d0(clazz, (String)object);
                                        }
                                        n23 = (int)unsafe.objectFieldOffset((Field)object);
                                        n14 = n21;
                                        n26 = 0;
                                        n25 = n15;
                                        n24 = n22;
                                        n21 = n20;
                                        break block54;
                                    }
                                    n18 = n14 + 1;
                                    object = V.d0(clazz, (String)objectArray[n14]);
                                    if (n29 == 9 || n29 == 17) break block55;
                                    if (n29 == 27 || n29 == 49) break block56;
                                    if (n29 == 12 || n29 == 30 || n29 == 44) break block57;
                                    if (n29 != 50) break block58;
                                    n20 = n15 + 1;
                                    var33_11[n15] = n32;
                                    n13 = n32 / 3 * 2;
                                    n15 = n14 + 2;
                                    objectArray2[n13] = objectArray[n18];
                                    if ((n30 & 0x800) != 0) {
                                        objectArray2[n13 + 1] = objectArray[n15];
                                        n15 = n20;
                                        n20 = n14 += 3;
                                        break block49;
                                    } else {
                                        n14 = n20;
                                        n20 = n15;
                                        n15 = n14;
                                    }
                                    break block49;
                                }
                                if ((n12 & 1) != 1) break block58;
                                n13 = n32 / 3;
                                n20 = n14 + 2;
                                objectArray2[n13 * 2 + 1] = objectArray[n18];
                                break block49;
                            }
                            n13 = n32 / 3;
                            n20 = n14 + 2;
                            objectArray2[n13 * 2 + 1] = objectArray[n18];
                            break block49;
                        }
                        objectArray2[n32 / 3 * 2 + 1] = ((Field)object).getType();
                    }
                    n20 = n18;
                }
                int n33 = (int)unsafe.objectFieldOffset((Field)object);
                if ((n12 & 1) == 1 && n29 <= 17) {
                    n13 = n21 + 1;
                    n14 = string.charAt(n21);
                    if (n14 >= 55296) {
                        n21 = n14 & 0x1FFF;
                        n14 = 13;
                        while (true) {
                            n18 = n13 + 1;
                            if ((n13 = (int)string.charAt(n13)) < 55296) break;
                            n21 |= (n13 & 0x1FFF) << n14;
                            n14 += 13;
                            n13 = n18;
                        }
                        n14 = n21 | n13 << n14;
                    } else {
                        n18 = n13;
                    }
                    n21 = n16 * 2 + n14 / 32;
                    object = objectArray[n21];
                    if (object instanceof Field) {
                        object = (Field)object;
                    } else {
                        objectArray[n21] = object = V.d0(clazz, (String)object);
                    }
                    n13 = (int)unsafe.objectFieldOffset((Field)object);
                    n10 = n14 % 32;
                } else {
                    n13 = 0;
                    n10 = 0;
                    n18 = n21;
                }
                n23 = n13;
                n26 = n10;
                n14 = n20;
                n27 = n33;
                n25 = n15;
                n24 = n22;
                n21 = n18;
                if (n29 >= 18) {
                    n23 = n13;
                    n26 = n10;
                    n14 = n20;
                    n27 = n33;
                    n25 = n15;
                    n24 = n22;
                    n21 = n18;
                    if (n29 <= 49) {
                        var33_11[n22] = n33;
                        n24 = n22 + 1;
                        n21 = n18;
                        n25 = n15;
                        n27 = n33;
                        n14 = n20;
                        n26 = n10;
                        n23 = n13;
                    }
                }
            }
            nArray[n32] = n31;
            n20 = (n30 & 0x200) != 0 ? 0x20000000 : 0;
            n15 = (n30 & 0x100) != 0 ? 0x10000000 : 0;
            nArray[n32 + 1] = n20 | n15 | n29 << 20 | n27;
            n10 = n32 + 3;
            nArray[n32 + 2] = n26 << 20 | n23;
            n20 = n16;
            n23 = n28;
            n15 = n25;
            n22 = n24;
        }
    }

    private int Q(int n8) {
        return this.a[n8];
    }

    private static long R(int n8) {
        return n8 & 0xFFFFF;
    }

    private static <T> boolean S(T t8, long l8) {
        return (Boolean)s0.A(t8, l8);
    }

    private static <T> double T(T t8, long l8) {
        return (Double)s0.A(t8, l8);
    }

    private static <T> float U(T t8, long l8) {
        return ((Float)s0.A(t8, l8)).floatValue();
    }

    private static <T> int V(T t8, long l8) {
        return (Integer)s0.A(t8, l8);
    }

    private static <T> long W(T t8, long l8) {
        return (Long)s0.A(t8, l8);
    }

    private int X(int n8) {
        if (n8 >= this.c && n8 <= this.d) {
            return this.g0(n8, 0);
        }
        return -1;
    }

    private int Y(int n8) {
        return this.a[n8 + 2];
    }

    private <E> void Z(Object object, long l8, g0 g02, h0<E> h02, p p8) throws IOException {
        g02.j(this.n.e(object, l8), h02, p8);
    }

    private <E> void a0(Object object, int n8, g0 g02, h0<E> h02, p p8) throws IOException {
        long l8 = V.R(n8);
        g02.r(this.n.e(object, l8), h02, p8);
    }

    private void b0(Object object, int n8, g0 g02) throws IOException {
        if (V.x(n8)) {
            s0.O(object, V.R(n8), g02.O());
            return;
        }
        if (this.g) {
            s0.O(object, V.R(n8), g02.C());
            return;
        }
        s0.O(object, V.R(n8), g02.G());
    }

    private void c0(Object object, int n8, g0 g02) throws IOException {
        if (V.x(n8)) {
            g02.F(this.n.e(object, V.R(n8)));
            return;
        }
        g02.E(this.n.e(object, V.R(n8)));
    }

    private static Field d0(Class<?> clazz, String string) {
        try {
            Field field = clazz.getDeclaredField(string);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Object object;
            Object[] objectArray = clazz.getDeclaredFields();
            int n8 = objectArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                object = objectArray[i8];
                if (!string.equals(((Field)object).getName())) continue;
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Field ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" for ");
            ((StringBuilder)object).append(clazz.getName());
            ((StringBuilder)object).append(" not found. Known fields are ");
            ((StringBuilder)object).append(Arrays.toString(objectArray));
            throw new RuntimeException(((StringBuilder)object).toString());
        }
    }

    private void e0(T t8, int n8) {
        if (this.h) {
            return;
        }
        n8 = this.Y(n8);
        long l8 = n8 & 0xFFFFF;
        s0.M(t8, l8, s0.x(t8, l8) | 1 << (n8 >>> 20));
    }

    private void f0(T t8, int n8, int n9) {
        s0.M(t8, this.Y(n9) & 0xFFFFF, n8);
    }

    private int g0(int n8, int n9) {
        int n10 = this.a.length / 3 - 1;
        while (n9 <= n10) {
            int n11 = n10 + n9 >>> 1;
            int n12 = n11 * 3;
            int n13 = this.Q(n12);
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

    private static int h0(int n8) {
        return (n8 & 0xFF00000) >>> 20;
    }

    private int i0(int n8) {
        return this.a[n8 + 1];
    }

    private boolean j(T t8, T t9, int n8) {
        return this.y(t8, n8) == this.y(t9, n8);
    }

    /*
     * Unable to fully structure code
     */
    private void j0(T var1_1, v0 var2_2) throws IOException {
        if (this.f && !(var15_3 = this.p.c(var1_1)).n()) {
            var16_4 = var15_3.s();
            var15_3 = var16_4.next();
        } else {
            var16_4 = null;
            var15_3 = null;
        }
        var8_5 = this.a.length;
        var17_6 = V.s;
        var3_7 = -1;
        var4_9 = 0;
        block71: for (var6_8 = 0; var6_8 < var8_5; var6_8 += 3) {
            var9_12 = this.i0(var6_8);
            var10_13 = this.Q(var6_8);
            var11_14 = V.h0(var9_12);
            if (!this.h && var11_14 <= 17) {
                var12_15 = this.a[var6_8 + 2];
                var7_11 = var12_15 & 1048575;
                var5_10 = var3_7;
                if (var7_11 != var3_7) {
                    var4_9 = var17_6.getInt(var1_1, var7_11);
                    var5_10 = var7_11;
                }
                var7_11 = 1 << (var12_15 >>> 20);
                var3_7 = var5_10;
            } else {
                var7_11 = 0;
            }
            while (var15_3 != null && this.p.a(var15_3) <= var10_13) {
                this.p.j(var2_2, var15_3);
                if (var16_4.hasNext()) {
                    var15_3 = var16_4.next();
                    continue;
                }
                var15_3 = null;
            }
            var13_16 = V.R(var9_12);
            switch (var11_14) lbl-1000:
            // 19 sources

            {
                default: {
                    continue block71;
                }
                case 68: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.s(var10_13, var17_6.getObject(var1_1, var13_16), this.s(var6_8));
                    continue block71;
                }
                case 67: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.D(var10_13, V.W(var1_1, var13_16));
                    continue block71;
                }
                case 66: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.N(var10_13, V.V(var1_1, var13_16));
                    continue block71;
                }
                case 65: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.y(var10_13, V.W(var1_1, var13_16));
                    continue block71;
                }
                case 64: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.q(var10_13, V.V(var1_1, var13_16));
                    continue block71;
                }
                case 63: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.J(var10_13, V.V(var1_1, var13_16));
                    continue block71;
                }
                case 62: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.b(var10_13, V.V(var1_1, var13_16));
                    continue block71;
                }
                case 61: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.r(var10_13, (h)var17_6.getObject(var1_1, var13_16));
                    continue block71;
                }
                case 60: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.I(var10_13, var17_6.getObject(var1_1, var13_16), this.s(var6_8));
                    continue block71;
                }
                case 59: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    this.n0(var10_13, var17_6.getObject(var1_1, var13_16), var2_2);
                    continue block71;
                }
                case 58: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.p(var10_13, V.S(var1_1, var13_16));
                    continue block71;
                }
                case 57: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.d(var10_13, V.V(var1_1, var13_16));
                    continue block71;
                }
                case 56: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.i(var10_13, V.W(var1_1, var13_16));
                    continue block71;
                }
                case 55: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.u(var10_13, V.V(var1_1, var13_16));
                    continue block71;
                }
                case 54: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.m(var10_13, V.W(var1_1, var13_16));
                    continue block71;
                }
                case 53: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.o(var10_13, V.W(var1_1, var13_16));
                    continue block71;
                }
                case 52: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.E(var10_13, V.U(var1_1, var13_16));
                    continue block71;
                }
                case 51: {
                    if (!this.E(var1_1, var10_13, var6_8)) ** GOTO lbl-1000
                    var2_2.e(var10_13, V.T(var1_1, var13_16));
                    continue block71;
                }
                case 50: {
                    this.m0(var2_2, var10_13, var17_6.getObject(var1_1, var13_16), var6_8);
                    continue block71;
                }
                case 49: {
                    j0.U(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, this.s(var6_8));
                    continue block71;
                }
                case 48: {
                    j0.b0(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 47: {
                    j0.a0(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 46: {
                    j0.Z(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 45: {
                    j0.Y(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 44: {
                    j0.Q(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 43: {
                    j0.d0(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 42: {
                    j0.N(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 41: {
                    j0.R(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 40: {
                    j0.S(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 39: {
                    j0.V(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 38: {
                    j0.e0(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 37: {
                    j0.W(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 36: {
                    j0.T(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 35: {
                    j0.P(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 34: {
                    j0.b0(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 33: {
                    j0.a0(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 32: {
                    j0.Z(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 31: {
                    j0.Y(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 30: {
                    j0.Q(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 29: {
                    j0.d0(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 28: {
                    j0.O(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2);
                    continue block71;
                }
                case 27: {
                    j0.X(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, this.s(var6_8));
                    continue block71;
                }
                case 26: {
                    j0.c0(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2);
                    continue block71;
                }
                case 25: {
                    j0.N(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 24: {
                    j0.R(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 23: {
                    j0.S(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 22: {
                    j0.V(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 21: {
                    j0.e0(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 20: {
                    j0.W(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 19: {
                    j0.T(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 18: {
                    j0.P(this.Q(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 17: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.s(var10_13, var17_6.getObject(var1_1, var13_16), this.s(var6_8));
                    continue block71;
                }
                case 16: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.D(var10_13, var17_6.getLong(var1_1, var13_16));
                    continue block71;
                }
                case 15: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.N(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 14: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.y(var10_13, var17_6.getLong(var1_1, var13_16));
                    continue block71;
                }
                case 13: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.q(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 12: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.J(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 11: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.b(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 10: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.r(var10_13, (h)var17_6.getObject(var1_1, var13_16));
                    continue block71;
                }
                case 9: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.I(var10_13, var17_6.getObject(var1_1, var13_16), this.s(var6_8));
                    continue block71;
                }
                case 8: {
                    if (!(var4_9 & var7_11)) continue block71;
                    this.n0(var10_13, var17_6.getObject(var1_1, var13_16), var2_2);
                    continue block71;
                }
                case 7: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.p(var10_13, V.k(var1_1, var13_16));
                    continue block71;
                }
                case 6: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.d(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 5: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.i(var10_13, var17_6.getLong(var1_1, var13_16));
                    continue block71;
                }
                case 4: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.u(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 3: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.m(var10_13, var17_6.getLong(var1_1, var13_16));
                    continue block71;
                }
                case 2: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.o(var10_13, var17_6.getLong(var1_1, var13_16));
                    continue block71;
                }
                case 1: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.E(var10_13, V.p(var1_1, var13_16));
                    continue block71;
                }
                case 0: {
                    if (!(var4_9 & var7_11)) continue block71;
                    var2_2.e(var10_13, V.l(var1_1, var13_16));
                }
            }
        }
        while (var15_3 != null) {
            this.p.j(var2_2, var15_3);
            if (var16_4.hasNext()) {
                var15_3 = var16_4.next();
                continue;
            }
            var15_3 = null;
        }
        this.o0(this.o, var1_1, var2_2);
    }

    private static <T> boolean k(T t8, long l8) {
        return s0.p(t8, l8);
    }

    private void k0(T t8, v0 v02) throws IOException {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> iterator;
        Object object;
        if (this.f && !((u)(object = this.p.c(t8))).n()) {
            iterator = ((u)object).s();
            entry = iterator.next();
        } else {
            iterator = null;
            entry = null;
        }
        int n8 = this.a.length;
        int n9 = 0;
        while (true) {
            object = entry;
            if (n9 >= n8) break;
            int n10 = this.i0(n9);
            int n11 = this.Q(n9);
            while (entry != null && this.p.a(entry) <= n11) {
                this.p.j(v02, entry);
                if (iterator.hasNext()) {
                    entry = iterator.next();
                    continue;
                }
                entry = null;
            }
            switch (V.h0(n10)) {
                default: {
                    break;
                }
                case 68: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.s(n11, s0.A(t8, V.R(n10)), this.s(n9));
                    break;
                }
                case 67: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.D(n11, V.W(t8, V.R(n10)));
                    break;
                }
                case 66: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.N(n11, V.V(t8, V.R(n10)));
                    break;
                }
                case 65: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.y(n11, V.W(t8, V.R(n10)));
                    break;
                }
                case 64: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.q(n11, V.V(t8, V.R(n10)));
                    break;
                }
                case 63: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.J(n11, V.V(t8, V.R(n10)));
                    break;
                }
                case 62: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.b(n11, V.V(t8, V.R(n10)));
                    break;
                }
                case 61: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.r(n11, (h)s0.A(t8, V.R(n10)));
                    break;
                }
                case 60: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.I(n11, s0.A(t8, V.R(n10)), this.s(n9));
                    break;
                }
                case 59: {
                    if (!this.E(t8, n11, n9)) break;
                    this.n0(n11, s0.A(t8, V.R(n10)), v02);
                    break;
                }
                case 58: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.p(n11, V.S(t8, V.R(n10)));
                    break;
                }
                case 57: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.d(n11, V.V(t8, V.R(n10)));
                    break;
                }
                case 56: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.i(n11, V.W(t8, V.R(n10)));
                    break;
                }
                case 55: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.u(n11, V.V(t8, V.R(n10)));
                    break;
                }
                case 54: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.m(n11, V.W(t8, V.R(n10)));
                    break;
                }
                case 53: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.o(n11, V.W(t8, V.R(n10)));
                    break;
                }
                case 52: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.E(n11, V.U(t8, V.R(n10)));
                    break;
                }
                case 51: {
                    if (!this.E(t8, n11, n9)) break;
                    v02.e(n11, V.T(t8, V.R(n10)));
                    break;
                }
                case 50: {
                    this.m0(v02, n11, s0.A(t8, V.R(n10)), n9);
                    break;
                }
                case 49: {
                    j0.U(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, this.s(n9));
                    break;
                }
                case 48: {
                    j0.b0(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 47: {
                    j0.a0(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 46: {
                    j0.Z(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 45: {
                    j0.Y(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 44: {
                    j0.Q(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 43: {
                    j0.d0(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 42: {
                    j0.N(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 41: {
                    j0.R(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 40: {
                    j0.S(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 39: {
                    j0.V(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 38: {
                    j0.e0(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 37: {
                    j0.W(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 36: {
                    j0.T(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 35: {
                    j0.P(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, true);
                    break;
                }
                case 34: {
                    j0.b0(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 33: {
                    j0.a0(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 32: {
                    j0.Z(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 31: {
                    j0.Y(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 30: {
                    j0.Q(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 29: {
                    j0.d0(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 28: {
                    j0.O(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02);
                    break;
                }
                case 27: {
                    j0.X(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, this.s(n9));
                    break;
                }
                case 26: {
                    j0.c0(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02);
                    break;
                }
                case 25: {
                    j0.N(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 24: {
                    j0.R(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 23: {
                    j0.S(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 22: {
                    j0.V(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 21: {
                    j0.e0(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 20: {
                    j0.W(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 19: {
                    j0.T(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 18: {
                    j0.P(this.Q(n9), (List)s0.A(t8, V.R(n10)), v02, false);
                    break;
                }
                case 17: {
                    if (!this.y(t8, n9)) break;
                    v02.s(n11, s0.A(t8, V.R(n10)), this.s(n9));
                    break;
                }
                case 16: {
                    if (!this.y(t8, n9)) break;
                    v02.D(n11, V.H(t8, V.R(n10)));
                    break;
                }
                case 15: {
                    if (!this.y(t8, n9)) break;
                    v02.N(n11, V.w(t8, V.R(n10)));
                    break;
                }
                case 14: {
                    if (!this.y(t8, n9)) break;
                    v02.y(n11, V.H(t8, V.R(n10)));
                    break;
                }
                case 13: {
                    if (!this.y(t8, n9)) break;
                    v02.q(n11, V.w(t8, V.R(n10)));
                    break;
                }
                case 12: {
                    if (!this.y(t8, n9)) break;
                    v02.J(n11, V.w(t8, V.R(n10)));
                    break;
                }
                case 11: {
                    if (!this.y(t8, n9)) break;
                    v02.b(n11, V.w(t8, V.R(n10)));
                    break;
                }
                case 10: {
                    if (!this.y(t8, n9)) break;
                    v02.r(n11, (h)s0.A(t8, V.R(n10)));
                    break;
                }
                case 9: {
                    if (!this.y(t8, n9)) break;
                    v02.I(n11, s0.A(t8, V.R(n10)), this.s(n9));
                    break;
                }
                case 8: {
                    if (!this.y(t8, n9)) break;
                    this.n0(n11, s0.A(t8, V.R(n10)), v02);
                    break;
                }
                case 7: {
                    if (!this.y(t8, n9)) break;
                    v02.p(n11, V.k(t8, V.R(n10)));
                    break;
                }
                case 6: {
                    if (!this.y(t8, n9)) break;
                    v02.d(n11, V.w(t8, V.R(n10)));
                    break;
                }
                case 5: {
                    if (!this.y(t8, n9)) break;
                    v02.i(n11, V.H(t8, V.R(n10)));
                    break;
                }
                case 4: {
                    if (!this.y(t8, n9)) break;
                    v02.u(n11, V.w(t8, V.R(n10)));
                    break;
                }
                case 3: {
                    if (!this.y(t8, n9)) break;
                    v02.m(n11, V.H(t8, V.R(n10)));
                    break;
                }
                case 2: {
                    if (!this.y(t8, n9)) break;
                    v02.o(n11, V.H(t8, V.R(n10)));
                    break;
                }
                case 1: {
                    if (!this.y(t8, n9)) break;
                    v02.E(n11, V.p(t8, V.R(n10)));
                    break;
                }
                case 0: {
                    if (!this.y(t8, n9)) break;
                    v02.e(n11, V.l(t8, V.R(n10)));
                }
            }
            n9 += 3;
        }
        while (object != null) {
            this.p.j(v02, (Map.Entry<?, ?>)object);
            if (iterator.hasNext()) {
                object = iterator.next();
                continue;
            }
            object = null;
        }
        this.o0(this.o, t8, v02);
    }

    private static <T> double l(T t8, long l8) {
        return s0.v(t8, l8);
    }

    private void l0(T t8, v0 v02) throws IOException {
        Object object;
        Iterator<Map.Entry<?, Object>> iterator;
        Map.Entry<?, Object> entry;
        this.o0(this.o, t8, v02);
        if (this.f && !((u)((Object)(entry = this.p.c(t8)))).n()) {
            iterator = ((u)((Object)entry)).g();
            entry = iterator.next();
        } else {
            iterator = null;
            entry = null;
        }
        int n8 = this.a.length - 3;
        while (true) {
            object = entry;
            if (n8 < 0) break;
            int n9 = this.i0(n8);
            int n10 = this.Q(n8);
            while (entry != null && this.p.a(entry) > n10) {
                this.p.j(v02, entry);
                if (iterator.hasNext()) {
                    entry = iterator.next();
                    continue;
                }
                entry = null;
            }
            switch (V.h0(n9)) {
                default: {
                    break;
                }
                case 68: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.s(n10, s0.A(t8, V.R(n9)), this.s(n8));
                    break;
                }
                case 67: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.D(n10, V.W(t8, V.R(n9)));
                    break;
                }
                case 66: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.N(n10, V.V(t8, V.R(n9)));
                    break;
                }
                case 65: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.y(n10, V.W(t8, V.R(n9)));
                    break;
                }
                case 64: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.q(n10, V.V(t8, V.R(n9)));
                    break;
                }
                case 63: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.J(n10, V.V(t8, V.R(n9)));
                    break;
                }
                case 62: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.b(n10, V.V(t8, V.R(n9)));
                    break;
                }
                case 61: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.r(n10, (h)s0.A(t8, V.R(n9)));
                    break;
                }
                case 60: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.I(n10, s0.A(t8, V.R(n9)), this.s(n8));
                    break;
                }
                case 59: {
                    if (!this.E(t8, n10, n8)) break;
                    this.n0(n10, s0.A(t8, V.R(n9)), v02);
                    break;
                }
                case 58: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.p(n10, V.S(t8, V.R(n9)));
                    break;
                }
                case 57: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.d(n10, V.V(t8, V.R(n9)));
                    break;
                }
                case 56: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.i(n10, V.W(t8, V.R(n9)));
                    break;
                }
                case 55: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.u(n10, V.V(t8, V.R(n9)));
                    break;
                }
                case 54: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.m(n10, V.W(t8, V.R(n9)));
                    break;
                }
                case 53: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.o(n10, V.W(t8, V.R(n9)));
                    break;
                }
                case 52: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.E(n10, V.U(t8, V.R(n9)));
                    break;
                }
                case 51: {
                    if (!this.E(t8, n10, n8)) break;
                    v02.e(n10, V.T(t8, V.R(n9)));
                    break;
                }
                case 50: {
                    this.m0(v02, n10, s0.A(t8, V.R(n9)), n8);
                    break;
                }
                case 49: {
                    j0.U(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, this.s(n8));
                    break;
                }
                case 48: {
                    j0.b0(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 47: {
                    j0.a0(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 46: {
                    j0.Z(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 45: {
                    j0.Y(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 44: {
                    j0.Q(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 43: {
                    j0.d0(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 42: {
                    j0.N(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 41: {
                    j0.R(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 40: {
                    j0.S(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 39: {
                    j0.V(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 38: {
                    j0.e0(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 37: {
                    j0.W(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 36: {
                    j0.T(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 35: {
                    j0.P(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, true);
                    break;
                }
                case 34: {
                    j0.b0(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 33: {
                    j0.a0(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 32: {
                    j0.Z(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 31: {
                    j0.Y(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 30: {
                    j0.Q(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 29: {
                    j0.d0(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 28: {
                    j0.O(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02);
                    break;
                }
                case 27: {
                    j0.X(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, this.s(n8));
                    break;
                }
                case 26: {
                    j0.c0(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02);
                    break;
                }
                case 25: {
                    j0.N(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 24: {
                    j0.R(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 23: {
                    j0.S(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 22: {
                    j0.V(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 21: {
                    j0.e0(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 20: {
                    j0.W(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 19: {
                    j0.T(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 18: {
                    j0.P(this.Q(n8), (List)s0.A(t8, V.R(n9)), v02, false);
                    break;
                }
                case 17: {
                    if (!this.y(t8, n8)) break;
                    v02.s(n10, s0.A(t8, V.R(n9)), this.s(n8));
                    break;
                }
                case 16: {
                    if (!this.y(t8, n8)) break;
                    v02.D(n10, V.H(t8, V.R(n9)));
                    break;
                }
                case 15: {
                    if (!this.y(t8, n8)) break;
                    v02.N(n10, V.w(t8, V.R(n9)));
                    break;
                }
                case 14: {
                    if (!this.y(t8, n8)) break;
                    v02.y(n10, V.H(t8, V.R(n9)));
                    break;
                }
                case 13: {
                    if (!this.y(t8, n8)) break;
                    v02.q(n10, V.w(t8, V.R(n9)));
                    break;
                }
                case 12: {
                    if (!this.y(t8, n8)) break;
                    v02.J(n10, V.w(t8, V.R(n9)));
                    break;
                }
                case 11: {
                    if (!this.y(t8, n8)) break;
                    v02.b(n10, V.w(t8, V.R(n9)));
                    break;
                }
                case 10: {
                    if (!this.y(t8, n8)) break;
                    v02.r(n10, (h)s0.A(t8, V.R(n9)));
                    break;
                }
                case 9: {
                    if (!this.y(t8, n8)) break;
                    v02.I(n10, s0.A(t8, V.R(n9)), this.s(n8));
                    break;
                }
                case 8: {
                    if (!this.y(t8, n8)) break;
                    this.n0(n10, s0.A(t8, V.R(n9)), v02);
                    break;
                }
                case 7: {
                    if (!this.y(t8, n8)) break;
                    v02.p(n10, V.k(t8, V.R(n9)));
                    break;
                }
                case 6: {
                    if (!this.y(t8, n8)) break;
                    v02.d(n10, V.w(t8, V.R(n9)));
                    break;
                }
                case 5: {
                    if (!this.y(t8, n8)) break;
                    v02.i(n10, V.H(t8, V.R(n9)));
                    break;
                }
                case 4: {
                    if (!this.y(t8, n8)) break;
                    v02.u(n10, V.w(t8, V.R(n9)));
                    break;
                }
                case 3: {
                    if (!this.y(t8, n8)) break;
                    v02.m(n10, V.H(t8, V.R(n9)));
                    break;
                }
                case 2: {
                    if (!this.y(t8, n8)) break;
                    v02.o(n10, V.H(t8, V.R(n9)));
                    break;
                }
                case 1: {
                    if (!this.y(t8, n8)) break;
                    v02.E(n10, V.p(t8, V.R(n9)));
                    break;
                }
                case 0: {
                    if (!this.y(t8, n8)) break;
                    v02.e(n10, V.l(t8, V.R(n9)));
                }
            }
            n8 -= 3;
        }
        while (object != null) {
            this.p.j(v02, (Map.Entry<?, ?>)object);
            if (iterator.hasNext()) {
                object = iterator.next();
                continue;
            }
            object = null;
        }
    }

    private boolean m(T t8, T t9, int n8) {
        int n9 = this.i0(n8);
        long l8 = V.R(n9);
        switch (V.h0(n9)) {
            default: {
                return true;
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
                return this.D(t8, t9, n8) && j0.K(s0.A(t8, l8), s0.A(t9, l8));
            }
            case 50: {
                return j0.K(s0.A(t8, l8), s0.A(t9, l8));
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
                return j0.K(s0.A(t8, l8), s0.A(t9, l8));
            }
            case 17: {
                return this.j(t8, t9, n8) && j0.K(s0.A(t8, l8), s0.A(t9, l8));
            }
            case 16: {
                return this.j(t8, t9, n8) && s0.y(t8, l8) == s0.y(t9, l8);
            }
            case 15: {
                return this.j(t8, t9, n8) && s0.x(t8, l8) == s0.x(t9, l8);
            }
            case 14: {
                return this.j(t8, t9, n8) && s0.y(t8, l8) == s0.y(t9, l8);
            }
            case 13: {
                return this.j(t8, t9, n8) && s0.x(t8, l8) == s0.x(t9, l8);
            }
            case 12: {
                return this.j(t8, t9, n8) && s0.x(t8, l8) == s0.x(t9, l8);
            }
            case 11: {
                return this.j(t8, t9, n8) && s0.x(t8, l8) == s0.x(t9, l8);
            }
            case 10: {
                return this.j(t8, t9, n8) && j0.K(s0.A(t8, l8), s0.A(t9, l8));
            }
            case 9: {
                return this.j(t8, t9, n8) && j0.K(s0.A(t8, l8), s0.A(t9, l8));
            }
            case 8: {
                return this.j(t8, t9, n8) && j0.K(s0.A(t8, l8), s0.A(t9, l8));
            }
            case 7: {
                return this.j(t8, t9, n8) && s0.p(t8, l8) == s0.p(t9, l8);
            }
            case 6: {
                return this.j(t8, t9, n8) && s0.x(t8, l8) == s0.x(t9, l8);
            }
            case 5: {
                return this.j(t8, t9, n8) && s0.y(t8, l8) == s0.y(t9, l8);
            }
            case 4: {
                return this.j(t8, t9, n8) && s0.x(t8, l8) == s0.x(t9, l8);
            }
            case 3: {
                return this.j(t8, t9, n8) && s0.y(t8, l8) == s0.y(t9, l8);
            }
            case 2: {
                return this.j(t8, t9, n8) && s0.y(t8, l8) == s0.y(t9, l8);
            }
            case 1: {
                return this.j(t8, t9, n8) && Float.floatToIntBits(s0.w(t8, l8)) == Float.floatToIntBits(s0.w(t9, l8));
            }
            case 0: 
        }
        return this.j(t8, t9, n8) && Double.doubleToLongBits(s0.v(t8, l8)) == Double.doubleToLongBits(s0.v(t9, l8));
    }

    private <K, V> void m0(v0 v02, int n8, Object object, int n9) throws IOException {
        if (object != null) {
            v02.x(n8, this.q.c(this.r(n9)), this.q.h(object));
        }
    }

    private final <UT, UB> UB n(Object object, int n8, UB UB, o0<UT, UB> o02) {
        int n9 = this.Q(n8);
        Object object2 = s0.A(object, V.R(this.i0(n8)));
        if (object2 == null || (object = this.q(n8)) == null) {
            return UB;
        }
        return this.o(n8, n9, this.q.d(object2), (A.e)object, UB, o02);
    }

    private void n0(int n8, Object object, v0 v02) throws IOException {
        if (object instanceof String) {
            v02.l(n8, (String)object);
            return;
        }
        v02.r(n8, (h)object);
    }

    private final <K, V, UT, UB> UB o(int n8, int n9, Map<K, V> map, A.e e8, UB object, o0<UT, UB> o02) {
        K.a<?, ?> a8 = this.q.c(this.r(n8));
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (e8.a((Integer)entry.getValue())) continue;
            map = object;
            if (object == null) {
                map = o02.n();
            }
            h.h h8 = ax.r0.h.t(K.b(a8, entry.getKey(), entry.getValue()));
            object = h8.b();
            try {
                K.e(object, a8, entry.getKey(), entry.getValue());
                o02.d(map, n9, h8.a());
                iterator.remove();
                object = map;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        return object;
    }

    private <UT, UB> void o0(o0<UT, UB> o02, T t8, v0 v02) throws IOException {
        o02.t(o02.g(t8), v02);
    }

    private static <T> float p(T t8, long l8) {
        return s0.w(t8, l8);
    }

    private A.e q(int n8) {
        return (A.e)this.b[n8 / 3 * 2 + 1];
    }

    private Object r(int n8) {
        return this.b[n8 / 3 * 2];
    }

    private h0 s(int n8) {
        h0 h02 = (h0)this.b[n8 = n8 / 3 * 2];
        if (h02 != null) {
            return h02;
        }
        this.b[n8] = h02 = d0.a().d((Class)this.b[n8 + 1]);
        return h02;
    }

    /*
     * Unable to fully structure code
     */
    private int t(T var1_1) {
        var15_2 = V.s;
        var2_3 = -1;
        var5_5 = 0;
        var3_6 = 0;
        for (var7_4 = 0; var7_4 < this.a.length; var7_4 += 3) {
            block98: {
                var12_13 = this.i0(var7_4);
                var10_11 = this.Q(var7_4);
                var11_12 = V.h0(var12_13);
                if (var11_12 <= 17) {
                    var4_7 = this.a[var7_4 + 2];
                    var8_9 = 1048575 & var4_7;
                    var6_8 = var2_3;
                    if (var8_9 != var2_3) {
                        var3_6 = var15_2.getInt(var1_1, var8_9);
                        var6_8 = var8_9;
                    }
                    var9_10 = 1 << (var4_7 >>> 20);
                    var8_9 = var3_6;
                } else if (this.i && var11_12 >= v.P0.d() && var11_12 <= v.c1.d()) {
                    var4_7 = this.a[var7_4 + 2] & 1048575;
lbl21:
                    // 2 sources

                    while (true) {
                        var9_10 = 0;
                        var6_8 = var2_3;
                        var8_9 = var3_6;
                        break;
                    }
                } else {
                    var4_7 = 0;
                    ** continue;
                }
                var13_14 = V.R(var12_13);
                switch (var11_12) {
                    default: {
                        var2_3 = var5_5;
                        ** GOTO lbl39
                    }
                    case 68: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.s(var10_11, (S)var15_2.getObject(var1_1, var13_14), this.s(var7_4));
lbl37:
                        // 50 sources

                        while (true) {
                            var2_3 = var5_5 + var2_3;
lbl39:
                            // 47 sources

                            while (true) {
                                var3_6 = var2_3;
                                break block98;
                                break;
                            }
                            break;
                        }
                    }
                    case 67: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.R(var10_11, V.W(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 66: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.P(var10_11, V.V(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 65: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.N(var10_11, 0L);
                        ** GOTO lbl37
                    }
                    case 64: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.L(var10_11, 0);
                        ** GOTO lbl37
                    }
                    case 63: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.k(var10_11, V.V(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 62: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.W(var10_11, V.V(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 61: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.g(var10_11, (h)var15_2.getObject(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 60: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = j0.o(var10_11, var15_2.getObject(var1_1, var13_14), this.s(var7_4));
                        ** GOTO lbl37
                    }
                    case 59: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var16_15 = var15_2.getObject(var1_1, var13_14);
                        if (!(var16_15 instanceof h)) ** GOTO lbl89
                        var2_3 = ax.r0.k.g(var10_11, (h)var16_15);
                        ** GOTO lbl37
lbl89:
                        // 1 sources

                        var2_3 = ax.r0.k.T(var10_11, (String)var16_15);
                        ** GOTO lbl37
                    }
                    case 58: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.d(var10_11, true);
                        ** GOTO lbl37
                    }
                    case 57: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.m(var10_11, 0);
                        ** GOTO lbl37
                    }
                    case 56: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.o(var10_11, 0L);
                        ** GOTO lbl37
                    }
                    case 55: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.v(var10_11, V.V(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 54: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.Y(var10_11, V.W(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 53: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.x(var10_11, V.W(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 52: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.q(var10_11, 0.0f);
                        ** GOTO lbl37
                    }
                    case 51: {
                        var2_3 = var5_5;
                        if (!this.E(var1_1, var10_11, var7_4)) ** GOTO lbl39
                        var2_3 = ax.r0.k.i(var10_11, 0.0);
                        ** GOTO lbl37
                    }
                    case 50: {
                        var2_3 = this.q.f(var10_11, var15_2.getObject(var1_1, var13_14), this.r(var7_4));
                        ** GOTO lbl37
                    }
                    case 49: {
                        var2_3 = j0.j(var10_11, (List)var15_2.getObject(var1_1, var13_14), this.s(var7_4));
                        ** GOTO lbl37
                    }
                    case 48: {
                        var9_10 = j0.t((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var9_10 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var9_10);
                        }
                        var3_6 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var9_10);
                        var2_3 = var9_10;
lbl146:
                        // 14 sources

                        while (true) {
                            var2_3 = var5_5 + (var3_6 + var4_7 + var2_3);
                            ** GOTO lbl39
                            break;
                        }
                    }
                    case 47: {
                        var3_6 = j0.r((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 46: {
                        var3_6 = j0.i((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 45: {
                        var3_6 = j0.g((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 44: {
                        var3_6 = j0.e((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 43: {
                        var3_6 = j0.w((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 42: {
                        var3_6 = j0.b((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 41: {
                        var3_6 = j0.g((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 40: {
                        var3_6 = j0.i((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 39: {
                        var3_6 = j0.l((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 38: {
                        var3_6 = j0.y((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 37: {
                        var3_6 = j0.n((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 36: {
                        var3_6 = j0.g((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** GOTO lbl146
                    }
                    case 35: {
                        var3_6 = j0.i((List)var15_2.getObject(var1_1, var13_14));
                        var2_3 = var5_5;
                        if (var3_6 <= 0) ** GOTO lbl39
                        if (this.i) {
                            var15_2.putInt(var1_1, var4_7, var3_6);
                        }
                        var9_10 = ax.r0.k.V(var10_11);
                        var4_7 = ax.r0.k.X(var3_6);
                        var2_3 = var3_6;
                        var3_6 = var9_10;
                        ** continue;
                    }
                    case 34: {
                        var2_3 = j0.s(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 33: {
                        var2_3 = j0.q(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 32: {
                        var2_3 = j0.h(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 31: {
                        var2_3 = j0.f(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 30: {
                        var2_3 = j0.d(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 29: {
                        var2_3 = j0.v(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 28: {
                        var2_3 = j0.c(var10_11, (List)var15_2.getObject(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 27: {
                        var2_3 = j0.p(var10_11, (List)var15_2.getObject(var1_1, var13_14), this.s(var7_4));
                        ** GOTO lbl37
                    }
                    case 26: {
                        var2_3 = j0.u(var10_11, (List)var15_2.getObject(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 25: {
                        var2_3 = j0.a(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 24: {
                        var2_3 = j0.f(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 23: {
                        var2_3 = j0.h(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 22: {
                        var2_3 = j0.k(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 21: {
                        var2_3 = j0.x(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 20: {
                        var2_3 = j0.m(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 19: {
                        var2_3 = j0.f(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 18: {
                        var2_3 = j0.h(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                        ** GOTO lbl37
                    }
                    case 17: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var2_3 = ax.r0.k.s(var10_11, (S)var15_2.getObject(var1_1, var13_14), this.s(var7_4));
                        ** GOTO lbl37
                    }
                    case 16: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var2_3 = ax.r0.k.R(var10_11, var15_2.getLong(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 15: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var2_3 = ax.r0.k.P(var10_11, var15_2.getInt(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 14: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var2_3 = ax.r0.k.N(var10_11, 0L);
                        ** GOTO lbl37
                    }
                    case 13: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var2_3 = ax.r0.k.L(var10_11, 0);
                        ** GOTO lbl37
                    }
                    case 12: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var2_3 = ax.r0.k.k(var10_11, var15_2.getInt(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 11: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var2_3 = ax.r0.k.W(var10_11, var15_2.getInt(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 10: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var2_3 = ax.r0.k.g(var10_11, (h)var15_2.getObject(var1_1, var13_14));
                        ** GOTO lbl37
                    }
                    case 9: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var2_3 = j0.o(var10_11, var15_2.getObject(var1_1, var13_14), this.s(var7_4));
                        ** GOTO lbl37
                    }
                    case 8: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var16_15 = var15_2.getObject(var1_1, var13_14);
                        if (!(var16_15 instanceof h)) ** GOTO lbl395
                        var2_3 = ax.r0.k.g(var10_11, (h)var16_15);
                        ** GOTO lbl37
lbl395:
                        // 1 sources

                        var2_3 = ax.r0.k.T(var10_11, (String)var16_15);
                        ** GOTO lbl37
                    }
                    case 7: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) == 0) ** GOTO lbl39
                        var2_3 = ax.r0.k.d(var10_11, true);
                        ** continue;
                    }
                    case 6: {
                        var2_3 = var5_5;
                        if ((var8_9 & var9_10) != 0) ** break;
                        ** continue;
                        var2_3 = ax.r0.k.m(var10_11, 0);
lbl407:
                        // 7 sources

                        while (true) {
                            var3_6 = var5_5 + var2_3;
                            break block98;
                            break;
                        }
                    }
                    case 5: {
                        var3_6 = var5_5;
                        if ((var8_9 & var9_10) == 0) break block98;
                        var2_3 = ax.r0.k.o(var10_11, 0L);
                        ** GOTO lbl407
                    }
                    case 4: {
                        var3_6 = var5_5;
                        if ((var8_9 & var9_10) == 0) break block98;
                        var2_3 = ax.r0.k.v(var10_11, var15_2.getInt(var1_1, var13_14));
                        ** GOTO lbl407
                    }
                    case 3: {
                        var3_6 = var5_5;
                        if ((var8_9 & var9_10) == 0) break block98;
                        var2_3 = ax.r0.k.Y(var10_11, var15_2.getLong(var1_1, var13_14));
                        ** GOTO lbl407
                    }
                    case 2: {
                        var3_6 = var5_5;
                        if ((var8_9 & var9_10) == 0) break block98;
                        var2_3 = ax.r0.k.x(var10_11, var15_2.getLong(var1_1, var13_14));
                        ** GOTO lbl407
                    }
                    case 1: {
                        var3_6 = var5_5;
                        if ((var8_9 & var9_10) == 0) break block98;
                        var2_3 = ax.r0.k.q(var10_11, 0.0f);
                        ** GOTO lbl407
                    }
                    case 0: 
                }
                var3_6 = var5_5;
                if ((var8_9 & var9_10) != 0) {
                    var2_3 = ax.r0.k.i(var10_11, 0.0);
                    ** continue;
                }
            }
            var2_3 = var6_8;
            var5_5 = var3_6;
            var3_6 = var8_9;
        }
        var2_3 = var3_6 = var5_5 + this.v(this.o, var1_1);
        if (this.f) {
            var2_3 = var3_6 + this.p.c(var1_1).l();
        }
        return var2_3;
    }

    /*
     * Unable to fully structure code
     */
    private int u(T var1_1) {
        var11_2 = V.s;
        var6_4 = 0;
        for (var5_3 = 0; var5_3 < this.a.length; var5_3 += 3) {
            var2_5 = this.i0(var5_3);
            var3_6 = V.h0(var2_5);
            var8_9 = this.Q(var5_3);
            var9_10 = V.R(var2_5);
            var2_5 = var3_6 >= v.P0.d() && var3_6 <= v.c1.d() ? this.a[var5_3 + 2] & 1048575 : 0;
            block0 : switch (var3_6) {
                default: {
                    var3_6 = var6_4;
                    break;
                }
                case 68: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.s(var8_9, (S)s0.A(var1_1, var9_10), this.s(var5_3));
lbl17:
                    // 58 sources

                    while (true) {
                        var3_6 = var6_4 + var2_5;
                        break block0;
                        break;
                    }
                }
                case 67: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.R(var8_9, V.W(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 66: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.P(var8_9, V.V(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 65: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.N(var8_9, 0L);
                    ** GOTO lbl17
                }
                case 64: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.L(var8_9, 0);
                    ** GOTO lbl17
                }
                case 63: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.k(var8_9, V.V(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 62: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.W(var8_9, V.V(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 61: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.g(var8_9, (h)s0.A(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 60: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = j0.o(var8_9, s0.A(var1_1, var9_10), this.s(var5_3));
                    ** GOTO lbl17
                }
                case 59: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var12_11 = s0.A(var1_1, var9_10);
                    if (!(var12_11 instanceof h)) ** GOTO lbl67
                    var2_5 = ax.r0.k.g(var8_9, (h)var12_11);
                    ** GOTO lbl17
lbl67:
                    // 1 sources

                    var2_5 = ax.r0.k.T(var8_9, (String)var12_11);
                    ** GOTO lbl17
                }
                case 58: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.d(var8_9, true);
                    ** GOTO lbl17
                }
                case 57: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.m(var8_9, 0);
                    ** GOTO lbl17
                }
                case 56: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.o(var8_9, 0L);
                    ** GOTO lbl17
                }
                case 55: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.v(var8_9, V.V(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 54: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.Y(var8_9, V.W(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 53: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.x(var8_9, V.W(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 52: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.q(var8_9, 0.0f);
                    ** GOTO lbl17
                }
                case 51: {
                    var3_6 = var6_4;
                    if (!this.E(var1_1, var8_9, var5_3)) break;
                    var2_5 = ax.r0.k.i(var8_9, 0.0);
                    ** GOTO lbl17
                }
                case 50: {
                    var2_5 = this.q.f(var8_9, s0.A(var1_1, var9_10), this.r(var5_3));
                    ** GOTO lbl17
                }
                case 49: {
                    var2_5 = j0.j(var8_9, V.G(var1_1, var9_10), this.s(var5_3));
                    ** GOTO lbl17
                }
                case 48: {
                    var7_8 = j0.t((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var7_8 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var7_8);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var4_7 = ax.r0.k.X(var7_8);
                    var3_6 = var7_8;
lbl124:
                    // 14 sources

                    while (true) {
                        var2_5 = var2_5 + var4_7 + var3_6;
                        ** GOTO lbl17
                        break;
                    }
                }
                case 47: {
                    var4_7 = j0.r((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 46: {
                    var4_7 = j0.i((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 45: {
                    var4_7 = j0.g((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 44: {
                    var4_7 = j0.e((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 43: {
                    var4_7 = j0.w((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 42: {
                    var4_7 = j0.b((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 41: {
                    var4_7 = j0.g((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 40: {
                    var4_7 = j0.i((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 39: {
                    var4_7 = j0.l((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 38: {
                    var4_7 = j0.y((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 37: {
                    var4_7 = j0.n((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 36: {
                    var4_7 = j0.g((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 35: {
                    var4_7 = j0.i((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var6_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, var2_5, var4_7);
                    }
                    var2_5 = ax.r0.k.V(var8_9);
                    var7_8 = ax.r0.k.X(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** continue;
                }
                case 34: {
                    var2_5 = j0.s(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 33: {
                    var2_5 = j0.q(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 32: {
                    var2_5 = j0.h(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 31: {
                    var2_5 = j0.f(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 30: {
                    var2_5 = j0.d(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 29: {
                    var2_5 = j0.v(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 28: {
                    var2_5 = j0.c(var8_9, V.G(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 27: {
                    var2_5 = j0.p(var8_9, V.G(var1_1, var9_10), this.s(var5_3));
                    ** GOTO lbl17
                }
                case 26: {
                    var2_5 = j0.u(var8_9, V.G(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 25: {
                    var2_5 = j0.a(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 24: {
                    var2_5 = j0.f(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 23: {
                    var2_5 = j0.h(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 22: {
                    var2_5 = j0.k(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 21: {
                    var2_5 = j0.x(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 20: {
                    var2_5 = j0.m(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 19: {
                    var2_5 = j0.f(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 18: {
                    var2_5 = j0.h(var8_9, V.G(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 17: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.s(var8_9, (S)s0.A(var1_1, var9_10), this.s(var5_3));
                    ** GOTO lbl17
                }
                case 16: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.R(var8_9, s0.y(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 15: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.P(var8_9, s0.x(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 14: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.N(var8_9, 0L);
                    ** GOTO lbl17
                }
                case 13: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.L(var8_9, 0);
                    ** GOTO lbl17
                }
                case 12: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.k(var8_9, s0.x(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 11: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.W(var8_9, s0.x(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 10: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.g(var8_9, (h)s0.A(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 9: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = j0.o(var8_9, s0.A(var1_1, var9_10), this.s(var5_3));
                    ** GOTO lbl17
                }
                case 8: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var12_11 = s0.A(var1_1, var9_10);
                    if (!(var12_11 instanceof h)) ** GOTO lbl373
                    var2_5 = ax.r0.k.g(var8_9, (h)var12_11);
                    ** GOTO lbl17
lbl373:
                    // 1 sources

                    var2_5 = ax.r0.k.T(var8_9, (String)var12_11);
                    ** GOTO lbl17
                }
                case 7: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.d(var8_9, true);
                    ** GOTO lbl17
                }
                case 6: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.m(var8_9, 0);
                    ** GOTO lbl17
                }
                case 5: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.o(var8_9, 0L);
                    ** GOTO lbl17
                }
                case 4: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.v(var8_9, s0.x(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 3: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.Y(var8_9, s0.y(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 2: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.x(var8_9, s0.y(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 1: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.q(var8_9, 0.0f);
                    ** GOTO lbl17
                }
                case 0: {
                    var3_6 = var6_4;
                    if (!this.y(var1_1, var5_3)) break;
                    var2_5 = ax.r0.k.i(var8_9, 0.0);
                    ** continue;
                }
            }
            var6_4 = var3_6;
        }
        return var6_4 + this.v(this.o, var1_1);
    }

    private <UT, UB> int v(o0<UT, UB> o02, T t8) {
        return o02.h(o02.g(t8));
    }

    private static <T> int w(T t8, long l8) {
        return s0.x(t8, l8);
    }

    private static boolean x(int n8) {
        return (n8 & 0x20000000) != 0;
    }

    private boolean y(T object, int n8) {
        if (this.h) {
            n8 = this.i0(n8);
            long l8 = V.R(n8);
            switch (V.h0(n8)) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 17: {
                    return s0.A(object, l8) != null;
                }
                case 16: {
                    return s0.y(object, l8) != 0L;
                }
                case 15: {
                    return s0.x(object, l8) != 0;
                }
                case 14: {
                    return s0.y(object, l8) != 0L;
                }
                case 13: {
                    return s0.x(object, l8) != 0;
                }
                case 12: {
                    return s0.x(object, l8) != 0;
                }
                case 11: {
                    return s0.x(object, l8) != 0;
                }
                case 10: {
                    return ax.r0.h.c0.equals(s0.A(object, l8)) ^ true;
                }
                case 9: {
                    return s0.A(object, l8) != null;
                }
                case 8: {
                    object = s0.A(object, l8);
                    if (object instanceof String) {
                        return ((String)object).isEmpty() ^ true;
                    }
                    if (object instanceof h) {
                        return ax.r0.h.c0.equals(object) ^ true;
                    }
                    throw new IllegalArgumentException();
                }
                case 7: {
                    return s0.p(object, l8);
                }
                case 6: {
                    return s0.x(object, l8) != 0;
                }
                case 5: {
                    return s0.y(object, l8) != 0L;
                }
                case 4: {
                    return s0.x(object, l8) != 0;
                }
                case 3: {
                    return s0.y(object, l8) != 0L;
                }
                case 2: {
                    return s0.y(object, l8) != 0L;
                }
                case 1: {
                    return s0.w(object, l8) != 0.0f;
                }
                case 0: 
            }
            return s0.v(object, l8) != 0.0;
        }
        return (s0.x(object, (n8 = this.Y(n8)) & 0xFFFFF) & 1 << (n8 >>> 20)) != 0;
    }

    private boolean z(T t8, int n8, int n9, int n10) {
        if (this.h) {
            return this.y(t8, n8);
        }
        return (n9 & n10) != 0;
    }

    @Override
    public void a(T t8, T t9) {
        t9.getClass();
        for (int i8 = 0; i8 < this.a.length; i8 += 3) {
            this.M(t8, t9, i8);
        }
        if (!this.h) {
            j0.G(this.o, t8, t9);
            if (this.f) {
                j0.E(this.p, t8, t9);
            }
        }
    }

    @Override
    public void b(T t8) {
        int n8;
        int n9;
        for (n9 = this.k; n9 < (n8 = this.l); ++n9) {
            long l8 = V.R(this.i0(this.j[n9]));
            Object object = s0.A(t8, l8);
            if (object == null) continue;
            s0.O(t8, l8, this.q.b(object));
        }
        int n10 = this.j.length;
        for (n9 = n8; n9 < n10; ++n9) {
            this.n.c(t8, this.j[n9]);
        }
        this.o.j(t8);
        if (this.f) {
            this.p.f(t8);
        }
    }

    @Override
    public final boolean c(T t8) {
        int n8 = -1;
        int n9 = 0;
        for (int i8 = 0; i8 < this.k; ++i8) {
            int n10;
            block12: {
                int n11;
                int n12;
                int n13;
                block9: {
                    block10: {
                        int n14;
                        block11: {
                            n13 = this.j[i8];
                            n14 = this.Q(n13);
                            n12 = this.i0(n13);
                            if (!this.h) {
                                n10 = this.a[n13 + 2];
                                int n15 = 0xFFFFF & n10;
                                int n16 = 1 << (n10 >>> 20);
                                n10 = n8;
                                n11 = n16;
                                if (n15 != n8) {
                                    n9 = s.getInt(t8, n15);
                                    n10 = n15;
                                    n11 = n16;
                                }
                            } else {
                                n11 = 0;
                                n10 = n8;
                            }
                            if (V.F(n12) && !this.z(t8, n13, n9, n11)) {
                                return false;
                            }
                            n8 = V.h0(n12);
                            if (n8 == 9 || n8 == 17) break block9;
                            if (n8 == 27) break block10;
                            if (n8 == 60 || n8 == 68) break block11;
                            if (n8 == 49) break block10;
                            if (n8 == 50 && !this.C(t8, n12, n13)) {
                                return false;
                            }
                            break block12;
                        }
                        if (this.E(t8, n14, n13) && !V.A(t8, n12, this.s(n13))) {
                            return false;
                        }
                        break block12;
                    }
                    if (!this.B(t8, n12, n13)) {
                        return false;
                    }
                    break block12;
                }
                if (this.z(t8, n13, n9, n11) && !V.A(t8, n12, this.s(n13))) {
                    return false;
                }
            }
            n8 = n10;
        }
        return !this.f || this.p.c(t8).p();
    }

    @Override
    public void d(T t8, v0 v02) throws IOException {
        if (v02.j() == v0.a.c0) {
            this.l0(t8, v02);
            return;
        }
        if (this.h) {
            this.k0(t8, v02);
            return;
        }
        this.j0(t8, v02);
    }

    @Override
    public boolean e(T t8, T t9) {
        int n8 = this.a.length;
        for (int i8 = 0; i8 < n8; i8 += 3) {
            if (this.m(t8, t9, i8)) continue;
            return false;
        }
        if (!this.o.g(t8).equals(this.o.g(t9))) {
            return false;
        }
        if (this.f) {
            return this.p.c(t8).equals(this.p.c(t9));
        }
        return true;
    }

    @Override
    public int f(T t8) {
        if (this.h) {
            return this.u(t8);
        }
        return this.t(t8);
    }

    @Override
    public T g() {
        return (T)this.m.a(this.e);
    }

    @Override
    public void h(T t8, g0 g02, p p8) throws IOException {
        p8.getClass();
        this.I(this.o, this.p, t8, g02, p8);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int i(T var1_1) {
        var5_2 = this.a.length;
        var3_4 = 0;
        for (var4_3 = 0; var4_3 < var5_2; var4_3 += 3) {
            var2_5 = this.i0(var4_3);
            var6_6 = this.Q(var4_3);
            var8_8 = V.R(var2_5);
            var7_7 = V.h0(var2_5);
            var2_5 = 37;
            block0 : switch (var7_7) {
                default: {
                    var2_5 = var3_4;
                    break;
                }
                case 68: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var10_9 = s0.A(var1_1, var8_8);
                    var2_5 = var3_4 * 53;
                    var3_4 = var10_9.hashCode();
lbl19:
                    // 36 sources

                    while (true) {
                        var2_5 += var3_4;
                        break block0;
                        break;
                    }
                }
                case 67: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(V.W(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 66: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = V.V(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 65: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(V.W(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 64: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = V.V(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 63: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = V.V(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 62: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = V.V(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 61: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = s0.A(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
                case 60: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var10_9 = s0.A(var1_1, var8_8);
                    var2_5 = var3_4 * 53;
                    var3_4 = var10_9.hashCode();
                    ** GOTO lbl19
                }
                case 59: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = ((String)s0.A(var1_1, var8_8)).hashCode();
                    ** GOTO lbl19
                }
                case 58: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = A.c(V.S(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 57: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = V.V(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 56: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(V.W(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 55: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = V.V(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 54: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(V.W(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 53: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(V.W(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 52: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = Float.floatToIntBits(V.U(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 51: {
                    var2_5 = var3_4;
                    if (!this.E(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(Double.doubleToLongBits(V.T(var1_1, var8_8)));
                    ** GOTO lbl19
                }
                case 50: {
                    var2_5 = var3_4 * 53;
                    var3_4 = s0.A(var1_1, var8_8).hashCode();
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
                    var3_4 = s0.A(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
                case 17: {
                    var10_9 = s0.A(var1_1, var8_8);
                    if (var10_9 != null) {
                        var2_5 = var10_9.hashCode();
                    }
lbl137:
                    // 5 sources

                    while (true) {
                        var2_5 = var3_4 * 53 + var2_5;
                        break block0;
                        break;
                    }
                }
                case 16: {
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(s0.y(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 15: {
                    var2_5 = var3_4 * 53;
                    var3_4 = s0.x(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 14: {
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(s0.y(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 13: {
                    var2_5 = var3_4 * 53;
                    var3_4 = s0.x(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 12: {
                    var2_5 = var3_4 * 53;
                    var3_4 = s0.x(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 11: {
                    var2_5 = var3_4 * 53;
                    var3_4 = s0.x(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 10: {
                    var2_5 = var3_4 * 53;
                    var3_4 = s0.A(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
                case 9: {
                    var10_9 = s0.A(var1_1, var8_8);
                    if (var10_9 == null) ** GOTO lbl137
                    var2_5 = var10_9.hashCode();
                    ** continue;
                }
                case 8: {
                    var2_5 = var3_4 * 53;
                    var3_4 = ((String)s0.A(var1_1, var8_8)).hashCode();
                    ** GOTO lbl19
                }
                case 7: {
                    var2_5 = var3_4 * 53;
                    var3_4 = A.c(s0.p(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 6: {
                    var2_5 = var3_4 * 53;
                    var3_4 = s0.x(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 5: {
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(s0.y(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 4: {
                    var2_5 = var3_4 * 53;
                    var3_4 = s0.x(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 3: {
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(s0.y(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 2: {
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(s0.y(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 1: {
                    var2_5 = var3_4 * 53;
                    var3_4 = Float.floatToIntBits(s0.w(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 0: {
                    var2_5 = var3_4 * 53;
                    var3_4 = A.f(Double.doubleToLongBits(s0.v(var1_1, var8_8)));
                    ** continue;
                }
            }
            var3_4 = var2_5;
        }
        var2_5 = var3_4 = var3_4 * 53 + this.o.g(var1_1).hashCode();
        if (this.f) {
            var2_5 = var3_4 * 53 + this.p.c(var1_1).hashCode();
        }
        return var2_5;
    }
}

