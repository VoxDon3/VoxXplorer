package ax.l9;

import ax.Q8.A;
import ax.Q8.D;
import ax.Q8.E;
import ax.Q8.F;
import ax.Q8.q;
import ax.h9.AbstractC2173d;
import ax.h9.C2170a;
import ax.i9.C2292d;
import ax.q9.C2889a;
import ax.v9.C3291a;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class j {
    private static final ax.Xd.d e = ax.Xd.f.k(j.class);
    private final C2292d a;
    private final C2484b b;
    private C2483a c;
    private b d = new b();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.S8.d.values().length];
            a = iArr;
            try {
                iArr[ax.S8.d.SMB2_PREAUTH_INTEGRITY_CAPABILITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.S8.d.SMB2_ENCRYPTION_CAPABILITIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.S8.d.SMB2_COMPRESSION_CAPABILITIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b {
        private AbstractC2173d<?, ?> a;
        private ax.R8.m b;
        private D c;
        private E d;
        private Set<A> e = EnumSet.noneOf(A.class);
        private byte[] f;
        private C2889a g;

        public D k() {
            return this.c;
        }

        public Set<A> l() {
            return this.e;
        }

        public ax.R8.m m() {
            return this.b;
        }

        public E n() {
            return this.d;
        }

        public byte[] o() {
            return this.f;
        }

        public C2889a p() {
            return this.g;
        }
    }

    public j(C2483a c2483a, C2292d c2292d, C2484b c2484b) {
        this.c = c2483a;
        this.a = c2292d;
        this.b = c2484b;
    }

    private byte[] a() {
        byte[] a2 = C2170a.a(this.d.a);
        byte[] a3 = C2170a.a(this.d.b);
        String h = this.d.d.h();
        try {
            ax.d9.e b2 = this.a.K().b(h);
            return C3291a.a(b2, C3291a.a(b2, new byte[b2.e()], a2), a3);
        } catch (ax.d9.f e2) {
            throw new ax.k9.d("Cannot get the message digest for " + h, e2);
        }
    }

    private void b(ax.S8.a aVar) {
        List<A> i = aVar.i();
        if (i.size() == 0) {
            throw new IllegalStateException("The SMB2CompressionCapabilities NegotiateContext should contain at least 1 algorithm");
        }
        if (i.size() == 1 && i.get(0) == A.NONE) {
            e.z("SMB3CompressionAlgorithm is 'NONE', continuing without compression");
        } else {
            this.d.e = EnumSet.copyOf((Collection) i);
        }
    }

    private void c(ax.S8.b bVar) {
        List<D> i = bVar.i();
        if (i.size() != 1) {
            throw new IllegalStateException("The SMB2EncryptionCapabilities NegotiateContext does not contain exactly 1 cipher");
        }
        this.d.c = i.get(0);
    }

    private void d(ax.S8.f fVar) {
        if (fVar.i().size() != 1) {
            throw new IllegalStateException("The SMB2PreauthIntegrityCapabilities NegotiateContext does not contain exactly 1 hash algorithm");
        }
        this.d.d = fVar.i().get(0);
        this.d.f = a();
    }

    private void e() {
        ax.Q8.g o = this.d.b.o();
        if (o != ax.Q8.g.SMB_3_1_1) {
            if (o.j() && this.d.b.n().contains(ax.Q8.k.SMB2_GLOBAL_CAP_ENCRYPTION)) {
                this.d.c = D.AES_128_CCM;
                return;
            }
            return;
        }
        List<ax.S8.c> s = this.d.b.s();
        if (s == null) {
            throw new IllegalStateException("negotiate context list is null for SMB 3.1.1 dialect");
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (ax.S8.c cVar : s) {
            int i = a.a[cVar.b().ordinal()];
            if (i == 1) {
                if (z) {
                    throw new IllegalStateException("SMB2_PREAUTH_INTEGRITY_CAPABILITIES should only appear once in the NegotiateContextList");
                }
                d((ax.S8.f) cVar);
                z = true;
            } else if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("unknown negotiate context type");
                }
                if (z3) {
                    throw new IllegalStateException("SMB2_COMPRESSION_CAPABILITIES should only appear once in the NegotiateContextList");
                }
                b((ax.S8.a) cVar);
                z3 = true;
            } else {
                if (z2) {
                    throw new IllegalStateException("SMB2_ENCRYPTION_CAPABILITIES should only appear once in the NegotiateContextList");
                }
                c((ax.S8.b) cVar);
                z2 = true;
            }
        }
    }

    private void f() throws ax.c9.e {
        boolean z = false;
        C2889a i = this.b.i();
        ax.R8.m mVar = this.d.b;
        i.g(mVar.u(), mVar.o(), mVar.t(), mVar.n());
        C2889a a2 = this.c.l0.a(i.f());
        if (a2 == null) {
            this.c.l0.b(i);
            this.d.g = i;
            return;
        }
        if (i.h(a2)) {
            this.d.g = a2;
            return;
        }
        String format = String.format("Different server found for same hostname '%s', disconnecting...", i.f());
        try {
            boolean equals = a2.e().equals(i.e());
            boolean equals2 = a2.b().equals(i.b());
            boolean z2 = a2.d() == i.d();
            boolean equals3 = a2.a().equals(i.a());
            format = format + " : " + equals + "(" + a2.e() + "!=" + i.e() + "," + equals2 + "," + z2 + "," + equals3;
            if (!equals && equals2 && z2 && equals3) {
                z = true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!z) {
            throw new ax.c9.e(format);
        }
        this.c.l0.b(i);
        this.d.g = i;
    }

    private ax.R8.m g() throws ax.c9.e {
        ax.P8.a aVar = new ax.P8.a(this.a.O());
        long c = this.c.h0.c();
        if (c != 0) {
            throw new IllegalStateException("The SMBv1 SMB_COM_NEGOTIATE packet needs to be the first packet sent.");
        }
        h hVar = new h(aVar, c, UUID.randomUUID());
        this.c.g0.e(hVar);
        this.d.a = aVar;
        this.c.p0.c(aVar);
        q qVar = (q) ax.a9.d.a(hVar.c(null), this.a.Q(), TimeUnit.MILLISECONDS, ax.c9.e.q);
        if (qVar instanceof ax.R8.m) {
            ax.R8.m mVar = (ax.R8.m) qVar;
            return mVar.o() == ax.Q8.g.SMB_2XX ? i() : mVar;
        }
        throw new IllegalStateException("Expected a SMB2 NEGOTIATE Response to our SMB_COM_NEGOTIATE, but got: " + qVar);
    }

    private ax.R8.m i() throws ax.c9.e {
        byte[] bArr = new byte[32];
        this.a.H().nextBytes(bArr);
        ax.R8.l lVar = new ax.R8.l(this.a.O(), this.b.d(), this.a.X(), this.a.B(), bArr);
        this.d.a = lVar;
        return (ax.R8.m) this.c.M0(lVar);
    }

    void h() throws ax.c9.e {
        ax.Xd.d dVar = e;
        dVar.s("Negotiating dialects {}", this.a.O());
        ax.R8.m g = this.a.Y() ? g() : i();
        this.d.b = g;
        if (!ax.K8.a.j(g.c().m())) {
            throw new F(g.c(), "Failure during dialect negotiation");
        }
        e();
        f();
        this.b.m(this.d);
        dVar.s("Negotiated the following connection settings: {}", this.b);
    }
}
