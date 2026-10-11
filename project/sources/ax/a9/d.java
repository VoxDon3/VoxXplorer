package ax.a9;

import ax.a9.AbstractFutureC1431a;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class d {
    public static <T, E extends Throwable> T a(Future<T> future, long j, TimeUnit timeUnit, c<E> cVar) throws Throwable {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw cVar.a(e);
        } catch (ExecutionException e2) {
            e = e2;
            throw cVar.a(e);
        } catch (TimeoutException e3) {
            e = e3;
            throw cVar.a(e);
        }
    }

    public static <T, E extends Throwable> T b(Future<T> future, c<E> cVar) throws Throwable {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw cVar.a(e);
        } catch (ExecutionException e2) {
            throw cVar.a(e2);
        }
    }

    public static <T> Future<List<T>> c(List<Future<T>> list) {
        return new g(list);
    }

    public static <F, T> Future<T> d(Future<F> future, AbstractFutureC1431a.InterfaceC0255a<F, T> interfaceC0255a) {
        return new h(future, interfaceC0255a);
    }
}
