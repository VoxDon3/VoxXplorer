package ax.S0;

import java.util.concurrent.Executor;

/* renamed from: ax.S0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969b {
    private static Executor a;

    public static synchronized Executor a() {
        Executor executor;
        synchronized (C0969b.class) {
            try {
                if (a == null) {
                    a = d0.b1("ExoPlayer:BackgroundExecutor");
                }
                executor = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executor;
    }
}
