/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.ui.D;
import androidx.media3.ui.E;
import ax.R0.a;
import ax.R0.f;
import ax.S0.a;
import ax.q7.o;

final class F {
    public static /* synthetic */ boolean a(Object object) {
        return object instanceof AbsoluteSizeSpan || object instanceof RelativeSizeSpan;
        {
        }
    }

    public static /* synthetic */ boolean b(Object object) {
        return object instanceof f ^ true;
    }

    public static void c(a.b b8) {
        b8.b();
        if (b8.e() instanceof Spanned) {
            if (!(b8.e() instanceof Spannable)) {
                b8.o((CharSequence)SpannableString.valueOf((CharSequence)b8.e()));
            }
            F.e((Spannable)a.e(b8.e()), new D());
        }
        F.d(b8);
    }

    public static void d(a.b b8) {
        b8.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (b8.e() instanceof Spanned) {
            if (!(b8.e() instanceof Spannable)) {
                b8.o((CharSequence)SpannableString.valueOf((CharSequence)b8.e()));
            }
            F.e((Spannable)a.e(b8.e()), new E());
        }
    }

    private static void e(Spannable spannable, o<Object> o8) {
        int n8 = spannable.length();
        for (Object object : spannable.getSpans(0, n8, Object.class)) {
            if (!o8.apply(object)) continue;
            spannable.removeSpan(object);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float f(int n8, float f8, int n9, int n10) {
        float f9;
        if (f8 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) return f8;
                return -3.4028235E38f;
            }
            f9 = n9;
            return f8 * f9;
        }
        f9 = n10;
        return f8 * f9;
    }
}

