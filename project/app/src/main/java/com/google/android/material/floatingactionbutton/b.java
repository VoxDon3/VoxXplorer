/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.floatingactionbutton;

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
import ax.F6.A;
import ax.O6.i;
import ax.O6.l;
import ax.O6.o;
import ax.k6.c;
import ax.l6.g;
import ax.l6.h;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.a;
import java.util.ArrayList;

class b {
    static final TimeInterpolator B = ax.l6.a.c;
    private static final int C = ax.k6.c.D;
    private static final int D = ax.k6.c.M;
    private static final int E = ax.k6.c.E;
    private static final int F = ax.k6.c.K;
    static final int[] G = new int[]{16842919, 16842910};
    static final int[] H = new int[]{16843623, 16842908, 16842910};
    static final int[] I = new int[]{16842908, 16842910};
    static final int[] J = new int[]{16843623, 16842910};
    static final int[] K = new int[]{16842910};
    static final int[] L = new int[0];
    private ViewTreeObserver.OnPreDrawListener A;
    l a;
    ax.O6.h b;
    Drawable c;
    Drawable d;
    boolean e;
    boolean f = true;
    float g;
    float h;
    float i;
    int j;
    private StateListAnimator k;
    private Animator l;
    private h m;
    private h n;
    private float o = 1.0f;
    private int p;
    private int q = 0;
    private ArrayList<Animator.AnimatorListener> r;
    private ArrayList<Animator.AnimatorListener> s;
    private ArrayList<e> t;
    final FloatingActionButton u;
    final ax.N6.b v;
    private final Rect w = new Rect();
    private final RectF x = new RectF();
    private final RectF y = new RectF();
    private final Matrix z = new Matrix();

    b(FloatingActionButton floatingActionButton, ax.N6.b b8) {
        this.u = floatingActionButton;
        this.v = b8;
    }

    private boolean W() {
        return this.u.isLaidOut() && !this.u.isInEditMode();
    }

    public static /* synthetic */ void a(b b8, float f8, float f9, float f10, float f11, float f12, float f13, float f14, Matrix matrix, ValueAnimator valueAnimator) {
        b8.getClass();
        float f15 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        b8.u.setAlpha(ax.l6.a.b(f8, f9, 0.0f, 0.2f, f15));
        b8.u.setScaleX(ax.l6.a.a(f10, f11, f15));
        b8.u.setScaleY(ax.l6.a.a(f12, f11, f15));
        b8.o = ax.l6.a.a(f13, f14, f15);
        b8.h(ax.l6.a.a(f13, f14, f15), matrix);
        b8.u.setImageMatrix(matrix);
    }

    static /* synthetic */ int b(b b8, int n8) {
        b8.q = n8;
        return n8;
    }

