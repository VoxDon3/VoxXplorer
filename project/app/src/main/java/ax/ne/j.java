/*
 * Decompiled with CFR 0.152.
 */
package ax.ne;

import android.os.IBinder;
import ax.ne.m;

public final class j
implements Runnable {
    public final IBinder c0;
    public final m q;

    public /* synthetic */ j(m m8, IBinder iBinder) {
        this.q = m8;
        this.c0 = iBinder;
    }

    @Override
    public final void run() {
        m.w(this.q, this.c0);
    }
}

