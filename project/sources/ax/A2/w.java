package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import ax.y2.C3502a;
import ax.z2.C3539a;

/* loaded from: classes.dex */
public final class w implements v {
    public static final w b = new w();

    private w() {
    }

    @Override // ax.A2.v
    public C3539a a(Context context, m mVar) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(mVar, "densityCompatHelper");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        ax.Gb.l.e(bounds, "getBounds(...)");
        return new C3539a(bounds, f);
    }

    @Override // ax.A2.v
    public C3539a b(Activity activity, m mVar) {
        ax.Gb.l.f(activity, "activity");
        ax.Gb.l.f(mVar, "densityCompatHelper");
        return new C3539a(new C3502a(c.a.a().a(activity)), mVar.a(activity));
    }
}
