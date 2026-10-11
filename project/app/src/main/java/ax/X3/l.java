/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import ax.Q3.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class l
extends FilterInputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private int c0;
    private int d0;
    private int e0 = -1;
    private int f0;
    private final b g0;
    private volatile byte[] q;

    public l(InputStream inputStream, b b8) {
        this(inputStream, b8, 65536);
    }

    l(InputStream inputStream, b b8, int n8) {
        super(inputStream);
        this.g0 = b8;
        this.q = b8.d(n8, byte[].class);
    }

    private int a(InputStream inputStream, byte[] byArray) throws IOException {
        int n8;
        int n9;
        int n10 = this.e0;
        if (n10 != -1 && (n9 = this.f0) - n10 < (n8 = this.d0)) {
            byte[] byArray2;
            if (n10 == 0 && n8 > byArray.length && this.c0 == byArray.length) {
                n9 = byArray.length * 2;
                if (n9 <= n8) {
                    n8 = n9;
                }
                byArray2 = this.g0.d(n8, byte[].class);
                System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
                this.q = byArray2;
                this.g0.c(byArray, byte[].class);
            } else {
                byArray2 = byArray;
                if (n10 > 0) {
                    System.arraycopy(byArray, n10, byArray, 0, byArray.length - n10);
                    byArray2 = byArray;
                }
            }
            this.f0 = n8 = this.f0 - this.e0;
            this.e0 = 0;
            this.c0 = 0;
            n9 = inputStream.read(byArray2, n8, byArray2.length - n8);
            n8 = this.f0;
            if (n9 > 0) {
                n8 += n9;
            }
            this.c0 = n8;
            return n9;
        }
        n8 = inputStream.read(byArray);
        if (n8 > 0) {
            this.e0 = -1;
            this.f0 = 0;
            this.c0 = n8;
        }
        return n8;
    }

    private static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int available() throws IOException {
        synchronized (this) {
            try {
                InputStream inputStream = this.in;
                if (this.q == null || inputStream == null) throw l.d();
                int n8 = this.c0;
                int n9 = this.f0;
                int n10 = inputStream.available();
                return n8 - n9 + n10;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        synchronized (this) {
            this.d0 = this.q.length;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (this.q == null) break block4;
                        this.g0.c(this.q, byte[].class);
                        this.q = null;
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

    @Override
    public void close() throws IOException {
        if (this.q != null) {
            this.g0.c(this.q, byte[].class);
            this.q = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void mark(int n8) {
        synchronized (this) {
            this.d0 = Math.max(this.d0, n8);
            this.e0 = this.f0;
            return;
        }
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block9: {
                    Object object;
                    Object object2;
                    byte[] byArray;
                    block8: {
                        try {
                            byArray = this.q;
                            object2 = this.in;
                            if (byArray == null || object2 == null) break block7;
                            if (this.f0 < this.c0 || (object = this.a((InputStream)object2, byArray)) != -1) break block8;
                        }
                        catch (Throwable throwable2) {}
                        return -1;
                    }
                    object2 = byArray;
                    if (byArray != this.q && (object2 = (Object)this.q) == null) {
                        throw l.d();
                    }
                    int n8 = this.c0;
                    object = this.f0;
                    if (n8 - object <= 0) break block9;
                    this.f0 = object + 1;
                    object = object2[object];
                    return object & 0xFF;
                }
                return -1;
            }
            throw l.d();
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public int read(byte[] var1_1, int var2_3, int var3_4) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 152->158)] java.lang.Throwable
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
    public void reset() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    if (this.q == null) {
                        IOException iOException = new IOException("Stream is closed");
                        throw iOException;
                    }
                    int n8 = this.e0;
                    if (-1 != n8) {
                        this.f0 = n8;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Mark has been invalidated, pos: ");
                stringBuilder.append(this.f0);
                stringBuilder.append(" markLimit: ");
                stringBuilder.append(this.d0);
                a a8 = new a(stringBuilder.toString());
                throw a8;
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long skip(long var1_1) throws IOException {
        synchronized (this) {
            block15: {
                block10: {
                    block14: {
                        block12: {
                            block13: {
                                block11: {
                                    try {
                                        var11_2 = this.q;
                                        var12_4 = this.in;
                                        if (var11_2 == null) break block10;
                                        if (var1_1 >= 1L) break block11;
                                    }
                                    catch (Throwable var11_3) {}
                                    return 0L;
                                }
                                if (var12_4 == null) break block14;
                                var4_5 = this.c0;
                                var3_6 = this.f0;
                                if ((long)(var4_5 - var3_6) >= var1_1) {
                                    this.f0 = (int)((long)var3_6 + var1_1);
                                    return var1_1;
                                }
                                var5_7 = var4_5 - var3_6;
                                this.f0 = var4_5;
                                if (this.e0 == -1 || var1_1 > (long)this.d0) break block12;
                                var3_6 = this.a(var12_4, var11_2);
                                if (var3_6 != -1) break block13;
                                return var5_7;
                            }
                            var4_5 = this.c0;
                            var3_6 = this.f0;
                            var7_8 = var4_5 - var3_6;
                            var9_9 = var1_1 - var5_7;
                            if (var7_8 < var9_9) ** GOTO lbl35
                            this.f0 = (int)((long)var3_6 + var9_9);
                            return var1_1;
lbl35:
                            // 1 sources

                            var1_1 = var4_5;
                            var7_8 = var3_6;
                            this.f0 = var4_5;
                            return var5_7 + var1_1 - var7_8;
                        }
                        var1_1 = var12_4.skip(var1_1 - var5_7);
                        return var5_7 + var1_1;
                        break block15;
                    }
                    throw l.d();
                }
                throw l.d();
            }
            throw var11_3;
        }
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }

    public static class a
    extends IOException {
        public a(String string) {
            super(string);
        }
    }
}

