package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import ax.y2.C3502a;
import ax.z2.C3539a;

/* loaded from: classes.dex */
public final class y implements v {
    public static final y b = new y();

    private y() {
    }

    @Override // ax.A2.v
    public C3539a a(Context context, m mVar) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(mVar, "densityCompatHelper");
        Context a = l.a.a(context);
        if (a instanceof Activity) {
            return b((Activity) a, mVar);
        }
        if (!(a instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        ax.Gb.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        u uVar = u.a;
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        ax.Gb.l.e(defaultDisplay, "getDefaultDisplay(...)");
        Point a2 = uVar.a(defaultDisplay);
        return new C3539a(new Rect(0, 0, a2.x, a2.y), mVar.a(context));
    }

    @Override // ax.A2.v
    public C3539a b(Activity activity, m mVar) {
        ax.Gb.l.f(activity, "activity");
        ax.Gb.l.f(mVar, "densityCompatHelper");
        return new C3539a(new C3502a(c.a.a().a(activity)), mVar.a(activity));
    }
}
