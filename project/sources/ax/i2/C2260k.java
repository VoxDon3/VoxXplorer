package ax.i2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;

/* renamed from: ax.i2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2260k implements RecyclerView.t, InterfaceC2238C {
    private final GestureDetector a;
    private boolean b;

    C2260k(GestureDetector gestureDetector) {
        C1446g.a(gestureDetector != null);
        this.a = gestureDetector;
    }

    private void f() {
        this.a.onTouchEvent(q.a());
    }

    @Override // ax.i2.InterfaceC2238C
    public void a() {
        this.b = false;
        f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && q.e(motionEvent)) {
            this.b = false;
        }
        return !this.b && this.a.onTouchEvent(motionEvent);
    }

    @Override // ax.i2.InterfaceC2238C
    public boolean d() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z) {
        if (z) {
            this.b = z;
            f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
