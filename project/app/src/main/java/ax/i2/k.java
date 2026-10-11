/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.g;
import ax.i2.C;
import ax.i2.q;

final class k
implements RecyclerView.t,
C {
    private final GestureDetector a;
    private boolean b;

    k(GestureDetector gestureDetector) {
        boolean bl = gestureDetector != null;
        g.a(bl);
        this.a = gestureDetector;
    }

    private void f() {
        this.a.onTouchEvent(q.a());
    }

    @Override
    public void a() {
        this.b = false;
        this.f();
    }

    @Override
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && q.e(motionEvent)) {
            this.b = false;
        }
        return !this.b && this.a.onTouchEvent(motionEvent);
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public void e(boolean bl) {
        if (!bl) {
            return;
        }
        this.b = bl;
        this.f();
    }
}

