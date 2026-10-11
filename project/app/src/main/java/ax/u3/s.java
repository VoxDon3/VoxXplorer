/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.os.AsyncTask;
import ax.Ha.c;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class s
implements Executor {
    static Method d0;
    Runnable c0;
    final ArrayDeque<Runnable> q = new ArrayDeque();

    /*
     * Exception decompiling
     */
    public static void a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void b() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Runnable runnable2;
                        this.c0 = runnable2 = this.q.poll();
                        if (runnable2 == null) break block4;
                        AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void execute(Runnable runnable2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        ArrayDeque<Runnable> arrayDeque = this.q;
                        Runnable runnable3 = new Runnable(){
                            final s c0;
                            final Runnable q;
                            {
                                this.c0 = s8;
                                this.q = runnable2;
                            }

                            /*
                             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                             * Loose catch block
                             * Enabled aggressive block sorting
                             * Enabled unnecessary exception pruning
                             * Enabled aggressive exception aggregation
                             */
                            @Override
                            public void run() {
                                Throwable throwable2222222;
                                block4: {
                                    this.q.run();
                                    {
                                        catch (Throwable throwable2222222) {
                                            break block4;
                                        }
                                        catch (RuntimeException runtimeException) {}
                                        {
                                            c.h().f().b("AsyncTask RuntimeException!!!!").l(runtimeException).h();
                                            this.c0.b();
                                            return;
                                        }
                                    }
                                    this.c0.b();
                                    return;
                                }
                                this.c0.b();
                                throw throwable2222222;
                            }
                        };
                        arrayDeque.offer(runnable3);
                        if (this.c0 != null) break block4;
                        this.b();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

