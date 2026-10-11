package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import ax.R0.a;
import ax.S0.C0968a;

/* loaded from: classes.dex */
final class F {
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof ax.R0.f);
    }

    public static void c(a.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) C0968a.e(bVar.e()), new ax.q7.o() { // from class: androidx.media3.ui.D
                @Override // ax.q7.o
                public final boolean apply(Object obj) {
                    return F.b(obj);
                }
            });
        }
        d(bVar);
    }

    public static void d(a.b bVar) {
        bVar.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) C0968a.e(bVar.e()), new ax.q7.o() { // from class: androidx.media3.ui.E
                @Override // ax.q7.o
                public final boolean apply(Object obj) {
                    return F.a(obj);
                }
            });
        }
    }

    private static void e(Spannable spannable, ax.q7.o<Object> oVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (oVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}
