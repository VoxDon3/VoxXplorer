/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.g;
import ax.i2.C;
import ax.i2.K;
import ax.i2.L;
import ax.i2.q;

final class i
implements RecyclerView.t,
C {
    private final L<RecyclerView.t> a = new L<K>(new K());
    private boolean b;

    i() {
    }

    @Override
    public void a() {
        this.b = false;
    }

    @Override
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.b) {
            this.a.a(motionEvent).b(recyclerView, motionEvent);
        }
    }

    @Override
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && q.e(motionEvent)) {
            this.b = false;
        }
        return !this.b && this.a.a(motionEvent).c(recyclerView, motionEvent);
    }

    @Override
    public boolean d() {
        return this.b;
    }

    @Override
    public void e(boolean bl) {
        if (!bl) {
            return;
        }
        this.b = bl;
    }

    void f(int n8, RecyclerView.t t8) {
        boolean bl = t8 != null;
        g.a(bl);
        this.a.b(n8, t8);
    }
}

