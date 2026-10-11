/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import ax.X4.d;
import ax.X4.h;
import ax.X4.k;

class j {
    private static final float[] a = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    static float a(boolean bl, long l8, int n8, boolean bl2, int n9) {
        if (l8 == 0L) {
            if (bl) {
                return 0.0f;
            }
            return 0.0f;
        }
        if (bl2) {
            if (-45 <= n9 && n9 <= 38) {
                float f8 = j.c(bl, l8, n9);
                float f9 = j.c(bl, l8 + 1L, n9);
                if (!Float.isNaN(f8) && f9 == f8) {
                    return f8;
                }
            }
            return Float.NaN;
        }
        if (-45 <= n8 && n8 <= 38) {
            return j.c(bl, l8, n8);
        }
        return Float.NaN;
    }

    static float b(boolean bl, long l8, int n8, boolean bl2, int n9) {
        if (bl2) {
            n8 = n9;
        }
        if (-126 <= n8 && n8 <= 127) {
            float f8 = Math.abs((float)l8) * Math.scalb(1.0f, n8);
            if (bl) {
                return -f8;
            }
            return f8;
        }
        return Float.NaN;
    }

    static float c(boolean bl, long l8, int n8) {
        if (-10 <= n8 && n8 <= 10 && d.a(l8, 0xFFFFFFL) <= 0) {
            float f8 = l8;
            f8 = n8 < 0 ? (f8 /= a[-n8]) : (f8 *= a[n8]);
            if (bl) {
                return -f8;
            }
            return f8;
        }
        long l9 = h.a[n8 + 325];
        long l10 = n8;
        n8 = Long.numberOfLeadingZeros(l8);
        l9 = k.g((long)(l8 << n8), (long)l9).a;
        long l11 = l9 >>> 63;
        l8 = l9 >>> (int)(38L + l11);
        int n9 = n8 + (int)(l11 ^ 1L);
        l11 = l9 & 0x3FFFFFFFFFL;
        if (l11 != 0x3FFFFFFFFFL) {
            l9 = 0L;
            if (l11 != 0L || (3L & l8) != 1L) {
                l8 = l11 = l8 + 1L >>> 1;
                n8 = n9;
                if (l11 >= 0x1000000L) {
                    n8 = n9 - 1;
                    l8 = 0x800000L;
                }
                if ((l11 = (l10 * 217706L >> 16) + 191L - (long)n8) >= 1L && l11 <= 254L) {
                    if (bl) {
                        l9 = 0x80000000L;
                    }
                    return Float.intBitsToFloat((int)(l8 & 0xFFFFFFFFFF7FFFFFL | l11 << 23 | l9));
                }
            }
        }
        return Float.NaN;
    }
}

