package ax.e9;

import ax.vd.InterfaceC3312i;
import ax.wd.C3388e;
import ax.wd.C3389f;
import ax.wd.C3390g;
import ax.wd.C3391h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class e implements ax.d9.e {
    private static Map<String, ax.Y8.d<InterfaceC3312i>> b;
    private final InterfaceC3312i a;

    class a implements ax.Y8.d<InterfaceC3312i> {
        a() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC3312i a() {
            return new C3391h();
        }
    }

    class b implements ax.Y8.d<InterfaceC3312i> {
        b() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC3312i a() {
            return new C3390g();
        }
    }

    class c implements ax.Y8.d<InterfaceC3312i> {
        c() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC3312i a() {
            return new C3388e();
        }
    }

    class d implements ax.Y8.d<InterfaceC3312i> {
        d() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC3312i a() {
            return new C3389f();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("SHA-512", new a());
        b.put("SHA256", new b());
        b.put("MD4", new c());
        b.put("MD5", new d());
    }

    e(String str) {
        this.a = g(str);
    }

    private InterfaceC3312i g(String str) {
        ax.Y8.d<InterfaceC3312i> dVar = b.get(str);
        if (dVar != null) {
            return dVar.a();
        }
        throw new IllegalArgumentException("No MessageDigest " + str + " defined in BouncyCastle");
    }

    @Override // ax.d9.e
    public void a() {
        this.a.a();
    }

    @Override // ax.d9.e
    public void b(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
    }

    @Override // ax.d9.e
    public byte[] c() {
        byte[] bArr = new byte[this.a.i()];
        this.a.c(bArr, 0);
        return bArr;
    }

    @Override // ax.d9.e
    public void d(byte b2) {
        this.a.d(b2);
    }

    @Override // ax.d9.e
    public int e() {
        return this.a.i();
    }

    @Override // ax.d9.e
    public void f(byte[] bArr) {
        this.a.b(bArr, 0, bArr.length);
    }
}
