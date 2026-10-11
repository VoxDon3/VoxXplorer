/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.l6.b;
import ax.l6.i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class FabTransformationScrimBehavior
extends ExpandableTransformationBehavior {
    private final i c = new i(75L, 150L);
    private final i d = new i(0L, 150L);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void O(View view, boolean bl, boolean bl2, List<Animator> list, List<Animator.AnimatorListener> object) {
        object = bl ? this.c : this.d;
        if (bl) {
            if (!bl2) {
                view.setAlpha(0.0f);
            }
            view = ObjectAnimator.ofFloat((Object)view, (Property)View.ALPHA, (float[])new float[]{1.0f});
        } else {
            view = ObjectAnimator.ofFloat((Object)view, (Property)View.ALPHA, (float[])new float[]{0.0f});
        }
        ((i)object).a((Animator)view);
        list.add((Animator)view);
    }

    @Override
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.H(coordinatorLayout, view, motionEvent);
    }

    @Override
    protected AnimatorSet N(View view, View view2, boolean bl, boolean bl2) {
        ArrayList<Animator> arrayList = new ArrayList<Animator>();
        this.O(view2, bl, bl2, arrayList, new ArrayList<Animator.AnimatorListener>());
        view = new AnimatorSet();
        b.a((AnimatorSet)view, arrayList);
        view.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, bl, view2){
            final boolean a;
            final View b;
            final FabTransformationScrimBehavior c;
            {
                this.c = fabTransformationScrimBehavior;
                this.a = bl;
                this.b = view;
            }

            public void onAnimationEnd(Animator animator) {
                if (!this.a) {
                    this.b.setVisibility(4);
                }
            }

            public void onAnimationStart(Animator animator) {
                if (this.a) {
                    this.b.setVisibility(0);
                }
            }
        });
        return view;
    }

    @Override
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}

