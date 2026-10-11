/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.i1.Y;

public final class V
implements Runnable {
    public final Y q;

    public /* synthetic */ V(Y y8) {
        this.q = y8;
    }

    @Override
    public final void run() {
        Y.y(this.q);
    }
}

