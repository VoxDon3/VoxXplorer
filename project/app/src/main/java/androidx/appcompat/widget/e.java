/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.k;
import ax.c0.d0;
import ax.m.j;

class e {
    private final View a;
    private final k b;
    private int c = -1;
    private J d;
    private J e;
    private J f;

    e(View view) {
        this.a = view;
        this.b = k.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new J();
        }
        J j8 = this.f;
        j8.a();
        ColorStateList colorStateList = d0.s(this.a);
        if (colorStateList != null) {
            j8.d = true;
            j8.a = colorStateList;
        }
        if ((colorStateList = d0.t(this.a)) != null) {
            j8.c = true;
            j8.b = colorStateList;
        }
        if (!j8.d && !j8.c) {
            return false;
        }
        k.i(drawable, j8, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 > 21) {
            return this.d != null;
        }
        return n8 == 21;
    }

    void b() {
        Drawable drawable = this.a.getBackground();
        if (!(drawable == null || this.k() && this.a(drawable))) {
            J j8 = this.e;
            if (j8 != null) {
                k.i(drawable, j8, this.a.getDrawableState());
                return;
            }
            j8 = this.d;
            if (j8 != null) {
                k.i(drawable, j8, this.a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        J j8 = this.e;
        if (j8 != null) {
            return j8.a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        J j8 = this.e;
        if (j8 != null) {
            return j8.b;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void e(AttributeSet attributeSet, int n8) {
        Throwable throwable2;
        Object object;
        block5: {
            block4: {
                object = this.a.getContext();
                int[] nArray = j.z3;
                object = L.v((Context)object, attributeSet, nArray, n8, 0);
                View view = this.a;
                d0.j0(view, view.getContext(), nArray, attributeSet, ((L)object).r(), n8, 0);
                try {
                    n8 = j.A3;
                    if (!((L)object).s(n8)) break block4;
                    this.c = ((L)object).n(n8, -1);
                    attributeSet = this.b.f(this.a.getContext(), this.c);
                    if (attributeSet == null) break block4;
                    this.h((ColorStateList)attributeSet);
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            if (((L)object).s(n8 = j.B3)) {
                d0.p0(this.a, ((L)object).c(n8));
            }
            if (((L)object).s(n8 = j.C3)) {
                d0.q0(this.a, A.e(((L)object).k(n8, -1), null));
            }
            ((L)object).x();
            return;
        }
        ((L)object).x();
        throw throwable2;
    }

    void f(Drawable drawable) {
        this.c = -1;
        this.h(null);
        this.b();
    }

    void g(int n8) {
        this.c = n8;
        k k8 = this.b;
        k8 = k8 != null ? k8.f(this.a.getContext(), n8) : null;
        this.h((ColorStateList)k8);
        this.b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new J();
            }
            J j8 = this.d;
            j8.a = colorStateList;
            j8.d = true;
        } else {
            this.d = null;
        }
        this.b();
    }

    void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new J();
        }
        J j8 = this.e;
        j8.a = colorStateList;
        j8.d = true;
        this.b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new J();
        }
        J j8 = this.e;
        j8.b = mode;
        j8.c = true;
        this.b();
    }
}

