/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A;
import ax.b6.N;
import ax.b6.O;
import ax.b6.P;
import ax.b6.Q;
import ax.b6.T;
import ax.b6.Z;
import ax.b6.Z2;
import ax.b6.g;
import ax.b6.l;
import ax.b6.s;
import ax.b6.u;
import ax.b6.y2;
import java.util.Iterator;
import java.util.List;

public final class L
extends A {
    protected L() {
        this.a.add(Z.C0);
        this.a.add(Z.D0);
        this.a.add(Z.E0);
        this.a.add(Z.F0);
        this.a.add(Z.G0);
        this.a.add(Z.H0);
        this.a.add(Z.I0);
        this.a.add(Z.p1);
    }

    private static s c(P p8, s s8, s s9) {
        return L.d(p8, s8.i(), s9);
    }

    private static s d(P p8, Iterator<s> iterator, s s8) {
        if (iterator != null) {
            while (iterator.hasNext()) {
                s s9 = p8.a(iterator.next()).a((g)s8);
                if (!(s9 instanceof l)) continue;
                if ("break".equals(((l)(s9 = (l)s9)).b())) {
                    return s.f;
                }
                if (!"return".equals(((l)s9).b())) continue;
                return s9;
            }
        }
        return s.f;
    }

    private static s e(P p8, s s8, s s9) {
        if (s8 instanceof Iterable) {
            return L.d(p8, ((Iterable)((Object)s8)).iterator(), s9);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final s b(String object, Z2 z22, List<s> object2) {
        switch (O.a[y2.c((String)object).ordinal()]) {
            default: {
                return super.a((String)object);
            }
            case 8: {
                y2.f(Z.p1, 4, (List<s>)object2);
                s s8 = (s)object2.get(0);
                object = (s)object2.get(1);
                s s9 = (s)object2.get(2);
                object2 = z22.b((s)object2.get(3));
                if (z22.b(s9).e().booleanValue() && (s9 = z22.a((g)object2)) instanceof l) {
                    if ("break".equals(((l)(s9 = (l)s9)).b())) return s.f;
                    if ("return".equals(((l)s9).b())) {
                        return s9;
                    }
                }
                while (z22.b(s8).e().booleanValue()) {
                    s9 = z22.a((g)object2);
                    if (s9 instanceof l) {
                        if ("break".equals(((l)(s9 = (l)s9)).b())) return s.f;
                        if ("return".equals(((l)s9).b())) {
                            return s9;
                        }
                    }
                    z22.b((s)object);
                }
                return s.f;
            }
            case 7: {
                y2.f(Z.I0, 3, (List<s>)object2);
                if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                String string = ((s)object2.get(0)).g();
                object = z22.b((s)object2.get(1));
                object2 = z22.b((s)object2.get(2));
                return L.e(new Q(z22, string), (s)object, (s)object2);
            }
            case 6: {
                y2.f(Z.H0, 3, (List<s>)object2);
                if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                String string = ((s)object2.get(0)).g();
                object = z22.b((s)object2.get(1));
                object2 = z22.b((s)object2.get(2));
                return L.e(new N(z22, string), (s)object, (s)object2);
            }
            case 5: {
                y2.f(Z.G0, 3, (List<s>)object2);
                if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                String string = ((s)object2.get(0)).g();
                object = z22.b((s)object2.get(1));
                object2 = z22.b((s)object2.get(2));
                return L.e(new T(z22, string), (s)object, (s)object2);
            }
            case 4: {
                y2.f(Z.F0, 4, (List<s>)object2);
                object = z22.b((s)object2.get(0));
                if (!(object instanceof g)) throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                g g8 = (g)object;
                s s10 = (s)object2.get(1);
                s s11 = (s)object2.get(2);
                s s12 = z22.b((s)object2.get(3));
                object2 = z22.d();
                int n8 = 0;
                while (true) {
                    object = object2;
                    if (n8 >= g8.t()) break;
                    object = g8.q(n8).g();
                    ((Z2)object2).h((String)object, z22.c((String)object));
                    ++n8;
                }
                while (z22.b(s10).e().booleanValue()) {
                    object2 = z22.a((g)s12);
                    if (object2 instanceof l) {
                        if ("break".equals(((l)(object2 = (l)object2)).b())) return s.f;
                        if ("return".equals(((l)object2).b())) {
                            return object2;
                        }
                    }
                    object2 = z22.d();
                    for (n8 = 0; n8 < g8.t(); ++n8) {
                        String string = g8.q(n8).g();
                        ((Z2)object2).h(string, ((Z2)object).c(string));
                    }
                    ((Z2)object2).b(s11);
                    object = object2;
                }
                return s.f;
            }
            case 3: {
                y2.f(Z.E0, 3, (List<s>)object2);
                if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                String string = ((s)object2.get(0)).g();
                object = z22.b((s)object2.get(1));
                object2 = z22.b((s)object2.get(2));
                return L.c(new Q(z22, string), (s)object, (s)object2);
            }
            case 2: {
                y2.f(Z.D0, 3, (List<s>)object2);
                if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                String string = ((s)object2.get(0)).g();
                object = z22.b((s)object2.get(1));
                object2 = z22.b((s)object2.get(2));
                return L.c(new N(z22, string), (s)object, (s)object2);
            }
            case 1: 
        }
        y2.f(Z.C0, 3, (List<s>)object2);
        if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
        String string = ((s)object2.get(0)).g();
        object = z22.b((s)object2.get(1));
        object2 = z22.b((s)object2.get(2));
        return L.c(new T(z22, string), (s)object, (s)object2);
    }
}

