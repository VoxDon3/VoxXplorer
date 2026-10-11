/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import ax.A2.c;
import ax.A2.u;
import ax.Gb.l;

final class d
implements c {
    public static final d b = new d();

    private d() {
    }

    @Override
    public Rect a(Activity activity) {
        int n8;
        l.f(activity, "activity");
        activity = activity.getWindowManager().getDefaultDisplay();
        u u8 = u.a;
        l.c(activity);
        u8 = u8.a((Display)activity);
        Rect rect = new Rect();
        int n9 = ((Point)u8).x;
        if (n9 != 0 && (n8 = ((Point)u8).y) != 0) {
            rect.right = n9;
            rect.bottom = n8;
            return rect;
        }
        activity.getRectSize(rect);
        return rect;
    }
}

