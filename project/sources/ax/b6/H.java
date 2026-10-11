package ax.b6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class H {
    private static C1558g a(C1558g c1558g, Z2 z2, AbstractC1619n abstractC1619n) {
        return b(c1558g, z2, abstractC1619n, null, null);
    }

    private static C1558g b(C1558g c1558g, Z2 z2, AbstractC1619n abstractC1619n, Boolean bool, Boolean bool2) {
        C1558g c1558g2 = new C1558g();
        Iterator<Integer> z = c1558g.z();
        while (z.hasNext()) {
            int intValue = z.next().intValue();
            if (c1558g.y(intValue)) {
                InterfaceC1658s a = abstractC1619n.a(z2, Arrays.asList(c1558g.q(intValue), new C1594k(Double.valueOf(intValue)), c1558g));
                if (a.e().equals(bool)) {
                    break;
                }
                if (bool2 == null || a.e().equals(bool2)) {
                    c1558g2.x(intValue, a);
                }
            }
        }
        return c1558g2;
    }

    private static InterfaceC1658s c(C1558g c1558g, Z2 z2, List<InterfaceC1658s> list, boolean z) {
        InterfaceC1658s interfaceC1658s;
        C1709y2.k("reduce", 1, list);
        C1709y2.n("reduce", 2, list);
        InterfaceC1658s b = z2.b(list.get(0));
        if (!(b instanceof AbstractC1619n)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC1658s = z2.b(list.get(1));
            if (interfaceC1658s instanceof C1603l) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c1558g.t() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC1658s = null;
        }
        AbstractC1619n abstractC1619n = (AbstractC1619n) b;
        int t = c1558g.t();
        int i = z ? 0 : t - 1;
        int i2 = z ? t - 1 : 0;
        int i3 = z ? 1 : -1;
        if (interfaceC1658s == null) {
            interfaceC1658s = c1558g.q(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (c1558g.y(i)) {
                interfaceC1658s = abstractC1619n.a(z2, Arrays.asList(interfaceC1658s, c1558g.q(i), new C1594k(Double.valueOf(i)), c1558g));
                if (interfaceC1658s instanceof C1603l) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return interfaceC1658s;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static InterfaceC1658s d(String str, C1558g c1558g, Z2 z2, List<InterfaceC1658s> list) {
        String str2;
        char c;
        double d;
        String str3;
        AbstractC1619n abstractC1619n;
        Z2 z22;
        Double d2;
        double d3;
        str.getClass();
        Double valueOf = Double.valueOf(-1.0d);
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c = 1;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c = 2;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    str2 = "toString";
                    c = 3;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = 18;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            default:
                str2 = "toString";
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                C1709y2.g(str2, 0, list);
                return new C1674u(c1558g.toString());
            case 1:
                C1558g c1558g2 = (C1558g) c1558g.c();
                if (!list.isEmpty()) {
                    Iterator<InterfaceC1658s> it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC1658s b = z2.b(it.next());
                        if (b instanceof C1603l) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int t = c1558g2.t();
                        if (b instanceof C1558g) {
                            C1558g c1558g3 = (C1558g) b;
                            Iterator<Integer> z = c1558g3.z();
                            while (z.hasNext()) {
                                Integer next = z.next();
                                c1558g2.x(next.intValue() + t, c1558g3.q(next.intValue()));
                            }
                        } else {
                            c1558g2.x(t, b);
                        }
                    }
                }
                return c1558g2;
            case 2:
                C1709y2.g("filter", 1, list);
                InterfaceC1658s b2 = z2.b(list.get(0));
                if (!(b2 instanceof C1666t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c1558g.p() == 0) {
                    return new C1558g();
                }
                C1558g c1558g4 = (C1558g) c1558g.c();
                C1558g b3 = b(c1558g, z2, (C1666t) b2, null, Boolean.TRUE);
                C1558g c1558g5 = new C1558g();
                Iterator<Integer> z3 = b3.z();
                while (z3.hasNext()) {
                    c1558g5.s(c1558g4.q(z3.next().intValue()));
                }
                return c1558g5;
            case 3:
                return c(c1558g, z2, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new C1558g();
                }
                int a = (int) C1709y2.a(z2.b(list.get(0)).f().doubleValue());
                if (a < 0) {
                    a = Math.max(0, a + c1558g.t());
                } else if (a > c1558g.t()) {
                    a = c1558g.t();
                }
                int t2 = c1558g.t();
                C1558g c1558g6 = new C1558g();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) C1709y2.a(z2.b(list.get(1)).f().doubleValue()));
                    if (max > 0) {
                        for (int i = a; i < Math.min(t2, a + max); i++) {
                            c1558g6.s(c1558g.q(a));
                            c1558g.w(a);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i2 = 2; i2 < list.size(); i2++) {
                            InterfaceC1658s b4 = z2.b(list.get(i2));
                            if (b4 instanceof C1603l) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            c1558g.r((a + i2) - 2, b4);
                        }
                    }
                } else {
                    while (a < t2) {
                        c1558g6.s(c1558g.q(a));
                        c1558g.x(a, null);
                        a++;
                    }
                }
                return c1558g6;
            case 5:
                C1709y2.g("forEach", 1, list);
                InterfaceC1658s b5 = z2.b(list.get(0));
                if (!(b5 instanceof C1666t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c1558g.p() == 0) {
                    return InterfaceC1658s.f;
                }
                a(c1558g, z2, (C1666t) b5);
                return InterfaceC1658s.f;
            case 6:
                C1709y2.n("lastIndexOf", 2, list);
                InterfaceC1658s interfaceC1658s = InterfaceC1658s.f;
                if (!list.isEmpty()) {
                    interfaceC1658s = z2.b(list.get(0));
                }
                double t3 = c1558g.t() - 1;
                if (list.size() > 1) {
                    InterfaceC1658s b6 = z2.b(list.get(1));
                    t3 = Double.isNaN(b6.f().doubleValue()) ? c1558g.t() - 1 : C1709y2.a(b6.f().doubleValue());
                    d = 0.0d;
                    if (t3 < 0.0d) {
                        t3 += c1558g.t();
                    }
                } else {
                    d = 0.0d;
                }
                if (t3 < d) {
                    return new C1594k(valueOf);
                }
                for (int min = (int) Math.min(c1558g.t(), t3); min >= 0; min--) {
                    if (c1558g.y(min) && C1709y2.h(c1558g.q(min), interfaceC1658s)) {
                        return new C1594k(Double.valueOf(min));
                    }
                }
                return new C1594k(valueOf);
            case 7:
                if (!list.isEmpty()) {
                    C1558g c1558g7 = new C1558g();
                    Iterator<InterfaceC1658s> it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1658s b7 = z2.b(it2.next());
                        if (b7 instanceof C1603l) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        c1558g7.s(b7);
                    }
                    int t4 = c1558g7.t();
                    Iterator<Integer> z4 = c1558g.z();
                    while (z4.hasNext()) {
                        Integer next2 = z4.next();
                        c1558g7.x(next2.intValue() + t4, c1558g.q(next2.intValue()));
                    }
                    c1558g.B();
                    Iterator<Integer> z5 = c1558g7.z();
                    while (z5.hasNext()) {
                        Integer next3 = z5.next();
                        c1558g.x(next3.intValue(), c1558g7.q(next3.intValue()));
                    }
                }
                return new C1594k(Double.valueOf(c1558g.t()));
            case '\b':
                C1709y2.g("map", 1, list);
                InterfaceC1658s b8 = z2.b(list.get(0));
                if (b8 instanceof C1666t) {
                    return c1558g.t() == 0 ? new C1558g() : a(c1558g, z2, (C1666t) b8);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                C1709y2.g("pop", 0, list);
                int t5 = c1558g.t();
                if (t5 == 0) {
                    return InterfaceC1658s.f;
                }
                int i3 = t5 - 1;
                InterfaceC1658s q = c1558g.q(i3);
                c1558g.w(i3);
                return q;
            case '\n':
                C1709y2.n("join", 1, list);
                if (c1558g.t() == 0) {
                    return InterfaceC1658s.m;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    InterfaceC1658s b9 = z2.b(list.get(0));
                    str3 = ((b9 instanceof C1643q) || (b9 instanceof C1714z)) ? HttpUrl.FRAGMENT_ENCODE_SET : b9.g();
                }
                return new C1674u(c1558g.u(str3));
            case 11:
                if (!list.isEmpty()) {
                    Iterator<InterfaceC1658s> it3 = list.iterator();
                    while (it3.hasNext()) {
                        c1558g.s(z2.b(it3.next()));
                    }
                }
                return new C1594k(Double.valueOf(c1558g.t()));
            case '\f':
                C1709y2.g("some", 1, list);
                InterfaceC1658s b10 = z2.b(list.get(0));
                if (!(b10 instanceof AbstractC1619n)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c1558g.t() != 0) {
                    AbstractC1619n abstractC1619n2 = (AbstractC1619n) b10;
                    Iterator<Integer> z6 = c1558g.z();
                    while (z6.hasNext()) {
                        int intValue = z6.next().intValue();
                        if (c1558g.y(intValue) && abstractC1619n2.a(z2, Arrays.asList(c1558g.q(intValue), new C1594k(Double.valueOf(intValue)), c1558g)).e().booleanValue()) {
                            return InterfaceC1658s.k;
                        }
                    }
                }
                return InterfaceC1658s.l;
            case '\r':
                C1709y2.n("sort", 1, list);
                if (c1558g.t() >= 2) {
                    List<InterfaceC1658s> A = c1558g.A();
                    if (list.isEmpty()) {
                        abstractC1619n = null;
                    } else {
                        InterfaceC1658s b11 = z2.b(list.get(0));
                        if (!(b11 instanceof AbstractC1619n)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC1619n = (AbstractC1619n) b11;
                    }
                    Collections.sort(A, new K(abstractC1619n, z2));
                    c1558g.B();
                    Iterator<InterfaceC1658s> it4 = A.iterator();
                    int i4 = 0;
                    while (it4.hasNext()) {
                        c1558g.x(i4, it4.next());
                        i4++;
                    }
                }
                return c1558g;
            case 14:
                C1709y2.g("every", 1, list);
                InterfaceC1658s b12 = z2.b(list.get(0));
                if (b12 instanceof C1666t) {
                    return (c1558g.t() == 0 || b(c1558g, z2, (C1666t) b12, Boolean.FALSE, Boolean.TRUE).t() == c1558g.t()) ? InterfaceC1658s.k : InterfaceC1658s.l;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                C1709y2.g("shift", 0, list);
                if (c1558g.t() == 0) {
                    return InterfaceC1658s.f;
                }
                InterfaceC1658s q2 = c1558g.q(0);
                c1558g.w(0);
                return q2;
            case 16:
                C1709y2.n("slice", 2, list);
                if (list.isEmpty()) {
                    return c1558g.c();
                }
                double t6 = c1558g.t();
                double a2 = C1709y2.a(z2.b(list.get(0)).f().doubleValue());
                double max2 = a2 < 0.0d ? Math.max(a2 + t6, 0.0d) : Math.min(a2, t6);
                if (list.size() == 2) {
                    double a3 = C1709y2.a(z2.b(list.get(1)).f().doubleValue());
                    t6 = a3 < 0.0d ? Math.max(t6 + a3, 0.0d) : Math.min(t6, a3);
                }
                C1558g c1558g8 = new C1558g();
                for (int i5 = (int) max2; i5 < t6; i5++) {
                    c1558g8.s(c1558g.q(i5));
                }
                return c1558g8;
            case 17:
                return c(c1558g, z2, list, false);
            case 18:
                C1709y2.g("reverse", 0, list);
                int t7 = c1558g.t();
                if (t7 != 0) {
                    for (int i6 = 0; i6 < t7 / 2; i6++) {
                        if (c1558g.y(i6)) {
                            InterfaceC1658s q3 = c1558g.q(i6);
                            c1558g.x(i6, null);
                            int i7 = (t7 - 1) - i6;
                            if (c1558g.y(i7)) {
                                c1558g.x(i6, c1558g.q(i7));
                            }
                            c1558g.x(i7, q3);
                        }
                    }
                }
                return c1558g;
            case 19:
                C1709y2.n("indexOf", 2, list);
                InterfaceC1658s interfaceC1658s2 = InterfaceC1658s.f;
                if (list.isEmpty()) {
                    z22 = z2;
                } else {
                    z22 = z2;
                    interfaceC1658s2 = z22.b(list.get(0));
                }
                if (list.size() > 1) {
                    d3 = C1709y2.a(z22.b(list.get(1)).f().doubleValue());
                    if (d3 >= c1558g.t()) {
                        return new C1594k(valueOf);
                    }
                    d2 = valueOf;
                    if (d3 < 0.0d) {
                        d3 += c1558g.t();
                    }
                } else {
                    d2 = valueOf;
                    d3 = 0.0d;
                }
                Iterator<Integer> z7 = c1558g.z();
                while (z7.hasNext()) {
                    int intValue2 = z7.next().intValue();
                    double d4 = intValue2;
                    if (d4 >= d3 && C1709y2.h(c1558g.q(intValue2), interfaceC1658s2)) {
                        return new C1594k(Double.valueOf(d4));
                    }
                }
                return new C1594k(d2);
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
