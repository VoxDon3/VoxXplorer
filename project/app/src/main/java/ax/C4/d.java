/*
 * Decompiled with CFR 0.152.
 */
package ax.C4;

import ax.C4.c;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;

public class d
extends c {
    protected final String c;

    public d(String string, String string2, String string3) {
        super(string, string2);
        if (string3 != null) {
            this.c = string3;
            return;
        }
        throw new IllegalArgumentException("Required value for 'homePath' is null");
    }

    @Override
    public String a() {
        return this.b;
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public String c() {
        return ax.C4.d$a.b.j(this, true);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (d)object;
            String string = this.a;
            String string2 = ((c)object).a;
            return !(string != string2 && !string.equals(string2) || (string = this.b) != (string2 = ((c)object).b) && !string.equals(string2) || (string = this.c) != (object = ((d)object).c) && !string.equals(object));
            {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.c});
        return super.hashCode() * 31 + n8;
    }

    @Override
    public String toString() {
        return ax.C4.d$a.b.j(this, false);
    }

    static class a
    extends e<d> {
        public static final a b = new a();

        a() {
        }

        public d u(j j8, boolean bl) throws IOException, i {
            Object object;
            CharSequence charSequence;
            String string;
            block13: {
                block12: {
                    string = null;
                    if (bl) break block12;
                    ax.v4.c.h(j8);
                    charSequence = ax.v4.a.q(j8);
                    object = charSequence;
                    if (!"team".equals(charSequence)) break block13;
                }
                object = null;
            }
            if (object == null) {
                charSequence = null;
                object = null;
                while (j8.j() == m.p0) {
                    String string2 = j8.g();
                    j8.H();
                    if ("root_namespace_id".equals(string2)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("home_namespace_id".equals(string2)) {
                        charSequence = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("home_path".equals(string2)) {
                        object = ax.v4.d.f().a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    if (charSequence != null) {
                        if (object != null) {
                            object = new d(string, (String)charSequence, (String)object);
                            if (!bl) {
                                ax.v4.c.e(j8);
                            }
                            ax.v4.b.a(object, ((d)object).c());
                            return object;
                        }
                        throw new i(j8, "Required field \"home_path\" missing.");
                    }
                    throw new i(j8, "Required field \"home_namespace_id\" missing.");
                }
                throw new i(j8, "Required field \"root_namespace_id\" missing.");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("No subtype found that matches tag: \"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\"");
            throw new i(j8, ((StringBuilder)charSequence).toString());
        }

        public void v(d d8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            this.r("team", g8);
            g8.o("root_namespace_id");
            ax.v4.d.f().k(d8.a, g8);
            g8.o("home_namespace_id");
            ax.v4.d.f().k(d8.b, g8);
            g8.o("home_path");
            ax.v4.d.f().k(d8.c, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

