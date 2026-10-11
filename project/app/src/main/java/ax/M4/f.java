/*
 * Decompiled with CFR 0.152.
 */
package ax.M4;

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

public class f {
    protected final String a;
    protected final String b;
    protected final String c;
    protected final String d;
    protected final String e;

    public f(String string, String string2, String string3, String string4, String string5) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.b = string2;
                if (string3 != null) {
                    this.c = string3;
                    if (string4 != null) {
                        this.d = string4;
                        if (string5 != null) {
                            this.e = string5;
                            return;
                        }
                        throw new IllegalArgumentException("Required value for 'abbreviatedName' is null");
                    }
                    throw new IllegalArgumentException("Required value for 'displayName' is null");
                }
                throw new IllegalArgumentException("Required value for 'familiarName' is null");
            }
            throw new IllegalArgumentException("Required value for 'surname' is null");
        }
        throw new IllegalArgumentException("Required value for 'givenName' is null");
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return ax.M4.f$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (f)object;
            String string = this.a;
            String string2 = ((f)object).a;
            return !(string != string2 && !string.equals(string2) || (string2 = this.b) != (string = ((f)object).b) && !string2.equals(string) || (string2 = this.c) != (string = ((f)object).c) && !string2.equals(string) || (string2 = this.d) != (string = ((f)object).d) && !string2.equals(string) || (string2 = this.e) != (object = ((f)object).e) && !string2.equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public String toString() {
        return ax.M4.f$a.b.j(this, false);
    }

    public static class a
    extends e<f> {
        public static final a b = new a();

        public f u(j j8, boolean bl) throws IOException, i {
            Object object;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                String string;
                String string2 = null;
                String string3 = null;
                object = string3;
                String string4 = string = object;
                while (j8.j() == m.p0) {
                    String string5 = j8.g();
                    j8.H();
                    if ("given_name".equals(string5)) {
                        string2 = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("surname".equals(string5)) {
                        string3 = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("familiar_name".equals(string5)) {
                        object = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("display_name".equals(string5)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("abbreviated_name".equals(string5)) {
                        string4 = ax.v4.d.f().a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string2 != null) {
                    if (string3 != null) {
                        if (object != null) {
                            if (string != null) {
                                if (string4 != null) {
                                    object = new f(string2, string3, (String)object, string, string4);
                                    if (!bl) {
                                        ax.v4.c.e(j8);
                                    }
                                    ax.v4.b.a(object, ((f)object).b());
                                    return object;
                                }
                                throw new i(j8, "Required field \"abbreviated_name\" missing.");
                            }
                            throw new i(j8, "Required field \"display_name\" missing.");
                        }
                        throw new i(j8, "Required field \"familiar_name\" missing.");
                    }
                    throw new i(j8, "Required field \"surname\" missing.");
                }
                throw new i(j8, "Required field \"given_name\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(f f8, g g8, boolean bl) throws IOException, ax.T4.f {
            if (!bl) {
                g8.o0();
            }
            g8.o("given_name");
            ax.v4.d.f().k(f8.a, g8);
            g8.o("surname");
            ax.v4.d.f().k(f8.b, g8);
            g8.o("familiar_name");
            ax.v4.d.f().k(f8.c, g8);
            g8.o("display_name");
            ax.v4.d.f().k(f8.d, g8);
            g8.o("abbreviated_name");
            ax.v4.d.f().k(f8.e, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

