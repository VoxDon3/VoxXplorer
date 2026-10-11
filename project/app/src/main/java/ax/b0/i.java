/*
 * Decompiled with CFR 0.152.
 */
package ax.b0;

import java.io.PrintWriter;

public final class i {
    private static final Object a = new Object();
    private static char[] b = new char[24];

    private static int a(int n8, int n9, boolean bl, int n10) {
        if (!(n8 > 99 || bl && n10 >= 3)) {
            if (!(n8 > 9 || bl && n10 >= 2)) {
                if (!bl && n8 <= 0) {
                    return 0;
                }
                return n9 + 1;
            }
            return n9 + 2;
        }
        return n9 + 3;
    }

    public static void b(long l8, long l9, PrintWriter printWriter) {
        if (l8 == 0L) {
            printWriter.print("--");
            return;
        }
        i.d(l8 - l9, printWriter, 0);
    }

    public static void c(long l8, PrintWriter printWriter) {
        i.d(l8, printWriter, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(long l8, PrintWriter printWriter, int n8) {
        Object object = a;
        synchronized (object) {
            n8 = i.e(l8, n8);
            String string = new String(b, 0, n8);
            printWriter.print(string);
            return;
        }
    }

    private static int e(long l8, int n8) {
        int n9;
        int n10;
        boolean bl;
        long l9;
        int n11;
        int n12;
        int n13;
        int n14;
        if (b.length < n8) {
            b = new char[n8];
        }
        char[] cArray = b;
        long l10 = l8 - 0L;
        long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
        if (l11 == false) {
            while (n8 - 1 > 0) {
                cArray[0] = 32;
            }
            cArray[0] = 48;
            return 1;
        }
        if (l11 > 0) {
            n14 = 43;
        } else {
            l8 = -l8;
            n14 = 45;
        }
        int n15 = (int)(l8 % 1000L);
        l11 = (int)Math.floor(l8 / 1000L);
        if (l11 > 86400) {
            n13 = l11 / 86400;
            l11 -= 86400 * n13;
        } else {
            n13 = 0;
        }
        if (l11 > 3600) {
            n12 = l11 / 3600;
            l11 -= n12 * 3600;
        } else {
            n12 = 0;
        }
        if (l11 > 60) {
            n11 = l11 / 60;
            l9 = l11 - n11 * 60;
        } else {
            n11 = 0;
            l9 = l11;
        }
        if (n8 != 0) {
            l11 = i.a(n13, 1, false, 0);
            bl = l11 > 0;
            bl = (l11 += i.a(n12, 1, bl, 2)) > 0;
            bl = (l11 += i.a(n11, 1, bl, 2)) > 0;
            n10 = (int)(l11 + i.a((int)l9, 1, bl, 2));
            l11 = n10 > 0 ? (long)3 : (long)0;
            n10 += i.a(n15, 2, true, (int)l11) + 1;
            l11 = 0;
            while (true) {
                n9 = (int)l11;
                if (n10 < n8) {
                    cArray[l11] = 32;
                    ++l11;
                    ++n10;
                    continue;
                }
                break;
            }
        } else {
            n9 = 0;
        }
        cArray[n9] = n14;
        n10 = n9 + 1;
        n8 = n8 != 0 ? 1 : 0;
        n13 = i.f(cArray, n13, 'd', n10, false, 0);
        bl = n13 != n10;
        l11 = n8 != 0 ? (long)2 : (long)0;
        n12 = i.f(cArray, n12, 'h', n13, bl, (int)l11);
        bl = n12 != n10;
        l11 = n8 != 0 ? (long)2 : (long)0;
        n12 = i.f(cArray, n11, 'm', n12, bl, (int)l11);
        bl = n12 != n10;
        l11 = n8 != 0 ? (long)2 : (long)0;
        l11 = i.f(cArray, (int)l9, 's', n12, bl, (int)l11);
        n8 = n8 != 0 && l11 != n10 ? 3 : 0;
        n8 = i.f(cArray, n15, 'm', (int)l11, true, n8);
        cArray[n8] = 115;
        return n8 + 1;
    }

    private static int f(char[] cArray, int n8, char c8, int n9, boolean bl, int n10) {
        int n11;
        block7: {
            int n12;
            block6: {
                if (!bl && n8 <= 0) {
                    return n9;
                }
                if (bl && n10 >= 3 || n8 > 99) {
                    n11 = n8 / 100;
                    cArray[n9] = (char)(n11 + 48);
                    n12 = n9 + 1;
                    n8 -= n11 * 100;
                } else {
                    n12 = n9;
                }
                if (bl && n10 >= 2 || n8 > 9) break block6;
                n11 = n12;
                n10 = n8;
                if (n9 == n12) break block7;
            }
            n9 = n8 / 10;
            cArray[n12] = (char)(n9 + 48);
            n11 = n12 + 1;
            n10 = n8 - n9 * 10;
        }
        cArray[n11] = (char)(n10 + 48);
        cArray[n11 + 1] = c8;
        return n11 + 2;
    }
}

