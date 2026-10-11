/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import android.util.SparseArray;
import ax.o5.m;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class w {
    public static a a() {
        return new m.b();
    }

    public abstract b b();

    public abstract c c();

    @AutoValue.Builder
    public static abstract class a {
        public abstract w a();

        public abstract a b(b var1);

        public abstract a c(c var1);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        public static final /* enum */ b g0;
        public static final /* enum */ b h0;
        public static final /* enum */ b i0;
        public static final /* enum */ b j0;
        public static final /* enum */ b k0;
        public static final /* enum */ b l0;
        public static final /* enum */ b m0;
        public static final /* enum */ b n0;
        public static final /* enum */ b o0;
        public static final /* enum */ b p0;
        public static final /* enum */ b q0;
        public static final /* enum */ b r0;
        public static final /* enum */ b s0;
        public static final /* enum */ b t0;
        public static final /* enum */ b u0;
        public static final /* enum */ b v0;
        public static final /* enum */ b w0;
        private static final SparseArray<b> x0;
        private static final b[] y0;
        private final int q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            b b15;
            b b16;
            b b17;
            b b18;
            b b19;
            b b20;
            b b21;
            b b22;
            b b23;
            b b24;
            b b25;
            b b26;
            b b27;
            b b28;
            c0 = b28 = new b(0);
            d0 = b27 = new b(1);
            e0 = b26 = new b(2);
            f0 = b25 = new b(3);
            g0 = b24 = new b(4);
            h0 = b23 = new b(5);
            i0 = b22 = new b(6);
            j0 = b21 = new b(7);
            k0 = b20 = new b(8);
            l0 = b19 = new b(9);
            m0 = b18 = new b(10);
            n0 = b17 = new b(11);
            o0 = b16 = new b(12);
            p0 = b15 = new b(13);
            q0 = b14 = new b(14);
            r0 = b13 = new b(15);
            s0 = b12 = new b(16);
            t0 = b11 = new b(17);
            u0 = b10 = new b(18);
            v0 = b9 = new b(19);
            w0 = b8 = new b(100);
            y0 = new b[]{b28, b27, b26, b25, b24, b23, b22, b21, b20, b19, b18, b17, b16, b15, b14, b13, b12, b11, b10, b9, b8};
            b8 = new SparseArray();
            x0 = b8;
            b8.put(0, (Object)b28);
            b8.put(1, (Object)b27);
            b8.put(2, (Object)b26);
            b8.put(3, (Object)b25);
            b8.put(4, (Object)b24);
            b8.put(5, (Object)b23);
            b8.put(6, (Object)b22);
            b8.put(7, (Object)b21);
            b8.put(8, (Object)b20);
            b8.put(9, (Object)b19);
            b8.put(10, (Object)b18);
            b8.put(11, (Object)b17);
            b8.put(12, (Object)b16);
            b8.put(13, (Object)b15);
            b8.put(14, (Object)b14);
            b8.put(15, (Object)b13);
            b8.put(16, (Object)b12);
            b8.put(17, (Object)b11);
            b8.put(18, (Object)b10);
            b8.put(19, (Object)b9);
        }

        private b(int n9) {
            this.q = n9;
        }

        public static b d(int n8) {
            return (b)((Object)x0.get(n8));
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])y0.clone();
        }

        public int h() {
            return this.q;
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        public static final /* enum */ c f0;
        public static final /* enum */ c g0;
        public static final /* enum */ c h0;
        public static final /* enum */ c i0;
        public static final /* enum */ c j0;
        public static final /* enum */ c k0;
        public static final /* enum */ c l0;
        public static final /* enum */ c m0;
        public static final /* enum */ c n0;
        public static final /* enum */ c o0;
        public static final /* enum */ c p0;
        public static final /* enum */ c q0;
        public static final /* enum */ c r0;
        public static final /* enum */ c s0;
        public static final /* enum */ c t0;
        public static final /* enum */ c u0;
        private static final SparseArray<c> v0;
        private static final c[] w0;
        private final int q;

        static {
            SparseArray sparseArray;
            c c8;
            c c9;
            c c10;
            c c11;
            c c12;
            c c13;
            c c14;
            c c15;
            c c16;
            c c17;
            c c18;
            c c19;
            c c20;
            c c21;
            c c22;
            c c23;
            c c24;
            c c25;
            c c26;
            c0 = c26 = new c(0);
            d0 = c25 = new c(1);
            e0 = c24 = new c(2);
            f0 = c23 = new c(3);
            g0 = c22 = new c(4);
            h0 = c21 = new c(5);
            i0 = c20 = new c(6);
            j0 = c19 = new c(7);
            k0 = c18 = new c(8);
            l0 = c17 = new c(9);
            m0 = c16 = new c(10);
            n0 = c15 = new c(11);
            o0 = c14 = new c(12);
            p0 = c13 = new c(13);
            q0 = c12 = new c(14);
            r0 = c11 = new c(15);
            s0 = c10 = new c(16);
            t0 = c9 = new c(17);
            u0 = c8 = new c(-1);
            w0 = new c[]{c26, c25, c24, c23, c22, c21, c20, c19, c18, c17, c16, c15, c14, c13, c12, c11, c10, c9, c8};
            v0 = sparseArray = new SparseArray();
            sparseArray.put(0, (Object)c26);
            sparseArray.put(1, (Object)c25);
            sparseArray.put(2, (Object)c24);
            sparseArray.put(3, (Object)c23);
            sparseArray.put(4, (Object)c22);
            sparseArray.put(5, (Object)c21);
            sparseArray.put(6, (Object)c20);
            sparseArray.put(7, (Object)c19);
            sparseArray.put(8, (Object)c18);
            sparseArray.put(9, (Object)c17);
            sparseArray.put(10, (Object)c16);
            sparseArray.put(11, (Object)c15);
            sparseArray.put(12, (Object)c14);
            sparseArray.put(13, (Object)c13);
            sparseArray.put(14, (Object)c12);
            sparseArray.put(15, (Object)c11);
            sparseArray.put(16, (Object)c10);
            sparseArray.put(17, (Object)c9);
            sparseArray.put(-1, (Object)c8);
        }

        private c(int n9) {
            this.q = n9;
        }

        public static c d(int n8) {
            return (c)((Object)v0.get(n8));
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])w0.clone();
        }

        public int h() {
            return this.q;
        }
    }
}

