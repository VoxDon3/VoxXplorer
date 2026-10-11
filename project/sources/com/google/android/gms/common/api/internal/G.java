package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class G {
    final /* synthetic */ BasePendingResult a;

    /* synthetic */ G(BasePendingResult basePendingResult, ax.L5.F f) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        ax.K5.l lVar;
        lVar = this.a.h;
        BasePendingResult.k(lVar);
        super.finalize();
    }
}
