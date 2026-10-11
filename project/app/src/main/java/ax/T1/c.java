/*
 * Decompiled with CFR 0.152.
 */
package ax.T1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import ax.R0.a;
import ax.T1.a;
import ax.T1.e;
import ax.T1.f;
import ax.T1.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

final class c {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final g f;
    private final String[] g;
    public final String h;
    public final String i;
    public final c j;
    private final HashMap<String, Integer> k;
    private final HashMap<String, Integer> l;
    private List<c> m;

    private c(String string, String string2, long l8, long l9, g g8, String[] stringArray, String string3, String string4, c c8) {
        this.a = string;
        this.b = string2;
        this.i = string4;
        this.f = g8;
        this.g = stringArray;
        boolean bl = string2 != null;
        this.c = bl;
        this.d = l8;
        this.e = l9;
        this.h = ax.S0.a.e(string3);
        this.j = c8;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    private void b(Map<String, g> map, a.b b8, int n8, int n9, int n10) {
        SpannableStringBuilder spannableStringBuilder;
        g g8 = ax.T1.f.f(this.f, this.g, map);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder = (SpannableStringBuilder)b8.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder2 = new SpannableStringBuilder();
            b8.o((CharSequence)spannableStringBuilder2);
        }
        if (g8 != null) {
            ax.T1.f.a((Spannable)spannableStringBuilder2, n8, n9, g8, this.j, map, n10);
            if ("p".equals(this.a)) {
                if (g8.m() != Float.MAX_VALUE) {
                    b8.m(g8.m() * -90.0f / 100.0f);
                }
                if (g8.o() != null) {
                    b8.p(g8.o());
                }
                if (g8.i() != null) {
                    b8.j(g8.i());
                }
            }
        }
    }

    public static c c(String string, long l8, long l9, g g8, String[] stringArray, String string2, String string3, c c8) {
        return new c(string, null, l8, l9, g8, stringArray, string2, string3, c8);
    }

