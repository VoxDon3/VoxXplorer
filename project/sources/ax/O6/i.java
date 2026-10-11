package ax.O6;

import android.graphics.drawable.Drawable;
import android.view.View;
import ax.F6.z;

/* loaded from: classes3.dex */
public class i {
    static e a(int i) {
        return i != 0 ? i != 1 ? b() : new f() : new k();
    }

    static e b() {
        return new k();
    }

    static g c() {
        return new g();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof h) {
            ((h) background).f0(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof h) {
            f(view, (h) background);
        }
    }

    public static void f(View view, h hVar) {
        if (hVar.W()) {
            hVar.k0(z.f(view));
        }
    }
}
