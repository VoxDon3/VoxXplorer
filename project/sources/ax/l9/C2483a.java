package ax.l9;

import ax.Q8.C;
import ax.Q8.q;
import ax.Q8.s;
import ax.Q8.z;
import ax.R8.C0967a;
import ax.Z8.a;
import ax.a9.AbstractFutureC1431a;
import ax.a9.C1432b;
import ax.c9.C1849b;
import ax.c9.InterfaceC1848a;
import ax.c9.InterfaceC1850c;
import ax.h9.AbstractC2173d;
import ax.h9.AbstractC2174e;
import ax.i9.C2291c;
import ax.i9.C2292d;
import ax.j9.C2339b;
import ax.k9.C2414b;
import ax.l9.k;
import ax.m9.C2538b;
import ax.m9.C2540d;
import ax.m9.C2541e;
import ax.m9.C2542f;
import ax.m9.C2543g;
import ax.m9.InterfaceC2539c;
import ax.n9.C2624a;
import ax.n9.C2626c;
import ax.n9.C2628e;
import ax.p9.C2783a;
import ax.p9.C2786d;
import ax.p9.InterfaceC2785c;
import ax.q9.C2890b;
import ax.r9.C3016b;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ax.l9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2483a extends C2414b<C2483a> implements Closeable, InterfaceC1850c<AbstractC2174e<?>>, AutoCloseable {
    private static final ax.Xd.d s0 = ax.Xd.f.k(C2483a.class);
    private static final c t0 = new c(new C(), new z(), new s(), new ax.O8.e());
    private InterfaceC2539c c0;
    private C2484b d0;
    l h0;
    private InterfaceC2785c j0;
    private final C2291c k0;
    final C2890b l0;
    private n m0;
    private C2488f n0;
    private C2292d o0;
    ax.c9.f<AbstractC2173d<?, ?>> p0;
    private final C2626c q0;
    private m e0 = new m();
    private m f0 = new m();
    C2487e g0 = new C2487e();
    private ax.Q8.n i0 = new ax.Q8.n();
    private final ReentrantLock r0 = new ReentrantLock();

    /* renamed from: ax.l9.a$a, reason: collision with other inner class name */
    class C0364a implements k.b {
        C0364a() {
        }

        @Override // ax.l9.k.b
        public C3016b a(C2339b c2339b) {
            C2483a c2483a = C2483a.this;
            return new C3016b(c2483a, c2483a.o0, c2339b, C2483a.this.q0, C2483a.this.j0, C2483a.this.m0, C2483a.this.n0);
        }
    }

    /* renamed from: ax.l9.a$b */
    private class b implements C1432b.a {
        private h a;
        private long b;

        public b(h hVar, long j) {
            this.a = hVar;
            this.b = j;
        }

        @Override // ax.a9.C1432b.a
        public void cancel() {
            C0967a c0967a = new C0967a(C2483a.this.d0.f().a(), this.b, this.a.d(), this.a.a());
            try {
                C2483a.this.e0.b(Long.valueOf(this.b)).H(c0967a);
            } catch (ax.c9.e unused) {
                C2483a.s0.t("Failed to send {}", c0967a);
            }
        }
    }

    /* renamed from: ax.l9.a$c */
    private static class c implements InterfaceC1848a<AbstractC2174e<?>> {
        private InterfaceC1848a<?>[] a;

        public c(InterfaceC1848a<?>... interfaceC1848aArr) {
            this.a = interfaceC1848aArr;
        }

        @Override // ax.c9.InterfaceC1848a
        public boolean b(byte[] bArr) {
            for (InterfaceC1848a<?> interfaceC1848a : this.a) {
                if (interfaceC1848a.b(bArr)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ax.c9.InterfaceC1848a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC2174e<?> a(byte[] bArr) throws a.b, IOException {
            for (InterfaceC1848a<?> interfaceC1848a : this.a) {
                if (interfaceC1848a.b(bArr)) {
                    return (AbstractC2174e) interfaceC1848a.a(bArr);
                }
            }
            throw new IOException("Unknown packet format received.");
        }
    }

    public C2483a(C2292d c2292d, C2291c c2291c, C2626c c2626c, C2890b c2890b) {
        this.o0 = c2292d;
        this.k0 = c2291c;
        this.p0 = c2292d.R().a(new C1849b<>(new i(), this, t0), c2292d);
        this.q0 = c2626c;
        this.l0 = c2890b;
        F0();
    }

    private int A(q qVar, int i) {
        int L = L(qVar.f());
        if (L <= 1 || this.d0.s()) {
            if (L >= i) {
                if (L > 1 && i > 1) {
                    L = i - 1;
                }
            }
            qVar.k(L);
            return L;
        }
        s0.g("Connection to {} does not support multi-credit requests.", A0());
        L = 1;
        qVar.k(L);
        return L;
    }

    private void F0() {
        this.q0.c(this);
        this.h0 = new l();
        if (this.o0.W()) {
            this.m0 = new C2489g(this.o0.K());
        } else {
            s0.A("Signing is disabled for this connection.");
            this.m0 = new C2486d();
        }
        this.n0 = new C2488f(this.o0.K());
        this.c0 = new ax.m9.l(this.e0, this.n0).d(new C2542f().d(new ax.m9.h(this.g0).d(new ax.m9.k(this.e0, this.m0).d(new C2543g(this.h0).d(new C2541e(this.g0).d(new ax.m9.j(this.i0, this.g0).d(new C2540d().d(new C2538b()))))))));
    }

    private int L(int i) {
        return Math.abs((i - 1) / 65536) + 1;
    }

    @ax.jc.c
    private void T0(C2628e c2628e) {
        this.e0.d(Long.valueOf(c2628e.a()));
        s0.s("Session << {} >> logged off", Long.valueOf(c2628e.a()));
    }

    public String A0() {
        return this.d0.i().f();
    }

    m C0() {
        return this.e0;
    }

    @Override // ax.c9.InterfaceC1850c
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public void b(AbstractC2174e<?> abstractC2174e) throws ax.c9.e {
        this.c0.a(abstractC2174e);
    }

    public void F(boolean z) throws IOException {
        if (z || e()) {
            if (!z) {
                try {
                    for (C3016b c3016b : this.e0.a()) {
                        try {
                            c3016b.close();
                        } catch (IOException e) {
                            s0.m("Exception while closing session {}", Long.valueOf(c3016b.p()), e);
                        }
                    }
                } finally {
                    this.p0.b();
                    s0.a("Closed connection to {}", A0());
                    this.q0.b(new C2624a(this.d0.i().f(), this.d0.i().c()));
                }
            }
        }
    }

    public boolean G0() {
        return this.p0.a();
    }

    public void H(String str, int i) throws IOException {
        if (G0()) {
            throw new IllegalStateException(String.format("This connection is already connected to %s", A0()));
        }
        this.p0.d(new InetSocketAddress(str, i));
        this.d0 = new C2484b(this.o0.C(), str, i, this.o0);
        new j(this, this.o0, this.d0).h();
        this.n0.i(this.d0);
        this.j0 = new C2786d(InterfaceC2785c.a);
        if (this.o0.U() && this.d0.q()) {
            this.j0 = new C2783a(this.j0, this.o0.Q());
        }
        s0.a("Successfully connected to: {}", A0());
    }

    public <T extends q> Future<T> L0(q qVar) throws ax.c9.e {
        AbstractFutureC1431a<T> abstractFutureC1431a;
        if (qVar.g() instanceof C0967a) {
            abstractFutureC1431a = null;
        } else {
            this.r0.lock();
            try {
                int a = this.h0.a();
                int A = A(qVar, a);
                if (a == 0) {
                    s0.b("There are no credits left to send {}, will block until there are more credits available.", qVar.c().h());
                }
                qVar.c().w(this.h0.d(A)[0]);
                qVar.c().s(Math.max((512 - a) - A, A));
                s0.u("Granted {} (out of {}) credits to {}", Integer.valueOf(A), Integer.valueOf(a), qVar);
                this.r0.unlock();
                h hVar = new h(qVar.g(), qVar.c().i(), UUID.randomUUID());
                this.g0.e(hVar);
                abstractFutureC1431a = hVar.c(new b(hVar, qVar.c().k()));
            } catch (Throwable th) {
                this.r0.unlock();
                throw th;
            }
        }
        this.p0.c(qVar);
        return abstractFutureC1431a;
    }

    <T extends q> T M0(q qVar) throws ax.c9.e {
        return (T) ax.a9.d.a(L0(qVar), this.o0.Q(), TimeUnit.MILLISECONDS, ax.c9.e.q);
    }

    public int W() {
        l lVar = this.h0;
        if (lVar == null) {
            return 0;
        }
        return lVar.a();
    }

    @Override // ax.c9.InterfaceC1850c
    public void a(Throwable th) {
        this.g0.b(th);
        try {
            close();
        } catch (Exception e) {
            s0.d("{} while closing connection on error, ignoring: {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        F(false);
    }

    public C2291c d0() {
        return this.k0;
    }

    public C2484b o0() {
        return this.d0;
    }

    public C2485c s0() {
        return this.d0.f();
    }

    m u0() {
        return this.f0;
    }

    public C3016b v(C2339b c2339b) {
        return new k(this, this.o0, new C0364a()).c(c2339b);
    }
}
