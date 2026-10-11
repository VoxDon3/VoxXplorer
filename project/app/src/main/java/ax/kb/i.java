/*
 * Decompiled with CFR 0.152.
 */
package ax.kb;

import ax.kb.j;

public class i
extends j {
    static final char[] h = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public i(String object) {
        object = ((String)object).toCharArray();
        this.b = i.f((char[])object, 0, 8);
        this.c = i.d(i.f((char[])object, 9, 4));
        this.d = i.d(i.f((char[])object, 14, 4));
        this.e = i.c(i.f((char[])object, 19, 2));
        this.f = i.c(i.f((char[])object, 21, 2));
        byte[] byArray = new byte[6];
        this.g = byArray;
        byArray[0] = i.c(i.f((char[])object, 24, 2));
        this.g[1] = i.c(i.f((char[])object, 26, 2));
        this.g[2] = i.c(i.f((char[])object, 28, 2));
        this.g[3] = i.c(i.f((char[])object, 30, 2));
        this.g[4] = i.c(i.f((char[])object, 32, 2));
        this.g[5] = i.c(i.f((char[])object, 34, 2));
    }

    private static byte c(int n8) {
        return (byte)(n8 & 0xFF);
    }

    private static short d(int n8) {
        return (short)(n8 & 0xFFFF);
    }

    public static String e(int n8, int n9) {
        char[] cArray = new char[n9];
        while (true) {
            int n10 = n9 - 1;
            if (n9 <= 0) break;
            cArray[n10] = h[n8 & 0xF];
            n8 >>>= 4;
            n9 = n10;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int f(char[] cArray, int n8, int n9) {
        int n10 = 0;
        int n11 = 0;
        for (int i8 = n8; i8 < cArray.length && n10 < n9; ++n10, ++i8) {
            int n12 = cArray[i8];
            block0 : switch (n12) {
                default: {
                    switch (n12) {
                        default: {
                            switch (n12) {
                                default: {
                                    throw new IllegalArgumentException(new String(cArray, n8, n9));
                                }
                                case 97: 
                                case 98: 
                                case 99: 
                                case 100: 
                                case 101: 
                                case 102: 
                            }
                            n12 -= 87;
                            break block0;
                        }
                        case 65: 
                        case 66: 
                        case 67: 
                        case 68: 
                        case 69: 
                        case 70: 
                    }
                    n12 -= 55;
                    break;
                }
                case 48: 
                case 49: 
                case 50: 
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: {
                    n12 -= 48;
                }
            }
            n11 = (n11 << 4) + n12;
        }
        return n11;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i.e(this.b, 8));
        stringBuilder.append('-');
        stringBuilder.append(i.e(this.c, 4));
        stringBuilder.append('-');
        stringBuilder.append(i.e(this.d, 4));
        stringBuilder.append('-');
        stringBuilder.append(i.e(this.e, 2));
        stringBuilder.append(i.e(this.f, 2));
        stringBuilder.append('-');
        stringBuilder.append(i.e(this.g[0], 2));
        stringBuilder.append(i.e(this.g[1], 2));
        stringBuilder.append(i.e(this.g[2], 2));
        stringBuilder.append(i.e(this.g[3], 2));
        stringBuilder.append(i.e(this.g[4], 2));
        stringBuilder.append(i.e(this.g[5], 2));
        return stringBuilder.toString();
    }
}

