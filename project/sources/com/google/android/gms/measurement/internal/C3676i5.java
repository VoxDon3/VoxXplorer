package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3676i5 extends AbstractC3734s {
    private final /* synthetic */ C3683j5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3676i5(C3683j5 c3683j5, InterfaceC3660g3 interfaceC3660g3) {
        super(interfaceC3660g3);
        this.e = c3683j5;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3734s
    public final void d() {
        this.e.z();
        this.e.k().K().a("Starting upload from DelayedRunnable");
        this.e.b.z0();
    }
}
