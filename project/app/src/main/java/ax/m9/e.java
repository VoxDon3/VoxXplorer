/*
 * Decompiled with CFR 0.152.
 */
package ax.m9;

import ax.Q8.r;
import ax.Q8.t;
import ax.Xd.d;
import ax.Xd.f;
import ax.l9.h;
import ax.m9.i;

public class e
extends i {
    private static final d c = f.k(e.class);
    private ax.l9.e b;

    public e(ax.l9.e e8) {
        this.b = e8;
    }

    @Override
    protected void e(r r8) throws ax.c9.e {
        h h8 = this.b.a(((t)r8.b()).i());
        d d8 = c;
        d8.i("Send/Recv of packet {} took << {} ms >>", r8, System.currentTimeMillis() - h8.g().getTime());
        if (r8.g()) {
            d8.d("Received ASYNC packet {} with AsyncId << {} >>", r8, ((t)r8.b()).d());
            h8.h(((t)r8.b()).d());
            return;
        }
        this.a.a(r8);
    }
}

