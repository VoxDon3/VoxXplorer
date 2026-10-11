package ax.W1;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import ax.R0.a;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.d0;
import ax.W1.e;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> c;
    private static final Map<String, Integer> d;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private static final Comparator<b> c = new Comparator() { // from class: ax.W1.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Integer.compare(((e.b) obj).a.b, ((e.b) obj2).a.b);
                return compare;
            }
        };
        private final c a;
        private final int b;

        private b(c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {
        public final String a;
        public final int b;
        public final String c;
        public final Set<String> d;

        private c(String str, int i, String str2, Set<String> set) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = set;
        }

        public static c a(String str, int i) {
            String str2;
            String trim = str.trim();
            C0968a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] x1 = d0.x1(trim, "\\.");
            String str3 = x1[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < x1.length; i2++) {
                hashSet.add(x1[i2]);
            }
            return new c(str3, i, str2, hashSet);
        }

        public static c b() {
            return new c(HttpUrl.FRAGMENT_ENCODE_SET, 0, HttpUrl.FRAGMENT_ENCODE_SET, Collections.EMPTY_SET);
        }
    }

    private static final class d implements Comparable<d> {
        public final ax.W1.c c0;
        public final int q;

        public d(int i, ax.W1.c cVar) {
            this.q = i;
            this.c0 = cVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.q, dVar.q);
        }
    }

    /* renamed from: ax.W1.e$e, reason: collision with other inner class name */
    private static final class C0215e {
        public CharSequence c;
        public long a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        private static float b(float f, int i) {
            if (f == -3.4028235E38f || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return f != -3.4028235E38f ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            C0987u.h("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        private static float e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public ax.W1.d a() {
            return new ax.W1.d(g().a(), this.a, this.b);
        }

        public a.b g() {
            float f = this.h;
            if (f == -3.4028235E38f) {
                f = e(this.d);
            }
            int i = this.i;
            if (i == Integer.MIN_VALUE) {
                i = f(this.d);
            }
            a.b r = new a.b().p(c(this.d)).h(b(this.e, this.f), this.f).i(this.g).k(f).l(i).n(Math.min(this.j, d(i, f))).r(this.k);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                r.o(charSequence);
            }
            return r;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                C0987u.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<ax.W1.c> list2) {
        int j = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.c);
        int i = cVar.b;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if ("rt".equals(((b) arrayList.get(i3)).a.a)) {
                b bVar = (b) arrayList.get(i3);
                int h = h(j(list2, str, bVar.a), j, 1);
                int i4 = bVar.a.b - i2;
                int i5 = bVar.b - i2;
                CharSequence subSequence = spannableStringBuilder.subSequence(i4, i5);
                spannableStringBuilder.delete(i4, i5);
                spannableStringBuilder.setSpan(new ax.R0.g(subSequence.toString(), h), i, i4, 33);
                i2 += subSequence.length();
                i = i4;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<ax.W1.c> list2) {
        int i;
        int length;
        i = cVar.b;
        length = spannableStringBuilder.length();
        String str2 = cVar.a;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                f(spannableStringBuilder, cVar.c, i, length);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> i2 = i(list2, str, cVar);
        for (int i3 = 0; i3 < i2.size(); i3++) {
            e(spannableStringBuilder, i2.get(i3).c0, i, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, ax.W1.c cVar, int i, int i2) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            ax.R0.h.b(spannableStringBuilder, new StyleSpan(cVar.i()), i, i2, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (cVar.k()) {
            ax.R0.h.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i, i2, 33);
        }
        if (cVar.j()) {
            ax.R0.h.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i, i2, 33);
        }
        if (cVar.d() != null) {
            ax.R0.h.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i, i2, 33);
        }
        int f = cVar.f();
        if (f == 1) {
            ax.R0.h.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i, i2, 33);
        } else if (f == 2) {
            ax.R0.h.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i, i2, 33);
        } else if (f == 3) {
            ax.R0.h.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i, i2, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new ax.R0.e(), i, i2, 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        spannableStringBuilder.setSpan(new ax.R0.j(str), i, i2, 33);
    }

    private static int g(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int h(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> i(List<ax.W1.c> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ax.W1.c cVar2 = list.get(i);
            int h = cVar2.h(str, cVar.a, cVar.d, cVar.c);
            if (h > 0) {
                arrayList.add(new d(h, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int j(List<ax.W1.c> list, String str, c cVar) {
        List<d> i = i(list, str, cVar);
        for (int i2 = 0; i2 < i.size(); i2++) {
            ax.W1.c cVar2 = i.get(i2).c0;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String k(String str) {
        String trim = str.trim();
        C0968a.a(!trim.isEmpty());
        return d0.y1(trim, "[ \\.]")[0];
    }

    private static boolean l(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static ax.R0.a m(CharSequence charSequence) {
        C0215e c0215e = new C0215e();
        c0215e.c = charSequence;
        return c0215e.g().a();
    }

    public static ax.W1.d n(G g, List<ax.W1.c> list) {
        String x = g.x();
        if (x == null) {
            return null;
        }
        Pattern pattern = a;
        Matcher matcher = pattern.matcher(x);
        if (matcher.matches()) {
            return o(null, matcher, g, list);
        }
        String x2 = g.x();
        if (x2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(x2);
        if (matcher2.matches()) {
            return o(x.trim(), matcher2, g, list);
        }
        return null;
    }

    private static ax.W1.d o(String str, Matcher matcher, G g, List<ax.W1.c> list) {
        C0215e c0215e = new C0215e();
        try {
            c0215e.a = h.d((String) C0968a.e(matcher.group(1)));
            c0215e.b = h.d((String) C0968a.e(matcher.group(2)));
            q((String) C0968a.e(matcher.group(3)), c0215e);
            StringBuilder sb = new StringBuilder();
            String x = g.x();
            while (!TextUtils.isEmpty(x)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(x.trim());
                x = g.x();
            }
            c0215e.c = r(str, sb.toString(), list);
            return c0215e.a();
        } catch (IllegalArgumentException unused) {
            C0987u.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    static a.b p(String str) {
        C0215e c0215e = new C0215e();
        q(str, c0215e);
        return c0215e.g();
    }

    private static void q(String str, C0215e c0215e) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C0968a.e(matcher.group(1));
            String str3 = (String) C0968a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t(str3, c0215e);
                } else if ("align".equals(str2)) {
                    c0215e.d = w(str3);
                } else if ("position".equals(str2)) {
                    v(str3, c0215e);
                } else if ("size".equals(str2)) {
                    c0215e.j = h.c(str3);
                } else if ("vertical".equals(str2)) {
                    c0215e.k = x(str3);
                } else {
                    C0987u.h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                C0987u.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString r(String str, String str2, List<ax.W1.c> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    i2 = g(str2, i2);
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring = str2.substring(i4, i3);
                    if (!substring.trim().isEmpty()) {
                        String k = k(substring);
                        if (l(k)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.a.equals(k)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int s(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                C0987u.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void t(String str, C0215e c0215e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0215e.g = s(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c0215e.e = h.c(str);
            c0215e.f = 0;
        } else {
            c0215e.e = Integer.parseInt(str);
            c0215e.f = 1;
        }
    }

    private static int u(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                C0987u.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void v(String str, C0215e c0215e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0215e.i = u(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        c0215e.h = h.c(str);
    }

    private static int w(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                C0987u.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int x(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        C0987u.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
