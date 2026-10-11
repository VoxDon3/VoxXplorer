package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3646e3 extends C3653f3 {
    private boolean b;

    AbstractC3646e3(E2 e2) {
        super(e2);
        this.a.n();
    }

    protected void o() {
    }

    protected final void p() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (t()) {
            return;
        }
        this.a.R();
        this.b = true;
    }

    public final void r() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        o();
        this.a.R();
        this.b = true;
    }

    final boolean s() {
        return this.b;
    }

    protected abstract boolean t();
}
