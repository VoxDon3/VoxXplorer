/*
 * Decompiled with CFR 0.152.
 */
package ax.E7;

import ax.M5.p;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

final class l
implements Executor {
    private static final Logger g0 = Logger.getLogger(l.class.getName());
    private final Deque<Runnable> c0 = new ArrayDeque<Runnable>();
    private c d0 = c.q;
    private long e0 = 0L;
    private final b f0 = new b(this);
    private final Executor q;

    l(Executor executor) {
        this.q = p.l(executor);
    }

    static /* synthetic */ c c(l l8, c c8) {
        l8.d0 = c8;
        return c8;
    }

    static /* synthetic */ long e(l l8) {
        long l9 = l8.e0;
        l8.e0 = 1L + l9;
        return l9;
    }

    static /* synthetic */ Logger f() {
        return g0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void execute(Runnable var1_1) {
        p.l(var1_1 /* !! */ );
        var6_8 = this.c0;
        synchronized (var6_8) {
            var5_9 /* !! */  = this.d0;
            if (var5_9 /* !! */  == c.e0 || var5_9 /* !! */  == (var7_10 = c.d0)) ** break block19
            var3_11 = this.e0;
            var5_9 /* !! */  = new Runnable(){
                final l c0;
                final Runnable q;
                {
                    this.c0 = l8;
                    this.q = runnable2;
                }

                @Override
                public void run() {
                    this.q.run();
                }

                public String toString() {
                    return this.q.toString();
                }
            };
            this.c0.add((Runnable)var5_9 /* !! */ );
            var1_1 /* !! */  = c.c0;
            this.d0 = var1_1 /* !! */ ;
        }
        try {
            this.q.execute(this.f0);
            if (this.d0 != var1_1 /* !! */ ) {
                return;
            }
            var5_9 /* !! */  = this.c0;
        }
        catch (Error var1_3) {
        }
        catch (RuntimeException var1_4) {
            // empty catch block
        }
        synchronized (var5_9 /* !! */ ) {
            block21: {
                block20: {
                    try {
                        if (this.e0 != var3_11 || this.d0 != var1_1 /* !! */ ) break block20;
                        this.d0 = var7_10;
                    }
                    catch (Throwable var1_2) {
                        break block21;
                    }
                }
                return;
            }
            throw var1_2;
        }
        var6_8 = this.c0;
        synchronized (var6_8) {
            block22: {
                try {
                    var7_10 = this.d0;
                    if (var7_10 == c.q || var7_10 == c.c0) {
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var1_6) {
                    break block22;
                }
                if (this.c0.removeLastOccurrence((Object)var5_9 /* !! */ )) {
                    var2_12 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var2_12 = false;
                }
                if (var1_5 instanceof RejectedExecutionException && !var2_12) {
                    return;
                }
                throw var1_5;
            }
            throw var1_6;
        }
        {
            try {
                this.c0.add(var1_1 /* !! */ );
                return;
            }
            catch (Throwable var1_7) {}
            throw var1_7;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SequentialExecutor@");
        stringBuilder.append(System.identityHashCode(this));
        stringBuilder.append("{");
        stringBuilder.append(this.q);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private final class b
    implements Runnable {
        final l c0;
        Runnable q;

        private b(l l8) {
            this.c0 = l8;
        }

        /*
         * Exception decompiling
         */
        private void a() {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 69->87)] java.lang.Throwable
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            try {
                this.a();
                return;
            }
            catch (Error error) {
                Deque deque = this.c0.c0;
                synchronized (deque) {
                    l.c(this.c0, c.q);
                    throw error;
                }
            }
        }

        public String toString() {
            Object object = this.q;
            if (object != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SequentialExecutorWorker{running=");
                stringBuilder.append(object);
                stringBuilder.append("}");
                return stringBuilder.toString();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("SequentialExecutorWorker{state=");
            ((StringBuilder)object).append((Object)this.c0.d0);
            ((StringBuilder)object).append("}");
            return ((StringBuilder)object).toString();
        }
    }

    static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        private static final c[] f0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = new c();
            d0 = new c();
            e0 = new c();
            f0 = c.d();
        }

        private static /* synthetic */ c[] d() {
            return new c[]{q, c0, d0, e0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])f0.clone();
        }
    }
}

