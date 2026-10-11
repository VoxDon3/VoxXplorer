/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.T4.f;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.v4.d;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class g {
    protected final String a;
    protected final String b;

    public g(String string) {
        this(string, null);
    }

    public g(String string, String string2) {
        if (string != null) {
            if (Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)|(id:.*)", string)) {
                this.a = string;
                if (string2 != null) {
                    if (string2.length() >= 9) {
                        if (!Pattern.matches("[0-9a-f]+", string2)) {
                            throw new IllegalArgumentException("String 'parentRev' does not match pattern");
                        }
                    } else {
                        throw new IllegalArgumentException("String 'parentRev' is shorter than 9");
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
        return ax.G4.g$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (g)object;
            String string = this.a;
            String string2 = ((g)object).a;
            return (string == string2 || string.equals(string2)) && ((string = this.b) == (object = ((g)object).b) || string != null && string.equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.g$a.b.j(this, false);
    }

    static class a
    extends e<g> {
        public static final a b = new a();

        a() {
        }

        public g u(j j8, boolean bl) throws IOException, i {
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
                    if ("path".equals(string)) {
                        charSequence = d.f().a(j8);
                        continue;
                    }
                    if ("parent_rev".equals(string)) {
                        object = d.d(d.f()).a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (charSequence != null) {
                    object = new g((String)charSequence, (String)object);
                    if (!bl) {
                        c.e(j8);
                    }
                    ax.v4.b.a(object, ((g)object).a());
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

        public void v(g g8, ax.T4.g g9, boolean bl) throws IOException, f {
            if (!bl) {
                g9.o0();
            }
            g9.o("path");
            d.f().k(g8.a, g9);
            if (g8.b != null) {
                g9.o("parent_rev");
                d.d(d.f()).k(g8.b, g9);
            }
            if (!bl) {
                g9.m();
            }
        }
    }
}

