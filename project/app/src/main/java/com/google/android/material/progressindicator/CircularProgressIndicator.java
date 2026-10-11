/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import ax.k6.l;
import com.google.android.material.progressindicator.a;
import com.google.android.material.progressindicator.c;
import com.google.android.material.progressindicator.d;
import com.google.android.material.progressindicator.e;
import com.google.android.material.progressindicator.f;
import com.google.android.material.progressindicator.g;
import com.google.android.material.progressindicator.j;
import com.google.android.material.progressindicator.k;

public class CircularProgressIndicator
extends a<f> {
    public static final int q = l.w;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.e);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8, q);
        this.t();
        this.k = true;
    }

    private void t() {
        c c8 = new c((f)this.a);
        this.setIndeterminateDrawable(com.google.android.material.progressindicator.k.v(this.getContext(), (f)this.a, c8));
        this.setProgressDrawable(g.A(this.getContext(), (f)this.a, c8));
    }

    public int getIndeterminateAnimationType() {
        return ((f)this.a).o;
    }

    public int getIndicatorDirection() {
        return ((f)this.a).r;
    }

    public int getIndicatorInset() {
        return ((f)this.a).q;
    }

    public int getIndicatorSize() {
        return ((f)this.a).p;
    }

    f s(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int n8) {
        if (((f)this.a).o == n8) {
            return;
        }
        if (this.r() && this.isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        Object object = this.a;
        ((f)object).o = n8;
        ((f)object).h();
        object = n8 == 1 ? new e(this.getContext(), (f)this.a) : new d((f)this.a);
        this.getIndeterminateDrawable().A((j<ObjectAnimator>)object);
        this.o();
        this.invalidate();
    }

    public void setIndicatorDirection(int n8) {
        ((f)this.a).r = n8;
        this.invalidate();
    }

    public void setIndicatorInset(int n8) {
        Object s8 = this.a;
        if (((f)s8).q != n8) {
            ((f)s8).q = n8;
            this.invalidate();
        }
    }

    public void setIndicatorSize(int n8) {
        n8 = Math.max(n8, this.getTrackThickness() * 2);
        Object s8 = this.a;
        if (((f)s8).p != n8) {
            ((f)s8).p = n8;
            ((f)s8).h();
            this.requestLayout();
            this.invalidate();
        }
    }

    @Override
    public void setTrackThickness(int n8) {
        super.setTrackThickness(n8);
        ((f)this.a).h();
    }
}

