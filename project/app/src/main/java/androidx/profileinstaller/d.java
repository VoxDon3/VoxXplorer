/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

class d {
    static int a(int n8) {
        return (n8 + 7 & 0xFFFFFFF8) / 8;
    }

    /*
     * Exception decompiling
     */
    static byte[] b(byte[] var0) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 58->65)] java.lang.Throwable
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

    static RuntimeException c(String string) {
        return new IllegalStateException(string);
    }

    static byte[] d(InputStream object, int n8) throws IOException {
        int n9;
        byte[] byArray = new byte[n8];
        for (int i8 = 0; i8 < n8; i8 += n9) {
            n9 = ((InputStream)object).read(byArray, i8, n8 - i8);
            if (n9 >= 0) {
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Not enough bytes to read: ");
            ((StringBuilder)object).append(n8);
            throw d.c(((StringBuilder)object).toString());
        }
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static byte[] e(InputStream object, int n8, int n9) throws IOException {
        Throwable throwable22;
        Inflater inflater;
        block9: {
            int n10;
            inflater = new Inflater();
            try {
                int n11;
                int n12;
                byte[] byArray = new byte[n9];
                byte[] byArray2 = new byte[2048];
                int n13 = 0;
                for (n10 = 0; !inflater.finished() && !inflater.needsDictionary() && n10 < n8; n13 += n12, n10 += n11) {
                    n11 = ((InputStream)object).read(byArray2);
                    if (n11 < 0) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
                        ((StringBuilder)object).append(n8);
                        ((StringBuilder)object).append(" bytes");
                        throw d.c(((StringBuilder)object).toString());
                    }
                    inflater.setInput(byArray2, 0, n11);
                    try {
                        n12 = inflater.inflate(byArray, n13, n9 - n13);
                        continue;
                    }
                    catch (DataFormatException dataFormatException) {
                        throw d.c(dataFormatException.getMessage());
                    }
                }
                if (n10 == n8) {
                    boolean bl = inflater.finished();
                    if (bl) {
                        inflater.end();
                        return byArray;
                    }
                    throw d.c("Inflater did not finish");
                }
            }
            catch (Throwable throwable22) {
                break block9;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Didn't read enough bytes during decompression. expected=");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" actual=");
            ((StringBuilder)object).append(n10);
            throw d.c(((StringBuilder)object).toString());
        }
        inflater.end();
        throw throwable22;
    }

    static String f(InputStream inputStream, int n8) throws IOException {
        return new String(d.d(inputStream, n8), StandardCharsets.UTF_8);
    }

    static long g(InputStream object, int n8) throws IOException {
        object = d.d((InputStream)object, n8);
        long l8 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            l8 += (long)(object[i8] & 0xFF) << i8 * 8;
        }
        return l8;
    }

    static int h(InputStream inputStream) throws IOException {
        return (int)d.g(inputStream, 2);
    }

    static long i(InputStream inputStream) throws IOException {
        return d.g(inputStream, 4);
    }

    static int j(InputStream inputStream) throws IOException {
        return (int)d.g(inputStream, 1);
    }

    static int k(String string) {
        return string.getBytes(StandardCharsets.UTF_8).length;
    }

    static void l(InputStream inputStream, OutputStream outputStream, FileLock object) throws IOException {
        if (object != null && ((FileLock)object).isValid()) {
            int n8;
            object = new byte[512];
            while ((n8 = inputStream.read((byte[])object)) > 0) {
                outputStream.write((byte[])object, 0, n8);
            }
            return;
        }
        throw new IOException("Unable to acquire a lock on the underlying file channel.");
    }

    static void m(OutputStream outputStream, byte[] byArray) throws IOException {
        d.q(outputStream, byArray.length);
        byArray = d.b(byArray);
        d.q(outputStream, byArray.length);
        outputStream.write(byArray);
    }

    static void n(OutputStream outputStream, String string) throws IOException {
        outputStream.write(string.getBytes(StandardCharsets.UTF_8));
    }

    static void o(OutputStream outputStream, long l8, int n8) throws IOException {
        byte[] byArray = new byte[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            byArray[i8] = (byte)(l8 >> i8 * 8 & 0xFFL);
        }
        outputStream.write(byArray);
    }

    static void p(OutputStream outputStream, int n8) throws IOException {
        d.o(outputStream, n8, 2);
    }

    static void q(OutputStream outputStream, long l8) throws IOException {
        d.o(outputStream, l8, 4);
    }

    static void r(OutputStream outputStream, int n8) throws IOException {
        d.o(outputStream, n8, 1);
    }
}

