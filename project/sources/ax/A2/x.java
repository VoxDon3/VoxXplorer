package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import ax.z2.C3539a;

/* loaded from: classes.dex */
public final class x implements v {
    public static final x b = new x();

    private x() {
    }

    @Override // ax.A2.v
    public C3539a a(Context context, m mVar) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(mVar, "densityCompatHelper");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        ax.Gb.l.e(bounds, "getBounds(...)");
        return new C3539a(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // ax.A2.v
    public C3539a b(Activity activity, m mVar) {
        ax.Gb.l.f(activity, "activity");
        ax.Gb.l.f(mVar, "densityCompatHelper");
        return w.b.b(activity, mVar);
    }
}
