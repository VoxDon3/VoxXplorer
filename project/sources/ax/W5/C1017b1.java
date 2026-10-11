package ax.W5;

/* renamed from: ax.W5.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1017b1 implements InterfaceC1079w1 {
    private static final InterfaceC1035h1 b = new Z0();
    private final InterfaceC1035h1 a;

    public C1017b1() {
        InterfaceC1035h1 interfaceC1035h1;
        G0 a = G0.a();
        try {
            interfaceC1035h1 = (InterfaceC1035h1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC1035h1 = b;
        }
        C1014a1 c1014a1 = new C1014a1(a, interfaceC1035h1);
        byte[] bArr = O0.d;
        this.a = c1014a1;
    }

    private static boolean b(InterfaceC1032g1 interfaceC1032g1) {
        return interfaceC1032g1.c() + (-1) != 1;
    }

    @Override // ax.W5.InterfaceC1079w1
    public final InterfaceC1076v1 a(Class cls) {
        C1082x1.e(cls);
        InterfaceC1032g1 b2 = this.a.b(cls);
        return b2.b() ? J0.class.isAssignableFrom(cls) ? C1056o1.a(C1082x1.b(), C0.b(), b2.a()) : C1056o1.a(C1082x1.a(), C0.a(), b2.a()) : J0.class.isAssignableFrom(cls) ? b(b2) ? C1053n1.s(cls, b2, C1062q1.b(), X0.d(), C1082x1.b(), C0.b(), C1029f1.b()) : C1053n1.s(cls, b2, C1062q1.b(), X0.d(), C1082x1.b(), null, C1029f1.b()) : b(b2) ? C1053n1.s(cls, b2, C1062q1.a(), X0.c(), C1082x1.a(), C0.a(), C1029f1.a()) : C1053n1.s(cls, b2, C1062q1.a(), X0.c(), C1082x1.a(), null, C1029f1.a());
    }
}
