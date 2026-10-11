package ax.b6;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class X extends AbstractC1501A {
    protected X() {
        this.a.add(Z.ASSIGN);
        this.a.add(Z.CONST);
        this.a.add(Z.CREATE_ARRAY);
        this.a.add(Z.CREATE_OBJECT);
        this.a.add(Z.EXPRESSION_LIST);
        this.a.add(Z.GET);
        this.a.add(Z.GET_INDEX);
        this.a.add(Z.GET_PROPERTY);
        this.a.add(Z.NULL);
        this.a.add(Z.SET_PROPERTY);
        this.a.add(Z.TYPEOF);
        this.a.add(Z.UNDEFINED);
        this.a.add(Z.VAR);
    }

    @Override // ax.b6.AbstractC1501A
    public final InterfaceC1658s b(String str, Z2 z2, List<InterfaceC1658s> list) {
        String str2;
        int i = 0;
        switch (W.a[C1709y2.c(str).ordinal()]) {
            case 1:
                C1709y2.f(Z.ASSIGN, 2, list);
                InterfaceC1658s b = z2.b(list.get(0));
                if (!(b instanceof C1674u)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b.getClass().getCanonicalName()));
                }
                if (!z2.g(b.g())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b.g()));
                }
                InterfaceC1658s b2 = z2.b(list.get(1));
                z2.h(b.g(), b2);
                return b2;
            case 2:
                C1709y2.j(Z.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    InterfaceC1658s b3 = z2.b(list.get(i2));
                    if (!(b3 instanceof C1674u)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b3.getClass().getCanonicalName()));
                    }
                    z2.f(b3.g(), z2.b(list.get(i2 + 1)));
                }
                return InterfaceC1658s.f;
            case 3:
                if (list.isEmpty()) {
                    return new C1558g();
                }
                C1558g c1558g = new C1558g();
                Iterator<InterfaceC1658s> it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC1658s b4 = z2.b(it.next());
                    if (b4 instanceof C1603l) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    c1558g.x(i, b4);
                    i++;
                }
                return c1558g;
            case 4:
                if (list.isEmpty()) {
                    return new r();
                }
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                r rVar = new r();
                while (i < list.size() - 1) {
                    InterfaceC1658s b5 = z2.b(list.get(i));
                    InterfaceC1658s b6 = z2.b(list.get(i + 1));
                    if ((b5 instanceof C1603l) || (b6 instanceof C1603l)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    rVar.n(b5.g(), b6);
                    i += 2;
                }
                return rVar;
            case 5:
                C1709y2.j(Z.EXPRESSION_LIST, 1, list);
                InterfaceC1658s interfaceC1658s = InterfaceC1658s.f;
                while (i < list.size()) {
                    interfaceC1658s = z2.b(list.get(i));
                    if (interfaceC1658s instanceof C1603l) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i++;
                }
                return interfaceC1658s;
            case 6:
                C1709y2.f(Z.GET, 1, list);
                InterfaceC1658s b7 = z2.b(list.get(0));
                if (b7 instanceof C1674u) {
                    return z2.c(b7.g());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b7.getClass().getCanonicalName()));
            case 7:
            case 8:
                C1709y2.f(Z.GET_PROPERTY, 2, list);
                InterfaceC1658s b8 = z2.b(list.get(0));
                InterfaceC1658s b9 = z2.b(list.get(1));
                if ((b8 instanceof C1558g) && C1709y2.l(b9)) {
                    return ((C1558g) b8).q(b9.f().intValue());
                }
                if (b8 instanceof InterfaceC1611m) {
                    return ((InterfaceC1611m) b8).h(b9.g());
                }
                if (b8 instanceof C1674u) {
                    if ("length".equals(b9.g())) {
                        return new C1594k(Double.valueOf(b8.g().length()));
                    }
                    if (C1709y2.l(b9) && b9.f().doubleValue() < b8.g().length()) {
                        return new C1674u(String.valueOf(b8.g().charAt(b9.f().intValue())));
                    }
                }
                return InterfaceC1658s.f;
            case 9:
                C1709y2.f(Z.NULL, 0, list);
                return InterfaceC1658s.g;
            case 10:
                C1709y2.f(Z.SET_PROPERTY, 3, list);
                InterfaceC1658s b10 = z2.b(list.get(0));
                InterfaceC1658s b11 = z2.b(list.get(1));
                InterfaceC1658s b12 = z2.b(list.get(2));
                if (b10 == InterfaceC1658s.f || b10 == InterfaceC1658s.g) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", b11.g(), b10.g()));
                }
                if ((b10 instanceof C1558g) && (b11 instanceof C1594k)) {
                    ((C1558g) b10).x(b11.f().intValue(), b12);
                    return b12;
                }
                if (b10 instanceof InterfaceC1611m) {
                    ((InterfaceC1611m) b10).n(b11.g(), b12);
                }
                return b12;
            case 11:
                C1709y2.f(Z.TYPEOF, 1, list);
                InterfaceC1658s b13 = z2.b(list.get(0));
                if (b13 instanceof C1714z) {
                    str2 = "undefined";
                } else if (b13 instanceof C1567h) {
                    str2 = "boolean";
                } else if (b13 instanceof C1594k) {
                    str2 = "number";
                } else if (b13 instanceof C1674u) {
                    str2 = "string";
                } else if (b13 instanceof C1666t) {
                    str2 = "function";
                } else {
                    if ((b13 instanceof C1682v) || (b13 instanceof C1603l)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b13));
                    }
                    str2 = "object";
                }
                return new C1674u(str2);
            case 12:
                C1709y2.f(Z.UNDEFINED, 0, list);
                return InterfaceC1658s.f;
            case 13:
                C1709y2.j(Z.VAR, 1, list);
                Iterator<InterfaceC1658s> it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1658s b14 = z2.b(it2.next());
                    if (!(b14 instanceof C1674u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b14.getClass().getCanonicalName()));
                    }
                    z2.e(b14.g(), InterfaceC1658s.f);
                }
                return InterfaceC1658s.f;
            default:
                return super.a(str);
        }
    }
}
