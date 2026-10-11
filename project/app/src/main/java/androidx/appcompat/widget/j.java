/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.L;
import ax.U.a;
import ax.c0.d0;
import ax.h0.c;

class j {
    private final CompoundButton a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    j(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    void a() {
        Drawable drawable = ax.h0.c.a(this.a);
        if (drawable != null && (this.d || this.e)) {
            drawable = ax.U.a.r(drawable).mutate();
            if (this.d) {
                ax.U.a.o(drawable, this.b);
            }
            if (this.e) {
                ax.U.a.p(drawable, this.c);
            }
            if (drawable.isStateful()) {
                drawable.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(drawable);
        }
    }

    ColorStateList b() {
        return this.b;
    }

    PorterDuff.Mode c() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void d(AttributeSet attributeSet, int n8) {
        Object object = this.a.getContext();
        int[] nArray = ax.m.j.U0;
        object = L.v((Context)object, attributeSet, nArray, n8, 0);
        CompoundButton compoundButton = this.a;
        d0.j0((View)compoundButton, compoundButton.getContext(), nArray, attributeSet, ((L)object).r(), n8, 0);
        try {
            block8: {
                n8 = ax.m.j.W0;
                if (((L)object).s(n8) && (n8 = ((L)object).n(n8, 0)) != 0) {
                    try {
                        attributeSet = this.a;
                        attributeSet.setButtonDrawable(ax.o.a.b(attributeSet.getContext(), n8));
                        break block8;
                    }
                    catch (Resources.NotFoundException notFoundException) {}
                }
                if (((L)object).s(n8 = ax.m.j.V0) && (n8 = ((L)object).n(n8, 0)) != 0) {
                    attributeSet = this.a;
                    attributeSet.setButtonDrawable(ax.o.a.b(attributeSet.getContext(), n8));
                }
            }
            n8 = ax.m.j.X0;
            if (((L)object).s(n8)) {
                ax.h0.c.d(this.a, ((L)object).c(n8));
            }
            if (((L)object).s(n8 = ax.m.j.Y0)) {
                ax.h0.c.e(this.a, A.e(((L)object).k(n8, -1), null));
            }
            ((L)object).x();
            return;
        }
        catch (Throwable throwable) {}
        ((L)object).x();
        throw throwable;
    }

    void e() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        this.a();
    }

    void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        this.a();
    }

    void g(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        this.a();
    }
}

