/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import ax.K5.h;
import ax.M5.M;
import ax.M5.b;
import ax.M5.o;
import ax.j6.k;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

final class K
implements h.a {
    final h a;
    final k b;
    final o.a c;
    final M d;

    K(h h8, k k8, o.a a8, M m8) {
        this.a = h8;
        this.b = k8;
        this.c = a8;
        this.d = m8;
    }

    @Override
    public final void a(Status status) {
        if (status.C()) {
            status = this.a.b(0L, TimeUnit.MILLISECONDS);
            this.b.c(this.c.a(status));
            return;
        }
        this.b.b(ax.M5.b.a(status));
    }
}

