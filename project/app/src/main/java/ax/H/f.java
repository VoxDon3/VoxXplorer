/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.H.a;
import ax.H.b;
import ax.H.c;
import ax.H.d;
import ax.H.e;
import ax.H.h;
import ax.H.k;
import ax.H.l;
import ax.H.m;
import ax.I.b;
import ax.I.i;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class f
extends m {
    ax.I.b M0 = new ax.I.b(this);
    public ax.I.e N0 = new ax.I.e(this);
    private int O0;
    protected b.b P0 = null;
    private boolean Q0 = false;
    protected ax.E.d R0 = new ax.E.d();
    int S0;
    int T0;
    int U0;
    int V0;
    public int W0 = 0;
    public int X0 = 0;
    c[] Y0 = new c[4];
    c[] Z0 = new c[4];
    public boolean a1 = false;
    public boolean b1 = false;
    public boolean c1 = false;
    public int d1 = 0;
    public int e1 = 0;
    private int f1 = 257;
    public boolean g1 = false;
    private boolean h1 = false;
    private boolean i1 = false;
    int j1 = 0;
    private WeakReference<d> k1 = null;
    private WeakReference<d> l1 = null;
    private WeakReference<d> m1 = null;
    private WeakReference<d> n1 = null;
    HashSet<e> o1 = new HashSet();
    public b.a p1 = new b.a();

    private void A1(d object, ax.E.i i8) {
        object = this.R0.q(object);
        this.R0.h(i8, (ax.E.i)object, 0, 5);
    }

    private void B1(d object, ax.E.i i8) {
        object = this.R0.q(object);
        this.R0.h((ax.E.i)object, i8, 0, 5);
    }

    private void C1(e e8) {
        int n8 = this.X0;
        c[] cArray = this.Y0;
        if (n8 + 1 >= cArray.length) {
            this.Y0 = Arrays.copyOf(cArray, cArray.length * 2);
        }
        this.Y0[this.X0] = new c(e8, 1, this.P1());
        ++this.X0;
    }

    public static boolean S1(int n8, e e8, b.b b8, b.a a8, int n9) {
        if (b8 == null) {
            return false;
        }
        if (e8.V() != 8 && !(e8 instanceof h) && !(e8 instanceof a)) {
            a8.a = e8.A();
            a8.b = e8.T();
            a8.c = e8.W();
            a8.d = e8.x();
            a8.i = false;
            a8.j = n9;
            e.b b9 = a8.a;
            e.b b10 = e.b.d0;
            n9 = b9 == b10 ? 1 : 0;
            n8 = a8.b == b10 ? 1 : 0;
            boolean bl = n9 != 0 && e8.d0 > 0.0f;
            boolean bl2 = n8 != 0 && e8.d0 > 0.0f;
            int n10 = n9;
            if (n9 != 0) {
                n10 = n9;
                if (e8.a0(0)) {
                    n10 = n9;
                    if (e8.w == 0) {
                        n10 = n9;
                        if (!bl) {
                            a8.a = e.b.c0;
                            if (n8 != 0 && e8.x == 0) {
                                a8.a = e.b.q;
                            }
                            n10 = 0;
                        }
                    }
                }
            }
            n9 = n8;
            if (n8 != 0) {
                n9 = n8;
                if (e8.a0(1)) {
                    n9 = n8;
                    if (e8.x == 0) {
                        n9 = n8;
                        if (!bl2) {
                            a8.b = e.b.c0;
                            if (n10 != 0 && e8.w == 0) {
                                a8.b = e.b.q;
                            }
                            n9 = 0;
                        }
                    }
                }
            }
            if (e8.n0()) {
                a8.a = e.b.q;
                n10 = 0;
            }
            if (e8.o0()) {
                a8.b = e.b.q;
                n9 = 0;
            }
            if (bl) {
                if (e8.y[0] == 4) {
                    a8.a = e.b.q;
                } else if (n9 == 0) {
                    b9 = a8.b;
                    b10 = e.b.q;
                    if (b9 == b10) {
                        n8 = a8.d;
                    } else {
                        a8.a = e.b.c0;
                        b8.a(e8, a8);
                        n8 = a8.f;
                    }
                    a8.a = b10;
                    a8.c = (int)(e8.v() * (float)n8);
                }
            }
            if (bl2) {
                if (e8.y[1] == 4) {
                    a8.b = e.b.q;
                } else if (n10 == 0) {
                    b9 = a8.a;
                    b10 = e.b.q;
                    if (b9 == b10) {
                        n8 = a8.c;
                    } else {
                        a8.b = e.b.c0;
                        b8.a(e8, a8);
                        n8 = a8.e;
                    }
                    a8.b = b10;
                    a8.d = e8.w() == -1 ? (int)((float)n8 / e8.v()) : (int)(e8.v() * (float)n8);
                }
            }
            b8.a(e8, a8);
            e8.k1(a8.e);
            e8.L0(a8.f);
            e8.K0(a8.h);
            e8.A0(a8.g);
            a8.j = b.a.k;
            return a8.i;
        }
        a8.e = 0;
        a8.f = 0;
        return false;
    }

    private void U1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void x1(e e8) {
        int n8 = this.W0;
        c[] cArray = this.Z0;
        if (n8 + 1 >= cArray.length) {
            this.Z0 = Arrays.copyOf(cArray, cArray.length * 2);
        }
        this.Z0[this.W0] = new c(e8, 0, this.P1());
        ++this.W0;
    }

    void D1(d d8) {
        WeakReference<d> weakReference = this.m1;
        if (weakReference != null && weakReference.get() != null && d8.e() <= ((d)this.m1.get()).e()) {
            return;
        }
        this.m1 = new WeakReference<d>(d8);
    }

    void E1(d d8) {
        WeakReference<d> weakReference = this.k1;
        if (weakReference != null && weakReference.get() != null && d8.e() <= ((d)this.k1.get()).e()) {
            return;
        }
        this.k1 = new WeakReference<d>(d8);
    }

    public boolean F1(boolean bl) {
        return this.N0.f(bl);
    }

    public boolean G1(boolean bl) {
        return this.N0.g(bl);
    }

    public boolean H1(boolean bl, int n8) {
        return this.N0.h(bl, n8);
    }

    public b.b I1() {
        return this.P0;
    }

    public int J1() {
        return this.f1;
    }

    public ax.E.d K1() {
        return this.R0;
    }

    public boolean L1() {
        return false;
    }

    public void M1() {
        this.N0.j();
    }

    public void N1() {
        this.N0.k();
    }

    @Override
    public void O(StringBuilder stringBuilder) {
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append(this.o);
        ((StringBuilder)serializable).append(":{\n");
        stringBuilder.append(((StringBuilder)serializable).toString());
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("  actualWidth:");
        ((StringBuilder)serializable).append(this.b0);
        stringBuilder.append(((StringBuilder)serializable).toString());
        stringBuilder.append("\n");
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("  actualHeight:");
        ((StringBuilder)serializable).append(this.c0);
        stringBuilder.append(((StringBuilder)serializable).toString());
        stringBuilder.append("\n");
        serializable = this.r1();
        int n8 = ((ArrayList)serializable).size();
        for (int i8 = 0; i8 < n8; ++i8) {
            Object e8 = ((ArrayList)serializable).get(i8);
            ((e)e8).O(stringBuilder);
            stringBuilder.append(",\n");
        }
        stringBuilder.append("}");
    }

    public boolean O1() {
        return this.i1;
    }

    public boolean P1() {
        return this.Q0;
    }

    public boolean Q1() {
        return this.h1;
    }

    public long R1(int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16) {
        this.S0 = n15;
        this.T0 = n16;
        return this.M0.d(this, n8, n15, n16, n9, n10, n11, n12, n13, n14);
    }

    public boolean T1(int n8) {
        return (this.f1 & n8) == n8;
    }

    public void V1(b.b b8) {
        this.P0 = b8;
        this.N0.n(b8);
    }

    public void W1(int n8) {
        this.f1 = n8;
        ax.E.d.r = this.T1(512);
    }

    public void X1(int n8) {
        this.O0 = n8;
    }

    public void Y1(boolean bl) {
        this.Q0 = bl;
    }

    public boolean Z1(ax.E.d d8, boolean[] object) {
        object[2] = false;
        boolean bl = this.T1(64);
        this.q1(d8, bl);
        int n8 = this.L0.size();
        boolean bl2 = false;
        for (int i8 = 0; i8 < n8; ++i8) {
            object = this.L0.get(i8);
            ((e)object).q1(d8, bl);
            if (!((e)object).c0()) continue;
            bl2 = true;
        }
        return bl2;
    }

    public void a2() {
        this.M0.e(this);
    }

    @Override
    public void p1(boolean bl, boolean bl2) {
        super.p1(bl, bl2);
        int n8 = this.L0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.L0.get(i8).p1(bl, bl2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void s1() {
        block45: {
            block44: {
                block46: {
                    block43: {
                        this.f0 = 0;
                        this.g0 = 0;
                        this.h1 = false;
                        this.i1 = false;
                        var9_1 = this.L0.size();
                        var2_2 = Math.max(0, this.W());
                        var3_3 = Math.max(0, this.x());
                        var13_4 /* !! */  = this.Z;
                        var14_9 = var13_4 /* !! */ [1];
                        var15_10 = var13_4 /* !! */ [0];
                        if (this.O0 == 0 && k.b(this.f1, 1)) {
                            ax.I.h.h(this, this.I1());
                            for (var1_11 = 0; var1_11 < var9_1; ++var1_11) {
                                var13_4 /* !! */  = this.L0.get(var1_11);
                                if (!var13_4 /* !! */ .m0() || var13_4 /* !! */  instanceof h || var13_4 /* !! */  instanceof a || var13_4 /* !! */  instanceof l || var13_4 /* !! */ .l0()) continue;
                                var17_13 /* !! */  = var13_4 /* !! */ .u(0);
                                var18_14 = var13_4 /* !! */ .u(1);
                                var16_12 /* !! */  = e.b.d0;
                                if (var17_13 /* !! */  == var16_12 /* !! */  && var13_4 /* !! */ .w != 1 && var18_14 == var16_12 /* !! */  && var13_4 /* !! */ .x != 1) continue;
                                var16_12 /* !! */  = new b.a();
                                ax.H.f.S1(0, (e)var13_4 /* !! */ , this.P0, var16_12 /* !! */ , b.a.k);
                            }
                        }
                        if (var9_1 > 2 && (var15_10 == (var13_4 /* !! */  = e.b.c0) || var14_9 == var13_4 /* !! */ ) && k.b(this.f1, 1024) && i.c(this, this.I1())) {
                            var1_11 = var2_2;
                            if (var15_10 == var13_4 /* !! */ ) {
                                if (var2_2 < this.W() && var2_2 > 0) {
                                    this.k1(var2_2);
                                    this.h1 = true;
                                    var1_11 = var2_2;
                                } else {
                                    var1_11 = this.W();
                                }
                            }
                            var2_2 = var3_3;
                            if (var14_9 == var13_4 /* !! */ ) {
                                if (var3_3 < this.x() && var3_3 > 0) {
                                    this.L0(var3_3);
                                    this.i1 = true;
                                    var2_2 = var3_3;
                                } else {
                                    var2_2 = this.x();
                                }
                            }
                            var4_15 = var1_11;
                            var1_11 = 1;
                            var3_3 = var2_2;
                        } else {
                            var1_11 = 0;
                            var4_15 = var2_2;
                        }
                        var2_2 = !this.T1(64) && !this.T1(128) ? 0 : 1;
                        var13_4 /* !! */  = this.R0;
                        var13_4 /* !! */ .h = false;
                        var13_4 /* !! */ .i = false;
                        if (this.f1 != 0 && var2_2 != 0) {
                            var13_4 /* !! */ .i = true;
                        }
                        var16_12 /* !! */  = this.L0;
                        var17_13 /* !! */  = this.A();
                        var5_16 = var17_13 /* !! */  == (var13_4 /* !! */  = e.b.c0) || this.T() == var13_4 /* !! */ ;
                        this.U1();
                        for (var2_2 = 0; var2_2 < var9_1; ++var2_2) {
                            var13_4 /* !! */  = this.L0.get(var2_2);
                            if (!(var13_4 /* !! */  instanceof m)) continue;
                            ((m)var13_4 /* !! */ ).s1();
                        }
                        var12_17 = this.T1(64);
                        var2_2 = 0;
                        var10_18 = true;
                        block11: while (var10_18) {
                            var8_21 = var2_2 + 1;
                            try {
                                this.R0.D();
                                this.U1();
                                this.m(this.R0);
                                var2_2 = 0;
                            }
                            catch (Exception var13_8) {}
lbl72:
                            // 2 sources

                            while (var2_2 < var9_1) {
                                var13_4 /* !! */  = this.L0.get(var2_2);
                                var11_22 = var10_18;
                                break block43;
                            }
                            break block44;
lbl79:
                            // 4 sources

                            while (true) {
                                var13_4 /* !! */ .printStackTrace();
                                var17_13 /* !! */  = System.out;
                                var18_14 = new StringBuilder();
                                var18_14.append("EXCEPTION : ");
                                var18_14.append(var13_4 /* !! */ );
                                var17_13 /* !! */ .println(var18_14.toString());
                                var11_22 = var10_18;
lbl89:
                                // 3 sources

                                while (true) {
                                    if (var11_22) {
                                        var10_18 = this.Z1(this.R0, k.a);
                                    } else {
                                        this.q1(this.R0, var12_17);
                                        for (var2_2 = 0; var2_2 < var9_1; ++var2_2) {
                                            this.L0.get(var2_2).q1(this.R0, var12_17);
                                        }
                                        var10_18 = false;
                                    }
                                    if (var5_16 && var8_21 < 8 && k.a[2]) {
                                        var7_20 = 0;
                                        var2_2 = 0;
                                        for (var6_19 = 0; var6_19 < var9_1; ++var6_19) {
                                            var13_4 /* !! */  = this.L0.get(var6_19);
                                            var7_20 = Math.max(var7_20, var13_4 /* !! */ .f0 + var13_4 /* !! */ .W());
                                            var2_2 = Math.max(var2_2, var13_4 /* !! */ .g0 + var13_4 /* !! */ .x());
                                        }
                                        var7_20 = Math.max(this.m0, var7_20);
                                        var6_19 = Math.max(this.n0, var2_2);
                                        var13_4 /* !! */  = e.b.c0;
                                        var2_2 = var1_11;
                                        var11_22 = var10_18;
                                        if (var15_10 == var13_4 /* !! */ ) {
                                            var2_2 = var1_11;
                                            var11_22 = var10_18;
                                            if (this.W() < var7_20) {
                                                this.k1(var7_20);
                                                this.Z[0] = var13_4 /* !! */ ;
                                                var2_2 = 1;
                                                var11_22 = true;
                                            }
                                        }
                                        var1_11 = var2_2;
                                        var10_18 = var11_22;
                                        if (var14_9 == var13_4 /* !! */ ) {
                                            var1_11 = var2_2;
                                            var10_18 = var11_22;
                                            if (this.x() < var6_19) {
                                                this.L0(var6_19);
                                                this.Z[1] = var13_4 /* !! */ ;
                                                var1_11 = 1;
                                                var10_18 = true;
                                            }
                                        }
                                    }
                                    if ((var2_2 = Math.max(this.m0, this.W())) > this.W()) {
                                        this.k1(var2_2);
                                        this.Z[0] = e.b.q;
                                        var1_11 = 1;
                                        var10_18 = true;
                                    }
                                    if ((var2_2 = Math.max(this.n0, this.x())) > this.x()) {
                                        this.L0(var2_2);
                                        this.Z[1] = e.b.q;
                                        var1_11 = 1;
                                        var10_18 = true;
                                    }
                                    var2_2 = var1_11;
                                    var11_22 = var10_18;
                                    if (var1_11 != 0) ** GOTO lbl-1000
                                    var13_4 /* !! */  = this.Z[0];
                                    var17_13 /* !! */  = e.b.c0;
                                    if (var13_4 /* !! */  == var17_13 /* !! */  && var4_15 > 0 && this.W() > var4_15) {
                                        this.h1 = true;
                                        this.Z[0] = e.b.q;
                                        this.k1(var4_15);
                                        var1_11 = 1;
                                        var10_18 = true;
                                    }
                                    var2_2 = var1_11;
                                    var11_22 = var10_18;
                                    if (this.Z[1] != var17_13 /* !! */ ) ** GOTO lbl-1000
                                    var2_2 = var1_11;
                                    var11_22 = var10_18;
                                    if (var3_3 <= 0) ** GOTO lbl-1000
                                    var2_2 = var1_11;
                                    var11_22 = var10_18;
                                    if (this.x() > var3_3) {
                                        this.i1 = true;
                                        this.Z[1] = e.b.q;
                                        this.L0(var3_3);
                                        var1_11 = 1;
                                        var11_22 = true;
                                    } else lbl-1000:
                                    // 4 sources

                                    {
                                        var1_11 = var2_2;
                                    }
                                    var10_18 = var8_21 > 8 ? false : var11_22;
                                    var2_2 = var8_21;
                                    continue block11;
                                    break;
                                }
                                break;
                            }
                        }
                        this.L0 = var16_12 /* !! */ ;
                        if (var1_11 != 0) {
                            var13_4 /* !! */  = this.Z;
                            var13_4 /* !! */ [0] = var15_10;
                            var13_4 /* !! */ [1] = var14_9;
                        }
                        this.w0(this.R0.v());
                        return;
                    }
                    try {}
                    catch (Exception var13_5) {
                        var10_18 = var11_22;
                        ** GOTO lbl79
                    }
                    break block46;
                    catch (Exception var13_6) {
                        ** GOTO lbl79
                    }
                }
                var13_4 /* !! */ .m(this.R0);
                ++var2_2;
                ** GOTO lbl72
            }
            var11_22 = var10_18;
            {
                var11_22 = var10_18 = this.w1(this.R0);
                var13_4 /* !! */  = this.k1;
                if (var13_4 /* !! */  == null) break block45;
                var11_22 = var10_18;
                if (var13_4 /* !! */ .get() == null) break block45;
                var11_22 = var10_18;
                var13_4 /* !! */  = (d)this.k1.get();
                var11_22 = var10_18;
                var17_13 /* !! */  = this.R0;
            }
            try {
                this.B1((d)var13_4 /* !! */ , var17_13 /* !! */ .q(this.P));
                this.k1 = null;
            }
            catch (Exception var13_7) {
                ** continue;
            }
        }
        if ((var13_4 /* !! */  = this.m1) != null && var13_4 /* !! */ .get() != null) {
            this.A1((d)this.m1.get(), this.R0.q(this.R));
            this.m1 = null;
        }
        if ((var13_4 /* !! */  = this.l1) != null && var13_4 /* !! */ .get() != null) {
            this.B1((d)this.l1.get(), this.R0.q(this.O));
            this.l1 = null;
        }
        if ((var13_4 /* !! */  = this.n1) != null && var13_4 /* !! */ .get() != null) {
            this.A1((d)this.n1.get(), this.R0.q(this.Q));
            this.n1 = null;
        }
        var11_22 = var10_18;
        if (!var10_18) ** GOTO lbl89
        this.R0.z();
        var11_22 = var10_18;
        ** while (true)
    }

    @Override
    public void t0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.g1 = false;
        super.t0();
    }

    void v1(e e8, int n8) {
        if (n8 == 0) {
            this.x1(e8);
            return;
        }
        if (n8 == 1) {
            this.C1(e8);
        }
    }

    public boolean w1(ax.E.d d8) {
        Object object2;
        int n8;
        boolean bl = this.T1(64);
        this.g(d8, bl);
        int n9 = this.L0.size();
        boolean bl2 = false;
        for (n8 = 0; n8 < n9; ++n8) {
            e object22 = this.L0.get(n8);
            object22.S0(0, false);
            object22.S0(1, false);
            if (!(object22 instanceof a)) continue;
            bl2 = true;
        }
        if (bl2) {
            for (n8 = 0; n8 < n9; ++n8) {
                e e8 = this.L0.get(n8);
                if (!(e8 instanceof a)) continue;
                ((a)e8).y1();
            }
        }
        this.o1.clear();
        for (n8 = 0; n8 < n9; ++n8) {
            e e9 = this.L0.get(n8);
            if (!e9.f()) continue;
            if (e9 instanceof l) {
                this.o1.add(e9);
                continue;
            }
            e9.g(d8, bl);
        }
        while (this.o1.size() > 0) {
            n8 = this.o1.size();
            for (l l8 : this.o1) {
                if (!l8.v1(this.o1)) continue;
                l8.g(d8, bl);
                this.o1.remove(l8);
                break;
            }
            if (n8 != this.o1.size()) continue;
            Iterator<e> iterator = this.o1.iterator();
            while (iterator.hasNext()) {
                iterator.next().g(d8, bl);
            }
            this.o1.clear();
        }
        if (ax.E.d.r) {
            HashSet<e> hashSet = new HashSet<e>();
            for (n8 = 0; n8 < n9; ++n8) {
                object2 = this.L0.get(n8);
                if (((e)object2).f()) continue;
                hashSet.add((e)object2);
            }
            n8 = this.A() == e.b.c0 ? 0 : 1;
            this.e(this, d8, hashSet, n8, false);
            for (Object object2 : hashSet) {
                k.a(this, d8, (e)object2);
                ((e)object2).g(d8, bl);
            }
        } else {
            for (n8 = 0; n8 < n9; ++n8) {
                object2 = this.L0.get(n8);
                if (object2 instanceof f) {
                    Object object3 = ((e)object2).Z;
                    e.b b8 = object3[0];
                    e.b b9 = object3[1];
                    object3 = e.b.c0;
                    if (b8 == object3) {
                        ((e)object2).P0(e.b.q);
                    }
                    if (b9 == object3) {
                        ((e)object2).g1(e.b.q);
                    }
                    ((e)object2).g(d8, bl);
                    if (b8 == object3) {
                        ((e)object2).P0(b8);
                    }
                    if (b9 != object3) continue;
                    ((e)object2).g1(b9);
                    continue;
                }
                k.a(this, d8, (e)object2);
                if (((e)object2).f()) continue;
                ((e)object2).g(d8, bl);
            }
        }
        if (this.W0 > 0) {
            ax.H.b.b(this, d8, null, 0);
        }
        if (this.X0 > 0) {
            ax.H.b.b(this, d8, null, 1);
        }
        return true;
    }

    public void y1(d d8) {
        WeakReference<d> weakReference = this.n1;
        if (weakReference != null && weakReference.get() != null && d8.e() <= ((d)this.n1.get()).e()) {
            return;
        }
        this.n1 = new WeakReference<d>(d8);
    }

    public void z1(d d8) {
        WeakReference<d> weakReference = this.l1;
        if (weakReference != null && weakReference.get() != null && d8.e() <= ((d)this.l1.get()).e()) {
            return;
        }
        this.l1 = new WeakReference<d>(d8);
    }
}

