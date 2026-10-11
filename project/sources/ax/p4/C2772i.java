package ax.p4;

import ax.w4.C3343c;
import java.io.Closeable;
import java.io.InputStream;

/* renamed from: ax.p4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2772i<R> implements Closeable, AutoCloseable {
    private final InputStream c0;
    private final String d0;
    private boolean e0 = false;
    private final R q;

    public C2772i(R r, InputStream inputStream, String str) {
        this.q = r;
        this.c0 = inputStream;
        this.d0 = str;
    }

    private void a() {
        if (this.e0) {
            throw new IllegalStateException("This downloader is already closed.");
        }
    }

    public InputStream b() {
        a();
        return this.c0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.e0) {
            return;
        }
        C3343c.b(this.c0);
        this.e0 = true;
    }
}
