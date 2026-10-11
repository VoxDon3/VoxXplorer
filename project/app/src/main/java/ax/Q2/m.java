/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.f;
import ax.Q2.k;
import ax.Q2.l;
import ax.v0.b;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class m {
    private static boolean a;

    public static /* synthetic */ void a(Context context) {
        m.e(context);
    }

    public static /* synthetic */ void b(Context context) {
        f.h(context);
    }

    static void c(Context context) {
        Handler handler = Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
        int n8 = new Random().nextInt(Math.max(1000, 1));
        handler.postDelayed((Runnable)new k(context), (long)(n8 + 5000));
    }

    @SuppressLint(value={"RestrictedApi"})
    public static void d(Context context) {
        if (Build.VERSION.SDK_INT >= 24 && !a) {
            a = true;
            m.c(context);
        }
    }

    private static void e(Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>()).execute(new l(context));
    }
}

