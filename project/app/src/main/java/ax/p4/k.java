/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.T4.g;
import ax.T4.h;
import ax.T4.j;
import ax.T4.m;
import ax.t4.a;
import ax.t4.b;
import ax.t4.c;
import java.io.IOException;
import java.util.Arrays;

public final class k {
    public static final k e = new k("api.dropboxapi.com", "content.dropboxapi.com", "www.dropbox.com", "notify.dropboxapi.com");
    public static final b<k> f = new b<k>(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public k m(j j8) throws IOException, a {
            Object object = j8.j();
            if (object == m.r0) {
                object = j8.u();
                ax.t4.b.c(j8);
                return k.g((String)object);
            }
            if (object != m.l0) throw new a("expecting a string or an object", j8.v());
            h h8 = j8.v();
            ax.t4.b.c(j8);
            String string = null;
            String string2 = null;
            String string3 = null;
            object = string3;
            while (true) {
                if (j8.j() != m.p0) {
                    ax.t4.b.a(j8);
                    if (string == null) throw new a("missing field \"api\"", h8);
                    if (string2 == null) throw new a("missing field \"content\"", h8);
                    if (string3 == null) throw new a("missing field \"web\"", h8);
                    if (object == null) throw new a("missing field \"notify\"", h8);
                    return new k(string, string2, string3, (String)object);
                }
                String string4 = j8.g();
                j8.H();
                try {
                    if (string4.equals("api")) {
                        string = ax.t4.b.h.f(j8, string4, string);
                        continue;
                    }
                }
                catch (a a8) {
                    throw a8.a(string4);
                }
                if (string4.equals("content")) {
                    string2 = ax.t4.b.h.f(j8, string4, string2);
                    continue;
                }
                if (string4.equals("web")) {
                    string3 = ax.t4.b.h.f(j8, string4, string3);
                    continue;
                }
                if (!string4.equals("notify")) {
                    object = new a("unknown field", j8.f());
                    throw object;
                }
                object = ax.t4.b.h.f(j8, string4, object);
            }
        }
    };
    public static final c<k> g = new c<k>(){

        public void d(k k8, g g8) throws IOException {
            String string = k8.l();
            if (string != null) {
                g8.s0(string);
                return;
            }
            g8.o0();
            g8.u0("api", k8.a);
            g8.u0("content", k8.b);
            g8.u0("web", k8.c);
            g8.u0("notify", k8.d);
            g8.m();
        }
    };
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public k(String string, String string2, String string3, String string4) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
    }

    private static k g(String string) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append("api-");
        charSequence.append(string);
        charSequence = charSequence.toString();
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append("api-content-");
        charSequence2.append(string);
        charSequence2 = charSequence2.toString();
        CharSequence charSequence3 = new StringBuilder();
        charSequence3.append("meta-");
        charSequence3.append(string);
        charSequence3 = charSequence3.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("api-notify-");
        stringBuilder.append(string);
        return new k((String)charSequence, (String)charSequence2, (String)charSequence3, stringBuilder.toString());
    }

    private String l() {
        if (this.c.startsWith("meta-") && this.a.startsWith("api-") && this.b.startsWith("api-content-") && this.d.startsWith("api-notify-")) {
            String string = this.c.substring(5);
            String string2 = this.a.substring(4);
            String string3 = this.b.substring(12);
            String string4 = this.d.substring(11);
            if (string.equals(string2) && string.equals(string3) && string.equals(string4)) {
                return string;
            }
        }
        return null;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof k) {
            object = (k)object;
            if (((k)object).a.equals(this.a) && ((k)object).b.equals(this.b) && ((k)object).c.equals(this.c) && ((k)object).d.equals(this.d)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new String[]{this.a, this.b, this.c, this.d});
    }

    public String i() {
        return this.b;
    }

    public String j() {
        return this.d;
    }

    public String k() {
        return this.c;
    }
}

