/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.h;
import ax.j6.j;
import ax.j6.t;

final class s
implements Runnable {
    final t c0;
    final j q;

    s(t t8, j j8) {
        this.c0 = t8;
        this.q = j8;
    }

    @Override
    public final void run() {
        h h82;
        block5: {
            Object TContinuationResult;
            if (this.q.k()) {
                t.c(this.c0).r();
                return;
            }
            try {
                TContinuationResult = t.a(this.c0).a(this.q);
            }
            catch (Exception exception) {
            }
            catch (h h82) {
                break block5;
            }
            t.c(this.c0).q(TContinuationResult);
            return;
            t.c(this.c0).p(exception);
            return;
        }
        if (h82.getCause() instanceof Exception) {
            t.c(this.c0).p((Exception)h82.getCause());
            return;
        }
        t.c(this.c0).p(h82);
    }
}

