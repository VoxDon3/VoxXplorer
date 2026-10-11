/*
 * Decompiled with CFR 0.152.
 */
package ax.t4;

import ax.T4.h;
import ax.T4.k;
import java.io.File;

public final class a
extends Exception {
    public final h c0;
    private a d0;
    public final String q;

    public a(String string, h h8) {
        this.q = string;
        this.c0 = h8;
        this.d0 = null;
    }

    public static a b(k k8) {
        String string = k8.getMessage();
        int n8 = string.lastIndexOf(" at [Source");
        String string2 = string;
        if (n8 >= 0) {
            string2 = string.substring(0, n8);
        }
        return new a(string2, k8.a());
    }

    public static void c(StringBuilder stringBuilder, h h8) {
        Object object = h8.d();
        if (object instanceof File) {
            stringBuilder.append(((File)object).getPath());
            stringBuilder.append(": ");
        }
        stringBuilder.append(h8.c());
        stringBuilder.append(".");
        stringBuilder.append(h8.b());
    }

    public a a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\"');
        stringBuilder.append(string);
        stringBuilder.append('\"');
        this.d0 = new a(stringBuilder.toString(), this.d0);
        return this;
    }

    @Override
    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        a.c(stringBuilder, this.c0);
        stringBuilder.append(": ");
        a a8 = this.d0;
        if (a8 != null) {
            stringBuilder.append(a8.a);
            while ((a8 = a8.b) != null) {
                stringBuilder.append(".");
                stringBuilder.append(a8.a);
            }
            stringBuilder.append(": ");
        }
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    public static final class a {
        public final String a;
        public final a b;

        public a(String string, a a8) {
            this.a = string;
            this.b = a8;
        }
    }
}

