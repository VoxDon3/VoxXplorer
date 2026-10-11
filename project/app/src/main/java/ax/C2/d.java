/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.os.Handler;
import android.os.Looper;
import ax.B2.p;
import ax.Y.g;

public class d
implements p {
    private final Handler a = g.a(Looper.getMainLooper());

    @Override
    public void a(long l8, Runnable runnable2) {
        this.a.postDelayed(runnable2, l8);
    }

    @Override
    public void b(Runnable runnable2) {
        this.a.removeCallbacks(runnable2);
    }
}

