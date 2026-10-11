package ax.q1;

import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.S0.d0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Settings;

/* renamed from: ax.q1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2856p {
    private static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] e = {5, 8, 10, 12};
    private static final int[] f = {6, 9, 12, 15};
    private static final int[] g = {2, 4, 6, 8};
    private static final int[] h = {9, 11, 13, 16};
    private static final int[] i = {5, 8, 10, 12};

    /* renamed from: ax.q1.p$b */
    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final long e;
        public final int f;

        private b(String str, int i, int i2, int i3, long j, int i4) {
            this.a = str;
            this.c = i;
            this.b = i2;
            this.d = i3;
            this.e = j;
            this.f = i4;
        }
    }

    private static void a(byte[] bArr, int i2) throws ax.P0.E {
        int i3 = i2 - 2;
        if (((bArr[i2 - 1] & 255) | ((bArr[i3] << 8) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != d0.v(bArr, 0, i3, Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
            throw ax.P0.E.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.q1.C2856p.b(byte[]):int");
    }

    public static int c(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    private static ax.S0.F d(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new ax.S0.F(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(copyOf)) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b3 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b3;
            }
        }
        ax.S0.F f2 = new ax.S0.F(copyOf);
        if (copyOf[0] == 31) {
            ax.S0.F f3 = new ax.S0.F(copyOf);
            while (f3.b() >= 16) {
                f3.r(2);
                f2.f(f3.h(14), 14);
            }
        }
        f2.n(copyOf);
        return f2;
    }

    private static boolean e(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position = byteBuffer.position();
        byte b4 = byteBuffer.get(position);
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (byteBuffer.get(position + 4) & 7) << 4;
                b3 = byteBuffer.get(position + 7);
            } else if (b4 != 31) {
                i2 = (byteBuffer.get(position + 4) & 1) << 6;
                b2 = byteBuffer.get(position + 5);
            } else {
                i2 = (byteBuffer.get(position + 5) & 7) << 4;
                b3 = byteBuffer.get(position + 6);
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (byteBuffer.get(position + 5) & 1) << 6;
        b2 = byteBuffer.get(position + 4);
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    public static C0912v h(byte[] bArr, String str, String str2, int i2, String str3, C0906o c0906o) {
        ax.S0.F d2 = d(bArr);
        d2.r(60);
        int i3 = a[d2.h(6)];
        int i4 = b[d2.h(4)];
        int h2 = d2.h(5);
        int[] iArr = c;
        int i5 = h2 >= iArr.length ? -1 : (iArr[h2] * 1000) / 2;
        d2.r(10);
        return new C0912v.b().j0(str).W(str3).y0("audio/vnd.dts").S(i5).T(i3 + (d2.h(2) > 0 ? 1 : 0)).z0(i4).c0(c0906o).n0(str2).w0(i2).P();
    }

    public static b i(byte[] bArr) throws ax.P0.E {
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        ax.S0.F d2 = d(bArr);
        d2.r(40);
        int h2 = d2.h(2);
        if (d2.g()) {
            i2 = 20;
            i3 = 12;
        } else {
            i2 = 16;
            i3 = 8;
        }
        d2.r(i3);
        int h3 = d2.h(i2) + 1;
        boolean g2 = d2.g();
        int i7 = -1;
        int i8 = 0;
        if (g2) {
            i4 = d2.h(2);
            int h4 = (d2.h(3) + 1) * 512;
            if (d2.g()) {
                d2.r(36);
            }
            int h5 = d2.h(3) + 1;
            int h6 = d2.h(3) + 1;
            if (h5 != 1 || h6 != 1) {
                throw ax.P0.E.d("Multiple audio presentations or assets not supported");
            }
            int i9 = h2 + 1;
            int h7 = d2.h(i9);
            for (int i10 = 0; i10 < i9; i10++) {
                if (((h7 >> i10) & 1) == 1) {
                    d2.r(8);
                }
            }
            if (d2.g()) {
                d2.r(2);
                int h8 = (d2.h(2) + 1) << 2;
                int h9 = d2.h(2) + 1;
                while (i8 < h9) {
                    d2.r(h8);
                    i8++;
                }
            }
            i8 = h4;
        } else {
            i4 = -1;
        }
        d2.r(i2);
        d2.r(12);
        if (g2) {
            if (d2.g()) {
                d2.r(4);
            }
            if (d2.g()) {
                d2.r(24);
            }
            if (d2.g()) {
                d2.s(d2.h(10) + 1);
            }
            d2.r(5);
            int i11 = d[d2.h(4)];
            i7 = d2.h(8) + 1;
            i5 = i11;
        } else {
            i5 = -2147483647;
        }
        if (g2) {
            if (i4 == 0) {
                i6 = 32000;
            } else if (i4 == 1) {
                i6 = 44100;
            } else {
                if (i4 != 2) {
                    throw ax.P0.E.a("Unsupported reference clock code in DTS HD header: " + i4, null);
                }
                i6 = 48000;
            }
            j = d0.p1(i8, 1000000L, i6);
        } else {
            j = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", i7, i5, h3, j, 0);
    }

    public static int j(byte[] bArr) {
        ax.S0.F d2 = d(bArr);
        d2.r(42);
        return d2.h(d2.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) throws ax.P0.E {
        long j;
        int i2;
        AtomicInteger atomicInteger2;
        int i3;
        int i4;
        ax.S0.F d2 = d(bArr);
        int i5 = d2.h(32) == 1078008818 ? 1 : 0;
        int m = m(d2, e, true) + 1;
        if (i5 == 0) {
            j = -9223372036854775807L;
            i2 = -2147483647;
        } else {
            if (!d2.g()) {
                throw ax.P0.E.d("Only supports full channel mask-based audio presentation");
            }
            a(bArr, m);
            int h2 = d2.h(2);
            if (h2 == 0) {
                i3 = 512;
            } else if (h2 == 1) {
                i3 = 480;
            } else {
                if (h2 != 2) {
                    throw ax.P0.E.a("Unsupported base duration index in DTS UHD header: " + h2, null);
                }
                i3 = 384;
            }
            int h3 = i3 * (d2.h(3) + 1);
            int h4 = d2.h(2);
            if (h4 == 0) {
                i4 = 32000;
            } else if (h4 == 1) {
                i4 = 44100;
            } else {
                if (h4 != 2) {
                    throw ax.P0.E.a("Unsupported clock rate index in DTS UHD header: " + h4, null);
                }
                i4 = 48000;
            }
            if (d2.g()) {
                d2.r(36);
            }
            int h5 = (1 << d2.h(2)) * i4;
            j = d0.p1(h3, 1000000L, i4);
            i2 = h5;
        }
        long j2 = j;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += m(d2, f, true);
        }
        if (i5 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(d2, g, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i2, m + i6 + (atomicInteger2.get() != 0 ? m(d2, h, true) : 0), j2, 0);
    }

    public static int l(byte[] bArr) {
        ax.S0.F d2 = d(bArr);
        d2.r(32);
        return m(d2, i, true) + 1;
    }

    private static int m(ax.S0.F f2, int[] iArr, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 3 && f2.g(); i4++) {
            i3++;
        }
        if (z) {
            int i5 = 0;
            while (i2 < i3) {
                i5 += 1 << iArr[i2];
                i2++;
            }
            i2 = i5;
        }
        return i2 + f2.h(iArr[i3]);
    }
}
