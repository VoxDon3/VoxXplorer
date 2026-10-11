package com.voxdon.xplorer.file;

import android.system.ErrnoException;
import android.text.TextUtils;
import ax.Q8.EnumC0920d;
import ax.Q8.EnumC0921e;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1494i;
import ax.b3.C1495j;
import ax.b3.C1498m;
import ax.c3.d0;
import ax.c3.k0;
import ax.i9.C2291c;
import ax.i9.C2292d;
import ax.j9.C2339b;
import ax.l3.AbstractC2465a;
import ax.l9.C2483a;
import ax.l9.C2484b;
import ax.r9.C3016b;
import ax.s9.AbstractC3065b;
import ax.s9.C3066c;
import ax.s9.C3067d;
import ax.ta.C3109a;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.ua.C3225b;
import ax.za.EnumC3562c;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class O {
    private static final Logger i = Logger.getLogger("FileManager.Smb2Client");
    Q a;
    C2291c b;
    C3016b c;
    String d;
    boolean e;
    boolean f;
    boolean g;
    ConcurrentHashMap<String, Long> h = new ConcurrentHashMap<>();

    private static class c {
        String a;
        String b;

        c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        static c a(AbstractC3595n abstractC3595n) {
            return b(abstractC3595n.E());
        }

        static c b(String str) {
            if ("/".equals(str)) {
                return new c(null, null);
            }
            int indexOf = str.indexOf("/", 1);
            return indexOf < 0 ? new c(str.substring(1), null) : new c(str.substring(1, indexOf), O.m(str.substring(indexOf + 1)));
        }
    }

    static class d extends AbstractC2465a {
        private final boolean a = true;
        private final byte[] b = new byte[4096];
        private int c = -1;
        private long d = -1;
        private final C3067d e;

        d(C3067d c3067d) {
            this.e = c3067d;
        }

        private int f(long j, byte[] bArr, int i, int i2) {
            int i3 = (int) (j - this.d);
            int i4 = this.c - i3;
            if (i2 > i4) {
                i2 = i4;
            }
            System.arraycopy(this.b, i3, bArr, i, i2);
            return i2;
        }

        private boolean g(long j, int i) {
            long j2 = this.d;
            return j >= j2 && j + ((long) i) <= j2 + ((long) this.c);
        }

        private boolean h(int i) {
            return i <= 2048;
        }

        @Override // ax.l3.AbstractC2465a
        public void a() throws ErrnoException {
        }

        @Override // ax.l3.AbstractC2465a
        public long b() throws ErrnoException {
            return this.e.q().b().a();
        }

        @Override // ax.l3.AbstractC2465a
        public int c(long j, byte[] bArr, int i, int i2) throws ErrnoException {
            if (g(j, i2)) {
                return f(j, bArr, i, i2);
            }
            try {
                if (h(i2)) {
                    int L0 = this.e.L0(this.b, j, 0, 4096);
                    if (L0 < 0) {
                        return L0;
                    }
                    this.c = L0;
                    this.d = j;
                    try {
                        return f(j, bArr, i, i2);
                    } catch (ax.k9.d e) {
                        e = e;
                        throw com.voxdon.xplorer.provider.a.a(O.g(e), "onRead");
                    }
                }
                if (i2 <= 262144) {
                    return this.e.L0(bArr, j, i, i2);
                }
                int i3 = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    int L02 = this.e.L0(bArr, i3 + j, i + i3, Math.min(i2, 262144));
                    if (L02 < 0) {
                        if (i3 == 0) {
                            return L02;
                        }
                    } else {
                        if (L02 == 0) {
                            ax.Ha.c.h().f().b("SMB2 FILE READ LEN 0").h();
                            return i3;
                        }
                        i3 += L02;
                        i2 -= L02;
                    }
                }
                return i3;
            } catch (ax.k9.d e2) {
                e = e2;
            }
        }

        @Override // ax.l3.AbstractC2465a
        public void d() {
            try {
                this.e.close();
            } catch (ax.k9.d e) {
                e.printStackTrace();
            }
        }

        @Override // ax.l3.AbstractC2465a
        public long e(long j, byte[] bArr, int i, int i2) throws ErrnoException {
            try {
                return this.e.T0(bArr, j, i, i2);
            } catch (ax.k9.d e) {
                throw com.voxdon.xplorer.provider.a.a(O.g(e), "onWrite");
            }
        }
    }

    public O(Q q) {
        this.a = q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3067d A(C3016b c3016b, c cVar) throws IOException {
        return ((C3066c) c3016b.b(cVar.a)).e1(cVar.b, EnumSet.of(ax.J8.a.GENERIC_READ), null, ax.Q8.u.f0, EnumC0920d.FILE_OPEN, EnumSet.of(EnumC0921e.FILE_SEQUENTIAL_ONLY));
    }

    private AbstractC3065b B(C3016b c3016b, c cVar) {
        return ((C3066c) c3016b.b(cVar.a)).c1(cVar.b, EnumSet.of(ax.J8.a.FILE_WRITE_ATTRIBUTES, ax.J8.a.FILE_WRITE_EA, ax.J8.a.FILE_READ_ATTRIBUTES, ax.J8.a.FILE_READ_EA), null, ax.Q8.u.f0, EnumC0920d.FILE_OPEN, null);
    }

    private C3067d C(C3016b c3016b, c cVar) {
        return ((C3066c) c3016b.b(cVar.a)).e1(cVar.b, EnumSet.of(ax.J8.a.GENERIC_WRITE), null, ax.Q8.u.f0, EnumC0920d.FILE_CREATE, EnumSet.of(EnumC0921e.FILE_SEQUENTIAL_ONLY));
    }

    public static C3016b d(C2291c c2291c, boolean z, String str, int i2, C2339b c2339b) throws ax.k9.d, IOException, ax.b3.L {
        C2483a f = f(c2291c, str, i2);
        try {
            C3016b v = f.v(c2339b);
            String c2 = c2339b.c();
            C2484b o0 = f.o0();
            if (!v.v() || "GUEST".equalsIgnoreCase(c2) || "SMB2GUESTTESTACCOUNT".equalsIgnoreCase(c2) || o0 == null || !o0.l()) {
                return v;
            }
            v.close();
            i.severe("Bad user mapped to guest!");
            throw new ax.k9.d("Bad user mapped to guest!!");
        } catch (ax.Q8.F e) {
            if (z && e.a() == ax.K8.a.STATUS_INVALID_PARAMETER) {
                throw new ax.b3.L(e);
            }
            throw e;
        } catch (ax.T8.b e2) {
            throw new ax.k9.d(e2);
        }
    }

    private boolean e(P p) {
        if (this.b.e(p.e, p.f)) {
            long currentTimeMillis = System.currentTimeMillis();
            String str = p.e + ":" + p.f;
            Long l = this.h.get(str);
            if (l != null && currentTimeMillis - l.longValue() < 1500) {
                return true;
            }
            C2483a c2483a = null;
            try {
                c2483a = f(this.b, p.e, p.f);
                c2483a.F(false);
                if (c2483a.G0()) {
                    this.h.put(str, Long.valueOf(currentTimeMillis));
                }
                return c2483a.G0();
            } catch (ax.k9.d | IOException unused) {
                if (c2483a != null) {
                    try {
                        c2483a.F(true);
                    } catch (Exception unused2) {
                    }
                }
                i.severe("SMB2 connection check failed");
            }
        }
        return false;
    }

    public static C2483a f(C2291c c2291c, String str, int i2) throws ax.k9.d, IOException {
        try {
            return i2 > 0 ? c2291c.b(str, i2) : c2291c.a(str);
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw new IOException("SMB connect", e);
        }
    }

    public static C1495j g(Exception exc) {
        ax.Q8.F f = exc instanceof ax.Q8.F ? (ax.Q8.F) exc : ((exc instanceof IOException) && (exc.getCause() instanceof ax.Q8.F)) ? (ax.Q8.F) exc.getCause() : null;
        if (f != null) {
            ax.K8.a a2 = f.a();
            if (u(a2)) {
                return new ax.b3.t(exc);
            }
            if (t(a2)) {
                return new C1490e(exc);
            }
            if (a2 == ax.K8.a.STATUS_DISK_FULL) {
                return new ax.b3.s(exc);
            }
            if (a2 == ax.K8.a.STATUS_NOT_SAME_DEVICE) {
                return new C1498m(exc);
            }
            if (a2 == ax.K8.a.STATUS_BAD_NETWORK_NAME) {
                return new C1490e(exc);
            }
            if (a2 == ax.K8.a.STATUS_SHARING_VIOLATION) {
                return new ax.b3.z(String.format("%s (0x%08x)", a2.name(), Long.valueOf(a2.getValue())), exc);
            }
            if (a2 != null) {
                if (a2 != ax.K8.a.STATUS_OTHER) {
                    return new C1494i(String.format("%s (0x%08x)", a2.name(), Long.valueOf(a2.getValue())), exc);
                }
                return new C1495j("NtStatus : " + a2.getValue(), exc);
            }
        }
        return exc instanceof ConnectException ? new ax.b3.q(exc) : new C1495j(exc);
    }

    public static C2291c j(String str, boolean z, boolean z2) {
        C2292d.b z3 = C2292d.z();
        z3.k(z);
        if ("SMB3".equals(str)) {
            z3.i(ax.Q8.g.SMB_3_1_1, ax.Q8.g.SMB_3_0_2, ax.Q8.g.SMB_3_0);
            z3.j(true);
        } else if ("SMB2".equals(str)) {
            z3.i(ax.Q8.g.SMB_2_1, ax.Q8.g.SMB_2_0_2);
        } else {
            z3.j(true);
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        z3.r(35000L, timeUnit);
        z3.v(12500L, timeUnit);
        z3.n(15000L, timeUnit);
        z3.y(15000L, timeUnit);
        z3.f(3500L, timeUnit);
        z3.m(262144);
        z3.x(262144);
        z3.l().b(z2);
        return new C2291c(z3.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m(String str) {
        return str.replace('/', '\\');
    }

    public static C2339b n(String str, String str2, String str3) {
        return new C2339b(str2, str3 == null ? new char[0] : str3.toCharArray(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized C3016b r() throws ax.k9.d, IOException {
        C2291c c2291c;
        try {
            P x0 = this.a.x0();
            if (this.g && (c2291c = this.b) != null) {
                c2291c.close();
                this.b = null;
            }
            if (this.b == null) {
                this.b = j(this.d, this.e, this.f);
                this.g = false;
            }
            if (!e(x0)) {
                this.c = null;
            }
            C3016b c3016b = this.c;
            if (c3016b == null || c3016b.u() || this.c.isClosed() || !v(this.c.g(), x0.b)) {
                C3016b c3016b2 = this.c;
                if (c3016b2 != null && !c3016b2.isClosed()) {
                    try {
                        this.c.close();
                    } catch (ax.k9.d | IOException unused) {
                    }
                }
                try {
                    this.c = d(this.b, x0.i, x0.e, x0.f, x0.b);
                } catch (ax.b3.L e) {
                    if (e.getCause() instanceof ax.k9.d) {
                        throw ((ax.k9.d) e.getCause());
                    }
                    C3184b.f();
                    throw new ax.k9.d("not reachable");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    private static boolean t(ax.K8.a aVar) {
        return aVar == ax.K8.a.STATUS_ACCESS_DENIED || aVar == ax.K8.a.STATUS_LOGON_FAILURE;
    }

    private static boolean u(ax.K8.a aVar) {
        return aVar == ax.K8.a.STATUS_NO_SUCH_FILE || aVar == ax.K8.a.STATUS_OBJECT_NAME_INVALID || aVar == ax.K8.a.STATUS_OBJECT_NAME_NOT_FOUND || aVar == ax.K8.a.STATUS_OBJECT_PATH_NOT_FOUND;
    }

    private boolean v(C2339b c2339b, C2339b c2339b2) {
        if (c2339b == c2339b2) {
            return true;
        }
        return c2339b != null && c2339b2 != null && C3180B.j(c2339b.c(), c2339b2.c()) && C3180B.j(c2339b.b(), c2339b2.b()) && C3180B.j(c2339b.a(), c2339b2.a());
    }

    private C3067d y(C3016b c3016b, c cVar) {
        return ((C3066c) c3016b.b(cVar.a)).e1(cVar.b, EnumSet.of(ax.J8.a.GENERIC_WRITE), null, ax.Q8.u.f0, EnumC0920d.FILE_OVERWRITE_IF, EnumSet.of(EnumC0921e.FILE_SEQUENTIAL_ONLY));
    }

    private C3067d z(C3016b c3016b, c cVar, int i2) throws IOException, C1495j {
        EnumSet of;
        EnumC0920d enumC0920d;
        if ((536870912 & i2) != 0) {
            of = EnumSet.of(ax.J8.a.GENERIC_WRITE);
        } else if ((268435456 & i2) != 0) {
            of = EnumSet.of(ax.J8.a.GENERIC_READ);
        } else {
            if ((805306368 & i2) == 0) {
                throw new ax.b3.t("Not supported mode :" + i2);
            }
            of = EnumSet.of(ax.J8.a.GENERIC_READ, ax.J8.a.GENERIC_WRITE);
        }
        EnumSet enumSet = of;
        if ((67108864 & i2) != 0) {
            enumC0920d = EnumC0920d.FILE_OVERWRITE_IF;
        } else {
            if ((33554432 & i2) != 0) {
                throw new ax.b3.t("Not supported mode :" + i2);
            }
            enumC0920d = EnumC0920d.FILE_OPEN;
        }
        return ((C3066c) c3016b.b(cVar.a)).e1(cVar.b, enumSet, null, ax.Q8.u.f0, enumC0920d, EnumSet.of(EnumC0921e.FILE_RANDOM_ACCESS));
    }

    AbstractC2465a D(String str, int i2) throws C1495j {
        i.fine("Open SMB2 proxy file : " + str);
        try {
            C3016b r = r();
            c b2 = c.b(str);
            if (b2.b != null) {
                return new d(z(r, b2, i2));
            }
            throw new C1495j("SMB Share cannot be target");
        } catch (ax.Q8.F e) {
            e.printStackTrace();
            throw g(e);
        } catch (ax.k9.d e2) {
            e = e2;
            e.printStackTrace();
            throw C1489d.b("smb2 getoutputstream", e);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            throw C1489d.b("smb2 getoutputstream", e);
        }
    }

    public void E(AbstractC3595n abstractC3595n, long j) throws C1495j {
        try {
            try {
                C3016b r = r();
                c a2 = c.a(abstractC3595n);
                if (a2.b == null) {
                    throw new C1495j("SMB Share cannot be target");
                }
                AbstractC3065b B = B(r, a2);
                ax.J8.b bVar = ax.N8.e.f;
                B.o0(new ax.N8.e(bVar, bVar, ax.J8.b.d(j), bVar, 0L));
                try {
                    B.close();
                } catch (Exception unused) {
                }
            } finally {
            }
        } catch (ax.Q8.F e) {
            e.printStackTrace();
            throw g(e);
        } catch (ax.k9.d e2) {
            e = e2;
            Exception exc = e;
            exc.printStackTrace();
            throw C1489d.b("smb2 setLastModified", exc);
        } catch (IOException e3) {
            e = e3;
            Exception exc2 = e;
            exc2.printStackTrace();
            throw C1489d.b("smb2 setLastModified", exc2);
        }
    }

    public void F(String str, boolean z, boolean z2) {
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    public boolean h(AbstractC3595n abstractC3595n) {
        try {
            C3016b r = r();
            c b2 = c.b(abstractC3595n.E());
            if (b2.b == null) {
                return false;
            }
            C(r, b2).close();
            return true;
        } catch (ax.k9.d | IOException unused) {
            return false;
        }
    }

    public boolean i(AbstractC3595n abstractC3595n) {
        try {
            C3016b r = r();
            c b2 = c.b(abstractC3595n.E());
            if (b2.b == null) {
                return false;
            }
            ((C3066c) r.b(b2.a)).b1(b2.b);
            return true;
        } catch (ax.k9.d | IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void k(AbstractC3595n abstractC3595n) throws C1495j {
        try {
            C3016b r = r();
            c a2 = c.a(abstractC3595n);
            if (a2.b == null) {
                throw new C1495j("SMB Share cannot be deleted");
            }
            C3066c c3066c = (C3066c) r.b(a2.a);
            if (abstractC3595n.isDirectory()) {
                c3066c.i1(a2.b, false);
            } else {
                c3066c.h1(a2.b);
            }
        } catch (ax.Q8.F e) {
            throw g(e);
        } catch (ax.k9.d e2) {
            e = e2;
            throw new C1495j(e);
        } catch (IOException e3) {
            e = e3;
            throw new C1495j(e);
        }
    }

    void l() {
        C3016b c3016b = this.c;
        if (c3016b != null && !c3016b.isClosed()) {
            this.c.f();
        }
        this.g = true;
    }

    public S o(String str) throws C1495j {
        try {
            if ("/".equals(str)) {
                return S.g0(this.a, str);
            }
            C3016b r = r();
            c b2 = c.b(str);
            ax.s9.m b3 = r.b(b2.a);
            if (b3 instanceof C3066c) {
                return new S(this.a, str, ((C3066c) b3).L0(b2.b));
            }
            throw new C1495j("This type of share is not supported : " + b3.getClass().getName());
        } catch (ax.Q8.F e) {
            if (u(e.a())) {
                return S.f0(this.a, str, false);
            }
            e.printStackTrace();
            throw g(e);
        } catch (ax.k9.d e2) {
            e = e2;
            e.printStackTrace();
            throw C1489d.b("smb2 getfileinfo", e);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            throw C1489d.b("smb2 getfileinfo", e);
        } catch (IllegalArgumentException e4) {
            e = e4;
            e.printStackTrace();
            throw C1489d.b("smb2 getfileinfo", e);
        } catch (StringIndexOutOfBoundsException e5) {
            ax.Ha.c.h().f().b("SMB INVALID SHARENAME").g("path:" + str).h();
            throw C1489d.b("smb2 getfileinfo 2", e5);
        }
    }

    public InputStream p(AbstractC3595n abstractC3595n, long j) throws C1495j {
        try {
            c a2 = c.a(abstractC3595n);
            if (a2.b != null) {
                C3016b r = r();
                return new a(this, r, A(r, a2), a2, j, abstractC3595n.p());
            }
            ax.Ha.c.h().f().b("Invalid SMB File Path").j().g(abstractC3595n.E()).h();
            throw new C1495j("Invalid File Path!!");
        } catch (ax.Q8.F e) {
            e.printStackTrace();
            throw g(e);
        } catch (ax.k9.d e2) {
            e = e2;
            Exception exc = e;
            exc.printStackTrace();
            throw g(exc);
        } catch (IOException e3) {
            e = e3;
            Exception exc2 = e;
            exc2.printStackTrace();
            throw g(exc2);
        }
    }

    public OutputStream q(AbstractC3595n abstractC3595n, boolean z) throws C1495j {
        try {
            C3016b r = r();
            c a2 = c.a(abstractC3595n);
            if (a2.b != null) {
                return new b(r, z ? y(r, a2) : C(r, a2));
            }
            throw new C1495j("SMB Share cannot be target");
        } catch (ax.Q8.F e) {
            e.printStackTrace();
            throw g(e);
        } catch (ax.k9.d e2) {
            e = e2;
            e.printStackTrace();
            throw C1489d.b("smb2 getoutputstream", e);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            throw C1489d.b("smb2 getoutputstream", e);
        }
    }

    public k0 s(AbstractC3595n abstractC3595n) throws C1495j {
        try {
            C3016b r = r();
            String str = c.a(abstractC3595n).a;
            if (str == null) {
                throw new C1495j();
            }
            ax.N8.B Y0 = ((C3066c) r.b(str)).Y0();
            long b2 = Y0.b();
            return new k0(b2, b2 - Y0.a());
        } catch (ax.Q8.F e) {
            i.severe("SMBApiException:" + e.a());
            throw g(e);
        } catch (ax.k9.d e2) {
            e = e2;
            e.printStackTrace();
            throw new C1495j(e);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            throw new C1495j(e);
        } catch (ArrayIndexOutOfBoundsException e4) {
            e = e4;
            e.printStackTrace();
            throw new C1495j(e);
        } catch (ClassCastException e5) {
            e = e5;
            e.printStackTrace();
            throw new C1495j(e);
        } catch (IllegalArgumentException e6) {
            e = e6;
            e.printStackTrace();
            throw new C1495j(e);
        } catch (StringIndexOutOfBoundsException e7) {
            e = e7;
            e.printStackTrace();
            throw new C1495j(e);
        }
    }

    public List<AbstractC3595n> w(AbstractC3595n abstractC3595n) throws C1495j {
        try {
            C3016b r = r();
            ArrayList arrayList = new ArrayList();
            String E = abstractC3595n.E();
            if ("/".equals(E)) {
                for (C3225b c3225b : new C3109a(EnumC3562c.f0.h(r)).g()) {
                    if (c3225b.d() != 0 && c3225b.d() != Integer.MIN_VALUE) {
                    }
                    arrayList.add(S.g0(this.a, "/" + c3225b.b()));
                }
            } else {
                c a2 = c.a(abstractC3595n);
                for (ax.N8.m mVar : ((C3066c) r.b(a2.a)).Z0(a2.b)) {
                    String a3 = mVar.a();
                    if (!d0.C(a3) && !TextUtils.isEmpty(a3)) {
                        if (a3.endsWith("/")) {
                            ax.Ha.c.h().f().b("INVALID SMB2 FILENAME").g(a3).h();
                        } else {
                            arrayList.add(new S(this.a, d0.Q(E, a3), mVar));
                        }
                    }
                }
            }
            return arrayList;
        } catch (ax.Q8.F e) {
            i.severe("SMBApiException:" + e.a());
            throw g(e);
        } catch (ax.k9.d e2) {
            e = e2;
            e.printStackTrace();
            throw new C1495j(e);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            throw new C1495j(e);
        } catch (ArrayIndexOutOfBoundsException e4) {
            e = e4;
            e.printStackTrace();
            throw new C1495j(e);
        } catch (ClassCastException e5) {
            e = e5;
            e.printStackTrace();
            throw new C1495j(e);
        } catch (IllegalArgumentException e6) {
            e = e6;
            e.printStackTrace();
            throw new C1495j(e);
        } catch (StringIndexOutOfBoundsException e7) {
            e = e7;
            e.printStackTrace();
            throw new C1495j(e);
        }
    }

    public void x(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) throws C1495j {
        try {
            C3016b r = r();
            c a2 = c.a(abstractC3595n);
            if (a2.b == null) {
                throw new C1495j("SMB Share cannot be moved");
            }
            AbstractC3065b c1 = ((C3066c) r.b(a2.a)).c1(a2.b, EnumSet.of(ax.J8.a.FILE_READ_ATTRIBUTES, ax.J8.a.DELETE, ax.J8.a.SYNCHRONIZE), null, ax.Q8.u.f0, EnumC0920d.FILE_OPEN, null);
            try {
                c a3 = c.a(abstractC3595n2);
                if (a3.b == null) {
                    throw new C1495j("SMB Share cannot be target");
                }
                if (!a2.a.equals(a3.a)) {
                    throw new C1495j("SMB cannot move to different share!");
                }
                c1.A(a3.b, false);
                c1.close();
            } catch (Throwable th) {
                c1.close();
                throw th;
            }
        } catch (ax.Q8.F e) {
            throw g(e);
        } catch (ax.k9.d e2) {
            e = e2;
            throw new C1495j(e);
        } catch (IOException e3) {
            e = e3;
            throw new C1495j(e);
        }
    }

    static class b extends ax.c3.Y {
        C3067d c0;
        C3016b d0;

        b(C3016b c3016b, C3067d c3067d) {
            super(c3067d.F0(false));
            this.d0 = c3016b;
            this.c0 = c3067d;
        }

        @Override // ax.c3.Y, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                super.close();
                try {
                    this.c0.close();
                } catch (ax.k9.d e) {
                    e.printStackTrace();
                    throw new IOException(e);
                }
            } catch (ax.k9.d e2) {
                e2.printStackTrace();
                throw new IOException(e2);
            }
        }

        @Override // ax.c3.Y, java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (ax.k9.d e) {
                throw new IOException(e);
            }
        }

        @Override // ax.c3.Y, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            try {
                super.write(bArr);
            } catch (ax.k9.d e) {
                throw new IOException(e);
            }
        }

        @Override // ax.c3.Y, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                super.write(bArr, i, i2);
            } catch (ax.k9.d e) {
                throw new IOException(e);
            }
        }

        @Override // ax.c3.Y, java.io.OutputStream
        public void write(int i) throws IOException {
            try {
                super.write(i);
            } catch (ax.k9.d e) {
                throw new IOException(e);
            }
        }
    }

    static class a extends ax.c3.H {
        O c0;
        C3016b d0;
        C3067d e0;
        c f0;
        long g0;
        long h0;
        long i0;

        a(O o, C3016b c3016b, C3067d c3067d, c cVar, long j, long j2) {
            super(c3067d.u0(j, null, j2));
            this.d0 = c3016b;
            this.e0 = c3067d;
            this.f0 = cVar;
            this.c0 = o;
            this.g0 = j;
            this.i0 = j2;
        }

        private void b() throws IOException {
            try {
                C3016b r = this.c0.r();
                C3067d A = this.c0.A(r, this.f0);
                InputStream u0 = A.u0(this.g0, null, this.i0);
                u0.skip(this.h0);
                a(u0);
                this.e0 = A;
                this.d0 = r;
            } catch (ax.k9.d e) {
                throw new IOException(e);
            }
        }

        @Override // ax.c3.H, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                super.close();
                this.e0.close();
            } catch (ax.k9.d e) {
                throw new IOException(e);
            }
        }

        @Override // ax.c3.H, java.io.InputStream
        public int read() throws IOException {
            if (this.d0.isClosed() || !this.e0.p().q()) {
                b();
            }
            int read = super.read();
            if (read >= 0) {
                this.h0++;
            }
            return read;
        }

        @Override // ax.c3.H, java.io.InputStream
        public long skip(long j) throws IOException {
            long skip = super.skip(j);
            this.h0 += skip;
            return skip;
        }

        @Override // ax.c3.H, java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }

        @Override // ax.c3.H, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.d0.isClosed() || !this.e0.p().q()) {
                b();
            }
            int read = super.read(bArr, i, i2);
            if (read >= 0) {
                this.h0 += read;
            }
            return read;
        }
    }
}
