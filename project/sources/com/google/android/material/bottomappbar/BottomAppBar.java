package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.F6.z;
import ax.H6.i;
import ax.k0.AbstractC2357a;
import ax.k6.C2401b;
import ax.k6.C2402c;
import ax.k6.C2404e;
import ax.k6.l;
import ax.l6.C2472a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int t0 = l.r;
    private static final int u0 = C2402c.D;
    private static final int v0 = C2402c.M;
    private Integer U;
    private final ax.O6.h V;
    private Animator W;
    private Animator a0;
    private int b0;
    private int c0;
    private int d0;
    private final int e0;
    private int f0;
    private int g0;
    private final boolean h0;
    private boolean i0;
    private int j0;
    private ArrayList<g> k0;
    private int l0;
    private boolean m0;
    private boolean n0;
    private Behavior o0;
    private int p0;
    private int q0;
    private int r0;
    AnimatorListenerAdapter s0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.t0();
            BottomAppBar.this.W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.u0();
        }
    }

    class b extends FloatingActionButton.b {
        final /* synthetic */ int a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.t0();
            }
        }

        b(int i) {
            this.a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.y0(this.a));
            floatingActionButton.q(new a());
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.t0();
            BottomAppBar.this.m0 = false;
            BottomAppBar.this.a0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.u0();
        }
    }

    class d extends AnimatorListenerAdapter {
        public boolean a;
        final /* synthetic */ ActionMenuView b;
        final /* synthetic */ int c;
        final /* synthetic */ boolean d;

        d(ActionMenuView actionMenuView, int i, boolean z) {
            this.b = actionMenuView;
            this.c = i;
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            boolean z = BottomAppBar.this.l0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.D0(bottomAppBar.l0);
            BottomAppBar.this.J0(this.b, this.c, this.d, z);
        }
    }

    class e implements Runnable {
        final /* synthetic */ int c0;
        final /* synthetic */ boolean d0;
        final /* synthetic */ ActionMenuView q;

        e(ActionMenuView actionMenuView, int i, boolean z) {
            this.q = actionMenuView;
            this.c0 = i;
            this.d0 = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.setTranslationX(BottomAppBar.this.x0(r0, this.c0, this.d0));
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.s0.onAnimationStart(animator);
            FloatingActionButton v0 = BottomAppBar.this.v0();
            if (v0 != null) {
                v0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class h extends AbstractC2357a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        int d0;
        boolean e0;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // ax.k0.AbstractC2357a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d0);
            parcel.writeInt(this.e0 ? 1 : 0);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readInt();
            this.e0 = parcel.readInt() != 0;
        }
    }

    private void A0(int i, boolean z) {
        if (!isLaidOut()) {
            this.m0 = false;
            D0(this.l0);
            return;
        }
        Animator animator = this.a0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!z0()) {
            i = 0;
            z = false;
        }
        s0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.a0 = animatorSet;
        animatorSet.addListener(new c());
        this.a0.start();
    }

    private void B0(int i) {
        if (this.b0 == i || !isLaidOut()) {
            return;
        }
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.c0 == 1) {
            r0(i, arrayList);
        } else {
            q0(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(i.g(getContext(), v0, C2472a.a));
        this.W = animatorSet;
        animatorSet.addListener(new a());
        this.W.start();
    }

    private Drawable C0(Drawable drawable) {
        if (drawable == null || this.U == null) {
            return drawable;
        }
        Drawable r = ax.U.a.r(drawable.mutate());
        r.setTint(this.U.intValue());
        return r;
    }

    private void E0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.a0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (z0()) {
            I0(actionMenuView, this.b0, this.n0);
        } else {
            I0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        getTopEdgeTreatment().r(getFabTranslationX());
        this.V.h0((this.n0 && z0() && this.d0 == 1) ? 1.0f : 0.0f);
        View w0 = w0();
        if (w0 != null) {
            w0.setTranslationY(getFabTranslationY());
            w0.setTranslationX(getFabTranslationX());
        }
    }

    private void I0(ActionMenuView actionMenuView, int i, boolean z) {
        J0(actionMenuView, i, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        e eVar = new e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.d = 17;
        int i = bottomAppBar.d0;
        if (i == 1) {
            fVar.d = 17 | 48;
        }
        if (i == 0) {
            fVar.d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.p0;
    }

    private int getFabAlignmentAnimationDuration() {
        return i.f(getContext(), u0, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return y0(this.b0);
    }

    private float getFabTranslationY() {
        if (this.d0 == 1) {
            return -getTopEdgeTreatment().d();
        }
        return w0() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.q0;
    }

    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.V.I().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.s0);
        floatingActionButton.f(new f());
        floatingActionButton.g(null);
    }

    private void p0() {
        Animator animator = this.a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void r0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v0(), "translationX", y0(i));
        ofFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(ofFloat);
    }

    private void s0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - x0(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            ofFloat2.addListener(new d(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        ArrayList<g> arrayList;
        int i = this.j0 - 1;
        this.j0 = i;
        if (i != 0 || (arrayList = this.k0) == null) {
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            g gVar = arrayList.get(i2);
            i2++;
            gVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        ArrayList<g> arrayList;
        int i = this.j0;
        this.j0 = i + 1;
        if (i != 0 || (arrayList = this.k0) == null) {
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            g gVar = arrayList.get(i2);
            i2++;
            gVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton v0() {
        View w0 = w0();
        if (w0 instanceof FloatingActionButton) {
            return (FloatingActionButton) w0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View w0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).s(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float y0(int i) {
        boolean h2 = z.h(this);
        if (i != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((h2 ? this.r0 : this.q0) + ((this.f0 == -1 || w0() == null) ? this.e0 : (r6.getMeasuredWidth() / 2) + this.f0))) * (h2 ? -1 : 1);
    }

    private boolean z0() {
        FloatingActionButton v02 = v0();
        return v02 != null && v02.n();
    }

    public void D0(int i) {
        if (i != 0) {
            this.l0 = 0;
            getMenu().clear();
            x(i);
        }
    }

    public void G0(int i, int i2) {
        this.l0 = i2;
        this.m0 = true;
        A0(i, this.n0);
        B0(i);
        this.b0 = i;
    }

    boolean H0(int i) {
        float f2 = i;
        if (f2 == getTopEdgeTreatment().j()) {
            return false;
        }
        getTopEdgeTreatment().o(f2);
        this.V.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.V.M();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.b0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f0;
    }

    public int getFabAnchorMode() {
        return this.d0;
    }

    public int getFabAnimationMode() {
        return this.c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().h();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().i();
    }

    public boolean getHideOnScroll() {
        return this.i0;
    }

    public int getMenuAlignmentMode() {
        return this.g0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ax.O6.i.f(this, this.V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            p0();
            F0();
            final View w0 = w0();
            if (w0 != null && w0.isLaidOut()) {
                w0.post(new Runnable() { // from class: ax.p6.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        w0.requestLayout();
                    }
                });
            }
        }
        E0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.b0 = hVar.d0;
        this.n0 = hVar.e0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.d0 = this.b0;
        hVar.e0 = this.n0;
        return hVar;
    }

    protected void q0(int i, List<Animator> list) {
        FloatingActionButton v02 = v0();
        if (v02 == null || v02.m()) {
            return;
        }
        u0();
        v02.k(new b(i));
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.V.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().k(f2);
            this.V.invalidateSelf();
            F0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.V.f0(f2);
        getBehavior().R(this, this.V.H() - this.V.G());
    }

    public void setFabAlignmentMode(int i) {
        G0(i, 0);
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.f0 != i) {
            this.f0 = i;
            F0();
        }
    }

    public void setFabAnchorMode(int i) {
        this.d0 = i;
        F0();
        View w0 = w0();
        if (w0 != null) {
            K0(this, w0);
            w0.requestLayout();
            this.V.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.c0 = i;
    }

    void setFabCornerSize(float f2) {
        if (f2 != getTopEdgeTreatment().f()) {
            getTopEdgeTreatment().l(f2);
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().m(f2);
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f2);
            this.V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.i0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.g0 != i) {
            this.g0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                I0(actionMenuView, this.b0, z0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(C0(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    protected int x0(ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.g0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean h2 = z.h(this);
        int measuredWidth = h2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = h2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = h2 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i4 = h2 ? this.q0 : -this.r0;
        if (getNavigationIcon() == null) {
            i2 = getResources().getDimensionPixelOffset(C2404e.r);
            if (!h2) {
                i2 = -i2;
            }
        }
        return measuredWidth - ((right + i4) + i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.o0 == null) {
            this.o0 = new Behavior();
        }
        return this.o0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect p;
        private WeakReference<BottomAppBar> q;
        private int r;
        private final View.OnLayoutChangeListener s;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.q.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.h(Behavior.this.p);
                    int height2 = Behavior.this.p.height();
                    bottomAppBar.H0(height2);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.p)));
                    height = height2;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.r == 0) {
                    if (bottomAppBar.d0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C2404e.Z) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (z.h(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.e0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.e0;
                    }
                }
                bottomAppBar.F0();
            }
        }

        public Behavior() {
            this.s = new a();
            this.p = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: a0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.q = new WeakReference<>(bottomAppBar);
            View w0 = bottomAppBar.w0();
            if (w0 != null && !w0.isLaidOut()) {
                BottomAppBar.K0(bottomAppBar, w0);
                this.r = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) w0.getLayoutParams())).bottomMargin;
                if (w0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) w0;
                    if (bottomAppBar.d0 == 0 && bottomAppBar.h0) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C2401b.b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C2401b.a);
                    }
                    bottomAppBar.o0(floatingActionButton);
                }
                w0.addOnLayoutChangeListener(this.s);
                bottomAppBar.F0();
            }
            coordinatorLayout.I(bottomAppBar, i);
            return super.p(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.E(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.s = new a();
            this.p = new Rect();
        }
    }
}
