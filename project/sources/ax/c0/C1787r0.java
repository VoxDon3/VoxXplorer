package ax.c0;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: ax.c0.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1787r0 {

    /* renamed from: ax.c0.r0$a */
    static class a {
        static void a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* renamed from: ax.c0.r0$b */
    static class b {
        static void a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static e1 a(Window window, View view) {
        return new e1(window, view);
    }

    public static void b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}
