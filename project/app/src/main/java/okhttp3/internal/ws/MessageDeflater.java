/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.ws;

import ax.Db.a;
import ax.Gb.l;
import ax.xc.A;
import ax.xc.e;
import ax.xc.h;
import ax.xc.i;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import okhttp3.internal.ws.MessageDeflaterKt;

public final class MessageDeflater
implements Closeable,
AutoCloseable {
    private final e deflatedBytes;
    private final Deflater deflater;
    private final i deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean bl) {
        Deflater deflater;
        e e8;
        this.noContextTakeover = bl;
        this.deflatedBytes = e8 = new e();
        this.deflater = deflater = new Deflater(-1, true);
        this.deflaterSink = new i((A)e8, deflater);
    }

    private final boolean endsWith(e e8, h h8) {
        return e8.x0(e8.size() - (long)h8.G(), h8);
    }

    @Override
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(e e8) throws IOException {
        block5: {
            Closeable closeable;
            block7: {
                block6: {
                    l.f(e8, "buffer");
                    if (this.deflatedBytes.size() != 0L) break block5;
                    if (this.noContextTakeover) {
                        this.deflater.reset();
                    }
                    this.deflaterSink.write(e8, e8.size());
                    this.deflaterSink.flush();
                    if (!this.endsWith(this.deflatedBytes, MessageDeflaterKt.access$getEMPTY_DEFLATE_BLOCK$p())) break block6;
                    long l8 = this.deflatedBytes.size();
                    long l9 = 4;
                    closeable = e.L0(this.deflatedBytes, null, 1, null);
                    try {
                        ((e.a)closeable).c(l8 - l9);
                    }
                    catch (Throwable throwable) {
                        try {
                            throw throwable;
                        }
                        catch (Throwable throwable2) {
                            a.a(closeable, throwable);
                            throw throwable2;
                        }
                    }
                    a.a(closeable, null);
                    break block7;
                }
                this.deflatedBytes.j1(0);
            }
            closeable = this.deflatedBytes;
            e8.write((e)closeable, ((e)closeable).size());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}

