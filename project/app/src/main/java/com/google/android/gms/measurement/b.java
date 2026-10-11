/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement;

import android.os.Bundle;
import ax.M5.p;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.k3;
import java.util.List;
import java.util.Map;

final class b
extends AppMeasurement.a {
    private final E2 a;
    private final k3 b;

    public b(E2 e22) {
        super(null);
        p.l(e22);
        this.a = e22;
        this.b = e22.H();
    }

    @Override
    public final void a(String string) {
        this.a.y().z(string, this.a.b().b());
    }

    @Override
    public final void b(String string, String string2, Bundle bundle) {
        this.a.H().g0(string, string2, bundle);
    }

    @Override
    public final List<Bundle> c(String string, String string2) {
        return this.b.F(string, string2);
    }

    @Override
    public final String d() {
        return this.b.w0();
    }

    @Override
    public final Map<String, Object> e(String string, String string2, boolean bl) {
        return this.b.G(string, string2, bl);
    }

    @Override
    public final void f(String string, String string2, Bundle bundle) {
        this.b.R0(string, string2, bundle);
    }

    @Override
    public final long g() {
        return this.a.L().R0();
    }

    @Override
    public final int h(String string) {
        return k3.D(string);
    }

    @Override
    public final String i() {
        return this.b.v0();
    }

    @Override
    public final String j() {
        return this.b.u0();
    }

    @Override
    public final String k() {
        return this.b.u0();
    }

    @Override
    public final void l(String string) {
        this.a.y().D(string, this.a.b().b());
    }

    @Override
    public final void n(Bundle bundle) {
        this.b.K0(bundle);
    }
}

