package ax.j6;

import ax.M5.C0821p;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class m {
    public static <TResult> TResult a(AbstractC2327j<TResult> abstractC2327j) throws ExecutionException, InterruptedException {
        C0821p.j();
        C0821p.h();
        C0821p.m(abstractC2327j, "Task must not be null");
        if (abstractC2327j.l()) {
            return (TResult) k(abstractC2327j);
        }
        p pVar = new p(null);
        l(abstractC2327j, pVar);
        pVar.b();
        return (TResult) k(abstractC2327j);
    }

    public static <TResult> TResult b(AbstractC2327j<TResult> abstractC2327j, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C0821p.j();
        C0821p.h();
        C0821p.m(abstractC2327j, "Task must not be null");
        C0821p.m(timeUnit, "TimeUnit must not be null");
        if (abstractC2327j.l()) {
            return (TResult) k(abstractC2327j);
        }
        p pVar = new p(null);
        l(abstractC2327j, pVar);
        if (pVar.e(j, timeUnit)) {
            return (TResult) k(abstractC2327j);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> AbstractC2327j<TResult> c(Executor executor, Callable<TResult> callable) {
        C0821p.m(executor, "Executor must not be null");
        C0821p.m(callable, "Callback must not be null");
        K k = new K();
        executor.execute(new L(k, callable));
        return k;
    }

    public static <TResult> AbstractC2327j<TResult> d(Exception exc) {
        K k = new K();
        k.p(exc);
        return k;
    }

    public static <TResult> AbstractC2327j<TResult> e(TResult tresult) {
        K k = new K();
        k.q(tresult);
        return k;
    }

    public static AbstractC2327j<Void> f(Collection<? extends AbstractC2327j<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        Iterator<? extends AbstractC2327j<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        K k = new K();
        r rVar = new r(collection.size(), k);
        Iterator<? extends AbstractC2327j<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            l(it2.next(), rVar);
        }
        return k;
    }

    public static AbstractC2327j<Void> g(AbstractC2327j<?>... abstractC2327jArr) {
        return (abstractC2327jArr == null || abstractC2327jArr.length == 0) ? e(null) : f(Arrays.asList(abstractC2327jArr));
    }

    public static AbstractC2327j<List<AbstractC2327j<?>>> h(Collection<? extends AbstractC2327j<?>> collection) {
        return i(C2329l.a, collection);
    }

    public static AbstractC2327j<List<AbstractC2327j<?>>> i(Executor executor, Collection<? extends AbstractC2327j<?>> collection) {
        return (collection == null || collection.isEmpty()) ? e(Collections.EMPTY_LIST) : f(collection).h(executor, new n(collection));
    }

    public static AbstractC2327j<List<AbstractC2327j<?>>> j(AbstractC2327j<?>... abstractC2327jArr) {
        return (abstractC2327jArr == null || abstractC2327jArr.length == 0) ? e(Collections.EMPTY_LIST) : h(Arrays.asList(abstractC2327jArr));
    }

    private static Object k(AbstractC2327j abstractC2327j) throws ExecutionException {
        if (abstractC2327j.m()) {
            return abstractC2327j.j();
        }
        if (abstractC2327j.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC2327j.i());
    }

    private static void l(AbstractC2327j abstractC2327j, q qVar) {
        Executor executor = C2329l.b;
        abstractC2327j.e(executor, qVar);
        abstractC2327j.d(executor, qVar);
        abstractC2327j.a(executor, qVar);
    }
}
