package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3645e2 implements Runnable {
    private final /* synthetic */ C3652f2 c0;
    private final /* synthetic */ boolean q;

    RunnableC3645e2(C3652f2 c3652f2, boolean z) {
        this.q = z;
        this.c0 = c3652f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var;
        q5Var = this.c0.a;
        q5Var.J(this.q);
    }
}
