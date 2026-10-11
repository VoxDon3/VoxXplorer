/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import android.util.SparseArray;
import ax.P0.v;
import ax.S0.i;
import ax.X1.G;
import ax.X1.L;
import ax.X1.O;
import ax.r7.z;
import java.util.ArrayList;
import java.util.List;

public final class j
implements L.c {
    private final int a;
    private final List<v> b;

    public j(int n8) {
        this(n8, z.z());
    }

    public j(int n8, List<v> list) {
        this.a = n8;
        this.b = list;
    }

    private G c(L.b b8) {
        return new G(this.e(b8), "video/mp2t");
    }

    private O d(L.b b8) {
        return new O(this.e(b8), "video/mp2t");
    }

    private List<v> e(L.b object) {
        if (this.f(32)) {
            return this.b;
        }
        ax.S0.G g8 = new ax.S0.G(((L.b)object).e);
        object = this.b;
        while (g8.a() > 0) {
            int n8 = g8.M();
            int n9 = g8.M();
            int n10 = g8.g();
            if (n8 == 134) {
                ArrayList<v> arrayList = new ArrayList<v>();
                int n11 = g8.M();
                n8 = 0;
                while (true) {
                    List<byte[]> list;
                    object = arrayList;
                    if (n8 >= (n11 & 0x1F)) break;
                    String string = g8.J(3);
                    int n12 = g8.M();
                    boolean bl = true;
                    boolean bl2 = (n12 & 0x80) != 0;
                    if (bl2) {
                        n12 &= 0x3F;
                        object = "application/cea-708";
                    } else {
                        object = "application/cea-608";
                        n12 = 1;
                    }
                    byte by = (byte)g8.M();
                    g8.c0(1);
                    if (bl2) {
                        if ((by & 0x40) == 0) {
                            bl = false;
                        }
                        list = i.g(bl);
                    } else {
                        list = null;
                    }
                    arrayList.add(new v.b().y0((String)object).n0(string).Q(n12).k0(list).P());
                    ++n8;
                }
            }
            g8.b0(n10 + n9);
        }
        return object;
    }

    private boolean f(int n8) {
        return (n8 & this.a) != 0;
    }

    @Override
    public SparseArray<L> a() {
        return new SparseArray();
    }

    /*
     * Exception decompiling
     */
    @Override
    public L b(int var1_1, L.b var2_2) {
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
}

