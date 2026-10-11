/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement;

import android.os.Bundle;
import ax.M5.p;
import ax.f6.y;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;

final class a
extends AppMeasurement.a {
    private final y a;

    public a(y y8) {
        super(null);
        p.l(y8);
        this.a = y8;
    }

    @Override
    public final void a(String string) {
        this.a.a(string);
    }

    @Override
    public final void b(String string, String string2, Bundle bundle) {
        this.a.b(string, string2, bundle);
    }

    @Override
    public final List<Bundle> c(String string, String string2) {
        return this.a.c(string, string2);
    }

    @Override
    public final String d() {
        return this.a.d();
    }

    @Override
    public final Map<String, Object> e(String string, String string2, boolean bl) {
        return this.a.e(string, string2, bl);
    }

    @Override
    public final void f(String string, String string2, Bundle bundle) {
        this.a.f(string, string2, bundle);
    }

    @Override
    public final long g() {
        return this.a.g();
    }

    @Override
    public final int h(String string) {
        return this.a.h(string);
    }

    @Override
    public final String i() {
        return this.a.i();
    }

    @Override
    public final String j() {
        return this.a.j();
    }

    @Override
    public final String k() {
        return this.a.k();
    }

    @Override
    public final void l(String string) {
        this.a.l(string);
    }

    @Override
    public final void n(Bundle bundle) {
        this.a.n(bundle);
    }
}

