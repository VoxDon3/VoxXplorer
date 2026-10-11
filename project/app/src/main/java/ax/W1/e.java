/*
 * Decompiled with CFR 0.152.
 */
package ax.W1;

import android.graphics.Color;
import android.text.Layout;
import android.text.Spannable;
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
import ax.R0.g;
import ax.R0.j;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.W1.f;
import ax.W1.h;
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

public final class e {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> c;
    private static final Map<String, Integer> d;

    static {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("white", Color.rgb((int)255, (int)255, (int)255));
        hashMap.put("lime", Color.rgb((int)0, (int)255, (int)0));
        hashMap.put("cyan", Color.rgb((int)0, (int)255, (int)255));
        hashMap.put("red", Color.rgb((int)255, (int)0, (int)0));
        hashMap.put("yellow", Color.rgb((int)255, (int)255, (int)0));
        hashMap.put("magenta", Color.rgb((int)255, (int)0, (int)255));
        hashMap.put("blue", Color.rgb((int)0, (int)0, (int)255));
        hashMap.put("black", Color.rgb((int)0, (int)0, (int)0));
        c = java.util.DesugarCollections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put("bg_white", Color.rgb((int)255, (int)255, (int)255));
        hashMap.put("bg_lime", Color.rgb((int)0, (int)255, (int)0));
        hashMap.put("bg_cyan", Color.rgb((int)0, (int)255, (int)255));
        hashMap.put("bg_red", Color.rgb((int)255, (int)0, (int)0));
        hashMap.put("bg_yellow", Color.rgb((int)255, (int)255, (int)0));
        hashMap.put("bg_magenta", Color.rgb((int)255, (int)0, (int)255));
        hashMap.put("bg_blue", Color.rgb((int)0, (int)0, (int)255));
        hashMap.put("bg_black", Color.rgb((int)0, (int)0, (int)0));
        d = java.util.DesugarCollections.unmodifiableMap(hashMap);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> object, int n8, int n9) {
        object = object.iterator();
        while (object.hasNext()) {
            Map<String, Integer> map = c;
            String string = (String)object.next();
            if (map.containsKey(string)) {
                spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(map.get(string).intValue()), n8, n9, 33);
                continue;
            }
            map = d;
            if (!map.containsKey(string)) continue;
            spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(map.get(string).intValue()), n8, n9, 33);
        }
    }

    private static void b(String string, SpannableStringBuilder object) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 3374865: {
                if (!string.equals("nbsp")) break;
                n8 = 3;
                break;
            }
            case 96708: {
                if (!string.equals("amp")) break;
                n8 = 2;
                break;
            }
            case 3464: {
                if (!string.equals("lt")) break;
                n8 = 1;
                break;
            }
            case 3309: {
                if (!string.equals("gt")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                object = new StringBuilder();
                ((StringBuilder)object).append("ignoring unsupported entity: '&");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(";'");
                u.h("WebvttCueParser", ((StringBuilder)object).toString());
                return;
            }
            case 3: {
                object.append(' ');
                return;
            }
            case 2: {
                object.append('&');
                return;
            }
            case 1: {
                object.append('<');
                return;
            }
            case 0: 
        }
        object.append('>');
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String string, c object, List<b> list, List<ax.W1.c> list2) {
        int n8 = e.j(list2, string, (c)object);
        ArrayList<b> arrayList = new ArrayList<b>(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, ax.W1.e$b.c);
        int n9 = ((c)object).b;
        int n10 = 0;
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            if (!"rt".equals(((b)((b)arrayList.get((int)i8))).a.a)) continue;
            object = (b)arrayList.get(i8);
            int n11 = e.h(e.j(list2, string, ((b)object).a), n8, 1);
            int n12 = ((b)object).a.b - n10;
            int n13 = ((b)object).b - n10;
            object = spannableStringBuilder.subSequence(n12, n13);
            spannableStringBuilder.delete(n12, n13);
            spannableStringBuilder.setSpan((Object)new g(object.toString(), n11), n9, n12, 33);
            n10 += object.length();
            n9 = n12;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void d(String list, c c8, List<b> list2, SpannableStringBuilder spannableStringBuilder, List<ax.W1.c> list3) {
        int n8 = 0;
        int n9 = c8.b;
        int n10 = spannableStringBuilder.length();
        String string = c8.a;
        string.getClass();
        int n11 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 3511770: {
                if (!string.equals("ruby")) break;
                n11 = 7;
                break;
            }
            case 3314158: {
                if (!string.equals("lang")) break;
                n11 = 6;
                break;
            }
            case 118: {
                if (!string.equals("v")) break;
                n11 = 5;
                break;
            }
            case 117: {
                if (!string.equals("u")) break;
                n11 = 4;
                break;
            }
            case 105: {
                if (!string.equals("i")) break;
                n11 = 3;
                break;
            }
            case 99: {
                if (!string.equals("c")) break;
                n11 = 2;
                break;
            }
            case 98: {
                if (!string.equals("b")) break;
                n11 = 1;
                break;
            }
            case 0: {
                if (!string.equals("")) break;
                n11 = 0;
            }
        }
        switch (n11) {
            default: {
                return;
            }
            case 7: {
                e.c(spannableStringBuilder, list, c8, list2, list3);
                break;
            }
            case 5: {
                e.f(spannableStringBuilder, c8.c, n9, n10);
                break;
            }
            case 4: {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n9, n10, 33);
                break;
            }
            case 3: {
                spannableStringBuilder.setSpan((Object)new StyleSpan(2), n9, n10, 33);
                break;
            }
            case 2: {
                e.a(spannableStringBuilder, c8.d, n9, n10);
                break;
            }
            case 1: {
                spannableStringBuilder.setSpan((Object)new StyleSpan(1), n9, n10, 33);
            }
            case 0: 
            case 6: 
        }
        list = e.i(list3, list, c8);
        n11 = n8;
        while (n11 < list.size()) {
            e.e(spannableStringBuilder, list.get((int)n11).c0, n9, n10);
            ++n11;
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, ax.W1.c c8, int n8, int n9) {
        if (c8 != null) {
            int n10;
            if (c8.i() != -1) {
                ax.R0.h.b((Spannable)spannableStringBuilder, new StyleSpan(c8.i()), n8, n9, 33);
            }
            if (c8.l()) {
                spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), n8, n9, 33);
            }
            if (c8.m()) {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n8, n9, 33);
            }
            if (c8.k()) {
                ax.R0.h.b((Spannable)spannableStringBuilder, new ForegroundColorSpan(c8.c()), n8, n9, 33);
            }
            if (c8.j()) {
                ax.R0.h.b((Spannable)spannableStringBuilder, new BackgroundColorSpan(c8.a()), n8, n9, 33);
            }
            if (c8.d() != null) {
                ax.R0.h.b((Spannable)spannableStringBuilder, new TypefaceSpan(c8.d()), n8, n9, 33);
            }
            if ((n10 = c8.f()) != 1) {
                if (n10 != 2) {
                    if (n10 == 3) {
                        ax.R0.h.b((Spannable)spannableStringBuilder, new RelativeSizeSpan(c8.e() / 100.0f), n8, n9, 33);
                    }
                } else {
                    ax.R0.h.b((Spannable)spannableStringBuilder, new RelativeSizeSpan(c8.e()), n8, n9, 33);
                }
            } else {
                ax.R0.h.b((Spannable)spannableStringBuilder, new AbsoluteSizeSpan((int)c8.e(), true), n8, n9, 33);
            }
            if (c8.b()) {
                spannableStringBuilder.setSpan((Object)new ax.R0.e(), n8, n9, 33);
            }
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String string, int n8, int n9) {
        spannableStringBuilder.setSpan((Object)new j(string), n8, n9, 33);
    }

    private static int g(String string, int n8) {
        if ((n8 = string.indexOf(62, n8)) == -1) {
            return string.length();
        }
        return n8 + 1;
    }

    private static int h(int n8, int n9, int n10) {
        if (n8 != -1) {
            return n8;
        }
        if (n9 != -1) {
            return n9;
        }
        if (n10 != -1) {
            return n10;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> i(List<ax.W1.c> list, String string, c c8) {
        ArrayList<d> arrayList = new ArrayList<d>();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            ax.W1.c c9 = list.get(i8);
            int n8 = c9.h(string, c8.a, c8.d, c8.c);
            if (n8 <= 0) continue;
            arrayList.add(new d(n8, c9));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int j(List<ax.W1.c> list, String object, c c8) {
        list = e.i(list, (String)object, c8);
        for (int i8 = 0; i8 < list.size(); ++i8) {
            object = ((d)list.get((int)i8)).c0;
            if (((ax.W1.c)object).g() == -1) continue;
            return ((ax.W1.c)object).g();
        }
        return -1;
    }

    private static String k(String string) {
        string = string.trim();
        ax.S0.a.a(string.isEmpty() ^ true);
        return d0.y1(string, "[ \\.]")[0];
    }

    private static boolean l(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 3511770: {
                if (!string.equals("ruby")) break;
                n8 = 7;
                break;
            }
            case 3314158: {
                if (!string.equals("lang")) break;
                n8 = 6;
                break;
            }
            case 3650: {
                if (!string.equals("rt")) break;
                n8 = 5;
                break;
            }
            case 118: {
                if (!string.equals("v")) break;
                n8 = 4;
                break;
            }
            case 117: {
                if (!string.equals("u")) break;
                n8 = 3;
                break;
            }
            case 105: {
                if (!string.equals("i")) break;
                n8 = 2;
                break;
            }
            case 99: {
                if (!string.equals("c")) break;
                n8 = 1;
                break;
            }
            case 98: {
                if (!string.equals("b")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return false;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
        }
        return true;
    }

    public static a m(CharSequence charSequence) {
        e e8 = new e();
        e8.c = charSequence;
        return e8.g().a();
    }

    public static ax.W1.d n(G g8, List<ax.W1.c> list) {
        String string = g8.x();
        if (string == null) {
            return null;
        }
        Object object = a;
        Object object2 = ((Pattern)object).matcher(string);
        if (((Matcher)object2).matches()) {
            return e.o(null, (Matcher)object2, g8, list);
        }
        object2 = g8.x();
        if (object2 == null) {
            return null;
        }
        if (((Matcher)(object = ((Pattern)object).matcher((CharSequence)object2))).matches()) {
            return e.o(string.trim(), (Matcher)object, g8, list);
        }
        return null;
    }

    private static ax.W1.d o(String string, Matcher object, G g8, List<ax.W1.c> list) {
        e e8 = new e();
        try {
            e8.a = h.d(ax.S0.a.e(((Matcher)object).group(1)));
            e8.b = h.d(ax.S0.a.e(((Matcher)object).group(2)));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Skipping cue with bad header: ");
            stringBuilder.append(((Matcher)object).group());
            u.h("WebvttCueParser", stringBuilder.toString());
            return null;
        }
        e.q(ax.S0.a.e(((Matcher)object).group(3)), e8);
        StringBuilder stringBuilder = new StringBuilder();
        object = g8.x();
        while (!TextUtils.isEmpty((CharSequence)object)) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(((String)object).trim());
            object = g8.x();
        }
        e8.c = e.r(string, stringBuilder.toString(), list);
        return e8.a();
    }

    static a.b p(String string) {
        e e8 = new e();
        e.q(string, e8);
        return e8.g();
    }

    private static void q(String object, e e8) {
        object = b.matcher((CharSequence)object);
        while (((Matcher)object).find()) {
            StringBuilder stringBuilder;
            String string = ax.S0.a.e(((Matcher)object).group(1));
            String string2 = ax.S0.a.e(((Matcher)object).group(2));
            try {
                if ("line".equals(string)) {
                    e.t(string2, e8);
                    continue;
                }
                if ("align".equals(string)) {
                    e8.d = e.w(string2);
                    continue;
                }
                if ("position".equals(string)) {
                    e.v(string2, e8);
                    continue;
                }
                if ("size".equals(string)) {
                    e8.j = h.c(string2);
                    continue;
                }
                if ("vertical".equals(string)) {
                    e8.k = e.x(string2);
                    continue;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown cue setting ");
                stringBuilder.append(string);
                stringBuilder.append(":");
                stringBuilder.append(string2);
                u.h("WebvttCueParser", stringBuilder.toString());
            }
            catch (NumberFormatException numberFormatException) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Skipping bad cue setting: ");
                stringBuilder.append(((Matcher)object).group());
                u.h("WebvttCueParser", stringBuilder.toString());
            }
        }
    }

    static SpannedString r(String string, String string2, List<ax.W1.c> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque<c> arrayDeque = new ArrayDeque<c>();
        ArrayList<b> arrayList = new ArrayList<b>();
        int n8 = 0;
        block0: while (n8 < string2.length()) {
            int n9;
            int n10;
            char c8 = string2.charAt(n8);
            if (c8 != '&') {
                if (c8 != '<') {
                    spannableStringBuilder.append(c8);
                    ++n8;
                    continue;
                }
                n10 = n8 + 1;
                if (n10 >= string2.length()) {
                    n8 = n10;
                    continue;
                }
                n9 = string2.charAt(n10);
                int n11 = 1;
                n9 = n9 == 47 ? 1 : 0;
                int n12 = e.g(string2, n10);
                int n13 = n12 - 2;
                n10 = string2.charAt(n13) == '/' ? 1 : 0;
                if (n9 != 0) {
                    n11 = 2;
                }
                if (n10 == 0) {
                    n13 = n12 - 1;
                }
                Object object = string2.substring(n8 + n11, n13);
                if (((String)object).trim().isEmpty()) {
                    n8 = n12;
                    continue;
                }
                String string3 = e.k((String)object);
                if (!e.l(string3)) {
                    n8 = n12;
                    continue;
                }
                if (n9 != 0) {
                    do {
                        if (arrayDeque.isEmpty()) {
                            n8 = n12;
                            continue block0;
                        }
                        object = (c)arrayDeque.pop();
                        e.d(string, (c)object, arrayList, spannableStringBuilder, list);
                        if (!arrayDeque.isEmpty()) {
                            arrayList.add(new b((c)object, spannableStringBuilder.length()));
                            continue;
                        }
                        arrayList.clear();
                    } while (!((c)object).a.equals(string3));
                    n8 = n12;
                    continue;
                }
                n8 = n12;
                if (n10 != 0) continue;
                arrayDeque.push(ax.W1.e$c.a((String)object, spannableStringBuilder.length()));
                n8 = n12;
                continue;
            }
            n9 = n8 + 1;
            n8 = string2.indexOf(59, n9);
            n10 = string2.indexOf(32, n9);
            if (n8 == -1) {
                n8 = n10;
            } else if (n10 != -1) {
                n8 = Math.min(n8, n10);
            }
            if (n8 != -1) {
                e.b(string2.substring(n9, n8), spannableStringBuilder);
                if (n8 == n10) {
                    spannableStringBuilder.append((CharSequence)" ");
                }
                ++n8;
                continue;
            }
            spannableStringBuilder.append(c8);
            n8 = n9;
        }
        while (!arrayDeque.isEmpty()) {
            e.d(string, (c)arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        e.d(string, ax.W1.e$c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf((CharSequence)spannableStringBuilder);
    }

    private static int s(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 109757538: {
                if (!string.equals("start")) break;
                n8 = 3;
                break;
            }
            case 100571: {
                if (!string.equals("end")) break;
                n8 = 2;
                break;
            }
            case -1074341483: {
                if (!string.equals("middle")) break;
                n8 = 1;
                break;
            }
            case -1364013995: {
                if (!string.equals("center")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid anchor value: ");
                stringBuilder.append(string);
                u.h("WebvttCueParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
            }
            case 3: {
                return 0;
            }
            case 2: {
                return 2;
            }
            case 0: 
            case 1: 
        }
        return 1;
    }

    private static void t(String string, e e8) {
        int n8 = string.indexOf(44);
        String string2 = string;
        if (n8 != -1) {
            e8.g = e.s(string.substring(n8 + 1));
            string2 = string.substring(0, n8);
        }
        if (string2.endsWith("%")) {
            e8.e = h.c(string2);
            e8.f = 0;
            return;
        }
        e8.e = Integer.parseInt(string2);
        e8.f = 1;
    }

    private static int u(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 109757538: {
                if (!string.equals("start")) break;
                n8 = 5;
                break;
            }
            case 100571: {
                if (!string.equals("end")) break;
                n8 = 4;
                break;
            }
            case -1074341483: {
                if (!string.equals("middle")) break;
                n8 = 3;
                break;
            }
            case -1276788989: {
                if (!string.equals("line-right")) break;
                n8 = 2;
                break;
            }
            case -1364013995: {
                if (!string.equals("center")) break;
                n8 = 1;
                break;
            }
            case -1842484672: {
                if (!string.equals("line-left")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid anchor value: ");
                stringBuilder.append(string);
                u.h("WebvttCueParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
            }
            case 2: 
            case 4: {
                return 2;
            }
            case 1: 
            case 3: {
                return 1;
            }
            case 0: 
            case 5: 
        }
        return 0;
    }

    private static void v(String string, e e8) {
        int n8 = string.indexOf(44);
        String string2 = string;
        if (n8 != -1) {
            e8.i = e.u(string.substring(n8 + 1));
            string2 = string.substring(0, n8);
        }
        e8.h = h.c(string2);
    }

    private static int w(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 109757538: {
                if (!string.equals("start")) break;
                n8 = 5;
                break;
            }
            case 108511772: {
                if (!string.equals("right")) break;
                n8 = 4;
                break;
            }
            case 3317767: {
                if (!string.equals("left")) break;
                n8 = 3;
                break;
            }
            case 100571: {
                if (!string.equals("end")) break;
                n8 = 2;
                break;
            }
            case -1074341483: {
                if (!string.equals("middle")) break;
                n8 = 1;
                break;
            }
            case -1364013995: {
                if (!string.equals("center")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid alignment value: ");
                stringBuilder.append(string);
                u.h("WebvttCueParser", stringBuilder.toString());
                return 2;
            }
            case 5: {
                return 1;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 0: 
            case 1: 
        }
        return 2;
    }

    private static int x(String string) {
        string.getClass();
        if (!string.equals("lr")) {
            if (!string.equals("rl")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid 'vertical' value: ");
                stringBuilder.append(string);
                u.h("WebvttCueParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }

    private static class b {
        private static final Comparator<b> c = new f();
        private final c a;
        private final int b;

        private b(c c8, int n8) {
            this.a = c8;
            this.b = n8;
        }

        public static /* synthetic */ int a(b b8, b b9) {
            return Integer.compare(b8.a.b, b9.a.b);
        }
    }

    private static final class c {
        public final String a;
        public final int b;
        public final String c;
        public final Set<String> d;

        private c(String string, int n8, String string2, Set<String> set) {
            this.b = n8;
            this.a = string;
            this.c = string2;
            this.d = set;
        }

        public static c a(String string, int n8) {
            Object object = string.trim();
            boolean bl = ((String)object).isEmpty();
            int n9 = 1;
            ax.S0.a.a(bl ^ true);
            int n10 = ((String)object).indexOf(" ");
            if (n10 == -1) {
                string = "";
            } else {
                string = ((String)object).substring(n10).trim();
                object = ((String)object).substring(0, n10);
            }
            String[] stringArray = d0.x1((String)object, "\\.");
            String string2 = stringArray[0];
            object = new HashSet();
            while (n9 < stringArray.length) {
                object.add(stringArray[n9]);
                ++n9;
            }
            return new c(string2, n8, string, (Set<String>)object);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    private static final class d
    implements Comparable<d> {
        public final ax.W1.c c0;
        public final int q;

        public d(int n8, ax.W1.c c8) {
            this.q = n8;
            this.c0 = c8;
        }

        public int d(d d8) {
            return Integer.compare(this.q, d8.q);
        }
    }

    private static final class e {
        public long a = 0L;
        public long b = 0L;
        public CharSequence c;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        private static float b(float f8, int n8) {
            float f9 = f8 - -3.4028235E38f;
            float f10 = f9 == 0.0f ? 0 : (f9 > 0.0f ? 1 : -1);
            if (f10 != false && n8 == 0 && (f8 < 0.0f || f8 > 1.0f)) {
                return 1.0f;
            }
            if (f10 != false) {
                return f8;
            }
            if (n8 == 0) {
                return 1.0f;
            }
            return -3.4028235E38f;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private static Layout.Alignment c(int n8) {
            if (n8 == 1) return Layout.Alignment.ALIGN_NORMAL;
            if (n8 == 2) return Layout.Alignment.ALIGN_CENTER;
            if (n8 == 3) return Layout.Alignment.ALIGN_OPPOSITE;
            if (n8 == 4) return Layout.Alignment.ALIGN_NORMAL;
            if (n8 == 5) return Layout.Alignment.ALIGN_OPPOSITE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown textAlignment: ");
            stringBuilder.append(n8);
            u.h("WebvttCueParser", stringBuilder.toString());
            return null;
        }

        private static float d(int n8, float f8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 == 2) {
                        return f8;
                    }
                    throw new IllegalStateException(String.valueOf(n8));
                }
                if (f8 <= 0.5f) {
                    return f8 * 2.0f;
                }
                return (1.0f - f8) * 2.0f;
            }
            return 1.0f - f8;
        }

        private static float e(int n8) {
            if (n8 != 4) {
                if (n8 != 5) {
                    return 0.5f;
                }
                return 1.0f;
            }
            return 0.0f;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private static int f(int n8) {
            if (n8 == 1) return 0;
            if (n8 == 3) return 2;
            if (n8 == 4) return 0;
            if (n8 == 5) return 2;
            return 1;
        }

        public ax.W1.d a() {
            return new ax.W1.d(this.g().a(), this.a, this.b);
        }

        public a.b g() {
            float f8 = this.h;
            if (f8 == -3.4028235E38f) {
                f8 = ax.W1.e$e.e(this.d);
            }
            int n8 = this.i;
            if (n8 == Integer.MIN_VALUE) {
                n8 = ax.W1.e$e.f(this.d);
            }
            a.b b8 = new a.b().p(ax.W1.e$e.c(this.d)).h(ax.W1.e$e.b(this.e, this.f), this.f).i(this.g).k(f8).l(n8).n(Math.min(this.j, ax.W1.e$e.d(n8, f8))).r(this.k);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                b8.o(charSequence);
            }
            return b8;
        }
    }
}

