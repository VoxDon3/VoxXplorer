/*
 * Decompiled with CFR 0.152.
 */
package ax.w4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class c {
    public static final InputStream a = new j.InputStreamRetargetInterface(){

        @Override
        public int read() {
            return -1;
        }

        @Override
        public int read(byte[] byArray) {
            return -1;
        }

        @Override
        public int read(byte[] byArray, int n8, int n9) {
            return -1;
        }

        @Override
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
        }
    };
    public static final OutputStream b = new OutputStream(){

        @Override
        public void write(int n8) {
        }

        @Override
        public void write(byte[] byArray) {
        }

        @Override
        public void write(byte[] byArray, int n8, int n9) {
        }
    };

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(InputStream inputStream) {
        if (inputStream == null) return;
        try {
            inputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws e, g {
        c.d(inputStream, outputStream, 16384);
    }

    public static void d(InputStream inputStream, OutputStream outputStream, int n8) throws e, g {
        c.e(inputStream, outputStream, new byte[n8]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(InputStream inputStream, OutputStream outputStream, byte[] byArray) throws e, g {
        while (true) {
            int n8;
            try {
                n8 = inputStream.read(byArray);
                if (n8 == -1) {
                    return;
                }
            }
            catch (IOException iOException) {
                throw new e(iOException);
            }
            try {
                outputStream.write(byArray, 0, n8);
            }
            catch (IOException iOException) {
                throw new g(iOException);
            }
        }
    }

    public static InputStream f(InputStream inputStream, long l8) {
        return new c(inputStream, l8);
    }

    public static byte[] g(InputStream inputStream, int n8) throws IOException {
        return c.h(inputStream, n8, new byte[16384]);
    }

    public static byte[] h(InputStream object, int n8, byte[] byArray) throws IOException {
        if (n8 >= 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            c.e((InputStream)object, byteArrayOutputStream, byArray);
            return byteArrayOutputStream.toByteArray();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("'byteLimit' must be non-negative: ");
        ((StringBuilder)object).append(n8);
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    private static final class c
    extends FilterInputStream
    implements j.InputStreamRetargetInterface {
        private long q;

        public c(InputStream inputStream, long l8) {
            super(inputStream);
            if (inputStream != null) {
                if (l8 >= 0L) {
                    this.q = l8;
                    return;
                }
                throw new IllegalArgumentException("limit must be non-negative");
            }
            throw new NullPointerException("in");
        }

        @Override
        public int available() throws IOException {
            return (int)Math.min((long)this.in.available(), this.q);
        }

        @Override
        public boolean markSupported() {
            return false;
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
                IOException iOException = new IOException("mark not supported");
                throw iOException;
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

    public static interface d {
    }

    public static final class e
    extends f {
        public e(IOException iOException) {
            super(iOException);
        }
    }

    public static abstract class f
    extends IOException {
        public f(IOException iOException) {
            super(iOException);
        }

        public IOException a() {
            return (IOException)super.getCause();
        }

        @Override
        public String getMessage() {
            String string;
            String string2 = string = super.getCause().getMessage();
            if (string == null) {
                string2 = "";
            }
            return string2;
        }
    }

    public static final class g
    extends f {
        public g(IOException iOException) {
            super(iOException);
        }
    }
}

