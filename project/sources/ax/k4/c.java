package ax.k4;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Queue;

/* loaded from: classes.dex */
public class c extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private static final Queue<c> d0 = i.e(0);
    private IOException c0;
    private InputStream q;

    c() {
    }

    public static c b(InputStream inputStream) {
        c poll;
        Queue<c> queue = d0;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new c();
        }
        poll.d(inputStream);
        return poll;
    }

    public IOException a() {
        return this.c0;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.q.available();
    }

    public void c() {
        this.c0 = null;
        this.q = null;
        Queue<c> queue = d0;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    void d(InputStream inputStream) {
        this.q = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.q.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.q.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.q.read(bArr);
        } catch (IOException e) {
            this.c0 = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.q.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.q.skip(j);
        } catch (IOException e) {
            this.c0 = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.q.read(bArr, i, i2);
        } catch (IOException e) {
            this.c0 = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.q.read();
        } catch (IOException e) {
            this.c0 = e;
            return -1;
        }
    }
}
