/*
 * Decompiled with CFR 0.152.
 */
package ax.i9;

import ax.Q8.g;
import ax.Q8.k;
import ax.T8.a;
import ax.Y8.d;
import ax.e9.f;
import ax.h9.e;
import ax.i9.a;
import ax.j9.c;
import ax.j9.e;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

public final class d {
    private static final TimeUnit w;
    private static final TimeUnit x;
    private static final ax.t9.b<e<?>, ax.h9.d<?, ?>> y;
    private static final boolean z;
    private Set<g> a = EnumSet.noneOf(g.class);
    private List<d.a<c>> b;
    private SocketFactory c;
    private Random d = new SecureRandom();
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
    private ax.t9.b<e<?>, ax.h9.d<?, ?>> p;
    private long q;
    private a r;
    private boolean s;
    private ax.T8.a t;
    private int u;
    private long v;

    static {
        boolean bl;
        TimeUnit timeUnit;
        w = timeUnit = TimeUnit.SECONDS;
        x = timeUnit;
        y = new ax.u9.c();
        try {
            Class.forName("android.os.Build");
            bl = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            bl = false;
        }
        z = bl;
    }

    private d() {
        this.b = new ArrayList<d.a<c>>();
    }

    private d(d d8) {
        this();
        this.a.addAll(d8.a);
        this.b.addAll(d8.b);
        this.c = d8.c;
        this.d = d8.d;
        this.e = d8.e;
        this.f = d8.f;
        this.g = d8.g;
        this.h = d8.h;
        this.j = d8.j;
        this.k = d8.k;
        this.l = d8.l;
        this.m = d8.m;
        this.n = d8.n;
        this.o = d8.o;
        this.q = d8.q;
        this.v = d8.v;
        this.p = d8.p;
        this.u = d8.u;
        this.i = d8.i;
        this.r = d8.r;
        this.s = d8.s;
        this.t = d8.t;
    }

    public static d A() {
        return ax.i9.d.z().a();
    }

