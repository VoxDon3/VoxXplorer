/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import ax.d3.B0;
import ax.d3.y0;

public class B {
    public static Rect a(Context context) {
        context = (WindowManager)context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return b.a((WindowManager)context);
        }
        return a.a((WindowManager)context);
    }

    private static class a {
        static Rect a(WindowManager windowManager) {
            Display display = windowManager.getDefaultDisplay();
            windowManager = new Point();
            display.getRealSize((Point)windowManager);
            display = new Rect();
            display.right = windowManager.x;
            display.bottom = windowManager.y;
            return display;
        }
    }

    private static class b {
        static Rect a(WindowManager windowManager) {
            return B0.a(y0.a(windowManager));
        }
    }
}