    public static c d(String string) {
        return new c(null, ax.T1.f.b(string), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        int n8 = spannableStringBuilder.length();
        int n9 = 0;
        a[] aArray = (a[])spannableStringBuilder.getSpans(0, n8, a.class);
        int n10 = aArray.length;
        for (n8 = 0; n8 < n10; ++n8) {
            a a8 = aArray[n8];
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart((Object)a8), spannableStringBuilder.getSpanEnd((Object)a8), (CharSequence)"");
        }
        for (n8 = 0; n8 < spannableStringBuilder.length(); ++n8) {
            int n11;
            if (spannableStringBuilder.charAt(n8) != ' ') continue;
            for (n10 = n11 = n8 + 1; n10 < spannableStringBuilder.length() && spannableStringBuilder.charAt(n10) == ' '; ++n10) {
            }
            if ((n10 -= n11) <= 0) continue;
            spannableStringBuilder.delete(n8, n10 + n8);
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (n8 = 0; n8 < spannableStringBuilder.length() - 1; ++n8) {
            if (spannableStringBuilder.charAt(n8) != '\n' || spannableStringBuilder.charAt(n10 = n8 + 1) != ' ') continue;
            spannableStringBuilder.delete(n10, n8 + 2);
        }
        n8 = n9;
        if (spannableStringBuilder.length() > 0) {
            n8 = n9;
            if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                n8 = n9;
            }
        }
        while (n8 < spannableStringBuilder.length() - 1) {
            if (spannableStringBuilder.charAt(n8) == ' ' && spannableStringBuilder.charAt(n10 = n8 + 1) == '\n') {
                spannableStringBuilder.delete(n8, n10);
            }
            ++n8;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void i(TreeSet<Long> treeSet, boolean bl) {
        boolean bl2 = "p".equals(this.a);
        boolean bl3 = "div".equals(this.a);
        if (bl || bl2 || bl3 && this.i != null) {
            long l8 = this.d;
            if (l8 != -9223372036854775807L) {
                treeSet.add(l8);
            }
            if ((l8 = this.e) != -9223372036854775807L) {
                treeSet.add(l8);
            }
        }
        if (this.m != null) {
            for (int i8 = 0; i8 < this.m.size(); ++i8) {
                c c8 = this.m.get(i8);
                bl3 = bl || bl2;
                c8.i(treeSet, bl3);
            }
        }
    }

    private static SpannableStringBuilder k(String string, Map<String, a.b> map) {
        if (!map.containsKey(string)) {
            a.b b8 = new a.b();
            b8.o((CharSequence)new SpannableStringBuilder());
            map.put(string, b8);
        }
        return (SpannableStringBuilder)ax.S0.a.e(map.get(string).e());
    }

    private void n(long l8, String string, List<Pair<String, String>> list) {
        if (!"".equals(this.h)) {
            string = this.h;
        }
        if (this.m(l8) && "div".equals(this.a) && this.i != null) {
            list.add((Pair<String, String>)new Pair((Object)string, (Object)this.i));
            return;
        }
        for (int i8 = 0; i8 < this.g(); ++i8) {
            this.f(i8).n(l8, string, list);
        }
    }

    private void o(long l8, Map<String, g> map, Map<String, e> map2, String string, Map<String, a.b> map3) {
        if (this.m(l8)) {
            int n8;
            if (!"".equals(this.h)) {
                string = this.h;
            }
            Iterator<Map.Entry<String, Integer>> iterator = this.l.entrySet().iterator();
            while (true) {
                int n9;
                boolean bl = iterator.hasNext();
                n8 = 0;
                if (!bl) break;
                Map.Entry<String, Integer> entry = iterator.next();
                String string2 = entry.getKey();
                if (this.k.containsKey(string2)) {
                    n8 = this.k.get(string2);
                }
                if (n8 == (n9 = entry.getValue().intValue())) continue;
                this.b(map, ax.S0.a.e(map3.get(string2)), n8, n9, ax.S0.a.e(map2.get((Object)string)).j);
            }
            for (n8 = 0; n8 < this.g(); ++n8) {
                this.f(n8).o(l8, map, map2, string, map3);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void p(long l8, boolean bl, String object4, Map<String, a.b> object2) {
        this.k.clear();
        this.l.clear();
        if (!"metadata".equals(this.a)) {
            Iterator iterator;
            String var4_4;
            if (!"".equals(this.h)) {
                String string = this.h;
            }
            if (this.c && bl) {
                ax.T1.c.k((String)var4_4, (Map<String, a.b>)((Object)iterator)).append((CharSequence)ax.S0.a.e(this.b));
                return;
            }
            if ("br".equals(this.a) && bl) {
                ax.T1.c.k((String)var4_4, (Map<String, a.b>)((Object)iterator)).append('\n');
                return;
            }
            if (this.m(l8)) {
                for (Map.Entry entry : iterator.entrySet()) {
                    this.k.put((String)entry.getKey(), ax.S0.a.e(((a.b)entry.getValue()).e()).length());
                }
                boolean bl2 = "p".equals(this.a);
                for (int i8 = 0; i8 < this.g(); ++i8) {
                    c c8 = this.f(i8);
                    boolean bl3 = bl || bl2;
                    c8.p(l8, bl3, (String)var4_4, (Map<String, a.b>)((Object)iterator));
                }
                if (bl2) {
                    ax.T1.f.c(ax.T1.c.k((String)var4_4, (Map<String, a.b>)((Object)iterator)));
                }
                for (Map.Entry entry : iterator.entrySet()) {
                    this.l.put((String)entry.getKey(), ax.S0.a.e(((a.b)entry.getValue()).e()).length());
                }
            }
        }
    }

    public void a(c c8) {
        if (this.m == null) {
            this.m = new ArrayList<c>();
        }
        this.m.add(c8);
    }

    public c f(int n8) {
        List<c> list = this.m;
        if (list != null) {
            return list.get(n8);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<c> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<ax.R0.a> h(long l8, Map<String, g> object, Map<String, e> map, Map<String, String> object2) {
        ArrayList<Pair<String, String>> object32 = new ArrayList<Pair<String, String>>();
        this.n(l8, this.h, object32);
        Object object3 = new TreeMap<String, a.b>();
        this.p(l8, false, this.h, (Map<String, a.b>)object3);
        this.o(l8, (Map<String, g>)((Object)object), map, this.h, (Map<String, a.b>)object3);
        object = new ArrayList<ax.R0.a>();
        int n8 = object32.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object4 = object32.get(i8);
            Object object5 = (String)object2.get(object4.second);
            if (object5 == null) continue;
            object5 = Base64.decode((String)object5, (int)0);
            object5 = BitmapFactory.decodeByteArray((byte[])object5, (int)0, (int)((Object)object5).length);
            object4 = ax.S0.a.e(map.get(object4.first));
            object.add(new a.b().f((Bitmap)object5).k(object4.b).l(0).h(object4.c, 0).i(object4.e).n(object4.f).g(object4.g).r(object4.j).a());
        }
        for (Map.Entry<String, a.b> entry : ((TreeMap)object3).entrySet()) {
            object3 = ax.S0.a.e(map.get(entry.getKey()));
            a.b b8 = entry.getValue();
            ax.T1.c.e((SpannableStringBuilder)ax.S0.a.e(b8.e()));
            b8.h(((e)object3).c, ((e)object3).d);
            b8.i(((e)object3).e);
            b8.k(((e)object3).b);
            b8.n(((e)object3).f);
            b8.q(((e)object3).i, ((e)object3).h);
            b8.r(((e)object3).j);
            object.add(b8.a());
        }
        return object;
    }

    public long[] j() {
        Object object = new TreeSet<Long>();
        int n8 = 0;
        this.i((TreeSet<Long>)object, false);
        long[] lArray = new long[((TreeSet)object).size()];
        object = ((TreeSet)object).iterator();
        while (object.hasNext()) {
            lArray[n8] = (Long)object.next();
            ++n8;
        }
        return lArray;
    }

    public String[] l() {
        return this.g;
    }

    public boolean m(long l8) {
        long l9 = this.d;
        return l9 == -9223372036854775807L && this.e == -9223372036854775807L || l9 <= l8 && this.e == -9223372036854775807L || l9 == -9223372036854775807L && l8 < this.e || l9 <= l8 && l8 < this.e;
    }
}

