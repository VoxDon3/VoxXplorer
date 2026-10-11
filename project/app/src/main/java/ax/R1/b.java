/*
 * Decompiled with CFR 0.152.
 */
package ax.R1;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ax.N1.e;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.R1.a;
import ax.R1.c;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.l;
import ax.S0.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
implements t {
    private static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean a;
    private final a b;
    private final G c = new G();
    private Map<String, c> d;
    private float e = -3.4028235E38f;
    private float f = -3.4028235E38f;

    public b(List<byte[]> list) {
        if (list != null && !list.isEmpty()) {
            this.a = true;
            String string = d0.H(list.get(0));
            ax.S0.a.a(string.startsWith("Format:"));
            this.b = ax.S0.a.e(ax.R1.a.a(string));
            this.k(new G(list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.a = false;
        this.b = null;
    }

    private static int e(long l8, List<Long> arrayList, List<List<ax.R0.a>> list) {
        int n8;
        block2: {
            for (n8 = arrayList.size() - 1; n8 >= 0; --n8) {
                if (arrayList.get(n8) == l8) {
                    return n8;
                }
                if ((Long)arrayList.get(n8) >= l8) continue;
                ++n8;
                break block2;
            }
            n8 = 0;
        }
        arrayList.add(n8, l8);
        arrayList = n8 == 0 ? new ArrayList<Long>() : new ArrayList<Long>((Collection)list.get(n8 - 1));
        list.add(n8, arrayList);
        return n8;
    }

    private static float f(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return -3.4028235E38f;
                }
                return 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    private static ax.R0.a g(String object, int n8, c c8, c.b b8, float f8, float f9) {
        SpannableString spannableString = new SpannableString((CharSequence)object);
        object = new a.b().o((CharSequence)spannableString).t(n8);
        if (c8 != null) {
            boolean bl;
            float f10;
            if (c8.c != null) {
                spannableString.setSpan((Object)new ForegroundColorSpan(c8.c.intValue()), 0, spannableString.length(), 33);
            }
            if (c8.j == 3 && c8.d != null) {
                spannableString.setSpan((Object)new BackgroundColorSpan(c8.d.intValue()), 0, spannableString.length(), 33);
            }
            if ((f10 = c8.e) != -3.4028235E38f && f9 != -3.4028235E38f) {
                ((a.b)object).q(f10 / f9, 1);
            }
            if ((bl = c8.f) && c8.g) {
                spannableString.setSpan((Object)new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (bl) {
                spannableString.setSpan((Object)new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (c8.g) {
                spannableString.setSpan((Object)new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (c8.h) {
                spannableString.setSpan((Object)new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (c8.i) {
                spannableString.setSpan((Object)new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        if ((n8 = b8.a) == -1) {
            n8 = c8 != null ? c8.b : -1;
        }
        ((a.b)object).p(ax.R1.b.q(n8)).l(ax.R1.b.p(n8)).i(ax.R1.b.o(n8));
        c8 = b8.b;
        if (c8 != null && f9 != -3.4028235E38f && f8 != -3.4028235E38f) {
            ((a.b)object).k(((PointF)c8).x / f8);
            ((a.b)object).h(b8.b.y / f9, 0);
        } else {
            ((a.b)object).k(ax.R1.b.f(((a.b)object).d()));
            ((a.b)object).h(ax.R1.b.f(((a.b)object).c()), 0);
        }
        return ((a.b)object).a();
    }

    private Charset h(G object) {
        if ((object = ((G)object).W()) != null) {
            return object;
        }
        return StandardCharsets.UTF_8;
    }

    private void i(String map, a object, List<List<ax.R0.a>> list, List<Long> list2) {
        int n8;
        Object object2;
        block7: {
            ax.S0.a.a(((String)((Object)map)).startsWith("Dialogue:"));
            object2 = ((String)((Object)map)).substring(9).split(",", ((a)object).f);
            if (((String[])object2).length != ((a)object).f) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Skipping dialogue line with fewer columns than format: ");
                ((StringBuilder)object).append((String)((Object)map));
                u.h("SsaParser", ((StringBuilder)object).toString());
                return;
            }
            n8 = ((a)object).a;
            if (n8 != -1) {
                try {
                    n8 = Integer.parseInt(object2[n8].trim());
                    break block7;
                }
                catch (RuntimeException runtimeException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Fail to parse layer: ");
                    stringBuilder.append(object2[((a)object).a]);
                    u.h("SsaParser", stringBuilder.toString());
                }
            }
            n8 = 0;
        }
        long l8 = ax.R1.b.n(object2[((a)object).b]);
        if (l8 == -9223372036854775807L) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Skipping invalid timing: ");
            ((StringBuilder)object).append((String)((Object)map));
            u.h("SsaParser", ((StringBuilder)object).toString());
            return;
        }
        long l9 = ax.R1.b.n(object2[((a)object).c]);
        if (l9 != -9223372036854775807L && l9 > l8) {
            int n9;
            map = this.d;
            map = map != null && (n9 = ((a)object).d) != -1 ? (c)map.get(object2[n9].trim()) : null;
            object = object2[((a)object).e];
            object2 = c.b.b((String)object);
            map = ax.R1.b.g(c.b.d((String)object).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", "\u00a0"), n8, (c)((Object)map), (c.b)object2, this.e, this.f);
            n9 = ax.R1.b.e(l9, list2, list);
            for (n8 = ax.R1.b.e(l8, list2, list); n8 < n9; ++n8) {
                list.get(n8).add((ax.R0.a)((Object)map));
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Skipping invalid timing: ");
        ((StringBuilder)object).append((String)((Object)map));
        u.h("SsaParser", ((StringBuilder)object).toString());
    }

    private void j(G g8, List<List<ax.R0.a>> list, List<Long> list2, Charset charset) {
        String string;
        a a8 = this.a ? this.b : null;
        while ((string = g8.y(charset)) != null) {
            if (string.startsWith("Format:")) {
                a8 = ax.R1.a.a(string);
                continue;
            }
            if (!string.startsWith("Dialogue:")) continue;
            if (a8 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Skipping dialogue line before complete format: ");
                stringBuilder.append(string);
                u.h("SsaParser", stringBuilder.toString());
                continue;
            }
            this.i(string, a8, list, list2);
        }
    }

    private void k(G g8, Charset charset) {
        String string;
        while ((string = g8.y(charset)) != null) {
            if ("[Script Info]".equalsIgnoreCase(string)) {
                this.l(g8, charset);
                continue;
            }
            if ("[V4+ Styles]".equalsIgnoreCase(string)) {
                this.d = ax.R1.b.m(g8, charset);
                continue;
            }
            if ("[V4 Styles]".equalsIgnoreCase(string)) {
                u.f("SsaParser", "[V4 Styles] are not supported");
                continue;
            }
            if (!"[Events]".equalsIgnoreCase(string)) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l(G g8, Charset charset) {
        String[] stringArray;
        while ((stringArray = g8.y(charset)) != null && (g8.a() == 0 || g8.l(charset) != 91)) {
            if ((stringArray = stringArray.split(":")).length != 2) continue;
            String string = ax.q7.c.e(stringArray[0].trim());
            string.getClass();
            if (!string.equals("playresx")) {
                if (!string.equals("playresy")) continue;
                try {
                    this.f = Float.parseFloat(stringArray[1].trim());
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            this.e = Float.parseFloat(stringArray[1].trim());
        }
    }

    private static Map<String, c> m(G g8, Charset charset) {
        String string;
        LinkedHashMap<String, c> linkedHashMap = new LinkedHashMap<String, c>();
        c.a a8 = null;
        while ((string = g8.y(charset)) != null && (g8.a() == 0 || g8.l(charset) != 91)) {
            Object object;
            if (string.startsWith("Format:")) {
                a8 = c.a.a(string);
                continue;
            }
            if (!string.startsWith("Style:")) continue;
            if (a8 == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Skipping 'Style:' line before 'Format:' line: ");
                ((StringBuilder)object).append(string);
                u.h("SsaParser", ((StringBuilder)object).toString());
                continue;
            }
            object = ax.R1.c.b(string, a8);
            if (object == null) continue;
            linkedHashMap.put(((c)object).a, (c)object);
        }
        return linkedHashMap;
    }

    private static long n(String object) {
        if (!((Matcher)(object = g.matcher(((String)object).trim()))).matches()) {
            return -9223372036854775807L;
        }
        return Long.parseLong(d0.i(((Matcher)object).group(1))) * 3600000000L + Long.parseLong(d0.i(((Matcher)object).group(2))) * 60000000L + Long.parseLong(d0.i(((Matcher)object).group(3))) * 1000000L + Long.parseLong(d0.i(((Matcher)object).group(4))) * 10000L;
    }

    private static int o(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown alignment: ");
                stringBuilder.append(n8);
                u.h("SsaParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
            }
            case 7: 
            case 8: 
            case 9: {
                return 0;
            }
            case 4: 
            case 5: 
            case 6: {
                return 1;
            }
            case 1: 
            case 2: 
            case 3: {
                return 2;
            }
            case -1: 
        }
        return Integer.MIN_VALUE;
    }

    private static int p(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown alignment: ");
                stringBuilder.append(n8);
                u.h("SsaParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
            }
            case 3: 
            case 6: 
            case 9: {
                return 2;
            }
            case 2: 
            case 5: 
            case 8: {
                return 1;
            }
            case 1: 
            case 4: 
            case 7: {
                return 0;
            }
            case -1: 
        }
        return Integer.MIN_VALUE;
    }

    private static Layout.Alignment q(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown alignment: ");
                stringBuilder.append(n8);
                u.h("SsaParser", stringBuilder.toString());
                return null;
            }
            case 3: 
            case 6: 
            case 9: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            case 2: 
            case 5: 
            case 8: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 1: 
            case 4: 
            case 7: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            case -1: 
        }
        return null;
    }

    @Override
    public /* synthetic */ void a() {
        s.b(this);
    }

    @Override
    public /* synthetic */ k b(byte[] byArray, int n8, int n9) {
        return s.a(this, byArray, n8, n9);
    }

    @Override
    public void c(byte[] object, int n8, int n9, t.b b8, l<e> l8) {
        ArrayList<List<ax.R0.a>> arrayList = new ArrayList<List<ax.R0.a>>();
        ArrayList<Long> arrayList2 = new ArrayList<Long>();
        this.c.Z((byte[])object, n8 + n9);
        this.c.b0(n8);
        object = this.h(this.c);
        if (!this.a) {
            this.k(this.c, (Charset)object);
        }
        this.j(this.c, arrayList, arrayList2, (Charset)object);
        object = b8.a != -9223372036854775807L && b8.b ? (Object)new ArrayList() : null;
        n9 = 0;
        for (n8 = 0; n8 < arrayList.size(); ++n8) {
            Object object2 = (List)arrayList.get(n8);
            if (object2.isEmpty() && n8 != 0) continue;
            if (n8 != arrayList.size() - 1) {
                long l9 = (Long)arrayList2.get(n8);
                long l10 = (Long)arrayList2.get(n8 + 1);
                object2 = new e((List<ax.R0.a>)object2, l9, l10 - l9);
                l9 = b8.a;
                if (l9 != -9223372036854775807L && l10 < l9) {
                    if (object == null) continue;
                    object.add(object2);
                    continue;
                }
                l8.accept((e)object2);
                continue;
            }
            throw new IllegalStateException();
        }
        if (object != null) {
            int n10 = ((ArrayList)object).size();
            for (n8 = n9; n8 < n10; ++n8) {
                b8 = ((ArrayList)object).get(n8);
                l8.accept((e)((Object)b8));
            }
        }
    }

    @Override
    public int d() {
        return 1;
    }
}

