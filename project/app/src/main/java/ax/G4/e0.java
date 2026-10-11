/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.E;
import ax.G4.Q;
import ax.G4.d0;
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

public class e0 {
    protected final Q a;
    protected final d0 b;
    protected final List<E> c;

    public e0(Q object, d0 d02, List<E> list) {
        if (object != null) {
            this.a = object;
            this.b = d02;
            if (list != null) {
                object = list.iterator();
                while (object.hasNext()) {
                    if ((E)object.next() != null) continue;
                    throw new IllegalArgumentException("An item in list 'highlightSpans' is null");
                }
            }
            this.c = list;
            return;
        }
        throw new IllegalArgumentException("Required value for 'metadata' is null");
    }

    public Q a() {
        return this.a;
    }

    public String b() {
        return ax.G4.e0$a.b.j(this, true);
    }

    public boolean equals(Object list) {
        if (list == this) {
            return true;
        }
        if (list == null) {
            return false;
        }
        if (list.getClass().equals(this.getClass())) {
            list = (e0)((Object)list);
            Object object = this.a;
            Object object2 = ((e0)((Object)list)).a;
            return (object == object2 || ((Q)object).equals(object2)) && ((object = this.b) == (object2 = ((e0)((Object)list)).b) || object != null && object.equals(object2)) && ((object2 = this.c) == (list = ((e0)((Object)list)).c) || object2 != null && object2.equals(list));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.G4.e0$a.b.j(this, false);
    }

    static class a
    extends e<e0> {
        public static final a b = new a();

        a() {
        }

        public e0 u(j j8, boolean bl) throws IOException, i {
            List<E> list;
            Q q8 = null;
            if (!bl) {
                ax.v4.c.h(j8);
                list = ax.v4.a.q(j8);
            } else {
                list = null;
            }
            if (list == null) {
                d0 d02 = null;
                list = null;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("metadata".equals(string)) {
                        q8 = Q.b.b.s(j8);
                        continue;
                    }
                    if ("match_type".equals(string)) {
                        d02 = d.d(d0.b.b).a(j8);
                        continue;
                    }
                    if ("highlight_spans".equals(string)) {
                        list = d.d(d.c(E.a.b)).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (q8 != null) {
                    list = new e0(q8, d02, list);
                    if (!bl) {
                        ax.v4.c.e(j8);
                    }
                    ax.v4.b.a(list, ((e0)((Object)list)).b());
                    return list;
                }
                throw new i(j8, "Required field \"metadata\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)((Object)list));
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(e0 e02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("metadata");
            Q.b.b.t(e02.a, g8);
            if (e02.b != null) {
                g8.o("match_type");
                d.d(d0.b.b).k(e02.b, g8);
            }
            if (e02.c != null) {
                g8.o("highlight_spans");
                d.d(d.c(E.a.b)).k(e02.c, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

