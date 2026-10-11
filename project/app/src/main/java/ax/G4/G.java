/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

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
import java.util.Arrays;

class G {
    protected final String a;

    public G(String string) {
        if (string != null) {
            if (string.length() >= 1) {
                this.a = string;
                return;
            }
            throw new IllegalArgumentException("String 'cursor' is shorter than 1");
        }
        throw new IllegalArgumentException("Required value for 'cursor' is null");
    }

    public String a() {
        return ax.G4.G$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            Object object2 = (G)object;
            object = this.a;
            object2 = ((G)object2).a;
            return object == object2 || ((String)object).equals(object2);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        return ax.G4.G$a.b.j(this, false);
    }

    static class a
    extends e<G> {
        public static final a b = new a();

        a() {
        }

        public G u(j j8, boolean bl) throws IOException, i {
            Object object;
            CharSequence charSequence = null;
            if (!bl) {
                c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                object = charSequence;
                while (j8.j() == m.p0) {
                    charSequence = j8.g();
                    j8.H();
                    if ("cursor".equals(charSequence)) {
                        object = d.f().a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (object != null) {
                    object = new G((String)object);
                    if (!bl) {
                        c.e(j8);
                    }
                    ax.v4.b.a(object, ((G)object).a());
                    return object;
                }
                throw new i(j8, "Required field \"cursor\" missing.");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("No subtype found that matches tag: \"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\"");
            throw new i(j8, ((StringBuilder)charSequence).toString());
        }

        public void v(G g8, g g9, boolean bl) throws IOException, f {
            if (!bl) {
                g9.o0();
            }
            g9.o("cursor");
            d.f().k(g8.a, g9);
            if (!bl) {
                g9.m();
            }
        }
    }
}

