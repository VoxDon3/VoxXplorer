/*
 * Decompiled with CFR 0.152.
 */
package ax.qb;

import java.io.PrintStream;

public class d {
    private static final String a;
    private static final int b;
    private static final char[] c;
    public static final char[] d;

    static {
        String string;
        a = string = System.getProperty("line.separator");
        b = string.length();
        c = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static void a(PrintStream printStream, byte[] byArray, int n8, int n9) {
        if (n9 == 0) {
            return;
        }
        int n10 = n9 % 16;
        int n11 = n9 / 16;
        if (n10 != 0) {
            ++n11;
        }
        char[] cArray = new char[n11 * (b + 74)];
        char[] cArray2 = new char[16];
        int n12 = 0;
        int n13 = 0;
        do {
            int n14;
            Object object;
            block5: {
                ax.qb.d.b(n12, cArray, n13, 5);
                n11 = n13 + 6;
                cArray[n13 + 5] = 58;
                n13 = n11;
                n11 = n12;
                do {
                    int n15;
                    if (n11 == n9) {
                        n12 = 16 - n10;
                        object = c;
                        n14 = n12 * 3;
                        System.arraycopy(object, 0, cArray, n13, n14);
                        n14 = n13 + n14;
                        System.arraycopy(object, 0, cArray2, n10, n12);
                        break block5;
                    }
                    cArray[n13] = 32;
                    n12 = byArray[n8 + n11] & 0xFF;
                    ax.qb.d.b(n12, cArray, n13 + 1, 2);
                    n14 = n13 + 3;
                    cArray2[n11 % 16] = n12 >= 0 && !Character.isISOControl((char)(n15 = (int)n12)) ? n15 : 46;
                    n11 = n12 = n11 + 1;
                    n13 = n14;
                } while (n12 % 16 != 0);
                n11 = n12;
            }
            cArray[n14] = 32;
            cArray[n14 + 1] = 32;
            cArray[n14 + 2] = 124;
            System.arraycopy(cArray2, 0, cArray, n14 + 3, 16);
            n12 = n14 + 20;
            cArray[n14 + 19] = 124;
            object = a;
            n13 = b;
            ((String)object).getChars(0, n13, cArray, n12);
            n13 = n12 + n13;
            n12 = n11;
        } while (n11 < n9);
        printStream.println(cArray);
    }

    public static void b(int n8, char[] cArray, int n9, int n10) {
        while (n10 > 0) {
            int n11 = n9 + n10 - 1;
            if (n11 < cArray.length) {
                cArray[n11] = d[n8 & 0xF];
            }
            n11 = n8;
            if (n8 != 0) {
                n11 = n8 >>> 4;
            }
            --n10;
            n8 = n11;
        }
    }

    public static String c(int n8, int n9) {
        char[] cArray = new char[n9];
        ax.qb.d.b(n8, cArray, 0, n9);
        return new String(cArray);
    }

    public static String d(byte[] byArray, int n8, int n9) {
        char[] cArray = new char[n9];
        n8 = n9 % 2 == 0 ? n9 / 2 : n9 / 2 + 1;
        int n10 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n11 = n10 + 1;
            char[] cArray2 = d;
            byte by = byArray[i8];
            cArray[n10] = cArray2[by >> 4 & 0xF];
            if (n11 == n9) break;
            n10 += 2;
            cArray[n11] = cArray2[by & 0xF];
        }
        return new String(cArray);
    }
}

