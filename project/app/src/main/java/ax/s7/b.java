/*
 * Decompiled with CFR 0.152.
 */
package ax.s7;

import ax.q7.n;
import ax.t7.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public final class b {
    private static final OutputStream a = new OutputStream(){

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override
        public void write(int n8) {
        }

        @Override
        public void write(byte[] byArray) {
            n.n(byArray);
        }

        @Override
        public void write(byte[] byArray, int n8, int n9) {
            n.n(byArray);
            n.s(n8, n9 + n8, byArray.length);
        }
    };

    private static byte[] a(Queue<byte[]> queue, int n8) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] byArray = queue.remove();
        if (byArray.length == n8) {
            return byArray;
        }
        int n9 = n8 - byArray.length;
        byArray = Arrays.copyOf(byArray, n8);
        while (n9 > 0) {
            byte[] byArray2 = queue.remove();
            int n10 = Math.min(n9, byArray2.length);
            System.arraycopy(byArray2, 0, byArray, n8 - n9, n10);
            n9 -= n10;
        }
        return byArray;
    }

    static byte[] b() {
        return new byte[8192];
    }

    public static long c(InputStream inputStream) throws IOException {
        long l8;
        byte[] byArray = b.b();
        long l9 = 0L;
        while ((l8 = (long)inputStream.read(byArray)) != -1L) {
            l9 += l8;
        }
        return l9;
    }

    public static int d(InputStream inputStream, byte[] byArray, int n8, int n9) throws IOException {
        n.n(inputStream);
        n.n(byArray);
        if (n9 >= 0) {
            int n10;
            int n11;
            n.s(n8, n8 + n9, byArray.length);
            for (n10 = 0; n10 < n9 && (n11 = inputStream.read(byArray, n8 + n10, n9 - n10)) != -1; n10 += n11) {
            }
            return n10;
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", n9));
    }

    public static void e(InputStream inputStream, byte[] byArray) throws IOException {
        b.f(inputStream, byArray, 0, byArray.length);
    }

    public static void f(InputStream object, byte[] byArray, int n8, int n9) throws IOException {
        if ((n8 = b.d((InputStream)object, byArray, n8, n9)) == n9) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("reached end of stream after reading ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" bytes; ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" bytes expected");
        throw new EOFException(((StringBuilder)object).toString());
    }

    public static byte[] g(InputStream inputStream) throws IOException {
        n.n(inputStream);
        return b.h(inputStream, new ArrayDeque<byte[]>(20), 0);
    }

    private static byte[] h(InputStream inputStream, Queue<byte[]> queue, int n8) throws IOException {
        int n9 = Math.min(8192, Math.max(128, Integer.highestOneBit(n8) * 2));
        int n10 = n8;
        n8 = n9;
        while (n10 < 0x7FFFFFF7) {
            int n11 = Math.min(n8, 0x7FFFFFF7 - n10);
            byte[] byArray = new byte[n11];
            queue.add(byArray);
            n9 = 0;
            while (n9 < n11) {
                int n12 = inputStream.read(byArray, n9, n11 - n9);
                if (n12 == -1) {
                    return b.a(queue, n10);
                }
                n9 += n12;
                n10 += n12;
            }
            n9 = n8 < 4096 ? 4 : 2;
            n8 = c.f(n8, n9);
        }
        if (inputStream.read() == -1) {
            return b.a(queue, 0x7FFFFFF7);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}

