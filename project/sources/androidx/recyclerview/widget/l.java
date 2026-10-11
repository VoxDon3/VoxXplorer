package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class l extends RecyclerView.A {

    @SuppressLint({"UnknownNullness"})
    protected PointF k;
    private final DisplayMetrics l;
    private float n;
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    private boolean m = false;
    protected int o = 0;
    protected int p = 0;

    @SuppressLint({"UnknownNullness"})
    public l(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.m) {
            this.n = v(this.l);
            this.m = true;
        }
        return this.n;
    }

    private int y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected int B() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    @SuppressLint({"UnknownNullness"})
    protected void C(RecyclerView.A.a aVar) {
        PointF a = a(f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a);
        this.k = a;
        this.o = (int) (a.x * 10000.0f);
        this.p = (int) (a.y * 10000.0f);
        aVar.d((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (x(10000) * 1.2f), this.i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    @SuppressLint({"UnknownNullness"})
    protected void l(int i, int i2, RecyclerView.B b, RecyclerView.A.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.o = y(this.o, i);
        int y = y(this.p, i2);
        this.p = y;
        if (this.o == 0 && y == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void n() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    @SuppressLint({"UnknownNullness"})
    protected void o(View view, RecyclerView.B b, RecyclerView.A.a aVar) {
        int t = t(view, z());
        int u = u(view, B());
        int w = w((int) Math.sqrt((t * t) + (u * u)));
        if (w > 0) {
            aVar.d(-t, -u, w, this.j);
        }
    }

    public int s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int t(View view, int i) {
        RecyclerView.p e = e();
        if (e == null || !e.q()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e.W(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, e.Z(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, e.j0(), e.t0() - e.k0(), i);
    }

    @SuppressLint({"UnknownNullness"})
    public int u(View view, int i) {
        RecyclerView.p e = e();
        if (e == null || !e.r()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e.a0(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, e.U(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, e.l0(), e.c0() - e.i0(), i);
    }

    @SuppressLint({"UnknownNullness"})
    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i) {
        return (int) Math.ceil(x(i) / 0.3356d);
    }

    protected int x(int i) {
        return (int) Math.ceil(Math.abs(i) * A());
    }

    protected int z() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }
}
