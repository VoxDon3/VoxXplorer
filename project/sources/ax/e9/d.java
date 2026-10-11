package ax.e9;

import ax.Dd.k;
import ax.vd.InterfaceC3315l;
import ax.wd.C3389f;
import ax.wd.C3390g;
import ax.xd.C3489a;
import ax.zd.C3568b;
import ax.zd.C3569c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class d implements ax.d9.d {
    private static Map<String, ax.Y8.d<InterfaceC3315l>> b;
    private final InterfaceC3315l a;

    class a implements ax.Y8.d<InterfaceC3315l> {
        a() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC3315l a() {
            return new C3569c(new C3390g());
        }
    }

    class b implements ax.Y8.d<InterfaceC3315l> {
        b() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC3315l a() {
            return new C3569c(new C3389f());
        }
    }

    class c implements ax.Y8.d<InterfaceC3315l> {
        c() {
        }

        @Override // ax.Y8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC3315l a() {
            return new C3568b(new C3489a());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("HMACSHA256", new a());
        b.put("HMACMD5", new b());
        b.put("AESCMAC", new c());
    }

    d(String str) {
        this.a = c(str).a();
    }

    private ax.Y8.d<InterfaceC3315l> c(String str) {
        ax.Y8.d<InterfaceC3315l> dVar = b.get(str.toUpperCase());
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("No Mac defined for " + str);
    }

    @Override // ax.d9.d
    public void a(byte[] bArr) {
        this.a.e(new k(bArr));
    }

    @Override // ax.d9.d
    public void b(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
    }

    @Override // ax.d9.d
    public void d(byte b2) {
        this.a.d(b2);
    }

    @Override // ax.d9.d
    public void f(byte[] bArr) {
        this.a.b(bArr, 0, bArr.length);
    }

    @Override // ax.d9.d
    public byte[] g() {
        byte[] bArr = new byte[this.a.a()];
        this.a.c(bArr, 0);
        return bArr;
    }
}
