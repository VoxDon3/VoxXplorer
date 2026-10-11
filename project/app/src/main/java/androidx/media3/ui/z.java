/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.media3.ui.A;
import androidx.media3.ui.B;
import ax.R0.e;
import ax.R0.g;
import ax.R0.i;
import ax.S0.a;
import ax.S0.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

final class z {
    private static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static b a(CharSequence charSequence, float f8) {
        StringBuilder stringBuilder;
        int n8;
        int n9 = 0;
        if (charSequence == null) {
            return new b("", ax.r7.A.k());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(z.b(charSequence), ax.r7.A.k());
        }
        charSequence = (Spanned)charSequence;
        SparseArray<d> sparseArray = new HashSet<Integer>();
        Object object = (BackgroundColorSpan[])charSequence.getSpans(0, charSequence.length(), BackgroundColorSpan.class);
        int n10 = ((BackgroundColorSpan[])object).length;
        for (n8 = 0; n8 < n10; ++n8) {
            sparseArray.add((d)((Object)Integer.valueOf(object[n8].getBackgroundColor())));
        }
        object = new HashMap();
        sparseArray = sparseArray.iterator();
        while (sparseArray.hasNext()) {
            n8 = (Integer)sparseArray.next();
            stringBuilder = new StringBuilder();
            stringBuilder.append("bg_");
            stringBuilder.append(n8);
            ((HashMap)object).put(androidx.media3.ui.c.a(stringBuilder.toString()), d0.G("background-color:%s;", androidx.media3.ui.c.b(n8)));
        }
        sparseArray = z.c((Spanned)charSequence, f8);
        stringBuilder = new StringBuilder(charSequence.length());
        n10 = 0;
        for (n8 = n9; n8 < sparseArray.size(); ++n8) {
            n9 = sparseArray.keyAt(n8);
            stringBuilder.append(z.b(charSequence.subSequence(n10, n9)));
            Object object2 = (d)sparseArray.get(n9);
            Collections.sort(((d)object2).b, c.f);
            Iterator iterator = ((d)object2).b.iterator();
            while (iterator.hasNext()) {
                stringBuilder.append(((c)iterator.next()).d);
            }
            Collections.sort(((d)object2).a, c.e);
            object2 = ((d)object2).a.iterator();
            while (object2.hasNext()) {
                stringBuilder.append(((c)object2.next()).c);
            }
            n10 = n9;
        }
        stringBuilder.append(z.b(charSequence.subSequence(n10, charSequence.length())));
        return new b(stringBuilder.toString(), (Map)object);
    }

