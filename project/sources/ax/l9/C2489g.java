package ax.l9;

import ax.Q8.o;
import ax.Q8.q;
import ax.Q8.r;
import ax.Q8.t;
import ax.h9.C2171b;
import java.util.Arrays;
import javax.crypto.SecretKey;

/* renamed from: ax.l9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2489g implements n {
    private static final ax.Xd.d b = ax.Xd.f.k(C2489g.class);
    private ax.d9.g a;

    /* renamed from: ax.l9.g$a */
    public class a extends q {
        private final q e;
        private SecretKey f;

        /* renamed from: ax.l9.g$a$a, reason: collision with other inner class name */
        private class C0365a extends C2171b {
            private C2171b h;
            private final ax.d9.d i;

            C0365a(C2171b c2171b) throws ax.d9.f {
                this.h = c2171b;
                this.i = C2489g.e(a.this.f, C2489g.this.a);
            }

            @Override // ax.Z8.a
            public ax.Z8.a<C2171b> i(ax.Z8.a<? extends ax.Z8.a<?>> aVar) {
                this.i.b(aVar.a(), aVar.S(), aVar.c());
                this.h.i(aVar);
                return this;
            }

            @Override // ax.Z8.a
            public ax.Z8.a<C2171b> j(byte b) {
                this.i.d(b);
                this.h.j(b);
                return this;
            }

            @Override // ax.Z8.a
            public ax.Z8.a<C2171b> p(byte[] bArr, int i, int i2) {
                this.i.b(bArr, i, i2);
                this.h.p(bArr, i, i2);
                return this;
            }
        }

        a(q qVar, SecretKey secretKey) {
            this.e = qVar;
            this.f = secretKey;
        }

        @Override // ax.Q8.q
        public int f() {
            return this.e.f();
        }

        @Override // ax.Q8.q
        public q g() {
            return this.e.g();
        }

        @Override // ax.Q8.q, ax.X8.a
        /* renamed from: l */
        public void a(C2171b c2171b) {
            try {
                this.e.c().u(o.SMB2_FLAGS_SIGNED);
                int V = c2171b.V();
                C0365a c0365a = new C0365a(c2171b);
                this.e.a(c0365a);
                System.arraycopy(c0365a.i.g(), 0, c2171b.a(), V + 48, 16);
            } catch (ax.d9.f e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // ax.h9.AbstractC2173d
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public t c() {
            return this.e.c();
        }

        @Override // ax.Q8.q
        public String toString() {
            return "Signed(" + this.e.toString() + ")";
        }
    }

    C2489g(ax.d9.g gVar) {
        this.a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ax.d9.d e(SecretKey secretKey, ax.d9.g gVar) throws ax.d9.f {
        ax.d9.d c = gVar.c(secretKey.getAlgorithm());
        c.a(secretKey.getEncoded());
        return c;
    }

    @Override // ax.l9.n
    public boolean a(r rVar, SecretKey secretKey) {
        try {
            C2171b a2 = rVar.a();
            ax.d9.d e = e(secretKey, this.a);
            e.b(a2.a(), rVar.b().a(), 48);
            e.f(t.p);
            e.b(a2.a(), 64, rVar.b().c() - 64);
            byte[] g = e.g();
            byte[] l = rVar.b().l();
            for (int i = 0; i < 16; i++) {
                if (g[i] != l[i]) {
                    ax.Xd.d dVar = b;
                    dVar.q("Signatures for packet {} do not match (received: {}, calculated: {})", rVar, Arrays.toString(l), Arrays.toString(g));
                    dVar.p("Packet {} has header: {}", rVar, rVar.b());
                    return false;
                }
            }
            return true;
        } catch (ax.d9.f e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // ax.l9.n
    public q b(q qVar, SecretKey secretKey) {
        if (secretKey != null) {
            return new a(qVar, secretKey);
        }
        b.s("Not wrapping {} as signed, as no key is set.", qVar.c().h());
        return qVar;
    }
}
