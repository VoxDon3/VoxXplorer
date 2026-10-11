/*
 * Decompiled with CFR 0.152.
 */
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
import ax.R0.e;
import ax.R0.h;
import ax.R0.i;
import ax.S0.d0;
import ax.S0.u;
import ax.T1.a;
import ax.T1.b;
import ax.T1.c;
import ax.T1.g;
import java.util.ArrayDeque;
import java.util.Map;

final class f {
    @SuppressLint(value={"WrongConstant"})
    public static void a(Spannable spannable, int n8, int n9, g g8, c object, Map<String, g> object2, int n10) {
        int n11;
        Object object3;
        if (g8.n() != -1) {
            spannable.setSpan((Object)new StyleSpan(g8.n()), n8, n9, 33);
        }
        if (g8.u()) {
            spannable.setSpan((Object)new StrikethroughSpan(), n8, n9, 33);
        }
        if (g8.v()) {
            spannable.setSpan((Object)new UnderlineSpan(), n8, n9, 33);
        }
        if (g8.s()) {
            h.b(spannable, new ForegroundColorSpan(g8.d()), n8, n9, 33);
        }
        if (g8.r()) {
            h.b(spannable, new BackgroundColorSpan(g8.b()), n8, n9, 33);
        }
        if (g8.e() != null) {
            h.b(spannable, new TypefaceSpan(g8.e()), n8, n9, 33);
        }
        if (g8.q() != null) {
            int n12;
            int n13;
            object3 = ax.S0.a.e(g8.q());
            n11 = ((b)object3).a;
            if (n11 == -1) {
                n10 = n10 != 2 && n10 != 1 ? 1 : 3;
                n13 = 1;
                n11 = n10;
                n10 = n13;
            } else {
                n10 = ((b)object3).b;
            }
            n13 = n12 = ((b)object3).c;
            if (n12 == -2) {
                n13 = 1;
            }
            h.b(spannable, new i(n11, n10, n13), n8, n9, 33);
        }
        if ((n10 = g8.l()) != 2) {
            if (n10 == 3 || n10 == 4) {
                spannable.setSpan((Object)new a(), n8, n9, 33);
            }
        } else {
            Object object4;
            object3 = f.d((c)object, object2);
            if (object3 != null && (object4 = f.e((c)object3, object2)) != null) {
                if (((c)object4).g() == 1 && ((c)object4).f((int)0).b != null) {
                    object = d0.i(((c)object4).f((int)0).b);
                    n10 = (object4 = f.f(((c)object4).f, ((c)object4).l(), object2)) != null ? ((g)object4).k() : -1;
                    n11 = n10;
                    if (n10 == -1) {
                        object2 = f.f(((c)object3).f, ((c)object3).l(), object2);
                        n11 = n10;
                        if (object2 != null) {
                            n11 = ((g)object2).k();
                        }
                    }
                    spannable.setSpan((Object)new ax.R0.g((String)object, n11), n8, n9, 33);
                } else {
                    u.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        }
        if (g8.p()) {
            h.b(spannable, new e(), n8, n9, 33);
        }
        if ((n10 = g8.g()) != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    return;
                }
                h.a(spannable, g8.f() / 100.0f, n8, n9, 33);
                return;
            }
            h.b(spannable, new RelativeSizeSpan(g8.f()), n8, n9, 33);
            return;
        }
        h.b(spannable, new AbsoluteSizeSpan((int)g8.f(), true), n8, n9, 33);
    }

    static String b(String string) {
        return string.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int n8;
        for (n8 = spannableStringBuilder.length() - 1; n8 >= 0 && spannableStringBuilder.charAt(n8) == ' '; --n8) {
        }
        if (n8 >= 0 && spannableStringBuilder.charAt(n8) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    private static c d(c c8, Map<String, g> map) {
        while (c8 != null) {
            g g8 = f.f(c8.f, c8.l(), map);
            if (g8 != null && g8.l() == 1) {
                return c8;
            }
            c8 = c8.j;
        }
        return null;
    }

    private static c e(c c8, Map<String, g> map) {
        ArrayDeque<c> arrayDeque = new ArrayDeque<c>();
        arrayDeque.push(c8);
        while (!arrayDeque.isEmpty()) {
            c8 = (c)arrayDeque.pop();
            g g8 = f.f(c8.f, c8.l(), map);
            if (g8 != null && g8.l() == 3) {
                return c8;
            }
            for (int i8 = c8.g() - 1; i8 >= 0; --i8) {
                arrayDeque.push(c8.f(i8));
            }
        }
        return null;
    }

    public static g f(g g8, String[] stringArray, Map<String, g> map) {
        int n8;
        int n9 = 0;
        if (g8 == null) {
            if (stringArray == null) {
                return null;
            }
            if (stringArray.length == 1) {
                return map.get(stringArray[0]);
            }
            if (stringArray.length > 1) {
                g8 = new g();
                n9 = stringArray.length;
                for (n8 = 0; n8 < n9; ++n8) {
                    g8.a(map.get(stringArray[n8]));
                }
                return g8;
            }
        } else {
            if (stringArray != null && stringArray.length == 1) {
                return g8.a(map.get(stringArray[0]));
            }
            if (stringArray != null && stringArray.length > 1) {
                int n10 = stringArray.length;
                for (n8 = n9; n8 < n10; ++n8) {
                    g8.a(map.get(stringArray[n8]));
                }
            }
        }
        return g8;
    }
}

