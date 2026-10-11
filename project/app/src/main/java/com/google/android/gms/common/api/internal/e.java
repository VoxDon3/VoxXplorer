/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import ax.K5.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.g;

final class e
implements h.a {
    final BasePendingResult a;
    final g b;

    e(g g8, BasePendingResult basePendingResult) {
        this.b = g8;
        this.a = basePendingResult;
    }

    @Override
    public final void a(Status status) {
        g.a(this.b).remove(this.a);
    }
}

