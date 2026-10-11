/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.S0.F;
import ax.S0.G;
import ax.S0.a;
import ax.X1.L;
import ax.X1.g;
import ax.X1.i;
import ax.q1.M;
import ax.q1.N;
import ax.q1.j;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import java.io.IOException;
import java.util.List;

public final class h
implements r {
    public static final x m = new g();
    private final int a;
    private final i b;
    private final G c;
    private final G d;
    private final F e;
    private t f;
    private long g;
    private long h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;

    public h() {
        this(0);
    }

    public h(int n8) {
        G g8;
        int n9 = n8;
        if ((n8 & 2) != 0) {
            n9 = n8 | 1;
        }
        this.a = n9;
        this.b = new i(true, "audio/mp4a-latm");
        this.c = new G(2048);
        this.i = -1;
        this.h = -1L;
        this.d = g8 = new G(10);
        this.e = new F(g8.f());
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new h()};
    }

    /*
     * Exception decompiling
     */
    private void h(s var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 269->274)] java.io.EOFException
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

    private static int i(int n8, long l8) {
        return (int)((long)n8 * 8000000L / l8);
    }

    private N j(long l8, boolean bl) {
        int n8 = ax.X1.h.i(this.i, this.b.k());
        return new j(l8, this.h, n8, this.i, bl);
    }

    private void l(long l8, boolean bl) {
        boolean bl2;
        int n8;
        block7: {
            block6: {
                if (this.l) break block6;
                n8 = this.a;
                bl2 = false;
                if ((n8 = (n8 & 1) != 0 && this.i > 0 ? 1 : 0) == 0 || this.b.k() != -9223372036854775807L || bl) break block7;
            }
            return;
        }
        if (n8 != 0 && this.b.k() != -9223372036854775807L) {
            t t8 = this.f;
            bl = bl2;
            if ((this.a & 2) != 0) {
                bl = true;
            }
            t8.h(this.j(l8, bl));
        } else {
            this.f.h(new N.b(-9223372036854775807L));
        }
        this.l = true;
    }

    private int m(s s8) throws IOException {
        int n8 = 0;
        while (true) {
            s8.p(this.d.f(), 0, 10);
            this.d.b0(0);
            if (this.d.P() != 0x494433) {
                s8.m();
                s8.j(n8);
                if (this.h == -1L) {
                    this.h = n8;
                }
                return n8;
            }
            this.d.c0(3);
            int n9 = this.d.L();
            n8 += n9 + 10;
            s8.j(n9);
        }
    }

    @Override
    public void a(t t8) {
        this.f = t8;
        this.b.d(t8, new L.d(0, 1));
        t8.o();
    }

    @Override
    public void b(long l8, long l9) {
        this.k = false;
        this.b.b();
        this.g = l9;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean c(s var1_1) throws IOException {
        var3_3 = var6_2 = this.m(var1_1);
        var5_4 = 0;
        var2_5 = 0;
        do {
            var1_1.p(this.d.f(), 0, 2);
            this.d.b0(0);
            if (!ax.X1.i.m(this.d.U())) {
                var2_5 = var3_3 + 1;
                var1_1.m();
                var1_1.j(var2_5);
lbl11:
                // 2 sources

                while (true) {
                    var3_3 = 0;
                    var5_4 = 0;
                    var4_6 = var2_5;
                    var2_5 = var5_4;
                    break;
                }
            } else {
                if (++var5_4 >= 4 && var2_5 > 188) {
                    return true;
                }
                var1_1.p(this.d.f(), 0, 4);
                this.e.p(14);
                var4_6 = this.e.h(13);
                if (var4_6 <= 6) {
                    var2_5 = var3_3 + 1;
                    var1_1.m();
                    var1_1.j(var2_5);
                    ** continue;
                }
                var1_1.j(var4_6 - 6);
                var2_5 += var4_6;
                var4_6 = var3_3;
                var3_3 = var5_4;
            }
            var5_4 = var3_3;
            var3_3 = var4_6;
        } while (var4_6 - var6_2 < 8192);
        return false;
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        ax.S0.a.i(this.f);
        long l8 = s8.getLength();
        int n8 = this.a;
        if ((n8 & 2) != 0 || (n8 & 1) != 0 && l8 != -1L) {
            this.h(s8);
        }
        boolean bl = (n8 = s8.c(this.c.f(), 0, 2048)) == -1;
        this.l(l8, bl);
        if (bl) {
            return -1;
        }
        this.c.b0(0);
        this.c.a0(n8);
        if (!this.k) {
            this.b.f(this.g, 4);
            this.k = true;
        }
        this.b.c(this.c);
        return 0;
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }
}

