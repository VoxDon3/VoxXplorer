/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.transformation.ExpandableBehavior;

@Deprecated
public abstract class ExpandableTransformationBehavior
extends ExpandableBehavior {
    private AnimatorSet b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    static /* synthetic */ AnimatorSet M(ExpandableTransformationBehavior expandableTransformationBehavior, AnimatorSet animatorSet) {
        expandableTransformationBehavior.b = animatorSet;
        return animatorSet;
    }

    @Override
    protected boolean L(View view, View view2, boolean bl, boolean bl2) {
        AnimatorSet animatorSet = this.b;
        boolean bl3 = animatorSet != null;
        if (bl3) {
            animatorSet.cancel();
        }
        view = this.N(view, view2, bl, bl3);
        this.b = view;
        view.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final ExpandableTransformationBehavior a;
            {
                this.a = expandableTransformationBehavior;
            }

            public void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.M(this.a, null);
            }
        });
        this.b.start();
        if (!bl2) {
            this.b.end();
        }
        return true;
    }

    protected abstract AnimatorSet N(View var1, View var2, boolean var3, boolean var4);
}

