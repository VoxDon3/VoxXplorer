/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.content.Context;
import ax.Gb.l;
import ax.g2.b;
import ax.k2.f;
import ax.k2.g;
import ax.m2.c;
import ax.o2.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;

public final class y
implements h,
g,
AutoCloseable {
    private final String c0;
    private final File d0;
    private final Callable<InputStream> e0;
    private final int f0;
    private final h g0;
    private f h0;
    private boolean i0;
    private final Context q;

    public y(Context context, String string, File file, Callable<InputStream> callable, int n8, h h8) {
        l.f(context, "context");
        l.f(h8, "delegate");
        this.q = context;
        this.c0 = string;
        this.d0 = file;
        this.e0 = callable;
        this.f0 = n8;
        this.g0 = h8;
    }

    private final void b(File file, boolean bl) throws IOException {
        block10: {
            Callable<InputStream> callable;
            block8: {
                block9: {
                    block7: {
                        if (this.c0 == null) break block7;
                        callable = Channels.newChannel(this.q.getAssets().open(this.c0));
                        l.e(callable, "newChannel(context.assets.open(copyFromAssetPath))");
                        break block8;
                    }
                    if (this.d0 == null) break block9;
                    callable = ax.T.l.a(new FileInputStream(this.d0));
                    l.e(callable, "FileInputStream(copyFromFile).channel");
                    break block8;
                }
                callable = this.e0;
                if (callable == null) break block10;
                try {
                    callable = (InputStream)callable.call();
                }
                catch (Exception exception) {
                    throw new IOException("inputStreamCallable exception on call", exception);
                }
                callable = Channels.newChannel((InputStream)((Object)callable));
                l.e(callable, "newChannel(inputStream)");
            }
            File file2 = File.createTempFile("room-copy-helper", ".tmp", this.q.getCacheDir());
            file2.deleteOnExit();
            FileChannel fileChannel = b.a(new FileOutputStream(file2));
            l.e(fileChannel, "output");
            c.a((ReadableByteChannel)((Object)callable), fileChannel);
            callable = file.getParentFile();
            if (callable != null && !((File)((Object)callable)).exists() && !((File)((Object)callable)).mkdirs()) {
                callable = new StringBuilder();
                ((StringBuilder)((Object)callable)).append("Failed to create directories for ");
                ((StringBuilder)((Object)callable)).append(file.getAbsolutePath());
                throw new IOException(((StringBuilder)((Object)callable)).toString());
            }
            l.e(file2, "intermediateFile");
            this.c(file2, bl);
            if (file2.renameTo(file)) {
                return;
            }
            callable = new StringBuilder();
            ((StringBuilder)((Object)callable)).append("Failed to move intermediate file (");
            ((StringBuilder)((Object)callable)).append(file2.getAbsolutePath());
            ((StringBuilder)((Object)callable)).append(") to destination (");
            ((StringBuilder)((Object)callable)).append(file.getAbsolutePath());
            ((StringBuilder)((Object)callable)).append(").");
            throw new IOException(((StringBuilder)((Object)callable)).toString());
        }
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    private final void c(File object, boolean bl) {
        f f8 = this.h0;
        object = f8;
        if (f8 == null) {
            l.t("databaseConfiguration");
            object = null;
        }
        object.getClass();
    }

    /*
     * Exception decompiling
     */
    private final void e(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3 : 133->168)] java.lang.Throwable
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

    @Override
    public h a() {
        return this.g0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() {
        synchronized (this) {
            this.a().close();
            this.i0 = false;
            return;
        }
    }

    public final void d(f f8) {
        l.f(f8, "databaseConfiguration");
        this.h0 = f8;
    }

    @Override
    public ax.o2.g g0() {
        if (!this.i0) {
            this.e(true);
            this.i0 = true;
        }
        return this.a().g0();
    }

    @Override
    public String getDatabaseName() {
        return this.a().getDatabaseName();
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean bl) {
        this.a().setWriteAheadLoggingEnabled(bl);
    }
}

