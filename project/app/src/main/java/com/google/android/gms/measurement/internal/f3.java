/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import ax.M5.p;
import ax.R5.e;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.R1;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.g3;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.z2;

class f3
implements g3 {
    protected final E2 a;

    f3(E2 e22) {
        p.l(e22);
        this.a = e22;
    }

    @Override
    public Context a() {
        return this.a.a();
    }

    @Override
    public e b() {
        return this.a.b();
    }

    public h d() {
        return this.a.z();
    }

    @Override
    public c e() {
        return this.a.e();
    }

    public w f() {
        return this.a.A();
    }

    public R1 g() {
        return this.a.D();
    }

    public g2 h() {
        return this.a.F();
    }

    public B5 i() {
        return this.a.L();
    }

    public void j() {
        ((f3)this.a.l()).j();
    }

    @Override
    public V1 k() {
        return this.a.k();
    }

    @Override
    public z2 l() {
        return this.a.l();
    }

    public void m() {
        this.a.Q();
    }

    public void n() {
        ((f3)this.a.l()).n();
    }
}

