/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.w4.c;
import java.io.Closeable;
import java.io.InputStream;

public class i<R>
implements Closeable,
AutoCloseable {
    private final InputStream c0;
    private final String d0;
    private boolean e0;
    private final R q;

    public i(R r8, InputStream inputStream, String string) {
        this.q = r8;
        this.c0 = inputStream;
        this.d0 = string;
        this.e0 = false;
    }

    private void a() {
        if (!this.e0) {
            return;
        }
        throw new IllegalStateException("This downloader is already closed.");
    }

    public InputStream b() {
        this.a();
        return this.c0;
    }

    @Override
    public void close() {
        if (!this.e0) {
            c.b(this.c0);
            this.e0 = true;
        }
    }
}

