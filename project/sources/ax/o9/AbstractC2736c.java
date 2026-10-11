package ax.o9;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: ax.o9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2736c implements Closeable, AutoCloseable {
    protected int c0 = 65536;
    private int d0;
    protected long q;

    public abstract int a();

    protected abstract int b(byte[] bArr) throws IOException;

    public int c() {
        return this.d0;
    }

    public long d() {
        return this.q;
    }

    public abstract boolean e();

    public abstract void f(int i);

    public void g(ax.Z8.a<?> aVar) {
        this.d0 = 0;
        byte[] bArr = new byte[this.c0];
        try {
            int b = b(bArr);
            aVar.p(bArr, 0, b);
            this.q += b;
            this.d0 += b;
        } catch (IOException e) {
            throw new ax.k9.d(e);
        }
    }

    public void j(ax.Z8.a<?> aVar, int i) {
        this.d0 = 0;
        byte[] bArr = new byte[this.c0];
        for (int i2 = 0; i2 < i; i2++) {
            try {
                int b = b(bArr);
                aVar.p(bArr, 0, b);
                this.q += b;
                this.d0 += b;
            } catch (IOException e) {
                throw new ax.k9.d(e);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
