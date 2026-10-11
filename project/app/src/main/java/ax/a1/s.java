/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.Y0.b;
import ax.a1.z;

public final class s
implements Runnable {
    public final b c0;
    public final z.a q;

    public /* synthetic */ s(z.a a8, b b8) {
        this.q = a8;
        this.c0 = b8;
    }

    @Override
    public final void run() {
        z.a.c(this.q, this.c0);
    }
}

