package okhttp3.internal.ws;

import ax.Db.a;
import ax.Gb.l;
import ax.xc.C3487e;
import ax.xc.InterfaceC3482A;
import ax.xc.h;
import ax.xc.i;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes3.dex */
public final class MessageDeflater implements Closeable, AutoCloseable {
    private final C3487e deflatedBytes;
    private final Deflater deflater;
    private final i deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C3487e c3487e = new C3487e();
        this.deflatedBytes = c3487e;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new i((InterfaceC3482A) c3487e, deflater);
    }

    private final boolean endsWith(C3487e c3487e, h hVar) {
        return c3487e.x0(c3487e.size() - hVar.G(), hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(C3487e c3487e) throws IOException {
        h hVar;
        l.f(c3487e, "buffer");
        if (this.deflatedBytes.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(c3487e, c3487e.size());
        this.deflaterSink.flush();
        C3487e c3487e2 = this.deflatedBytes;
        hVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
        if (endsWith(c3487e2, hVar)) {
            long size = this.deflatedBytes.size() - 4;
            C3487e.a L0 = C3487e.L0(this.deflatedBytes, null, 1, null);
            try {
                L0.c(size);
                a.a(L0, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        C3487e c3487e3 = this.deflatedBytes;
        c3487e.write(c3487e3, c3487e3.size());
    }
}
