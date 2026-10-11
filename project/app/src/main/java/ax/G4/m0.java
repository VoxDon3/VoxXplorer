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

public class m0 {
    protected final String a;

    public m0(String string) {
        if (string != null) {
            this.a = string;
            return;
        }
        throw new IllegalArgumentException("Required value for 'target' is null");
    }

    public String a() {
        return ax.G4.m0$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            Object object2 = (m0)object;
            object = this.a;
            object2 = ((m0)object2).a;
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
        return ax.G4.m0$a.b.j(this, false);
    }

    static class a
    extends e<m0> {
        public static final a b = new a();

        a() {
        }

        public m0 u(j j8, boolean bl) throws IOException, i {
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
                    if ("target".equals(charSequence)) {
                        object = d.f().a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (object != null) {
                    object = new m0((String)object);
                    if (!bl) {
                        c.e(j8);
                    }
                    ax.v4.b.a(object, ((m0)object).a());
                    return object;
                }
                throw new i(j8, "Required field \"target\" missing.");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("No subtype found that matches tag: \"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\"");
            throw new i(j8, ((StringBuilder)charSequence).toString());
        }

        public void v(m0 m02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("target");
            d.f().k(m02.a, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

