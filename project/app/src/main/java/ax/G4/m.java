/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.v4.b;
import ax.v4.c;
import ax.v4.d;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

class m {
    protected final String a;
    protected final String b;

    public m(String string, String string2) {
        if (string != null) {
            if (Pattern.matches("(/(.|[\\r\\n])*|id:.*)|(rev:[0-9a-f]{9,})|(ns:[0-9]+(/.*)?)", string)) {
                this.a = string;
                if (string2 != null) {
                    if (string2.length() >= 9) {
                        if (!Pattern.matches("[0-9a-f]+", string2)) {
                            throw new IllegalArgumentException("String 'rev' does not match pattern");
                        }
                    } else {
                        throw new IllegalArgumentException("String 'rev' is shorter than 9");
                    }
                }
                this.b = string2;
                return;
            }
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        throw new IllegalArgumentException("Required value for 'path' is null");
    }

    public String a() {
        return ax.G4.m$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (m)object;
            String string = this.a;
            String string2 = ((m)object).a;
            return (string == string2 || string.equals(string2)) && ((string = this.b) == (object = ((m)object).b) || string != null && string.equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.m$a.b.j(this, false);
    }

    static class a
    extends e<m> {
        public static final a b = new a();

        a() {
        }

        public m u(j j8, boolean bl) throws IOException, i {
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
                while (j8.j() == ax.T4.m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("path".equals(string)) {
                        charSequence = d.f().a(j8);
                        continue;
                    }
                    if ("rev".equals(string)) {
                        object = d.d(d.f()).a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (charSequence != null) {
                    object = new m((String)charSequence, (String)object);
                    if (!bl) {
                        c.e(j8);
                    }
                    ax.v4.b.a(object, ((m)object).a());
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

        public void v(m m8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("path");
            d.f().k(m8.a, g8);
            if (m8.b != null) {
                g8.o("rev");
                d.d(d.f()).k(m8.b, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

