/*
 * Decompiled with CFR 0.152.
 */
package ax.d5;

import ax.d5.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

public class a
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    volatile boolean c0 = false;
    boolean d0 = false;
    Thread e0;
    Thread f0;
    protected byte[] g0;
    protected int h0 = -1;
    protected int i0 = 0;
    boolean q = false;

    public a() {
        this.d(1024);
    }

    public a(int n8) {
        this.d(n8);
    }

    public a(b b8) throws IOException {
        this(b8, 1024);
    }

    public a(b b8, int n8) throws IOException {
        this.d(n8);
        this.c(b8);
    }

    private void a() throws IOException {
        while (this.h0 == this.i0) {
            this.b();
            this.notifyAll();
            try {
                this.wait(1000L);
            }
            catch (InterruptedException interruptedException) {
                a.j();
            }
        }
    }

    private void b() throws IOException {
        if (this.d0) {
            if (!this.q && !this.c0) {
                Thread thread = this.e0;
                if (thread != null && !thread.isAlive()) {
                    throw new IOException("Read end dead");
                }
                return;
            }
            throw new IOException("Pipe closed");
        }
        throw new IOException("Pipe not connected");
    }

    private void d(int n8) {
        if (n8 > 0) {
            this.g0 = new byte[n8];
            return;
        }
        throw new IllegalArgumentException("Pipe Size <= 0");
    }

    public static void j() throws InterruptedIOException {
        Thread.currentThread().interrupt();
        throw new InterruptedIOException();
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
            int n8;
            Throwable throwable2;
            int n9;
            block8: {
                block7: {
                    try {
                        n9 = this.h0;
                        if (n9 >= 0) break block7;
                    }
                    catch (Throwable throwable2) {}
                    return 0;
                }
                n8 = this.i0;
                if (n9 == n8) {
                    return this.g0.length;
                }
                if (n9 <= n8) break block8;
                return n9 - n8;
            }
            int n10 = this.g0.length;
            return n9 + n10 - n8;
            throw throwable2;
        }
    }

    public void c(b b8) throws IOException {
        b8.a(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        this.c0 = true;
        synchronized (this) {
            this.h0 = -1;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void e(int n8) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                int n9;
                block6: {
                    try {
                        this.b();
                        this.f0 = Thread.currentThread();
                        if (this.h0 != this.i0) break block6;
                        this.a();
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                if (this.h0 < 0) {
                    this.h0 = 0;
                    this.i0 = 0;
                }
                byte[] byArray = this.g0;
                int n10 = this.h0;
                this.h0 = n9 = n10 + 1;
                byArray[n10] = (byte)(n8 & 0xFF);
                {
                    if (n9 >= byArray.length) {
                        this.h0 = 0;
                    }
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void f(byte[] var1_1, int var2_3, int var3_4) throws IOException {
        synchronized (this) {
            block11: {
                block10: {
                    block12: {
                        block9: {
                            try {
                                this.b();
                                this.f0 = Thread.currentThread();
                                var4_5 = var2_3;
lbl6:
                                // 3 sources

                                while (var3_4 > 0) {
                                    if (this.h0 != this.i0) break block9;
                                    this.a();
                                    break block9;
                                }
                                break block10;
                            }
                            catch (Throwable var1_2) {
                                break block11;
                            }
                        }
                        if ((var2_3 = this.i0) >= (var5_6 = this.h0)) break block12;
                        var2_3 = this.g0.length;
                        while (true) {
                            var2_3 -= var5_6;
                            ** GOTO lbl27
                            break;
                        }
                    }
                    if (var5_6 >= var2_3) ** GOTO lbl26
                    if (var5_6 != -1) ** continue;
                    {
                        block13: {
                            this.i0 = 0;
                            this.h0 = 0;
                            var2_3 = this.g0.length;
                            break block13;
lbl26:
                            // 1 sources

                            var2_3 = 0;
                        }
                        var5_6 = var2_3;
                        if (var2_3 > var3_4) {
                            var5_6 = var3_4;
                        }
                        System.arraycopy(var1_1, var4_5, this.g0, this.h0, var5_6);
                        var6_7 = var3_4 - var5_6;
                        var2_3 = var4_5 + var5_6;
                    }
                    {
                        this.h0 = var5_6 = this.h0 + var5_6;
                        var4_5 = var2_3;
                        var3_4 = var6_7;
                        if (var5_6 < this.g0.length) ** GOTO lbl6
                        this.h0 = 0;
                        var4_5 = var2_3;
                        var3_4 = var6_7;
                        ** GOTO lbl6
                    }
                }
                return;
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void g() {
        synchronized (this) {
            this.q = true;
            this.notifyAll();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public int read() throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3 : 72->79)] java.lang.Throwable
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] var1_1, int var2_3, int var3_4) throws IOException {
        synchronized (this) {
            block12: {
                block11: {
                    if (var1_1 /* !! */  == null) ** GOTO lbl44
                    if (var2_3 < 0 || var3_4 < 0) ** GOTO lbl-1000
                    try {
                        var5_5 = var1_1 /* !! */ .length;
                        if (var3_4 > var5_5 - var2_3) ** GOTO lbl-1000
                        if (var3_4 == 0) {
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var1_2) {
                        break block12;
                    }
                    return 0;
lbl-1000:
                    // 1 sources

                    {
                        var5_5 = this.read();
                        if (var5_5 >= 0) break block11;
                    }
                    return -1;
                }
                var1_1 /* !! */ [var2_3] = var4_6 = (byte)var5_5;
                var6_7 = 1;
                var5_5 = var3_4;
                while ((var3_4 = this.h0) >= 0 && var5_5 > 1) {
                    var7_8 = this.i0;
                    var3_4 = var3_4 > var7_8 ? Math.min(this.g0.length - var7_8, var3_4 - var7_8) : this.g0.length - var7_8;
                    var8_9 = var5_5 - 1;
                    var7_8 = var3_4;
                    if (var3_4 <= var8_9) ** GOTO lbl-1000
                    var7_8 = var8_9;
lbl-1000:
                    // 2 sources

                    {
                        System.arraycopy(this.g0, this.i0, var1_1 /* !! */ , var2_3 + var6_7, var7_8);
                        this.i0 = var8_9 = this.i0 + var7_8;
                        var3_4 = var6_7 + var7_8;
                        var7_8 = var5_5 - var7_8;
                    }
                    {
                        if (var8_9 >= this.g0.length) {
                            this.i0 = 0;
                        }
                        var6_7 = var3_4;
                        var5_5 = var7_8;
                        if (this.h0 != this.i0) continue;
                        this.h0 = -1;
                        var6_7 = var3_4;
                        var5_5 = var7_8;
                    }
                }
                return var6_7;
lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (byte[])new IndexOutOfBoundsException;
                    var1_1 /* !! */ ();
                    throw var1_1 /* !! */ ;
lbl44:
                    // 1 sources

                    var1_1 /* !! */  = (byte[])new NullPointerException;
                    var1_1 /* !! */ ();
                    throw var1_1 /* !! */ ;
                }
            }
            throw var1_2;
        }
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

