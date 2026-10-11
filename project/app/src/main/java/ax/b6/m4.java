/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.P3;
import ax.b6.U4;
import ax.b6.s3;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class m4 {
    static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] byArray = new byte[]{};
        b = byArray;
        ByteBuffer.wrap(byArray);
        P3.c(byArray, 0, byArray.length, false);
    }

    static int a(int n8, byte[] byArray, int n9, int n10) {
        for (int i8 = n9; i8 < n9 + n10; ++i8) {
            n8 = n8 * 31 + byArray[i8];
        }
        return n8;
    }

    public static int b(long l8) {
        return (int)(l8 ^ l8 >>> 32);
    }

    public static int c(boolean bl) {
        if (bl) {
            return 1231;
        }
        return 1237;
    }

    public static int d(byte[] byArray) {
        int n8;
        int n9 = byArray.length;
        n9 = n8 = m4.a(n9, byArray, 0, n9);
        if (n8 == 0) {
            n9 = 1;
        }
        return n9;
    }

    static <T> T e(T t8) {
        t8.getClass();
        return t8;
    }

    static <T> T f(T t8, String string) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(string);
    }

    static boolean g(U4 u42) {
        boolean bl = u42 instanceof s3;
        return false;
    }
}

