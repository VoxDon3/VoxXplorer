package ax.lc;

import ax.mc.C2551a;
import ax.mc.C2552b;
import ax.mc.C2553c;
import ax.nc.C2650a;
import ax.oc.C2743a;
import ax.sc.EnumC3084a;

/* renamed from: ax.lc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2502b {
    public static byte[] a(byte[] bArr, char[] cArr, EnumC3084a enumC3084a, boolean z) throws C2743a {
        C2552b c2552b = new C2552b(new C2553c("HmacSHA1", "ISO-8859-1", bArr, 1000));
        int h = enumC3084a.h();
        int j = enumC3084a.j();
        int i = h + j + 2;
        byte[] f = c2552b.f(cArr, i, z);
        if (f == null || f.length != i) {
            throw new C2743a(String.format("Derived Key invalid for Key Length [%d] MAC Length [%d]", Integer.valueOf(h), Integer.valueOf(j)));
        }
        return f;
    }

    public static byte[] b(byte[] bArr, EnumC3084a enumC3084a) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, enumC3084a.h() + enumC3084a.j(), bArr2, 0, 2);
        return bArr2;
    }

    public static C2650a c(byte[] bArr, EnumC3084a enumC3084a) throws C2743a {
        int h = enumC3084a.h();
        byte[] bArr2 = new byte[h];
        System.arraycopy(bArr, 0, bArr2, 0, h);
        return new C2650a(bArr2);
    }

    public static C2551a d(byte[] bArr, EnumC3084a enumC3084a) {
        int j = enumC3084a.j();
        byte[] bArr2 = new byte[j];
        System.arraycopy(bArr, enumC3084a.h(), bArr2, 0, j);
        C2551a c2551a = new C2551a("HmacSHA1");
        c2551a.a(bArr2);
        return c2551a;
    }

    public static void e(byte[] bArr, int i) {
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[2] = (byte) (i >> 16);
        bArr[3] = (byte) (i >> 24);
        for (int i2 = 4; i2 <= 15; i2++) {
            bArr[i2] = 0;
        }
    }
}
