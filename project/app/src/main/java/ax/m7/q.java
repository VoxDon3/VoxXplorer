/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.o;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class q
extends FilterOutputStream
implements AutoCloseable {
    private final o q;

    public q(OutputStream outputStream, Logger logger, Level level, int n8) {
        super(outputStream);
        this.q = new o(logger, level, n8);
    }

    public final o a() {
        return this.q;
    }

    @Override
    public void close() throws IOException {
        this.q.close();
        super.close();
    }

    @Override
    public void write(int n8) throws IOException {
        this.out.write(n8);
        this.q.write(n8);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.out.write(byArray, n8, n9);
        this.q.write(byArray, n8, n9);
    }
}