    private static List<d.a<c>> E() {
        ArrayList<d.a<c>> arrayList = new ArrayList<d.a<c>>();
        if (!z) {
            try {
                arrayList.add((d.a)Class.forName("com.hierynomus.smbj.auth.SpnegoAuthenticator$Factory").getDeclaredConstructor(null).newInstance(null));
            }
            catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException exception) {
                throw new ax.k9.d(exception);
            }
        }
        arrayList.add(new e.a());
        return arrayList;
    }

    private static ax.d9.g F() {
        return new f();
    }

    static /* synthetic */ boolean c(d d8, boolean bl) {
        d8.g = bl;
        return bl;
    }

    static /* synthetic */ int d(d d8, int n8) {
        d8.k = n8;
        return n8;
    }

    static /* synthetic */ long e(d d8, long l8) {
        d8.l = l8;
        return l8;
    }

    static /* synthetic */ int f(d d8, int n8) {
        d8.m = n8;
        return n8;
    }

    static /* synthetic */ long g(d d8, long l8) {
        d8.n = l8;
        return l8;
    }

    static /* synthetic */ int h(d d8, int n8) {
        d8.o = n8;
        return n8;
    }

    static /* synthetic */ long i(d d8, long l8) {
        d8.q = l8;
        return l8;
    }

    static /* synthetic */ long j(d d8, long l8) {
        d8.v = l8;
        return l8;
    }

    static /* synthetic */ ax.t9.b k(d d8, ax.t9.b b8) {
        d8.p = b8;
        return b8;
    }

    static /* synthetic */ int l(d d8, int n8) {
        d8.u = n8;
        return n8;
    }

    static /* synthetic */ boolean n(d d8, boolean bl) {
        d8.s = bl;
        return bl;
    }

    static /* synthetic */ boolean o(d d8, boolean bl) {
        d8.h = bl;
        return bl;
    }

    static /* synthetic */ boolean p(d d8, boolean bl) {
        d8.i = bl;
        return bl;
    }

    static /* synthetic */ a q(d d8, a a8) {
        d8.r = a8;
        return a8;
    }

    static /* synthetic */ ax.T8.a r(d d8, ax.T8.a a8) {
        d8.t = a8;
        return a8;
    }

    static /* synthetic */ ax.d9.g s(d d8, ax.d9.g g8) {
        d8.j = g8;
        return g8;
    }

    static /* synthetic */ SocketFactory t(d d8, SocketFactory socketFactory) {
        d8.c = socketFactory;
        return socketFactory;
    }

    static /* synthetic */ UUID v(d d8, UUID uUID) {
        d8.e = uUID;
        return uUID;
    }

    static /* synthetic */ boolean y(d d8, boolean bl) {
        d8.f = bl;
        return bl;
    }

    public static b z() {
        return new b().e(UUID.randomUUID()).o(ax.i9.d.F()).s(new ax.b9.a()).q(false).p(true).g(false).k(false).c(0x100000).w(y).r(0L, w).i(ax.Q8.g.i0, ax.Q8.g.h0, ax.Q8.g.g0, ax.Q8.g.e0, ax.Q8.g.d0).b(ax.i9.d.E()).t(60L, x).d(ax.i9.a.d()).j(false);
    }

    public Set<k> B() {
        if (!ax.Q8.g.n(this.a)) {
            return EnumSet.noneOf(k.class);
        }
        EnumSet<k> enumSet = EnumSet.of(ax.Q8.k.e0);
        if (this.U()) {
            enumSet.add(ax.Q8.k.c0);
        }
        if (this.V()) {
            enumSet.add(ax.Q8.k.i0);
        }
        return enumSet;
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

    public List<d.a<c>> N() {
        return new ArrayList<d.a<c>>(this.b);
    }

    public Set<g> O() {
        return EnumSet.copyOf(this.a);
    }

    public int P() {
        return this.o;
    }

    public long Q() {
        return this.q;
    }

    public ax.t9.b<e<?>, ax.h9.d<?, ?>> R() {
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

    public static class b {
        private d a;
        private a.b b;

        b() {
            d d8;
            this.a = d8 = new d();
            this.b = ax.T8.a.f(d8.d);
        }

        public d a() {
            if (!this.a.a.isEmpty()) {
                if (this.a.f && !this.a.g) {
                    throw new IllegalStateException("If signing is required, it should also be enabled");
                }
                if (!this.a.g && ax.Q8.g.n(this.a.a)) {
                    throw new IllegalStateException("Signing cannot be disabled when using SMB3.x dialects");
                }
                if (this.a.s && !ax.Q8.g.n(this.a.a)) {
                    throw new IllegalStateException("If encryption is enabled, at least one dialect should be SMB3.x compatible");
                }
                ax.i9.d.r(this.a, this.b.a());
                return new d(this.a);
            }
            throw new IllegalStateException("At least one SMB dialect should be specified");
        }

        public b b(Iterable<d.a<c>> a8) {
            if (a8 != null) {
                this.a.b.clear();
                Iterator<d.a<c>> iterator = a8.iterator();
                while (iterator.hasNext()) {
                    a8 = iterator.next();
                    if (a8 != null) {
                        this.a.b.add(a8);
                        continue;
                    }
                    throw new IllegalArgumentException("Authenticator may not be null");
                }
                return this;
            }
            throw new IllegalArgumentException("Authenticators may not be null");
        }

        public b c(int n8) {
            if (n8 > 0) {
                return this.m(n8).x(n8).u(n8);
            }
            throw new IllegalArgumentException("Buffer size must be greater than zero");
        }

        public b d(a a8) {
            if (a8 != null) {
                ax.i9.d.q(this.a, a8);
                return this;
            }
            throw new IllegalArgumentException("Client GSSContext Config may not be null");
        }

        public b e(UUID uUID) {
            if (uUID != null) {
                ax.i9.d.v(this.a, uUID);
                return this;
            }
            throw new IllegalArgumentException("Client GUID may not be null");
        }

        public b f(long l8, TimeUnit timeUnit) {
            ax.i9.d.j(this.a, timeUnit.toMillis(l8));
            return this;
        }

        public b g(boolean bl) {
            ax.i9.d.o(this.a, bl);
            return this;
        }

        public b h(Iterable<g> object2) {
            if (object2 != null) {
                this.a.a.clear();
                Iterator iterator = object2.iterator();
                while (iterator.hasNext()) {
                    g g8 = (g)((Object)iterator.next());
                    if (g8 != null) {
                        this.a.a.add(g8);
                        continue;
                    }
                    throw new IllegalArgumentException("Dialect may not be null");
                }
                return this;
            }
            throw new IllegalArgumentException("Dialects may not be null");
        }

        public b i(g ... gArray) {
            return this.h(Arrays.asList(gArray));
        }

        public b j(boolean bl) {
            ax.i9.d.n(this.a, bl);
            return this;
        }

        public b k(boolean bl) {
            ax.i9.d.p(this.a, bl);
            return this;
        }

        public a.b l() {
            return this.b;
        }

        public b m(int n8) {
            if (n8 > 0) {
                ax.i9.d.d(this.a, n8);
                return this;
            }
            throw new IllegalArgumentException("Read buffer size must be greater than zero");
        }

        public b n(long l8, TimeUnit timeUnit) {
            ax.i9.d.e(this.a, timeUnit.toMillis(l8));
            return this;
        }

        public b o(ax.d9.g g8) {
            if (g8 != null) {
                ax.i9.d.s(this.a, g8);
                return this;
            }
            throw new IllegalArgumentException("Security provider may not be null");
        }

        public b p(boolean bl) {
            ax.i9.d.c(this.a, bl);
            return this;
        }

        public b q(boolean bl) {
            ax.i9.d.y(this.a, bl);
            return this;
        }

        public b r(long l8, TimeUnit timeUnit) {
            if (l8 >= 0L) {
                if ((l8 = timeUnit.toMillis(l8)) <= Integer.MAX_VALUE) {
                    ax.i9.d.l(this.a, (int)l8);
                    return this;
                }
                throw new IllegalArgumentException("Socket timeout should be less than 2147483647ms");
            }
            throw new IllegalArgumentException("Socket timeout should be either 0 (no timeout) or a positive value");
        }

        public b s(SocketFactory socketFactory) {
            if (socketFactory != null) {
                ax.i9.d.t(this.a, socketFactory);
                return this;
            }
            throw new IllegalArgumentException("Socket factory may not be null");
        }

        public b t(long l8, TimeUnit timeUnit) {
            return this.n(l8, timeUnit).y(l8, timeUnit).v(l8, timeUnit);
        }

        public b u(int n8) {
            if (n8 > 0) {
                ax.i9.d.h(this.a, n8);
                return this;
            }
            throw new IllegalArgumentException("Transact buffer size must be greater than zero");
        }

        public b v(long l8, TimeUnit timeUnit) {
            ax.i9.d.i(this.a, timeUnit.toMillis(l8));
            return this;
        }

        public b w(ax.t9.b<e<?>, ax.h9.d<?, ?>> b8) {
            if (b8 != null) {
                ax.i9.d.k(this.a, b8);
                return this;
            }
            throw new IllegalArgumentException("Transport layer factory may not be null");
        }

        public b x(int n8) {
            if (n8 > 0) {
                ax.i9.d.f(this.a, n8);
                return this;
            }
            throw new IllegalArgumentException("Write buffer size must be greater than zero");
        }

        public b y(long l8, TimeUnit timeUnit) {
            ax.i9.d.g(this.a, timeUnit.toMillis(l8));
            return this;
        }
    }
}

