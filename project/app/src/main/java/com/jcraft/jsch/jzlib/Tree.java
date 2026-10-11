/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Deflate;
import com.jcraft.jsch.jzlib.StaticTree;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

final class Tree {
    static final int[] d = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};
    static final int[] e = new int[]{0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
    static final int[] f = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 7};
    static final byte[] g = new byte[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    static final byte[] h = Tree.$d2j$hex$da29225a$decode_B("00010203040405050606060607070707080808080808080809090909090909090a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0b0b0b0b0b0b0b0b0b0b0b0b0b0b0b0b0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0d0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0e0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f0f000010111212131314141414151515151616161616161616171717171717171718181818181818181818181818181818191919191919191919191919191919191a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d1d");
    static final byte[] i = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 28};
    static final int[] j = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 0};
    static final int[] k = new int[]{0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, 384, 512, 768, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576};
    short[] a;
    int b;
    StaticTree c;

    Tree() {
    }

    private static final int a(int n8, int n9) {
        int n10;
        int n11;
        int n12 = 0;
        do {
            n11 = n8;
            n8 = n11 >>> 1;
            n10 = (n12 | n11 & 1) << 1;
            n11 = n9 - 1;
            n12 = n10;
            n9 = n11;
        } while (n11 > 0);
        return n10 >>> 1;
    }

    static int c(int n8) {
        if (n8 < 256) {
            return h[n8];
        }
        return h[(n8 >>> 7) + 256];
    }

    private static final void e(short[] sArray, int n8, short[] sArray2, short[] sArray3) {
        int n9 = 0;
        sArray3[0] = 0;
        int n10 = 1;
        short s8 = 0;
        while (true) {
            short s9;
            if (n10 > 15) break;
            sArray3[n10] = s9 = (short)(s8 + sArray2[n10 - 1] << 1);
            ++n10;
            s8 = s9;
        }
        for (int i8 = n9; i8 <= n8; ++i8) {
            n10 = i8 * 2;
            s8 = sArray[n10 + 1];
            if (s8 == 0) continue;
            n9 = sArray3[s8];
            sArray3[s8] = (short)(n9 + 1);
            sArray[n10] = (short)Tree.a(n9, s8);
        }
    }

    void b(Deflate deflate) {
        int n8;
        short[] sArray = this.a;
        Object object = this.c;
        Object[] objectArray = ((StaticTree)object).a;
        int n9 = ((StaticTree)object).d;
        deflate.U0 = 0;
        deflate.V0 = 573;
        int n10 = -1;
        int n11 = 0;
        while (true) {
            n8 = n10;
            if (n11 >= n9) break;
            n8 = n11 * 2;
            if (sArray[n8] != 0) {
                object = deflate.T0;
                deflate.U0 = n8 = deflate.U0 + 1;
                object[n8] = n11;
                deflate.W0[n11] = 0;
                n10 = n11;
            } else {
                sArray[n8 + 1] = 0;
            }
            ++n11;
        }
        while ((n11 = deflate.U0) < 2) {
            object = deflate.T0;
            deflate.U0 = n10 = n11 + 1;
            if (n8 < 2) {
                n8 = n11 = n8 + 1;
            } else {
                n11 = 0;
            }
            object[n10] = n11;
            n10 = n11 * 2;
            sArray[n10] = 1;
            deflate.W0[n11] = 0;
            --deflate.b1;
            if (objectArray == null) continue;
            deflate.c1 -= objectArray[n10 + 1];
        }
        this.b = n8;
        n10 = n11 / 2;
        while (true) {
            n11 = n9;
            if (n10 < 1) break;
            deflate.H(sArray, n10);
            --n10;
        }
        while (true) {
            short s8;
            int n12;
            objectArray = deflate.T0;
            n10 = objectArray[1];
            n9 = deflate.U0;
            deflate.U0 = n9 - 1;
            objectArray[1] = objectArray[n9];
            deflate.H(sArray, 1);
            objectArray = deflate.T0;
            n9 = objectArray[1];
            int n13 = deflate.V0;
            deflate.V0 = n12 = n13 - 1;
            objectArray[n12] = n10;
            deflate.V0 = n12 = n13 - 2;
            objectArray[n12] = n9;
            int n14 = n10 * 2;
            n13 = sArray[n14];
            n12 = n9 * 2;
            sArray[n11 * 2] = (short)(n13 + sArray[n12]);
            objectArray = deflate.W0;
            objectArray[n11] = (byte)(Math.max(objectArray[n10], objectArray[n9]) + 1);
            sArray[n12 + 1] = s8 = (short)n11;
            sArray[n14 + 1] = s8;
            deflate.T0[1] = n11++;
            deflate.H(sArray, 1);
            if (deflate.U0 >= 2) continue;
            objectArray = deflate.T0;
            deflate.V0 = n11 = deflate.V0 - 1;
            objectArray[n11] = objectArray[1];
            this.d(deflate);
            Tree.e(sArray, n8, deflate.R0, deflate.S0);
            return;
        }
    }

    void d(Deflate deflate) {
        int n8;
        int n9;
        int n10;
        int n11;
        short[] sArray = this.a;
        Object object = this.c;
        Object[] objectArray = ((StaticTree)object).a;
        int[] nArray = ((StaticTree)object).b;
        int n12 = ((StaticTree)object).c;
        int n13 = ((StaticTree)object).e;
        for (n11 = 0; n11 <= 15; ++n11) {
            deflate.R0[n11] = 0;
        }
        object = deflate.T0;
        n11 = deflate.V0;
        sArray[object[n11] * 2 + true] = 0;
        ++n11;
        int n14 = 0;
        while (n11 < 573) {
            int n15 = deflate.T0[n11];
            int n16 = n15 * 2;
            int n17 = n16 + 1;
            n10 = sArray[sArray[n17] * 2 + 1] + 1;
            n9 = n14;
            n8 = n10;
            if (n10 > n13) {
                n9 = n14 + 1;
                n8 = n13;
            }
            sArray[n17] = (short)n8;
            if (n15 <= this.b) {
                object = deflate.R0;
                object[n8] = (short)(object[n8] + true);
                n14 = n15 >= n12 ? nArray[n15 - n12] : 0;
                n10 = sArray[n16];
                deflate.b1 += (n8 + n14) * n10;
                if (objectArray != null) {
                    deflate.c1 += n10 * (objectArray[n17] + n14);
                }
            }
            ++n11;
            n14 = n9;
        }
        n8 = n14;
        if (n14 != 0) {
            do {
                n14 = n13 - 1;
                while ((n9 = (objectArray = deflate.R0)[n14]) == 0) {
                    --n14;
                }
                objectArray[n14] = (short)(n9 - 1);
                objectArray[++n14] = (short)(objectArray[n14] + 2);
                objectArray[n13] = (short)(objectArray[n13] - 1);
                n8 = n14 = n8 - 2;
            } while (n14 > 0);
            while (n13 != 0) {
                n8 = deflate.R0[n13];
                n14 = n11;
                n11 = n8;
                while (n11 != 0) {
                    objectArray = deflate.T0;
                    if ((n8 = objectArray[--n14]) > this.b) continue;
                    n10 = (n8 *= 2) + 1;
                    n9 = sArray[n10];
                    if (n9 != n13) {
                        deflate.b1 += (int)(((long)n13 - (long)n9) * (long)sArray[n8]);
                        sArray[n10] = (short)n13;
                    }
                    --n11;
                }
                --n13;
                n11 = n14;
            }
        }
    }

    private static long[] $d2j$hex$da29225a$decode_J(String src) {
        byte[] d8 = Tree.$d2j$hex$da29225a$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$da29225a$decode_I(String src) {
        byte[] d8 = Tree.$d2j$hex$da29225a$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$da29225a$decode_S(String src) {
        byte[] d8 = Tree.$d2j$hex$da29225a$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$da29225a$decode_B(String src) {
        char[] d8 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i8 = 0; i8 < ret.length; ++i8) {
            int ll;
            int hh;
            char h8 = d8[2 * i8];
            char l8 = d8[2 * i8 + 1];
            if (h8 >= '0' && h8 <= '9') {
                hh = h8 - 48;
            } else if (h8 >= 'a' && h8 <= 'f') {
                hh = h8 - 97 + 10;
            } else if (h8 >= 'A' && h8 <= 'F') {
                hh = h8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l8 >= '0' && l8 <= '9') {
                ll = l8 - 48;
            } else if (l8 >= 'a' && l8 <= 'f') {
                ll = l8 - 97 + 10;
            } else if (l8 >= 'A' && l8 <= 'F') {
                ll = l8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i8] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}

