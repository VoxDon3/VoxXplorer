/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.O;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class N {
    public static final N c = new N().d(ax.G4.N$c.q);
    private c a;
    private O b;

    private N() {
    }

    public static N b(O o8) {
        if (o8 != null) {
            return new N().e(ax.G4.N$c.c0, o8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private N d(c c8) {
        N n8 = new N();
        n8.a = c8;
        return n8;
    }

    private N e(c c8, O o8) {
        N n8 = new N();
        n8.a = c8;
        n8.b = o8;
        return n8;
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
        if (object instanceof N) {
            object = (N)object;
            Object object2 = this.a;
            if (object2 != ((N)object).a) {
                return false;
            }
            int n8 = ax.G4.N$a.a[object2.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    return false;
                }
                object2 = this.b;
                object = ((N)object).b;
                if (object2 != object && !((O)object2).equals(object)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.N$b.b.j(this, false);
    }

    static class b
    extends f<N> {
        public static final b b = new b();

        b() {
        }

        public N s(j j8) throws IOException, i {
            block6: {
                Object object;
                block9: {
                    boolean bl;
                    block8: {
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
                            if (!"pending".equals(object)) break block7;
                            object = c;
                            break block8;
                        }
                        if (!"metadata".equals(object)) break block9;
                        ax.v4.c.f("metadata", j8);
                        object = N.b((O)O.a.b.a(j8));
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

        public void t(N n8, g object) throws IOException, ax.T4.f {
            int n9 = ax.G4.N$a.a[n8.c().ordinal()];
            if (n9 != 1) {
                if (n9 == 2) {
                    ((g)object).o0();
                    this.r("metadata", (g)object);
                    ((g)object).o("metadata");
                    O.a.b.k(n8.b, (g)object);
                    ((g)object).m();
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Unrecognized tag: ");
                ((StringBuilder)object).append((Object)n8.c());
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            ((g)object).s0("pending");
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        private static final c[] d0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            q = c9 = new c();
            c0 = c8 = new c();
            d0 = new c[]{c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])d0.clone();
        }
    }
}

