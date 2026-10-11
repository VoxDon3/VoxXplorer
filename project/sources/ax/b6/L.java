package ax.b6;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class L extends AbstractC1501A {
    protected L() {
        this.a.add(Z.FOR_IN);
        this.a.add(Z.FOR_IN_CONST);
        this.a.add(Z.FOR_IN_LET);
        this.a.add(Z.FOR_LET);
        this.a.add(Z.FOR_OF);
        this.a.add(Z.FOR_OF_CONST);
        this.a.add(Z.FOR_OF_LET);
        this.a.add(Z.WHILE);
    }

    private static InterfaceC1658s c(P p, InterfaceC1658s interfaceC1658s, InterfaceC1658s interfaceC1658s2) {
        return d(p, interfaceC1658s.i(), interfaceC1658s2);
    }

    private static InterfaceC1658s d(P p, Iterator<InterfaceC1658s> it, InterfaceC1658s interfaceC1658s) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC1658s a = p.a(it.next()).a((C1558g) interfaceC1658s);
                if (a instanceof C1603l) {
                    C1603l c1603l = (C1603l) a;
                    if ("break".equals(c1603l.b())) {
                        return InterfaceC1658s.f;
                    }
                    if ("return".equals(c1603l.b())) {
                        return c1603l;
                    }
                }
            }
        }
        return InterfaceC1658s.f;
    }

    private static InterfaceC1658s e(P p, InterfaceC1658s interfaceC1658s, InterfaceC1658s interfaceC1658s2) {
        if (interfaceC1658s instanceof Iterable) {
            return d(p, ((Iterable) interfaceC1658s).iterator(), interfaceC1658s2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // ax.b6.AbstractC1501A
    public final InterfaceC1658s b(String str, Z2 z2, List<InterfaceC1658s> list) {
        switch (O.a[C1709y2.c(str).ordinal()]) {
            case 1:
                C1709y2.f(Z.FOR_IN, 3, list);
                if (!(list.get(0) instanceof C1674u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                String g = list.get(0).g();
                return c(new T(z2, g), z2.b(list.get(1)), z2.b(list.get(2)));
            case 2:
                C1709y2.f(Z.FOR_IN_CONST, 3, list);
                if (!(list.get(0) instanceof C1674u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                String g2 = list.get(0).g();
                return c(new N(z2, g2), z2.b(list.get(1)), z2.b(list.get(2)));
            case 3:
                C1709y2.f(Z.FOR_IN_LET, 3, list);
                if (!(list.get(0) instanceof C1674u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                String g3 = list.get(0).g();
                return c(new Q(z2, g3), z2.b(list.get(1)), z2.b(list.get(2)));
            case 4:
                C1709y2.f(Z.FOR_LET, 4, list);
                InterfaceC1658s b = z2.b(list.get(0));
                if (!(b instanceof C1558g)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C1558g c1558g = (C1558g) b;
                InterfaceC1658s interfaceC1658s = list.get(1);
                InterfaceC1658s interfaceC1658s2 = list.get(2);
                InterfaceC1658s b2 = z2.b(list.get(3));
                Z2 d = z2.d();
                for (int i = 0; i < c1558g.t(); i++) {
                    String g4 = c1558g.q(i).g();
                    d.h(g4, z2.c(g4));
                }
                while (z2.b(interfaceC1658s).e().booleanValue()) {
                    InterfaceC1658s a = z2.a((C1558g) b2);
                    if (a instanceof C1603l) {
                        C1603l c1603l = (C1603l) a;
                        if ("break".equals(c1603l.b())) {
                            return InterfaceC1658s.f;
                        }
                        if ("return".equals(c1603l.b())) {
                            return c1603l;
                        }
                    }
                    Z2 d2 = z2.d();
                    for (int i2 = 0; i2 < c1558g.t(); i2++) {
                        String g5 = c1558g.q(i2).g();
                        d2.h(g5, d.c(g5));
                    }
                    d2.b(interfaceC1658s2);
                    d = d2;
                }
                return InterfaceC1658s.f;
            case 5:
                C1709y2.f(Z.FOR_OF, 3, list);
                if (!(list.get(0) instanceof C1674u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                String g6 = list.get(0).g();
                return e(new T(z2, g6), z2.b(list.get(1)), z2.b(list.get(2)));
            case 6:
                C1709y2.f(Z.FOR_OF_CONST, 3, list);
                if (!(list.get(0) instanceof C1674u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                String g7 = list.get(0).g();
                return e(new N(z2, g7), z2.b(list.get(1)), z2.b(list.get(2)));
            case 7:
                C1709y2.f(Z.FOR_OF_LET, 3, list);
                if (!(list.get(0) instanceof C1674u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                String g8 = list.get(0).g();
                return e(new Q(z2, g8), z2.b(list.get(1)), z2.b(list.get(2)));
            case 8:
                C1709y2.f(Z.WHILE, 4, list);
                InterfaceC1658s interfaceC1658s3 = list.get(0);
                InterfaceC1658s interfaceC1658s4 = list.get(1);
                InterfaceC1658s interfaceC1658s5 = list.get(2);
                InterfaceC1658s b3 = z2.b(list.get(3));
                if (z2.b(interfaceC1658s5).e().booleanValue()) {
                    InterfaceC1658s a2 = z2.a((C1558g) b3);
                    if (a2 instanceof C1603l) {
                        C1603l c1603l2 = (C1603l) a2;
                        if (!"break".equals(c1603l2.b())) {
                            if ("return".equals(c1603l2.b())) {
                                return c1603l2;
                            }
                        }
                        return InterfaceC1658s.f;
                    }
                }
                while (z2.b(interfaceC1658s3).e().booleanValue()) {
                    InterfaceC1658s a3 = z2.a((C1558g) b3);
                    if (a3 instanceof C1603l) {
                        C1603l c1603l3 = (C1603l) a3;
                        if ("break".equals(c1603l3.b())) {
                            return InterfaceC1658s.f;
                        }
                        if ("return".equals(c1603l3.b())) {
                            return c1603l3;
                        }
                    }
                    z2.b(interfaceC1658s4);
                }
                return InterfaceC1658s.f;
            default:
                return super.a(str);
        }
    }
}
