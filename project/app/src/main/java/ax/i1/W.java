/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.i1.Y;

public final class W
implements Runnable {
    public final Y q;

    public /* synthetic */ W(Y y8) {
        this.q = y8;
    }

    @Override
    public final void run() {
        Y.z(this.q);
    }
}

