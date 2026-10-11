package ax.n9;

import ax.cc.C1858e;
import ax.dc.InterfaceC1963c;
import ax.fc.C2093d;
import ax.fc.InterfaceC2090a;

/* renamed from: ax.n9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2626c {
    private static final ax.Xd.d b = ax.Xd.f.k(C2626c.class);
    private InterfaceC1963c<InterfaceC2625b> a;

    /* renamed from: ax.n9.c$a */
    class a implements InterfaceC2090a {
        a() {
        }

        @Override // ax.fc.InterfaceC2090a
        public void a(C2093d c2093d) {
            if (c2093d.a() != null) {
                C2626c.b.h(c2093d.toString(), c2093d.a());
            } else {
                C2626c.b.f(c2093d.toString());
            }
        }
    }

    public C2626c() {
        this(new C1858e(new a()));
    }

    public void b(InterfaceC2625b interfaceC2625b) {
        this.a.a(interfaceC2625b);
    }

    public void c(Object obj) {
        this.a.b(obj);
    }

    public C2626c(InterfaceC1963c<InterfaceC2625b> interfaceC1963c) {
        this.a = interfaceC1963c;
    }
}
