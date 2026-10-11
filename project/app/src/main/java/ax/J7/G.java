/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.J7.F;
import ax.J7.i;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

class G {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(InputStream inputStream, File object) throws IOException {
        RuntimeException var0_3;
        block6: {
            GZIPOutputStream gZIPOutputStream;
            if (inputStream == null) {
                return;
            }
            byte[] byArray = new byte[8192];
            Object var3_6 = null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream((File)object);
                gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
            }
            catch (Throwable throwable) {
                object = var3_6;
                break block6;
            }
            try {
                int n8;
                while ((n8 = inputStream.read(byArray)) > 0) {
                    gZIPOutputStream.write(byArray, 0, n8);
                }
            }
            catch (Throwable throwable) {
                object = gZIPOutputStream;
                break block6;
            }
            gZIPOutputStream.finish();
            i.g(gZIPOutputStream);
            return;
        }
        i.g((Closeable)object);
        throw var0_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void b(File file, List<F> object) {
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            F f8 = (F)iterator.next();
            object = null;
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = f8.j();
                if (inputStream2 == null) {
                    object = inputStream2;
                } else {
                    inputStream = inputStream2;
                    object = inputStream2;
                    inputStream = inputStream2;
                    object = inputStream2;
                    File file2 = new File(file, f8.a());
                    inputStream = inputStream2;
                    object = inputStream2;
                    G.a(inputStream2, file2);
                    object = inputStream2;
                }
            }
            catch (Throwable throwable) {
                i.g(inputStream);
                throw throwable;
            }
            catch (IOException iOException) {}
            i.g((Closeable)object);
        }
        return;
    }
}

