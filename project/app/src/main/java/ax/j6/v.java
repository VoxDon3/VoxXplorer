/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.G;
import ax.j6.K;
import ax.j6.b;
import ax.j6.d;
import ax.j6.f;
import ax.j6.g;
import ax.j6.j;
import ax.j6.u;
import java.util.concurrent.Executor;

final class v<TResult, TContinuationResult>
implements g<TContinuationResult>,
f,
d,
G {
    private final Executor a;
    private final b b;
    private final K c;

    public v(Executor executor, b b8, K k8) {
        this.a = executor;
        this.b = b8;
        this.c = k8;
    }

    static /* bridge */ /* synthetic */ b e(v v8) {
        return v8.b;
    }

    static /* bridge */ /* synthetic */ K f(v v8) {
        return v8.c;
    }

    @Override
    public final void a(TContinuationResult TContinuationResult) {
        this.c.q(TContinuationResult);
    }

    @Override
    public final void b(j object) {
        object = new u(this, (j)object);
        this.a.execute((Runnable)object);
    }

    @Override
    public final void c() {
        this.c.r();
    }

    @Override
    public final void d(Exception exception) {
        this.c.p(exception);
    }
}

