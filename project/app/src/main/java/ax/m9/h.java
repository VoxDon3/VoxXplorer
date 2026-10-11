/*
 * Decompiled with CFR 0.152.
 */
package ax.m9;

import ax.Q8.a;
import ax.Q8.r;
import ax.Xd.d;
import ax.Xd.f;
import ax.h9.c;
import ax.l9.e;
import ax.m9.i;

public class h
extends i {
    private static final d c = f.k(h.class);
    private e b;

    public h(e e8) {
        this.b = e8;
    }

    @Override
    protected void e(r r8) throws ax.c9.e {
        long l8 = r8.d();
        if (!this.b.c(l8) && !r8.h()) {
            c.t("Received response with unknown sequence number << {} >>", l8);
            this.a.a(new a((c)r8.b()));
            return;
        }
        this.a.a(r8);
    }
}

