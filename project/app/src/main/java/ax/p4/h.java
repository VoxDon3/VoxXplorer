/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.p4.g;
import ax.t4.a;
import ax.t4.b;
import ax.w4.f;
import java.io.IOException;

public final class h {
    public static final b<h> j = new b<h>(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public h m(j j8) throws IOException, a {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            ax.T4.h h8 = ax.t4.b.b(j8);
            String string = null;
            String string2 = null;
            Long l8 = null;
            Object object6 = object5 = (object4 = (object3 = (object2 = (object = l8))));
            while (j8.j() == m.p0) {
                String string3 = j8.g();
                ax.t4.b.c(j8);
                try {
                    if (string3.equals("token_type")) {
                        string = k.f(j8, string3, string);
                        continue;
                    }
                }
                catch (a a8) {
                    throw a8.a(string3);
                }
                if (string3.equals("access_token")) {
                    string2 = l.f(j8, string3, string2);
                    continue;
                }
                if (string3.equals("expires_in")) {
                    l8 = ax.t4.b.d.f(j8, string3, l8);
                    continue;
                }
                if (string3.equals("refresh_token")) {
                    object = ax.t4.b.h.f(j8, string3, object);
                    continue;
                }
                if (string3.equals("uid")) {
                    object2 = ax.t4.b.h.f(j8, string3, object2);
                    continue;
                }
                if (string3.equals("account_id")) {
                    object4 = ax.t4.b.h.f(j8, string3, object4);
                    continue;
                }
                if (string3.equals("team_id")) {
                    object3 = ax.t4.b.h.f(j8, string3, object3);
                    continue;
                }
                if (string3.equals("state")) {
                    object5 = ax.t4.b.h.f(j8, string3, object5);
                    continue;
                }
                if (string3.equals("scope")) {
                    object6 = ax.t4.b.h.f(j8, string3, object6);
                    continue;
                }
                ax.t4.b.k(j8);
            }
            ax.t4.b.a(j8);
            if (string == null) throw new a("missing field \"token_type\"", h8);
            if (string2 == null) throw new a("missing field \"access_token\"", h8);
            if (object2 == null) throw new a("missing field \"uid\"", h8);
            if (object4 == null) {
                if (object3 == null) throw new a("missing field \"account_id\" and missing field \"team_id\"", h8);
            }
            if (object == null) return new h(string2, l8, (String)object, (String)object2, (String)object3, (String)object4, (String)object5, (String)object6);
            if (l8 == null) throw new a("missing field \"expires_in\"", h8);
            return new h(string2, l8, (String)object, (String)object2, (String)object3, (String)object4, (String)object5, (String)object6);
        }
    };
    public static final b<String> k = new b<String>(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public String m(j j8) throws IOException, a {
            String string;
            try {
                string = j8.u();
                if (!string.equals("Bearer") && !string.equals("bearer")) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("expecting \"Bearer\": got ");
                    stringBuilder.append(ax.w4.f.f(string));
                    a a8 = new a(stringBuilder.toString(), j8.v());
                    throw a8;
                }
            }
            catch (i i8) {
                throw ax.t4.a.b(i8);
            }
            j8.H();
            return string;
        }
    };
    public static final b<String> l = new b<String>(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public String m(j j8) throws IOException, a {
            String string;
            Object object;
            try {
                object = j8.u();
                string = ax.p4.g.g((String)object);
                if (string == null) {
                    j8.H();
                    return object;
                }
            }
            catch (i i8) {
                throw ax.t4.a.b(i8);
            }
            object = new a(string, j8.v());
            throw object;
        }
    };
    private final String a;
    private final Long b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private long h;
    private final String i;

    public h(String string, Long l8, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.a = string;
        this.b = l8;
        this.c = string2;
        this.d = string3;
        this.e = string5;
        this.f = string4;
        this.g = string6;
        this.h = System.currentTimeMillis();
        this.i = string7;
    }

    public String a() {
        return this.a;
    }

    public Long b() {
        Long l8 = this.b;
        if (l8 == null) {
            return null;
        }
        return this.h + l8 * 1000L;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.i;
    }

    public String e() {
        return this.d;
    }
}

