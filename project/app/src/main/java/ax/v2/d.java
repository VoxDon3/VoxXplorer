/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import ax.Y.d;
import ax.v2.e;
import ax.v2.k;

public final class d
implements d.a {
    public final Runnable a;
    public final k b;
    public final Runnable c;

    public /* synthetic */ d(Runnable runnable2, k k8, Runnable runnable3) {
        this.a = runnable2;
        this.b = k8;
        this.c = runnable3;
    }

    @Override
    public final void a() {
        e.v(this.a, this.b, this.c);
    }
}

