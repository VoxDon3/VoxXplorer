package ax.e9;

import ax.Dd.j;
import ax.f9.C2085a;
import ax.f9.InterfaceC2086b;
import ax.vd.InterfaceC3310g;
import ax.vd.InterfaceC3311h;
import ax.wd.C3390g;
import ax.yd.C3526b;
import ax.zd.C3569c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {
    private static final Map<String, ax.Y8.d<ax.d9.c>> a;

    class a implements ax.Y8.d<ax.d9.c> {

        /* renamed from: ax.e9.c$a$a, reason: collision with other inner class name */
        class C0305a extends b {
            C0305a(InterfaceC3310g interfaceC3310g) {
                super(interfaceC3310g);
            }

            @Override // ax.e9.c.b
            protected InterfaceC3311h c(InterfaceC2086b interfaceC2086b) {
                if (!(interfaceC2086b instanceof C2085a)) {
                    throw new IllegalArgumentException("Parameters should be a CounterDerivationParameters");
                }
                C2085a c2085a = (C2085a) interfaceC2086b;
                return new j(c2085a.c(), c2085a.b(), c2085a.a());
            }
        }

        a() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.d9.c a() {
            return new C0305a(new C3526b(new C3569c(new C3390g())));
        }
    }

    static abstract class b implements ax.d9.c {
        private final InterfaceC3310g a;

        public b(InterfaceC3310g interfaceC3310g) {
            this.a = interfaceC3310g;
        }

        @Override // ax.d9.c
        public int a(byte[] bArr, int i, int i2) {
            return this.a.a(bArr, i, i2);
        }

        @Override // ax.d9.c
        public void b(InterfaceC2086b interfaceC2086b) {
            this.a.b(c(interfaceC2086b));
        }

        protected abstract InterfaceC3311h c(InterfaceC2086b interfaceC2086b);
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("KDF/Counter/HMACSHA256", new a());
    }

    public static ax.d9.c a(String str) {
        ax.Y8.d<ax.d9.c> dVar = a.get(str);
        if (dVar != null) {
            return dVar.a();
        }
        throw new IllegalArgumentException("Unknown DerivationFunction " + str);
    }
}
