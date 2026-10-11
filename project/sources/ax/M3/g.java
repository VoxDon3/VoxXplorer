package ax.M3;

import ax.M3.f;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g {
    public static int a(List<f> list, InputStream inputStream, ax.Q3.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ax.X3.l(inputStream, bVar);
        }
        inputStream.mark(5242880);
        Iterator<f> it = list.iterator();
        while (it.hasNext()) {
            try {
                int b = it.next().b(inputStream, bVar);
                if (b != -1) {
                    return b;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static f.a b(List<f> list, InputStream inputStream, ax.Q3.b bVar) throws IOException {
        if (inputStream == null) {
            return f.a.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ax.X3.l(inputStream, bVar);
        }
        inputStream.mark(5242880);
        Iterator<f> it = list.iterator();
        while (it.hasNext()) {
            try {
                f.a c = it.next().c(inputStream);
                if (c != f.a.UNKNOWN) {
                    return c;
                }
            } finally {
                inputStream.reset();
            }
        }
        return f.a.UNKNOWN;
    }

    public static f.a c(List<f> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return f.a.UNKNOWN;
        }
        Iterator<f> it = list.iterator();
        while (it.hasNext()) {
            f.a a = it.next().a(byteBuffer);
            if (a != f.a.UNKNOWN) {
                return a;
            }
        }
        return f.a.UNKNOWN;
    }
}
