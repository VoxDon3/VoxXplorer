/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A;
import ax.b6.I;
import ax.b6.Z;
import ax.b6.Z2;
import ax.b6.g;
import ax.b6.l;
import ax.b6.n;
import ax.b6.s;
import ax.b6.t;
import ax.b6.y2;
import java.util.ArrayList;
import java.util.List;

public final class F
extends A {
    protected F() {
        this.a.add(Z.e0);
        this.a.add(Z.n0);
        this.a.add(Z.o0);
        this.a.add(Z.p0);
        this.a.add(Z.v0);
        this.a.add(Z.r0);
        this.a.add(Z.w0);
        this.a.add(Z.B0);
        this.a.add(Z.R0);
        this.a.add(Z.e1);
        this.a.add(Z.h1);
        this.a.add(Z.k1);
        this.a.add(Z.l1);
    }

    private static s c(Z2 z22, List<s> list) {
        y2.j(Z.B0, 2, list);
        s s8 = z22.b(list.get(0));
        List<s> list2 = z22.b(list.get(1));
        if (list2 instanceof g) {
            List<s> list3 = ((g)((Object)list2)).A();
            list2 = new ArrayList();
            if (list.size() > 2) {
                list2 = list.subList(2, list.size());
            }
            return new t(s8.g(), list3, list2, z22);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", list2.getClass().getCanonicalName()));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final s b(String object, Z2 object2, List<s> object3) {
        int n8 = I.a[y2.c((String)object).ordinal()];
        switch (n8) {
            default: {
                return super.a((String)object);
            }
            case 13: {
                y2.f(Z.l1, 3, (List<s>)object3);
                if (!((Z2)object2).b((s)object3.get(0)).e().booleanValue()) return ((Z2)object2).b((s)object3.get(2));
                return ((Z2)object2).b((s)object3.get(1));
            }
            case 12: {
                y2.f(Z.k1, 3, (List<s>)object3);
                object = ((Z2)object2).b((s)object3.get(0));
                s s8 = ((Z2)object2).b((s)object3.get(1));
                s s9 = ((Z2)object2).b((s)object3.get(2));
                if (!(s8 instanceof g)) throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                if (!(s9 instanceof g)) throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                object3 = (g)s8;
                s8 = (g)s9;
                n8 = 0;
                for (int i8 = 0; i8 < ((g)object3).t(); ++i8) {
                    if (n8 == 0 && !object.equals(((Z2)object2).b(((g)object3).q(i8)))) continue;
                    s9 = ((Z2)object2).b(((g)s8).q(i8));
                    if (s9 instanceof l) {
                        if (((l)s9).b().equals("break")) return s.f;
                        return s9;
                    }
                    n8 = 1;
                }
                if (((g)object3).t() + 1 != ((g)s8).t() || !((object = ((Z2)object2).b(((g)s8).q(((g)object3).t()))) instanceof l) || !((String)(object2 = ((l)object).b())).equals("return") && !((String)object2).equals("continue")) return s.f;
                return object;
            }
            case 11: {
                if (object3.isEmpty()) {
                    return s.j;
                }
                y2.f(Z.h1, 1, (List<s>)object3);
                return new l("return", ((Z2)object2).b((s)object3.get(0)));
            }
            case 10: {
                return new g((List<s>)object3);
            }
            case 9: {
                y2.j(Z.R0, 2, (List<s>)object3);
                s s10 = ((Z2)object2).b((s)object3.get(0));
                s s11 = ((Z2)object2).b((s)object3.get(1));
                object = object3.size() > 2 ? ((Z2)object2).b((s)object3.get(2)) : null;
                object3 = s.f;
                object = s10.e() != false ? ((Z2)object2).a((g)s11) : (object != null ? ((Z2)object2).a((g)object) : object3);
                if (!(object instanceof l)) return object3;
                return object;
            }
            case 8: {
                return F.c((Z2)object2, (List<s>)object3);
            }
            case 7: {
                y2.j(Z.w0, 2, (List<s>)object3);
                object = (t)F.c((Z2)object2, (List<s>)object3);
                if (((n)object).b() == null) {
                    ((Z2)object2).h("", (s)object);
                    return object;
                }
                ((Z2)object2).h(((n)object).b(), (s)object);
                return object;
            }
            case 6: {
                y2.f(Z.o0, 0, (List<s>)object3);
                return s.h;
            }
            case 4: 
            case 5: {
                if (object3.isEmpty() || !((object = ((Z2)object2).b((s)object3.get(0))) instanceof g)) return s.f;
                return ((Z2)object2).a((g)object);
            }
            case 3: {
                y2.f(Z.o0, 0, (List<s>)object3);
                return s.i;
            }
            case 2: {
                return ((Z2)object2).d().a(new g((List<s>)object3));
            }
            case 1: 
        }
        y2.f(Z.e0, 3, (List<s>)object3);
        s s12 = ((Z2)object2).b((s)object3.get(0));
        object = ((Z2)object2).b((s)object3.get(1)).g();
        object3 = ((Z2)object2).b((s)object3.get(2));
        if (!(object3 instanceof g)) throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", object3.getClass().getCanonicalName()));
        if (((String)object).isEmpty()) throw new IllegalArgumentException("Function name for apply is undefined");
        return s12.k((String)object, (Z2)object2, ((g)object3).A());
    }
}

