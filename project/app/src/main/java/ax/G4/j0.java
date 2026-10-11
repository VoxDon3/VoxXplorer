/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.e0;
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
import java.util.Iterator;
import java.util.List;

public class j0 {
    protected final List<e0> a;
    protected final boolean b;
    protected final String c;

    public j0(List<e0> list, boolean bl, String string) {
        if (list != null) {
            Iterator<e0> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() != null) continue;
                throw new IllegalArgumentException("An item in list 'matches' is null");
            }
            this.a = list;
            this.b = bl;
            if (string != null && string.length() < 1) {
                throw new IllegalArgumentException("String 'cursor' is shorter than 1");
            }
            this.c = string;
            return;
        }
        throw new IllegalArgumentException("Required value for 'matches' is null");
    }

    public List<e0> a() {
        return this.a;
    }

    public String b() {
        return ax.G4.j0$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (j0)object;
            List<e0> list = this.a;
            List<e0> list2 = ((j0)object).a;
            if ((list == list2 || list.equals(list2)) && this.b == ((j0)object).b && ((list = this.c) == (object = ((j0)object).c) || list != null && ((String)((Object)list)).equals(object))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.G4.j0$a.b.j(this, false);
    }

    static class a
    extends e<j0> {
        public static final a b = new a();

        a() {
        }

        public j0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            List<e0> list = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                Boolean bl2 = null;
                object = null;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("matches".equals(string)) {
                        list = d.c(e0.a.b).a(j8);
                        continue;
                    }
                    if ("has_more".equals(string)) {
                        bl2 = d.a().a(j8);
                        continue;
                    }
                    if ("cursor".equals(string)) {
                        object = d.d(d.f()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (list != null) {
                    if (bl2 != null) {
                        object = new j0(list, bl2, (String)object);
                        if (!bl) {
                            ax.v4.c.e(j8);
                        }
                        ax.v4.b.a(object, ((j0)object).b());
                        return object;
                    }
                    throw new i(j8, "Required field \"has_more\" missing.");
                }
                throw new i(j8, "Required field \"matches\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(j0 j02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("matches");
            d.c(e0.a.b).k(j02.a, g8);
            g8.o("has_more");
            d.a().k(j02.b, g8);
            if (j02.c != null) {
                g8.o("cursor");
                d.d(d.f()).k(j02.c, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

