/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.V;

public final class U
implements Runnable {
    public final V q;

    public /* synthetic */ U(V v8) {
        this.q = v8;
    }

    @Override
    public final void run() {
        V.c(this.q);
    }
}

