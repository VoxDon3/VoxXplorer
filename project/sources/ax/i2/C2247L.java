package ax.i2;

import android.view.MotionEvent;
import ax.b0.C1446g;
import java.util.Arrays;
import java.util.List;

/* renamed from: ax.i2.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2247L<T> {
    private final List<T> a = Arrays.asList(null, null, null, null, null);
    private final T b;

    C2247L(T t) {
        C1446g.a(t != null);
        this.b = t;
    }

    T a(MotionEvent motionEvent) {
        T t = this.a.get(motionEvent.getToolType(0));
        return t != null ? t : this.b;
    }

    void b(int i, T t) {
        C1446g.a(i >= 0 && i <= 4);
        C1446g.i(this.a.get(i) == null);
        this.a.set(i, t);
    }
}
