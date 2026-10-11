package ax.W5;

import java.io.IOException;

/* renamed from: ax.W5.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1056o1 implements InterfaceC1076v1 {
    private final InterfaceC1041j1 a;
    private final M1 b;
    private final A0 c;

    private C1056o1(M1 m1, A0 a0, InterfaceC1041j1 interfaceC1041j1) {
        this.b = m1;
        this.c = a0;
        this.a = interfaceC1041j1;
    }

    static C1056o1 a(M1 m1, A0 a0, InterfaceC1041j1 interfaceC1041j1) {
        return new C1056o1(m1, a0, interfaceC1041j1);
    }

    @Override // ax.W5.InterfaceC1076v1
    public final int b(Object obj) {
        return this.b.b(obj).hashCode();
    }

    @Override // ax.W5.InterfaceC1076v1
    public final void c(Object obj) {
        this.b.e(obj);
        this.c.b(obj);
    }

    @Override // ax.W5.InterfaceC1076v1
    public final void d(Object obj, byte[] bArr, int i, int i2, C1031g0 c1031g0) throws IOException {
        J0 j0 = (J0) obj;
        if (j0.zzc == O1.a()) {
            j0.zzc = O1.d();
        }
        throw null;
    }

    @Override // ax.W5.InterfaceC1076v1
    public final Object e() {
        InterfaceC1041j1 interfaceC1041j1 = this.a;
        return interfaceC1041j1 instanceof J0 ? ((J0) interfaceC1041j1).c() : ((H0) ((J0) interfaceC1041j1).o(5, null, null)).e();
    }

    @Override // ax.W5.InterfaceC1076v1
    public final void f(Object obj, Object obj2) {
        C1082x1.d(this.b, obj, obj2);
    }

    @Override // ax.W5.InterfaceC1076v1
    public final boolean g(Object obj) {
        this.c.a(obj);
        throw null;
    }

    @Override // ax.W5.InterfaceC1076v1
    public final boolean h(Object obj, Object obj2) {
        return this.b.b(obj).equals(this.b.b(obj2));
    }
}
