/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class f {
    private static final Map<String, Object> i;
    private final String a;
    private String b;
    private String c;
    private boolean d = true;
    private String e;
    private String f;
    private String g;
    private boolean h;

    static {
        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
        i = treeMap;
        treeMap.put("en", Locale.ENGLISH);
        treeMap.put("de", Locale.GERMAN);
        treeMap.put("it", Locale.ITALIAN);
        treeMap.put("es", new Locale("es", "", ""));
        treeMap.put("pt", new Locale("pt", "", ""));
        treeMap.put("da", new Locale("da", "", ""));
        treeMap.put("sv", new Locale("sv", "", ""));
        treeMap.put("no", new Locale("no", "", ""));
        treeMap.put("nl", new Locale("nl", "", ""));
        treeMap.put("ro", new Locale("ro", "", ""));
        treeMap.put("sq", new Locale("sq", "", ""));
        treeMap.put("sh", new Locale("sh", "", ""));
        treeMap.put("sk", new Locale("sk", "", ""));
        treeMap.put("sl", new Locale("sl", "", ""));
        treeMap.put("fr", "jan|f\u00e9v|mar|avr|mai|jun|jui|ao\u00fb|sep|oct|nov|d\u00e9c");
    }

    public f(f f8) {
        this.a = f8.a;
        this.b = f8.b;
        this.d = f8.d;
        this.c = f8.c;
        this.h = f8.h;
        this.e = f8.e;
        this.g = f8.g;
        this.f = f8.f;
    }

    public f(String string) {
        this.a = string;
    }

    f(String string, f f8) {
        this.a = string;
        this.b = f8.b;
        this.d = f8.d;
        this.c = f8.c;
        this.h = f8.h;
        this.e = f8.e;
        this.g = f8.g;
        this.f = f8.f;
    }

    public f(String string, String string2, String string3) {
        this(string);
        this.b = string2;
        this.c = string3;
    }

    public static DateFormatSymbols a(String stringArray) {
        stringArray = ax.Sc.f.m((String)stringArray);
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.US);
        dateFormatSymbols.setShortMonths(stringArray);
        return dateFormatSymbols;
    }

    public static DateFormatSymbols j(String object) {
        if ((object = i.get(object)) != null) {
            if (object instanceof Locale) {
                return new DateFormatSymbols((Locale)object);
            }
            if (object instanceof String) {
                return ax.Sc.f.a((String)object);
            }
        }
        return new DateFormatSymbols(Locale.US);
    }

    private static String[] m(String object) {
        if (12 == ((StringTokenizer)(object = new StringTokenizer((String)object, "|"))).countTokens()) {
            String[] stringArray = new String[13];
            int n8 = 0;
            while (((StringTokenizer)object).hasMoreTokens()) {
                stringArray[n8] = ((StringTokenizer)object).nextToken();
                ++n8;
            }
            stringArray[n8] = "";
            return stringArray;
        }
        throw new IllegalArgumentException("expecting a pipe-delimited string containing 12 tokens");
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

    public void k(String string) {
        this.b = string;
    }

    public void l(String string) {
        this.c = string;
    }
}

