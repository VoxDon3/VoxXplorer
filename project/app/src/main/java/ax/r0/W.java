/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.B;
import ax.r0.D;
import ax.r0.S;
import ax.r0.g0;
import ax.r0.h;
import ax.r0.h0;
import ax.r0.j0;
import ax.r0.o0;
import ax.r0.p;
import ax.r0.q;
import ax.r0.u;
import ax.r0.u0;
import ax.r0.v0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class W<T>
implements h0<T> {
    private final S a;
    private final o0<?, ?> b;
    private final boolean c;
    private final q<?> d;

    private W(o0<?, ?> o02, q<?> q8, S s8) {
        this.b = o02;
        this.c = q8.e(s8);
        this.d = q8;
        this.a = s8;
    }

    private <UT, UB> int j(o0<UT, UB> o02, T t8) {
        return o02.i(o02.g(t8));
    }

    /*
     * Exception decompiling
     */
    private <UT, UB, ET extends u.b<ET>> void k(o0<UT, UB> var1_1, q<ET> var2_2, T var3_6, g0 var4_7, p var5_8) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    static <T> W<T> l(o0<?, ?> o02, q<?> q8, S s8) {
        return new W<T>(o02, q8, s8);
    }

    private <UT, UB, ET extends u.b<ET>> boolean m(g0 g02, p p8, q<ET> q8, u<ET> u8, o0<UT, UB> o02, UB UB) throws IOException {
        int n8 = g02.l();
        if (n8 != u0.a) {
            if (u0.b(n8) == 2) {
                Object object = q8.b(p8, this.a, u0.a(n8));
                if (object != null) {
                    q8.h(g02, object, p8, u8);
                    return true;
                }
                return o02.m(UB, g02);
            }
            return g02.J();
        }
        Object object = null;
        h h8 = null;
        n8 = 0;
        while (g02.D() != Integer.MAX_VALUE) {
            int n9 = g02.l();
            if (n9 == u0.c) {
                n8 = g02.p();
                object = q8.b(p8, this.a, n8);
                continue;
            }
            if (n9 == u0.d) {
                if (object != null) {
                    q8.h(g02, object, p8, u8);
                    continue;
                }
                h8 = g02.G();
                continue;
            }
            if (g02.J()) continue;
        }
        if (g02.l() == u0.b) {
            if (h8 != null) {
                if (object != null) {
                    q8.i(h8, object, p8, u8);
                } else {
                    o02.d(UB, n8, h8);
                }
            }
            return true;
        }
        throw B.a();
    }

    private <UT, UB> void n(o0<UT, UB> o02, T t8, v0 v02) throws IOException {
        o02.s(o02.g(t8), v02);
    }

    @Override
    public void a(T t8, T t9) {
        j0.G(this.b, t8, t9);
        if (this.c) {
            j0.E(this.d, t8, t9);
        }
    }

    @Override
    public void b(T t8) {
        this.b.j(t8);
        this.d.f(t8);
    }

    @Override
    public final boolean c(T t8) {
        return this.d.c(t8).p();
    }

    @Override
    public void d(T t8, v0 v02) throws IOException {
        Iterator<Map.Entry<?, Object>> iterator = this.d.c(t8).s();
        while (iterator.hasNext()) {
            Map.Entry<?, Object> entry = iterator.next();
            u.b b8 = (u.b)entry.getKey();
            if (b8.y() == u0.c.k0 && !b8.k() && !b8.z()) {
                if (entry instanceof D.b) {
                    v02.c(b8.g(), ((D.b)entry).a().e());
                    continue;
                }
                v02.c(b8.g(), entry.getValue());
                continue;
            }
            throw new IllegalStateException("Found invalid MessageSet item.");
        }
        this.n(this.b, t8, v02);
    }

    @Override
    public boolean e(T t8, T t9) {
        if (!this.b.g(t8).equals(this.b.g(t9))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t8).equals(this.d.c(t9));
        }
        return true;
    }

    @Override
    public int f(T t8) {
        int n8;
        int n9 = n8 = this.j(this.b, t8);
        if (this.c) {
            n9 = n8 + this.d.c(t8).j();
        }
        return n9;
    }

    @Override
    public T g() {
        return (T)this.a.j().u0();
    }

    @Override
    public void h(T t8, g0 g02, p p8) throws IOException {
        this.k(this.b, this.d, t8, g02, p8);
    }

    @Override
    public int i(T t8) {
        int n8;
        int n9 = n8 = this.b.g(t8).hashCode();
        if (this.c) {
            n9 = n8 * 53 + this.d.c(t8).hashCode();
        }
        return n9;
    }
}

