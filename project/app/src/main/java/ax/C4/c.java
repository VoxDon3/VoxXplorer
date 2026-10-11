/*
 * Decompiled with CFR 0.152.
 */
package ax.C4;

import ax.C4.d;
import ax.C4.e;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class c {
    protected final String a;
    protected final String b;

    public c(String string, String string2) {
        if (string != null) {
            if (Pattern.matches("[-_0-9a-zA-Z:]+", string)) {
                this.a = string;
                if (string2 != null) {
                    if (Pattern.matches("[-_0-9a-zA-Z:]+", string2)) {
                        this.b = string2;
                        return;
                    }
                    throw new IllegalArgumentException("String 'homeNamespaceId' does not match pattern");
                }
                throw new IllegalArgumentException("Required value for 'homeNamespaceId' is null");
            }
            throw new IllegalArgumentException("String 'rootNamespaceId' does not match pattern");
        }
        throw new IllegalArgumentException("Required value for 'rootNamespaceId' is null");
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return ax.C4.c$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (c)object;
            String string = this.a;
            String string2 = ((c)object).a;
            return !(string != string2 && !string.equals(string2) || (string2 = this.b) != (object = ((c)object).b) && !string2.equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.C4.c$a.b.j(this, false);
    }

    public static class a
    extends ax.v4.e<c> {
        public static final a b = new a();

        public c u(j j8, boolean bl) throws IOException, i {
            Object object;
            CharSequence charSequence;
            block18: {
                block15: {
                    block17: {
                        block16: {
                            block12: {
                                block13: {
                                    block14: {
                                        String string;
                                        block11: {
                                            block10: {
                                                charSequence = null;
                                                if (bl) break block10;
                                                ax.v4.c.h(j8);
                                                string = ax.v4.a.q(j8);
                                                object = string;
                                                if (!"".equals(string)) break block11;
                                            }
                                            object = null;
                                        }
                                        if (object != null) break block12;
                                        string = null;
                                        object = charSequence;
                                        charSequence = string;
                                        while (j8.j() == m.p0) {
                                            string = j8.g();
                                            j8.H();
                                            if ("root_namespace_id".equals(string)) {
                                                object = ax.v4.d.f().a(j8);
                                                continue;
                                            }
                                            if ("home_namespace_id".equals(string)) {
                                                charSequence = ax.v4.d.f().a(j8);
                                                continue;
                                            }
                                            ax.v4.c.o(j8);
                                        }
                                        if (object == null) break block13;
                                        if (charSequence == null) break block14;
                                        object = new c((String)object, (String)charSequence);
                                        break block15;
                                    }
                                    throw new i(j8, "Required field \"home_namespace_id\" missing.");
                                }
                                throw new i(j8, "Required field \"root_namespace_id\" missing.");
                            }
                            if (!"".equals(object)) break block16;
                            object = b.u(j8, true);
                            break block15;
                        }
                        if (!"team".equals(object)) break block17;
                        object = d.a.b.u(j8, true);
                        break block15;
                    }
                    if (!"user".equals(object)) break block18;
                    object = e.a.b.u(j8, true);
                }
                if (!bl) {
                    ax.v4.c.e(j8);
                }
                ax.v4.b.a(object, ((c)object).c());
                return object;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("No subtype found that matches tag: \"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\"");
            throw new i(j8, ((StringBuilder)charSequence).toString());
        }

        public void v(c c8, g g8, boolean bl) throws IOException, f {
            if (c8 instanceof d) {
                d.a.b.v((d)c8, g8, bl);
                return;
            }
            if (c8 instanceof e) {
                e.a.b.v((e)c8, g8, bl);
                return;
            }
            if (!bl) {
                g8.o0();
            }
            g8.o("root_namespace_id");
            ax.v4.d.f().k(c8.a, g8);
            g8.o("home_namespace_id");
            ax.v4.d.f().k(c8.b, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

