package ax.K3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class b implements Closeable, AutoCloseable {
    private final Charset c0;
    private byte[] d0;
    private int e0;
    private int f0;
    private final InputStream q;

    class a extends ByteArrayOutputStream {
        a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, b.this.c0.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.q;
        byte[] bArr = this.d0;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.e0 = 0;
        this.f0 = read;
    }

    public boolean c() {
        return this.f0 == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.q) {
            try {
                if (this.d0 != null) {
                    this.d0 = null;
                    this.q.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.q) {
            try {
                if (this.d0 == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.e0 >= this.f0) {
                    b();
                }
                for (int i3 = this.e0; i3 != this.f0; i3++) {
                    byte[] bArr2 = this.d0;
                    if (bArr2[i3] == 10) {
                        int i4 = this.e0;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.c0.name());
                                this.e0 = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.c0.name());
                        this.e0 = i3 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f0 - this.e0) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.d0;
                    int i5 = this.e0;
                    aVar.write(bArr3, i5, this.f0 - i5);
                    this.f0 = -1;
                    b();
                    i = this.e0;
                    while (i != this.f0) {
                        bArr = this.d0;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.e0;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.e0 = i + 1;
                return aVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.q = inputStream;
        this.c0 = charset;
        this.d0 = new byte[i];
    }
}
