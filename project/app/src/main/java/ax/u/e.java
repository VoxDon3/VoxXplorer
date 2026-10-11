/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.L;
import ax.U.a;
import ax.c0.d0;
import ax.m.j;
import ax.u.b;

class e
extends b {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f = null;
    private PorterDuff.Mode g = null;
    private boolean h = false;
    private boolean i = false;

    e(SeekBar seekBar) {
        super((ProgressBar)seekBar);
        this.d = seekBar;
    }

    private void f() {
        Drawable drawable = this.e;
        if (drawable != null && (this.h || this.i)) {
            this.e = drawable = a.r(drawable.mutate());
            if (this.h) {
                a.o(drawable, this.f);
            }
            if (this.i) {
                a.p(this.e, this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    @Override
    void c(AttributeSet attributeSet, int n8) {
        super.c(attributeSet, n8);
        Object object = this.d.getContext();
        int[] nArray = j.T;
        object = L.v((Context)object, attributeSet, nArray, n8, 0);
        SeekBar seekBar = this.d;
        d0.j0((View)seekBar, seekBar.getContext(), nArray, attributeSet, ((L)object).r(), n8, 0);
        attributeSet = ((L)object).h(j.U);
        if (attributeSet != null) {
            this.d.setThumb((Drawable)attributeSet);
        }
        this.j(((L)object).g(j.V));
        n8 = j.X;
        if (((L)object).s(n8)) {
            this.g = A.e(((L)object).k(n8, -1), this.g);
            this.i = true;
        }
        if (((L)object).s(n8 = j.W)) {
            this.f = ((L)object).c(n8);
            this.h = true;
        }
        ((L)object).x();
        this.f();
    }

    void g(Canvas canvas) {
        if (this.e != null) {
            int n8 = this.d.getMax();
            int n9 = 1;
            if (n8 > 1) {
                int n10 = this.e.getIntrinsicWidth();
                int n11 = this.e.getIntrinsicHeight();
                n10 = n10 >= 0 ? (n10 /= 2) : 1;
                if (n11 >= 0) {
                    n9 = n11 / 2;
                }
                this.e.setBounds(-n10, -n9, n10, n9);
                float f8 = (float)(this.d.getWidth() - this.d.getPaddingLeft() - this.d.getPaddingRight()) / (float)n8;
                n9 = canvas.save();
                canvas.translate((float)this.d.getPaddingLeft(), (float)(this.d.getHeight() / 2));
                for (n10 = 0; n10 <= n8; ++n10) {
                    this.e.draw(canvas);
                    canvas.translate(f8, 0.0f);
                }
                canvas.restoreToCount(n9);
            }
        }
    }

    void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this.d);
            a.m(drawable, this.d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            this.f();
        }
        this.d.invalidate();
    }
}

