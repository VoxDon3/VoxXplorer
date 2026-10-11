package ax.p4;

import ax.s4.AbstractC3046a;
import ax.s4.C3047b;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class m {
    private final String a;
    private final String b;
    private final AbstractC3046a c;
    private final int d;

    public static final class b {
        private final String a;
        private String b;
        private AbstractC3046a c;
        private int d;

        public m a() {
            return new m(this.a, this.b, this.c, this.d);
        }

        public b b(AbstractC3046a abstractC3046a) {
            if (abstractC3046a == null) {
                throw new NullPointerException("httpRequestor");
            }
            this.c = abstractC3046a;
            return this;
        }

        private b(String str) {
            this.a = str;
            this.b = null;
            this.c = C3047b.e;
            this.d = 0;
        }
    }

    public static b e(String str) {
        if (str != null) {
            return new b(str);
        }
        throw new NullPointerException("clientIdentifier");
    }

    private static String f(String str) {
        if (str == null) {
            return null;
        }
        if (!str.contains("_") || str.startsWith("_")) {
            return str;
        }
        String[] split = str.split("_", 3);
        return g(new Locale(split[0], split[1], split.length == 3 ? split[2] : HttpUrl.FRAGMENT_ENCODE_SET));
    }

    private static String g(Locale locale) {
        if (locale == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage().toLowerCase());
        if (!locale.getCountry().isEmpty()) {
            sb.append("-");
            sb.append(locale.getCountry().toUpperCase());
        }
        return sb.toString();
    }

    public String a() {
        return this.a;
    }

    public AbstractC3046a b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    private m(String str, String str2, AbstractC3046a abstractC3046a, int i) {
        if (str == null) {
            throw new NullPointerException("clientIdentifier");
        }
        if (abstractC3046a == null) {
            throw new NullPointerException("httpRequestor");
        }
        if (i < 0) {
            throw new IllegalArgumentException("maxRetries");
        }
        this.a = str;
        this.b = f(str2);
        this.c = abstractC3046a;
        this.d = i;
    }
}
