package okhttp3.internal.ws;

import ax.Gb.l;
import ax.xc.C;
import ax.xc.C3487e;
import ax.xc.n;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public final class MessageInflater implements Closeable, AutoCloseable {
    private final C3487e deflatedBytes;
    private final Inflater inflater;
    private final n inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        C3487e c3487e = new C3487e();
        this.deflatedBytes = c3487e;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new n((C) c3487e, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(C3487e c3487e) throws IOException {
        l.f(c3487e, "buffer");
        if (this.deflatedBytes.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.M(c3487e);
        this.deflatedBytes.writeInt(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.size();
        do {
            this.inflaterSource.a(c3487e, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead);
    }
}
