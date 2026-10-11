/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.Q8.C;
import ax.Q8.q;
import ax.Q8.s;
import ax.Q8.t;
import ax.Q8.z;
import ax.Z8.a;
import ax.a9.b;
import ax.l9.d;
import ax.l9.e;
import ax.l9.f;
import ax.l9.g;
import ax.l9.h;
import ax.l9.i;
import ax.l9.j;
import ax.l9.k;
import ax.l9.l;
import ax.l9.m;
import ax.l9.n;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class a
extends ax.k9.b<a>
implements Closeable,
ax.c9.c<ax.h9.e<?>>,
AutoCloseable {
    private static final ax.Xd.d s0 = ax.Xd.f.k(a.class);
    private static final c t0 = new c(new C(), new z(), new s(), new ax.O8.e());
    private ax.m9.c c0;
    private ax.l9.b d0;
    private m e0 = new m();
    private m f0 = new m();
    e g0 = new e();
    l h0;
    private ax.Q8.n i0 = new ax.Q8.n();
    private ax.p9.c j0;
    private final ax.i9.c k0;
    final ax.q9.b l0;
    private n m0;
    private f n0;
    private ax.i9.d o0;
    ax.c9.f<ax.h9.d<?, ?>> p0;
    private final ax.n9.c q0;
    private final ReentrantLock r0 = new ReentrantLock();

    public a(ax.i9.d d8, ax.i9.c c8, ax.n9.c c9, ax.q9.b b8) {
        this.o0 = d8;
        this.k0 = c8;
        this.p0 = d8.R().a(new ax.c9.b(new i(), this, t0), d8);
        this.q0 = c9;
        this.l0 = b8;
        this.F0();
    }

    /*
     * Unable to fully structure code
     */
    private int A(q var1_1, int var2_2) {
        var3_3 = this.L(var1_1.f());
        if (var3_3 > 1 && !this.d0.s()) {
            a.s0.g("Connection to {} does not support multi-credit requests.", this.A0());
            while (true) {
                var2_2 = 1;
                break;
            }
        } else if (var3_3 < var2_2) {
            var2_2 = var3_3;
        } else {
            if (var3_3 <= 1 || var2_2 <= 1) ** continue;
            --var2_2;
        }
        var1_1.k(var2_2);
        return var2_2;
    }

    private void F0() {
        this.q0.c(this);
        this.h0 = new l();
        if (this.o0.W()) {
            this.m0 = new g(this.o0.K());
        } else {
            s0.A("Signing is disabled for this connection.");
            this.m0 = new d();
        }
        this.n0 = new f(this.o0.K());
        this.c0 = new ax.m9.l(this.e0, this.n0).d(new ax.m9.f().d(new ax.m9.h(this.g0).d(new ax.m9.k(this.e0, this.m0).d(new ax.m9.g(this.h0).d(new ax.m9.e(this.g0).d(new ax.m9.j(this.i0, this.g0).d(new ax.m9.d().d(new ax.m9.b()))))))));
    }

    private int L(int n8) {
        return Math.abs((n8 - 1) / 65536) + 1;
    }

    @ax.jc.c
    private void T0(ax.n9.e e8) {
        this.e0.d(e8.a());
        s0.s("Session << {} >> logged off", e8.a());
    }

    public String A0() {
        return this.d0.i().f();
    }

    m C0() {
        return this.e0;
    }

    public void D0(ax.h9.e<?> e8) throws ax.c9.e {
        this.c0.a(e8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void F(boolean bl) throws IOException {
        if (!bl && !this.e()) {
            return;
        }
        if (!bl) {
            Iterator<ax.r9.b> iterator;
            block7: {
                try {
                    iterator = this.e0.a().iterator();
                    break block7;
                }
                catch (Throwable throwable) {}
                this.p0.b();
                s0.a("Closed connection to {}", this.A0());
                this.q0.b(new ax.n9.a(this.d0.i().f(), this.d0.i().c()));
                throw throwable;
            }
            while (iterator.hasNext()) {
                ax.r9.b b8 = iterator.next();
                try {
                    b8.close();
                }
                catch (IOException iOException) {
                    s0.m("Exception while closing session {}", b8.p(), iOException);
                }
            }
        }
        this.p0.b();
        s0.a("Closed connection to {}", this.A0());
        this.q0.b(new ax.n9.a(this.d0.i().f(), this.d0.i().c()));
    }

    public boolean G0() {
        return this.p0.a();
    }

    public void H(String string, int n8) throws IOException {
        if (!this.G0()) {
            this.p0.d(new InetSocketAddress(string, n8));
            this.d0 = new ax.l9.b(this.o0.C(), string, n8, this.o0);
            new j(this, this.o0, this.d0).h();
            this.n0.i(this.d0);
            this.j0 = new ax.p9.d(ax.p9.c.a);
            if (this.o0.U() && this.d0.q()) {
                this.j0 = new ax.p9.a(this.j0, this.o0.Q());
            }
            s0.a("Successfully connected to: {}", this.A0());
            return;
        }
        throw new IllegalStateException(String.format("This connection is already connected to %s", this.A0()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T extends q> Future<T> L0(q q8) throws ax.c9.e {
        Object object;
        block5: {
            block4: {
                Throwable throwable2;
                block3: {
                    int n8;
                    int n9;
                    block2: {
                        if (q8.g() instanceof ax.R8.a) break block4;
                        this.r0.lock();
                        try {
                            n9 = this.h0.a();
                            n8 = this.A(q8, n9);
                            if (n9 != 0) break block2;
                            s0.b("There are no credits left to send {}, will block until there are more credits available.", (Object)((t)q8.c()).h());
                        }
                        catch (Throwable throwable2) {
                            break block3;
                        }
                    }
                    object = this.h0.d(n8);
                    ((t)q8.c()).w(object[0]);
                    ((t)q8.c()).s(Math.max(512 - n9 - n8, n8));
                    s0.u("Granted {} (out of {}) credits to {}", n8, n9, q8);
                    this.r0.unlock();
                    object = new h(q8.g(), ((t)q8.c()).i(), UUID.randomUUID());
                    this.g0.e((h)object);
                    object = ((h)object).c(new b(this, (h)object, ((t)q8.c()).k()));
                    break block5;
                }
                this.r0.unlock();
                throw throwable2;
            }
            object = null;
        }
        this.p0.c(q8);
        return object;
    }

    <T extends q> T M0(q q8) throws ax.c9.e {
        return (T)((q)ax.a9.d.a(this.L0(q8), this.o0.Q(), TimeUnit.MILLISECONDS, ax.c9.e.q));
    }

    public int W() {
        l l8 = this.h0;
        if (l8 == null) {
            return 0;
        }
        return l8.a();
    }

    @Override
    public void a(Throwable object) {
        this.g0.b((Throwable)object);
        try {
            this.close();
            return;
        }
        catch (Exception exception) {
            object = exception.getClass().getSimpleName();
            s0.d("{} while closing connection on error, ignoring: {}", object, exception.getMessage());
            return;
        }
    }

    @Override
    public void close() throws IOException {
        this.F(false);
    }

    public ax.i9.c d0() {
        return this.k0;
    }

    public ax.l9.b o0() {
        return this.d0;
    }

    public ax.l9.c s0() {
        return this.d0.f();
    }

    m u0() {
        return this.f0;
    }

    public ax.r9.b v(ax.j9.b b8) {
        return new k(this, this.o0, new k.b(this){
            final a a;
            {
                this.a = a8;
            }

            @Override
            public ax.r9.b a(ax.j9.b b8) {
                a a8 = this.a;
                return new ax.r9.b(a8, a8.o0, b8, this.a.q0, this.a.j0, this.a.m0, this.a.n0);
            }
        }).c(b8);
    }

    private class b
    implements b.a {
        private h a;
        private long b;
        final a c;

        public b(a a8, h h8, long l8) {
            this.c = a8;
            this.a = h8;
            this.b = l8;
        }

        @Override
        public void cancel() {
            ax.R8.a a8 = new ax.R8.a(this.c.d0.f().a(), this.b, this.a.d(), this.a.a());
            try {
                this.c.e0.b(this.b).H(a8);
                return;
            }
            catch (ax.c9.e e8) {
                s0.t("Failed to send {}", a8);
                return;
            }
        }
    }

    private static class c
    implements ax.c9.a<ax.h9.e<?>> {
        private ax.c9.a<?>[] a;

        public c(ax.c9.a<?> ... aArray) {
            this.a = aArray;
        }

        @Override
        public boolean b(byte[] byArray) {
            ax.c9.a<?>[] aArray = this.a;
            int n8 = aArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!aArray[i8].b(byArray)) continue;
                return true;
            }
            return false;
        }

        public ax.h9.e<?> c(byte[] byArray) throws a.b, IOException {
            for (ax.c9.a<?> a8 : this.a) {
                if (!a8.b(byArray)) continue;
                return (ax.h9.e)a8.a(byArray);
            }
            throw new IOException("Unknown packet format received.");
        }
    }
}

