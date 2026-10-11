/*
 * Decompiled with CFR 0.152.
 */
package ax.d1;

import android.net.Uri;
import ax.d1.c;

public final class d
implements Runnable {
    public final Uri c0;
    public final c.c q;

    public /* synthetic */ d(c.c c8, Uri uri) {
        this.q = c8;
        this.c0 = uri;
    }

    @Override
    public final void run() {
        c.c.a(this.q, this.c0);
    }
}

