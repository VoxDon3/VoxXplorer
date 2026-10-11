package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.c0.F0;
import java.util.List;

/* loaded from: classes3.dex */
abstract class b extends c<View> {
    final Rect d;
    final Rect e;
    private int f;
    private int g;

    public b() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    private static int R(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.google.android.material.appbar.c
    protected void J(CoordinatorLayout coordinatorLayout, View view, int i) {
        View L = L(coordinatorLayout.r(view));
        if (L == null) {
            super.J(coordinatorLayout, view, i);
            this.f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, L.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + L.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        F0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.j();
            rect.right -= lastWindowInsets.k();
        }
        Rect rect2 = this.e;
        Gravity.apply(R(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int M = M(L);
        view.layout(rect2.left, rect2.top - M, rect2.right, rect2.bottom - M);
        this.f = rect2.top - L.getBottom();
    }

    abstract View L(List<View> list);

    final int M(View view) {
        if (this.g == 0) {
            return 0;
        }
        float N = N(view);
        int i = this.g;
        return ax.W.a.b((int) (N * i), 0, i);
    }

    float N(View view) {
        return 1.0f;
    }

    public final int O() {
        return this.g;
    }

    int P(View view) {
        return view.getMeasuredHeight();
    }

    final int Q() {
        return this.f;
    }

    public final void S(int i) {
        this.g = i;
    }

    protected boolean T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View L;
        F0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (L = L(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (L.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int P = size + P(L);
        int measuredHeight = L.getMeasuredHeight();
        if (T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            P -= measuredHeight;
        }
        coordinatorLayout.J(view, i, i2, View.MeasureSpec.makeMeasureSpec(P, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}
