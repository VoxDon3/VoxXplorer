/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ax.H6.i;
import ax.Q6.b;
import ax.k6.c;
import ax.k6.e;
import ax.k6.g;
import ax.z6.a;

public class SnackbarContentLayout
extends LinearLayout
implements b {
    private TextView a;
    private Button b;
    private final TimeInterpolator c;
    private int d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = i.g(context, ax.k6.c.M, ax.l6.a.b);
    }

    private static void d(View view, int n8, int n9) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), n8, view.getPaddingEnd(), n9);
            return;
        }
        view.setPadding(view.getPaddingLeft(), n8, view.getPaddingRight(), n9);
    }

    private boolean e(int n8, int n9, int n10) {
        boolean bl;
        if (n8 != this.getOrientation()) {
            this.setOrientation(n8);
            bl = true;
        } else {
            bl = false;
        }
        if (this.a.getPaddingTop() == n9 && this.a.getPaddingBottom() == n10) {
            return bl;
        }
        SnackbarContentLayout.d((View)this.a, n9, n10);
        return true;
    }

    @Override
    public void a(int n8, int n9) {
        this.a.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimator = this.a.animate().alpha(1.0f);
        long l8 = n9;
        viewPropertyAnimator = viewPropertyAnimator.setDuration(l8).setInterpolator(this.c);
        long l9 = n8;
        viewPropertyAnimator.setStartDelay(l9).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(l8).setInterpolator(this.c).setStartDelay(l9).start();
        }
    }

    @Override
    public void b(int n8, int n9) {
        this.a.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimator = this.a.animate().alpha(0.0f);
        long l8 = n9;
        viewPropertyAnimator = viewPropertyAnimator.setDuration(l8).setInterpolator(this.c);
        long l9 = n8;
        viewPropertyAnimator.setStartDelay(l9).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(l8).setInterpolator(this.c).setStartDelay(l9).start();
        }
    }

    void c(float f8) {
        if (f8 != 1.0f) {
            int n8 = this.b.getCurrentTextColor();
            n8 = ax.z6.a.k(ax.z6.a.d((View)this, ax.k6.c.i), n8, f8);
            this.b.setTextColor(n8);
        }
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(g.N);
        this.b = (Button)this.findViewById(g.M);
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        if (this.getOrientation() != 1) {
            int n10 = this.getResources().getDimensionPixelSize(e.f);
            int n11 = this.getResources().getDimensionPixelSize(e.e);
            Layout layout = this.a.getLayout();
            int n12 = layout != null && layout.getLineCount() > 1 ? 1 : 0;
            if (n12 != 0 && this.d > 0 && this.b.getMeasuredWidth() > this.d ? this.e(1, n10, n10 - n11) : this.e(0, n12 = n12 != 0 ? n10 : n11, n12)) {
                super.onMeasure(n8, n9);
            }
        }
    }

    public void setMaxInlineActionWidth(int n8) {
        this.d = n8;
    }
}

