/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.O;
import ax.c0.d0;
import ax.c0.t;
import ax.m.j;

public class B
extends ViewGroup {
    private boolean a = true;
    private int b = -1;
    private int c = 0;
    private int d;
    private int e = 0x800033;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public B(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public B(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        boolean bl;
        int[] nArray = ax.m.j.a1;
        L l8 = L.v(context, attributeSet, nArray, n8, 0);
        d0.j0((View)this, context, nArray, attributeSet, l8.r(), n8, 0);
        n8 = l8.k(ax.m.j.c1, -1);
        if (n8 >= 0) {
            this.setOrientation(n8);
        }
        if ((n8 = l8.k(ax.m.j.b1, -1)) >= 0) {
            this.setGravity(n8);
        }
        if (!(bl = l8.a(ax.m.j.d1, true))) {
            this.setBaselineAligned(bl);
        }
        this.g = l8.i(ax.m.j.f1, -1.0f);
        this.b = l8.k(ax.m.j.e1, -1);
        this.h = l8.a(ax.m.j.i1, false);
        this.setDividerDrawable(l8.g(ax.m.j.g1));
        this.n = l8.k(ax.m.j.j1, 0);
        this.o = l8.f(ax.m.j.h1, 0);
        l8.x();
    }

    private void A(View view, int n8, int n9, int n10, int n11) {
        view.layout(n8, n9, n10 + n8, n11 + n9);
    }

    private void k(int n8, int n9) {
        int n10 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0x40000000);
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.s(i8);
            if (view.getVisibility() == 8) continue;
            a a8 = (a)view.getLayoutParams();
            if (a8.height != -1) continue;
            int n11 = a8.width;
            a8.width = view.getMeasuredWidth();
            this.measureChildWithMargins(view, n9, 0, n10, 0);
            a8.width = n11;
        }
    }

    private void l(int n8, int n9) {
        int n10 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000);
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.s(i8);
            if (view.getVisibility() == 8) continue;
            a a8 = (a)view.getLayoutParams();
            if (a8.width != -1) continue;
            int n11 = a8.height;
            a8.height = view.getMeasuredHeight();
            this.measureChildWithMargins(view, n10, 0, n9, 0);
            a8.height = n11;
        }
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void g(Canvas var1_1) {
        block6: {
            block5: {
                var4_2 = this.getVirtualChildCount();
                var5_3 = O.b((View)this);
                for (var2_4 = 0; var2_4 < var4_2; ++var2_4) {
                    var7_7 /* !! */  = this.s(var2_4);
                    if (var7_7 /* !! */  == null || var7_7 /* !! */ .getVisibility() == 8 || !this.t(var2_4)) continue;
                    var6_6 /* !! */  = (a)var7_7 /* !! */ .getLayoutParams();
                    var3_5 = var5_3 != false ? var7_7 /* !! */ .getRight() + var6_6 /* !! */ .rightMargin : var7_7 /* !! */ .getLeft() - var6_6 /* !! */ .leftMargin - this.l;
                    this.j(var1_1, var3_5);
                }
                if (!this.t(var4_2)) break block6;
                var6_6 /* !! */  = this.s(var4_2 - 1);
                if (var6_6 /* !! */  != null) ** GOTO lbl21
                if (var5_3) {
                    var2_4 = this.getPaddingLeft();
                } else {
                    var2_4 = this.getWidth() - this.getPaddingRight();
                    var3_5 = this.l;
lbl18:
                    // 2 sources

                    while (true) {
                        var2_4 -= var3_5;
                        break block5;
                        break;
                    }
lbl21:
                    // 1 sources

                    var7_7 /* !! */  = (a)var6_6 /* !! */ .getLayoutParams();
                    if (var5_3) {
                        var2_4 = var6_6 /* !! */ .getLeft() - var7_7 /* !! */ .leftMargin;
                        var3_5 = this.l;
                        ** continue;
                    }
                    var2_4 = var6_6 /* !! */ .getRight() + var7_7 /* !! */ .rightMargin;
                }
            }
            this.j(var1_1, var2_4);
        }
    }

    public int getBaseline() {
        int n8;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int n9 = this.getChildCount();
        if (n9 > (n8 = this.b)) {
            View view = this.getChildAt(n8);
            int n10 = view.getBaseline();
            if (n10 == -1) {
                if (this.b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            n9 = n8 = this.c;
            if (this.d == 1) {
                int n11 = this.e & 0x70;
                n9 = n8;
                if (n11 != 48) {
                    n9 = n11 != 16 ? (n11 != 80 ? n8 : this.getBottom() - this.getTop() - this.getPaddingBottom() - this.f) : n8 + (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.f) / 2;
                }
            }
            return n9 + ((a)view.getLayoutParams()).topMargin + n10;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    int getVirtualChildCount() {
        return this.getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    void h(Canvas canvas) {
        a a8;
        View view;
        int n8;
        int n9 = this.getVirtualChildCount();
        for (n8 = 0; n8 < n9; ++n8) {
            view = this.s(n8);
            if (view == null || view.getVisibility() == 8 || !this.t(n8)) continue;
            a8 = (a)view.getLayoutParams();
            this.i(canvas, view.getTop() - a8.topMargin - this.m);
        }
        if (this.t(n9)) {
            view = this.s(n9 - 1);
            if (view == null) {
                n8 = this.getHeight() - this.getPaddingBottom() - this.m;
            } else {
                a8 = (a)view.getLayoutParams();
                n8 = view.getBottom() + a8.bottomMargin;
            }
            this.i(canvas, n8);
        }
    }

    void i(Canvas canvas, int n8) {
        this.k.setBounds(this.getPaddingLeft() + this.o, n8, this.getWidth() - this.getPaddingRight() - this.o, this.m + n8);
        this.k.draw(canvas);
    }

    void j(Canvas canvas, int n8) {
        this.k.setBounds(n8, this.getPaddingTop() + this.o, this.l + n8, this.getHeight() - this.getPaddingBottom() - this.o);
        this.k.draw(canvas);
    }

    protected a m() {
        int n8 = this.d;
        if (n8 == 0) {
            return new a(-2, -2);
        }
        if (n8 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    public a n(AttributeSet attributeSet) {
        return new a(this.getContext(), attributeSet);
    }

    protected a o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams)((a)layoutParams));
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new a(layoutParams);
    }

    protected void onDraw(Canvas canvas) {
        if (this.k == null) {
            return;
        }
        if (this.d == 1) {
            this.h(canvas);
            return;
        }
        this.g(canvas);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        if (this.d == 1) {
            this.v(n8, n9, n10, n11);
            return;
        }
        this.u(n8, n9, n10, n11);
    }

    protected void onMeasure(int n8, int n9) {
        if (this.d == 1) {
            this.z(n8, n9);
            return;
        }
        this.x(n8, n9);
    }

    int p(View view, int n8) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int n8) {
        return this.getChildAt(n8);
    }

    public void setBaselineAligned(boolean bl) {
        this.a = bl;
    }

    public void setBaselineAlignedChildIndex(int n8) {
        if (n8 >= 0 && n8 < this.getChildCount()) {
            this.b = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("base aligned child index out of range (0, ");
        stringBuilder.append(this.getChildCount());
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        boolean bl = false;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
            this.m = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
            this.m = 0;
        }
        if (drawable == null) {
            bl = true;
        }
        this.setWillNotDraw(bl);
        this.requestLayout();
    }

    public void setDividerPadding(int n8) {
        this.o = n8;
    }

    public void setGravity(int n8) {
        if (this.e != n8) {
            int n9 = n8;
            if ((0x800007 & n8) == 0) {
                n9 = n8 | 0x800003;
            }
            n8 = n9;
            if ((n9 & 0x70) == 0) {
                n8 = n9 | 0x30;
            }
            this.e = n8;
            this.requestLayout();
        }
    }

    public void setHorizontalGravity(int n8) {
        n8 = this.e;
        int n9 = n8 & 0x800007;
        if ((0x800007 & n8) != n9) {
            this.e = n9 | 0xFF7FFFF8 & n8;
            this.requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean bl) {
        this.h = bl;
    }

    public void setOrientation(int n8) {
        if (this.d != n8) {
            this.d = n8;
            this.requestLayout();
        }
    }

    public void setShowDividers(int n8) {
        if (n8 != this.n) {
            this.requestLayout();
        }
        this.n = n8;
    }

    public void setVerticalGravity(int n8) {
        int n9 = this.e;
        if ((n9 & 0x70) != (n8 &= 0x70)) {
            this.e = n8 | n9 & 0xFFFFFF8F;
            this.requestLayout();
        }
    }

    public void setWeightSum(float f8) {
        this.g = Math.max(0.0f, f8);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t(int n8) {
        if (n8 == 0) {
            return (this.n & 1) != 0;
        }
        if (n8 == this.getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) != 0) {
            --n8;
            while (n8 >= 0) {
                if (this.getChildAt(n8).getVisibility() != 8) {
                    return true;
                }
                --n8;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    void u(int n8, int n9, int n10, int n11) {
        int n12;
        int n13;
        boolean bl = O.b((View)this);
        int n14 = this.getPaddingTop();
        int n15 = n11 - n9;
        int n16 = this.getPaddingBottom();
        int n17 = this.getPaddingBottom();
        int n18 = this.getVirtualChildCount();
        int n19 = this.e;
        boolean bl2 = this.a;
        int[] nArray = this.i;
        int[] nArray2 = this.j;
        n9 = t.b(0x800007 & n19, this.getLayoutDirection());
        n8 = n9 != 1 ? (n9 != 5 ? this.getPaddingLeft() : this.getPaddingLeft() + n10 - n8 - this.f) : this.getPaddingLeft() + (n10 - n8 - this.f) / 2;
        if (bl) {
            n13 = n18 - 1;
            n12 = -1;
        } else {
            n13 = 0;
            n12 = 1;
        }
        n9 = 0;
        n10 = n14;
        n11 = n8;
        while (true) {
            block8: {
                block9: {
                    int n20;
                    int n21;
                    a a8;
                    int n22;
                    int n23;
                    View view;
                    int n24;
                    block13: {
                        block14: {
                            block10: {
                                block11: {
                                    block12: {
                                        block7: {
                                            if (n9 >= n18) {
                                                return;
                                            }
                                            n24 = n13 + n12 * n9;
                                            view = this.s(n24);
                                            if (view != null) break block7;
                                            n11 += this.y(n24);
                                            n8 = n9;
                                            break block8;
                                        }
                                        if (view.getVisibility() == 8) break block9;
                                        n23 = view.getMeasuredWidth();
                                        n22 = view.getMeasuredHeight();
                                        a8 = (a)view.getLayoutParams();
                                        n21 = bl2 && a8.height != -1 ? view.getBaseline() : -1;
                                        n8 = n20 = a8.gravity;
                                        if (n20 < 0) {
                                            n8 = n19 & 0x70;
                                        }
                                        if ((n8 &= 0x70) == 16) break block10;
                                        if (n8 == 48) break block11;
                                        if (n8 == 80) break block12;
                                        n8 = n10;
                                        break block13;
                                    }
                                    n8 = n20 = n15 - n16 - n22 - a8.bottomMargin;
                                    if (n21 == -1) break block13;
                                    n8 = view.getMeasuredHeight();
                                    n8 = nArray2[2] - (n8 - n21);
                                    break block14;
                                }
                                n8 = n20 = n10 + a8.topMargin;
                                if (n21 != -1) {
                                    n8 = n20 + (nArray[1] - n21);
                                }
                                break block13;
                            }
                            n20 = n10 + (n15 - n14 - n17 - n22) / 2 + a8.topMargin;
                            n8 = a8.bottomMargin;
                        }
                        n8 = n20 - n8;
                    }
                    if (this.t(n24)) {
                        n11 += this.l;
                    }
                    n11 = a8.leftMargin + n11;
                    this.A(view, this.q(view) + n11, n8, n23, n22);
                    n21 = a8.rightMargin;
                    n20 = this.r(view);
                    n8 = this.p(view, n24) + n9;
                    n11 += n21 + n23 + n20;
                    break block8;
                }
                n8 = n9;
            }
            n9 = n8 + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void v(int n8, int n9, int n10, int n11) {
        int n12 = this.getPaddingLeft();
        int n13 = n10 - n8;
        int n14 = this.getPaddingRight();
        int n15 = this.getPaddingRight();
        int n16 = this.getVirtualChildCount();
        int n17 = this.e;
        n8 = n17 & 0x70;
        n8 = n8 != 16 ? (n8 != 80 ? this.getPaddingTop() : this.getPaddingTop() + n11 - n9 - this.f) : this.getPaddingTop() + (n11 - n9 - this.f) / 2;
        n9 = 0;
        while (true) {
            block9: {
                a a8;
                int n18;
                int n19;
                View view;
                block8: {
                    block10: {
                        block6: {
                            block7: {
                                block5: {
                                    block4: {
                                        if (n9 >= n16) {
                                            return;
                                        }
                                        view = this.s(n9);
                                        if (view != null) break block4;
                                        n10 = n8 + this.y(n9);
                                        break block5;
                                    }
                                    n10 = n8;
                                    if (view.getVisibility() == 8) break block5;
                                    n19 = view.getMeasuredWidth();
                                    n18 = view.getMeasuredHeight();
                                    a8 = (a)view.getLayoutParams();
                                    n10 = n11 = a8.gravity;
                                    if (n11 < 0) {
                                        n10 = n17 & 0x800007;
                                    }
                                    if ((n10 = t.b(n10, this.getLayoutDirection()) & 7) == 1) break block6;
                                    if (n10 == 5) break block7;
                                    n10 = a8.leftMargin + n12;
                                    break block8;
                                }
                                n8 = n10;
                                break block9;
                            }
                            n10 = n13 - n14 - n19;
                            n11 = a8.rightMargin;
                            break block10;
                        }
                        n10 = (n13 - n12 - n15 - n19) / 2 + n12 + a8.leftMargin;
                        n11 = a8.rightMargin;
                    }
                    n10 -= n11;
                }
                n11 = n8;
                if (this.t(n9)) {
                    n11 = n8 + this.m;
                }
                n8 = n11 + a8.topMargin;
                this.A(view, n10, n8 + this.q(view), n19, n18);
                n8 += n18 + a8.bottomMargin + this.r(view);
                n9 += this.p(view, n9);
            }
            ++n9;
        }
    }

    void w(View view, int n8, int n9, int n10, int n11, int n12) {
        this.measureChildWithMargins(view, n9, n10, n11, n12);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void x(int var1_1, int var2_2) {
        this.f = 0;
        var21_3 = this.getVirtualChildCount();
        var16_4 = View.MeasureSpec.getMode((int)var1_1);
        var22_5 = View.MeasureSpec.getMode((int)var2_2);
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        var28_6 = this.i;
        var27_7 /* !! */  = this.j;
        var28_6[3] = -1;
        var28_6[2] = -1;
        var28_6[1] = -1;
        var28_6[0] = -1;
        var27_7 /* !! */ [3] = -1;
        var27_7 /* !! */ [2] = -1;
        var27_7 /* !! */ [1] = -1;
        var27_7 /* !! */ [0] = -1;
        var25_8 = this.a;
        var24_9 = this.h;
        var15_10 = var16_4 == 0x40000000;
        var3_12 = 0.0f;
        var5_13 = 0;
        var8_14 = 0;
        var12_15 = 0;
        var10_16 = 0;
        var13_17 = 0;
        var9_18 = 0;
        var7_19 = 1;
        var11_20 = false;
        block0: for (var6_11 = 0; var6_11 < var21_3; ++var6_11) {
            block57: {
                block56: {
                    block54: {
                        block55: {
                            var30_30 /* !! */  = this.s(var6_11);
                            if (var30_30 /* !! */  == null) {
                                this.f += this.y(var6_11);
lbl34:
                                // 2 sources

                                while (true) {
                                    var26_28 = var24_9;
                                    continue block0;
                                    break;
                                }
                            }
                            if (var30_30 /* !! */ .getVisibility() == 8) {
                                var6_11 += this.p(var30_30 /* !! */ , var6_11);
                                ** continue;
                            }
                            if (this.t(var6_11)) {
                                this.f += this.l;
                            }
                            var29_29 = (a)var30_30 /* !! */ .getLayoutParams();
                            var4_21 = var29_29.weight;
                            var3_12 += var4_21;
                            if (var16_4 != 0x40000000 || var29_29.width != 0 || !(var4_21 > 0.0f)) break block54;
                            if (var15_10) {
                                this.f += var29_29.leftMargin + var29_29.rightMargin;
                            } else {
                                var14_22 = this.f;
                                this.f = Math.max(var14_22, var29_29.leftMargin + var14_22 + var29_29.rightMargin);
                            }
                            if (!var25_8) break block55;
                            var14_22 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                            var30_30 /* !! */ .measure(var14_22, var14_22);
                            var26_28 = var24_9;
                            var14_22 = var10_16;
                            break block56;
                        }
                        var13_17 = 1;
                        var26_28 = var24_9;
                        break block57;
                    }
                    if (var29_29.width == 0 && var4_21 > 0.0f) {
                        var29_29.width = -2;
                        var14_22 = 0;
                    } else {
                        var14_22 = -2147483648;
                    }
                    var17_23 = var3_12 == 0.0f ? this.f : 0;
                    var26_28 = var24_9;
                    this.w(var30_30 /* !! */ , var6_11, var1_1, var17_23, var2_2, 0);
                    if (var14_22 != -2147483648) {
                        var29_29.width = var14_22;
                    }
                    var17_23 = var30_30 /* !! */ .getMeasuredWidth();
                    if (var15_10) {
                        this.f += var29_29.leftMargin + var17_23 + var29_29.rightMargin + this.r(var30_30 /* !! */ );
                    } else {
                        var14_22 = this.f;
                        this.f = Math.max(var14_22, var14_22 + var17_23 + var29_29.leftMargin + var29_29.rightMargin + this.r(var30_30 /* !! */ ));
                    }
                    var14_22 = var10_16;
                    if (var26_28) {
                        var14_22 = Math.max(var17_23, var10_16);
                    }
                }
                var26_28 = var24_9;
                var10_16 = var14_22;
            }
            var26_28 = var24_9;
            if (var22_5 != 0x40000000 && var29_29.height == -1) {
                var14_22 = 1;
                var11_20 = true;
            } else {
                var14_22 = 0;
            }
            var17_23 = var29_29.topMargin + var29_29.bottomMargin;
            var18_24 = var30_30 /* !! */ .getMeasuredHeight() + var17_23;
            var19_25 = View.combineMeasuredStates((int)var9_18, (int)var30_30 /* !! */ .getMeasuredState());
            if (var25_8 && (var23_27 = var30_30 /* !! */ .getBaseline()) != -1) {
                var9_18 = var20_26 = var29_29.gravity;
                if (var20_26 < 0) {
                    var9_18 = this.e;
                }
                var9_18 = ((var9_18 & 112) >> 4 & -2) >> 1;
                var28_6[var9_18] = Math.max(var28_6[var9_18], var23_27);
                var27_7 /* !! */ [var9_18] = Math.max(var27_7 /* !! */ [var9_18], var18_24 - var23_27);
            }
            var20_26 = Math.max(var5_13, var18_24);
            var5_13 = var7_19 != 0 && var29_29.height == -1 ? 1 : 0;
            if (var29_29.weight > 0.0f) {
                if (var14_22 != 0) {
                    var18_24 = var17_23;
                }
                var12_15 = Math.max(var12_15, var18_24);
            } else {
                if (var14_22 != 0) {
                    var18_24 = var17_23;
                }
                var8_14 = Math.max(var8_14, var18_24);
            }
            var6_11 += this.p(var30_30 /* !! */ , var6_11);
            var7_19 = var5_13;
            var9_18 = var19_25;
            var5_13 = var20_26;
        }
        if (this.f > 0 && this.t(var21_3)) {
            this.f += this.l;
        }
        var6_11 = (var6_11 = var28_6[1]) == -1 && var28_6[0] == -1 && var28_6[2] == -1 && var28_6[3] == -1 ? var5_13 : Math.max(var5_13, Math.max(var28_6[3], Math.max(var28_6[0], Math.max(var6_11, var28_6[2]))) + Math.max(var27_7 /* !! */ [3], Math.max(var27_7 /* !! */ [0], Math.max(var27_7 /* !! */ [1], var27_7 /* !! */ [2]))));
        if (!var24_9) ** GOTO lbl149
        if (var16_4 == -2147483648) ** GOTO lbl-1000
        var14_22 = var6_11;
        var4_21 = var3_12;
        if (var16_4 != 0) {
            while (true) {
                var5_13 = var14_22;
                var3_12 = var4_21;
                break;
            }
        } else lbl-1000:
        // 2 sources

        {
            this.f = 0;
            var5_13 = 0;
            while (true) {
                var14_22 = var6_11;
                var4_21 = var3_12;
                if (var5_13 >= var21_3) ** continue;
                var30_30 /* !! */  = this.s(var5_13);
                if (var30_30 /* !! */  == null) {
                    this.f += this.y(var5_13);
                } else if (var30_30 /* !! */ .getVisibility() == 8) {
                    var5_13 += this.p(var30_30 /* !! */ , var5_13);
                } else {
                    var29_29 = (a)var30_30 /* !! */ .getLayoutParams();
                    if (var15_10) {
                        this.f += var29_29.leftMargin + var10_16 + var29_29.rightMargin + this.r(var30_30 /* !! */ );
                    } else {
                        var14_22 = this.f;
                        this.f = Math.max(var14_22, var14_22 + var10_16 + var29_29.leftMargin + var29_29.rightMargin + this.r(var30_30 /* !! */ ));
                    }
                }
                ++var5_13;
            }
lbl149:
            // 1 sources

            var5_13 = var6_11;
        }
        this.f = var6_11 = this.f + (this.getPaddingLeft() + this.getPaddingRight());
        var6_11 = View.resolveSizeAndState((int)Math.max(var6_11, this.getSuggestedMinimumWidth()), (int)var1_1, (int)0);
        var14_22 = (0xFFFFFF & var6_11) - this.f;
        if (!(var13_17 != 0 || var14_22 != 0 && var3_12 > 0.0f)) {
            var12_15 = Math.max(var8_14, var12_15);
            if (var24_9 && var16_4 != 0x40000000) {
                for (var8_14 = 0; var8_14 < var21_3; ++var8_14) {
                    var27_7 /* !! */  = (int[])this.s(var8_14);
                    if (var27_7 /* !! */  == null || var27_7 /* !! */ .getVisibility() == 8 || !(((a)var27_7 /* !! */ .getLayoutParams()).weight > 0.0f)) continue;
                    var27_7 /* !! */ .measure(View.MeasureSpec.makeMeasureSpec((int)var10_16, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)var27_7 /* !! */ .getMeasuredHeight(), (int)0x40000000));
                }
            }
            var8_14 = var6_11;
            var6_11 = var5_13;
            var5_13 = var12_15;
        } else {
            var4_21 = this.g;
            if (var4_21 > 0.0f) {
                var3_12 = var4_21;
            }
            var28_6[3] = -1;
            var28_6[2] = -1;
            var28_6[1] = -1;
            var28_6[0] = -1;
            var27_7 /* !! */ [3] = -1;
            var27_7 /* !! */ [2] = -1;
            var27_7 /* !! */ [1] = -1;
            var27_7 /* !! */ [0] = -1;
            this.f = 0;
            var5_13 = var9_18;
            var9_18 = -1;
            var12_15 = var14_22;
            for (var13_17 = 0; var13_17 < var21_3; ++var13_17) {
                var29_29 = this.s(var13_17);
                if (var29_29 == null || var29_29.getVisibility() == 8) {
                    var10_16 = var5_13;
                } else {
                    var30_30 /* !! */  = (a)var29_29.getLayoutParams();
                    var4_21 = var30_30 /* !! */ .weight;
                    if (var4_21 > 0.0f) {
                        var10_16 = (int)((float)var12_15 * var4_21 / var3_12);
                        var3_12 -= var4_21;
                        var12_15 -= var10_16;
                        var17_23 = ViewGroup.getChildMeasureSpec((int)var2_2, (int)(this.getPaddingTop() + this.getPaddingBottom() + var30_30 /* !! */ .topMargin + var30_30 /* !! */ .bottomMargin), (int)var30_30 /* !! */ .height);
                        if (var30_30 /* !! */ .width == 0 && var16_4 == 0x40000000) {
                            if (var10_16 <= 0) {
                                var10_16 = 0;
                            }
                            var29_29.measure(View.MeasureSpec.makeMeasureSpec((int)var10_16, (int)0x40000000), var17_23);
                        } else {
                            var10_16 = var14_22 = var29_29.getMeasuredWidth() + var10_16;
                            if (var14_22 < 0) {
                                var10_16 = 0;
                            }
                            var29_29.measure(View.MeasureSpec.makeMeasureSpec((int)var10_16, (int)0x40000000), var17_23);
                        }
                        var10_16 = View.combineMeasuredStates((int)var5_13, (int)(var29_29.getMeasuredState() & -16777216));
                        var5_13 = var12_15;
                    } else {
                        var10_16 = var5_13;
                        var5_13 = var12_15;
                    }
                    if (var15_10) {
                        this.f += var29_29.getMeasuredWidth() + var30_30 /* !! */ .leftMargin + var30_30 /* !! */ .rightMargin + this.r((View)var29_29);
                    } else {
                        var12_15 = this.f;
                        this.f = Math.max(var12_15, var29_29.getMeasuredWidth() + var12_15 + var30_30 /* !! */ .leftMargin + var30_30 /* !! */ .rightMargin + this.r((View)var29_29));
                    }
                    var12_15 = var22_5 != 0x40000000 && var30_30 /* !! */ .height == -1 ? 1 : 0;
                    var18_24 = var30_30 /* !! */ .topMargin + var30_30 /* !! */ .bottomMargin;
                    var17_23 = var29_29.getMeasuredHeight() + var18_24;
                    var14_22 = Math.max(var9_18, var17_23);
                    var9_18 = var12_15 != 0 ? var18_24 : var17_23;
                    var9_18 = Math.max(var8_14, var9_18);
                    var7_19 = var7_19 != 0 && var30_30 /* !! */ .height == -1 ? 1 : 0;
                    if (var25_8 && (var18_24 = var29_29.getBaseline()) != -1) {
                        var8_14 = var12_15 = var30_30 /* !! */ .gravity;
                        if (var12_15 < 0) {
                            var8_14 = this.e;
                        }
                        var8_14 = ((var8_14 & 112) >> 4 & -2) >> 1;
                        var28_6[var8_14] = Math.max(var28_6[var8_14], var18_24);
                        var27_7 /* !! */ [var8_14] = Math.max(var27_7 /* !! */ [var8_14], var17_23 - var18_24);
                    }
                    var8_14 = var9_18;
                    var9_18 = var14_22;
                    var12_15 = var5_13;
                }
                var5_13 = var10_16;
            }
            var10_16 = var6_11;
            this.f += this.getPaddingLeft() + this.getPaddingRight();
            var6_11 = var28_6[1];
            var6_11 = var6_11 == -1 && var28_6[0] == -1 && var28_6[2] == -1 && var28_6[3] == -1 ? var9_18 : Math.max(var9_18, Math.max(var28_6[3], Math.max(var28_6[0], Math.max(var6_11, var28_6[2]))) + Math.max(var27_7 /* !! */ [3], Math.max(var27_7 /* !! */ [0], Math.max(var27_7 /* !! */ [1], var27_7 /* !! */ [2]))));
            var9_18 = var5_13;
            var5_13 = var8_14;
            var8_14 = var10_16;
        }
        var10_16 = var6_11;
        if (var7_19 == 0) {
            var10_16 = var6_11;
            if (var22_5 != 0x40000000) {
                var10_16 = var5_13;
            }
        }
        this.setMeasuredDimension(var8_14 | var9_18 & -16777216, View.resolveSizeAndState((int)Math.max(var10_16 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), (int)var2_2, (int)(var9_18 << 16)));
        if (var11_20) {
            this.k(var21_3, var1_1);
        }
    }

    int y(int n8) {
        return 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void z(int var1_1, int var2_2) {
        block45: {
            block46: {
                this.f = 0;
                var15_3 = this.getVirtualChildCount();
                var21_4 = View.MeasureSpec.getMode((int)var1_1);
                var12_5 = View.MeasureSpec.getMode((int)var2_2);
                var22_6 = this.b;
                var23_7 = this.h;
                var3_8 = 0.0f;
                var9_10 = 0;
                var8_11 = 0;
                var10_12 = 0;
                var5_13 = 0;
                var6_14 = 0;
                var14_15 = 0;
                var7_16 = 1;
                var11_17 = false;
                for (var13_9 = 0; var13_9 < var15_3; ++var13_9) {
                    var25_25 /* !! */  = this.s(var13_9);
                    if (var25_25 /* !! */  == null) {
                        this.f += this.y(var13_9);
lbl20:
                        // 2 sources

                        while (true) {
                            var16_19 = var10_12;
                            var10_12 = var8_11;
                            var17_20 = var5_13;
                            var8_11 = var16_19;
                            var5_13 = var9_10;
                            var16_19 = var7_16;
                            break;
                        }
                    } else {
                        if (var25_25 /* !! */ .getVisibility() == 8) {
                            var13_9 += this.p(var25_25 /* !! */ , var13_9);
                            ** continue;
                        }
                        if (this.t(var13_9)) {
                            this.f += this.m;
                        }
                        var24_24 = (a)var25_25 /* !! */ .getLayoutParams();
                        var4_18 = var24_24.weight;
                        var3_8 += var4_18;
                        if (var12_5 == 0x40000000 && var24_24.height == 0 && var4_18 > 0.0f) {
                            var14_15 = this.f;
                            this.f = Math.max(var14_15, var24_24.topMargin + var14_15 + var24_24.bottomMargin);
                            var14_15 = 1;
                            var16_19 = var5_13;
                        } else {
                            if (var24_24.height == 0 && var4_18 > 0.0f) {
                                var24_24.height = -2;
                                var16_19 = 0;
                            } else {
                                var16_19 = -2147483648;
                            }
                            var17_20 = var3_8 == 0.0f ? this.f : 0;
                            var18_21 = var5_13;
                            this.w(var25_25 /* !! */ , var13_9, var1_1, 0, var2_2, var17_20);
                            if (var16_19 != -2147483648) {
                                var24_24.height = var16_19;
                            }
                            var17_20 = var25_25 /* !! */ .getMeasuredHeight();
                            var16_19 = this.f;
                            this.f = Math.max(var16_19, var16_19 + var17_20 + var24_24.topMargin + var24_24.bottomMargin + this.r(var25_25 /* !! */ ));
                            if (var23_7) {
                                var8_11 = Math.max(var17_20, var8_11);
                            }
                        }
                        if (var22_6 >= 0 && var22_6 == var13_9 + 1) {
                            this.c = this.f;
                        }
                        if (var13_9 < var22_6 && var24_24.weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (var21_4 != 0x40000000 && var24_24.width == -1) {
                            var16_19 = 1;
                            var11_17 = true;
                        } else {
                            var16_19 = 0;
                        }
                        var17_20 = var24_24.leftMargin + var24_24.rightMargin;
                        var18_21 = var25_25 /* !! */ .getMeasuredWidth() + var17_20;
                        var19_22 = Math.max(var10_12, var18_21);
                        var20_23 = View.combineMeasuredStates((int)var5_13, (int)var25_25 /* !! */ .getMeasuredState());
                        var5_13 = var7_16 != 0 && var24_24.width == -1 ? 1 : 0;
                        if (var24_24.weight > 0.0f) {
                            if (var16_19 == 0) {
                                var17_20 = var18_21;
                            }
                            var7_16 = Math.max(var9_10, var17_20);
                        } else {
                            if (var16_19 == 0) {
                                var17_20 = var18_21;
                            }
                            var6_14 = Math.max(var6_14, var17_20);
                            var7_16 = var9_10;
                        }
                        var13_9 += this.p(var25_25 /* !! */ , var13_9);
                        var10_12 = var8_11;
                        var17_20 = var20_23;
                        var16_19 = var5_13;
                        var5_13 = var7_16;
                        var8_11 = var19_22;
                    }
                    var7_16 = var8_11;
                    var9_10 = var5_13;
                    var8_11 = var10_12;
                    var10_12 = var7_16;
                    var5_13 = var17_20;
                    var7_16 = var16_19;
                }
                if (this.f > 0 && this.t(var15_3)) {
                    this.f += this.m;
                }
                var16_19 = var12_5;
                if (var23_7 && (var16_19 == -2147483648 || var16_19 == 0)) {
                    this.f = 0;
                    for (var12_5 = 0; var12_5 < var15_3; ++var12_5) {
                        var24_24 = this.s(var12_5);
                        if (var24_24 == null) {
                            this.f += this.y(var12_5);
                            continue;
                        }
                        if (var24_24.getVisibility() == 8) {
                            var12_5 += this.p((View)var24_24, var12_5);
                            continue;
                        }
                        var25_25 /* !! */  = (a)var24_24.getLayoutParams();
                        var13_9 = this.f;
                        this.f = Math.max(var13_9, var13_9 + var8_11 + var25_25 /* !! */ .topMargin + var25_25 /* !! */ .bottomMargin + this.r((View)var24_24));
                    }
                }
                this.f = var12_5 = this.f + (this.getPaddingTop() + this.getPaddingBottom());
                var18_21 = View.resolveSizeAndState((int)Math.max(var12_5, this.getSuggestedMinimumHeight()), (int)var2_2, (int)0);
                var12_5 = (0xFFFFFF & var18_21) - this.f;
                if (var14_15 != 0 || var12_5 != 0 && var3_8 > 0.0f) break block46;
                var9_10 = var17_20 = Math.max(var6_14, var9_10);
                var13_9 = var5_13;
                var6_14 = var10_12;
                var12_5 = var7_16;
                if (!var23_7) break block45;
                var9_10 = var17_20;
                var13_9 = var5_13;
                var6_14 = var10_12;
                var12_5 = var7_16;
                if (var16_19 != 0x40000000) {
                    var14_15 = 0;
                    while (true) {
                        var9_10 = var17_20;
                        var13_9 = var5_13;
                        var6_14 = var10_12;
                        var12_5 = var7_16;
                        if (var14_15 < var15_3) {
                            var24_24 = this.s(var14_15);
                            if (var24_24 != null && var24_24.getVisibility() != 8 && ((a)var24_24.getLayoutParams()).weight > 0.0f) {
                                var24_24.measure(View.MeasureSpec.makeMeasureSpec((int)var24_24.getMeasuredWidth(), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)var8_11, (int)0x40000000));
                            }
                            ++var14_15;
                            continue;
                        } else {
                            ** GOTO lbl-1000
                        }
                        break;
                    }
                }
                break block45;
lbl-1000:
                // 2 sources

                {
                    break block45;
                }
            }
            var4_18 = this.g;
            if (var4_18 > 0.0f) {
                var3_8 = var4_18;
            }
            this.f = 0;
            var9_10 = var12_5;
            var8_11 = var10_12;
            var10_12 = var9_10;
            var12_5 = var16_19;
            for (var13_9 = 0; var13_9 < var15_3; ++var13_9) {
                var24_24 = this.s(var13_9);
                if (var24_24.getVisibility() == 8) {
                    var9_10 = var5_13;
                } else {
                    var25_25 /* !! */  = (a)var24_24.getLayoutParams();
                    var4_18 = var25_25 /* !! */ .weight;
                    if (var4_18 > 0.0f) {
                        var9_10 = (int)((float)var10_12 * var4_18 / var3_8);
                        var3_8 -= var4_18;
                        var10_12 -= var9_10;
                        var16_19 = ViewGroup.getChildMeasureSpec((int)var1_1, (int)(this.getPaddingLeft() + this.getPaddingRight() + var25_25 /* !! */ .leftMargin + var25_25 /* !! */ .rightMargin), (int)var25_25 /* !! */ .width);
                        if (var25_25 /* !! */ .height == 0 && var12_5 == 0x40000000) {
                            if (var9_10 <= 0) {
                                var9_10 = 0;
                            }
                            var24_24.measure(var16_19, View.MeasureSpec.makeMeasureSpec((int)var9_10, (int)0x40000000));
                        } else {
                            var9_10 = var14_15 = var24_24.getMeasuredHeight() + var9_10;
                            if (var14_15 < 0) {
                                var9_10 = 0;
                            }
                            var24_24.measure(var16_19, View.MeasureSpec.makeMeasureSpec((int)var9_10, (int)0x40000000));
                        }
                        var9_10 = View.combineMeasuredStates((int)var5_13, (int)(var24_24.getMeasuredState() & -256));
                        var5_13 = var10_12;
                    } else {
                        var9_10 = var5_13;
                        var5_13 = var10_12;
                    }
                    var14_15 = var25_25 /* !! */ .leftMargin + var25_25 /* !! */ .rightMargin;
                    var16_19 = var24_24.getMeasuredWidth() + var14_15;
                    var10_12 = Math.max(var8_11, var16_19);
                    if (var21_4 != 0x40000000) {
                        var8_11 = var16_19;
                        if (var25_25 /* !! */ .width == -1) {
                            var8_11 = var14_15;
                        }
                    } else {
                        var8_11 = var16_19;
                    }
                    var8_11 = Math.max(var6_14, var8_11);
                    var6_14 = var7_16 != 0 && var25_25 /* !! */ .width == -1 ? 1 : 0;
                    var7_16 = this.f;
                    this.f = Math.max(var7_16, var7_16 + var24_24.getMeasuredHeight() + var25_25 /* !! */ .topMargin + var25_25 /* !! */ .bottomMargin + this.r((View)var24_24));
                    var7_16 = var6_14;
                    var6_14 = var8_11;
                    var8_11 = var10_12;
                    var10_12 = var5_13;
                }
                var5_13 = var9_10;
            }
            this.f += this.getPaddingTop() + this.getPaddingBottom();
            var9_10 = var6_14;
            var12_5 = var7_16;
            var6_14 = var8_11;
            var13_9 = var5_13;
        }
        var5_13 = var6_14;
        if (var12_5 == 0) {
            var5_13 = var6_14;
            if (var21_4 != 0x40000000) {
                var5_13 = var9_10;
            }
        }
        this.setMeasuredDimension(View.resolveSizeAndState((int)Math.max(var5_13 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), (int)var1_1, (int)var13_9), var18_21);
        if (var11_17) {
            this.l(var15_3, var2_2);
        }
    }

    public static class a
    extends LinearLayout.LayoutParams {
        public a(int n8, int n9) {
            super(n8, n9);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }
}

