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
import java.util.Date;

public class U
extends O {
    public U() {
        this(null, null, null);
    }

    public U(l l8, D d8, Date date) {
        super(l8, d8, date);
    }

    @Override
    public String a() {
        return ax.G4.U$a.b.j(this, true);
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
            object = (U)object;
            Object object2 = this.a;
            Object object3 = ((O)object).a;
            return (object2 == object3 || object2 != null && ((l)object2).equals(object3)) && ((object2 = this.b) == (object3 = ((O)object).b) || object2 != null && ((D)object2).equals(object3)) && ((object3 = this.c) == (object = ((O)object).c) || object3 != null && ((Date)object3).equals(object));
            {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getClass().toString().hashCode();
    }

    @Override
    public String toString() {
        return ax.G4.U$a.b.j(this, false);
    }

    static class a
    extends e<U> {
        public static final a b = new a();

        a() {
        }

        public U u(j j8, boolean bl) throws IOException, i {
            Object object;
            Object object2;
            l l8;
            block10: {
                block9: {
                    l8 = null;
                    if (bl) break block9;
                    ax.v4.c.h(j8);
                    object = object2 = ax.v4.a.q(j8);
                    if (!"photo".equals(object2)) break block10;
                }
                object = null;
            }
            if (object == null) {
                object2 = null;
                object = null;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("dimensions".equals(string)) {
                        l8 = d.e(l.a.b).a(j8);
                        continue;
                    }
                    if ("location".equals(string)) {
                        object2 = d.e(D.a.b).a(j8);
                        continue;
                    }
                    if ("time_taken".equals(string)) {
                        object = d.d(d.g()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                object = new U(l8, (D)object2, (Date)object);
                if (!bl) {
                    ax.v4.c.e(j8);
                }
                ax.v4.b.a(object, ((U)object).a());
                return object;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("No subtype found that matches tag: \"");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("\"");
            throw new i(j8, ((StringBuilder)object2).toString());
        }

        public void v(U u8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            this.r("photo", g8);
            if (u8.a != null) {
                g8.o("dimensions");
                d.e(l.a.b).k(u8.a, g8);
            }
            if (u8.b != null) {
                g8.o("location");
                d.e(D.a.b).k(u8.b, g8);
            }
            if (u8.c != null) {
                g8.o("time_taken");
                d.d(d.g()).k(u8.c, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

