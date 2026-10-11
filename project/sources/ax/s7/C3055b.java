package ax.s7;

import ax.q7.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: ax.s7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3055b {
    private static final OutputStream a = new a();

    /* renamed from: ax.s7.b$a */
    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            n.n(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            n.n(bArr);
            n.s(i, i2 + i, bArr.length);
        }
    }

    private static byte[] a(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    static byte[] b() {
        return new byte[8192];
    }

    public static long c(InputStream inputStream) throws IOException {
        byte[] b = b();
        long j = 0;
        while (true) {
            long read = inputStream.read(b);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public static int d(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        n.n(inputStream);
        n.n(bArr);
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i2)));
        }
        n.s(i, i + i2, bArr.length);
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static void e(InputStream inputStream, byte[] bArr) throws IOException {
        f(inputStream, bArr, 0, bArr.length);
    }

    public static void f(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int d = d(inputStream, bArr, i, i2);
        if (d == i2) {
            return;
        }
        throw new EOFException("reached end of stream after reading " + d + " bytes; " + i2 + " bytes expected");
    }

    public static byte[] g(InputStream inputStream) throws IOException {
        n.n(inputStream);
        return h(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] h(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return a(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = ax.t7.c.f(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
