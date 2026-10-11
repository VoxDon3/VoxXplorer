/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics;

import android.os.Bundle;
import ax.b6.W0;
import ax.f6.y;
import java.util.List;
import java.util.Map;

final class a
implements y {
    private final W0 a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    a(W0 w02) {
        this.a = w02;
    }

    @Override
    public final void a(String string) {
        this.a.A(string);
    }

    @Override
    public final void b(String string, String string2, Bundle bundle) {
        this.a.t(string, string2, bundle);
    }

    @Override
    public final List<Bundle> c(String string, String string2) {
        return this.a.g(string, string2);
    }

    @Override
    public final String d() {
        return this.a.J();
    }

    @Override
    public final Map<String, Object> e(String string, String string2, boolean bl) {
        return this.a.h(string, string2, bl);
    }

    @Override
    public final void f(String string, String string2, Bundle bundle) {
        this.a.C(string, string2, bundle);
    }

    @Override
    public final long g() {
        return this.a.b();
    }

    @Override
    public final int h(String string) {
        return this.a.a(string);
    }

    @Override
    public final String i() {
        return this.a.I();
    }

    @Override
    public final String j() {
        return this.a.H();
    }

    @Override
    public final String k() {
        return this.a.K();
    }

    @Override
    public final void l(String string) {
        this.a.E(string);
    }

    @Override
    public final void n(Bundle bundle) {
        this.a.k(bundle);
    }
}

