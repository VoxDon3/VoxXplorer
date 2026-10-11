/*
 * Decompiled with CFR 0.152.
 */
package ax.ka;

import android.opengl.GLES10;
import ax.ca.e;
import ax.ca.h;

public final class b {
    private static e a;

    static {
        int[] nArray = new int[1];
        GLES10.glGetIntegerv((int)3379, (int[])nArray, (int)0);
        int n8 = Math.max(nArray[0], 2048);
        a = new e(n8, n8);
    }

    public static int a(e e8, e e9, h h8, boolean bl) {
        int n8;
        int n9;
        int n10;
        block15: {
            int n11;
            block14: {
                n10 = e8.b();
                n9 = e8.a();
                int n12 = e9.b();
                int n13 = e9.a();
                n8 = ax.ka.b$a.a[h8.ordinal()];
                n11 = 1;
                if (n8 != 1) {
                    if (n8 != 2) {
                        n8 = 1;
                    } else if (bl) {
                        int n14 = n10 / 2;
                        int n15 = n9 / 2;
                        int n16 = 1;
                        while (true) {
                            n8 = n16;
                            if (n14 / n16 > n12) {
                                n8 = n16;
                                if (n15 / n16 > n13) {
                                    n16 *= 2;
                                    continue;
                                }
                            }
                            break;
                        }
                    } else {
                        n8 = Math.min(n10 / n12, n9 / n13);
                    }
                } else {
                    if (bl) {
                        int n17 = n10 / 2;
                        int n18 = n9 / 2;
                        int n19 = 1;
                        while (true) {
                            if (n17 / n19 <= n12) {
                                n8 = n19;
                                if (n18 / n19 <= n13) break block14;
                            }
                            n19 *= 2;
                        }
                    }
                    n8 = Math.max(n10 / n12, n9 / n13);
                }
            }
            if (n8 >= 1) break block15;
            n8 = n11;
        }
        return b.d(n10, n9, n8, bl);
    }

    public static float b(e e8, e e9, h h8, boolean bl) {
        int n8 = e8.b();
        int n9 = e8.a();
        int n10 = e9.b();
        int n11 = e9.a();
        float f8 = n8;
        float f9 = f8 / (float)n10;
        float f10 = n9;
        float f11 = f10 / (float)n11;
        if (h8 == h.q && f9 >= f11 || h8 == h.c0 && f9 < f11) {
            n11 = (int)(f10 / f9);
        } else {
            n10 = (int)(f8 / f11);
        }
        if (!bl && n10 < n8 && n11 < n9 || bl && n10 != n8 && n11 != n9) {
            return (float)n10 / f8;
        }
        return 1.0f;
    }

    public static int c(e e8) {
        int n8 = e8.b();
        int n9 = e8.a();
        int n10 = a.b();
        int n11 = a.a();
        return Math.max((int)Math.ceil((float)n8 / (float)n10), (int)Math.ceil((float)n9 / (float)n11));
    }

    private static int d(int n8, int n9, int n10, boolean bl) {
        int n11 = a.b();
        int n12 = a.a();
        while (n8 / n10 > n11 || n9 / n10 > n12) {
            if (bl) {
                n10 *= 2;
                continue;
            }
            ++n10;
        }
        return n10;
    }

    public static e e(ax.ha.a a8, e e8) {
        int n8 = a8.i();
        n8 = n8 <= 0 ? e8.b() : Math.min(n8, e8.b());
        int n9 = a8.f();
        n9 = n9 <= 0 ? e8.a() : Math.min(n9, e8.a());
        return new e(n8, n9);
    }
}

