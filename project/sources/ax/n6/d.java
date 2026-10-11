package ax.n6;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class d {
    public static void a(C2582a c2582a, View view, FrameLayout frameLayout) {
        c(c2582a, view, frameLayout);
        if (c2582a.j() != null) {
            c2582a.j().setForeground(c2582a);
        } else {
            view.getOverlay().add(c2582a);
        }
    }

    public static void b(C2582a c2582a, View view) {
        if (c2582a == null) {
            return;
        }
        if (c2582a.j() != null) {
            c2582a.j().setForeground(null);
        } else {
            view.getOverlay().remove(c2582a);
        }
    }

    public static void c(C2582a c2582a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c2582a.setBounds(rect);
        c2582a.M(view, frameLayout);
    }

    public static void d(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
