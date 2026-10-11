/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.ws;

import ax.Gb.l;
import ax.xc.C;
import ax.xc.e;
import ax.xc.n;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;

public final class MessageInflater
implements Closeable,
AutoCloseable {
    private final e deflatedBytes;
    private final Inflater inflater;
    private final n inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean bl) {
        Inflater inflater;
        e e8;
        this.noContextTakeover = bl;
        this.deflatedBytes = e8 = new e();
        this.inflater = inflater = new Inflater(true);
        this.inflaterSource = new n((C)e8, inflater);
    }

    @Override
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(e e8) throws IOException {
        l.f(e8, "buffer");
        if (this.deflatedBytes.size() == 0L) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.M(e8);
            this.deflatedBytes.m1(65535);
            long l8 = this.inflater.getBytesRead();
            long l9 = this.deflatedBytes.size();
            do {
                this.inflaterSource.a(e8, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < l8 + l9);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}

