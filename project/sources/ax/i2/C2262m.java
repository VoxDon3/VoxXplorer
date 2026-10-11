package ax.i2;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;
import ax.i2.AbstractC2244I;

/* renamed from: ax.i2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2262m implements RecyclerView.t, InterfaceC2238C {
    private final AbstractC2244I<?> a;
    private final AbstractC2244I.c<?> b;
    private final AbstractC2250a c;
    private final b d;
    private final x e;
    private boolean f = false;

    /* renamed from: ax.i2.m$a */
    static final class a extends b {
        private final RecyclerView a;

        a(RecyclerView recyclerView) {
            C1446g.a(recyclerView != null);
            this.a = recyclerView;
        }

        static boolean b(int i, int i2, int i3, MotionEvent motionEvent, int i4) {
            return i4 == 0 ? motionEvent.getX() > ((float) i3) && motionEvent.getY() > ((float) i) : motionEvent.getX() < ((float) i2) && motionEvent.getY() > ((float) i);
        }

        @Override // ax.i2.C2262m.b
        int a(MotionEvent motionEvent) {
            View O = this.a.getLayoutManager().O(this.a.getLayoutManager().P() - 1);
            boolean b = b(O.getTop(), O.getLeft(), O.getRight(), motionEvent, this.a.getLayoutDirection());
            float i = C2262m.i(this.a.getHeight(), motionEvent.getY());
            if (b) {
                return this.a.getAdapter().l() - 1;
            }
            RecyclerView recyclerView = this.a;
            return recyclerView.k0(recyclerView.X(motionEvent.getX(), i));
        }
    }

    /* renamed from: ax.i2.m$b */
    static abstract class b {
        b() {
        }

        abstract int a(MotionEvent motionEvent);
    }

    C2262m(AbstractC2244I<?> abstractC2244I, AbstractC2244I.c<?> cVar, b bVar, AbstractC2250a abstractC2250a, x xVar) {
        C1446g.a(abstractC2244I != null);
        C1446g.a(cVar != null);
        C1446g.a(bVar != null);
        C1446g.a(abstractC2250a != null);
        C1446g.a(xVar != null);
        this.a = abstractC2244I;
        this.b = cVar;
        this.d = bVar;
        this.c = abstractC2250a;
        this.e = xVar;
    }

    static C2262m f(AbstractC2244I<?> abstractC2244I, AbstractC2244I.c<?> cVar, RecyclerView recyclerView, AbstractC2250a abstractC2250a, x xVar) {
        return new C2262m(abstractC2244I, cVar, new a(recyclerView), abstractC2250a, xVar);
    }

    private void g() {
        this.f = false;
        this.c.a();
        this.e.g();
    }

    private void h(int i) {
        this.a.g(i);
    }

    static float i(float f, float f2) {
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2 > f ? f : f2;
    }

    private void j(MotionEvent motionEvent) {
        if (!this.f) {
            Log.e("GestureSelectionHelper", "Received event while not started.");
        }
        int a2 = this.d.a(motionEvent);
        if (this.b.b(a2, true)) {
            h(a2);
        }
        this.c.b(q.b(motionEvent));
    }

    private void k() {
        this.a.n();
        g();
    }

    @Override // ax.i2.InterfaceC2238C
    public void a() {
        this.f = false;
        this.c.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f) {
            if (!this.a.l()) {
                Log.e("GestureSelectionHelper", "Internal state of GestureSelectionHelper out of sync w/ SelectionTracker (isRangeActive is false). Ignoring event and resetting state.");
                g();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                k();
            } else {
                if (actionMasked != 2) {
                    return;
                }
                j(motionEvent);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f) {
            b(recyclerView, motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 2) {
            return this.f;
        }
        return false;
    }

    @Override // ax.i2.InterfaceC2238C
    public boolean d() {
        return this.f;
    }

    void l() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.e.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z) {
    }
}
