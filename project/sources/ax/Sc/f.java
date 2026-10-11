package ax.Sc;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class f {
    private static final Map<String, Object> i;
    private final String a;
    private String b;
    private String c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private boolean h;

    static {
        TreeMap treeMap = new TreeMap();
        i = treeMap;
        treeMap.put("en", Locale.ENGLISH);
        treeMap.put("de", Locale.GERMAN);
        treeMap.put("it", Locale.ITALIAN);
        treeMap.put("es", new Locale("es", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("pt", new Locale("pt", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("da", new Locale("da", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("sv", new Locale("sv", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("no", new Locale("no", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("nl", new Locale("nl", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("ro", new Locale("ro", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("sq", new Locale("sq", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("sh", new Locale("sh", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("sk", new Locale("sk", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("sl", new Locale("sl", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        treeMap.put("fr", "jan|fév|mar|avr|mai|jun|jui|aoû|sep|oct|nov|déc");
    }

    public f(f fVar) {
        this.d = true;
        this.a = fVar.a;
        this.b = fVar.b;
        this.d = fVar.d;
        this.c = fVar.c;
        this.h = fVar.h;
        this.e = fVar.e;
        this.g = fVar.g;
        this.f = fVar.f;
    }

    public static DateFormatSymbols a(String str) {
        String[] m = m(str);
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.US);
        dateFormatSymbols.setShortMonths(m);
        return dateFormatSymbols;
    }

    public static DateFormatSymbols j(String str) {
        Object obj = i.get(str);
        if (obj != null) {
            if (obj instanceof Locale) {
                return new DateFormatSymbols((Locale) obj);
            }
            if (obj instanceof String) {
                return a((String) obj);
            }
        }
        return new DateFormatSymbols(Locale.US);
    }

    private static String[] m(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "|");
        if (12 != stringTokenizer.countTokens()) {
            throw new IllegalArgumentException("expecting a pipe-delimited string containing 12 tokens");
        }
        String[] strArr = new String[13];
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            strArr[i2] = stringTokenizer.nextToken();
            i2++;
        }
        strArr[i2] = HttpUrl.FRAGMENT_ENCODE_SET;
        return strArr;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.f;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.d;
    }

    public void k(String str) {
        this.b = str;
    }

    public void l(String str) {
        this.c = str;
    }

    public f(String str) {
        this.d = true;
        this.a = str;
    }

    f(String str, f fVar) {
        this.d = true;
        this.a = str;
        this.b = fVar.b;
        this.d = fVar.d;
        this.c = fVar.c;
        this.h = fVar.h;
        this.e = fVar.e;
        this.g = fVar.g;
        this.f = fVar.f;
    }

    public f(String str, String str2, String str3) {
        this(str);
        this.b = str2;
        this.c = str3;
    }
}
