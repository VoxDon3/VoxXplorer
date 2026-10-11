/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import ax.K5.b;
import ax.K5.h;
import ax.j6.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.f;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class g {
    private final Map a = java.util.DesugarCollections.synchronizedMap(new WeakHashMap());
    private final Map b = java.util.DesugarCollections.synchronizedMap(new WeakHashMap());

    static /* bridge */ /* synthetic */ Map a(g g8) {
        return g8.a;
    }

    static /* bridge */ /* synthetic */ Map b(g g8) {
        return g8.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void h(boolean bl, Status status) {
        Object object = this.a;
        synchronized (object) {
            Object object2 = new HashMap(this.a);
        }
        Object object3 = this.b;
        synchronized (object3) {
            object = new HashMap(this.b);
        }
        for (Object object2 : object2.entrySet()) {
            if (!bl && !((Boolean)object2.getValue()).booleanValue()) continue;
            ((BasePendingResult)object2.getKey()).d(status);
        }
        object = object.entrySet().iterator();
        while (object.hasNext()) {
            object3 = (Map.Entry)object.next();
            if (!bl && !((Boolean)object3.getValue()).booleanValue()) continue;
            ((k)object3.getKey()).d(new b(status));
        }
        return;
    }

    final void c(BasePendingResult basePendingResult, boolean bl) {
        this.a.put(basePendingResult, bl);
        ((h)basePendingResult).a(new e(this, basePendingResult));
    }

    final void d(k k8, boolean bl) {
        this.b.put(k8, bl);
        k8.a().b(new f(this, k8));
    }

    final void e(int n8, String string) {
        StringBuilder stringBuilder = new StringBuilder("The connection to Google Play services was lost");
        if (n8 == 1) {
            stringBuilder.append(" due to service disconnection.");
        } else if (n8 == 3) {
            stringBuilder.append(" due to dead object exception.");
        }
        if (string != null) {
            stringBuilder.append(" Last reason for disconnect: ");
            stringBuilder.append(string);
        }
        this.h(true, new Status(20, stringBuilder.toString()));
    }

    public final void f() {
        this.h(false, c.q0);
    }

    final boolean g() {
        return !this.a.isEmpty() || !this.b.isEmpty();
        {
        }
    }
}

