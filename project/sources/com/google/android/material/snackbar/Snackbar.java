package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import ax.k6.C2402c;
import ax.k6.C2408i;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes3.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] H;
    private static final int[] I;
    private final AccessibilityManager F;
    private boolean G;

    public static final class SnackbarLayout extends BaseTransientBottomBar.s {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public static class a extends BaseTransientBottomBar.q<Snackbar> {
        /* renamed from: c */
        public void a(Snackbar snackbar, int i) {
            throw null;
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.q
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i = C2402c.T;
        H = new int[]{i};
        I = new int[]{i, C2402c.V};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, b bVar) {
        super(context, viewGroup, view, bVar);
        this.F = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static /* synthetic */ void i0(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.y(1);
    }

    private static ViewGroup j0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button k0() {
        return l0().getActionView();
    }

    private SnackbarContentLayout l0() {
        return (SnackbarContentLayout) this.i.getChildAt(0);
    }

    private TextView m0() {
        return l0().getMessageView();
    }

    private static boolean n0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(I);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar o0(View view, CharSequence charSequence, int i) {
        return p0(null, view, charSequence, i);
    }

    private static Snackbar p0(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup j0 = j0(view);
        if (j0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = j0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(n0(context) ? C2408i.w : C2408i.c, j0, false);
        Snackbar snackbar = new Snackbar(context, j0, snackbarContentLayout, snackbarContentLayout);
        snackbar.t0(charSequence);
        snackbar.V(i);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int C() {
        int recommendedTimeoutMillis;
        int C = super.C();
        if (C == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.F.getRecommendedTimeoutMillis(C, (this.G ? 4 : 0) | 3);
            return recommendedTimeoutMillis;
        }
        if (this.G && this.F.isTouchExplorationEnabled()) {
            return -2;
        }
        return C;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean L() {
        return super.L();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void a0() {
        super.a0();
    }

    public Snackbar q0(int i, View.OnClickListener onClickListener) {
        return r0(B().getText(i), onClickListener);
    }

    public Snackbar r0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button k0 = k0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            k0.setVisibility(8);
            k0.setOnClickListener(null);
            this.G = false;
            return this;
        }
        this.G = true;
        k0.setVisibility(0);
        k0.setText(charSequence);
        k0.setOnClickListener(new View.OnClickListener() { // from class: ax.Q6.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Snackbar.i0(Snackbar.this, onClickListener, view);
            }
        });
        return this;
    }

    public Snackbar s0(int i) {
        k0().setTextColor(i);
        return this;
    }

    public Snackbar t0(CharSequence charSequence) {
        m0().setText(charSequence);
        return this;
    }

    public Snackbar u0(int i) {
        m0().setTextColor(i);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void x() {
        super.x();
    }
}
