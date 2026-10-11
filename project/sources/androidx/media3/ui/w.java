package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import ax.a2.C1339w;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class w {
    private boolean A;
    private boolean B;
    private final C0641d a;
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
    private final Runnable s = new Runnable() { // from class: androidx.media3.ui.j
        @Override // java.lang.Runnable
        public final void run() {
            w.this.Y();
        }
    };
    private final Runnable t = new Runnable() { // from class: androidx.media3.ui.p
        @Override // java.lang.Runnable
        public final void run() {
            w.this.D();
        }
    };
    private final Runnable u = new Runnable() { // from class: androidx.media3.ui.q
        @Override // java.lang.Runnable
        public final void run() {
            w.this.H();
        }
    };
    private final Runnable v = new Runnable() { // from class: androidx.media3.ui.r
        @Override // java.lang.Runnable
        public final void run() {
            w.this.G();
        }
    };
    private final Runnable w = new Runnable() { // from class: androidx.media3.ui.s
        @Override // java.lang.Runnable
        public final void run() {
            w.this.E();
        }
    };
    private final View.OnLayoutChangeListener x = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.t
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            w.this.N(view, i2, i3, i4, i5, i6, i7, i8, i9);
        }
    };
    private boolean C = true;
    private int z = 0;
    private final List<View> y = new ArrayList();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.b != null) {
                w.this.b.setVisibility(4);
            }
            if (w.this.c != null) {
                w.this.c.setVisibility(4);
            }
            if (w.this.e != null) {
                w.this.e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(w.this.j instanceof C0639b) || w.this.A) {
                return;
            }
            ((C0639b) w.this.j).h(250L);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.b != null) {
                w.this.b.setVisibility(0);
            }
            if (w.this.c != null) {
                w.this.c.setVisibility(0);
            }
            if (w.this.e != null) {
                w.this.e.setVisibility(w.this.A ? 0 : 4);
            }
            if (!(w.this.j instanceof C0639b) || w.this.A) {
                return;
            }
            ((C0639b) w.this.j).s(250L);
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ C0641d a;

        c(C0641d c0641d) {
            this.a = c0641d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(1);
            if (w.this.B) {
                this.a.post(w.this.s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ C0641d a;

        d(C0641d c0641d) {
            this.a = c0641d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(2);
            if (w.this.B) {
                this.a.post(w.this.s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    class e extends AnimatorListenerAdapter {
        final /* synthetic */ C0641d a;

        e(C0641d c0641d) {
            this.a = c0641d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(2);
            if (w.this.B) {
                this.a.post(w.this.s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(4);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(4);
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f != null) {
                w.this.f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.h != null) {
                w.this.h.setVisibility(0);
                w.this.h.setTranslationX(w.this.h.getWidth());
                w.this.h.scrollTo(w.this.h.getWidth(), 0);
            }
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.h != null) {
                w.this.h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f != null) {
                w.this.f.setVisibility(0);
            }
        }
    }

    public w(C0641d c0641d) {
        this.a = c0641d;
        this.b = c0641d.findViewById(ax.a2.z.l);
        this.c = (ViewGroup) c0641d.findViewById(ax.a2.z.g);
        this.e = (ViewGroup) c0641d.findViewById(ax.a2.z.w);
        ViewGroup viewGroup = (ViewGroup) c0641d.findViewById(ax.a2.z.e);
        this.d = viewGroup;
        this.i = (ViewGroup) c0641d.findViewById(ax.a2.z.S);
        View findViewById = c0641d.findViewById(ax.a2.z.G);
        this.j = findViewById;
        this.f = (ViewGroup) c0641d.findViewById(ax.a2.z.d);
        this.g = (ViewGroup) c0641d.findViewById(ax.a2.z.o);
        this.h = (ViewGroup) c0641d.findViewById(ax.a2.z.p);
        View findViewById2 = c0641d.findViewById(ax.a2.z.A);
        this.k = findViewById2;
        View findViewById3 = c0641d.findViewById(ax.a2.z.z);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w.this.P(view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w.this.P(view);
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.d(w.this, valueAnimator);
            }
        });
        ofFloat.addListener(new a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.f(w.this, valueAnimator);
            }
        });
        ofFloat2.addListener(new b());
        Resources resources = c0641d.getResources();
        int i2 = C1339w.b;
        float dimension = resources.getDimension(i2) - resources.getDimension(C1339w.c);
        float dimension2 = resources.getDimension(i2);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(c0641d));
        animatorSet.play(ofFloat).with(J(0.0f, dimension, findViewById)).with(J(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(c0641d));
        animatorSet2.play(J(dimension, dimension2, findViewById)).with(J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(c0641d));
        animatorSet3.play(ofFloat).with(J(0.0f, dimension2, findViewById)).with(J(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(ofFloat2).with(J(dimension, 0.0f, findViewById)).with(J(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(ofFloat2).with(J(dimension2, 0.0f, findViewById)).with(J(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.a(w.this, valueAnimator);
            }
        });
        ofFloat3.addListener(new h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.l(w.this, valueAnimator);
            }
        });
        ofFloat4.addListener(new i());
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        V(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.l.start();
        Q(this.u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.m.start();
    }

    private static ObjectAnimator J(float f2, float f3, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean a0 = a0();
        if (this.A != a0) {
            this.A = a0;
            view.post(new Runnable() { // from class: androidx.media3.ui.l
                @Override // java.lang.Runnable
                public final void run() {
                    w.this.Z();
                }
            });
        }
        boolean z = i4 - i2 != i8 - i6;
        if (this.A || !z) {
            return;
        }
        view.post(new Runnable() { // from class: androidx.media3.ui.m
            @Override // java.lang.Runnable
            public final void run() {
                w.this.O();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        int i2;
        if (this.f == null || this.g == null) {
            return;
        }
        int width = (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        while (true) {
            if (this.g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.g.getChildCount() - 2;
            View childAt = this.g.getChildAt(childCount);
            this.g.removeViewAt(childCount);
            this.f.addView(childAt, 0);
        }
        View view = this.k;
        if (view != null) {
            view.setVisibility(8);
        }
        int B = B(this.i);
        int childCount2 = this.f.getChildCount() - 1;
        for (int i3 = 0; i3 < childCount2; i3++) {
            B += B(this.f.getChildAt(i3));
        }
        if (B <= width) {
            ViewGroup viewGroup = this.h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.r.isStarted()) {
                return;
            }
            this.q.cancel();
            this.r.start();
            return;
        }
        View view2 = this.k;
        if (view2 != null) {
            view2.setVisibility(0);
            B += B(this.k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = this.f.getChildAt(i4);
            B -= B(childAt2);
            arrayList.add(childAt2);
            if (B <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f.removeViews(0, arrayList.size());
        for (i2 = 0; i2 < arrayList.size(); i2++) {
            this.g.addView((View) arrayList.get(i2), this.g.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(View view) {
        S();
        if (view.getId() == ax.a2.z.A) {
            this.q.start();
        } else if (view.getId() == ax.a2.z.z) {
            this.r.start();
        }
    }

    private void Q(Runnable runnable, long j) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i2) {
        int i3 = this.z;
        this.z = i2;
        if (i2 == 2) {
            this.a.setVisibility(8);
        } else if (i3 == 2) {
            this.a.setVisibility(0);
        }
        if (i3 != i2) {
            this.a.o0();
        }
    }

    private boolean W(View view) {
        int id = view.getId();
        return id == ax.a2.z.e || id == ax.a2.z.F || id == ax.a2.z.y || id == ax.a2.z.J || id == ax.a2.z.K || id == ax.a2.z.q || id == ax.a2.z.r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (!this.C) {
            V(0);
            S();
            return;
        }
        int i2 = this.z;
        if (i2 == 1) {
            this.o.start();
        } else if (i2 == 2) {
            this.p.start();
        } else if (i2 == 3) {
            this.B = true;
        } else if (i2 == 4) {
            return;
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        if (this.j != null) {
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(C1339w.d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.j.setLayoutParams(marginLayoutParams);
            }
            View view = this.j;
            if (view instanceof C0639b) {
                C0639b c0639b = (C0639b) view;
                if (this.A) {
                    c0639b.i(true);
                } else {
                    int i2 = this.z;
                    if (i2 == 1) {
                        c0639b.i(false);
                    } else if (i2 != 3) {
                        c0639b.r();
                    }
                }
            }
        }
        for (View view2 : this.y) {
            view2.setVisibility((this.A && W(view2)) ? 4 : 0);
        }
    }

    public static /* synthetic */ void a(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        wVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private boolean a0() {
        int width = (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        int height = (this.a.getHeight() - this.a.getPaddingBottom()) - this.a.getPaddingTop();
        int B = B(this.c);
        ViewGroup viewGroup = this.c;
        int paddingLeft = B - (viewGroup != null ? viewGroup.getPaddingLeft() + this.c.getPaddingRight() : 0);
        int z = z(this.c);
        ViewGroup viewGroup2 = this.c;
        return width <= Math.max(paddingLeft, B(this.i) + B(this.k)) || height <= (z - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.c.getPaddingBottom() : 0)) + (z(this.d) * 2);
    }

    public static /* synthetic */ void d(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = wVar.b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = wVar.c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = wVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    public static /* synthetic */ void f(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = wVar.b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = wVar.c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = wVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    public static /* synthetic */ void l(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        wVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void y(float f2) {
        if (this.h != null) {
            this.h.setTranslationX((int) (r0.getWidth() * (1.0f - f2)));
        }
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f2);
        }
        ViewGroup viewGroup2 = this.f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f2);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.y.contains(view);
    }

    public void C() {
        int i2 = this.z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        R();
        if (!this.C) {
            E();
        } else if (this.z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i2 = this.z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        R();
        E();
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

    public void M(boolean z, int i2, int i3, int i4, int i5) {
        View view = this.b;
        if (view != null) {
            view.layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public void R() {
        this.a.removeCallbacks(this.w);
        this.a.removeCallbacks(this.t);
        this.a.removeCallbacks(this.v);
        this.a.removeCallbacks(this.u);
    }

    public void S() {
        if (this.z == 3) {
            return;
        }
        R();
        int showTimeoutMs = this.a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                Q(this.w, showTimeoutMs);
            } else if (this.z == 1) {
                Q(this.u, 2000L);
            } else {
                Q(this.v, showTimeoutMs);
            }
        }
    }

    public void T(boolean z) {
        this.C = z;
    }

    public void U(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.y.remove(view);
            return;
        }
        if (this.A && W(view)) {
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
        Y();
    }
}
