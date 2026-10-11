package ax.Jc;

import ax.Kc.j;
import ax.Kc.n;
import ax.Kc.o;
import ax.be.D;
import ax.be.J;
import ax.be.N;
import ax.be.Q;
import ax.zc.C3566a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class a extends ax.Ec.a implements o {
    private final j c0;
    private final InputStream d0;

    public a(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public static boolean d(byte[] bArr, int i) {
        if (i < N.a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = N.a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    @Override // ax.Kc.o
    public long a() {
        return this.c0.c();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.d0.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d0.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.d0.read();
            int i = -1;
            if (read != -1) {
                i = 1;
            }
            b(i);
            return read;
        } catch (D e) {
            throw new C3566a(e.b(), e.a(), e);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return n.i(this.d0, j);
        } catch (D e) {
            throw new C3566a(e.b(), e.a(), e);
        }
    }

    public a(InputStream inputStream, boolean z) throws IOException {
        this(inputStream, z, -1);
    }

    public a(InputStream inputStream, boolean z, int i) throws IOException {
        j jVar = new j(inputStream);
        this.c0 = jVar;
        if (z) {
            this.d0 = new Q(jVar, i);
        } else {
            this.d0 = new J(jVar, i);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            int read = this.d0.read(bArr, i, i2);
            b(read);
            return read;
        } catch (D e) {
            throw new C3566a(e.b(), e.a(), e);
        }
    }
}
