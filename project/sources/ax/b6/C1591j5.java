package ax.b6;

/* renamed from: ax.b6.j5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1591j5 implements S4 {
    private final U4 a;
    private final String b;
    private final Object[] c;
    private final int d;

    C1591j5(U4 u4, String str, Object[] objArr) {
        this.a = u4;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // ax.b6.S4
    public final U4 a() {
        return this.a;
    }

    @Override // ax.b6.S4
    public final EnumC1555f5 b() {
        int i = this.d;
        return (i & 1) != 0 ? EnumC1555f5.PROTO2 : (i & 4) == 4 ? EnumC1555f5.EDITIONS : EnumC1555f5.PROTO3;
    }

    @Override // ax.b6.S4
    public final boolean c() {
        return (this.d & 2) == 2;
    }

    final String d() {
        return this.b;
    }

    final Object[] e() {
        return this.c;
    }
}
