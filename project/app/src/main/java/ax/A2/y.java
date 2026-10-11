/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import ax.A2.c;
import ax.A2.l;
import ax.A2.m;
import ax.A2.u;
import ax.A2.v;
import ax.z2.a;

public final class y
implements v {
    public static final y b = new y();

    private y() {
    }

    @Override
    public a a(Context context, m object) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(object, "densityCompatHelper");
        Object object2 = l.a.a(context);
        if (object2 instanceof Activity) {
            return this.b((Activity)object2, (m)object);
        }
        if (object2 instanceof InputMethodService) {
            object2 = context.getSystemService("window");
            ax.Gb.l.d(object2, "null cannot be cast to non-null type android.view.WindowManager");
            WindowManager windowManager = (WindowManager)object2;
            object2 = u.a;
            windowManager = windowManager.getDefaultDisplay();
            ax.Gb.l.e(windowManager, "getDefaultDisplay(...)");
            object2 = ((u)object2).a((Display)windowManager);
            return new a(new Rect(0, 0, ((Point)object2).x, ((Point)object2).y), object.a(context));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(context);
        ((StringBuilder)object).append(" is not a UiContext");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    @Override
    public a b(Activity activity, m m8) {
        ax.Gb.l.f(activity, "activity");
        ax.Gb.l.f(m8, "densityCompatHelper");
        return new a(new ax.y2.a(c.a.a().a(activity)), m8.a((Context)activity));
    }
}

