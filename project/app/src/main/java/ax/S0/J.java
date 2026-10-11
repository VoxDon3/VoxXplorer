/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ax.S0.K;
import ax.S0.h;
import ax.S0.q;

public class J
implements h {
    protected J() {
    }

    @Override
    public long a() {
        return System.currentTimeMillis();
    }

    @Override
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override
    public q d(Looper looper, Handler.Callback callback) {
        return new K(new Handler(looper, callback));
    }

    @Override
    public void e() {
    }

    @Override
    public long nanoTime() {
        return System.nanoTime();
    }
}

