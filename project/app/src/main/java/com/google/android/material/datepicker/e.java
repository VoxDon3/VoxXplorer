/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import com.google.android.material.datepicker.f;

public final class e
implements Runnable {
    public final long c0;
    public final f q;

    public /* synthetic */ e(f f8, long l8) {
        this.q = f8;
        this.c0 = l8;
    }

    @Override
    public final void run() {
        f.a(this.q, this.c0);
    }
}

