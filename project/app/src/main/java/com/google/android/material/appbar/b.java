/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.W.a;
import ax.c0.F0;
import com.google.android.material.appbar.c;
import java.util.List;

abstract class b
extends c<View> {
    final Rect d = new Rect();
    final Rect e = new Rect();
    private int f = 0;
    private int g;

    public b() {
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int R(int n8) {
        int n9 = n8;
        if (n8 == 0) {
            n9 = 0x800033;
        }
        return n9;
    }

    @Override
    protected void J(CoordinatorLayout coordinatorLayout, View view, int n8) {
        View view2 = this.L(coordinatorLayout.r(view));
        if (view2 != null) {
            CoordinatorLayout.f f8 = (CoordinatorLayout.f)view.getLayoutParams();
            Rect rect = this.d;
            rect.set(coordinatorLayout.getPaddingLeft() + f8.leftMargin, view2.getBottom() + f8.topMargin, coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight() - f8.rightMargin, coordinatorLayout.getHeight() + view2.getBottom() - coordinatorLayout.getPaddingBottom() - f8.bottomMargin);
            F0 f02 = coordinatorLayout.getLastWindowInsets();
            if (f02 != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left += f02.j();
                rect.right -= f02.k();
            }
            coordinatorLayout = this.e;
            Gravity.apply((int)b.R(f8.c), (int)view.getMeasuredWidth(), (int)view.getMeasuredHeight(), (Rect)rect, (Rect)coordinatorLayout, (int)n8);
            n8 = this.M(view2);
            view.layout(((Rect)coordinatorLayout).left, ((Rect)coordinatorLayout).top - n8, ((Rect)coordinatorLayout).right, ((Rect)coordinatorLayout).bottom - n8);
            this.f = ((Rect)coordinatorLayout).top - view2.getBottom();
            return;
        }
        super.J(coordinatorLayout, view, n8);
        this.f = 0;
    }

    abstract View L(List<View> var1);

    final int M(View view) {
        if (this.g == 0) {
            return 0;
        }
        float f8 = this.N(view);
        int n8 = this.g;
        return a.b((int)(f8 * (float)n8), 0, n8);
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

    public final void S(int n8) {
        this.g = n8;
    }

    protected boolean T() {
        return false;
    }

    @Override
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int n8, int n9, int n10, int n11) {
        View view2;
        int n12 = view.getLayoutParams().height;
        if ((n12 == -1 || n12 == -2) && (view2 = this.L(coordinatorLayout.r(view))) != null) {
            int n13 = View.MeasureSpec.getSize((int)n10);
            if (n13 > 0) {
                n10 = n13;
                if (view2.getFitsSystemWindows()) {
                    F0 f02 = coordinatorLayout.getLastWindowInsets();
                    n10 = n13;
                    if (f02 != null) {
                        n10 = n13 + (f02.l() + f02.i());
                    }
                }
            } else {
                n10 = coordinatorLayout.getHeight();
            }
            n10 += this.P(view2);
            n13 = view2.getMeasuredHeight();
            if (this.T()) {
                view.setTranslationY((float)(-n13));
            } else {
                view.setTranslationY(0.0f);
                n10 -= n13;
            }
            n13 = n12 == -1 ? 0x40000000 : Integer.MIN_VALUE;
            coordinatorLayout.J(view, n8, n9, View.MeasureSpec.makeMeasureSpec((int)n10, (int)n13), n11);
            return true;
        }
        return false;
    }
}

