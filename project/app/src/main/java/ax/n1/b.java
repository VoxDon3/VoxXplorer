/*
 * Decompiled with CFR 0.152.
 */
package ax.n1;

import ax.S0.l;
import ax.n1.c;
import java.util.concurrent.Executor;

public final class b {
    public static <T extends Executor> c a(T t8, l<T> l8) {
        return new c(){
            final l c0;
            final Executor q;
            {
                this.q = executor;
                this.c0 = l8;
            }

            @Override
            public void d() {
                this.c0.accept(this.q);
            }

            @Override
            public void execute(Runnable runnable2) {
                this.q.execute(runnable2);
            }
        };
    }
}

