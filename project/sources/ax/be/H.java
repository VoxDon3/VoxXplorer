package ax.be;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
class H extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private final ax.je.f c0;
    private final byte[] d0 = new byte[4096];
    private int e0 = 0;
    private int f0 = 0;
    private int g0 = 0;
    private boolean h0 = false;
    private IOException i0 = null;
    private final byte[] j0 = new byte[1];
    private InputStream q;

    H(InputStream inputStream, ax.je.f fVar) {
        inputStream.getClass();
        this.q = inputStream;
        this.c0 = fVar;
    }

    static int a() {
        return 5;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.q == null) {
            throw new P("Stream closed");
        }
        IOException iOException = this.i0;
        if (iOException == null) {
            return this.f0;
        }
        throw iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.q;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.q = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.j0, 0, 1) == -1) {
            return -1;
        }
        return this.j0[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.q == null) {
            throw new P("Stream closed");
        }
        IOException iOException = this.i0;
        if (iOException != null) {
            throw iOException;
        }
        int i4 = 0;
        while (true) {
            try {
                int min = Math.min(this.f0, i2);
                System.arraycopy(this.d0, this.e0, bArr, i, min);
                int i5 = this.e0 + min;
                this.e0 = i5;
                int i6 = this.f0 - min;
                this.f0 = i6;
                i += min;
                i2 -= min;
                i4 += min;
                int i7 = this.g0;
                if (i5 + i6 + i7 == 4096) {
                    byte[] bArr2 = this.d0;
                    System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                    this.e0 = 0;
                }
                if (i2 == 0 || this.h0) {
                    break;
                }
                int i8 = this.e0;
                int i9 = this.f0;
                int i10 = this.g0;
                int read = this.q.read(this.d0, i8 + i9 + i10, 4096 - ((i8 + i9) + i10));
                if (read == -1) {
                    this.h0 = true;
                    this.f0 = this.g0;
                    this.g0 = 0;
                } else {
                    int i11 = this.g0 + read;
                    this.g0 = i11;
                    int a = this.c0.a(this.d0, this.e0, i11);
                    this.f0 = a;
                    this.g0 -= a;
                }
            } catch (IOException e) {
                this.i0 = e;
                throw e;
            }
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }
}
