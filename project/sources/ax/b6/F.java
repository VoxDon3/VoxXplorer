package ax.b6;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class F extends AbstractC1501A {
    protected F() {
        this.a.add(Z.APPLY);
        this.a.add(Z.BLOCK);
        this.a.add(Z.BREAK);
        this.a.add(Z.CASE);
        this.a.add(Z.DEFAULT);
        this.a.add(Z.CONTINUE);
        this.a.add(Z.DEFINE_FUNCTION);
        this.a.add(Z.FN);
        this.a.add(Z.IF);
        this.a.add(Z.QUOTE);
        this.a.add(Z.RETURN);
        this.a.add(Z.SWITCH);
        this.a.add(Z.TERNARY);
    }

    private static InterfaceC1658s c(Z2 z2, List<InterfaceC1658s> list) {
        C1709y2.j(Z.FN, 2, list);
        InterfaceC1658s b = z2.b(list.get(0));
        InterfaceC1658s b2 = z2.b(list.get(1));
        if (!(b2 instanceof C1558g)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b2.getClass().getCanonicalName()));
        }
        List<InterfaceC1658s> A = ((C1558g) b2).A();
        List<InterfaceC1658s> arrayList = new ArrayList<>();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C1666t(b.g(), A, arrayList, z2);
    }

    @Override // ax.b6.AbstractC1501A
    public final InterfaceC1658s b(String str, Z2 z2, List<InterfaceC1658s> list) {
        int i = 0;
        switch (I.a[C1709y2.c(str).ordinal()]) {
            case 1:
                C1709y2.f(Z.APPLY, 3, list);
                InterfaceC1658s b = z2.b(list.get(0));
                String g = z2.b(list.get(1)).g();
                InterfaceC1658s b2 = z2.b(list.get(2));
                if (!(b2 instanceof C1558g)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", b2.getClass().getCanonicalName()));
                }
                if (g.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return b.k(g, z2, ((C1558g) b2).A());
            case 2:
                return z2.d().a(new C1558g(list));
            case 3:
                C1709y2.f(Z.BREAK, 0, list);
                return InterfaceC1658s.i;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    InterfaceC1658s b3 = z2.b(list.get(0));
                    if (b3 instanceof C1558g) {
                        return z2.a((C1558g) b3);
                    }
                }
                return InterfaceC1658s.f;
            case 6:
                C1709y2.f(Z.BREAK, 0, list);
                return InterfaceC1658s.h;
            case 7:
                C1709y2.j(Z.DEFINE_FUNCTION, 2, list);
                C1666t c1666t = (C1666t) c(z2, list);
                if (c1666t.b() == null) {
                    z2.h(HttpUrl.FRAGMENT_ENCODE_SET, c1666t);
                    return c1666t;
                }
                z2.h(c1666t.b(), c1666t);
                return c1666t;
            case 8:
                return c(z2, list);
            case 9:
                C1709y2.j(Z.IF, 2, list);
                InterfaceC1658s b4 = z2.b(list.get(0));
                InterfaceC1658s b5 = z2.b(list.get(1));
                InterfaceC1658s b6 = list.size() > 2 ? z2.b(list.get(2)) : null;
                InterfaceC1658s interfaceC1658s = InterfaceC1658s.f;
                InterfaceC1658s a = b4.e().booleanValue() ? z2.a((C1558g) b5) : b6 != null ? z2.a((C1558g) b6) : interfaceC1658s;
                return a instanceof C1603l ? a : interfaceC1658s;
            case 10:
                return new C1558g(list);
            case 11:
                if (list.isEmpty()) {
                    return InterfaceC1658s.j;
                }
                C1709y2.f(Z.RETURN, 1, list);
                return new C1603l("return", z2.b(list.get(0)));
            case 12:
                C1709y2.f(Z.SWITCH, 3, list);
                InterfaceC1658s b7 = z2.b(list.get(0));
                InterfaceC1658s b8 = z2.b(list.get(1));
                InterfaceC1658s b9 = z2.b(list.get(2));
                if (!(b8 instanceof C1558g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(b9 instanceof C1558g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C1558g c1558g = (C1558g) b8;
                C1558g c1558g2 = (C1558g) b9;
                boolean z = false;
                while (true) {
                    if (i < c1558g.t()) {
                        if (z || b7.equals(z2.b(c1558g.q(i)))) {
                            InterfaceC1658s b10 = z2.b(c1558g2.q(i));
                            if (!(b10 instanceof C1603l)) {
                                z = true;
                            } else if (!((C1603l) b10).b().equals("break")) {
                                return b10;
                            }
                        }
                        i++;
                    } else if (c1558g.t() + 1 == c1558g2.t()) {
                        InterfaceC1658s b11 = z2.b(c1558g2.q(c1558g.t()));
                        if (b11 instanceof C1603l) {
                            String b12 = ((C1603l) b11).b();
                            if (b12.equals("return") || b12.equals("continue")) {
                                return b11;
                            }
                        }
                    }
                }
                return InterfaceC1658s.f;
            case 13:
                C1709y2.f(Z.TERNARY, 3, list);
                return z2.b(list.get(0)).e().booleanValue() ? z2.b(list.get(1)) : z2.b(list.get(2));
            default:
                return super.a(str);
        }
    }
}
