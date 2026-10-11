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

public class B0 {
    protected final String a;
    protected final long b;

    public B0(String string, long l8) {
        if (string != null) {
            this.a = string;
            this.b = l8;
            return;
        }
        throw new IllegalArgumentException("Required value for 'sessionId' is null");
    }

    public String a() {
        return ax.G4.B0$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            B0 b02 = (B0)object;
            String string = this.a;
            object = b02.a;
            if ((string == object || string.equals(object)) && this.b == b02.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.B0$a.b.j(this, false);
    }

    static class a
    extends e<B0> {
        public static final a b = new a();

        a() {
        }

        public B0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            CharSequence charSequence = null;
            if (!bl) {
                c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                object = null;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("session_id".equals(string)) {
                        charSequence = d.f().a(j8);
                        continue;
                    }
                    if ("offset".equals(string)) {
                        object = d.i().a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (charSequence != null) {
                    if (object != null) {
                        object = new B0((String)charSequence, (Long)object);
                        if (!bl) {
                            c.e(j8);
                        }
                        ax.v4.b.a(object, ((B0)object).a());
                        return object;
                    }
                    throw new i(j8, "Required field \"offset\" missing.");
                }
                throw new i(j8, "Required field \"session_id\" missing.");
            }
            charSequence = new StringBuilder();
            charSequence.append("No subtype found that matches tag: \"");
            charSequence.append((String)object);
            charSequence.append("\"");
            throw new i(j8, charSequence.toString());
        }

        public void v(B0 b02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("session_id");
            d.f().k(b02.a, g8);
            g8.o("offset");
            d.i().k(b02.b, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

