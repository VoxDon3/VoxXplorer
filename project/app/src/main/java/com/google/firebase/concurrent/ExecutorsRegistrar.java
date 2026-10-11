/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import ax.C7.c;
import ax.D7.F;
import ax.D7.e;
import ax.D7.x;
import ax.E7.a;
import ax.E7.d;
import ax.E7.f;
import ax.E7.g;
import ax.E7.h;
import ax.E7.i;
import ax.E7.j;
import ax.E7.m;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.b;
import com.google.firebase.concurrent.o;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint(value={"ThreadPoolCreation"})
public class ExecutorsRegistrar
implements ComponentRegistrar {
    static final x<ScheduledExecutorService> a = new x(new ax.E7.c());
    static final x<ScheduledExecutorService> b = new x(new d());
    static final x<ScheduledExecutorService> c = new x(new ax.E7.e());
    static final x<ScheduledExecutorService> d = new x(new f());

    public static /* synthetic */ ScheduledExecutorService a(e e8) {
        return b.get();
    }

    public static /* synthetic */ ScheduledExecutorService b() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
    }

    public static /* synthetic */ ScheduledExecutorService c() {
        return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
    }

    public static /* synthetic */ Executor d(e e8) {
        return m.q;
    }

    public static /* synthetic */ ScheduledExecutorService e(e e8) {
        return c.get();
    }

    public static /* synthetic */ ScheduledExecutorService f() {
        return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
    }

    public static /* synthetic */ ScheduledExecutorService g(e e8) {
        return a.get();
    }

    public static /* synthetic */ ScheduledExecutorService h() {
        return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
    }

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 23) {
            ax.E7.a.a(builder);
            if (n8 >= 26) {
                ax.E7.b.a(builder);
            }
        }
        return builder.penaltyLog().build();
    }

    private static ThreadFactory j(String string, int n8) {
        return new b(string, n8, null);
    }

    private static ThreadFactory k(String string, int n8, StrictMode.ThreadPolicy threadPolicy) {
        return new b(string, n8, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, d.get());
    }

    @Override
    public List<ax.D7.c<?>> getComponents() {
        return Arrays.asList(ax.D7.c.d(F.a(ax.C7.a.class, ScheduledExecutorService.class), F.a(ax.C7.a.class, ExecutorService.class), F.a(ax.C7.a.class, Executor.class)).e(new g()).c(), ax.D7.c.d(F.a(ax.C7.b.class, ScheduledExecutorService.class), F.a(ax.C7.b.class, ExecutorService.class), F.a(ax.C7.b.class, Executor.class)).e(new h()).c(), ax.D7.c.d(F.a(c.class, ScheduledExecutorService.class), F.a(c.class, ExecutorService.class), F.a(c.class, Executor.class)).e(new i()).c(), ax.D7.c.c(F.a(ax.C7.d.class, Executor.class)).e(new j()).c());
    }
}

