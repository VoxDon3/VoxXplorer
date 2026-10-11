/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.os.IBinder;
import ax.L5.h;

public final class w
implements Runnable {
    public final IBinder c0;
    public final h q;

    public /* synthetic */ w(h h8, IBinder iBinder) {
        this.q = h8;
        this.c0 = iBinder;
    }

    @Override
    public final void run() {
        this.q.q(this.c0);
    }
}

