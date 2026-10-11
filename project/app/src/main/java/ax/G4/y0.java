/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.H0;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class y0 {
    public static final y0 c = new y0().f(ax.G4.y0$c.q);
    public static final y0 d = new y0().f(ax.G4.y0$c.d0);
    public static final y0 e = new y0().f(ax.G4.y0$c.e0);
    public static final y0 f = new y0().f(ax.G4.y0$c.f0);
    public static final y0 g = new y0().f(ax.G4.y0$c.g0);
    public static final y0 h = new y0().f(ax.G4.y0$c.h0);
    public static final y0 i = new y0().f(ax.G4.y0$c.i0);
    public static final y0 j = new y0().f(ax.G4.y0$c.j0);
    public static final y0 k = new y0().f(ax.G4.y0$c.k0);
    private c a;
    private H0 b;

    private y0() {
    }

    public static y0 c(H0 h02) {
        if (h02 != null) {
            return new y0().g(ax.G4.y0$c.c0, h02);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private y0 f(c c8) {
        y0 y02 = new y0();
        y02.a = c8;
        return y02;
    }

    private y0 g(c c8, H0 h02) {
        y0 y02 = new y0();
        y02.a = c8;
        y02.b = h02;
        return y02;
    }

    public H0 b() {
        if (this.a == ax.G4.y0$c.c0) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.INCORRECT_OFFSET, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean d() {
        return this.a == ax.G4.y0$c.c0;
    }

    public c e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof y0) {
            object = (y0)object;
            Object object2 = this.a;
            if (object2 != ((y0)object).a) {
                return false;
            }
            switch (ax.G4.y0$a.a[object2.ordinal()]) {
                default: {
                    return false;
                }
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: {
                    return true;
                }
                case 2: {
                    object2 = this.b;
                    object = ((y0)object).b;
                    if (object2 == object || ((H0)object2).equals(object)) break;
                    return false;
                }
                case 1: 
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.a, this.b});
        return super.hashCode() * 31 + n8;
    }

    public String toString() {
        return ax.G4.y0$b.b.j(this, false);
    }

    static class b
    extends f<y0> {
        public static final b b = new b();

        b() {
        }

        public y0 s(j j8) throws IOException, i {
            block6: {
                Object object;
                block17: {
                    boolean bl;
                    block8: {
                        block16: {
                            block15: {
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
                                                            if (!"not_found".equals(object)) break block7;
                                                            object = c;
                                                            break block8;
                                                        }
                                                        if (!"incorrect_offset".equals(object)) break block9;
                                                        object = y0.c(H0.a.b.u(j8, true));
                                                        break block8;
                                                    }
                                                    if (!"closed".equals(object)) break block10;
                                                    object = d;
                                                    break block8;
                                                }
                                                if (!"not_closed".equals(object)) break block11;
                                                object = e;
                                                break block8;
                                            }
                                            if (!"too_large".equals(object)) break block12;
                                            object = f;
                                            break block8;
                                        }
                                        if (!"concurrent_session_invalid_offset".equals(object)) break block13;
                                        object = g;
                                        break block8;
                                    }
                                    if (!"concurrent_session_invalid_data_size".equals(object)) break block14;
                                    object = h;
                                    break block8;
                                }
                                if (!"payload_too_large".equals(object)) break block15;
                                object = i;
                                break block8;
                            }
                            if (!"other".equals(object)) break block16;
                            object = j;
                            break block8;
                        }
                        if (!"content_hash_mismatch".equals(object)) break block17;
                        object = k;
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

        public void t(y0 y02, g object) throws IOException, ax.T4.f {
            switch (ax.G4.y0$a.a[y02.e().ordinal()]) {
                default: {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unrecognized tag: ");
                    ((StringBuilder)object).append((Object)y02.e());
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                case 10: {
                    ((g)object).s0("content_hash_mismatch");
                    return;
                }
                case 9: {
                    ((g)object).s0("other");
                    return;
                }
                case 8: {
                    ((g)object).s0("payload_too_large");
                    return;
                }
                case 7: {
                    ((g)object).s0("concurrent_session_invalid_data_size");
                    return;
                }
                case 6: {
                    ((g)object).s0("concurrent_session_invalid_offset");
                    return;
                }
                case 5: {
                    ((g)object).s0("too_large");
                    return;
                }
                case 4: {
                    ((g)object).s0("not_closed");
                    return;
                }
                case 3: {
                    ((g)object).s0("closed");
                    return;
                }
                case 2: {
                    ((g)object).o0();
                    this.r("incorrect_offset", (g)object);
                    H0.a.b.v(y02.b, (g)object, true);
                    ((g)object).m();
                    return;
                }
                case 1: 
            }
            ((g)object).s0("not_found");
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
        public static final /* enum */ c j0;
        public static final /* enum */ c k0;
        private static final c[] l0;
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
            c c16;
            c c17;
            q = c17 = new c();
            c0 = c16 = new c();
            d0 = c15 = new c();
            e0 = c14 = new c();
            f0 = c13 = new c();
            g0 = c12 = new c();
            h0 = c11 = new c();
            i0 = c10 = new c();
            j0 = c9 = new c();
            k0 = c8 = new c();
            l0 = new c[]{c17, c16, c15, c14, c13, c12, c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])l0.clone();
        }
    }
}

