/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.b;
import androidx.media3.ui.d;
import androidx.media3.ui.j;
import androidx.media3.ui.k;
import androidx.media3.ui.l;
import androidx.media3.ui.m;
import androidx.media3.ui.n;
import androidx.media3.ui.o;
import androidx.media3.ui.p;
import androidx.media3.ui.q;
import androidx.media3.ui.r;
import androidx.media3.ui.s;
import androidx.media3.ui.t;
import androidx.media3.ui.u;
import androidx.media3.ui.v;
import ax.a2.z;
import java.util.ArrayList;
import java.util.List;

final class w {
    private boolean A;
    private boolean B;
    private boolean C;
    private final d a;
    private final View b;
    private final ViewGroup c;
    private final ViewGroup d;
    private final ViewGroup e;
    private final ViewGroup f;
    private final ViewGroup g;
    private final ViewGroup h;
    private final ViewGroup i;
    private final View j;
    private final View k;
    private final AnimatorSet l;
    private final AnimatorSet m;
    private final AnimatorSet n;
    private final AnimatorSet o;
    private final AnimatorSet p;
    private final ValueAnimator q;
    private final ValueAnimator r;
    private final Runnable s;
    private final Runnable t;
    private final Runnable u;
    private final Runnable v;
    private final Runnable w;
    private final View.OnLayoutChangeListener x;
    private final List<View> y;
    private int z;

    public w(d d8) {
        View view;
        View view2;
        ViewGroup viewGroup;
        this.a = d8;
        this.s = new j(this);
        this.t = new p(this);
        this.u = new q(this);
        this.v = new r(this);
        this.w = new s(this);
        this.x = new t(this);
        this.C = true;
        this.z = 0;
        this.y = new ArrayList<View>();
        this.b = d8.findViewById(ax.a2.z.l);
        this.c = (ViewGroup)d8.findViewById(ax.a2.z.g);
        this.e = (ViewGroup)d8.findViewById(ax.a2.z.w);
        this.d = viewGroup = (ViewGroup)d8.findViewById(ax.a2.z.e);
        this.i = (ViewGroup)d8.findViewById(ax.a2.z.S);
        this.j = view2 = d8.findViewById(ax.a2.z.G);
        this.f = (ViewGroup)d8.findViewById(ax.a2.z.d);
        this.g = (ViewGroup)d8.findViewById(ax.a2.z.o);
        this.h = (ViewGroup)d8.findViewById(ax.a2.z.p);
        this.k = view = d8.findViewById(ax.a2.z.A);
        View view3 = d8.findViewById(ax.a2.z.z);
        if (view != null && view3 != null) {
            view.setOnClickListener((View.OnClickListener)new u(this));
            view3.setOnClickListener((View.OnClickListener)new u(this));
        }
        view3 = ValueAnimator.ofFloat((float[])new float[]{1.0f, 0.0f});
        view3.setInterpolator((TimeInterpolator)new LinearInterpolator());
        view3.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new v(this));
        view3.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final w a;
            {
                this.a = w8;
            }

            public void onAnimationEnd(Animator animator) {
                if (this.a.b != null) {
                    this.a.b.setVisibility(4);
                }
                if (this.a.c != null) {
                    this.a.c.setVisibility(4);
                }
                if (this.a.e != null) {
                    this.a.e.setVisibility(4);
                }
            }

