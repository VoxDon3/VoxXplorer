/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.P;
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

public class L {
    protected final List<P> a;
    protected final String b;
    protected final boolean c;

    public L(List<P> list, String string, boolean bl) {
        if (list != null) {
            Iterator<P> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() != null) continue;
                throw new IllegalArgumentException("An item in list 'entries' is null");
            }
            this.a = list;
            if (string != null) {
                if (string.length() >= 1) {
                    this.b = string;
                    this.c = bl;
                    return;
                }
                throw new IllegalArgumentException("String 'cursor' is shorter than 1");
            }
            throw new IllegalArgumentException("Required value for 'cursor' is null");
        }
        throw new IllegalArgumentException("Required value for 'entries' is null");
    }

    public String a() {
        return this.b;
    }

    public List<P> b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public String d() {
        return ax.G4.L$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (L)object;
            List<P> list = this.a;
            List<P> list2 = ((L)object).a;
            if ((list == list2 || list.equals(list2)) && ((list2 = this.b) == (list = ((L)object).b) || ((String)((Object)list2)).equals(list)) && this.c == ((L)object).c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.G4.L$a.b.j(this, false);
    }

    static class a
    extends e<L> {
        public static final a b = new a();

        a() {
        }

        public L u(j j8, boolean bl) throws IOException, i {
            Object object;
            List<P> list = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                String string = null;
                object = null;
                while (j8.j() == m.p0) {
                    String string2 = j8.g();
                    j8.H();
                    if ("entries".equals(string2)) {
                        list = d.c(P.a.b).a(j8);
                        continue;
                    }
                    if ("cursor".equals(string2)) {
                        string = d.f().a(j8);
                        continue;
                    }
                    if ("has_more".equals(string2)) {
                        object = d.a().a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (list != null) {
                    if (string != null) {
                        if (object != null) {
                            object = new L(list, string, (Boolean)object);
                            if (!bl) {
                                ax.v4.c.e(j8);
                            }
                            ax.v4.b.a(object, ((L)object).d());
                            return object;
                        }
                        throw new i(j8, "Required field \"has_more\" missing.");
                    }
                    throw new i(j8, "Required field \"cursor\" missing.");
                }
                throw new i(j8, "Required field \"entries\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(L l8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("entries");
            d.c(P.a.b).k(l8.a, g8);
            g8.o("cursor");
            d.f().k(l8.b, g8);
            g8.o("has_more");
            d.a().k(l8.c, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

