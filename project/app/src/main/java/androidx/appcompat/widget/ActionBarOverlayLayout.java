/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import ax.T.b;
import ax.c0.F;
import ax.c0.F0;
import ax.c0.G;
import ax.c0.H;
import ax.c0.d0;
import ax.m.a;
import ax.u.k;
import ax.u.l;

@SuppressLint(value={"UnknownNullness"})
public class ActionBarOverlayLayout
extends ViewGroup
implements k,
F,
G {
    static final int[] G = new int[]{ax.m.a.b, 16842841};
    private static final F0 H = new F0.b().d(ax.T.b.b(0, 1, 0, 1)).a();
    private static final Rect I = new Rect();
    ViewPropertyAnimator A;
    final AnimatorListenerAdapter B;
    private final Runnable C;
    private final Runnable D;
    private final H E;
    private final f F;
    private int a;
    private int b = 0;
    private ContentFrameLayout c;
    ActionBarContainer d;
    private l e;
    private Drawable f;
    private boolean g;
    private boolean h;
    private boolean i;
    boolean j;
    private int k;
    private int l;
    private final Rect m = new Rect();
    private final Rect n = new Rect();
    private final Rect o = new Rect();
    private final Rect p = new Rect();
    private final Rect q = new Rect();
    private final Rect r = new Rect();
    private final Rect s = new Rect();
    private final Rect t = new Rect();
    private F0 u;
    private F0 v;
    private F0 w;
    private F0 x;
    private d y;
    private OverScroller z;

    public ActionBarOverlayLayout(Context object, AttributeSet object2) {
        super(object, object2);
        object2 = F0.b;
        this.u = object2;
        this.v = object2;
        this.w = object2;
        this.x = object2;
        this.B = new AnimatorListenerAdapter(this){
            final ActionBarOverlayLayout a;
            {
                this.a = actionBarOverlayLayout;
            }

            public void onAnimationCancel(Animator object) {
                object = this.a;
                object.A = null;
                object.j = false;
            }

            public void onAnimationEnd(Animator object) {
                object = this.a;
                object.A = null;
                object.j = false;
            }
        };
        this.C = new Runnable(this){
            final ActionBarOverlayLayout q;
            {
                this.q = actionBarOverlayLayout;
            }

            @Override
            public void run() {
                this.q.v();
                ActionBarOverlayLayout actionBarOverlayLayout = this.q;
                actionBarOverlayLayout.A = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener((Animator.AnimatorListener)this.q.B);
            }
        };
        this.D = new Runnable(this){
            final ActionBarOverlayLayout q;
            {
                this.q = actionBarOverlayLayout;
            }

            @Override
            public void run() {
                this.q.v();
                ActionBarOverlayLayout actionBarOverlayLayout = this.q;
                actionBarOverlayLayout.A = actionBarOverlayLayout.d.animate().translationY((float)(-this.q.d.getHeight())).setListener((Animator.AnimatorListener)this.q.B);
            }
        };
        this.w((Context)object);
        this.E = new H(this);
        object = new f((Context)object);
        this.F = object;
        this.addView((View)object);
    }

    private void B() {
        this.v();
        this.C.run();
    }

    private boolean C(float f8) {
        this.z.fling(0, 0, 0, (int)f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.z.getFinalY() > this.d.getHeight();
    }

    private void a() {
        this.v();
        this.D.run();
    }

    private boolean q(View object, Rect rect, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        boolean bl5;
        int n8;
        int n9;
        object = (e)object.getLayoutParams();
        if (bl && (n9 = object.leftMargin) != (n8 = rect.left)) {
            object.leftMargin = n8;
            bl5 = true;
        } else {
            bl5 = false;
        }
        bl = bl5;
        if (bl2) {
            n9 = object.topMargin;
            n8 = rect.top;
            bl = bl5;
            if (n9 != n8) {
                object.topMargin = n8;
                bl = true;
            }
        }
        bl2 = bl;
        if (bl4) {
            n9 = object.rightMargin;
            n8 = rect.right;
            bl2 = bl;
            if (n9 != n8) {
                object.rightMargin = n8;
                bl2 = true;
            }
        }
        if (bl3 && (n8 = object.bottomMargin) != (n9 = rect.bottom)) {
            object.bottomMargin = n9;
            return true;
        }
        return bl2;
    }

    private boolean r() {
        d0.h(this.F, H, this.p);
        return this.p.equals((Object)I) ^ true;
    }

    private l u(View view) {
        if (view instanceof l) {
            return (l)view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar)view).getWrapper();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't make a decor toolbar out of ");
        stringBuilder.append(view.getClass().getSimpleName());
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void w(Context context) {
        Drawable drawable;
        TypedArray typedArray = this.getContext().getTheme().obtainStyledAttributes(G);
        boolean bl = false;
        this.a = typedArray.getDimensionPixelSize(0, 0);
        this.f = drawable = typedArray.getDrawable(1);
        if (drawable == null) {
            bl = true;
        }
        this.setWillNotDraw(bl);
        typedArray.recycle();
        this.z = new OverScroller(context);
    }

    private void y() {
        this.v();
        this.postDelayed(this.D, 600L);
    }

    private void z() {
        this.v();
        this.postDelayed(this.C, 600L);
    }

    void A() {
        if (this.c == null) {
            this.c = (ContentFrameLayout)this.findViewById(ax.m.f.b);
            this.d = (ActionBarContainer)this.findViewById(ax.m.f.c);
            this.e = this.u(this.findViewById(ax.m.f.a));
        }
    }

    @Override
    public void b(View view, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
        this.e(view, n8, n9, n10, n11, n12);
    }

    @Override
    public void c(Menu menu, j.a a8) {
        this.A();
        this.e.c(menu, a8);
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override
    public boolean d() {
        this.A();
        return this.e.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f != null) {
            int n8 = this.d.getVisibility() == 0 ? (int)((float)this.d.getBottom() + this.d.getTranslationY() + 0.5f) : 0;
            this.f.setBounds(0, n8, this.getWidth(), this.f.getIntrinsicHeight() + n8);
            this.f.draw(canvas);
        }
    }

    @Override
    public void e(View view, int n8, int n9, int n10, int n11, int n12) {
        if (n12 == 0) {
            this.onNestedScroll(view, n8, n9, n10, n11);
        }
    }

    @Override
    public boolean f(View view, View view2, int n8, int n9) {
        return n9 == 0 && this.onStartNestedScroll(view, view2, n8);
    }

    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override
    public void g() {
        this.A();
        this.e.g();
    }

    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int)actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        this.A();
        return this.e.getTitle();
    }

    @Override
    public void h(View view, View view2, int n8, int n9) {
        if (n9 == 0) {
            this.onNestedScrollAccepted(view, view2, n8);
        }
    }

    @Override
    public boolean i() {
        this.A();
        return this.e.i();
    }

    @Override
    public boolean j() {
        this.A();
        return this.e.j();
    }

    @Override
    public boolean k() {
        this.A();
        return this.e.k();
    }

    @Override
    public boolean l() {
        this.A();
        return this.e.l();
    }

    @Override
    public void m(int n8) {
        this.A();
        if (n8 != 2) {
            if (n8 != 5) {
                if (n8 != 109) {
                    return;
                }
                this.setOverlayMode(true);
                return;
            }
            this.e.C();
            return;
        }
        this.e.B();
    }

    @Override
    public void n() {
        this.A();
        this.e.m();
    }

    @Override
    public void o(View view, int n8) {
        if (n8 == 0) {
            this.onStopNestedScroll(view);
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets object) {
        this.A();
        object = F0.w((WindowInsets)object, (View)this);
        Object object2 = new Rect(((F0)object).j(), ((F0)object).l(), ((F0)object).k(), ((F0)object).i());
        boolean bl = this.q((View)this.d, (Rect)object2, true, true, false, true);
        d0.h((View)this, (F0)object, this.m);
        object2 = this.m;
        object2 = ((F0)object).m(object2.left, object2.top, object2.right, object2.bottom);
        this.u = object2;
        boolean bl2 = this.v.equals(object2);
        boolean bl3 = true;
        if (!bl2) {
            this.v = this.u;
            bl = true;
        }
        if (!this.n.equals((Object)this.m)) {
            this.n.set(this.m);
            bl = bl3;
        }
        if (bl) {
            this.requestLayout();
        }
        return ((F0)object).a().c().b().u();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w(this.getContext());
        d0.i0((View)this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v();
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        n9 = this.getChildCount();
        n10 = this.getPaddingLeft();
        n11 = this.getPaddingTop();
        for (n8 = 0; n8 < n9; ++n8) {
            View view = this.getChildAt(n8);
            if (view.getVisibility() == 8) continue;
            e e8 = (e)view.getLayoutParams();
            int n12 = view.getMeasuredWidth();
            int n13 = view.getMeasuredHeight();
            int n14 = e8.leftMargin + n10;
            int n15 = e8.topMargin + n11;
            view.layout(n14, n15, n12 + n14, n13 + n15);
        }
    }

    protected void onMeasure(int n8, int n9) {
        int n10;
        int n11;
        this.A();
        this.measureChildWithMargins((View)this.d, n8, 0, n9, 0);
        Object object = (e)this.d.getLayoutParams();
        int n12 = Math.max(0, this.d.getMeasuredWidth() + object.leftMargin + object.rightMargin);
        int n13 = Math.max(0, this.d.getMeasuredHeight() + object.topMargin + object.bottomMargin);
        int n14 = View.combineMeasuredStates((int)0, (int)this.d.getMeasuredState());
        int n15 = (d0.L((View)this) & 0x100) != 0 ? 1 : 0;
        if (n15 != 0) {
            n10 = n11 = this.a;
            if (this.h) {
                n10 = n11;
                if (this.d.getTabContainer() != null) {
                    n10 = n11 + this.a;
                }
            }
        } else {
            n10 = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        this.o.set(this.m);
        this.w = this.u;
        if (!this.g && n15 == 0 && this.r()) {
            object = this.o;
            ((Rect)object).top += n10;
            ((Rect)object).bottom = ((Rect)object).bottom;
            this.w = this.w.m(0, n10, 0, 0);
        } else {
            object = ax.T.b.b(this.w.j(), this.w.l() + n10, this.w.k(), this.w.i());
            this.w = new F0.b(this.w).d((b)object).a();
        }
        this.q((View)this.c, this.o, true, true, true, true);
        if (!this.x.equals(this.w)) {
            object = this.w;
            this.x = object;
            d0.i((View)this.c, (F0)object);
        }
        this.measureChildWithMargins((View)this.c, n8, 0, n9, 0);
        object = (e)this.c.getLayoutParams();
        n10 = Math.max(n12, this.c.getMeasuredWidth() + object.leftMargin + object.rightMargin);
        n13 = Math.max(n13, this.c.getMeasuredHeight() + object.topMargin + object.bottomMargin);
        n14 = View.combineMeasuredStates((int)n14, (int)this.c.getMeasuredState());
        n11 = this.getPaddingLeft();
        n15 = this.getPaddingRight();
        n13 = Math.max(n13 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState((int)Math.max(n10 + (n11 + n15), this.getSuggestedMinimumWidth()), (int)n8, (int)n14), View.resolveSizeAndState((int)n13, (int)n9, (int)(n14 << 16)));
    }

    public boolean onNestedFling(View view, float f8, float f9, boolean bl) {
        if (this.i && bl) {
            if (this.C(f9)) {
                this.a();
            } else {
                this.B();
            }
            this.j = true;
            return true;
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    public void onNestedPreScroll(View view, int n8, int n9, int[] nArray) {
    }

    public void onNestedScroll(View view, int n8, int n9, int n10, int n11) {
        this.k = n8 = this.k + n9;
        this.setActionBarHideOffset(n8);
    }

    public void onNestedScrollAccepted(View object, View view, int n8) {
        this.E.b((View)object, view, n8);
        this.k = this.getActionBarHideOffset();
        this.v();
        object = this.y;
        if (object != null) {
            object.e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int n8) {
        if ((n8 & 2) != 0 && this.d.getVisibility() == 0) {
            return this.i;
        }
        return false;
    }

    public void onStopNestedScroll(View object) {
        if (this.i && !this.j) {
            if (this.k <= this.d.getHeight()) {
                this.z();
            } else {
                this.y();
            }
        }
        if ((object = this.y) != null) {
            object.b();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int n8) {
        d d8;
        super.onWindowSystemUiVisibilityChanged(n8);
        this.A();
        int n9 = this.l;
        this.l = n8;
        boolean bl = false;
        boolean bl2 = (n8 & 4) == 0;
        if ((n8 & 0x100) != 0) {
            bl = true;
        }
        if ((d8 = this.y) != null) {
            d8.c(bl ^ true);
            if (!bl2 && bl) {
                this.y.d();
            } else {
                this.y.a();
            }
        }
        if (((n9 ^ n8) & 0x100) != 0 && this.y != null) {
            d0.i0((View)this);
        }
    }

    protected void onWindowVisibilityChanged(int n8) {
        super.onWindowVisibilityChanged(n8);
        this.b = n8;
        d d8 = this.y;
        if (d8 != null) {
            d8.f(n8);
        }
    }

    @Override
    public void p(View view, int n8, int n9, int[] nArray, int n10) {
        if (n10 == 0) {
            this.onNestedPreScroll(view, n8, n9, nArray);
        }
    }

    protected e s() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int n8) {
        this.v();
        n8 = Math.max(0, Math.min(n8, this.d.getHeight()));
        this.d.setTranslationY(-n8);
    }

    public void setActionBarVisibilityCallback(d d8) {
        this.y = d8;
        if (this.getWindowToken() != null) {
            this.y.f(this.b);
            int n8 = this.l;
            if (n8 != 0) {
                this.onWindowSystemUiVisibilityChanged(n8);
                d0.i0((View)this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean bl) {
        this.h = bl;
    }

    public void setHideOnContentScrollEnabled(boolean bl) {
        if (bl != this.i) {
            this.i = bl;
            if (!bl) {
                this.v();
                this.setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int n8) {
        this.A();
        this.e.setIcon(n8);
    }

    public void setIcon(Drawable drawable) {
        this.A();
        this.e.setIcon(drawable);
    }

    public void setLogo(int n8) {
        this.A();
        this.e.s(n8);
    }

    public void setOverlayMode(boolean bl) {
        this.g = bl;
    }

    public void setShowingForActionMode(boolean bl) {
    }

    public void setUiOptions(int n8) {
    }

    @Override
    public void setWindowCallback(Window.Callback callback) {
        this.A();
        this.e.setWindowCallback(callback);
    }

    @Override
    public void setWindowTitle(CharSequence charSequence) {
        this.A();
        this.e.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public e t(AttributeSet attributeSet) {
        return new e(this.getContext(), attributeSet);
    }

    void v() {
        this.removeCallbacks(this.C);
        this.removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.g;
    }

    public static interface d {
        public void a();

        public void b();

        public void c(boolean var1);

        public void d();

        public void e();

        public void f(int var1);
    }

    public static class e
    extends ViewGroup.MarginLayoutParams {
        public e(int n8, int n9) {
            super(n8, n9);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private static final class f
    extends View {
        f(Context context) {
            super(context);
            this.setWillNotDraw(true);
        }

        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }
}

