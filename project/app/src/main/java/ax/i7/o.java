/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.m7.v;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class o {
    private static final Pattern e = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private static final Pattern f = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern g;
    private static final Pattern h;
    private String a = "application";
    private String b = "octet-stream";
    private final SortedMap<String, String> c = new TreeMap<String, String>();
    private String d;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\\s*(");
        stringBuilder.append("[^\\s/=;\"]+");
        stringBuilder.append(")/(");
        stringBuilder.append("[^\\s/=;\"]+");
        stringBuilder.append(")\\s*(");
        stringBuilder.append(";.*");
        stringBuilder.append(")?");
        g = Pattern.compile(stringBuilder.toString(), 32);
        stringBuilder = new StringBuilder();
        stringBuilder.append("\"([^\"]*)\"");
        stringBuilder.append("|");
        stringBuilder.append("[^\\s;\"]*");
        String string = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("\\s*;\\s*(");
        stringBuilder.append("[^\\s/=;\"]+");
        stringBuilder.append(")=(");
        stringBuilder.append(string);
        stringBuilder.append(")");
        h = Pattern.compile(stringBuilder.toString());
    }

    public o(String string) {
        this.d(string);
    }

    public static boolean c(String string, String string2) {
        return string == null && string2 == null || string != null && string2 != null && new o(string).b(new o(string2));
    }

    private o d(String object) {
        object = g.matcher((CharSequence)object);
        v.b(((Matcher)object).matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        this.o(((Matcher)object).group(1));
        this.n(((Matcher)object).group(2));
        object = ((Matcher)object).group(3);
        if (object != null) {
            Matcher matcher = h.matcher((CharSequence)object);
            while (matcher.find()) {
                String string = matcher.group(1);
                String string2 = matcher.group(3);
                object = string2;
                if (string2 == null) {
                    object = matcher.group(2);
                }
                this.m(string, (String)object);
            }
        }
        return this;
    }

    static boolean i(String string) {
        return f.matcher(string).matches();
    }

    private static String j(String charSequence) {
        String string = ((String)charSequence).replace("\\", "\\\\").replace("\"", "\\\"");
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("\"");
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append("\"");
        return ((StringBuilder)charSequence).toString();
    }

    /*
     * WARNING - void declaration
     */
    public String a() {
        String string;
        String object2 = this.d;
        if (object2 != null) {
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append('/');
        stringBuilder.append(this.b);
        SortedMap<String, String> sortedMap = this.c;
        if (sortedMap != null) {
            for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
                String var1_7;
                String string2 = entry.getValue();
                stringBuilder.append("; ");
                stringBuilder.append(entry.getKey());
                stringBuilder.append("=");
                String string3 = string2;
                if (!o.i(string2)) {
                    String string4 = o.j(string2);
                }
                stringBuilder.append((String)var1_7);
            }
        }
        this.d = string = stringBuilder.toString();
        return string;
    }

    public boolean b(o o8) {
        return o8 != null && this.h().equalsIgnoreCase(o8.h()) && this.g().equalsIgnoreCase(o8.g());
    }

    public Charset e() {
        String string = this.f("charset");
        if (string == null) {
            return null;
        }
        return Charset.forName(string);
    }

    public boolean equals(Object object) {
        if (!(object instanceof o)) {
            return false;
        }
        return this.b((o)(object = (o)object)) && this.c.equals(((o)object).c);
    }

    public String f(String string) {
        return (String)this.c.get(string.toLowerCase(Locale.US));
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.a;
    }

    public int hashCode() {
        return this.a().hashCode();
    }

    public o k(String string) {
        this.d = null;
        this.c.remove(string.toLowerCase(Locale.US));
        return this;
    }

    public o l(Charset object) {
        object = object == null ? null : ((Charset)object).name();
        this.m("charset", (String)object);
        return this;
    }

    public o m(String string, String string2) {
        if (string2 == null) {
            this.k(string);
            return this;
        }
        v.b(f.matcher(string).matches(), "Name contains reserved characters");
        this.d = null;
        this.c.put(string.toLowerCase(Locale.US), string2);
        return this;
    }

    public o n(String string) {
        v.b(e.matcher(string).matches(), "Subtype contains reserved characters");
        this.b = string;
        this.d = null;
        return this;
    }

    public o o(String string) {
        v.b(e.matcher(string).matches(), "Type contains reserved characters");
        this.a = string;
        this.d = null;
        return this;
    }

    public String toString() {
        return this.a();
    }
}

