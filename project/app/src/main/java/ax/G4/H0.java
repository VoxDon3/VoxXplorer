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

public class H0 {
    protected final long a;

    public H0(long l8) {
        this.a = l8;
    }

    public long a() {
        return this.a;
    }

    public String b() {
        return ax.G4.H0$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (H0)object;
            if (this.a == ((H0)object).a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        return ax.G4.H0$a.b.j(this, false);
    }

    static class a
    extends e<H0> {
        public static final a b = new a();

        a() {
        }

        public H0 u(j j8, boolean bl) throws IOException, i {
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
                    if ("correct_offset".equals(charSequence)) {
                        object = d.i().a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (object != null) {
                    object = new H0((Long)object);
                    if (!bl) {
                        c.e(j8);
                    }
                    ax.v4.b.a(object, ((H0)object).b());
                    return object;
                }
                throw new i(j8, "Required field \"correct_offset\" missing.");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("No subtype found that matches tag: \"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\"");
            throw new i(j8, ((StringBuilder)charSequence).toString());
        }

        public void v(H0 h02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("correct_offset");
            d.i().k(h02.a, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

