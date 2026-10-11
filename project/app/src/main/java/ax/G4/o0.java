/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.M;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class o0 {
    public static final o0 c = new o0().d(ax.G4.o0$c.c0);
    public static final o0 d = new o0().d(ax.G4.o0$c.d0);
    public static final o0 e = new o0().d(ax.G4.o0$c.e0);
    private c a;
    private M b;

    private o0() {
    }

    public static o0 b(M m8) {
        if (m8 != null) {
            return new o0().e(ax.G4.o0$c.q, m8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private o0 d(c c8) {
        o0 o02 = new o0();
        o02.a = c8;
        return o02;
    }

    private o0 e(c c8, M m8) {
        o0 o02 = new o0();
        o02.a = c8;
        o02.b = m8;
        return o02;
    }

    public c c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof o0) {
            object = (o0)object;
            Object object2 = this.a;
            if (object2 != ((o0)object).a) {
                return false;
            }
            int n8 = ax.G4.o0$a.a[object2.ordinal()];
            if (n8 != 1) {
                return n8 == 2 || n8 == 3 || n8 == 4;
            }
            object2 = this.b;
            object = ((o0)object).b;
            return object2 == object || ((M)object2).equals(object);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.o0$b.b.j(this, false);
    }

    static class b
    extends f<o0> {
        public static final b b = new b();

        b() {
        }

        public o0 s(j j8) throws IOException, i {
            block6: {
                Object object;
                block11: {
                    boolean bl;
                    block8: {
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
                                    if (!"path".equals(object)) break block7;
                                    ax.v4.c.f("path", j8);
                                    object = o0.b(M.b.b.s(j8));
                                    break block8;
                                }
                                if (!"unsupported_extension".equals(object)) break block9;
                                object = c;
                                break block8;
                            }
                            if (!"unsupported_image".equals(object)) break block10;
                            object = d;
                            break block8;
                        }
                        if (!"conversion_error".equals(object)) break block11;
                        object = e;
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

        public void t(o0 o02, g object) throws IOException, ax.T4.f {
            int n8 = ax.G4.o0$a.a[o02.c().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            ((g)object).s0("conversion_error");
                            return;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Unrecognized tag: ");
                        ((StringBuilder)object).append((Object)o02.c());
                        throw new IllegalArgumentException(((StringBuilder)object).toString());
                    }
                    ((g)object).s0("unsupported_image");
                    return;
                }
                ((g)object).s0("unsupported_extension");
                return;
            }
            ((g)object).o0();
            this.r("path", (g)object);
            ((g)object).o("path");
            M.b.b.t(o02.b, (g)object);
            ((g)object).m();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        private static final c[] f0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            q = c11 = new c();
            c0 = c10 = new c();
            d0 = c9 = new c();
            e0 = c8 = new c();
            f0 = new c[]{c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])f0.clone();
        }
    }
}

