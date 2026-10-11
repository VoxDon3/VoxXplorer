/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.net.Uri;
import com.google.android.gms.measurement.internal.X3;

final class W3
implements Runnable {
    private final Uri c0;
    private final String d0;
    private final String e0;
    private final X3 f0;
    private final boolean q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    W3(X3 x32, boolean bl, Uri uri, String string, String string2) {
        this.q = bl;
        this.c0 = uri;
        this.d0 = string;
        this.e0 = string2;
        this.f0 = x32;
    }

    @Override
    public final void run() {
        X3.a(this.f0, this.q, this.c0, this.d0, this.e0);
    }
}

