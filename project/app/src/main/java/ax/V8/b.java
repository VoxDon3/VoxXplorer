/*
 * Decompiled with CFR 0.152.
 */
package ax.V8;

import ax.d9.b;
import ax.d9.f;
import ax.d9.g;
import java.nio.charset.Charset;

public class b {
    public static final Charset a = ax.Y8.b.c;

    public static byte[] a(g object, byte[] byArray, byte[] ... byArray2) {
        object = object.c("HMACT64");
        object.a(byArray);
        int n8 = byArray2.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            object.f(byArray2[i8]);
            continue;
        }
        try {
            object = object.g();
            return object;
        }
        catch (f f8) {
            throw new ax.T8.b(f8);
        }
    }

    static byte[] b(g object, byte[] byArray) {
        try {
            object = object.b("MD4");
            object.f(byArray);
            object = object.c();
            return object;
        }
        catch (f f8) {
            throw new ax.T8.b(f8);
        }
    }

    public static byte[] c(g object, byte[] ... byArray) {
        object = object.b("MD5");
        int n8 = byArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            object.f(byArray[i8]);
            continue;
        }
        try {
            object = object.c();
            return object;
        }
        catch (f f8) {
            throw new ax.T8.b(f8);
        }
    }

    public static String d(byte[] byArray) {
        if (byArray != null) {
            return new String(byArray, Charset.forName("Cp850"));
        }
        return "";
    }

    public static byte[] e(String string) {
        if (string != null) {
            return string.getBytes(Charset.forName("Cp850"));
        }
        return new byte[0];
    }

    public static byte[] f(g object, byte[] byArray, byte[] byArray2) throws ax.T8.b {
        byte[] byArray3 = new byte[byArray2.length];
        try {
            object = object.a("RC4");
            object.b(b.a.q, byArray);
            object.c(byArray3, object.a(byArray2, 0, byArray2.length, byArray3, 0));
            return byArray3;
        }
        catch (f f8) {
            throw new ax.T8.b(f8);
        }
    }

    public static String g(byte[] byArray) {
        if (byArray != null) {
            return new String(byArray, a);
        }
        return "";
    }

    public static byte[] h(String string) {
        if (string == null) {
            return new byte[0];
        }
        return string.getBytes(a);
    }
}

