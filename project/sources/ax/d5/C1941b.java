package ax.d5;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ax.d5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1941b extends OutputStream implements AutoCloseable {
    private C1940a q;

    public C1941b(C1940a c1940a) throws IOException {
        a(c1940a);
    }

    public synchronized void a(C1940a c1940a) throws IOException {
        if (c1940a == null) {
            throw new NullPointerException();
        }
        if (this.q != null || c1940a.d0) {
            throw new IOException("Already connected");
        }
        this.q = c1940a;
        c1940a.h0 = -1;
        c1940a.i0 = 0;
        c1940a.d0 = true;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C1940a c1940a = this.q;
        if (c1940a != null) {
            c1940a.g();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        C1940a c1940a = this.q;
        if (c1940a != null) {
            synchronized (c1940a) {
                this.q.notifyAll();
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        C1940a c1940a = this.q;
        if (c1940a == null) {
            throw new IOException("Pipe not connected");
        }
        c1940a.e(i);
    }

    public C1941b() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.q != null) {
            bArr.getClass();
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return;
            }
            this.q.f(bArr, i, i2);
            return;
        }
        throw new IOException("Pipe not connected");
    }
}
