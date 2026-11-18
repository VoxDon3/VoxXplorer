/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import ax.Bc.n;
import ax.Cc.c;
import ax.Dc.S;
import ax.Dc.T;
import ax.Ec.a;
import ax.Jc.b;
import ax.Q2.a;
import ax.T.l;
import ax.W2.h;
import ax.W2.j;
import ax.W2.t;
import ax.W2.v;
import ax.W2.w;
import ax.X2.Q;
import ax.a3.K;
import ax.a3.L;
import ax.a3.x;
import ax.b3.F;
import ax.b3.I;
import ax.b3.s;
import ax.be.i;
import ax.c3.B;
import ax.c3.G;
import ax.c3.K;
import ax.c3.P;
import ax.c3.U;
import ax.c3.d0;
import ax.c3.k;
import ax.u3.q;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.zip.ZipException;

public class u
extends j {
    private k A;
    private com.voxdon.xplorer.file.n B;
    private String C;
    private q<Void, Void, Boolean> D;
    private q<Void, Void, Integer> E;
    private j.f F;
    private boolean G;
    private List<Map.Entry<com.voxdon.xplorer.file.n, Long>> H;
    private List<com.voxdon.xplorer.file.n> I;
    private x.b J;
    private String K;
    private ax.B.b<String> L;
    private boolean M;
    private o w;
    private String x;
    private List<e> y = new ArrayList<e>();
    private int z;

    public u(h.a object, t.a a8, String string, ParcelFileDescriptor parcelFileDescriptor, com.voxdon.xplorer.file.n n8, k k8, o o8, String string2, List<com.voxdon.xplorer.file.n> list) {
        super((h.a)object);
        this.H = new ArrayList<Map.Entry<com.voxdon.xplorer.file.n, Long>>();
        this.L = new ax.B.b();
        this.w = o8;
        this.x = string2;
        o8.n0();
        this.h(this.w.T());
        object = new e();
        ((e)object).e = n8;
        ((e)object).f = k8;
        ((e)object).c = parcelFileDescriptor;
        ((e)object).d = string;
        ((e)object).h = list;
        ((e)object).g = string2;
        ((e)object).a = a8;
        this.y.add((e)object);
        this.z = 0;
    }

    /*
     * WARNING - void declaration
     */
    public u(h.a object, List<com.voxdon.xplorer.file.n> object2, o object32, x.b b8, String string) {
        super((h.a)object);
        Object var4_6;
        String var5_7;
        this.H = new ArrayList<Map.Entry<com.voxdon.xplorer.file.n, Long>>();
        this.L = new ax.B.b();
        this.w = object32;
        this.x = var5_7;
        this.I = object2;
        this.J = var4_6;
        ((o)object32).n0();
        this.h(this.w.T());
        for (com.voxdon.xplorer.file.n n8 : this.I) {
            object = new e();
            ((e)object).e = n8;
            ((e)object).d = n8.B();
            ((e)object).a = t.k(n8.B());
            ((e)object).g = this.J == x.b.c0 ? d0.e((String)var5_7, n8.B()) : var5_7;
            this.y.add((e)object);
        }
    }

    private void A1(e object) {
        String string;
        int n8 = d.a[((e)object).a.ordinal()];
        if (n8 != 2) {
            if (n8 != 3) {
                ax.u3.b.f();
                string = ax.Jc.b.a(((e)object).d);
            } else {
                string = ax.Hc.c.a(((e)object).d);
            }
        } else {
            string = ax.Jc.b.a(((e)object).d);
        }
        this.C = d0.U(d0.R(((e)object).g, string));
        this.w().U(((e)object).l);
        this.E = object = this.h1((e)object, j.f.q);
        ((q)object).i(new Void[0]);
    }

    static /* synthetic */ boolean B0(u u8, boolean bl) {
        u8.M = bl;
        return bl;
    }

    private void B1(e object) {
        this.E = object = this.i1((e)object, ((e)object).w, this.o1());
        ((q)object).i(new Void[0]);
    }

    private void C1(e object) {
        this.E = object = this.i1((e)object, (ax.Dc.I)((e)object).t.poll(), this.o1());
        ((q)object).i(new Void[0]);
    }

    static /* synthetic */ int E0(u u8, int n8) {
        u8.z = n8;
        return n8;
    }

    static /* synthetic */ q K0(u u8, q q8) {
        u8.D = q8;
        return q8;
    }

    static /* synthetic */ String O0(u u8, String string) {
        u8.C = string;
        return string;
    }

    static /* synthetic */ com.voxdon.xplorer.file.n R0(u u8, com.voxdon.xplorer.file.n n8) {
        u8.B = n8;
        return n8;
    }

    static /* synthetic */ String U0(u u8, String string) {
        u8.K = string;
        return string;
    }

    static /* synthetic */ boolean X0(u u8, boolean bl) {
        u8.G = bl;
        return bl;
    }

    static /* synthetic */ j.f Y0(u u8, j.f f8) {
        u8.F = f8;
        return f8;
    }

    static /* synthetic */ q a1(u u8, q q8) {
        u8.E = q8;
        return q8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e1(S s8, Queue<ax.Ac.a> queue, ax.c3.a object) {
        if (object == null) {
            return;
        }
        Object object2 = s8.g(((ax.c3.a)object).t());
        if (object2 == null) return;
        queue.add((ax.Ac.a)object2);
        this.w().h(((ax.Dc.I)object2).getSize());
        this.w().g(1);
        if (!((ax.Dc.I)object2).isDirectory()) return;
        if ((object = ((ax.c3.a)object).i0()) == null) return;
        synchronized (object) {
            try {
                object2 = object.iterator();
                while (object2.hasNext()) {
                    this.e1(s8, queue, (ax.c3.a)object2.next());
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private void f1() {
        Iterator<e> iterator = this.y.iterator();
        while (iterator.hasNext()) {
            this.g1(iterator.next());
        }
    }

    private void g1(e e8) {
        InputStream inputStream;
        if (e8.t != null) {
            e8.t = null;
        }
        if (e8.p) {
            ax.c3.F.a(e8.q);
            e8.q = null;
        }
        if (e8.m) {
            ax.c3.F.a(e8.n);
            e8.n = null;
        }
        if ((inputStream = e8.j) != null) {
            ax.c3.F.a(inputStream);
            e8.j = null;
        }
        if ((inputStream = e8.k) != null) {
            ax.c3.F.a(inputStream);
            e8.k = null;
        }
        e8.w = null;
        inputStream = e8.v;
        if (inputStream != null) {
            ax.c3.F.a(inputStream);
            e8.v = null;
        }
        if ((inputStream = e8.c) != null) {
            ax.c3.F.a(inputStream);
            e8.c = null;
        }
        e8.b = true;
    }

    private f h1(e e8, j.f f8) {
        String string = this.C;
        string = string != null ? d0.h(string) : "";
        return new f(this, e8, string, null, f8);
    }

    private f i1(e e8, ax.Ac.a a8, j.f f8) {
        return new f(this, e8, a8.getName(), a8, f8);
    }

    private void j1(e object, ax.u3.c c8) throws ax.b3.a, ax.b3.j {
        Object object2 = ((e)object).n;
        ((e)object).t = new LinkedList();
        object2 = ((n)object2).q().iterator();
        while (object2.hasNext()) {
            if (c8 != null && c8.isCancelled()) {
                throw new ax.b3.a();
            }
            ax.Bc.l l8 = (ax.Bc.l)object2.next();
            if (l8.getName() != null) {
                ((e)object).t.add(l8);
                this.w().h(l8.getSize());
                this.w().g(1);
                continue;
            }
            object = new ax.b3.g("SevenZ entry does not have name");
            ax.Q2.d.b((Throwable)object);
            throw object;
        }
    }

    private void k1(e e8, ax.u3.c c8) throws ax.b3.a {
        Object object = e8.q;
        e8.t = new LinkedList();
        Object object2 = e8.h;
        if (object2 != null) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                com.voxdon.xplorer.file.n n8 = (com.voxdon.xplorer.file.n)object2.next();
                if (c8 != null && c8.isCancelled()) {
                    throw new ax.b3.a();
                }
                this.e1((S)object, e8.t, (ax.c3.a)n8);
            }
        } else {
            object2 = ((S)object).f();
            while (object2.hasMoreElements()) {
                if (c8 != null && c8.isCancelled()) {
                    throw new ax.b3.a();
                }
                object = object2.nextElement();
                e8.t.add((ax.Ac.a)object);
                this.w().h(((ax.Dc.I)object).getSize());
                this.w().g(1);
            }
        }
    }

    private e n1() {
        return this.y.get(this.z);
    }

    private j.f o1() {
        if (this.G) {
            return this.F;
        }
        return j.f.q;
    }

    private boolean p1() {
        return this.z < this.y.size() - 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void q1(e e8) {
        try {
            ax.c3.B.d0(e8.c, e8.i);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void r1() {
        e e8 = this.n1();
        this.A = e8.f;
        int n8 = d.a[e8.a.ordinal()];
        if (n8 != 1) {
            if (n8 != 2 && n8 != 3) {
                if (n8 != 4) {
                    if (n8 != 5) {
                        return;
                    }
                    LinkedList<ax.Ac.a> linkedList = e8.t;
                    if (linkedList != null && !linkedList.isEmpty()) {
                        this.z1(e8);
                        return;
                    }
                    this.g1(e8);
                    this.t1(true);
                    return;
                }
                if (e8.w == null) {
                    this.g1(e8);
                    this.t1(true);
                    return;
                }
                this.B1(e8);
                return;
            }
            if (!e8.u) {
                this.A1(e8);
                e8.u = true;
                return;
            }
            this.g1(e8);
            this.t1(false);
            return;
        }
        LinkedList<ax.Ac.a> linkedList = e8.t;
        if (linkedList != null && !linkedList.isEmpty()) {
            this.C1(e8);
            return;
        }
        this.g1(e8);
        this.t1(true);
    }

    private void s1() {
        ++this.z;
    }

    private void t1(boolean bl) {
        if (this.p1()) {
            this.s1();
            this.r1();
            return;
        }
        if (bl) {
            new g(this).i(new Void[0]);
            return;
        }
        this.o();
    }

    private boolean u1(e e8) {
        try {
            c c8;
            e8.w = c8 = e8.v.p();
            return c8 != null;
        }
        catch (IOException iOException) {
            e8.w = null;
            return false;
        }
    }

    private void v1(Bundle bundle, ax.Ac.a a8) {
        bundle.putString("new_file_path", a8.getName());
        Long l8 = this.l1(a8);
        if (l8 != null) {
            bundle.putLong("new_file_date", l8.longValue());
        }
        bundle.putLong("new_file_size", this.m1(a8));
        bundle.putString("old_file_path", this.B.E());
        bundle.putLong("old_file_date", this.B.q());
        bundle.putLong("old_file_size", this.B.p());
        bundle.putBoolean("isDirectory", a8.isDirectory());
    }

    private void w1(e e8, String object, ax.Ac.a a8, int n8) {
        ax.a3.K k8 = new ax.a3.K();
        Bundle bundle = new Bundle();
        bundle.putString("progressTypeString", this.C());
        bundle.putString("fileName", (String)object);
        bundle.putBoolean("applyToAll", true);
        bundle.putInt("errCode", n8);
        if ((n8 == 1 || n8 == 2) && this.B != null) {
            if (a8 != null) {
                this.v1(bundle, a8);
            } else if (e8.b() && (object = e8.k) instanceof ax.Hc.a) {
                if ((object = ((ax.Hc.a)object).d()) != null && ((ax.Hc.b)object).a() > 0L) {
                    bundle.putLong("new_file_date", ((ax.Hc.b)object).a());
                    bundle.putLong("old_file_date", this.B.q());
                }
                bundle.putBoolean("isDirectory", false);
            }
        }
        k8.v2(bundle);
        k8.v3(new K.i(){
            final e a;
            final ax.Ac.a b;
            final u c;
            {
                this.c = u8;
                this.a = e8;
                this.b = a8;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a(j.f object, boolean bl) {
                Exception exception2;
                block10: {
                    int n8;
                    block9: {
                        ax.W2.u.X0(this.c, bl);
                        ax.W2.u.Y0(this.c, object);
                        try {
                            n8 = d.b[object.ordinal()];
                            if (n8 == 1 || n8 == 2) break block9;
                            if (n8 != 3) {
                                if (n8 != 4) {
                                    return;
                                }
                                this.c.i();
                                return;
                            }
                        }
                        catch (Exception exception2) {
                            break block10;
                        }
                        this.c.w().c(v.b.d0, 1);
                        object = this.a;
                        if (((e)object).a == t.a.e0) {
                            this.c.u1((e)object);
                        }
                        this.c.r1();
                        return;
                    }
                    n8 = d.a[this.a.a.ordinal()];
                    if (n8 != 1) {
                        if (n8 != 2 && n8 != 3) {
                            if (n8 != 4 && n8 != 5) {
                                ax.u3.b.f();
                                return;
                            }
                        } else {
                            u u8 = this.c;
                            ax.W2.u.a1(u8, u8.h1(this.a, object));
                            this.c.E.i(new Void[0]);
                            return;
                        }
                    }
                    u u9 = this.c;
                    ax.W2.u.a1(u9, u9.i1(this.a, this.b, object));
                    this.c.E.i(new Void[0]);
                    return;
                }
                exception2.printStackTrace();
            }
        });
        this.q().K(this, k8);
    }

    private void x1(e object) {
        String string = TextUtils.isEmpty((CharSequence)((e)object).d) ? this.r().getString(2131951846) : ((e)object).d;
        object = ax.a3.L.n3(string, null, new L.c(){
            final e a;
            final u b;
            {
                this.b = u8;
                this.a = e8;
            }

            @Override
            public void X(String string) {
                this.a.s = string;
                ax.W2.u.K0(this.b, new h(this.b));
                this.b.D.i(new Void[0]);
            }

            @Override
            public void a() {
                this.b.i();
            }
        });
        this.q().K(this, (ax.a3.j)object);
    }

    private void y1(e object) {
        String string = TextUtils.isEmpty((CharSequence)((e)object).d) ? this.r().getString(2131951846) : ((e)object).d;
        object = ax.a3.L.n3(string, null, new L.c(){
            final e a;
            final u b;
            {
                this.b = u8;
                this.a = e8;
            }

            @Override
            public void X(String string) {
                this.a.s = string;
                this.b.r1();
            }

            @Override
            public void a() {
                this.b.i();
            }
        });
        this.q().K(this, (ax.a3.j)object);
    }

    private void z1(e object) {
        this.E = object = this.i1((e)object, (ax.Bc.l)((e)object).t.poll(), this.o1());
        ((q)object).i(new Void[0]);
    }

    @Override
    public String A() {
        return this.L();
    }

    @Override
    public int B() {
        return 3;
    }

    @Override
    public String C() {
        return this.r().getString(2131952517);
    }

    @Override
    public String F() {
        int n8 = d.c[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getResources().getString(2131951754);
            }
            String string = this.K;
            if (string == null) {
                string = this.y.get((int)0).d;
            }
            return this.r().getResources().getString(2131952341, new Object[]{string});
        }
        return this.r().getResources().getQuantityString(2131820554, this.w().H(), new Object[]{this.w().H(), this.x});
    }

    @Override
    protected String G() {
        if (d.c[this.D().ordinal()] != 2) {
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
        k k8 = this.A;
        if (k8 == null) {
            return "";
        }
        return k8.E();
    }

    @Override
    public K K() {
        com.voxdon.xplorer.file.n n8 = this.B;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String M() {
        com.voxdon.xplorer.file.n n8 = this.B;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    protected boolean P() {
        return true;
    }

    @Override
    protected void W() {
    }

    @Override
    protected boolean X() {
        boolean bl;
        if (this.S(this.D)) {
            this.D.e();
            bl = true;
        } else {
            bl = false;
        }
        if (this.S(this.E)) {
            this.E.e();
            return true;
        }
        return bl;
    }

    @Override
    protected void Y() {
        this.w().T(v.a.f0);
        this.f1();
        if (this.w.Y()) {
            this.w().T(v.a.c0);
            this.w.n(this.x());
        }
    }

    @Override
    protected void Z() {
        if (this.x != null) {
            if (this.M) {
                this.L.clear();
                this.L.add(d0.h(this.x));
                ax.W2.w.c().g(this.w.T(), d0.r(this.x), this.L);
            } else {
                ax.W2.w.c().g(this.w.T(), this.x, this.L);
            }
        }
        int n8 = this.w().M();
        int n9 = this.w().H();
        int n10 = this.w().C();
        if (n8 != 0 && n8 == n9 + n10) {
            this.t0(h.b.c0);
            return;
        }
        this.t0(h.b.d0);
    }

    @Override
    public void c0() {
        h h8;
        this.j0();
        this.G = false;
        this.D = h8 = new h(this);
        h8.i(new Void[0]);
    }

    @Override
    public void k() {
        this.w.k0(true);
        this.G = false;
    }

    Long l1(ax.Ac.a a8) {
        if (a8 instanceof ax.Bc.l) {
            ax.Bc.l l8 = (ax.Bc.l)a8;
            if (l8.l()) {
                return a8.b().getTime();
            }
            if (l8.k()) {
                return l8.h().getTime();
            }
            return null;
        }
        if (a8 instanceof ax.Dc.I) {
            return ((ax.Dc.I)a8).getTime();
        }
        if (a8 instanceof c) {
            return a8.b().getTime();
        }
        ax.u3.b.f();
        return null;
    }

    long m1(ax.Ac.a a8) {
        if (a8 instanceof c) {
            return ((c)a8).j();
        }
        if (a8 instanceof ax.Bc.l) {
            return a8.getSize();
        }
        return a8.getSize();
    }

    @Override
    public void n0() {
        String string = a.c.a(this.D());
        ax.Q2.a.i().m("command", "file_extract").c("result", string).c("loc", this.w.S().I()).d(this.w().x()).e();
    }

    private static class e {
        t.a a;
        boolean b;
        ParcelFileDescriptor c;
        String d;
        com.voxdon.xplorer.file.n e;
        k f;
        String g;
        List<com.voxdon.xplorer.file.n> h;
        long i;
        FileInputStream j;
        a k;
        long l;
        boolean m;
        n n;
        boolean o;
        boolean p;
        T q;
        boolean r;
        String s;
        LinkedList<ax.Ac.a> t;
        boolean u;
        ax.Cc.d v;
        c w;

        private e() {
        }

        private boolean b() {
            t.a a8 = this.a;
            return a8 == t.a.d0 || a8 == t.a.c0;
            {
            }
        }
    }

    private class f
    extends q<Void, Void, Integer> {
        e h;
        ax.Ac.a i;
        ax.Bc.l j;
        ax.Dc.I k;
        j.f l;
        v.b m;
        boolean n;
        String o;
        c p;
        final u q;

        f(u u8, e e8, String string, ax.Ac.a a8, j.f f8) {
            this.q = u8;
            super(q.e.f0);
            this.h = e8;
            this.G(string, a8, f8);
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void A(com.voxdon.xplorer.file.n var1_1, ax.g3.i var2_9) throws ax.b3.j, ax.b3.a {
            block23: {
                block24: {
                    var16_26 = this.j;
                    var14_27 = null;
                    var10_28 = null;
                    var15_29 = null;
                    var13_30 = null;
                    var12_31 = null;
                    var11_32 = null;
                    var8_34 = var9_33 = null;
                    var5_35 = var16_26.getSize();
                    var3_36 = -1L;
                    if (var5_35 != -1L) {
                        var3_36 = var5_35;
                    }
                    var8_34 = var9_33;
                    var9_33 = this.h.n.u(var16_26);
                    var8_34 = ax.W2.u.A0(this.q);
                    var10_28 = new U((InputStream)var9_33, var3_36);
                    var8_34.v0((com.voxdon.xplorer.file.n)var1_1, (G)var10_28, var1_1.s(), var3_36, this.q.l1(var16_26), null, false, this, var2_9);
                    if (var9_33 == null) return;
                    try {
                        var9_33.close();
                        return;
                    }
                    catch (IOException var1_8) {
                        return;
                    }
                    catch (Throwable var1_2) {
                        var8_34 = var9_33;
                        break block23;
                    }
                    catch (NullPointerException var2_10) {
                        var1_1 = var9_33;
                        break block24;
                    }
                    catch (ArrayIndexOutOfBoundsException var2_11) {
                        var1_1 = var9_33;
                        ** GOTO lbl75
                    }
                    catch (IOException var1_3) {
                        var8_34 = var9_33;
                        throw ax.b3.d.a("7Z extract write error", (Exception)var1_6);
                    }
                    catch (i var2_12) {
                        var1_1 = var9_33;
                        ** GOTO lbl96
                    }
                    catch (IllegalStateException var2_13) {
                        var1_1 = var9_33;
                        ** GOTO lbl105
                    }
                    catch (OutOfMemoryError var2_14) {
                        var1_1 = var9_33;
                        ** GOTO lbl134
                    }
                    catch (Throwable var1_4) {
                        break block23;
                    }
                    catch (NullPointerException var2_15) {
                        var1_1 = var14_27;
                    }
                    catch (ArrayIndexOutOfBoundsException var2_16) {
                        var1_1 = var10_28;
                        ** GOTO lbl75
                    }
                    catch (IOException var1_5) {
                        var8_34 = var15_29;
                        throw ax.b3.d.a("7Z extract write error", (Exception)var1_6);
                    }
                    catch (i var2_17) {
                        var1_1 = var13_30;
                        ** GOTO lbl96
                    }
                    catch (IllegalStateException var2_18) {
                        var1_1 = var12_31;
                        ** GOTO lbl105
                    }
                    catch (OutOfMemoryError var2_19) {
                        var1_1 = var11_32;
                        ** GOTO lbl134
                    }
                }
                var8_34 = var1_1;
                {
                    ax.Q2.d.b((Throwable)var2_20);
                    var8_34 = var1_1;
                    var8_34 = var1_1;
                    var9_33 = new ax.b3.j((Throwable)var2_20);
                    var8_34 = var1_1;
                    throw var9_33;
lbl75:
                    // 2 sources

                    var8_34 = var1_1;
                    var10_28 = ax.Ha.c.h().d("7Z EOWF:");
                    var8_34 = var1_1;
                    var8_34 = var1_1;
                    var9_33 = new StringBuilder();
                    var8_34 = var1_1;
                    var9_33.append(var16_26.getSize());
                    var8_34 = var1_1;
                    var9_33.append(":");
                    var8_34 = var1_1;
                    var9_33.append(var16_26.getName());
                    var8_34 = var1_1;
                    var10_28.g(var9_33.toString()).h();
                    var8_34 = var1_1;
                    var8_34 = var1_1;
                    var9_33 = new ax.b3.j((Throwable)var2_21);
                    var8_34 = var1_1;
                    throw var9_33;
lbl96:
                    // 2 sources

                    var8_34 = var1_1;
                    if (this.h.o) {
                        var8_34 = var1_1;
                        var8_34 = var1_1;
                        var9_33 = new I((Throwable)var2_22);
                        var8_34 = var1_1;
                        throw var9_33;
                    }
                    var8_34 = var1_1;
                    throw ax.b3.d.a("7Z corrupted input", (Exception)var2_22);
lbl105:
                    // 2 sources

                    var8_34 = var1_1;
                    var10_28 = ax.Ha.c.h().d("7Z EXWRITE:");
                    var8_34 = var1_1;
                    var8_34 = var1_1;
                    var9_33 = new StringBuilder();
                    var8_34 = var1_1;
                    var9_33.append(var2_23.getMessage());
                    var8_34 = var1_1;
                    var9_33.append(":");
                    var8_34 = var1_1;
                    var9_33.append(this.q.D().name());
                    var8_34 = var1_1;
                    var9_33.append(":");
                    var8_34 = var1_1;
                    var7_37 = this.h.t == null;
                    var8_34 = var1_1;
                    var9_33.append(var7_37);
                    var8_34 = var1_1;
                    var10_28.g(var9_33.toString()).h();
                    var8_34 = var1_1;
                    var8_34 = var1_1;
                    var9_33 = new ax.b3.j((Throwable)var2_23);
                    var8_34 = var1_1;
                    throw var9_33;
lbl134:
                    // 2 sources

                    var8_34 = var1_1;
                    var8_34 = var1_1;
                    var9_33 = new ax.b3.g((Throwable)var2_24);
                    var8_34 = var1_1;
                    throw var9_33;
                }
            }
            if (var8_34 == null) throw var1_7;
            try {
                var8_34.close();
            }
            catch (IOException var2_25) {
                throw var1_7;
            }
            throw var1_7;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void B(com.voxdon.xplorer.file.n object, ax.g3.i object2) throws ax.b3.j, ax.b3.a {
            Throwable throwable2;
            block8: {
                IllegalStateException illegalStateException2;
                block9: {
                    c c8 = this.p;
                    try {
                        Comparable<Date> comparable;
                        long l8 = c8.j();
                        if (l8 == -1L) {
                            l8 = -1L;
                        }
                        comparable = (comparable = c8.h()) != null ? Long.valueOf(comparable.getTime()) : null;
                        P p8 = new P(this.h.v);
                        o o8 = this.q.w;
                        U u8 = new U(p8, l8);
                        o8.v0((com.voxdon.xplorer.file.n)object, u8, object.s(), l8, (Long)comparable, null, false, this, (ax.g3.i)object2);
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    }
                    catch (IllegalStateException illegalStateException2) {
                        break block9;
                    }
                    this.q.u1(this.h);
                    object = this.h;
                    if (((e)object).w == null) {
                        ax.c3.F.a(((e)object).v);
                    }
                    return;
                    object2 = ax.Ha.c.h().d("TAR EOWF:");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(c8.j());
                    stringBuilder.append(":");
                    stringBuilder.append(c8.getName());
                    ((ax.Ha.b)object2).g(stringBuilder.toString()).h();
                    object2 = new ax.b3.j(arrayIndexOutOfBoundsException);
                    throw object2;
                }
                ax.Ha.b b8 = ax.Ha.c.h().d("TAR EXWRITE:");
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(illegalStateException2.getMessage());
                ((StringBuilder)object2).append(":");
                ((StringBuilder)object2).append(this.q.D().name());
                ((StringBuilder)object2).append(":");
                boolean bl = this.h.t == null;
                ((StringBuilder)object2).append(bl);
                b8.g(((StringBuilder)object2).toString()).h();
                object2 = new ax.b3.j(illegalStateException2);
                throw object2;
            }
            this.q.u1(this.h);
            object = this.h;
            if (((e)object).w == null) {
                ax.c3.F.a(((e)object).v);
            }
            throw throwable2;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void C(com.voxdon.xplorer.file.n var1_1, ax.g3.i var2_12) throws ax.b3.j, ax.b3.a {
            block22: {
                block23: {
                    var14_20 = this.k;
                    var10_21 = null;
                    var11_22 = null;
                    var9_23 = null;
                    var12_24 = null;
                    var8_26 = var13_25 = null;
                    var3_27 = var14_20.getSize();
                    var5_28 = -1L;
                    if (var3_27 == -1L) {
                        var3_27 = var5_28;
                    }
                    var8_26 = var13_25;
                    var15_29 = this.h;
                    var8_26 = var13_25;
                    if (!var15_29.r) {
                        var8_26 = var13_25;
                        var15_29 = var15_29.q;
                        if (var15_29 == null) {
                            var8_26 = var13_25;
                            var8_26 = var13_25;
                            var8_26 = var13_25;
                            var1_1 = new StringBuilder();
                            var8_26 = var13_25;
                            var1_1.append("closed:");
                            var8_26 = var13_25;
                            var1_1.append(this.h.b);
                            var8_26 = var13_25;
                            var1_1.append(":");
                            var8_26 = var13_25;
                            var1_1.append(this.isCancelled());
                            var8_26 = var13_25;
                            var2_12 = new Exception(var1_1.toString());
                            var8_26 = var13_25;
                            ax.Q2.d.c("extractZipFileNull", (Throwable)var2_12);
                            var8_26 = var13_25;
                            if (this.isCancelled()) {
                                var8_26 = var13_25;
                                var8_26 = var13_25;
                                var1_1 = new ax.b3.a();
                                var8_26 = var13_25;
                                throw var1_1;
                            }
                            var8_26 = var13_25;
                            var8_26 = var13_25;
                            var1_1 = new ax.b3.j("zipFile is null");
                            var8_26 = var13_25;
                            throw var1_1;
                        }
                    } else {
                        var8_26 = var13_25;
                        var8_26 = var13_25 = com.voxdon.xplorer.file.b.Q0(var15_29.q, var14_20, var15_29.s);
                    }
                    var8_26 = var13_25;
                    var8_26 = var13_25 = var15_29.j(var14_20);
                    var9_23 = ax.W2.u.A0(this.q);
                    var10_21 = new U((InputStream)var8_26, var3_27);
                    var9_23.v0((com.voxdon.xplorer.file.n)var1_1, (G)var10_21, var1_1.s(), var3_27, var14_20.getTime(), null, false, this, (ax.g3.i)var2_12);
                    if (var8_26 == null) return;
                    try {
                        var8_26.close();
                        return;
                    }
                    catch (IOException var1_11) {
                        return;
                    }
                    catch (Throwable var1_5) {
                        break block22;
                    }
                    catch (ArrayIndexOutOfBoundsException var2_15) {
                        var1_1 = var8_26;
                        break block23;
                    }
                    catch (IOException var1_6) {
                        throw ax.b3.d.a("extract write error", (Exception)var1_8);
                    }
                    catch (ax.oc.a var1_7) {
                        throw ax.b3.d.a("extract write error", (Exception)var1_9);
                    }
                    catch (IllegalStateException var2_16) {
                        var1_1 = var8_26;
                        ** GOTO lbl114
                    }
                    catch (Throwable var1_2) {
                        break block22;
                    }
                    catch (ArrayIndexOutOfBoundsException var2_13) {
                        var1_1 = var10_21;
                    }
                    catch (IOException var1_3) {
                        var8_26 = var11_22;
                        throw ax.b3.d.a("extract write error", (Exception)var1_8);
                    }
                    catch (ax.oc.a var1_4) {
                        var8_26 = var9_23;
                        throw ax.b3.d.a("extract write error", (Exception)var1_9);
                    }
                    catch (IllegalStateException var2_14) {
                        var1_1 = var12_24;
                        ** GOTO lbl114
                    }
                }
                var8_26 = var1_1;
                {
                    var9_23 = ax.Ha.c.h().d("EOWF:");
                    var8_26 = var1_1;
                    var8_26 = var1_1;
                    var10_21 = new StringBuilder();
                    var8_26 = var1_1;
                    var10_21.append(var14_20.getSize());
                    var8_26 = var1_1;
                    var10_21.append(":");
                    var8_26 = var1_1;
                    var10_21.append(var14_20.getName());
                    var8_26 = var1_1;
                    var9_23.g(var10_21.toString()).h();
                    var8_26 = var1_1;
                    var8_26 = var1_1;
                    var9_23 = new ax.b3.j((Throwable)var2_17);
                    var8_26 = var1_1;
                    throw var9_23;
lbl114:
                    // 2 sources

                    var8_26 = var1_1;
                    var9_23 = ax.Ha.c.h().d("EXWRITE:");
                    var8_26 = var1_1;
                    var8_26 = var1_1;
                    var10_21 = new StringBuilder();
                    var8_26 = var1_1;
                    var10_21.append(var2_18.getMessage());
                    var8_26 = var1_1;
                    var10_21.append(":");
                    var8_26 = var1_1;
                    var10_21.append(this.q.D().name());
                    var8_26 = var1_1;
                    var10_21.append(":");
                    var8_26 = var1_1;
                    var7_30 = this.h.t == null;
                    var8_26 = var1_1;
                    var10_21.append(var7_30);
                    var8_26 = var1_1;
                    var9_23.g(var10_21.toString()).h();
                    var8_26 = var1_1;
                    var8_26 = var1_1;
                    var9_23 = new ax.b3.j((Throwable)var2_18);
                    var8_26 = var1_1;
                    throw var9_23;
                }
            }
            if (var8_26 == null) throw var1_10;
            try {
                var8_26.close();
            }
            catch (IOException var2_19) {
                throw var1_10;
            }
            throw var1_10;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private int F() {
            ax.b3.j j8222;
            Object object;
            int n8;
            Object object2;
            block42: {
                block43: {
                    block44: {
                        block41: {
                            block49: {
                                block50: {
                                    object2 = this.h;
                                    if (((e)object2).r && ((e)object2).s == null) {
                                        return 13;
                                    }
                                    if (this.q.C == null) {
                                        this.m = v.b.c0;
                                        return 0;
                                    }
                                    try {
                                        object2 = this.q;
                                        ax.W2.u.R0((u)object2, ((u)object2).w.z(this.q.C));
                                    }
                                    catch (ax.b3.j j9) {
                                        j9.printStackTrace();
                                    }
                                    if (this.q.B == null) {
                                        this.m = v.b.c0;
                                        return 0;
                                    }
                                    this.q.l0(false);
                                    object2 = this.h.a;
                                    n8 = d.a[((Enum)object2).ordinal()];
                                    if (n8 == 1) break block49;
                                    if (n8 == 2 || n8 == 3) break block50;
                                    if (n8 != 4) {
                                        if (n8 != 5) {
                                            ax.u3.b.f();
                                            break block41;
                                        } else if (this.j == null) {
                                            ax.u3.b.f();
                                            this.m = v.b.c0;
                                            return 0;
                                        }
                                        break block41;
                                    } else if (this.h.v == null || this.p == null) {
                                        ax.u3.b.f();
                                        this.m = v.b.c0;
                                        return 0;
                                    }
                                    break block41;
                                }
                                if (this.h.k == null) {
                                    ax.u3.b.f();
                                    this.m = v.b.c0;
                                    return 0;
                                }
                                break block41;
                            }
                            if (this.k == null) {
                                ax.u3.b.f();
                                this.m = v.b.c0;
                                return 0;
                            }
                        }
                        object = this.q.w.z(this.q.B.T());
                        if (object != null && !object.n() && !this.q.w.k((com.voxdon.xplorer.file.n)object, true)) {
                            this.m = v.b.c0;
                            return 0;
                        }
                        if (!this.n) break block42;
                        if (!this.q.B.n()) break block43;
                        if (!this.q.B.isDirectory()) {
                            return 2;
                        }
                        this.m = v.b.q;
                        if (object2 != t.a.q && object2 != t.a.e0 && object2 != t.a.f0 || (object = this.i) == null || (object = this.q.l1((ax.Ac.a)object)) == null) break block44;
                        this.q.H.add(new AbstractMap.SimpleEntry<com.voxdon.xplorer.file.n, Object>(this.q.B, object));
                    }
                    if (object2 != t.a.e0) return 0;
                    this.q.u1(this.h);
                    return 0;
                }
                if (object2 == t.a.q) {
                    if (!this.q.w.k(this.q.B, false)) {
                        this.m = v.b.c0;
                        return 0;
                    }
                    object2 = this.q.l1(this.k);
                    if (object2 != null) {
                        this.q.H.add(new AbstractMap.SimpleEntry<com.voxdon.xplorer.file.n, Object>(this.q.B, object2));
                    }
                    this.m = v.b.q;
                    return 0;
                }
                if (object2 == t.a.e0) {
                    if (!this.q.w.k(this.q.B, false)) {
                        this.m = v.b.c0;
                        return 0;
                    }
                    object2 = this.q.l1(this.p);
                    if (object2 != null) {
                        this.q.H.add(new AbstractMap.SimpleEntry<com.voxdon.xplorer.file.n, Object>(this.q.B, object2));
                    }
                    this.m = v.b.q;
                    this.q.u1(this.h);
                    return 0;
                }
                if (object2 != t.a.f0) {
                    ax.u3.b.f();
                    return 0;
                }
                if (!this.q.w.k(this.q.B, false)) {
                    this.m = v.b.c0;
                    return 0;
                }
                object2 = this.q.l1(this.j);
                if (object2 != null) {
                    this.q.H.add(new AbstractMap.SimpleEntry<com.voxdon.xplorer.file.n, Object>(this.q.B, object2));
                }
                this.m = v.b.q;
                return 0;
            }
            try {
                block47: {
                    block45: {
                        block46: {
                            if (!this.q.B.n()) break block45;
                            if (this.q.B.isDirectory()) {
                                return 2;
                            }
                            n8 = d.b[this.l.ordinal()];
                            if (n8 == 1) break block46;
                            if (n8 != 2) {
                                if (n8 == 3) {
                                    this.m = v.b.d0;
                                    return 0;
                                }
                                if (n8 == 4) {
                                    this.q.i();
                                    this.m = v.b.d0;
                                    return 0;
                                }
                                if (n8 == 5) return 1;
                                break block45;
                            } else {
                                object = this.q;
                                ax.W2.u.R0((u)object, ((u)object).w.X(this.q.B, false));
                            }
                            {
                                catch (ax.b3.j j8222) {
                                    break block47;
                                }
                            }
                        }
                        try {
                            this.q.w.P(this.q.B);
                            object = this.q;
                            ax.W2.u.R0((u)object, ((u)object).w.z(this.q.B.E()));
                        }
                        catch (ax.b3.j j10) {
                            this.m = v.b.c0;
                            return 0;
                        }
                    }
                    this.q.L.add(this.q.B.B());
                    this.y((t.a)((Object)object2), this.q.B, this.q.V());
                    this.m = v.b.q;
                    return 0;
                }
                this.q.q0(j8222);
            }
            catch (ax.b3.a a8) {
                block48: {
                    try {
                        this.q.w.P(this.q.B);
                        break block48;
                    }
                    catch (ax.b3.j j11) {}
                    catch (ax.b3.j j12) {
                        this.m = v.b.c0;
                        return 0;
                    }
                }
                this.m = v.b.c0;
            }
            if (!(j8222 instanceof F || j8222 instanceof s || j8222 instanceof I)) {
                ax.Ha.c.h().f().d("EXERR:").l(j8222).h();
            }
            j8222.printStackTrace();
            this.m = v.b.c0;
            return 0;
        }

        private void G(String object, ax.Ac.a a8, j.f f8) {
            this.k = null;
            this.p = null;
            this.j = null;
            if (a8 instanceof ax.Dc.I) {
                this.k = (ax.Dc.I)a8;
            } else if (a8 instanceof c) {
                this.p = (c)a8;
            } else if (a8 instanceof ax.Bc.l) {
                this.j = (ax.Bc.l)a8;
            }
            this.l = f8;
            this.i = a8;
            this.n = a8 != null ? a8.isDirectory() : false;
            this.o = object;
            object = this.i;
            if (object != null) {
                ax.W2.u.O0(this.q, d0.U(d0.R(this.h.g, object.getName())));
                this.q.w().U(this.q.m1(this.i));
            }
        }

        private boolean H() {
            Object object;
            int n8 = d.a[this.h.a.ordinal()];
            if (n8 != 1) {
                if (n8 != 4) {
                    if (n8 != 5) {
                        return false;
                    }
                } else {
                    c c8 = this.h.w;
                    if (c8 == null) {
                        return false;
                    }
                    this.G(c8.getName(), c8, this.q.o1());
                    return true;
                }
            }
            if ((object = this.h.t) != null && !((AbstractCollection)object).isEmpty()) {
                object = this.h.t.poll();
                this.G(object.getName(), (ax.Ac.a)object, this.q.o1());
                return true;
            }
            return false;
        }

        private void w() {
            c c8;
            e e8 = this.h;
            if (e8.a == t.a.e0 && (c8 = this.p) != null && e8.w == c8) {
                this.q.u1(e8);
            }
        }

        private void y(t.a a8, com.voxdon.xplorer.file.n n8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
            int n9 = d.a[a8.ordinal()];
            if (n9 != 1) {
                if (n9 != 2 && n9 != 3) {
                    if (n9 != 4) {
                        if (n9 != 5) {
                            ax.u3.b.f();
                            return;
                        }
                        this.A(n8, i8);
                        return;
                    }
                    this.B(n8, i8);
                    return;
                }
                this.z(n8, i8);
                return;
            }
            this.C(n8, i8);
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void z(com.voxdon.xplorer.file.n object, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
            RuntimeException var1_4;
            Object object2;
            block11: {
                Object object3;
                block12: {
                    Long l8;
                    try {
                        object2 = this.h.k;
                        l8 = object2 instanceof ax.Hc.a && (object2 = ((ax.Hc.a)object2).d()) != null && ((ax.Hc.b)object2).a() > 0L ? Long.valueOf(((ax.Hc.b)object2).a()) : null;
                    }
                    catch (Throwable throwable) {
                        object2 = null;
                        break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        object = null;
                        break block12;
                    }
                    object2 = object3 = this.h.k;
                    try {
                        o o8 = this.q.w;
                        object2 = object3;
                        object2 = object3;
                        U u8 = new U((InputStream)object3, -1L);
                        object2 = object3;
                        o8.v0((com.voxdon.xplorer.file.n)object, u8, object.s(), -1L, l8, null, false, this, i8);
                        if (object3 == null) return;
                    }
                    catch (Throwable throwable) {
                        break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        object = object3;
                        break block12;
                    }
                    try {
                        ((InputStream)object3).close();
                        this.h.k = null;
                        return;
                    }
                    catch (IOException iOException) {
                        return;
                    }
                }
                object2 = object;
                {
                    Throwable var2_9;
                    ax.Ha.c.h().f().d("Uncompressor runtime error").l((Throwable)var2_9).h();
                    object2 = object;
                    object2 = object;
                    object3 = new ax.b3.j((Throwable)var2_9);
                    object2 = object;
                    throw object3;
                }
            }
            if (object2 == null) throw var1_4;
            try {
                ((InputStream)object2).close();
                this.h.k = null;
                throw var1_4;
            }
            catch (IOException iOException) {
                throw var1_4;
            }
        }

        protected void D(Integer n8) {
            this.q.g0();
        }

        protected void E(Integer n8) {
            int n9 = n8;
            if (n9 != 0) {
                if (n9 != 1 && n9 != 2) {
                    if (n9 != 13) {
                        return;
                    }
                    this.h.t.push(this.k);
                    this.q.y1(this.h);
                    return;
                }
                this.q.w1(this.h, this.o, this.i, n8);
                return;
            }
            if (this.q.t() == 10) {
                this.q.o();
                return;
            }
            this.q.r1();
        }

        protected Integer x(Void ... object) {
            int n8;
            block5: {
                do {
                    if ((n8 = this.F()) != 0) {
                        this.q.l0(true);
                        return n8;
                    }
                    this.q.w().c(this.m, 1);
                    if (this.m == v.b.c0) {
                        if (!TextUtils.isEmpty((CharSequence)this.o)) {
                            this.q.w().b(this.o);
                        }
                        if (this.q.K == null && (object = this.h.d) != null) {
                            ax.W2.u.U0(this.q, (String)object);
                        }
                    }
                    if (this.isCancelled() || this.q.t() == 10) break block5;
                    this.w();
                } while (this.H());
                this.q.l0(true);
                return n8;
            }
            this.q.l0(true);
            return n8;
        }
    }

    private class g
    extends q<Void, Void, Integer> {
        final u h;

        g(u u8) {
            this.h = u8;
            super(q.e.f0);
        }

        protected Integer w(Void ... object) {
            for (Object object2 : this.h.H) {
                m m8;
                object = (com.voxdon.xplorer.file.n)object2.getKey();
                object2 = (Long)object2.getValue();
                if (!ax.c3.B.P((com.voxdon.xplorer.file.n)object) || !((m8 = this.h.w.u()) instanceof x)) continue;
                ((x)m8).d((y)object, (Long)object2);
            }
            return null;
        }

        protected void x(Integer n8) {
            this.h.o();
        }
    }

    private class h
    extends q<Void, Void, Boolean> {
        final u h;

        public h(u u8) {
            this.h = u8;
            super(q.e.f0);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private boolean A(e e8) {
            block41: {
                block43: {
                    Object object;
                    block44: {
                        block45: {
                            block42: {
                                block40: {
                                    Throwable throwable2;
                                    block39: {
                                        block33: {
                                            ZipException zipException2;
                                            block37: {
                                                IOException iOException2;
                                                block36: {
                                                    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2;
                                                    block35: {
                                                        RuntimeException runtimeException2;
                                                        block34: {
                                                            boolean bl;
                                                            block32: {
                                                                try {
                                                                    if (e8.c == null) break block32;
                                                                    this.D(e8);
                                                                    break block33;
                                                                }
                                                                catch (RuntimeException runtimeException2) {
                                                                    break block34;
                                                                }
                                                                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
                                                                    break block35;
                                                                }
                                                                catch (IOException iOException2) {
                                                                    break block36;
                                                                }
                                                                catch (ZipException zipException2) {
                                                                    break block37;
                                                                }
                                                            }
                                                            object = e8.f;
                                                            if (object != null && (bl = ((k)object).k0())) {
                                                                try {
                                                                    object = e8.f.e0(true);
                                                                    e8.c = object;
                                                                    e8.i = 0L;
                                                                    if (object == null) {
                                                                        return false;
                                                                    }
                                                                    this.D(e8);
                                                                }
                                                                catch (ax.b3.j j8) {
                                                                    return false;
                                                                }
                                                            }
                                                            object = e8.f;
                                                            if (!(object instanceof y)) {
                                                                ax.u3.b.f();
                                                                return false;
                                                            }
                                                            object = (y)object;
                                                            if (Q.F1() && (bl = ((y)object).d1())) {
                                                                try {
                                                                    object = this.y((y)object);
                                                                    e8.c = object;
                                                                    e8.i = 0L;
                                                                    if (object == null) {
                                                                        return false;
                                                                    }
                                                                    this.D(e8);
                                                                }
                                                                catch (ax.b3.j j9) {
                                                                    return false;
                                                                }
                                                            } else {
                                                                n n8;
                                                                object = ((y)object).F0();
                                                                e8.l = ((File)object).length();
                                                                e8.n = n8 = new n((File)object);
                                                                e8.m = true;
                                                            }
                                                            break block33;
                                                        }
                                                        runtimeException2.printStackTrace();
                                                        break block33;
                                                    }
                                                    arrayIndexOutOfBoundsException2.printStackTrace();
                                                    break block33;
                                                }
                                                iOException2.printStackTrace();
                                                break block33;
                                            }
                                            zipException2.printStackTrace();
                                        }
                                        if (e8.n == null) {
                                            return false;
                                        }
                                        try {
                                            while ((object = e8.n.F()) != null) {
                                                if (((ax.Bc.l)object).isDirectory()) continue;
                                                object = e8.n.u((ax.Bc.l)object);
                                                ((InputStream)object).read();
                                                ax.c3.F.a((AutoCloseable)object);
                                                break;
                                            }
                                        }
                                        catch (Throwable throwable2) {
                                            break block39;
                                        }
                                        catch (IOException iOException) {
                                            break block40;
                                        }
                                        catch (ax.zc.b b8) {
                                            break block41;
                                        }
                                        if (e8.m) break block42;
                                        object = e8.j;
                                        if (object == null) break block43;
                                        break block44;
                                    }
                                    if (!e8.m) {
                                        object = e8.j;
                                        if (object != null) {
                                            ax.c3.F.a((AutoCloseable)object);
                                            e8.j = null;
                                        }
                                    } else {
                                        ax.c3.F.a(e8.n);
                                    }
                                    e8.n = null;
                                    e8.m = false;
                                    throw throwable2;
                                }
                                if (!e8.m) break block45;
                            }
                            ax.c3.F.a(e8.n);
                            break block43;
                        }
                        object = e8.j;
                        if (object == null) break block43;
                    }
                    ax.c3.F.a((AutoCloseable)object);
                    e8.j = null;
                }
                e8.n = null;
                e8.m = false;
                return false;
            }
            if (e8.m) {
                ax.c3.F.a(e8.n);
            } else {
                FileInputStream fileInputStream = e8.j;
                if (fileInputStream != null) {
                    ax.c3.F.a(fileInputStream);
                    e8.j = null;
                }
            }
            e8.n = null;
            e8.m = false;
            return true;
        }

        private void D(e e8) throws IOException {
            Closeable closeable = new FileInputStream(e8.c.getFileDescriptor());
            e8.j = closeable;
            closeable = l.a((FileInputStream)closeable);
            e8.l = ((FileChannel)closeable).size();
            e8.n = e8.s != null ? new n((SeekableByteChannel)closeable, e8.s.toCharArray()) : new n((SeekableByteChannel)closeable);
            e8.m = false;
        }

        private void E(e e8) throws IOException {
            ax.u3.b.b(e8.c);
            Charset charset = ax.Dc.e.b(e8.c.getFileDescriptor());
            this.h.q1(e8);
            Closeable closeable = new FileInputStream(e8.c.getFileDescriptor());
            e8.j = closeable;
            closeable = l.a((FileInputStream)closeable);
            e8.l = ((FileChannel)closeable).size();
            e8.q = T.u0((SeekableByteChannel)closeable, charset.name());
            e8.p = false;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private boolean F(e e8) {
            ax.b3.j j82;
            block11: {
                com.voxdon.xplorer.file.n n8;
                try {
                    n8 = this.h.w.z(e8.g);
                    if (!n8.n()) {
                        if (!this.h.w.k(n8, false)) {
                            this.h.r0(140);
                            return false;
                        }
                        ax.W2.u.B0(this.h, true);
                    } else if (!n8.isDirectory()) {
                        this.h.r0(140);
                        return false;
                    }
                    n8 = e8.c;
                    if (n8 == null) break block11;
                }
                catch (ax.b3.j j82) {}
                try {
                    e8.i = ax.c3.B.g((ParcelFileDescriptor)n8);
                }
                catch (Exception exception) {}
            }
            int n9 = d.a[e8.a.ordinal()];
            if (n9 == 1) {
                return this.J(e8);
            }
            if (n9 == 2) return this.G(e8);
            if (n9 == 3) return this.G(e8);
            if (n9 == 4) {
                return this.I(e8);
            }
            if (n9 == 5) return this.H(e8);
            ax.u3.b.f();
            return false;
            this.h.q0(j82);
            return false;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private boolean G(e e8) {
            try {
                FileInputStream fileInputStream = this.x(e8);
                if (fileInputStream == null) {
                    return false;
                }
                e8.l = l.a(fileInputStream).size();
                Object object = e8.a;
                if (object == t.a.d0) {
                    object = new ax.Hc.a(fileInputStream);
                    e8.k = object;
                } else if (object == t.a.c0) {
                    object = new ax.Jc.a(fileInputStream);
                    e8.k = object;
                } else {
                    ax.u3.b.f();
                }
                this.h.w().h(e8.l);
                this.h.w().g(1);
                return true;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (Exception exception) {
                return false;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private boolean H(e e8) throws ax.b3.j {
            block28: {
                ZipException zipException2;
                block27: {
                    IOException iOException2;
                    block26: {
                        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2;
                        block25: {
                            RuntimeException runtimeException2;
                            block24: {
                                OutOfMemoryError outOfMemoryError2;
                                block23: {
                                    boolean bl;
                                    block22: {
                                        try {
                                            if (e8.s != null) break block22;
                                            e8.o = bl = this.A(e8);
                                            if (bl) {
                                                return false;
                                            }
                                            if (e8.c == null) break block22;
                                            this.h.q1(e8);
                                        }
                                        catch (OutOfMemoryError outOfMemoryError2) {
                                            break block23;
                                        }
                                        catch (RuntimeException runtimeException2) {
                                            break block24;
                                        }
                                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
                                            break block25;
                                        }
                                        catch (IOException iOException2) {
                                            break block26;
                                        }
                                        catch (ZipException zipException2) {
                                            break block27;
                                        }
                                    }
                                    if (e8.c != null) {
                                        this.D(e8);
                                        break block28;
                                    } else {
                                        Comparable<com.voxdon.xplorer.file.n> comparable = e8.f;
                                        if (comparable != null && (bl = ((k)comparable).k0())) {
                                            try {
                                                comparable = e8.f.e0(true);
                                                e8.c = comparable;
                                                e8.i = 0L;
                                                if (comparable == null) {
                                                    return false;
                                                }
                                                this.D(e8);
                                            }
                                            catch (ax.b3.j j8) {
                                                return false;
                                            }
                                        }
                                        comparable = e8.f;
                                        if (!(comparable instanceof y)) {
                                            ax.u3.b.f();
                                            return false;
                                        }
                                        comparable = (y)comparable;
                                        if (Q.F1() && (bl = ((y)comparable).d1())) {
                                            try {
                                                comparable = this.y((y)comparable);
                                                e8.c = comparable;
                                                e8.i = 0L;
                                                if (comparable == null) {
                                                    return false;
                                                }
                                                this.D(e8);
                                            }
                                            catch (ax.b3.j j9) {
                                                return false;
                                            }
                                        } else {
                                            n n8;
                                            n n9;
                                            comparable = ((y)comparable).F0();
                                            e8.l = ((File)comparable).length();
                                            e8.n = e8.s != null ? (n9 = new n((File)comparable, e8.s.toCharArray())) : (n8 = new n((File)comparable));
                                            e8.m = true;
                                        }
                                    }
                                    break block28;
                                }
                                ax.Q2.d.c("SevenZPrepare", outOfMemoryError2);
                                outOfMemoryError2.printStackTrace();
                                break block28;
                            }
                            runtimeException2.printStackTrace();
                            break block28;
                        }
                        arrayIndexOutOfBoundsException2.printStackTrace();
                        break block28;
                    }
                    iOException2.printStackTrace();
                    break block28;
                }
                zipException2.printStackTrace();
            }
            if (e8.n == null) {
                return false;
            }
            try {
                this.h.j1(e8, this);
                return true;
            }
            catch (ax.b3.a a8) {
                return false;
            }
        }

        /*
         * Loose catch block
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private boolean I(e e8) {
            Exception exception222;
            block13: {
                RuntimeException var1_6;
                Object object;
                block11: {
                    InputStream inputStream;
                    InputStream inputStream2;
                    block12: {
                        object = this.x(e8);
                        if (object == null) {
                            return false;
                        }
                        inputStream2 = this.z((FileInputStream)object, e8);
                        e8.l = l.a((FileInputStream)object).size();
                        object = null;
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream2);
                        inputStream = new ax.Cc.d(bufferedInputStream);
                        try {
                            while ((object = inputStream.p()) != null) {
                                this.h.w().h(((c)object).j());
                                this.h.w().g(1);
                            }
                        }
                        catch (Throwable throwable) {
                            object = inputStream;
                            break block11;
                        }
                        try {
                            ax.c3.F.a(inputStream);
                            if (e8.c == null) break block12;
                            this.h.q1(e8);
                            break block12;
                        }
                        catch (Throwable throwable) {
                            throw throwable;
                        }
                        catch (Exception exception222) {}
                        break block13;
                    }
                    if ((object = this.x(e8)) == null) {
                        return false;
                    }
                    inputStream = this.z((FileInputStream)object, e8);
                    object = new BufferedInputStream(inputStream);
                    inputStream2 = new ax.Cc.d((InputStream)object);
                    e8.v = inputStream2;
                    return this.h.u1(e8);
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                ax.c3.F.a((AutoCloseable)object);
                throw var1_6;
            }
            exception222.printStackTrace();
            return false;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private boolean J(e e8) {
            Object object;
            block19: {
                ZipException zipException2;
                block23: {
                    IOException iOException2;
                    block22: {
                        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2;
                        block21: {
                            RuntimeException runtimeException2;
                            block20: {
                                boolean bl;
                                block18: {
                                    try {
                                        if (e8.c == null) break block18;
                                        this.E(e8);
                                        break block19;
                                    }
                                    catch (RuntimeException runtimeException2) {
                                        break block20;
                                    }
                                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
                                        break block21;
                                    }
                                    catch (IOException iOException2) {
                                        break block22;
                                    }
                                    catch (ZipException zipException2) {
                                        break block23;
                                    }
                                }
                                object = e8.f;
                                if (object != null && (bl = ((k)object).k0())) {
                                    try {
                                        object = e8.f.e0(true);
                                        e8.c = object;
                                        e8.i = 0L;
                                        if (object == null) {
                                            return false;
                                        }
                                        this.E(e8);
                                    }
                                    catch (ax.b3.j j8) {
                                        return false;
                                    }
                                }
                                object = e8.f;
                                if (!(object instanceof y)) {
                                    ax.u3.b.f();
                                    return false;
                                }
                                object = (y)object;
                                if (Q.F1() && (bl = ((y)object).d1())) {
                                    try {
                                        object = this.y((y)object);
                                        e8.c = object;
                                        e8.i = 0L;
                                        if (object == null) {
                                            return false;
                                        }
                                        this.E(e8);
                                    }
                                    catch (ax.b3.j j9) {
                                        return false;
                                    }
                                } else {
                                    object = ((y)object).F0();
                                    Charset charset = ax.Dc.e.a((File)object);
                                    e8.l = ((File)object).length();
                                    e8.q = T.s0((File)object, charset.name());
                                    e8.p = true;
                                }
                                break block19;
                            }
                            runtimeException2.printStackTrace();
                            break block19;
                        }
                        arrayIndexOutOfBoundsException2.printStackTrace();
                        break block19;
                    }
                    iOException2.printStackTrace();
                    break block19;
                }
                zipException2.printStackTrace();
            }
            object = e8.q;
            if (object == null) {
                return false;
            }
            try {
                e8.r = com.voxdon.xplorer.file.b.d1((S)object, this);
                this.h.k1(e8, this);
                return true;
            }
            catch (ax.b3.a a8) {
                return false;
            }
        }

        private ParcelFileDescriptor y(y y8) throws ax.b3.j {
            return ((x)ax.c3.x.g(y8.E()).u()).U0(y8);
        }

        protected void B(Boolean bl) {
            this.h.g0();
        }

        protected void C(Boolean object) {
            if (((Boolean)object).booleanValue()) {
                ax.W2.u.E0(this.h, 0);
                this.h.k0();
                this.h.r1();
                return;
            }
            object = this.h.n1();
            if (((e)object).a == t.a.f0 && ((e)object).o && ((e)object).s == null) {
                this.h.x1((e)object);
                return;
            }
            this.h.g1((e)object);
            this.h.o();
        }

        protected Boolean w(Void ... object) {
            block7: {
                if (this.h.I == null) break block7;
                while (this.h.z < this.h.y.size()) {
                    block10: {
                        e e8;
                        block9: {
                            block8: {
                                e8 = this.h.n1();
                                object = e8.e;
                                if (!ax.c3.B.H((com.voxdon.xplorer.file.n)object)) break block8;
                                object = (k)object;
                                break block9;
                            }
                            if (!((com.voxdon.xplorer.file.n)object).N().exists()) break block10;
                            File file = ((com.voxdon.xplorer.file.n)object).N();
                            object = ax.c3.x.f(file);
                            try {
                                object = (y)((o)object).z(file.getAbsolutePath());
                            }
                            catch (ax.b3.j j8) {
                                return Boolean.FALSE;
                            }
                        }
                        e8.f = object;
                        if (!this.F(e8)) {
                            return Boolean.FALSE;
                        }
                        this.h.s1();
                        continue;
                    }
                    ax.u3.b.f();
                    return Boolean.FALSE;
                }
                return Boolean.TRUE;
            }
            return this.F(this.h.n1());
        }

        FileInputStream x(e object) throws IOException {
            if (((e)object).c != null) {
                return new FileInputStream(((e)object).c.getFileDescriptor());
            }
            k k8 = ((e)object).f;
            if (k8 != null && k8.k0()) {
                block10: {
                    try {
                        k8 = ((e)object).f.e0(true);
                        ((e)object).c = k8;
                        ((e)object).i = 0L;
                        if (k8 != null) break block10;
                        return null;
                    }
                    catch (ax.b3.j j8) {
                        return null;
                    }
                }
                object = new FileInputStream(((e)object).c.getFileDescriptor());
                return object;
            }
            k8 = ((e)object).f;
            if (k8 instanceof y) {
                k8 = (y)k8;
                if (Q.F1() && ((y)k8).d1()) {
                    block11: {
                        try {
                            k8 = this.y((y)k8);
                            ((e)object).c = k8;
                            ((e)object).i = 0L;
                            if (k8 != null) break block11;
                            return null;
                        }
                        catch (ax.b3.j j9) {
                            return null;
                        }
                    }
                    object = new FileInputStream(((e)object).c.getFileDescriptor());
                    return object;
                }
                return new FileInputStream(((y)k8).F0());
            }
            return null;
        }

        InputStream z(FileInputStream fileInputStream, e object) throws IOException {
            object = ((e)object).d;
            if (object == null) {
                ax.u3.b.f();
                return fileInputStream;
            }
            if (!((String)(object = ((String)object).toLowerCase(Locale.ROOT))).endsWith(".tar.xz") && !((String)object).endsWith(".txz")) {
                if (!((String)object).endsWith(".tar.gz") && !((String)object).endsWith(".tgz")) {
                    return fileInputStream;
                }
                return new ax.Hc.a(fileInputStream);
            }
            return new ax.Jc.a(fileInputStream);
        }
    }
}

