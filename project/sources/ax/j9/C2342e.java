package ax.j9;

import ax.U8.h;
import ax.U8.i;
import ax.Y8.d;
import ax.Z8.a;
import ax.d9.g;
import ax.i9.C2292d;
import ax.l9.C2484b;
import ax.w9.C3376b;
import ax.x9.C3476a;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import okhttp3.HttpUrl;

/* renamed from: ax.j9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2342e implements InterfaceC2340c {
    private static final ax.Xd.d h = ax.Xd.f.k(C2342e.class);
    private static final ax.E8.e i = new ax.E8.e("1.3.6.1.4.1.311.2.2.10");
    private g a;
    private Random b;
    private ax.V8.c c;
    private ax.T8.a d;
    private b e;
    private Set<ax.W8.e> f;
    private byte[] g;

    /* renamed from: ax.j9.e$a */
    public static class a implements d.a<InterfaceC2340c> {
        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2342e a() {
            return new C2342e();
        }

        @Override // ax.Y8.d.a
        public String getName() {
            return C2342e.i.g();
        }
    }

    /* renamed from: ax.j9.e$b */
    enum b {
        NEGOTIATE,
        AUTHENTICATE,
        COMPLETE
    }

    public static /* synthetic */ boolean d(ax.W8.b bVar, ax.W8.e eVar) {
        return !bVar.b().contains(eVar);
    }

    private ax.W8.g f(ax.W8.b bVar) {
        if (bVar.d() == null) {
            return null;
        }
        ax.W8.g a2 = bVar.d().a();
        if (this.d.i() && bVar.d().c(ax.U8.a.MsvAvTimestamp)) {
            ax.U8.a aVar = ax.U8.a.MsvAvFlags;
            a2.d(new ax.U8.f(a2.c(aVar) ? 2 | ((Long) a2.b(aVar).b()).longValue() : 2L));
        }
        if (!bVar.b().contains(ax.W8.e.NTLMSSP_REQUEST_TARGET)) {
            a2.d(new h(ax.U8.a.MsvAvTargetName, HttpUrl.FRAGMENT_ENCODE_SET));
            return a2;
        }
        h hVar = (h) a2.b(ax.U8.a.MsvAvDnsComputerName);
        if (hVar != null) {
            a2.d(new h(ax.U8.a.MsvAvTargetName, String.format("cifs/%s", hVar.b())));
        }
        return a2;
    }

    private C2338a g(C2339b c2339b, ax.W8.b bVar, byte[] bArr) throws ax.w9.e {
        byte[] bArr2;
        C2338a c2338a = new C2338a();
        c2338a.j(bVar.f());
        if (bVar.d() != null) {
            ax.W8.g d = bVar.d();
            ax.U8.a aVar = ax.U8.a.MsvAvNbComputerName;
            if (d.c(aVar)) {
                c2338a.h((String) bVar.d().b(aVar).b());
            }
        }
        if (c2339b.d()) {
            c2338a.f(j(new ax.W8.a(null, null, c2339b.c(), c2339b.a(), this.d.h(), null, this.f, this.d.g())));
            return c2338a;
        }
        this.f.add(ax.W8.e.NTLMSSP_NEGOTIATE_TARGET_INFO);
        ax.W8.g f = f(bVar);
        long a2 = ax.J8.b.b().a();
        if (f != null) {
            ax.U8.a aVar2 = ax.U8.a.MsvAvTimestamp;
            if (f.c(aVar2)) {
                a2 = ((i) f.b(aVar2)).b().a();
            }
        }
        ax.V8.a c = this.c.c(c2339b.c(), c2339b.a(), c2339b.b(), bVar, a2, f);
        byte[] c2 = c.c();
        byte[] b2 = c.b();
        byte[] bArr3 = new byte[0];
        byte[] g = this.c.g(c2, c.a(), bVar.c());
        EnumSet<ax.W8.e> b3 = bVar.b();
        if (b3.contains(ax.W8.e.NTLMSSP_NEGOTIATE_KEY_EXCH) && (b3.contains(ax.W8.e.NTLMSSP_NEGOTIATE_SEAL) || b3.contains(ax.W8.e.NTLMSSP_NEGOTIATE_SIGN) || b3.contains(ax.W8.e.NTLMSSP_NEGOTIATE_ALWAYS_SIGN))) {
            byte[] bArr4 = new byte[16];
            this.b.nextBytes(bArr4);
            bArr2 = ax.V8.b.f(this.a, g, bArr4);
            g = bArr4;
        } else {
            bArr2 = g;
        }
        ax.W8.a aVar3 = new ax.W8.a(bArr3, b2, c2339b.c(), c2339b.a(), this.d.h(), bArr2, b3, this.d.g());
        ax.U8.f fVar = f != null ? (ax.U8.f) f.b(ax.U8.a.MsvAvFlags) : null;
        if (fVar != null && (fVar.b().longValue() & 2) > 0) {
            aVar3.d(new byte[16]);
            a.c cVar = new a.c(ax.Z8.b.b);
            aVar3.e(cVar);
            aVar3.d(ax.V8.b.a(this.a, g, this.g, bArr, cVar.f()));
        }
        c2338a.i(g);
        h.g("Sending NTLM authenticate message: {}", aVar3);
        c2338a.f(j(aVar3));
        c2338a.g(this.f);
        return c2338a;
    }

    private C2338a h(C2339b c2339b, byte[] bArr) throws ax.w9.e {
        C2338a c2338a = new C2338a();
        this.f = EnumSet.of(ax.W8.e.NTLMSSP_NEGOTIATE_128, ax.W8.e.NTLMSSP_REQUEST_TARGET, ax.W8.e.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY);
        if (!this.d.j() && this.d.g() != null) {
            this.f.add(ax.W8.e.NTLMSSP_NEGOTIATE_VERSION);
        }
        if (!c2339b.d()) {
            this.f.add(ax.W8.e.NTLMSSP_NEGOTIATE_SIGN);
            this.f.add(ax.W8.e.NTLMSSP_NEGOTIATE_ALWAYS_SIGN);
            this.f.add(ax.W8.e.NTLMSSP_NEGOTIATE_KEY_EXCH);
        } else if (c2339b.e()) {
            this.f.add(ax.W8.e.NTLMSSP_NEGOTIATE_KEY_EXCH);
        } else {
            this.f.add(ax.W8.e.NTLMSSP_NEGOTIATE_ANONYMOUS);
        }
        if (!this.f.contains(ax.W8.e.NTLMSSP_NEGOTIATE_VERSION)) {
            if (C3476a.a(c2339b.a())) {
                this.f.add(ax.W8.e.NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED);
            }
            if (C3476a.a(this.d.h())) {
                this.f.add(ax.W8.e.NTLMSSP_NEGOTIATE_OEM_WORKSTATION_SUPPLIED);
            }
        }
        ax.W8.d dVar = new ax.W8.d(this.f, c2339b.a(), this.d.h(), this.d.g(), this.d.j());
        h.g("Sending NTLM negotiate message: {}", this.g);
        c2338a.f(i(dVar));
        c2338a.g(this.f);
        return c2338a;
    }

    private ax.w9.f i(ax.W8.d dVar) throws ax.w9.e {
        C3376b c3376b = new C3376b();
        c3376b.g(i);
        a.c cVar = new a.c(ax.Z8.b.b);
        dVar.b(cVar);
        byte[] f = cVar.f();
        this.g = f;
        c3376b.m(f);
        return c3376b;
    }

    private ax.w9.f j(ax.W8.a aVar) throws ax.w9.e {
        ax.w9.c cVar = new ax.w9.c();
        a.c cVar2 = new a.c(ax.Z8.b.b);
        aVar.e(cVar2);
        cVar.m(cVar2.f());
        return cVar;
    }

    @Override // ax.j9.InterfaceC2340c
    public C2338a a(C2339b c2339b, byte[] bArr, C2484b c2484b) throws IOException {
        try {
            b bVar = this.e;
            b bVar2 = b.COMPLETE;
            if (bVar == bVar2) {
                return null;
            }
            if (bVar == b.NEGOTIATE) {
                h.s("Initialized Authentication of {} using NTLM", c2339b.c());
                this.e = b.AUTHENTICATE;
                return h(c2339b, bArr);
            }
            ax.Xd.d dVar = h;
            dVar.s("Received token: {}", ax.Y8.a.a(bArr));
            ax.w9.c g = new ax.w9.c().g(bArr);
            final ax.W8.b bVar3 = new ax.W8.b();
            try {
                bVar3.g(new a.c(g.e(), ax.Z8.b.b));
                dVar.g("Received NTLM challenge: {}", bVar3);
                dVar.s("Received NTLM challenge from: {}", bVar3.e());
                Collection.EL.removeIf(this.f, new Predicate() { // from class: ax.j9.d
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ Predicate negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return C2342e.d(ax.W8.b.this, (ax.W8.e) obj);
                    }
                });
                if (!this.f.contains(ax.W8.e.NTLMSSP_NEGOTIATE_128)) {
                    throw new ax.T8.b("Server does not support 128-bit encryption");
                }
                C2338a g2 = g(c2339b, bVar3, g.e());
                this.e = bVar2;
                return g2;
            } catch (a.b e) {
                throw new IOException(e);
            }
        } catch (ax.w9.e e2) {
            throw new ax.k9.d(e2);
        }
    }

    @Override // ax.j9.InterfaceC2340c
    public void b(C2292d c2292d) {
        this.a = c2292d.K();
        this.b = c2292d.H();
        this.d = c2292d.G();
        this.e = b.NEGOTIATE;
        this.f = new HashSet();
        this.c = new ax.V8.c(this.b, this.a);
    }

    @Override // ax.j9.InterfaceC2340c
    public boolean c(C2339b c2339b) {
        return c2339b.getClass().equals(C2339b.class);
    }
}
