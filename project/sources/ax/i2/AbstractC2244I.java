package ax.i2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;
import ax.b0.InterfaceC1440a;
import ax.i2.AbstractC2251b;
import ax.i2.AbstractC2264o;
import j$.util.Objects;
import java.util.Set;

/* renamed from: ax.i2.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2244I<K> {

    /* renamed from: ax.i2.I$a */
    public static final class a<K> {
        final RecyclerView a;
        private final RecyclerView.h<?> b;
        private final Context c;
        private final String d;
        private final AbstractC2245J<K> e;
        private p<K> h;
        private AbstractC2264o<K> i;
        private w<K> k;
        private v l;
        private u m;
        private AbstractC2251b n;
        c<K> f = C2240E.a();
        private x g = new x();
        private AbstractC2259j<K> j = AbstractC2259j.e();
        private int o = z.a;
        private int[] p = {1};
        private int[] q = {3};

        /* renamed from: ax.i2.I$a$a, reason: collision with other inner class name */
        class C0332a implements v {
            C0332a() {
            }

            @Override // ax.i2.v
            public boolean a(MotionEvent motionEvent) {
                return false;
            }
        }

        /* renamed from: ax.i2.I$a$b */
        class b implements w<K> {
            b() {
            }

            @Override // ax.i2.w
            public boolean a(AbstractC2264o.a<K> aVar, MotionEvent motionEvent) {
                return false;
            }
        }

        /* renamed from: ax.i2.I$a$c */
        class c implements u {
            c() {
            }

            @Override // ax.i2.u
            public boolean onContextClick(MotionEvent motionEvent) {
                return false;
            }
        }

        /* renamed from: ax.i2.I$a$d */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.performHapticFeedback(0);
            }
        }

        public a(String str, RecyclerView recyclerView, p<K> pVar, AbstractC2264o<K> abstractC2264o, AbstractC2245J<K> abstractC2245J) {
            C1446g.a(str != null);
            C1446g.a(!str.trim().isEmpty());
            C1446g.a(recyclerView != null);
            this.d = str;
            this.a = recyclerView;
            this.c = recyclerView.getContext();
            RecyclerView.h<?> adapter = recyclerView.getAdapter();
            this.b = adapter;
            C1446g.a(adapter != null);
            C1446g.a(pVar != null);
            C1446g.a(abstractC2264o != null);
            C1446g.a(abstractC2245J != null);
            this.i = abstractC2264o;
            this.h = pVar;
            this.e = abstractC2245J;
            this.n = new AbstractC2251b.a(recyclerView, abstractC2264o);
        }

        public AbstractC2244I<K> a() {
            C2252c c2252c;
            C2254e c2254e = new C2254e(this.d, this.h, this.f, this.e);
            RecyclerView.h<?> hVar = this.b;
            p<K> pVar = this.h;
            final RecyclerView recyclerView = this.a;
            Objects.requireNonNull(recyclerView);
            C2257h.a(hVar, c2254e, pVar, new InterfaceC1440a() { // from class: ax.i2.F
                @Override // ax.b0.InterfaceC1440a
                public final void accept(Object obj) {
                    RecyclerView.this.post((Runnable) obj);
                }
            });
            C2249N c2249n = new C2249N(C2249N.e(this.a));
            GestureDetectorOnGestureListenerC2261l gestureDetectorOnGestureListenerC2261l = new GestureDetectorOnGestureListenerC2261l();
            GestureDetector gestureDetector = new GestureDetector(this.c, gestureDetectorOnGestureListenerC2261l);
            final C2262m f = C2262m.f(c2254e, this.f, this.a, c2249n, this.g);
            C2258i c2258i = new C2258i();
            C2260k c2260k = new C2260k(gestureDetector);
            C2258i c2258i2 = new C2258i();
            final C2256g c2256g = new C2256g();
            C2255f c2255f = new C2255f(c2256g);
            c2258i2.f(1, c2255f);
            this.a.m(c2258i);
            this.a.m(c2260k);
            this.a.m(c2258i2);
            C2237B c2237b = new C2237B();
            c2254e.b(c2237b.d());
            c2258i.f(0, c2237b.c());
            c2237b.a(c2254e);
            c2237b.a(this.g.a());
            c2237b.a(f);
            c2237b.a(c2260k);
            c2237b.a(c2258i);
            c2237b.a(c2258i2);
            c2237b.a(c2256g);
            c2237b.a(c2255f);
            v vVar = this.l;
            if (vVar == null) {
                vVar = new C0332a();
            }
            this.l = vVar;
            w<K> wVar = this.k;
            if (wVar == null) {
                wVar = new b();
            }
            this.k = wVar;
            u uVar = this.m;
            if (uVar == null) {
                uVar = new c();
            }
            this.m = uVar;
            p<K> pVar2 = this.h;
            AbstractC2264o<K> abstractC2264o = this.i;
            c<K> cVar = this.f;
            Objects.requireNonNull(f);
            C2248M c2248m = new C2248M(c2254e, pVar2, abstractC2264o, cVar, new Runnable() { // from class: ax.i2.G
                @Override // java.lang.Runnable
                public final void run() {
                    C2262m.this.l();
                }
            }, this.l, this.k, this.j, new d(), new Runnable() { // from class: ax.i2.H
                @Override // java.lang.Runnable
                public final void run() {
                    C2256g.this.f();
                }
            });
            for (int i : this.p) {
                gestureDetectorOnGestureListenerC2261l.a(i, c2248m);
                c2258i.f(i, f);
            }
            s sVar = new s(c2254e, this.h, this.i, this.m, this.k, this.j);
            for (int i2 : this.q) {
                gestureDetectorOnGestureListenerC2261l.a(i2, sVar);
            }
            if (this.h.c(0) && this.f.a()) {
                c2252c = C2252c.f(this.a, c2249n, this.o, this.h, c2254e, this.f, this.n, this.j, this.g);
                c2254e = c2254e;
                c2237b.a(c2252c);
            } else {
                c2252c = null;
            }
            c2258i.f(3, new y(this.i, this.l, c2252c));
            return c2254e;
        }

        public a<K> b(c<K> cVar) {
            C1446g.a(cVar != null);
            this.f = cVar;
            return this;
        }
    }

    /* renamed from: ax.i2.I$c */
    public static abstract class c<K> {
        public abstract boolean a();

        public abstract boolean b(int i, boolean z);

        public abstract boolean c(K k, boolean z);
    }

    public abstract void b(b<K> bVar);

    public abstract void c(int i);

    public abstract boolean e();

    public abstract boolean f(K k);

    protected abstract void g(int i);

    public abstract void h(int i);

    protected abstract RecyclerView.j i();

    public abstract C2239D<K> j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m(K k);

    protected abstract void n();

    public abstract boolean o(K k);

    @SuppressLint({"LambdaLast"})
    public abstract boolean p(Iterable<K> iterable, boolean z);

    protected abstract void q(Set<K> set);

    public abstract void r(int i);

    /* renamed from: ax.i2.I$b */
    public static abstract class b<K> {
        public void b() {
        }

        protected void c() {
        }

        public void d() {
        }

        public void a(K k, boolean z) {
        }
    }
}
