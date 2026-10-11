package ax.Dc;

import ax.Dc.C0687w;
import ax.Dc.I;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.zip.CRC32;

/* loaded from: classes3.dex */
public abstract class Z {
    private static final byte[] a = U.c(8448);

    static void a(I i) throws C0687w {
        if (!i(i)) {
            throw new C0687w(C0687w.a.c0, i);
        }
        if (j(i)) {
            return;
        }
        V h = V.h(i.getMethod());
        if (h != null) {
            throw new C0687w(h, i);
        }
        throw new C0687w(C0687w.a.d0, i);
    }

    static void b(byte[] bArr, byte[] bArr2, int i) {
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, i, bArr.length);
        }
    }

    static byte[] c(byte[] bArr) {
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public static long d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, ((int) ((j >> 25) & 127)) + 1980);
        calendar.set(2, ((int) ((j >> 21) & 15)) - 1);
        calendar.set(5, ((int) (j >> 16)) & 31);
        calendar.set(11, ((int) (j >> 11)) & 31);
        calendar.set(12, ((int) (j >> 5)) & 63);
        calendar.set(13, ((int) (j << 1)) & 62);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    private static String e(AbstractC0666a abstractC0666a, byte[] bArr) {
        if (abstractC0666a == null) {
            return null;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        if (crc32.getValue() != abstractC0666a.e()) {
            return null;
        }
        try {
            return M.a.a(abstractC0666a.g());
        } catch (IOException unused) {
            return null;
        }
    }

    public static byte[] f(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            int i2 = length - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    static void g(I i, byte[] bArr, byte[] bArr2) {
        N n = i.n(r.e0);
        String e = e(n instanceof r ? (r) n : null, bArr);
        if (e != null) {
            i.L(e);
            i.N(I.d.UNICODE_EXTRA_FIELD);
        }
        if (bArr2 == null || bArr2.length <= 0) {
            return;
        }
        N n2 = i.n(C0682q.e0);
        String e2 = e(n2 instanceof C0682q ? (C0682q) n2 : null, bArr2);
        if (e2 != null) {
            i.setComment(e2);
            i.C(I.b.UNICODE_EXTRA_FIELD);
        }
    }

    public static int h(byte b) {
        return b >= 0 ? b : b + 256;
    }

    private static boolean i(I i) {
        return !i.o().l();
    }

    private static boolean j(I i) {
        return i.getMethod() == 0 || i.getMethod() == V.UNSHRINKING.d() || i.getMethod() == V.IMPLODING.d() || i.getMethod() == 8 || i.getMethod() == V.ENHANCED_DEFLATED.d() || i.getMethod() == V.BZIP2.d();
    }

    static void k(Calendar calendar, long j, byte[] bArr, int i) {
        calendar.setTimeInMillis(j);
        if (calendar.get(1) < 1980) {
            b(a, bArr, i);
        } else {
            U.j((calendar.get(13) >> 1) | ((r5 - 1980) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5), bArr, i);
        }
    }

    public static byte l(int i) {
        if (i <= 255 && i >= 0) {
            return i < 128 ? (byte) i : (byte) (i - 256);
        }
        throw new IllegalArgumentException("Can only convert non-negative integers between [0,255] to byte: [" + i + "]");
    }
}
