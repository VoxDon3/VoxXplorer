/*
 * Decompiled with CFR 0.152.
 */
package ax.E4;

import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;

public class d {
    protected final String a;
    protected final String b;

    public d(String string, String string2) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.b = string2;
                return;
            }
            throw new IllegalArgumentException("Required value for 'value' is null");
        }
        throw new IllegalArgumentException("Required value for 'name' is null");
    }

    public String a() {
        return ax.E4.d$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (d)object;
            String string = this.a;
            String string2 = ((d)object).a;
            return !(string != string2 && !string.equals(string2) || (string2 = this.b) != (object = ((d)object).b) && !string2.equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.E4.d$a.b.j(this, false);
    }

    static class a
    extends e<d> {
        public static final a b = new a();

        a() {
        }

        public d u(j j8, boolean bl) throws IOException, i {
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
                    if ("name".equals(string)) {
                        charSequence = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("value".equals(string)) {
                        object = ax.v4.d.f().a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (charSequence != null) {
                    if (object != null) {
                        object = new d((String)charSequence, (String)object);
                        if (!bl) {
                            c.e(j8);
                        }
                        ax.v4.b.a(object, ((d)object).a());
                        return object;
                    }
                    throw new i(j8, "Required field \"value\" missing.");
                }
                throw new i(j8, "Required field \"name\" missing.");
            }
            charSequence = new StringBuilder();
            charSequence.append("No subtype found that matches tag: \"");
            charSequence.append((String)object);
            charSequence.append("\"");
            throw new i(j8, charSequence.toString());
        }

        public void v(d d8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("name");
            ax.v4.d.f().k(d8.a, g8);
            g8.o("value");
            ax.v4.d.f().k(d8.b, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

