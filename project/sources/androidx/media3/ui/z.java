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
import androidx.media3.ui.z;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.r7.AbstractC2962A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class z {
    private static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static class b {
        public final String a;
        public final Map<String, String> b;

        private b(String str, Map<String, String> map) {
            this.a = str;
            this.b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {
        private static final Comparator<c> e = new Comparator() { // from class: androidx.media3.ui.A
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z.c.b((z.c) obj, (z.c) obj2);
            }
        };
        private static final Comparator<c> f = new Comparator() { // from class: androidx.media3.ui.B
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z.c.a((z.c) obj, (z.c) obj2);
            }
        };
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        public static /* synthetic */ int a(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.a, cVar.a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.c.compareTo(cVar.c);
            return compareTo != 0 ? compareTo : cVar2.d.compareTo(cVar.d);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.b, cVar.b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.c.compareTo(cVar2.c);
            return compareTo != 0 ? compareTo : cVar.d.compareTo(cVar2.d);
        }

        private c(int i, int i2, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }
    }

    private static final class d {
        private final List<c> a = new ArrayList();
        private final List<c> b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f) {
        int i = 0;
        if (charSequence == null) {
            return new b(HttpUrl.FRAGMENT_ENCODE_SET, AbstractC2962A.k());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), AbstractC2962A.k());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            hashMap.put(C0640c.a("bg_" + intValue), d0.G("background-color:%s;", C0640c.b(intValue)));
        }
        SparseArray<d> c2 = c(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < c2.size()) {
            int keyAt = c2.keyAt(i);
            sb.append(b(spanned.subSequence(i2, keyAt)));
            d dVar = c2.get(keyAt);
            Collections.sort(dVar.b, c.f);
            Iterator it2 = dVar.b.iterator();
            while (it2.hasNext()) {
                sb.append(((c) it2.next()).d);
            }
            Collections.sort(dVar.a, c.e);
            Iterator it3 = dVar.a.iterator();
            while (it3.hasNext()) {
                sb.append(((c) it3.next()).c);
            }
            i++;
            i2 = keyAt;
        }
        sb.append(b(spanned.subSequence(i2, spanned.length())));
        return new b(sb.toString(), hashMap);
    }

    private static String b(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e = e(obj, f);
            String d2 = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e != null) {
                C0968a.e(d2);
                c cVar = new c(spanStart, spanEnd, e, d2);
                f(sparseArray, spanStart).a.add(cVar);
                f(sparseArray, spanEnd).b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof ax.R0.e) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof ax.R0.i)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof ax.R0.g) {
                return "<rt>" + b(((ax.R0.g) obj).a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return d0.G("<span style='color:%s;'>", C0640c.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return d0.G("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof ax.R0.e) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return d0.G("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r4.getSize() : r4.getSize() / f));
        }
        if (obj instanceof RelativeSizeSpan) {
            return d0.G("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return d0.G("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof ax.R0.g)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof ax.R0.i)) {
                return null;
            }
            ax.R0.i iVar = (ax.R0.i) obj;
            return d0.G("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(iVar.a, iVar.b), g(iVar.c));
        }
        int i = ((ax.R0.g) obj).b;
        if (i == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static d f(SparseArray<d> sparseArray, int i) {
        d dVar = sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    private static String g(int i) {
        return i != 2 ? "over right" : "under left";
    }

    private static String h(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append("circle");
        } else if (i == 2) {
            sb.append("dot");
        } else if (i != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }
}
