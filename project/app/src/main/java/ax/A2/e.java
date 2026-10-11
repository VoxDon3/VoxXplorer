/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import ax.A2.b;
import ax.A2.c;
import ax.A2.k;
import ax.A2.u;
import ax.Gb.l;

final class e
implements c {
    public static final e b = new e();

    private e() {
    }

    @Override
    public Rect a(Activity activity) {
        l.f(activity, "activity");
        Rect rect = new Rect();
        Display display = activity.getWindowManager().getDefaultDisplay();
        display.getRectSize(rect);
        if (!ax.A2.b.a.a(activity)) {
            u u8 = u.a;
            l.c(display);
            u8 = u8.a(display);
            int n8 = k.b((Context)activity);
            int n9 = rect.bottom;
            if (n9 + n8 == ((Point)u8).y) {
                rect.bottom = n9 + n8;
                return rect;
            }
            n9 = rect.right;
            if (n9 + n8 == ((Point)u8).x) {
                rect.right = n9 + n8;
            }
        }
        return rect;
    }
}

