/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.view.View;
import android.view.ViewGroup;

public class g
extends ViewGroup {
    private int a;
    private int b;
    private boolean c;
    private int d;

    private static int a(int n8, int n9, int n10) {
        if (n9 != Integer.MIN_VALUE) {
            if (n9 != 0x40000000) {
                return n10;
            }
            return n8;
        }
        return Math.min(n10, n8);
    }

    public int b(View object) {
        if (!((object = object.getTag(ax.k6.g.K)) instanceof Integer)) {
            return -1;
        }
        return (Integer)object;
    }

    public boolean c() {
        return this.c;
    }

    protected int getItemSpacing() {
        return this.b;
    }

    protected int getLineSpacing() {
        return this.a;
    }

    protected int getRowCount() {
        return this.d;
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        if (this.getChildCount() == 0) {
            this.d = 0;
            return;
        }
        this.d = 1;
        boolean bl2 = this.getLayoutDirection() == 1;
        n9 = bl2 ? this.getPaddingRight() : this.getPaddingLeft();
        int n12 = bl2 ? this.getPaddingLeft() : this.getPaddingRight();
        int n13 = this.getPaddingTop();
        n11 = n9;
        int n14 = n13;
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            int n15;
            int n16;
            View view = this.getChildAt(i8);
            if (view.getVisibility() == 8) {
                view.setTag(ax.k6.g.K, (Object)-1);
                continue;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
                n16 = layoutParams.getMarginStart();
                n15 = layoutParams.getMarginEnd();
            } else {
                n15 = 0;
                n16 = 0;
            }
            int n17 = n11 + n16 + view.getMeasuredWidth();
            int n18 = n10 - n8;
            int n19 = n14;
            int n20 = n11;
            int n21 = n17;
            if (!this.c) {
                n19 = n14;
                n20 = n11;
                n21 = n17;
                if (n17 > n18 - n12) {
                    n21 = n9 + n16 + view.getMeasuredWidth();
                    n19 = n13 + this.a;
                    ++this.d;
                    n20 = n9;
                }
            }
            view.setTag(ax.k6.g.K, (Object)(this.d - 1));
            n13 = view.getMeasuredHeight() + n19;
            if (bl2) {
                view.layout(n18 - n21, n19, n18 - n20 - n16, n13);
            } else {
                view.layout(n20 + n16, n19, n21, n13);
            }
            n11 = n20 + (n16 + n15 + view.getMeasuredWidth() + this.b);
            n14 = n19;
        }
    }

    protected void onMeasure(int n8, int n9) {
        int n10 = View.MeasureSpec.getSize((int)n8);
        int n11 = View.MeasureSpec.getMode((int)n8);
        int n12 = View.MeasureSpec.getSize((int)n9);
        int n13 = View.MeasureSpec.getMode((int)n9);
        int n14 = n11 != Integer.MIN_VALUE && n11 != 0x40000000 ? Integer.MAX_VALUE : n10;
        int n15 = this.getPaddingLeft();
        int n16 = this.getPaddingTop();
        int n17 = this.getPaddingRight();
        int n18 = n16;
        int n19 = 0;
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            int n20;
            int n21;
            View view = this.getChildAt(i8);
            if (view.getVisibility() == 8) continue;
            this.measureChild(view, n8, n9);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
                n21 = layoutParams.leftMargin;
                n20 = layoutParams.rightMargin;
            } else {
                n21 = 0;
                n20 = 0;
            }
            if (n15 + n21 + view.getMeasuredWidth() > n14 - n17 && !this.c()) {
                n18 = this.getPaddingLeft();
                n15 = this.a + n16;
                n16 = n18;
                n18 = n15;
            } else {
                n16 = n15;
            }
            int n22 = n16 + n21 + view.getMeasuredWidth();
            int n23 = view.getMeasuredHeight();
            n15 = n19;
            if (n22 > n19) {
                n15 = n22;
            }
            n21 = n16 + (n21 + n20 + view.getMeasuredWidth() + this.b);
            n19 = n15;
            if (i8 == this.getChildCount() - 1) {
                n19 = n15 + n20;
            }
            n16 = n18 + n23;
            n15 = n21;
        }
        n8 = this.getPaddingRight();
        n9 = this.getPaddingBottom();
        this.setMeasuredDimension(g.a(n10, n11, n19 + n8), g.a(n12, n13, n16 + n9));
    }

    protected void setItemSpacing(int n8) {
        this.b = n8;
    }

    protected void setLineSpacing(int n8) {
        this.a = n8;
    }

    public void setSingleLine(boolean bl) {
        this.c = bl;
    }
}

