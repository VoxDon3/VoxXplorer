/*
 * Decompiled with CFR 0.152.
 */
package ax.n6;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import ax.n6.a;

public class d {
    public static void a(a a8, View view, FrameLayout frameLayout) {
        d.c(a8, view, frameLayout);
        if (a8.j() != null) {
            a8.j().setForeground((Drawable)a8);
            return;
        }
        view.getOverlay().add((Drawable)a8);
    }

    public static void b(a a8, View view) {
        if (a8 == null) {
            return;
        }
        if (a8.j() != null) {
            a8.j().setForeground(null);
            return;
        }
        view.getOverlay().remove((Drawable)a8);
    }

    public static void c(a a8, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        a8.setBounds(rect);
        a8.M(view, frameLayout);
    }

    public static void d(Rect rect, float f8, float f9, float f10, float f11) {
        rect.set((int)(f8 - f10), (int)(f9 - f11), (int)(f8 + f10), (int)(f9 + f11));
    }
}

