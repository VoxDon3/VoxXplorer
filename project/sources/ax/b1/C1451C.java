package ax.b1;

import ax.P0.C0900i;
import ax.S0.C0968a;
import ax.b1.InterfaceC1465n;
import ax.b1.InterfaceC1471u;
import java.util.Map;
import java.util.UUID;

/* renamed from: ax.b1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1451C implements InterfaceC1465n {
    private final InterfaceC1465n.a a;

    public C1451C(InterfaceC1465n.a aVar) {
        this.a = (InterfaceC1465n.a) C0968a.e(aVar);
    }

    @Override // ax.b1.InterfaceC1465n
    public final UUID b() {
        return C0900i.a;
    }

    @Override // ax.b1.InterfaceC1465n
    public boolean d() {
        return false;
    }

    @Override // ax.b1.InterfaceC1465n
    public Map<String, String> e() {
        return null;
    }

    @Override // ax.b1.InterfaceC1465n
    public boolean f(String str) {
        return false;
    }

    @Override // ax.b1.InterfaceC1465n
    public InterfaceC1465n.a g() {
        return this.a;
    }

    @Override // ax.b1.InterfaceC1465n
    public int getState() {
        return 1;
    }

    @Override // ax.b1.InterfaceC1465n
    public ax.V0.b h() {
        return null;
    }

    @Override // ax.b1.InterfaceC1465n
    public void a(InterfaceC1471u.a aVar) {
    }

    @Override // ax.b1.InterfaceC1465n
    public void c(InterfaceC1471u.a aVar) {
    }
}
