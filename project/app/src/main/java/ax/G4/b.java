/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.d;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

class b {
    protected final String a;
    protected final boolean b;

    public b(String string, boolean bl) {
        if (string != null) {
            if (Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)", string)) {
                this.a = string;
                this.b = bl;
                return;
            }
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        throw new IllegalArgumentException("Required value for 'path' is null");
    }

    public String a() {
        return ax.G4.b$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            b b8 = (b)object;
            String string = this.a;
            object = b8.a;
            if ((string == object || string.equals(object)) && this.b == b8.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.b$a.b.j(this, false);
    }

    static class a
    extends e<b> {
        public static final a b = new a();

        a() {
        }

        public b u(j j8, boolean bl) throws IOException, i {
            Object object;
            CharSequence charSequence = null;
            if (!bl) {
                c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                object = Boolean.FALSE;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("path".equals(string)) {
                        charSequence = d.f().a(j8);
                        continue;
                    }
                    if ("autorename".equals(string)) {
                        object = d.a().a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (charSequence != null) {
                    object = new b((String)charSequence, (Boolean)object);
                    if (!bl) {
                        c.e(j8);
                    }
                    ax.v4.b.a(object, ((b)object).a());
                    return object;
                }
                throw new i(j8, "Required field \"path\" missing.");
            }
            charSequence = new StringBuilder();
            charSequence.append("No subtype found that matches tag: \"");
            charSequence.append((String)object);
            charSequence.append("\"");
            throw new i(j8, charSequence.toString());
        }

        public void v(b b8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("path");
            d.f().k(b8.a, g8);
            g8.o("autorename");
            d.a().k(b8.b, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

