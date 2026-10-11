package ax.l9;

import ax.Q8.F;
import ax.Q8.q;
import ax.R8.t;
import ax.Y8.d;
import ax.Z8.a;
import ax.f9.C2085a;
import ax.h9.C2170a;
import ax.i9.C2292d;
import ax.j9.C2338a;
import ax.j9.C2339b;
import ax.j9.C2342e;
import ax.j9.C2343f;
import ax.j9.InterfaceC2340c;
import ax.r9.C3015a;
import ax.r9.C3016b;
import ax.v9.C3291a;
import ax.w9.C3375a;
import ax.x9.C3476a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class k {
    static final byte[] g = C3476a.c("SMBC2SCipherKey");
    static final byte[] h = C3476a.c("SMBS2CCipherKey");
    static final byte[] i = C3476a.c("SMB2AESCCM");
    static final byte[] j = C3476a.c("ServerIn ");
    static final byte[] k = C3476a.c("ServerOut");
    static final byte[] l = C3476a.c("SmbSign");
    static final byte[] m = C3476a.c("SMB2AESCMAC");
    static final byte[] n = C3476a.c("SMBSigningKey");
    static final byte[] o = C3476a.c("SmbRpc");
    static final byte[] p = C3476a.c("SMB2APP");
    static final byte[] q = C3476a.c("SMBAppKey");
    private static final ax.Xd.d r = ax.Xd.f.k(k.class);
    private final C2292d a;
    private final C2484b b;
    private final b c;
    private final m d;
    private final m e;
    private final C2483a f;

    public static class a {
        private InterfaceC2340c a;
        private long b;
        private byte[] c;
        private C2339b d;
        private byte[] e;
        private t f;
        private t g;
        private ax.d9.e h;
    }

    public interface b {
        C3016b a(C2339b c2339b);
    }

    public k(C2483a c2483a, C2292d c2292d, b bVar) {
        this.f = c2483a;
        this.a = c2292d;
        this.b = c2483a.o0();
        this.d = c2483a.C0();
        this.e = c2483a.u0();
        this.c = bVar;
    }

    private SecretKey a(SecretKey secretKey, byte[] bArr, byte[] bArr2, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(25);
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(new byte[]{0, 0, 0, Byte.MIN_VALUE});
            try {
                ax.d9.c e = this.a.K().e("KDF/Counter/HMACSHA256");
                e.b(new C2085a(secretKey.getEncoded(), byteArrayOutputStream.toByteArray(), 32));
                byte[] bArr3 = new byte[16];
                e.a(bArr3, 0, 16);
                return new SecretKeySpec(bArr3, str);
            } catch (ax.d9.f e2) {
                throw new ax.k9.d(e2);
            }
        } catch (IOException e3) {
            r.h("Unable to format suffix, error occur : ", e3);
            return null;
        }
    }

    private void b(t tVar, ax.Q8.g gVar, ax.r9.c cVar) {
        if (!gVar.j() || tVar.o().contains(t.b.SMB2_SESSION_FLAG_IS_NULL) || tVar.o().contains(t.b.SMB2_SESSION_FLAG_IS_GUEST)) {
            return;
        }
        ax.Q8.g gVar2 = ax.Q8.g.SMB_3_1_1;
        if (gVar == gVar2) {
            cVar.p(a(cVar.e(), n, cVar.d(), "AesCmac"));
        } else {
            cVar.p(a(cVar.e(), m, l, "AesCmac"));
        }
        if (this.b.j()) {
            String h2 = this.b.b().h();
            if (gVar == gVar2) {
                cVar.m(a(cVar.e(), g, cVar.d(), h2));
                cVar.k(a(cVar.e(), h, cVar.d(), h2));
                cVar.j(a(cVar.e(), q, cVar.d(), h2));
            } else {
                SecretKey e = cVar.e();
                byte[] bArr = i;
                cVar.m(a(e, bArr, j, h2));
                cVar.k(a(cVar.e(), bArr, k, h2));
                cVar.j(a(cVar.e(), p, o, h2));
            }
        }
    }

    private InterfaceC2340c d(C2339b c2339b) throws ax.w9.e {
        ArrayList arrayList = new ArrayList(this.a.N());
        List<ax.E8.e> arrayList2 = new ArrayList<>();
        if (this.b.e().length > 0) {
            arrayList2 = new C3375a().j(this.b.e()).h();
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            d.a aVar = (d.a) obj;
            if (arrayList2.isEmpty() || arrayList2.contains(new ax.E8.e(aVar.getName()))) {
                InterfaceC2340c interfaceC2340c = (InterfaceC2340c) aVar.a();
                if (interfaceC2340c.c(c2339b)) {
                    return interfaceC2340c;
                }
            }
        }
        throw new ax.k9.d("Could not find a configured authenticator for mechtypes: " + arrayList2 + " and authentication context: " + c2339b);
    }

    private a e(a aVar, byte[] bArr) throws ax.c9.e {
        t tVar = new t(this.b.f().a(), EnumSet.of(this.b.k() ? t.a.SMB2_NEGOTIATE_SIGNING_REQUIRED : t.a.SMB2_NEGOTIATE_SIGNING_ENABLED), this.b.c());
        tVar.r(bArr);
        tVar.c().y(aVar.b);
        aVar.f = tVar;
        aVar.g = (t) this.f.M0(tVar);
        return aVar;
    }

    private a f(C2339b c2339b, InterfaceC2340c interfaceC2340c) {
        a aVar = new a();
        aVar.a = interfaceC2340c;
        aVar.d = c2339b;
        return aVar;
    }

    private C3016b g(a aVar) {
        C3016b a2 = this.c.a(aVar.d);
        a2.W(aVar.b);
        a2.o().n(this.b.h());
        return a2;
    }

    private void h(a aVar, byte[] bArr) throws IOException {
        C2338a a2 = aVar.a.a(aVar.d, bArr, this.b);
        if (a2 == null) {
            return;
        }
        this.b.o(a2.e());
        this.b.n(a2.c());
        aVar.c = a2.d();
        ax.w9.f a3 = a2.a();
        a.c cVar = new a.c(ax.Z8.b.b);
        try {
            a3.c(cVar);
            aVar.e = cVar.f();
        } catch (ax.w9.e e) {
            throw new IOException(e);
        }
    }

    private C3016b i(a aVar) throws IOException {
        e(aVar, aVar.e);
        t tVar = aVar.g;
        aVar.b = tVar.c().k();
        ax.Q8.g a2 = this.b.f().a();
        if (tVar.c().m() == ax.K8.a.STATUS_MORE_PROCESSING_REQUIRED.getValue()) {
            if (a2 == ax.Q8.g.SMB_3_1_1) {
                C3016b b2 = this.e.b(Long.valueOf(aVar.b));
                if (b2 == null) {
                    b2 = g(aVar);
                    this.e.c(Long.valueOf(aVar.b), b2);
                }
                j(aVar, b2.o(), aVar.f);
                j(aVar, b2.o(), aVar.g);
            }
            r.d("More processing required for authentication of {} using {}", aVar.d.c(), aVar.a);
            h(aVar, tVar.n());
            return i(aVar);
        }
        if (tVar.c().m() != ax.K8.a.STATUS_SUCCESS.getValue()) {
            throw new F(tVar.c(), String.format("Authentication failed for '%s' using %s", aVar.d.c(), aVar.a));
        }
        C3016b b3 = this.e.b(Long.valueOf(aVar.b));
        ax.Q8.g gVar = ax.Q8.g.SMB_3_1_1;
        if (a2 != gVar || b3 == null) {
            b3 = g(aVar);
        } else {
            this.e.d(Long.valueOf(b3.p()));
        }
        ax.r9.c o2 = b3.o();
        h(aVar, tVar.n());
        if (aVar.c != null) {
            o2.o(new SecretKeySpec(aVar.c, "HmacSHA256"));
        }
        if (a2 == gVar) {
            j(aVar, o2, aVar.f);
        }
        k(aVar, o2);
        b(tVar, a2, o2);
        o2.a(tVar);
        return b3;
    }

    private void j(a aVar, ax.r9.c cVar, q qVar) {
        if (aVar.h == null) {
            String h2 = this.f.o0().g().h();
            try {
                aVar.h = this.a.K().b(h2);
            } catch (ax.d9.f e) {
                throw new ax.k9.d("Cannot get the message digest for " + h2, e);
            }
        }
        cVar.n(C3291a.a(aVar.h, cVar.d(), C2170a.a(qVar)));
    }

    private void k(a aVar, ax.r9.c cVar) {
        boolean X = this.a.X();
        cVar.q(X || this.f.o0().k());
        if (aVar.g.o().contains(t.b.SMB2_SESSION_FLAG_IS_NULL)) {
            cVar.q(false);
        }
        boolean contains = aVar.g.o().contains(t.b.SMB2_SESSION_FLAG_IS_GUEST);
        if (contains && cVar.i()) {
            throw new C3015a();
        }
        if (contains && !X) {
            cVar.q(false);
        }
        if (this.f.s0().a().j() && this.f.o0().r() && aVar.g.o().contains(t.b.SMB2_SESSION_FLAG_ENCRYPT_DATA)) {
            cVar.l(true);
            cVar.q(false);
        }
    }

    public C3016b c(C2339b c2339b) {
        try {
            InterfaceC2340c d = d(c2339b);
            if (d instanceof C2342e) {
                if (this.a.G().i()) {
                    if (c2339b.d()) {
                        if (c2339b.e()) {
                        }
                    }
                    d = new C2343f((C2342e) d);
                }
            }
            a f = f(c2339b, d);
            d.b(this.a);
            h(f, this.b.e());
            C3016b i2 = i(f);
            r.B("Successfully authenticated {} on {}, session is {}", c2339b.c(), this.f.A0(), Long.valueOf(i2.p()));
            this.d.c(Long.valueOf(i2.p()), i2);
            return i2;
        } catch (ax.w9.e e) {
            e = e;
            throw new ax.k9.d(e);
        } catch (IOException e2) {
            e = e2;
            throw new ax.k9.d(e);
        }
    }
}
