/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout
extends ViewGroup {
    private int a = -1;
    private boolean b;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public int getBaseline() {
        return this.a;
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        int n12 = this.getChildCount();
        int n13 = this.getPaddingLeft();
        int n14 = this.getPaddingRight();
        int n15 = this.getPaddingTop();
        for (n9 = 0; n9 < n12; ++n9) {
            View view = this.getChildAt(n9);
            if (view.getVisibility() == 8) continue;
            int n16 = view.getMeasuredWidth();
            int n17 = view.getMeasuredHeight();
            int n18 = (n10 - n8 - n14 - n13 - n16) / 2 + n13;
            n11 = this.a != -1 && view.getBaseline() != -1 ? this.a + n15 - view.getBaseline() : n15;
            view.layout(n18, n11, n16 + n18, n17 + n11);
        }
    }

    protected void onMeasure(int n8, int n9) {
        int n10;
        int n11 = this.getChildCount();
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = -1;
        int n17 = -1;
        for (int i8 = 0; i8 < n11; ++i8) {
            View view = this.getChildAt(i8);
            if (view.getVisibility() == 8) continue;
            this.measureChild(view, n8, n9);
            int n18 = Math.max(n12, view.getMeasuredHeight());
            int n19 = view.getBaseline();
            n10 = n16;
            n12 = n17;
            if (n19 != -1) {
                n10 = Math.max(n16, n19);
                n12 = Math.max(n17, view.getMeasuredHeight() - n19);
            }
            n14 = Math.max(n14, view.getMeasuredWidth());
            n13 = Math.max(n13, view.getMeasuredHeight());
            n15 = View.combineMeasuredStates((int)n15, (int)view.getMeasuredState());
            n17 = n12;
            n16 = n10;
            n12 = n18;
        }
        n10 = n13;
        if (n16 != -1) {
            n10 = n13;
            if (this.b) {
                n10 = Math.max(n13, Math.max(n17, this.getPaddingBottom()) + n16);
            }
            this.a = n16;
        }
        if (!this.b) {
            n10 = n12 + this.getPaddingBottom();
        }
        n13 = Math.max(n10, this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState((int)Math.max(n14, this.getSuggestedMinimumWidth()), (int)n8, (int)n15), View.resolveSizeAndState((int)n13, (int)n9, (int)(n15 << 16)));
    }

    public void setMeasurePaddingFromBaseline(boolean bl) {
        this.b = bl;
    }
}

