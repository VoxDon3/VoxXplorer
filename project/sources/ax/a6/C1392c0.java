package ax.a6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ax.a6.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1392c0 {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final Executor b = new ExecutorC1390b0("Google consent worker");

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
