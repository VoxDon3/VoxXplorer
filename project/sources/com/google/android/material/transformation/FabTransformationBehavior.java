package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.k6.C2406g;
import ax.l6.C2472a;
import ax.l6.h;
import ax.l6.i;
import ax.l6.j;
import ax.x6.C3464a;
import ax.x6.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect c;
    private final RectF d;
    private final RectF e;
    private final int[] f;
    private float g;
    private float h;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ View b;
        final /* synthetic */ View c;

        a(boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.setVisibility(4);
            this.c.setAlpha(1.0f);
            this.c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ ax.x6.c a;
        final /* synthetic */ Drawable b;

        c(ax.x6.c cVar, Drawable drawable) {
            this.a = cVar;
            this.b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(this.b);
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ ax.x6.c a;

        d(ax.x6.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.e revealInfo = this.a.getRevealInfo();
            revealInfo.c = Float.MAX_VALUE;
            this.a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {
        public h a;
        public j b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    private ViewGroup O(View view) {
        View findViewById = view.findViewById(C2406g.D);
        return findViewById != null ? j0(findViewById) : ((view instanceof ax.X6.b) || (view instanceof ax.X6.a)) ? j0(((ViewGroup) view).getChildAt(0)) : j0(view);
    }

    private void P(View view, e eVar, i iVar, i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float W = W(eVar, iVar, f, f3);
        float W2 = W(eVar, iVar2, f2, f4);
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        X(view, rectF3);
        rectF3.offset(W, W2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void Q(View view, RectF rectF) {
        X(view, rectF);
        rectF.offset(this.g, this.h);
    }

    private Pair<i, i> R(float f, float f2, boolean z, e eVar) {
        i e2;
        i e3;
        if (f == 0.0f || f2 == 0.0f) {
            e2 = eVar.a.e("translationXLinear");
            e3 = eVar.a.e("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            e2 = eVar.a.e("translationXCurveDownwards");
            e3 = eVar.a.e("translationYCurveDownwards");
        } else {
            e2 = eVar.a.e("translationXCurveUpwards");
            e3 = eVar.a.e("translationYCurveUpwards");
        }
        return new Pair<>(e2, e3);
    }

    private float S(View view, View view2, j jVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(-U(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float T(View view, View view2, j jVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(0.0f, -V(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float U(View view, View view2, j jVar) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        Q(view, rectF);
        X(view2, rectF2);
        int i = jVar.a & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else {
            if (i != 5) {
                f = 0.0f;
                return f + jVar.b;
            }
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f = centerX - centerX2;
        return f + jVar.b;
    }

    private float V(View view, View view2, j jVar) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        Q(view, rectF);
        X(view2, rectF2);
        int i = jVar.a & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i != 80) {
                f = 0.0f;
                return f + jVar.c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f = centerY - centerY2;
        return f + jVar.c;
    }

    private float W(e eVar, i iVar, float f, float f2) {
        long c2 = iVar.c();
        long d2 = iVar.d();
        i e2 = eVar.a.e("expansion");
        return C2472a.a(f, f2, iVar.e().getInterpolation((((e2.c() + e2.d()) + 17) - c2) / d2));
    }

    private void X(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void Y(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            boolean z3 = view2 instanceof ax.x6.c;
            ViewGroup O = O(view2);
            if (O == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    ax.l6.d.a.set(O, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(O, ax.l6.d.a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(O, ax.l6.d.a, 0.0f);
            }
            eVar.a.e("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Z(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof ax.x6.c) {
            ax.x6.c cVar = (ax.x6.c) view2;
            int h0 = h0(view);
            int i = 16777215 & h0;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(h0);
                }
                ofInt = ObjectAnimator.ofInt(cVar, c.d.a, i);
            } else {
                ofInt = ObjectAnimator.ofInt(cVar, c.d.a, h0);
            }
            ofInt.setEvaluator(ax.l6.c.b());
            eVar.a.e("color").a(ofInt);
            list.add(ofInt);
        }
    }

    private void a0(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float U = U(view, view2, eVar.b);
        float V = V(view, view2, eVar.b);
        Pair<i, i> R = R(U, V, z, eVar);
        i iVar = (i) R.first;
        i iVar2 = (i) R.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            U = this.g;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, U);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            V = this.h;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, V);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void b0(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        eVar.a.e("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c0(View view, View view2, boolean z, boolean z2, e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof ax.x6.c) {
            ax.x6.c cVar = (ax.x6.c) view2;
            float S = S(view, view2, eVar.b);
            float T = T(view, view2, eVar.b);
            ((FloatingActionButton) view).h(this.c);
            float width = this.c.width() / 2.0f;
            i e2 = eVar.a.e("expansion");
            if (z) {
                if (!z2) {
                    cVar.setRevealInfo(new c.e(S, T, width));
                }
                if (z2) {
                    width = cVar.getRevealInfo().c;
                }
                animator = C3464a.a(cVar, S, T, ax.G6.a.c(S, T, 0.0f, 0.0f, f, f2));
                animator.addListener(new d(cVar));
                f0(view2, e2.c(), (int) S, (int) T, width, list);
            } else {
                float f3 = cVar.getRevealInfo().c;
                Animator a2 = C3464a.a(cVar, S, T, width);
                int i = (int) S;
                int i2 = (int) T;
                f0(view2, e2.c(), i, i2, f3, list);
                e0(view2, e2.c(), e2.d(), eVar.a.f(), i, i2, width, list);
                animator = a2;
            }
            e2.a(animator);
            list.add(animator);
            list2.add(C3464a.b(cVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d0(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof ax.x6.c) && (view instanceof ImageView)) {
            ax.x6.c cVar = (ax.x6.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, ax.l6.e.a, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, ax.l6.e.a, 255);
            }
            ofInt.addUpdateListener(new b(view2));
            eVar.a.e("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new c(cVar, drawable));
        }
    }

    private void e0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    private void f0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void g0(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        i iVar;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float U = U(view, view2, eVar.b);
        float V = V(view, view2, eVar.b);
        Pair<i, i> R = R(U, V, z, eVar);
        i iVar2 = (i) R.first;
        i iVar3 = (i) R.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-U);
                view2.setTranslationY(-V);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            P(view2, eVar, iVar2, iVar3, -U, -V, 0.0f, 0.0f, rectF);
            iVar2 = iVar2;
            iVar = iVar3;
        } else {
            iVar = iVar3;
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -U);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -V);
        }
        iVar2.a(ofFloat);
        iVar.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private int h0(View view) {
        ColorStateList backgroundTintList = view.getBackgroundTintList();
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet N(View view, View view2, boolean z, boolean z2) {
        e i0 = i0(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0(view, view2, z, z2, i0, arrayList, arrayList2);
        RectF rectF = this.d;
        g0(view, view2, z, z2, i0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        a0(view, view2, z, i0, arrayList);
        d0(view, view2, z, z2, i0, arrayList, arrayList2);
        c0(view, view2, z, z2, i0, width, height, arrayList, arrayList2);
        Z(view, view2, z, z2, i0, arrayList, arrayList2);
        Y(view, view2, z, z2, i0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        ax.l6.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    protected abstract e i0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
