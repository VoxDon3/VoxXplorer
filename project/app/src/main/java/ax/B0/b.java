/*
 * Decompiled with CFR 0.152.
 */
package ax.B0;

import ax.B0.c;
import ax.B0.h;

public final class b
implements Runnable {
    public final h c0;
    public final String q;

    public /* synthetic */ b(String string, h h8) {
        this.q = string;
        this.c0 = h8;
    }

    @Override
    public final void run() {
        c.a(this.q, this.c0);
    }
}

