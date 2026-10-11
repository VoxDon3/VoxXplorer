package ax.s9;

import ax.s9.m;
import java.io.Closeable;

/* loaded from: classes3.dex */
public class g<S extends m> implements Closeable, AutoCloseable {
    protected S c0;
    protected ax.Q8.i d0;
    protected ax.k9.e e0;
    protected final ax.Xd.d q = ax.Xd.f.k(getClass());
    private h f0 = new h();

    g(ax.Q8.i iVar, ax.k9.e eVar, S s) {
        this.d0 = iVar;
        this.e0 = eVar;
        this.c0 = s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c0.a(this.d0);
    }

    public void e() {
        try {
            close();
        } catch (Exception e) {
            this.q.k("{} close failed for {},{},{}", getClass().getSimpleName(), this.e0, this.c0, this.d0, e);
        }
    }
}
