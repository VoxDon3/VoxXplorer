/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.G;
import ax.j6.K;
import ax.j6.b;
import ax.j6.j;
import ax.j6.s;
import java.util.concurrent.Executor;

final class t
implements G {
    private final Executor a;
    private final b b;
    private final K c;

    public t(Executor executor, b b8, K k8) {
        this.a = executor;
        this.b = b8;
        this.c = k8;
    }

    static /* bridge */ /* synthetic */ b a(t t8) {
        return t8.b;
    }

    static /* bridge */ /* synthetic */ K c(t t8) {
        return t8.c;
    }

    @Override
    public final void b(j object) {
        object = new s(this, (j)object);
        this.a.execute((Runnable)object);
    }
}

