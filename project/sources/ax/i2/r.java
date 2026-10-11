package ax.i2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import ax.b0.C1446g;
import ax.i2.AbstractC2264o;

/* loaded from: classes.dex */
abstract class r<K> extends GestureDetector.SimpleOnGestureListener {
    protected final AbstractC2244I<K> a;
    private final p<K> b;
    private final AbstractC2259j<K> c;

    r(AbstractC2244I<K> abstractC2244I, p<K> pVar, AbstractC2259j<K> abstractC2259j) {
        C1446g.a(abstractC2244I != null);
        C1446g.a(pVar != null);
        C1446g.a(abstractC2259j != null);
        this.a = abstractC2244I;
        this.b = pVar;
        this.c = abstractC2259j;
    }

    static boolean c(AbstractC2264o.a<?> aVar) {
        return (aVar == null || aVar.a() == -1) ? false : true;
    }

    static boolean d(AbstractC2264o.a<?> aVar) {
        return (aVar == null || aVar.b() == null) ? false : true;
    }

    protected final void a(AbstractC2264o.a<K> aVar) {
        C1446g.i(this.b.c(0));
        C1446g.a(c(aVar));
        C1446g.a(d(aVar));
        this.a.h(aVar.a());
        this.c.b(aVar);
    }

    protected final boolean b(AbstractC2264o.a<K> aVar) {
        C1446g.a(aVar != null);
        C1446g.a(d(aVar));
        this.a.e();
        this.c.b(aVar);
        return true;
    }

    final boolean e(AbstractC2264o.a<K> aVar) {
        C1446g.a(aVar != null);
        C1446g.a(c(aVar));
        C1446g.a(d(aVar));
        if (this.a.o(aVar.b())) {
            this.a.c(aVar.a());
        }
        if (this.a.j().size() == 1) {
            this.c.b(aVar);
        } else {
            this.c.a();
        }
        return true;
    }

    boolean f(MotionEvent motionEvent, AbstractC2264o.a<K> aVar) {
        return (q.j(motionEvent) || aVar.e(motionEvent) || this.a.m(aVar.b())) ? false : true;
    }

    final boolean g(MotionEvent motionEvent) {
        return q.o(motionEvent) && this.a.l() && this.b.c(0);
    }
}
