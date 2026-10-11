/*
 * Decompiled with CFR 0.152.
 */
package ax.C8;

import ax.C8.a;
import ax.C8.b;
import ax.C8.d;
import ax.D8.a;
import ax.D8.b;
import ax.D8.c;
import ax.E8.a;
import ax.E8.b;
import ax.E8.c;
import ax.E8.d;
import ax.E8.e;
import ax.F8.a;
import ax.F8.b;
import ax.y8.e;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class c<T extends b> {
    private static Map<Integer, c<?>> e;
    public static final c<ax.E8.a> f;
    public static final c<ax.E8.c> g;
    public static final c<ax.F8.a> h;
    public static final c<?> i;
    public static final c<ax.E8.d> j;
    public static final c<ax.E8.e> k;
    public static final c<ax.E8.b> l;
    public static final c<ax.D8.b> m;
    public static final c<ax.D8.a> n;
    private final d a;
    private final int b;
    private final Set<a> c;
    private final a d;

    static {
        c<ax.E8.b> c8;
        c<ax.E8.e> c9;
        c<ax.E8.d> c10;
        c c11;
        c<ax.F8.a> c12;
        c<ax.E8.c> c13;
        c<ax.E8.a> c14;
        e = new HashMap();
        d d8 = ax.C8.d.c0;
        Object object = ax.C8.a.c0;
        f = c14 = new c<ax.E8.a>(d8, 1, (a)((Object)object)){

            @Override
            public ax.y8.d<ax.E8.a> j(ax.z8.a a8) {
                return new a.b(a8);
            }

            @Override
            public e<ax.E8.a> k(ax.z8.b b8) {
                return new a.c(b8);
            }
        };
        g = c13 = new c<ax.E8.c>(d8, 2, (a)((Object)object)){

            @Override
            public ax.y8.d<ax.E8.c> j(ax.z8.a a8) {
                return new c.b(a8);
            }

            @Override
            public e<ax.E8.c> k(ax.z8.b b8) {
                return new c.c(b8);
            }
        };
        Object object2 = ax.C8.a.d0;
        h = c12 = new c<ax.F8.a>(d8, 3, (a)((Object)object), EnumSet.of(object, object2)){

            @Override
            public ax.y8.d<ax.F8.a> j(ax.z8.a a8) {
                return new a.b(a8);
            }

            @Override
            public e<ax.F8.a> k(ax.z8.b b8) {
                return new a.c(b8);
            }
        };
        i = c11 = new c(d8, 4, EnumSet.of(object, object2)){

            public ax.y8.d<?> j(ax.z8.a a8) {
                return new b.a(a8);
            }

            public e k(ax.z8.b b8) {
                return new b.b(b8);
            }
        };
        j = c10 = new c<ax.E8.d>(d8, 5, (a)((Object)object)){

            @Override
            public ax.y8.d<ax.E8.d> j(ax.z8.a a8) {
                return new d.a(a8);
            }

            @Override
            public e<ax.E8.d> k(ax.z8.b b8) {
                return new d.b(b8);
            }
        };
        k = c9 = new c<ax.E8.e>(d8, 6, (a)((Object)object)){

            @Override
            public ax.y8.d<ax.E8.e> j(ax.z8.a a8) {
                return new e.b(a8);
            }

            @Override
            public e<ax.E8.e> k(ax.z8.b b8) {
                return new e.c(b8);
            }
        };
        l = c8 = new c<ax.E8.b>(d8, 10, (a)((Object)object)){

            @Override
            public ax.y8.d<ax.E8.b> j(ax.z8.a a8) {
                return new b.b(a8);
            }

            @Override
            public e<ax.E8.b> k(ax.z8.b b8) {
                return new b.c(b8);
            }
        };
        object = new c<ax.D8.b>(d8, 17, (a)((Object)object2)){

            @Override
            public ax.y8.d<ax.D8.b> j(ax.z8.a a8) {
                return new b.b(a8);
            }

            @Override
            public e<ax.D8.b> k(ax.z8.b b8) {
                return new b.c(b8);
            }
        };
        m = object;
        object2 = new c<ax.D8.a>(d8, 16, (a)((Object)object2)){

            @Override
            public ax.y8.d<ax.D8.a> j(ax.z8.a a8) {
                return new a.b(a8);
            }

            @Override
            public e<ax.D8.a> k(ax.z8.b b8) {
                return new a.c(b8);
            }
        };
        n = object2;
        e.put(c14.h(), c14);
        e.put(c13.h(), c13);
        e.put(c12.h(), c12);
        e.put(c11.h(), c11);
        e.put(c10.h(), c10);
        e.put(c9.h(), c9);
        e.put(c8.h(), c8);
        e.put(((c)object).h(), (c<?>)object);
        e.put(((c)object2).h(), (c<?>)object2);
    }

    public c(d d8, int n8, a a8) {
        this(d8, n8, a8, EnumSet.of(a8));
    }

    private c(d d8, int n8, a a8, Set<a> set) {
        this.a = d8;
        this.b = n8;
        this.c = set;
        this.d = a8;
    }

    public c(d d8, int n8, Set<a> set) {
        a a8 = ax.C8.a.c0;
        if (!set.contains((Object)a8)) {
            a8 = ax.C8.a.d0;
        }
        this(d8, n8, a8, set);
    }

    public static c a(int n8) {
        return ax.C8.c.e(ax.C8.d.d0, n8);
    }

    public static c d(int n8) {
        return ax.C8.c.e(ax.C8.d.e0, n8);
    }

    public static c e(d d8, int n8) {
        int n9 = ax.C8.c$c.a[d8.ordinal()];
        if (n9 != 1) {
            if (n9 == 2 || n9 == 3 || n9 == 4) {
                return new c(d8, n8, EnumSet.of(ax.C8.a.c0, ax.C8.a.d0)){

                    public ax.y8.d<?> j(ax.z8.a a8) {
                        return new c.b(a8);
                    }

                    public e k(ax.z8.b b8) {
                        return new c.c(b8);
                    }
                };
            }
        } else {
            for (c<?> c8 : e.values()) {
                if (c8.b != n8 || d8 != c8.a) continue;
                return c8;
            }
        }
        throw new ax.y8.c(String.format("Unknown ASN.1 tag '%s:%s' found (%s)", new Object[]{d8, n8, e}));
    }

    public c<T> b(a a8) {
        if (this.d == a8) {
            return this;
        }
        if (this.c.contains((Object)a8)) {
            return new c<T>(this, this.a, this.b, a8, this.c){
                final c o;
                {
                    this.o = c8;
                    super(d8, n8, a8, set);
                }

                @Override
                public ax.y8.d<T> j(ax.z8.a a8) {
                    return this.o.j(a8);
                }

                @Override
                public e<T> k(ax.z8.b b8) {
                    return this.o.k(b8);
                }
            };
        }
        throw new IllegalArgumentException(String.format("The ASN.1 tag %s does not support encoding as %s", new Object[]{this, a8}));
    }

    public c<T> c() {
        return this.b(ax.C8.a.d0);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (c)object;
            if (this.h() == ((c)object).h() && this.a == ((c)object).a && this.d == ((c)object).d) {
                return true;
            }
        }
        return false;
    }

    public a f() {
        return this.d;
    }

    public d g() {
        return this.a;
    }

    public int h() {
        return this.b;
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.a, this.h(), this.d});
    }

    public boolean i() {
        return this.d == ax.C8.a.d0;
    }

    public abstract ax.y8.d<T> j(ax.z8.a var1);

    public abstract e<T> k(ax.z8.b var1);

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ASN1Tag[");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(",");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(",");
        stringBuilder.append(this.b);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

