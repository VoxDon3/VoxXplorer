package ax.qc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public class d extends c {
    private Inflater d0;
    private byte[] e0;
    private byte[] f0;
    private int g0;

    public d(AbstractC2901b<?> abstractC2901b, int i) {
        super(abstractC2901b);
        this.f0 = new byte[1];
        this.d0 = new Inflater(true);
        this.e0 = new byte[i];
    }

    private void d() throws IOException {
        byte[] bArr = this.e0;
        int read = super.read(bArr, 0, bArr.length);
        this.g0 = read;
        if (read == -1) {
            throw new EOFException("Unexpected end of input stream");
        }
        this.d0.setInput(this.e0, 0, read);
    }

    @Override // ax.qc.c
    public void a(InputStream inputStream, int i) throws IOException {
        Inflater inflater = this.d0;
        if (inflater != null) {
            inflater.end();
            this.d0 = null;
        }
        super.a(inputStream, i);
    }

    @Override // ax.qc.c
    public int c(PushbackInputStream pushbackInputStream) throws IOException {
        int remaining = this.d0.getRemaining();
        if (remaining > 0) {
            pushbackInputStream.unread(b(), this.g0 - remaining, remaining);
        }
        return remaining;
    }

    @Override // ax.qc.c, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Inflater inflater = this.d0;
        if (inflater != null) {
            inflater.end();
        }
        super.close();
    }

    @Override // ax.qc.c, java.io.InputStream
    public int read() throws IOException {
        if (read(this.f0) == -1) {
            return -1;
        }
        return this.f0[0];
    }

    @Override // ax.qc.c, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // ax.qc.c, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            try {
                int inflate = this.d0.inflate(bArr, i, i2);
                if (inflate != 0) {
                    return inflate;
                }
                if (!this.d0.finished() && !this.d0.needsDictionary()) {
                    if (this.d0.needsInput()) {
                        d();
                    }
                }
                return -1;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }
}
