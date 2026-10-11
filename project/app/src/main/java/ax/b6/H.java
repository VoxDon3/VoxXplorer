/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.K;
import ax.b6.Z2;
import ax.b6.g;
import ax.b6.k;
import ax.b6.l;
import ax.b6.n;
import ax.b6.q;
import ax.b6.s;
import ax.b6.t;
import ax.b6.u;
import ax.b6.y2;
import ax.b6.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class H {
    private static g a(g g8, Z2 z22, n n8) {
        return H.b(g8, z22, n8, null, null);
    }

    private static g b(g g8, Z2 z22, n n8, Boolean bl, Boolean bl2) {
        g g9 = new g();
        Iterator<Integer> iterator = g8.z();
        while (iterator.hasNext()) {
            int n9 = iterator.next();
            if (!g8.y(n9)) continue;
            s s8 = n8.a(z22, Arrays.asList(g8.q(n9), new k(Double.valueOf(n9)), g8));
            if (s8.e().equals(bl)) break;
            if (bl2 != null && !s8.e().equals(bl2)) continue;
            g9.x(n9, s8);
        }
        return g9;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private static s c(g g8, Z2 z22, List<s> object, boolean bl) {
        y2.k("reduce", 1, (List<s>)object);
        y2.n("reduce", 2, (List<s>)object);
        Object object2 = z22.b((s)object.get(0));
        if (!(object2 instanceof n)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (object.size() == 2) {
            if ((object = z22.b((s)object.get(1))) instanceof l) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (g8.t() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            object = null;
        }
        n n8 = (n)object2;
        int n9 = g8.t();
        int n10 = bl ? 0 : n9 - 1;
        int n11 = bl ? n9 - 1 : 0;
        n9 = bl ? 1 : -1;
        int n12 = n11;
        int n13 = n10;
        object2 = object;
        int n14 = n9;
        if (object == null) {
            object = g8.q(n10);
            n13 = n10 + n9;
            n12 = n11;
            object2 = object;
            n14 = n9;
        }
        while ((n12 - n13) * n14 >= 0) {
            n11 = n12;
            n10 = n13;
            object = object2;
            n9 = n14;
            if (g8.y(n13)) {
                object = n8.a(z22, Arrays.asList(object2, g8.q(n13), new k(Double.valueOf(n13)), g8));
                if (object instanceof l) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                n11 = n12;
                n10 = n13;
                n9 = n14;
            }
            n13 = n10 + n9;
            n12 = n11;
            object2 = object;
            n14 = n9;
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static s d(String object, g object2, Z2 iterator, List<s> object3) {
        int n8;
        object.getClass();
        Object object4 = -1.0;
        int n9 = -1;
        switch (((String)object).hashCode()) {
            case 1943291465: {
                if (!((String)object).equals("indexOf")) break;
                n9 = 1;
                break;
            }
            case 1099846370: {
                if (!((String)object).equals("reverse")) break;
                n9 = 2;
                break;
            }
            case 965561430: {
                if (!((String)object).equals("reduceRight")) break;
                n9 = 3;
                break;
            }
            case 109526418: {
                if (!((String)object).equals("slice")) break;
                n9 = 4;
                break;
            }
            case 109407362: {
                if (!((String)object).equals("shift")) break;
                n9 = 5;
                break;
            }
            case 96891675: {
                if (!((String)object).equals("every")) break;
                n9 = 6;
                break;
            }
            case 3536286: {
                if (!((String)object).equals("sort")) break;
                n9 = 7;
                break;
            }
            case 3536116: {
                if (!((String)object).equals("some")) break;
                n9 = 8;
                break;
            }
            case 3452698: {
                if (!((String)object).equals("push")) break;
                n9 = 9;
                break;
            }
            case 3267882: {
                if (!((String)object).equals("join")) break;
                n9 = 10;
                break;
            }
            case 111185: {
                if (!((String)object).equals("pop")) break;
                n9 = 11;
                break;
            }
            case 107868: {
                if (!((String)object).equals("map")) break;
                n9 = 12;
                break;
            }
            case -277637751: {
                if (!((String)object).equals("unshift")) break;
                n9 = 13;
                break;
            }
            case -467511597: {
                if (!((String)object).equals("lastIndexOf")) break;
                n9 = 14;
                break;
            }
            case -678635926: {
                if (!((String)object).equals("forEach")) break;
                n9 = 15;
                break;
            }
            case -895859076: {
                if (!((String)object).equals("splice")) break;
                n9 = 16;
                break;
            }
            case -934873754: {
                if (!((String)object).equals("reduce")) break;
                n9 = 17;
                break;
            }
            case -1274492040: {
                if (!((String)object).equals("filter")) break;
                n9 = 18;
                break;
            }
            case -1354795244: {
                if (!((String)object).equals("concat")) break;
                n9 = 19;
                break;
            }
            case -1776922004: {
                if (!((String)object).equals("toString")) break;
                n9 = 20;
                break;
            }
        }
        switch (n9) {
            default: {
                n8 = -1;
                break;
            }
            case 1: {
                n8 = 19;
                break;
            }
            case 2: {
                n8 = 18;
                break;
            }
            case 3: {
                n8 = 17;
                break;
            }
            case 4: {
                n8 = 16;
                break;
            }
            case 5: {
                n8 = 15;
                break;
            }
            case 6: {
                n8 = 14;
                break;
            }
            case 7: {
                n8 = 13;
                break;
            }
            case 8: {
                n8 = 12;
                break;
            }
            case 9: {
                n8 = 11;
                break;
            }
            case 10: {
                n8 = 10;
                break;
            }
            case 11: {
                n8 = 9;
                break;
            }
            case 12: {
                n8 = 8;
                break;
            }
            case 13: {
                n8 = 7;
                break;
            }
            case 14: {
                n8 = 6;
                break;
            }
            case 15: {
                n8 = 5;
                break;
            }
            case 16: {
                n8 = 4;
                break;
            }
            case 17: {
                n8 = 3;
                break;
            }
            case 18: {
                n8 = 2;
                break;
            }
            case 19: {
                n8 = 1;
                break;
            }
            case 20: {
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
            case 19: {
                double d8;
                double d9;
                y2.n("indexOf", 2, (List<s>)object3);
                object = s.f;
                if (!object3.isEmpty()) {
                    object = ((Z2)((Object)iterator)).b((s)object3.get(0));
                }
                if (object3.size() > 1) {
                    d9 = y2.a(((Z2)((Object)iterator)).b((s)object3.get(1)).f());
                    if (d9 >= (double)((g)object2).t()) {
                        return new k((Double)object4);
                    }
                    d8 = d9;
                    if (d9 < 0.0) {
                        d8 = d9 + (double)((g)object2).t();
                    }
                } else {
                    d8 = 0.0;
                }
                iterator = ((g)object2).z();
                do {
                    if (!iterator.hasNext()) return new k((Double)object4);
                } while ((d9 = (double)(n8 = iterator.next().intValue())) < d8 || !y2.h(((g)object2).q(n8), (s)object));
                return new k(d9);
            }
            case 18: {
                y2.g("reverse", 0, (List<s>)object3);
                int n10 = ((g)object2).t();
                if (n10 == 0) return object2;
                n8 = 0;
                while (n8 < n10 / 2) {
                    if (((g)object2).y(n8)) {
                        object = ((g)object2).q(n8);
                        ((g)object2).x(n8, null);
                        int n11 = n10 - 1 - n8;
                        if (((g)object2).y(n11)) {
                            ((g)object2).x(n8, ((g)object2).q(n11));
                        }
                        ((g)object2).x(n11, (s)object);
                    }
                    ++n8;
                }
                return object2;
            }
            case 17: {
                return H.c((g)object2, iterator, (List<s>)object3, false);
            }
            case 16: {
                y2.n("slice", 2, (List<s>)object3);
                if (object3.isEmpty()) {
                    return ((g)object2).c();
                }
                double d10 = ((g)object2).t();
                double d11 = y2.a(((Z2)((Object)iterator)).b((s)object3.get(0)).f());
                double d12 = d11 < 0.0 ? Math.max(d11 + d10, 0.0) : Math.min(d11, d10);
                d11 = d10;
                if (object3.size() == 2) {
                    d11 = y2.a(((Z2)((Object)iterator)).b((s)object3.get(1)).f());
                    d11 = d11 < 0.0 ? Math.max(d10 + d11, 0.0) : Math.min(d10, d11);
                }
                object = new g();
                n8 = (int)d12;
                while ((double)n8 < d11) {
                    ((g)object).s(((g)object2).q(n8));
                    ++n8;
                }
                return object;
            }
            case 15: {
                y2.g("shift", 0, (List<s>)object3);
                if (((g)object2).t() == 0) {
                    return s.f;
                }
                object = ((g)object2).q(0);
                ((g)object2).w(0);
                return object;
            }
            case 14: {
                y2.g("every", 1, (List<s>)object3);
                object = ((Z2)((Object)iterator)).b((s)object3.get(0));
                if (!(object instanceof t)) throw new IllegalArgumentException("Callback should be a method");
                if (((g)object2).t() == 0) return s.k;
                if (H.b(object2, iterator, (t)object, Boolean.FALSE, Boolean.TRUE).t() == ((g)object2).t()) return s.k;
                return s.l;
            }
            case 13: {
                y2.n("sort", 1, (List<s>)object3);
                if (((g)object2).t() < 2) return object2;
                object4 = ((g)object2).A();
                if (!object3.isEmpty()) {
                    object = ((Z2)((Object)iterator)).b((s)object3.get(0));
                    if (!(object instanceof n)) throw new IllegalArgumentException("Comparator should be a method");
                    object = (n)object;
                } else {
                    object = null;
                }
                Collections.sort(object4, new K((n)object, (Z2)((Object)iterator)));
                ((g)object2).B();
                object = object4.iterator();
                n8 = 0;
                while (object.hasNext()) {
                    ((g)object2).x(n8, (s)object.next());
                    ++n8;
                }
                return object2;
            }
            case 12: {
                y2.g("some", 1, (List<s>)object3);
                object = ((Z2)((Object)iterator)).b((s)object3.get(0));
                if (!(object instanceof n)) throw new IllegalArgumentException("Callback should be a method");
                if (((g)object2).t() == 0) return s.l;
                object3 = (n)object;
                object = ((g)object2).z();
                do {
                    if (!object.hasNext()) return s.l;
                } while (!((g)object2).y(n8 = ((Integer)object.next()).intValue()) || !((n)object3).a((Z2)((Object)iterator), Arrays.asList(((g)object2).q(n8), new k(Double.valueOf(n8)), object2)).e().booleanValue());
                return s.k;
            }
            case 11: {
                if (object3.isEmpty()) return new k(Double.valueOf(((g)object2).t()));
                object = object3.iterator();
                while (object.hasNext()) {
                    ((g)object2).s(((Z2)((Object)iterator)).b((s)object.next()));
                }
                return new k(Double.valueOf(((g)object2).t()));
            }
            case 10: {
                y2.n("join", 1, (List<s>)object3);
                if (((g)object2).t() == 0) {
                    return s.m;
                }
                if (object3.isEmpty()) {
                    object = ",";
                    return new u(((g)object2).u((String)object));
                }
                object = ((Z2)((Object)iterator)).b((s)object3.get(0));
                if (!(object instanceof q) && !(object instanceof z)) {
                    object = object.g();
                    return new u(((g)object2).u((String)object));
                }
                object = "";
                return new u(((g)object2).u((String)object));
            }
            case 9: {
                y2.g("pop", 0, (List<s>)object3);
                n8 = ((g)object2).t();
                if (n8 == 0) {
                    return s.f;
                }
                object = ((g)object2).q(--n8);
                ((g)object2).w(n8);
                return object;
            }
            case 8: {
                y2.g("map", 1, (List<s>)object3);
                object = ((Z2)((Object)iterator)).b((s)object3.get(0));
                if (!(object instanceof t)) throw new IllegalArgumentException("Callback should be a method");
                if (((g)object2).t() != 0) return H.a(object2, iterator, (t)object);
                return new g();
            }
            case 7: {
                if (object3.isEmpty()) return new k(Double.valueOf(((g)object2).t()));
                object = new g();
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    object4 = ((Z2)((Object)iterator)).b((s)object3.next());
                    if (object4 instanceof l) throw new IllegalStateException("Argument evaluation failed");
                    ((g)object).s((s)object4);
                }
                n8 = ((g)object).t();
                object3 = ((g)object2).z();
                while (object3.hasNext()) {
                    iterator = (Integer)object3.next();
                    ((g)object).x((Integer)((Object)iterator) + n8, ((g)object2).q((Integer)((Object)iterator)));
                }
                ((g)object2).B();
                iterator = ((g)object).z();
                while (iterator.hasNext()) {
                    object3 = (Integer)iterator.next();
                    ((g)object2).x((Integer)object3, ((g)object).q((Integer)object3));
                }
                return new k(Double.valueOf(((g)object2).t()));
            }
            case 6: {
                y2.n("lastIndexOf", 2, (List<s>)object3);
                object = s.f;
                if (!object3.isEmpty()) {
                    object = ((Z2)((Object)iterator)).b((s)object3.get(0));
                }
                double d13 = ((g)object2).t() - 1;
                if (object3.size() > 1) {
                    d13 = Double.isNaN((iterator = ((Z2)((Object)iterator)).b((s)object3.get(1))).f()) ? (double)(((g)object2).t() - 1) : y2.a(iterator.f());
                    double d14 = d13;
                    d13 = d14;
                    if (d14 < 0.0) {
                        d13 = d14 + (double)((g)object2).t();
                    }
                }
                if (d13 < 0.0) {
                    return new k((Double)object4);
                }
                n8 = (int)Math.min((double)((g)object2).t(), d13);
                while (n8 >= 0) {
                    if (((g)object2).y(n8) && y2.h(((g)object2).q(n8), (s)object)) {
                        return new k(Double.valueOf(n8));
                    }
                    --n8;
                }
                return new k((Double)object4);
            }
            case 5: {
                y2.g("forEach", 1, (List<s>)object3);
                object = ((Z2)((Object)iterator)).b((s)object3.get(0));
                if (!(object instanceof t)) throw new IllegalArgumentException("Callback should be a method");
                if (((g)object2).p() == 0) {
                    return s.f;
                }
                H.a(object2, iterator, (t)object);
                return s.f;
            }
            case 4: {
                if (object3.isEmpty()) {
                    return new g();
                }
                int n12 = (int)y2.a(((Z2)((Object)iterator)).b((s)object3.get(0)).f());
                if (n12 < 0) {
                    n8 = Math.max(0, n12 + ((g)object2).t());
                } else {
                    n8 = n12;
                    if (n12 > ((g)object2).t()) {
                        n8 = ((g)object2).t();
                    }
                }
                int n13 = ((g)object2).t();
                object = new g();
                n12 = n8;
                if (object3.size() <= 1) {
                    while (n12 < n13) {
                        ((g)object).s(((g)object2).q(n12));
                        ((g)object2).x(n12, null);
                        ++n12;
                    }
                    return object;
                }
                int n14 = Math.max(0, (int)y2.a(((Z2)((Object)iterator)).b((s)object3.get(1)).f()));
                if (n14 > 0) {
                    for (n12 = n8; n12 < Math.min(n13, n8 + n14); ++n12) {
                        ((g)object).s(((g)object2).q(n8));
                        ((g)object2).w(n8);
                    }
                }
                if (object3.size() <= 2) return object;
                n12 = 2;
                while (n12 < object3.size()) {
                    object4 = ((Z2)((Object)iterator)).b((s)object3.get(n12));
                    if (object4 instanceof l) throw new IllegalArgumentException("Failed to parse elements to add");
                    ((g)object2).r(n8 + n12 - 2, (s)object4);
                    ++n12;
                }
                return object;
            }
            case 3: {
                return H.c((g)object2, iterator, (List<s>)object3, true);
            }
            case 2: {
                y2.g("filter", 1, (List<s>)object3);
                object3 = ((Z2)((Object)iterator)).b((s)object3.get(0));
                if (!(object3 instanceof t)) throw new IllegalArgumentException("Callback should be a method");
                if (((g)object2).p() == 0) {
                    return new g();
                }
                object = (g)((g)object2).c();
                iterator = H.b(object2, iterator, (t)object3, null, Boolean.TRUE);
                object2 = new g();
                iterator = ((g)((Object)iterator)).z();
                while (iterator.hasNext()) {
                    ((g)object2).s(((g)object).q(iterator.next()));
                }
                return object2;
            }
            case 1: {
                object = (g)((g)object2).c();
                if (object3.isEmpty()) return object;
                object2 = object3.iterator();
                block80: while (object2.hasNext()) {
                    object3 = ((Z2)((Object)iterator)).b((s)object2.next());
                    if (object3 instanceof l) throw new IllegalStateException("Failed evaluation of arguments");
                    n8 = ((g)object).t();
                    if (object3 instanceof g) {
                        g g8 = (g)object3;
                        object3 = g8.z();
                        while (true) {
                            if (!object3.hasNext()) continue block80;
                            object4 = object3.next();
                            ((g)object).x((Integer)object4 + n8, g8.q((Integer)object4));
                        }
                    }
                    ((g)object).x(n8, (s)object3);
                }
                return object;
            }
            case 0: 
        }
        y2.g("toString", 0, (List<s>)object3);
        return new u(((g)object2).toString());
    }
}

