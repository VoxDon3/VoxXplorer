/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import ax.c0.e1;

public final class r0 {
    public static e1 a(Window window, View view) {
        return new e1(window, view);
    }

    public static void b(Window window, boolean bl) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, bl);
            return;
        }
        a.a(window, bl);
    }

    static class a {
        static void a(Window window, boolean bl) {
            window = window.getDecorView();
            int n8 = window.getSystemUiVisibility();
            n8 = bl ? (n8 &= 0xFFFFF8FF) : (n8 |= 0x700);
            window.setSystemUiVisibility(n8);
        }
    }

    static class b {
        static void a(Window window, boolean bl) {
            window.setDecorFitsSystemWindows(bl);
        }
    }
}

