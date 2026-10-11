/*
 * Decompiled with CFR 0.152.
 */
package ax.g7;

import ax.g7.b;
import ax.g7.c;
import ax.i7.q;
import ax.i7.r;
import ax.i7.w;
import ax.m7.A;
import ax.m7.t;
import ax.m7.v;
import java.io.IOException;
import java.util.logging.Logger;

public abstract class a {
    private static final Logger i = Logger.getLogger(a.class.getName());
    private final q a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final t f;
    private final boolean g;
    private final boolean h;

    protected a(a a8) {
        a8.getClass();
        this.b = ax.g7.a.i(a8.d);
        this.c = ax.g7.a.j(a8.e);
        this.d = a8.f;
        if (A.a(a8.g)) {
            i.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.e = a8.g;
        Object object = a8.b;
        object = object == null ? a8.a.c() : a8.a.d((r)object);
        this.a = object;
        this.f = a8.c;
        this.g = a8.h;
        this.h = a8.i;
    }

    static String i(String string) {
        v.e(string, "root URL cannot be null.");
        CharSequence charSequence = string;
        if (!string.endsWith("/")) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append("/");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }

    static String j(String string) {
        v.e(string, "service path cannot be null");
        if (string.length() == 1) {
            v.b("/".equals(string), "service path must equal \"/\" if it is of length 1.");
            return "";
        }
        String string2 = string;
        if (string.length() > 0) {
            CharSequence charSequence = string;
            if (!string.endsWith("/")) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("/");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            string2 = charSequence;
            if (((String)charSequence).startsWith("/")) {
                string2 = ((String)charSequence).substring(1);
            }
        }
        return string2;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public final c c() {
        return null;
    }

    public t d() {
        return this.f;
    }

    public final q e() {
        return this.a;
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.c;
    }

    protected void h(b<?> b8) throws IOException {
        this.c();
    }

    public static abstract class a {
        final w a;
        r b;
        final t c;
        String d;
        String e;
        String f;
        String g;
        boolean h;
        boolean i;

        protected a(w w8, String string, String string2, t t8, r r8) {
            this.a = v.d(w8);
            this.c = t8;
            this.c(string);
            this.d(string2);
            this.b = r8;
        }

        public a a(String string) {
            this.g = string;
            return this;
        }

        public a b(String string) {
            this.f = string;
            return this;
        }

        public a c(String string) {
            this.d = ax.g7.a.i(string);
            return this;
        }

        public a d(String string) {
            this.e = ax.g7.a.j(string);
            return this;
        }
    }
}

