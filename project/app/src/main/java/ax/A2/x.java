/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import ax.A2.m;
import ax.A2.v;
import ax.A2.w;
import ax.Gb.l;
import ax.z2.a;

public final class x
implements v {
    public static final x b = new x();

    private x() {
    }

    @Override
    public a a(Context context, m m8) {
        l.f(context, "context");
        l.f(m8, "densityCompatHelper");
        m8 = (WindowManager)context.getSystemService(WindowManager.class);
        context = m8.getCurrentWindowMetrics().getBounds();
        l.e(context, "getBounds(...)");
        return new a((Rect)context, m8.getCurrentWindowMetrics().getDensity());
    }

    @Override
    public a b(Activity activity, m m8) {
        l.f(activity, "activity");
        l.f(m8, "densityCompatHelper");
        return w.b.b(activity, m8);
    }
}

