/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.g;
import ax.i2.C;
import ax.i2.I;
import ax.i2.a;
import ax.i2.b;
import ax.i2.d;
import ax.i2.j;
import ax.i2.n;
import ax.i2.p;
import ax.i2.q;
import ax.i2.x;
import java.util.Set;

class c<K>
implements RecyclerView.t,
C {
    private final c<K> a;
    private final p<K> b;
    final I<K> c;
    private final b d;
    private final j<K> e;
    private final x f;
    private final a g;
    private final n.f<K> h;
    private Point i;
    private Point j;
    private n<K> k;

    c(c<K> c8, a a8, p<K> p8, I<K> i8, b b8, j<K> j8, x x8) {
        boolean bl = false;
        boolean bl2 = c8 != null;
        ax.b0.g.a(bl2);
        bl2 = a8 != null;
        ax.b0.g.a(bl2);
        bl2 = p8 != null;
        ax.b0.g.a(bl2);
        bl2 = i8 != null;
        ax.b0.g.a(bl2);
        bl2 = b8 != null;
        ax.b0.g.a(bl2);
        bl2 = j8 != null;
        ax.b0.g.a(bl2);
        bl2 = bl;
        if (x8 != null) {
            bl2 = true;
        }
        ax.b0.g.a(bl2);
        this.a = c8;
        this.b = p8;
        this.c = i8;
        this.d = b8;
        this.e = j8;
        this.f = x8;
        c8.a(new RecyclerView.u(this){
            final c a;
            {
                this.a = c8;
            }

            @Override
            public void b(RecyclerView recyclerView, int n8, int n9) {
                this.a.i(recyclerView, n8, n9);
            }
        });
        this.g = a8;
        this.h = new n.f<K>(this){
            final c a;
            {
                this.a = c8;
            }

            @Override
            public void a(Set<K> set) {
                this.a.c.q(set);
            }
        };
    }

    static <K> c<K> f(RecyclerView recyclerView, a a8, int n8, p<K> p8, I<K> i8, I.c<K> c8, b b8, j<K> j8, x x8) {
        return new c<K>(new d<K>(recyclerView, n8, p8, c8), a8, p8, i8, b8, j8, x8);
    }

    private void g() {
        int n8 = this.k.j();
        if (n8 != -1 && this.c.m(this.b.a(n8))) {
            this.c.c(n8);
        }
        this.c.n();
        this.f.g();
        this.a.c();
        n<K> n9 = this.k;
        if (n9 != null) {
            n9.w();
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
        if (this.j != null && this.i != null) {
            Rect rect = new Rect(Math.min(this.j.x, this.i.x), Math.min(this.j.y, this.i.y), Math.max(this.j.x, this.i.x), Math.max(this.j.y, this.i.y));
            this.a.d(rect);
        }
    }

    private boolean k(MotionEvent motionEvent) {
        return q.m(motionEvent) && q.f(motionEvent) && this.d.a(motionEvent) && !this.h();
    }

    private boolean l(MotionEvent motionEvent) {
        return this.h() && q.g(motionEvent);
    }

    private void m(MotionEvent object) {
        if (!q.j((MotionEvent)object)) {
            this.c.e();
        }
        Point point = q.b((MotionEvent)object);
        this.k = object = this.a.b();
        ((n)object).a(this.h);
        this.f.f();
        this.e.a();
        this.j = point;
        this.i = point;
        this.k.v(point);
    }

    @Override
    public void a() {
        if (!this.h()) {
            return;
        }
        this.a.c();
        n<K> n8 = this.k;
        if (n8 != null) {
            n8.w();
            this.k.p();
        }
        this.k = null;
        this.j = null;
        this.g.a();
    }

    @Override
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.l(motionEvent)) {
            this.g();
            return;
        }
        if (!this.h()) {
            return;
        }
        recyclerView = q.b(motionEvent);
        this.i = recyclerView;
        this.k.u((Point)recyclerView);
        this.j();
        this.g.b(this.i);
    }

    @Override
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.k(motionEvent)) {
            this.m(motionEvent);
        } else if (this.l(motionEvent)) {
            this.g();
        }
        return this.h();
    }

    @Override
    public boolean d() {
        return this.h();
    }

    @Override
    public void e(boolean bl) {
    }

    void i(RecyclerView recyclerView, int n8, int n9) {
        if (!this.h()) {
            return;
        }
        recyclerView = this.j;
        if (recyclerView == null) {
            Log.e((String)"BandSelectionHelper", (String)"onScrolled called while mOrigin null.");
            return;
        }
        if (this.i == null) {
            Log.e((String)"BandSelectionHelper", (String)"onScrolled called while mCurrentPosition null.");
            return;
        }
        ((Point)recyclerView).y -= n9;
        this.j();
    }

    static abstract class c<K> {
        c() {
        }

        abstract void a(RecyclerView.u var1);

        abstract n<K> b();

        abstract void c();

        abstract void d(Rect var1);
    }
}

