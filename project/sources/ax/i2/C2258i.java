package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;

/* renamed from: ax.i2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2258i implements RecyclerView.t, InterfaceC2238C {
    private final C2247L<RecyclerView.t> a = new C2247L<>(new C2246K());
    private boolean b;

    C2258i() {
    }

    @Override // ax.i2.InterfaceC2238C
    public void a() {
        this.b = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b) {
            return;
        }
        this.a.a(motionEvent).b(recyclerView, motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && q.e(motionEvent)) {
            this.b = false;
        }
        return !this.b && this.a.a(motionEvent).c(recyclerView, motionEvent);
    }

    @Override // ax.i2.InterfaceC2238C
    public boolean d() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z) {
        if (z) {
            this.b = z;
        }
    }

    void f(int i, RecyclerView.t tVar) {
        C1446g.a(tVar != null);
        this.a.b(i, tVar);
    }
}
