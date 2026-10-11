/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ax.k6.c;
import com.google.android.material.progressindicator.a;
import com.google.android.material.progressindicator.g;
import com.google.android.material.progressindicator.k;
import com.google.android.material.progressindicator.l;
import com.google.android.material.progressindicator.m;
import com.google.android.material.progressindicator.n;
import com.google.android.material.progressindicator.o;

public class LinearProgressIndicator
extends a<o> {
    public static final int q = ax.k6.l.A;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.q);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8, q);
        this.t();
        this.k = true;
    }

    private void t() {
        l l8 = new l((o)this.a);
        this.setIndeterminateDrawable(com.google.android.material.progressindicator.k.w(this.getContext(), (o)this.a, l8));
        this.setProgressDrawable(g.B(this.getContext(), (o)this.a, l8));
    }

    public int getIndeterminateAnimationType() {
        return ((o)this.a).o;
    }

    public int getIndicatorDirection() {
        return ((o)this.a).p;
    }

    public int getTrackInnerCornerRadius() {
        return ((o)this.a).t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((o)this.a).s;
    }

    public int getTrackStopIndicatorSize() {
        return ((o)this.a).r;
    }

    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        block2: {
            boolean bl2;
            block3: {
                super.onLayout(bl, n8, n9, n10, n11);
                Object s8 = this.a;
                o o8 = (o)s8;
                n8 = ((o)s8).p;
                bl = bl2 = true;
                if (n8 == 1) break block2;
                if (this.getLayoutDirection() != 1) break block3;
                bl = bl2;
                if (((o)this.a).p == 2) break block2;
            }
            bl = this.getLayoutDirection() == 0 && ((o)this.a).p == 3 ? bl2 : false;
        }
        o8.q = bl;
    }

    protected void onSizeChanged(int n8, int n9, int n10, int n11) {
        n8 -= this.getPaddingLeft() + this.getPaddingRight();
        n9 -= this.getPaddingTop() + this.getPaddingBottom();
        Drawable drawable = this.getIndeterminateDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, n8, n9);
        }
        if ((drawable = this.getProgressDrawable()) != null) {
            drawable.setBounds(0, 0, n8, n9);
        }
    }

    @Override
    public void p(int n8, boolean bl) {
        Object s8 = this.a;
        if (s8 != null && ((o)s8).o == 0 && this.isIndeterminate()) {
            return;
        }
        super.p(n8, bl);
    }

    o s(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int n8) {
        if (((o)this.a).o == n8) {
            return;
        }
        if (this.r() && this.isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        Object s8 = this.a;
        ((o)s8).o = n8;
        ((o)s8).h();
        if (n8 == 0) {
            this.getIndeterminateDrawable().A(new m((o)this.a));
        } else {
            this.getIndeterminateDrawable().A(new n(this.getContext(), (o)this.a));
        }
        this.o();
        this.invalidate();
    }

    @Override
    public void setIndicatorColor(int ... nArray) {
        super.setIndicatorColor(nArray);
        ((o)this.a).h();
    }

    public void setIndicatorDirection(int n8) {
        boolean bl;
        block2: {
            boolean bl2;
            block3: {
                Object object = this.a;
                ((o)object).p = n8;
                object = (o)object;
                bl = bl2 = true;
                if (n8 == 1) break block2;
                if (this.getLayoutDirection() != 1) break block3;
                bl = bl2;
                if (((o)this.a).p == 2) break block2;
            }
            bl = this.getLayoutDirection() == 0 && n8 == 3 ? bl2 : false;
        }
        ((o)object).q = bl;
        this.invalidate();
    }

    @Override
    public void setTrackCornerRadius(int n8) {
        super.setTrackCornerRadius(n8);
        ((o)this.a).h();
        this.invalidate();
    }

    public void setTrackInnerCornerRadius(int n8) {
        Object s8 = this.a;
        if (((o)s8).t != n8) {
            ((o)s8).t = Math.round(Math.min((float)n8, (float)((o)s8).a / 2.0f));
            s8 = this.a;
            ((o)s8).v = false;
            ((o)s8).w = true;
            ((o)s8).h();
            this.invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f8) {
        Object s8 = this.a;
        if (((o)s8).u != f8) {
            ((o)s8).u = Math.min(f8, 0.5f);
            s8 = this.a;
            ((o)s8).v = true;
            ((o)s8).w = true;
            ((o)s8).h();
            this.invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer n8) {
        if (!j.Objects.equals((Object)((o)this.a).s, (Object)n8)) {
            ((o)this.a).s = n8;
            this.invalidate();
        }
    }

    public void setTrackStopIndicatorSize(int n8) {
        Object s8 = this.a;
        if (((o)s8).r != n8) {
            ((o)s8).r = Math.min(n8, ((o)s8).a);
            ((o)this.a).h();
            this.invalidate();
        }
    }
}

