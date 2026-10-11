/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import ax.S0.t;
import java.util.concurrent.CopyOnWriteArraySet;

public final class s
implements Runnable {
    public final int c0;
    public final t.a d0;
    public final CopyOnWriteArraySet q;

    public /* synthetic */ s(CopyOnWriteArraySet copyOnWriteArraySet, int n8, t.a a8) {
        this.q = copyOnWriteArraySet;
        this.c0 = n8;
        this.d0 = a8;
    }

    @Override
    public final void run() {
        t.a(this.q, this.c0, this.d0);
    }
}

