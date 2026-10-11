/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.D;
import ax.G4.O;
import ax.G4.l;
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
import java.util.Date;

public class Q0
extends O {
    protected final Long d;

    public Q0() {
        this(null, null, null, null);
    }

    public Q0(l l8, D d8, Date date, Long l9) {
        super(l8, d8, date);
        this.d = l9;
    }

    @Override
    public String a() {
        return ax.G4.Q0$a.b.j(this, true);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (Q0)object;
            Object object2 = this.a;
            Object object3 = ((O)object).a;
            return (object2 == object3 || object2 != null && ((l)object2).equals(object3)) && ((object3 = this.b) == (object2 = ((O)object).b) || object3 != null && ((D)object3).equals(object2)) && ((object3 = this.c) == (object2 = ((O)object).c) || object3 != null && ((Date)object3).equals(object2)) && ((object3 = this.d) == (object = ((Q0)object).d) || object3 != null && ((Long)object3).equals(object));
            {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.d});
        return super.hashCode() * 31 + n8;
    }

    @Override
    public String toString() {
        return ax.G4.Q0$a.b.j(this, false);
    }

    static class a
    extends e<Q0> {
        public static final a b = new a();

        a() {
        }

        public Q0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            Object object2;
            l l8;
            block11: {
                block10: {
                    l8 = null;
                    if (bl) break block10;
                    ax.v4.c.h(j8);
                    object = object2 = ax.v4.a.q(j8);
                    if (!"video".equals(object2)) break block11;
                }
                object = null;
            }
            if (object == null) {
                D d8 = null;
                object = object2 = null;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("dimensions".equals(string)) {
                        l8 = ax.v4.d.e(l.a.b).a(j8);
                        continue;
                    }
                    if ("location".equals(string)) {
                        d8 = ax.v4.d.e(D.a.b).a(j8);
                        continue;
                    }
                    if ("time_taken".equals(string)) {
                        object2 = ax.v4.d.d(ax.v4.d.g()).a(j8);
                        continue;
                    }
                    if ("duration".equals(string)) {
                        object = ax.v4.d.d(ax.v4.d.i()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                object = new Q0(l8, d8, (Date)object2, (Long)object);
                if (!bl) {
                    ax.v4.c.e(j8);
                }
                ax.v4.b.a(object, ((Q0)object).a());
                return object;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("No subtype found that matches tag: \"");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("\"");
            throw new i(j8, ((StringBuilder)object2).toString());
        }

        public void v(Q0 q02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            this.r("video", g8);
            if (q02.a != null) {
                g8.o("dimensions");
                ax.v4.d.e(l.a.b).k(q02.a, g8);
            }
            if (q02.b != null) {
                g8.o("location");
                ax.v4.d.e(D.a.b).k(q02.b, g8);
            }
            if (q02.c != null) {
                g8.o("time_taken");
                ax.v4.d.d(ax.v4.d.g()).k(q02.c, g8);
            }
            if (q02.d != null) {
                g8.o("duration");
                ax.v4.d.d(ax.v4.d.i()).k(q02.d, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

