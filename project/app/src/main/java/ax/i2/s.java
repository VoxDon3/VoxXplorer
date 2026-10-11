/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.util.Log;
import android.view.MotionEvent;
import ax.b0.g;
import ax.i2.I;
import ax.i2.j;
import ax.i2.o;
import ax.i2.p;
import ax.i2.q;
import ax.i2.r;
import ax.i2.u;
import ax.i2.w;

final class s<K>
extends r<K> {
    private final o<K> d;
    private final u e;
    private final w<K> f;
    private final j<K> g;
    private boolean h;
    private boolean i;

    s(I<K> i8, p<K> p8, o<K> o8, u u8, w<K> w8, j<K> j8) {
        super(i8, p8, j8);
        boolean bl = false;
        boolean bl2 = o8 != null;
        ax.b0.g.a(bl2);
        bl2 = u8 != null;
        ax.b0.g.a(bl2);
        bl2 = bl;
        if (w8 != null) {
            bl2 = true;
        }
        ax.b0.g.a(bl2);
        this.d = o8;
        this.e = u8;
        this.f = w8;
        this.g = j8;
    }

    private void h(MotionEvent motionEvent, o.a<K> a8) {
        if (!this.a.k()) {
            Log.e((String)"MouseInputHandler", (String)"Call to onItemClick w/o selection.");
            return;
        }
        boolean bl = a8 != null;
        ax.b0.g.a(bl);
        if (this.g(motionEvent)) {
            this.a(a8);
            return;
        }
        if (this.f(motionEvent, a8)) {
            this.a.e();
        }
        if (this.a.m(a8.b())) {
            if (this.a.f(a8.b())) {
                this.g.a();
            }
            return;
        }
        this.j(a8, motionEvent);
    }

    private boolean i(MotionEvent motionEvent) {
        o.a<K> a8;
        if (this.d.f(motionEvent) && (a8 = this.d.a(motionEvent)) != null && !this.a.m(a8.b())) {
            this.a.e();
            this.e(a8);
        }
        return this.e.onContextClick(motionEvent);
    }

    private void j(o.a<K> a8, MotionEvent motionEvent) {
        if (!a8.e(motionEvent) && !q.j(motionEvent)) {
            this.b(a8);
            return;
        }
        this.e(a8);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.h = false;
        if (!this.d.f(motionEvent)) {
            return false;
        }
        if (q.p(motionEvent)) {
            return false;
        }
        o.a<K> a8 = this.d.a(motionEvent);
        return a8 != null && this.f.a(a8, motionEvent);
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (q.h(motionEvent) && q.m(motionEvent) || q.n(motionEvent)) {
            this.i = true;
            return this.i(motionEvent);
        }
        return false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        return q.q(motionEvent2) ^ true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.h) {
            this.h = false;
            return false;
        }
        if (this.a.k()) {
            return false;
        }
        if (!this.d.e(motionEvent)) {
            return false;
        }
        if (q.p(motionEvent)) {
            return false;
        }
        o.a<K> a8 = this.d.a(motionEvent);
        if (a8 != null && a8.c()) {
            if (this.g.d() && q.o(motionEvent)) {
                this.a.r(this.g.c());
                this.a.h(a8.a());
            } else {
                this.j(a8, motionEvent);
            }
            return true;
        }
        return false;
    }

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
        if (q.p(motionEvent)) {
            return false;
        }
        if (this.a.k()) {
            this.h(motionEvent, this.d.a(motionEvent));
            this.h = true;
            return true;
        }
        return false;
    }
}

