package ax.e9;

import ax.Dd.k;
import ax.d9.InterfaceC1950a;
import ax.d9.InterfaceC1951b;
import ax.vd.C3314k;
import ax.vd.InterfaceC3307d;
import ax.xd.C3489a;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: ax.e9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1991a {
    private static final Map<String, ax.Y8.d<InterfaceC1950a>> a;

    /* renamed from: ax.e9.a$a, reason: collision with other inner class name */
    class C0300a implements ax.Y8.d<InterfaceC1950a> {

        /* renamed from: ax.e9.a$a$a, reason: collision with other inner class name */
        class C0301a extends c {
            C0301a(ax.Ad.a aVar) {
                super(aVar);
            }

            @Override // ax.e9.C1991a.c
            protected InterfaceC3307d a(byte[] bArr, GCMParameterSpec gCMParameterSpec) {
                return new ax.Dd.a(new k(bArr), gCMParameterSpec.getTLen(), gCMParameterSpec.getIV());
            }
        }

        C0300a() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC1950a a() {
            return new C0301a(new ax.Ad.d(new C3489a()));
        }
    }

    /* renamed from: ax.e9.a$b */
    class b implements ax.Y8.d<InterfaceC1950a> {

        /* renamed from: ax.e9.a$b$a, reason: collision with other inner class name */
        class C0302a extends c {
            C0302a(ax.Ad.a aVar) {
                super(aVar);
            }

            @Override // ax.e9.C1991a.c
            protected InterfaceC3307d a(byte[] bArr, GCMParameterSpec gCMParameterSpec) {
                return new ax.Dd.a(new k(bArr), gCMParameterSpec.getTLen(), gCMParameterSpec.getIV());
            }
        }

        b() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC1950a a() {
            return new C0302a(new ax.Ad.e(new C3489a()));
        }
    }

    /* renamed from: ax.e9.a$c */
    private static abstract class c implements InterfaceC1950a {
        private ax.Ad.a a;

        c(ax.Ad.a aVar) {
            this.a = aVar;
        }

        protected abstract InterfaceC3307d a(byte[] bArr, GCMParameterSpec gCMParameterSpec);

        @Override // ax.d9.InterfaceC1950a
        public byte[] b(byte[] bArr, int i, int i2) throws ax.d9.f {
            byte[] bArr2 = new byte[this.a.h(i2)];
            this.a.g(bArr, i, i2, bArr2, 0);
            return bArr2;
        }

        @Override // ax.d9.InterfaceC1950a
        public byte[] e(byte[] bArr, int i, int i2) throws ax.d9.f {
            byte[] bArr2 = new byte[this.a.i(i2)];
            try {
                this.a.c(bArr2, this.a.g(bArr, i, i2, bArr2, 0));
                return bArr2;
            } catch (C3314k e) {
                throw new ax.d9.f(e);
            }
        }

        @Override // ax.d9.InterfaceC1950a
        public void f(byte[] bArr, int i, int i2) throws ax.d9.f {
            this.a.j(bArr, i, i2);
        }

        @Override // ax.d9.InterfaceC1950a
        public void g(InterfaceC1951b.a aVar, byte[] bArr, GCMParameterSpec gCMParameterSpec) throws ax.d9.f {
            this.a.e(aVar == InterfaceC1951b.a.ENCRYPT, a(bArr, gCMParameterSpec));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("AES/CCM/NoPadding", new C0300a());
        hashMap.put("AES/GCM/NoPadding", new b());
    }

    public static InterfaceC1950a a(String str) {
        ax.Y8.d<InterfaceC1950a> dVar = a.get(str);
        if (dVar != null) {
            return dVar.a();
        }
        throw new IllegalArgumentException("Unknown AEADCipher " + str);
    }
}
