/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import ax.J3.h;
import ax.M3.j;
import ax.M3.m;
import ax.P3.d;
import ax.P3.g;
import ax.P3.l;
import ax.P3.o;
import ax.P3.p;
import ax.P3.q;
import ax.P3.r;
import ax.P3.s;
import ax.P3.t;
import ax.P3.u;
import ax.P3.w;
import ax.X3.i;
import ax.l4.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class f<R>
implements d.a,
Runnable,
Comparable<f<?>>,
a.f {
    private ax.M3.a A0;
    private ax.N3.b<?> B0;
    private volatile ax.P3.d C0;
    private volatile boolean D0;
    private volatile boolean E0;
    private final List<Exception> c0;
    private final ax.l4.b d0;
    private final e e0;
    private final ax.b0.d<f<?>> f0;
    final d<?> g0;
    private final f h0;
    private ax.J3.e i0;
    ax.M3.h j0;
    private ax.J3.g k0;
    private l l0;
    int m0;
    int n0;
    ax.P3.h o0;
    j p0;
    final ax.P3.e<R> q = new ax.P3.e();
    private b<R> q0;
    private int r0;
    private h s0;
    private g t0;
    private long u0;
    private boolean v0;
    private Thread w0;
    ax.M3.h x0;
    private ax.M3.h y0;
    private Object z0;

    f(e e8, ax.b0.d<f<?>> d8) {
        this.c0 = new ArrayList<Exception>();
        this.d0 = ax.l4.b.a();
        this.g0 = new d();
        this.h0 = new f();
        this.e0 = e8;
        this.f0 = d8;
    }

    private int A() {
        return this.k0.ordinal();
    }

    private void C(String string, long l8) {
        this.D(string, l8, null);
    }

    private void D(String charSequence, long l8, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(" in ");
        stringBuilder.append(ax.k4.d.a(l8));
        stringBuilder.append(", load key: ");
        stringBuilder.append(this.l0);
        if (string != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(", ");
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "";
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append(", thread: ");
        stringBuilder.append(Thread.currentThread().getName());
        Log.v((String)"DecodeJob", (String)stringBuilder.toString());
    }

    private void E(s<R> s8, ax.M3.a a8) {
        this.O();
        this.q0.b(s8, a8);
    }

    private void F(s<R> s8, ax.M3.a a8) {
        Throwable throwable2;
        block8: {
            block7: {
                s<R> s9;
                if (s8 instanceof p) {
                    ((p)((Object)s8)).a();
                }
                if (this.g0.c()) {
                    s9 = r.c(s8);
                    s8 = s9;
                } else {
                    Object var4_5 = null;
                    s9 = s8;
                    s8 = var4_5;
                }
                this.E(s9, a8);
                this.s0 = h.f0;
                try {
                    if (!this.g0.c()) break block7;
                    this.g0.b(this.e0, this.p0);
                }
                catch (Throwable throwable2) {
                    break block8;
                }
            }
            if (s8 != null) {
                ((r)s8).e();
            }
            this.H();
            return;
        }
        if (s8 != null) {
            ((r)s8).e();
        }
        this.H();
        throw throwable2;
    }

    private void G() {
        this.O();
        o o8 = new o("Failed to load resource", new ArrayList<Exception>(this.c0));
        this.q0.a(o8);
        this.I();
    }

    private void H() {
        if (this.h0.b()) {
            this.K();
        }
    }

    private void I() {
        if (this.h0.c()) {
            this.K();
        }
    }

    private void K() {
        this.h0.e();
        this.g0.a();
        this.q.a();
        this.D0 = false;
        this.i0 = null;
        this.j0 = null;
        this.p0 = null;
        this.k0 = null;
        this.l0 = null;
        this.q0 = null;
        this.s0 = null;
        this.C0 = null;
        this.w0 = null;
        this.x0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.u0 = 0L;
        this.E0 = false;
        this.c0.clear();
        this.f0.a(this);
    }

    private void L() {
        boolean bl;
        block2: {
            this.w0 = Thread.currentThread();
            this.u0 = ax.k4.d.b();
            boolean bl2 = false;
            do {
                bl = bl2;
                if (this.E0) break block2;
                bl = bl2;
                if (this.C0 == null) break block2;
                bl = bl2 = this.C0.a();
                if (bl2) break block2;
                this.s0 = this.w(this.s0);
                this.C0 = this.u();
            } while (this.s0 != h.e0);
            this.h();
            return;
        }
        if ((this.s0 == h.g0 || this.E0) && !bl) {
            this.G();
        }
    }

    private <Data, ResourceType> s<R> M(Data object, ax.M3.a object2, q<Data, ResourceType, R> q8) throws o {
        j j8 = this.x((ax.M3.a)((Object)object2));
        object = this.i0.f().i(object);
        try {
            int n8 = this.m0;
            int n9 = this.n0;
            c c8 = new c(this, (ax.M3.a)((Object)object2));
            object2 = q8.a((ax.N3.c<Data>)object, j8, n8, n9, c8);
            return object2;
        }
        finally {
            object.b();
        }
    }

    private void N() {
        int n8 = a.a[this.t0.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    this.t();
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized run reason: ");
                stringBuilder.append((Object)this.t0);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.L();
            return;
        }
        this.s0 = this.w(h.q);
        this.C0 = this.u();
        this.L();
    }

    private void O() {
        this.d0.c();
        if (!this.D0) {
            this.D0 = true;
            return;
        }
        throw new IllegalStateException("Already notified");
    }

    private <Data> s<R> r(ax.N3.b<?> b8, Data object, ax.M3.a object2) throws o {
        Throwable throwable2;
        block4: {
            block3: {
                if (object == null) {
                    b8.b();
                    return null;
                }
                try {
                    long l8 = ax.k4.d.b();
                    object = this.s(object, (ax.M3.a)((Object)object2));
                    if (!Log.isLoggable((String)"DecodeJob", (int)2)) break block3;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Decoded result ");
                    ((StringBuilder)object2).append(object);
                    this.C(((StringBuilder)object2).toString(), l8);
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            b8.b();
            return object;
        }
        b8.b();
        throw throwable2;
    }

    private <Data> s<R> s(Data Data, ax.M3.a a8) throws o {
        return this.M(Data, a8, this.q.g(Data.getClass()));
    }

    private void t() {
        Object object;
        if (Log.isLoggable((String)"DecodeJob", (int)2)) {
            long l8 = this.u0;
            object = new StringBuilder();
            ((StringBuilder)object).append("data: ");
            ((StringBuilder)object).append(this.z0);
            ((StringBuilder)object).append(", cache key: ");
            ((StringBuilder)object).append(this.x0);
            ((StringBuilder)object).append(", fetcher: ");
            ((StringBuilder)object).append(this.B0);
            this.D("Retrieved data", l8, ((StringBuilder)object).toString());
        }
        try {
            object = this.r(this.B0, this.z0, this.A0);
        }
        catch (o o8) {
            o8.i(this.y0, this.A0);
            this.c0.add(o8);
            object = null;
        }
        if (object != null) {
            this.F((s<R>)object, this.A0);
        } else {
            this.L();
        }
    }

    private ax.P3.d u() {
        int n8 = a.b[this.s0.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 == 4) {
                        return null;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unrecognized stage: ");
                    stringBuilder.append((Object)this.s0);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                return new w(this.q, this);
            }
            return new ax.P3.a(this.q, this);
        }
        return new t(this.q, this);
    }

    private h w(h h8) {
        int n8 = a.b[h8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3 && n8 != 4) {
                    if (n8 == 5) {
                        if (this.o0.b()) {
                            return h.c0;
                        }
                        return this.w(h.c0);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unrecognized stage: ");
                    stringBuilder.append((Object)h8);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                return h.g0;
            }
            if (this.v0) {
                return h.g0;
            }
            return h.e0;
        }
        if (this.o0.a()) {
            return h.d0;
        }
        return this.w(h.d0);
    }

    private j x(ax.M3.a object) {
        j j8 = this.p0;
        if (Build.VERSION.SDK_INT < 26) {
            return j8;
        }
        ax.M3.i<Boolean> i8 = i.i;
        if (j8.c(i8) != null || object != ax.M3.a.e0 && !this.q.t()) {
            return j8;
        }
        object = new j();
        ((j)object).d(this.p0);
        ((j)object).e(i8, Boolean.TRUE);
        return object;
    }

    f<R> B(ax.J3.e e8, Object object, l l8, ax.M3.h h8, int n8, int n9, Class<?> clazz, Class<R> clazz2, ax.J3.g g8, ax.P3.h h9, Map<Class<?>, m<?>> map, boolean bl, boolean bl2, boolean bl3, j j8, b<R> b8, int n10) {
        this.q.r(e8, object, h8, n8, n9, h9, clazz, clazz2, g8, j8, map, bl, bl2, this.e0);
        this.i0 = e8;
        this.j0 = h8;
        this.k0 = g8;
        this.l0 = l8;
        this.m0 = n8;
        this.n0 = n9;
        this.o0 = h9;
        this.v0 = bl3;
        this.p0 = j8;
        this.q0 = b8;
        this.r0 = n10;
        this.t0 = g.q;
        return this;
    }

    void J(boolean bl) {
        if (this.h0.d(bl)) {
            this.K();
        }
    }

    boolean P() {
        h h8 = this.w(h.q);
        return h8 == h.c0 || h8 == h.d0;
        {
        }
    }

    @Override
    public void d(ax.M3.h h8, Object object, ax.N3.b<?> b8, ax.M3.a a8, ax.M3.h h9) {
        this.x0 = h8;
        this.z0 = object;
        this.B0 = b8;
        this.A0 = a8;
        this.y0 = h9;
        if (Thread.currentThread() != this.w0) {
            this.t0 = g.d0;
            this.q0.c(this);
            return;
        }
        ax.Y.u.a("DecodeJob.decodeFromRetrievedData");
        try {
            this.t();
            return;
        }
        finally {
            ax.Y.u.b();
        }
    }

    @Override
    public void h() {
        this.t0 = g.c0;
        this.q0.c(this);
    }

    @Override
    public void j(ax.M3.h h8, Exception exception, ax.N3.b<?> b8, ax.M3.a a8) {
        b8.b();
        exception = new o("Fetching data failed", exception);
        ((o)exception).j(h8, a8, b8.a());
        this.c0.add(exception);
        if (Thread.currentThread() != this.w0) {
            this.t0 = g.c0;
            this.q0.c(this);
            return;
        }
        this.L();
    }

    @Override
    public ax.l4.b l() {
        return this.d0;
    }

    public void p() {
        this.E0 = true;
        ax.P3.d d8 = this.C0;
        if (d8 != null) {
            d8.cancel();
        }
    }

    public int q(f<?> f8) {
        int n8;
        int n9 = n8 = this.A() - super.A();
        if (n8 == 0) {
            n9 = this.r0 - f8.r0;
        }
        return n9;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        Object object;
        Throwable throwable2;
        block12: {
            block13: {
                RuntimeException runtimeException2;
                block11: {
                    ax.N3.b<?> b8;
                    block9: {
                        block10: {
                            ax.Y.u.a("DecodeJob#run");
                            if (!this.E0) break block9;
                            this.G();
                            ax.N3.b<?> b9 = this.B0;
                            if (b9 == null) break block10;
                            b9.b();
                        }
                        ax.Y.u.b();
                        return;
                    }
                    try {
                        this.N();
                        b8 = this.B0;
                        if (b8 == null) break block11;
                    }
                    catch (Throwable throwable2) {
                        break block12;
                    }
                    catch (RuntimeException runtimeException2) {}
                    b8.b();
                }
                ax.Y.u.b();
                return;
                {
                    boolean bl;
                    if (Log.isLoggable((String)"DecodeJob", (int)3)) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("DecodeJob threw unexpectedly, isCancelled: ");
                        ((StringBuilder)object).append(this.E0);
                        ((StringBuilder)object).append(", stage: ");
                        ((StringBuilder)object).append((Object)this.s0);
                        Log.d((String)"DecodeJob", (String)((StringBuilder)object).toString(), (Throwable)runtimeException2);
                    }
                    if (this.s0 != h.f0) {
                        this.G();
                    }
                    if (!(bl = this.E0)) throw runtimeException2;
                    ax.N3.b<?> b10 = this.B0;
                    if (b10 == null) break block13;
                    b10.b();
                }
            }
            ax.Y.u.b();
            return;
        }
        object = this.B0;
        if (object != null) {
            object.b();
        }
        ax.Y.u.b();
        throw throwable2;
    }

    static interface b<R> {
        public void a(o var1);

        public void b(s<R> var1, ax.M3.a var2);

        public void c(f<?> var1);
    }

    private final class c<Z>
    implements g.a<Z> {
        private final ax.M3.a a;
        final f b;

        c(f f8, ax.M3.a a8) {
            this.b = f8;
            this.a = a8;
        }

        private Class<Z> b(s<Z> s8) {
            return s8.get().getClass();
        }

        @Override
        public s<Z> a(s<Z> object) {
            Object object2;
            block8: {
                block9: {
                    Object object3;
                    block12: {
                        Object object4;
                        block11: {
                            Class<Z> clazz;
                            block10: {
                                Object object5;
                                clazz = this.b((s<Z>)object);
                                object4 = this.a;
                                object2 = ax.M3.a.e0;
                                object3 = null;
                                if (object4 != object2) {
                                    object4 = this.b.q.o(clazz);
                                    object5 = this.b.i0;
                                    object2 = this.b;
                                    object2 = object4.b((Context)object5, object, ((f)object2).m0, ((f)object2).n0);
                                } else {
                                    object2 = object;
                                    object4 = null;
                                }
                                if (!object.equals(object2)) {
                                    object.recycle();
                                }
                                if (this.b.q.s((s<?>)object2)) {
                                    object = this.b.q.l(object2);
                                    object3 = object.b(this.b.p0);
                                } else {
                                    object5 = ax.M3.c.d0;
                                    object = object3;
                                    object3 = object5;
                                }
                                object5 = this.b;
                                boolean bl = ((f)object5).q.u(((f)object5).x0);
                                if (!this.b.o0.d(bl ^ true, this.a, (ax.M3.c)((Object)object3))) break block8;
                                if (object == null) break block9;
                                if (object3 != ax.M3.c.q) break block10;
                                object4 = this.b;
                                object4 = new ax.P3.b(((f)object4).x0, ((f)object4).j0);
                                break block11;
                            }
                            if (object3 != ax.M3.c.c0) break block12;
                            object3 = this.b;
                            object4 = new u(((f)object3).x0, ((f)object3).j0, ((f)object3).m0, ((f)object3).n0, (m<?>)object4, clazz, ((f)object3).p0);
                        }
                        object2 = r.c(object2);
                        this.b.g0.d((ax.M3.h)object4, object, object2);
                        return object2;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unknown strategy: ");
                    ((StringBuilder)object).append(object3);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                throw new h.d(object2.get().getClass());
            }
            return object2;
        }
    }

    private static class d<Z> {
        private ax.M3.h a;
        private ax.M3.l<Z> b;
        private r<Z> c;

        d() {
        }

        void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        void b(e object, j j8) {
            ax.Y.u.a("DecodeJob.encode");
            try {
                object = object.a();
                ax.M3.h h8 = this.a;
                ax.P3.c<r<Z>> c8 = new ax.P3.c<r<Z>>(this.b, this.c, j8);
                object.a(h8, c8);
                return;
            }
            finally {
                this.c.e();
                ax.Y.u.b();
            }
        }

        boolean c() {
            return this.c != null;
        }

        <X> void d(ax.M3.h h8, ax.M3.l<X> l8, r<X> r8) {
            this.a = h8;
            this.b = l8;
            this.c = r8;
        }
    }

    static interface e {
        public ax.R3.a a();
    }

    private static class f {
        private boolean a;
        private boolean b;
        private boolean c;

        f() {
        }

        private boolean a(boolean bl) {
            return (this.c || bl || this.b) && this.a;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean b() {
            synchronized (this) {
                this.b = true;
                return this.a(false);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean c() {
            synchronized (this) {
                this.c = true;
                return this.a(false);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean d(boolean bl) {
            synchronized (this) {
                this.a = true;
                return this.a(bl);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void e() {
            synchronized (this) {
                this.b = false;
                this.a = false;
                this.c = false;
                return;
            }
        }
    }

    private static final class g
    extends Enum<g> {
        public static final /* enum */ g c0;
        public static final /* enum */ g d0;
        private static final g[] e0;
        public static final /* enum */ g q;

        static {
            g g8;
            g g9;
            g g10;
            q = g10 = new g();
            c0 = g9 = new g();
            d0 = g8 = new g();
            e0 = new g[]{g10, g9, g8};
        }

        public static g valueOf(String string) {
            return Enum.valueOf(g.class, string);
        }

        public static g[] values() {
            return (g[])e0.clone();
        }
    }

    private static final class h
    extends Enum<h> {
        public static final /* enum */ h c0;
        public static final /* enum */ h d0;
        public static final /* enum */ h e0;
        public static final /* enum */ h f0;
        public static final /* enum */ h g0;
        private static final h[] h0;
        public static final /* enum */ h q;

        static {
            h h8;
            h h9;
            h h10;
            h h11;
            h h12;
            h h13;
            q = h13 = new h();
            c0 = h12 = new h();
            d0 = h11 = new h();
            e0 = h10 = new h();
            f0 = h9 = new h();
            g0 = h8 = new h();
            h0 = new h[]{h13, h12, h11, h10, h9, h8};
        }

        public static h valueOf(String string) {
            return Enum.valueOf(h.class, string);
        }

        public static h[] values() {
            return (h[])h0.clone();
        }
    }
}

