/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.os.Bundle;
import android.text.TextUtils;
import ax.Q2.a;
import ax.W2.g;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.W2.w;
import ax.a3.K;
import ax.c3.B;
import ax.c3.G;
import ax.c3.K;
import ax.c3.U;
import ax.c3.b0;
import ax.c3.d0;
import ax.c3.x;
import ax.u3.q;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class f
extends j {
    private static final Logger J = ax.Q2.g.a(f.class);
    private d A;
    private String B;
    private n C;
    private boolean D;
    private j.f E;
    private ax.a3.K F;
    private List<g> G;
    private g H;
    private ax.B.b<String> I = new ax.B.b();
    private LinkedList<g> w;
    private n x;
    private o y;
    private c z;

    public f(h.a a8, List<g> list, o o8, n n8) {
        super(a8);
        this.G = list;
        this.y = o8;
        this.x = n8;
        o8.n0();
        this.h(this.y.T());
    }

    static /* synthetic */ d C0(f f8, d d8) {
        f8.A = d8;
        return d8;
    }

    static /* synthetic */ g E0(f f8, g g8) {
        f8.H = g8;
        return g8;
    }

    static /* synthetic */ n G0(f f8, n n8) {
        f8.C = n8;
        return n8;
    }

    static /* synthetic */ ax.B.b I0(f f8) {
        return f8.I;
    }

    static /* synthetic */ LinkedList K0(f f8, LinkedList linkedList) {
        f8.w = linkedList;
        return linkedList;
    }

    private String N0(g g8) {
        String string = this.x.E();
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return d0.Q(string, g8.h());
        }
        throw new IllegalArgumentException();
    }

    private void O0() {
        LinkedList<g> linkedList = this.w;
        if (linkedList != null && !linkedList.isEmpty()) {
            this.A = linkedList = new d(this);
            ((q)((Object)linkedList)).i(new Void[0]);
            return;
        }
        this.l0(true);
        if (this.w().O() != this.w().z()) {
            Logger logger = J;
            linkedList = new StringBuilder();
            ((StringBuilder)((Object)linkedList)).append("Total : ");
            ((StringBuilder)((Object)linkedList)).append(this.w().O());
            ((StringBuilder)((Object)linkedList)).append(" != Progress : ");
            ((StringBuilder)((Object)linkedList)).append(this.w().z());
            logger.severe(((StringBuilder)((Object)linkedList)).toString());
        }
        this.o();
    }

    private void P0(int n8) {
        this.F = new ax.a3.K();
        Bundle bundle = new Bundle();
        bundle.putString("progressTypeString", this.C());
        bundle.putString("fileName", this.C.B());
        bundle.putBoolean("isDirectory", false);
        bundle.putInt("errCode", n8);
        bundle.putBoolean("applyToAll", true);
        bundle.putBoolean("directoryRename", false);
        this.F.v2(bundle);
        this.F.v3(new K.i(this){
            final f a;
            {
                this.a = f8;
            }

            @Override
            public void a(j.f f8, boolean bl) {
                f.x0(this.a, bl);
                f.z0(this.a, f8);
                f.C0(this.a, new d(this.a, true, f8));
                this.a.A.i(new Void[0]);
            }
        });
        this.q().K(this, this.F);
    }

    static /* synthetic */ boolean x0(f f8, boolean bl) {
        f8.D = bl;
        return bl;
    }

    static /* synthetic */ j.f z0(f f8, j.f f9) {
        f8.E = f9;
        return f9;
    }

    @Override
    public String A() {
        return this.L();
    }

    @Override
    public int B() {
        return 12;
    }

    @Override
    public String C() {
        return this.r().getString(2131952512);
    }

    @Override
    public String F() {
        int n8 = ax.W2.f$b.a[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getResources().getString(2131951754);
            }
            return this.r().getResources().getString(2131952328);
        }
        if (this.w().H() == 0 && this.w().M() != 0) {
            return "";
        }
        n8 = this.G.size();
        if (n8 == 1) {
            String string = this.G.get(0).h();
            return this.r().getResources().getString(2131952327, new Object[]{string, this.x.E()});
        }
        return this.r().getResources().getQuantityString(2131820552, n8, new Object[]{n8, this.x.E()});
    }

    @Override
    public String G() {
        if (ax.W2.f$b.a[this.D().ordinal()] != 2) {
            return "";
        }
        boolean bl = this.y.S() == ax.Q2.f.p0;
        return this.v(bl);
    }

    @Override
    public K H() {
        return null;
    }

    @Override
    public String J() {
        g g8 = this.H;
        if (g8 == null) {
            return "";
        }
        return g8.p();
    }

    @Override
    public K K() {
        n n8 = this.C;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String M() {
        n n8 = this.C;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    protected boolean P() {
        return this.y.Y();
    }

    @Override
    protected void W() {
        ax.a3.K k8 = this.F;
        if (k8 != null && k8.X0()) {
            if (this.F.e1()) {
                this.F.N2();
                return;
            }
            this.F.u3(true);
        }
    }

    @Override
    protected boolean X() {
        boolean bl;
        if (this.S(this.z)) {
            this.z.e();
            bl = true;
        } else {
            bl = false;
        }
        if (this.S(this.A)) {
            this.A.e();
            return true;
        }
        return bl;
    }

    @Override
    protected void Y() {
        if (this.y.Y()) {
            this.w().T(v.a.c0);
            this.y.n(this.x());
        }
    }

    @Override
    protected void Z() {
        if (this.x != null) {
            ax.W2.w.c().g(this.x.R(), this.x.E(), this.I);
        }
        int n8 = this.w().H();
        int n9 = this.w().C();
        if (this.w().M() == n8 + n9) {
            this.t0(h.b.c0);
            return;
        }
        this.t0(h.b.d0);
    }

    @Override
    public void c0() {
        c c8;
        this.j0();
        this.B = this.x.P().I();
        this.z = c8 = new c(this);
        c8.i(new Void[0]);
    }

    @Override
    public void k() {
        Iterator<g> iterator = this.G.iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
        this.y.k0(true);
    }

    @Override
    public void n0() {
        String string = a.c.a(this.D());
        ax.Q2.a.i().m("command", "file_save").c("result", string).c("tgt", this.B).d(this.w().x()).e();
    }

    private class c
    extends q<Void, Void, Void> {
        final f h;

        public c(f f8) {
            this.h = f8;
            super(q.e.f0);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Void w(Void ... object) {
            f.K0(this.h, new LinkedList());
            try {
                Iterator iterator = this.h.G.iterator();
                while (iterator.hasNext()) {
                    object = (g)iterator.next();
                    if (this.isCancelled()) {
                        object = new ax.b3.a();
                        throw object;
                    }
                    this.h.w.offer(object);
                    long l8 = ((g)object).i();
                    if (l8 == -1L) {
                        this.h.w().a0(true);
                    }
                    this.h.w().h(l8);
                    this.h.w().g(1);
                }
                return null;
            }
            catch (ax.b3.a a8) {
                return null;
            }
        }

        protected void x(Void void_) {
            this.h.g0();
        }

        protected void y(Void void_) {
            this.h.k0();
            this.h.O0();
        }
    }

    private class d
    extends q<Void, Void, Integer> {
        boolean h;
        j.f i;
        final f j;

        public d(f f8) {
            this(f8, false, j.f.q);
        }

        public d(f f8, boolean bl, j.f f9) {
            this.j = f8;
            super(q.e.f0);
            this.h = bl;
            this.i = f9;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void A(boolean var1_1, ax.u3.c var2_2) {
            block22: {
                block25: {
                    block24: {
                        block23: {
                            block28: {
                                block27: {
                                    block26: {
                                        var11_8 = null;
                                        var9_9 = null;
                                        var7_10 = null;
                                        var8_11 = null;
                                        var6_12 = null;
                                        var10_18 = null;
                                        if (!var1_1) break block26;
                                        var5_19 = var10_18;
                                        try {
                                            var12_22 = this.j;
                                            var5_19 = var10_18;
                                            f.G0((f)var12_22, f.H0((f)var12_22).X(f.F0(this.j), false));
                                        }
                                        catch (Throwable var2_3) {
                                            break block22;
                                        }
                                        catch (ax.b3.a var2_4) {
                                            var2_2 = var9_9;
                                            break block23;
                                        }
                                        catch (ax.b3.j var6_13) {
                                            var2_2 = var7_10;
                                            break block24;
                                        }
                                        catch (IOException var5_20) {
                                            var2_2 = var8_11;
                                            var6_12 = var5_20;
                                            ** GOTO lbl105
                                        }
                                        catch (SecurityException var5_21) {
                                            var2_2 = var6_12;
                                            var6_12 = var5_21;
                                            ** GOTO lbl109
                                        }
                                    }
                                    var5_19 = var10_18;
                                    if (f.F0(this.j) != null) {
                                        var5_19 = var10_18;
                                        f.I0(this.j).add(f.F0(this.j).B());
                                    }
                                    var5_19 = var10_18;
                                    this.j.l0(true);
                                    var5_19 = var10_18;
                                    var13_23 = f.D0(this.j).m();
                                    var5_19 = var10_18;
                                    var3_24 = f.D0(this.j).i();
                                    var5_19 = var10_18;
                                    var12_22 = f.D0(this.j).l();
                                    var5_19 = var10_18;
                                    if (!this.x()) break block27;
                                    var5_19 = var10_18;
                                    var12_22 = ax.c3.x.e(K.e);
                                    var5_19 = var10_18;
                                    var12_22.h0(var12_22.z(f.D0((f)this.j).c.getPath()), f.H0(this.j), f.F0(this.j), true, (ax.u3.c)var2_2, this.j.V());
                                    var5_19 = var11_8;
                                    break block28;
                                }
                                var5_19 = var10_18;
                                if (f.D0(this.j).d()) {
                                    var5_19 = var10_18;
                                    var10_18 = new b0(f.D0(this.j).n());
                                    var5_19 = var10_18;
                                } else {
                                    var5_19 = var10_18;
                                    if (f.D0(this.j).c()) {
                                        var5_19 = var10_18;
                                        var10_18 = new ax.c3.d(f.D0((f)this.j).b);
                                        var5_19 = var10_18;
                                    } else {
                                        var5_19 = var10_18;
                                        var10_18 = new U(f.D0(this.j).k(this.j.r()), -1L);
                                        var5_19 = var10_18;
                                    }
                                }
                                try {
                                    f.H0(this.j).v0(f.F0(this.j), (G)var5_19, var13_23, var3_24, (Long)var12_22, null, true, (ax.u3.c)var2_2, this.j.V());
                                }
                                catch (Throwable var2_5) {
                                    break block22;
                                }
                                catch (ax.b3.a var2_6) {
                                    var2_2 = var5_19;
                                    break block23;
                                }
                                catch (ax.b3.j var6_14) {
                                    var2_2 = var5_19;
                                    break block24;
                                }
                                catch (IOException var6_15) {
                                    var2_2 = var5_19;
                                    ** GOTO lbl105
                                }
                                catch (SecurityException var6_16) {
                                    var2_2 = var5_19;
                                    ** GOTO lbl109
                                }
                            }
                            if (var5_19 != null) {
                                var5_19.e();
                            }
                            this.j.w().c(v.b.q, 1);
                            return;
                        }
                        if (var2_2 != null) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                var2_2.e();
                                break block25;
                                break;
                            }
                        }
                        break block25;
                    }
                    var5_19 = var2_2;
                    {
                        this.j.q0((ax.b3.j)var6_17);
                        var5_19 = var2_2;
                        var6_17.printStackTrace();
                        if (var2_2 == null) break block25;
                        ** GOTO lbl-1000
lbl105:
                        // 2 sources

                        var5_19 = var2_2;
                        var6_12.printStackTrace();
                        if (var2_2 == null) break block25;
                        ** GOTO lbl-1000
lbl109:
                        // 2 sources

                        var5_19 = var2_2;
                        var6_12.printStackTrace();
                        var5_19 = var2_2;
                        ax.Ha.c.h().f().b("!! ClipboardSaveOperator SecurityException !!").l(var6_12).h();
                        if (var2_2 == null) ** break;
                        ** continue;
                    }
                }
                this.j.w().c(v.b.c0, 1);
                this.j.w().b(f.F0(this.j).B());
                return;
            }
            if (var5_19 != null) {
                var5_19.e();
            }
            throw var2_7;
        }

        private void C(j.f f8) {
            int n8 = ax.W2.f$b.b[f8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            return;
                        }
                        this.j.i();
                        return;
                    }
                    this.j.w().c(v.b.d0, 1);
                    return;
                }
                this.B(true);
                return;
            }
            this.B(false);
        }

        private boolean x() {
            Object object;
            if (((f)this.j).H.c != null && ax.c3.B.K((object = ((f)this.j).H.c).getScheme())) {
                File file = ax.Z2.a.m(this.j.r(), "content-tmp");
                if ((object = object.getPath()) == null) {
                    return false;
                }
                if (d0.I(file.getAbsolutePath(), (String)object)) {
                    return true;
                }
            }
            return false;
        }

        void B(boolean bl) {
            this.A(bl, this);
        }

        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        protected Integer w(Void ... object) {
            while (!this.isCancelled()) {
                if (this.h) {
                    this.h = false;
                    this.C(this.i);
                } else {
                    f f8 = this.j;
                    f.E0(f8, (g)f8.w.pop());
                    f f9 = this.j;
                    String string = f9.N0(f9.H);
                    try {
                        f f10 = this.j;
                        f.G0(f10, f10.y.z(string));
                        Object var1_6 = null;
                    }
                    catch (ax.b3.j j8) {
                        j8.printStackTrace();
                    }
                    if (this.j.C == null) {
                        ax.b3.j var1_8;
                        if (var1_8 != null) {
                            this.j.q0((ax.b3.j)var1_8);
                        }
                        this.j.w().c(v.b.c0, 1);
                        this.j.w().b(this.j.H.h());
                    } else {
                        this.j.l0(true);
                        if (this.j.C.n()) {
                            if (this.j.C.isDirectory()) {
                                return 2;
                            }
                            if (!this.j.D) return 1;
                            this.C(this.i);
                        } else {
                            this.B(false);
                        }
                    }
                }
                if (!this.j.w.isEmpty()) continue;
            }
            return 0;
        }

        protected void y(Integer n8) {
            this.j.g0();
        }

        protected void z(Integer n8) {
            int n9 = n8;
            if (n9 == 0) {
                this.j.O0();
                return;
            }
            this.j.P0(n9);
        }
    }
}

