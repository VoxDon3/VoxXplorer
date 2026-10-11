/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A;
import ax.b6.W;
import ax.b6.Z;
import ax.b6.Z2;
import ax.b6.g;
import ax.b6.h;
import ax.b6.k;
import ax.b6.l;
import ax.b6.m;
import ax.b6.r;
import ax.b6.s;
import ax.b6.t;
import ax.b6.u;
import ax.b6.v;
import ax.b6.y2;
import ax.b6.z;
import java.util.Iterator;
import java.util.List;

public final class X
extends A {
    protected X() {
        this.a.add(Z.f0);
        this.a.add(Z.q0);
        this.a.add(Z.t0);
        this.a.add(Z.u0);
        this.a.add(Z.A0);
        this.a.add(Z.J0);
        this.a.add(Z.L0);
        this.a.add(Z.M0);
        this.a.add(Z.Z0);
        this.a.add(Z.i1);
        this.a.add(Z.m1);
        this.a.add(Z.n1);
        this.a.add(Z.o1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final s b(String object, Z2 object2, List<s> object3) {
        int n8 = W.a[y2.c((String)object).ordinal()];
        int n9 = 0;
        int n10 = 0;
        switch (n8) {
            default: {
                return super.a((String)object);
            }
            case 13: {
                y2.j(Z.o1, 1, (List<s>)object3);
                object = object3.iterator();
                while (object.hasNext()) {
                    object3 = ((Z2)object2).b((s)object.next());
                    if (!(object3 instanceof u)) throw new IllegalArgumentException(String.format("Expected string for var name. got %s", object3.getClass().getCanonicalName()));
                    ((Z2)object2).e(object3.g(), s.f);
                }
                return s.f;
            }
            case 12: {
                y2.f(Z.n1, 0, (List<s>)object3);
                return s.f;
            }
            case 11: {
                y2.f(Z.m1, 1, (List<s>)object3);
                object = ((Z2)object2).b((s)object3.get(0));
                if (object instanceof z) {
                    object = "undefined";
                    return new u((String)object);
                } else if (object instanceof h) {
                    object = "boolean";
                    return new u((String)object);
                } else if (object instanceof k) {
                    object = "number";
                    return new u((String)object);
                } else if (object instanceof u) {
                    object = "string";
                    return new u((String)object);
                } else if (object instanceof t) {
                    object = "function";
                    return new u((String)object);
                } else {
                    if (object instanceof v || object instanceof l) throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", object));
                    object = "object";
                }
                return new u((String)object);
            }
            case 10: {
                y2.f(Z.i1, 3, (List<s>)object3);
                s s8 = ((Z2)object2).b((s)object3.get(0));
                object = ((Z2)object2).b((s)object3.get(1));
                object2 = ((Z2)object2).b((s)object3.get(2));
                if (s8 == s.f || s8 == s.g) throw new IllegalStateException(String.format("Can't set property %s of %s", object.g(), s8.g()));
                if (s8 instanceof g && object instanceof k) {
                    ((g)s8).x(object.f().intValue(), (s)object2);
                    return object2;
                }
                if (!(s8 instanceof m)) return object2;
                ((m)((Object)s8)).n(object.g(), (s)object2);
                return object2;
            }
            case 9: {
                y2.f(Z.Z0, 0, (List<s>)object3);
                return s.g;
            }
            case 7: 
            case 8: {
                y2.f(Z.M0, 2, (List<s>)object3);
                object = ((Z2)object2).b((s)object3.get(0));
                object2 = ((Z2)object2).b((s)object3.get(1));
                if (object instanceof g && y2.l((s)object2)) {
                    return ((g)object).q(object2.f().intValue());
                }
                if (object instanceof m) {
                    return ((m)object).h(object2.g());
                }
                if (!(object instanceof u)) return s.f;
                if ("length".equals(object2.g())) {
                    return new k(Double.valueOf(object.g().length()));
                }
                if (!y2.l((s)object2) || !(object2.f() < (double)object.g().length())) return s.f;
                return new u(String.valueOf(object.g().charAt(object2.f().intValue())));
            }
            case 6: {
                y2.f(Z.J0, 1, (List<s>)object3);
                object = ((Z2)object2).b((s)object3.get(0));
                if (!(object instanceof u)) throw new IllegalArgumentException(String.format("Expected string for get var. got %s", object.getClass().getCanonicalName()));
                return ((Z2)object2).c(object.g());
            }
            case 5: {
                int n11;
                y2.j(Z.A0, 1, (List<s>)object3);
                object = s.f;
                for (n11 = 0; n11 < object3.size(); ++n11) {
                    object = ((Z2)object2).b((s)object3.get(n11));
                    if (object instanceof l) throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                return object;
            }
            case 4: {
                int n11;
                if (object3.isEmpty()) {
                    return new r();
                }
                if (object3.size() % 2 != 0) throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", object3.size()));
                object = new r();
                for (n11 = n9; n11 < object3.size() - 1; n11 += 2) {
                    s s9 = ((Z2)object2).b((s)object3.get(n11));
                    s s10 = ((Z2)object2).b((s)object3.get(n11 + 1));
                    if (s9 instanceof l || s10 instanceof l) throw new IllegalStateException("Failed to evaluate map entry");
                    ((r)object).n(s9.g(), s10);
                }
                return object;
            }
            case 3: {
                if (object3.isEmpty()) {
                    return new g();
                }
                object = new g();
                Iterator iterator = object3.iterator();
                int n11 = n10;
                while (iterator.hasNext()) {
                    object3 = ((Z2)object2).b((s)iterator.next());
                    if (object3 instanceof l) throw new IllegalStateException("Failed to evaluate array element");
                    ((g)object).x(n11, (s)object3);
                    ++n11;
                }
                return object;
            }
            case 2: {
                int n11;
                y2.j(Z.q0, 2, (List<s>)object3);
                if (object3.size() % 2 != 0) throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", object3.size()));
                for (n11 = 0; n11 < object3.size() - 1; n11 += 2) {
                    object = ((Z2)object2).b((s)object3.get(n11));
                    if (!(object instanceof u)) throw new IllegalArgumentException(String.format("Expected string for const name. got %s", object.getClass().getCanonicalName()));
                    ((Z2)object2).f(object.g(), ((Z2)object2).b((s)object3.get(n11 + 1)));
                }
                return s.f;
            }
            case 1: 
        }
        y2.f(Z.f0, 2, (List<s>)object3);
        object = ((Z2)object2).b((s)object3.get(0));
        if (!(object instanceof u)) throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", object.getClass().getCanonicalName()));
        if (!((Z2)object2).g(object.g())) throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", object.g()));
        object3 = ((Z2)object2).b((s)object3.get(1));
        ((Z2)object2).h(object.g(), (s)object3);
        return object3;
    }
}

