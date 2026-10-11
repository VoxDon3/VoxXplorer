/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.K;
import ax.j6.L;
import ax.j6.j;
import ax.j6.l;
import ax.j6.n;
import ax.j6.p;
import ax.j6.q;
import ax.j6.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class m {
    public static <TResult> TResult a(j<TResult> j8) throws ExecutionException, InterruptedException {
        ax.M5.p.j();
        ax.M5.p.h();
        ax.M5.p.m(j8, "Task must not be null");
        if (j8.l()) {
            return (TResult)m.k(j8);
        }
        p p8 = new p(null);
        m.l(j8, p8);
        p8.b();
        return (TResult)m.k(j8);
    }

    public static <TResult> TResult b(j<TResult> j8, long l8, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        ax.M5.p.j();
        ax.M5.p.h();
        ax.M5.p.m(j8, "Task must not be null");
        ax.M5.p.m(timeUnit, "TimeUnit must not be null");
        if (j8.l()) {
            return (TResult)m.k(j8);
        }
        p p8 = new p(null);
        m.l(j8, p8);
        if (p8.e(l8, timeUnit)) {
            return (TResult)m.k(j8);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> j<TResult> c(Executor executor, Callable<TResult> callable) {
        ax.M5.p.m(executor, "Executor must not be null");
        ax.M5.p.m(callable, "Callback must not be null");
        K k8 = new K();
        executor.execute(new L(k8, callable));
        return k8;
    }

    public static <TResult> j<TResult> d(Exception exception) {
        K k8 = new K();
        k8.p(exception);
        return k8;
    }

    public static <TResult> j<TResult> e(TResult TResult) {
        K k8 = new K();
        k8.q(TResult);
        return k8;
    }

    public static j<Void> f(Collection<? extends j<?>> object) {
        if (object != null && !object.isEmpty()) {
            Object object2 = object.iterator();
            while (object2.hasNext()) {
                if (object2.next() != null) continue;
                throw new NullPointerException("null tasks are not accepted");
            }
            K<Void> k8 = new K<Void>();
            object2 = new r(object.size(), k8);
            object = object.iterator();
            while (object.hasNext()) {
                m.l((j)object.next(), (q)object2);
            }
            return k8;
        }
        return m.e(null);
    }

    public static j<Void> g(j<?> ... jArray) {
        if (jArray != null && jArray.length != 0) {
            return m.f(Arrays.asList(jArray));
        }
        return m.e(null);
    }

    public static j<List<j<?>>> h(Collection<? extends j<?>> collection) {
        return m.i(l.a, collection);
    }

    public static j<List<j<?>>> i(Executor executor, Collection<? extends j<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return m.f(collection).h(executor, new n(collection));
        }
        return m.e(Collections.EMPTY_LIST);
    }

    public static j<List<j<?>>> j(j<?> ... jArray) {
        if (jArray != null && jArray.length != 0) {
            return m.h(Arrays.asList(jArray));
        }
        return m.e(Collections.EMPTY_LIST);
    }

    private static Object k(j j8) throws ExecutionException {
        if (j8.m()) {
            return j8.j();
        }
        if (j8.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(j8.i());
    }

    private static void l(j j8, q q8) {
        Executor executor = l.b;
        j8.e(executor, q8);
        j8.d(executor, q8);
        j8.a(executor, q8);
    }
}

