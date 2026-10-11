package ax.Q2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class m {
    private static boolean a;

    static void c(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: ax.Q2.k
            @Override // java.lang.Runnable
            public final void run() {
                m.e(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    @SuppressLint({"RestrictedApi"})
    public static void d(Context context) {
        if (Build.VERSION.SDK_INT >= 24 && !a) {
            a = true;
            c(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: ax.Q2.l
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.f.h(context);
            }
        });
    }
}
