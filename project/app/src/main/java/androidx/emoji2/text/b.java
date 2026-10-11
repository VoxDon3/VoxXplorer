/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class b {
    public static /* synthetic */ Thread a(String object, Runnable runnable2) {
        object = new Thread(runnable2, (String)object);
        ((Thread)object).setPriority(10);
        return object;
    }

    static Executor b(Handler handler) {
        j.Objects.requireNonNull((Object)handler);
        return new ax.v0.a(handler);
    }

    static ThreadPoolExecutor c(String object) {
        object = new androidx.emoji2.text.a((String)object);
        object = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(), (ThreadFactory)object);
        ((ThreadPoolExecutor)object).allowCoreThreadTimeOut(true);
        return object;
    }

    static Handler d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }

    static Executor e() {
        return b.b(b.d());
    }

    static class a {
        public static Handler a(Looper looper) {
            return ax.v0.b.a(looper);
        }
    }
}

