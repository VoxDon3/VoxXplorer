/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.c;
import ax.m7.d;
import ax.m7.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class l {
    public static long a(y y8) throws IOException {
        c c8 = new c();
        try {
            y8.b(c8);
            return c8.q;
        }
        finally {
            c8.close();
        }
    }

    @Deprecated
    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        l.c(inputStream, outputStream, true);
    }

    @Deprecated
    public static void c(InputStream inputStream, OutputStream outputStream, boolean bl) throws IOException {
        try {
            d.a(inputStream, outputStream);
            return;
        }
        finally {
            if (bl) {
                inputStream.close();
            }
        }
    }
}

