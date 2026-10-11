/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import ax.L5.F;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class G {
    final BasePendingResult a;

    /* synthetic */ G(BasePendingResult basePendingResult, F f8) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        BasePendingResult.k(BasePendingResult.i(this.a));
        super.finalize();
    }
}

