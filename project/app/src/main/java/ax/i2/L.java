/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.MotionEvent;
import ax.b0.g;
import java.util.Arrays;
import java.util.List;

final class L<T> {
    private final List<T> a;
    private final T b;

    L(T t8) {
        boolean bl = false;
        this.a = Arrays.asList(null, null, null, null, null);
        if (t8 != null) {
            bl = true;
        }
        g.a(bl);
        this.b = t8;
    }

    T a(MotionEvent object) {
        if ((object = this.a.get(object.getToolType(0))) != null) {
            return (T)object;
        }
        return this.b;
    }

    void b(int n8, T t8) {
        boolean bl = false;
        boolean bl2 = n8 >= 0 && n8 <= 4;
        g.a(bl2);
        bl2 = bl;
        if (this.a.get(n8) == null) {
            bl2 = true;
        }
        g.i(bl2);
        this.a.set(n8, t8);
    }
}

