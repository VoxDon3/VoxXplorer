package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import ax.S.h;
import ax.g0.C2098c;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
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

    class a extends h.e {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ WeakReference c;

        a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // ax.S.h.e
        public void f(int i) {
        }

        @Override // ax.S.h.e
        public void g(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                typeface = f.a(typeface, i, (this.b & 2) != 0);
            }
            w.this.n(this.c, typeface);
        }
    }

    class b implements Runnable {
        final /* synthetic */ Typeface c0;
        final /* synthetic */ int d0;
        final /* synthetic */ TextView q;

        b(TextView textView, Typeface typeface, int i) {
            this.q = textView;
            this.c0 = typeface;
            this.d0 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.setTypeface(this.c0, this.d0);
        }
    }

    static class c {
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class d {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class e {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class f {
        static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    w(TextView textView) {
        this.a = textView;
        this.i = new y(textView);
    }

    private void B(int i, float f2) {
        this.i.t(i, f2);
    }

    private void C(Context context, L l) {
        String o;
        this.j = l.k(ax.m.j.E2, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int k = l.k(ax.m.j.N2, -1);
            this.k = k;
            if (k != -1) {
                this.j &= 2;
            }
        }
        int i2 = ax.m.j.M2;
        if (!l.s(i2) && !l.s(ax.m.j.O2)) {
            int i3 = ax.m.j.D2;
            if (l.s(i3)) {
                this.m = false;
                int k2 = l.k(i3, 1);
                if (k2 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (k2 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (k2 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i4 = ax.m.j.O2;
        if (l.s(i4)) {
            i2 = i4;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface j = l.j(i2, this.j, new a(i5, i6, new WeakReference(this.a)));
                if (j != null) {
                    if (i < 28 || this.k == -1) {
                        this.l = j;
                    } else {
                        this.l = f.a(Typeface.create(j, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (o = l.o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(o, this.j);
        } else {
            this.l = f.a(Typeface.create(o, 0), this.k, (this.j & 2) != 0);
        }
    }

    private void a(Drawable drawable, J j) {
        if (drawable == null || j == null) {
            return;
        }
        C0580k.i(drawable, j, this.a.getDrawableState());
    }

    private static J d(Context context, C0580k c0580k, int i) {
        ColorStateList f2 = c0580k.f(context, i);
        if (f2 == null) {
            return null;
        }
        J j = new J();
        j.d = true;
        j.a = f2;
        return j;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.a.getCompoundDrawables();
        TextView textView2 = this.a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        J j = this.h;
        this.b = j;
        this.c = j;
        this.d = j;
        this.e = j;
        this.f = j;
        this.g = j;
    }

    void A(int i, float f2) {
        if (O.c || l()) {
            return;
        }
        B(i, f2);
    }

    void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
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
        J j = this.h;
        if (j != null) {
            return j.a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        J j = this.h;
        if (j != null) {
            return j.b;
        }
        return null;
    }

    boolean l() {
        return this.i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e0  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    void o(boolean z, int i, int i2, int i3, int i4) {
        if (O.c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i) {
        String o;
        ColorStateList c2;
        ColorStateList c3;
        ColorStateList c4;
        L t = L.t(context, i, ax.m.j.B2);
        int i2 = ax.m.j.Q2;
        if (t.s(i2)) {
            s(t.a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = ax.m.j.F2;
            if (t.s(i4) && (c4 = t.c(i4)) != null) {
                this.a.setTextColor(c4);
            }
            int i5 = ax.m.j.H2;
            if (t.s(i5) && (c3 = t.c(i5)) != null) {
                this.a.setLinkTextColor(c3);
            }
            int i6 = ax.m.j.G2;
            if (t.s(i6) && (c2 = t.c(i6)) != null) {
                this.a.setHintTextColor(c2);
            }
        }
        int i7 = ax.m.j.C2;
        if (t.s(i7) && t.f(i7, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, t);
        if (i3 >= 26) {
            int i8 = ax.m.j.P2;
            if (t.s(i8) && (o = t.o(i8)) != null) {
                e.d(this.a, o);
            }
        }
        t.x();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C2098c.f(editorInfo, textView.getText());
    }

    void s(boolean z) {
        this.a.setAllCaps(z);
    }

    void t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.i.p(i, i2, i3, i4);
    }

    void u(int[] iArr, int i) throws IllegalArgumentException {
        this.i.q(iArr, i);
    }

    void v(int i) {
        this.i.r(i);
    }

    void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new J();
        }
        J j = this.h;
        j.a = colorStateList;
        j.d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new J();
        }
        J j = this.h;
        j.b = mode;
        j.c = mode != null;
        z();
    }
}
