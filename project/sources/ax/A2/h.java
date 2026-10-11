package ax.A2;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class h implements c {
    public static final h b = new h();

    private h() {
    }

    @Override // ax.A2.c
    public Rect a(Activity activity) {
        ax.Gb.l.f(activity, "activity");
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        ax.Gb.l.e(bounds, "getBounds(...)");
        return bounds;
    }
}
