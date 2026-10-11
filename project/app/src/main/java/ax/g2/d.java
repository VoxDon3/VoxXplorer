/*
 * Decompiled with CFR 0.152.
 */
package ax.g2;

import androidx.profileinstaller.f;

public final class d
implements Runnable {
    public final int c0;
    public final Object d0;
    public final f.c q;

    public /* synthetic */ d(f.c c8, int n8, Object object) {
        this.q = c8;
        this.c0 = n8;
        this.d0 = object;
    }

    @Override
    public final void run() {
        f.a(this.q, this.c0, this.d0);
    }
}

