/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

import ax.N8.B;
import ax.N8.h;
import ax.N8.o;
import ax.N8.p;
import ax.N8.v;
import ax.N8.x;
import ax.Q8.F;
import ax.Q8.e;
import ax.Q8.i;
import ax.Q8.l;
import ax.Q8.u;
import ax.R8.p;
import ax.R8.u;
import ax.Z8.a;
import ax.p9.c;
import ax.s9.a;
import ax.s9.b;
import ax.s9.d;
import ax.s9.g;
import ax.s9.m;
import ax.s9.n;
import ax.s9.o;
import java.util.AbstractCollection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class c
extends m {
    private static final n v0 = new n(){

        @Override
        public boolean a(long l8) {
            return l8 == ax.K8.a.v0.getValue() || l8 == ax.K8.a.x0.getValue() || l8 == ax.K8.a.N0.getValue() || l8 == ax.K8.a.B0.getValue();
            {
            }
        }
    };
    private static final n w0 = new n(){

        @Override
        public boolean a(long l8) {
            return l8 == ax.K8.a.v0.getValue() || l8 == ax.K8.a.x0.getValue() || l8 == ax.K8.a.a1.getValue() || l8 == ax.K8.a.B0.getValue();
            {
            }
        }
    };
    private static n x0 = new n(){

        @Override
        public boolean a(long l8) {
            return l8 == ax.K8.a.B0.getValue();
        }
    };
    private final ax.p9.c u0;

    public c(ax.k9.e e8, o o8, ax.p9.c c8) {
        super(e8, o8);
        this.u0 = c8;
    }

    private f D0(ax.k9.e e8, l object, Set<ax.J8.a> object2, Set<ax.L8.a> set, Set<u> set2, ax.Q8.d d8, Set<e> set3) {
        ax.R8.e e9;
        block3: {
            e9 = super.b(e8, (l)object, (Set<ax.J8.a>)object2, set, set2, d8, set3);
            try {
                ax.p9.c c8 = this.u0;
                ax.r9.b b8 = this.e0;
                c.b<f> b9 = new c.b<f>(){
                    final ax.k9.e a;
                    final l b;
                    final Set c;
                    final Set d;
                    final Set e;
                    final ax.Q8.d f;
                    final Set g;
                    final c h;
                    {
                        this.h = c8;
                        this.a = e8;
                        this.b = l8;
                        this.c = set;
                        this.d = set2;
                        this.e = set3;
                        this.f = d8;
                        this.g = set4;
                    }

                    public f b(ax.k9.e e8) {
                        c c8 = this.h.f1(this.a, e8);
                        if (!this.a.equals(e8)) {
                            return c8.D0(e8, this.b, this.c, this.d, this.e, this.f, this.g);
                        }
                        return null;
                    }
                };
                object = c8.c(b8, e9, e8, b9);
                if (object == null) break block3;
                return object;
            }
            catch (ax.p9.b b10) {
                long l8 = b10.b();
                object2 = ax.Q8.m.h0;
                object = new StringBuilder();
                ((StringBuilder)object).append("Cannot resolve path ");
                ((StringBuilder)object).append(e8);
                throw new F(l8, (ax.Q8.m)((Object)object2), ((StringBuilder)object).toString(), b10);
            }
        }
        object = new f(e9, e8, this);
        return object;
    }

    private c f1(ax.k9.e e8, ax.k9.e e9) {
        ax.r9.b b8;
        ax.r9.b b9 = b8 = this.e0;
        if (!e8.d(e9)) {
            b9 = b8.m(e9);
        }
        if (!e8.e(e9)) {
            return (c)b9.b(e9.c());
        }
        return this;
    }

    private f g1(ax.k9.e e8, l object, Set<ax.J8.a> set, Set<ax.L8.a> object2, Set<u> set2, ax.Q8.d d8, Set<e> set3) {
        try {
            ax.p9.c c8 = this.u0;
            ax.r9.b b8 = this.e0;
            c.b<f> b9 = new c.b<f>(){
                final ax.k9.e a;
                final l b;
                final Set c;
                final Set d;
                final Set e;
                final ax.Q8.d f;
                final Set g;
                final c h;
                {
                    this.h = c8;
                    this.a = e8;
                    this.b = l8;
                    this.c = set;
                    this.d = set2;
                    this.e = set3;
                    this.f = d8;
                    this.g = set4;
                }

                public f b(ax.k9.e e8) {
                    return this.h.f1(this.a, e8).D0(e8, this.b, this.c, this.d, this.e, this.f, this.g);
                }
            };
            object = c8.b(b8, e8, b9);
            return object;
        }
        catch (ax.p9.b b10) {
            long l8 = b10.a().getValue();
            object2 = ax.Q8.m.h0;
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot resolve path ");
            ((StringBuilder)object).append(e8);
            throw new F(l8, (ax.Q8.m)((Object)object2), ((StringBuilder)object).toString(), b10);
        }
    }

    public void F0(i i8) {
        this.j1(i8, new ax.N8.i(true));
    }

    protected b G0(f f8) {
        ax.R8.e e8 = f8.a;
        e8.n();
        if (e8.n() != null && e8.n().contains(ax.L8.a.e0)) {
            return new a(e8.o(), f8.b, f8.c);
        }
        return new d(e8.o(), f8.b, f8.c);
    }

    public ax.N8.c L0(String string) throws F {
        return this.T0(string, ax.N8.c.class);
    }

    public <F extends v> F M0(i object, Class<F> object2) throws F {
        object2 = p.k(object2);
        byte[] byArray = this.v((i)object, p.a.c0, null, object2.a(), null).n();
        try {
            object = new a.c(byArray, ax.Z8.b.b);
            object = (v)object2.c((ax.Z8.a<?>)object);
        }
        catch (a.b b8) {
            throw new ax.k9.d(b8);
        }
        return (F)object;
    }

    public <F extends v> F T0(String object, Class<F> clazz) throws F {
        object = this.c1((String)object, EnumSet.of(ax.J8.a.l0, ax.J8.a.n0), null, u.f0, ax.Q8.d.d0, null);
        try {
            clazz = ((b)object).u(clazz);
            ((g)object).close();
        }
        catch (Throwable throwable) {
            if (object != null) {
                try {
                    ((g)object).close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
            }
            throw throwable;
        }
        return (F)clazz;
    }

    /*
     * Exception decompiling
     */
    public B Y0() throws F {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3 : 70->81)] java.lang.Throwable
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

    public List<ax.N8.m> Z0(String string) throws F {
        return this.a1(string, ax.N8.m.class, null, null);
    }

    public <I extends h> List<I> a1(String object, Class<I> object2, String string, EnumSet<ax.J8.a> enumSet) {
        EnumSet<ax.J8.a> enumSet2 = enumSet;
        if (enumSet == null) {
            enumSet2 = EnumSet.of(ax.J8.a.g0, ax.J8.a.l0, ax.J8.a.n0);
        }
        object = this.d1((String)object, enumSet2, null, u.f0, ax.Q8.d.d0, null);
        try {
            object2 = ((a)object).M0(object2, string);
            ((g)object).e();
            return object2;
        }
        catch (Throwable throwable) {
            if (object != null) {
                ((g)object).e();
            }
            throw throwable;
        }
    }

    public void b1(String string) throws F {
        this.d1(string, EnumSet.of(ax.J8.a.g0, ax.J8.a.i0), EnumSet.of(ax.L8.a.e0), u.f0, ax.Q8.d.e0, EnumSet.of(e.c0)).close();
    }

    @Override
    protected n c() {
        return this.u0.a();
    }

    public b c1(String string, Set<ax.J8.a> set, Set<ax.L8.a> set2, Set<u> set3, ax.Q8.d d8, Set<e> set4) {
        return this.G0(this.g1(new ax.k9.e(this.q, string), null, set, set2, set3, d8, set4));
    }

    public a d1(String string, Set<ax.J8.a> set, Set<ax.L8.a> set2, Set<u> set3, ax.Q8.d d8, Set<e> set4) {
        set4 = set4 != null ? EnumSet.copyOf(set4) : EnumSet.noneOf(e.class);
        ((AbstractCollection)((Object)set4)).add(e.c0);
        ((AbstractCollection)((Object)set4)).remove(e.i0);
        set2 = set2 != null ? EnumSet.copyOf(set2) : EnumSet.noneOf(ax.L8.a.class);
        ((AbstractCollection)((Object)set2)).add(ax.L8.a.e0);
        return (a)this.c1(string, set, set2, set3, d8, set4);
    }

    public d e1(String string, Set<ax.J8.a> set, Set<ax.L8.a> set2, Set<u> set3, ax.Q8.d d8, Set<e> set4) {
        set4 = set4 != null ? EnumSet.copyOf(set4) : EnumSet.noneOf(e.class);
        ((AbstractCollection)((Object)set4)).add(e.i0);
        ((AbstractCollection)((Object)set4)).remove(e.c0);
        set2 = set2 != null ? EnumSet.copyOf(set2) : EnumSet.noneOf(ax.L8.a.class);
        ((AbstractCollection)((Object)set2)).remove(ax.L8.a.e0);
        return (d)this.c1(string, set, set2, set3, d8, set4);
    }

    /*
     * Exception decompiling
     */
    public void h1(String var1_1) throws F {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 65->72)] ax.Q8.F
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
     * Exception decompiling
     */
    public void i1(String var1_1, boolean var2_4) throws F {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3 : 148->204)] ax.Q8.F
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

    public <F extends x> void j1(i i8, F f8) {
        ax.h9.b b8 = new ax.h9.b();
        o.b<F> b9 = p.l(f8);
        b9.b(f8, b8);
        this.o0(i8, u.a.c0, null, b9.a(), b8.f());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("[");
        stringBuilder.append(this.f());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    static class f {
        final ax.R8.e a;
        final c b;
        final ax.k9.e c;

        public f(ax.R8.e e8, ax.k9.e e9, c c8) {
            this.a = e8;
            this.c = e9;
            this.b = c8;
        }
    }
}

