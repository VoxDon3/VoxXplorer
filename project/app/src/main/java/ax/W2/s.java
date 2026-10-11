/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.Ha.c;
import ax.Q2.a;
import ax.Q2.f;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.c3.B;
import ax.c3.K;
import ax.u3.q;
import com.alphainventor.filemanager.file.W;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class s
extends j {
    private static final Logger B = Logger.getLogger("FileManager.DownloadOperator");
    private boolean A;
    private o w;
    private b x;
    private List<n> y;
    n z;

    public s(h.a a8, o o8, List<n> list, boolean bl) {
        super(a8);
        this.w = o8;
        this.y = list;
        this.A = bl;
        o8.n0();
        this.h(this.w.T());
    }

    @Override
    public String A() {
        return this.I();
    }

    @Override
    public int B() {
        return 4;
    }

    @Override
    public String C() {
        return this.r().getString(2131952515);
    }

    @Override
    public String F() {
        int n8 = ax.W2.s$a.a[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getResources().getString(2131951754);
            }
            return this.r().getResources().getString(2131952338);
        }
        return this.r().getResources().getString(2131952337);
    }

    @Override
    protected String G() {
        if (ax.W2.s$a.a[this.D().ordinal()] != 2) {
            return "";
        }
        return this.v(false);
    }

    @Override
    public K H() {
        n n8 = this.z;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String J() {
        n n8 = this.z;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    public K K() {
        return null;
    }

    @Override
    public String M() {
        return "";
    }

    @Override
    protected boolean P() {
        return this.w.Y();
    }

    @Override
    protected void W() {
    }

    @Override
    protected boolean X() {
        if (this.S(this.x)) {
            this.x.e();
            return true;
        }
        return false;
    }

    @Override
    protected void Y() {
        if (this.w.Y()) {
            this.w().T(v.a.c0);
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
        this.j0();
        Object object = this.y.iterator();
        while (object.hasNext()) {
            n n8 = object.next();
            this.w().h(n8.p());
        }
        this.w().d0(this.y.size());
        this.k0();
        this.x = object = new b(this);
        ((q)object).i(new Void[0]);
    }

    @Override
    public void k() {
        this.w.k0(true);
    }

    @Override
    public void n0() {
        String string = a.c.a(this.D());
        ax.Q2.a.i().m("command", "file_download").c("result", string).c("loc", this.w.S().I()).e();
    }

    private class b
    extends q<Void, Void, Boolean> {
        final s h;

        public b(s s8) {
            this.h = s8;
            super(q.e.f0);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(Void ... object) {
            Iterator iterator = this.h.y.iterator();
            while (true) {
                block19: {
                    int n8;
                    Object object2;
                    ax.b3.j j82;
                    n n9;
                    block18: {
                        if (!iterator.hasNext()) {
                            this.h.l0(true);
                            return Boolean.TRUE;
                        }
                        n9 = (n)iterator.next();
                        if (this.isCancelled()) {
                            return Boolean.FALSE;
                        }
                        object = this.h;
                        ((s)object).z = n9;
                        ((j)object).l0(true);
                        try {
                            block17: {
                                try {
                                    object = this.h.w.z(n9.E());
                                }
                                catch (ax.b3.j j9) {
                                    object = n9;
                                }
                                try {
                                    if (!object.n()) {
                                        this.h.r0(20);
                                        this.h.w().c(v.b.c0, 1);
                                        continue;
                                    }
                                }
                                catch (ax.b3.j j82) {
                                    break block17;
                                }
                                object2 = this.h.A ? ((n)object).Z() : ((n)object).N();
                                if (ax.c3.B.G((File)object2, (n)object)) {
                                    this.h.w().c(v.b.q, 1);
                                    this.h.w().d(((File)object2).length());
                                    continue;
                                }
                                Object object3 = object;
                                if (object.isDirectory()) {
                                    if (n9.P() == f.K0 && this.h.w.u() instanceof W && ((W)this.h.w.u()).K0()) {
                                        object = n9;
                                        n8 = 1;
                                    } else {
                                        n8 = 0;
                                    }
                                    object3 = object;
                                    if (n8 == 0) {
                                        object = c.h().f().b("DOWNLOAD DIRECTORY ERROR");
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("location:");
                                        ((StringBuilder)object2).append(n9.P().I());
                                        ((StringBuilder)object2).append(",dir:");
                                        ((StringBuilder)object2).append(n9.isDirectory());
                                        ((StringBuilder)object2).append(",ext:");
                                        ((StringBuilder)object2).append(n9.A());
                                        ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
                                        this.h.w().c(v.b.c0, 1);
                                        B.severe("Download Directory Error");
                                        continue;
                                    }
                                }
                                this.h.w.p((n)object3, (File)object2, this, this.h.V());
                                ((File)object2).setReadable(true, false);
                                ((File)object2).setWritable(true, false);
                                this.h.w().c(v.b.q, 1);
                                continue;
                            }
                            j82.printStackTrace();
                            n8 = this.h.q0(j82);
                            if (n8 != 80) break block18;
                            object2 = c.h().f().d("UNSUPPORTED ENCRYPTION : DOWNLOAD FAILED").l(j82);
                            object = new StringBuilder();
                            ((StringBuilder)object).append("location:");
                        }
                        catch (ax.b3.a a8) {
                            break block19;
                        }
                        ((StringBuilder)object).append(n9.P().I());
                        ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                        break block19;
                    }
                    if (n8 != 0) {
                        object = c.h().f().d("DOWNLOAD FAILED KNOWN REASON").l(j82);
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("location:");
                        ((StringBuilder)object2).append(n9.P().I());
                        ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
                    } else {
                        object = c.h().f().d("DOWNLOAD FAILED").l(j82);
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("location:");
                        ((StringBuilder)object2).append(n9.P().I());
                        ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
                    }
                }
                this.h.w().c(v.b.c0, 1);
            }
        }

        protected void x(Boolean bl) {
            this.h.g0();
        }

        protected void y(Boolean bl) {
            this.h.o();
        }
    }
}

