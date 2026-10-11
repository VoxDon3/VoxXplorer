package ax.i9;

import ax.Q8.g;
import ax.Q8.k;
import ax.T8.a;
import ax.Y8.d;
import ax.b9.C1725a;
import ax.e9.f;
import ax.h9.AbstractC2173d;
import ax.h9.AbstractC2174e;
import ax.j9.C2342e;
import ax.j9.InterfaceC2340c;
import ax.t9.InterfaceC3108b;
import ax.u9.C3223c;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* renamed from: ax.i9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2292d {
    private static final TimeUnit w;
    private static final TimeUnit x;
    private static final InterfaceC3108b<AbstractC2174e<?>, AbstractC2173d<?, ?>> y;
    private static final boolean z;
    private Set<g> a;
    private List<d.a<InterfaceC2340c>> b;
    private SocketFactory c;
    private Random d;
    private UUID e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private ax.d9.g j;
    private int k;
    private long l;
    private int m;
    private long n;
    private int o;
    private InterfaceC3108b<AbstractC2174e<?>, AbstractC2173d<?, ?>> p;
    private long q;
    private C2289a r;
    private boolean s;
    private ax.T8.a t;
    private int u;
    private long v;

    /* renamed from: ax.i9.d$b */
    public static class b {
        private C2292d a;
        private a.b b;

        b() {
            C2292d c2292d = new C2292d();
            this.a = c2292d;
            this.b = ax.T8.a.f(c2292d.d);
        }

        public C2292d a() {
            if (this.a.a.isEmpty()) {
                throw new IllegalStateException("At least one SMB dialect should be specified");
            }
            if (this.a.f && !this.a.g) {
                throw new IllegalStateException("If signing is required, it should also be enabled");
            }
            if (!this.a.g && g.n(this.a.a)) {
                throw new IllegalStateException("Signing cannot be disabled when using SMB3.x dialects");
            }
            if (this.a.s && !g.n(this.a.a)) {
                throw new IllegalStateException("If encryption is enabled, at least one dialect should be SMB3.x compatible");
            }
            this.a.t = this.b.a();
            return new C2292d();
        }

        public b b(Iterable<d.a<InterfaceC2340c>> iterable) {
            if (iterable == null) {
                throw new IllegalArgumentException("Authenticators may not be null");
            }
            this.a.b.clear();
            for (d.a<InterfaceC2340c> aVar : iterable) {
                if (aVar == null) {
                    throw new IllegalArgumentException("Authenticator may not be null");
                }
                this.a.b.add(aVar);
            }
            return this;
        }

        public b c(int i) {
            if (i > 0) {
                return m(i).x(i).u(i);
            }
            throw new IllegalArgumentException("Buffer size must be greater than zero");
        }

        public b d(C2289a c2289a) {
            if (c2289a == null) {
                throw new IllegalArgumentException("Client GSSContext Config may not be null");
            }
            this.a.r = c2289a;
            return this;
        }

        public b e(UUID uuid) {
            if (uuid == null) {
                throw new IllegalArgumentException("Client GUID may not be null");
            }
            this.a.e = uuid;
            return this;
        }

        public b f(long j, TimeUnit timeUnit) {
            this.a.v = timeUnit.toMillis(j);
            return this;
        }

        public b g(boolean z) {
            this.a.h = z;
            return this;
        }

        public b h(Iterable<g> iterable) {
            if (iterable == null) {
                throw new IllegalArgumentException("Dialects may not be null");
            }
            this.a.a.clear();
            for (g gVar : iterable) {
                if (gVar == null) {
                    throw new IllegalArgumentException("Dialect may not be null");
                }
                this.a.a.add(gVar);
            }
            return this;
        }

        public b i(g... gVarArr) {
            return h(Arrays.asList(gVarArr));
        }

        public b j(boolean z) {
            this.a.s = z;
            return this;
        }

        public b k(boolean z) {
            this.a.i = z;
            return this;
        }

        public a.b l() {
            return this.b;
        }

        public b m(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Read buffer size must be greater than zero");
            }
            this.a.k = i;
            return this;
        }

        public b n(long j, TimeUnit timeUnit) {
            this.a.l = timeUnit.toMillis(j);
            return this;
        }

        public b o(ax.d9.g gVar) {
            if (gVar == null) {
                throw new IllegalArgumentException("Security provider may not be null");
            }
            this.a.j = gVar;
            return this;
        }

        public b p(boolean z) {
            this.a.g = z;
            return this;
        }

        public b q(boolean z) {
            this.a.f = z;
            return this;
        }

        public b r(long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException("Socket timeout should be either 0 (no timeout) or a positive value");
            }
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Socket timeout should be less than 2147483647ms");
            }
            this.a.u = (int) millis;
            return this;
        }

        public b s(SocketFactory socketFactory) {
            if (socketFactory == null) {
                throw new IllegalArgumentException("Socket factory may not be null");
            }
            this.a.c = socketFactory;
            return this;
        }

        public b t(long j, TimeUnit timeUnit) {
            return n(j, timeUnit).y(j, timeUnit).v(j, timeUnit);
        }

        public b u(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Transact buffer size must be greater than zero");
            }
            this.a.o = i;
            return this;
        }

        public b v(long j, TimeUnit timeUnit) {
            this.a.q = timeUnit.toMillis(j);
            return this;
        }

        public b w(InterfaceC3108b<AbstractC2174e<?>, AbstractC2173d<?, ?>> interfaceC3108b) {
            if (interfaceC3108b == null) {
                throw new IllegalArgumentException("Transport layer factory may not be null");
            }
            this.a.p = interfaceC3108b;
            return this;
        }

        public b x(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Write buffer size must be greater than zero");
            }
            this.a.m = i;
            return this;
        }

        public b y(long j, TimeUnit timeUnit) {
            this.a.n = timeUnit.toMillis(j);
            return this;
        }
    }

    static {
        boolean z2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w = timeUnit;
        x = timeUnit;
        y = new C3223c();
        try {
            Class.forName("android.os.Build");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        z = z2;
    }

    public static C2292d A() {
        return z().a();
    }

    private static List<d.a<InterfaceC2340c>> E() {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            try {
                arrayList.add((d.a) Class.forName("com.hierynomus.smbj.auth.SpnegoAuthenticator$Factory").getDeclaredConstructor(null).newInstance(null));
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new ax.k9.d(e);
            }
        }
        arrayList.add(new C2342e.a());
        return arrayList;
    }

    private static ax.d9.g F() {
        return new f();
    }

    public static b z() {
        return new b().e(UUID.randomUUID()).o(F()).s(new C1725a()).q(false).p(true).g(false).k(false).c(1048576).w(y).r(0L, w).i(g.SMB_3_1_1, g.SMB_3_0_2, g.SMB_3_0, g.SMB_2_1, g.SMB_2_0_2).b(E()).t(60L, x).d(C2289a.d()).j(false);
    }

    public Set<k> B() {
        if (!g.n(this.a)) {
            return EnumSet.noneOf(k.class);
        }
        EnumSet of = EnumSet.of(k.SMB2_GLOBAL_CAP_LARGE_MTU);
        if (U()) {
            of.add(k.SMB2_GLOBAL_CAP_DFS);
        }
        if (V()) {
            of.add(k.SMB2_GLOBAL_CAP_ENCRYPTION);
        }
        return of;
    }

    public UUID C() {
        return this.e;
    }

    public long D() {
        return this.v;
    }

    public ax.T8.a G() {
        return this.t;
    }

    public Random H() {
        return this.d;
    }

    public int I() {
        return this.k;
    }

    public long J() {
        return this.l;
    }

    public ax.d9.g K() {
        return this.j;
    }

    public int L() {
        return this.u;
    }

    public SocketFactory M() {
        return this.c;
    }

    public List<d.a<InterfaceC2340c>> N() {
        return new ArrayList(this.b);
    }

    public Set<g> O() {
        return EnumSet.copyOf((Collection) this.a);
    }

    public int P() {
        return this.o;
    }

    public long Q() {
        return this.q;
    }

    public InterfaceC3108b<AbstractC2174e<?>, AbstractC2173d<?, ?>> R() {
        return this.p;
    }

    public int S() {
        return this.m;
    }

    public long T() {
        return this.n;
    }

    public boolean U() {
        return this.h;
    }

    public boolean V() {
        return this.s;
    }

    public boolean W() {
        return this.g;
    }

    public boolean X() {
        return this.f;
    }

    public boolean Y() {
        return this.i;
    }

    private C2292d() {
        this.a = EnumSet.noneOf(g.class);
        this.d = new SecureRandom();
        this.b = new ArrayList();
    }

    private C2292d(C2292d c2292d) {
        this();
        this.a.addAll(c2292d.a);
        this.b.addAll(c2292d.b);
        this.c = c2292d.c;
        this.d = c2292d.d;
        this.e = c2292d.e;
        this.f = c2292d.f;
        this.g = c2292d.g;
        this.h = c2292d.h;
        this.j = c2292d.j;
        this.k = c2292d.k;
        this.l = c2292d.l;
        this.m = c2292d.m;
        this.n = c2292d.n;
        this.o = c2292d.o;
        this.q = c2292d.q;
        this.v = c2292d.v;
        this.p = c2292d.p;
        this.u = c2292d.u;
        this.i = c2292d.i;
        this.r = c2292d.r;
        this.s = c2292d.s;
        this.t = c2292d.t;
    }
}
