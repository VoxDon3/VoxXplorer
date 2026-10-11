/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class n {
    public static final j.LinkOption[] a = new j.LinkOption[0];
    private static final byte[] b = new byte[4096];

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
        catch (IOException iOException) {
            return;
        }
    }

    public static long b(InputStream inputStream, long l8, OutputStream outputStream) throws IOException {
        return n.c(inputStream, l8, outputStream, 8024);
    }

    public static long c(InputStream inputStream, long l8, OutputStream outputStream, int n8) throws IOException {
        if (n8 >= 1) {
            long l9;
            int n9 = (int)Math.min((long)n8, l8);
            byte[] byArray = new byte[n9];
            for (l9 = 0L; l9 < l8 && -1 != (n8 = inputStream.read(byArray, 0, (int)Math.min(l8 - l9, (long)n9))); l9 += (long)n8) {
                outputStream.write(byArray, 0, n8);
            }
            return l9;
        }
        throw new IllegalArgumentException("buffersize must be bigger than 0");
    }

    public static int d(InputStream inputStream, byte[] byArray) throws IOException {
        return n.e(inputStream, byArray, 0, byArray.length);
    }

    public static int e(InputStream inputStream, byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        if (n9 >= 0 && n8 >= 0 && (n10 = n9 + n8) <= byArray.length && n10 >= 0) {
            int n11;
            for (n10 = 0; n10 != n9 && (n11 = inputStream.read(byArray, n8 + n10, n9 - n10)) != -1; n10 += n11) {
            }
            return n10;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void f(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int n8;
        int n9;
        int n10 = byteBuffer.remaining();
        for (n8 = 0; n8 < n10 && (n9 = readableByteChannel.read(byteBuffer)) > 0; n8 += n9) {
        }
        if (n8 >= n10) {
            return;
        }
        throw new EOFException();
    }

    public static byte[] g(InputStream inputStream, int n8) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        n.b(inputStream, n8, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] h(ReadableByteChannel readableByteChannel, int n8) throws IOException {
        int n9;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteBuffer byteBuffer = ByteBuffer.allocate(Math.min(n8, 8024));
        for (int i8 = 0; i8 < n8 && (n9 = readableByteChannel.read(byteBuffer)) > 0; i8 += n9) {
            byteArrayOutputStream.write(byteBuffer.array(), 0, n9);
            byteBuffer.rewind();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static long i(InputStream inputStream, long l8) throws IOException {
        int n8;
        long l9;
        long l10 = l8;
        while (true) {
            l9 = l10;
            if (l10 <= 0L) break;
            l9 = inputStream.skip(l10);
            if (l9 == 0L) {
                l9 = l10;
                break;
            }
            l10 -= l9;
        }
        while (l9 > 0L && (n8 = n.e(inputStream, b, 0, (int)Math.min(l9, 4096L))) >= 1) {
            l9 -= (long)n8;
        }
        return l8 - l9;
    }
}

