/*
 * Decompiled with CFR 0.152.
 */
package ax.qc;

import ax.qc.b;
import ax.qc.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class d
extends c {
    private Inflater d0;
    private byte[] e0;
    private byte[] f0 = new byte[1];
    private int g0;

    public d(b<?> b8, int n8) {
        super(b8);
        this.d0 = new Inflater(true);
        this.e0 = new byte[n8];
    }

    private void d() throws IOException {
        int n8;
        byte[] byArray = this.e0;
        this.g0 = n8 = super.read(byArray, 0, byArray.length);
        if (n8 != -1) {
            this.d0.setInput(this.e0, 0, n8);
            return;
        }
        throw new EOFException("Unexpected end of input stream");
    }

    @Override
    public void a(InputStream inputStream, int n8) throws IOException {
        Inflater inflater = this.d0;
        if (inflater != null) {
            inflater.end();
            this.d0 = null;
        }
        super.a(inputStream, n8);
    }

    @Override
    public int c(PushbackInputStream pushbackInputStream) throws IOException {
        int n8 = this.d0.getRemaining();
        if (n8 > 0) {
            pushbackInputStream.unread(this.b(), this.g0 - n8, n8);
        }
        return n8;
    }

    @Override
    public void close() throws IOException {
        Inflater inflater = this.d0;
        if (inflater != null) {
            inflater.end();
        }
        super.close();
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.f0) == -1) {
            return -1;
        }
        return this.f0[0];
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        try {
            int n10;
            while ((n10 = this.d0.inflate(byArray, n8, n9)) == 0) {
                if (this.d0.finished()) return -1;
                if (this.d0.needsDictionary()) {
                    return -1;
                }
                if (!this.d0.needsInput()) continue;
                this.d();
            }
            return n10;
        }
        catch (DataFormatException dataFormatException22) {
            throw new IOException(dataFormatException22);
        }
    }
}

