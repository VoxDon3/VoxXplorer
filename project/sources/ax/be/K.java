package ax.be;

import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
class K extends s {
    private s c0;
    private final DataOutputStream d0;
    private final byte[] e0;
    private int f0 = 0;
    private boolean g0 = true;
    private boolean h0 = false;
    private IOException i0 = null;
    private final byte[] j0 = new byte[1];
    private final C1735c q;

    K(s sVar, C1735c c1735c) {
        sVar.getClass();
        this.c0 = sVar;
        this.d0 = new DataOutputStream(sVar);
        this.q = c1735c;
        this.e0 = c1735c.a(65536, false);
    }

    private void a() throws IOException {
        this.d0.writeByte(this.g0 ? 1 : 2);
        this.d0.writeShort(this.f0 - 1);
        this.d0.write(this.e0, 0, this.f0);
        this.f0 = 0;
        this.g0 = false;
    }

    private void b() throws IOException {
        IOException iOException = this.i0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.h0) {
            throw new P("Stream finished or closed");
        }
        try {
            if (this.f0 > 0) {
                a();
            }
            this.c0.write(0);
            this.h0 = true;
            this.q.d(this.e0);
        } catch (IOException e) {
            this.i0 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.c0 != null) {
            if (!this.h0) {
                try {
                    b();
                } catch (IOException unused) {
                }
            }
            try {
                this.c0.close();
            } catch (IOException e) {
                if (this.i0 == null) {
                    this.i0 = e;
                }
            }
            this.c0 = null;
        }
        IOException iOException = this.i0;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        IOException iOException = this.i0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.h0) {
            throw new P("Stream finished or closed");
        }
        try {
            if (this.f0 > 0) {
                a();
            }
            this.c0.flush();
        } catch (IOException e) {
            this.i0 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.j0;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.i0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.h0) {
            throw new P("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int min = Math.min(65536 - this.f0, i2);
                System.arraycopy(bArr, i, this.e0, this.f0, min);
                i2 -= min;
                int i4 = this.f0 + min;
                this.f0 = i4;
                if (i4 == 65536) {
                    a();
                }
            } catch (IOException e) {
                this.i0 = e;
                throw e;
            }
        }
    }
}
