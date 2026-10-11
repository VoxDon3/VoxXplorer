package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import ax.i8.InterfaceC2285c;
import ax.x7.C3471f;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public class f {
    private final Set<InterfaceC2285c> a;
    private final g b;
    private final d c;
    private final C3471f d;
    private final ax.b8.e e;
    private final b f;
    private final Context g;
    private final String h;
    private final e i;
    private final ScheduledExecutorService j;

    public f(C3471f c3471f, ax.b8.e eVar, d dVar, b bVar, Context context, String str, e eVar2, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
        this.b = new g(c3471f, eVar, dVar, bVar, context, str, linkedHashSet, eVar2, scheduledExecutorService);
        this.d = c3471f;
        this.c = dVar;
        this.e = eVar;
        this.f = bVar;
        this.g = context;
        this.h = str;
        this.i = eVar2;
        this.j = scheduledExecutorService;
    }

    private synchronized void a() {
        if (!this.a.isEmpty()) {
            this.b.A();
        }
    }

    public synchronized void b(boolean z) {
        this.b.x(z);
        if (!z) {
            a();
        }
    }
}
