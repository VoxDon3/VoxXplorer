package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class F3 extends AbstractC3734s {
    private final /* synthetic */ C3688k3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F3(C3688k3 c3688k3, InterfaceC3660g3 interfaceC3660g3) {
        super(interfaceC3660g3);
        this.e = c3688k3;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3734s
    public final void d() {
        AbstractC3734s abstractC3734s;
        if (this.e.a.u()) {
            abstractC3734s = this.e.r;
            abstractC3734s.b(2000L);
        }
    }
}
