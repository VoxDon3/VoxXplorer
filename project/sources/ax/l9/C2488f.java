package ax.l9;

import ax.Q8.B;
import ax.Q8.D;
import ax.Q8.q;
import ax.Q8.t;
import ax.Q8.x;
import ax.Z8.a;
import ax.d9.InterfaceC1950a;
import ax.d9.InterfaceC1951b;
import ax.h9.C2171b;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: ax.l9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2488f {
    private static final ax.Xd.d e = ax.Xd.f.k(C2488f.class);
    private ax.d9.g a;
    private D b;
    private ax.Q8.g c;
    private AtomicInteger d = new AtomicInteger(0);

    /* renamed from: ax.l9.f$a */
    public class a extends q {
        private final q e;
        private final SecretKey f;

        public a(q qVar, SecretKey secretKey) {
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
            C2171b c2171b2 = new C2171b();
            this.e.a(c2171b2);
            byte[] f = c2171b2.f();
            byte[] h = C2488f.this.h();
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, h);
            x xVar = new x(h, f.length, this.e.c().k());
            byte[] e = C2488f.this.e(xVar);
            try {
                InterfaceC1950a d = C2488f.this.a.d(C2488f.this.b.h());
                d.g(InterfaceC1951b.a.ENCRYPT, this.f.getEncoded(), gCMParameterSpec);
                d.f(e, 0, e.length);
                byte[] e2 = d.e(f, 0, f.length);
                if (e2.length != f.length + 16) {
                    throw new IllegalStateException("Invalid length for cipherText after encryption.");
                }
                byte[] bArr = new byte[16];
                System.arraycopy(e2, f.length, bArr, 0, 16);
                xVar.j(bArr);
                xVar.k(c2171b);
                c2171b.p(e2, 0, f.length);
            } catch (ax.d9.f e3) {
                C2488f.e.t("Security exception while encrypting packet << {} >>", this.e.c());
                throw new ax.k9.d(e3);
            }
        }

        @Override // ax.h9.AbstractC2173d
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public t c() {
            return this.e.c();
        }

        @Override // ax.Q8.q
        public String toString() {
            return "Encrypted[" + this.e.toString() + "]";
        }
    }

    public C2488f(ax.d9.g gVar) {
        this.a = gVar;
    }

    public boolean d(B b) {
        return this.c.j() && b.a().c() != 0 && b.b().d() == 1;
    }

    byte[] e(x xVar) {
        C2171b c2171b = new C2171b();
        xVar.k(c2171b);
        c2171b.T(20);
        return c2171b.f();
    }

    public byte[] f(B b, SecretKey secretKey) {
        byte[] copyOf = Arrays.copyOf(b.b().e(), this.b.j());
        try {
            byte[] e2 = e(b.b());
            byte[] d = b.d();
            byte[] h = b.b().h();
            InterfaceC1950a d2 = this.a.d(this.b.h());
            d2.g(InterfaceC1951b.a.DECRYPT, secretKey.getEncoded(), new GCMParameterSpec(128, copyOf));
            d2.f(e2, 0, e2.length);
            byte[] b2 = d2.b(d, 0, d.length);
            byte[] e3 = d2.e(h, 0, h.length);
            if (b2 == null || b2.length == 0) {
                return e3;
            }
            byte[] bArr = new byte[b2.length + e3.length];
            System.arraycopy(b2, 0, bArr, 0, b2.length);
            System.arraycopy(e3, 0, bArr, b2.length, e3.length);
            return bArr;
        } catch (a.b e4) {
            e.t("Could not read cipherText from packet << {} >>", b);
            throw new ax.k9.d("Could not read cipherText from packet", e4);
        } catch (ax.d9.f e5) {
            e.t("Security exception while decrypting packet << {} >>", b);
            throw new ax.k9.d(e5);
        }
    }

    public q g(q qVar, SecretKey secretKey) {
        if (secretKey != null) {
            return new a(qVar, secretKey);
        }
        e.s("Not wrapping {} as encrypted, as no key is set.", qVar.c().h());
        return qVar;
    }

    byte[] h() {
        long nanoTime = System.nanoTime();
        C2171b c2171b = new C2171b();
        c2171b.w(nanoTime);
        c2171b.W(this.b.j() - 8);
        return c2171b.f();
    }

    void i(C2484b c2484b) {
        this.c = c2484b.f().a();
        if (c2484b.f().a().equals(ax.Q8.g.SMB_3_1_1)) {
            this.b = c2484b.b();
        } else {
            this.b = D.AES_128_CCM;
        }
        e.a("Initialized PacketEncryptor with Cipher << {} >>", this.b);
    }
}
