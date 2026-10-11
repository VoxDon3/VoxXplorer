/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.P;
import ax.G4.u;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;

public class j
extends u {
    protected final P a;

    public j(P p8) {
        if (p8 != null) {
            this.a = p8;
            return;
        }
        throw new IllegalArgumentException("Required value for 'metadata' is null");
    }

    public String a() {
        return ax.G4.j$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            Object object2 = (j)object;
            object = this.a;
            object2 = ((j)object2).a;
            return object == object2 || ((P)object).equals(object2);
            {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.a});
        return super.hashCode() * 31 + n8;
    }

    public String toString() {
        return ax.G4.j$a.b.j(this, false);
    }

    static class a
    extends e<j> {
        public static final a b = new a();

        a() {
        }

        public j u(ax.T4.j j8, boolean bl) throws IOException, i {
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
                    if ("metadata".equals(charSequence)) {
                        object = (P)P.a.b.a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (object != null) {
                    object = new j((P)object);
                    if (!bl) {
                        c.e(j8);
                    }
                    ax.v4.b.a(object, ((j)object).a());
                    return object;
                }
                throw new i(j8, "Required field \"metadata\" missing.");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("No subtype found that matches tag: \"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\"");
            throw new i(j8, ((StringBuilder)charSequence).toString());
        }

        public void v(j j8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("metadata");
            P.a.b.k(j8.a, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

