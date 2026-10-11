/*
 * Decompiled with CFR 0.152.
 */
package ax.I2;

import ax.I2.h;
import java.util.List;

public final class g
implements Runnable {
    public final h c0;
    public final List q;

    public /* synthetic */ g(List list, h h8) {
        this.q = list;
        this.c0 = h8;
    }

    @Override
    public final void run() {
        h.a(this.q, this.c0);
    }
}

