/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics;

import ax.D7.c;
import ax.D7.e;
import ax.D7.r;
import ax.h8.h;
import ax.o8.b;
import ax.x7.f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.a;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar
implements ComponentRegistrar {
    static {
        ax.o8.a.a(b.a.q);
    }

    public static /* synthetic */ a a(CrashlyticsRegistrar crashlyticsRegistrar, e e8) {
        return crashlyticsRegistrar.b(e8);
    }

    private a b(e e8) {
        f f8 = e8.a(f.class);
        ax.a8.a<ax.G7.a> a8 = e8.i(ax.G7.a.class);
        ax.a8.a<ax.A7.a> a9 = e8.i(ax.A7.a.class);
        return a.b(f8, e8.a(ax.b8.e.class), a8, a9, e8.i(ax.l8.a.class));
    }

    @Override
    public List<c<?>> getComponents() {
        return Arrays.asList(c.e(a.class).g("fire-cls").b(r.j(f.class)).b(r.j(ax.b8.e.class)).b(r.a(ax.G7.a.class)).b(r.a(ax.A7.a.class)).b(r.a(ax.l8.a.class)).e(new ax.F7.f(this)).d().c(), h.b("fire-cls", "19.0.3"));
    }
}

