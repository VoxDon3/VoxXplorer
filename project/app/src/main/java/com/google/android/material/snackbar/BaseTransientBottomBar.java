/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.F6.B;
import ax.F6.w;
import ax.F6.z;
import ax.K6.c;
import ax.O6.h;
import ax.O6.l;
import ax.Q6.b;
import ax.c0.F0;
import ax.c0.I;
import ax.c0.T0;
import ax.c0.d0;
import ax.d0.H;
import ax.k6.e;
import ax.k6.i;
import ax.k6.m;
import ax.u.p;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.snackbar.a;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    private static final TimeInterpolator A;
    private static final TimeInterpolator B;
    static final Handler C;
    private static final int[] D;
    private static final String E;
    private static final TimeInterpolator z;
    private final int a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator e;
    private final TimeInterpolator f;
    private final ViewGroup g;
    private final Context h;
    protected final s i;
    private final b j;
    private int k;
    private boolean l;
    private boolean m = false;
    private final Runnable n = new Runnable(this){
        final BaseTransientBottomBar q;
        {
            this.q = baseTransientBottomBar;
        }

        @Override
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = this.q;
            if (baseTransientBottomBar.i != null && baseTransientBottomBar.h != null) {
                int n8 = ax.F6.B.a(this.q.h).height() - this.q.I() + (int)this.q.i.getTranslationY();
                if (n8 >= this.q.s) {
                    baseTransientBottomBar = this.q;
                    BaseTransientBottomBar.l(baseTransientBottomBar, baseTransientBottomBar.s);
                    return;
                }
                baseTransientBottomBar = this.q.i.getLayoutParams();
                if (!(baseTransientBottomBar instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w((String)E, (String)"Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                BaseTransientBottomBar baseTransientBottomBar2 = this.q;
                BaseTransientBottomBar.l(baseTransientBottomBar2, baseTransientBottomBar2.s);
                baseTransientBottomBar = (ViewGroup.MarginLayoutParams)baseTransientBottomBar;
                ((ViewGroup.MarginLayoutParams)baseTransientBottomBar).bottomMargin += this.q.s - n8;
                this.q.i.requestLayout();
            }
        }
    };
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private List<q<B>> v;
    private Behavior w;
    private final AccessibilityManager x;
    a.b y = new a.b(this){
        final BaseTransientBottomBar a;
        {
            this.a = baseTransientBottomBar;
        }

        @Override
        public void a(int n8) {
            Handler handler = C;
            handler.sendMessage(handler.obtainMessage(1, n8, 0, (Object)this.a));
        }

        @Override
        public void c() {
            Handler handler = C;
            handler.sendMessage(handler.obtainMessage(0, (Object)this.a));
        }
    };

    static {
        z = ax.l6.a.b;
        A = ax.l6.a.a;
        B = ax.l6.a.d;
        D = new int[]{ax.k6.c.U};
        E = BaseTransientBottomBar.class.getSimpleName();
        C = new Handler(Looper.getMainLooper(), new Handler.Callback(){

            public boolean handleMessage(Message message) {
                int n8 = message.what;
                if (n8 != 0) {
                    if (n8 != 1) {
                        return false;
                    }
                    ((BaseTransientBottomBar)message.obj).K(message.arg1);
                    return true;
                }
                ((BaseTransientBottomBar)message.obj).b0();
                return true;
            }
        });
    }

    protected BaseTransientBottomBar(Context context, ViewGroup object, View view, b b8) {
        if (object != null) {
            if (view != null) {
                if (b8 != null) {
                    this.g = object;
                    this.j = b8;
                    this.h = context;
                    ax.F6.w.a(context);
                    object = (s)LayoutInflater.from((Context)context).inflate(this.F(), (ViewGroup)object, false);
                    this.i = object;
                    ((s)((Object)object)).setBaseTransientBottomBar(this);
                    if (view instanceof SnackbarContentLayout) {
                        b8 = (SnackbarContentLayout)view;
                        ((SnackbarContentLayout)b8).c(((s)((Object)object)).getActionTextColorAlpha());
                        ((SnackbarContentLayout)b8).setMaxInlineActionWidth(((s)((Object)object)).getMaxInlineActionWidth());
                    }
                    object.addView(view);
                    object.setAccessibilityLiveRegion(1);
                    object.setImportantForAccessibility(1);
                    object.setFitsSystemWindows(true);
                    d0.v0((View)object, new I(this){
                        final BaseTransientBottomBar a;
                        {
                            this.a = baseTransientBottomBar;
                        }

                        @Override
                        public F0 a(View view, F0 f02) {
                            BaseTransientBottomBar.n(this.a, f02.i());
                            BaseTransientBottomBar.o(this.a, f02.j());
                            BaseTransientBottomBar.p(this.a, f02.k());
                            this.a.h0();
                            return f02;
                        }
                    });
                    d0.l0((View)object, new ax.c0.a(this){
                        final BaseTransientBottomBar d;
                        {
                            this.d = baseTransientBottomBar;
                        }

                        @Override
                        public void g(View view, H h8) {
                            super.g(view, h8);
                            h8.a(0x100000);
                            h8.r0(true);
                        }

                        @Override
                        public boolean j(View view, int n8, Bundle bundle) {
                            if (n8 == 0x100000) {
                                this.d.x();
                                return true;
                            }
                            return super.j(view, n8, bundle);
                        }
                    });
                    this.x = (AccessibilityManager)context.getSystemService("accessibility");
                    int n8 = ax.k6.c.D;
                    this.c = ax.H6.i.f(context, n8, 250);
                    this.a = ax.H6.i.f(context, n8, 150);
                    this.b = ax.H6.i.f(context, ax.k6.c.E, 75);
                    n8 = ax.k6.c.M;
                    this.d = ax.H6.i.g(context, n8, A);
                    this.f = ax.H6.i.g(context, n8, B);
                    this.e = ax.H6.i.g(context, n8, z);
                    return;
                }
                throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
    }

    private ValueAnimator E(float ... object) {
        object = ValueAnimator.ofFloat((float[])object);
        object.setInterpolator(this.f);
        object.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
            final BaseTransientBottomBar a;
            {
                this.a = baseTransientBottomBar;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f8 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
                this.a.i.setScaleX(f8);
                this.a.i.setScaleY(f8);
            }
        });
        return object;
    }

    private int G() {
        int n8 = this.i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        int n9 = n8;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            n9 = n8 + ((ViewGroup.MarginLayoutParams)layoutParams).bottomMargin;
        }
        return n9;
    }

    private int I() {
        int[] nArray = new int[2];
        this.i.getLocationInWindow(nArray);
        return nArray[1] + this.i.getHeight();
    }

    private boolean N() {
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        return layoutParams instanceof CoordinatorLayout.f && ((CoordinatorLayout.f)layoutParams).f() instanceof SwipeDismissBehavior;
    }

    private void T() {
        this.r = this.u();
        this.h0();
    }

    private void X(CoordinatorLayout.f f8) {
        Behavior behavior = this.w;
        SwipeDismissBehavior swipeDismissBehavior = behavior;
        if (behavior == null) {
            swipeDismissBehavior = this.D();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior)swipeDismissBehavior).U(this);
        }
        swipeDismissBehavior.P(new SwipeDismissBehavior.c(this){
            final BaseTransientBottomBar a;
            {
                this.a = baseTransientBottomBar;
            }

            @Override
            public void a(View view) {
                if (view.getParent() != null) {
                    view.setVisibility(8);
                }
                this.a.y(0);
            }

            @Override
            public void b(int n8) {
                if (n8 != 0) {
                    if (n8 != 1 && n8 != 2) {
                        return;
                    }
                    com.google.android.material.snackbar.a.c().k(this.a.y);
                    return;
                }
                com.google.android.material.snackbar.a.c().l(this.a.y);
            }
        });
        f8.o(swipeDismissBehavior);
        if (this.A() == null) {
            f8.g = 80;
        }
    }

    private boolean Z() {
        return this.s > 0 && !this.l && this.N();
    }

    private void c0() {
        if (this.Y()) {
            this.s();
            return;
        }
        if (this.i.getParent() != null) {
            this.i.setVisibility(0);
        }
        this.S();
    }

    private void d0() {
        ValueAnimator valueAnimator = this.z(0.0f, 1.0f);
        ValueAnimator valueAnimator2 = this.E(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{valueAnimator, valueAnimator2});
        animatorSet.setDuration((long)this.a);
        animatorSet.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final BaseTransientBottomBar a;
            {
                this.a = baseTransientBottomBar;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.S();
            }
        });
        animatorSet.start();
    }

    private void e0(int n8) {
        ValueAnimator valueAnimator = this.z(1.0f, 0.0f);
        valueAnimator.setDuration((long)this.b);
        valueAnimator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, n8){
            final int a;
            final BaseTransientBottomBar b;
            {
                this.b = baseTransientBottomBar;
                this.a = n8;
            }

            public void onAnimationEnd(Animator animator) {
                this.b.R(this.a);
            }
        });
        valueAnimator.start();
    }

    private void f0() {
        int n8 = this.G();
        this.i.setTranslationY(n8);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{n8, 0});
        valueAnimator.setInterpolator(this.e);
        valueAnimator.setDuration((long)this.c);
        valueAnimator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final BaseTransientBottomBar a;
            {
                this.a = baseTransientBottomBar;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.S();
            }

            public void onAnimationStart(Animator animator) {
                this.a.j.a(this.a.c - this.a.a, this.a.a);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
            final BaseTransientBottomBar a;
            {
                this.a = baseTransientBottomBar;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int n8 = (Integer)valueAnimator.getAnimatedValue();
                this.a.i.setTranslationY(n8);
            }
        });
        valueAnimator.start();
    }

    private void g0(int n8) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, this.G()});
        valueAnimator.setInterpolator(this.e);
        valueAnimator.setDuration((long)this.c);
        valueAnimator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, n8){
            final int a;
            final BaseTransientBottomBar b;
            {
                this.b = baseTransientBottomBar;
                this.a = n8;
            }

            public void onAnimationEnd(Animator animator) {
                this.b.R(this.a);
            }

            public void onAnimationStart(Animator animator) {
                this.b.j.b(0, this.b.b);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
            final BaseTransientBottomBar a;
            {
                this.a = baseTransientBottomBar;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int n8 = (Integer)valueAnimator.getAnimatedValue();
                this.a.i.setTranslationY(n8);
            }
        });
        valueAnimator.start();
    }

    private void h0() {
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w((String)E, (String)"Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.i.j == null) {
            Log.w((String)E, (String)"Unable to update margins because original view margins are not set");
            return;
        }
        if (this.i.getParent() != null) {
            int n8 = this.A() != null ? this.r : this.o;
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            int n9 = ((s)this.i).j.bottom + n8;
            int n10 = ((s)this.i).j.left + this.p;
            int n11 = ((s)this.i).j.right + this.q;
            int n12 = ((s)this.i).j.top;
            n8 = layoutParams.bottomMargin == n9 && layoutParams.leftMargin == n10 && layoutParams.rightMargin == n11 && layoutParams.topMargin == n12 ? 0 : 1;
            if (n8 != 0) {
                layoutParams.bottomMargin = n9;
                layoutParams.leftMargin = n10;
                layoutParams.rightMargin = n11;
                layoutParams.topMargin = n12;
                this.i.requestLayout();
            }
            if ((n8 != 0 || this.t != this.s) && Build.VERSION.SDK_INT >= 29 && this.Z()) {
                this.i.removeCallbacks(this.n);
                this.i.post(this.n);
            }
        }
    }

    static /* synthetic */ int l(BaseTransientBottomBar baseTransientBottomBar, int n8) {
        baseTransientBottomBar.t = n8;
        return n8;
    }

    static /* synthetic */ int n(BaseTransientBottomBar baseTransientBottomBar, int n8) {
        baseTransientBottomBar.o = n8;
        return n8;
    }

    static /* synthetic */ int o(BaseTransientBottomBar baseTransientBottomBar, int n8) {
        baseTransientBottomBar.p = n8;
        return n8;
    }

    static /* synthetic */ int p(BaseTransientBottomBar baseTransientBottomBar, int n8) {
        baseTransientBottomBar.q = n8;
        return n8;
    }

    private void t(int n8) {
        if (this.i.getAnimationMode() == 1) {
            this.e0(n8);
            return;
        }
        this.g0(n8);
    }

    private int u() {
        if (this.A() == null) {
            return 0;
        }
        int[] nArray = new int[2];
        this.A().getLocationOnScreen(nArray);
        int n8 = nArray[1];
        nArray = new int[2];
        this.g.getLocationOnScreen(nArray);
        return nArray[1] + this.g.getHeight() - n8;
    }

    private static GradientDrawable v(int n8, Resources resources) {
        float f8 = resources.getDimension(ax.k6.e.t0);
        resources = new GradientDrawable();
        resources.setShape(0);
        resources.setCornerRadius(f8);
        resources.setColor(n8);
        return resources;
    }

    private static h w(int n8, l object) {
        object = new h((l)object);
        ((h)object).g0(ColorStateList.valueOf((int)n8));
        return object;
    }

    private ValueAnimator z(float ... object) {
        object = ValueAnimator.ofFloat((float[])object);
        object.setInterpolator(this.d);
        object.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
            final BaseTransientBottomBar a;
            {
                this.a = baseTransientBottomBar;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.i.setAlpha(((Float)valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return object;
    }

    public View A() {
        return null;
    }

    public Context B() {
        return this.h;
    }

    public int C() {
        return this.k;
    }

    protected SwipeDismissBehavior<? extends View> D() {
        return new Behavior();
    }

    protected int F() {
        if (this.J()) {
            return ax.k6.i.v;
        }
        return ax.k6.i.b;
    }

    public View H() {
        return this.i;
    }

    protected boolean J() {
        TypedArray typedArray = this.h.obtainStyledAttributes(D);
        int n8 = typedArray.getResourceId(0, -1);
        typedArray.recycle();
        return n8 != -1;
    }

    final void K(int n8) {
        if (this.Y() && this.i.getVisibility() == 0) {
            this.t(n8);
            return;
        }
        this.R(n8);
    }

    public boolean L() {
        return com.google.android.material.snackbar.a.c().e(this.y);
    }

    public boolean M() {
        return com.google.android.material.snackbar.a.c().f(this.y);
    }

    void O() {
        WindowInsets windowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (windowInsets = ax.Q6.a.a(this.i)) != null) {
            this.s = ax.u.p.a(T0.a(windowInsets));
            this.h0();
        }
    }

    void P() {
        if (this.M()) {
            C.post(new Runnable(this){
                final BaseTransientBottomBar q;
                {
                    this.q = baseTransientBottomBar;
                }

                @Override
                public void run() {
                    this.q.R(3);
                }
            });
        }
    }

    void Q() {
        if (this.u) {
            this.c0();
            this.u = false;
        }
    }

    void R(int n8) {
        com.google.android.material.snackbar.a.c().i(this.y);
        ViewParent viewParent = this.v;
        if (viewParent != null) {
            for (int i8 = viewParent.size() - 1; i8 >= 0; --i8) {
                this.v.get(i8).a(this, n8);
            }
        }
        if ((viewParent = this.i.getParent()) instanceof ViewGroup) {
            ((ViewGroup)viewParent).removeView((View)this.i);
        }
    }

    void S() {
        com.google.android.material.snackbar.a.c().j(this.y);
        List<q<B>> list = this.v;
        if (list != null) {
            for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                this.v.get(i8).b(this);
            }
        }
    }

    public B U(int n8) {
        this.i.setAnimationMode(n8);
        return (B)this;
    }

    public B V(int n8) {
        this.k = n8;
        return (B)this;
    }

    public B W(boolean bl) {
        this.l = bl;
        return (B)this;
    }

    boolean Y() {
        Object object = this.x;
        if (object == null) {
            return true;
        }
        return (object = object.getEnabledAccessibilityServiceList(1)) != null && object.isEmpty();
    }

    public void a0() {
        com.google.android.material.snackbar.a.c().n(this.C(), this.y);
    }

    final void b0() {
        if (this.i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                this.X((CoordinatorLayout.f)layoutParams);
            }
            this.i.c(this.g);
            this.T();
            this.i.setVisibility(4);
        }
        if (this.i.isLaidOut()) {
            this.c0();
            return;
        }
        this.u = true;
    }

    public B r(q<B> q8) {
        if (q8 == null) {
            return (B)this;
        }
        if (this.v == null) {
            this.v = new ArrayList<q<B>>();
        }
        this.v.add(q8);
        return (B)this;
    }

    void s() {
        this.i.post(new Runnable(this){
            final BaseTransientBottomBar q;
            {
                this.q = baseTransientBottomBar;
            }

            @Override
            public void run() {
                s s8 = this.q.i;
                if (s8 == null) {
                    return;
                }
                if (s8.getParent() != null) {
                    this.q.i.setVisibility(0);
                }
                if (this.q.i.getAnimationMode() == 1) {
                    this.q.d0();
                    return;
                }
                this.q.f0();
            }
        });
    }

    public void x() {
        this.y(3);
    }

    protected void y(int n8) {
        com.google.android.material.snackbar.a.c().b(this.y, n8);
    }

    public static class Behavior
    extends SwipeDismissBehavior<View> {
        private final r l = new r(this);

        private void U(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.l.c(baseTransientBottomBar);
        }

        @Override
        public boolean J(View view) {
            return this.l.a(view);
        }

        @Override
        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    public static abstract class q<B> {
        public void a(B b8, int n8) {
        }

        public void b(B b8) {
        }
    }

    public static class r {
        private a.b a;

        public r(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof s;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int n8 = motionEvent.getActionMasked();
            if (n8 != 0) {
                if (n8 == 1 || n8 == 3) {
                    com.google.android.material.snackbar.a.c().l(this.a);
                    return;
                }
            } else if (coordinatorLayout.B(view, (int)motionEvent.getX(), (int)motionEvent.getY())) {
                com.google.android.material.snackbar.a.c().k(this.a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.y;
        }
    }

    protected static class s
    extends FrameLayout {
        private static final View.OnTouchListener l = new View.OnTouchListener(){

            @SuppressLint(value={"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };
        private BaseTransientBottomBar<?> a;
        l b;
        private int c;
        private final float d;
        private final float e;
        private final int f;
        private final int g;
        private ColorStateList h;
        private PorterDuff.Mode i;
        private Rect j;
        private boolean k;

        protected s(Context context, AttributeSet attributeSet) {
            super(ax.V6.a.d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = this.getContext();
            context = context2.obtainStyledAttributes(attributeSet, ax.k6.m.X4);
            int n8 = ax.k6.m.e5;
            if (context.hasValue(n8)) {
                this.setElevation(context.getDimensionPixelSize(n8, 0));
            }
            this.c = context.getInt(ax.k6.m.a5, 0);
            if (context.hasValue(ax.k6.m.g5) || context.hasValue(ax.k6.m.h5)) {
                this.b = ax.O6.l.e(context2, attributeSet, 0, 0).m();
            }
            this.d = context.getFloat(ax.k6.m.b5, 1.0f);
            this.setBackgroundTintList(ax.K6.c.a(context2, (TypedArray)context, ax.k6.m.c5));
            this.setBackgroundTintMode(ax.F6.z.i(context.getInt(ax.k6.m.d5, -1), PorterDuff.Mode.SRC_IN));
            this.e = context.getFloat(ax.k6.m.Z4, 1.0f);
            this.f = context.getDimensionPixelSize(ax.k6.m.Y4, -1);
            this.g = context.getDimensionPixelSize(ax.k6.m.f5, -1);
            context.recycle();
            this.setOnTouchListener(l);
            this.setFocusable(true);
            if (this.getBackground() == null) {
                this.setBackground(this.d());
            }
        }

        private Drawable d() {
            int n8 = ax.z6.a.l((View)this, ax.k6.c.i, ax.k6.c.f, this.getBackgroundOverlayColorAlpha());
            Object object = this.b;
            object = object != null ? BaseTransientBottomBar.w(n8, (l)object) : BaseTransientBottomBar.v(n8, this.getResources());
            if (this.h != null) {
                object = ax.U.a.r((Drawable)object);
                object.setTintList(this.h);
                return object;
            }
            return ax.U.a.r((Drawable)object);
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.k = true;
            viewGroup.addView((View)this);
            this.k = false;
        }

        float getActionTextColorAlpha() {
            return this.e;
        }

        int getAnimationMode() {
            return this.c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.d;
        }

        int getMaxInlineActionWidth() {
            return this.g;
        }

        int getMaxWidth() {
            return this.f;
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
            this.requestApplyInsets();
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.P();
            }
        }

        protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
            super.onLayout(bl, n8, n9, n10, n11);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
        }

        protected void onMeasure(int n8, int n9) {
            int n10;
            super.onMeasure(n8, n9);
            if (this.f > 0 && (n8 = this.getMeasuredWidth()) > (n10 = this.f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n10, (int)0x40000000), n9);
            }
        }

        void setAnimationMode(int n8) {
            this.c = n8;
        }

        public void setBackground(Drawable drawable) {
            this.setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            Drawable drawable2 = drawable;
            if (drawable != null) {
                drawable2 = drawable;
                if (this.h != null) {
                    drawable2 = ax.U.a.r(drawable.mutate());
                    drawable2.setTintList(this.h);
                    drawable2.setTintMode(this.i);
                }
            }
            super.setBackgroundDrawable(drawable2);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.h = colorStateList;
            if (this.getBackground() != null) {
                Drawable drawable = ax.U.a.r(this.getBackground().mutate());
                drawable.setTintList(colorStateList);
                drawable.setTintMode(this.i);
                if (drawable != this.getBackground()) {
                    super.setBackgroundDrawable(drawable);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.i = mode;
            if (this.getBackground() != null) {
                Drawable drawable = ax.U.a.r(this.getBackground().mutate());
                drawable.setTintMode(mode);
                if (drawable != this.getBackground()) {
                    super.setBackgroundDrawable(drawable);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams object) {
            super.setLayoutParams(object);
            if (!this.k && object instanceof ViewGroup.MarginLayoutParams) {
                this.e((ViewGroup.MarginLayoutParams)object);
                object = this.a;
                if (object != null) {
                    ((BaseTransientBottomBar)object).h0();
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener = onClickListener != null ? null : l;
            this.setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }
    }
}

