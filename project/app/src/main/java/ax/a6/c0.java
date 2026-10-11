/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.os.Handler;
import android.os.Looper;
import ax.a6.b0;
import java.util.concurrent.Executor;

public final class c0 {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final Executor b = new b0("Google consent worker");

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Method must be call on main thread.");
    }
}

