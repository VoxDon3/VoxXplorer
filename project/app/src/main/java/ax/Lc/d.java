/*
 * Decompiled with CFR 0.152.
 */
package ax.Lc;

import ax.Lc.e;
import java.io.File;

public class d {
    public static final char a = File.separatorChar;
    public static final byte[] b = new byte[0];
    @Deprecated
    public static final String c = System.lineSeparator();
    public static final String d = ax.Lc.e.e0.h();
    public static final String e = ax.Lc.e.d0.h();

    public static byte[] a(int n8) {
        return new byte[n8];
    }

    static void b(int n8, int n9, int n10) {
        if ((n8 | n9 | n10) >= 0 && n10 - n9 >= n8) {
            return;
        }
        throw new IndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", n8, n9, n10));
    }

    public static void c(byte[] byArray, int n8, int n9) {
        j.Objects.requireNonNull((Object)byArray, (String)"byte array");
        ax.Lc.d.b(n8, n9, byArray.length);
    }
}

