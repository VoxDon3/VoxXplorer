/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.f;
import ax.g2.e;
import ax.g2.g;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ProfileInstallerInitializer
implements ax.r2.a<b> {
    public static /* synthetic */ void c(Context context) {
        f.h(context);
    }

    public static /* synthetic */ void d(Context context) {
        ProfileInstallerInitializer.h(context);
    }

    public static /* synthetic */ void e(ProfileInstallerInitializer profileInstallerInitializer, Context context, long l8) {
        profileInstallerInitializer.g(context);
    }

    private static void h(Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>()).execute(new g(context));
    }

    @Override
    public List<Class<? extends ax.r2.a<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    public b f(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new b();
        }
        context = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback((Choreographer.FrameCallback)new e(this, context));
        return new b();
    }

    void g(Context context) {
        Handler handler = Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
        int n8 = new Random().nextInt(Math.max(1000, 1));
        handler.postDelayed((Runnable)new ax.g2.f(context), (long)(n8 + 5000));
    }

    private static class a {
        public static Handler a(Looper looper) {
            return ax.v0.b.a(looper);
        }
    }

    public static class b {
    }
}

