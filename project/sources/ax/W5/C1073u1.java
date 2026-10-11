package ax.W5;

/* renamed from: ax.W5.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1073u1 implements InterfaceC1032g1 {
    private final InterfaceC1041j1 a;
    private final String b = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
    private final Object[] c;
    private final int d;

    C1073u1(InterfaceC1041j1 interfaceC1041j1, String str, Object[] objArr) {
        this.a = interfaceC1041j1;
        this.c = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i2);
            if (charAt2 < 55296) {
                this.d = (charAt2 << i3) | i;
                return;
            } else {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // ax.W5.InterfaceC1032g1
    public final InterfaceC1041j1 a() {
        return this.a;
    }

    @Override // ax.W5.InterfaceC1032g1
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // ax.W5.InterfaceC1032g1
    public final int c() {
        return (this.d & 1) != 0 ? 1 : 2;
    }

    final String d() {
        return this.b;
    }

    final Object[] e() {
        return this.c;
    }
}
