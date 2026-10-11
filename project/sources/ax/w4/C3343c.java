package ax.w4;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;

/* renamed from: ax.w4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3343c {
    public static final InputStream a = new a();
    public static final OutputStream b = new b();

    /* renamed from: ax.w4.c$a */
    class a extends InputStream implements InputStreamRetargetInterface {
        a() {
        }

        @Override // java.io.InputStream
        public int read() {
            return -1;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return -1;
        }
    }

    /* renamed from: ax.w4.c$b */
    class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
        }
    }

    /* renamed from: ax.w4.c$d */
    public interface d {
    }

    /* renamed from: ax.w4.c$e */
    public static final class e extends f {
        public e(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: ax.w4.c$f */
    public static abstract class f extends IOException {
        public f(IOException iOException) {
            super(iOException);
        }

        @Override // java.lang.Throwable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IOException getCause() {
            return (IOException) super.getCause();
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getCause().getMessage();
            return message == null ? HttpUrl.FRAGMENT_ENCODE_SET : message;
        }
    }

    /* renamed from: ax.w4.c$g */
    public static final class g extends f {
        public g(IOException iOException) {
            super(iOException);
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws e, g {
        d(inputStream, outputStream, Http2.INITIAL_MAX_FRAME_SIZE);
    }

    public static void d(InputStream inputStream, OutputStream outputStream, int i) throws e, g {
        e(inputStream, outputStream, new byte[i]);
    }

    public static void e(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws e, g {
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                try {
                    outputStream.write(bArr, 0, read);
                } catch (IOException e2) {
                    throw new g(e2);
                }
            } catch (IOException e3) {
                throw new e(e3);
            }
        }
    }

    public static InputStream f(InputStream inputStream, long j) {
        return new C0484c(inputStream, j);
    }

    public static byte[] g(InputStream inputStream, int i) throws IOException {
        return h(inputStream, i, new byte[Http2.INITIAL_MAX_FRAME_SIZE]);
    }

    public static byte[] h(InputStream inputStream, int i, byte[] bArr) throws IOException {
        if (i >= 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e(inputStream, byteArrayOutputStream, bArr);
            return byteArrayOutputStream.toByteArray();
        }
        throw new RuntimeException("'byteLimit' must be non-negative: " + i);
    }

    /* renamed from: ax.w4.c$c, reason: collision with other inner class name */
    private static final class C0484c extends FilterInputStream implements InputStreamRetargetInterface {
        private long q;

        public C0484c(InputStream inputStream, long j) {
            super(inputStream);
            if (inputStream == null) {
                throw new NullPointerException("in");
            }
            if (j < 0) {
                throw new IllegalArgumentException("limit must be non-negative");
            }
            this.q = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.q);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.q == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.q--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            throw new IOException("mark not supported");
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.q));
            this.q -= skip;
            return skip;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.q;
            if (j == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
            if (read != -1) {
                this.q -= read;
            }
            return read;
        }
    }
}
