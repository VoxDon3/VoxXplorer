/*
 * Decompiled with CFR 0.152.
 */
package ax.Ma;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class a
extends FilterInputStream
implements j.InputStreamRetargetInterface {
    private Long q = 0L;

    public a(InputStream inputStream) {
        super(inputStream);
    }

    public Long a() {
        return this.q;
    }

    @Override
    public int read() throws IOException {
        int n8 = this.in.read();
        long l8 = this.q;
        long l9 = n8 == -1 ? 0L : 1L;
        this.q = l8 + l9;
        return n8;
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        long l8;
        long l9;
        int n8;
        try {
            n8 = this.in.read(byArray);
            l9 = this.q;
            l8 = n8 == -1 ? 0L : (long)n8;
        }
        catch (EOFException eOFException) {
            return -1;
        }
        this.q = l9 + l8;
        return n8;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        n8 = this.in.read(byArray, n8, n9);
        long l8 = this.q;
        long l9 = n8 == -1 ? 0L : (long)n8;
        this.q = l8 + l9;
        return n8;
    }

    @Override
    public long skip(long l8) throws IOException {
        l8 = this.in.skip(l8);
        this.q = this.q + l8;
        return l8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

