package ax.A2;

import android.graphics.Point;
import android.view.Display;

/* loaded from: classes.dex */
public final class u {
    public static final u a = new u();

    private u() {
    }

    public final Point a(Display display) {
        ax.Gb.l.f(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
