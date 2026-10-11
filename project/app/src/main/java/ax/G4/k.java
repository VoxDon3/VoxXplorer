/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.P;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.v4.d;
import ax.v4.e;
import java.io.IOException;

public class k
extends P {
    public k(String string, String string2, String string3, String string4, String string5) {
        super(string, string2, string3, string4, string5);
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public String d() {
        return ax.G4.k$a.b.j(this, true);
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
            object = (k)object;
            String string = this.a;
            String string2 = ((P)object).a;
            return (string == string2 || string.equals(string2)) && ((string2 = this.b) == (string = ((P)object).b) || string2 != null && string2.equals(string)) && ((string2 = this.c) == (string = ((P)object).c) || string2 != null && string2.equals(string)) && ((string = this.d) == (string2 = ((P)object).d) || string != null && string.equals(string2)) && ((string2 = this.e) == (object = ((P)object).e) || string2 != null && string2.equals(object));
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
        return ax.G4.k$a.b.j(this, false);
    }

    static class a
    extends e<k> {
        public static final a b = new a();

        a() {
        }

        public k u(j j8, boolean bl) throws IOException, i {
            Object object;
            CharSequence charSequence;
            block13: {
                block12: {
                    if (bl) break block12;
                    ax.v4.c.h(j8);
                    charSequence = ax.v4.a.q(j8);
                    object = charSequence;
                    if (!"deleted".equals(charSequence)) break block13;
                }
                object = null;
            }
            if (object == null) {
                String string = null;
                String string2 = null;
                object = string2;
                CharSequence charSequence2 = charSequence = object;
                while (j8.j() == m.p0) {
                    String string3 = j8.g();
                    j8.H();
                    if ("name".equals(string3)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("path_lower".equals(string3)) {
                        string2 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("path_display".equals(string3)) {
                        object = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("parent_shared_folder_id".equals(string3)) {
                        charSequence = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("preview_url".equals(string3)) {
                        charSequence2 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    object = new k(string, string2, (String)object, (String)charSequence, (String)charSequence2);
                    if (!bl) {
                        ax.v4.c.e(j8);
                    }
                    ax.v4.b.a(object, ((k)object).d());
                    return object;
                }
                throw new i(j8, "Required field \"name\" missing.");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("No subtype found that matches tag: \"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\"");
            throw new i(j8, ((StringBuilder)charSequence).toString());
        }

        public void v(k k8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            this.r("deleted", g8);
            g8.o("name");
            ax.v4.d.f().k(k8.a, g8);
            if (k8.b != null) {
                g8.o("path_lower");
                ax.v4.d.d(ax.v4.d.f()).k(k8.b, g8);
            }
            if (k8.c != null) {
                g8.o("path_display");
                ax.v4.d.d(ax.v4.d.f()).k(k8.c, g8);
            }
            if (k8.d != null) {
                g8.o("parent_shared_folder_id");
                ax.v4.d.d(ax.v4.d.f()).k(k8.d, g8);
            }
            if (k8.e != null) {
                g8.o("preview_url");
                ax.v4.d.d(ax.v4.d.f()).k(k8.e, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

