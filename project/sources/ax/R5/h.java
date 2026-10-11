package ax.R5;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class h implements e {
    private static final h a = new h();

    private h() {
    }

    public static e c() {
        return a;
    }

    @Override // ax.R5.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // ax.R5.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ax.R5.e
    public final long nanoTime() {
        return System.nanoTime();
    }
}
