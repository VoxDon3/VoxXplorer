/*
 * Decompiled with CFR 0.152.
 */
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
import ax.F6.w;
import ax.F6.x;
import ax.O6.h;
import ax.O6.i;
import ax.U.a;
import ax.k6.l;
import ax.k6.m;

public class MaterialToolbar
extends Toolbar {
    private static final int c0 = l.G;
    private static final ImageView.ScaleType[] d0 = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer U;
    private boolean V;
    private boolean W;
    private ImageView.ScaleType a0;
    private Boolean b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.R);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int n8) {
        ImageView.ScaleType[] scaleTypeArray;
        int n9 = c0;
        super(ax.V6.a.d(context, attributeSet, n8, n9), attributeSet, n8);
        context = this.getContext();
        attributeSet = w.i(context, attributeSet, m.l4, n8, n9, new int[0]);
        n8 = m.o4;
        if (attributeSet.hasValue(n8)) {
            this.setNavigationIconTint(attributeSet.getColor(n8, -1));
        }
        this.V = attributeSet.getBoolean(m.q4, false);
        this.W = attributeSet.getBoolean(m.p4, false);
        n8 = attributeSet.getInt(m.n4, -1);
        if (n8 >= 0 && n8 < (scaleTypeArray = d0).length) {
            this.a0 = scaleTypeArray[n8];
        }
        if (attributeSet.hasValue(n8 = m.m4)) {
            this.b0 = attributeSet.getBoolean(n8, false);
        }
        attributeSet.recycle();
        this.U(context);
    }

    private Pair<Integer, Integer> T(TextView textView, TextView textView2) {
        int n8 = this.getMeasuredWidth();
        int n9 = n8 / 2;
        int n10 = this.getPaddingLeft();
        int n11 = n8 - this.getPaddingRight();
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            View view = this.getChildAt(i8);
            int n12 = n11;
            int n13 = n10;
            if (view.getVisibility() != 8) {
                n12 = n11;
                n13 = n10;
                if (view != textView) {
                    n12 = n11;
                    n13 = n10;
                    if (view != textView2) {
                        n8 = n10;
                        if (view.getRight() < n9) {
                            n8 = n10;
                            if (view.getRight() > n10) {
                                n8 = view.getRight();
                            }
                        }
                        n12 = n11;
                        n13 = n8;
                        if (view.getLeft() > n9) {
                            n12 = n11;
                            n13 = n8;
                            if (view.getLeft() < n11) {
                                n12 = view.getLeft();
                                n13 = n8;
                            }
                        }
                    }
                }
            }
            n11 = n12;
            n10 = n13;
        }
        return new Pair((Object)n10, (Object)n11);
    }

    private void U(Context context) {
        Drawable drawable = this.getBackground();
        drawable = drawable == null ? ColorStateList.valueOf((int)0) : f.f(drawable);
        if (drawable != null) {
            h h8 = new h();
            h8.g0((ColorStateList)drawable);
            h8.U(context);
            h8.f0(this.getElevation());
            this.setBackground(h8);
        }
    }

    private void V(View view, Pair<Integer, Integer> pair) {
        int n8 = this.getMeasuredWidth();
        int n9 = view.getMeasuredWidth();
        int n10 = n8 / 2 - n9 / 2;
        int n11 = n9 + n10;
        int n12 = Math.max(Math.max((Integer)pair.first - n10, 0), Math.max(n11 - (Integer)pair.second, 0));
        n8 = n10;
        n9 = n11;
        if (n12 > 0) {
            n8 = n10 + n12;
            n9 = n11 - n12;
            view.measure(View.MeasureSpec.makeMeasureSpec((int)(n9 - n8), (int)0x40000000), view.getMeasuredHeightAndState());
        }
        view.layout(n8, view.getTop(), n9, view.getBottom());
    }

    private void W() {
        if (this.V || this.W) {
            TextView textView = x.g(this);
            TextView textView2 = x.e(this);
            if (textView != null || textView2 != null) {
                Pair<Integer, Integer> pair = this.T(textView, textView2);
                if (this.V && textView != null) {
                    this.V((View)textView, pair);
                }
                if (this.W && textView2 != null) {
                    this.V((View)textView2, pair);
                }
            }
        }
    }

    private Drawable X(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2 = drawable;
            if (this.U != null) {
                drawable2 = a.r(drawable.mutate());
                drawable2.setTint(this.U.intValue());
            }
        }
        return drawable2;
    }

    private void Y() {
        ImageView imageView = x.c(this);
        if (imageView != null) {
            Boolean bl = this.b0;
            if (bl != null) {
                imageView.setAdjustViewBounds(bl.booleanValue());
            }
            if ((bl = this.a0) != null) {
                imageView.setScaleType((ImageView.ScaleType)bl);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.a0;
    }

    public Integer getNavigationIconTint() {
        return this.U;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e((View)this);
    }

    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        this.W();
        this.Y();
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        i.d((View)this, f8);
    }

    public void setLogoAdjustViewBounds(boolean bl) {
        Boolean bl2 = this.b0;
        if (bl2 != null && bl2 == bl) {
            return;
        }
        this.b0 = bl;
        this.requestLayout();
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.a0 != scaleType) {
            this.a0 = scaleType;
            this.requestLayout();
        }
    }

    @Override
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(this.X(drawable));
    }

    public void setNavigationIconTint(int n8) {
        this.U = n8;
        Drawable drawable = this.getNavigationIcon();
        if (drawable != null) {
            this.setNavigationIcon(drawable);
        }
    }

    public void setSubtitleCentered(boolean bl) {
        if (this.W != bl) {
            this.W = bl;
            this.requestLayout();
        }
    }

    public void setTitleCentered(boolean bl) {
        if (this.V != bl) {
            this.V = bl;
            this.requestLayout();
        }
    }
}

