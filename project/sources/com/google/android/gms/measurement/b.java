package com.google.android.gms.measurement;

import android.os.Bundle;
import ax.M5.C0821p;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C3688k3;
import com.google.android.gms.measurement.internal.E2;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class b extends AppMeasurement.a {
    private final E2 a;
    private final C3688k3 b;

    public b(E2 e2) {
        super();
        C0821p.l(e2);
        this.a = e2;
        this.b = e2.H();
    }

    @Override // ax.f6.InterfaceC2077y
    public final void a(String str) {
        this.a.y().z(str, this.a.b().b());
    }

    @Override // ax.f6.InterfaceC2077y
    public final void b(String str, String str2, Bundle bundle) {
        this.a.H().g0(str, str2, bundle);
    }

    @Override // ax.f6.InterfaceC2077y
    public final List<Bundle> c(String str, String str2) {
        return this.b.F(str, str2);
    }

    @Override // ax.f6.InterfaceC2077y
    public final String d() {
        return this.b.w0();
    }

    @Override // ax.f6.InterfaceC2077y
    public final Map<String, Object> e(String str, String str2, boolean z) {
        return this.b.G(str, str2, z);
    }

    @Override // ax.f6.InterfaceC2077y
    public final void f(String str, String str2, Bundle bundle) {
        this.b.R0(str, str2, bundle);
    }

    @Override // ax.f6.InterfaceC2077y
    public final long g() {
        return this.a.L().R0();
    }

    @Override // ax.f6.InterfaceC2077y
    public final int h(String str) {
        return C3688k3.D(str);
    }

    @Override // ax.f6.InterfaceC2077y
    public final String i() {
        return this.b.v0();
    }

    @Override // ax.f6.InterfaceC2077y
    public final String j() {
        return this.b.u0();
    }

    @Override // ax.f6.InterfaceC2077y
    public final String k() {
        return this.b.u0();
    }

    @Override // ax.f6.InterfaceC2077y
    public final void l(String str) {
        this.a.y().D(str, this.a.b().b());
    }

    @Override // ax.f6.InterfaceC2077y
    public final void n(Bundle bundle) {
        this.b.K0(bundle);
    }
}
