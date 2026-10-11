package ax.A2;

import android.app.Activity;

/* loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    private b() {
    }

    public final boolean a(Activity activity) {
        boolean isInMultiWindowMode;
        ax.Gb.l.f(activity, "activity");
        isInMultiWindowMode = activity.isInMultiWindowMode();
        return isInMultiWindowMode;
    }
}
