/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.l0;
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
import java.util.regex.Pattern;

public class v
extends l0 {
    protected final String b;
    protected final String c;

    public v(boolean bl, String string, String string2) {
        super(bl);
        if (string != null) {
            if (Pattern.matches("[-_0-9a-zA-Z:]+", string)) {
                this.b = string;
                if (string2 != null) {
                    if (string2.length() >= 40) {
                        if (string2.length() > 40) {
                            throw new IllegalArgumentException("String 'modifiedBy' is longer than 40");
                        }
                    } else {
                        throw new IllegalArgumentException("String 'modifiedBy' is shorter than 40");
                    }
                }
                this.c = string2;
                return;
            }
            throw new IllegalArgumentException("String 'parentSharedFolderId' does not match pattern");
        }
        throw new IllegalArgumentException("Required value for 'parentSharedFolderId' is null");
    }

    public String a() {
        return ax.G4.v$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            String string;
            String string2;
            object = (v)object;
            if (this.a == ((l0)object).a && ((string2 = this.b) == (string = ((v)object).b) || string2.equals(string)) && ((string = this.c) == (object = ((v)object).c) || string != null && string.equals(object))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.b, this.c});
        return super.hashCode() * 31 + n8;
    }

    public String toString() {
        return ax.G4.v$a.b.j(this, false);
    }

    static class a
    extends e<v> {
        public static final a b = new a();

        a() {
        }

        public v u(j j8, boolean bl) throws IOException, i {
            Object object;
            Boolean bl2 = null;
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
                    if ("read_only".equals(string2)) {
                        bl2 = d.a().a(j8);
                        continue;
                    }
                    if ("parent_shared_folder_id".equals(string2)) {
                        string = d.f().a(j8);
                        continue;
                    }
                    if ("modified_by".equals(string2)) {
                        object = d.d(d.f()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (bl2 != null) {
                    if (string != null) {
                        object = new v(bl2, string, (String)object);
                        if (!bl) {
                            ax.v4.c.e(j8);
                        }
                        ax.v4.b.a(object, ((v)object).a());
                        return object;
                    }
                    throw new i(j8, "Required field \"parent_shared_folder_id\" missing.");
                }
                throw new i(j8, "Required field \"read_only\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(v v8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("read_only");
            d.a().k(v8.a, g8);
            g8.o("parent_shared_folder_id");
            d.f().k(v8.b, g8);
            if (v8.c != null) {
                g8.o("modified_by");
                d.d(d.f()).k(v8.c, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

