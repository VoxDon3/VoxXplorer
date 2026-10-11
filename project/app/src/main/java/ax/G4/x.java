/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.E4.e;
import ax.G4.P;
import ax.G4.y;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.v4.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class x
extends P {
    protected final String f;
    protected final String g;
    protected final y h;
    protected final List<e> i;

    public x(String object, String string, String string2, String string3, String string4, String string5, String string6, y y8, List<e> list) {
        super((String)object, string2, string3, string4, string5);
        if (string != null) {
            if (string.length() >= 1) {
                this.f = string;
                if (string6 != null && !Pattern.matches("[-_0-9a-zA-Z:]+", string6)) {
                    throw new IllegalArgumentException("String 'sharedFolderId' does not match pattern");
                }
                this.g = string6;
                this.h = y8;
                if (list != null) {
                    object = list.iterator();
                    while (object.hasNext()) {
                        if ((e)object.next() != null) continue;
                        throw new IllegalArgumentException("An item in list 'propertyGroups' is null");
                    }
                }
                this.i = list;
                return;
            }
            throw new IllegalArgumentException("String 'id' is shorter than 1");
        }
        throw new IllegalArgumentException("Required value for 'id' is null");
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public String d() {
        return ax.G4.x$a.b.j(this, true);
    }

    @Override
    public boolean equals(Object list) {
        if (list == this) {
            return true;
        }
        if (list == null) {
            return false;
        }
        if (list.getClass().equals(this.getClass())) {
            list = (x)((Object)list);
            Object object = this.a;
            Object object2 = ((P)((Object)list)).a;
            return !(object != object2 && !((String)object).equals(object2) || (object = this.f) != (object2 = ((x)((Object)list)).f) && !((String)object).equals(object2) || (object = this.b) != (object2 = ((P)((Object)list)).b) && (object == null || !((String)object).equals(object2)) || (object = this.c) != (object2 = ((P)((Object)list)).c) && (object == null || !((String)object).equals(object2)) || (object = this.d) != (object2 = ((P)((Object)list)).d) && (object == null || !((String)object).equals(object2)) || (object2 = this.e) != (object = ((P)((Object)list)).e) && (object2 == null || !((String)object2).equals(object)) || (object2 = this.g) != (object = ((x)((Object)list)).g) && (object2 == null || !((String)object2).equals(object)) || (object2 = this.h) != (object = ((x)((Object)list)).h) && (object2 == null || !((y)object2).equals(object)) || (object2 = this.i) != (list = ((x)((Object)list)).i) && (object2 == null || !object2.equals(list)));
            {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.f, this.g, this.h, this.i});
        return super.hashCode() * 31 + n8;
    }

    @Override
    public String toString() {
        return ax.G4.x$a.b.j(this, false);
    }

    static class a
    extends ax.v4.e<x> {
        public static final a b = new a();

        a() {
        }

        public x u(j j8, boolean bl) throws IOException, i {
            Object object;
            CharSequence charSequence;
            block18: {
                block17: {
                    if (bl) break block17;
                    ax.v4.c.h(j8);
                    charSequence = ax.v4.a.q(j8);
                    object = charSequence;
                    if (!"folder".equals(charSequence)) break block18;
                }
                object = null;
            }
            if (object == null) {
                Object object2;
                CharSequence charSequence2;
                CharSequence charSequence3;
                String string = null;
                String string2 = null;
                object = string2;
                CharSequence charSequence4 = charSequence3 = (charSequence2 = (charSequence = object));
                Object object3 = object2 = charSequence4;
                while (j8.j() == m.p0) {
                    String string3 = j8.g();
                    j8.H();
                    if ("name".equals(string3)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("id".equals(string3)) {
                        string2 = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("path_lower".equals(string3)) {
                        object = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("path_display".equals(string3)) {
                        charSequence = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("parent_shared_folder_id".equals(string3)) {
                        charSequence2 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("preview_url".equals(string3)) {
                        charSequence3 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("shared_folder_id".equals(string3)) {
                        charSequence4 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("sharing_info".equals(string3)) {
                        object2 = ax.v4.d.e(y.a.b).a(j8);
                        continue;
                    }
                    if ("property_groups".equals(string3)) {
                        object3 = ax.v4.d.d(ax.v4.d.c(e.a.b)).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    if (string2 != null) {
                        object = new x(string, string2, (String)object, (String)charSequence, (String)charSequence2, (String)charSequence3, (String)charSequence4, (y)object2, (List<e>)object3);
                        if (!bl) {
                            ax.v4.c.e(j8);
                        }
                        ax.v4.b.a(object, ((x)object).d());
                        return object;
                    }
                    throw new i(j8, "Required field \"id\" missing.");
                }
                throw new i(j8, "Required field \"name\" missing.");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("No subtype found that matches tag: \"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\"");
            throw new i(j8, ((StringBuilder)charSequence).toString());
        }

        public void v(x x8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            this.r("folder", g8);
            g8.o("name");
            ax.v4.d.f().k(x8.a, g8);
            g8.o("id");
            ax.v4.d.f().k(x8.f, g8);
            if (x8.b != null) {
                g8.o("path_lower");
                ax.v4.d.d(ax.v4.d.f()).k(x8.b, g8);
            }
            if (x8.c != null) {
                g8.o("path_display");
                ax.v4.d.d(ax.v4.d.f()).k(x8.c, g8);
            }
            if (x8.d != null) {
                g8.o("parent_shared_folder_id");
                ax.v4.d.d(ax.v4.d.f()).k(x8.d, g8);
            }
            if (x8.e != null) {
                g8.o("preview_url");
                ax.v4.d.d(ax.v4.d.f()).k(x8.e, g8);
            }
            if (x8.g != null) {
                g8.o("shared_folder_id");
                ax.v4.d.d(ax.v4.d.f()).k(x8.g, g8);
            }
            if (x8.h != null) {
                g8.o("sharing_info");
                ax.v4.d.e(y.a.b).k(x8.h, g8);
            }
            if (x8.i != null) {
                g8.o("property_groups");
                ax.v4.d.d(ax.v4.d.c(e.a.b)).k(x8.i, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

