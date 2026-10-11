package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ax.H6.i;
import ax.Q6.b;
import ax.k6.C2402c;
import ax.k6.C2404e;
import ax.k6.C2406g;
import ax.l6.C2472a;
import ax.z6.C3555a;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements b {
    private TextView a;
    private Button b;
    private final TimeInterpolator c;
    private int d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = i.g(context, C2402c.M, C2472a.b);
    }

    private static void d(View view, int i, int i2) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        d(this.a, i2, i3);
        return true;
    }

    @Override // ax.Q6.b
    public void a(int i, int i2) {
        this.a.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.a.animate().alpha(1.0f).setDuration(j).setInterpolator(this.c).setStartDelay(j2).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(j).setInterpolator(this.c).setStartDelay(j2).start();
        }
    }

    @Override // ax.Q6.b
    public void b(int i, int i2) {
        this.a.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.a.animate().alpha(0.0f).setDuration(j).setInterpolator(this.c).setStartDelay(j2).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(j).setInterpolator(this.c).setStartDelay(j2).start();
        }
    }

    void c(float f) {
        if (f != 1.0f) {
            this.b.setTextColor(C3555a.k(C3555a.d(this, C2402c.i), this.b.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(C2406g.N);
        this.b = (Button) findViewById(C2406g.M);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C2404e.f);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C2404e.e);
        Layout layout = this.a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.d = i;
    }
}
