/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

import android.os.SystemClock;
import ax.R5.e;

public class h
implements e {
    private static final h a = new h();

    private h() {
    }

    public static e c() {
        return a;
    }

    @Override
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public final long nanoTime() {
        return System.nanoTime();
    }
}

