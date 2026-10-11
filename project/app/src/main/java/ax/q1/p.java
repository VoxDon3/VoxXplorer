/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.E;
import ax.P0.o;
import ax.P0.v;
import ax.S0.F;
import ax.S0.d0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public final class p {
    private static final int[] a = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] c = new int[]{64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] d = new int[]{8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] e = new int[]{5, 8, 10, 12};
    private static final int[] f = new int[]{6, 9, 12, 15};
    private static final int[] g = new int[]{2, 4, 6, 8};
    private static final int[] h = new int[]{9, 11, 13, 16};
    private static final int[] i = new int[]{5, 8, 10, 12};

    private static void a(byte[] byArray, int n8) throws E {
        int n9 = n8 - 2;
        byte by = byArray[n9];
        if ((byArray[n8 - 1] & 0xFF | by << 8 & 0xFFFF) == d0.v(byArray, 0, n9, 65535)) {
            return;
        }
        throw E.a("CRC check failed", null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int b(byte[] byArray) {
        int n8;
        int n9;
        int n10;
        block5: {
            block3: {
                block0: {
                    block4: {
                        block1: {
                            block2: {
                                n10 = 0;
                                n9 = byArray[0];
                                if (n9 == -2) break block0;
                                if (n9 == -1) break block1;
                                if (n9 == 31) break block2;
                                n8 = (byArray[5] & 3) << 12 | (byArray[6] & 0xFF) << 4;
                                n9 = byArray[7];
                                break block3;
                            }
                            n8 = (byArray[6] & 3) << 12 | (byArray[7] & 0xFF) << 4;
                            n9 = byArray[8];
                            break block4;
                        }
                        n8 = (byArray[7] & 3) << 12 | (byArray[6] & 0xFF) << 4;
                        n9 = byArray[9];
                    }
                    n9 = ((n9 & 0x3C) >> 2 | n8) + 1;
                    n8 = 1;
                    break block5;
                }
                n8 = (byArray[4] & 3) << 12 | (byArray[7] & 0xFF) << 4;
                n9 = byArray[6];
            }
            n9 = ((n9 & 0xF0) >> 4 | n8) + 1;
            n8 = n10;
        }
        n10 = n9;
        if (n8 == 0) return n10;
        return n9 * 16 / 14;
    }

    public static int c(int n8) {
        if (n8 != 2147385345 && n8 != -25230976 && n8 != 536864768 && n8 != -14745368) {
            if (n8 != 1683496997 && n8 != 622876772) {
                if (n8 != 1078008818 && n8 != -233094848) {
                    if (n8 != 1908687592 && n8 != -398277519) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private static F d(byte[] object) {
        int n8 = object[0];
        if (n8 != 127 && n8 != 100 && n8 != 64 && n8 != 113) {
            byte[] byArray = Arrays.copyOf((byte[])object, ((byte[])object).length);
            if (p.e(byArray)) {
                for (n8 = 0; n8 < byArray.length - 1; n8 += 2) {
                    byte by = byArray[n8];
                    int n9 = n8 + 1;
                    byArray[n8] = byArray[n9];
                    byArray[n9] = by;
                }
            }
            F f8 = new F(byArray);
            if (byArray[0] == 31) {
                object = new F(byArray);
                while (((F)object).b() >= 16) {
                    ((F)object).r(2);
                    f8.f(((F)object).h(14), 14);
                }
            }
            f8.n(byArray);
            return f8;
        }
        return new F((byte[])object);
    }

    private static boolean e(byte[] byArray) {
        byte by = byArray[0];
        return by == -2 || by == -1 || by == 37 || by == -14 || by == -24;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int f(ByteBuffer byteBuffer) {
        int n8;
        int n9;
        block6: {
            block4: {
                block5: {
                    if (byteBuffer.getInt(0) == -233094848) return 1024;
                    if (byteBuffer.getInt(0) == -398277519) {
                        return 1024;
                    }
                    if (byteBuffer.getInt(0) == 622876772) {
                        return 4096;
                    }
                    n9 = byteBuffer.position();
                    n8 = byteBuffer.get(n9);
                    if (n8 == -2) break block4;
                    if (n8 == -1) break block5;
                    if (n8 != 31) {
                        n8 = (byteBuffer.get(n9 + 4) & 1) << 6;
                        n9 = byteBuffer.get(n9 + 5);
                        break block6;
                    } else {
                        n8 = (byteBuffer.get(n9 + 5) & 7) << 4;
                        n9 = byteBuffer.get(n9 + 6);
                        return (((n9 &= 0x3C) >> 2 | n8) + 1) * 32;
                    }
                }
                n8 = (byteBuffer.get(n9 + 4) & 7) << 4;
                n9 = byteBuffer.get(n9 + 7);
                return (((n9 &= 0x3C) >> 2 | n8) + 1) * 32;
            }
            n8 = (byteBuffer.get(n9 + 5) & 1) << 6;
            n9 = byteBuffer.get(n9 + 4);
        }
        n9 &= 0xFC;
        return ((n9 >> 2 | n8) + 1) * 32;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int g(byte[] byArray) {
        int n8;
        int n9;
        block4: {
            block2: {
                block3: {
                    n9 = byArray[0];
                    if (n9 == -2) break block2;
                    if (n9 == -1) break block3;
                    if (n9 != 31) {
                        n9 = (byArray[4] & 1) << 6;
                        n8 = byArray[5];
                        break block4;
                    } else {
                        n9 = (byArray[5] & 7) << 4;
                        n8 = byArray[6];
                        return (((n8 &= 0x3C) >> 2 | n9) + 1) * 32;
                    }
                }
                n9 = (byArray[4] & 7) << 4;
                n8 = byArray[7];
                return (((n8 &= 0x3C) >> 2 | n9) + 1) * 32;
            }
            n9 = (byArray[5] & 1) << 6;
            n8 = byArray[4];
        }
        n8 &= 0xFC;
        return ((n8 >> 2 | n9) + 1) * 32;
    }

    public static v h(byte[] objectArray, String string, String string2, int n8, String string3, o o8) {
        F f8 = p.d(objectArray);
        f8.r(60);
        int n9 = f8.h(6);
        int n10 = a[n9];
        n9 = f8.h(4);
        int n11 = b[n9];
        n9 = f8.h(5);
        objectArray = c;
        n9 = n9 >= objectArray.length ? -1 : objectArray[n9] * 1000 / 2;
        f8.r(10);
        int n12 = f8.h(2) > 0 ? 1 : 0;
        return new v.b().j0(string).W(string3).y0("audio/vnd.dts").S(n9).T(n10 + n12).z0(n11).c0(o8).n0(string2).w0(n8).P();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static b i(byte[] object) throws E {
        long l8;
        int n8;
        int n9;
        int n10;
        object = p.d((byte[])object);
        ((F)object).r(40);
        int n11 = ((F)object).h(2);
        if (!((F)object).g()) {
            n10 = 16;
            n9 = 8;
        } else {
            n10 = 20;
            n9 = 12;
        }
        ((F)object).r(n9);
        int n12 = ((F)object).h(n10);
        boolean bl = ((F)object).g();
        int n13 = -1;
        n9 = 0;
        int n14 = 0;
        if (bl) {
            n8 = ((F)object).h(2);
            int n15 = ((F)object).h(3);
            if (((F)object).g()) {
                ((F)object).r(36);
            }
            int n16 = ((F)object).h(3);
            n9 = ((F)object).h(3);
            if (n16 + 1 != 1) throw E.d("Multiple audio presentations or assets not supported");
            if (n9 + 1 != 1) throw E.d("Multiple audio presentations or assets not supported");
            n16 = n11 + 1;
            n11 = ((F)object).h(n16);
            for (n9 = 0; n9 < n16; ++n9) {
                if ((n11 >> n9 & 1) != 1) continue;
                ((F)object).r(8);
            }
            if (((F)object).g()) {
                ((F)object).r(2);
                n11 = ((F)object).h(2);
                n16 = ((F)object).h(2);
                for (n9 = n14; n9 < n16 + 1; ++n9) {
                    ((F)object).r(n11 + 1 << 2);
                }
            }
            n9 = (n15 + 1) * 512;
        } else {
            n8 = -1;
        }
        ((F)object).r(n10);
        ((F)object).r(12);
        if (bl) {
            if (((F)object).g()) {
                ((F)object).r(4);
            }
            if (((F)object).g()) {
                ((F)object).r(24);
            }
            if (((F)object).g()) {
                ((F)object).s(((F)object).h(10) + 1);
            }
            ((F)object).r(5);
            n14 = d[((F)object).h(4)];
            n13 = ((F)object).h(8) + 1;
        } else {
            n14 = -2147483647;
        }
        if (!bl) {
            l8 = -9223372036854775807L;
            return new b("audio/vnd.dts.hd;profile=lbr", n13, n14, n12 + 1, l8, 0);
        }
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unsupported reference clock code in DTS HD header: ");
                    ((StringBuilder)object).append(n8);
                    throw E.a(((StringBuilder)object).toString(), null);
                }
                n10 = 48000;
            } else {
                n10 = 44100;
            }
        } else {
            n10 = 32000;
        }
        l8 = d0.p1(n9, 1000000L, n10);
        return new b("audio/vnd.dts.hd;profile=lbr", n13, n14, n12 + 1, l8, 0);
    }

    public static int j(byte[] object) {
        object = p.d((byte[])object);
        ((F)object).r(42);
        int n8 = ((F)object).g() ? 12 : 8;
        return ((F)object).h(n8) + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static b k(byte[] object, AtomicInteger atomicInteger) throws E {
        long l8;
        int n8;
        int n9;
        F f8 = p.d((byte[])object);
        int n10 = f8.h(32);
        int n11 = 0;
        int n12 = n10 == 1078008818 ? 1 : 0;
        int n13 = p.m(f8, e, true) + 1;
        if (n12 != 0) {
            if (!f8.g()) {
                throw E.d("Only supports full channel mask-based audio presentation");
            }
            p.a((byte[])object, n13);
            n10 = f8.h(2);
            if (n10 != 0) {
                if (n10 != 1) {
                    if (n10 != 2) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Unsupported base duration index in DTS UHD header: ");
                        ((StringBuilder)object).append(n10);
                        throw E.a(((StringBuilder)object).toString(), null);
                    }
                    n10 = 384;
                } else {
                    n10 = 480;
                }
            } else {
                n10 = 512;
            }
            n9 = f8.h(3);
            n8 = f8.h(2);
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Unsupported clock rate index in DTS UHD header: ");
                        ((StringBuilder)object).append(n8);
                        throw E.a(((StringBuilder)object).toString(), null);
                    }
                    n8 = 48000;
                } else {
                    n8 = 44100;
                }
            } else {
                n8 = 32000;
            }
            if (f8.g()) {
                f8.r(36);
            }
            int n14 = f8.h(2);
            l8 = d0.p1(n10 * (n9 + 1), 1000000L, n8);
            n10 = (1 << n14) * n8;
        } else {
            l8 = -9223372036854775807L;
            n10 = -2147483647;
        }
        n8 = 0;
        for (n9 = 0; n9 < n12; n8 += p.m(f8, f, true), ++n9) {
        }
        if (n12 != 0) {
            atomicInteger.set(p.m(f8, g, true));
        }
        n12 = n11;
        if (atomicInteger.get() != 0) {
            n12 = p.m(f8, h, true);
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, n10, n13 + (n8 + n12), l8, 0);
    }

    public static int l(byte[] object) {
        object = p.d((byte[])object);
        ((F)object).r(32);
        return p.m((F)object, i, true) + 1;
    }

    private static int m(F f8, int[] nArray, boolean bl) {
        int n8;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        for (n8 = 0; n8 < 3 && f8.g(); ++n8) {
            ++n11;
        }
        n8 = n9;
        if (bl) {
            n8 = 0;
            while (n10 < n11) {
                n8 += 1 << nArray[n10];
                ++n10;
            }
        }
        return n8 + f8.h(nArray[n11]);
    }

    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final long e;
        public final int f;

        private b(String string, int n8, int n9, int n10, long l8, int n11) {
            this.a = string;
            this.c = n8;
            this.b = n9;
            this.d = n10;
            this.e = l8;
            this.f = n11;
        }
    }
}

