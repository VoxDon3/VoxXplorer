package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3690k5 extends C3697l5 {
    private boolean c;

    AbstractC3690k5(q5 q5Var) {
        super(q5Var);
        this.b.x0();
    }

    protected final void u() {
        if (!w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        x();
        this.b.w0();
        this.c = true;
    }

    final boolean w() {
        return this.c;
    }

    protected abstract boolean x();
}
