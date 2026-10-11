package ax.Md;

import ax.Ld.d;
import ax.Ld.f;
import ax.Wc.C1103h;
import ax.Wc.C1110k0;
import ax.Wc.C1135x0;
import ax.Wc.D;
import ax.rd.C3031a;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.List;

/* loaded from: classes3.dex */
public class a {
    private SecureRandom b;
    private String c;
    private C3031a d;
    private ax.Md.b a = new ax.Md.b(new ax.Hd.a());
    private AlgorithmParameterSpec e = null;

    /* renamed from: ax.Md.a$a, reason: collision with other inner class name */
    class C0152a implements ax.Ld.a {
        private OutputStream a;
        final /* synthetic */ Signature b;
        final /* synthetic */ C3031a c;

        C0152a(Signature signature, C3031a c3031a) {
            this.b = signature;
            this.c = c3031a;
            this.a = ax.Gd.a.a(signature);
        }

        @Override // ax.Ld.a
        public OutputStream b() {
            return this.a;
        }

        @Override // ax.Ld.a
        public byte[] c() {
            try {
                return this.b.sign();
            } catch (SignatureException e) {
                throw new f("exception obtaining signature: " + e.getMessage(), e);
            }
        }

        @Override // ax.Ld.a
        public C3031a d() {
            return this.c;
        }
    }

    class b implements ax.Ld.a {
        OutputStream a;
        final /* synthetic */ OutputStream b;
        final /* synthetic */ Signature[] c;

        b(OutputStream outputStream, Signature[] signatureArr) {
            this.b = outputStream;
            this.c = signatureArr;
            this.a = outputStream;
        }

        @Override // ax.Ld.a
        public OutputStream b() {
            return this.a;
        }

        @Override // ax.Ld.a
        public byte[] c() {
            try {
                C1103h c1103h = new C1103h();
                for (int i = 0; i != this.c.length; i++) {
                    c1103h.a(new C1110k0(this.c[i].sign()));
                }
                return new C1135x0(c1103h).q("DER");
            } catch (IOException e) {
                throw new f("exception encoding signature: " + e.getMessage(), e);
            } catch (SignatureException e2) {
                throw new f("exception obtaining signature: " + e2.getMessage(), e2);
            }
        }

        @Override // ax.Ld.a
        public C3031a d() {
            return a.this.d;
        }
    }

    public a(String str) {
        this.c = str;
        this.d = new ax.Ld.b().b(str);
    }

    private ax.Ld.a c(ax.Fd.a aVar) throws d {
        try {
            List<PrivateKey> a = aVar.a();
            D G = D.G(this.d.u());
            int size = G.size();
            Signature[] signatureArr = new Signature[size];
            for (int i = 0; i != G.size(); i++) {
                Signature b2 = this.a.b(C3031a.t(G.I(i)));
                signatureArr[i] = b2;
                if (this.b != null) {
                    b2.initSign(a.get(i), this.b);
                } else {
                    b2.initSign(a.get(i));
                }
            }
            OutputStream a2 = ax.Gd.a.a(signatureArr[0]);
            int i2 = 1;
            while (i2 != size) {
                ax.Pd.b bVar = new ax.Pd.b(a2, ax.Gd.a.a(signatureArr[i2]));
                i2++;
                a2 = bVar;
            }
            return new b(a2, signatureArr);
        } catch (GeneralSecurityException e) {
            throw new d("cannot create signer: " + e.getMessage(), e);
        }
    }

    public ax.Ld.a b(PrivateKey privateKey) throws d {
        if (privateKey instanceof ax.Fd.a) {
            return c((ax.Fd.a) privateKey);
        }
        try {
            Signature b2 = this.a.b(this.d);
            C3031a c3031a = this.d;
            SecureRandom secureRandom = this.b;
            if (secureRandom != null) {
                b2.initSign(privateKey, secureRandom);
            } else {
                b2.initSign(privateKey);
            }
            return new C0152a(b2, c3031a);
        } catch (GeneralSecurityException e) {
            throw new d("cannot create signer: " + e.getMessage(), e);
        }
    }
}
