/*
 * Decompiled with CFR 0.152.
 */
package ax.g2;

import androidx.profileinstaller.b;

public final class c
implements Runnable {
    public final int c0;
    public final Object d0;
    public final b q;

    public /* synthetic */ c(b b8, int n8, Object object) {
        this.q = b8;
        this.c0 = n8;
        this.d0 = object;
    }

    @Override
    public final void run() {
        b.a(this.q, this.c0, this.d0);
    }
}

