/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.P;
import ax.ee.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class m
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final b c0;
    private IOException d0 = null;
    private final byte[] e0 = new byte[1];
    private InputStream q;

    public m(InputStream inputStream, int n8) {
        inputStream.getClass();
        this.q = inputStream;
        this.c0 = new b(n8);
    }

    @Override
    public int available() throws IOException {
        InputStream inputStream = this.q;
        if (inputStream != null) {
            IOException iOException = this.d0;
            if (iOException == null) {
                return inputStream.available();
            }
            throw iOException;
        }
        throw new P("Stream closed");
    }

    @Override
    public void close() throws IOException {
        InputStream inputStream = this.q;
        if (inputStream != null) {
            try {
                inputStream.close();
                return;
            }
            finally {
                this.q = null;
            }
        }
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.e0, 0, 1) == -1) {
            return -1;
        }
        return this.e0[0] & 0xFF;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 == 0) {
            return 0;
        }
        InputStream inputStream = this.q;
        if (inputStream != null) {
            IOException iOException = this.d0;
            if (iOException == null) {
                try {
                    n9 = inputStream.read(byArray, n8, n9);
                    if (n9 == -1) {
                        return -1;
                    }
                    this.c0.a(byArray, n8, n9);
                    return n9;
                }
                catch (IOException iOException2) {
                    this.d0 = iOException2;
                    throw iOException2;
                }
            }
            throw iOException;
        }
        throw new P("Stream closed");
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

