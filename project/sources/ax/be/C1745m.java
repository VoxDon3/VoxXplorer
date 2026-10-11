package ax.be;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.be.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1745m extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private final ax.ee.b c0;
    private IOException d0 = null;
    private final byte[] e0 = new byte[1];
    private InputStream q;

    public C1745m(InputStream inputStream, int i) {
        inputStream.getClass();
        this.q = inputStream;
        this.c0 = new ax.ee.b(i);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.q;
        if (inputStream == null) {
            throw new P("Stream closed");
        }
        IOException iOException = this.d0;
        if (iOException == null) {
            return inputStream.available();
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
        if (read(this.e0, 0, 1) == -1) {
            return -1;
        }
        return this.e0[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.q;
        if (inputStream == null) {
            throw new P("Stream closed");
        }
        IOException iOException = this.d0;
        if (iOException != null) {
            throw iOException;
        }
        try {
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.c0.a(bArr, i, read);
            return read;
        } catch (IOException e) {
            this.d0 = e;
            throw e;
        }
    }
}
