/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.b0;
import ax.Qb.n0;
import ax.Qb.o0;
import ax.Vb.F;

public final class A0 {
    private static final F a = new F("COMPLETING_ALREADY");
    public static final F b = new F("COMPLETING_WAITING_CHILDREN");
    private static final F c = new F("COMPLETING_RETRY");
    private static final F d = new F("TOO_LATE_TO_CANCEL");
    private static final F e = new F("SEALED");
    private static final b0 f = new b0(false);
    private static final b0 g = new b0(true);

    public static final /* synthetic */ F a() {
        return a;
    }

    public static final /* synthetic */ F b() {
        return c;
    }

    public static final /* synthetic */ b0 c() {
        return g;
    }

    public static final /* synthetic */ b0 d() {
        return f;
    }

    public static final /* synthetic */ F e() {
        return e;
    }

    public static final /* synthetic */ F f() {
        return d;
    }

    public static final Object g(Object object) {
        if (object instanceof n0) {
            return new o0((n0)object);
        }
        return object;
    }

    public static final Object h(Object object) {
        Object object2 = object instanceof o0 ? (o0)object : null;
        if (object2 != null && (object2 = ((o0)object2).a) != null) {
            return object2;
        }
        return object;
    }
}

