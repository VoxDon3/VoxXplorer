/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.s4.a;
import java.util.Locale;

public class m {
    private final String a;
    private final String b;
    private final a c;
    private final int d;

    private m(String string, String string2, a a8, int n8) {
        if (string != null) {
            if (a8 != null) {
                if (n8 >= 0) {
                    this.a = string;
                    this.b = m.f(string2);
                    this.c = a8;
                    this.d = n8;
                    return;
                }
                throw new IllegalArgumentException("maxRetries");
            }
            throw new NullPointerException("httpRequestor");
        }
        throw new NullPointerException("clientIdentifier");
    }

    public static b e(String string) {
        if (string != null) {
            return new b(string);
        }
        throw new NullPointerException("clientIdentifier");
    }

    private static String f(String object) {
        if (object == null) {
            return null;
        }
        if (!object.contains("_") || object.startsWith("_")) {
            return object;
        }
        object = object.split("_", 3);
        String string = object[0];
        String string2 = object[1];
        object = ((String[])object).length == 3 ? object[2] : "";
        return m.g(new Locale(string, string2, (String)object));
    }

    private static String g(Locale locale) {
        if (locale == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(locale.getLanguage().toLowerCase());
        if (!locale.getCountry().isEmpty()) {
            stringBuilder.append("-");
            stringBuilder.append(locale.getCountry().toUpperCase());
        }
        return stringBuilder.toString();
    }

    public String a() {
        return this.a;
    }

    public a b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public static final class b {
        private final String a;
        private String b;
        private a c;
        private int d;

        private b(String string) {
            this.a = string;
            this.b = null;
            this.c = ax.s4.b.e;
            this.d = 0;
        }

        public m a() {
            return new m(this.a, this.b, this.c, this.d);
        }

        public b b(a a8) {
            if (a8 != null) {
                this.c = a8;
                return this;
            }
            throw new NullPointerException("httpRequestor");
        }
    }
}

