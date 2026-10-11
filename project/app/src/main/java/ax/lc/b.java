/*
 * Decompiled with CFR 0.152.
 */
package ax.lc;

import ax.mc.a;
import ax.mc.c;

public class b {
    public static byte[] a(byte[] object, char[] cArray, ax.sc.a a8, boolean bl) throws ax.oc.a {
        int n8;
        object = new ax.mc.b(new c("HmacSHA1", "ISO-8859-1", (byte[])object, 1000));
        int n9 = a8.h();
        int n10 = n9 + (n8 = a8.j()) + 2;
        if ((object = (Object)object.f(cArray, n10, bl)) != null && ((byte[])object).length == n10) {
            return object;
        }
        throw new ax.oc.a(String.format("Derived Key invalid for Key Length [%d] MAC Length [%d]", n9, n8));
    }

    public static byte[] b(byte[] byArray, ax.sc.a a8) {
        byte[] byArray2 = new byte[2];
        System.arraycopy(byArray, a8.h() + a8.j(), byArray2, 0, 2);
        return byArray2;
    }

    public static ax.nc.a c(byte[] byArray, ax.sc.a object) throws ax.oc.a {
        int n8 = object.h();
        object = new byte[n8];
        System.arraycopy(byArray, 0, object, 0, n8);
        return new ax.nc.a((byte[])object);
    }

    public static a d(byte[] object, ax.sc.a a8) {
        int n8 = a8.j();
        byte[] byArray = new byte[n8];
        System.arraycopy(object, a8.h(), byArray, 0, n8);
        object = new a("HmacSHA1");
        ((a)object).a(byArray);
        return object;
    }

    public static void e(byte[] byArray, int n8) {
        byArray[0] = (byte)n8;
        byArray[1] = (byte)(n8 >> 8);
        byArray[2] = (byte)(n8 >> 16);
        byArray[3] = (byte)(n8 >> 24);
        for (n8 = 4; n8 <= 15; ++n8) {
            byArray[n8] = 0;
        }
    }
}

