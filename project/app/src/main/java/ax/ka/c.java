/*
 * Decompiled with CFR 0.152.
 */
package ax.ka;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class c {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean b(InputStream inputStream, OutputStream outputStream, a a8, int n8) throws IOException {
        int n9;
        int n10;
        int n11 = n10 = inputStream.available();
        if (n10 <= 0) {
            n11 = 512000;
        }
        byte[] byArray = new byte[n8];
        if (c.d(a8, 0, n11)) {
            return false;
        }
        n10 = 0;
        while ((n9 = inputStream.read(byArray, 0, n8)) != -1) {
            outputStream.write(byArray, 0, n9);
            n10 = n9 = n10 + n9;
            if (!c.d(a8, n9, n11)) continue;
            return false;
        }
        outputStream.flush();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(InputStream inputStream) {
        byte[] byArray = new byte[32768];
        try {
            int n8;
            while ((n8 = inputStream.read(byArray, 0, 32768)) != -1) {
            }
            return;
        }
        catch (IOException iOException) {
            return;
        }
        finally {
            c.a(inputStream);
        }
    }

    private static boolean d(a a8, int n8, int n9) {
        return a8 != null && !a8.a(n8, n9) && n8 * 100 / n9 < 75;
    }

    public static interface a {
        public boolean a(int var1, int var2);
    }
}

