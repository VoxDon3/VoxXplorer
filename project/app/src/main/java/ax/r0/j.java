/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.B;
import ax.r0.G;
import ax.r0.I;
import ax.r0.K;
import ax.r0.d0;
import ax.r0.f;
import ax.r0.g0;
import ax.r0.h;
import ax.r0.h0;
import ax.r0.i;
import ax.r0.m;
import ax.r0.p;
import ax.r0.u0;
import ax.r0.w;
import ax.r0.z;
import java.io.IOException;
import java.util.List;
import java.util.Map;

final class j
implements g0 {
    private final i a;
    private int b;
    private int c;
    private int d = 0;

    private j(i i8) {
        this.a = i8 = A.b(i8, "input");
        i8.d = this;
    }

    public static j Q(i i8) {
        j j8 = i8.d;
        if (j8 != null) {
            return j8;
        }
        return new j(i8);
    }

    private Object R(u0.b b8, Class<?> clazz, p p8) throws IOException {
        switch (ax.r0.j$a.a[b8.ordinal()]) {
            default: {
                throw new RuntimeException("unsupported field type.");
            }
            case 17: {
                return this.d();
            }
            case 16: {
                return this.p();
            }
            case 15: {
                return this.O();
            }
            case 14: {
                return this.A();
            }
            case 13: {
                return this.z();
            }
            case 12: {
                return this.n();
            }
            case 11: {
                return this.K();
            }
            case 10: {
                return this.x(clazz, p8);
            }
            case 9: {
                return this.N();
            }
            case 8: {
                return this.I();
            }
            case 7: {
                return Float.valueOf(this.readFloat());
            }
            case 6: {
                return this.e();
            }
            case 5: {
                return this.k();
            }
            case 4: {
                return this.w();
            }
            case 3: {
                return this.readDouble();
            }
            case 2: {
                return this.G();
            }
            case 1: 
        }
        return this.m();
    }

    private <T> T S(h0<T> h02, p p8) throws IOException {
        block3: {
            T t8;
            int n8 = this.c;
            this.c = u0.c(u0.a(this.b), 4);
            try {
                t8 = h02.g();
                h02.h(t8, this, p8);
                h02.b(t8);
                int n9 = this.b;
                int n10 = this.c;
                if (n9 != n10) break block3;
                this.c = n8;
            }
            catch (Throwable throwable) {
                this.c = n8;
                throw throwable;
            }
            return t8;
        }
        throw B.g();
    }

    private <T> T T(h0<T> object, p p8) throws IOException {
        int n8 = this.a.C();
        i i8 = this.a;
        if (i8.a < i8.b) {
            n8 = i8.l(n8);
            i8 = object.g();
            i i9 = this.a;
            ++i9.a;
            object.h(i8, this, p8);
            object.b(i8);
            this.a.a(0);
            object = this.a;
            --((i)object).a;
            ((i)object).k(n8);
            return (T)i8;
        }
        throw B.h();
    }

    private void V(int n8) throws IOException {
        if (this.a.d() == n8) {
            return;
        }
        throw B.k();
    }

    private void W(int n8) throws IOException {
        if (u0.b(this.b) == n8) {
            return;
        }
        throw B.d();
    }

    private void X(int n8) throws IOException {
        if ((n8 & 3) == 0) {
            return;
        }
        throw B.g();
    }

    private void Y(int n8) throws IOException {
        if ((n8 & 7) == 0) {
            return;
        }
        throw B.g();
    }

    @Override
    public long A() throws IOException {
        this.W(0);
        return this.a.y();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void B(List<Boolean> f8) throws IOException {
        if (f8 instanceof f) {
            int n8 = u0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) throw B.d();
                n8 = this.a.C();
                n8 = this.a.d() + n8;
                do {
                    f8.k(this.a.m());
                } while (this.a.d() < n8);
                this.V(n8);
                return;
            }
            do {
                f8.k(this.a.m());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n9 = u0.b(this.b);
        if (n9 != 0) {
            if (n9 != 2) throw B.d();
            n9 = this.a.C();
            n9 = this.a.d() + n9;
            do {
                f8.add(this.a.m());
            } while (this.a.d() < n9);
            this.V(n9);
            return;
        }
        do {
            f8.add(this.a.m());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public String C() throws IOException {
        this.W(2);
        return this.a.z();
    }

    @Override
    public int D() throws IOException {
        int n8 = this.d;
        if (n8 != 0) {
            this.b = n8;
            this.d = 0;
        } else {
            this.b = this.a.B();
        }
        n8 = this.b;
        if (n8 != 0 && n8 != this.c) {
            return u0.a(n8);
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public void E(List<String> list) throws IOException {
        this.U(list, false);
    }

    @Override
    public void F(List<String> list) throws IOException {
        this.U(list, true);
    }

    @Override
    public h G() throws IOException {
        this.W(2);
        return this.a.n();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void H(List<Float> w8) throws IOException {
        if (w8 instanceof w) {
            int n8 = u0.b(this.b);
            if (n8 != 2) {
                if (n8 != 5) throw B.d();
                do {
                    w8.i(this.a.s());
                    if (this.a.e()) return;
                } while ((n8 = this.a.B()) == this.b);
                this.d = n8;
                return;
            }
            n8 = this.a.C();
            this.X(n8);
            int n9 = this.a.d();
            do {
                w8.i(this.a.s());
            } while (this.a.d() < n9 + n8);
            return;
        } else {
            int n10 = u0.b(this.b);
            if (n10 != 2) {
                if (n10 != 5) throw B.d();
                do {
                    w8.add(Float.valueOf(this.a.s()));
                    if (this.a.e()) return;
                } while ((n10 = this.a.B()) == this.b);
                this.d = n10;
                return;
            }
            n10 = this.a.C();
            this.X(n10);
            int n11 = this.a.d();
            do {
                w8.add(Float.valueOf(this.a.s()));
            } while (this.a.d() < n11 + n10);
        }
    }

    @Override
    public int I() throws IOException {
        this.W(0);
        return this.a.t();
    }

    @Override
    public boolean J() throws IOException {
        int n8;
        if (!this.a.e() && (n8 = this.b) != this.c) {
            return this.a.E(n8);
        }
        return false;
    }

    @Override
    public int K() throws IOException {
        this.W(5);
        return this.a.v();
    }

    @Override
    public void L(List<h> list) throws IOException {
        if (u0.b(this.b) == 2) {
            int n8;
            do {
                list.add(this.G());
                if (!this.a.e()) continue;
                return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        throw B.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void M(List<Double> m8) throws IOException {
        if (m8 instanceof m) {
            int n8 = u0.b(this.b);
            if (n8 != 1) {
                if (n8 != 2) throw B.d();
                n8 = this.a.C();
                this.Y(n8);
                int n9 = this.a.d();
                do {
                    m8.i(this.a.o());
                } while (this.a.d() < n9 + n8);
                return;
            }
            do {
                m8.i(this.a.o());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n10 = u0.b(this.b);
        if (n10 != 1) {
            if (n10 != 2) throw B.d();
            n10 = this.a.C();
            this.Y(n10);
            int n11 = this.a.d();
            do {
                m8.add(this.a.o());
            } while (this.a.d() < n11 + n10);
            return;
        }
        do {
            m8.add(this.a.o());
            if (!this.a.e()) continue;
            return;
        } while ((n10 = this.a.B()) == this.b);
        this.d = n10;
    }

    @Override
    public long N() throws IOException {
        this.W(0);
        return this.a.u();
    }

    @Override
    public String O() throws IOException {
        this.W(2);
        return this.a.A();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void P(List<Long> i8) throws IOException {
        if (i8 instanceof I) {
            int n8 = u0.b(this.b);
            if (n8 != 1) {
                if (n8 != 2) throw B.d();
                int n9 = this.a.C();
                this.Y(n9);
                n8 = this.a.d();
                do {
                    i8.k(this.a.r());
                } while (this.a.d() < n8 + n9);
                return;
            }
            do {
                i8.k(this.a.r());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n10 = u0.b(this.b);
        if (n10 != 1) {
            if (n10 != 2) throw B.d();
            int n11 = this.a.C();
            this.Y(n11);
            n10 = this.a.d();
            do {
                i8.add(this.a.r());
            } while (this.a.d() < n10 + n11);
            return;
        }
        do {
            i8.add(this.a.r());
            if (!this.a.e()) continue;
            return;
        } while ((n10 = this.a.B()) == this.b);
        this.d = n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void U(List<String> g8, boolean bl) throws IOException {
        int n8;
        if (u0.b(this.b) != 2) throw B.d();
        if (g8 instanceof G && !bl) {
            int n9;
            do {
                g8.C0(this.G());
                if (this.a.e()) return;
            } while ((n9 = this.a.B()) == this.b);
            this.d = n9;
            return;
        }
        do {
            String string = bl ? this.O() : this.C();
            g8.add(string);
            if (!this.a.e()) continue;
            return;
        } while ((n8 = this.a.B()) == this.b);
        this.d = n8;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public <K, V> void a(Map<K, V> var1_1, K.a<K, V> var2_3, p var3_4) throws IOException {
        block6: {
            block5: {
                this.W(2);
                var4_5 = this.a.C();
                var4_5 = this.a.l(var4_5);
                var7_6 /* !! */  = var2_3.b;
                var8_7 /* !! */  = var2_3.d;
                while ((var5_8 = this.D()) != 0x7FFFFFFF && !(var6_9 = this.a.e())) {
                    if (var5_8 == 1) ** GOTO lbl20
                    if (var5_8 == 2) ** GOTO lbl17
                    if (this.J()) continue;
                    var9_10 = new B("Unable to parse map entry.");
                    throw var9_10;
                }
                break block5;
                {
                    catch (Throwable var1_2) {
                        break block6;
                    }
lbl17:
                    // 1 sources

                    var9_10 = this.R(var2_3.c, var2_3.d.getClass(), var3_4);
                    var8_7 /* !! */  = var9_10;
                    ** GOTO lbl-1000
lbl20:
                    // 1 sources

                    var9_10 = this.R(var2_3.a, null, null);
                    var7_6 /* !! */  = var9_10;
                    ** GOTO lbl-1000
                }
                catch (B.a var9_11) {
                    if (this.J()) ** GOTO lbl-1000
                    var1_1 = new B("Unable to parse map entry.");
                    throw var1_1;
                }
            }
            var1_1.put(var7_6 /* !! */ , var8_7 /* !! */ );
            this.a.k(var4_5);
            return;
        }
        this.a.k(var4_5);
        throw var1_2;
    }

    @Override
    public <T> T b(h0<T> h02, p p8) throws IOException {
        this.W(3);
        return this.S(h02, p8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void c(List<Integer> z8) throws IOException {
        if (z8 instanceof z) {
            int n8 = u0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) throw B.d();
                n8 = this.a.C();
                n8 = this.a.d() + n8;
                do {
                    z8.i(this.a.x());
                } while (this.a.d() < n8);
                this.V(n8);
                return;
            }
            do {
                z8.i(this.a.x());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n9 = u0.b(this.b);
        if (n9 != 0) {
            if (n9 != 2) throw B.d();
            n9 = this.a.C();
            n9 = this.a.d() + n9;
            do {
                z8.add(this.a.x());
            } while (this.a.d() < n9);
            this.V(n9);
            return;
        }
        do {
            z8.add(this.a.x());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public long d() throws IOException {
        this.W(0);
        return this.a.D();
    }

    @Override
    public long e() throws IOException {
        this.W(1);
        return this.a.r();
    }

    @Override
    public <T> T f(h0<T> h02, p p8) throws IOException {
        this.W(2);
        return this.T(h02, p8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void g(List<Integer> z8) throws IOException {
        if (z8 instanceof z) {
            int n8 = u0.b(this.b);
            if (n8 != 2) {
                if (n8 != 5) throw B.d();
                do {
                    z8.i(this.a.v());
                    if (this.a.e()) return;
                } while ((n8 = this.a.B()) == this.b);
                this.d = n8;
                return;
            }
            int n9 = this.a.C();
            this.X(n9);
            n8 = this.a.d();
            do {
                z8.i(this.a.v());
            } while (this.a.d() < n8 + n9);
            return;
        } else {
            int n10 = u0.b(this.b);
            if (n10 != 2) {
                if (n10 != 5) throw B.d();
                do {
                    z8.add(this.a.v());
                    if (this.a.e()) return;
                } while ((n10 = this.a.B()) == this.b);
                this.d = n10;
                return;
            }
            n10 = this.a.C();
            this.X(n10);
            int n11 = this.a.d();
            do {
                z8.add(this.a.v());
            } while (this.a.d() < n11 + n10);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void h(List<Long> i8) throws IOException {
        if (i8 instanceof I) {
            int n8 = u0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) throw B.d();
                n8 = this.a.C();
                n8 = this.a.d() + n8;
                do {
                    i8.k(this.a.y());
                } while (this.a.d() < n8);
                this.V(n8);
                return;
            }
            do {
                i8.k(this.a.y());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n9 = u0.b(this.b);
        if (n9 != 0) {
            if (n9 != 2) throw B.d();
            n9 = this.a.C();
            n9 = this.a.d() + n9;
            do {
                i8.add(this.a.y());
            } while (this.a.d() < n9);
            this.V(n9);
            return;
        }
        do {
            i8.add(this.a.y());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void i(List<Integer> z8) throws IOException {
        if (z8 instanceof z) {
            int n8 = u0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) throw B.d();
                n8 = this.a.C();
                n8 = this.a.d() + n8;
                do {
                    z8.i(this.a.C());
                } while (this.a.d() < n8);
                this.V(n8);
                return;
            }
            do {
                z8.i(this.a.C());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n9 = u0.b(this.b);
        if (n9 != 0) {
            if (n9 != 2) throw B.d();
            n9 = this.a.C();
            n9 = this.a.d() + n9;
            do {
                z8.add(this.a.C());
            } while (this.a.d() < n9);
            this.V(n9);
            return;
        }
        do {
            z8.add(this.a.C());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public <T> void j(List<T> list, h0<T> h02, p p8) throws IOException {
        if (u0.b(this.b) == 3) {
            block2: {
                int n8;
                int n9 = this.b;
                do {
                    list.add(this.S(h02, p8));
                    if (this.a.e() || this.d != 0) break block2;
                } while ((n8 = this.a.B()) == n9);
                this.d = n8;
            }
            return;
        }
        throw B.d();
    }

    @Override
    public int k() throws IOException {
        this.W(5);
        return this.a.q();
    }

    @Override
    public int l() {
        return this.b;
    }

    @Override
    public boolean m() throws IOException {
        this.W(0);
        return this.a.m();
    }

    @Override
    public long n() throws IOException {
        this.W(1);
        return this.a.w();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void o(List<Long> i8) throws IOException {
        if (i8 instanceof I) {
            int n8 = u0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) throw B.d();
                n8 = this.a.C();
                n8 = this.a.d() + n8;
                do {
                    i8.k(this.a.D());
                } while (this.a.d() < n8);
                this.V(n8);
                return;
            }
            do {
                i8.k(this.a.D());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n9 = u0.b(this.b);
        if (n9 != 0) {
            if (n9 != 2) throw B.d();
            n9 = this.a.C();
            n9 = this.a.d() + n9;
            do {
                i8.add(this.a.D());
            } while (this.a.d() < n9);
            this.V(n9);
            return;
        }
        do {
            i8.add(this.a.D());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public int p() throws IOException {
        this.W(0);
        return this.a.C();
    }

    @Override
    public <T> T q(Class<T> clazz, p p8) throws IOException {
        this.W(3);
        return this.S(d0.a().d(clazz), p8);
    }

    @Override
    public <T> void r(List<T> list, h0<T> h02, p p8) throws IOException {
        if (u0.b(this.b) == 2) {
            block2: {
                int n8;
                int n9 = this.b;
                do {
                    list.add(this.T(h02, p8));
                    if (this.a.e() || this.d != 0) break block2;
                } while ((n8 = this.a.B()) == n9);
                this.d = n8;
            }
            return;
        }
        throw B.d();
    }

    @Override
    public double readDouble() throws IOException {
        this.W(1);
        return this.a.o();
    }

    @Override
    public float readFloat() throws IOException {
        this.W(5);
        return this.a.s();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void s(List<Long> i8) throws IOException {
        if (i8 instanceof I) {
            int n8 = u0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) throw B.d();
                n8 = this.a.C();
                n8 = this.a.d() + n8;
                do {
                    i8.k(this.a.u());
                } while (this.a.d() < n8);
                this.V(n8);
                return;
            }
            do {
                i8.k(this.a.u());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n9 = u0.b(this.b);
        if (n9 != 0) {
            if (n9 != 2) throw B.d();
            n9 = this.a.C();
            n9 = this.a.d() + n9;
            do {
                i8.add(this.a.u());
            } while (this.a.d() < n9);
            this.V(n9);
            return;
        }
        do {
            i8.add(this.a.u());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void t(List<Long> i8) throws IOException {
        if (i8 instanceof I) {
            int n8 = u0.b(this.b);
            if (n8 != 1) {
                if (n8 != 2) throw B.d();
                int n9 = this.a.C();
                this.Y(n9);
                n8 = this.a.d();
                do {
                    i8.k(this.a.w());
                } while (this.a.d() < n8 + n9);
                return;
            }
            do {
                i8.k(this.a.w());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n10 = u0.b(this.b);
        if (n10 != 1) {
            if (n10 != 2) throw B.d();
            n10 = this.a.C();
            this.Y(n10);
            int n11 = this.a.d();
            do {
                i8.add(this.a.w());
            } while (this.a.d() < n11 + n10);
            return;
        }
        do {
            i8.add(this.a.w());
            if (!this.a.e()) continue;
            return;
        } while ((n10 = this.a.B()) == this.b);
        this.d = n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void u(List<Integer> z8) throws IOException {
        if (z8 instanceof z) {
            int n8 = u0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) throw B.d();
                n8 = this.a.C();
                n8 = this.a.d() + n8;
                do {
                    z8.i(this.a.t());
                } while (this.a.d() < n8);
                this.V(n8);
                return;
            }
            do {
                z8.i(this.a.t());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n9 = u0.b(this.b);
        if (n9 != 0) {
            if (n9 != 2) throw B.d();
            n9 = this.a.C();
            n9 = this.a.d() + n9;
            do {
                z8.add(this.a.t());
            } while (this.a.d() < n9);
            this.V(n9);
            return;
        }
        do {
            z8.add(this.a.t());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void v(List<Integer> z8) throws IOException {
        if (z8 instanceof z) {
            int n8 = u0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) throw B.d();
                n8 = this.a.C();
                n8 = this.a.d() + n8;
                do {
                    z8.i(this.a.p());
                } while (this.a.d() < n8);
                this.V(n8);
                return;
            }
            do {
                z8.i(this.a.p());
                if (this.a.e()) return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n9 = u0.b(this.b);
        if (n9 != 0) {
            if (n9 != 2) throw B.d();
            n9 = this.a.C();
            n9 = this.a.d() + n9;
            do {
                z8.add(this.a.p());
            } while (this.a.d() < n9);
            this.V(n9);
            return;
        }
        do {
            z8.add(this.a.p());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public int w() throws IOException {
        this.W(0);
        return this.a.p();
    }

    @Override
    public <T> T x(Class<T> clazz, p p8) throws IOException {
        this.W(2);
        return this.T(d0.a().d(clazz), p8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void y(List<Integer> z8) throws IOException {
        if (z8 instanceof z) {
            int n8 = u0.b(this.b);
            if (n8 != 2) {
                if (n8 != 5) throw B.d();
                do {
                    z8.i(this.a.q());
                    if (this.a.e()) return;
                } while ((n8 = this.a.B()) == this.b);
                this.d = n8;
                return;
            }
            int n9 = this.a.C();
            this.X(n9);
            n8 = this.a.d();
            do {
                z8.i(this.a.q());
            } while (this.a.d() < n8 + n9);
            return;
        } else {
            int n10 = u0.b(this.b);
            if (n10 != 2) {
                if (n10 != 5) throw B.d();
                do {
                    z8.add(this.a.q());
                    if (this.a.e()) return;
                } while ((n10 = this.a.B()) == this.b);
                this.d = n10;
                return;
            }
            n10 = this.a.C();
            this.X(n10);
            int n11 = this.a.d();
            do {
                z8.add(this.a.q());
            } while (this.a.d() < n11 + n10);
        }
    }

    @Override
    public int z() throws IOException {
        this.W(0);
        return this.a.x();
    }
}

