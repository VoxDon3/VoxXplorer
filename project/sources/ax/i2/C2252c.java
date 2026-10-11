package ax.i2;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;
import ax.i2.AbstractC2244I;
import ax.i2.C2263n;
import java.util.Set;

/* renamed from: ax.i2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2252c<K> implements RecyclerView.t, InterfaceC2238C {
    private final AbstractC0333c<K> a;
    private final p<K> b;
    final AbstractC2244I<K> c;
    private final AbstractC2251b d;
    private final AbstractC2259j<K> e;
    private final x f;
    private final AbstractC2250a g;
    private final C2263n.f<K> h;
    private Point i;
    private Point j;
    private C2263n<K> k;

    /* renamed from: ax.i2.c$a */
    class a extends RecyclerView.u {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            C2252c.this.i(recyclerView, i, i2);
        }
    }

    /* renamed from: ax.i2.c$b */
    class b extends C2263n.f<K> {
        b() {
        }

        @Override // ax.i2.C2263n.f
        public void a(Set<K> set) {
            C2252c.this.c.q(set);
        }
    }

    /* renamed from: ax.i2.c$c, reason: collision with other inner class name */
    static abstract class AbstractC0333c<K> {
        AbstractC0333c() {
        }

        abstract void a(RecyclerView.u uVar);

        abstract C2263n<K> b();

        abstract void c();

        abstract void d(Rect rect);
    }

    C2252c(AbstractC0333c<K> abstractC0333c, AbstractC2250a abstractC2250a, p<K> pVar, AbstractC2244I<K> abstractC2244I, AbstractC2251b abstractC2251b, AbstractC2259j<K> abstractC2259j, x xVar) {
        C1446g.a(abstractC0333c != null);
        C1446g.a(abstractC2250a != null);
        C1446g.a(pVar != null);
        C1446g.a(abstractC2244I != null);
        C1446g.a(abstractC2251b != null);
        C1446g.a(abstractC2259j != null);
        C1446g.a(xVar != null);
        this.a = abstractC0333c;
        this.b = pVar;
        this.c = abstractC2244I;
        this.d = abstractC2251b;
        this.e = abstractC2259j;
        this.f = xVar;
        abstractC0333c.a(new a());
        this.g = abstractC2250a;
        this.h = new b();
    }

    static <K> C2252c<K> f(RecyclerView recyclerView, AbstractC2250a abstractC2250a, int i, p<K> pVar, AbstractC2244I<K> abstractC2244I, AbstractC2244I.c<K> cVar, AbstractC2251b abstractC2251b, AbstractC2259j<K> abstractC2259j, x xVar) {
        return new C2252c<>(new C2253d(recyclerView, i, pVar, cVar), abstractC2250a, pVar, abstractC2244I, abstractC2251b, abstractC2259j, xVar);
    }

    private void g() {
        int j = this.k.j();
        if (j != -1 && this.c.m(this.b.a(j))) {
            this.c.c(j);
        }
        this.c.n();
        this.f.g();
        this.a.c();
        C2263n<K> c2263n = this.k;
        if (c2263n != null) {
            c2263n.w();
            this.k.p();
        }
        this.k = null;
        this.j = null;
        this.g.a();
    }

    private boolean h() {
        return this.k != null;
    }

    private void j() {
        if (this.j == null || this.i == null) {
            return;
        }
        this.a.d(new Rect(Math.min(this.j.x, this.i.x), Math.min(this.j.y, this.i.y), Math.max(this.j.x, this.i.x), Math.max(this.j.y, this.i.y)));
    }

    private boolean k(MotionEvent motionEvent) {
        return q.m(motionEvent) && q.f(motionEvent) && this.d.a(motionEvent) && !h();
    }

    private boolean l(MotionEvent motionEvent) {
        return h() && q.g(motionEvent);
    }

    private void m(MotionEvent motionEvent) {
        if (!q.j(motionEvent)) {
            this.c.e();
        }
        Point b2 = q.b(motionEvent);
        C2263n<K> b3 = this.a.b();
        this.k = b3;
        b3.a(this.h);
        this.f.f();
        this.e.a();
        this.j = b2;
        this.i = b2;
        this.k.v(b2);
    }

    @Override // ax.i2.InterfaceC2238C
    public void a() {
        if (h()) {
            this.a.c();
            C2263n<K> c2263n = this.k;
            if (c2263n != null) {
                c2263n.w();
                this.k.p();
            }
            this.k = null;
            this.j = null;
            this.g.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (l(motionEvent)) {
            g();
            return;
        }
        if (h()) {
            Point b2 = q.b(motionEvent);
            this.i = b2;
            this.k.u(b2);
            j();
            this.g.b(this.i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (k(motionEvent)) {
            m(motionEvent);
        } else if (l(motionEvent)) {
            g();
        }
        return h();
    }

    @Override // ax.i2.InterfaceC2238C
    public boolean d() {
        return h();
    }

    void i(RecyclerView recyclerView, int i, int i2) {
        if (h()) {
            Point point = this.j;
            if (point == null) {
                Log.e("BandSelectionHelper", "onScrolled called while mOrigin null.");
            } else if (this.i == null) {
                Log.e("BandSelectionHelper", "onScrolled called while mCurrentPosition null.");
            } else {
                point.y -= i2;
                j();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z) {
    }
}
