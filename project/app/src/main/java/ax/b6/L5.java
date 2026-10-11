/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.H5;
import ax.b6.M5;
import ax.b6.N5;
import ax.b6.P5;
import ax.b6.s4;

final class L5 {
    private static final N5 a;

    static {
        if (H5.w()) {
            H5.z();
        }
        a = new M5();
    }

    static int a(String charSequence) {
        int n8;
        int n9;
        block10: {
            int n10;
            n9 = ((String)charSequence).length();
            int n11 = 0;
            for (n10 = 0; n10 < n9 && ((String)charSequence).charAt(n10) < '\u0080'; ++n10) {
            }
            int n12 = n9;
            while (true) {
                n8 = n12;
                if (n10 >= n9) break block10;
                n8 = ((String)charSequence).charAt(n10);
                if (n8 >= 2048) break;
                n12 += 127 - n8 >>> 31;
                ++n10;
            }
            int n13 = ((String)charSequence).length();
            n8 = n11;
            while (n10 < n13) {
                char c8 = ((String)charSequence).charAt(n10);
                if (c8 < '\u0800') {
                    n8 += 127 - c8 >>> 31;
                    n11 = n10;
                } else {
                    int n14;
                    n8 = n14 = n8 + 2;
                    n11 = n10;
                    if ('\ud800' <= c8) {
                        n8 = n14;
                        n11 = n10;
                        if (c8 <= '\udfff') {
                            if (Character.codePointAt(charSequence, n10) >= 65536) {
                                n11 = n10 + 1;
                                n8 = n14;
                            } else {
                                throw new P5(n10, n13);
                            }
                        }
                    }
                }
                n10 = n11 + 1;
            }
            n8 = n12 + n8;
        }
        if (n8 >= n9) {
            return n8;
        }
        long l8 = n8;
        charSequence = new StringBuilder("UTF-8 length does not fit in int: ");
        ((StringBuilder)charSequence).append(l8 + 0x100000000L);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    static int b(String string, byte[] byArray, int n8, int n9) {
        return a.b(string, byArray, n8, n9);
    }

    static /* synthetic */ int c(byte[] byArray, int n8, int n9) {
        byte by = byArray[n8 - 1];
        if ((n9 -= n8) != 0) {
            if (n9 != 1) {
                if (n9 == 2) {
                    n9 = byArray[n8];
                    n8 = byArray[n8 + 1];
                    if (by <= -12 && n9 <= -65 && n8 <= -65) {
                        return n8 << 16 ^ (n9 << 8 ^ by);
                    }
                    return -1;
                }
                throw new AssertionError();
            }
            n8 = byArray[n8];
            if (by <= -12 && n8 <= -65) {
                return n8 << 8 ^ by;
            }
            return -1;
        }
        if (by > -12) {
            return -1;
        }
        return by;
    }

    static String d(byte[] byArray, int n8, int n9) throws s4 {
        return a.c(byArray, n8, n9);
    }

    static boolean e(byte[] byArray, int n8, int n9) {
        return a.a(0, byArray, n8, n9) == 0;
    }
}

