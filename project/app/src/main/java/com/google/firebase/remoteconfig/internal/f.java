/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import ax.i8.c;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import com.google.firebase.remoteconfig.internal.g;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class f {
    private final Set<c> a;
    private final g b;
    private final d c;
    private final ax.x7.f d;
    private final ax.b8.e e;
    private final b f;
    private final Context g;
    private final String h;
    private final e i;
    private final ScheduledExecutorService j;

    public f(ax.x7.f f8, ax.b8.e e8, d d8, b b8, Context context, String string, e e9, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet<c> linkedHashSet = new LinkedHashSet<c>();
        this.a = linkedHashSet;
        this.b = new g(f8, e8, d8, b8, context, string, linkedHashSet, e9, scheduledExecutorService);
        this.d = f8;
        this.c = d8;
        this.e = e8;
        this.f = b8;
        this.g = context;
        this.h = string;
        this.i = e9;
        this.j = scheduledExecutorService;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (this.a.isEmpty()) break block4;
                        this.b.A();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.b.x(bl);
                        if (bl) break block4;
                        this.a();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

