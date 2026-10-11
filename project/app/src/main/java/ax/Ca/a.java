/*
 * Decompiled with CFR 0.152.
 */
package ax.Ca;

import ax.Q8.i;
import ax.Q8.l;
import ax.Q8.t;
import ax.Q8.u;
import ax.R8.h;
import ax.R8.r;
import ax.R8.s;
import ax.h9.d;
import ax.k9.e;
import ax.r9.b;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumSet;

public class a
extends ax.Ba.b
implements Closeable,
AutoCloseable {
    private static final EnumSet<ax.K8.a> k0;
    private static final EnumSet<ax.K8.a> l0;
    private static final EnumSet<ax.K8.a> m0;
    private final ax.s9.i f0;
    private final i g0;
    private final int h0;
    private final int i0;
    private final int j0;

    static {
        ax.K8.a a8 = ax.K8.a.c0;
        ax.K8.a a9 = ax.K8.a.i0;
        k0 = EnumSet.of(a8, a9);
        l0 = EnumSet.of(a8, a9, ax.K8.a.q0);
        m0 = EnumSet.of(a8);
    }

    public a(b b8, ax.s9.i i8, String string) throws IOException {
        super(b8, i8.g().b());
        this.f0 = i8;
        this.g0 = ((ax.R8.e)this.f(new ax.R8.d(b8.j().s0().a(), b8.p(), i8.g().f(), l.e0, EnumSet.of(ax.J8.a.c0, new ax.J8.a[]{ax.J8.a.d0, ax.J8.a.e0, ax.J8.a.n0, ax.J8.a.o0, ax.J8.a.l0, ax.J8.a.m0, ax.J8.a.q0}), null, EnumSet.of(u.c0, u.d0), ax.Q8.d.d0, null, new e(i8.f(), string)), EnumSet.of(ax.K8.a.c0))).o();
        this.h0 = Math.min(i8.g().b().P(), b8.j().s0().c());
        this.i0 = Math.min(i8.g().b().I(), b8.j().s0().b());
        this.j0 = Math.min(i8.g().b().S(), b8.j().s0().d());
    }

    private ax.R8.i g(byte[] byArray) throws IOException {
        return (ax.R8.i)this.f(new h(this.a(), this.c(), this.f0.g().f(), 1163287L, this.g0, new ax.o9.a(byArray, 0, byArray.length, 0L), true, this.h0), k0);
    }

    private s j() throws IOException {
        return (s)this.f(new r(this.a(), this.g0, this.c(), this.f0.g().f(), 0L, this.i0), l0);
    }

    @Override
    public void close() {
        this.f0.a(this.g0);
    }

    /*
     * Exception decompiling
     */
    public byte[] m() throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[DOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
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

    public byte[] o(byte[] object) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        block2: {
            object = this.g((byte[])object);
            byteArrayOutputStream = new ByteArrayOutputStream(4096);
            byte[] byArray = ((ax.R8.i)object).n();
            try {
                byteArrayOutputStream.write(byArray);
                if (!ax.K8.a.l(((t)((d)object).c()).m()).equals(ax.K8.a.i0)) break block2;
            }
            catch (IOException iOException) {
                throw new ax.k9.d(iOException);
            }
            byteArrayOutputStream.write(this.m());
        }
        return byteArrayOutputStream.toByteArray();
    }
}

