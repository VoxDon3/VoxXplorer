/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.MotionEvent;
import ax.b0.g;
import ax.i2.I;
import ax.i2.j;
import ax.i2.o;
import ax.i2.p;
import ax.i2.q;
import ax.i2.r;
import ax.i2.v;
import ax.i2.w;

final class M<K>
extends r<K> {
    private final o<K> d;
    private final I.c<K> e;
    private final w<K> f;
    private final v g;
    private final Runnable h;
    private final Runnable i;
    private final Runnable j;

    M(I<K> i8, p<K> p8, o<K> o8, I.c<K> c8, Runnable runnable2, v v8, w<K> w8, j<K> j8, Runnable runnable3, Runnable runnable4) {
        super(i8, p8, j8);
        boolean bl = false;
        boolean bl2 = o8 != null;
        ax.b0.g.a(bl2);
        bl2 = c8 != null;
        ax.b0.g.a(bl2);
        bl2 = runnable2 != null;
        ax.b0.g.a(bl2);
        bl2 = w8 != null;
        ax.b0.g.a(bl2);
        bl2 = v8 != null;
        ax.b0.g.a(bl2);
        bl2 = bl;
        if (runnable3 != null) {
            bl2 = true;
        }
        ax.b0.g.a(bl2);
        this.d = o8;
        this.e = c8;
        this.h = runnable2;
        this.f = w8;
        this.g = v8;
        this.i = runnable3;
        this.j = runnable4;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return q.g(motionEvent) && this.onSingleTapUp(motionEvent);
    }

    public void onLongPress(MotionEvent motionEvent) {
        o.a<K> a8;
        if (this.d.f(motionEvent) && (a8 = this.d.a(motionEvent)) != null) {
            this.j.run();
            if (this.g(motionEvent)) {
                this.a(a8);
                this.i.run();
                return;
            }
            if (this.a.m(a8.b())) {
                if (this.g.a(motionEvent)) {
                    this.i.run();
                    return;
                }
            } else if (this.e.c(a8.b(), true) && this.e(a8)) {
                if (this.e.a() && this.a.l()) {
                    this.h.run();
                }
                this.i.run();
            }
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        o.a<K> a8 = this.d.a(motionEvent);
        if (a8 != null && a8.c()) {
            if (this.a.k()) {
                if (this.g(motionEvent)) {
                    this.a(a8);
                } else if (this.a.m(a8.b())) {
                    this.a.f(a8.b());
                } else {
                    this.e(a8);
                }
                return true;
            }
            if (a8.e(motionEvent)) {
                return this.e(a8);
            }
            return this.f.a(a8, motionEvent);
        }
        return this.a.e();
    }
}

