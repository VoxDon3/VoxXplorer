/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.G;
import ax.Qb.S0;
import ax.wb.i;

public final class O0
extends G {
    public static final O0 d0 = new O0();

    private O0() {
    }

    @Override
    public void b(i i8, Runnable runnable2) {
        if ((i8 = i8.a(S0.d0)) != null) {
            ((S0)i8).c0 = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override
    public boolean f(i i8) {
        return false;
    }

    @Override
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}

