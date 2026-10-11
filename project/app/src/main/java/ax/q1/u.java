/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.E;
import ax.q1.s;
import java.io.EOFException;
import java.io.IOException;

public final class u {
    public static void a(boolean bl, String string) throws E {
        if (bl) {
            return;
        }
        throw E.a(string, null);
    }

    /*
     * Exception decompiling
     */
    public static int b(int var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    public static boolean c(s s8, byte[] byArray, int n8, int n9, boolean bl) throws IOException {
        try {
            boolean bl2 = s8.h(byArray, n8, n9, bl);
            return bl2;
        }
        catch (EOFException eOFException) {
            if (bl) {
                return false;
            }
            throw eOFException;
        }
    }

    public static int d(s s8, byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        int n11;
        for (n10 = 0; n10 < n9 && (n11 = s8.k(byArray, n8 + n10, n9 - n10)) != -1; n10 += n11) {
        }
        return n10;
    }

    public static boolean e(s s8, byte[] byArray, int n8, int n9) throws IOException {
        try {
            s8.readFully(byArray, n8, n9);
            return true;
        }
        catch (EOFException eOFException) {
            return false;
        }
    }

    public static boolean f(s s8, int n8) throws IOException {
        try {
            s8.n(n8);
            return true;
        }
        catch (EOFException eOFException) {
            return false;
        }
    }
}

