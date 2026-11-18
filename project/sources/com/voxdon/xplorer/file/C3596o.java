package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import ax.b3.C1486a;
import ax.b3.C1491f;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1835x;
import ax.c3.d0;
import ax.c3.i0;
import ax.c3.k0;
import ax.l3.AbstractC2465a;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.voxdon.xplorer.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: com.voxdon.xplorer.file.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3596o implements InterfaceC3584c {
    private static final Logger m = Logger.getLogger("FileManager.FileOperator");
    AbstractC3594m a;
    final String c;
    final Context d;
    final AtomicInteger b = new AtomicInteger(0);
    String e = HttpUrl.FRAGMENT_ENCODE_SET;
    String f = HttpUrl.FRAGMENT_ENCODE_SET;
    String g = HttpUrl.FRAGMENT_ENCODE_SET;
    String h = HttpUrl.FRAGMENT_ENCODE_SET;
    String i = HttpUrl.FRAGMENT_ENCODE_SET;
    String j = HttpUrl.FRAGMENT_ENCODE_SET;
    String k = HttpUrl.FRAGMENT_ENCODE_SET;
    String l = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: com.voxdon.xplorer.file.o$a */
    class a implements InterfaceC3584c.a {
        final /* synthetic */ AtomicBoolean a;
        final /* synthetic */ CountDownLatch b;

        a(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.a = atomicBoolean;
            this.b = countDownLatch;
        }

        @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
        public void B() {
        }

        @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
        public void T(boolean z, Object obj) {
            this.a.set(z);
            this.b.countDown();
        }
    }

    /* renamed from: com.voxdon.xplorer.file.o$b */
    public static class b extends AbstractC3199q<Long, Long, Long> {
        C3596o h;

        public b(C3596o c3596o) {
            super(AbstractC3199q.e.HIGH);
            this.h = c3596o;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Long g(Long... lArr) {
            this.h.l0();
            return null;
        }
    }

    public C3596o(Context context, AbstractC3594m abstractC3594m) {
        String str;
        this.d = context;
        this.a = abstractC3594m;
        try {
            str = context.getString(R.string.copy_postfix);
        } catch (IndexOutOfBoundsException unused) {
            str = " - Copy";
        }
        this.c = str;
    }

    private boolean a0() {
        return ax.T2.h.n0(T());
    }

    private boolean b0(AbstractC3595n abstractC3595n) {
        return ax.T2.h.n0(abstractC3595n.R());
    }

    private void d(C3596o c3596o, AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) throws C1495j, C1486a {
        boolean z;
        String E = abstractC3595n.E();
        AbstractC3595n n = C1809B.n(c3596o, abstractC3595n);
        Uri uri = null;
        try {
            if (abstractC3595n.p() == 0) {
                c3596o.P(abstractC3595n);
            } else {
                if (n.n()) {
                    c3596o.P(n);
                    n = c3596o.z(n.E());
                }
                c3596o.E(abstractC3595n, n, null, null);
            }
        } catch (C1495j e) {
            e.printStackTrace();
        }
        AbstractC3595n z2 = c3596o.z(E);
        if (z2.n()) {
            ax.Ha.c.h().f().d("MoveTempToDst 1").g(z2.P().I()).h();
            try {
                c3596o.P(z2);
                z = true;
            } catch (C1495j unused) {
                z = false;
            }
            AbstractC3595n z3 = c3596o.z(E);
            if (z3.n()) {
                if (z3.P() == ax.Q2.f.p0 && ax.X2.Q.V1()) {
                    try {
                        uri = ((C3605y) z3).N0();
                    } catch (ax.b3.r unused2) {
                    }
                    ax.Ha.c.h().f().d("MoveTempToDst 2-1").g(z3.P().I() + ":" + E + ":" + z3.p() + ":" + z + ":" + uri).h();
                } else {
                    ax.Ha.c.h().f().d("MoveTempToDst 2-2").g(z3.P().I() + ":" + E + ":" + z).h();
                }
                throw new C1495j("Could not delete and overwrite");
            }
            z2 = z3;
        }
        c3596o.E(abstractC3595n2, z2, null, null);
    }

    private void l(C3596o c3596o, AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) throws C1495j, C1486a {
        boolean z;
        String E = abstractC3595n.E();
        c3596o.P(abstractC3595n);
        AbstractC3595n z2 = c3596o.z(E);
        Uri uri = null;
        if (z2.n()) {
            ax.Ha.c.h().f().d("MoveTempToDst 1").g(z2.P().I()).h();
            try {
                c3596o.P(z2);
                z = true;
            } catch (C1495j unused) {
                z = false;
            }
            AbstractC3595n z3 = c3596o.z(E);
            if (z3.n()) {
                if (z3.P() == ax.Q2.f.p0 && ax.X2.Q.V1()) {
                    try {
                        uri = ((C3605y) z3).N0();
                    } catch (ax.b3.r unused2) {
                    }
                    ax.Ha.c.h().f().d("MoveTempToDst 2-1").g(z3.P().I() + ":" + E + ":" + z3.p() + ":" + z + ":" + uri).h();
                } else {
                    ax.Ha.c.h().f().d("MoveTempToDst 2-2").g(z3.P().I() + ":" + E + ":" + z).h();
                }
                throw new C1495j("Could not delete and overwrite");
            }
            z2 = z3;
        }
        c3596o.E(abstractC3595n2, z2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l0() {
        if (this.b.get() > 0) {
            this.b.getAndDecrement();
            if (this.b.get() == 0) {
                this.a.b();
                ax.Z2.b.k().d(T());
            }
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) throws IOException {
        return this.a.A(str, str2, str3);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return this.a.B(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (abstractC3595n.isDirectory()) {
            List<AbstractC3595n> C = this.a.C(abstractC3595n, fVar);
            if (u0(abstractC3595n)) {
                ax.Z2.b.k().m(abstractC3595n, C);
            }
            return C;
        }
        ax.Ha.c.h().f().d("FOLICH!!!").j().g(S().I() + ":" + abstractC3595n.n()).h();
        throw new C1495j("list children : fileinfo is not directory");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        ax.Z2.b.k().p(T(), abstractC3595n.T());
        ax.Z2.b.k().e(abstractC3595n);
        this.a.D(abstractC3595n, g, str, j, l, c3597p, z, interfaceC3185c, iVar);
        if (b0(abstractC3595n)) {
            ax.T2.h.T(abstractC3595n).b(abstractC3595n);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.c(S() == abstractC3595n.P());
        if (!C1809B.P(abstractC3595n)) {
            C3184b.c(abstractC3595n.P() == abstractC3595n2.P());
        }
        if (!abstractC3595n.n()) {
            ax.Ha.c.h().f().d("MV2").j().g(S().I()).h();
            throw new ax.b3.t("Source file not exists");
        }
        if (abstractC3595n2.n()) {
            ax.Ha.c.h().f().d("MV1").j().g(S().I()).h();
            throw new C1491f(abstractC3595n.isDirectory() != abstractC3595n2.isDirectory());
        }
        long Y = b0(abstractC3595n) ? ax.T2.h.T(abstractC3595n).Y(abstractC3595n) : 0L;
        try {
            this.a.E(abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
            if (b0(abstractC3595n)) {
                ax.T2.h.T(abstractC3595n).s(abstractC3595n, Y);
            }
            if (b0(abstractC3595n2)) {
                try {
                    AbstractC3595n z = abstractC3595n.R() != abstractC3595n2.R() ? C1835x.e(abstractC3595n2.R()).z(abstractC3595n2.E()) : z(abstractC3595n2.E());
                    ax.T2.h.T(z).b(z);
                } catch (C1495j unused) {
                }
            }
            ax.Z2.b.k().t(abstractC3595n);
            ax.Z2.b.k().p(abstractC3595n.R(), abstractC3595n.T());
            ax.Z2.b.k().p(abstractC3595n2.R(), abstractC3595n2.T());
            ax.Z2.b.k().e(abstractC3595n);
            ax.Z2.b.k().e(abstractC3595n2);
        } catch (Throwable th) {
            ax.Z2.b.k().t(abstractC3595n);
            ax.Z2.b.k().p(abstractC3595n.R(), abstractC3595n.T());
            ax.Z2.b.k().p(abstractC3595n2.R(), abstractC3595n2.T());
            ax.Z2.b.k().e(abstractC3595n);
            ax.Z2.b.k().e(abstractC3595n2);
            throw th;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n.isDirectory());
        if (abstractC3595n2.n()) {
            ax.Ha.c.h().d("CP1").j().g(S().I()).h();
            throw new C1495j("Target is aleady exist");
        }
        if (!abstractC3595n.n()) {
            ax.Ha.c.h().f().d("CP2").j().g(S().I()).h();
            throw new ax.b3.t("Source is not exist");
        }
        ax.Z2.b.k().p(abstractC3595n2.R(), abstractC3595n2.T());
        ax.Z2.b.k().e(abstractC3595n2);
        this.a.F(abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
        if (b0(abstractC3595n2)) {
            ax.T2.h.T(abstractC3595n2).b(abstractC3595n2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return this.a.G(str, str2);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        return this.a.H(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        long Y = b0(abstractC3595n) ? ax.T2.h.T(abstractC3595n).Y(abstractC3595n) : 0L;
        try {
            this.a.I(abstractC3595n);
            ax.Z2.b.k().s(T(), abstractC3595n.E());
            ax.Z2.b.k().p(T(), abstractC3595n.T());
            ax.Z2.b.k().e(abstractC3595n);
            if (b0(abstractC3595n)) {
                ax.T2.h.T(abstractC3595n).s(abstractC3595n, Y);
            }
        } catch (Throwable th) {
            ax.Z2.b.k().s(T(), abstractC3595n.E());
            ax.Z2.b.k().p(T(), abstractC3595n.T());
            ax.Z2.b.k().e(abstractC3595n);
            throw th;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        return this.a.J(abstractC3595n, j);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        this.a.K(activity, fragment, aVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return this.a.L();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        boolean N = this.a.N(abstractC3595n);
        if (N) {
            ax.Z2.b.k().p(T(), abstractC3595n.T());
            ax.Z2.b.k().e(abstractC3595n);
        }
        return N;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return this.a.O();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        long p = (!b0(abstractC3595n) || abstractC3595n.isDirectory()) ? 0L : abstractC3595n.p();
        try {
            this.a.P(abstractC3595n);
            ax.Z2.b.k().s(T(), abstractC3595n.E());
            ax.Z2.b.k().p(T(), abstractC3595n.T());
            ax.Z2.b.k().e(abstractC3595n);
            if (b0(abstractC3595n)) {
                ax.T2.h.T(abstractC3595n).s(abstractC3595n, p);
            }
        } catch (Throwable th) {
            ax.Z2.b.k().s(T(), abstractC3595n.E());
            ax.Z2.b.k().p(T(), abstractC3595n.T());
            ax.Z2.b.k().e(abstractC3595n);
            throw th;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return this.a.Q(abstractC3595n, abstractC3595n2);
    }

    public String R() {
        return this.i + ":" + this.j + ":" + this.k + ":" + this.l + " - " + this.e + ":" + this.f + ":" + this.g + ":" + this.h;
    }

    public ax.Q2.f S() {
        return this.a.u();
    }

    public ax.c3.K T() {
        return this.a.v();
    }

    public synchronized int U() {
        return this.b.get();
    }

    public String V() {
        return this.a.r();
    }

    public k0 W() throws C1495j {
        return this.a.y();
    }

    public AbstractC3595n X(AbstractC3595n abstractC3595n, boolean z) throws C1495j {
        int lastIndexOf;
        C3184b.c(S() == abstractC3595n.P());
        if (!abstractC3595n.n()) {
            return abstractC3595n;
        }
        String B = abstractC3595n.B();
        String T = abstractC3595n.T();
        boolean isDirectory = abstractC3595n.isDirectory();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (!isDirectory && (lastIndexOf = B.lastIndexOf(46)) > 0) {
            String substring = B.substring(0, lastIndexOf);
            str = B.substring(lastIndexOf);
            B = substring;
        }
        int i = 2;
        if (z) {
            String Q = d0.Q(T, B + this.c);
            AbstractC3595n z2 = z(Q + str);
            while (z2.n()) {
                z2 = z(Q + " (" + i + ")" + str);
                i++;
            }
            return z2;
        }
        String Q2 = d0.Q(T, B);
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(Q2);
            sb.append(" (");
            int i2 = i + 1;
            sb.append(i);
            sb.append(")");
            sb.append(str);
            AbstractC3595n z3 = z(sb.toString());
            if (!z3.n()) {
                return z3;
            }
            i = i2;
        }
    }

    public boolean Y() {
        if (u() instanceof C3604x) {
            return ((C3604x) u()).g1();
        }
        return false;
    }

    public boolean Z() {
        return this.a.V();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        return this.a.a();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
        this.a.b();
    }

    public boolean c0(AbstractC3595n abstractC3595n) {
        if (u0(abstractC3595n)) {
            return ax.Z2.b.k().f(abstractC3595n);
        }
        return false;
    }

    public boolean d0() {
        return this.a.Y();
    }

    public boolean e(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        if (C1809B.P(abstractC3595n) && C1809B.P(abstractC3595n2)) {
            return Q(abstractC3595n, abstractC3595n2);
        }
        if (C1809B.N(abstractC3595n, abstractC3595n2)) {
            return Q(abstractC3595n, abstractC3595n2);
        }
        return false;
    }

    public boolean e0(AbstractC3595n abstractC3595n) {
        return this.a.a0(abstractC3595n);
    }

    public void f(String str) {
        String path = Uri.parse(str).getPath();
        if (path == null) {
            return;
        }
        this.a.f(path);
    }

    public List<AbstractC3595n> f0(AbstractC3595n abstractC3595n) throws C1495j {
        return C(abstractC3595n, AbstractC3594m.f.NONE);
    }

    public void g() {
        this.a.g();
    }

    public List<AbstractC3595n> g0(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar, boolean z, boolean z2) throws C1495j {
        List<String> H1;
        if (c0(abstractC3595n)) {
            List<AbstractC3595n> g = ax.Z2.b.k().g(abstractC3595n);
            return (z && g != null && ax.Q2.f.g0(S())) ? ((C3601u) this.a).g2(abstractC3595n, g, true) : g;
        }
        List<AbstractC3595n> C = C(abstractC3595n, fVar);
        if (z2 && C != null && (u() instanceof C3604x)) {
            AbstractC3595n J0 = C3604x.J0(C);
            if (J0 != null && !J0.isDirectory() && (H1 = ((C3604x) u()).H1(J0)) != null) {
                for (String str : H1) {
                    for (AbstractC3595n abstractC3595n2 : C) {
                        if (str.equals(abstractC3595n2.B())) {
                            ((C3605y) abstractC3595n2).k1(C3605y.b.HIDDEN_DOTHIDDEN);
                        }
                    }
                }
            }
            for (AbstractC3595n abstractC3595n3 : C) {
                String f = ax.Z2.g.h().f(abstractC3595n3);
                if (f != null) {
                    ((C3605y) abstractC3595n3).k1(ax.Z2.g.c(f));
                }
            }
        }
        return C;
    }

    public void h(InterfaceC3584c.a aVar) {
        this.a.h(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148 A[Catch: j -> 0x014b, TRY_LEAVE, TryCatch #7 {j -> 0x014b, blocks: (B:62:0x013a, B:64:0x0148), top: B:61:0x013a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h0(com.voxdon.xplorer.file.AbstractC3595n r19, com.voxdon.xplorer.file.C3596o r20, com.voxdon.xplorer.file.AbstractC3595n r21, boolean r22, ax.u3.InterfaceC3185c r23, ax.g3.i r24) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3596o.h0(com.voxdon.xplorer.file.n, com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n, boolean, ax.u3.c, ax.g3.i):void");
    }

    public boolean i(long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        h(new a(atomicBoolean, countDownLatch));
        if (j == 0) {
            j = 20000;
        }
        try {
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        return atomicBoolean.get();
    }

    public boolean i0() {
        return this.a.c0();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(com.voxdon.xplorer.file.AbstractC3595n r17, com.voxdon.xplorer.file.C3596o r18, com.voxdon.xplorer.file.AbstractC3595n r19, boolean r20, boolean r21, boolean r22, ax.u3.InterfaceC3185c r23, ax.g3.i r24) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3596o.j(com.voxdon.xplorer.file.n, com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n, boolean, boolean, boolean, ax.u3.c, ax.g3.i):void");
    }

    public AbstractC2465a j0(String str, int i) throws C1495j {
        return this.a.e0(str, i);
    }

    public boolean k(AbstractC3595n abstractC3595n, boolean z) {
        if (z) {
            if (k(abstractC3595n, false)) {
                return true;
            }
            String T = abstractC3595n.T();
            if (d0.a.equals(T)) {
                return false;
            }
            AbstractC3595n z2 = z(T);
            return !z2.n() && k(z2, true) && k(abstractC3595n, false);
        }
        boolean M = this.a.M(abstractC3595n);
        if (M) {
            ax.Z2.b.k().p(T(), abstractC3595n.T());
            ax.Z2.b.k().e(abstractC3595n);
            if (a0()) {
                ax.T2.h.S(T()).b(z(abstractC3595n.E()));
            }
        }
        return M;
    }

    public synchronized void k0(boolean z) {
        try {
            if (this.b.get() == 0) {
                m.severe("OPEROATOR RELEASED MORE THAN RETAINED!!!!!");
                ax.Ha.c.h().d("REL").j().g(S().I() + ":" + R()).h();
            } else {
                this.l = this.k;
                this.k = this.j;
                this.j = this.i;
                this.i = "(" + this.b.get() + ") " + ax.Q2.a.g();
            }
            if (L()) {
                new b(this).i(new Long[0]);
            } else {
                l0();
                if (z && (u() instanceof C3604x)) {
                    C3604x c3604x = (C3604x) u();
                    if (c3604x.g1()) {
                        ax.X2.Q.a0();
                        c3604x.G0();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void m(AbstractC3595n abstractC3595n) throws C1495j {
        if (O()) {
            I(abstractC3595n);
            return;
        }
        if (!abstractC3595n.isDirectory()) {
            P(abstractC3595n);
            return;
        }
        Iterator<AbstractC3595n> it = f0(abstractC3595n).iterator();
        while (it.hasNext()) {
            m(it.next());
        }
        P(abstractC3595n);
    }

    public void m0(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        if (abstractC3595n2.n()) {
            throw new C1491f(abstractC3595n.isDirectory() != abstractC3595n2.isDirectory());
        }
        E(abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
    }

    public void n(ax.g3.i iVar) {
        if (u() instanceof C3604x) {
            ((C3604x) u()).E0(iVar);
        }
    }

    public synchronized void n0() {
        this.b.getAndIncrement();
        this.h = this.g;
        this.g = this.f;
        this.f = this.e;
        this.e = "(" + this.b.get() + ") " + ax.Q2.a.g();
    }

    public void o(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        this.a.m(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
    }

    public boolean o0() {
        return this.a.g0();
    }

    public void p(AbstractC3595n abstractC3595n, File file, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3596o f = C1835x.f(file);
        AbstractC3595n z = f.z(file.getAbsolutePath());
        if (z.n()) {
            f.P(z);
            z = f.z(file.getAbsolutePath());
        }
        j(abstractC3595n, f, z, System.currentTimeMillis() <= abstractC3595n.q(), false, false, interfaceC3185c, iVar);
    }

    public boolean p0() {
        return this.a.h0();
    }

    public void q(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        List<AbstractC3595n> g = ax.Z2.b.k().g(abstractC3595n);
        if (g == null) {
            g = C(abstractC3595n, fVar);
        }
        abstractC3595n.d0(g.size());
    }

    public boolean q0() {
        return this.a.i0();
    }

    public void r(AbstractC3595n abstractC3595n) throws C1495j {
        this.a.n(abstractC3595n);
    }

    public boolean r0() {
        return this.a instanceof i0;
    }

    public void s(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        abstractC3595n.d0(C(abstractC3595n, fVar).size());
    }

    public void s0(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        ax.Z2.b.k().p(T(), abstractC3595n.T());
        ax.Z2.b.k().e(abstractC3595n);
        this.a.j0(abstractC3595n, g, str, j, l, c3597p, z, interfaceC3185c, iVar);
        if (b0(abstractC3595n)) {
            ax.T2.h.T(abstractC3595n).b(abstractC3595n);
        }
    }

    public Context t() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t0(com.voxdon.xplorer.file.AbstractC3595n r15, com.voxdon.xplorer.file.C3596o r16, com.voxdon.xplorer.file.AbstractC3595n r17, ax.u3.InterfaceC3185c r18, ax.g3.i r19) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3596o.t0(com.voxdon.xplorer.file.n, com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n, ax.u3.c, ax.g3.i):void");
    }

    public AbstractC3594m u() {
        return this.a;
    }

    public boolean u0(AbstractC3595n abstractC3595n) {
        return ax.Q2.f.E0(S(), abstractC3595n);
    }

    public long v() throws C1495j {
        return this.a.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[Catch: j -> 0x0027, a -> 0x002a, TRY_ENTER, TryCatch #4 {a -> 0x002a, j -> 0x0027, blocks: (B:10:0x0023, B:13:0x002c, B:15:0x0040), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[Catch: j -> 0x0027, a -> 0x002a, TryCatch #4 {a -> 0x002a, j -> 0x0027, blocks: (B:10:0x0023, B:13:0x002c, B:15:0x0040), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v0(com.voxdon.xplorer.file.AbstractC3595n r13, ax.c3.G r14, java.lang.String r15, long r16, java.lang.Long r18, com.voxdon.xplorer.file.C3597p r19, boolean r20, ax.u3.InterfaceC3185c r21, ax.g3.i r22) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            r12 = this;
            r1 = 0
            boolean r0 = r13.n()     // Catch: ax.b3.C1495j -> L1a ax.b3.C1486a -> L1c
            r2 = 0
            if (r0 == 0) goto L1e
            boolean r0 = r12.o0()     // Catch: ax.b3.C1495j -> L1a ax.b3.C1486a -> L1c
            r3 = 1
            if (r0 == 0) goto L12
            r2 = r1
            r0 = 1
            goto L21
        L12:
            com.voxdon.xplorer.file.n r1 = ax.c3.C1809B.z(r12, r13)     // Catch: ax.b3.C1495j -> L1a ax.b3.C1486a -> L1c
            r2 = r1
            r0 = 1
        L18:
            r3 = 0
            goto L21
        L1a:
            r0 = move-exception
            goto L5b
        L1c:
            r0 = move-exception
            goto L5b
        L1e:
            r2 = r13
            r0 = 0
            goto L18
        L21:
            if (r3 == 0) goto L2c
            r12.s0(r13, r14, r15, r16, r18, r19, r20, r21, r22)     // Catch: ax.b3.C1495j -> L27 ax.b3.C1486a -> L2a
            return
        L27:
            r0 = move-exception
        L28:
            r1 = r2
            goto L5b
        L2a:
            r0 = move-exception
            goto L28
        L2c:
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r1.D(r2, r3, r4, r5, r7, r8, r9, r10, r11)     // Catch: ax.b3.C1495j -> L27 ax.b3.C1486a -> L2a
            if (r0 == 0) goto L5a
            java.lang.String r0 = r2.E()     // Catch: ax.b3.C1495j -> L27 ax.b3.C1486a -> L2a
            com.voxdon.xplorer.file.n r1 = r12.z(r0)     // Catch: ax.b3.C1495j -> L27 ax.b3.C1486a -> L2a
            boolean r0 = r1.n()     // Catch: ax.b3.C1495j -> L1a ax.b3.C1486a -> L1c
            if (r0 == 0) goto L52
            r12.l(r12, r13, r1)     // Catch: ax.b3.C1495j -> L1a ax.b3.C1486a -> L1c
            return
        L52:
            ax.b3.t r0 = new ax.b3.t     // Catch: ax.b3.C1495j -> L1a ax.b3.C1486a -> L1c
            java.lang.String r2 = "tmp file not exists"
            r0.<init>(r2)     // Catch: ax.b3.C1495j -> L1a ax.b3.C1486a -> L1c
            throw r0     // Catch: ax.b3.C1495j -> L1a ax.b3.C1486a -> L1c
        L5a:
            return
        L5b:
            if (r1 == 0) goto L60
            r12.P(r1)     // Catch: ax.b3.C1495j -> L60
        L60:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3596o.v0(com.voxdon.xplorer.file.n, ax.c3.G, java.lang.String, long, java.lang.Long, com.voxdon.xplorer.file.p, boolean, ax.u3.c, ax.g3.i):void");
    }

    public String w() {
        return this.a.r();
    }

    public ax.c3.G x(AbstractC3595n abstractC3595n) {
        return this.a.s(abstractC3595n);
    }

    public int y() {
        return this.a.t();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        if (d0.B(str)) {
            return this.a.z(str);
        }
        ax.Ha.c.h().f().b("GFI!!!").j().g(S().I() + ":" + str).h();
        throw new C1495j("Not normalzied path in getFileInfo param");
    }
}
