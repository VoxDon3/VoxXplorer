package com.google.android.gms.measurement.internal;

import ax.b6.C6;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3773y2 implements C6 {
    private final /* synthetic */ String a;
    private final /* synthetic */ C3726q2 b;

    C3773y2(C3726q2 c3726q2, String str) {
        this.a = str;
        this.b = c3726q2;
    }

    @Override // ax.b6.C6
    public final String h(String str) {
        Map map;
        map = this.b.d;
        Map map2 = (Map) map.get(this.a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
