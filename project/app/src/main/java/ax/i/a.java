/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import android.window.BackEvent;
import ax.Gb.l;

public final class a {
    public static final a a = new a();

    private a() {
    }

    public final BackEvent a(float f8, float f9, float f10, int n8) {
        return new BackEvent(f8, f9, f10, n8);
    }

    public final float b(BackEvent backEvent) {
        l.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        l.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        l.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        l.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}

