/*
 * Decompiled with CFR 0.152.
 */
package ax.a9;

import ax.a9.a;
import ax.a9.c;
import ax.a9.g;
import ax.a9.h;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class d {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static <T, E extends Throwable> T a(Future<T> future, long l8, TimeUnit timeUnit, c<E> c8) throws E {
        Throwable var0_3;
        try {
            future = future.get(l8, timeUnit);
            return (T)future;
        }
        catch (TimeoutException timeoutException) {
            throw c8.a((Throwable)var0_3);
        }
        catch (ExecutionException executionException) {
            // empty catch block
            throw c8.a((Throwable)var0_3);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw c8.a(interruptedException);
        }
    }

    public static <T, E extends Throwable> T b(Future<T> future, c<E> c8) throws E {
        try {
            future = future.get();
        }
        catch (ExecutionException executionException) {
            throw c8.a(executionException);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw c8.a(interruptedException);
        }
        return (T)future;
    }

    public static <T> Future<List<T>> c(List<Future<T>> list) {
        return new g(list);
    }

    public static <F, T> Future<T> d(Future<F> future, a.a<F, T> a8) {
        return new h<F, T>(future, a8);
    }
}

