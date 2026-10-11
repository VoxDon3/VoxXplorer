package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import ax.H6.i;
import ax.O6.h;
import ax.O6.l;
import ax.O6.o;
import ax.b0.C1446g;
import ax.k6.C2402c;
import ax.k6.C2407h;
import ax.l6.C2472a;
import ax.l6.g;
import java.util.ArrayList;

/* loaded from: classes3.dex */
class b {
    static final TimeInterpolator B = C2472a.c;
    private static final int C = C2402c.D;
    private static final int D = C2402c.M;
    private static final int E = C2402c.E;
    private static final int F = C2402c.K;
    static final int[] G = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] H = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] I = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] J = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] K = {R.attr.state_enabled};
    static final int[] L = new int[0];
    private ViewTreeObserver.OnPreDrawListener A;
    l a;
    h b;
    Drawable c;
    Drawable d;
    boolean e;
    float g;
    float h;
    float i;
    int j;
    private StateListAnimator k;
    private Animator l;
    private ax.l6.h m;
    private ax.l6.h n;
    private int p;
    private ArrayList<Animator.AnimatorListener> r;
    private ArrayList<Animator.AnimatorListener> s;
    private ArrayList<e> t;
    final FloatingActionButton u;
    final ax.N6.b v;
    boolean f = true;
    private float o = 1.0f;
    private int q = 0;
    private final Rect w = new Rect();
    private final RectF x = new RectF();
    private final RectF y = new RectF();
    private final Matrix z = new Matrix();

    class a extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ f c;

        a(boolean z, f fVar) {
            this.b = z;
            this.c = fVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.q = 0;
            b.this.l = null;
            if (this.a) {
                return;
            }
            FloatingActionButton floatingActionButton = b.this.u;
            boolean z = this.b;
            floatingActionButton.b(z ? 8 : 4, z);
            f fVar = this.c;
            if (fVar != null) {
                fVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.u.b(0, this.b);
            b.this.q = 1;
            b.this.l = animator;
            this.a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    class C0555b extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ f b;

        C0555b(boolean z, f fVar) {
            this.a = z;
            this.b = fVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.q = 0;
            b.this.l = null;
            f fVar = this.b;
            if (fVar != null) {
                fVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.u.b(0, this.a);
            b.this.q = 2;
            b.this.l = animator;
        }
    }

    class c extends g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            b.this.o = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    class d implements TypeEvaluator<Float> {
        final FloatEvaluator a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    interface e {
        void a();

        void b();
    }

    interface f {
        void a();

        void b();
    }

    b(FloatingActionButton floatingActionButton, ax.N6.b bVar) {
        this.u = floatingActionButton;
        this.v = bVar;
    }

    private boolean W() {
        return this.u.isLaidOut() && !this.u.isInEditMode();
    }

    public static /* synthetic */ void a(b bVar, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Matrix matrix, ValueAnimator valueAnimator) {
        bVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.u.setAlpha(C2472a.b(f2, f3, 0.0f, 0.2f, floatValue));
        bVar.u.setScaleX(C2472a.a(f4, f5, floatValue));
        bVar.u.setScaleY(C2472a.a(f6, f5, floatValue));
        bVar.o = C2472a.a(f7, f8, floatValue);
        bVar.h(C2472a.a(f7, f8, floatValue), matrix);
        bVar.u.setImageMatrix(matrix);
    }

    private void b0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    private void h(float f2, Matrix matrix) {
        matrix.reset();
        if (this.u.getDrawable() == null || this.p == 0) {
            return;
        }
        RectF rectF = this.x;
        RectF rectF2 = this.y;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i = this.p;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.p;
        matrix.postScale(f2, f2, i2 / 2.0f, i2 / 2.0f);
    }

    private AnimatorSet i(ax.l6.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.u, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.u, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        hVar.e("scale").a(ofFloat2);
        b0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.u, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        hVar.e("scale").a(ofFloat3);
        b0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f4, this.z);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.u, new ax.l6.f(), new c(), new Matrix(this.z));
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        ax.l6.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(final float f2, final float f3, final float f4, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.u.getAlpha();
        final float scaleX = this.u.getScaleX();
        final float scaleY = this.u.getScaleY();
        final float f5 = this.o;
        final Matrix matrix = new Matrix(this.z);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b.a(b.this, alpha, f2, scaleX, f3, scaleY, f5, f4, matrix, valueAnimator);
            }
        });
        arrayList.add(ofFloat);
        ax.l6.b.a(animatorSet, arrayList);
        animatorSet.setDuration(i.f(this.u.getContext(), i, this.u.getContext().getResources().getInteger(C2407h.b)));
        animatorSet.setInterpolator(i.g(this.u.getContext(), i2, C2472a.b));
        return animatorSet;
    }

    private StateListAnimator k(float f2, float f3, float f4) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(G, l(f2, f4));
        stateListAnimator.addState(H, l(f2, f3));
        stateListAnimator.addState(I, l(f2, f3));
        stateListAnimator.addState(J, l(f2, f3));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.u, "elevation", f2).setDuration(0L));
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 24) {
            FloatingActionButton floatingActionButton = this.u;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.u, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(B);
        stateListAnimator.addState(K, animatorSet);
        stateListAnimator.addState(L, l(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator l(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.u, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.u, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(B);
        return animatorSet;
    }

    void A() {
        h hVar = this.b;
        if (hVar != null) {
            ax.O6.i.f(this.u, hVar);
        }
    }

    void B() {
        Z();
    }

    void C() {
        ViewTreeObserver viewTreeObserver = this.u.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.A;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.A = null;
        }
    }

    void D() {
        if (!this.u.isEnabled()) {
            this.u.setElevation(0.0f);
            this.u.setTranslationZ(0.0f);
            return;
        }
        this.u.setElevation(this.g);
        if (this.u.isPressed()) {
            this.u.setTranslationZ(this.i);
        } else if (this.u.isFocused() || this.u.isHovered()) {
            this.u.setTranslationZ(this.h);
        } else {
            this.u.setTranslationZ(0.0f);
        }
    }

    void E(float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT == 21) {
            this.u.refreshDrawableState();
        } else if (this.u.getStateListAnimator() == this.k) {
            StateListAnimator k = k(f2, f3, f4);
            this.k = k;
            this.u.setStateListAnimator(k);
        }
        if (V()) {
            Z();
        }
    }

    void F(Rect rect) {
        C1446g.h(this.d, "Didn't initialize content background");
        if (!V()) {
            this.v.a(this.d);
        } else {
            this.v.a(new InsetDrawable(this.d, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void G() {
        ArrayList<e> arrayList = this.t;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                e eVar = arrayList.get(i);
                i++;
                eVar.a();
            }
        }
    }

    void H() {
        ArrayList<e> arrayList = this.t;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                e eVar = arrayList.get(i);
                i++;
                eVar.b();
            }
        }
    }

    void I(ColorStateList colorStateList) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.setTintList(colorStateList);
        }
    }

    void J(PorterDuff.Mode mode) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.setTintMode(mode);
        }
    }

    final void K(float f2) {
        if (this.g != f2) {
            this.g = f2;
            E(f2, this.h, this.i);
        }
    }

    void L(boolean z) {
        this.e = z;
    }

    final void M(ax.l6.h hVar) {
        this.n = hVar;
    }

    final void N(float f2) {
        if (this.h != f2) {
            this.h = f2;
            E(this.g, f2, this.i);
        }
    }

    final void O(float f2) {
        this.o = f2;
        Matrix matrix = this.z;
        h(f2, matrix);
        this.u.setImageMatrix(matrix);
    }

    final void P(int i) {
        if (this.p != i) {
            this.p = i;
            Y();
        }
    }

    final void Q(float f2) {
        if (this.i != f2) {
            this.i = f2;
            E(this.g, this.h, f2);
        }
    }

    void R(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ax.L6.a.e(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(ax.L6.a.e(colorStateList));
        }
    }

    void S(boolean z) {
        this.f = z;
        Z();
    }

    final void T(l lVar) {
        this.a = lVar;
        h hVar = this.b;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
        Object obj = this.c;
        if (obj instanceof o) {
            ((o) obj).setShapeAppearanceModel(lVar);
        }
    }

    final void U(ax.l6.h hVar) {
        this.m = hVar;
    }

    boolean V() {
        return this.v.c() || x();
    }

    void X(f fVar, boolean z) {
        b bVar;
        AnimatorSet j;
        if (z()) {
            return;
        }
        Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
        int i = 0;
        boolean z2 = this.m == null;
        if (!W()) {
            this.u.b(0, z);
            this.u.setAlpha(1.0f);
            this.u.setScaleY(1.0f);
            this.u.setScaleX(1.0f);
            O(1.0f);
            if (fVar != null) {
                fVar.a();
                return;
            }
            return;
        }
        if (this.u.getVisibility() != 0) {
            this.u.setAlpha(0.0f);
            this.u.setScaleY(z2 ? 0.4f : 0.0f);
            this.u.setScaleX(z2 ? 0.4f : 0.0f);
            O(z2 ? 0.4f : 0.0f);
        }
        ax.l6.h hVar = this.m;
        if (hVar != null) {
            j = i(hVar, 1.0f, 1.0f, 1.0f);
            bVar = this;
        } else {
            bVar = this;
            j = bVar.j(1.0f, 1.0f, 1.0f, C, D);
        }
        j.addListener(new C0555b(z, fVar));
        ArrayList<Animator.AnimatorListener> arrayList = bVar.r;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i < size) {
                Animator.AnimatorListener animatorListener = arrayList.get(i);
                i++;
                j.addListener(animatorListener);
            }
        }
        j.start();
    }

    final void Y() {
        O(this.o);
    }

    final void Z() {
        Rect rect = this.w;
        r(rect);
        F(rect);
        this.v.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    void a0(float f2) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.f0(f2);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(animatorListener);
    }

    void f(Animator.AnimatorListener animatorListener) {
        if (this.r == null) {
            this.r = new ArrayList<>();
        }
        this.r.add(animatorListener);
    }

    void g(e eVar) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(eVar);
    }

    final Drawable m() {
        return this.d;
    }

    float n() {
        return this.u.getElevation();
    }

    boolean o() {
        return this.e;
    }

    final ax.l6.h p() {
        return this.n;
    }

    float q() {
        return this.h;
    }

    void r(Rect rect) {
        if (this.v.c()) {
            int v = v();
            int max = Math.max(v, (int) Math.ceil(this.f ? n() + this.i : 0.0f));
            int max2 = Math.max(v, (int) Math.ceil(r1 * 1.5f));
            rect.set(max, max2, max, max2);
            return;
        }
        if (!x()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.j - this.u.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    float s() {
        return this.i;
    }

    final l t() {
        return this.a;
    }

    final ax.l6.h u() {
        return this.m;
    }

    int v() {
        if (this.e) {
            return Math.max((this.j - this.u.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void w(f fVar, boolean z) {
        b bVar;
        AnimatorSet j;
        if (y()) {
            return;
        }
        Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
        if (!W()) {
            this.u.b(z ? 8 : 4, z);
            if (fVar != null) {
                fVar.b();
                return;
            }
            return;
        }
        ax.l6.h hVar = this.n;
        if (hVar != null) {
            j = i(hVar, 0.0f, 0.0f, 0.0f);
            bVar = this;
        } else {
            bVar = this;
            j = bVar.j(0.0f, 0.4f, 0.4f, E, F);
        }
        j.addListener(new a(z, fVar));
        ArrayList<Animator.AnimatorListener> arrayList = bVar.s;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Animator.AnimatorListener animatorListener = arrayList.get(i);
                i++;
                j.addListener(animatorListener);
            }
        }
        j.start();
    }

    final boolean x() {
        return this.e && this.u.getSizeDimension() < this.j;
    }

    boolean y() {
        return this.u.getVisibility() == 0 ? this.q == 1 : this.q != 2;
    }

    boolean z() {
        return this.u.getVisibility() != 0 ? this.q == 2 : this.q != 1;
    }
}
