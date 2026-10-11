/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.k;
import ax.c0.d0;
import ax.h0.e;
import ax.m.j;
import ax.o.a;

public class q {
    private final ImageView a;
    private J b;
    private J c;
    private J d;
    private int e = 0;

    public q(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new J();
        }
        J j8 = this.d;
        j8.a();
        ColorStateList colorStateList = ax.h0.e.a(this.a);
        if (colorStateList != null) {
            j8.d = true;
            j8.a = colorStateList;
        }
        if ((colorStateList = ax.h0.e.b(this.a)) != null) {
            j8.c = true;
            j8.b = colorStateList;
        }
        if (!j8.d && !j8.c) {
            return false;
        }
        k.i(drawable, j8, this.a.getDrawableState());
        return true;
    }

    private boolean l() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 > 21) {
            return this.b != null;
        }
        return n8 == 21;
    }

    void b() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    void c() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            A.b(drawable);
        }
        if (!(drawable == null || this.l() && this.a(drawable))) {
            J j8 = this.c;
            if (j8 != null) {
                k.i(drawable, j8, this.a.getDrawableState());
                return;
            }
            j8 = this.b;
            if (j8 != null) {
                k.i(drawable, j8, this.a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        J j8 = this.c;
        if (j8 != null) {
            return j8.a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        J j8 = this.c;
        if (j8 != null) {
            return j8.b;
        }
        return null;
    }

    boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(AttributeSet object, int n8) {
        Throwable throwable2;
        Object object2;
        block6: {
            block5: {
                object2 = this.a.getContext();
                Object object3 = j.P;
                object2 = L.v((Context)object2, object, object3, n8, 0);
                ImageView imageView = this.a;
                d0.j0((View)imageView, imageView.getContext(), object3, object, ((L)object2).r(), n8, 0);
                try {
                    object3 = this.a.getDrawable();
                    object = object3;
                    if (object3 != null) break block5;
                    n8 = ((L)object2).n(j.Q, -1);
                    object = object3;
                    if (n8 == -1) break block5;
                    object3 = ax.o.a.b(this.a.getContext(), n8);
                    object = object3;
                    if (object3 == null) break block5;
                    this.a.setImageDrawable((Drawable)object3);
                    object = object3;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            if (object != null) {
                A.b((Drawable)object);
            }
            if (((L)object2).s(n8 = j.R)) {
                ax.h0.e.c(this.a, ((L)object2).c(n8));
            }
            if (((L)object2).s(n8 = j.S)) {
                ax.h0.e.d(this.a, A.e(((L)object2).k(n8, -1), null));
            }
            ((L)object2).x();
            return;
        }
        ((L)object2).x();
        throw throwable2;
    }

    void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int n8) {
        if (n8 != 0) {
            Drawable drawable = ax.o.a.b(this.a.getContext(), n8);
            if (drawable != null) {
                A.b(drawable);
            }
            this.a.setImageDrawable(drawable);
        } else {
            this.a.setImageDrawable(null);
        }
        this.c();
    }

    void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new J();
        }
        J j8 = this.c;
        j8.a = colorStateList;
        j8.d = true;
        this.c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new J();
        }
        J j8 = this.c;
        j8.b = mode;
        j8.c = true;
        this.c();
    }
}

