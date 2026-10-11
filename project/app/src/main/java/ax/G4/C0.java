/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.B0;
import ax.G4.a;
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

public class C0 {
    protected final B0 a;
    protected final ax.G4.a b;
    protected final String c;

    public C0(B0 b02, ax.G4.a a8) {
        this(b02, a8, null);
    }

    public C0(B0 b02, ax.G4.a a8, String string) {
        if (b02 != null) {
            this.a = b02;
            if (a8 != null) {
                this.b = a8;
                if (string != null) {
                    if (string.length() >= 64) {
                        if (string.length() > 64) {
                            throw new IllegalArgumentException("String 'contentHash' is longer than 64");
                        }
                    } else {
                        throw new IllegalArgumentException("String 'contentHash' is shorter than 64");
                    }
                }
                this.c = string;
                return;
            }
            throw new IllegalArgumentException("Required value for 'commit' is null");
        }
        throw new IllegalArgumentException("Required value for 'cursor' is null");
    }

    public String a() {
        return ax.G4.C0$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (C0)object;
            Object object2 = this.a;
            Object object3 = ((C0)object).a;
            return !(object2 != object3 && !((B0)object2).equals(object3) || (object3 = this.b) != (object2 = ((C0)object).b) && !((ax.G4.a)object3).equals(object2) || (object3 = this.c) != (object = ((C0)object).c) && (object3 == null || !((String)object3).equals(object)));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.G4.C0$a.b.j(this, false);
    }

    static class a
    extends e<C0> {
        public static final a b = new a();

        a() {
        }

        public C0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            B0 b02 = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                ax.G4.a a8 = null;
                object = null;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("cursor".equals(string)) {
                        b02 = (B0)B0.a.b.a(j8);
                        continue;
                    }
                    if ("commit".equals(string)) {
                        a8 = (ax.G4.a)a.b.b.a(j8);
                        continue;
                    }
                    if ("content_hash".equals(string)) {
                        object = d.d(d.f()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (b02 != null) {
                    if (a8 != null) {
                        object = new C0(b02, a8, (String)object);
                        if (!bl) {
                            ax.v4.c.e(j8);
                        }
                        ax.v4.b.a(object, ((C0)object).a());
                        return object;
                    }
                    throw new i(j8, "Required field \"commit\" missing.");
                }
                throw new i(j8, "Required field \"cursor\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(C0 c02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("cursor");
            B0.a.b.k(c02.a, g8);
            g8.o("commit");
            a.b.b.k(c02.b, g8);
            if (c02.c != null) {
                g8.o("content_hash");
                d.d(d.f()).k(c02.c, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

