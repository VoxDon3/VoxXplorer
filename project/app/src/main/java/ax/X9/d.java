/*
 * Decompiled with CFR 0.152.
 */
package ax.X9;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

final class d {
    static final Charset a = Charset.forName("US-ASCII");
    static final Charset b = Charset.forName("UTF-8");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    static void b(File object) throws IOException {
        Object object2 = ((File)object).listFiles();
        if (object2 != null) {
            int n8 = ((File[])object2).length;
            for (int i8 = 0; i8 < n8; ++i8) {
                object = object2[i8];
                if (((File)object).isDirectory()) {
                    d.b((File)object);
                }
                if (((File)object).delete()) {
                    continue;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("failed to delete file: ");
                ((StringBuilder)object2).append(object);
                throw new IOException(((StringBuilder)object2).toString());
            }
            return;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("not a readable directory: ");
        ((StringBuilder)object2).append(object);
        throw new IOException(((StringBuilder)object2).toString());
    }
}

