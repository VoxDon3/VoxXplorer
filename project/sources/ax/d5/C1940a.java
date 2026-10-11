package ax.d5;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* renamed from: ax.d5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1940a extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    volatile boolean c0;
    boolean d0;
    Thread e0;
    Thread f0;
    protected byte[] g0;
    protected int h0;
    protected int i0;
    boolean q;

    public C1940a(C1941b c1941b) throws IOException {
        this(c1941b, 1024);
    }

    private void a() throws IOException {
        while (this.h0 == this.i0) {
            b();
            notifyAll();
            try {
                wait(1000L);
            } catch (InterruptedException unused) {
                j();
            }
        }
    }

    private void b() throws IOException {
        if (!this.d0) {
            throw new IOException("Pipe not connected");
        }
        if (this.q || this.c0) {
            throw new IOException("Pipe closed");
        }
        Thread thread = this.e0;
        if (thread != null && !thread.isAlive()) {
            throw new IOException("Read end dead");
        }
    }

    private void d(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Pipe Size <= 0");
        }
        this.g0 = new byte[i];
    }

    public static void j() throws InterruptedIOException {
        Thread.currentThread().interrupt();
        throw new InterruptedIOException();
    }

    @Override // java.io.InputStream
    public synchronized int available() throws IOException {
        int i = this.h0;
        if (i < 0) {
            return 0;
        }
        int i2 = this.i0;
        if (i == i2) {
            return this.g0.length;
        }
        if (i > i2) {
            return i - i2;
        }
        return (i + this.g0.length) - i2;
    }

    public void c(C1941b c1941b) throws IOException {
        c1941b.a(this);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c0 = true;
        synchronized (this) {
            this.h0 = -1;
        }
    }

    protected synchronized void e(int i) throws IOException {
        try {
            b();
            this.f0 = Thread.currentThread();
            if (this.h0 == this.i0) {
                a();
            }
            if (this.h0 < 0) {
                this.h0 = 0;
                this.i0 = 0;
            }
            byte[] bArr = this.g0;
            int i2 = this.h0;
            int i3 = i2 + 1;
            this.h0 = i3;
            bArr[i2] = (byte) (i & 255);
            if (i3 >= bArr.length) {
                this.h0 = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized void f(byte[] r5, int r6, int r7) throws java.io.IOException {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.b()     // Catch: java.lang.Throwable -> L16
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L16
            r4.f0 = r0     // Catch: java.lang.Throwable -> L16
        La:
            if (r7 <= 0) goto L4b
            int r0 = r4.h0     // Catch: java.lang.Throwable -> L16
            int r1 = r4.i0     // Catch: java.lang.Throwable -> L16
            if (r0 != r1) goto L18
            r4.a()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r5 = move-exception
            goto L4d
        L18:
            int r0 = r4.i0     // Catch: java.lang.Throwable -> L16
            int r1 = r4.h0     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r0 >= r1) goto L24
            byte[] r0 = r4.g0     // Catch: java.lang.Throwable -> L16
            int r0 = r0.length     // Catch: java.lang.Throwable -> L16
        L22:
            int r0 = r0 - r1
            goto L32
        L24:
            if (r1 >= r0) goto L31
            r3 = -1
            if (r1 != r3) goto L22
            r4.i0 = r2     // Catch: java.lang.Throwable -> L16
            r4.h0 = r2     // Catch: java.lang.Throwable -> L16
            byte[] r0 = r4.g0     // Catch: java.lang.Throwable -> L16
            int r0 = r0.length     // Catch: java.lang.Throwable -> L16
            goto L32
        L31:
            r0 = 0
        L32:
            if (r0 <= r7) goto L35
            r0 = r7
        L35:
            byte[] r1 = r4.g0     // Catch: java.lang.Throwable -> L16
            int r3 = r4.h0     // Catch: java.lang.Throwable -> L16
            java.lang.System.arraycopy(r5, r6, r1, r3, r0)     // Catch: java.lang.Throwable -> L16
            int r7 = r7 - r0
            int r6 = r6 + r0
            int r1 = r4.h0     // Catch: java.lang.Throwable -> L16
            int r1 = r1 + r0
            r4.h0 = r1     // Catch: java.lang.Throwable -> L16
            byte[] r0 = r4.g0     // Catch: java.lang.Throwable -> L16
            int r0 = r0.length     // Catch: java.lang.Throwable -> L16
            if (r1 < r0) goto La
            r4.h0 = r2     // Catch: java.lang.Throwable -> L16
            goto La
        L4b:
            monitor-exit(r4)
            return
        L4d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.d5.C1940a.f(byte[], int, int):void");
    }

    synchronized void g() {
        this.q = true;
        notifyAll();
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        try {
            if (!this.d0) {
                throw new IOException("Pipe not connected");
            }
            if (this.c0) {
                throw new IOException("Pipe closed");
            }
            Thread thread = this.f0;
            if (thread != null && !thread.isAlive() && !this.q && this.h0 < 0) {
                throw new IOException("Write end dead");
            }
            this.e0 = Thread.currentThread();
            int i = 2;
            while (true) {
                int i2 = this.h0;
                if (i2 >= 0) {
                    byte[] bArr = this.g0;
                    int i3 = this.i0;
                    int i4 = i3 + 1;
                    this.i0 = i4;
                    int i5 = bArr[i3] & 255;
                    if (i4 >= bArr.length) {
                        this.i0 = 0;
                    }
                    if (i2 == this.i0) {
                        this.h0 = -1;
                    }
                    return i5;
                }
                if (this.q) {
                    return -1;
                }
                Thread thread2 = this.f0;
                if (thread2 != null && !thread2.isAlive() && i - 1 < 0) {
                    throw new IOException("Pipe broken");
                }
                notifyAll();
                try {
                    wait(1000L);
                } catch (InterruptedException unused) {
                    j();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public C1940a(C1941b c1941b, int i) throws IOException {
        this.q = false;
        this.c0 = false;
        this.d0 = false;
        this.h0 = -1;
        this.i0 = 0;
        d(i);
        c(c1941b);
    }

    public C1940a() {
        this.q = false;
        this.c0 = false;
        this.d0 = false;
        this.h0 = -1;
        this.i0 = 0;
        d(1024);
    }

    public C1940a(int i) {
        this.q = false;
        this.c0 = false;
        this.d0 = false;
        this.h0 = -1;
        this.i0 = 0;
        d(i);
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int length;
        try {
            if (bArr != null) {
                if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                    throw new IndexOutOfBoundsException();
                }
                if (i2 == 0) {
                    return 0;
                }
                int read = read();
                if (read < 0) {
                    return -1;
                }
                bArr[i] = (byte) read;
                int i3 = 1;
                while (true) {
                    int i4 = this.h0;
                    if (i4 < 0 || i2 <= 1) {
                        break;
                    }
                    int i5 = this.i0;
                    if (i4 > i5) {
                        length = Math.min(this.g0.length - i5, i4 - i5);
                    } else {
                        length = this.g0.length - i5;
                    }
                    int i6 = i2 - 1;
                    if (length > i6) {
                        length = i6;
                    }
                    System.arraycopy(this.g0, this.i0, bArr, i + i3, length);
                    int i7 = this.i0 + length;
                    this.i0 = i7;
                    i3 += length;
                    i2 -= length;
                    if (i7 >= this.g0.length) {
                        this.i0 = 0;
                    }
                    if (this.h0 == this.i0) {
                        this.h0 = -1;
                    }
                }
                return i3;
            }
            throw new NullPointerException();
        } catch (Throwable th) {
            throw th;
        }
    }
}
