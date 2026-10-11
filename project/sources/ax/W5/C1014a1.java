package ax.W5;

/* renamed from: ax.W5.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1014a1 implements InterfaceC1035h1 {
    private final InterfaceC1035h1[] a;

    C1014a1(InterfaceC1035h1... interfaceC1035h1Arr) {
        this.a = interfaceC1035h1Arr;
    }

    @Override // ax.W5.InterfaceC1035h1
    public final InterfaceC1032g1 b(Class cls) {
        InterfaceC1035h1[] interfaceC1035h1Arr = this.a;
        for (int i = 0; i < 2; i++) {
            InterfaceC1035h1 interfaceC1035h1 = interfaceC1035h1Arr[i];
            if (interfaceC1035h1.c(cls)) {
                return interfaceC1035h1.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // ax.W5.InterfaceC1035h1
    public final boolean c(Class cls) {
        InterfaceC1035h1[] interfaceC1035h1Arr = this.a;
        for (int i = 0; i < 2; i++) {
            if (interfaceC1035h1Arr[i].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
