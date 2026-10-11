/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.B4;
import ax.b6.F4;
import ax.b6.L4;
import ax.b6.M4;
import ax.b6.S3;
import ax.b6.U3;
import ax.b6.U4;
import ax.b6.c6;
import ax.b6.j4;
import ax.b6.l5;
import ax.b6.m4;
import ax.b6.n4;
import ax.b6.y3;
import java.io.IOException;
import java.util.List;
import java.util.Map;

final class V3
implements c6 {
    private final S3 a;

    private V3(S3 s32) {
        this.a = s32 = m4.f(s32, "output");
        s32.a = this;
    }

    public static V3 P(S3 s32) {
        V3 v32 = s32.a;
        if (v32 != null) {
            return v32;
        }
        return new V3(s32);
    }

    @Override
    public final void A(int n8, List<Integer> n42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = n42 instanceof n4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            n42 = n42;
            if (bl) {
                this.a.Z(n8, 2);
                n8 = 0;
                for (n9 = 0; n9 < n42.size(); ++n9) {
                    n8 += S3.z0(n42.g(n9));
                }
                this.a.Y(n8);
                for (n8 = n12; n8 < n42.size(); ++n8) {
                    this.a.Y(n42.g(n8));
                }
            } else {
                for (n9 = n10; n9 < n42.size(); ++n9) {
                    this.a.f0(n8, n42.g(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < n42.size(); ++n9) {
                n8 += S3.z0((Integer)n42.get(n9));
            }
            this.a.Y(n8);
            for (n8 = n11; n8 < n42.size(); ++n8) {
                this.a.Y((Integer)n42.get(n8));
            }
        } else {
            for (n9 = 0; n9 < n42.size(); ++n9) {
                this.a.f0(n8, (Integer)n42.get(n9));
            }
        }
    }

    @Override
    public final void B(int n8, Object object, l5 l52) throws IOException {
        S3 s32 = this.a;
        object = (U4)object;
        s32.Z(n8, 3);
        l52.c(object, s32.a);
        s32.Z(n8, 4);
    }

    @Override
    public final void C(int n8, List<Integer> n42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = n42 instanceof n4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            n42 = n42;
            if (bl) {
                this.a.Z(n8, 2);
                n9 = 0;
                for (n8 = 0; n8 < n42.size(); ++n8) {
                    n9 += S3.k0(n42.g(n8));
                }
                this.a.Y(n9);
                for (n8 = n12; n8 < n42.size(); ++n8) {
                    this.a.L(n42.g(n8));
                }
            } else {
                for (n9 = 0; n9 < n42.size(); ++n9) {
                    this.a.O(n8, n42.g(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < n42.size(); ++n8) {
                n9 += S3.k0((Integer)n42.get(n8));
            }
            this.a.Y(n9);
            for (n8 = n10; n8 < n42.size(); ++n8) {
                this.a.L((Integer)n42.get(n8));
            }
        } else {
            for (n9 = n11; n9 < n42.size(); ++n9) {
                this.a.O(n8, (Integer)n42.get(n9));
            }
        }
    }

    @Override
    public final void D(int n8, List<String> list) throws IOException {
        int n9;
        boolean bl = list instanceof B4;
        int n10 = 0;
        if (bl) {
            B4 b42 = (B4)list;
            for (n9 = n10; n9 < list.size(); ++n9) {
                Object object = b42.d(n9);
                if (object instanceof String) {
                    this.a.s(n8, (String)object);
                    continue;
                }
                this.a.p(n8, (B3)object);
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.s(n8, list.get(n9));
            }
        }
    }

    @Override
    public final void E(int n8, int n9) throws IOException {
        this.a.n(n8, n9);
    }

    @Override
    public final void F(int n8, List<?> list, l5 l52) throws IOException {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.I(n8, list.get(i8), l52);
        }
    }

    @Override
    public final void G(int n8, long l8) throws IOException {
        this.a.u0(n8, l8);
    }

    @Override
    public final void H(int n8, List<?> list, l5 l52) throws IOException {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.B(n8, list.get(i8), l52);
        }
    }

    @Override
    public final void I(int n8, Object object, l5 l52) throws IOException {
        this.a.r(n8, (U4)object, l52);
    }

    @Override
    public final void J(int n8, List<Float> j42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = j42 instanceof j4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            j42 = j42;
            if (bl) {
                this.a.Z(n8, 2);
                n9 = 0;
                for (n8 = 0; n8 < j42.size(); ++n8) {
                    n9 += S3.d(j42.h(n8));
                }
                this.a.Y(n9);
                for (n8 = n12; n8 < j42.size(); ++n8) {
                    this.a.K(j42.h(n8));
                }
            } else {
                for (n9 = n10; n9 < j42.size(); ++n9) {
                    this.a.N(n8, j42.h(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < j42.size(); ++n8) {
                n9 += S3.d(((Float)j42.get(n8)).floatValue());
            }
            this.a.Y(n9);
            for (n8 = n11; n8 < j42.size(); ++n8) {
                this.a.K(((Float)j42.get(n8)).floatValue());
            }
        } else {
            for (n9 = 0; n9 < j42.size(); ++n9) {
                this.a.N(n8, ((Float)j42.get(n9)).floatValue());
            }
        }
    }

    @Override
    public final <K, V> void K(int n8, L4<K, V> l42, Map<K, V> object2) throws IOException {
        for (Map.Entry entry : object2.entrySet()) {
            this.a.Z(n8, 2);
            this.a.Y(M4.a(l42, entry.getKey(), entry.getValue()));
            M4.b(this.a, l42, entry.getKey(), entry.getValue());
        }
    }

    @Override
    public final void L(int n8, int n9) throws IOException {
        this.a.C0(n8, n9);
    }

    @Override
    public final void M(int n8, B3 b32) throws IOException {
        this.a.p(n8, b32);
    }

    @Override
    public final void N(int n8, long l8) throws IOException {
        this.a.P(n8, l8);
    }

    @Override
    public final void O(int n8, List<B3> list) throws IOException {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.a.p(n8, list.get(i8));
        }
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void b(int n8, boolean bl) throws IOException {
        this.a.t(n8, bl);
    }

    @Override
    public final void c(int n8, List<Integer> n42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = n42 instanceof n4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            n42 = n42;
            if (bl) {
                this.a.Z(n8, 2);
                n8 = 0;
                for (n9 = 0; n9 < n42.size(); ++n9) {
                    n8 += S3.o0(n42.g(n9));
                }
                this.a.Y(n8);
                for (n8 = n12; n8 < n42.size(); ++n8) {
                    this.a.m(n42.g(n8));
                }
            } else {
                for (n9 = 0; n9 < n42.size(); ++n9) {
                    this.a.n(n8, n42.g(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < n42.size(); ++n9) {
                n8 += S3.o0((Integer)n42.get(n9));
            }
            this.a.Y(n8);
            for (n8 = n10; n8 < n42.size(); ++n8) {
                this.a.m((Integer)n42.get(n8));
            }
        } else {
            for (n9 = n11; n9 < n42.size(); ++n9) {
                this.a.n(n8, (Integer)n42.get(n9));
            }
        }
    }

    @Override
    @Deprecated
    public final void d(int n8) throws IOException {
        this.a.Z(n8, 4);
    }

    @Override
    public final void e(int n8, long l8) throws IOException {
        this.a.P(n8, l8);
    }

    @Override
    public final void f(int n8, int n9) throws IOException {
        this.a.n(n8, n9);
    }

    @Override
    public final void g(int n8, List<Boolean> y32, boolean bl) throws IOException {
        int n9;
        boolean bl2 = y32 instanceof y3;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            y32 = y32;
            if (bl) {
                this.a.Z(n8, 2);
                n8 = 0;
                for (n9 = 0; n9 < y32.size(); ++n9) {
                    n8 += S3.j(y32.h(n9));
                }
                this.a.Y(n8);
                for (n8 = n12; n8 < y32.size(); ++n8) {
                    this.a.S(y32.h(n8));
                }
            } else {
                for (n9 = 0; n9 < y32.size(); ++n9) {
                    this.a.t(n8, y32.h(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < y32.size(); ++n8) {
                n9 += S3.j((Boolean)y32.get(n8));
            }
            this.a.Y(n9);
            for (n8 = n10; n8 < y32.size(); ++n8) {
                this.a.S((Boolean)y32.get(n8));
            }
        } else {
            for (n9 = n11; n9 < y32.size(); ++n9) {
                this.a.t(n8, (Boolean)y32.get(n9));
            }
        }
    }

    @Override
    public final void h(int n8, List<Long> f42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = f42 instanceof F4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            f42 = f42;
            if (bl) {
                this.a.Z(n8, 2);
                n8 = 0;
                for (n9 = 0; n9 < f42.size(); ++n9) {
                    n8 += S3.e0(f42.m(n9));
                }
                this.a.Y(n8);
                for (n8 = n12; n8 < f42.size(); ++n8) {
                    this.a.R(f42.m(n8));
                }
            } else {
                for (n9 = n10; n9 < f42.size(); ++n9) {
                    this.a.P(n8, f42.m(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < f42.size(); ++n9) {
                n8 += S3.e0((Long)f42.get(n9));
            }
            this.a.Y(n8);
            for (n8 = n11; n8 < f42.size(); ++n8) {
                this.a.R((Long)f42.get(n8));
            }
        } else {
            for (n9 = 0; n9 < f42.size(); ++n9) {
                this.a.P(n8, (Long)f42.get(n9));
            }
        }
    }

    @Override
    public final void i(int n8, int n9) throws IOException {
        this.a.O(n8, n9);
    }

    @Override
    public final void j(int n8, long l8) throws IOException {
        this.a.o(n8, l8);
    }

    @Override
    public final void k(int n8, Object object) throws IOException {
        if (object instanceof B3) {
            this.a.Q(n8, (B3)object);
            return;
        }
        this.a.q(n8, (U4)object);
    }

    @Override
    public final void l(int n8, List<Integer> n42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = n42 instanceof n4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            n42 = n42;
            if (bl) {
                this.a.Z(n8, 2);
                n8 = 0;
                for (n9 = 0; n9 < n42.size(); ++n9) {
                    n8 += S3.b0(n42.g(n9));
                }
                this.a.Y(n8);
                for (n8 = n12; n8 < n42.size(); ++n8) {
                    this.a.L(n42.g(n8));
                }
            } else {
                for (n9 = 0; n9 < n42.size(); ++n9) {
                    this.a.O(n8, n42.g(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < n42.size(); ++n9) {
                n8 += S3.b0((Integer)n42.get(n9));
            }
            this.a.Y(n8);
            for (n8 = n10; n8 < n42.size(); ++n8) {
                this.a.L((Integer)n42.get(n8));
            }
        } else {
            for (n9 = n11; n9 < n42.size(); ++n9) {
                this.a.O(n8, (Integer)n42.get(n9));
            }
        }
    }

    @Override
    @Deprecated
    public final void m(int n8) throws IOException {
        this.a.Z(n8, 3);
    }

    @Override
    public final void n(int n8, List<Long> f42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = f42 instanceof F4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            f42 = f42;
            if (bl) {
                this.a.Z(n8, 2);
                n8 = 0;
                for (n9 = 0; n9 < f42.size(); ++n9) {
                    n8 += S3.n0(f42.m(n9));
                }
                this.a.Y(n8);
                for (n8 = n12; n8 < f42.size(); ++n8) {
                    this.a.v0(f42.m(n8));
                }
            } else {
                for (n9 = n10; n9 < f42.size(); ++n9) {
                    this.a.u0(n8, f42.m(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < f42.size(); ++n9) {
                n8 += S3.n0((Long)f42.get(n9));
            }
            this.a.Y(n8);
            for (n8 = n11; n8 < f42.size(); ++n8) {
                this.a.v0((Long)f42.get(n8));
            }
        } else {
            for (n9 = 0; n9 < f42.size(); ++n9) {
                this.a.u0(n8, (Long)f42.get(n9));
            }
        }
    }

    @Override
    public final void o(int n8, List<Double> u32, boolean bl) throws IOException {
        int n9;
        boolean bl2 = u32 instanceof U3;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            u32 = u32;
            if (bl) {
                this.a.Z(n8, 2);
                n9 = 0;
                for (n8 = 0; n8 < u32.size(); ++n8) {
                    n9 += S3.c(u32.h(n8));
                }
                this.a.Y(n9);
                for (n8 = n12; n8 < u32.size(); ++n8) {
                    this.a.J(u32.h(n8));
                }
            } else {
                for (n9 = 0; n9 < u32.size(); ++n9) {
                    this.a.M(n8, u32.h(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < u32.size(); ++n8) {
                n9 += S3.c((Double)u32.get(n8));
            }
            this.a.Y(n9);
            for (n8 = n10; n8 < u32.size(); ++n8) {
                this.a.J((Double)u32.get(n8));
            }
        } else {
            for (n9 = n11; n9 < u32.size(); ++n9) {
                this.a.M(n8, (Double)u32.get(n9));
            }
        }
    }

    @Override
    public final void p(int n8, String string) throws IOException {
        this.a.s(n8, string);
    }

    @Override
    public final void q(int n8, List<Long> f42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = f42 instanceof F4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            f42 = f42;
            if (bl) {
                this.a.Z(n8, 2);
                n8 = 0;
                for (n9 = 0; n9 < f42.size(); ++n9) {
                    n8 += S3.j0(f42.m(n9));
                }
                this.a.Y(n8);
                for (n8 = n12; n8 < f42.size(); ++n8) {
                    this.a.u(f42.m(n8));
                }
            } else {
                for (n9 = n10; n9 < f42.size(); ++n9) {
                    this.a.o(n8, f42.m(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n8 = 0;
            for (n9 = 0; n9 < f42.size(); ++n9) {
                n8 += S3.j0((Long)f42.get(n9));
            }
            this.a.Y(n8);
            for (n8 = n11; n8 < f42.size(); ++n8) {
                this.a.u((Long)f42.get(n8));
            }
        } else {
            for (n9 = 0; n9 < f42.size(); ++n9) {
                this.a.o(n8, (Long)f42.get(n9));
            }
        }
    }

    @Override
    public final void r(int n8, List<Integer> n42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = n42 instanceof n4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            n42 = n42;
            if (bl) {
                this.a.Z(n8, 2);
                n9 = 0;
                for (n8 = 0; n8 < n42.size(); ++n8) {
                    n9 += S3.s0(n42.g(n8));
                }
                this.a.Y(n9);
                for (n8 = n12; n8 < n42.size(); ++n8) {
                    this.a.B0(n42.g(n8));
                }
            } else {
                for (n9 = 0; n9 < n42.size(); ++n9) {
                    this.a.C0(n8, n42.g(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < n42.size(); ++n8) {
                n9 += S3.s0((Integer)n42.get(n8));
            }
            this.a.Y(n9);
            for (n8 = n10; n8 < n42.size(); ++n8) {
                this.a.B0((Integer)n42.get(n8));
            }
        } else {
            for (n9 = n11; n9 < n42.size(); ++n9) {
                this.a.C0(n8, (Integer)n42.get(n9));
            }
        }
    }

    @Override
    public final void s(int n8, int n9) throws IOException {
        this.a.O(n8, n9);
    }

    @Override
    public final void t(int n8, long l8) throws IOException {
        this.a.o(n8, l8);
    }

    @Override
    public final void u(int n8, double d8) throws IOException {
        this.a.M(n8, d8);
    }

    @Override
    public final void v(int n8, float f8) throws IOException {
        this.a.N(n8, f8);
    }

    @Override
    public final void w(int n8, List<Long> f42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = f42 instanceof F4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            f42 = f42;
            if (bl) {
                this.a.Z(n8, 2);
                n9 = 0;
                for (n8 = 0; n8 < f42.size(); ++n8) {
                    n9 += S3.W(f42.m(n8));
                }
                this.a.Y(n9);
                for (n8 = n12; n8 < f42.size(); ++n8) {
                    this.a.u(f42.m(n8));
                }
            } else {
                for (n9 = n10; n9 < f42.size(); ++n9) {
                    this.a.o(n8, f42.m(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < f42.size(); ++n8) {
                n9 += S3.W((Long)f42.get(n8));
            }
            this.a.Y(n9);
            for (n8 = n11; n8 < f42.size(); ++n8) {
                this.a.u((Long)f42.get(n8));
            }
        } else {
            for (n9 = 0; n9 < f42.size(); ++n9) {
                this.a.o(n8, (Long)f42.get(n9));
            }
        }
    }

    @Override
    public final void x(int n8, int n9) throws IOException {
        this.a.f0(n8, n9);
    }

    @Override
    public final void y(int n8, List<Long> f42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = f42 instanceof F4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            f42 = f42;
            if (bl) {
                this.a.Z(n8, 2);
                n9 = 0;
                for (n8 = 0; n8 < f42.size(); ++n8) {
                    n9 += S3.r0(f42.m(n8));
                }
                this.a.Y(n9);
                for (n8 = n12; n8 < f42.size(); ++n8) {
                    this.a.R(f42.m(n8));
                }
            } else {
                for (n9 = 0; n9 < f42.size(); ++n9) {
                    this.a.P(n8, f42.m(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < f42.size(); ++n8) {
                n9 += S3.r0((Long)f42.get(n8));
            }
            this.a.Y(n9);
            for (n8 = n10; n8 < f42.size(); ++n8) {
                this.a.R((Long)f42.get(n8));
            }
        } else {
            for (n9 = n11; n9 < f42.size(); ++n9) {
                this.a.P(n8, (Long)f42.get(n9));
            }
        }
    }

    @Override
    public final void z(int n8, List<Integer> n42, boolean bl) throws IOException {
        int n9;
        boolean bl2 = n42 instanceof n4;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (bl2) {
            n42 = n42;
            if (bl) {
                this.a.Z(n8, 2);
                n8 = 0;
                for (n9 = 0; n9 < n42.size(); ++n9) {
                    n8 += S3.g0(n42.g(n9));
                }
                this.a.Y(n8);
                for (n8 = n12; n8 < n42.size(); ++n8) {
                    this.a.m(n42.g(n8));
                }
            } else {
                for (n9 = n10; n9 < n42.size(); ++n9) {
                    this.a.n(n8, n42.g(n9));
                }
            }
        } else if (bl) {
            this.a.Z(n8, 2);
            n9 = 0;
            for (n8 = 0; n8 < n42.size(); ++n8) {
                n9 += S3.g0((Integer)n42.get(n8));
            }
            this.a.Y(n9);
            for (n8 = n11; n8 < n42.size(); ++n8) {
                this.a.m((Integer)n42.get(n8));
            }
        } else {
            for (n9 = 0; n9 < n42.size(); ++n9) {
                this.a.n(n8, (Integer)n42.get(n9));
            }
        }
    }
}

