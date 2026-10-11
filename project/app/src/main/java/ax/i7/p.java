/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.db.a;
import ax.db.q;
import ax.db.y;
import ax.i7.A;
import ax.i7.C;
import ax.i7.g;
import ax.i7.i;
import ax.i7.j;
import ax.i7.k;
import ax.i7.l;
import ax.i7.m;
import ax.i7.n;
import ax.i7.o;
import ax.i7.s;
import ax.i7.t;
import ax.i7.u;
import ax.i7.v;
import ax.i7.w;
import ax.i7.x;
import ax.i7.z;
import ax.m7.r;
import ax.m7.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class p {
    public static final String B;
    public static final String C;
    private boolean A = false;
    private l a;
    private m b = new m();
    private m c = new m();
    private int d = 10;
    private int e = 16384;
    private boolean f = true;
    private boolean g = true;
    private i h;
    private final w i;
    private String j;
    private g k;
    private int l = 20000;
    private int m = 20000;
    private int n = 0;
    private x o;
    private n p;
    private u q;
    private t r;
    private j s;
    private boolean t = true;
    private boolean u = false;
    private boolean v = true;
    @Deprecated
    private boolean w = false;
    private boolean x;
    private ax.m7.x y = ax.m7.x.a;
    private final y z = ax.i7.C.b();

    static {
        String string;
        B = string = ax.i7.p.q();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Google-HTTP-Java-Client/");
        stringBuilder.append(string);
        stringBuilder.append(" (gzip)");
        C = stringBuilder.toString();
    }

    p(w w8, String string) {
        this.i = w8;
        this.z(string);
    }

    private static void a(q q8, String string, String string2) {
        if (string2 != null) {
            q8.i(string, ax.db.a.b(string2));
        }
    }

    /*
     * Exception decompiling
     */
    private static String q() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    public p A(u u8) {
        this.q = u8;
        return this;
    }

    public p B(boolean bl) {
        this.A = bl;
        return this;
    }

    public p C(boolean bl) {
        this.v = bl;
        return this;
    }

    public p D(x x8) {
        this.o = x8;
        return this;
    }

    public p E(g g8) {
        this.k = ax.m7.v.d(g8);
        return this;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public s b() throws IOException {
        Throwable throwable322;
        Object object;
        int n8 = this.d >= 0 ? 1 : 0;
        ax.m7.v.a(n8 != 0);
        int n9 = this.d;
        ax.m7.v.d(this.j);
        ax.m7.v.d(this.k);
        q q8 = this.z.b(ax.i7.C.b).a(ax.i7.C.c()).b();
        Object object2 = null;
        while (true) {
            int n10;
            int n11;
            Object object3;
            block46: {
                int n12;
                block45: {
                    block44: {
                        IOException iOException222;
                        Logger logger;
                        block43: {
                            Object object4;
                            Object object5;
                            z z8;
                            String string;
                            block49: {
                                block48: {
                                    block47: {
                                        object3 = new StringBuilder();
                                        ((StringBuilder)object3).append("retry #");
                                        ((StringBuilder)object3).append(this.d - n9);
                                        q8.a(((StringBuilder)object3).toString());
                                        if (object2 != null) {
                                            ((s)object2).k();
                                        }
                                        if ((object2 = this.a) != null) {
                                            object2.a(this);
                                        }
                                        string = this.k.l();
                                        ax.i7.p.a(q8, "http.method", this.j);
                                        ax.i7.p.a(q8, "http.host", this.k.r());
                                        ax.i7.p.a(q8, "http.path", this.k.s());
                                        ax.i7.p.a(q8, "http.url", string);
                                        z8 = this.i.b(this.j, string);
                                        logger = ax.i7.w.a;
                                        n11 = this.f && logger.isLoggable(Level.CONFIG) ? 1 : 0;
                                        if (n11 == 0) break block47;
                                        object5 = new StringBuilder();
                                        ((StringBuilder)object5).append("-------------- REQUEST  --------------");
                                        object2 = ax.m7.z.a;
                                        ((StringBuilder)object5).append((String)object2);
                                        ((StringBuilder)object5).append(this.j);
                                        ((StringBuilder)object5).append(' ');
                                        ((StringBuilder)object5).append(string);
                                        ((StringBuilder)object5).append((String)object2);
                                        object2 = object5;
                                        if (!this.g) break block48;
                                        object2 = new StringBuilder("curl -v --compressed");
                                        object3 = object5;
                                        object = object2;
                                        if (!this.j.equals("GET")) {
                                            ((StringBuilder)object2).append(" -X ");
                                            ((StringBuilder)object2).append(this.j);
                                            object3 = object5;
                                            object = object2;
                                        }
                                        break block49;
                                    }
                                    object2 = null;
                                }
                                object = null;
                                object3 = object2;
                            }
                            object2 = this.b.t();
                            if (!this.x) {
                                if (object2 == null) {
                                    object4 = this.b;
                                    object5 = C;
                                    ((m)object4).P((String)object5);
                                    ax.i7.p.a(q8, "http.user_agent", (String)object5);
                                } else {
                                    object5 = new StringBuilder();
                                    ((StringBuilder)object5).append((String)object2);
                                    ((StringBuilder)object5).append(" ");
                                    ((StringBuilder)object5).append(C);
                                    object5 = ((StringBuilder)object5).toString();
                                    this.b.P((String)object5);
                                    ax.i7.p.a(q8, "http.user_agent", (String)object5);
                                }
                            }
                            ax.i7.C.d(q8, this.b);
                            ax.i7.m.x(this.b, (StringBuilder)object3, object, logger, z8);
                            if (!this.x) {
                                this.b.P((String)object2);
                            }
                            boolean bl = (object2 = this.h) == null || object2.c();
                            if (object2 != null) {
                                long l8;
                                object4 = this.h.a();
                                if (n11 != 0) {
                                    object2 = new r((ax.m7.y)object2, logger, Level.CONFIG, this.e);
                                }
                                if ((object5 = this.s) == null) {
                                    l8 = this.h.getLength();
                                    object5 = null;
                                } else {
                                    object5 = object5.getName();
                                    object2 = new k((ax.m7.y)object2, this.s);
                                    l8 = -1L;
                                }
                                n10 = n9;
                                if (n11 != 0) {
                                    String string2;
                                    StringBuilder stringBuilder;
                                    if (object4 != null) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Content-Type: ");
                                        stringBuilder.append((String)object4);
                                        string2 = stringBuilder.toString();
                                        ((StringBuilder)object3).append(string2);
                                        ((StringBuilder)object3).append(ax.m7.z.a);
                                        if (object != null) {
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(" -H '");
                                            stringBuilder.append(string2);
                                            stringBuilder.append("'");
                                            ((StringBuilder)object).append(stringBuilder.toString());
                                        }
                                    }
                                    if (object5 != null) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Content-Encoding: ");
                                        stringBuilder.append((String)object5);
                                        string2 = stringBuilder.toString();
                                        ((StringBuilder)object3).append(string2);
                                        ((StringBuilder)object3).append(ax.m7.z.a);
                                        if (object != null) {
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(" -H '");
                                            stringBuilder.append(string2);
                                            stringBuilder.append("'");
                                            ((StringBuilder)object).append(stringBuilder.toString());
                                        }
                                    }
                                    if (l8 >= 0L) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Content-Length: ");
                                        stringBuilder.append(l8);
                                        ((StringBuilder)object3).append(stringBuilder.toString());
                                        ((StringBuilder)object3).append(ax.m7.z.a);
                                    }
                                }
                                if (object != null) {
                                    ((StringBuilder)object).append(" -d '@-'");
                                }
                                z8.i((String)object4);
                                z8.g((String)object5);
                                z8.h(l8);
                                z8.j((ax.m7.y)object2);
                            } else {
                                n10 = n9;
                            }
                            n10 = n9;
                            if (n11 != 0) {
                                logger.config(((StringBuilder)object3).toString());
                                if (object != null) {
                                    ((StringBuilder)object).append(" -- '");
                                    ((StringBuilder)object).append(string.replaceAll("'", "'\"'\"'"));
                                    ((StringBuilder)object).append("'");
                                    if (object2 != null) {
                                        ((StringBuilder)object).append(" << $$$");
                                    }
                                    logger.config(((StringBuilder)object).toString());
                                }
                            }
                            n12 = bl && n10 > 0 ? 1 : 0;
                            z8.k(this.l, this.m);
                            z8.l(this.n);
                            object = this.z.d(q8);
                            ax.i7.C.g(q8, z8.d());
                            object3 = z8.b();
                            if (object3 == null) break block43;
                            ax.i7.C.f(q8, ((A)object3).d());
                            q8.i("http.status_code", ax.db.a.a(((A)object3).j()));
                        }
                        try {
                            object2 = new s(this, (A)object3);
                            object.close();
                            object3 = null;
                            break block44;
                        }
                        catch (Throwable throwable2) {
                            try {
                                object3 = ((A)object3).b();
                                if (object3 == null) throw throwable2;
                                ((InputStream)object3).close();
                                throw throwable2;
                            }
                            catch (Throwable throwable322) {
                                break;
                            }
                            catch (IOException iOException222) {}
                        }
                        if (!(this.w || (object2 = this.p) != null && object2.a(this, n12 != 0))) {
                            q8.g(ax.i7.C.a(null));
                            throw iOException222;
                        }
                        if (n11 != 0) {
                            logger.log(Level.WARNING, "exception thrown while executing request", iOException222);
                        }
                        object.close();
                        object2 = null;
                    }
                    if (object2 != null) {
                        try {
                            if (((s)object2).l()) break block45;
                            object = this.o;
                            n8 = object != null ? object.b(this, (s)object2, n12 != 0) : 0;
                            int n13 = n8;
                            if (n8 == 0) {
                                n13 = n8;
                                if (this.r(((s)object2).h(), ((s)object2).f())) {
                                    n13 = 1;
                                }
                            }
                            n9 = n11 = n12 & n13;
                            if (n11 != 0) {
                                ((s)object2).k();
                                n9 = n11;
                            }
                            break block46;
                        }
                        catch (Throwable throwable4) {}
                        ((s)object2).a();
                        throw throwable4;
                    }
                }
                n9 = object2 == null ? 1 : 0;
                n9 = n12 & n9;
            }
            n11 = n10 - 1;
            if (n9 == 0) {
                object = object2 == null ? null : Integer.valueOf(((s)object2).h());
                q8.g(ax.i7.C.a((Integer)object));
                if (object2 == null) throw object3;
                object3 = this.q;
                if (object3 != null) {
                    object3.a((s)object2);
                }
                if (!this.v) return object2;
                if (((s)object2).l()) {
                    return object2;
                }
                try {
                    object3 = new t.a((s)object2);
                    throw ((t.a)object3).b(this.d - n11).a();
                }
                catch (Throwable throwable5) {
                    ((s)object2).a();
                    throw throwable5;
                }
            }
            n9 = n11;
        }
        object.close();
        throw throwable322;
    }

    public i c() {
        return this.h;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.t;
    }

    public m f() {
        return this.b;
    }

    public n g() {
        return this.p;
    }

    public final t h() {
        return this.r;
    }

    public String i() {
        return this.j;
    }

    public m j() {
        return this.c;
    }

    public u k() {
        return this.q;
    }

    public boolean l() {
        return this.A;
    }

    public boolean m() {
        return this.v;
    }

    public w n() {
        return this.i;
    }

    public x o() {
        return this.o;
    }

    public g p() {
        return this.k;
    }

    public boolean r(int n8, m object) {
        object = ((m)object).r();
        if (this.e() && ax.i7.v.a(n8) && object != null) {
            this.E(new g(this.k.z((String)object), this.u));
            if (n8 == 303) {
                this.z("GET");
                this.t(null);
            }
            this.b.D(null);
            this.b.J(null);
            this.b.L(null);
            this.b.K(null);
            this.b.N(null);
            this.b.M(null);
            return true;
        }
        return false;
    }

    public boolean s() {
        return this.f;
    }

    public p t(i i8) {
        this.h = i8;
        return this;
    }

    public p u(j j8) {
        this.s = j8;
        return this;
    }

    public p v(n n8) {
        this.p = n8;
        return this;
    }

    public p w(l l8) {
        this.a = l8;
        return this;
    }

    public p x(t t8) {
        this.r = t8;
        return this;
    }

    public p y(int n8) {
        boolean bl = n8 >= 0;
        ax.m7.v.a(bl);
        this.m = n8;
        return this;
    }

    public p z(String string) {
        boolean bl = string == null || ax.i7.o.i(string);
        ax.m7.v.a(bl);
        this.j = string;
        return this;
    }
}

