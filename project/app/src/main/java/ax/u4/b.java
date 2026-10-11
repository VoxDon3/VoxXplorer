/*
 * Decompiled with CFR 0.152.
 */
package ax.u4;

import ax.T4.h;
import ax.T4.j;
import ax.T4.m;
import ax.t4.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class b {
    public static final Set<String> c = new HashSet<String>(Arrays.asList("invalid_request", "invalid_grant", "unsupported_grant_type"));
    public static final ax.t4.b<b> d = new ax.t4.b<b>(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final b m(j j8) throws IOException, a {
            h h8 = ax.t4.b.b(j8);
            String string = null;
            String string2 = null;
            while (true) {
                if (j8.j() != m.p0) {
                    ax.t4.b.a(j8);
                    if (string == null) throw new a("missing field \"error\"", h8);
                    return new b(string, string2);
                }
                String string3 = j8.g();
                j8.H();
                try {
                    if (string3.equals("error")) {
                        string = ax.t4.b.h.f(j8, string3, string);
                        continue;
                    }
                }
                catch (a a8) {
                    throw a8.a(string3);
                }
                if (string3.equals("error_description")) {
                    string2 = ax.t4.b.h.f(j8, string3, string2);
                    continue;
                }
                ax.t4.b.k(j8);
            }
        }
    };
    private final String a;
    private final String b;

    public b(String string, String string2) {
        this.a = c.contains(string) ? string : "unknown";
        this.b = string2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

