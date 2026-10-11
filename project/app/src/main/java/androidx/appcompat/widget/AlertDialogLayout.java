/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.B;
import ax.c0.d0;
import ax.c0.t;
import ax.m.f;

public class AlertDialogLayout
extends B {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void A(View view, int n8, int n9, int n10, int n11) {
        view.layout(n8, n9, n10 + n8, n11 + n9);
    }

    private static int B(View view) {
        int n8 = d0.C(view);
        if (n8 > 0) {
            return n8;
        }
        if (view instanceof ViewGroup && (view = (ViewGroup)view).getChildCount() == 1) {
            return AlertDialogLayout.B(view.getChildAt(0));
        }
        return 0;
    }

    private boolean C(int n8, int n9) {
        int n10;
        int n11;
        int n12;
        int n13;
        View view;
        int n14;
        int n15 = this.getChildCount();
        View view2 = null;
        View view3 = null;
        View view4 = null;
        for (n14 = 0; n14 < n15; ++n14) {
            view = this.getChildAt(n14);
            if (view.getVisibility() == 8) continue;
            n13 = view.getId();
            if (n13 == f.G) {
                view2 = view;
                continue;
            }
            if (n13 == f.k) {
                view3 = view;
                continue;
            }
            if (n13 != f.m && n13 != f.o) {
                return false;
            }
            if (view4 != null) {
                return false;
            }
            view4 = view;
        }
        int n16 = View.MeasureSpec.getMode((int)n9);
        int n17 = View.MeasureSpec.getSize((int)n9);
        int n18 = View.MeasureSpec.getMode((int)n8);
        int n19 = this.getPaddingTop() + this.getPaddingBottom();
        if (view2 != null) {
            view2.measure(n8, 0);
            n19 += view2.getMeasuredHeight();
            n13 = View.combineMeasuredStates((int)0, (int)view2.getMeasuredState());
        } else {
            n13 = 0;
        }
        if (view3 != null) {
            view3.measure(n8, 0);
            n14 = AlertDialogLayout.B(view3);
            n12 = view3.getMeasuredHeight() - n14;
            n19 += n14;
            n13 = View.combineMeasuredStates((int)n13, (int)view3.getMeasuredState());
        } else {
            n14 = 0;
            n12 = 0;
        }
        if (view4 != null) {
            n11 = n16 == 0 ? 0 : View.MeasureSpec.makeMeasureSpec((int)Math.max(0, n17 - n19), (int)n16);
            view4.measure(n8, n11);
            n10 = view4.getMeasuredHeight();
            n19 += n10;
            n13 = View.combineMeasuredStates((int)n13, (int)view4.getMeasuredState());
        } else {
            n10 = 0;
        }
        int n20 = n17 - n19;
        n17 = n13;
        int n21 = n20;
        n11 = n19;
        if (view3 != null) {
            n12 = Math.min(n20, n12);
            n17 = n20;
            n11 = n14;
            if (n12 > 0) {
                n17 = n20 - n12;
                n11 = n14 + n12;
            }
            view3.measure(n8, View.MeasureSpec.makeMeasureSpec((int)n11, (int)0x40000000));
            n11 = n19 - n14 + view3.getMeasuredHeight();
            n14 = View.combineMeasuredStates((int)n13, (int)view3.getMeasuredState());
            n21 = n17;
            n17 = n14;
        }
        n13 = n17;
        n14 = n11;
        if (view4 != null) {
            n13 = n17;
            n14 = n11;
            if (n21 > 0) {
                view4.measure(n8, View.MeasureSpec.makeMeasureSpec((int)(n10 + n21), (int)n16));
                n14 = n11 - n10 + view4.getMeasuredHeight();
                n13 = View.combineMeasuredStates((int)n17, (int)view4.getMeasuredState());
            }
        }
        n11 = 0;
        for (n19 = 0; n19 < n15; ++n19) {
            view = this.getChildAt(n19);
            n17 = n11;
            if (view.getVisibility() != 8) {
                n17 = Math.max(n11, view.getMeasuredWidth());
            }
            n11 = n17;
        }
        this.setMeasuredDimension(View.resolveSizeAndState((int)(n11 + (this.getPaddingLeft() + this.getPaddingRight())), (int)n8, (int)n13), View.resolveSizeAndState((int)n14, (int)n9, (int)0));
        if (n18 != 0x40000000) {
            this.l(n15, n9);
        }
        return true;
    }

    private void l(int n8, int n9) {
        int n10 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000);
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            if (view.getVisibility() == 8) continue;
            B.a a8 = (B.a)view.getLayoutParams();
            if (a8.width != -1) continue;
            int n11 = a8.height;
            a8.height = view.getMeasuredHeight();
            this.measureChildWithMargins(view, n10, 0, n9, 0);
            a8.height = n11;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        int n12 = this.getPaddingLeft();
        int n13 = n10 - n8;
        int n14 = this.getPaddingRight();
        int n15 = this.getPaddingRight();
        n10 = this.getMeasuredHeight();
        int n16 = this.getChildCount();
        int n17 = this.getGravity();
        n8 = n17 & 0x70;
        n8 = n8 != 16 ? (n8 != 80 ? this.getPaddingTop() : this.getPaddingTop() + n11 - n9 - n10) : this.getPaddingTop() + (n11 - n9 - n10) / 2;
        Drawable drawable = this.getDividerDrawable();
        n10 = 0;
        n9 = drawable == null ? 0 : drawable.getIntrinsicHeight();
        while (true) {
            block4: {
                int n18;
                B.a a8;
                int n19;
                int n20;
                block7: {
                    block8: {
                        block5: {
                            block6: {
                                if (n10 >= n16) {
                                    return;
                                }
                                drawable = this.getChildAt(n10);
                                n11 = n8;
                                if (drawable == null) break block4;
                                n11 = n8;
                                if (drawable.getVisibility() == 8) break block4;
                                n20 = drawable.getMeasuredWidth();
                                n19 = drawable.getMeasuredHeight();
                                a8 = (B.a)drawable.getLayoutParams();
                                n11 = n18 = a8.gravity;
                                if (n18 < 0) {
                                    n11 = n17 & 0x800007;
                                }
                                if ((n11 = t.b(n11, this.getLayoutDirection()) & 7) == 1) break block5;
                                if (n11 == 5) break block6;
                                n11 = a8.leftMargin + n12;
                                break block7;
                            }
                            n18 = n13 - n14 - n20;
                            n11 = a8.rightMargin;
                            break block8;
                        }
                        n18 = (n13 - n12 - n15 - n20) / 2 + n12 + a8.leftMargin;
                        n11 = a8.rightMargin;
                    }
                    n11 = n18 - n11;
                }
                n18 = n8;
                if (this.t(n10)) {
                    n18 = n8 + n9;
                }
                n8 = n18 + a8.topMargin;
                this.A((View)drawable, n11, n8, n20, n19);
                n11 = n8 + (n19 + a8.bottomMargin);
            }
            ++n10;
            n8 = n11;
        }
    }

    @Override
    protected void onMeasure(int n8, int n9) {
        if (!this.C(n8, n9)) {
            super.onMeasure(n8, n9);
        }
    }
}

