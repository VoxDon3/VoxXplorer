/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.D7.v;
import ax.Y7.a;
import java.util.Map;

public final class u
implements Runnable {
    public final a c0;
    public final Map.Entry q;

    public /* synthetic */ u(Map.Entry entry, a a8) {
        this.q = entry;
        this.c0 = a8;
    }

    @Override
    public final void run() {
        v.b(this.q, this.c0);
    }
}

