package ax.F6;

import android.view.View;
import android.view.ViewGroup;
import ax.k6.C2406g;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
public class g extends ViewGroup {
    private int a;
    private int b;
    private boolean c;
    private int d;

    private static int a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    public int b(View view) {
        Object tag = view.getTag(C2406g.K);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
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

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.d = 0;
            return;
        }
        this.d = 1;
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = paddingRight;
        int i8 = paddingTop;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C2406g.K, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.getMarginStart();
                    i5 = marginLayoutParams.getMarginEnd();
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = i7 + i6 + childAt.getMeasuredWidth();
                int i10 = i3 - i;
                int i11 = i10 - paddingLeft;
                if (!this.c && measuredWidth > i11) {
                    measuredWidth = paddingRight + i6 + childAt.getMeasuredWidth();
                    i8 = paddingTop + this.a;
                    this.d++;
                    i7 = paddingRight;
                }
                childAt.setTag(C2406g.K, Integer.valueOf(this.d - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i8;
                if (z2) {
                    childAt.layout(i10 - measuredWidth, i8, (i10 - i7) - i6, measuredHeight);
                } else {
                    childAt.layout(i7 + i6, i8, measuredWidth, measuredHeight);
                }
                i7 += i6 + i5 + childAt.getMeasuredWidth() + this.b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : SubsamplingScaleImageView.TILE_SIZE_AUTO;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin;
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i10 = paddingLeft;
                if (paddingLeft + i3 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    i5 = i10;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.a + paddingTop;
                }
                int measuredWidth = i5 + i3 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i3 + i4 + childAt.getMeasuredWidth() + this.b;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i8 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i) {
        this.b = i;
    }

    protected void setLineSpacing(int i) {
        this.a = i;
    }

    public void setSingleLine(boolean z) {
        this.c = z;
    }
}
