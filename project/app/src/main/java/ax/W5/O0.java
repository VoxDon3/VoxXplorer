/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.P0;
import ax.W5.v0;
import ax.W5.x0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class O0 {
    static final Charset a = Charset.forName("US-ASCII");
    static final Charset b = Charset.forName("UTF-8");
    static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final x0 f;

    static {
        Object object = new byte[]{};
        d = object;
        e = ByteBuffer.wrap(object);
        int n8 = x0.a;
        object = new v0((byte[])object, 0, 0, false, null);
        try {
            object.c(0);
            f = object;
            return;
        }
        catch (P0 p02) {
            throw new IllegalArgumentException(p02);
        }
    }

    public static int a(boolean bl) {
        if (bl) {
            return 1231;
        }
        return 1237;
    }

    static int b(int n8, byte[] byArray, int n9, int n10) {
        for (n9 = 0; n9 < n10; ++n9) {
            n8 = n8 * 31 + byArray[n9];
        }
        return n8;
    }

    static Object c(Object object, String string) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException("messageType");
    }

    public static String d(byte[] byArray) {
        return new String(byArray, b);
    }
}

