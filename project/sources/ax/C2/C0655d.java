package ax.C2;

import android.os.Handler;
import android.os.Looper;

/* renamed from: ax.C2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0655d implements ax.B2.p {
    private final Handler a = ax.Y.g.a(Looper.getMainLooper());

    @Override // ax.B2.p
    public void a(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }

    @Override // ax.B2.p
    public void b(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }
}
