package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class ExecutorC3768x3 implements Executor {
    private final /* synthetic */ C3688k3 q;

    ExecutorC3768x3(C3688k3 c3688k3) {
        this.q = c3688k3;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.q.l().D(runnable);
    }
}
