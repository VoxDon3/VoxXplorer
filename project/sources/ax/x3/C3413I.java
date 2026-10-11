package ax.x3;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ax.i2.AbstractC2244I;
import ax.i2.AbstractC2245J;
import ax.i2.AbstractC2264o;

/* renamed from: ax.x3.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3413I {
    RecyclerView a;
    AbstractC2244I<Long> b;
    ax.i2.p<Long> c;

    /* renamed from: ax.x3.I$a */
    class a extends AbstractC2244I.c<Long> {
        final /* synthetic */ RecyclerView a;

        a(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override // ax.i2.AbstractC2244I.c
        public boolean a() {
            return true;
        }

        @Override // ax.i2.AbstractC2244I.c
        public boolean b(int i, boolean z) {
            return (i == -1 || this.a.getAdapter() == null || this.a.getAdapter().m(i) == C3411G.h) ? false : true;
        }

        @Override // ax.i2.AbstractC2244I.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(Long l, boolean z) {
            return l.longValue() != C3411G.h;
        }
    }

    /* renamed from: ax.x3.I$b */
    public static class b extends ax.i2.p<Long> {
        private final RecyclerView b;
        private final C3412H c;

        b(RecyclerView recyclerView, C3412H c3412h) {
            super(0);
            this.b = recyclerView;
            this.c = c3412h;
        }

        @Override // ax.i2.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Long a(int i) {
            if (this.b.getAdapter() == null) {
                return null;
            }
            return Long.valueOf(this.b.getAdapter().m(i));
        }

        @Override // ax.i2.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int b(Long l) {
            if (this.b.getAdapter() == null) {
                return -1;
            }
            return C3411G.h == l.longValue() ? this.b.getAdapter().l() - 1 : this.c.V(l.longValue());
        }
    }

    /* renamed from: ax.x3.I$c */
    public static class c extends AbstractC2264o<Long> {
        private RecyclerView a;

        /* renamed from: ax.x3.I$c$a */
        class a extends AbstractC2264o.a<Long> {
            final /* synthetic */ RecyclerView.F a;

            a(RecyclerView.F f) {
                this.a = f;
            }

            @Override // ax.i2.AbstractC2264o.a
            public int a() {
                return this.a.j();
            }

            @Override // ax.i2.AbstractC2264o.a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public Long b() {
                return Long.valueOf(this.a.l());
            }
        }

        public c(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override // ax.i2.AbstractC2264o
        public AbstractC2264o.a<Long> a(MotionEvent motionEvent) {
            View X = this.a.X(motionEvent.getX(), motionEvent.getY());
            if (X != null) {
                return new a(this.a.m0(X));
            }
            return null;
        }
    }

    C3413I(RecyclerView recyclerView, AbstractC2244I<Long> abstractC2244I, ax.i2.p<Long> pVar) {
        this.a = recyclerView;
        this.b = abstractC2244I;
        this.c = pVar;
    }

    public static C3413I a(RecyclerView recyclerView, C3412H c3412h) {
        b bVar = new b(recyclerView, c3412h);
        return new C3413I(recyclerView, new AbstractC2244I.a("selection-1", recyclerView, bVar, new c(recyclerView), AbstractC2245J.a()).b(new a(recyclerView)).a(), bVar);
    }

    public int b(long j) {
        return this.c.b(Long.valueOf(j));
    }

    public AbstractC2244I<Long> c() {
        return this.b;
    }
}
