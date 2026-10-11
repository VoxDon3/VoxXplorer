package ax.A2;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* loaded from: classes.dex */
final class e implements c {
    public static final e b = new e();

    private e() {
    }

    @Override // ax.A2.c
    public Rect a(Activity activity) {
        int e;
        ax.Gb.l.f(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!b.a.a(activity)) {
            u uVar = u.a;
            ax.Gb.l.c(defaultDisplay);
            Point a = uVar.a(defaultDisplay);
            e = k.e(activity);
            int i = rect.bottom;
            if (i + e == a.y) {
                rect.bottom = i + e;
                return rect;
            }
            int i2 = rect.right;
            if (i2 + e == a.x) {
                rect.right = i2 + e;
            }
        }
        return rect;
    }
}
