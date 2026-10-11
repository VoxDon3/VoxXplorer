/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.W4.j;
import ax.Y4.a;

public final class k {
    private static int a = 1000000;
    private static int b = 1000000000;
    private static long c = 1000000000L;
    private static long d = Integer.MIN_VALUE;
    private static long e = Integer.MAX_VALUE;
    static final String f = String.valueOf(Integer.MIN_VALUE);
    static final String g = String.valueOf(Long.MIN_VALUE);
    private static final int[] h = new int[1000];
    private static final String[] i;
    private static final String[] j;

    static {
        int n8 = 0;
        for (int i8 = 0; i8 < 10; ++i8) {
            for (int i9 = 0; i9 < 10; ++i9) {
                int n9 = 0;
                while (n9 < 10) {
                    k.h[n8] = i8 + 48 << 16 | i9 + 48 << 8 | n9 + 48;
                    ++n9;
                    ++n8;
                }
            }
        }
        i = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        j = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int a(int n8, byte[] byArray, int n9) {
        n8 = h[n8];
        byArray[n9] = (byte)(n8 >> 16);
        byArray[n9 + 1] = (byte)(n8 >> 8);
        byArray[n9 + 2] = (byte)n8;
        return n9 + 3;
    }

    private static int b(int n8, char[] cArray, int n9) {
        n8 = h[n8];
        cArray[n9] = (char)(n8 >> 16);
        cArray[n9 + 1] = (char)(n8 >> 8 & 0x7F);
        cArray[n9 + 2] = (char)(n8 & 0x7F);
        return n9 + 3;
    }

    private static int c(int n8, byte[] byArray, int n9) {
        int n10 = h[n8];
        int n11 = n9;
        if (n8 > 9) {
            n11 = n9;
            if (n8 > 99) {
                byArray[n9] = (byte)(n10 >> 16);
                n11 = n9 + 1;
            }
            byArray[n11] = (byte)(n10 >> 8);
            ++n11;
        }
        byArray[n11] = (byte)n10;
        return n11 + 1;
    }

    private static int d(int n8, char[] cArray, int n9) {
        int n10 = h[n8];
        int n11 = n9;
        if (n8 > 9) {
            n11 = n9;
            if (n8 > 99) {
                cArray[n9] = (char)(n10 >> 16);
                n11 = n9 + 1;
            }
            cArray[n11] = (char)(n10 >> 8 & 0x7F);
            ++n11;
        }
        cArray[n11] = (char)(n10 & 0x7F);
        return n11 + 1;
    }

    private static int e(int n8, byte[] byArray, int n9) {
        int n10 = n8 / 1000;
        int n11 = n10 / 1000;
        int[] nArray = h;
        int n12 = nArray[n11];
        byArray[n9] = (byte)(n12 >> 16);
        byArray[n9 + 1] = (byte)(n12 >> 8);
        byArray[n9 + 2] = (byte)n12;
        n11 = nArray[n10 - n11 * 1000];
        byArray[n9 + 3] = (byte)(n11 >> 16);
        byArray[n9 + 4] = (byte)(n11 >> 8);
        byArray[n9 + 5] = (byte)n11;
        n8 = nArray[n8 - n10 * 1000];
        byArray[n9 + 6] = (byte)(n8 >> 16);
        byArray[n9 + 7] = (byte)(n8 >> 8);
        byArray[n9 + 8] = (byte)n8;
        return n9 + 9;
    }

    private static int f(int n8, char[] cArray, int n9) {
        int n10 = n8 / 1000;
        int n11 = n10 / 1000;
        int[] nArray = h;
        int n12 = nArray[n11];
        cArray[n9] = (char)(n12 >> 16);
        cArray[n9 + 1] = (char)(n12 >> 8 & 0x7F);
        cArray[n9 + 2] = (char)(n12 & 0x7F);
        n12 = nArray[n10 - n11 * 1000];
        cArray[n9 + 3] = (char)(n12 >> 16);
        cArray[n9 + 4] = (char)(n12 >> 8 & 0x7F);
        cArray[n9 + 5] = (char)(n12 & 0x7F);
        n8 = nArray[n8 - n10 * 1000];
        cArray[n9 + 6] = (char)(n8 >> 16);
        cArray[n9 + 7] = (char)(n8 >> 8 & 0x7F);
        cArray[n9 + 8] = (char)(n8 & 0x7F);
        return n9 + 9;
    }

    private static int g(byte[] byArray, int n8) {
        int n9 = f.length();
        int n10 = 0;
        while (n10 < n9) {
            byArray[n8] = (byte)f.charAt(n10);
            ++n10;
            ++n8;
        }
        return n8;
    }

    private static int h(char[] cArray, int n8) {
        String string = f;
        int n9 = string.length();
        string.getChars(0, n9, cArray, n8);
        return n8 + n9;
    }

    private static int i(byte[] byArray, int n8) {
        int n9 = g.length();
        int n10 = 0;
        while (n10 < n9) {
            byArray[n8] = (byte)g.charAt(n10);
            ++n10;
            ++n8;
        }
        return n8;
    }

    private static int j(char[] cArray, int n8) {
        String string = g;
        int n9 = string.length();
        string.getChars(0, n9, cArray, n8);
        return n8 + n9;
    }

    private static int k(int n8, byte[] byArray, int n9) {
        if (n8 < a) {
            if (n8 < 1000) {
                return k.c(n8, byArray, n9);
            }
            int n10 = n8 / 1000;
            return k.m(byArray, n9, n10, n8 - n10 * 1000);
        }
        int n11 = n8 / 1000;
        int n12 = n11 / 1000;
        n9 = k.c(n12, byArray, n9);
        int[] nArray = h;
        n12 = nArray[n11 - n12 * 1000];
        byArray[n9] = (byte)(n12 >> 16);
        byArray[n9 + 1] = (byte)(n12 >> 8);
        byArray[n9 + 2] = (byte)n12;
        n8 = nArray[n8 - n11 * 1000];
        byArray[n9 + 3] = (byte)(n8 >> 16);
        byArray[n9 + 4] = (byte)(n8 >> 8);
        byArray[n9 + 5] = (byte)n8;
        return n9 + 6;
    }

    private static int l(int n8, char[] cArray, int n9) {
        if (n8 < a) {
            if (n8 < 1000) {
                return k.d(n8, cArray, n9);
            }
            int n10 = n8 / 1000;
            return k.n(cArray, n9, n10, n8 - n10 * 1000);
        }
        int n11 = n8 / 1000;
        int n12 = n11 / 1000;
        n9 = k.d(n12, cArray, n9);
        int[] nArray = h;
        n12 = nArray[n11 - n12 * 1000];
        cArray[n9] = (char)(n12 >> 16);
        cArray[n9 + 1] = (char)(n12 >> 8 & 0x7F);
        cArray[n9 + 2] = (char)(n12 & 0x7F);
        n8 = nArray[n8 - n11 * 1000];
        cArray[n9 + 3] = (char)(n8 >> 16);
        cArray[n9 + 4] = (char)(n8 >> 8 & 0x7F);
        cArray[n9 + 5] = (char)(n8 & 0x7F);
        return n9 + 6;
    }

    private static int m(byte[] byArray, int n8, int n9, int n10) {
        int[] nArray = h;
        int n11 = nArray[n9];
        int n12 = n8;
        if (n9 > 9) {
            n12 = n8;
            if (n9 > 99) {
                byArray[n8] = (byte)(n11 >> 16);
                n12 = n8 + 1;
            }
            byArray[n12] = (byte)(n11 >> 8);
            ++n12;
        }
        byArray[n12] = (byte)n11;
        n8 = nArray[n10];
        byArray[n12 + 1] = (byte)(n8 >> 16);
        byArray[n12 + 2] = (byte)(n8 >> 8);
        byArray[n12 + 3] = (byte)n8;
        return n12 + 4;
    }

    private static int n(char[] cArray, int n8, int n9, int n10) {
        int[] nArray = h;
        int n11 = nArray[n9];
        int n12 = n8;
        if (n9 > 9) {
            n12 = n8;
            if (n9 > 99) {
                cArray[n8] = (char)(n11 >> 16);
                n12 = n8 + 1;
            }
            cArray[n12] = (char)(n11 >> 8 & 0x7F);
            ++n12;
        }
        cArray[n12] = (char)(n11 & 0x7F);
        n8 = nArray[n10];
        cArray[n12 + 1] = (char)(n8 >> 16);
        cArray[n12 + 2] = (char)(n8 >> 8 & 0x7F);
        cArray[n12 + 3] = (char)(n8 & 0x7F);
        return n12 + 4;
    }

    public static boolean o(double d8) {
        return ax.W4.j.a(d8) ^ true;
    }

    public static int p(int n8, byte[] byArray, int n9) {
        int n10 = n8;
        int n11 = n9;
        if (n8 < 0) {
            if (n8 == Integer.MIN_VALUE) {
                return k.g(byArray, n9);
            }
            byArray[n9] = 45;
            n10 = -n8;
            n11 = n9 + 1;
        }
        if (n10 < a) {
            if (n10 < 1000) {
                if (n10 < 10) {
                    byArray[n11] = (byte)(n10 + 48);
                    return n11 + 1;
                }
                return k.c(n10, byArray, n11);
            }
            n8 = n10 / 1000;
            return k.a(n10 - n8 * 1000, byArray, k.c(n8, byArray, n11));
        }
        n8 = b;
        if (n10 >= n8) {
            n9 = n10 - n8;
            if (n9 >= n8) {
                n9 -= n8;
                n8 = n11 + 1;
                byArray[n11] = 50;
            } else {
                n8 = n11 + 1;
                byArray[n11] = 49;
            }
            return k.e(n9, byArray, n8);
        }
        n9 = n10 / 1000;
        n8 = n9 / 1000;
        return k.a(n10 - n9 * 1000, byArray, k.a(n9 - n8 * 1000, byArray, k.c(n8, byArray, n11)));
    }

    public static int q(int n8, char[] cArray, int n9) {
        int n10 = n8;
        int n11 = n9;
        if (n8 < 0) {
            if (n8 == Integer.MIN_VALUE) {
                return k.h(cArray, n9);
            }
            cArray[n9] = 45;
            n10 = -n8;
            n11 = n9 + 1;
        }
        if (n10 < a) {
            if (n10 < 1000) {
                if (n10 < 10) {
                    cArray[n11] = (char)(n10 + 48);
                    return n11 + 1;
                }
                return k.d(n10, cArray, n11);
            }
            n8 = n10 / 1000;
            return k.b(n10 - n8 * 1000, cArray, k.d(n8, cArray, n11));
        }
        n9 = b;
        if (n10 >= n9) {
            n8 = n10 - n9;
            if (n8 >= n9) {
                n8 -= n9;
                n9 = n11 + 1;
                cArray[n11] = 50;
            } else {
                n9 = n11 + 1;
                cArray[n11] = 49;
            }
            return k.f(n8, cArray, n9);
        }
        n9 = n10 / 1000;
        n8 = n9 / 1000;
        return k.b(n10 - n9 * 1000, cArray, k.b(n9 - n8 * 1000, cArray, k.d(n8, cArray, n11)));
    }

    public static int r(long l8, byte[] byArray, int n8) {
        int n9;
        long l9;
        if (l8 < 0L) {
            if (l8 > d) {
                return k.p((int)l8, byArray, n8);
            }
            if (l8 == Long.MIN_VALUE) {
                return k.i(byArray, n8);
            }
            byArray[n8] = 45;
            l9 = -l8;
            n9 = n8 + 1;
        } else {
            l9 = l8;
            n9 = n8;
            if (l8 <= e) {
                return k.p((int)l8, byArray, n8);
            }
        }
        long l10 = c;
        long l11 = l9 / l10;
        if (l11 < l10) {
            n8 = k.k((int)l11, byArray, n9);
        } else {
            l8 = l11 / l10;
            n8 = k.c((int)l8, byArray, n9);
            n8 = k.e((int)(l11 - l10 * l8), byArray, n8);
        }
        return k.e((int)(l9 - l11 * l10), byArray, n8);
    }

    public static int s(long l8, char[] cArray, int n8) {
        int n9;
        long l9;
        if (l8 < 0L) {
            if (l8 > d) {
                return k.q((int)l8, cArray, n8);
            }
            if (l8 == Long.MIN_VALUE) {
                return k.j(cArray, n8);
            }
            cArray[n8] = 45;
            l9 = -l8;
            n9 = n8 + 1;
        } else {
            l9 = l8;
            n9 = n8;
            if (l8 <= e) {
                return k.q((int)l8, cArray, n8);
            }
        }
        long l10 = c;
        long l11 = l9 / l10;
        if (l11 < l10) {
            n8 = k.l((int)l11, cArray, n9);
        } else {
            l8 = l11 / l10;
            n8 = k.d((int)l8, cArray, n9);
            n8 = k.f((int)(l11 - l10 * l8), cArray, n8);
        }
        return k.f((int)(l9 - l11 * l10), cArray, n8);
    }

    public static String t(double d8, boolean bl) {
        if (bl) {
            return ax.Y4.a.p(d8);
        }
        return Double.toString(d8);
    }
}

