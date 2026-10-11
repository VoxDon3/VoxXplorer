package ax.Kc;

import j$.nio.file.LinkOption;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes3.dex */
public final class n {
    public static final LinkOption[] a = new LinkOption[0];
    private static final byte[] b = new byte[4096];

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long b(InputStream inputStream, long j, OutputStream outputStream) throws IOException {
        return c(inputStream, j, outputStream, 8024);
    }

    public static long c(InputStream inputStream, long j, OutputStream outputStream, int i) throws IOException {
        int read;
        if (i < 1) {
            throw new IllegalArgumentException("buffersize must be bigger than 0");
        }
        int min = (int) Math.min(i, j);
        byte[] bArr = new byte[min];
        long j2 = 0;
        while (j2 < j && -1 != (read = inputStream.read(bArr, 0, (int) Math.min(j - j2, min)))) {
            outputStream.write(bArr, 0, read);
            j2 += read;
        }
        return j2;
    }

    public static int d(InputStream inputStream, byte[] bArr) throws IOException {
        return e(inputStream, bArr, 0, bArr.length);
    }

    public static int e(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i2 < 0 || i < 0 || (i3 = i2 + i) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        while (i4 != i2) {
            int read = inputStream.read(bArr, i + i4, i2 - i4);
            if (read == -1) {
                break;
            }
            i4 += read;
        }
        return i4;
    }

    public static void f(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int i = 0;
        while (i < remaining) {
            int read = readableByteChannel.read(byteBuffer);
            if (read <= 0) {
                break;
            } else {
                i += read;
            }
        }
        if (i < remaining) {
            throw new EOFException();
        }
    }

    public static byte[] g(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b(inputStream, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] h(ReadableByteChannel readableByteChannel, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteBuffer allocate = ByteBuffer.allocate(Math.min(i, 8024));
        int i2 = 0;
        while (i2 < i) {
            int read = readableByteChannel.read(allocate);
            if (read <= 0) {
                break;
            }
            byteArrayOutputStream.write(allocate.array(), 0, read);
            allocate.rewind();
            i2 += read;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static long i(InputStream inputStream, long j) throws IOException {
        int e;
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip == 0) {
                break;
            }
            j2 -= skip;
        }
        while (j2 > 0 && (e = e(inputStream, b, 0, (int) Math.min(j2, 4096L))) >= 1) {
            j2 -= e;
        }
        return j - j2;
    }
}
