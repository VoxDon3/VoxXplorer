/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.M;
import ax.G4.S;
import ax.G4.S0;
import ax.G4.T;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class W {
    public static final W g = new W().q(ax.G4.W$c.e0);
    public static final W h = new W().q(ax.G4.W$c.f0);
    public static final W i = new W().q(ax.G4.W$c.g0);
    public static final W j = new W().q(ax.G4.W$c.h0);
    public static final W k = new W().q(ax.G4.W$c.i0);
    public static final W l = new W().q(ax.G4.W$c.j0);
    public static final W m = new W().q(ax.G4.W$c.k0);
    public static final W n = new W().q(ax.G4.W$c.l0);
    public static final W o = new W().q(ax.G4.W$c.m0);
    public static final W p = new W().q(ax.G4.W$c.p0);
    private c a;
    private M b;
    private S0 c;
    private S0 d;
    private T e;
    private S f;

    private W() {
    }

    public static W f(S s8) {
        if (s8 != null) {
            return new W().r(ax.G4.W$c.o0, s8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static W g(T t8) {
        if (t8 != null) {
            return new W().s(ax.G4.W$c.n0, t8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static W h(M m8) {
        if (m8 != null) {
            return new W().t(ax.G4.W$c.q, m8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static W i(S0 s02) {
        if (s02 != null) {
            return new W().u(ax.G4.W$c.c0, s02);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static W p(S0 s02) {
        if (s02 != null) {
            return new W().v(ax.G4.W$c.d0, s02);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private W q(c c8) {
        W w8 = new W();
        w8.a = c8;
        return w8;
    }

    private W r(c c8, S s8) {
        W w8 = new W();
        w8.a = c8;
        w8.f = s8;
        return w8;
    }

    private W s(c c8, T t8) {
        W w8 = new W();
        w8.a = c8;
        w8.e = t8;
        return w8;
    }

    private W t(c c8, M m8) {
        W w8 = new W();
        w8.a = c8;
        w8.b = m8;
        return w8;
    }

    private W u(c c8, S0 s02) {
        W w8 = new W();
        w8.a = c8;
        w8.c = s02;
        return w8;
    }

    private W v(c c8, S0 s02) {
        W w8 = new W();
        w8.a = c8;
        w8.d = s02;
        return w8;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof W) {
            object = (W)object;
            Object object2 = this.a;
            if (object2 != ((W)object).a) {
                return false;
            }
            switch (ax.G4.W$a.a[((Enum)object2).ordinal()]) {
                default: {
                    return false;
                }
                case 15: {
                    return true;
                }
                case 14: {
                    object2 = this.f;
                    object = ((W)object).f;
                    return object2 == object || object2.equals(object);
                    {
                    }
                }
                case 13: {
                    object2 = this.e;
                    object = ((W)object).e;
                    if (object2 != object && !object2.equals(object)) {
                        return false;
                    }
                }
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: {
                    return true;
                }
                case 3: {
                    object2 = this.d;
                    object = ((W)object).d;
                    return object2 == object || ((S0)object2).equals(object);
                    {
                    }
                }
                case 2: {
                    object2 = this.c;
                    object = ((W)object).c;
                    return object2 == object || ((S0)object2).equals(object);
                    {
                    }
                }
                case 1: 
            }
            object2 = this.b;
            object = ((W)object).b;
            return object2 == object || ((M)object2).equals(object);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public M j() {
        if (this.a == ax.G4.W$c.q) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.FROM_LOOKUP, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public S0 k() {
        if (this.a == ax.G4.W$c.c0) {
            return this.c;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.FROM_WRITE, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean l() {
        return this.a == ax.G4.W$c.q;
    }

    public boolean m() {
        return this.a == ax.G4.W$c.c0;
    }

    public boolean n() {
        return this.a == ax.G4.W$c.k0;
    }

    public c o() {
        return this.a;
    }

    public String toString() {
        return ax.G4.W$b.b.j(this, false);
    }

    static class b
    extends f<W> {
        public static final b b = new b();

        b() {
        }

        public W s(j j8) throws IOException, i {
            boolean bl;
            Object object;
            if (j8.j() == ax.T4.m.r0) {
                object = ax.v4.c.i(j8);
                j8.H();
                bl = true;
            } else {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
                bl = false;
            }
            if (object != null) {
                if ("from_lookup".equals(object)) {
                    ax.v4.c.f("from_lookup", j8);
                    object = W.h(M.b.b.s(j8));
                } else if ("from_write".equals(object)) {
                    ax.v4.c.f("from_write", j8);
                    object = W.i(S0.b.b.s(j8));
                } else if ("to".equals(object)) {
                    ax.v4.c.f("to", j8);
                    object = W.p(S0.b.b.s(j8));
                } else if ("cant_copy_shared_folder".equals(object)) {
                    object = g;
                } else if ("cant_nest_shared_folder".equals(object)) {
                    object = h;
                } else if ("cant_move_folder_into_itself".equals(object)) {
                    object = i;
                } else if ("too_many_files".equals(object)) {
                    object = j;
                } else if ("duplicated_or_nested_paths".equals(object)) {
                    object = k;
                } else if ("cant_transfer_ownership".equals(object)) {
                    object = l;
                } else if ("insufficient_quota".equals(object)) {
                    object = m;
                } else if ("internal_error".equals(object)) {
                    object = n;
                } else if ("cant_move_shared_folder".equals(object)) {
                    object = o;
                } else if ("cant_move_into_vault".equals(object)) {
                    ax.v4.c.f("cant_move_into_vault", j8);
                    object = W.g(T.b.b.s(j8));
                } else if ("cant_move_into_family".equals(object)) {
                    ax.v4.c.f("cant_move_into_family", j8);
                    object = W.f(S.b.b.s(j8));
                } else {
                    object = p;
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(W w8, g g8) throws IOException, ax.T4.f {
            switch (ax.G4.W$a.a[w8.o().ordinal()]) {
                default: {
                    g8.s0("other");
                    return;
                }
                case 14: {
                    g8.o0();
                    this.r("cant_move_into_family", g8);
                    g8.o("cant_move_into_family");
                    S.b.b.t(w8.f, g8);
                    g8.m();
                    return;
                }
                case 13: {
                    g8.o0();
                    this.r("cant_move_into_vault", g8);
                    g8.o("cant_move_into_vault");
                    T.b.b.t(w8.e, g8);
                    g8.m();
                    return;
                }
                case 12: {
                    g8.s0("cant_move_shared_folder");
                    return;
                }
                case 11: {
                    g8.s0("internal_error");
                    return;
                }
                case 10: {
                    g8.s0("insufficient_quota");
                    return;
                }
                case 9: {
                    g8.s0("cant_transfer_ownership");
                    return;
                }
                case 8: {
                    g8.s0("duplicated_or_nested_paths");
                    return;
                }
                case 7: {
                    g8.s0("too_many_files");
                    return;
                }
                case 6: {
                    g8.s0("cant_move_folder_into_itself");
                    return;
                }
                case 5: {
                    g8.s0("cant_nest_shared_folder");
                    return;
                }
                case 4: {
                    g8.s0("cant_copy_shared_folder");
                    return;
                }
                case 3: {
                    g8.o0();
                    this.r("to", g8);
                    g8.o("to");
                    S0.b.b.t(w8.d, g8);
                    g8.m();
                    return;
                }
                case 2: {
                    g8.o0();
                    this.r("from_write", g8);
                    g8.o("from_write");
                    S0.b.b.t(w8.c, g8);
                    g8.m();
                    return;
                }
                case 1: 
            }
            g8.o0();
            this.r("from_lookup", g8);
            g8.o("from_lookup");
            M.b.b.t(w8.b, g8);
            g8.m();
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
        public static final /* enum */ c l0;
        public static final /* enum */ c m0;
        public static final /* enum */ c n0;
        public static final /* enum */ c o0;
        public static final /* enum */ c p0;
        public static final /* enum */ c q;
        private static final c[] q0;

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
            c c18;
            c c19;
            c c20;
            c c21;
            c c22;
            q = c22 = new c();
            c0 = c21 = new c();
            d0 = c20 = new c();
            e0 = c19 = new c();
            f0 = c18 = new c();
            g0 = c17 = new c();
            h0 = c16 = new c();
            i0 = c15 = new c();
            j0 = c14 = new c();
            k0 = c13 = new c();
            l0 = c12 = new c();
            m0 = c11 = new c();
            n0 = c10 = new c();
            o0 = c9 = new c();
            p0 = c8 = new c();
            q0 = new c[]{c22, c21, c20, c19, c18, c17, c16, c15, c14, c13, c12, c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])q0.clone();
        }
    }
}

