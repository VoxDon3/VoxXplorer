package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;

/* loaded from: classes.dex */
final class y implements RecyclerView.t {
    private final AbstractC2264o<?> a;
    private final v b;
    private RecyclerView.t c;

    y(AbstractC2264o<?> abstractC2264o, v vVar, RecyclerView.t tVar) {
        C1446g.a(abstractC2264o != null);
        C1446g.a(vVar != null);
        this.a = abstractC2264o;
        this.b = vVar;
        if (tVar != null) {
            this.c = tVar;
        } else {
            this.c = new C2246K();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.c.b(recyclerView, motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        return (q.l(motionEvent) && this.a.d(motionEvent)) ? this.b.a(motionEvent) : this.c.c(recyclerView, motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z) {
        this.c.e(z);
    }
}
