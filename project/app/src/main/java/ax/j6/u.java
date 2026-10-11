/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.h;
import ax.j6.j;
import ax.j6.l;
import ax.j6.v;
import java.util.concurrent.Executor;

final class u
implements Runnable {
    final v c0;
    final j q;

    u(v v8, j j8) {
        this.c0 = v8;
        this.q = j8;
    }

    @Override
    public final void run() {
        h h82;
        block5: {
            Exception exception2;
            j j8;
            block4: {
                try {
                    j8 = (j)v.e(this.c0).a(this.q);
                    if (j8 != null) break block4;
                }
                catch (Exception exception2) {
                }
                catch (h h82) {
                    break block5;
                }
                this.c0.d(new NullPointerException("Continuation returned null"));
                return;
            }
            v v8 = this.c0;
            Executor executor = l.b;
            j8.e(executor, v8);
            j8.d(executor, this.c0);
            j8.a(executor, this.c0);
            return;
            v.f(this.c0).p(exception2);
            return;
        }
        if (h82.getCause() instanceof Exception) {
            v.f(this.c0).p((Exception)h82.getCause());
            return;
        }
        v.f(this.c0).p(h82);
    }
}

