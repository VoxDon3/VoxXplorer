/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.K5;
import ax.b6.L5;
import ax.b6.N5;
import ax.b6.P5;
import ax.b6.s4;

final class M5
extends N5 {
    M5() {
    }

    @Override
    final int a(int n8, byte[] byArray, int n9, int n10) {
        while (n9 < n10 && byArray[n9] >= 0) {
            ++n9;
        }
        n8 = n9;
        if (n9 >= n10) {
            return 0;
        }
        while ((n9 = n8) < n10) {
            int n11 = n9 + 1;
            n8 = byArray[n9];
            if (n8 < 0) {
                if (n8 < -32) {
                    if (n11 >= n10) {
                        return n8;
                    }
                    if (n8 >= -62) {
                        n8 = n9 + 2;
                        if (byArray[n11] <= -65) continue;
                    }
                    return -1;
                }
                if (n8 < -16) {
                    if (n11 >= n10 - 1) {
                        return L5.c(byArray, n11, n10);
                    }
                    if (!((n11 = byArray[n11]) > -65 || n8 == -32 && n11 < -96 || n8 == -19 && n11 >= -96)) {
                        n8 = n9 + 3;
                        if (byArray[n9 + 2] <= -65) continue;
                    }
                    return -1;
                }
                if (n11 >= n10 - 2) {
                    return L5.c(byArray, n11, n10);
                }
                if ((n11 = byArray[n11]) <= -65 && (n8 << 28) + (n11 + 112) >> 30 == 0 && byArray[n9 + 2] <= -65) {
                    n8 = n9 + 4;
                    if (byArray[n9 + 3] <= -65) continue;
                }
                return -1;
            }
            n8 = n11;
        }
        return 0;
    }

    @Override
    final int b(String charSequence, byte[] byArray, int n8, int n9) {
        int n10;
        int n11;
        int n12 = ((String)charSequence).length();
        int n13 = n9 + n8;
        for (n9 = 0; n9 < n12 && (n11 = n9 + n8) < n13 && (n10 = ((String)charSequence).charAt(n9)) < 128; ++n9) {
            byArray[n11] = (byte)n10;
        }
        if (n9 == n12) {
            return n8 + n12;
        }
        n8 += n9;
        while (n9 < n12) {
            char c8;
            block11: {
                block12: {
                    block13: {
                        block8: {
                            block10: {
                                block9: {
                                    block7: {
                                        c8 = ((String)charSequence).charAt(n9);
                                        if (c8 >= '\u0080' || n8 >= n13) break block7;
                                        byArray[n8] = (byte)c8;
                                        ++n8;
                                        break block8;
                                    }
                                    if (c8 >= '\u0800' || n8 > n13 - 2) break block9;
                                    byArray[n8] = (byte)(c8 >>> 6 | 0x3C0);
                                    n10 = n8 + 2;
                                    byArray[n8 + 1] = (byte)(c8 & 0x3F | 0x80);
                                    n8 = n10;
                                    break block8;
                                }
                                if (c8 >= '\ud800' && '\udfff' >= c8 || n8 > n13 - 3) break block10;
                                byArray[n8] = (byte)(c8 >>> 12 | 0x1E0);
                                byArray[n8 + 1] = (byte)(c8 >>> 6 & 0x3F | 0x80);
                                n10 = n8 + 3;
                                byArray[n8 + 2] = (byte)(c8 & 0x3F | 0x80);
                                n8 = n10;
                                break block8;
                            }
                            if (n8 > n13 - 4) break block11;
                            n10 = n9 + 1;
                            if (n10 == ((String)charSequence).length()) break block12;
                            char c9 = ((String)charSequence).charAt(n10);
                            if (!Character.isSurrogatePair(c8, c9)) break block13;
                            n9 = Character.toCodePoint(c8, c9);
                            byArray[n8] = (byte)(n9 >>> 18 | 0xF0);
                            byArray[n8 + 1] = (byte)(n9 >>> 12 & 0x3F | 0x80);
                            byArray[n8 + 2] = (byte)(n9 >>> 6 & 0x3F | 0x80);
                            n11 = n8 + 4;
                            byArray[n8 + 3] = (byte)(n9 & 0x3F | 0x80);
                            n9 = n10;
                            n8 = n11;
                        }
                        ++n9;
                        continue;
                    }
                    n9 = n10;
                }
                throw new P5(n9 - 1, n12);
            }
            if (!('\ud800' > c8 || c8 > '\udfff' || (n10 = n9 + 1) != ((String)charSequence).length() && Character.isSurrogatePair(c8, ((String)charSequence).charAt(n10)))) {
                throw new P5(n9, n12);
            }
            charSequence = new StringBuilder("Failed writing ");
            ((StringBuilder)charSequence).append(c8);
            ((StringBuilder)charSequence).append(" at index ");
            ((StringBuilder)charSequence).append(n8);
            throw new ArrayIndexOutOfBoundsException(((StringBuilder)charSequence).toString());
        }
        return n8;
    }

    @Override
    final String c(byte[] byArray, int n8, int n9) throws s4 {
        if ((n8 | n9 | byArray.length - n8 - n9) >= 0) {
            byte by;
            int n10 = n8 + n9;
            char[] cArray = new char[n9];
            n9 = 0;
            while (n8 < n10 && (by = byArray[n8]) >= 0) {
                ++n8;
                K5.d(by, cArray, n9);
                ++n9;
            }
            while (n8 < n10) {
                byte by2;
                int n11 = n8 + 1;
                by = byArray[n8];
                if (by >= 0) {
                    int n12 = n9 + 1;
                    K5.d(by, cArray, n9);
                    n8 = n11;
                    n9 = n12;
                    while (n8 < n10 && (by = byArray[n8]) >= 0) {
                        ++n8;
                        K5.d(by, cArray, n9);
                        ++n9;
                    }
                    continue;
                }
                if (by < -32) {
                    if (n11 < n10) {
                        n8 += 2;
                        K5.c(by, byArray[n11], cArray, n9);
                        ++n9;
                        continue;
                    }
                    throw s4.c();
                }
                if (by < -16) {
                    if (n11 < n10 - 1) {
                        by2 = byArray[n11];
                        n11 = n8 + 3;
                        K5.b(by, by2, byArray[n8 + 2], cArray, n9);
                        ++n9;
                        n8 = n11;
                        continue;
                    }
                    throw s4.c();
                }
                if (n11 < n10 - 2) {
                    by2 = byArray[n11];
                    byte by3 = byArray[n8 + 2];
                    n11 = n8 + 4;
                    K5.a(by, by2, by3, byArray[n8 + 3], cArray, n9);
                    n9 += 2;
                    n8 = n11;
                    continue;
                }
                throw s4.c();
            }
            return new String(cArray, 0, n9);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", byArray.length, n8, n9));
    }
}

