/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.i2.C;
import ax.i2.q;

class g
implements RecyclerView.t,
C {
    private boolean a;

    g() {
    }

    @Override
    public void a() {
        this.a = false;
    }

    @Override
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (q.g(motionEvent) && this.a) {
            this.a = false;
            return true;
        }
        if (q.e(motionEvent) && this.d()) {
            this.a();
        }
        return false;
    }

    @Override
    public boolean d() {
        return this.a;
    }

    @Override
    public void e(boolean bl) {
        throw new UnsupportedOperationException("Wrap me in an InterceptFilter.");
    }

    void f() {
        this.a = true;
    }
}

