/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.c;
import com.google.firebase.concurrent.d;
import com.google.firebase.concurrent.e;
import com.google.firebase.concurrent.f;
import com.google.firebase.concurrent.g;
import com.google.firebase.concurrent.h;
import com.google.firebase.concurrent.i;
import com.google.firebase.concurrent.j;
import com.google.firebase.concurrent.k;
import com.google.firebase.concurrent.l;
import com.google.firebase.concurrent.m;
import com.google.firebase.concurrent.n;
import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class o
implements ScheduledExecutorService,
AutoCloseable {
    private final ScheduledExecutorService c0;
    private final ExecutorService q;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.q = executorService;
        this.c0 = scheduledExecutorService;
    }

    public static /* synthetic */ ScheduledFuture A(o o8, Runnable runnable2, long l8, TimeUnit timeUnit, p.b b8) {
        return o8.c0.schedule(new j(o8, runnable2, b8), l8, timeUnit);
    }

    public static /* synthetic */ ScheduledFuture a(o o8, Callable callable, long l8, TimeUnit timeUnit, p.b b8) {
        return o8.c0.schedule(new k(o8, callable, b8), l8, timeUnit);
    }

    public static /* synthetic */ ScheduledFuture b(o o8, Runnable runnable2, long l8, long l9, TimeUnit timeUnit, p.b b8) {
        return o8.c0.scheduleWithFixedDelay(new l(o8, runnable2, b8), l8, l9, timeUnit);
    }

    public static /* synthetic */ ScheduledFuture c(o o8, Runnable runnable2, long l8, long l9, TimeUnit timeUnit, p.b b8) {
        return o8.c0.scheduleAtFixedRate(new i(o8, runnable2, b8), l8, l9, timeUnit);
    }

    public static /* synthetic */ void e(Callable callable, p.b b8) {
        try {
            b8.set(callable.call());
            return;
        }
        catch (Exception exception) {
            b8.a(exception);
            return;
        }
    }

    public static /* synthetic */ void f(Runnable runnable2, p.b b8) {
        try {
            runnable2.run();
            return;
        }
        catch (Exception exception) {
            b8.a(exception);
            throw exception;
        }
    }

    public static /* synthetic */ void g(o o8, Runnable runnable2, p.b b8) {
        o8.q.execute(new d(runnable2, b8));
    }

    public static /* synthetic */ Future m(o o8, Callable callable, p.b b8) {
        return o8.q.submit(new n(callable, b8));
    }

    public static /* synthetic */ void o(Runnable runnable2, p.b b8) {
        try {
            runnable2.run();
            return;
        }
        catch (Exception exception) {
            b8.a(exception);
            return;
        }
    }

    public static /* synthetic */ void p(o o8, Runnable runnable2, p.b b8) {
        o8.q.execute(new m(runnable2, b8));
    }

    public static /* synthetic */ void q(Runnable runnable2, p.b b8) {
        try {
            runnable2.run();
            b8.set(null);
            return;
        }
        catch (Exception exception) {
            b8.a(exception);
            return;
        }
    }

    public static /* synthetic */ void v(o o8, Runnable runnable2, p.b b8) {
        o8.q.execute(new e(runnable2, b8));
    }

    @Override
    public boolean awaitTermination(long l8, TimeUnit timeUnit) throws InterruptedException {
        return this.q.awaitTermination(l8, timeUnit);
    }

    @Override
    public /* synthetic */ void close() {
        ax.Z.g.a(this);
    }

    @Override
    public void execute(Runnable runnable2) {
        this.q.execute(runnable2);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.q.invokeAll(collection);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long l8, TimeUnit timeUnit) throws InterruptedException {
        return this.q.invokeAll(collection, l8, timeUnit);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.q.invokeAny(collection);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long l8, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.q.invokeAny(collection, l8, timeUnit);
    }

    @Override
    public boolean isShutdown() {
        return this.q.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return this.q.isTerminated();
    }

    @Override
    public ScheduledFuture<?> schedule(Runnable runnable2, long l8, TimeUnit timeUnit) {
        return new p(new c(this, runnable2, l8, timeUnit));
    }

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long l8, TimeUnit timeUnit) {
        return new p(new h(this, callable, l8, timeUnit));
    }

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable2, long l8, long l9, TimeUnit timeUnit) {
        return new p(new f(this, runnable2, l8, l9, timeUnit));
    }

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable2, long l8, long l9, TimeUnit timeUnit) {
        return new p(new g(this, runnable2, l8, l9, timeUnit));
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public Future<?> submit(Runnable runnable2) {
        return this.q.submit(runnable2);
    }

    @Override
    public <T> Future<T> submit(Runnable runnable2, T t8) {
        return this.q.submit(runnable2, t8);
    }

    @Override
    public <T> Future<T> submit(Callable<T> callable) {
        return this.q.submit(callable);
    }
}

