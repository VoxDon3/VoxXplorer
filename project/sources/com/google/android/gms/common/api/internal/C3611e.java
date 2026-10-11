package com.google.android.gms.common.api.internal;

import ax.K5.h;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3611e implements h.a {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ C3613g b;

    C3611e(C3613g c3613g, BasePendingResult basePendingResult) {
        this.b = c3613g;
        this.a = basePendingResult;
    }

    @Override // ax.K5.h.a
    public final void a(Status status) {
        Map map;
        map = this.b.a;
        map.remove(this.a);
    }
}
