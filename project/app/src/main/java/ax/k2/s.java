/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import ax.k2.r;

public final class s
implements Runnable {
    public final String[] c0;
    public final r q;

    public /* synthetic */ s(r r8, String[] stringArray) {
        this.q = r8;
        this.c0 = stringArray;
    }

    @Override
    public final void run() {
        r.b.w(this.q, this.c0);
    }
}

