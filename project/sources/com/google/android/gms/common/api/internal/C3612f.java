package com.google.android.gms.common.api.internal;

import ax.j6.AbstractC2327j;
import ax.j6.C2328k;
import ax.j6.InterfaceC2322e;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3612f implements InterfaceC2322e {
    final /* synthetic */ C2328k a;
    final /* synthetic */ C3613g b;

    C3612f(C3613g c3613g, C2328k c2328k) {
        this.b = c3613g;
        this.a = c2328k;
    }

    @Override // ax.j6.InterfaceC2322e
    public final void a(AbstractC2327j abstractC2327j) {
        Map map;
        map = this.b.b;
        map.remove(this.a);
    }
}
