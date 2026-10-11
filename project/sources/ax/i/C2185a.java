package ax.i;

import android.window.BackEvent;

/* renamed from: ax.i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2185a {
    public static final C2185a a = new C2185a();

    private C2185a() {
    }

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        ax.Gb.l.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        ax.Gb.l.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        ax.Gb.l.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        ax.Gb.l.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
