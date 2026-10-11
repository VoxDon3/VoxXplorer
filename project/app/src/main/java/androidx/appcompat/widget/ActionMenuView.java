/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.B;
import androidx.appcompat.widget.O;

public class ActionMenuView
extends B
implements e.b,
k {
    e A;
    private androidx.appcompat.view.menu.e p;
    private Context q;
    private int r;
    private boolean s;
    private androidx.appcompat.widget.c t;
    private j.a u;
    e.a v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.y = (int)(56.0f * f8);
        this.z = (int)(f8 * 4.0f);
        this.q = context;
        this.r = 0;
    }

    /*
     * Unable to fully structure code
     */
    static int L(View var0, int var1_1, int var2_2, int var3_3, int var4_4) {
        var11_5 = (c)var0.getLayoutParams();
        var6_6 = View.MeasureSpec.makeMeasureSpec((int)(View.MeasureSpec.getSize((int)var3_3) - var4_4), (int)View.MeasureSpec.getMode((int)var3_3));
        var10_7 = var0 instanceof ActionMenuItemView != false ? (ActionMenuItemView)var0 : null;
        var9_8 = false;
        var3_3 = var10_7 != null && var10_7.s() != false ? 1 : 0;
        if (var2_2 <= 0) ** GOTO lbl-1000
        var4_4 = 2;
        if (var3_3 == 0 || var2_2 >= 2) {
            var0.measure(View.MeasureSpec.makeMeasureSpec((int)(var2_2 * var1_1), (int)-2147483648), var6_6);
            var7_9 = var0.getMeasuredWidth();
            var2_2 = var5_10 = var7_9 / var1_1;
            if (var7_9 % var1_1 != 0) {
                var2_2 = var5_10 + 1;
            }
            if (var3_3 != 0 && var2_2 < 2) {
                var2_2 = var4_4;
            }
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = 0;
        }
        var8_11 = var9_8;
        if (!var11_5.a) {
            var8_11 = var9_8;
            if (var3_3 != 0) {
                var8_11 = true;
            }
        }
        var11_5.d = var8_11;
        var11_5.b = var2_2;
        var0.measure(View.MeasureSpec.makeMeasureSpec((int)(var1_1 * var2_2), (int)0x40000000), var6_6);
        return var2_2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void M(int var1_1, int var2_2) {
        block37: {
            block36: {
                var19_3 = View.MeasureSpec.getMode((int)var2_2);
                var6_4 = View.MeasureSpec.getSize((int)var1_1);
                var8_5 = View.MeasureSpec.getSize((int)var2_2);
                var1_1 = this.getPaddingLeft();
                var5_6 = this.getPaddingRight();
                var18_7 = this.getPaddingTop() + this.getPaddingBottom();
                var20_8 = ViewGroup.getChildMeasureSpec((int)var2_2, (int)var18_7, (int)-2);
                var21_9 = var6_4 - (var1_1 + var5_6);
                var2_2 = this.y;
                if ((var1_1 = var21_9 / var2_2) == 0) {
                    this.setMeasuredDimension(var21_9, 0);
                    return;
                }
                var10_10 = var2_2 + var21_9 % var2_2 / var1_1;
                var22_11 = this.getChildCount();
                var5_6 = 0;
                var7_13 = 0;
                var12_14 = 0;
                var11_15 = 0;
                var6_4 = 0;
                var24_16 = 0L;
                var2_2 = var8_5;
                for (var9_12 = 0; var9_12 < var22_11; ++var9_12) {
                    var33_25 /* !! */  = this.getChildAt(var9_12);
                    if (var33_25 /* !! */ .getVisibility() == 8) {
                        var13_17 = var7_13;
                        var26_23 = var24_16;
                    } else {
                        var32_24 = var33_25 /* !! */  instanceof ActionMenuItemView;
                        var14_18 = var12_14 + 1;
                        if (var32_24) {
                            var8_5 = this.z;
                            var33_25 /* !! */ .setPadding(var8_5, 0, var8_5, 0);
                        }
                        var34_26 = (c)var33_25 /* !! */ .getLayoutParams();
                        var34_26.f = false;
                        var34_26.c = 0;
                        var34_26.b = 0;
                        var34_26.d = false;
                        var34_26.leftMargin = 0;
                        var34_26.rightMargin = 0;
                        var32_24 = var32_24 != false && ((ActionMenuItemView)var33_25 /* !! */ ).s() != false;
                        var34_26.e = var32_24;
                        var8_5 = var34_26.a != false ? 1 : var1_1;
                        var23_22 = ActionMenuView.L(var33_25 /* !! */ , var10_10, var8_5, var20_8, var18_7);
                        var15_19 = Math.max(var11_15, var23_22);
                        var8_5 = var6_4;
                        if (var34_26.d) {
                            var8_5 = var6_4 + 1;
                        }
                        if (var34_26.a) {
                            var7_13 = 1;
                        }
                        var16_20 = var1_1 - var23_22;
                        var17_21 = Math.max(var5_6, var33_25 /* !! */ .getMeasuredHeight());
                        var1_1 = var16_20;
                        var5_6 = var17_21;
                        var13_17 = var7_13;
                        var12_14 = var14_18;
                        var11_15 = var15_19;
                        var6_4 = var8_5;
                        var26_23 = var24_16;
                        if (var23_22 == 1) {
                            var26_23 = var24_16 | (long)(1 << var9_12);
                            var6_4 = var8_5;
                            var11_15 = var15_19;
                            var12_14 = var14_18;
                            var13_17 = var7_13;
                            var5_6 = var17_21;
                            var1_1 = var16_20;
                        }
                    }
                    var7_13 = var13_17;
                    var24_16 = var26_23;
                }
                var8_5 = var7_13 != 0 && var12_14 == 2 ? 1 : 0;
                var9_12 = 0;
                var13_17 = var1_1;
                var1_1 = var9_12;
                while (var6_4 > 0 && var13_17 > 0) {
                    var14_18 = 0x7FFFFFFF;
                    var28_27 = 0L;
                    var17_21 = 0;
                    for (var15_19 = 0; var15_19 < var22_11; ++var15_19) {
                        var33_25 /* !! */  = (c)this.getChildAt(var15_19).getLayoutParams();
                        if (!var33_25 /* !! */ .d) {
                            var9_12 = var17_21;
                            var16_20 = var14_18;
                            var26_23 = var28_27;
                        } else {
                            var18_7 = var33_25 /* !! */ .b;
                            if (var18_7 < var14_18) {
                                var26_23 = 1L << var15_19;
                                var16_20 = var18_7;
                                var9_12 = 1;
                            } else {
                                var9_12 = var17_21;
                                var16_20 = var14_18;
                                var26_23 = var28_27;
                                if (var18_7 == var14_18) {
                                    var26_23 = var28_27 | 1L << var15_19;
                                    var9_12 = var17_21 + 1;
                                    var16_20 = var14_18;
                                }
                            }
                        }
                        var17_21 = var9_12;
                        var14_18 = var16_20;
                        var28_27 = var26_23;
                    }
                    var24_16 |= var28_27;
                    if (var17_21 > var13_17) break;
                    for (var1_1 = 0; var1_1 < var22_11; ++var1_1) {
                        var33_25 /* !! */  = this.getChildAt(var1_1);
                        var34_26 = (c)var33_25 /* !! */ .getLayoutParams();
                        var30_28 = 1 << var1_1;
                        if ((var28_27 & var30_28) == 0L) {
                            var26_23 = var24_16;
                            if (var34_26.b == var14_18 + 1) {
                                var26_23 = var24_16 | var30_28;
                            }
                            var24_16 = var26_23;
                            continue;
                        }
                        if (var8_5 != 0 && var34_26.e && var13_17 == 1) {
                            var9_12 = this.z;
                            var33_25 /* !! */ .setPadding(var9_12 + var10_10, 0, var9_12, 0);
                        }
                        ++var34_26.b;
                        var34_26.f = true;
                        --var13_17;
                    }
                    var1_1 = 1;
                }
                var6_4 = var7_13 == 0 && var12_14 == 1 ? 1 : 0;
                if (var13_17 > 0 && var24_16 != 0L && (var13_17 < var12_14 - 1 || var6_4 != 0 || var11_15 > 1)) break block36;
                var6_4 = var1_1;
                break block37;
            }
            var4_29 = Long.bitCount(var24_16);
            if (var6_4 == 0) {
                if ((var24_16 & 1L) != 0L) {
                    var3_30 = var4_29;
                    if (!((c)this.getChildAt((int)0).getLayoutParams()).e) {
                        var3_30 = var4_29 - 0.5f;
                    }
                } else {
                    var3_30 = var4_29;
                }
                var6_4 = var22_11 - 1;
                var4_29 = var3_30;
                if ((var24_16 & (long)(1 << var6_4)) != 0L) {
                    var4_29 = var3_30;
                    if (!((c)this.getChildAt((int)var6_4).getLayoutParams()).e) {
                        var4_29 = var3_30 - 0.5f;
                    }
                }
            }
            var7_13 = var4_29 > 0.0f ? (int)((float)(var13_17 * var10_10) / var4_29) : 0;
            var8_5 = 0;
            while (true) {
                var6_4 = var1_1;
                if (var8_5 >= var22_11) break;
                if ((var24_16 & (long)(1 << var8_5)) == 0L) ** GOTO lbl156
                var33_25 /* !! */  = this.getChildAt(var8_5);
                var34_26 = (c)var33_25 /* !! */ .getLayoutParams();
                if (var33_25 /* !! */  instanceof ActionMenuItemView) {
                    var34_26.c = var7_13;
                    var34_26.f = true;
                    if (var8_5 == 0 && !var34_26.e) {
                        var34_26.leftMargin = -var7_13 / 2;
                    }
                    var1_1 = 1;
lbl156:
                    // 2 sources

                    var6_4 = var1_1;
                } else if (var34_26.a) {
                    var34_26.c = var7_13;
                    var34_26.f = true;
                    var34_26.rightMargin = -var7_13 / 2;
                    var6_4 = 1;
                } else {
                    if (var8_5 != 0) {
                        var34_26.leftMargin = var7_13 / 2;
                    }
                    var6_4 = var1_1;
                    if (var8_5 != var22_11 - 1) {
                        var34_26.rightMargin = var7_13 / 2;
                        var6_4 = var1_1;
                    }
                }
                ++var8_5;
                var1_1 = var6_4;
            }
        }
        if (var6_4 != 0) {
            for (var1_1 = 0; var1_1 < var22_11; ++var1_1) {
                var34_26 = this.getChildAt(var1_1);
                var33_25 /* !! */  = (c)var34_26.getLayoutParams();
                if (!var33_25 /* !! */ .f) continue;
                var34_26.measure(View.MeasureSpec.makeMeasureSpec((int)(var33_25 /* !! */ .b * var10_10 + var33_25 /* !! */ .c), (int)0x40000000), var20_8);
            }
        }
        if (var19_3 != 0x40000000) {
            var2_2 = var5_6;
        }
        this.setMeasuredDimension(var21_9, var2_2);
    }

    public void B() {
        androidx.appcompat.widget.c c8 = this.t;
        if (c8 != null) {
            c8.y();
        }
    }

    protected c C() {
        c c8 = new c(-2, -2);
        c8.gravity = 16;
        return c8;
    }

    public c D(AttributeSet attributeSet) {
        return new c(this.getContext(), attributeSet);
    }

    protected c E(ViewGroup.LayoutParams object) {
        if (object != null) {
            object = object instanceof c ? new c((c)((Object)object)) : new c((ViewGroup.LayoutParams)object);
            if (object.gravity <= 0) {
                object.gravity = 16;
            }
            return object;
        }
        return this.C();
    }

    public c F() {
        c c8 = this.C();
        c8.a = true;
        return c8;
    }

    protected boolean G(int n8) {
        boolean bl = false;
        if (n8 == 0) {
            return false;
        }
        View view = this.getChildAt(n8 - 1);
        View view2 = this.getChildAt(n8);
        boolean bl2 = bl;
        if (n8 < this.getChildCount()) {
            bl2 = bl;
            if (view instanceof a) {
                bl2 = ((a)view).a();
            }
        }
        if (n8 > 0 && view2 instanceof a) {
            return ((a)view2).b() | bl2;
        }
        return bl2;
    }

    public boolean H() {
        androidx.appcompat.widget.c c8 = this.t;
        return c8 != null && c8.B();
    }

    public boolean I() {
        androidx.appcompat.widget.c c8 = this.t;
        return c8 != null && c8.D();
    }

    public boolean J() {
        androidx.appcompat.widget.c c8 = this.t;
        return c8 != null && c8.E();
    }

    public boolean K() {
        return this.s;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.p;
    }

    public void O(j.a a8, e.a a9) {
        this.u = a8;
        this.v = a9;
    }

    public boolean P() {
        androidx.appcompat.widget.c c8 = this.t;
        return c8 != null && c8.K();
    }

    @Override
    public boolean a(g g8) {
        return this.p.M(g8, 0);
    }

    @Override
    public void b(androidx.appcompat.view.menu.e e8) {
        this.p = e8;
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.p == null) {
            Object object = this.getContext();
            Object object2 = new androidx.appcompat.view.menu.e((Context)object);
            this.p = object2;
            ((androidx.appcompat.view.menu.e)object2).S(new d(this));
            object = new androidx.appcompat.widget.c((Context)object);
            this.t = object;
            ((androidx.appcompat.widget.c)object).J(true);
            object2 = this.t;
            object = this.u;
            if (object == null) {
                object = new b();
            }
            ((androidx.appcompat.view.menu.a)object2).h((j.a)object);
            this.p.c(this.t, this.q);
            this.t.H(this);
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        this.getMenu();
        return this.t.A();
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration object) {
        super.onConfigurationChanged((Configuration)object);
        object = this.t;
        if (object != null) {
            ((androidx.appcompat.widget.c)object).d(false);
            if (this.t.E()) {
                this.t.B();
                this.t.K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B();
    }

    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        int n12;
        int n13;
        Object object;
        Object object2;
        if (!this.w) {
            super.onLayout(bl, n8, n9, n10, n11);
            return;
        }
        int n14 = this.getChildCount();
        int n15 = (n11 - n9) / 2;
        int n16 = this.getDividerWidth();
        int n17 = n10 - n8;
        n8 = n17 - this.getPaddingRight() - this.getPaddingLeft();
        bl = O.b((View)this);
        n11 = 0;
        n10 = 0;
        for (n9 = 0; n9 < n14; ++n9) {
            object2 = this.getChildAt(n9);
            if (object2.getVisibility() == 8) continue;
            object = (c)object2.getLayoutParams();
            if (object.a) {
                n11 = n13 = object2.getMeasuredWidth();
                if (this.G(n9)) {
                    n11 = n13 + n16;
                }
                int n18 = object2.getMeasuredHeight();
                if (bl) {
                    n12 = this.getPaddingLeft() + object.leftMargin;
                    n13 = n12 + n11;
                } else {
                    n13 = this.getWidth() - this.getPaddingRight() - object.rightMargin;
                    n12 = n13 - n11;
                }
                int n19 = n15 - n18 / 2;
                object2.layout(n12, n19, n13, n18 + n19);
                n8 -= n11;
                n11 = 1;
                continue;
            }
            n8 -= object2.getMeasuredWidth() + object.leftMargin + object.rightMargin;
            this.G(n9);
            ++n10;
        }
        if (n14 == 1 && n11 == 0) {
            object = this.getChildAt(0);
            n9 = object.getMeasuredWidth();
            n8 = object.getMeasuredHeight();
            n10 = n17 / 2 - n9 / 2;
            n11 = n15 - n8 / 2;
            object.layout(n10, n11, n9 + n10, n8 + n11);
            return;
        }
        n9 = n10 - (n11 ^ 1);
        n8 = n9 > 0 ? (n8 /= n9) : 0;
        n11 = Math.max(0, n8);
        if (bl) {
            n10 = this.getWidth() - this.getPaddingRight();
            for (n8 = 0; n8 < n14; ++n8) {
                object2 = this.getChildAt(n8);
                object = (c)object2.getLayoutParams();
                n9 = n10;
                if (object2.getVisibility() != 8) {
                    if (object.a) {
                        n9 = n10;
                    } else {
                        n13 = n10 - object.rightMargin;
                        n12 = object2.getMeasuredWidth();
                        n9 = object2.getMeasuredHeight();
                        n10 = n15 - n9 / 2;
                        object2.layout(n13 - n12, n10, n13, n9 + n10);
                        n9 = n13 - (n12 + object.leftMargin + n11);
                    }
                }
                n10 = n9;
            }
        } else {
            n10 = this.getPaddingLeft();
            for (n8 = 0; n8 < n14; ++n8) {
                object = this.getChildAt(n8);
                object2 = (c)object.getLayoutParams();
                n9 = n10;
                if (object.getVisibility() != 8) {
                    if (object2.a) {
                        n9 = n10;
                    } else {
                        n9 = object.getMeasuredWidth();
                        n13 = object.getMeasuredHeight();
                        n12 = n15 - n13 / 2;
                        object.layout(n10 += object2.leftMargin, n12, n10 + n9, n13 + n12);
                        n9 = n10 + (n9 + object2.rightMargin + n11);
                    }
                }
                n10 = n9;
            }
        }
    }

    @Override
    protected void onMeasure(int n8, int n9) {
        Object object;
        boolean bl = this.w;
        boolean bl2 = View.MeasureSpec.getMode((int)n8) == 0x40000000;
        this.w = bl2;
        if (bl != bl2) {
            this.x = 0;
        }
        int n10 = View.MeasureSpec.getSize((int)n8);
        if (this.w && (object = this.p) != null && n10 != this.x) {
            this.x = n10;
            object.L(true);
        }
        int n11 = this.getChildCount();
        if (this.w && n11 > 0) {
            this.M(n8, n9);
            return;
        }
        for (n10 = 0; n10 < n11; ++n10) {
            object = (c)this.getChildAt(n10).getLayoutParams();
            ((LinearLayout.LayoutParams)object).rightMargin = 0;
            ((LinearLayout.LayoutParams)object).leftMargin = 0;
        }
        super.onMeasure(n8, n9);
    }

    public void setExpandedActionViewsExclusive(boolean bl) {
        this.t.G(bl);
    }

    public void setOnMenuItemClickListener(e e8) {
        this.A = e8;
    }

    public void setOverflowIcon(Drawable drawable) {
        this.getMenu();
        this.t.I(drawable);
    }

    public void setOverflowReserved(boolean bl) {
        this.s = bl;
    }

    public void setPopupTheme(int n8) {
        if (this.r != n8) {
            this.r = n8;
            if (n8 == 0) {
                this.q = this.getContext();
                return;
            }
            this.q = new ContextThemeWrapper(this.getContext(), n8);
        }
    }

    public void setPresenter(androidx.appcompat.widget.c c8) {
        this.t = c8;
        c8.H(this);
    }

    public static interface a {
        public boolean a();

        public boolean b();
    }

    private static class b
    implements j.a {
        b() {
        }

        @Override
        public void a(androidx.appcompat.view.menu.e e8, boolean bl) {
        }

        @Override
        public boolean b(androidx.appcompat.view.menu.e e8) {
            return false;
        }
    }

    public static class c
    extends B.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty
        public boolean e;
        boolean f;

        public c(int n8, int n9) {
            super(n8, n9);
            this.a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c c8) {
            super((ViewGroup.LayoutParams)c8);
            this.a = c8.a;
        }
    }

    private class d
    implements e.a {
        final ActionMenuView a;

        d(ActionMenuView actionMenuView) {
            this.a = actionMenuView;
        }

        @Override
        public boolean a(androidx.appcompat.view.menu.e object, MenuItem menuItem) {
            object = this.a.A;
            return object != null && object.onMenuItemClick(menuItem);
        }

        @Override
        public void b(androidx.appcompat.view.menu.e e8) {
            e.a a8 = this.a.v;
            if (a8 != null) {
                a8.b(e8);
            }
        }
    }

    public static interface e {
        public boolean onMenuItemClick(MenuItem var1);
    }
}

