package ax.b6;

/* loaded from: classes3.dex */
final class Q implements P {
    private final Z2 a;
    private final String b;

    public Q(Z2 z2, String str) {
        this.a = z2;
        this.b = str;
    }

    @Override // ax.b6.P
    public final Z2 a(InterfaceC1658s interfaceC1658s) {
        Z2 d = this.a.d();
        d.e(this.b, interfaceC1658s);
        return d;
    }
}
