/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
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
import ax.k6.g;
import ax.l6.a;
import ax.l6.b;
import ax.l6.c;
import ax.l6.d;
import ax.l6.h;
import ax.l6.i;
import ax.l6.j;
import ax.x6.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class FabTransformationBehavior
extends ExpandableTransformationBehavior {
    private final Rect c = new Rect();
    private final RectF d = new RectF();
    private final RectF e = new RectF();
    private final int[] f = new int[2];
    private float g;
    private float h;

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private ViewGroup O(View view) {
        View view2 = view.findViewById(ax.k6.g.D);
        if (view2 != null) {
            return this.j0(view2);
        }
        if (!(view instanceof ax.X6.b) && !(view instanceof ax.X6.a)) {
            return this.j0(view);
        }
        return this.j0(((ViewGroup)view).getChildAt(0));
    }

    private void P(View view, e e8, i i8, i i9, float f8, float f9, float f10, float f11, RectF rectF) {
        f8 = this.W(e8, i8, f8, f10);
        f9 = this.W(e8, i9, f9, f11);
        i8 = this.c;
        view.getWindowVisibleDisplayFrame((Rect)i8);
        e8 = this.d;
        e8.set((Rect)i8);
        i8 = this.e;
        this.X(view, (RectF)i8);
        i8.offset(f8, f9);
        i8.intersect((RectF)e8);
        rectF.set((RectF)i8);
    }

    private void Q(View view, RectF rectF) {
        this.X(view, rectF);
        rectF.offset(this.g, this.h);
    }

    private Pair<i, i> R(float f8, float f9, boolean bl, e object) {
        i i8;
        float f10;
        float f11;
        if (f8 != 0.0f && (f11 = (f10 = f9 - 0.0f) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1)) != false) {
            if (bl && f9 < 0.0f || !bl && f11 > 0) {
                i i9 = ((e)object).a.e("translationXCurveUpwards");
                i8 = ((e)object).a.e("translationYCurveUpwards");
                object = i9;
            } else {
                i8 = ((e)object).a.e("translationXCurveDownwards");
                i i10 = ((e)object).a.e("translationYCurveDownwards");
                object = i8;
                i8 = i10;
            }
        } else {
            i i11 = ((e)object).a.e("translationXLinear");
            i8 = ((e)object).a.e("translationYLinear");
            object = i11;
        }
        return new Pair(object, (Object)i8);
    }

    private float S(View view, View view2, j j8) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        this.Q(view, rectF);
        this.X(view2, rectF2);
        rectF2.offset(-this.U(view, view2, j8), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float T(View view, View view2, j j8) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        this.Q(view, rectF);
        this.X(view2, rectF2);
        rectF2.offset(0.0f, -this.V(view, view2, j8));
        return rectF.centerY() - rectF2.top;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float U(View view, View view2, j j8) {
        float f8;
        float f9;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        this.Q(view, rectF);
        this.X(view2, rectF2);
        int n8 = j8.a & 7;
        if (n8 != 1) {
            if (n8 != 3) {
                if (n8 != 5) {
                    f9 = 0.0f;
                    return f9 + j8.b;
                }
                f9 = rectF2.right;
                f8 = rectF.right;
                return (f9 -= f8) + j8.b;
            } else {
                f9 = rectF2.left;
                f8 = rectF.left;
            }
            return (f9 -= f8) + j8.b;
        }
        f9 = rectF2.centerX();
        f8 = rectF.centerX();
        return (f9 -= f8) + j8.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float V(View view, View view2, j j8) {
        float f8;
        float f9;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        this.Q(view, rectF);
        this.X(view2, rectF2);
        int n8 = j8.a & 0x70;
        if (n8 != 16) {
            if (n8 != 48) {
                if (n8 != 80) {
                    f9 = 0.0f;
                    return f9 + j8.c;
                }
                f9 = rectF2.bottom;
                f8 = rectF.bottom;
                return (f9 -= f8) + j8.c;
            } else {
                f9 = rectF2.top;
                f8 = rectF.top;
            }
            return (f9 -= f8) + j8.c;
        }
        f9 = rectF2.centerY();
        f8 = rectF.centerY();
        return (f9 -= f8) + j8.c;
    }

    private float W(e object, i i8, float f8, float f9) {
        long l8 = i8.c();
        long l9 = i8.d();
        object = ((e)object).a.e("expansion");
        float f10 = (float)(((i)object).c() + ((i)object).d() + 17L - l8) / (float)l9;
        return a.a(f8, f9, i8.e().getInterpolation(f10));
    }

    private void X(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        int[] nArray = this.f;
        view.getLocationInWindow(nArray);
        rectF.offsetTo((float)nArray[0], (float)nArray[1]);
        rectF.offset((float)((int)(-view.getTranslationX())), (float)((int)(-view.getTranslationY())));
    }

    private void Y(View view, View view2, boolean bl, boolean bl2, e e8, List<Animator> list, List<Animator.AnimatorListener> list2) {
        block7: {
            block6: {
                if (!(view2 instanceof ViewGroup)) break block6;
                boolean bl3 = view2 instanceof ax.x6.c;
                view = this.O(view2);
                if (view != null) break block7;
            }
            return;
        }
        if (bl) {
            if (!bl2) {
                ax.l6.d.a.set((Object)view, (Object)Float.valueOf(0.0f));
            }
            view = ObjectAnimator.ofFloat((Object)view, ax.l6.d.a, (float[])new float[]{1.0f});
        } else {
            view = ObjectAnimator.ofFloat((Object)view, ax.l6.d.a, (float[])new float[]{0.0f});
        }
        e8.a.e("contentFade").a((Animator)view);
        list.add((Animator)view);
    }

    private void Z(View view, View object, boolean bl, boolean bl2, e e8, List<Animator> list, List<Animator.AnimatorListener> list2) {
        if (!(object instanceof ax.x6.c)) {
            return;
        }
        object = (ax.x6.c)object;
        int n8 = this.h0(view);
        if (bl) {
            if (!bl2) {
                object.setCircularRevealScrimColor(n8);
            }
            view = ObjectAnimator.ofInt((Object)object, c.d.a, (int[])new int[]{0xFFFFFF & n8});
        } else {
            view = ObjectAnimator.ofInt((Object)object, c.d.a, (int[])new int[]{n8});
        }
        view.setEvaluator((TypeEvaluator)ax.l6.c.b());
        e8.a.e("color").a((Animator)view);
        list.add((Animator)view);
    }

    private void a0(View view, View object, boolean bl, e object2, List<Animator> list) {
        float f8 = this.U(view, (View)object, ((e)object2).b);
        float f9 = this.V(view, (View)object, ((e)object2).b);
        object2 = this.R(f8, f9, bl, (e)object2);
        object = (i)((Pair)object2).first;
        object2 = (i)((Pair)object2).second;
        Property property = View.TRANSLATION_X;
        if (!bl) {
            f8 = this.g;
        }
        property = ObjectAnimator.ofFloat((Object)view, (Property)property, (float[])new float[]{f8});
        Property property2 = View.TRANSLATION_Y;
        f8 = bl ? f9 : this.h;
        view = ObjectAnimator.ofFloat((Object)view, (Property)property2, (float[])new float[]{f8});
        ((i)object).a((Animator)property);
        ((i)object2).a((Animator)view);
        list.add((Animator)property);
        list.add((Animator)view);
    }

    private void b0(View view, View view2, boolean bl, boolean bl2, e e8, List<Animator> list, List<Animator.AnimatorListener> list2) {
        float f8 = view2.getElevation() - view.getElevation();
        if (bl) {
            if (!bl2) {
                view2.setTranslationZ(-f8);
            }
            view = ObjectAnimator.ofFloat((Object)view2, (Property)View.TRANSLATION_Z, (float[])new float[]{0.0f});
        } else {
            view = ObjectAnimator.ofFloat((Object)view2, (Property)View.TRANSLATION_Z, (float[])new float[]{-f8});
        }
        e8.a.e("elevation").a((Animator)view);
        list.add((Animator)view);
    }

    private void c0(View view, View view2, boolean bl, boolean bl2, e e8, float f8, float f9, List<Animator> list, List<Animator.AnimatorListener> list2) {
        if (!(view2 instanceof ax.x6.c)) {
            return;
        }
        ax.x6.c c8 = (ax.x6.c)view2;
        float f10 = this.S(view, view2, e8.b);
        float f11 = this.T(view, view2, e8.b);
        ((FloatingActionButton)view).h(this.c);
        float f12 = (float)this.c.width() / 2.0f;
        i i8 = e8.a.e("expansion");
        if (bl) {
            if (!bl2) {
                c8.setRevealInfo(new c.e(f10, f11, f12));
            }
            if (bl2) {
                f12 = c8.getRevealInfo().c;
            }
            view = ax.x6.a.a(c8, f10, f11, ax.G6.a.c(f10, f11, 0.0f, 0.0f, f8, f9));
            view.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, c8){
                final ax.x6.c a;
                final FabTransformationBehavior b;
                {
                    this.b = fabTransformationBehavior;
                    this.a = c8;
                }

                public void onAnimationEnd(Animator object) {
                    object = this.a.getRevealInfo();
                    object.c = Float.MAX_VALUE;
                    this.a.setRevealInfo((c.e)object);
                }
            });
            this.f0(view2, i8.c(), (int)f10, (int)f11, f12, list);
        } else {
            f8 = c8.getRevealInfo().c;
            view = ax.x6.a.a(c8, f10, f11, f12);
            long l8 = i8.c();
            int n8 = (int)f10;
            int n9 = (int)f11;
            this.f0(view2, l8, n8, n9, f8, list);
            this.e0(view2, i8.c(), i8.d(), e8.a.f(), n8, n9, f12, list);
        }
        i8.a((Animator)view);
        list.add((Animator)view);
        list2.add(ax.x6.a.b(c8));
    }

    private void d0(View view, View view2, boolean bl, boolean bl2, e e8, List<Animator> list, List<Animator.AnimatorListener> list2) {
        if (view2 instanceof ax.x6.c && view instanceof ImageView) {
            ax.x6.c c8 = (ax.x6.c)view2;
            Drawable drawable = ((ImageView)view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (bl) {
                    if (!bl2) {
                        drawable.setAlpha(255);
                    }
                    view = ObjectAnimator.ofInt((Object)drawable, ax.l6.e.a, (int[])new int[]{0});
                } else {
                    view = ObjectAnimator.ofInt((Object)drawable, ax.l6.e.a, (int[])new int[]{255});
                }
                view.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(){
                    final View a;
                    final FabTransformationBehavior b;
                    {
                        this.b = fabTransformationBehavior;
                        this.a = view;
                    }

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.a.invalidate();
                    }
                });
                e8.a.e("iconFade").a((Animator)view);
                list.add((Animator)view);
                list2.add((Animator.AnimatorListener)new AnimatorListenerAdapter(this, c8, drawable){
                    final ax.x6.c a;
                    final Drawable b;
                    final FabTransformationBehavior c;
                    {
                        this.c = fabTransformationBehavior;
                        this.a = c8;
                        this.b = drawable;
                    }

                    public void onAnimationEnd(Animator animator) {
                        this.a.setCircularRevealOverlayDrawable(null);
                    }

                    public void onAnimationStart(Animator animator) {
                        this.a.setCircularRevealOverlayDrawable(this.b);
                    }
                });
            }
        }
    }

    private void e0(View view, long l8, long l9, long l10, int n8, int n9, float f8, List<Animator> list) {
        if ((l8 += l9) < l10) {
            view = ViewAnimationUtils.createCircularReveal((View)view, (int)n8, (int)n9, (float)f8, (float)f8);
            view.setStartDelay(l8);
            view.setDuration(l10 - l8);
            list.add((Animator)view);
        }
    }

    private void f0(View view, long l8, int n8, int n9, float f8, List<Animator> list) {
        if (l8 > 0L) {
            view = ViewAnimationUtils.createCircularReveal((View)view, (int)n8, (int)n9, (float)f8, (float)f8);
            view.setStartDelay(0L);
            view.setDuration(l8);
            list.add((Animator)view);
        }
    }

    private void g0(View object, View view, boolean bl, boolean bl2, e e8, List<Animator> list, List<Animator.AnimatorListener> objectAnimator, RectF rectF) {
        float f8 = this.U((View)object, view, e8.b);
        float f9 = this.V((View)object, view, e8.b);
        objectAnimator = this.R(f8, f9, bl, e8);
        object = (i)objectAnimator.first;
        i i8 = (i)objectAnimator.second;
        if (bl) {
            if (!bl2) {
                view.setTranslationX(-f8);
                view.setTranslationY(-f9);
            }
            ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat((Object)view, (Property)View.TRANSLATION_X, (float[])new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat((Object)view, (Property)View.TRANSLATION_Y, (float[])new float[]{0.0f});
            this.P(view, e8, (i)object, i8, -f8, -f9, 0.0f, 0.0f, rectF);
            view = objectAnimator2;
            e8 = objectAnimator;
        } else {
            objectAnimator = ObjectAnimator.ofFloat((Object)view, (Property)View.TRANSLATION_X, (float[])new float[]{-f8});
            e8 = ObjectAnimator.ofFloat((Object)view, (Property)View.TRANSLATION_Y, (float[])new float[]{-f9});
            view = objectAnimator;
        }
        ((i)object).a((Animator)view);
        i8.a((Animator)e8);
        list.add((Animator)view);
        list.add((Animator)e8);
    }

    private int h0(View view) {
        ColorStateList colorStateList = view.getBackgroundTintList();
        if (colorStateList != null) {
            return colorStateList.getColorForState(view.getDrawableState(), colorStateList.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup)view;
        }
        return null;
    }

    @Override
    protected AnimatorSet N(View view, View view2, boolean bl, boolean bl2) {
        e e8 = this.i0(view2.getContext(), bl);
        if (bl) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList<Animator> arrayList = new ArrayList<Animator>();
        ArrayList<Animator.AnimatorListener> arrayList2 = new ArrayList<Animator.AnimatorListener>();
        this.b0(view, view2, bl, bl2, e8, arrayList, arrayList2);
        RectF rectF = this.d;
        this.g0(view, view2, bl, bl2, e8, arrayList, arrayList2, rectF);
        float f8 = rectF.width();
        float f9 = rectF.height();
        this.a0(view, view2, bl, e8, arrayList);
        this.d0(view, view2, bl, bl2, e8, arrayList, arrayList2);
        this.c0(view, view2, bl, bl2, e8, f8, f9, arrayList, arrayList2);
        this.Z(view, view2, bl, bl2, e8, arrayList, arrayList2);
        this.Y(view, view2, bl, bl2, e8, arrayList, arrayList2);
        rectF = new AnimatorSet();
        b.a((AnimatorSet)rectF, arrayList);
        rectF.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, bl, view2, view){
            final boolean a;
            final View b;
            final View c;
            final FabTransformationBehavior d;
            {
                this.d = fabTransformationBehavior;
                this.a = bl;
                this.b = view;
                this.c = view2;
            }

            public void onAnimationEnd(Animator animator) {
                if (!this.a) {
                    this.b.setVisibility(4);
                    this.c.setAlpha(1.0f);
                    this.c.setVisibility(0);
                }
            }

            public void onAnimationStart(Animator animator) {
                if (this.a) {
                    this.b.setVisibility(0);
                    this.c.setAlpha(0.0f);
                    this.c.setVisibility(4);
                }
            }
        });
        int n8 = arrayList2.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            rectF.addListener((Animator.AnimatorListener)arrayList2.get(i8));
        }
        return rectF;
    }

    @Override
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int n8 = ((FloatingActionButton)view2).getExpandedComponentIdHint();
                return n8 == 0 || n8 == view.getId();
                {
                }
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    protected abstract e i0(Context var1, boolean var2);

    @Override
    public void k(CoordinatorLayout.f f8) {
        if (f8.h == 0) {
            f8.h = 80;
        }
    }

    protected static class e {
        public h a;
        public j b;

        protected e() {
        }
    }
}

