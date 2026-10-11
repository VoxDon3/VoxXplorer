/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import ax.C7.b;
import ax.D7.F;
import ax.D7.e;
import ax.D7.r;
import ax.h8.h;
import ax.i8.o;
import ax.x7.f;
import com.google.firebase.abt.component.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

@Keep
public class RemoteConfigRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ c a(F f8, e e8) {
        return new c(e8.a(Context.class), (ScheduledExecutorService)e8.c(f8), e8.a(f.class), e8.a(ax.b8.e.class), e8.a(a.class).b("frc"), e8.d(ax.A7.a.class));
    }

    @Override
    public List<ax.D7.c<?>> getComponents() {
        F<ScheduledExecutorService> f8 = F.a(b.class, ScheduledExecutorService.class);
        return Arrays.asList(ax.D7.c.f(c.class, ax.l8.a.class).g(LIBRARY_NAME).b(r.j(Context.class)).b(r.i(f8)).b(r.j(f.class)).b(r.j(ax.b8.e.class)).b(r.j(a.class)).b(r.h(ax.A7.a.class)).e(new o(f8)).d().c(), h.b(LIBRARY_NAME, "22.0.0"));
    }
}

