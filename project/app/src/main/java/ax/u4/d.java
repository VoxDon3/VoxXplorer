/*
 * Decompiled with CFR 0.152.
 */
package ax.u4;

import ax.T4.h;
import ax.T4.j;
import ax.T4.m;
import ax.t4.a;
import ax.t4.b;
import java.io.IOException;

public class d {
    public static final b<d> e = new b<d>(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public d m(j j8) throws IOException, a {
            h h8 = ax.t4.b.b(j8);
            String string = null;
            String string2 = null;
            Long l8 = null;
            Object object = l8;
            while (true) {
                if (j8.j() != m.p0) {
                    ax.t4.b.a(j8);
                    if (string == null) throw new a("missing field \"token_type\"", h8);
                    if (string2 == null) throw new a("missing field \"access_token\"", h8);
                    if (l8 == null) throw new a("missing field \"expires_in\"", h8);
                    return new d(string2, l8, (String)object);
                }
                String string3 = j8.g();
                ax.t4.b.c(j8);
                try {
                    if (string3.equals("token_type")) {
                        string = ax.p4.h.k.f(j8, string3, string);
                        continue;
                    }
                }
                catch (a a8) {
                    throw a8.a(string3);
                }
                if (string3.equals("access_token")) {
                    string2 = ax.p4.h.l.f(j8, string3, string2);
                    continue;
                }
                if (string3.equals("expires_in")) {
                    l8 = ax.t4.b.d.f(j8, string3, l8);
                    continue;
                }
                if (string3.equals("scope")) {
                    object = ax.t4.b.h.f(j8, string3, object);
                    continue;
                }
                ax.t4.b.k(j8);
            }
        }
    };
    private final String a;
    private final long b;
    private long c;
    private String d;

    public d(String string, long l8) {
        this(string, l8, null);
    }

    public d(String string, long l8, String string2) {
        if (string != null) {
            this.a = string;
            this.b = l8;
            this.c = System.currentTimeMillis();
            this.d = string2;
            return;
        }
        throw new IllegalArgumentException("access token can't be null.");
    }

    public String a() {
        return this.a;
    }

    public Long b() {
        return this.c + this.b * 1000L;
    }
}

