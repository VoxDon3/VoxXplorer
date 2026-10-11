/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.Y;
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

class V
extends Y {
    protected final boolean c;
    protected final boolean d;
    protected final boolean e;

    public V(String string, String string2) {
        this(string, string2, false, false, false);
    }

    public V(String string, String string2, boolean bl, boolean bl2, boolean bl3) {
        super(string, string2);
        this.c = bl;
        this.d = bl2;
        this.e = bl3;
    }

    public String a() {
        return ax.G4.V$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (V)object;
            String string = this.a;
            String string2 = ((Y)object).a;
            if ((string == string2 || string.equals(string2)) && ((string = this.b) == (string2 = ((Y)object).b) || string.equals(string2)) && this.c == ((V)object).c && this.d == ((V)object).d && this.e == ((V)object).e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.c, this.d, this.e});
        return super.hashCode() * 31 + n8;
    }

    public String toString() {
        return ax.G4.V$a.b.j(this, false);
    }

    static class a
    extends e<V> {
        public static final a b = new a();

        a() {
        }

        public V u(j j8, boolean bl) throws IOException, i {
            Object object;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                Boolean bl2 = Boolean.FALSE;
                String string = null;
                String string2 = null;
                Object object2 = object = bl2;
                while (j8.j() == m.p0) {
                    String string3 = j8.g();
                    j8.H();
                    if ("from_path".equals(string3)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("to_path".equals(string3)) {
                        string2 = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("allow_shared_folder".equals(string3)) {
                        bl2 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("autorename".equals(string3)) {
                        object = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("allow_ownership_transfer".equals(string3)) {
                        object2 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    if (string2 != null) {
                        object = new V(string, string2, bl2, (Boolean)object, (Boolean)object2);
                        if (!bl) {
                            ax.v4.c.e(j8);
                        }
                        ax.v4.b.a(object, ((V)object).a());
                        return object;
                    }
                    throw new i(j8, "Required field \"to_path\" missing.");
                }
                throw new i(j8, "Required field \"from_path\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(V v8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("from_path");
            ax.v4.d.f().k(v8.a, g8);
            g8.o("to_path");
            ax.v4.d.f().k(v8.b, g8);
            g8.o("allow_shared_folder");
            ax.v4.d.a().k(v8.c, g8);
            g8.o("autorename");
            ax.v4.d.a().k(v8.d, g8);
            g8.o("allow_ownership_transfer");
            ax.v4.d.a().k(v8.e, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