            public void onAnimationStart(Animator animator) {
                if (this.a.j instanceof b && !this.a.A) {
                    ((b)this.a.j).h(250L);
                }
            }
        });
        view = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        view.setInterpolator((TimeInterpolator)new LinearInterpolator());
        view.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new k(this));
        view.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final w a;
            {
                this.a = w8;
            }

            public void onAnimationStart(Animator animator) {
                animator = this.a.b;
                int n8 = 0;
                if (animator != null) {
                    this.a.b.setVisibility(0);
                }
                if (this.a.c != null) {
                    this.a.c.setVisibility(0);
                }
                if (this.a.e != null) {
                    animator = this.a.e;
                    if (!this.a.A) {
                        n8 = 4;
                    }
                    animator.setVisibility(n8);
                }
                if (this.a.j instanceof b && !this.a.A) {
                    ((b)this.a.j).s(250L);
                }
            }
        });
        Resources resources = d8.getResources();
        int n8 = ax.a2.w.b;
        float f8 = resources.getDimension(n8) - resources.getDimension(ax.a2.w.c);
        float f9 = resources.getDimension(n8);
        resources = new AnimatorSet();
        this.l = resources;
        resources.setDuration(250L);
        resources.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, d8){
            final d a;
            final w b;
            {
                this.b = w8;
                this.a = d8;
            }

            public void onAnimationEnd(Animator animator) {
                this.b.V(1);
                if (this.b.B) {
                    this.a.post(this.b.s);
                    androidx.media3.ui.w.u(this.b, false);
                }
            }

            public void onAnimationStart(Animator animator) {
                this.b.V(3);
            }
        });
        resources.play((Animator)view3).with((Animator)androidx.media3.ui.w.J(0.0f, f8, view2)).with((Animator)androidx.media3.ui.w.J(0.0f, f8, (View)viewGroup));
        resources = new AnimatorSet();
        this.m = resources;
        resources.setDuration(250L);
        resources.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, d8){
            final d a;
            final w b;
            {
                this.b = w8;
                this.a = d8;
            }

            public void onAnimationEnd(Animator animator) {
                this.b.V(2);
                if (this.b.B) {
                    this.a.post(this.b.s);
                    androidx.media3.ui.w.u(this.b, false);
                }
            }

            public void onAnimationStart(Animator animator) {
                this.b.V(3);
            }
        });
        resources.play((Animator)androidx.media3.ui.w.J(f8, f9, view2)).with((Animator)androidx.media3.ui.w.J(f8, f9, (View)viewGroup));
        resources = new AnimatorSet();
        this.n = resources;
        resources.setDuration(250L);
        resources.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, d8){
            final d a;
            final w b;
            {
                this.b = w8;
                this.a = d8;
            }

            public void onAnimationEnd(Animator animator) {
                this.b.V(2);
                if (this.b.B) {
                    this.a.post(this.b.s);
                    androidx.media3.ui.w.u(this.b, false);
                }
            }

            public void onAnimationStart(Animator animator) {
                this.b.V(3);
            }
        });
        resources.play((Animator)view3).with((Animator)androidx.media3.ui.w.J(0.0f, f9, view2)).with((Animator)androidx.media3.ui.w.J(0.0f, f9, (View)viewGroup));
        d8 = new AnimatorSet();
        this.o = d8;
        d8.setDuration(250L);
        d8.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final w a;
            {
                this.a = w8;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.V(0);
            }

            public void onAnimationStart(Animator animator) {
                this.a.V(4);
            }
        });
        d8.play((Animator)view).with((Animator)androidx.media3.ui.w.J(f8, 0.0f, view2)).with((Animator)androidx.media3.ui.w.J(f8, 0.0f, (View)viewGroup));
        d8 = new AnimatorSet();
        this.p = d8;
        d8.setDuration(250L);
        d8.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final w a;
            {
                this.a = w8;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.V(0);
            }

            public void onAnimationStart(Animator animator) {
                this.a.V(4);
            }
        });
        d8.play((Animator)view).with((Animator)androidx.media3.ui.w.J(f9, 0.0f, view2)).with((Animator)androidx.media3.ui.w.J(f9, 0.0f, (View)viewGroup));
        d8 = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        this.q = d8;
        d8.setDuration(250L);
        d8.addUpdateListener(new n(this));
        d8.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final w a;
            {
                this.a = w8;
            }

            public void onAnimationEnd(Animator animator) {
                if (this.a.f != null) {
                    this.a.f.setVisibility(4);
                }
            }

            public void onAnimationStart(Animator animator) {
                if (this.a.h != null) {
                    this.a.h.setVisibility(0);
                    this.a.h.setTranslationX((float)this.a.h.getWidth());
                    this.a.h.scrollTo(this.a.h.getWidth(), 0);
                }
            }
        });
        d8 = ValueAnimator.ofFloat((float[])new float[]{1.0f, 0.0f});
        this.r = d8;
        d8.setDuration(250L);
        d8.addUpdateListener(new o(this));
        d8.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final w a;
            {
                this.a = w8;
            }

            public void onAnimationEnd(Animator animator) {
                if (this.a.h != null) {
                    this.a.h.setVisibility(4);
                }
            }

            public void onAnimationStart(Animator animator) {
                if (this.a.f != null) {
                    this.a.f.setVisibility(0);
                }
            }
        });
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int n8 = view.getWidth();
        view = view.getLayoutParams();
        int n9 = n8;
        if (view instanceof ViewGroup.MarginLayoutParams) {
            view = (ViewGroup.MarginLayoutParams)view;
            n9 = n8 + (view.leftMargin + view.rightMargin);
        }
        return n9;
    }

    private void D() {
        this.n.start();
    }

    private void E() {
        this.V(2);
    }

    private void G() {
        this.l.start();
        this.Q(this.u, 2000L);
    }

    private void H() {
        this.m.start();
    }

    private static ObjectAnimator J(float f8, float f9, View view) {
        return ObjectAnimator.ofFloat((Object)view, (String)"translationY", (float[])new float[]{f8, f9});
    }

    private void N(View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        boolean bl = this.a0();
        if (this.A != bl) {
            this.A = bl;
            view.post((Runnable)new l(this));
        }
        n8 = n10 - n8 != n14 - n12 ? 1 : 0;
        if (!this.A && n8 != 0) {
            view.post((Runnable)new m(this));
        }
    }

    private void O() {
        if (this.f != null && this.g != null) {
            int n8;
            Object object;
            int n9;
            int n10 = this.a.getWidth() - this.a.getPaddingLeft() - this.a.getPaddingRight();
            while (true) {
                n9 = this.g.getChildCount();
                int n11 = 0;
                if (n9 <= 1) break;
                n9 = this.g.getChildCount() - 2;
                object = this.g.getChildAt(n9);
                this.g.removeViewAt(n9);
                this.f.addView((View)object, 0);
            }
            object = this.k;
            if (object != null) {
                object.setVisibility(8);
            }
            n9 = androidx.media3.ui.w.B((View)this.i);
            int n12 = this.f.getChildCount() - 1;
            for (n8 = 0; n8 < n12; ++n8) {
                n9 += androidx.media3.ui.w.B(this.f.getChildAt(n8));
            }
            if (n9 > n10) {
                object = this.k;
                n8 = n9;
                if (object != null) {
                    object.setVisibility(0);
                    n8 = n9 + androidx.media3.ui.w.B(this.k);
                }
                object = new ArrayList();
                for (n9 = 0; n9 < n12; ++n9) {
                    View view = this.f.getChildAt(n9);
                    ((ArrayList)object).add(view);
                    if ((n8 -= androidx.media3.ui.w.B(view)) <= n10) break;
                }
                if (!((ArrayList)object).isEmpty()) {
                    this.f.removeViews(0, ((ArrayList)object).size());
                    for (n9 = n11; n9 < ((ArrayList)object).size(); ++n9) {
                        n8 = this.g.getChildCount();
                        this.g.addView((View)((ArrayList)object).get(n9), n8 - 1);
                    }
                }
            } else {
                object = this.h;
                if (object != null && object.getVisibility() == 0 && !this.r.isStarted()) {
                    this.q.cancel();
                    this.r.start();
                }
            }
        }
    }

    private void P(View view) {
        this.S();
        if (view.getId() == ax.a2.z.A) {
            this.q.start();
            return;
        }
        if (view.getId() == ax.a2.z.z) {
            this.r.start();
        }
    }

    private void Q(Runnable runnable2, long l8) {
        if (l8 >= 0L) {
            this.a.postDelayed(runnable2, l8);
        }
    }

    private void V(int n8) {
        int n9 = this.z;
        this.z = n8;
        if (n8 == 2) {
            this.a.setVisibility(8);
        } else if (n9 == 2) {
            this.a.setVisibility(0);
        }
        if (n9 != n8) {
            this.a.o0();
        }
    }

    private boolean W(View view) {
        int n8 = view.getId();
        return n8 == ax.a2.z.e || n8 == ax.a2.z.F || n8 == ax.a2.z.y || n8 == ax.a2.z.J || n8 == ax.a2.z.K || n8 == ax.a2.z.q || n8 == ax.a2.z.r;
        {
        }
    }

    private void Y() {
        if (!this.C) {
            this.V(0);
            this.S();
            return;
        }
        int n8 = this.z;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 == 4) {
                        return;
                    }
                } else {
                    this.B = true;
                }
            } else {
                this.p.start();
            }
        } else {
            this.o.start();
        }
        this.S();
    }

    private void Z() {
        int n8;
        Object object = this.e;
        if (object != null) {
            n8 = this.A ? 0 : 4;
            object.setVisibility(n8);
        }
        if (this.j != null) {
            n8 = this.a.getResources().getDimensionPixelSize(ax.a2.w.d);
            object = (ViewGroup.MarginLayoutParams)this.j.getLayoutParams();
            if (object != null) {
                if (this.A) {
                    n8 = 0;
                }
                ((ViewGroup.MarginLayoutParams)object).bottomMargin = n8;
                this.j.setLayoutParams((ViewGroup.LayoutParams)object);
            }
            if ((object = this.j) instanceof b) {
                object = (b)object;
                if (this.A) {
                    ((b)object).i(true);
                } else {
                    n8 = this.z;
                    if (n8 == 1) {
                        ((b)object).i(false);
                    } else if (n8 != 3) {
                        ((b)object).r();
                    }
                }
            }
        }
        for (View view : this.y) {
            n8 = this.A && this.W(view) ? 4 : 0;
            view.setVisibility(n8);
        }
    }

    public static /* synthetic */ void a(w w8, ValueAnimator valueAnimator) {
        w8.getClass();
        w8.y(((Float)valueAnimator.getAnimatedValue()).floatValue());
    }

    private boolean a0() {
        int n8 = this.a.getWidth();
        int n9 = this.a.getPaddingLeft();
        int n10 = this.a.getPaddingRight();
        int n11 = this.a.getHeight();
        int n12 = this.a.getPaddingBottom();
        int n13 = this.a.getPaddingTop();
        int n14 = androidx.media3.ui.w.B((View)this.c);
        ViewGroup viewGroup = this.c;
        int n15 = viewGroup != null ? viewGroup.getPaddingLeft() + this.c.getPaddingRight() : 0;
        int n16 = androidx.media3.ui.w.z((View)this.c);
        viewGroup = this.c;
        int n17 = viewGroup != null ? viewGroup.getPaddingTop() + this.c.getPaddingBottom() : 0;
        n15 = Math.max(n14 - n15, androidx.media3.ui.w.B((View)this.i) + androidx.media3.ui.w.B(this.k));
        n14 = androidx.media3.ui.w.z((View)this.d);
        return n8 - n9 - n10 <= n15 || n11 - n12 - n13 <= n16 - n17 + n14 * 2;
        {
        }
    }

    public static /* synthetic */ void b(w w8) {
        w8.Z();
    }

    public static /* synthetic */ void c(w w8) {
        w8.Y();
    }

    public static /* synthetic */ void d(w w8, ValueAnimator valueAnimator) {
        w8.getClass();
        float f8 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator = w8.b;
        if (valueAnimator != null) {
            valueAnimator.setAlpha(f8);
        }
        if ((valueAnimator = w8.c) != null) {
            valueAnimator.setAlpha(f8);
        }
        if ((w8 = w8.e) != null) {
            w8.setAlpha(f8);
        }
    }

    public static /* synthetic */ void e(w w8) {
        w8.H();
    }

    public static /* synthetic */ void f(w w8, ValueAnimator valueAnimator) {
        w8.getClass();
        float f8 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator = w8.b;
        if (valueAnimator != null) {
            valueAnimator.setAlpha(f8);
        }
        if ((valueAnimator = w8.c) != null) {
            valueAnimator.setAlpha(f8);
        }
        if ((w8 = w8.e) != null) {
            w8.setAlpha(f8);
        }
    }

    public static /* synthetic */ void g(w w8) {
        w8.G();
    }

    public static /* synthetic */ void h(w w8) {
        w8.E();
    }

    public static /* synthetic */ void i(w w8) {
        w8.O();
    }

    public static /* synthetic */ void j(w w8) {
        w8.D();
    }

    public static /* synthetic */ void k(w w8, View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        w8.N(view, n8, n9, n10, n11, n12, n13, n14, n15);
    }

    public static /* synthetic */ void l(w w8, ValueAnimator valueAnimator) {
        w8.getClass();
        w8.y(((Float)valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void m(w w8, View view) {
        w8.P(view);
    }

    static /* synthetic */ boolean u(w w8, boolean bl) {
        w8.B = bl;
        return bl;
    }

    private void y(float f8) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            int n8 = (int)((float)viewGroup.getWidth() * (1.0f - f8));
            this.h.setTranslationX((float)n8);
        }
        if ((viewGroup = this.i) != null) {
            viewGroup.setAlpha(1.0f - f8);
        }
        if ((viewGroup = this.f) != null) {
            viewGroup.setAlpha(1.0f - f8);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int n8 = view.getHeight();
        view = view.getLayoutParams();
        int n9 = n8;
        if (view instanceof ViewGroup.MarginLayoutParams) {
            view = (ViewGroup.MarginLayoutParams)view;
            n9 = n8 + (view.topMargin + view.bottomMargin);
        }
        return n9;
    }

    public boolean A(View view) {
        return view != null && this.y.contains(view);
    }

    public void C() {
        int n8 = this.z;
        if (n8 != 3 && n8 != 2) {
            this.R();
            if (!this.C) {
                this.E();
                return;
            }
            if (this.z == 1) {
                this.H();
                return;
            }
            this.D();
        }
    }

    public void F() {
        int n8 = this.z;
        if (n8 != 3 && n8 != 2) {
            this.R();
            this.E();
        }
    }

    public boolean I() {
        return this.z == 0 && this.a.n0();
    }

    public void K() {
        this.a.addOnLayoutChangeListener(this.x);
    }

    public void L() {
        this.a.removeOnLayoutChangeListener(this.x);
    }

    public void M(boolean bl, int n8, int n9, int n10, int n11) {
        View view = this.b;
        if (view != null) {
            view.layout(0, 0, n10 - n8, n11 - n9);
        }
    }

    public void R() {
        this.a.removeCallbacks(this.w);
        this.a.removeCallbacks(this.t);
        this.a.removeCallbacks(this.v);
        this.a.removeCallbacks(this.u);
    }

    public void S() {
        if (this.z != 3) {
            this.R();
            int n8 = this.a.getShowTimeoutMs();
            if (n8 > 0) {
                if (!this.C) {
                    this.Q(this.w, n8);
                    return;
                }
                if (this.z == 1) {
                    this.Q(this.u, 2000L);
                    return;
                }
                this.Q(this.v, n8);
            }
        }
    }

    public void T(boolean bl) {
        this.C = bl;
    }

    public void U(View view, boolean bl) {
        if (view == null) {
            return;
        }
        if (!bl) {
            view.setVisibility(8);
            this.y.remove(view);
            return;
        }
        if (this.A && this.W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.y.add(view);
    }

    public void X() {
        if (!this.a.n0()) {
            this.a.setVisibility(0);
            this.a.w0();
            this.a.t0();
        }
        this.Y();
    }
}

