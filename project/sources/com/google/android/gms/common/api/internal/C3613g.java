package com.google.android.gms.common.api.internal;

import ax.j6.C2328k;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3613g {
    private final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());
    private final Map b = DesugarCollections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap(this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).d(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C2328k) entry2.getKey()).d(new ax.K5.b(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z) {
        this.a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.a(new C3611e(this, basePendingResult));
    }

    final void d(C2328k c2328k, boolean z) {
        this.b.put(c2328k, Boolean.valueOf(z));
        c2328k.a().b(new C3612f(this, c2328k));
    }

    final void e(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new Status(20, sb.toString()));
    }

    public final void f() {
        h(false, C3609c.q0);
    }

    final boolean g() {
        return (this.a.isEmpty() && this.b.isEmpty()) ? false : true;
    }
}
