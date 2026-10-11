/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.k;
import ax.G4.t;
import ax.G4.x;
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

public class P {
    protected final String a;
    protected final String b;
    protected final String c;
    protected final String d;
    protected final String e;

    public P(String string, String string2, String string3, String string4, String string5) {
        if (string != null) {
            this.a = string;
            this.b = string2;
            this.c = string3;
            if (string4 != null && !Pattern.matches("[-_0-9a-zA-Z:]+", string4)) {
                throw new IllegalArgumentException("String 'parentSharedFolderId' does not match pattern");
            }
            this.d = string4;
            this.e = string5;
            return;
        }
        throw new IllegalArgumentException("Required value for 'name' is null");
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return ax.G4.P$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (P)object;
            String string = this.a;
            String string2 = ((P)object).a;
            return (string == string2 || string.equals(string2)) && ((string2 = this.b) == (string = ((P)object).b) || string2 != null && string2.equals(string)) && ((string = this.c) == (string2 = ((P)object).c) || string != null && string.equals(string2)) && ((string = this.d) == (string2 = ((P)object).d) || string != null && string.equals(string2)) && ((string = this.e) == (object = ((P)object).e) || string != null && string.equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public String toString() {
        return ax.G4.P$a.b.j(this, false);
    }

    static class a
    extends e<P> {
        public static final a b = new a();

        a() {
        }

        public P u(j j8, boolean bl) throws IOException, i {
            Object object;
            CharSequence charSequence;
            block21: {
                block17: {
                    block20: {
                        block19: {
                            block18: {
                                block15: {
                                    block16: {
                                        block14: {
                                            block13: {
                                                if (bl) break block13;
                                                ax.v4.c.h(j8);
                                                charSequence = ax.v4.a.q(j8);
                                                object = charSequence;
                                                if (!"".equals(charSequence)) break block14;
                                            }
                                            object = null;
                                        }
                                        if (object != null) break block15;
                                        String string = null;
                                        String string2 = null;
                                        object = string2;
                                        charSequence = object;
                                        String string3 = charSequence;
                                        while (j8.j() == m.p0) {
                                            String string4 = j8.g();
                                            j8.H();
                                            if ("name".equals(string4)) {
                                                string = ax.v4.d.f().a(j8);
                                                continue;
                                            }
                                            if ("path_lower".equals(string4)) {
                                                string2 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                                                continue;
                                            }
                                            if ("path_display".equals(string4)) {
                                                object = ax.v4.d.d(ax.v4.d.f()).a(j8);
                                                continue;
                                            }
                                            if ("parent_shared_folder_id".equals(string4)) {
                                                charSequence = ax.v4.d.d(ax.v4.d.f()).a(j8);
                                                continue;
                                            }
                                            if ("preview_url".equals(string4)) {
                                                string3 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                                                continue;
                                            }
                                            ax.v4.c.o(j8);
                                        }
                                        if (string == null) break block16;
                                        object = new P(string, string2, (String)object, (String)charSequence, string3);
                                        break block17;
                                    }
                                    throw new i(j8, "Required field \"name\" missing.");
                                }
                                if (!"".equals(object)) break block18;
                                object = b.u(j8, true);
                                break block17;
                            }
                            if (!"file".equals(object)) break block19;
                            object = t.a.b.u(j8, true);
                            break block17;
                        }
                        if (!"folder".equals(object)) break block20;
                        object = x.a.b.u(j8, true);
                        break block17;
                    }
                    if (!"deleted".equals(object)) break block21;
                    object = k.a.b.u(j8, true);
                }
                if (!bl) {
                    ax.v4.c.e(j8);
                }
                ax.v4.b.a(object, ((P)object).d());
                return object;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("No subtype found that matches tag: \"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\"");
            throw new i(j8, ((StringBuilder)charSequence).toString());
        }

        public void v(P p8, g g8, boolean bl) throws IOException, f {
            if (p8 instanceof t) {
                t.a.b.v((t)p8, g8, bl);
                return;
            }
            if (p8 instanceof x) {
                x.a.b.v((x)p8, g8, bl);
                return;
            }
            if (p8 instanceof k) {
                k.a.b.v((k)p8, g8, bl);
                return;
            }
            if (!bl) {
                g8.o0();
            }
            g8.o("name");
            ax.v4.d.f().k(p8.a, g8);
            if (p8.b != null) {
                g8.o("path_lower");
                ax.v4.d.d(ax.v4.d.f()).k(p8.b, g8);
            }
            if (p8.c != null) {
                g8.o("path_display");
                ax.v4.d.d(ax.v4.d.f()).k(p8.c, g8);
            }
            if (p8.d != null) {
                g8.o("parent_shared_folder_id");
                ax.v4.d.d(ax.v4.d.f()).k(p8.d, g8);
            }
            if (p8.e != null) {
                g8.o("preview_url");
                ax.v4.d.d(ax.v4.d.f()).k(p8.e, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

