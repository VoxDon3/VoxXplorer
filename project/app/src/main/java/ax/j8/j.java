/*
 * Decompiled with CFR 0.152.
 */
package ax.j8;

import ax.R5.d;
import ax.j8.k;
import com.google.firebase.remoteconfig.internal.c;

public final class j
implements Runnable {
    public final String c0;
    public final c d0;
    public final d q;

    public /* synthetic */ j(d d8, String string, c c8) {
        this.q = d8;
        this.c0 = string;
        this.d0 = c8;
    }

    @Override
    public final void run() {
        k.a(this.q, this.c0, this.d0);
    }
}

