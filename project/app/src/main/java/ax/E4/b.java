/*
 * Decompiled with CFR 0.152.
 */
package ax.E4;

import ax.E4.c;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.d;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class b {
    public static final b d = new b().f(ax.E4.b$c.c0);
    public static final b e = new b().f(ax.E4.b$c.d0);
    public static final b f = new b().f(ax.E4.b$c.f0);
    public static final b g = new b().f(ax.E4.b$c.g0);
    public static final b h = new b().f(ax.E4.b$c.h0);
    public static final b i = new b().f(ax.E4.b$c.i0);
    private c a;
    private String b;
    private ax.E4.c c;

    private b() {
    }

    public static b c(ax.E4.c c8) {
        if (c8 != null) {
            return new b().g(ax.E4.b$c.e0, c8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static b e(String string) {
        if (string != null) {
            if (string.length() >= 1) {
                if (Pattern.matches("(/|ptid:).*", string)) {
                    return new b().h(ax.E4.b$c.q, string);
                }
                throw new IllegalArgumentException("String does not match pattern");
            }
            throw new IllegalArgumentException("String is shorter than 1");
        }
        throw new IllegalArgumentException("Value is null");
    }

    private b f(c c8) {
        b b8 = new b();
        b8.a = c8;
        return b8;
    }

    private b g(c c8, ax.E4.c c9) {
        b b8 = new b();
        b8.a = c8;
        b8.c = c9;
        return b8;
    }

    private b h(c c8, String string) {
        b b8 = new b();
        b8.a = c8;
        b8.b = string;
        return b8;
    }

    public c d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof b) {
            object = (b)object;
            Object object2 = this.a;
            if (object2 != ((b)object).a) {
                return false;
            }
            switch (ax.E4.b$a.a[object2.ordinal()]) {
                default: {
                    return false;
                }
                case 5: 
                case 6: 
                case 7: 
                case 8: {
                    return true;
                }
                case 4: {
                    object2 = this.c;
                    object = ((b)object).c;
                    if (object2 != object && !((ax.E4.c)object2).equals(object)) {
                        return false;
                    }
                }
                case 2: 
                case 3: {
                    return true;
                }
                case 1: 
            }
            object2 = this.b;
            object = ((b)object).b;
            return object2 == object || ((String)object2).equals(object);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        return super.hashCode() * 31 + n8;
    }

    public String toString() {
        return ax.E4.b$b.b.j(this, false);
    }

    public static class b
    extends f<b> {
        public static final b b = new b();

        public b s(j j8) throws IOException, i {
            block6: {
                Object object;
                block15: {
                    boolean bl;
                    block8: {
                        block14: {
                            block13: {
                                block12: {
                                    block11: {
                                        block10: {
                                            block9: {
                                                block7: {
                                                    if (j8.j() == m.r0) {
                                                        object = ax.v4.c.i(j8);
                                                        j8.H();
                                                        bl = true;
                                                    } else {
                                                        ax.v4.c.h(j8);
                                                        object = ax.v4.a.q(j8);
                                                        bl = false;
                                                    }
                                                    if (object == null) break block6;
                                                    if (!"template_not_found".equals(object)) break block7;
                                                    ax.v4.c.f("template_not_found", j8);
                                                    object = ax.E4.b.e(ax.v4.d.f().a(j8));
                                                    break block8;
                                                }
                                                if (!"restricted_content".equals(object)) break block9;
                                                object = d;
                                                break block8;
                                            }
                                            if (!"other".equals(object)) break block10;
                                            object = e;
                                            break block8;
                                        }
                                        if (!"path".equals(object)) break block11;
                                        ax.v4.c.f("path", j8);
                                        object = ax.E4.b.c(c.b.b.s(j8));
                                        break block8;
                                    }
                                    if (!"unsupported_folder".equals(object)) break block12;
                                    object = f;
                                    break block8;
                                }
                                if (!"property_field_too_large".equals(object)) break block13;
                                object = g;
                                break block8;
                            }
                            if (!"does_not_fit_template".equals(object)) break block14;
                            object = h;
                            break block8;
                        }
                        if (!"duplicate_property_groups".equals(object)) break block15;
                        object = i;
                    }
                    if (!bl) {
                        ax.v4.c.n(j8);
                        ax.v4.c.e(j8);
                    }
                    return object;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown tag: ");
                stringBuilder.append((String)object);
                throw new i(j8, stringBuilder.toString());
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(b b8, g object) throws IOException, ax.T4.f {
            switch (ax.E4.b$a.a[b8.d().ordinal()]) {
                default: {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unrecognized tag: ");
                    ((StringBuilder)object).append((Object)b8.d());
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                case 8: {
                    ((g)object).s0("duplicate_property_groups");
                    return;
                }
                case 7: {
                    ((g)object).s0("does_not_fit_template");
                    return;
                }
                case 6: {
                    ((g)object).s0("property_field_too_large");
                    return;
                }
                case 5: {
                    ((g)object).s0("unsupported_folder");
                    return;
                }
                case 4: {
                    ((g)object).o0();
                    this.r("path", (g)object);
                    ((g)object).o("path");
                    c.b.b.t(b8.c, (g)object);
                    ((g)object).m();
                    return;
                }
                case 3: {
                    ((g)object).s0("other");
                    return;
                }
                case 2: {
                    ((g)object).s0("restricted_content");
                    return;
                }
                case 1: 
            }
            ((g)object).o0();
            this.r("template_not_found", (g)object);
            ((g)object).o("template_not_found");
            ax.v4.d.f().k(b8.b, (g)object);
            ((g)object).m();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        public static final /* enum */ c f0;
        public static final /* enum */ c g0;
        public static final /* enum */ c h0;
        public static final /* enum */ c i0;
        private static final c[] j0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            c c12;
            c c13;
            c c14;
            c c15;
            q = c15 = new c();
            c0 = c14 = new c();
            d0 = c13 = new c();
            e0 = c12 = new c();
            f0 = c11 = new c();
            g0 = c10 = new c();
            h0 = c9 = new c();
            i0 = c8 = new c();
            j0 = new c[]{c15, c14, c13, c12, c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])j0.clone();
        }
    }
}

