/*
 * Decompiled with CFR 0.152.
 */
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
import ax.O6.i;
import ax.k6.c;
import ax.k6.e;
import ax.k6.l;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.a;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BottomAppBar
extends Toolbar
implements CoordinatorLayout.b {
    private static final int t0 = l.r;
    private static final int u0 = c.D;
    private static final int v0 = c.M;
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

    private void A0(int n8, boolean bl) {
        if (!this.isLaidOut()) {
            this.m0 = false;
            this.D0(this.l0);
            return;
        }
        Object object = this.a0;
        if (object != null) {
            object.cancel();
        }
        object = new ArrayList();
        if (!this.z0()) {
            n8 = 0;
            bl = false;
        }
        this.s0(n8, bl, (List<Animator>)object);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether((Collection)object);
        this.a0 = animatorSet;
        animatorSet.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final BottomAppBar a;
            {
                this.a = bottomAppBar;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.t0();
                BottomAppBar.U(this.a, false);
                BottomAppBar.a0(this.a, null);
            }

            public void onAnimationStart(Animator animator) {
                this.a.u0();
            }
        });
        this.a0.start();
    }

    private void B0(int n8) {
        if (this.b0 != n8 && this.isLaidOut()) {
            Object object = this.W;
            if (object != null) {
                object.cancel();
            }
            object = new ArrayList();
            if (this.c0 == 1) {
                this.r0(n8, (List<Animator>)object);
            } else {
                this.q0(n8, (List<Animator>)object);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether((Collection)object);
            animatorSet.setInterpolator(ax.H6.i.g(this.getContext(), v0, ax.l6.a.a));
            this.W = animatorSet;
            animatorSet.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                final BottomAppBar a;
                {
                    this.a = bottomAppBar;
                }

                public void onAnimationEnd(Animator animator) {
                    this.a.t0();
                    BottomAppBar.Y(this.a, null);
                }

                public void onAnimationStart(Animator animator) {
                    this.a.u0();
                }
            });
            this.W.start();
        }
    }

    private Drawable C0(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2 = drawable;
            if (this.U != null) {
                drawable2 = ax.U.a.r(drawable.mutate());
                drawable2.setTint(this.U.intValue());
            }
        }
        return drawable2;
    }

    private void E0() {
        ActionMenuView actionMenuView = this.getActionMenuView();
        if (actionMenuView != null && this.a0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!this.z0()) {
                this.I0(actionMenuView, 0, false);
                return;
            }
            this.I0(actionMenuView, this.b0, this.n0);
        }
    }

    private void F0() {
        this.getTopEdgeTreatment().r(this.getFabTranslationX());
        ax.O6.h h8 = this.V;
        float f8 = this.n0 && this.z0() && this.d0 == 1 ? 1.0f : 0.0f;
        h8.h0(f8);
        h8 = this.w0();
        if (h8 != null) {
            h8.setTranslationY(this.getFabTranslationY());
            h8.setTranslationX(this.getFabTranslationX());
        }
    }

    private void I0(ActionMenuView actionMenuView, int n8, boolean bl) {
        this.J0(actionMenuView, n8, bl, false);
    }

    private void J0(ActionMenuView actionMenuView, int n8, boolean bl, boolean bl2) {
        Runnable runnable2 = new Runnable(){
            final int c0;
            final boolean d0;
            final BottomAppBar e0;
            final ActionMenuView q;
            {
                this.e0 = bottomAppBar;
                this.q = actionMenuView;
                this.c0 = n8;
                this.d0 = bl;
            }

            @Override
            public void run() {
                ActionMenuView actionMenuView = this.q;
                actionMenuView.setTranslationX(this.e0.x0(actionMenuView, this.c0, this.d0));
            }
        };
        if (bl2) {
            actionMenuView.post(runnable2);
            return;
        }
        runnable2.run();
    }

    private static void K0(BottomAppBar bottomAppBar, View object) {
        object = (CoordinatorLayout.f)object.getLayoutParams();
        object.d = 17;
        int n8 = bottomAppBar.d0;
        if (n8 == 1) {
            object.d = 0x11 | 0x30;
        }
        if (n8 == 0) {
            object.d |= 0x50;
        }
    }

    public static /* synthetic */ void T(View view) {
        view.requestLayout();
    }

    static /* synthetic */ boolean U(BottomAppBar bottomAppBar, boolean bl) {
        bottomAppBar.m0 = bl;
        return bl;
    }

    static /* synthetic */ Animator Y(BottomAppBar bottomAppBar, Animator animator) {
        bottomAppBar.W = animator;
        return animator;
    }

    static /* synthetic */ Animator a0(BottomAppBar bottomAppBar, Animator animator) {
        bottomAppBar.a0 = animator;
        return animator;
    }

    private ActionMenuView getActionMenuView() {
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            View view = this.getChildAt(i8);
            if (!(view instanceof ActionMenuView)) continue;
            return (ActionMenuView)view;
        }
        return null;
    }

    private int getBottomInset() {
        return this.p0;
    }

    private int getFabAlignmentAnimationDuration() {
        return ax.H6.i.f(this.getContext(), u0, 300);
    }

    private float getFabTranslationX() {
        return this.y0(this.b0);
    }

    private float getFabTranslationY() {
        if (this.d0 == 1) {
            return -this.getTopEdgeTreatment().d();
        }
        View view = this.w0();
        int n8 = view != null ? -(this.getMeasuredHeight() + this.getBottomInset() - view.getMeasuredHeight()) / 2 : 0;
        return n8;
    }

    private int getLeftInset() {
        return this.r0;
    }

    private int getRightInset() {
        return this.q0;
    }

    private a getTopEdgeTreatment() {
        return (a)this.V.I().p();
    }

    private void o0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e((Animator.AnimatorListener)this.s0);
        floatingActionButton.f((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final BottomAppBar a;
            {
                this.a = bottomAppBar;
            }

            public void onAnimationStart(Animator object) {
                this.a.s0.onAnimationStart((Animator)object);
                object = this.a.v0();
                if (object != null) {
                    ((FloatingActionButton)object).setTranslationX(this.a.getFabTranslationX());
                }
            }
        });
        floatingActionButton.g(null);
    }

    private void p0() {
        Animator animator = this.a0;
        if (animator != null) {
            animator.cancel();
        }
        if ((animator = this.W) != null) {
            animator.cancel();
        }
    }

    private void r0(int n8, List<Animator> list) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)this.v0(), (String)"translationX", (float[])new float[]{this.y0(n8)});
        objectAnimator.setDuration((long)this.getFabAlignmentAnimationDuration());
        list.add((Animator)objectAnimator);
    }

    private void s0(int n8, boolean bl, List<Animator> list) {
        ActionMenuView actionMenuView = this.getActionMenuView();
        if (actionMenuView != null) {
            float f8 = this.getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)actionMenuView, (String)"alpha", (float[])new float[]{1.0f});
            objectAnimator.setDuration((long)(0.8f * f8));
            if (Math.abs(actionMenuView.getTranslationX() - (float)this.x0(actionMenuView, n8, bl)) > 1.0f) {
                ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat((Object)actionMenuView, (String)"alpha", (float[])new float[]{0.0f});
                objectAnimator2.setDuration((long)(f8 * 0.2f));
                objectAnimator2.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, actionMenuView, n8, bl){
                    public boolean a;
                    final ActionMenuView b;
                    final int c;
                    final boolean d;
                    final BottomAppBar e;
                    {
                        this.e = bottomAppBar;
                        this.b = actionMenuView;
                        this.c = n8;
                        this.d = bl;
                    }

                    public void onAnimationCancel(Animator animator) {
                        this.a = true;
                    }

                    public void onAnimationEnd(Animator object) {
                        if (!this.a) {
                            boolean bl = this.e.l0 != 0;
                            object = this.e;
                            ((BottomAppBar)object).D0(((BottomAppBar)object).l0);
                            this.e.J0(this.b, this.c, this.d, bl);
                        }
                    }
                });
                actionMenuView = new AnimatorSet();
                actionMenuView.playSequentially(new Animator[]{objectAnimator2, objectAnimator});
                list.add((Animator)actionMenuView);
                return;
            }
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add((Animator)objectAnimator);
            }
        }
    }

    private void t0() {
        ArrayList<g> arrayList;
        int n8;
        this.j0 = n8 = this.j0 - 1;
        if (n8 == 0 && (arrayList = this.k0) != null) {
            int n9 = arrayList.size();
            for (n8 = 0; n8 < n9; ++n8) {
                g g8 = arrayList.get(n8);
                g8.b(this);
            }
        }
    }

    private void u0() {
        ArrayList<g> arrayList;
        int n8 = this.j0;
        this.j0 = n8 + 1;
        if (n8 == 0 && (arrayList = this.k0) != null) {
            int n9 = arrayList.size();
            for (n8 = 0; n8 < n9; ++n8) {
                g g8 = arrayList.get(n8);
                g8.a(this);
            }
        }
    }

    private FloatingActionButton v0() {
        View view = this.w0();
        if (view instanceof FloatingActionButton) {
            return (FloatingActionButton)view;
        }
        return null;
    }

    private View w0() {
        if (!(this.getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout)this.getParent()).s((View)this)) {
            if (!(view instanceof FloatingActionButton) && !(view instanceof ExtendedFloatingActionButton)) continue;
            return view;
        }
        return null;
    }

    private float y0(int n8) {
        boolean bl = z.h((View)this);
        int n9 = 1;
        if (n8 == 1) {
            View view = this.w0();
            n8 = bl ? this.r0 : this.q0;
            int n10 = this.f0 != -1 && view != null ? view.getMeasuredWidth() / 2 + this.f0 : this.e0;
            int n11 = this.getMeasuredWidth() / 2;
            if (bl) {
                n9 = -1;
            }
            return (n11 - (n8 + n10)) * n9;
        }
        return 0.0f;
    }

    private boolean z0() {
        FloatingActionButton floatingActionButton = this.v0();
        return floatingActionButton != null && floatingActionButton.n();
    }

    public void D0(int n8) {
        if (n8 != 0) {
            this.l0 = 0;
            this.getMenu().clear();
            this.x(n8);
        }
    }

    public void G0(int n8, int n9) {
        this.l0 = n9;
        this.m0 = true;
        this.A0(n8, this.n0);
        this.B0(n8);
        this.b0 = n8;
    }

    boolean H0(int n8) {
        float f8 = n8;
        if (f8 != this.getTopEdgeTreatment().j()) {
            this.getTopEdgeTreatment().o(f8);
            this.V.invalidateSelf();
            return true;
        }
        return false;
    }

    public ColorStateList getBackgroundTint() {
        return this.V.M();
    }

    @Override
    public Behavior getBehavior() {
        if (this.o0 == null) {
            this.o0 = new Behavior();
        }
        return this.o0;
    }

    public float getCradleVerticalOffset() {
        return this.getTopEdgeTreatment().d();
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
        return this.getTopEdgeTreatment().h();
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.getTopEdgeTreatment().i();
    }

    public boolean getHideOnScroll() {
        return this.i0;
    }

    public int getMenuAlignmentMode() {
        return this.g0;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.f((View)this, this.V);
        if (this.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.getParent()).setClipChildren(false);
        }
    }

    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        if (bl) {
            this.p0();
            this.F0();
            View view = this.w0();
            if (view != null && view.isLaidOut()) {
                view.post((Runnable)new ax.p6.a(view));
            }
        }
        this.E0();
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (h)parcelable;
        super.onRestoreInstanceState(parcelable.a());
        this.b0 = parcelable.d0;
        this.n0 = parcelable.e0;
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        h h8 = new h(super.onSaveInstanceState());
        h8.d0 = this.b0;
        h8.e0 = this.n0;
        return h8;
    }

    protected void q0(int n8, List<Animator> object) {
        object = this.v0();
        if (object != null && !((FloatingActionButton)object).m()) {
            this.u0();
            ((FloatingActionButton)object).k(new FloatingActionButton.b(this, n8){
                final int a;
                final BottomAppBar b;
                {
                    this.b = bottomAppBar;
                    this.a = n8;
                }

                @Override
                public void a(FloatingActionButton floatingActionButton) {
                    floatingActionButton.setTranslationX(this.b.y0(this.a));
                    floatingActionButton.q(new FloatingActionButton.b(this){
                        final b a;
                        {
                            this.a = b8;
                        }

                        @Override
                        public void b(FloatingActionButton floatingActionButton) {
                            this.a.b.t0();
                        }
                    });
                }
            });
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.V.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f8) {
        if (f8 != this.getCradleVerticalOffset()) {
            this.getTopEdgeTreatment().k(f8);
            this.V.invalidateSelf();
            this.F0();
        }
    }

    public void setElevation(float f8) {
        this.V.f0(f8);
        int n8 = this.V.H();
        int n9 = this.V.G();
        ((HideBottomViewOnScrollBehavior)this.getBehavior()).R(this, n8 - n9);
    }

    public void setFabAlignmentMode(int n8) {
        this.G0(n8, 0);
    }

    public void setFabAlignmentModeEndMargin(int n8) {
        if (this.f0 != n8) {
            this.f0 = n8;
            this.F0();
        }
    }

    public void setFabAnchorMode(int n8) {
        this.d0 = n8;
        this.F0();
        View view = this.w0();
        if (view != null) {
            BottomAppBar.K0(this, view);
            view.requestLayout();
            this.V.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int n8) {
        this.c0 = n8;
    }

    void setFabCornerSize(float f8) {
        if (f8 != this.getTopEdgeTreatment().f()) {
            this.getTopEdgeTreatment().l(f8);
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f8) {
        if (f8 != this.getFabCradleMargin()) {
            this.getTopEdgeTreatment().m(f8);
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f8) {
        if (f8 != this.getFabCradleRoundedCornerRadius()) {
            this.getTopEdgeTreatment().n(f8);
            this.V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean bl) {
        this.i0 = bl;
    }

    public void setMenuAlignmentMode(int n8) {
        if (this.g0 != n8) {
            this.g0 = n8;
            ActionMenuView actionMenuView = this.getActionMenuView();
            if (actionMenuView != null) {
                this.I0(actionMenuView, this.b0, this.z0());
            }
        }
    }

    @Override
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(this.C0(drawable));
    }

    public void setNavigationIconTint(int n8) {
        this.U = n8;
        Drawable drawable = this.getNavigationIcon();
        if (drawable != null) {
            this.setNavigationIcon(drawable);
        }
    }

    @Override
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override
    public void setTitle(CharSequence charSequence) {
    }

    protected int x0(ActionMenuView actionMenuView, int n8, boolean bl) {
        int n9;
        int n10 = this.g0;
        int n11 = 0;
        if (!(n10 == 1 || n8 == 1 && bl)) {
            return 0;
        }
        bl = z.h((View)this);
        n8 = bl ? this.getMeasuredWidth() : 0;
        n10 = n8;
        for (n9 = 0; n9 < this.getChildCount(); ++n9) {
            View view = this.getChildAt(n9);
            n8 = n10;
            if (view.getLayoutParams() instanceof Toolbar.g) {
                n8 = n10;
                if ((((Toolbar.g)view.getLayoutParams()).a & 0x800007) == 0x800003) {
                    n8 = bl ? Math.min(n10, view.getLeft()) : Math.max(n10, view.getRight());
                }
            }
            n10 = n8;
        }
        n9 = bl ? actionMenuView.getRight() : actionMenuView.getLeft();
        int n12 = bl ? this.q0 : -this.r0;
        n8 = n11;
        if (this.getNavigationIcon() == null) {
            n8 = this.getResources().getDimensionPixelOffset(e.r);
            if (!bl) {
                n8 = -n8;
            }
        }
        return n10 - (n9 + n12 + n8);
    }

    public static class Behavior
    extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect p;
        private WeakReference<BottomAppBar> q;
        private int r;
        private final View.OnLayoutChangeListener s = new View.OnLayoutChangeListener(this){
            final Behavior a;
            {
                this.a = behavior;
            }

            public void onLayoutChange(View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
                BottomAppBar bottomAppBar = (BottomAppBar)this.a.q.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton || view instanceof ExtendedFloatingActionButton)) {
                    Object object;
                    n8 = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        object = (FloatingActionButton)view;
                        ((FloatingActionButton)object).h(this.a.p);
                        n8 = this.a.p.height();
                        bottomAppBar.H0(n8);
                        bottomAppBar.setFabCornerSize(((FloatingActionButton)object).getShapeAppearanceModel().r().a(new RectF(this.a.p)));
                    }
                    object = (CoordinatorLayout.f)view.getLayoutParams();
                    if (this.a.r == 0) {
                        if (bottomAppBar.d0 == 1) {
                            n8 = (view.getMeasuredHeight() - n8) / 2;
                            n9 = bottomAppBar.getResources().getDimensionPixelOffset(e.Z);
                            ((ViewGroup.MarginLayoutParams)object).bottomMargin = bottomAppBar.getBottomInset() + (n9 - n8);
                        }
                        ((ViewGroup.MarginLayoutParams)object).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams)object).rightMargin = bottomAppBar.getRightInset();
                        if (z.h(view)) {
                            ((ViewGroup.MarginLayoutParams)object).leftMargin += bottomAppBar.e0;
                        } else {
                            ((ViewGroup.MarginLayoutParams)object).rightMargin += bottomAppBar.e0;
                        }
                    }
                    bottomAppBar.F0();
                    return;
                }
                view.removeOnLayoutChangeListener((View.OnLayoutChangeListener)this);
            }
        };

        public Behavior() {
            this.p = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.p = new Rect();
        }

        public boolean a0(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int n8) {
            this.q = new WeakReference<BottomAppBar>(bottomAppBar);
            View view = bottomAppBar.w0();
            if (view != null && !view.isLaidOut()) {
                BottomAppBar.K0(bottomAppBar, view);
                this.r = ((CoordinatorLayout.f)view.getLayoutParams()).bottomMargin;
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton)view;
                    if (bottomAppBar.d0 == 0 && bottomAppBar.h0) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(ax.k6.b.b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(ax.k6.b.a);
                    }
                    bottomAppBar.o0(floatingActionButton);
                }
                view.addOnLayoutChangeListener(this.s);
                bottomAppBar.F0();
            }
            coordinatorLayout.I((View)bottomAppBar, n8);
            return super.p(coordinatorLayout, bottomAppBar, n8);
        }

        public boolean b0(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int n8, int n9) {
            return bottomAppBar.getHideOnScroll() && super.E(coordinatorLayout, bottomAppBar, view, view2, n8, n9);
        }
    }

    static interface g {
        public void a(BottomAppBar var1);

        public void b(BottomAppBar var1);
    }

    static class h
    extends ax.k0.a {
        public static final Parcelable.Creator<h> CREATOR = new Parcelable.ClassLoaderCreator<h>(){

            public h a(Parcel parcel) {
                return new h(parcel, null);
            }

            public h b(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            public h[] c(int n8) {
                return new h[n8];
            }
        };
        int d0;
        boolean e0;

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readInt();
            boolean bl = parcel.readInt() != 0;
            this.e0 = bl;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.d0);
            parcel.writeInt(this.e0 ? 1 : 0);
        }
    }
}

