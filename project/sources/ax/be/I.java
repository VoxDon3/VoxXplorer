package ax.be;

import java.io.IOException;

/* loaded from: classes3.dex */
class I extends s {
    private final ax.je.f c0;
    private final byte[] d0 = new byte[4096];
    private int e0 = 0;
    private int f0 = 0;
    private IOException g0 = null;
    private boolean h0 = false;
    private final byte[] i0 = new byte[1];
    private s q;

    I(s sVar, ax.je.f fVar) {
        sVar.getClass();
        this.q = sVar;
        this.c0 = fVar;
    }

    private void a() throws IOException {
        IOException iOException = this.g0;
        if (iOException != null) {
            throw iOException;
        }
        try {
            this.q.write(this.d0, this.e0, this.f0);
            this.h0 = true;
        } catch (IOException e) {
            this.g0 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.q != null) {
            if (!this.h0) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
            try {
                this.q.close();
            } catch (IOException e) {
                if (this.g0 == null) {
                    this.g0 = e;
                }
            }
            this.q = null;
        }
        IOException iOException = this.g0;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw new L("Flushing is not supported");
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.i0;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.g0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.h0) {
            throw new P("Stream finished or closed");
        }
        while (i2 > 0) {
            int min = Math.min(i2, 4096 - (this.e0 + this.f0));
            System.arraycopy(bArr, i, this.d0, this.e0 + this.f0, min);
            i += min;
            i2 -= min;
            int i4 = this.f0 + min;
            this.f0 = i4;
            int a = this.c0.a(this.d0, this.e0, i4);
            this.f0 -= a;
            try {
                this.q.write(this.d0, this.e0, a);
                int i5 = this.e0 + a;
                this.e0 = i5;
                int i6 = this.f0;
                if (i5 + i6 == 4096) {
                    byte[] bArr2 = this.d0;
                    System.arraycopy(bArr2, i5, bArr2, 0, i6);
                    this.e0 = 0;
                }
            } catch (IOException e) {
                this.g0 = e;
                throw e;
            }
        }
    }
}
