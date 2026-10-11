/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.graphics.Point;
import android.view.Display;
import ax.Gb.l;

public final class u {
    public static final u a = new u();

    private u() {
    }

    public final Point a(Display display) {
        l.f(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}

