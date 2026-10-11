/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.E2;

abstract class b1
extends C1 {
    private boolean b;

    b1(E2 e22) {
        super(e22);
        this.a.n();
    }

    protected abstract boolean A();

    protected final void v() {
        if (this.z()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void w() {
        if (!this.b) {
            if (!this.A()) {
                this.a.R();
                this.b = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void x() {
        if (!this.b) {
            this.y();
            this.a.R();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    protected void y() {
    }

    final boolean z() {
        return this.b;
    }
}

