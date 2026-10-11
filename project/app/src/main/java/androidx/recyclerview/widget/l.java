/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class l
extends RecyclerView.A {
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    @SuppressLint(value={"UnknownNullness"})
    protected PointF k;
    private final DisplayMetrics l;
    private boolean m = false;
    private float n;
    protected int o = 0;
    protected int p = 0;

    @SuppressLint(value={"UnknownNullness"})
    public l(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.m) {
            this.n = this.v(this.l);
            this.m = true;
        }
        return this.n;
    }

    private int y(int n8, int n9) {
        if (n8 * (n9 = n8 - n9) <= 0) {
            return 0;
        }
        return n9;
    }

    protected int B() {
        float f8;
        PointF pointF = this.k;
        if (pointF != null && (f8 = pointF.y) != 0.0f) {
            if (f8 > 0.0f) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @SuppressLint(value={"UnknownNullness"})
    protected void C(RecyclerView.A.a a8) {
        PointF pointF = this.a(this.f());
        if (pointF != null && (pointF.x != 0.0f || pointF.y != 0.0f)) {
            this.i(pointF);
            this.k = pointF;
            this.o = (int)(pointF.x * 10000.0f);
            this.p = (int)(pointF.y * 10000.0f);
            int n8 = this.x(10000);
            a8.d((int)((float)this.o * 1.2f), (int)((float)this.p * 1.2f), (int)((float)n8 * 1.2f), (Interpolator)this.i);
            return;
        }
        a8.b(this.f());
        this.r();
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    protected void l(int n8, int n9, RecyclerView.B b8, RecyclerView.A.a a8) {
        if (this.c() == 0) {
            this.r();
            return;
        }
        this.o = this.y(this.o, n8);
        this.p = n8 = this.y(this.p, n9);
        if (this.o == 0 && n8 == 0) {
            this.C(a8);
        }
    }

    @Override
    protected void m() {
    }

    @Override
    protected void n() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    protected void o(View view, RecyclerView.B b8, RecyclerView.A.a a8) {
        int n8;
        int n9 = this.t(view, this.z());
        int n10 = this.w((int)Math.sqrt(n9 * n9 + (n8 = this.u(view, this.B())) * n8));
        if (n10 > 0) {
            a8.d(-n9, -n8, n10, (Interpolator)this.j);
        }
    }

    public int s(int n8, int n9, int n10, int n11, int n12) {
        if (n12 != -1) {
            if (n12 != 0) {
                if (n12 == 1) {
                    return n11 - n9;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            if ((n8 = n10 - n8) > 0) {
                return n8;
            }
            n8 = n11 - n9;
            if (n8 < 0) {
                return n8;
            }
            return 0;
        }
        return n10 - n8;
    }

    @SuppressLint(value={"UnknownNullness"})
    public int t(View view, int n8) {
        RecyclerView.p p8 = this.e();
        if (p8 != null && p8.q()) {
            RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
            return this.s(p8.W(view) - q8.leftMargin, p8.Z(view) + q8.rightMargin, p8.j0(), p8.t0() - p8.k0(), n8);
        }
        return 0;
    }

    @SuppressLint(value={"UnknownNullness"})
    public int u(View view, int n8) {
        RecyclerView.p p8 = this.e();
        if (p8 != null && p8.r()) {
            RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
            return this.s(p8.a0(view) - q8.topMargin, p8.U(view) + q8.bottomMargin, p8.l0(), p8.c0() - p8.i0(), n8);
        }
        return 0;
    }

    @SuppressLint(value={"UnknownNullness"})
    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / (float)displayMetrics.densityDpi;
    }

    protected int w(int n8) {
        return (int)Math.ceil((double)this.x(n8) / 0.3356);
    }

    protected int x(int n8) {
        return (int)Math.ceil((float)Math.abs(n8) * this.A());
    }

    protected int z() {
        float f8;
        PointF pointF = this.k;
        if (pointF != null && (f8 = pointF.x) != 0.0f) {
            if (f8 > 0.0f) {
                return 1;
            }
            return -1;
        }
        return 0;
    }
}

