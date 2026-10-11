package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ax.C6.f;
import ax.F6.x;
import ax.O6.h;
import ax.O6.i;
import ax.k6.l;
import ax.m.C2506a;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {
    private static final int c0 = l.G;
    private static final ImageView.ScaleType[] d0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer U;
    private boolean V;
    private boolean W;
    private ImageView.ScaleType a0;
    private Boolean b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506a.R);
    }

    private Pair<Integer, Integer> T(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void U(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : f.f(background);
        if (valueOf != null) {
            h hVar = new h();
            hVar.g0(valueOf);
            hVar.U(context);
            hVar.f0(getElevation());
            setBackground(hVar);
        }
    }

    private void V(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    private void W() {
        if (this.V || this.W) {
            TextView g = x.g(this);
            TextView e = x.e(this);
            if (g == null && e == null) {
                return;
            }
            Pair<Integer, Integer> T = T(g, e);
            if (this.V && g != null) {
                V(g, T);
            }
            if (!this.W || e == null) {
                return;
            }
            V(e, T);
        }
    }

    private Drawable X(Drawable drawable) {
        if (drawable == null || this.U == null) {
            return drawable;
        }
        Drawable r = ax.U.a.r(drawable.mutate());
        r.setTint(this.U.intValue());
        return r;
    }

    private void Y() {
        ImageView c = x.c(this);
        if (c != null) {
            Boolean bool = this.b0;
            if (bool != null) {
                c.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.a0;
            if (scaleType != null) {
                c.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.a0;
    }

    public Integer getNavigationIconTint() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        W();
        Y();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        i.d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.b0;
        if (bool == null || bool.booleanValue() != z) {
            this.b0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.a0 != scaleType) {
            this.a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(X(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.W != z) {
            this.W = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.V != z) {
            this.V = z;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.c0
            android.content.Context r7 = ax.V6.a.d(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = ax.k6.m.l4
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = ax.F6.w.i(r0, r1, r2, r3, r4, r5)
            int r9 = ax.k6.m.o4
            boolean r1 = r8.hasValue(r9)
            r2 = -1
            if (r1 == 0) goto L28
            int r9 = r8.getColor(r9, r2)
            r6.setNavigationIconTint(r9)
        L28:
            int r9 = ax.k6.m.q4
            boolean r9 = r8.getBoolean(r9, r7)
            r6.V = r9
            int r9 = ax.k6.m.p4
            boolean r9 = r8.getBoolean(r9, r7)
            r6.W = r9
            int r9 = ax.k6.m.n4
            int r9 = r8.getInt(r9, r2)
            if (r9 < 0) goto L49
            android.widget.ImageView$ScaleType[] r1 = com.google.android.material.appbar.MaterialToolbar.d0
            int r2 = r1.length
            if (r9 >= r2) goto L49
            r9 = r1[r9]
            r6.a0 = r9
        L49:
            int r9 = ax.k6.m.m4
            boolean r1 = r8.hasValue(r9)
            if (r1 == 0) goto L5b
            boolean r7 = r8.getBoolean(r9, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6.b0 = r7
        L5b:
            r8.recycle()
            r6.U(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
