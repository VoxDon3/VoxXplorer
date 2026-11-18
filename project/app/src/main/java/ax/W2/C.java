/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.Q2.a;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.X2.L;
import ax.X2.Q;
import ax.X2.v;
import ax.a3.H;
import ax.c3.K;
import ax.u3.q;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.y;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class C
extends j {
    private d A;
    private c B;
    private o w;
    private o x;
    private File y;
    private n z;

    public C(h.a a8, o o8, File file, o o9, n n8) {
        super(a8);
        this.w = o8;
        this.y = file;
        this.x = o9;
        this.z = n8;
        o8.n0();
        this.x.n0();
        this.h(this.w.T());
        this.h(this.x.T());
    }

    static /* synthetic */ o A0(C c8) {
        return c8.w;
    }

    static /* synthetic */ o B0(C c8) {
        return c8.x;
    }

    private void D0(int n8) {
        H h8 = H.l3(this.y.getName(), n8);
        h8.m3(new H.b(this){
            final C a;
            {
                this.a = c8;
            }

            @Override
            public void a(boolean bl) {
                if (bl) {
                    C.x0(this.a, new d(this.a));
                    this.a.A.h(new Void[0]);
                    return;
                }
                this.a.w().c(v.b.c0, 1);
                this.a.o();
            }
        });
        this.q().K(this, h8);
    }

    static /* synthetic */ d x0(C c8, d d8) {
        c8.A = d8;
        return d8;
    }

    static /* synthetic */ n z0(C c8) {
        return c8.z;
    }

    @Override
    public String A() {
        return this.L();
    }

    @Override
    public int B() {
        return 5;
    }

    @Override
    public String C() {
        return this.r().getString(2131951903);
    }

    @Override
    public String F() {
        int n8 = ax.W2.C$b.a[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getResources().getString(2131951754);
            }
            return this.r().getResources().getString(2131952373);
        }
        return this.r().getResources().getString(2131952372);
    }

    @Override
    protected String G() {
        if (ax.W2.C$b.a[this.D().ordinal()] != 2) {
            return "";
        }
        return this.v(false);
    }

    @Override
    public K H() {
        return null;
    }

    @Override
    public String J() {
        File file = this.y;
        if (file == null) {
            return "";
        }
        return file.getAbsolutePath();
    }

    @Override
    public K K() {
        n n8 = this.z;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String M() {
        n n8 = this.z;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    protected boolean P() {
        if (this.x.Y()) {
            return true;
        }
        return this.w.Y();
    }

    @Override
    protected void W() {
    }

    @Override
    protected boolean X() {
        boolean bl;
        if (this.S(this.B)) {
            this.B.e();
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
        o o8;
        o o9;
        this.w().T(v.a.c0);
        if (this.x.Y()) {
            this.x.n(this.x());
        }
        if ((o9 = this.x) != (o8 = this.w) && o8.Y()) {
            this.w.n(this.x());
        }
    }

    @Override
    protected void Z() {
        if (this.w().M() == this.w().H()) {
            this.t0(h.b.c0);
            return;
        }
        this.t0(h.b.d0);
    }

    @Override
    public void c0() {
        c c8;
        this.j0();
        this.w().e0(this.y.length());
        this.w().d0(1);
        this.w().U(this.y.length());
        this.B = c8 = new c(this);
        c8.h(new Void[0]);
    }

    @Override
    public void k() {
        this.w.k0(true);
        this.x.k0(true);
    }

    @Override
    public void n0() {
        String string = a.c.a(this.D());
        ax.Q2.a.i().m("command", "file_update").c("result", string).c("loc", this.x.S().I()).e();
    }

    private class c
    extends q<Void, Void, Boolean> {
        L h;
        final C i;

        public c(C c8) {
            this.i = c8;
            super(q.e.f0);
            this.h = new L();
        }

        private long x() {
            File file = new File(this.i.y.getAbsolutePath());
            if (Q.P1()) {
                try {
                    v.l(this.i.y.getAbsolutePath(), this.h);
                    long l8 = this.h.a;
                    return l8;
                }
                catch (Exception exception) {
                    return file.length();
                }
            }
            return file.length();
        }

        private boolean z() {
            long l8 = this.i.y.length();
            long l9 = System.currentTimeMillis();
            while (!this.isCancelled()) {
                try {
                    Thread.sleep(1500L);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                long l10 = this.x();
                if (l10 == 0L) {
                    if (System.currentTimeMillis() - l9 <= 10000L) continue;
                    return false;
                }
                if (l8 == l10) {
                    return true;
                }
                this.i.w().e0(l10);
                l8 = l10;
            }
            return false;
        }

        @Override
        protected void o() {
            this.i.g0();
        }

        protected Boolean w(Void ... voidArray) {
            boolean bl = this.z();
            if (!bl) {
                this.i.w().c(v.b.c0, 1);
            }
            return bl;
        }

        protected void y(Boolean object) {
            if (((Boolean)object).booleanValue()) {
                this.i.k0();
                object = this.i;
                C.x0((C)object, new d((C)object));
                this.i.A.h(new Void[0]);
                return;
            }
            this.i.o();
        }
    }

    private class d
    extends q<Void, Void, Integer> {
        final C h;

        public d(C c8) {
            this.h = c8;
            super(q.e.f0);
        }

        @Override
        protected void o() {
            this.h.g0();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Integer w(Void ... var1_1) {
            block31: {
                ax.o3.b.j().l(C.z0(this.h).Q());
                var11_13 = (y)C.A0(this.h).z(C.y0(this.h).getAbsolutePath());
                var1_1 = C.A0(this.h);
                var9_14 = C.B0(this.h);
                var12_17 = C.z0(this.h);
                var10_18 = this.h.V();
                try {}
                catch (ax.b3.j var1_4) {}
                catch (ax.b3.a var1_10) {}
                finally {
                    break block31;
                }
lbl13:
                // 1 sources

                while (true) {
                    var10_18 = null;
                    var9_14 = null;
                    var1_1 = new RandomAccessFile(C.y0(this.h), "rw");
                    break;
                }
lbl-1000:
                // 1 sources

                {
                    while (true) {
                        this.h.w().c(v.b.c0, 1);
                        var1_1 = 0;
lbl22:
                        // 5 sources

                        while (true) {
                            ax.o3.b.j().m(C.z0(this.h).Q());
                            return var1_1;
                        }
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        block35: {
                            block34: {
                                var2_23 = this.h.q0((ax.b3.j)var1_1);
                                if (var2_23 != 50) break block34;
                                this.h.w().c0(0L);
                                var1_1 = 11;
                                ** GOTO lbl22
                            }
                            if (var2_23 != 170) break block35;
                            this.h.w().c0(0L);
                            var1_1 = 12;
                            ** GOTO lbl22
                        }
                        this.h.w().c(v.b.c0, 1);
                        var1_1 = 0;
                        ** GOTO lbl22
                        break;
                    }
                }
lbl40:
                // 1 sources

                while (true) {
                    ax.o3.b.j().m(C.z0(this.h).Q());
                    throw var1_3;
                }
                catch (Throwable var1_7) {
                    ** continue;
                }
                catch (ax.b3.a var1_8) {
                    ** continue;
                }
                catch (ax.b3.j var1_9) {
                    ** continue;
                }
            }
            var1_1.t0(var11_13, (o)var9_14, var12_17, this, var10_18);
            var5_20 = System.currentTimeMillis();
            var3_21 = var5_20 % 1000L;
            var5_20 = var5_20 + 2000L - var3_21;
            C.y0(this.h).setLastModified(var5_20);
            var7_22 = C.y0(this.h).lastModified();
            if (var5_20 == var7_22) ** GOTO lbl-1000
            {
                Thread.sleep(2050L - var3_21);
            }
            ** while (true)
lbl-1000:
            // 4 sources

            {
                block33: {
                    block32: {
                        while (true) {
                            var11_13.v1();
                            ax.o3.b.j().t(C.z0(this.h).Q(), var11_13.q());
                            this.h.w().c(v.b.q, 1);
                            this.h.l0(true);
                            var1_1 = 0;
                            ** continue;
                            break;
                        }
                        catch (Throwable var1_5) {
                            break block32;
                        }
                        catch (IOException var1_6) {
                            var1_1 = var10_18;
                            break block33;
                        }
                        try {
                            var3_21 = var1_1.length();
                            var1_1.setLength(1L + var3_21);
                            var1_1.setLength(var3_21);
                            var1_1.getFD().sync();
                        }
                        catch (Throwable var10_19) {
                            var9_14 = var1_1;
                            var1_1 = var10_19;
                            break block32;
                        }
                        catch (IOException var9_15) {
                            break block33;
                        }
                        {
                            var1_1.close();
                        }
                    }
                    if (var9_14 == null) throw var1_1;
                    {
                        var9_14.close();
                    }
                    throw var1_1;
                }
                if (var1_1 == null) ** GOTO lbl-1000
                {
                    var1_1.close();
                    ** continue;
                }
            }
        }

        protected void x(Integer n8) {
            if (n8 == 11) {
                this.h.D0(2131951948);
                return;
            }
            if (n8 == 12) {
                this.h.D0(2131951933);
                return;
            }
            this.h.o();
        }
    }
}

