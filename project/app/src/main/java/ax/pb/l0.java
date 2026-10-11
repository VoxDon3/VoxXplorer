/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.S;
import ax.pb.T;
import ax.pb.U;
import ax.pb.a0;
import ax.pb.i0;
import ax.pb.k0;
import ax.pb.s;
import ax.qb.e;
import java.io.PrintStream;

class l0 {
    private static int j;
    int a;
    int b;
    String c;
    String d = "?????";
    String e;
    i0 f;
    boolean g;
    boolean h;
    int i;

    l0(i0 i02, String string, String string2) {
        this.f = i02;
        this.c = string.toUpperCase();
        if (string2 != null && !string2.startsWith("??")) {
            this.d = string2;
        }
        this.e = this.d;
        this.a = 0;
    }

    boolean a(String string, String string2) {
        return this.c.equalsIgnoreCase(string) && (string2 == null || string2.startsWith("??") || this.d.equalsIgnoreCase(string2));
    }

    /*
     * Exception decompiling
     */
    void b(s var1_1, s var2_4) throws a0 {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 28->34)] java.lang.Throwable
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
    void c(s s8, s object) throws a0 {
        k0 k02 = this.f.h();
        synchronized (k02) {
            Throwable throwable2;
            block11: {
                a0 a022;
                block13: {
                    Object object2;
                    CharSequence charSequence;
                    int n8;
                    block12: {
                        block10: {
                            block9: {
                                try {
                                    while ((n8 = this.a) != 0) {
                                        if (n8 != 2 && n8 != 3) {
                                            try {
                                                this.f.h.wait();
                                                continue;
                                            }
                                            catch (InterruptedException interruptedException) {
                                                object = new a0(interruptedException.getMessage(), (Throwable)interruptedException);
                                                throw object;
                                            }
                                        }
                                        break block9;
                                    }
                                    break block10;
                                }
                                catch (Throwable throwable2) {
                                    break block11;
                                }
                            }
                            return;
                        }
                        this.a = 1;
                        try {
                            this.f.h.n();
                            charSequence = new StringBuilder();
                            charSequence.append("\\\\");
                            charSequence.append(this.f.h.E0);
                            charSequence.append('\\');
                            charSequence.append(this.c);
                            charSequence = charSequence.toString();
                            this.d = this.e;
                            object2 = this.f.h;
                            object2 = k0.F0;
                            if (ax.qb.e.c0 < 4) break block12;
                            object2 = k0.H0;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("treeConnect: unc=");
                            stringBuilder.append((String)charSequence);
                            stringBuilder.append(",service=");
                            stringBuilder.append(this.d);
                            ((PrintStream)object2).println(stringBuilder.toString());
                        }
                        catch (a0 a022) {
                            break block13;
                        }
                    }
                    object2 = new T((s)object);
                    object = new S(this.f, (String)charSequence, this.d, s8);
                    this.f.f((s)object, (s)object2);
                    this.b = ((s)object2).k0;
                    this.d = ((T)object2).H0;
                    this.g = ((T)object2).G0;
                    n8 = j;
                    j = n8 + 1;
                    this.i = n8;
                    this.a = 2;
                    return;
                }
                this.d(true);
                this.a = 0;
                throw a022;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void d(boolean bl) {
        k0 k02 = this.f.h();
        synchronized (k02) {
            Throwable throwable2;
            block7: {
                block8: {
                    int n8;
                    try {
                        if (this.a != 2) {
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    this.a = 3;
                    if (!bl && (n8 = this.b) != 0) {
                        try {
                            U u8 = new U();
                            this.b(u8, null);
                        }
                        catch (a0 a02) {
                            Object object = this.f.h;
                            object = k0.F0;
                            if (ax.qb.e.c0 <= 1) break block8;
                            a02.printStackTrace(k0.H0);
                        }
                    }
                }
                this.g = false;
                this.h = false;
                this.a = 0;
                this.f.h.notifyAll();
                return;
            }
            throw throwable2;
        }
    }

    public boolean equals(Object object) {
        if (object instanceof l0) {
            object = (l0)object;
            return this.a(((l0)object).c, ((l0)object).d);
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbTree[share=");
        stringBuilder.append(this.c);
        stringBuilder.append(",service=");
        stringBuilder.append(this.d);
        stringBuilder.append(",tid=");
        stringBuilder.append(this.b);
        stringBuilder.append(",inDfs=");
        stringBuilder.append(this.g);
        stringBuilder.append(",inDomainDfs=");
        stringBuilder.append(this.h);
        stringBuilder.append(",connectionState=");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

