/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.f3;

abstract class e3
extends f3 {
    private boolean b;

    e3(E2 e22) {
        super(e22);
        this.a.n();
    }

    protected void o() {
    }

    protected final void p() {
        if (this.s()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void q() {
        if (!this.b) {
            if (!this.t()) {
                this.a.R();
                this.b = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void r() {
        if (!this.b) {
            this.o();
            this.a.R();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    final boolean s() {
        return this.b;
    }

    protected abstract boolean t();
}

