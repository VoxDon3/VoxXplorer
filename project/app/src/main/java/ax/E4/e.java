/*
 * Decompiled with CFR 0.152.
 */
package ax.E4;

import ax.E4.d;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class e {
    protected final String a;
    protected final List<d> b;

    public e(String object, List<d> list) {
        if (object != null) {
            if (((String)object).length() >= 1) {
                if (Pattern.matches("(/|ptid:).*", (CharSequence)object)) {
                    this.a = object;
                    if (list != null) {
                        object = list.iterator();
                        while (object.hasNext()) {
                            if ((d)object.next() != null) continue;
                            throw new IllegalArgumentException("An item in list 'fields' is null");
                        }
                        this.b = list;
                        return;
                    }
                    throw new IllegalArgumentException("Required value for 'fields' is null");
                }
                throw new IllegalArgumentException("String 'templateId' does not match pattern");
            }
            throw new IllegalArgumentException("String 'templateId' is shorter than 1");
        }
        throw new IllegalArgumentException("Required value for 'templateId' is null");
    }

    public String a() {
        return ax.E4.e$a.b.j(this, true);
    }

    public boolean equals(Object list) {
        if (list == this) {
            return true;
        }
        if (list == null) {
            return false;
        }
        if (list.getClass().equals(this.getClass())) {
            list = (e)((Object)list);
            Object object = this.a;
            String string = ((e)((Object)list)).a;
            return !(object != string && !((String)object).equals(string) || (object = this.b) != (list = ((e)((Object)list)).b) && !object.equals(list));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.E4.e$a.b.j(this, false);
    }

    public static class a
    extends ax.v4.e<e> {
        public static final a b = new a();

        public e u(j j8, boolean bl) throws IOException, i {
            List<d> list;
            CharSequence charSequence = null;
            if (!bl) {
                c.h(j8);
                list = ax.v4.a.q(j8);
            } else {
                list = null;
            }
            if (list == null) {
                list = null;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("template_id".equals(string)) {
                        charSequence = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("fields".equals(string)) {
                        list = ax.v4.d.c(d.a.b).a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (charSequence != null) {
                    if (list != null) {
                        list = new e((String)charSequence, list);
                        if (!bl) {
                            c.e(j8);
                        }
                        ax.v4.b.a(list, ((e)((Object)list)).a());
                        return list;
                    }
                    throw new i(j8, "Required field \"fields\" missing.");
                }
                throw new i(j8, "Required field \"template_id\" missing.");
            }
            charSequence = new StringBuilder();
            charSequence.append("No subtype found that matches tag: \"");
            charSequence.append((String)((Object)list));
            charSequence.append("\"");
            throw new i(j8, charSequence.toString());
        }

        public void v(e e8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("template_id");
            ax.v4.d.f().k(e8.a, g8);
            g8.o("fields");
            ax.v4.d.c(d.a.b).k(e8.b, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

