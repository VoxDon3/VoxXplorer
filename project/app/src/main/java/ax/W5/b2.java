/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.X1;
import ax.W5.Z1;
import ax.W5.a2;
import ax.W5.f0;

final class b2 {
    private static final Z1 a;
    public static final int b = 0;

    static {
        if (X1.u() && X1.v()) {
            int n8 = f0.a;
        }
        a = new a2();
    }

    static /* bridge */ /* synthetic */ int a(byte[] byArray, int n8, int n9) {
        int n10 = n9 - n8;
        n9 = byArray[n8 - 1];
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 == 2) {
                    n10 = byArray[n8];
                    n8 = byArray[n8 + 1];
                    if (n9 <= -12 && n10 <= -65) {
                        if (n8 > -65) {
                            return -1;
                        }
                        return n8 << 16 ^ (n10 << 8 ^ n9);
                    }
                    return -1;
                }
                throw new AssertionError();
            }
            n8 = byArray[n8];
            if (n9 <= -12) {
                if (n8 > -65) {
                    return -1;
                }
                return n8 << 8 ^ n9;
            }
            return -1;
        }
        if (n9 > -12) {
            return -1;
        }
        return n9;
    }

    static boolean b(byte[] byArray) {
        return a.b(byArray, 0, byArray.length);
    }

    static boolean c(byte[] byArray, int n8, int n9) {
        return a.b(byArray, n8, n9);
    }
}

