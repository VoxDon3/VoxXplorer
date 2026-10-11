package ax.b6;

import java.util.List;

/* loaded from: classes3.dex */
public final class J extends AbstractC1501A {
    protected J() {
        this.a.add(Z.AND);
        this.a.add(Z.NOT);
        this.a.add(Z.OR);
    }

    @Override // ax.b6.AbstractC1501A
    public final InterfaceC1658s b(String str, Z2 z2, List<InterfaceC1658s> list) {
        int i = M.a[C1709y2.c(str).ordinal()];
        if (i == 1) {
            C1709y2.f(Z.AND, 2, list);
            InterfaceC1658s b = z2.b(list.get(0));
            return !b.e().booleanValue() ? b : z2.b(list.get(1));
        }
        if (i == 2) {
            C1709y2.f(Z.NOT, 1, list);
            return new C1567h(Boolean.valueOf(!z2.b(list.get(0)).e().booleanValue()));
        }
        if (i != 3) {
            return super.a(str);
        }
        C1709y2.f(Z.OR, 2, list);
        InterfaceC1658s b2 = z2.b(list.get(0));
        return b2.e().booleanValue() ? b2 : z2.b(list.get(1));
    }
}
