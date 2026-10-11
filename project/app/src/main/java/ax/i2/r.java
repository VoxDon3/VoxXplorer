/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import ax.b0.g;
import ax.i2.I;
import ax.i2.j;
import ax.i2.o;
import ax.i2.p;
import ax.i2.q;

abstract class r<K>
extends GestureDetector.SimpleOnGestureListener {
    protected final I<K> a;
    private final p<K> b;
    private final j<K> c;

    r(I<K> i8, p<K> p8, j<K> j8) {
        boolean bl = false;
        boolean bl2 = i8 != null;
        g.a(bl2);
        bl2 = p8 != null;
        g.a(bl2);
        bl2 = bl;
        if (j8 != null) {
            bl2 = true;
        }
        g.a(bl2);
        this.a = i8;
        this.b = p8;
        this.c = j8;
    }

    static boolean c(o.a<?> a8) {
        return a8 != null && a8.a() != -1;
    }

    static boolean d(o.a<?> a8) {
        return a8 != null && a8.b() != null;
    }

    protected final void a(o.a<K> a8) {
        g.i(this.b.c(0));
        g.a(r.c(a8));
        g.a(r.d(a8));
        this.a.h(a8.a());
        this.c.b(a8);
    }

    protected final boolean b(o.a<K> a8) {
        boolean bl = a8 != null;
        g.a(bl);
        g.a(r.d(a8));
        this.a.e();
        this.c.b(a8);
        return true;
    }

    final boolean e(o.a<K> a8) {
        boolean bl = a8 != null;
        g.a(bl);
        g.a(r.c(a8));
        g.a(r.d(a8));
        if (this.a.o(a8.b())) {
            this.a.c(a8.a());
        }
        if (this.a.j().size() == 1) {
            this.c.b(a8);
        } else {
            this.c.a();
        }
        return true;
    }

    boolean f(MotionEvent motionEvent, o.a<K> a8) {
        return !q.j(motionEvent) && !a8.e(motionEvent) && !this.a.m(a8.b());
    }

    final boolean g(MotionEvent motionEvent) {
        return q.o(motionEvent) && this.a.l() && this.b.c(0);
    }
}

