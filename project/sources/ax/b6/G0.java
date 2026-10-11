package ax.b6;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class G0 implements A0 {
    G0() {
    }

    @Override // ax.b6.A0
    public final <V> Callable<V> a(Callable<V> callable) {
        return callable;
    }

    @Override // ax.b6.A0
    public final Runnable b(Runnable runnable) {
        return runnable;
    }
}
