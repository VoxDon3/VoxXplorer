/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.jb.b;
import ax.nb.g;
import ax.pb.B;
import ax.pb.S;
import ax.pb.Z;
import ax.pb.a0;
import ax.pb.k0;
import ax.pb.l0;
import ax.pb.m0;
import ax.pb.n0;
import ax.pb.r;
import ax.pb.s;
import java.net.InetAddress;
import java.util.Enumeration;
import java.util.Vector;

public final class i0 {
    private static final String l = ax.jb.a.h("jcifs.smb.client.logonShare", null);
    private static final int m = ax.jb.a.d("jcifs.netbios.lookupRespLimit", 3);
    private static final String n = ax.jb.a.h("jcifs.smb.client.domain", null);
    private static final String o = ax.jb.a.h("jcifs.smb.client.username", null);
    private static final int p = ax.jb.a.d("jcifs.netbios.cachePolicy", 600) * 60;
    static g[] q = null;
    int a;
    int b;
    Vector c;
    private b d;
    private int e;
    private int f;
    private InetAddress g;
    k0 h = null;
    r i;
    long j;
    String k = null;

    i0(b b8, int n8, InetAddress inetAddress, int n9, r r8) {
        this.d = b8;
        this.e = n8;
        this.g = inetAddress;
        this.f = n9;
        this.i = r8;
        this.c = new Vector();
        this.a = 0;
    }

    public static void c(b object, int n8, r object2) throws a0 {
        object2 = k0.s((b)object, n8).r((r)object2);
        object = l;
        object2 = ((i0)object2).a((String)object, null);
        if (object == null) {
            ((l0)object2).c(null, null);
            return;
        }
        ((l0)object2).b(new m0("\\", "*", 16), new n0());
    }

    public static void d(b b8, r r8) throws a0 {
        i0.c(b8, 0, r8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    l0 a(String object, String string) {
        synchronized (this) {
            l0 l02;
            Enumeration enumeration = object;
            if (object == null) {
                enumeration = "IPC$";
            }
            try {
                object = this.c.elements();
                while (object.hasMoreElements()) {
                    l02 = (l0)object.nextElement();
                    boolean bl = l02.a((String)((Object)enumeration), string);
                    if (!bl) continue;
                }
            }
            catch (Throwable throwable) {}
            return l02;
            object = new l0(this, (String)((Object)enumeration), string);
            this.c.addElement(object);
            return object;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void b(boolean bl) {
        k0 k02 = this.h();
        synchronized (k02) {
            block9: {
                block8: {
                    Throwable throwable2;
                    block7: {
                        try {
                            if (this.a != 2) {
                                return;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        this.a = 3;
                        this.k = null;
                        Object object = this.c.elements();
                        while (object.hasMoreElements()) {
                            ((l0)object.nextElement()).d(bl);
                        }
                        if (bl || this.h.w0.g == 0) break block9;
                        object = new B(null);
                        ((s)object).m0 = this.b;
                        try {
                            this.h.y((s)object, null);
                            break block8;
                        }
                        catch (a0 a02) {}
                    }
                    throw throwable2;
                }
                this.b = 0;
            }
            this.a = 0;
            this.h.notifyAll();
            return;
        }
    }

    boolean e(r r8) {
        r r9 = this.i;
        return r9 == r8 || r9.equals(r8);
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void f(s s8, s s9) throws a0 {
        k0 k02 = this.h();
        synchronized (k02) {
            Throwable throwable2;
            block10: {
                if (s9 != null) {
                    try {
                        s9.r0 = false;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                }
                this.j = System.currentTimeMillis() + (long)Z.T;
                this.g(s8, s9);
                if (s9 != null && s9.r0) {
                    return;
                }
                if (s8 instanceof S) {
                    S s10 = (S)s8;
                    if (this.k != null && s10.K0.endsWith("\\IPC$")) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("\\\\");
                        stringBuilder.append(this.k);
                        stringBuilder.append("\\IPC$");
                        s10.K0 = stringBuilder.toString();
                    }
                }
                s8.m0 = this.b;
                s8.w0 = this.i;
                try {
                    this.h.y(s8, s9);
                    return;
                }
                catch (a0 a02) {
                    if (s8 instanceof S) {
                        this.b(true);
                    }
                    s8.y0 = null;
                    throw a02;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    void g(s var1_1, s var2_11) throws a0 {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3 : 46->70)] java.lang.Throwable
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
    k0 h() {
        synchronized (this) {
            try {
                if (this.h != null) return this.h;
                this.h = k0.t(this.d, this.e, this.g, this.f, null);
                return this.h;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbSession[accountName=");
        stringBuilder.append(this.i.c0);
        stringBuilder.append(",primaryDomain=");
        stringBuilder.append(this.i.q);
        stringBuilder.append(",uid=");
        stringBuilder.append(this.b);
        stringBuilder.append(",connectionState=");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

