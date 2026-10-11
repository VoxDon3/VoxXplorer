package ax.Lc;

import j$.util.Objects;
import java.io.File;

/* loaded from: classes3.dex */
public class d {
    public static final char a = File.separatorChar;
    public static final byte[] b = new byte[0];

    @Deprecated
    public static final String c = System.lineSeparator();
    public static final String d = e.LF.h();
    public static final String e = e.CRLF.h();

    public static byte[] a(int i) {
        return new byte[i];
    }

    static void b(int i, int i2, int i3) {
        if ((i | i2 | i3) < 0 || i3 - i2 < i) {
            throw new IndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void c(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "byte array");
        b(i, i2, bArr.length);
    }
}
