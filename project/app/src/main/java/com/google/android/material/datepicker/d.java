/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import com.google.android.material.datepicker.f;

public final class d
implements Runnable {
    public final String c0;
    public final f q;

    public /* synthetic */ d(f f8, String string) {
        this.q = f8;
        this.c0 = string;
    }

    @Override
    public final void run() {
        f.b(this.q, this.c0);
    }
}

