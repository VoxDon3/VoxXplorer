/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.annotation.SuppressLint;
import android.os.Looper;
import ax.J7.U;
import ax.J7.V;
import ax.J7.W;
import ax.J7.X;
import ax.J7.Y;
import ax.J7.z;
import ax.j6.j;
import ax.j6.k;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Z {
    private static final ExecutorService a = z.c("awaitEvenIfOnMainThread task continuation executor");

    public static /* synthetic */ Object a(k k8, j j8) {
        if (j8.m()) {
            k8.c(j8.j());
        } else if (j8.i() != null) {
            k8.b(j8.i());
        }
        return null;
    }

    public static /* synthetic */ Object b(CountDownLatch countDownLatch, j j8) {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Void c(k k8, j j8) {
        if (j8.m()) {
            k8.e(j8.j());
        } else if (j8.i() != null) {
            k8.d(j8.i());
        }
        return null;
    }

    public static /* synthetic */ Void d(k k8, j j8) {
        if (j8.m()) {
            k8.e(j8.j());
        } else if (j8.i() != null) {
            k8.d(j8.i());
        }
        return null;
    }

    public static /* synthetic */ void e(Callable object, Executor executor, k k8) {
        try {
            object = (j)object.call();
            Y y8 = new Y(k8);
            ((j)object).g(executor, y8);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static <T> T f(j<T> j8) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        j8.g(a, new U(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (j8.m()) {
            return j8.j();
        }
        if (!j8.k()) {
            if (j8.l()) {
                throw new IllegalStateException(j8.i());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    /*
     * Exception decompiling
     */
    public static boolean g(CountDownLatch var0, long var1_2, TimeUnit var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [4 : 68->72)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static <T> j<T> h(Executor executor, Callable<j<T>> callable) {
        k k8 = new k();
        executor.execute(new V(callable, executor, k8));
        return k8.a();
    }

    @SuppressLint(value={"TaskMainThread"})
    public static <T> j<T> i(j<T> j8, j<T> j9) {
        k k8 = new k();
        X x8 = new X(k8);
        j8.f(x8);
        j9.f(x8);
        return k8.a();
    }

    public static <T> j<T> j(Executor executor, j<T> j8, j<T> j9) {
        k k8 = new k();
        W w8 = new W(k8);
        j8.g(executor, w8);
        j9.g(executor, w8);
        return k8.a();
    }
}

