package ax.H3;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class e extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private final ax.F3.b c0;
    private long d0;
    private long e0;
    private final InputStream q;

    public e(InputStream inputStream, ax.F3.b bVar, long j) {
        this.q = inputStream;
        this.c0 = bVar;
        this.d0 = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.q.read();
        long j = this.e0 + 1;
        this.e0 = j;
        this.c0.a(j, this.d0);
        return read;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.q.read(bArr, i, i2);
        long j = this.e0 + read;
        this.e0 = j;
        this.c0.a(j, this.d0);
        return read;
    }
}
