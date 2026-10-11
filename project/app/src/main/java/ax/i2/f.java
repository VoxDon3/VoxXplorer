/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.i2.C;
import ax.i2.q;

class f
implements RecyclerView.t,
C {
    private final RecyclerView.t a;
    private boolean b;

    f(RecyclerView.t t8) {
        this.a = t8;
    }

    @Override
    public void a() {
        this.b = false;
    }

    @Override
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.c(recyclerView, motionEvent);
    }

    @Override
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && q.e(motionEvent)) {
            this.b = false;
        }
        return !this.b && this.a.c(recyclerView, motionEvent);
    }

    @Override
    public boolean d() {
        return this.b;
    }

    @Override
    public void e(boolean bl) {
        this.b = true;
    }
}

