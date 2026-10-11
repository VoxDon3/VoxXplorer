/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.snackbar;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.Q6.b;
import ax.Q6.c;
import ax.Q6.d;
import ax.k6.i;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

public class Snackbar
extends BaseTransientBottomBar<Snackbar> {
    private static final int[] H;
    private static final int[] I;
    private final AccessibilityManager F;
    private boolean G;

    static {
        int n8 = ax.k6.c.T;
        H = new int[]{n8};
        I = new int[]{n8, ax.k6.c.V};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, b b8) {
        super(context, viewGroup, view, b8);
        this.F = (AccessibilityManager)viewGroup.getContext().getSystemService("accessibility");
    }

    public static /* synthetic */ void i0(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.y(1);
    }

    private static ViewGroup j0(View view) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        View view2 = view;
        do {
            if (view2 instanceof CoordinatorLayout) {
                return (ViewGroup)view2;
            }
            viewGroup = viewGroup2;
            if (view2 instanceof FrameLayout) {
                if (view2.getId() == 0x1020002) {
                    return (ViewGroup)view2;
                }
                viewGroup = (ViewGroup)view2;
            }
            view = view2;
            if (view2 != null && !((view = view2.getParent()) instanceof View)) {
                view = null;
            }
            viewGroup2 = viewGroup;
            view2 = view;
        } while (view != null);
        return viewGroup;
    }

    private Button k0() {
        return this.l0().getActionView();
    }

    private SnackbarContentLayout l0() {
        return (SnackbarContentLayout)this.i.getChildAt(0);
    }

    private TextView m0() {
        return this.l0().getMessageView();
    }

    private static boolean n0(Context context) {
        context = context.obtainStyledAttributes(I);
        int n8 = context.getResourceId(0, -1);
        int n9 = context.getResourceId(1, -1);
        context.recycle();
        return n8 != -1 && n9 != -1;
    }

    public static Snackbar o0(View view, CharSequence charSequence, int n8) {
        return Snackbar.p0(null, view, charSequence, n8);
    }

    private static Snackbar p0(Context object, View view, CharSequence charSequence, int n8) {
        ViewGroup viewGroup = Snackbar.j0(view);
        if (viewGroup != null) {
            view = object;
            if (object == null) {
                view = viewGroup.getContext();
            }
            object = LayoutInflater.from((Context)view);
            int n9 = Snackbar.n0((Context)view) ? ax.k6.i.w : ax.k6.i.c;
            object = (SnackbarContentLayout)object.inflate(n9, viewGroup, false);
            object = new Snackbar((Context)view, viewGroup, (View)object, (b)object);
            ((Snackbar)object).t0(charSequence);
            ((BaseTransientBottomBar)object).V(n8);
            return object;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override
    public int C() {
        int n8 = super.C();
        if (n8 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int n9 = this.G ? 4 : 0;
            return c.a(this.F, n8, n9 | 3);
        }
        if (this.G && this.F.isTouchExplorationEnabled()) {
            return -2;
        }
        return n8;
    }

    @Override
    public boolean L() {
        return super.L();
    }

    @Override
    public void a0() {
        super.a0();
    }

    public Snackbar q0(int n8, View.OnClickListener onClickListener) {
        return this.r0(this.B().getText(n8), onClickListener);
    }

    public Snackbar r0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = this.k0();
        if (!TextUtils.isEmpty((CharSequence)charSequence) && onClickListener != null) {
            this.G = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener((View.OnClickListener)new d(this, onClickListener));
            return this;
        }
        button.setVisibility(8);
        button.setOnClickListener(null);
        this.G = false;
        return this;
    }

    public Snackbar s0(int n8) {
        this.k0().setTextColor(n8);
        return this;
    }

    public Snackbar t0(CharSequence charSequence) {
        this.m0().setText(charSequence);
        return this;
    }

    public Snackbar u0(int n8) {
        this.m0().setTextColor(n8);
        return this;
    }

    @Override
    public void x() {
        super.x();
    }

    public static final class SnackbarLayout
    extends BaseTransientBottomBar.s {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override
        protected void onMeasure(int n8, int n9) {
            super.onMeasure(n8, n9);
            int n10 = this.getChildCount();
            int n11 = this.getMeasuredWidth();
            int n12 = this.getPaddingLeft();
            n9 = this.getPaddingRight();
            for (n8 = 0; n8 < n10; ++n8) {
                View view = this.getChildAt(n8);
                if (view.getLayoutParams().width != -1) continue;
                view.measure(View.MeasureSpec.makeMeasureSpec((int)(n11 - n12 - n9), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)view.getMeasuredHeight(), (int)0x40000000));
            }
        }
    }

    public static class a
    extends BaseTransientBottomBar.q<Snackbar> {
        public void c(Snackbar snackbar, int n8) {
            throw null;
        }

        public void d(Snackbar snackbar) {
        }
    }
}

