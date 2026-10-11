package ax.T1;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import ax.R0.i;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.d0;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes.dex */
final class f {
    @SuppressLint({"WrongConstant"})
    public static void a(Spannable spannable, int i, int i2, g gVar, c cVar, Map<String, g> map, int i3) {
        c e;
        g f;
        int i4;
        if (gVar.n() != -1) {
            spannable.setSpan(new StyleSpan(gVar.n()), i, i2, 33);
        }
        if (gVar.u()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (gVar.v()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (gVar.s()) {
            ax.R0.h.b(spannable, new ForegroundColorSpan(gVar.d()), i, i2, 33);
        }
        if (gVar.r()) {
            ax.R0.h.b(spannable, new BackgroundColorSpan(gVar.b()), i, i2, 33);
        }
        if (gVar.e() != null) {
            ax.R0.h.b(spannable, new TypefaceSpan(gVar.e()), i, i2, 33);
        }
        if (gVar.q() != null) {
            b bVar = (b) C0968a.e(gVar.q());
            int i5 = bVar.a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = bVar.b;
            }
            int i6 = bVar.c;
            if (i6 == -2) {
                i6 = 1;
            }
            ax.R0.h.b(spannable, new i(i5, i4, i6), i, i2, 33);
        }
        int l = gVar.l();
        if (l == 2) {
            c d = d(cVar, map);
            if (d != null && (e = e(d, map)) != null) {
                if (e.g() != 1 || e.f(0).b == null) {
                    C0987u.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) d0.i(e.f(0).b);
                    g f2 = f(e.f, e.l(), map);
                    int k = f2 != null ? f2.k() : -1;
                    if (k == -1 && (f = f(d.f, d.l(), map)) != null) {
                        k = f.k();
                    }
                    spannable.setSpan(new ax.R0.g(str, k), i, i2, 33);
                }
            }
        } else if (l == 3 || l == 4) {
            spannable.setSpan(new a(), i, i2, 33);
        }
        if (gVar.p()) {
            ax.R0.h.b(spannable, new ax.R0.e(), i, i2, 33);
        }
        int g = gVar.g();
        if (g == 1) {
            ax.R0.h.b(spannable, new AbsoluteSizeSpan((int) gVar.f(), true), i, i2, 33);
        } else if (g == 2) {
            ax.R0.h.b(spannable, new RelativeSizeSpan(gVar.f()), i, i2, 33);
        } else {
            if (g != 3) {
                return;
            }
            ax.R0.h.a(spannable, gVar.f() / 100.0f, i, i2, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static c d(c cVar, Map<String, g> map) {
        while (cVar != null) {
            g f = f(cVar.f, cVar.l(), map);
            if (f != null && f.l() == 1) {
                return cVar;
            }
            cVar = cVar.j;
        }
        return null;
    }

    private static c e(c cVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(cVar);
        while (!arrayDeque.isEmpty()) {
            c cVar2 = (c) arrayDeque.pop();
            g f = f(cVar2.f, cVar2.l(), map);
            if (f != null && f.l() == 3) {
                return cVar2;
            }
            for (int g = cVar2.g() - 1; g >= 0; g--) {
                arrayDeque.push(cVar2.f(g));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map<String, g> map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i < length) {
                    gVar2.a(map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    gVar.a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return gVar;
    }
}
