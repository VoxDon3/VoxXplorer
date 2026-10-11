package com.google.android.gms.measurement.internal;

import ax.M5.C0821p;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class u5 implements Callable<String> {
    private final /* synthetic */ E5 a;
    private final /* synthetic */ q5 b;

    u5(q5 q5Var, E5 e5) {
        this.a = e5;
        this.b = q5Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        if (!this.b.S((String) C0821p.l(this.a.q)).B() || !C3667h3.q(this.a.w0).B()) {
            this.b.k().K().a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        Z1 h = this.b.h(this.a);
        if (h != null) {
            return h.m();
        }
        this.b.k().L().a("App info was null when attempting to get app instance id");
        return null;
    }
}
