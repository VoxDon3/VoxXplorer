/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.F;
import ax.xc.h;
import java.util.Arrays;

public final class a {
    private static final byte[] a;
    private static final byte[] b;

    static {
        h.a a8 = h.e0;
        a = a8.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").p();
        b = a8.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").p();
    }

    public static final byte[] a(String object) {
        int n8;
        int n9;
        l.f(object, "<this>");
        for (n9 = ((String)object).length(); n9 > 0 && ((n8 = ((String)object).charAt(n9 - 1)) == 61 || n8 == 10 || n8 == 13 || n8 == 32 || n8 == 9); --n9) {
        }
        int n10 = (int)((long)n9 * 6L / 8L);
        byte[] byArray = new byte[n10];
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n14;
            int n15;
            block14: {
                block9: {
                    block12: {
                        block13: {
                            block15: {
                                char c8;
                                block11: {
                                    block10: {
                                        block8: {
                                            c8 = ((String)object).charAt(i8);
                                            if ('A' > c8 || c8 >= '[') break block8;
                                            n8 = c8 - 65;
                                            break block9;
                                        }
                                        if ('a' > c8 || c8 >= '{') break block10;
                                        n8 = c8 - 71;
                                        break block9;
                                    }
                                    if ('0' > c8 || c8 >= ':') break block11;
                                    n8 = c8 + 4;
                                    break block9;
                                }
                                if (c8 == '+' || c8 == '-') break block12;
                                if (c8 == '/' || c8 == '_') break block13;
                                n15 = n11;
                                n8 = n12;
                                n14 = n13;
                                if (c8 == '\n') break block14;
                                n15 = n11;
                                n8 = n12;
                                n14 = n13;
                                if (c8 == '\r') break block14;
                                n15 = n11;
                                n8 = n12;
                                n14 = n13;
                                if (c8 == ' ') break block14;
                                if (c8 != '\t') break block15;
                                n15 = n11;
                                n8 = n12;
                                n14 = n13;
                                break block14;
                            }
                            return null;
                        }
                        n8 = 63;
                        break block9;
                    }
                    n8 = 62;
                }
                n12 = n12 << 6 | n8;
                n15 = ++n11;
                n8 = n12;
                n14 = n13;
                if (n11 % 4 == 0) {
                    byArray[n13] = (byte)(n12 >> 16);
                    byArray[n13 + 1] = (byte)(n12 >> 8);
                    n14 = n13 + 3;
                    byArray[n13 + 2] = (byte)n12;
                    n8 = n12;
                    n15 = n11;
                }
            }
            n11 = n15;
            n12 = n8;
            n13 = n14;
        }
        n8 = n11 % 4;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    n9 = n12 << 6;
                    byArray[n13] = (byte)(n9 >> 16);
                    n8 = n13 + 2;
                    byArray[n13 + 1] = (byte)(n9 >> 8);
                    n13 = n8;
                }
            } else {
                byArray[n13] = (byte)(n12 << 12 >> 16);
                ++n13;
            }
            if (n13 == n10) {
                return byArray;
            }
            object = Arrays.copyOf(byArray, n13);
            l.e(object, "copyOf(this, newSize)");
            return object;
        }
        return null;
    }

    public static final String b(byte[] byArray, byte[] byArray2) {
        int n8;
        l.f(byArray, "<this>");
        l.f(byArray2, "map");
        byte[] byArray3 = new byte[(byArray.length + 2) / 3 * 4];
        int n9 = byArray.length - byArray.length % 3;
        int n10 = 0;
        int n11 = 0;
        while (n10 < n9) {
            int n12 = byArray[n10];
            byte by = byArray[n10 + 1];
            n8 = n10 + 3;
            n10 = byArray[n10 + 2];
            byArray3[n11] = byArray2[(n12 & 0xFF) >> 2];
            byArray3[n11 + 1] = byArray2[(n12 & 3) << 4 | (by & 0xFF) >> 4];
            byArray3[n11 + 2] = byArray2[(by & 0xF) << 2 | (n10 & 0xFF) >> 6];
            n12 = n11 + 4;
            byArray3[n11 + 3] = byArray2[n10 & 0x3F];
            n10 = n8;
            n11 = n12;
        }
        n8 = byArray.length - n9;
        if (n8 != 1) {
            if (n8 == 2) {
                n8 = byArray[n10];
                n10 = byArray[n10 + 1];
                byArray3[n11] = byArray2[(n8 & 0xFF) >> 2];
                byArray3[n11 + 1] = byArray2[(n8 & 3) << 4 | (n10 & 0xFF) >> 4];
                byArray3[n11 + 2] = byArray2[(n10 & 0xF) << 2];
                byArray3[n11 + 3] = 61;
            }
        } else {
            n10 = byArray[n10];
            byArray3[n11] = byArray2[(n10 & 0xFF) >> 2];
            byArray3[n11 + 1] = byArray2[(n10 & 3) << 4];
            byArray3[n11 + 2] = 61;
            byArray3[n11 + 3] = 61;
        }
        return F.b(byArray3);
    }

    public static /* synthetic */ String c(byte[] byArray, byte[] byArray2, int n8, Object object) {
        if ((n8 & 1) != 0) {
            byArray2 = a;
        }
        return ax.xc.a.b(byArray, byArray2);
    }
}

