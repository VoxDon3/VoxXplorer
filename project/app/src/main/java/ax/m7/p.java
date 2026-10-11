/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.o;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class p
extends FilterInputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final o q;

    public p(InputStream inputStream, Logger logger, Level level, int n8) {
        super(inputStream);
        this.q = new o(logger, level, n8);
    }

    @Override
    public void close() throws IOException {
        this.q.close();
        super.close();
    }

    @Override
    public int read() throws IOException {
        int n8 = super.read();
        this.q.write(n8);
        return n8;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if ((n9 = super.read(byArray, n8, n9)) > 0) {
            this.q.write(byArray, n8, n9);
        }
        return n9;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

