/*
 * Decompiled with CFR 0.152.
 */
package ax.E;

import ax.E.b;
import ax.E.d;
import java.util.Arrays;
import java.util.HashSet;

public class i
implements Comparable<i> {
    private static int s0 = 1;
    private String c0;
    public int d0 = -1;
    int e0 = -1;
    public int f0 = 0;
    public float g0;
    public boolean h0 = false;
    float[] i0 = new float[9];
    float[] j0 = new float[9];
    a k0;
    b[] l0 = new b[16];
    int m0 = 0;
    public int n0 = 0;
    boolean o0 = false;
    int p0 = -1;
    public boolean q;
    float q0 = 0.0f;
    HashSet<b> r0 = null;

    public i(a a8, String string) {
        this.k0 = a8;
    }

    static void j() {
        ++s0;
    }

    public final void d(b b8) {
        int n8;
        int n9;
        for (n9 = 0; n9 < (n8 = this.m0); ++n9) {
            if (this.l0[n9] != b8) continue;
            return;
        }
        b[] bArray = this.l0;
        if (n8 >= bArray.length) {
            this.l0 = Arrays.copyOf(bArray, bArray.length * 2);
        }
        bArray = this.l0;
        n9 = this.m0;
        bArray[n9] = b8;
        this.m0 = n9 + 1;
    }

    public int h(i i8) {
        return this.d0 - i8.d0;
    }

    public final void l(b bArray) {
        int n8 = this.m0;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.l0[i8] != bArray) continue;
            while (i8 < n8 - 1) {
                bArray = this.l0;
                int n9 = i8 + 1;
                bArray[i8] = bArray[n9];
                i8 = n9;
            }
            --this.m0;
            return;
        }
    }

    public void n() {
        this.c0 = null;
        this.k0 = a.f0;
        this.f0 = 0;
        this.d0 = -1;
        this.e0 = -1;
        this.g0 = 0.0f;
        this.h0 = false;
        this.o0 = false;
        this.p0 = -1;
        this.q0 = 0.0f;
        int n8 = this.m0;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.l0[i8] = null;
        }
        this.m0 = 0;
        this.n0 = 0;
        this.q = false;
        Arrays.fill(this.j0, 0.0f);
    }

    public void p(d d8, float f8) {
        this.g0 = f8;
        this.h0 = true;
        this.o0 = false;
        this.p0 = -1;
        this.q0 = 0.0f;
        int n8 = this.m0;
        this.e0 = -1;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.l0[i8].A(d8, this, false);
        }
        this.m0 = 0;
    }

    public void q(a a8, String string) {
        this.k0 = a8;
    }

    public final void r(d d8, b b8) {
        int n8 = this.m0;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.l0[i8].B(d8, b8, false);
        }
        this.m0 = 0;
    }

    public String toString() {
        if (this.c0 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.c0);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.d0);
        return stringBuilder.toString();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        private static final a[] g0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            q = a12 = new a();
            c0 = a11 = new a();
            d0 = a10 = new a();
            e0 = a9 = new a();
            f0 = a8 = new a();
            g0 = new a[]{a12, a11, a10, a9, a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])g0.clone();
        }
    }
}

