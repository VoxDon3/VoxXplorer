package ax.A2;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class n implements m {
    public static final n b = new n();

    private n() {
    }

    @Override // ax.A2.m
    public float a(Context context) {
        ax.Gb.l.f(context, "context");
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
