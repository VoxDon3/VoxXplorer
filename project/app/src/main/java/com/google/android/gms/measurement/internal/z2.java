/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import com.google.android.gms.measurement.internal.A2;
import com.google.android.gms.measurement.internal.B2;
import com.google.android.gms.measurement.internal.C2;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.e3;
import com.google.android.gms.measurement.internal.f3;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class z2
extends e3 {
    private static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    private B2 c;
    private B2 d;
    private final PriorityBlockingQueue<C2<?>> e;
    private final BlockingQueue<C2<?>> f;
    private final Thread.UncaughtExceptionHandler g;
    private final Thread.UncaughtExceptionHandler h;
    private final Object i = new Object();
    private final Semaphore j = new Semaphore(2);
    private volatile boolean k;

    z2(E2 e22) {
        super(e22);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new A2(this, "Thread death: Uncaught exception on worker thread");
        this.h = new A2(this, "Thread death: Uncaught exception on network thread");
    }

    static /* bridge */ /* synthetic */ B2 A(z2 z22) {
        return z22.c;
    }

    static /* bridge */ /* synthetic */ void C(z2 z22, B2 b22) {
        z22.c = null;
    }

    static /* bridge */ /* synthetic */ Object E(z2 z22) {
        return z22.i;
    }

    static /* bridge */ /* synthetic */ AtomicLong F() {
        return l;
    }

    static /* bridge */ /* synthetic */ Semaphore H(z2 z22) {
        return z22.j;
    }

    static /* bridge */ /* synthetic */ boolean I(z2 z22) {
        return z22.k;
    }

    static /* bridge */ /* synthetic */ B2 u(z2 z22) {
        return z22.d;
    }

    static /* bridge */ /* synthetic */ void x(z2 z22, B2 b22) {
        z22.d = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void y(C2<?> runnable2) {
        Object object = this.i;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            this.e.add((C2<?>)runnable2);
                            runnable2 = this.c;
                            if (runnable2 != null) break block3;
                            runnable2 = new B2(this, "Measurement Worker", this.e);
                            this.c = runnable2;
                            ((Thread)runnable2).setUncaughtExceptionHandler(this.g);
                            this.c.start();
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    ((B2)runnable2).a();
                }
                return;
            }
            throw throwable2;
        }
    }

    public final <V> Future<V> B(Callable<V> object) throws IllegalStateException {
        this.p();
        p.l(object);
        object = new C2(this, (Callable)object, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            ((FutureTask)object).run();
            return object;
        }
        this.y((C2<?>)object);
        return object;
    }

    public final void D(Runnable runnable2) throws IllegalStateException {
        this.p();
        p.l(runnable2);
        this.y(new C2(this, runnable2, false, "Task exception on worker thread"));
    }

    public final void G(Runnable runnable2) throws IllegalStateException {
        this.p();
        p.l(runnable2);
        this.y(new C2(this, runnable2, true, "Task exception on worker thread"));
    }

    public final boolean J() {
        return Thread.currentThread() == this.c;
    }

    @Override
    public final void j() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    @Override
    public final void n() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override
    protected final boolean t() {
        return false;
    }

    /*
     * Exception decompiling
     */
    final <T> T v(AtomicReference<T> var1_1, long var2_2, String var4_3, Runnable var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [4 : 75->116)] java.lang.Throwable
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

    public final <V> Future<V> w(Callable<V> object) throws IllegalStateException {
        this.p();
        p.l(object);
        object = new C2(this, (Callable)object, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                ((f3)this).k().L().a("Callable skipped the worker queue.");
            }
            ((FutureTask)object).run();
            return object;
        }
        this.y((C2<?>)object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void z(Runnable object) throws IllegalStateException {
        this.p();
        p.l(object);
        Runnable runnable2 = new C2(this, (Runnable)object, false, "Task exception on network thread");
        object = this.i;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            this.f.add((C2<?>)runnable2);
                            runnable2 = this.d;
                            if (runnable2 != null) break block3;
                            runnable2 = new B2(this, "Measurement Network", this.f);
                            this.d = runnable2;
                            ((Thread)runnable2).setUncaughtExceptionHandler(this.h);
                            this.d.start();
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    ((B2)runnable2).a();
                }
                return;
            }
            throw throwable2;
        }
    }
}

