/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.A;
import ax.j6.G;
import ax.j6.f;
import ax.j6.j;
import java.util.concurrent.Executor;

final class B
implements G {
    private final Executor a;
    private final Object b = new Object();
    private f c;

    public B(Executor executor, f f8) {
        this.a = executor;
        this.c = f8;
    }

    static /* bridge */ /* synthetic */ f a(B b8) {
        return b8.c;
    }

    static /* bridge */ /* synthetic */ Object c(B b8) {
        return b8.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void b(j j8) {
        if (j8.m()) return;
        if (j8.k()) return;
        Object object = this.b;
        // MONITORENTER : object
        if (this.c == null) {
            // MONITOREXIT : object
            return;
        }
        this.a.execute(new A(this, j8));
    }
}

