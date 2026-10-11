/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.D;
import ax.G4.Q0;
import ax.G4.U;
import ax.G4.l;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.v4.e;
import ax.w4.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class O {
    protected final l a;
    protected final D b;
    protected final Date c;

    public O() {
        this(null, null, null);
    }

    public O(l l8, D d8, Date date) {
        this.a = l8;
        this.b = d8;
        this.c = d.b(date);
    }

    public String a() {
        return ax.G4.O$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (O)object;
            Object object2 = this.a;
            Object object3 = ((O)object).a;
            return (object2 == object3 || object2 != null && ((l)object2).equals(object3)) && ((object3 = this.b) == (object2 = ((O)object).b) || object3 != null && ((D)object3).equals(object2)) && ((object2 = this.c) == (object = ((O)object).c) || object2 != null && ((Date)object2).equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.G4.O$a.b.j(this, false);
    }

    static class a
    extends e<O> {
        public static final a b = new a();

        a() {
        }

        public O u(j j8, boolean bl) throws IOException, i {
            Object object;
            Object object2;
            block17: {
                block14: {
                    block16: {
                        block15: {
                            block13: {
                                Object object3;
                                block12: {
                                    block11: {
                                        object2 = null;
                                        if (bl) break block11;
                                        ax.v4.c.h(j8);
                                        object = object3 = ax.v4.a.q(j8);
                                        if (!"".equals(object3)) break block12;
                                    }
                                    object = null;
                                }
                                if (object != null) break block13;
                                object3 = null;
                                object = null;
                                while (j8.j() == m.p0) {
                                    String string = j8.g();
                                    j8.H();
                                    if ("dimensions".equals(string)) {
                                        object2 = ax.v4.d.e(l.a.b).a(j8);
                                        continue;
                                    }
                                    if ("location".equals(string)) {
                                        object3 = ax.v4.d.e(D.a.b).a(j8);
                                        continue;
                                    }
                                    if ("time_taken".equals(string)) {
                                        object = ax.v4.d.d(ax.v4.d.g()).a(j8);
                                        continue;
                                    }
                                    ax.v4.c.o(j8);
                                }
                                object = new O((l)object2, (D)object3, (Date)object);
                                break block14;
                            }
                            if (!"".equals(object)) break block15;
                            object = b.u(j8, true);
                            break block14;
                        }
                        if (!"photo".equals(object)) break block16;
                        object = U.a.b.u(j8, true);
                        break block14;
                    }
                    if (!"video".equals(object)) break block17;
                    object = Q0.a.b.u(j8, true);
                }
                if (!bl) {
                    ax.v4.c.e(j8);
                }
                ax.v4.b.a(object, ((O)object).a());
                return object;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("No subtype found that matches tag: \"");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("\"");
            throw new i(j8, ((StringBuilder)object2).toString());
        }

        public void v(O o8, g g8, boolean bl) throws IOException, f {
            if (o8 instanceof U) {
                U.a.b.v((U)o8, g8, bl);
                return;
            }
            if (o8 instanceof Q0) {
                Q0.a.b.v((Q0)o8, g8, bl);
                return;
            }
            if (!bl) {
                g8.o0();
            }
            if (o8.a != null) {
                g8.o("dimensions");
                ax.v4.d.e(l.a.b).k(o8.a, g8);
            }
            if (o8.b != null) {
                g8.o("location");
                ax.v4.d.e(D.a.b).k(o8.b, g8);
            }
            if (o8.c != null) {
                g8.o("time_taken");
                ax.v4.d.d(ax.v4.d.g()).k(o8.c, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

