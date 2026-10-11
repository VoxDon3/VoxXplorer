package ax.m7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class l {
    public static long a(y yVar) throws IOException {
        C2528c c2528c = new C2528c();
        try {
            yVar.b(c2528c);
            c2528c.close();
            return c2528c.q;
        } catch (Throwable th) {
            c2528c.close();
            throw th;
        }
    }

    @Deprecated
    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        c(inputStream, outputStream, true);
    }

    @Deprecated
    public static void c(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        try {
            C2529d.a(inputStream, outputStream);
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }
}
