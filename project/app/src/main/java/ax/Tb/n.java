/*
 * Decompiled with CFR 0.152.
 */
package ax.Tb;

import ax.Tb.k;
import ax.Tb.m;
import ax.Ub.h;
import ax.Vb.F;

public final class n {
    private static final F a = new F("NONE");
    private static final F b = new F("PENDING");

    public static final <T> k<T> a(T t8) {
        Object object = t8;
        if (t8 == null) {
            object = h.a;
        }
        return new m(object);
    }

    public static final /* synthetic */ F b() {
        return a;
    }

    public static final /* synthetic */ F c() {
        return b;
    }
}