    private static String b(CharSequence charSequence) {
        charSequence = Html.escapeHtml((CharSequence)charSequence);
        return a.matcher(charSequence).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f8) {
        SparseArray sparseArray = new SparseArray();
        int n8 = spanned.length();
        for (Object object : spanned.getSpans(0, n8, Object.class)) {
            Object object2 = z.e(object, f8);
            String string = z.d(object);
            int n9 = spanned.getSpanStart(object);
            int n10 = spanned.getSpanEnd(object);
            if (object2 == null) continue;
            ax.S0.a.e(string);
            object2 = new c(n9, n10, (String)object2, string);
            z.f((SparseArray<d>)sparseArray, n9).a.add(object2);
            z.f((SparseArray<d>)sparseArray, n10).b.add(object2);
        }
        return sparseArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String d(Object object) {
        if (object instanceof StrikethroughSpan || object instanceof ForegroundColorSpan || object instanceof BackgroundColorSpan || object instanceof e || object instanceof AbsoluteSizeSpan || object instanceof RelativeSizeSpan || object instanceof i) return "</span>";
        if (object instanceof TypefaceSpan) {
            if (((TypefaceSpan)object).getFamily() == null) return null;
            return "</span>";
        }
        if (object instanceof StyleSpan) {
            int n8 = ((StyleSpan)object).getStyle();
            if (n8 == 1) return "</b>";
            if (n8 == 2) return "</i>";
            if (n8 != 3) return null;
            return "</i></b>";
        }
        if (object instanceof g) {
            g g8 = (g)object;
            object = new StringBuilder();
            ((StringBuilder)object).append("<rt>");
            ((StringBuilder)object).append(z.b(g8.a));
            ((StringBuilder)object).append("</rt></ruby>");
            return ((StringBuilder)object).toString();
        }
        if (!(object instanceof UnderlineSpan)) return null;
        return "</u>";
    }

    private static String e(Object object, float f8) {
        if (object instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (object instanceof ForegroundColorSpan) {
            return d0.G("<span style='color:%s;'>", androidx.media3.ui.c.b(((ForegroundColorSpan)object).getForegroundColor()));
        }
        if (object instanceof BackgroundColorSpan) {
            return d0.G("<span class='bg_%s'>", ((BackgroundColorSpan)object).getBackgroundColor());
        }
        if (object instanceof e) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (object instanceof AbsoluteSizeSpan) {
            f8 = (object = (AbsoluteSizeSpan)object).getDip() ? (float)object.getSize() : (float)object.getSize() / f8;
            return d0.G("<span style='font-size:%.2fpx;'>", Float.valueOf(f8));
        }
        if (object instanceof RelativeSizeSpan) {
            return d0.G("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan)object).getSizeChange() * 100.0f));
        }
        if (object instanceof TypefaceSpan) {
            if ((object = ((TypefaceSpan)object).getFamily()) != null) {
                return d0.G("<span style='font-family:\"%s\";'>", object);
            }
            return null;
        }
        if (object instanceof StyleSpan) {
            int n8 = ((StyleSpan)object).getStyle();
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return null;
                    }
                    return "<b><i>";
                }
                return "<i>";
            }
            return "<b>";
        }
        if (object instanceof g) {
            int n9 = ((g)object).b;
            if (n9 != -1) {
                if (n9 != 1) {
                    if (n9 != 2) {
                        return null;
                    }
                    return "<ruby style='ruby-position:under;'>";
                }
                return "<ruby style='ruby-position:over;'>";
            }
            return "<ruby style='ruby-position:unset;'>";
        }
        if (object instanceof UnderlineSpan) {
            return "<u>";
        }
        if (object instanceof i) {
            object = (i)object;
            return d0.G("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", z.h(((i)object).a, ((i)object).b), z.g(((i)object).c));
        }
        return null;
    }

    private static d f(SparseArray<d> sparseArray, int n8) {
        d d8;
        d d9 = d8 = (d)sparseArray.get(n8);
        if (d8 == null) {
            d9 = new d();
            sparseArray.put(n8, (Object)d9);
        }
        return d9;
    }

    private static String g(int n8) {
        if (n8 != 2) {
            return "over right";
        }
        return "under left";
    }

    private static String h(int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n9 != 1) {
            if (n9 == 2) {
                stringBuilder.append("open ");
            }
        } else {
            stringBuilder.append("filled ");
        }
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        stringBuilder.append("unset");
                    } else {
                        stringBuilder.append("sesame");
                    }
                } else {
                    stringBuilder.append("dot");
                }
            } else {
                stringBuilder.append("circle");
            }
        } else {
            stringBuilder.append("none");
        }
        return stringBuilder.toString();
    }

    public static class b {
        public final String a;
        public final Map<String, String> b;

        private b(String string, Map<String, String> map) {
            this.a = string;
            this.b = map;
        }
    }

    private static final class c {
        private static final Comparator<c> e = new A();
        private static final Comparator<c> f = new B();
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        private c(int n8, int n9, String string, String string2) {
            this.a = n8;
            this.b = n9;
            this.c = string;
            this.d = string2;
        }

        public static /* synthetic */ int a(c c8, c c9) {
            int n8 = Integer.compare(c9.a, c8.a);
            if (n8 != 0) {
                return n8;
            }
            n8 = c9.c.compareTo(c8.c);
            if (n8 != 0) {
                return n8;
            }
            return c9.d.compareTo(c8.d);
        }

        public static /* synthetic */ int b(c c8, c c9) {
            int n8 = Integer.compare(c9.b, c8.b);
            if (n8 != 0) {
                return n8;
            }
            n8 = c8.c.compareTo(c9.c);
            if (n8 != 0) {
                return n8;
            }
            return c8.d.compareTo(c9.d);
        }
    }

    private static final class d {
        private final List<c> a = new ArrayList<c>();
        private final List<c> b = new ArrayList<c>();
    }
}

