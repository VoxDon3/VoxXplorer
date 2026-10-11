/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.Y6.f;
import ax.a6.C0;
import ax.a6.F0;
import ax.a6.I;
import ax.a6.c0;
import ax.a6.v;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class G {
    private final C0 a;
    private final Executor b;
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();

    G(C0 c02, Executor executor) {
        this.a = c02;
        this.b = executor;
    }

    public final void a(f.b b8, f.a a8) {
        c0.a();
        I i8 = (I)this.c.get();
        if (i8 == null) {
            a8.b(new F0(3, "No available form can be built.").a());
            return;
        }
        ((v)this.a.a()).a(i8).b().a().g(b8, a8);
    }
}

