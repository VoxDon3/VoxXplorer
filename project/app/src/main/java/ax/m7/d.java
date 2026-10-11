/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.v;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
public final class d {
    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        v.d(inputStream);
        v.d(outputStream);
        byte[] byArray = new byte[4096];
        long l8 = 0L;
        int n8;
        while ((n8 = inputStream.read(byArray)) != -1) {
            outputStream.write(byArray, 0, n8);
            l8 += (long)n8;
        }
        return l8;
    }

    public static InputStream b(InputStream inputStream, long l8) {
        return new a(inputStream, l8);
    }

    public static int c(InputStream inputStream, byte[] byArray, int n8, int n9) throws IOException {
        v.d(inputStream);
        v.d(byArray);
        if (n9 >= 0) {
            int n10;
            int n11;
            for (n10 = 0; n10 < n9 && (n11 = inputStream.read(byArray, n8 + n10, n9 - n10)) != -1; n10 += n11) {
            }
            return n10;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    private static final class a
    extends FilterInputStream
    implements j.InputStreamRetargetInterface {
        private long c0 = -1L;
        private long q;

        a(InputStream inputStream, long l8) {
            super(inputStream);
            v.d(inputStream);
            boolean bl = l8 >= 0L;
            v.b(bl, "limit must be non-negative");
            this.q = l8;
        }

        @Override
        public int available() throws IOException {
            return (int)Math.min((long)this.in.available(), this.q);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void mark(int n8) {
            synchronized (this) {
                this.in.mark(n8);
                this.c0 = this.q;
                return;
            }
        }

        @Override
        public int read() throws IOException {
            if (this.q == 0L) {
                return -1;
            }
            int n8 = this.in.read();
            if (n8 != -1) {
                --this.q;
            }
            return n8;
        }

        @Override
        public int read(byte[] byArray, int n8, int n9) throws IOException {
            long l8 = this.q;
            if (l8 == 0L) {
                return -1;
            }
            if ((n8 = this.in.read(byArray, n8, n9 = (int)Math.min((long)n9, l8))) != -1) {
                this.q -= (long)n8;
            }
            return n8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void reset() throws IOException {
            synchronized (this) {
                Throwable throwable2;
                block5: {
                    try {
                        if (!this.in.markSupported()) {
                            IOException iOException = new IOException("Mark not supported");
                            throw iOException;
                        }
                        if (this.c0 != -1L) {
                            this.in.reset();
                            this.q = this.c0;
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    IOException iOException = new IOException("Mark not set");
                    throw iOException;
                }
                throw throwable2;
            }
        }

        @Override
        public long skip(long l8) throws IOException {
            l8 = Math.min(l8, this.q);
            l8 = this.in.skip(l8);
            this.q -= l8;
            return l8;
        }

        @Override
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
        }
    }
}

