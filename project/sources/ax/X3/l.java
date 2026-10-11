package ax.X3;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class l extends FilterInputStream implements InputStreamRetargetInterface, AutoCloseable {
    private int c0;
    private int d0;
    private int e0;
    private int f0;
    private final ax.Q3.b g0;
    private volatile byte[] q;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public l(InputStream inputStream, ax.Q3.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.e0;
        if (i != -1) {
            int i2 = this.f0 - i;
            int i3 = this.d0;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.c0 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.g0.d(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.q = bArr2;
                    this.g0.c(bArr, byte[].class);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f0 - this.e0;
                this.f0 = i4;
                this.e0 = 0;
                this.c0 = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.f0;
                if (read > 0) {
                    i5 += read;
                }
                this.c0 = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.e0 = -1;
            this.f0 = 0;
            this.c0 = read2;
        }
        return read2;
    }

    private static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.q == null || inputStream == null) {
            throw d();
        }
        return (this.c0 - this.f0) + inputStream.available();
    }

    public synchronized void b() {
        this.d0 = this.q.length;
    }

    public synchronized void c() {
        if (this.q != null) {
            this.g0.c(this.q, byte[].class);
            this.q = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.q != null) {
            this.g0.c(this.q, byte[].class);
            this.q = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.d0 = Math.max(this.d0, i);
        this.e0 = this.f0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.q;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.f0 >= this.c0 && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.q && (bArr = this.q) == null) {
            throw d();
        }
        int i = this.c0;
        int i2 = this.f0;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f0 = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.q == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.e0;
        if (-1 == i) {
            throw new a("Mark has been invalidated, pos: " + this.f0 + " markLimit: " + this.d0);
        }
        this.f0 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        byte[] bArr = this.q;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null) {
            throw d();
        }
        if (j < 1) {
            return 0L;
        }
        if (inputStream == null) {
            throw d();
        }
        int i = this.c0;
        int i2 = this.f0;
        if (i - i2 >= j) {
            this.f0 = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.f0 = i;
        if (this.e0 == -1 || j > this.d0) {
            return j2 + inputStream.skip(j - j2);
        }
        if (a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.c0;
        int i4 = this.f0;
        long j3 = j - j2;
        if (i3 - i4 >= j3) {
            this.f0 = (int) (i4 + j3);
            return j;
        }
        long j4 = (j2 + i3) - i4;
        this.f0 = i3;
        return j4;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    l(InputStream inputStream, ax.Q3.b bVar, int i) {
        super(inputStream);
        this.e0 = -1;
        this.g0 = bVar;
        this.q = (byte[]) bVar.d(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.q;
        if (bArr2 == null) {
            throw d();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f0;
            int i6 = this.c0;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f0 += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.e0 == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.q && (bArr2 = this.q) == null) {
                        throw d();
                    }
                    int i8 = this.c0;
                    int i9 = this.f0;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f0 += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw d();
        }
    }
}
