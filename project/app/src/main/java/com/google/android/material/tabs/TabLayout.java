/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import ax.F6.w;
import ax.F6.z;
import ax.c0.M;
import ax.c0.d0;
import ax.d0.H;
import ax.k6.k;
import ax.k6.l;
import ax.k6.m;
import ax.u.B;
import com.google.android.material.tabs.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
public class TabLayout
extends HorizontalScrollView {
    private static final int a0 = ax.k6.l.j;
    private static final ax.b0.d<g> b0 = new ax.b0.f<g>(16);
    int A;
    int B;
    int C;
    int D;
    boolean E;
    boolean F;
    int G;
    int H;
    boolean I;
    private com.google.android.material.tabs.c J;
    private final TimeInterpolator K;
    private c L;
    private final ArrayList<c> M;
    private c N;
    private ValueAnimator O;
    ViewPager P;
    private androidx.viewpager.widget.a Q;
    private DataSetObserver R;
    private h S;
    private b T;
    private boolean U;
    private int V;
    private final ax.b0.d<i> W;
    int a;
    private final ArrayList<g> b;
    private g c;
    final f d;
    int e;
    int f;
    int g;
    int h;
    private final int i;
    private final int j;
    private int k;
    ColorStateList l;
    ColorStateList m;
    ColorStateList n;
    Drawable o;
    private int p;
    PorterDuff.Mode q;
    float r;
    float s;
    float t;
    final int u;
    int v;
    private final int w;
    private final int x;
    private final int y;
    private int z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.d0);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int n8) {
        f f8;
        block13: {
            int n9 = a0;
            super(ax.V6.a.d(context, attributeSet, n8, n9), attributeSet, n8);
            this.a = -1;
            this.b = new ArrayList();
            this.k = -1;
            this.p = 0;
            this.v = Integer.MAX_VALUE;
            this.G = -1;
            this.M = new ArrayList();
            this.W = new ax.b0.e<i>(12);
            context = this.getContext();
            this.setHorizontalScrollBarEnabled(false);
            this.d = f8 = new f(this, context);
            super.addView((View)f8, 0, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -1));
            Object object = ax.k6.m.m5;
            int n10 = ax.k6.m.L5;
            attributeSet = ax.F6.w.i(context, attributeSet, object, n8, n9, new int[]{n10});
            object = ax.C6.f.f(this.getBackground());
            if (object != null) {
                ax.O6.h h8 = new ax.O6.h();
                h8.g0((ColorStateList)object);
                h8.U(context);
                h8.f0(this.getElevation());
                this.setBackground(h8);
            }
            this.setSelectedTabIndicator(ax.K6.c.d(context, (TypedArray)attributeSet, ax.k6.m.s5));
            this.setSelectedTabIndicatorColor(attributeSet.getColor(ax.k6.m.v5, 0));
            f8.i(attributeSet.getDimensionPixelSize(ax.k6.m.y5, -1));
            this.setSelectedTabIndicatorGravity(attributeSet.getInt(ax.k6.m.x5, 0));
            this.setTabIndicatorAnimationMode(attributeSet.getInt(ax.k6.m.u5, 0));
            this.setTabIndicatorFullWidth(attributeSet.getBoolean(ax.k6.m.w5, true));
            this.h = n8 = attributeSet.getDimensionPixelSize(ax.k6.m.D5, 0);
            this.g = n8;
            this.f = n8;
            this.e = n8;
            this.e = attributeSet.getDimensionPixelSize(ax.k6.m.G5, n8);
            this.f = attributeSet.getDimensionPixelSize(ax.k6.m.H5, this.f);
            this.g = attributeSet.getDimensionPixelSize(ax.k6.m.F5, this.g);
            this.h = attributeSet.getDimensionPixelSize(ax.k6.m.E5, this.h);
            this.i = ax.F6.w.g(context) ? ax.k6.c.g0 : ax.k6.c.e0;
            this.j = n9 = attributeSet.getResourceId(n10, ax.k6.l.d);
            object = ax.m.j.B2;
            f8 = context.obtainStyledAttributes(n9, object);
            n10 = ax.m.j.C2;
            this.r = f8.getDimensionPixelSize(n10, 0);
            n8 = ax.m.j.F2;
            this.l = ax.K6.c.a(context, (TypedArray)f8, n8);
            int n11 = ax.k6.m.J5;
            if (attributeSet.hasValue(n11)) {
                this.k = attributeSet.getResourceId(n11, n9);
            }
            if ((n9 = this.k) != -1) {
                Throwable throwable2;
                block12: {
                    block11: {
                        f8 = context.obtainStyledAttributes(n9, object);
                        try {
                            this.s = f8.getDimensionPixelSize(n10, (int)this.r);
                            object = ax.K6.c.a(context, (TypedArray)f8, n8);
                            if (object == null) break block11;
                        }
                        catch (Throwable throwable2) {
                            break block12;
                        }
                        n10 = this.l.getDefaultColor();
                        n8 = object.getDefaultColor();
                        this.l = TabLayout.u(n10, object.getColorForState(new int[]{0x10100A1}, n8));
                    }
                    f8.recycle();
                    break block13;
                }
                f8.recycle();
                throw throwable2;
            }
        }
        if (attributeSet.hasValue(n8 = ax.k6.m.M5)) {
            this.l = ax.K6.c.a(context, (TypedArray)attributeSet, n8);
        }
        if (attributeSet.hasValue(n8 = ax.k6.m.K5)) {
            n8 = attributeSet.getColor(n8, 0);
            this.l = TabLayout.u(this.l.getDefaultColor(), n8);
        }
        this.m = ax.K6.c.a(context, (TypedArray)attributeSet, ax.k6.m.q5);
        this.q = ax.F6.z.i(attributeSet.getInt(ax.k6.m.r5, -1), null);
        this.n = ax.K6.c.a(context, (TypedArray)attributeSet, ax.k6.m.I5);
        this.B = attributeSet.getInt(ax.k6.m.t5, 300);
        this.K = ax.H6.i.g(context, ax.k6.c.M, ax.l6.a.b);
        this.w = attributeSet.getDimensionPixelSize(ax.k6.m.B5, -1);
        this.x = attributeSet.getDimensionPixelSize(ax.k6.m.A5, -1);
        this.u = attributeSet.getResourceId(ax.k6.m.n5, 0);
        this.z = attributeSet.getDimensionPixelSize(ax.k6.m.o5, 0);
        this.D = attributeSet.getInt(ax.k6.m.C5, 1);
        this.A = attributeSet.getInt(ax.k6.m.p5, 0);
        this.E = attributeSet.getBoolean(ax.k6.m.z5, false);
        this.I = attributeSet.getBoolean(ax.k6.m.N5, false);
        attributeSet.recycle();
        context = this.getResources();
        this.t = context.getDimensionPixelSize(ax.k6.e.h);
        this.y = context.getDimensionPixelSize(ax.k6.e.g);
        this.q();
        return;
        finally {
            f8.recycle();
        }
    }

    private void A(g g8) {
        for (int i8 = this.M.size() - 1; i8 >= 0; --i8) {
            this.M.get(i8).c(g8);
        }
    }

    private void B() {
        if (this.O == null) {
            ValueAnimator valueAnimator;
            this.O = valueAnimator = new ValueAnimator();
            valueAnimator.setInterpolator(this.K);
            this.O.setDuration((long)this.B);
            this.O.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
                final TabLayout a;
                {
                    this.a = tabLayout;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.scrollTo((Integer)valueAnimator.getAnimatedValue(), 0);
                }
            });
        }
    }

    private boolean D() {
        return this.getTabMode() == 0 || this.getTabMode() == 2;
        {
        }
    }

    private void K(int n8) {
        i i8 = (i)this.d.getChildAt(n8);
        this.d.removeViewAt(n8);
        if (i8 != null) {
            i8.k();
            this.W.a(i8);
        }
        this.requestLayout();
    }

    private void S(ViewPager viewPager, boolean bl, boolean bl2) {
        Object object;
        ViewPager viewPager2 = this.P;
        if (viewPager2 != null) {
            object = this.S;
            if (object != null) {
                viewPager2.J((ViewPager.j)object);
            }
            if ((object = this.T) != null) {
                this.P.I((ViewPager.i)object);
            }
        }
        if ((object = this.N) != null) {
            this.J((c)object);
            this.N = null;
        }
        if (viewPager != null) {
            this.P = viewPager;
            if (this.S == null) {
                this.S = new h(this);
            }
            this.S.a();
            viewPager.c(this.S);
            this.N = object = new j(viewPager);
            this.g((c)object);
            object = viewPager.getAdapter();
            if (object != null) {
                this.N((androidx.viewpager.widget.a)object, bl);
            }
            if (this.T == null) {
                this.T = new b(this);
            }
            this.T.b(bl);
            viewPager.b(this.T);
            this.O(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.P = null;
            this.N(null, false);
        }
        this.U = bl2;
    }

    private void T() {
        int n8 = this.b.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.b.get(i8).w();
        }
    }

    private void U(LinearLayout.LayoutParams layoutParams) {
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private int getDefaultHeight() {
        int n8 = this.b.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            g g8 = this.b.get(i8);
            if (g8 == null || g8.f() == null || TextUtils.isEmpty((CharSequence)g8.j())) continue;
            if (this.E) break;
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int n8 = this.w;
        if (n8 != -1) {
            return n8;
        }
        n8 = this.D;
        if (n8 != 0 && n8 != 2) {
            return 0;
        }
        return this.y;
    }

    private int getTabScrollRange() {
        return Math.max(0, this.d.getWidth() - this.getWidth() - this.getPaddingLeft() - this.getPaddingRight());
    }

    private void l(ax.S6.a a8) {
        int n8;
        g g8 = this.F();
        CharSequence charSequence = a8.a;
        if (charSequence != null) {
            g8.v(charSequence);
        }
        if ((charSequence = a8.b) != null) {
            g8.q((Drawable)charSequence);
        }
        if ((n8 = a8.c) != 0) {
            g8.o(n8);
        }
        if (!TextUtils.isEmpty((CharSequence)a8.getContentDescription())) {
            g8.n(a8.getContentDescription());
        }
        this.i(g8);
    }

    private void m(g g8) {
        i i8 = g8.i;
        i8.setSelected(false);
        i8.setActivated(false);
        this.d.addView((View)i8, g8.g(), (ViewGroup.LayoutParams)this.v());
    }

    private void n(View view) {
        if (view instanceof ax.S6.a) {
            this.l((ax.S6.a)view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void o(int n8) {
        if (n8 == -1) {
            return;
        }
        if (this.getWindowToken() != null && this.isLaidOut() && !this.d.d()) {
            int n9;
            int n10 = this.getScrollX();
            if (n10 != (n9 = this.r(n8, 0.0f))) {
                this.B();
                this.O.setIntValues(new int[]{n10, n9});
                this.O.start();
            }
            this.d.c(n8, this.B);
            return;
        }
        this.O(n8, 0.0f, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void p(int n8) {
        if (n8 != 0) {
            if (n8 == 1) {
                this.d.setGravity(1);
                return;
            }
            if (n8 != 2) {
                return;
            }
        } else {
            Log.w((String)"TabLayout", (String)"MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        this.d.setGravity(0x800003);
    }

    private void q() {
        int n8 = this.D;
        n8 = n8 != 0 && n8 != 2 ? 0 : Math.max(0, this.z - this.e);
        this.d.setPaddingRelative(n8, 0, 0, 0);
        n8 = this.D;
        if (n8 != 0) {
            if (n8 == 1 || n8 == 2) {
                if (this.A == 2) {
                    Log.w((String)"TabLayout", (String)"GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.d.setGravity(1);
            }
        } else {
            this.p(this.A);
        }
        this.V(true);
    }

    private int r(int n8, float f8) {
        int n9 = this.D;
        int n10 = 0;
        if (n9 != 0 && n9 != 2) {
            return 0;
        }
        View view = this.d.getChildAt(n8);
        if (view == null) {
            return 0;
        }
        View view2 = ++n8 < this.d.getChildCount() ? this.d.getChildAt(n8) : null;
        n9 = view.getWidth();
        n8 = n10;
        if (view2 != null) {
            n8 = view2.getWidth();
        }
        n10 = view.getLeft() + n9 / 2 - this.getWidth() / 2;
        n8 = (int)((float)(n9 + n8) * 0.5f * f8);
        if (this.getLayoutDirection() == 0) {
            return n10 + n8;
        }
        return n10 - n8;
    }

    private void setSelectedTabView(int n8) {
        int n9 = this.d.getChildCount();
        if (n8 < n9) {
            for (int i8 = 0; i8 < n9; ++i8) {
                boolean bl;
                View view = this.d.getChildAt(i8);
                boolean bl2 = true;
                boolean bl3 = true;
                if (i8 == n8 && !view.isSelected() || i8 != n8 && view.isSelected()) {
                    bl = i8 == n8;
                    view.setSelected(bl);
                    bl = i8 == n8 ? bl3 : false;
                    view.setActivated(bl);
                    if (!(view instanceof i)) continue;
                    ((i)view).s();
                    continue;
                }
                bl = i8 == n8;
                view.setSelected(bl);
                bl = i8 == n8 ? bl2 : false;
                view.setActivated(bl);
            }
        }
    }

    private void t(g g8, int n8) {
        g8.r(n8);
        this.b.add(n8, g8);
        int n9 = this.b.size();
        ++n8;
        int n10 = -1;
        while (n8 < n9) {
            if (this.b.get(n8).g() == this.a) {
                n10 = n8;
            }
            this.b.get(n8).r(n8);
            ++n8;
        }
        this.a = n10;
    }

    private static ColorStateList u(int n8, int n9) {
        return new ColorStateList((int[][])new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{n9, n8});
    }

    private LinearLayout.LayoutParams v() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.U(layoutParams);
        return layoutParams;
    }

    private i x(g g8) {
        Object object = this.W;
        object = object != null ? object.b() : null;
        Object object2 = object;
        if (object == null) {
            object2 = new i(this, this.getContext());
        }
        ((i)((Object)object2)).setTab(g8);
        object2.setFocusable(true);
        object2.setMinimumWidth(this.getTabMinWidth());
        if (TextUtils.isEmpty((CharSequence)g8.d)) {
            object2.setContentDescription(g8.c);
            return object2;
        }
        object2.setContentDescription(g8.d);
        return object2;
    }

    private void y(g g8) {
        for (int i8 = this.M.size() - 1; i8 >= 0; --i8) {
            this.M.get(i8).a(g8);
        }
    }

    private void z(g g8) {
        for (int i8 = this.M.size() - 1; i8 >= 0; --i8) {
            this.M.get(i8).b(g8);
        }
    }

    public g C(int n8) {
        if (n8 >= 0 && n8 < this.getTabCount()) {
            return this.b.get(n8);
        }
        return null;
    }

    public boolean E() {
        return this.F;
    }

    public g F() {
        g g8 = this.w();
        g8.h = this;
        g8.i = this.x(g8);
        if (g8.j != -1) {
            g8.i.setId(g8.j);
        }
        return g8;
    }

    void G() {
        this.I();
        Object object = this.Q;
        if (object != null) {
            int n8;
            int n9 = object.e();
            for (n8 = 0; n8 < n9; ++n8) {
                this.k(this.F().v(this.Q.g(n8)), false);
            }
            object = this.P;
            if (object != null && n9 > 0 && (n8 = ((ViewPager)((Object)object)).getCurrentItem()) != this.getSelectedTabPosition() && n8 < this.getTabCount()) {
                this.L(this.C(n8));
            }
        }
    }

    protected boolean H(g g8) {
        return b0.a(g8);
    }

    public void I() {
        for (int i8 = this.d.getChildCount() - 1; i8 >= 0; --i8) {
            this.K(i8);
        }
        Iterator<g> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            g g8 = iterator.next();
            iterator.remove();
            g8.l();
            this.H(g8);
        }
        this.c = null;
    }

    @Deprecated
    public void J(c c8) {
        this.M.remove(c8);
    }

    public void L(g g8) {
        this.M(g8, true);
    }

    public void M(g g8, boolean bl) {
        g g9 = this.c;
        if (g9 == g8) {
            if (g9 != null) {
                this.y(g8);
                this.o(g8.g());
                return;
            }
        } else {
            int n8 = g8 != null ? g8.g() : -1;
            if (bl) {
                if ((g9 == null || g9.g() == -1) && n8 != -1) {
                    this.O(n8, 0.0f, true);
                } else {
                    this.o(n8);
                }
                if (n8 != -1) {
                    this.setSelectedTabView(n8);
                }
            }
            this.c = g8;
            if (g9 != null && g9.h != null) {
                this.A(g9);
            }
            if (g8 != null) {
                this.z(g8);
            }
        }
    }

    void N(androidx.viewpager.widget.a a8, boolean bl) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a a9 = this.Q;
        if (a9 != null && (dataSetObserver = this.R) != null) {
            a9.u(dataSetObserver);
        }
        this.Q = a8;
        if (bl && a8 != null) {
            if (this.R == null) {
                this.R = new e(this);
            }
            a8.m(this.R);
        }
        this.G();
    }

    public void O(int n8, float f8, boolean bl) {
        this.P(n8, f8, bl, true);
    }

    public void P(int n8, float f8, boolean bl, boolean bl2) {
        this.Q(n8, f8, bl, bl2, true);
    }

    void Q(int n8, float f8, boolean bl, boolean bl2, boolean bl3) {
        int n9 = Math.round((float)n8 + f8);
        if (n9 >= 0 && n9 < this.d.getChildCount()) {
            ValueAnimator valueAnimator;
            if (bl2) {
                this.d.h(n8, f8);
            }
            if ((valueAnimator = this.O) != null && valueAnimator.isRunning()) {
                this.O.cancel();
            }
            int n10 = this.r(n8, f8);
            int n11 = this.getScrollX();
            int n12 = n8 < this.getSelectedTabPosition() && n10 >= n11 || n8 > this.getSelectedTabPosition() && n10 <= n11 || n8 == this.getSelectedTabPosition() ? 1 : 0;
            if (this.getLayoutDirection() == 1) {
                n12 = n8 < this.getSelectedTabPosition() && n10 <= n11 || n8 > this.getSelectedTabPosition() && n10 >= n11 || n8 == this.getSelectedTabPosition() ? 1 : 0;
            }
            if (n12 != 0 || this.V == 1 || bl3) {
                n12 = n10;
                if (n8 < 0) {
                    n12 = 0;
                }
                this.scrollTo(n12, 0);
            }
            if (bl) {
                this.setSelectedTabView(n9);
            }
        }
    }

    public void R(ViewPager viewPager, boolean bl) {
        this.S(viewPager, bl, false);
    }

    void V(boolean bl) {
        for (int i8 = 0; i8 < this.d.getChildCount(); ++i8) {
            View view = this.d.getChildAt(i8);
            view.setMinimumWidth(this.getTabMinWidth());
            this.U((LinearLayout.LayoutParams)view.getLayoutParams());
            if (!bl) continue;
            view.requestLayout();
        }
    }

    void W(int n8) {
        this.V = n8;
    }

    public void addView(View view) {
        this.n(view);
    }

    public void addView(View view, int n8) {
        this.n(view);
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams layoutParams) {
        this.n(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        this.n(view);
    }

    @Deprecated
    public void g(c c8) {
        if (!this.M.contains(c8)) {
            this.M.add(c8);
        }
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return this.generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g g8 = this.c;
        if (g8 != null) {
            return g8.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    int getTabMaxWidth() {
        return this.v;
    }

    public int getTabMode() {
        return this.D;
    }

    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public void h(d d8) {
        this.g(d8);
    }

    public void i(g g8) {
        this.k(g8, this.b.isEmpty());
    }

    public void j(g g8, int n8, boolean bl) {
        if (g8.h == this) {
            this.t(g8, n8);
            this.m(g8);
            if (bl) {
                g8.m();
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void k(g g8, boolean bl) {
        this.j(g8, this.b.size(), bl);
    }

    protected void onAttachedToWindow() {
        ViewParent viewParent;
        super.onAttachedToWindow();
        ax.O6.i.e((View)this);
        if (this.P == null && (viewParent = this.getParent()) instanceof ViewPager) {
            this.S((ViewPager)viewParent, true, true);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U) {
            this.setupWithViewPager(null);
            this.U = false;
        }
    }

    protected void onDraw(Canvas canvas) {
        for (int i8 = 0; i8 < this.d.getChildCount(); ++i8) {
            View view = this.d.getChildAt(i8);
            if (!(view instanceof i)) continue;
            ((i)view).g(canvas);
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ax.d0.H.Q0(accessibilityNodeInfo).o0(H.e.a(1, this.getTabCount(), false, 1));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.D() && super.onInterceptTouchEvent(motionEvent);
    }

    protected void onMeasure(int n8, int n9) {
        block11: {
            View view;
            int n10;
            block14: {
                block12: {
                    block13: {
                        int n11 = Math.round(ax.F6.z.c(this.getContext(), this.getDefaultHeight()));
                        n10 = View.MeasureSpec.getMode((int)n9);
                        if (n10 != Integer.MIN_VALUE) {
                            n10 = n10 != 0 ? n9 : View.MeasureSpec.makeMeasureSpec((int)(n11 + this.getPaddingTop() + this.getPaddingBottom()), (int)0x40000000);
                        } else {
                            n10 = n9;
                            if (this.getChildCount() == 1) {
                                n10 = n9;
                                if (View.MeasureSpec.getSize((int)n9) >= n11) {
                                    this.getChildAt(0).setMinimumHeight(n11);
                                    n10 = n9;
                                }
                            }
                        }
                        n11 = View.MeasureSpec.getSize((int)n8);
                        if (View.MeasureSpec.getMode((int)n8) != 0) {
                            n9 = this.x;
                            if (n9 <= 0) {
                                n9 = (int)((float)n11 - ax.F6.z.c(this.getContext(), 56));
                            }
                            this.v = n9;
                        }
                        super.onMeasure(n8, n10);
                        if (this.getChildCount() != 1) break block11;
                        view = this.getChildAt(0);
                        n8 = this.D;
                        if (n8 == 0) break block12;
                        if (n8 == 1) break block13;
                        if (n8 == 2) break block12;
                        break block11;
                    }
                    if (view.getMeasuredWidth() == this.getMeasuredWidth()) {
                        return;
                    }
                    break block14;
                }
                if (view.getMeasuredWidth() >= this.getMeasuredWidth()) break block11;
            }
            n8 = ViewGroup.getChildMeasureSpec((int)n10, (int)(this.getPaddingTop() + this.getPaddingBottom()), (int)view.getLayoutParams().height);
            view.measure(View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000), n8);
        }
    }

    @SuppressLint(value={"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !this.D()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void s() {
        this.M.clear();
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        ax.O6.i.d((View)this, f8);
    }

    public void setInlineLabel(boolean bl) {
        if (this.E != bl) {
            this.E = bl;
            for (int i8 = 0; i8 < this.d.getChildCount(); ++i8) {
                View view = this.d.getChildAt(i8);
                if (!(view instanceof i)) continue;
                ((i)view).r();
            }
            this.q();
        }
    }

    public void setInlineLabelResource(int n8) {
        this.setInlineLabel(this.getResources().getBoolean(n8));
    }

    @Deprecated
    public void setOnTabSelectedListener(c c8) {
        c c9 = this.L;
        if (c9 != null) {
            this.J(c9);
        }
        this.L = c8;
        if (c8 != null) {
            this.g(c8);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(d d8) {
        this.setOnTabSelectedListener((c)d8);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.B();
        this.O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int n8) {
        if (n8 != 0) {
            this.setSelectedTabIndicator(ax.o.a.b(this.getContext(), n8));
            return;
        }
        this.setSelectedTabIndicator(null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        int n8;
        Drawable drawable2 = drawable;
        if (drawable == null) {
            drawable2 = new GradientDrawable();
        }
        this.o = drawable = ax.U.a.r(drawable2).mutate();
        ax.C6.f.k(drawable, this.p);
        int n9 = n8 = this.G;
        if (n8 == -1) {
            n9 = this.o.getIntrinsicHeight();
        }
        this.d.i(n9);
    }

    public void setSelectedTabIndicatorColor(int n8) {
        this.p = n8;
        ax.C6.f.k(this.o, n8);
        this.V(false);
    }

    public void setSelectedTabIndicatorGravity(int n8) {
        if (this.C != n8) {
            this.C = n8;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int n8) {
        this.G = n8;
        this.d.i(n8);
    }

    public void setTabGravity(int n8) {
        if (this.A != n8) {
            this.A = n8;
            this.q();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            this.T();
        }
    }

    public void setTabIconTintResource(int n8) {
        this.setTabIconTint(ax.o.a.a(this.getContext(), n8));
    }

    public void setTabIndicatorAnimationMode(int n8) {
        this.H = n8;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    this.J = new com.google.android.material.tabs.b();
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n8);
                stringBuilder.append(" is not a valid TabIndicatorAnimationMode");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.J = new a();
            return;
        }
        this.J = new com.google.android.material.tabs.c();
    }

    public void setTabIndicatorFullWidth(boolean bl) {
        this.F = bl;
        this.d.g();
        this.d.postInvalidateOnAnimation();
    }

    public void setTabMode(int n8) {
        if (n8 != this.D) {
            this.D = n8;
            this.q();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            for (int i8 = 0; i8 < this.d.getChildCount(); ++i8) {
                colorStateList = this.d.getChildAt(i8);
                if (!(colorStateList instanceof i)) continue;
                ((i)colorStateList).q(this.getContext());
            }
        }
    }

    public void setTabRippleColorResource(int n8) {
        this.setTabRippleColor(ax.o.a.a(this.getContext(), n8));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            this.T();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a a8) {
        this.N(a8, false);
    }

    public void setUnboundedRipple(boolean bl) {
        if (this.I != bl) {
            this.I = bl;
            for (int i8 = 0; i8 < this.d.getChildCount(); ++i8) {
                View view = this.d.getChildAt(i8);
                if (!(view instanceof i)) continue;
                ((i)view).q(this.getContext());
            }
        }
    }

    public void setUnboundedRippleResource(int n8) {
        this.setUnboundedRipple(this.getResources().getBoolean(n8));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        this.R(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return this.getTabScrollRange() > 0;
    }

    protected g w() {
        g g8;
        g g9 = g8 = b0.b();
        if (g8 == null) {
            g9 = new g();
        }
        return g9;
    }

    private class b
    implements ViewPager.i {
        private boolean a;
        final TabLayout b;

        b(TabLayout tabLayout) {
            this.b = tabLayout;
        }

        @Override
        public void a(ViewPager viewPager, androidx.viewpager.widget.a object, androidx.viewpager.widget.a a8) {
            object = this.b;
            if (((TabLayout)((Object)object)).P == viewPager) {
                ((TabLayout)((Object)object)).N(a8, this.a);
            }
        }

        void b(boolean bl) {
            this.a = bl;
        }
    }

    @Deprecated
    public static interface c<T extends g> {
        public void a(T var1);

        public void b(T var1);

        public void c(T var1);
    }

    public static interface d
    extends c<g> {
    }

    private class e
    extends DataSetObserver {
        final TabLayout a;

        e(TabLayout tabLayout) {
            this.a = tabLayout;
        }

        public void onChanged() {
            this.a.G();
        }

        public void onInvalidated() {
            this.a.G();
        }
    }

    class f
    extends LinearLayout {
        ValueAnimator a;
        private int b;
        final TabLayout c;

        f(TabLayout tabLayout, Context context) {
            this.c = tabLayout;
            super(context);
            this.b = -1;
            this.setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = this.c;
            if (tabLayout.a == -1) {
                tabLayout.a = tabLayout.getSelectedTabPosition();
            }
            this.f(this.c.a);
        }

        private void f(int n8) {
            if (this.c.V != 0 && (this.c.getTabSelectedIndicator().getBounds().left != -1 || this.c.getTabSelectedIndicator().getBounds().right != -1)) {
                return;
            }
            View view = this.getChildAt(n8);
            com.google.android.material.tabs.c c8 = this.c.J;
            TabLayout tabLayout = this.c;
            c8.c(tabLayout, view, tabLayout.o);
            this.c.a = n8;
        }

        private void g() {
            this.f(this.c.getSelectedTabPosition());
        }

        private void j(View view, View view2, float f8) {
            if (view != null && view.getWidth() > 0) {
                com.google.android.material.tabs.c c8 = this.c.J;
                TabLayout tabLayout = this.c;
                c8.d(tabLayout, view, view2, f8, tabLayout.o);
            } else {
                view = this.c.o;
                view.setBounds(-1, view.getBounds().top, -1, this.c.o.getBounds().bottom);
            }
            this.postInvalidateOnAnimation();
        }

        private void k(boolean bl, int n8, int n9) {
            TabLayout tabLayout = this.c;
            if (tabLayout.a == n8) {
                return;
            }
            tabLayout = this.getChildAt(tabLayout.getSelectedTabPosition());
            Object object = this.getChildAt(n8);
            if (object == null) {
                this.g();
                return;
            }
            this.c.a = n8;
            object = new ValueAnimator.AnimatorUpdateListener(){
                final View a;
                final View b;
                final f c;
                {
                    this.c = f8;
                    this.a = view;
                    this.b = view2;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.c.j(this.a, this.b, valueAnimator.getAnimatedFraction());
                }
            };
            if (bl) {
                tabLayout = new ValueAnimator();
                this.a = tabLayout;
                tabLayout.setInterpolator(this.c.K);
                tabLayout.setDuration(n9);
                tabLayout.setFloatValues(new float[]{0.0f, 1.0f});
                tabLayout.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
                tabLayout.start();
                return;
            }
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        }

        void c(int n8, int n9) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning() && this.c.a != n8) {
                this.a.cancel();
            }
            this.k(true, n8, n9);
        }

        boolean d() {
            int n8 = this.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                if (this.getChildAt(i8).getWidth() > 0) continue;
                return true;
            }
            return false;
        }

        public void draw(Canvas canvas) {
            int n8;
            int n9;
            int n10 = n9 = this.c.o.getBounds().height();
            if (n9 < 0) {
                n10 = this.c.o.getIntrinsicHeight();
            }
            if ((n8 = this.c.C) != 0) {
                if (n8 != 1) {
                    int n11;
                    n9 = n11 = 0;
                    if (n8 != 2) {
                        if (n8 != 3) {
                            n10 = 0;
                            n9 = n11;
                        } else {
                            n10 = this.getHeight();
                            n9 = n11;
                        }
                    }
                } else {
                    n9 = (this.getHeight() - n10) / 2;
                    n10 = (this.getHeight() + n10) / 2;
                }
            } else {
                n9 = this.getHeight() - n10;
                n10 = this.getHeight();
            }
            if (this.c.o.getBounds().width() > 0) {
                Rect rect = this.c.o.getBounds();
                this.c.o.setBounds(rect.left, n9, rect.right, n10);
                this.c.o.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int n8, float f8) {
            this.c.a = Math.round((float)n8 + f8);
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.a.cancel();
            }
            this.j(this.getChildAt(n8), this.getChildAt(n8 + 1), f8);
        }

        void i(int n8) {
            Rect rect = this.c.o.getBounds();
            this.c.o.setBounds(rect.left, 0, rect.right, n8);
            this.requestLayout();
        }

        protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
            super.onLayout(bl, n8, n9, n10, n11);
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.k(false, this.c.getSelectedTabPosition(), -1);
                return;
            }
            this.e();
        }

        protected void onMeasure(int n8, int n9) {
            super.onMeasure(n8, n9);
            if (View.MeasureSpec.getMode((int)n8) == 0x40000000) {
                TabLayout tabLayout = this.c;
                int n10 = tabLayout.A;
                int n11 = 1;
                if (n10 == 1 || tabLayout.D == 2) {
                    int n12;
                    int n13 = this.getChildCount();
                    int n14 = 0;
                    int n15 = 0;
                    for (n10 = 0; n10 < n13; ++n10) {
                        tabLayout = this.getChildAt(n10);
                        n12 = n15;
                        if (tabLayout.getVisibility() == 0) {
                            n12 = Math.max(n15, tabLayout.getMeasuredWidth());
                        }
                        n15 = n12;
                    }
                    if (n15 > 0) {
                        n10 = (int)ax.F6.z.c(this.getContext(), 16);
                        if (n15 * n13 <= this.getMeasuredWidth() - n10 * 2) {
                            n10 = 0;
                            for (n12 = n14; n12 < n13; ++n12) {
                                tabLayout = (LinearLayout.LayoutParams)this.getChildAt(n12).getLayoutParams();
                                if (((LinearLayout.LayoutParams)tabLayout).width == n15 && ((LinearLayout.LayoutParams)tabLayout).weight == 0.0f) continue;
                                ((LinearLayout.LayoutParams)tabLayout).width = n15;
                                ((LinearLayout.LayoutParams)tabLayout).weight = 0.0f;
                                n10 = 1;
                            }
                        } else {
                            tabLayout = this.c;
                            tabLayout.A = 0;
                            tabLayout.V(false);
                            n10 = n11;
                        }
                        if (n10 != 0) {
                            super.onMeasure(n8, n9);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int n8) {
            super.onRtlPropertiesChanged(n8);
            if (Build.VERSION.SDK_INT < 23 && this.b != n8) {
                this.requestLayout();
                this.b = n8;
            }
        }
    }

    public static class g {
        private Object a;
        private Drawable b;
        private CharSequence c;
        private CharSequence d;
        private int e = -1;
        private View f;
        private int g = 1;
        public TabLayout h;
        public i i;
        private int j = -1;

        public View e() {
            return this.f;
        }

        public Drawable f() {
            return this.b;
        }

        public int g() {
            return this.e;
        }

        public int h() {
            return this.g;
        }

        public Object i() {
            return this.a;
        }

        public CharSequence j() {
            return this.c;
        }

        public boolean k() {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                int n8 = tabLayout.getSelectedTabPosition();
                return n8 != -1 && n8 == this.e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        void l() {
            this.h = null;
            this.i = null;
            this.a = null;
            this.b = null;
            this.j = -1;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }

        public void m() {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                tabLayout.L(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g n(CharSequence charSequence) {
            this.d = charSequence;
            this.w();
            return this;
        }

        public g o(int n8) {
            return this.p(LayoutInflater.from((Context)this.i.getContext()).inflate(n8, (ViewGroup)this.i, false));
        }

        public g p(View view) {
            this.f = view;
            this.w();
            return this;
        }

        public g q(Drawable object) {
            this.b = object;
            object = this.h;
            if (((TabLayout)((Object)object)).A == 1 || ((TabLayout)((Object)object)).D == 2) {
                ((TabLayout)((Object)object)).V(true);
            }
            this.w();
            return this;
        }

        void r(int n8) {
            this.e = n8;
        }

        public g s(int n8) {
            this.g = n8;
            TabLayout tabLayout = this.h;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.V(true);
            }
            this.w();
            return this;
        }

        public g t(Object object) {
            this.a = object;
            return this;
        }

        public g u(int n8) {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return this.v(tabLayout.getResources().getText(n8));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g v(CharSequence charSequence) {
            if (TextUtils.isEmpty((CharSequence)this.d) && !TextUtils.isEmpty((CharSequence)charSequence)) {
                this.i.setContentDescription(charSequence);
            }
            this.c = charSequence;
            this.w();
            return this;
        }

        void w() {
            i i8 = this.i;
            if (i8 != null) {
                i8.p();
            }
        }
    }

    public static class h
    implements ViewPager.j {
        private final WeakReference<TabLayout> a;
        private int b;
        private int c;

        public h(TabLayout tabLayout) {
            this.a = new WeakReference<TabLayout>(tabLayout);
        }

        @Override
        public void K(int n8) {
            TabLayout tabLayout = (TabLayout)((Object)this.a.get());
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != n8 && n8 < tabLayout.getTabCount()) {
                int n9 = this.c;
                boolean bl = n9 == 0 || n9 == 2 && this.b == 0;
                tabLayout.M(tabLayout.C(n8), bl);
            }
        }

        void a() {
            this.c = 0;
            this.b = 0;
        }

        @Override
        public void e(int n8) {
            this.b = this.c;
            this.c = n8;
            TabLayout tabLayout = (TabLayout)((Object)this.a.get());
            if (tabLayout != null) {
                tabLayout.W(this.c);
            }
        }

        @Override
        public void h(int n8, float f8, int n9) {
            TabLayout tabLayout = (TabLayout)((Object)this.a.get());
            if (tabLayout != null) {
                boolean bl;
                boolean bl2;
                n9 = this.c;
                boolean bl3 = bl2 = true;
                if (n9 == 2) {
                    bl3 = this.b == 1 ? bl2 : false;
                }
                bl2 = bl = true;
                if (n9 == 2) {
                    bl2 = this.b != 0 ? bl : false;
                }
                tabLayout.Q(n8, f8, bl3, bl2, false);
            }
        }
    }

    public final class i
    extends LinearLayout {
        private g a;
        private TextView b;
        private ImageView c;
        private View d;
        private ax.n6.a e;
        private View f;
        private TextView g;
        private ImageView h;
        private Drawable i;
        private int j;
        final TabLayout k;

        public i(TabLayout tabLayout, Context context) {
            this.k = tabLayout;
            super(context);
            this.j = 2;
            this.q(context);
            this.setPaddingRelative(tabLayout.e, tabLayout.f, tabLayout.g, tabLayout.h);
            this.setGravity(17);
            this.setOrientation(tabLayout.E ^ 1);
            this.setClickable(true);
            d0.w0((View)this, ax.c0.M.b(this.getContext(), 1002));
        }

        private void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener(){
                final View a;
                final i b;
                {
                    this.b = i8;
                    this.a = view;
                }

                public void onLayoutChange(View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
                    if (this.a.getVisibility() == 0) {
                        this.b.o(this.a);
                    }
                }
            });
        }

        private float e(Layout layout, int n8, float f8) {
            return layout.getLineWidth(n8) * (f8 / layout.getPaint().getTextSize());
        }

        private void f(boolean bl) {
            this.setClipChildren(bl);
            this.setClipToPadding(bl);
            ViewGroup viewGroup = (ViewGroup)this.getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(bl);
                viewGroup.setClipToPadding(bl);
            }
        }

        private void g(Canvas canvas) {
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.setBounds(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
                this.i.draw(canvas);
            }
        }

        private ax.n6.a getBadge() {
            return this.e;
        }

        private ax.n6.a getOrCreateBadge() {
            if (this.e == null) {
                this.e = ax.n6.a.e(this.getContext());
            }
            this.n();
            ax.n6.a a8 = this.e;
            if (a8 != null) {
                return a8;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private boolean h() {
            return this.e != null;
        }

        private void i() {
            ImageView imageView;
            this.c = imageView = (ImageView)LayoutInflater.from((Context)this.getContext()).inflate(ax.k6.i.d, (ViewGroup)this, false);
            this.addView((View)imageView, 0);
        }

        private void j() {
            TextView textView;
            this.b = textView = (TextView)LayoutInflater.from((Context)this.getContext()).inflate(ax.k6.i.e, (ViewGroup)this, false);
            this.addView((View)textView);
        }

        private void l(View view) {
            if (this.h() && view != null) {
                this.f(false);
                ax.n6.d.a(this.e, view, null);
                this.d = view;
            }
        }

        private void m() {
            if (this.h()) {
                this.f(true);
                View view = this.d;
                if (view != null) {
                    ax.n6.d.b(this.e, view);
                    this.d = null;
                }
            }
        }

        private void n() {
            g g8;
            if (!this.h()) {
                return;
            }
            if (this.f != null) {
                this.m();
                return;
            }
            if (this.c != null && (g8 = this.a) != null && g8.f() != null) {
                View view = this.d;
                g8 = this.c;
                if (view != g8) {
                    this.m();
                    this.l((View)this.c);
                    return;
                }
                this.o((View)g8);
                return;
            }
            if (this.b != null && (g8 = this.a) != null && g8.h() == 1) {
                View view = this.d;
                g8 = this.b;
                if (view != g8) {
                    this.m();
                    this.l((View)this.b);
                    return;
                }
                this.o((View)g8);
                return;
            }
            this.m();
        }

        private void o(View view) {
            if (this.h() && view == this.d) {
                ax.n6.d.c(this.e, view, null);
            }
        }

        private void q(Context context) {
            int n8 = this.k.u;
            Object var5_3 = null;
            if (n8 != 0) {
                context = ax.o.a.b(context, n8);
                this.i = context;
                if (context != null && context.isStateful()) {
                    this.i.setState(this.getDrawableState());
                }
            } else {
                this.i = null;
            }
            context = new GradientDrawable();
            context.setColor(0);
            Context context2 = context;
            if (this.k.n != null) {
                context2 = new GradientDrawable();
                context2.setCornerRadius(1.0E-5f);
                context2.setColor(-1);
                ColorStateList colorStateList = ax.L6.a.a(this.k.n);
                boolean bl = this.k.I;
                if (bl) {
                    context = null;
                }
                if (bl) {
                    context2 = var5_3;
                }
                context2 = new RippleDrawable(colorStateList, (Drawable)context, (Drawable)context2);
            }
            this.setBackground((Drawable)context2);
            this.k.invalidate();
        }

        private void t(TextView object, ImageView object2, boolean bl) {
            int n8;
            int n9;
            boolean bl2;
            Object var9_5;
            Object object3;
            block21: {
                block18: {
                    Object object4;
                    block20: {
                        block19: {
                            object3 = this.a;
                            var9_5 = null;
                            object4 = object3 != null && ((g)object3).f() != null ? ax.U.a.r(this.a.f()).mutate() : null;
                            if (object4 != null) {
                                object4.setTintList(this.k.m);
                                object3 = this.k.q;
                                if (object3 != null) {
                                    object4.setTintMode((PorterDuff.Mode)object3);
                                }
                            }
                            object3 = (object3 = this.a) != null ? ((g)object3).j() : null;
                            if (object2 != null) {
                                if (object4 != null) {
                                    object2.setImageDrawable(object4);
                                    object2.setVisibility(0);
                                    this.setVisibility(0);
                                } else {
                                    object2.setVisibility(8);
                                    object2.setImageDrawable(null);
                                }
                            }
                            bl2 = TextUtils.isEmpty((CharSequence)object3);
                            if (object == null) break block18;
                            if (bl2) break block19;
                            n9 = this.a.g;
                            n8 = 1;
                            if (n9 == 1) break block20;
                        }
                        n8 = 0;
                    }
                    object4 = !bl2 ? object3 : null;
                    object.setText((CharSequence)object4);
                    n9 = n8 != 0 ? 0 : 8;
                    object.setVisibility(n9);
                    n9 = n8;
                    if (!bl2) {
                        this.setVisibility(0);
                        n9 = n8;
                    }
                    break block21;
                }
                n9 = 0;
            }
            if (bl && object2 != null) {
                object = (ViewGroup.MarginLayoutParams)object2.getLayoutParams();
                n8 = n9 != 0 && object2.getVisibility() == 0 ? (int)ax.F6.z.c(this.getContext(), 8) : 0;
                if (this.k.E) {
                    if (n8 != object.getMarginEnd()) {
                        object.setMarginEnd(n8);
                        object.bottomMargin = 0;
                        object2.setLayoutParams((ViewGroup.LayoutParams)object);
                        object2.requestLayout();
                    }
                } else if (n8 != object.bottomMargin) {
                    object.bottomMargin = n8;
                    object.setMarginEnd(0);
                    object2.setLayoutParams((ViewGroup.LayoutParams)object);
                    object2.requestLayout();
                }
            }
            object2 = this.a;
            object = var9_5;
            if (object2 != null) {
                object = ((g)object2).d;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!bl2) {
                    object = object3;
                }
                ax.u.B.a((View)this, (CharSequence)object);
            }
        }

        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] nArray = this.getDrawableState();
            Drawable drawable = this.i;
            boolean bl = drawable != null && drawable.isStateful() ? this.i.setState(nArray) : false;
            if (bl) {
                this.invalidate();
                this.k.invalidate();
            }
        }

        int getContentHeight() {
            TextView textView = this.b;
            ImageView imageView = this.c;
            View view = this.f;
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            for (int i8 = 0; i8 < 3; ++i8) {
                View view2 = (new View[]{textView, imageView, view})[i8];
                int n11 = n8;
                int n12 = n9;
                int n13 = n10;
                if (view2 != null) {
                    n11 = n8;
                    n12 = n9;
                    n13 = n10;
                    if (view2.getVisibility() == 0) {
                        n9 = n10 != 0 ? Math.min(n9, view2.getTop()) : view2.getTop();
                        n10 = n10 != 0 ? Math.max(n8, view2.getBottom()) : view2.getBottom();
                        n13 = 1;
                        n12 = n9;
                        n11 = n10;
                    }
                }
                n8 = n11;
                n9 = n12;
                n10 = n13;
            }
            return n8 - n9;
        }

        int getContentWidth() {
            TextView textView = this.b;
            ImageView imageView = this.c;
            View view = this.f;
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            for (int i8 = 0; i8 < 3; ++i8) {
                View view2 = (new View[]{textView, imageView, view})[i8];
                int n11 = n8;
                int n12 = n9;
                int n13 = n10;
                if (view2 != null) {
                    n11 = n8;
                    n12 = n9;
                    n13 = n10;
                    if (view2.getVisibility() == 0) {
                        n9 = n10 != 0 ? Math.min(n9, view2.getLeft()) : view2.getLeft();
                        n10 = n10 != 0 ? Math.max(n8, view2.getRight()) : view2.getRight();
                        n13 = 1;
                        n12 = n9;
                        n11 = n10;
                    }
                }
                n8 = n11;
                n9 = n12;
                n10 = n13;
            }
            return n8 - n9;
        }

        public g getTab() {
            return this.a;
        }

        void k() {
            this.setTab(null);
            this.setSelected(false);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo object) {
            super.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)object);
            object = ax.d0.H.Q0((AccessibilityNodeInfo)object);
            ax.n6.a a8 = this.e;
            if (a8 != null && a8.isVisible()) {
                ((H)object).q0(this.e.i());
            }
            ((H)object).p0(H.f.a(0, 1, this.a.g(), 1, false, this.isSelected()));
            if (this.isSelected()) {
                ((H)object).n0(false);
                ((H)object).e0(H.a.i);
            }
            ((H)object).E0(this.getResources().getString(ax.k6.k.h));
        }

        public void onMeasure(int n8, int n9) {
            int n10;
            int n11;
            int n12;
            int n13;
            block12: {
                block13: {
                    n13 = View.MeasureSpec.getSize((int)n8);
                    n12 = View.MeasureSpec.getMode((int)n8);
                    n11 = this.k.getTabMaxWidth();
                    n10 = n8;
                    if (n11 <= 0) break block12;
                    if (n12 == 0) break block13;
                    n10 = n8;
                    if (n13 <= n11) break block12;
                }
                n10 = View.MeasureSpec.makeMeasureSpec((int)this.k.v, (int)Integer.MIN_VALUE);
            }
            super.onMeasure(n10, n9);
            if (this.b != null) {
                float f8;
                float f9 = f8 = this.k.r;
                if (this.isSelected()) {
                    f9 = f8;
                    if (this.k.k != -1) {
                        f9 = this.k.s;
                    }
                }
                n13 = this.j;
                ImageView imageView = this.c;
                if (imageView != null && imageView.getVisibility() == 0) {
                    n8 = 1;
                    f8 = f9;
                } else {
                    imageView = this.b;
                    f8 = f9;
                    n8 = n13;
                    if (imageView != null) {
                        f8 = f9;
                        n8 = n13;
                        if (imageView.getLineCount() > 1) {
                            f8 = this.k.t;
                            n8 = n13;
                        }
                    }
                }
                f9 = this.b.getTextSize();
                n13 = this.b.getLineCount();
                n11 = this.b.getMaxLines();
                n12 = f8 == f9 ? 0 : (f8 > f9 ? 1 : -1);
                if (n12 != 0 || n11 >= 0 && n8 != n11) {
                    if (this.k.D == 1 && n12 > 0 && n13 == 1 && ((imageView = this.b.getLayout()) == null || this.e((Layout)imageView, 0, f8) > (float)(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight()))) {
                        return;
                    }
                    this.b.setTextSize(0, f8);
                    this.b.setMaxLines(n8);
                    super.onMeasure(n10, n9);
                }
            }
        }

        final void p() {
            this.s();
            g g8 = this.a;
            boolean bl = g8 != null && g8.k();
            this.setSelected(bl);
        }

        public boolean performClick() {
            boolean bl;
            boolean bl2 = bl = super.performClick();
            if (this.a != null) {
                if (!bl) {
                    this.playSoundEffect(0);
                }
                this.a.m();
                bl2 = true;
            }
            return bl2;
        }

        final void r() {
            this.setOrientation(this.k.E ^ 1);
            TextView textView = this.g;
            if (textView == null && this.h == null) {
                this.t(this.b, this.c, true);
                return;
            }
            this.t(textView, this.h, false);
        }

        final void s() {
            g g8 = this.a;
            View view = g8 != null ? g8.e() : null;
            if (view != null) {
                ViewParent viewParent = view.getParent();
                if (viewParent != this) {
                    if (viewParent != null) {
                        ((ViewGroup)viewParent).removeView(view);
                    }
                    if ((viewParent = this.f) != null && (viewParent = viewParent.getParent()) != null) {
                        ((ViewGroup)viewParent).removeView(this.f);
                    }
                    this.addView(view);
                }
                this.f = view;
                viewParent = this.b;
                if (viewParent != null) {
                    viewParent.setVisibility(8);
                }
                if ((viewParent = this.c) != null) {
                    viewParent.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                viewParent = (TextView)view.findViewById(16908308);
                this.g = viewParent;
                if (viewParent != null) {
                    this.j = viewParent.getMaxLines();
                }
                this.h = (ImageView)view.findViewById(16908294);
            } else {
                view = this.f;
                if (view != null) {
                    this.removeView(view);
                    this.f = null;
                }
                this.g = null;
                this.h = null;
            }
            if (this.f == null) {
                if (this.c == null) {
                    this.i();
                }
                if (this.b == null) {
                    this.j();
                    this.j = this.b.getMaxLines();
                }
                ax.h0.j.m(this.b, this.k.i);
                if (this.isSelected() && this.k.k != -1) {
                    ax.h0.j.m(this.b, this.k.k);
                } else {
                    ax.h0.j.m(this.b, this.k.j);
                }
                view = this.k.l;
                if (view != null) {
                    this.b.setTextColor((ColorStateList)view);
                }
                this.t(this.b, this.c, true);
                this.n();
                this.d((View)this.c);
                this.d((View)this.b);
            } else {
                view = this.g;
                if (view != null || this.h != null) {
                    this.t((TextView)view, this.h, false);
                }
            }
            if (g8 != null && !TextUtils.isEmpty((CharSequence)g8.d)) {
                this.setContentDescription(g8.d);
            }
        }

        public void setSelected(boolean bl) {
            this.isSelected();
            super.setSelected(bl);
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(bl);
            }
            if ((textView = this.c) != null) {
                textView.setSelected(bl);
            }
            if ((textView = this.f) != null) {
                textView.setSelected(bl);
            }
        }

        void setTab(g g8) {
            if (g8 != this.a) {
                this.a = g8;
                this.p();
            }
        }
    }

    public static class j
    implements d {
        private final ViewPager a;

        public j(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override
        public void a(g g8) {
        }

        @Override
        public void b(g g8) {
            this.a.setCurrentItem(g8.g());
        }

        @Override
        public void c(g g8) {
        }
    }
}

