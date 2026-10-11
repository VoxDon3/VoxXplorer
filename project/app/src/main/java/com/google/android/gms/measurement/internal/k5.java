/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.l5;
import com.google.android.gms.measurement.internal.q5;

abstract class k5
extends l5 {
    private boolean c;

    k5(q5 q52) {
        super(q52);
        this.b.x0();
    }

    protected final void u() {
        if (this.w()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void v() {
        if (!this.c) {
            this.x();
            this.b.w0();
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    final boolean w() {
        return this.c;
    }

    protected abstract boolean x();
}

