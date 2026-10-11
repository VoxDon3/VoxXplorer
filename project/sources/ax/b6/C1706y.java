package ax.b6;

import java.util.List;

/* renamed from: ax.b6.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1706y extends AbstractC1501A {
    public C1706y() {
        this.a.add(Z.BITWISE_AND);
        this.a.add(Z.BITWISE_LEFT_SHIFT);
        this.a.add(Z.BITWISE_NOT);
        this.a.add(Z.BITWISE_OR);
        this.a.add(Z.BITWISE_RIGHT_SHIFT);
        this.a.add(Z.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(Z.BITWISE_XOR);
    }

    @Override // ax.b6.AbstractC1501A
    public final InterfaceC1658s b(String str, Z2 z2, List<InterfaceC1658s> list) {
        switch (C1502B.a[C1709y2.c(str).ordinal()]) {
            case 1:
                C1709y2.f(Z.BITWISE_AND, 2, list);
                return new C1594k(Double.valueOf(C1709y2.i(z2.b(list.get(0)).f().doubleValue()) & C1709y2.i(z2.b(list.get(1)).f().doubleValue())));
            case 2:
                C1709y2.f(Z.BITWISE_LEFT_SHIFT, 2, list);
                return new C1594k(Double.valueOf(C1709y2.i(z2.b(list.get(0)).f().doubleValue()) << ((int) (C1709y2.m(z2.b(list.get(1)).f().doubleValue()) & 31))));
            case 3:
                C1709y2.f(Z.BITWISE_NOT, 1, list);
                return new C1594k(Double.valueOf(~C1709y2.i(z2.b(list.get(0)).f().doubleValue())));
            case 4:
                C1709y2.f(Z.BITWISE_OR, 2, list);
                return new C1594k(Double.valueOf(C1709y2.i(z2.b(list.get(0)).f().doubleValue()) | C1709y2.i(z2.b(list.get(1)).f().doubleValue())));
            case 5:
                C1709y2.f(Z.BITWISE_RIGHT_SHIFT, 2, list);
                return new C1594k(Double.valueOf(C1709y2.i(z2.b(list.get(0)).f().doubleValue()) >> ((int) (C1709y2.m(z2.b(list.get(1)).f().doubleValue()) & 31))));
            case 6:
                C1709y2.f(Z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new C1594k(Double.valueOf(C1709y2.m(z2.b(list.get(0)).f().doubleValue()) >>> ((int) (C1709y2.m(z2.b(list.get(1)).f().doubleValue()) & 31))));
            case 7:
                C1709y2.f(Z.BITWISE_XOR, 2, list);
                return new C1594k(Double.valueOf(C1709y2.i(z2.b(list.get(0)).f().doubleValue()) ^ C1709y2.i(z2.b(list.get(1)).f().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
