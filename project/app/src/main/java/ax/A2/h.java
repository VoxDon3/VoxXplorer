/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import ax.A2.c;
import ax.Gb.l;

final class h
implements c {
    public static final h b = new h();

    private h() {
    }

    @Override
    public Rect a(Activity activity) {
        l.f(activity, "activity");
        activity = ((WindowManager)activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        l.e(activity, "getBounds(...)");
        return activity;
    }
}

