package ax.A2;

import android.view.DisplayCutout;

/* loaded from: classes.dex */
public final class t {
    public static final t a = new t();

    private t() {
    }

    public final int a(DisplayCutout displayCutout) {
        int safeInsetBottom;
        ax.Gb.l.f(displayCutout, "displayCutout");
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    public final int b(DisplayCutout displayCutout) {
        int safeInsetLeft;
        ax.Gb.l.f(displayCutout, "displayCutout");
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public final int c(DisplayCutout displayCutout) {
        int safeInsetRight;
        ax.Gb.l.f(displayCutout, "displayCutout");
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    public final int d(DisplayCutout displayCutout) {
        int safeInsetTop;
        ax.Gb.l.f(displayCutout, "displayCutout");
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }
}
