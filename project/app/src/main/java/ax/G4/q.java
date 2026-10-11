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
import java.util.List;

public class q {
    protected final String a;
    protected final List<String> b;

    public q() {
        this(null, null);
    }

    public q(String object, List<String> list) {
        this.a = object;
        if (list != null) {
            object = list.iterator();
            while (object.hasNext()) {
                if ((String)object.next() != null) continue;
                throw new IllegalArgumentException("An item in list 'exportOptions' is null");
            }
        }
        this.b = list;
    }

    public String a() {
        return ax.G4.q$a.b.j(this, true);
    }

    public boolean equals(Object list) {
        if (list == this) {
            return true;
        }
        if (list == null) {
            return false;
        }
        if (list.getClass().equals(this.getClass())) {
            list = (q)((Object)list);
            Object object = this.a;
            String string = ((q)((Object)list)).a;
            return (object == string || object != null && ((String)object).equals(string)) && ((object = this.b) == (list = ((q)((Object)list)).b) || object != null && object.equals(list));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.q$a.b.j(this, false);
    }

    static class a
    extends e<q> {
        public static final a b = new a();

        a() {
        }

        public q u(j j8, boolean bl) throws IOException, i {
            List<String> list;
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
                    if ("export_as".equals(string)) {
                        charSequence = d.d(d.f()).a(j8);
                        continue;
                    }
                    if ("export_options".equals(string)) {
                        list = d.d(d.c(d.f())).a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                list = new q((String)charSequence, list);
                if (!bl) {
                    c.e(j8);
                }
                ax.v4.b.a(list, ((q)((Object)list)).a());
                return list;
            }
            charSequence = new StringBuilder();
            charSequence.append("No subtype found that matches tag: \"");
            charSequence.append((String)((Object)list));
            charSequence.append("\"");
            throw new i(j8, charSequence.toString());
        }

        public void v(q q8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            if (q8.a != null) {
                g8.o("export_as");
                d.d(d.f()).k(q8.a, g8);
            }
            if (q8.b != null) {
                g8.o("export_options");
                d.d(d.c(d.f())).k(q8.b, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

