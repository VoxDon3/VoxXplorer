/*
 * Decompiled with CFR 0.152.
 */
package ax.X9;

import ax.X9.d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

class c
implements Closeable,
AutoCloseable {
    private final Charset c0;
    private byte[] d0;
    private int e0;
    private int f0;
    private final InputStream q;

    public c(InputStream inputStream, int n8, Charset charset) {
        if (inputStream != null && charset != null) {
            if (n8 >= 0) {
                if (charset.equals(d.a)) {
                    this.q = inputStream;
                    this.c0 = charset;
                    this.d0 = new byte[n8];
                    return;
                }
                throw new IllegalArgumentException("Unsupported encoding");
            }
            throw new IllegalArgumentException("capacity <= 0");
        }
        throw null;
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.q;
        byte[] byArray = this.d0;
        int n8 = inputStream.read(byArray, 0, byArray.length);
        if (n8 != -1) {
            this.e0 = 0;
            this.f0 = n8;
            return;
        }
        throw new EOFException();
    }

    /*
     * Exception decompiling
     */
    public String c() throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 39->58)] java.lang.Throwable
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        InputStream inputStream = this.q;
        synchronized (inputStream) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.d0 == null) break block3;
                        this.d0 = null;
                        this.q.close();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

