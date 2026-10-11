package ax.be;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class Q extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private final int c0;
    private InputStream d0;
    private J e0;
    private final boolean f0;
    private boolean g0;
    private IOException h0;
    private final byte[] i0;
    private final C1735c q;

    public Q(InputStream inputStream, int i) throws IOException {
        this(inputStream, i, true);
    }

    private void b() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(this.d0);
        byte[] bArr = new byte[12];
        while (dataInputStream.read(bArr, 0, 1) != -1) {
            dataInputStream.readFully(bArr, 1, 3);
            if (bArr[0] != 0 || bArr[1] != 0 || bArr[2] != 0 || bArr[3] != 0) {
                dataInputStream.readFully(bArr, 4, 8);
                try {
                    this.e0 = new J(this.d0, this.c0, this.f0, bArr, this.q);
                    return;
                } catch (O unused) {
                    throw new C1741i("Garbage after a valid XZ Stream");
                }
            }
        }
        this.g0 = true;
    }

    public void a(boolean z) throws IOException {
        if (this.d0 != null) {
            J j = this.e0;
            if (j != null) {
                j.a(false);
                this.e0 = null;
            }
            if (z) {
                try {
                    this.d0.close();
                } finally {
                    this.d0 = null;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.d0 == null) {
            throw new P("Stream closed");
        }
        IOException iOException = this.h0;
        if (iOException != null) {
            throw iOException;
        }
        J j = this.e0;
        if (j == null) {
            return 0;
        }
        return j.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(true);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.i0, 0, 1) == -1) {
            return -1;
        }
        return this.i0[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public Q(InputStream inputStream, int i, boolean z) throws IOException {
        this(inputStream, i, z, C1735c.b());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.d0 == null) {
            throw new P("Stream closed");
        }
        IOException iOException = this.h0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.g0) {
            return -1;
        }
        while (true) {
            if (i2 <= 0) {
                break;
            }
            try {
                if (this.e0 == null) {
                    b();
                    if (this.g0) {
                        if (i4 == 0) {
                            return -1;
                        }
                    }
                }
                int read = this.e0.read(bArr, i, i2);
                if (read > 0) {
                    i4 += read;
                    i += read;
                    i2 -= read;
                } else if (read == -1) {
                    this.e0 = null;
                }
            } catch (IOException e) {
                this.h0 = e;
                if (i4 == 0) {
                    throw e;
                }
            }
        }
        return i4;
    }

    public Q(InputStream inputStream, int i, boolean z, C1735c c1735c) throws IOException {
        this.g0 = false;
        this.h0 = null;
        this.i0 = new byte[1];
        this.q = c1735c;
        this.d0 = inputStream;
        this.c0 = i;
        this.f0 = z;
        this.e0 = new J(inputStream, i, z, c1735c);
    }
}
