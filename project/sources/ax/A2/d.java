package ax.A2;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* loaded from: classes.dex */
final class d implements c {
    public static final d b = new d();

    private d() {
    }

    @Override // ax.A2.c
    public Rect a(Activity activity) {
        int i;
        ax.Gb.l.f(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        u uVar = u.a;
        ax.Gb.l.c(defaultDisplay);
        Point a = uVar.a(defaultDisplay);
        Rect rect = new Rect();
        int i2 = a.x;
        if (i2 == 0 || (i = a.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i2;
        rect.bottom = i;
        return rect;
    }
}
