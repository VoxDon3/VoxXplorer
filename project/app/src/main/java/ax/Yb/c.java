/*
 * Decompiled with CFR 0.152.
 */
package ax.Yb;

import ax.Fb.q;
import ax.Qb.l;
import ax.Vb.F;
import ax.Yb.d;
import ax.sb.t;

public final class c {
    private static final q<Object, Object, Object, Object> a = ax.Yb.c$a.q;
    private static final F b = new F("STATE_REG");
    private static final F c = new F("STATE_COMPLETED");
    private static final F d = new F("STATE_CANCELLED");
    private static final F e = new F("NO_RESULT");
    private static final F f = new F("PARAM_CLAUSE_0");

    private static final d a(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        return ax.Yb.d.e0;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected internal result: ");
                    stringBuilder.append(n8);
                    throw new IllegalStateException(stringBuilder.toString().toString());
                }
                return ax.Yb.d.d0;
            }
            return ax.Yb.d.c0;
        }
        return ax.Yb.d.q;
    }

    public static final /* synthetic */ d b(int n8) {
        return ax.Yb.c.a(n8);
    }

    public static final /* synthetic */ F c() {
        return e;
    }

    public static final /* synthetic */ F d() {
        return d;
    }

    public static final /* synthetic */ F e() {
        return c;
    }

    public static final /* synthetic */ F f() {
        return b;
    }

    public static final /* synthetic */ boolean g(l l8, ax.Fb.l l9) {
        return ax.Yb.c.h(l8, l9);
    }

    private static final boolean h(l<? super t> l8, ax.Fb.l<? super Throwable, t> object) {
        if ((object = l8.l(t.a, null, (ax.Fb.l<Throwable, t>)object)) == null) {
            return false;
        }
        l8.s(object);
        return true;
    }
}

