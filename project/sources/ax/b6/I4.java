package ax.b6;

/* loaded from: classes3.dex */
final class I4 implements InterfaceC1600k5 {
    private static final R4 b = new H4();
    private final R4 a;

    public I4() {
        this(new J4(C1608l4.c(), b));
    }

    @Override // ax.b6.InterfaceC1600k5
    public final <T> InterfaceC1609l5<T> a(Class<T> cls) {
        C1625n5.o(cls);
        S4 a = this.a.a(cls);
        if (a.c()) {
            return Z4.j(C1625n5.f(), C1509a4.a(), a.a());
        }
        return X4.n(cls, a, C1546e5.a(), G4.a(), C1625n5.f(), K4.a[a.b().ordinal()] != 1 ? C1509a4.a() : null, P4.a());
    }

    private I4(R4 r4) {
        this.a = (R4) C1616m4.f(r4, "messageInfoFactory");
    }
}