    private void b0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator((TypeEvaluator)new TypeEvaluator<Float>(this){
            final FloatEvaluator a;
            final b b;
            {
                this.b = b8;
                this.a = new FloatEvaluator();
            }

            public Float a(float f8, Float f9, Float f10) {
                float f11;
                f8 = f11 = this.a.evaluate(f8, (Number)f9, (Number)f10).floatValue();
                if (f11 < 0.1f) {
                    f8 = 0.0f;
                }
                return Float.valueOf(f8);
            }
        });
    }

    static /* synthetic */ Animator c(b b8, Animator animator) {
        b8.l = animator;
        return animator;
    }

    static /* synthetic */ float d(b b8, float f8) {
        b8.o = f8;
        return f8;
    }

    private void h(float f8, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.u.getDrawable();
        if (drawable != null && this.p != 0) {
            RectF rectF = this.x;
            RectF rectF2 = this.y;
            rectF.set(0.0f, 0.0f, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
            int n8 = this.p;
            rectF2.set(0.0f, 0.0f, (float)n8, (float)n8);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            n8 = this.p;
            matrix.postScale(f8, f8, (float)n8 / 2.0f, (float)n8 / 2.0f);
        }
    }

    private AnimatorSet i(h h8, float f8, float f9, float f10) {
        ArrayList<Animator> arrayList = new ArrayList<Animator>();
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)this.u, (Property)View.ALPHA, (float[])new float[]{f8});
        h8.e("opacity").a((Animator)objectAnimator);
        arrayList.add((Animator)objectAnimator);
        objectAnimator = ObjectAnimator.ofFloat((Object)this.u, (Property)View.SCALE_X, (float[])new float[]{f9});
        h8.e("scale").a((Animator)objectAnimator);
        this.b0(objectAnimator);
        arrayList.add((Animator)objectAnimator);
        objectAnimator = ObjectAnimator.ofFloat((Object)this.u, (Property)View.SCALE_Y, (float[])new float[]{f9});
        h8.e("scale").a((Animator)objectAnimator);
        this.b0(objectAnimator);
        arrayList.add((Animator)objectAnimator);
        this.h(f10, this.z);
        objectAnimator = ObjectAnimator.ofObject((Object)this.u, (Property)new ax.l6.f(), (TypeEvaluator)new g(this){
            final b d;
            {
                this.d = b8;
            }

            @Override
            public Matrix a(float f8, Matrix matrix, Matrix matrix2) {
                com.google.android.material.floatingactionbutton.b.d(this.d, f8);
                return super.a(f8, matrix, matrix2);
            }
        }, (Object[])new Matrix[]{new Matrix(this.z)});
        h8.e("iconScale").a((Animator)objectAnimator);
        arrayList.add((Animator)objectAnimator);
        h8 = new AnimatorSet();
        ax.l6.b.a((AnimatorSet)h8, arrayList);
        return h8;
    }

    private AnimatorSet j(float f8, float f9, float f10, int n8, int n9) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList<Animator> arrayList = new ArrayList<Animator>();
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new a(this, this.u.getAlpha(), f8, this.u.getScaleX(), f9, this.u.getScaleY(), this.o, f10, new Matrix(this.z)));
        arrayList.add((Animator)valueAnimator);
        ax.l6.b.a(animatorSet, arrayList);
        animatorSet.setDuration((long)ax.H6.i.f(this.u.getContext(), n8, this.u.getContext().getResources().getInteger(ax.k6.h.b)));
        animatorSet.setInterpolator(ax.H6.i.g(this.u.getContext(), n9, ax.l6.a.b));
        return animatorSet;
    }

    private StateListAnimator k(float f8, float f9, float f10) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(G, this.l(f8, f10));
        stateListAnimator.addState(H, this.l(f8, f9));
        stateListAnimator.addState(I, this.l(f8, f9));
        stateListAnimator.addState(J, this.l(f8, f9));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList<ObjectAnimator> arrayList = new ArrayList<ObjectAnimator>();
        arrayList.add(ObjectAnimator.ofFloat((Object)this.u, (String)"elevation", (float[])new float[]{f8}).setDuration(0L));
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 22 && n8 <= 24) {
            FloatingActionButton floatingActionButton = this.u;
            arrayList.add(ObjectAnimator.ofFloat((Object)floatingActionButton, (Property)View.TRANSLATION_Z, (float[])new float[]{floatingActionButton.getTranslationZ()}).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat((Object)this.u, (Property)View.TRANSLATION_Z, (float[])new float[]{0.0f}).setDuration(100L));
        animatorSet.playSequentially(arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(B);
        stateListAnimator.addState(K, (Animator)animatorSet);
        stateListAnimator.addState(L, this.l(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator l(float f8, float f9) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play((Animator)ObjectAnimator.ofFloat((Object)this.u, (String)"elevation", (float[])new float[]{f8}).setDuration(0L)).with((Animator)ObjectAnimator.ofFloat((Object)this.u, (Property)View.TRANSLATION_Z, (float[])new float[]{f9}).setDuration(100L));
        animatorSet.setInterpolator(B);
        return animatorSet;
    }

    void A() {
        ax.O6.h h8 = this.b;
        if (h8 != null) {
            ax.O6.i.f((View)this.u, h8);
        }
    }

    void B() {
        this.Z();
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
        if (this.u.isEnabled()) {
            this.u.setElevation(this.g);
            if (this.u.isPressed()) {
                this.u.setTranslationZ(this.i);
                return;
            }
            if (!this.u.isFocused() && !this.u.isHovered()) {
                this.u.setTranslationZ(0.0f);
                return;
            }
            this.u.setTranslationZ(this.h);
            return;
        }
        this.u.setElevation(0.0f);
        this.u.setTranslationZ(0.0f);
    }

    void E(float f8, float f9, float f10) {
        if (Build.VERSION.SDK_INT == 21) {
            this.u.refreshDrawableState();
        } else if (this.u.getStateListAnimator() == this.k) {
            StateListAnimator stateListAnimator;
            this.k = stateListAnimator = this.k(f8, f9, f10);
            this.u.setStateListAnimator(stateListAnimator);
        }
        if (this.V()) {
            this.Z();
        }
    }

    void F(Rect rect) {
        ax.b0.g.h(this.d, "Didn't initialize content background");
        if (this.V()) {
            rect = new InsetDrawable(this.d, rect.left, rect.top, rect.right, rect.bottom);
            this.v.a((Drawable)rect);
            return;
        }
        this.v.a(this.d);
    }

    void G() {
        ArrayList<e> arrayList = this.t;
        if (arrayList != null) {
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                e e8 = arrayList.get(i8);
                e8.a();
            }
        }
    }

    void H() {
        ArrayList<e> arrayList = this.t;
        if (arrayList != null) {
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                e e8 = arrayList.get(i8);
                e8.b();
            }
        }
    }

    void I(ColorStateList colorStateList) {
        ax.O6.h h8 = this.b;
        if (h8 != null) {
            h8.setTintList(colorStateList);
        }
    }

    void J(PorterDuff.Mode mode) {
        ax.O6.h h8 = this.b;
        if (h8 != null) {
            h8.setTintMode(mode);
        }
    }

    final void K(float f8) {
        if (this.g != f8) {
            this.g = f8;
            this.E(f8, this.h, this.i);
        }
    }

    void L(boolean bl) {
        this.e = bl;
    }

    final void M(h h8) {
        this.n = h8;
    }

    final void N(float f8) {
        if (this.h != f8) {
            this.h = f8;
            this.E(this.g, f8, this.i);
        }
    }

    final void O(float f8) {
        this.o = f8;
        Matrix matrix = this.z;
        this.h(f8, matrix);
        this.u.setImageMatrix(matrix);
    }

    final void P(int n8) {
        if (this.p != n8) {
            this.p = n8;
            this.Y();
        }
    }

    final void Q(float f8) {
        if (this.i != f8) {
            this.i = f8;
            this.E(this.g, this.h, f8);
        }
    }

    void R(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable)drawable).setColor(ax.L6.a.e(colorStateList));
            return;
        }
        if (drawable != null) {
            drawable.setTintList(ax.L6.a.e(colorStateList));
        }
    }

    void S(boolean bl) {
        this.f = bl;
        this.Z();
    }

    final void T(l l8) {
        this.a = l8;
        ax.O6.h h8 = this.b;
        if (h8 != null) {
            h8.setShapeAppearanceModel(l8);
        }
        if ((h8 = this.c) instanceof o) {
            ((o)h8).setShapeAppearanceModel(l8);
        }
    }

    final void U(h h8) {
        this.m = h8;
    }

    boolean V() {
        return this.v.c() || this.x();
        {
        }
    }

    void X(f object, boolean bl) {
        if (!this.z()) {
            Object object2 = this.l;
            if (object2 != null) {
                object2.cancel();
            }
            object2 = this.m;
            int n8 = 0;
            int n9 = object2 == null ? 1 : 0;
            if (this.W()) {
                if (this.u.getVisibility() != 0) {
                    object2 = this.u;
                    float f8 = 0.0f;
                    object2.setAlpha(0.0f);
                    object2 = this.u;
                    float f9 = n9 != 0 ? 0.4f : 0.0f;
                    ((FloatingActionButton)object2).setScaleY(f9);
                    object2 = this.u;
                    f9 = n9 != 0 ? 0.4f : 0.0f;
                    ((FloatingActionButton)object2).setScaleX(f9);
                    f9 = f8;
                    if (n9 != 0) {
                        f9 = 0.4f;
                    }
                    this.O(f9);
                }
                object2 = (object2 = this.m) != null ? this.i((h)object2, 1.0f, 1.0f, 1.0f) : this.j(1.0f, 1.0f, 1.0f, C, D);
                object2.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, bl, (f)object){
                    final boolean a;
                    final f b;
                    final b c;
                    {
                        this.c = b8;
                        this.a = bl;
                        this.b = f8;
                    }

                    public void onAnimationEnd(Animator object) {
                        com.google.android.material.floatingactionbutton.b.b(this.c, 0);
                        com.google.android.material.floatingactionbutton.b.c(this.c, null);
                        object = this.b;
                        if (object != null) {
                            object.a();
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        this.c.u.b(0, this.a);
                        com.google.android.material.floatingactionbutton.b.b(this.c, 2);
                        com.google.android.material.floatingactionbutton.b.c(this.c, animator);
                    }
                });
                object = this.r;
                if (object != null) {
                    int n10 = ((ArrayList)object).size();
                    for (n9 = n8; n9 < n10; ++n9) {
                        Object e8 = ((ArrayList)object).get(n9);
                        object2.addListener((Animator.AnimatorListener)e8);
                    }
                }
                object2.start();
                return;
            }
            this.u.b(0, bl);
            this.u.setAlpha(1.0f);
            this.u.setScaleY(1.0f);
            this.u.setScaleX(1.0f);
            this.O(1.0f);
            if (object != null) {
                object.a();
            }
        }
    }

    final void Y() {
        this.O(this.o);
    }

    final void Z() {
        Rect rect = this.w;
        this.r(rect);
        this.F(rect);
        this.v.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    void a0(float f8) {
        ax.O6.h h8 = this.b;
        if (h8 != null) {
            h8.f0(f8);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.s == null) {
            this.s = new ArrayList();
        }
        this.s.add(animatorListener);
    }

    void f(Animator.AnimatorListener animatorListener) {
        if (this.r == null) {
            this.r = new ArrayList();
        }
        this.r.add(animatorListener);
    }

    void g(e e8) {
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(e8);
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

    final h p() {
        return this.n;
    }

    float q() {
        return this.h;
    }

    void r(Rect rect) {
        if (this.v.c()) {
            int n8 = this.v();
            float f8 = this.f ? this.n() + this.i : 0.0f;
            int n9 = Math.max(n8, (int)Math.ceil(f8));
            n8 = Math.max(n8, (int)Math.ceil(f8 * 1.5f));
            rect.set(n9, n8, n9, n8);
            return;
        }
        if (this.x()) {
            int n10 = (this.j - this.u.getSizeDimension()) / 2;
            rect.set(n10, n10, n10, n10);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    float s() {
        return this.i;
    }

    final l t() {
        return this.a;
    }

    final h u() {
        return this.m;
    }

    int v() {
        if (this.e) {
            return Math.max((this.j - this.u.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void w(f object, boolean bl) {
        if (!this.y()) {
            Object object2 = this.l;
            if (object2 != null) {
                object2.cancel();
            }
            if (this.W()) {
                object2 = this.n;
                object2 = object2 != null ? this.i((h)object2, 0.0f, 0.0f, 0.0f) : this.j(0.0f, 0.4f, 0.4f, E, F);
                object2.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, bl, (f)object){
                    private boolean a;
                    final boolean b;
                    final f c;
                    final b d;
                    {
                        this.d = b8;
                        this.b = bl;
                        this.c = f8;
                    }

                    public void onAnimationCancel(Animator animator) {
                        this.a = true;
                    }

                    public void onAnimationEnd(Animator object) {
                        com.google.android.material.floatingactionbutton.b.b(this.d, 0);
                        com.google.android.material.floatingactionbutton.b.c(this.d, null);
                        if (!this.a) {
                            object = this.d.u;
                            boolean bl = this.b;
                            int n8 = bl ? 8 : 4;
                            ((A)((Object)object)).b(n8, bl);
                            object = this.c;
                            if (object != null) {
                                object.b();
                            }
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        this.d.u.b(0, this.b);
                        com.google.android.material.floatingactionbutton.b.b(this.d, 1);
                        com.google.android.material.floatingactionbutton.b.c(this.d, animator);
                        this.a = false;
                    }
                });
                object = this.s;
                if (object != null) {
                    int n8 = ((ArrayList)object).size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        Object e8 = ((ArrayList)object).get(i8);
                        object2.addListener((Animator.AnimatorListener)e8);
                    }
                }
                object2.start();
                return;
            }
            object2 = this.u;
            int n9 = bl ? 8 : 4;
            ((A)((Object)object2)).b(n9, bl);
            if (object != null) {
                object.b();
            }
        }
    }

    final boolean x() {
        return this.e && this.u.getSizeDimension() < this.j;
    }

    boolean y() {
        if (this.u.getVisibility() == 0) {
            return this.q == 1;
        }
        return this.q != 2;
    }

    boolean z() {
        if (this.u.getVisibility() != 0) {
            return this.q == 2;
        }
        return this.q != 1;
    }

    static interface e {
        public void a();

        public void b();
    }

    static interface f {
        public void a();

        public void b();
    }
}

