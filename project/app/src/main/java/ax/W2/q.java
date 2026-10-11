/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.Q2.a;
import ax.Q2.f;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.c3.K;
import ax.u3.q;
import com.alphainventor.filemanager.file.J;
import com.alphainventor.filemanager.file.f;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.file.y;
import java.util.List;
import java.util.Map;

public class q
extends j {
    private int A;
    private long B;
    private Map<String, f.a> C;
    private o w;
    private List<n> x;
    private n y;
    private b z;

    public q(h.a a8, o o8, List<n> list, int n8, long l8, Map<String, f.a> map) {
        super(a8);
        this.w = o8;
        this.x = list;
        this.A = n8;
        this.B = l8;
        this.C = map;
        o8.n0();
        this.h(this.w.T());
    }

    static /* synthetic */ n x0(q q8, n n8) {
        q8.y = n8;
        return n8;
    }

    static /* synthetic */ o y0(q q8) {
        return q8.w;
    }

    static /* synthetic */ Map z0(q q8) {
        return q8.C;
    }

    @Override
    public String A() {
        return this.L();
    }

    @Override
    public int B() {
        return 9;
    }

    @Override
    public String C() {
        return this.r().getString(2131952520);
    }

    @Override
    public String F() {
        int n8 = ax.W2.q$a.a[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getString(2131951754);
            }
            return this.r().getString(2131952350);
        }
        n8 = this.w().H();
        if (n8 == 1) {
            return this.r().getResources().getString(2131952357, new Object[]{this.x.get(0).B()});
        }
        return this.r().getResources().getQuantityString(2131820556, n8, new Object[]{n8});
    }

    @Override
    protected String G() {
        if (ax.W2.q$a.a[this.D().ordinal()] != 2) {
            return "";
        }
        boolean bl = this.w.S() == f.p0;
        return this.v(bl);
    }

    @Override
    public K H() {
        return null;
    }

    @Override
    public String J() {
        return "";
    }

    @Override
    public K K() {
        n n8 = this.y;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String M() {
        n n8 = this.y;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    protected boolean P() {
        return this.w.Y();
    }

    @Override
    protected void W() {
    }

    @Override
    protected boolean X() {
        if (this.S(this.z)) {
            this.z.e();
            return true;
        }
        return false;
    }

    @Override
    protected void Y() {
        if (this.w.Y()) {
            this.w().T(v.a.c0);
            this.w.n(this.x());
        }
    }

    @Override
    protected void Z() {
        if (this.w().H() == this.x.size()) {
            this.t0(h.b.c0);
            return;
        }
        this.t0(h.b.d0);
    }

    @Override
    public void c0() {
        b b8;
        this.j0();
        this.w().a0(true);
        this.w().e0(this.B);
        this.w().d0(this.x.size());
        this.k0();
        this.z = b8 = new b(this);
        b8.i(new Void[0]);
    }

    @Override
    public void k() {
        this.w.k0(true);
    }

    @Override
    public void n0() {
        String string = a.c.a(this.D());
        ax.Q2.a.i().m("command", "file_recycle").c("result", string).c("loc", this.w.S().I()).d(this.w().x()).e();
    }

    private class b
    extends ax.u3.q<Void, Void, Integer> {
        final q h;

        public b(q q8) {
            this.h = q8;
            super(q.e.f0);
        }

        /*
         * Exception decompiling
         */
        protected Integer w(Void ... var1_1) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [4, 3 : 177->241)] ax.b3.j
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        public void x() throws ax.b3.j {
            Object object = K.e;
            if (((K)object).e() != null) {
                J.X1((K)object, false);
            }
            object = this.h.x.iterator();
            while (object.hasNext()) {
                if (!((y)((n)object.next())).X0()) continue;
                object = K.f;
                if (((K)object).e() == null) break;
                J.X1((K)object, false);
                break;
            }
        }

        protected void y(Integer n8) {
            this.h.g0();
        }

        protected void z(Integer n8) {
            this.h.o();
        }
    }
}

