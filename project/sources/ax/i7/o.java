package ax.i7;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class o {
    private static final Pattern e = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private static final Pattern f = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern g = Pattern.compile("\\s*([^\\s/=;\"]+)/([^\\s/=;\"]+)\\s*(;.*)?", 32);
    private static final Pattern h;
    private String a = "application";
    private String b = "octet-stream";
    private final SortedMap<String, String> c = new TreeMap();
    private String d;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("\"([^\"]*)\"");
        sb.append("|");
        sb.append("[^\\s;\"]*");
        h = Pattern.compile("\\s*;\\s*([^\\s/=;\"]+)=(" + sb.toString() + ")");
    }

    public o(String str) {
        d(str);
    }

    public static boolean c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return (str == null || str2 == null || !new o(str).b(new o(str2))) ? false : true;
    }

    private o d(String str) {
        Matcher matcher = g.matcher(str);
        ax.m7.v.b(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        o(matcher.group(1));
        n(matcher.group(2));
        String group = matcher.group(3);
        if (group != null) {
            Matcher matcher2 = h.matcher(group);
            while (matcher2.find()) {
                String group2 = matcher2.group(1);
                String group3 = matcher2.group(3);
                if (group3 == null) {
                    group3 = matcher2.group(2);
                }
                m(group2, group3);
            }
        }
        return this;
    }

    static boolean i(String str) {
        return f.matcher(str).matches();
    }

    private static String j(String str) {
        return "\"" + str.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }

    public String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        SortedMap<String, String> sortedMap = this.c;
        if (sortedMap != null) {
            for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
                String value = entry.getValue();
                sb.append("; ");
                sb.append(entry.getKey());
                sb.append("=");
                if (!i(value)) {
                    value = j(value);
                }
                sb.append(value);
            }
        }
        String sb2 = sb.toString();
        this.d = sb2;
        return sb2;
    }

    public boolean b(o oVar) {
        return oVar != null && h().equalsIgnoreCase(oVar.h()) && g().equalsIgnoreCase(oVar.g());
    }

    public Charset e() {
        String f2 = f("charset");
        if (f2 == null) {
            return null;
        }
        return Charset.forName(f2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return b(oVar) && this.c.equals(oVar.c);
    }

    public String f(String str) {
        return this.c.get(str.toLowerCase(Locale.US));
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.a;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public o k(String str) {
        this.d = null;
        this.c.remove(str.toLowerCase(Locale.US));
        return this;
    }

    public o l(Charset charset) {
        m("charset", charset == null ? null : charset.name());
        return this;
    }

    public o m(String str, String str2) {
        if (str2 == null) {
            k(str);
            return this;
        }
        ax.m7.v.b(f.matcher(str).matches(), "Name contains reserved characters");
        this.d = null;
        this.c.put(str.toLowerCase(Locale.US), str2);
        return this;
    }

    public o n(String str) {
        ax.m7.v.b(e.matcher(str).matches(), "Subtype contains reserved characters");
        this.b = str;
        this.d = null;
        return this;
    }

    public o o(String str) {
        ax.m7.v.b(e.matcher(str).matches(), "Type contains reserved characters");
        this.a = str;
        this.d = null;
        return this;
    }

    public String toString() {
        return a();
    }
}
