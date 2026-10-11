/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.I;
import ax.Dc.M;
import ax.Dc.N;
import ax.Dc.U;
import ax.Dc.V;
import ax.Dc.a;
import ax.Dc.q;
import ax.Dc.r;
import ax.Dc.w;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.zip.CRC32;

public abstract class Z {
    private static final byte[] a = U.c(8448L);

    static void a(I i8) throws w {
        if (Z.i(i8)) {
            if (!Z.j(i8)) {
                V v8 = V.h(i8.getMethod());
                if (v8 == null) {
                    throw new w(w.a.d0, i8);
                }
                throw new w(v8, i8);
            }
            return;
        }
        throw new w(w.a.c0, i8);
    }

    static void b(byte[] byArray, byte[] byArray2, int n8) {
        if (byArray != null) {
            System.arraycopy(byArray, 0, byArray2, n8, byArray.length);
        }
    }

    static byte[] c(byte[] byArray) {
        if (byArray != null) {
            return Arrays.copyOf(byArray, byArray.length);
        }
        return null;
    }

    public static long d(long l8) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, (int)(l8 >> 25 & 0x7FL) + 1980);
        calendar.set(2, (int)(l8 >> 21 & 0xFL) - 1);
        calendar.set(5, (int)(l8 >> 16) & 0x1F);
        calendar.set(11, (int)(l8 >> 11) & 0x1F);
        calendar.set(12, (int)(l8 >> 5) & 0x3F);
        calendar.set(13, (int)(l8 << 1) & 0x3E);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String e(a object, byte[] byArray) {
        if (object == null) return null;
        CRC32 cRC32 = new CRC32();
        cRC32.update(byArray);
        if (cRC32.getValue() != ((a)object).e()) return null;
        try {
            return M.a.a(((a)object).g());
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static byte[] f(byte[] byArray) {
        int n8 = byArray.length;
        for (int i8 = 0; i8 < byArray.length / 2; ++i8) {
            byte by = byArray[i8];
            int n9 = n8 - 1 - i8;
            byArray[i8] = byArray[n9];
            byArray[n9] = by;
        }
        return byArray;
    }

    static void g(I i8, byte[] object, byte[] byArray) {
        N n8 = i8.n(r.e0);
        boolean bl = n8 instanceof r;
        Object var5_5 = null;
        n8 = bl ? (r)n8 : null;
        object = Z.e((a)n8, object);
        if (object != null) {
            i8.L((String)object);
            i8.N(I.d.d0);
        }
        if (byArray != null && byArray.length > 0) {
            n8 = i8.n(q.e0);
            object = var5_5;
            if (n8 instanceof q) {
                object = (q)n8;
            }
            if ((object = (Object)Z.e((a)object, byArray)) != null) {
                i8.setComment((String)object);
                i8.C(I.b.c0);
            }
        }
    }

    public static int h(byte by) {
        if (by >= 0) {
            return by;
        }
        return by + 256;
    }

    private static boolean i(I i8) {
        return i8.o().l() ^ true;
    }

    private static boolean j(I i8) {
        return i8.getMethod() == 0 || i8.getMethod() == V.d0.d() || i8.getMethod() == V.i0.d() || i8.getMethod() == 8 || i8.getMethod() == V.l0.d() || i8.getMethod() == V.n0.d();
        {
        }
    }

    static void k(Calendar calendar, long l8, byte[] byArray, int n8) {
        calendar.setTimeInMillis(l8);
        int n9 = calendar.get(1);
        if (n9 < 1980) {
            Z.b(a, byArray, n8);
            return;
        }
        int n10 = calendar.get(2);
        int n11 = calendar.get(5);
        int n12 = calendar.get(11);
        int n13 = calendar.get(12);
        U.j(calendar.get(13) >> 1 | (n9 - 1980 << 25 | n10 + 1 << 21 | n11 << 16 | n12 << 11 | n13 << 5), byArray, n8);
    }

    public static byte l(int n8) {
        if (n8 <= 255 && n8 >= 0) {
            if (n8 < 128) {
                return (byte)n8;
            }
            return (byte)(n8 - 256);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can only convert non-negative integers between [0,255] to byte: [");
        stringBuilder.append(n8);
        stringBuilder.append("]");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

