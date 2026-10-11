/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.util.Log;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.g;
import ax.i2.C;
import ax.i2.I;
import ax.i2.q;
import ax.i2.x;

final class m
implements RecyclerView.t,
C {
    private final I<?> a;
    private final I.c<?> b;
    private final ax.i2.a c;
    private final b d;
    private final x e;
    private boolean f;

    m(I<?> i8, I.c<?> c8, b b8, ax.i2.a a8, x x8) {
        boolean bl = false;
        this.f = false;
        boolean bl2 = i8 != null;
        g.a(bl2);
        bl2 = c8 != null;
        g.a(bl2);
        bl2 = b8 != null;
        g.a(bl2);
        bl2 = a8 != null;
        g.a(bl2);
        bl2 = bl;
        if (x8 != null) {
            bl2 = true;
        }
        g.a(bl2);
        this.a = i8;
        this.b = c8;
        this.d = b8;
        this.c = a8;
        this.e = x8;
    }

    static m f(I<?> i8, I.c<?> c8, RecyclerView recyclerView, ax.i2.a a8, x x8) {
        return new m(i8, c8, new a(recyclerView), a8, x8);
    }

    private void g() {
        this.f = false;
        this.c.a();
        this.e.g();
    }

    private void h(int n8) {
        this.a.g(n8);
    }

    static float i(float f8, float f9) {
        if (f9 < 0.0f) {
            return 0.0f;
        }
        if (f9 > f8) {
            return f8;
        }
        return f9;
    }

    private void j(MotionEvent motionEvent) {
        int n8;
        if (!this.f) {
            Log.e((String)"GestureSelectionHelper", (String)"Received event while not started.");
        }
        if (this.b.b(n8 = this.d.a(motionEvent), true)) {
            this.h(n8);
        }
        this.c.b(q.b(motionEvent));
    }

    private void k() {
        this.a.n();
        this.g();
    }

    @Override
    public void a() {
        this.f = false;
        this.c.a();
    }

    @Override
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        block5: {
            block6: {
                block4: {
                    int n8;
                    if (!this.f) break block4;
                    if (!this.a.l()) {
                        Log.e((String)"GestureSelectionHelper", (String)"Internal state of GestureSelectionHelper out of sync w/ SelectionTracker (isRangeActive is false). Ignoring event and resetting state.");
                        this.g();
                    }
                    if ((n8 = motionEvent.getActionMasked()) == 1) break block5;
                    if (n8 == 2) break block6;
                }
                return;
            }
            this.j(motionEvent);
            return;
        }
        this.k();
    }

    @Override
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int n8;
        if (this.f) {
            this.b(recyclerView, motionEvent);
        }
        if ((n8 = motionEvent.getActionMasked()) != 1 && n8 != 2) {
            return false;
        }
        return this.f;
    }

    @Override
    public boolean d() {
        return this.f;
    }

    @Override
    public void e(boolean bl) {
    }

    void l() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.e.f();
    }

    static final class a
    extends b {
        private final RecyclerView a;

        a(RecyclerView recyclerView) {
            boolean bl = recyclerView != null;
            g.a(bl);
            this.a = recyclerView;
        }

        static boolean b(int n8, int n9, int n10, MotionEvent motionEvent, int n11) {
            if (n11 == 0) {
                return motionEvent.getX() > (float)n10 && motionEvent.getY() > (float)n8;
            }
            return motionEvent.getX() < (float)n9 && motionEvent.getY() > (float)n8;
        }

        @Override
        int a(MotionEvent motionEvent) {
            Object object = this.a.getLayoutManager().O(this.a.getLayoutManager().P() - 1);
            int n8 = this.a.getLayoutDirection();
            boolean bl = ax.i2.m$a.b(object.getTop(), object.getLeft(), object.getRight(), motionEvent, n8);
            float f8 = m.i(this.a.getHeight(), motionEvent.getY());
            if (bl) {
                return this.a.getAdapter().l() - 1;
            }
            object = this.a;
            return ((RecyclerView)object).k0(((RecyclerView)object).X(motionEvent.getX(), f8));
        }
    }

    static abstract class b {
        b() {
        }

        abstract int a(MotionEvent var1);
    }
}

