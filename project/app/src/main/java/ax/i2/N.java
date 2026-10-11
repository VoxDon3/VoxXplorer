/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.g;
import ax.c0.d0;
import ax.i2.a;

final class N
extends a {
    private final float a;
    private final c b;
    private final Runnable c;
    private Point d;
    private Point e;
    private boolean f;

    N(c c8) {
        this(c8, 0.125f);
    }

    N(c c8, float f8) {
        boolean bl = c8 != null;
        g.a(bl);
        this.b = c8;
        this.a = f8;
        this.c = new Runnable(this){
            final N q;
            {
                this.q = n8;
            }

            @Override
            public void run() {
                this.q.f();
            }
        };
    }

    private boolean c(Point point) {
        float f8 = this.b.a();
        float f9 = this.a;
        int n8 = (int)(f8 * f9 * (f9 * 2.0f));
        return Math.abs(this.d.y - point.y) >= n8;
    }

    static c e(RecyclerView recyclerView) {
        return new b(recyclerView);
    }

    private float g(float f8) {
        return (float)Math.pow(f8, 10.0);
    }

    @Override
    public void a() {
        this.b.b(this.c);
        this.d = null;
        this.e = null;
        this.f = false;
    }

    @Override
    public void b(Point point) {
        this.e = point;
        if (this.d == null) {
            this.d = point;
        }
        this.b.c(this.c);
    }

    int d(int n8) {
        float f8;
        int n9 = (int)((float)this.b.a() * this.a);
        int n10 = (int)Math.signum(n8);
        if ((n8 = (int)((float)(n10 * 70) * this.g(f8 = Math.min(1.0f, (float)Math.abs(n8) / (float)n9)))) != 0) {
            return n8;
        }
        return n10;
    }

    void f() {
        int n8 = this.e.y;
        int n9 = (int)((float)this.b.a() * this.a);
        n8 = n8 <= n9 ? (n8 -= n9) : (n8 >= this.b.a() - n9 ? this.e.y - this.b.a() + n9 : 0);
        if (n8 == 0 || !this.f && !this.c(this.e)) {
            return;
        }
        this.f = true;
        if (n8 > n9) {
            n8 = n9;
        }
        n8 = this.d(n8);
        this.b.d(n8);
        this.b.b(this.c);
        this.b.c(this.c);
    }

    private static final class b
    extends c {
        private final RecyclerView a;

        b(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override
        int a() {
            Rect rect = new Rect();
            this.a.getGlobalVisibleRect(rect);
            return rect.height();
        }

        @Override
        void b(Runnable runnable2) {
            this.a.removeCallbacks(runnable2);
        }

        @Override
        void c(Runnable runnable2) {
            d0.d0((View)this.a, runnable2);
        }

        @Override
        void d(int n8) {
            this.a.J0(0, n8);
        }
    }

    static abstract class c {
        c() {
        }

        abstract int a();

        abstract void b(Runnable var1);

        abstract void c(Runnable var1);

        abstract void d(int var1);
    }
}

