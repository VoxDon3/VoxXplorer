package ax.J7;

import android.os.Process;

/* renamed from: ax.J7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC0759d implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
