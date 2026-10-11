package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import ax.c0.C1760d0;

/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0574e {
    private final View a;
    private J d;
    private J e;
    private J f;
    private int c = -1;
    private final C0580k b = C0580k.b();

    C0574e(View view) {
        this.a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new J();
        }
        J j = this.f;
        j.a();
        ColorStateList s = C1760d0.s(this.a);
        if (s != null) {
            j.d = true;
            j.a = s;
        }
        PorterDuff.Mode t = C1760d0.t(this.a);
        if (t != null) {
            j.c = true;
            j.b = t;
        }
        if (!j.d && !j.c) {
            return false;
        }
        C0580k.i(drawable, j, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }

    void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            J j = this.e;
            if (j != null) {
                C0580k.i(background, j, this.a.getDrawableState());
                return;
            }
            J j2 = this.d;
            if (j2 != null) {
                C0580k.i(background, j2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        J j = this.e;
        if (j != null) {
            return j.a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        J j = this.e;
        if (j != null) {
            return j.b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i) {
        Context context = this.a.getContext();
        int[] iArr = ax.m.j.z3;
        L v = L.v(context, attributeSet, iArr, i, 0);
        View view = this.a;
        C1760d0.j0(view, view.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            int i2 = ax.m.j.A3;
            if (v.s(i2)) {
                this.c = v.n(i2, -1);
                ColorStateList f = this.b.f(this.a.getContext(), this.c);
                if (f != null) {
                    h(f);
                }
            }
            int i3 = ax.m.j.B3;
            if (v.s(i3)) {
                C1760d0.p0(this.a, v.c(i3));
            }
            int i4 = ax.m.j.C3;
            if (v.s(i4)) {
                C1760d0.q0(this.a, A.e(v.k(i4, -1), null));
            }
            v.x();
        } catch (Throwable th) {
            v.x();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    void g(int i) {
        this.c = i;
        C0580k c0580k = this.b;
        h(c0580k != null ? c0580k.f(this.a.getContext(), i) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new J();
            }
            J j = this.d;
            j.a = colorStateList;
            j.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new J();
        }
        J j = this.e;
        j.a = colorStateList;
        j.d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new J();
        }
        J j = this.e;
        j.b = mode;
        j.c = true;
        b();
    }
}
