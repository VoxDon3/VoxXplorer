package com.google.firebase.analytics;

import android.os.Bundle;
import ax.b6.W0;
import ax.f6.InterfaceC2077y;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class a implements InterfaceC2077y {
    private final /* synthetic */ W0 a;

    a(W0 w0) {
        this.a = w0;
    }

    @Override // ax.f6.InterfaceC2077y
    public final void a(String str) {
        this.a.A(str);
    }

    @Override // ax.f6.InterfaceC2077y
    public final void b(String str, String str2, Bundle bundle) {
        this.a.t(str, str2, bundle);
    }

    @Override // ax.f6.InterfaceC2077y
    public final List<Bundle> c(String str, String str2) {
        return this.a.g(str, str2);
    }

    @Override // ax.f6.InterfaceC2077y
    public final String d() {
        return this.a.J();
    }

    @Override // ax.f6.InterfaceC2077y
    public final Map<String, Object> e(String str, String str2, boolean z) {
        return this.a.h(str, str2, z);
    }

    @Override // ax.f6.InterfaceC2077y
    public final void f(String str, String str2, Bundle bundle) {
        this.a.C(str, str2, bundle);
    }

    @Override // ax.f6.InterfaceC2077y
    public final long g() {
        return this.a.b();
    }

    @Override // ax.f6.InterfaceC2077y
    public final int h(String str) {
        return this.a.a(str);
    }

    @Override // ax.f6.InterfaceC2077y
    public final String i() {
        return this.a.I();
    }

    @Override // ax.f6.InterfaceC2077y
    public final String j() {
        return this.a.H();
    }

    @Override // ax.f6.InterfaceC2077y
    public final String k() {
        return this.a.K();
    }

    @Override // ax.f6.InterfaceC2077y
    public final void l(String str) {
        this.a.E(str);
    }

    @Override // ax.f6.InterfaceC2077y
    public final void n(Bundle bundle) {
        this.a.k(bundle);
    }
}
