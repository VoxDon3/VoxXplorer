/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.y;
import ax.S.h;
import ax.c0.d0;
import ax.h0.j;
import java.lang.ref.WeakReference;
import java.util.Locale;

class w {
    private final TextView a;
    private J b;
    private J c;
    private J d;
    private J e;
    private J f;
    private J g;
    private J h;
    private final y i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    w(TextView textView) {
        this.a = textView;
        this.i = new y(textView);
    }

    private void B(int n8, float f8) {
        this.i.t(n8, f8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void C(Context object, L l8) {
        boolean bl;
        boolean bl2;
        int n8;
        block13: {
            this.j = l8.k(ax.m.j.E2, this.j);
            int n9 = Build.VERSION.SDK_INT;
            if (n9 >= 28) {
                this.k = n8 = l8.k(ax.m.j.N2, -1);
                if (n8 != -1) {
                    this.j &= 2;
                }
            }
            n8 = ax.m.j.M2;
            bl2 = l8.s(n8);
            bl = true;
            if (!bl2 && !l8.s(ax.m.j.O2)) {
                n8 = ax.m.j.D2;
                if (!l8.s(n8)) return;
                this.m = false;
                if ((n8 = l8.k(n8, 1)) == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                }
                if (n8 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                }
                if (n8 != 3) {
                    return;
                }
                this.l = Typeface.MONOSPACE;
                return;
            }
            this.l = null;
            int n10 = ax.m.j.O2;
            if (l8.s(n10)) {
                n8 = n10;
            }
            n10 = this.k;
            int n11 = this.j;
            if (!object.isRestricted()) {
                block11: {
                    block12: {
                        object = new h.e(this, n10, n11, new WeakReference<TextView>(this.a)){
                            final int a;
                            final int b;
                            final WeakReference c;
                            final w d;
                            {
                                this.d = w8;
                                this.a = n8;
                                this.b = n9;
                                this.c = weakReference;
                            }

                            @Override
                            public void f(int n8) {
                            }

                            @Override
                            public void g(Typeface typeface) {
                                Typeface typeface2 = typeface;
                                if (Build.VERSION.SDK_INT >= 28) {
                                    int n8 = this.a;
                                    typeface2 = typeface;
                                    if (n8 != -1) {
                                        boolean bl = (this.b & 2) != 0;
                                        typeface2 = androidx.appcompat.widget.w$f.a(typeface, n8, bl);
                                    }
                                }
                                this.d.n(this.c, typeface2);
                            }
                        };
                        try {
                            object = l8.j(n8, this.j, (h.e)object);
                            if (object == null) break block11;
                            if (n9 < 28 || this.k == -1) break block12;
                            object = Typeface.create((Typeface)object, (int)0);
                            n10 = this.k;
                            bl2 = (this.j & 2) != 0;
                            this.l = androidx.appcompat.widget.w$f.a((Typeface)object, n10, bl2);
                            break block11;
                        }
                        catch (Resources.NotFoundException | UnsupportedOperationException throwable) {
                            break block13;
                        }
                    }
                    this.l = object;
                }
                bl2 = this.l == null;
                this.m = bl2;
            }
        }
        if (this.l != null) return;
        object = l8.o(n8);
        if (object == null) return;
        if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
            object = Typeface.create((String)object, (int)0);
            n8 = this.k;
            bl2 = (this.j & 2) != 0 ? bl : false;
            this.l = androidx.appcompat.widget.w$f.a((Typeface)object, n8, bl2);
            return;
        }
        this.l = Typeface.create((String)object, (int)this.j);
    }

    private void a(Drawable drawable, J j8) {
        if (drawable != null && j8 != null) {
            androidx.appcompat.widget.k.i(drawable, j8, this.a.getDrawableState());
        }
    }

    private static J d(Context context, k object, int n8) {
        if ((context = ((k)object).f(context, n8)) != null) {
            object = new J();
            ((J)object).d = true;
            ((J)object).a = context;
            return object;
        }
        return null;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawableArray) {
        if (drawable5 == null && drawableArray == null) {
            if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
                return;
            }
            drawableArray = this.a.getCompoundDrawablesRelative();
            drawable5 = drawableArray[0];
            if (drawable5 == null && drawableArray[2] == null) {
                drawableArray = this.a.getCompoundDrawables();
                drawable5 = this.a;
                if (drawable == null) {
                    drawable = drawableArray[0];
                }
                if (drawable2 == null) {
                    drawable2 = drawableArray[1];
                }
                if (drawable3 == null) {
                    drawable3 = drawableArray[2];
                }
                if (drawable4 == null) {
                    drawable4 = drawableArray[3];
                }
                drawable5.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            if (drawable2 == null) {
                drawable2 = drawableArray[1];
            }
            if (drawable4 == null) {
                drawable4 = drawableArray[3];
            }
            this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawableArray[2], drawable4);
            return;
        }
        drawable = this.a.getCompoundDrawablesRelative();
        if (drawable5 == null) {
            drawable5 = drawable[0];
        }
        if (drawable2 == null) {
            drawable2 = drawable[1];
        }
        if (drawableArray == null) {
            drawableArray = drawable[2];
        }
        drawable3 = this.a;
        if (drawable4 == null) {
            drawable4 = drawable[3];
        }
        drawable3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, (Drawable)drawableArray, drawable4);
    }

    private void z() {
        J j8;
        this.b = j8 = this.h;
        this.c = j8;
        this.d = j8;
        this.e = j8;
        this.f = j8;
        this.g = j8;
    }

    void A(int n8, float f8) {
        if (!O.c && !this.l()) {
            this.B(n8, f8);
        }
    }

    void b() {
        Drawable[] drawableArray;
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            drawableArray = this.a.getCompoundDrawables();
            this.a(drawableArray[0], this.b);
            this.a(drawableArray[1], this.c);
            this.a(drawableArray[2], this.d);
            this.a(drawableArray[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        drawableArray = this.a.getCompoundDrawablesRelative();
        this.a(drawableArray[0], this.f);
        this.a(drawableArray[2], this.g);
    }

    void c() {
        this.i.a();
    }

    int e() {
        return this.i.f();
    }

    int f() {
        return this.i.g();
    }

    int g() {
        return this.i.h();
    }

    int[] h() {
        return this.i.i();
    }

    int i() {
        return this.i.j();
    }

    ColorStateList j() {
        J j8 = this.h;
        if (j8 != null) {
            return j8.a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        J j8 = this.h;
        if (j8 != null) {
            return j8.b;
        }
        return null;
    }

    boolean l() {
        return this.i.n();
    }

    @SuppressLint(value={"NewApi"})
    void m(AttributeSet object, int n8) {
        float f8;
        Object object2;
        String string;
        int n9;
        boolean bl;
        Object object3;
        Context context = this.a.getContext();
        k k8 = androidx.appcompat.widget.k.b();
        Object object4 = ax.m.j.Y;
        L l8 = L.v(context, object, object4, n8, 0);
        Object object5 = this.a;
        d0.j0((View)object5, object5.getContext(), object4, object, l8.r(), n8, 0);
        int n10 = l8.n(ax.m.j.Z, -1);
        int n11 = ax.m.j.c0;
        if (l8.s(n11)) {
            this.b = w.d(context, k8, l8.n(n11, 0));
        }
        if (l8.s(n11 = ax.m.j.a0)) {
            this.c = w.d(context, k8, l8.n(n11, 0));
        }
        if (l8.s(n11 = ax.m.j.d0)) {
            this.d = w.d(context, k8, l8.n(n11, 0));
        }
        if (l8.s(n11 = ax.m.j.b0)) {
            this.e = w.d(context, k8, l8.n(n11, 0));
        }
        if (l8.s(n11 = ax.m.j.e0)) {
            this.f = w.d(context, k8, l8.n(n11, 0));
        }
        if (l8.s(n11 = ax.m.j.f0)) {
            this.g = w.d(context, k8, l8.n(n11, 0));
        }
        l8.x();
        boolean bl2 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (n10 != -1) {
            object3 = L.t(context, n10, ax.m.j.B2);
            if (!bl2 && ((L)object3).s(n10 = ax.m.j.Q2)) {
                bl = ((L)object3).a(n10, false);
                n10 = 1;
            } else {
                bl = false;
                n10 = 0;
            }
            this.C(context, (L)object3);
            n11 = Build.VERSION.SDK_INT;
            if (n11 < 23) {
                n9 = ax.m.j.F2;
                object5 = ((L)object3).s(n9) ? ((L)object3).c(n9) : null;
                n9 = ax.m.j.G2;
                l8 = ((L)object3).s(n9) ? ((L)object3).c(n9) : null;
                n9 = ax.m.j.H2;
                object4 = ((L)object3).s(n9) ? (Object)((L)object3).c(n9) : null;
            } else {
                object4 = null;
                object5 = null;
                l8 = null;
            }
            n9 = ax.m.j.R2;
            string = ((L)object3).s(n9) ? ((L)object3).o(n9) : null;
            object2 = n11 >= 26 && ((L)object3).s(n11 = ax.m.j.P2) ? ((L)object3).o(n11) : null;
            ((L)object3).x();
            object3 = object4;
            object4 = l8;
            l8 = object2;
        } else {
            string = null;
            object3 = null;
            object5 = null;
            object4 = null;
            bl = false;
            n10 = 0;
            l8 = null;
        }
        L l9 = L.v(context, object, ax.m.j.B2, n8, 0);
        boolean bl3 = bl;
        n11 = n10;
        if (!bl2) {
            n9 = ax.m.j.Q2;
            bl3 = bl;
            n11 = n10;
            if (l9.s(n9)) {
                bl3 = l9.a(n9, false);
                n11 = 1;
            }
        }
        n10 = Build.VERSION.SDK_INT;
        Object object6 = object3;
        object2 = object5;
        int[] nArray = object4;
        if (n10 < 23) {
            n9 = ax.m.j.F2;
            if (l9.s(n9)) {
                object5 = l9.c(n9);
            }
            if (l9.s(n9 = ax.m.j.G2)) {
                object4 = l9.c(n9);
            }
            n9 = ax.m.j.H2;
            object6 = object3;
            object2 = object5;
            nArray = object4;
            if (l9.s(n9)) {
                object6 = l9.c(n9);
                nArray = object4;
                object2 = object5;
            }
        }
        if (l9.s(n9 = ax.m.j.R2)) {
            string = l9.o(n9);
        }
        object4 = l8;
        if (n10 >= 26) {
            n9 = ax.m.j.P2;
            object4 = l8;
            if (l9.s(n9)) {
                object4 = l9.o(n9);
            }
        }
        if (n10 >= 28 && l9.s(n9 = ax.m.j.C2) && l9.f(n9, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.C(context, l9);
        l9.x();
        if (object2 != null) {
            this.a.setTextColor((ColorStateList)object2);
        }
        if (nArray != null) {
            this.a.setHintTextColor((ColorStateList)nArray);
        }
        if (object6 != null) {
            this.a.setLinkTextColor((ColorStateList)object6);
        }
        if (!bl2 && n11 != 0) {
            this.s(bl3);
        }
        if ((object5 = this.l) != null) {
            if (this.k == -1) {
                this.a.setTypeface((Typeface)object5, this.j);
            } else {
                this.a.setTypeface((Typeface)object5);
            }
        }
        if (object4 != null) {
            androidx.appcompat.widget.w$e.d(this.a, (String)object4);
        }
        if (string != null) {
            if (n10 >= 24) {
                androidx.appcompat.widget.w$d.b(this.a, androidx.appcompat.widget.w$d.a(string));
            } else {
                object4 = string.split(",")[0];
                this.a.setTextLocale(androidx.appcompat.widget.w$c.a((String)object4));
            }
        }
        this.i.o((AttributeSet)object, n8);
        if (O.c && this.i.j() != 0 && ((int[])(object4 = this.i.i())).length > 0) {
            if ((float)androidx.appcompat.widget.w$e.a(this.a) != -1.0f) {
                androidx.appcompat.widget.w$e.b(this.a, this.i.g(), this.i.f(), this.i.h(), 0);
            } else {
                androidx.appcompat.widget.w$e.c(this.a, object4, 0);
            }
        }
        object = (n8 = ((L)(object2 = L.u(context, object, ax.m.j.g0))).n(ax.m.j.o0, -1)) != -1 ? k8.c(context, n8) : null;
        n8 = ((L)object2).n(ax.m.j.t0, -1);
        object4 = n8 != -1 ? (Object)k8.c(context, n8) : null;
        n8 = ((L)object2).n(ax.m.j.p0, -1);
        object5 = n8 != -1 ? k8.c(context, n8) : null;
        n8 = ((L)object2).n(ax.m.j.m0, -1);
        l8 = n8 != -1 ? k8.c(context, n8) : null;
        n8 = ((L)object2).n(ax.m.j.q0, -1);
        string = n8 != -1 ? k8.c(context, n8) : null;
        n8 = ((L)object2).n(ax.m.j.n0, -1);
        object3 = n8 != -1 ? k8.c(context, n8) : null;
        this.y((Drawable)object, (Drawable)object4, (Drawable)object5, (Drawable)l8, (Drawable)string, (Drawable)object3);
        n8 = ax.m.j.r0;
        if (((L)object2).s(n8)) {
            object = ((L)object2).c(n8);
            ax.h0.j.f(this.a, (ColorStateList)object);
        }
        if (((L)object2).s(n8 = ax.m.j.s0)) {
            object = A.e(((L)object2).k(n8, -1), null);
            ax.h0.j.g(this.a, (PorterDuff.Mode)object);
        }
        n11 = ((L)object2).f(ax.m.j.v0, -1);
        n10 = ((L)object2).f(ax.m.j.w0, -1);
        n8 = ax.m.j.x0;
        if (((L)object2).s(n8)) {
            object = ((L)object2).w(n8);
            if (object != null && object.type == 5) {
                n8 = ax.b0.j.a(object.data);
                f8 = TypedValue.complexToFloat((int)object.data);
            } else {
                f8 = ((L)object2).f(n8, -1);
                n8 = -1;
            }
        } else {
            n8 = -1;
            f8 = -1.0f;
        }
        ((L)object2).x();
        if (n11 != -1) {
            ax.h0.j.h(this.a, n11);
        }
        if (n10 != -1) {
            ax.h0.j.i(this.a, n10);
        }
        if (f8 != -1.0f) {
            if (n8 == -1) {
                ax.h0.j.j(this.a, (int)f8);
                return;
            }
            ax.h0.j.k(this.a, n8, f8);
        }
    }

    void n(WeakReference<TextView> textView, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            if ((textView = (TextView)textView.get()) != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new Runnable(){
                        final Typeface c0;
                        final int d0;
                        final w e0;
                        final TextView q;
                        {
                            this.e0 = w8;
                            this.q = textView;
                            this.c0 = typeface;
                            this.d0 = n8;
                        }

                        @Override
                        public void run() {
                            this.q.setTypeface(this.c0, this.d0);
                        }
                    });
                    return;
                }
                textView.setTypeface(typeface, this.j);
            }
        }
    }

    void o(boolean bl, int n8, int n9, int n10, int n11) {
        if (!O.c) {
            this.c();
        }
    }

    void p() {
        this.b();
    }

    void q(Context object, int n8) {
        int n9;
        L l8 = L.t(object, n8, ax.m.j.B2);
        if (l8.s(n8 = ax.m.j.Q2)) {
            this.s(l8.a(n8, false));
        }
        if ((n8 = Build.VERSION.SDK_INT) < 23) {
            ColorStateList colorStateList;
            n9 = ax.m.j.F2;
            if (l8.s(n9) && (colorStateList = l8.c(n9)) != null) {
                this.a.setTextColor(colorStateList);
            }
            if (l8.s(n9 = ax.m.j.H2) && (colorStateList = l8.c(n9)) != null) {
                this.a.setLinkTextColor(colorStateList);
            }
            if (l8.s(n9 = ax.m.j.G2) && (colorStateList = l8.c(n9)) != null) {
                this.a.setHintTextColor(colorStateList);
            }
        }
        if (l8.s(n9 = ax.m.j.C2) && l8.f(n9, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.C((Context)object, l8);
        if (n8 >= 26 && l8.s(n8 = ax.m.j.P2) && (object = l8.o(n8)) != null) {
            androidx.appcompat.widget.w$e.d(this.a, (String)object);
        }
        l8.x();
        object = this.l;
        if (object != null) {
            this.a.setTypeface((Typeface)object, this.j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            ax.g0.c.f(editorInfo, textView.getText());
        }
    }

    void s(boolean bl) {
        this.a.setAllCaps(bl);
    }

    void t(int n8, int n9, int n10, int n11) throws IllegalArgumentException {
        this.i.p(n8, n9, n10, n11);
    }

    void u(int[] nArray, int n8) throws IllegalArgumentException {
        this.i.q(nArray, n8);
    }

    void v(int n8) {
        this.i.r(n8);
    }

    void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new J();
        }
        J j8 = this.h;
        j8.a = colorStateList;
        boolean bl = colorStateList != null;
        j8.d = bl;
        this.z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new J();
        }
        J j8 = this.h;
        j8.b = mode;
        boolean bl = mode != null;
        j8.c = bl;
        this.z();
    }

    static class c {
        static Locale a(String string) {
            return Locale.forLanguageTag(string);
        }
    }

    static class d {
        static LocaleList a(String string) {
            return LocaleList.forLanguageTags((String)string);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class e {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int n8, int n9, int n10, int n11) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(n8, n9, n10, n11);
        }

        static void c(TextView textView, int[] nArray, int n8) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(nArray, n8);
        }

        static boolean d(TextView textView, String string) {
            return textView.setFontVariationSettings(string);
        }
    }

    static class f {
        static Typeface a(Typeface typeface, int n8, boolean bl) {
            return Typeface.create((Typeface)typeface, (int)n8, (boolean)bl);
        }
    }
}

