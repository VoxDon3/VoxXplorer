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

public class y
extends l0 {
    protected final String b;
    protected final String c;
    protected final boolean d;
    protected final boolean e;

    public y(boolean bl, String string, String string2, boolean bl2, boolean bl3) {
        super(bl);
        if (string != null && !Pattern.matches("[-_0-9a-zA-Z:]+", string)) {
            throw new IllegalArgumentException("String 'parentSharedFolderId' does not match pattern");
        }
        this.b = string;
        if (string2 != null && !Pattern.matches("[-_0-9a-zA-Z:]+", string2)) {
            throw new IllegalArgumentException("String 'sharedFolderId' does not match pattern");
        }
        this.c = string2;
        this.d = bl2;
        this.e = bl3;
    }

    public String a() {
        return ax.G4.y$a.b.j(this, true);
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
            object = (y)object;
            if (this.a == ((l0)object).a && ((string2 = this.b) == (string = ((y)object).b) || string2 != null && string2.equals(string)) && ((string2 = this.c) == (string = ((y)object).c) || string2 != null && string2.equals(string)) && this.d == ((y)object).d && this.e == ((y)object).e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e});
        return super.hashCode() * 31 + n8;
    }

    public String toString() {
        return ax.G4.y$a.b.j(this, false);
    }

    static class a
    extends e<y> {
        public static final a b = new a();

        a() {
        }

        public y u(j j8, boolean bl) throws IOException, i {
            Object object;
            Boolean bl2 = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                Boolean bl3 = Boolean.FALSE;
                String string = null;
                object = null;
                Boolean bl4 = bl3;
                while (j8.j() == m.p0) {
                    String string2 = j8.g();
                    j8.H();
                    if ("read_only".equals(string2)) {
                        bl2 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("parent_shared_folder_id".equals(string2)) {
                        string = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("shared_folder_id".equals(string2)) {
                        object = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("traverse_only".equals(string2)) {
                        bl3 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("no_access".equals(string2)) {
                        bl4 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (bl2 != null) {
                    object = new y(bl2, string, (String)object, bl3, bl4);
                    if (!bl) {
                        ax.v4.c.e(j8);
                    }
                    ax.v4.b.a(object, ((y)object).a());
                    return object;
                }
                throw new i(j8, "Required field \"read_only\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(y y8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("read_only");
            ax.v4.d.a().k(y8.a, g8);
            if (y8.b != null) {
                g8.o("parent_shared_folder_id");
                ax.v4.d.d(ax.v4.d.f()).k(y8.b, g8);
            }
            if (y8.c != null) {
                g8.o("shared_folder_id");
                ax.v4.d.d(ax.v4.d.f()).k(y8.c, g8);
            }
            g8.o("traverse_only");
            ax.v4.d.a().k(y8.d, g8);
            g8.o("no_access");
            ax.v4.d.a().k(y8.e, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

