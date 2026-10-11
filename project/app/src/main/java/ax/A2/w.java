/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import ax.A2.c;
import ax.A2.m;
import ax.A2.v;
import ax.Gb.l;
import ax.z2.a;

public final class w
implements v {
    public static final w b = new w();

    private w() {
    }

    @Override
    public a a(Context context, m m8) {
        l.f(context, "context");
        l.f(m8, "densityCompatHelper");
        m8 = (WindowManager)context.getSystemService(WindowManager.class);
        float f8 = context.getResources().getDisplayMetrics().density;
        context = m8.getCurrentWindowMetrics().getBounds();
        l.e(context, "getBounds(...)");
        return new a((Rect)context, f8);
    }

    @Override
    public a b(Activity activity, m m8) {
        l.f(activity, "activity");
        l.f(m8, "densityCompatHelper");
        return new a(new ax.y2.a(c.a.a().a(activity)), m8.a((Context)activity));
    }
}

