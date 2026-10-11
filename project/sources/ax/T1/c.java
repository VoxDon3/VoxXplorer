package ax.T1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import ax.R0.a;
import ax.S0.C0968a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
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

    private c(String str, String str2, long j, long j2, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = gVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        this.h = (String) C0968a.e(str3);
        this.j = cVar;
        this.k = new HashMap<>();
        this.l = new HashMap<>();
    }

    private void b(Map<String, g> map, a.b bVar, int i, int i2, int i3) {
        g f = f.f(this.f, this.g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f != null) {
            f.a(spannableStringBuilder2, i, i2, f, this.j, map, i3);
            if ("p".equals(this.a)) {
                if (f.m() != Float.MAX_VALUE) {
                    bVar.m((f.m() * (-90.0f)) / 100.0f);
                }
                if (f.o() != null) {
                    bVar.p(f.o());
                }
                if (f.i() != null) {
                    bVar.j(f.i());
                }
            }
        }
    }

    public static c c(String str, long j, long j2, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j, j2, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, HttpUrl.FRAGMENT_ENCODE_SET, null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), HttpUrl.FRAGMENT_ENCODE_SET);
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        boolean equals2 = "div".equals(this.a);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            this.m.get(i).i(treeSet, z || equals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, a.b> map) {
        if (!map.containsKey(str)) {
            a.b bVar = new a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C0968a.e(map.get(str).e());
    }

    private void n(long j, String str, List<Pair<String, String>> list) {
        if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(this.h)) {
            str = this.h;
        }
        if (m(j) && "div".equals(this.a) && this.i != null) {
            list.add(new Pair<>(str, this.i));
            return;
        }
        for (int i = 0; i < g(); i++) {
            f(i).n(j, str, list);
        }
    }

    private void o(long j, Map<String, g> map, Map<String, e> map2, String str, Map<String, a.b> map3) {
        if (m(j)) {
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET.equals(this.h) ? str : this.h;
            Iterator<Map.Entry<String, Integer>> it = this.l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.k.containsKey(key) ? this.k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    b(map, (a.b) C0968a.e(map3.get(key)), intValue, intValue2, ((e) C0968a.e(map2.get(str2))).j);
                }
            }
            for (int i = 0; i < g(); i++) {
                f(i).o(j, map, map2, str2, map3);
            }
        }
    }

    private void p(long j, boolean z, String str, Map<String, a.b> map) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(this.h)) {
            str = this.h;
        }
        String str2 = str;
        if (this.c && z) {
            k(str2, map).append((CharSequence) C0968a.e(this.b));
            return;
        }
        if ("br".equals(this.a) && z) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j)) {
            for (Map.Entry<String, a.b> entry : map.entrySet()) {
                this.k.put(entry.getKey(), Integer.valueOf(((CharSequence) C0968a.e(entry.getValue().e())).length()));
            }
            boolean equals = "p".equals(this.a);
            int i = 0;
            while (i < g()) {
                long j2 = j;
                Map<String, a.b> map2 = map;
                f(i).p(j2, z || equals, str2, map2);
                i++;
                j = j2;
                map = map2;
            }
            Map<String, a.b> map3 = map;
            if (equals) {
                f.c(k(str2, map3));
            }
            for (Map.Entry<String, a.b> entry2 : map3.entrySet()) {
                this.l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C0968a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(c cVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(cVar);
    }

    public c f(int i) {
        List<c> list = this.m;
        if (list != null) {
            return list.get(i);
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

    public List<ax.R0.a> h(long j, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        ArrayList arrayList = new ArrayList();
        n(j, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j, false, this.h, treeMap);
        o(j, map, map2, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) C0968a.e(map2.get(pair.first));
                arrayList2.add(new a.b().f(decodeByteArray).k(eVar.b).l(0).h(eVar.c, 0).i(eVar.e).n(eVar.f).g(eVar.g).r(eVar.j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) C0968a.e(map2.get(entry.getKey()));
            a.b bVar = (a.b) entry.getValue();
            e((SpannableStringBuilder) C0968a.e(bVar.e()));
            bVar.h(eVar2.c, eVar2.d);
            bVar.i(eVar2.e);
            bVar.k(eVar2.b);
            bVar.n(eVar2.f);
            bVar.q(eVar2.i, eVar2.h);
            bVar.r(eVar2.j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public String[] l() {
        return this.g;
    }

    public boolean m(long j) {
        long j2 = this.d;
        if (j2 == -9223372036854775807L && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.e) {
            return j2 <= j && j < this.e;
        }
        return true;
    }
}
