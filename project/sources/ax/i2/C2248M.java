package ax.i2;

import android.view.MotionEvent;
import ax.b0.C1446g;
import ax.i2.AbstractC2244I;
import ax.i2.AbstractC2264o;

/* renamed from: ax.i2.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2248M<K> extends r<K> {
    private final AbstractC2264o<K> d;
    private final AbstractC2244I.c<K> e;
    private final w<K> f;
    private final v g;
    private final Runnable h;
    private final Runnable i;
    private final Runnable j;

    C2248M(AbstractC2244I<K> abstractC2244I, p<K> pVar, AbstractC2264o<K> abstractC2264o, AbstractC2244I.c<K> cVar, Runnable runnable, v vVar, w<K> wVar, AbstractC2259j<K> abstractC2259j, Runnable runnable2, Runnable runnable3) {
        super(abstractC2244I, pVar, abstractC2259j);
        C1446g.a(abstractC2264o != null);
        C1446g.a(cVar != null);
        C1446g.a(runnable != null);
        C1446g.a(wVar != null);
        C1446g.a(vVar != null);
        C1446g.a(runnable2 != null);
        this.d = abstractC2264o;
        this.e = cVar;
        this.h = runnable;
        this.f = wVar;
        this.g = vVar;
        this.i = runnable2;
        this.j = runnable3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return q.g(motionEvent) && onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        AbstractC2264o.a<K> a;
        if (this.d.f(motionEvent) && (a = this.d.a(motionEvent)) != null) {
            this.j.run();
            if (g(motionEvent)) {
                a(a);
                this.i.run();
                return;
            }
            if (this.a.m(a.b())) {
                if (this.g.a(motionEvent)) {
                    this.i.run();
                }
            } else if (this.e.c(a.b(), true) && e(a)) {
                if (this.e.a() && this.a.l()) {
                    this.h.run();
                }
                this.i.run();
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        AbstractC2264o.a<K> a = this.d.a(motionEvent);
        if (a == null || !a.c()) {
            return this.a.e();
        }
        if (!this.a.k()) {
            return a.e(motionEvent) ? e(a) : this.f.a(a, motionEvent);
        }
        if (g(motionEvent)) {
            a(a);
            return true;
        }
        if (this.a.m(a.b())) {
            this.a.f(a.b());
            return true;
        }
        e(a);
        return true;
    }
}
