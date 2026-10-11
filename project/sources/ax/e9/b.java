package ax.e9;

import ax.Dd.k;
import ax.d9.InterfaceC1951b;
import ax.vd.C3305b;
import ax.vd.C3314k;
import ax.vd.InterfaceC3307d;
import ax.vd.t;
import ax.xd.C3491c;
import ax.xd.C3492d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {
    private static final Map<String, ax.Y8.d<InterfaceC1951b>> a;

    class a implements ax.Y8.d<InterfaceC1951b> {

        /* renamed from: ax.e9.b$a$a, reason: collision with other inner class name */
        class C0303a extends c {
            C0303a(C3305b c3305b) {
                super(c3305b);
            }

            @Override // ax.e9.b.c
            protected InterfaceC3307d d(byte[] bArr) {
                return new ax.Dd.e(bArr);
            }
        }

        a() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC1951b a() {
            return new C0303a(new C3305b(new C3491c()));
        }
    }

    /* renamed from: ax.e9.b$b, reason: collision with other inner class name */
    class C0304b implements ax.Y8.d<InterfaceC1951b> {

        /* renamed from: ax.e9.b$b$a */
        class a extends d {
            a(t tVar) {
                super(tVar);
            }

            @Override // ax.e9.b.d
            protected InterfaceC3307d d(byte[] bArr) {
                return new k(bArr);
            }
        }

        C0304b() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC1951b a() {
            return new a(new C3492d());
        }
    }

    private static abstract class c implements InterfaceC1951b {
        private C3305b a;

        c(C3305b c3305b) {
            this.a = c3305b;
        }

        @Override // ax.d9.InterfaceC1951b
        public int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.a.e(bArr, i, i2, bArr2, i3);
        }

        @Override // ax.d9.InterfaceC1951b
        public void b(InterfaceC1951b.a aVar, byte[] bArr) {
            this.a.d(aVar == InterfaceC1951b.a.ENCRYPT, d(bArr));
        }

        @Override // ax.d9.InterfaceC1951b
        public int c(byte[] bArr, int i) throws ax.d9.f {
            try {
                return this.a.a(bArr, i);
            } catch (C3314k e) {
                throw new ax.d9.f(e);
            }
        }

        protected abstract InterfaceC3307d d(byte[] bArr);
    }

    private static abstract class d implements InterfaceC1951b {
        private t a;

        d(t tVar) {
            this.a = tVar;
        }

        @Override // ax.d9.InterfaceC1951b
        public int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.a.g(bArr, i, i2, bArr2, i3);
        }

        @Override // ax.d9.InterfaceC1951b
        public void b(InterfaceC1951b.a aVar, byte[] bArr) {
            this.a.e(aVar == InterfaceC1951b.a.ENCRYPT, d(bArr));
        }

        @Override // ax.d9.InterfaceC1951b
        public int c(byte[] bArr, int i) {
            this.a.a();
            return 0;
        }

        protected abstract InterfaceC3307d d(byte[] bArr);
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("DES/ECB/NoPadding", new a());
        hashMap.put("RC4", new C0304b());
    }

    public static InterfaceC1951b a(String str) {
        ax.Y8.d<InterfaceC1951b> dVar = a.get(str);
        if (dVar != null) {
            return dVar.a();
        }
        throw new IllegalArgumentException("Unknown Cipher " + str);
    }
}
