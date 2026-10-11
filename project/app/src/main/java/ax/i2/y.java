/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.g;
import ax.i2.K;
import ax.i2.o;
import ax.i2.q;
import ax.i2.v;

final class y
implements RecyclerView.t {
    private final o<?> a;
    private final v b;
    private RecyclerView.t c;

    y(o<?> o8, v v8, RecyclerView.t t8) {
        boolean bl = false;
        boolean bl2 = o8 != null;
        g.a(bl2);
        bl2 = bl;
        if (v8 != null) {
            bl2 = true;
        }
        g.a(bl2);
        this.a = o8;
        this.b = v8;
        if (t8 != null) {
            this.c = t8;
            return;
        }
        this.c = new K();
    }

    @Override
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.c.b(recyclerView, motionEvent);
    }

    @Override
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (q.l(motionEvent) && this.a.d(motionEvent)) {
            return this.b.a(motionEvent);
        }
        return this.c.c(recyclerView, motionEvent);
    }

    @Override
    public void e(boolean bl) {
        this.c.e(bl);
    }
}

