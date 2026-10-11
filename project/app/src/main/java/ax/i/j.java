/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import androidx.activity.ComponentActivity;
import ax.l.a;

public final class j
implements Runnable {
    public final int c0;
    public final a.a d0;
    public final ComponentActivity.f q;

    public /* synthetic */ j(ComponentActivity.f f8, int n8, a.a a8) {
        this.q = f8;
        this.c0 = n8;
        this.d0 = a8;
    }

    @Override
    public final void run() {
        ComponentActivity.f.r(this.q, this.c0, this.d0);
    }
}

