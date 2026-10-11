/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import androidx.annotation.Keep;
import ax.C7.a;
import ax.C7.b;
import ax.D7.F;
import ax.D7.e;
import ax.D7.r;
import ax.E7.k;
import ax.Z7.i;
import ax.h8.h;
import ax.x7.f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
public class FirebaseInstallationsRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ ax.b8.e a(e e8) {
        return new c(e8.a(f.class), e8.d(i.class), e8.c(F.a(a.class, ExecutorService.class)), k.b(e8.c(F.a(b.class, Executor.class))));
    }

    @Override
    public List<ax.D7.c<?>> getComponents() {
        return Arrays.asList(ax.D7.c.e(ax.b8.e.class).g(LIBRARY_NAME).b(r.j(f.class)).b(r.h(i.class)).b(r.i(F.a(a.class, ExecutorService.class))).b(r.i(F.a(b.class, Executor.class))).e(new ax.b8.f()).c(), ax.Z7.h.a(), h.b(LIBRARY_NAME, "18.0.0"));
    }
}

