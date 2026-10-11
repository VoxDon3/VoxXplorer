package ax.be;

import java.io.IOException;

/* renamed from: ax.be.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1747o extends s {
    private final ax.ee.c c0;
    private final byte[] d0 = new byte[4096];
    private boolean e0 = false;
    private IOException f0 = null;
    private final byte[] g0 = new byte[1];
    private s q;

    C1747o(s sVar, C1746n c1746n) {
        this.q = sVar;
        this.c0 = new ax.ee.c(c1746n.h());
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        s sVar = this.q;
        if (sVar != null) {
            try {
                sVar.close();
            } catch (IOException e) {
                if (this.f0 == null) {
                    this.f0 = e;
                }
            }
            this.q = null;
        }
        IOException iOException = this.f0;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        IOException iOException = this.f0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.e0) {
            throw new P("Stream finished or closed");
        }
        try {
            this.q.flush();
        } catch (IOException e) {
            this.f0 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.g0;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.e0) {
            throw new P("Stream finished");
        }
        while (i2 > 4096) {
            try {
                this.c0.a(bArr, i, 4096, this.d0);
                this.q.write(this.d0);
                i += 4096;
                i2 -= 4096;
            } catch (IOException e) {
                this.f0 = e;
                throw e;
            }
        }
        this.c0.a(bArr, i, i2, this.d0);
        this.q.write(this.d0, 0, i2);
    }
}
