/*
 * Decompiled with CFR 0.152.
 */
package ax.yc;

import ax.Gb.l;
import ax.sb.t;
import ax.xc.e;
import ax.xc.h;

public final class b {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final /* synthetic */ int a(byte[] byArray, int n8) {
        return b.c(byArray, n8);
    }

    public static final /* synthetic */ int b(char c8) {
        return b.e(c8);
    }

    private static final int c(byte[] byArray, int n8) {
        int n9 = byArray.length;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        block0: while (n10 < n9) {
            t t8;
            int n13;
            int n14;
            int n15;
            int n16 = byArray[n10];
            if (n16 >= 0) {
                n15 = n12 + 1;
                if (n12 == n8) break;
                if (n16 != 10 && n16 != 13 && (n16 >= 0 && n16 < 32 || 127 <= n16 && n16 < 160) || n16 == 65533) {
                    return -1;
                }
                n12 = n16 < 65536 ? 1 : 2;
                n12 = n11 + n12;
                n16 = n10 + 1;
                n10 = n15;
                n15 = n12;
                while (true) {
                    n14 = n10;
                    n10 = n16;
                    n11 = n15;
                    n12 = n14;
                    if (n16 >= n9) continue block0;
                    n13 = byArray[n16];
                    n10 = n16++;
                    n11 = n15;
                    n12 = n14;
                    if (n13 < 0) continue block0;
                    n12 = n14 + 1;
                    if (n14 == n8) {
                        return n15;
                    }
                    if (n13 != 10 && n13 != 13 && (n13 >= 0 && n13 < 32 || 127 <= n13 && n13 < 160) || n13 == 65533) {
                        return -1;
                    }
                    n10 = n13 < 65536 ? 1 : 2;
                    n15 += n10;
                    n10 = n12;
                }
            }
            if (n16 >> 5 == -2) {
                n15 = n10 + 1;
                if (n9 <= n15) {
                    if (n12 == n8) break;
                    return -1;
                }
                if (((n15 = byArray[n15]) & 0xC0) == 128) {
                    if ((n16 = n15 ^ 0xF80 ^ n16 << 6) < 128) {
                        if (n12 == n8) break;
                        return -1;
                    }
                    n15 = n12 + 1;
                    if (n12 == n8) break;
                    if (n16 != 10 && n16 != 13 && (n16 >= 0 && n16 < 32 || 127 <= n16 && n16 < 160) || n16 == 65533) {
                        return -1;
                    }
                    n12 = n16 < 65536 ? 1 : 2;
                    n11 += n12;
                    t8 = t.a;
                    n10 += 2;
                    n12 = n15;
                    continue;
                }
                if (n12 == n8) break;
                return -1;
            }
            if (n16 >> 4 == -2) {
                n14 = n10 + 2;
                if (n9 <= n14) {
                    if (n12 == n8) break;
                    return -1;
                }
                n15 = byArray[n10 + 1];
                if ((n15 & 0xC0) == 128) {
                    if (((n14 = byArray[n14]) & 0xC0) == 128) {
                        if ((n16 = n14 ^ 0xFFFE1F80 ^ n15 << 6 ^ n16 << 12) < 2048) {
                            if (n12 == n8) break;
                            return -1;
                        }
                        if (55296 <= n16 && n16 < 57344) {
                            if (n12 == n8) break;
                            return -1;
                        }
                        n15 = n12 + 1;
                        if (n12 == n8) break;
                        if (n16 != 10 && n16 != 13 && (n16 >= 0 && n16 < 32 || 127 <= n16 && n16 < 160) || n16 == 65533) {
                            return -1;
                        }
                        n12 = n16 < 65536 ? 1 : 2;
                        n11 += n12;
                        t8 = t.a;
                        n10 += 3;
                        n12 = n15;
                        continue;
                    }
                    if (n12 == n8) break;
                    return -1;
                }
                if (n12 == n8) break;
                return -1;
            }
            if (n16 >> 3 == -2) {
                n13 = n10 + 3;
                if (n9 <= n13) {
                    if (n12 == n8) break;
                    return -1;
                }
                n14 = byArray[n10 + 1];
                if ((n14 & 0xC0) == 128) {
                    n15 = byArray[n10 + 2];
                    if ((n15 & 0xC0) == 128) {
                        if (((n13 = byArray[n13]) & 0xC0) == 128) {
                            if ((n16 = n13 ^ 0x381F80 ^ n15 << 6 ^ n14 << 12 ^ n16 << 18) > 0x10FFFF) {
                                if (n12 == n8) break;
                                return -1;
                            }
                            if (55296 <= n16 && n16 < 57344) {
                                if (n12 == n8) break;
                                return -1;
                            }
                            if (n16 < 65536) {
                                if (n12 == n8) break;
                                return -1;
                            }
                            n15 = n12 + 1;
                            if (n12 == n8) break;
                            if (n16 != 10 && n16 != 13 && (n16 >= 0 && n16 < 32 || 127 <= n16 && n16 < 160) || n16 == 65533) {
                                return -1;
                            }
                            n12 = n16 < 65536 ? 1 : 2;
                            n11 += n12;
                            t8 = t.a;
                            n10 += 4;
                            n12 = n15;
                            continue;
                        }
                        if (n12 == n8) break;
                        return -1;
                    }
                    if (n12 == n8) break;
                    return -1;
                }
                if (n12 == n8) break;
                return -1;
            }
            if (n12 == n8) break;
            return -1;
        }
        return n11;
    }

    public static final void d(h h8, e e8, int n8, int n9) {
        l.f(h8, "<this>");
        l.f(e8, "buffer");
        e8.i1(h8.p(), n8, n9);
    }

    private static final int e(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - 48;
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 87;
        }
        if ('A' <= c8 && c8 < 'G') {
            return c8 - 55;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected hex digit: ");
        stringBuilder.append(c8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static final char[] f() {
        return a;
    }
}

