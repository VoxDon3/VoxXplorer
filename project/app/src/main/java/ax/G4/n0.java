/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.q0;
import ax.G4.r0;
import ax.G4.s0;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.d;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class n0 {
    protected final String a;
    protected final q0 b;
    protected final s0 c;
    protected final r0 d;

    public n0(String string, q0 q02, s0 s02, r0 r02) {
        if (string != null) {
            if (Pattern.matches("(/(.|[\\r\\n])*|id:.*)|(rev:[0-9a-f]{9,})|(ns:[0-9]+(/.*)?)", string)) {
                this.a = string;
                if (q02 != null) {
                    this.b = q02;
                    if (s02 != null) {
                        this.c = s02;
                        if (r02 != null) {
                            this.d = r02;
                            return;
                        }
                        throw new IllegalArgumentException("Required value for 'mode' is null");
                    }
                    throw new IllegalArgumentException("Required value for 'size' is null");
                }
                throw new IllegalArgumentException("Required value for 'format' is null");
            }
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        throw new IllegalArgumentException("Required value for 'path' is null");
    }

    public static a a(String string) {
        return new a(string);
    }

    public String b() {
        return ax.G4.n0$b.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (n0)object;
            Object object2 = this.a;
            Object object3 = ((n0)object).a;
            return !(object2 != object3 && !((String)object2).equals(object3) || (object2 = this.b) != (object3 = ((n0)object).b) && !object2.equals(object3) || (object3 = this.c) != (object2 = ((n0)object).c) && !object3.equals(object2) || (object2 = this.d) != (object = ((n0)object).d) && !object2.equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        return ax.G4.n0$b.b.j(this, false);
    }

    public static class a {
        protected final String a;
        protected q0 b;
        protected s0 c;
        protected r0 d;

        protected a(String string) {
            if (string != null) {
                if (Pattern.matches("(/(.|[\\r\\n])*|id:.*)|(rev:[0-9a-f]{9,})|(ns:[0-9]+(/.*)?)", string)) {
                    this.a = string;
                    this.b = q0.q;
                    this.c = s0.c0;
                    this.d = r0.q;
                    return;
                }
                throw new IllegalArgumentException("String 'path' does not match pattern");
            }
            throw new IllegalArgumentException("Required value for 'path' is null");
        }

        public n0 a() {
            return new n0(this.a, this.b, this.c, this.d);
        }

        public a b(q0 q02) {
            if (q02 != null) {
                this.b = q02;
                return this;
            }
            this.b = q0.q;
            return this;
        }

        public a c(s0 s02) {
            if (s02 != null) {
                this.c = s02;
                return this;
            }
            this.c = s0.c0;
            return this;
        }
    }

    static class b
    extends e<n0> {
        public static final b b = new b();

        b() {
        }

        public n0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            String string = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                q0 q02 = q0.q;
                s0 s02 = s0.c0;
                object = r0.q;
                while (j8.j() == m.p0) {
                    String string2 = j8.g();
                    j8.H();
                    if ("path".equals(string2)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("format".equals(string2)) {
                        q02 = q0.b.b.s(j8);
                        continue;
                    }
                    if ("size".equals(string2)) {
                        s02 = s0.b.b.s(j8);
                        continue;
                    }
                    if ("mode".equals(string2)) {
                        object = r0.b.b.s(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    object = new n0(string, q02, s02, (r0)((Object)object));
                    if (!bl) {
                        ax.v4.c.e(j8);
                    }
                    ax.v4.b.a(object, ((n0)object).b());
                    return object;
                }
                throw new i(j8, "Required field \"path\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(n0 n02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("path");
            ax.v4.d.f().k(n02.a, g8);
            g8.o("format");
            q0.b.b.t(n02.b, g8);
            g8.o("size");
            s0.b.b.t(n02.c, g8);
            g8.o("mode");
            r0.b.b.t(n02.d, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

