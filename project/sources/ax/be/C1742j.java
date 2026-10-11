package ax.be;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.be.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1742j extends C1740h {
    private long q;

    public C1742j(InputStream inputStream) {
        super(inputStream);
        this.q = 0L;
    }

    public long a() {
        return this.q;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            long j = this.q;
            if (j >= 0) {
                this.q = j + 1;
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read > 0) {
            long j = this.q;
            if (j >= 0) {
                this.q = j + read;
            }
        }
        return read;
    }
}
