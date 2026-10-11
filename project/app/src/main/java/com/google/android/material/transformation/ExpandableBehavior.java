/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.E6.a;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior
extends CoordinatorLayout.c<View> {
    private int a = 0;

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean J(boolean bl) {
        if (bl) {
            int n8 = this.a;
            return n8 == 0 || n8 == 2;
            {
            }
        }
        return this.a == 1;
    }

    protected a K(CoordinatorLayout coordinatorLayout, View view) {
        List<View> list = coordinatorLayout.r(view);
        int n8 = list.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view2 = list.get(i8);
            if (!this.i(coordinatorLayout, view, view2)) continue;
            return (a)view2;
        }
        return null;
    }

    protected abstract boolean L(View var1, View var2, boolean var3, boolean var4);

    @Override
    public abstract boolean i(CoordinatorLayout var1, View var2, View var3);

    @Override
    public boolean l(CoordinatorLayout object, View view, View view2) {
        object = (a)view2;
        if (this.J(object.a())) {
            int n8 = object.a() ? 1 : 2;
            this.a = n8;
            return this.L((View)object, view, object.a(), true);
        }
        return false;
    }

    @Override
    public boolean p(CoordinatorLayout object, View view, int n8) {
        if (!view.isLaidOut() && (object = this.K((CoordinatorLayout)object, view)) != null && this.J(object.a())) {
            n8 = object.a() ? 1 : 2;
            this.a = n8;
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(){
                final View a;
                final int b;
                final a c;
                final ExpandableBehavior d;
                {
                    this.d = expandableBehavior;
                    this.a = view;
                    this.b = n8;
                    this.c = a8;
                }

                public boolean onPreDraw() {
                    this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                    if (this.d.a == this.b) {
                        ExpandableBehavior expandableBehavior = this.d;
                        a a8 = this.c;
                        expandableBehavior.L((View)a8, this.a, a8.a(), false);
                    }
                    return false;
                }
            });
        }
        return false;
    }
}

