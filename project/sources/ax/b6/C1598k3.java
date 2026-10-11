package ax.b6;

/* renamed from: ax.b6.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1598k3 {
    private final boolean a;

    public C1598k3(InterfaceC1623n3 interfaceC1623n3) {
        ax.q7.n.o(interfaceC1623n3, "BuildInfo must be non-null");
        this.a = !interfaceC1623n3.a();
    }

    public final boolean a(String str) {
        ax.q7.n.o(str, "flagName must not be null");
        if (this.a) {
            return C1615m3.a.get().d(str);
        }
        return true;
    }
}
