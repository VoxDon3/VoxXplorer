package ax.i2;

import android.util.Log;
import android.view.MotionEvent;
import ax.b0.C1446g;
import ax.i2.AbstractC2264o;

/* loaded from: classes.dex */
final class s<K> extends r<K> {
    private final AbstractC2264o<K> d;
    private final u e;
    private final w<K> f;
    private final AbstractC2259j<K> g;
    private boolean h;
    private boolean i;

    s(AbstractC2244I<K> abstractC2244I, p<K> pVar, AbstractC2264o<K> abstractC2264o, u uVar, w<K> wVar, AbstractC2259j<K> abstractC2259j) {
        super(abstractC2244I, pVar, abstractC2259j);
        C1446g.a(abstractC2264o != null);
        C1446g.a(uVar != null);
        C1446g.a(wVar != null);
        this.d = abstractC2264o;
        this.e = uVar;
        this.f = wVar;
        this.g = abstractC2259j;
    }

    private void h(MotionEvent motionEvent, AbstractC2264o.a<K> aVar) {
        if (!this.a.k()) {
            Log.e("MouseInputHandler", "Call to onItemClick w/o selection.");
            return;
        }
        C1446g.a(aVar != null);
        if (g(motionEvent)) {
            a(aVar);
            return;
        }
        if (f(motionEvent, aVar)) {
            this.a.e();
        }
        if (!this.a.m(aVar.b())) {
            j(aVar, motionEvent);
        } else if (this.a.f(aVar.b())) {
            this.g.a();
        }
    }

    private boolean i(MotionEvent motionEvent) {
        AbstractC2264o.a<K> a;
        if (this.d.f(motionEvent) && (a = this.d.a(motionEvent)) != null && !this.a.m(a.b())) {
            this.a.e();
            e(a);
        }
        return this.e.onContextClick(motionEvent);
    }

    private void j(AbstractC2264o.a<K> aVar, MotionEvent motionEvent) {
        if (aVar.e(motionEvent) || q.j(motionEvent)) {
            e(aVar);
        } else {
            b(aVar);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        AbstractC2264o.a<K> a;
        this.h = false;
        return this.d.f(motionEvent) && !q.p(motionEvent) && (a = this.d.a(motionEvent)) != null && this.f.a(a, motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if ((!q.h(motionEvent) || !q.m(motionEvent)) && !q.n(motionEvent)) {
            return false;
        }
        this.i = true;
        return i(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return !q.q(motionEvent2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        AbstractC2264o.a<K> a;
        if (this.h) {
            this.h = false;
            return false;
        }
        if (this.a.k() || !this.d.e(motionEvent) || q.p(motionEvent) || (a = this.d.a(motionEvent)) == null || !a.c()) {
            return false;
        }
        if (!this.g.d() || !q.o(motionEvent)) {
            j(a, motionEvent);
            return true;
        }
        this.a.r(this.g.c());
        this.a.h(a.a());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.i) {
            this.i = false;
            return false;
        }
        if (!this.d.f(motionEvent)) {
            this.a.e();
            this.g.a();
            return false;
        }
        if (q.p(motionEvent) || !this.a.k()) {
            return false;
        }
        h(motionEvent, this.d.a(motionEvent));
        this.h = true;
        return true;
    }
}
