/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

import ax.Q8.i;
import ax.Xd.d;
import ax.Xd.f;
import ax.k9.e;
import ax.s9.h;
import ax.s9.m;
import java.io.Closeable;

public class g<S extends m>
implements Closeable,
AutoCloseable {
    protected S c0;
    protected i d0;
    protected e e0;
    private h f0;
    protected final d q = f.k(this.getClass());

    g(i i8, e e8, S s8) {
        this.f0 = new h();
        this.d0 = i8;
        this.e0 = e8;
        this.c0 = s8;
    }

    @Override
    public void close() {
        ((m)this.c0).a(this.d0);
    }

    public void e() {
        try {
            this.close();
            return;
        }
        catch (Exception exception) {
            this.q.k("{} close failed for {},{},{}", this.getClass().getSimpleName(), this.e0, this.c0, this.d0, exception);
            return;
        }
    }
}

