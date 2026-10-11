package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import ax.D7.C0661c;
import ax.D7.F;
import ax.D7.InterfaceC0663e;
import ax.D7.x;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final x<ScheduledExecutorService> a = new x<>(new ax.a8.b() { // from class: ax.E7.c
        @Override // ax.a8.b
        public final Object get() {
            ScheduledExecutorService m;
            m = ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
            return m;
        }
    });
    static final x<ScheduledExecutorService> b = new x<>(new ax.a8.b() { // from class: ax.E7.d
        @Override // ax.a8.b
        public final Object get() {
            ScheduledExecutorService m;
            m = ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
            return m;
        }
    });
    static final x<ScheduledExecutorService> c = new x<>(new ax.a8.b() { // from class: ax.E7.e
        @Override // ax.a8.b
        public final Object get() {
            ScheduledExecutorService m;
            m = ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
            return m;
        }
    });
    static final x<ScheduledExecutorService> d = new x<>(new ax.a8.b() { // from class: ax.E7.f
        @Override // ax.a8.b
        public final Object get() {
            ScheduledExecutorService newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
            return newSingleThreadScheduledExecutor;
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i) {
        return new b(str, i, null);
    }

    private static ThreadFactory k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<?>> getComponents() {
        return Arrays.asList(C0661c.d(F.a(ax.C7.a.class, ScheduledExecutorService.class), F.a(ax.C7.a.class, ExecutorService.class), F.a(ax.C7.a.class, Executor.class)).e(new ax.D7.h() { // from class: ax.E7.g
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.a.get();
                return scheduledExecutorService;
            }
        }).c(), C0661c.d(F.a(ax.C7.b.class, ScheduledExecutorService.class), F.a(ax.C7.b.class, ExecutorService.class), F.a(ax.C7.b.class, Executor.class)).e(new ax.D7.h() { // from class: ax.E7.h
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.c.get();
                return scheduledExecutorService;
            }
        }).c(), C0661c.d(F.a(ax.C7.c.class, ScheduledExecutorService.class), F.a(ax.C7.c.class, ExecutorService.class), F.a(ax.C7.c.class, Executor.class)).e(new ax.D7.h() { // from class: ax.E7.i
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.b.get();
                return scheduledExecutorService;
            }
        }).c(), C0661c.c(F.a(ax.C7.d.class, Executor.class)).e(new ax.D7.h() { // from class: ax.E7.j
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                Executor executor;
                executor = m.INSTANCE;
                return executor;
            }
        }).c());
    }
}
