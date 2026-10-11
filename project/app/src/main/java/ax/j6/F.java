/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.E;
import ax.j6.G;
import ax.j6.K;
import ax.j6.d;
import ax.j6.f;
import ax.j6.g;
import ax.j6.i;
import ax.j6.j;
import java.util.concurrent.Executor;

final class F<TResult, TContinuationResult>
implements g<TContinuationResult>,
f,
d,
G {
    private final Executor a;
    private final i b;
    private final K c;

    public F(Executor executor, i i8, K k8) {
        this.a = executor;
        this.b = i8;
        this.c = k8;
    }

    static /* bridge */ /* synthetic */ i e(F f8) {
        return f8.b;
    }

    @Override
    public final void a(TContinuationResult TContinuationResult) {
        this.c.q(TContinuationResult);
    }

    @Override
    public final void b(j object) {
        object = new E(this, (j)object);
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

