package ax.Bc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
abstract class f {
    private final Class<?>[] a;

    protected f(Class<?>... clsArr) {
        this.a = clsArr;
    }

    protected static int f(Object obj, int i) {
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    boolean a(Object obj) {
        for (Class<?> cls : this.a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract InputStream b(String str, InputStream inputStream, long j, e eVar, byte[] bArr, int i) throws IOException;

    OutputStream c(OutputStream outputStream, Object obj) throws IOException {
        throw new UnsupportedOperationException("Method doesn't support writing");
    }

    byte[] d(Object obj) throws IOException {
        return ax.Kc.f.a;
    }

    Object e(e eVar, InputStream inputStream) throws IOException {
        return null;
    }
}
