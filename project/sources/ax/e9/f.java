package ax.e9;

import ax.d9.InterfaceC1950a;
import ax.d9.InterfaceC1951b;
import ax.d9.g;
import ax.g9.C2131a;
import j$.util.Objects;

/* loaded from: classes3.dex */
public class f implements g {
    @Override // ax.d9.g
    public InterfaceC1951b a(String str) {
        return b.a(str);
    }

    @Override // ax.d9.g
    public ax.d9.e b(String str) {
        return new e(str);
    }

    @Override // ax.d9.g
    public ax.d9.d c(String str) {
        return Objects.equals(str, "HMACT64") ? new C2131a(b("MD5")) : new d(str);
    }

    @Override // ax.d9.g
    public InterfaceC1950a d(String str) {
        return C1991a.a(str);
    }

    @Override // ax.d9.g
    public ax.d9.c e(String str) {
        return c.a(str);
    }
}
