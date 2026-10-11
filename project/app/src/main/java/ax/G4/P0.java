/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.S0;
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

public class P0 {
    protected final S0 a;
    protected final String b;

    public P0(S0 s02, String string) {
        if (s02 != null) {
            this.a = s02;
            if (string != null) {
                this.b = string;
                return;
            }
            throw new IllegalArgumentException("Required value for 'uploadSessionId' is null");
        }
        throw new IllegalArgumentException("Required value for 'reason' is null");
    }

    public S0 a() {
        return this.a;
    }

    public String b() {
        return ax.G4.P0$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (P0)object;
            S0 s02 = this.a;
            Object object2 = ((P0)object).a;
            return !(s02 != object2 && !s02.equals(object2) || (object2 = this.b) != (object = ((P0)object).b) && !((String)object2).equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.P0$a.b.j(this, false);
    }

    static class a
    extends e<P0> {
        public static final a b = new a();

        a() {
        }

        public P0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            Object object2 = null;
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
                    if ("reason".equals(string)) {
                        object2 = S0.b.b.s(j8);
                        continue;
                    }
                    if ("upload_session_id".equals(string)) {
                        object = d.f().a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (object2 != null) {
                    if (object != null) {
                        object = new P0((S0)object2, (String)object);
                        if (!bl) {
                            c.e(j8);
                        }
                        ax.v4.b.a(object, ((P0)object).b());
                        return object;
                    }
                    throw new i(j8, "Required field \"upload_session_id\" missing.");
                }
                throw new i(j8, "Required field \"reason\" missing.");
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("No subtype found that matches tag: \"");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("\"");
            throw new i(j8, ((StringBuilder)object2).toString());
        }

        public void v(P0 p02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("reason");
            S0.b.b.t(p02.a, g8);
            g8.o("upload_session_id");
            d.f().k(p02.b, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

