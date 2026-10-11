/*
 * Decompiled with CFR 0.152.
 */
package ax.b8;

import com.google.firebase.installations.c;

public final class d
implements Runnable {
    public final boolean c0;
    public final c q;

    public /* synthetic */ d(c c8, boolean bl) {
        this.q = c8;
        this.c0 = bl;
    }

    @Override
    public final void run() {
        c.d(this.q, this.c0);
    }
}

