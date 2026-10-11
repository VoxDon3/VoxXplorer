/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.T4.h;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.p4.k;
import ax.w4.a;
import ax.w4.b;
import ax.w4.f;
import java.io.IOException;

public class g
extends b {
    public static final ax.t4.b<g> d = new ax.t4.b<g>(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final g m(j object) throws IOException, ax.t4.a {
            h h8 = ax.t4.b.b((j)object);
            String string = null;
            k k8 = null;
            String string2 = null;
            while (true) {
                if (((j)object).j() != m.p0) {
                    ax.t4.b.a((j)object);
                    if (string == null) throw new ax.t4.a("missing field \"key\"", h8);
                    object = k8;
                    if (k8 != null) return new g(string, string2, (k)object);
                    object = k.e;
                    return new g(string, string2, (k)object);
                }
                String string3 = ((j)object).g();
                ((j)object).H();
                try {
                    if (string3.equals("key")) {
                        string = e.f((j)object, string3, string);
                        continue;
                    }
                }
                catch (ax.t4.a a8) {
                    throw a8.a(string3);
                }
                if (string3.equals("secret")) {
                    string2 = f.f((j)object, string3, string2);
                    continue;
                }
                if (string3.equals("host")) {
                    k8 = k.f.f((j)object, string3, k8);
                    continue;
                }
                ax.t4.b.k((j)object);
            }
        }
    };
    public static final ax.t4.b<String> e = new ax.t4.b<String>(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public String m(j j8) throws IOException, ax.t4.a {
            String string;
            CharSequence charSequence;
            try {
                charSequence = j8.u();
                string = g.f((String)charSequence);
                if (string == null) {
                    j8.H();
                    return charSequence;
                }
            }
            catch (i i8) {
                throw ax.t4.a.b(i8);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("bad format for app key: ");
            ((StringBuilder)charSequence).append(string);
            ax.t4.a a8 = new ax.t4.a(((StringBuilder)charSequence).toString(), j8.v());
            throw a8;
        }
    };
    public static final ax.t4.b<String> f = new ax.t4.b<String>(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public String m(j j8) throws IOException, ax.t4.a {
            String string;
            CharSequence charSequence;
            try {
                charSequence = j8.u();
                string = g.f((String)charSequence);
                if (string == null) {
                    j8.H();
                    return charSequence;
                }
            }
            catch (i i8) {
                throw ax.t4.a.b(i8);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("bad format for app secret: ");
            ((StringBuilder)charSequence).append(string);
            ax.t4.a a8 = new ax.t4.a(((StringBuilder)charSequence).toString(), j8.v());
            throw a8;
        }
    };
    private final String a;
    private final String b;
    private final k c;

    public g(String string, String string2, k k8) {
        g.d(string);
        g.e(string2);
        this.a = string;
        this.b = string2;
        this.c = k8;
    }

    public static void d(String string) {
        if ((string = string == null ? "can't be null" : g.g(string)) == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad 'key': ");
        stringBuilder.append(string);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void e(String string) {
        if ((string = g.g(string)) == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad 'secret': ");
        stringBuilder.append(string);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static String f(String string) {
        return g.g(string);
    }

    public static String g(String charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (((String)charSequence).length() == 0) {
            return "can't be empty";
        }
        for (int i8 = 0; i8 < ((String)charSequence).length(); ++i8) {
            char c8 = ((String)charSequence).charAt(i8);
            if (c8 >= '!' && c8 <= '~') {
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid character at index ");
            stringBuilder.append(i8);
            stringBuilder.append(": ");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("");
            ((StringBuilder)charSequence).append(c8);
            stringBuilder.append(ax.w4.f.f(((StringBuilder)charSequence).toString()));
            return stringBuilder.toString();
        }
        return null;
    }

    @Override
    protected void a(a a8) {
        a8.a("key").e(this.a);
        a8.a("secret").e(this.b);
    }
}

