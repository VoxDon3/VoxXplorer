/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ax.c0.d0;
import ax.m.f;
import ax.m.j;

public class ButtonBarLayout
extends LinearLayout {
    private boolean a;
    private boolean b;
    private int c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] nArray = j.N0;
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, nArray);
        d0.j0((View)this, context, nArray, attributeSet, typedArray, 0, 0);
        this.a = typedArray.getBoolean(j.O0, true);
        typedArray.recycle();
        if (this.getOrientation() == 1) {
            this.setStacked(this.a);
        }
    }

    private int a(int n8) {
        int n9 = this.getChildCount();
        while (n8 < n9) {
            if (this.getChildAt(n8).getVisibility() == 0) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    private boolean b() {
        return this.b;
    }

    private void setStacked(boolean n8) {
        if (this.b != n8 && (n8 == 0 || this.a)) {
            this.b = n8;
            this.setOrientation(n8);
            int n9 = n8 != 0 ? 0x800005 : 80;
            this.setGravity(n9);
            View view = this.findViewById(f.y);
            if (view != null) {
                n8 = n8 != 0 ? 8 : 4;
                view.setVisibility(n8);
            }
            for (n8 = this.getChildCount() - 2; n8 >= 0; --n8) {
                this.bringChildToFront(this.getChildAt(n8));
            }
        }
    }

    protected void onMeasure(int n8, int n9) {
        int n10;
        int n11 = View.MeasureSpec.getSize((int)n8);
        boolean bl = this.a;
        int n12 = 0;
        if (bl) {
            if (n11 > this.c && this.b()) {
                this.setStacked(false);
            }
            this.c = n11;
        }
        if (!this.b() && View.MeasureSpec.getMode((int)n8) == 0x40000000) {
            n10 = View.MeasureSpec.makeMeasureSpec((int)n11, (int)Integer.MIN_VALUE);
            n11 = 1;
        } else {
            n10 = n8;
            n11 = 0;
        }
        super.onMeasure(n10, n9);
        n10 = n11;
        if (this.a) {
            n10 = n11;
            if (!this.b()) {
                n10 = n11;
                if ((this.getMeasuredWidthAndState() & 0xFF000000) == 0x1000000) {
                    this.setStacked(true);
                    n10 = 1;
                }
            }
        }
        if (n10 != 0) {
            super.onMeasure(n8, n9);
        }
        int n13 = this.a(0);
        n11 = n12;
        if (n13 >= 0) {
            View view = this.getChildAt(n13);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
            n10 = this.getPaddingTop() + view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.b()) {
                n12 = this.a(n13 + 1);
                n11 = n10;
                if (n12 >= 0) {
                    n11 = n10 + (this.getChildAt(n12).getPaddingTop() + (int)(this.getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                n11 = n10 + this.getPaddingBottom();
            }
        }
        if (d0.C((View)this) != n11) {
            this.setMinimumHeight(n11);
            if (n9 == 0) {
                super.onMeasure(n8, n9);
            }
        }
    }

    public void setAllowStacking(boolean bl) {
        if (this.a != bl) {
            this.a = bl;
            if (!bl && this.b()) {
                this.setStacked(false);
            }
            this.requestLayout();
        }
    }
}

