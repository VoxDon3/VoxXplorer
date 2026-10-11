package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes.dex */
public class p extends t {
    private o d;
    private o e;

    class a extends l {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.l, androidx.recyclerview.widget.RecyclerView.A
        protected void o(View view, RecyclerView.B b, RecyclerView.A.a aVar) {
            p pVar = p.this;
            int[] c = pVar.c(pVar.a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.d(i, i2, w, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.l
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.l
        protected int x(int i) {
            return Math.min(100, super.x(i));
        }
    }

    private int k(View view, o oVar) {
        return (oVar.g(view) + (oVar.e(view) / 2)) - (oVar.m() + (oVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, o oVar) {
        int P = pVar.P();
        View view = null;
        if (P == 0) {
            return null;
        }
        int m = oVar.m() + (oVar.n() / 2);
        int i = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (int i2 = 0; i2 < P; i2++) {
            View O = pVar.O(i2);
            int abs = Math.abs((oVar.g(O) + (oVar.e(O) / 2)) - m);
            if (abs < i) {
                view = O;
                i = abs;
            }
        }
        return view;
    }

    private o m(RecyclerView.p pVar) {
        o oVar = this.e;
        if (oVar == null || oVar.a != pVar) {
            this.e = o.a(pVar);
        }
        return this.e;
    }

    private o n(RecyclerView.p pVar) {
        if (pVar.r()) {
            return o(pVar);
        }
        if (pVar.q()) {
            return m(pVar);
        }
        return null;
    }

    private o o(RecyclerView.p pVar) {
        o oVar = this.d;
        if (oVar == null || oVar.a != pVar) {
            this.d = o.c(pVar);
        }
        return this.d;
    }

    private boolean p(RecyclerView.p pVar, int i, int i2) {
        return pVar.q() ? i > 0 : i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.p pVar) {
        PointF c;
        int f = pVar.f();
        if (!(pVar instanceof RecyclerView.A.b) || (c = ((RecyclerView.A.b) pVar).c(f - 1)) == null) {
            return false;
        }
        return c.x < 0.0f || c.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.t
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.q()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.r()) {
            iArr[1] = k(view, o(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.t
    protected RecyclerView.A d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.A.b) {
            return new a(this.a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.t
    @SuppressLint({"UnknownNullness"})
    public View f(RecyclerView.p pVar) {
        if (pVar.r()) {
            return l(pVar, o(pVar));
        }
        if (pVar.q()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.t
    @SuppressLint({"UnknownNullness"})
    public int g(RecyclerView.p pVar, int i, int i2) {
        o n;
        int f = pVar.f();
        if (f == 0 || (n = n(pVar)) == null) {
            return -1;
        }
        int P = pVar.P();
        View view = null;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (int i5 = 0; i5 < P; i5++) {
            View O = pVar.O(i5);
            if (O != null) {
                int k = k(O, n);
                if (k <= 0 && k > i3) {
                    view2 = O;
                    i3 = k;
                }
                if (k >= 0 && k < i4) {
                    view = O;
                    i4 = k;
                }
            }
        }
        boolean p = p(pVar, i, i2);
        if (p && view != null) {
            return pVar.m0(view);
        }
        if (!p && view2 != null) {
            return pVar.m0(view2);
        }
        if (p) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int m0 = pVar.m0(view) + (q(pVar) == p ? -1 : 1);
        if (m0 < 0 || m0 >= f) {
            return -1;
        }
        return m0;
    }
}
