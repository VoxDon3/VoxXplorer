package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import ax.c0.C1760d0;
import ax.o.C2653a;

/* loaded from: classes.dex */
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
        J j = this.d;
        j.a();
        ColorStateList a = ax.h0.e.a(this.a);
        if (a != null) {
            j.d = true;
            j.a = a;
        }
        PorterDuff.Mode b = ax.h0.e.b(this.a);
        if (b != null) {
            j.c = true;
            j.b = b;
        }
        if (!j.d && !j.c) {
            return false;
        }
        C0580k.i(drawable, j, this.a.getDrawableState());
        return true;
    }

    private boolean l() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.b != null : i == 21;
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
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            J j = this.c;
            if (j != null) {
                C0580k.i(drawable, j, this.a.getDrawableState());
                return;
            }
            J j2 = this.b;
            if (j2 != null) {
                C0580k.i(drawable, j2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        J j = this.c;
        if (j != null) {
            return j.a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        J j = this.c;
        if (j != null) {
            return j.b;
        }
        return null;
    }

    boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.a.getContext();
        int[] iArr = ax.m.j.P;
        L v = L.v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.a;
        C1760d0.j0(imageView, imageView.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (n = v.n(ax.m.j.Q, -1)) != -1 && (drawable = C2653a.b(this.a.getContext(), n)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                A.b(drawable);
            }
            int i2 = ax.m.j.R;
            if (v.s(i2)) {
                ax.h0.e.c(this.a, v.c(i2));
            }
            int i3 = ax.m.j.S;
            if (v.s(i3)) {
                ax.h0.e.d(this.a, A.e(v.k(i3, -1), null));
            }
            v.x();
        } catch (Throwable th) {
            v.x();
            throw th;
        }
    }

    void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i) {
        if (i != 0) {
            Drawable b = C2653a.b(this.a.getContext(), i);
            if (b != null) {
                A.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new J();
        }
        J j = this.c;
        j.a = colorStateList;
        j.d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new J();
        }
        J j = this.c;
        j.b = mode;
        j.c = true;
        c();
    }
}
