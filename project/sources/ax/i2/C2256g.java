package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ax.i2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2256g implements RecyclerView.t, InterfaceC2238C {
    private boolean a;

    C2256g() {
    }

    @Override // ax.i2.InterfaceC2238C
    public void a() {
        this.a = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (q.g(motionEvent) && this.a) {
            this.a = false;
            return true;
        }
        if (q.e(motionEvent) && d()) {
            a();
        }
        return false;
    }

    @Override // ax.i2.InterfaceC2238C
    public boolean d() {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z) {
        throw new UnsupportedOperationException("Wrap me in an InterceptFilter.");
    }

    void f() {
        this.a = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
