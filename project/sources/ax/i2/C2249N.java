package ax.i2;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;
import ax.c0.C1760d0;

/* renamed from: ax.i2.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2249N extends AbstractC2250a {
    private final float a;
    private final c b;
    private final Runnable c;
    private Point d;
    private Point e;
    private boolean f;

    /* renamed from: ax.i2.N$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2249N.this.f();
        }
    }

    /* renamed from: ax.i2.N$b */
    private static final class b extends c {
        private final RecyclerView a;

        b(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override // ax.i2.C2249N.c
        int a() {
            Rect rect = new Rect();
            this.a.getGlobalVisibleRect(rect);
            return rect.height();
        }

        @Override // ax.i2.C2249N.c
        void b(Runnable runnable) {
            this.a.removeCallbacks(runnable);
        }

        @Override // ax.i2.C2249N.c
        void c(Runnable runnable) {
            C1760d0.d0(this.a, runnable);
        }

        @Override // ax.i2.C2249N.c
        void d(int i) {
            this.a.J0(0, i);
        }
    }

    /* renamed from: ax.i2.N$c */
    static abstract class c {
        c() {
        }

        abstract int a();

        abstract void b(Runnable runnable);

        abstract void c(Runnable runnable);

        abstract void d(int i);
    }

    C2249N(c cVar) {
        this(cVar, 0.125f);
    }

    private boolean c(Point point) {
        float a2 = this.b.a();
        float f = this.a;
        return Math.abs(this.d.y - point.y) >= ((int) ((a2 * f) * (f * 2.0f)));
    }

    static c e(RecyclerView recyclerView) {
        return new b(recyclerView);
    }

    private float g(float f) {
        return (float) Math.pow(f, 10.0d);
    }

    @Override // ax.i2.AbstractC2250a
    public void a() {
        this.b.b(this.c);
        this.d = null;
        this.e = null;
        this.f = false;
    }

    @Override // ax.i2.AbstractC2250a
    public void b(Point point) {
        this.e = point;
        if (this.d == null) {
            this.d = point;
        }
        this.b.c(this.c);
    }

    int d(int i) {
        int a2 = (int) (this.b.a() * this.a);
        int signum = (int) Math.signum(i);
        int g = (int) (signum * 70 * g(Math.min(1.0f, Math.abs(i) / a2)));
        return g != 0 ? g : signum;
    }

    void f() {
        int a2 = (int) (this.b.a() * this.a);
        int i = this.e.y;
        int a3 = i <= a2 ? i - a2 : i >= this.b.a() - a2 ? (this.e.y - this.b.a()) + a2 : 0;
        if (a3 == 0) {
            return;
        }
        if (this.f || c(this.e)) {
            this.f = true;
            if (a3 <= a2) {
                a2 = a3;
            }
            this.b.d(d(a2));
            this.b.b(this.c);
            this.b.c(this.c);
        }
    }

    C2249N(c cVar, float f) {
        C1446g.a(cVar != null);
        this.b = cVar;
        this.a = f;
        this.c = new a();
    }
}
