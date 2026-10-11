package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ax.i2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2255f implements RecyclerView.t, InterfaceC2238C {
    private final RecyclerView.t a;
    private boolean b;

    C2255f(RecyclerView.t tVar) {
        this.a = tVar;
    }

    @Override // ax.i2.InterfaceC2238C
    public void a() {
        this.b = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.c(recyclerView, motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && q.e(motionEvent)) {
            this.b = false;
        }
        return !this.b && this.a.c(recyclerView, motionEvent);
    }

    @Override // ax.i2.InterfaceC2238C
    public boolean d() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z) {
        this.b = true;
    }
}
