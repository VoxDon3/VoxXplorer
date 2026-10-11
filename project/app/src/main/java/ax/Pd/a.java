/*
 * Decompiled with CFR 0.152.
 */
package ax.Pd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class a {
    private static int a = 4096;

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        ax.Pd.a.b(inputStream, outputStream, a);
    }

    public static void b(InputStream inputStream, OutputStream outputStream, int n8) throws IOException {
        int n9;
        byte[] byArray = new byte[n8];
        while ((n9 = inputStream.read(byArray, 0, n8)) >= 0) {
            outputStream.write(byArray, 0, n9);
        }
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ax.Pd.a.a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int d(InputStream inputStream, byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        int n11;
        for (n10 = 0; n10 < n9 && (n11 = inputStream.read(byArray, n8 + n10, n9 - n10)) >= 0; n10 += n11) {
        }
        return n10;
    }
}

