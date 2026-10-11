package ax.b6;

import java.util.List;

/* loaded from: classes3.dex */
public final class S extends AbstractC1501A {
    protected S() {
        this.a.add(Z.ADD);
        this.a.add(Z.DIVIDE);
        this.a.add(Z.MODULUS);
        this.a.add(Z.MULTIPLY);
        this.a.add(Z.NEGATE);
        this.a.add(Z.POST_DECREMENT);
        this.a.add(Z.POST_INCREMENT);
        this.a.add(Z.PRE_DECREMENT);
        this.a.add(Z.PRE_INCREMENT);
        this.a.add(Z.SUBTRACT);
    }

    @Override // ax.b6.AbstractC1501A
    public final InterfaceC1658s b(String str, Z2 z2, List<InterfaceC1658s> list) {
        switch (V.a[C1709y2.c(str).ordinal()]) {
            case 1:
                C1709y2.f(Z.ADD, 2, list);
                InterfaceC1658s b = z2.b(list.get(0));
                InterfaceC1658s b2 = z2.b(list.get(1));
                if (!(b instanceof InterfaceC1611m) && !(b instanceof C1674u) && !(b2 instanceof InterfaceC1611m) && !(b2 instanceof C1674u)) {
                    return new C1594k(Double.valueOf(b.f().doubleValue() + b2.f().doubleValue()));
                }
                return new C1674u(b.g() + b2.g());
            case 2:
                C1709y2.f(Z.DIVIDE, 2, list);
                return new C1594k(Double.valueOf(z2.b(list.get(0)).f().doubleValue() / z2.b(list.get(1)).f().doubleValue()));
            case 3:
                C1709y2.f(Z.MODULUS, 2, list);
                return new C1594k(Double.valueOf(z2.b(list.get(0)).f().doubleValue() % z2.b(list.get(1)).f().doubleValue()));
            case 4:
                C1709y2.f(Z.MULTIPLY, 2, list);
                return new C1594k(Double.valueOf(z2.b(list.get(0)).f().doubleValue() * z2.b(list.get(1)).f().doubleValue()));
            case 5:
                C1709y2.f(Z.NEGATE, 1, list);
                return new C1594k(Double.valueOf(z2.b(list.get(0)).f().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                C1709y2.g(str, 2, list);
                InterfaceC1658s b3 = z2.b(list.get(0));
                z2.b(list.get(1));
                return b3;
            case 8:
            case 9:
                C1709y2.g(str, 1, list);
                return z2.b(list.get(0));
            case 10:
                C1709y2.f(Z.SUBTRACT, 2, list);
                return new C1594k(Double.valueOf(z2.b(list.get(0)).f().doubleValue() + new C1594k(Double.valueOf(z2.b(list.get(1)).f().doubleValue() * (-1.0d))).f().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
