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
import ax.v4.d;
import java.io.IOException;

public class e
extends c {
    public e(String string, String string2) {
        super(string, string2);
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
        return ax.C4.e$a.b.j(this, true);
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
            object = (e)object;
            String string = this.a;
            String string2 = ((c)object).a;
            return !(string != string2 && !string.equals(string2) || (string = this.b) != (object = ((c)object).b) && !string.equals(object));
            {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getClass().toString().hashCode();
    }

    @Override
    public String toString() {
        return ax.C4.e$a.b.j(this, false);
    }

    static class a
    extends ax.v4.e<e> {
        public static final a b = new a();

        a() {
        }

        public e u(j j8, boolean bl) throws IOException, i {
            Object object;
            String string;
            CharSequence charSequence;
            block11: {
                block10: {
                    charSequence = null;
                    if (bl) break block10;
                    ax.v4.c.h(j8);
                    string = ax.v4.a.q(j8);
                    object = string;
                    if (!"user".equals(string)) break block11;
                }
                object = null;
            }
            if (object == null) {
                object = null;
                while (j8.j() == m.p0) {
                    string = j8.g();
                    j8.H();
                    if ("root_namespace_id".equals(string)) {
                        charSequence = d.f().a(j8);
                        continue;
                    }
                    if ("home_namespace_id".equals(string)) {
                        object = d.f().a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (charSequence != null) {
                    if (object != null) {
                        object = new e((String)charSequence, (String)object);
                        if (!bl) {
                            ax.v4.c.e(j8);
                        }
                        ax.v4.b.a(object, ((e)object).c());
                        return object;
                    }
                    throw new i(j8, "Required field \"home_namespace_id\" missing.");
                }
                throw new i(j8, "Required field \"root_namespace_id\" missing.");
            }
            charSequence = new StringBuilder();
            charSequence.append("No subtype found that matches tag: \"");
            charSequence.append((String)object);
            charSequence.append("\"");
            throw new i(j8, charSequence.toString());
        }

        public void v(e e8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            this.r("user", g8);
            g8.o("root_namespace_id");
            d.f().k(e8.a, g8);
            g8.o("home_namespace_id");
            d.f().k(e8.b, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

