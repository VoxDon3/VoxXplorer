/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import ax.jb.a;
import ax.nb.b;
import ax.nb.c;
import ax.nb.d;
import ax.nb.f;
import ax.nb.g;
import ax.nb.i;
import ax.nb.j;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.StringTokenizer;

class e
implements Runnable {
    private static final int p0 = a.d("jcifs.netbios.snd_buf_size", 576);
    private static final int q0 = a.d("jcifs.netbios.rcv_buf_size", 576);
    private static final int r0 = a.d("jcifs.netbios.soTimeout", 5000);
    private static final int s0 = a.d("jcifs.netbios.retryCount", 2);
    private static final int t0 = a.d("jcifs.netbios.retryTimeout", 3000);
    private static final int u0 = a.d("jcifs.netbios.lport", 0);
    private static final InetAddress v0 = a.b("jcifs.netbios.laddr", null);
    private static final String w0 = a.g("jcifs.resolveOrder");
    private static ax.qb.e x0 = ax.qb.e.a();
    private int c0;
    private int d0;
    private byte[] e0;
    private byte[] f0;
    private DatagramSocket g0;
    private DatagramPacket h0;
    private DatagramPacket i0;
    private HashMap j0;
    private Thread k0;
    private int l0 = 0;
    private int[] m0;
    InetAddress n0;
    InetAddress o0;
    private final Object q = new Object();

    e() {
        this(u0, v0);
    }

    e(int n8, InetAddress object) {
        this.j0 = new HashMap();
        this.c0 = n8;
        this.n0 = object;
        try {
            this.o0 = a.b("jcifs.netbios.baddr", InetAddress.getByName("255.255.255.255"));
        }
        catch (UnknownHostException unknownHostException) {
            // empty catch block
        }
        n8 = p0;
        this.e0 = new byte[n8];
        int n9 = q0;
        this.f0 = new byte[n9];
        this.i0 = new DatagramPacket(this.e0, n8, this.o0, 137);
        this.h0 = new DatagramPacket(this.f0, n9);
        Object object2 = w0;
        if (object2 != null && ((String)object2).length() != 0) {
            object = new int[3];
            StringTokenizer stringTokenizer = new StringTokenizer((String)object2, ",");
            n8 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                object2 = stringTokenizer.nextToken().trim();
                if (((String)object2).equalsIgnoreCase("LMHOSTS")) {
                    n9 = n8 + 1;
                    object[n8] = true;
                    n8 = n9;
                    continue;
                }
                if (((String)object2).equalsIgnoreCase("WINS")) {
                    if (g.w() == null) {
                        if (ax.qb.e.c0 <= 1) continue;
                        x0.println("NetBIOS resolveOrder specifies WINS however the jcifs.netbios.wins property has not been set");
                        continue;
                    }
                    n9 = n8 + 1;
                    object[n8] = 3;
                    n8 = n9;
                    continue;
                }
                if (((String)object2).equalsIgnoreCase("BCAST")) {
                    n9 = n8 + 1;
                    object[n8] = 2;
                    n8 = n9;
                    continue;
                }
                if (((String)object2).equalsIgnoreCase("DNS") || ax.qb.e.c0 <= 1) continue;
                ax.qb.e e8 = x0;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unknown resolver method: ");
                stringBuilder.append((String)object2);
                e8.println(stringBuilder.toString());
            }
            object2 = new int[n8];
            this.m0 = (int[])object2;
            System.arraycopy(object, 0, object2, 0, n8);
        } else if (g.w() == null) {
            object = new int[2];
            this.m0 = (int[])object;
            object[0] = true;
            object[1] = 2;
        } else {
            object = new int[3];
            this.m0 = (int[])object;
            object[0] = true;
            object[1] = 3;
            object[2] = 2;
        }
    }

    void a(int n8) throws IOException {
        this.d0 = 0;
        int n9 = r0;
        if (n9 != 0) {
            this.d0 = Math.max(n9, n8);
        }
        if (this.g0 == null) {
            Thread thread;
            this.g0 = new DatagramSocket(this.c0, this.n0);
            this.k0 = thread = new Thread((Runnable)this, "JCIFS-NameServiceClient");
            thread.setDaemon(true);
            this.k0.start();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    g[] b(b b8, InetAddress inetAddress) throws UnknownHostException {
        int n8;
        c c8 = new c(b8);
        d d8 = new d();
        if (inetAddress == null) {
            inetAddress = g.w();
        }
        c8.y = inetAddress;
        boolean bl = inetAddress == null;
        c8.p = bl;
        if (bl) {
            c8.y = this.o0;
            n8 = s0;
        } else {
            c8.p = false;
            n8 = 1;
        }
        try {
            while (true) {
                this.g(c8, d8, t0);
                if (d8.j && d8.e == 0) {
                    return d8.b;
                }
                if (--n8 <= 0 || !c8.p) throw new UnknownHostException(b8.a);
            }
        }
        catch (IOException iOException) {
            if (ax.qb.e.c0 <= 1) throw new UnknownHostException(b8.a);
            iOException.printStackTrace(x0);
            throw new UnknownHostException(b8.a);
        }
    }

    /*
     * Exception decompiling
     */
    g c(b var1_1, InetAddress var2_2) throws UnknownHostException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[FORLOOP], 7[CATCHBLOCK]], but top level block is 4[TRYBLOCK]
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

    int d() {
        int n8;
        this.l0 = n8 = this.l0 + 1;
        if ((n8 & 0xFFFF) == 0) {
            this.l0 = 1;
        }
        return this.l0;
    }

    g[] e(g g8) throws UnknownHostException {
        return this.f(g8, s0, t0);
    }

    g[] f(g gArray, int n8, int n9) throws UnknownHostException {
        j j8 = new j((g)gArray);
        int n10 = 0;
        i i8 = new i(new b("*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, null));
        i8.y = gArray.s();
        while (n8 > 0) {
            block5: {
                try {
                    this.g(i8, j8, n9);
                    if (!j8.j || j8.e != 0) break block5;
                    n9 = i8.y.hashCode();
                }
                catch (IOException iOException) {
                    if (ax.qb.e.c0 > 1) {
                        iOException.printStackTrace(x0);
                    }
                    throw new UnknownHostException(gArray.toString());
                }
                for (n8 = n10; n8 < (gArray = j8.D).length; ++n8) {
                    gArray[n8].a.d = n9;
                }
                return gArray;
            }
            --n8;
        }
        throw new UnknownHostException(gArray.a.a);
    }

    /*
     * Exception decompiling
     */
    void g(f var1_1, f var2_9, int var3_10) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [9 : 199->202)] java.lang.Throwable
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
    void h() {
        Object object = this.q;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        DatagramSocket datagramSocket = this.g0;
                        if (datagramSocket == null) break block3;
                        datagramSocket.close();
                        this.g0 = null;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.k0 = null;
                this.j0.clear();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        block14: {
            while (true) {
                block13: {
                    try lbl-1000:
                    // 2 sources

                    {
                        while (this.k0 == Thread.currentThread()) {
                            this.h0.setLength(e.q0);
                            this.g0.setSoTimeout(this.d0);
                            this.g0.receive(this.h0);
                            if (ax.qb.e.c0 > 3) {
                                e.x0.println("NetBIOS: new data read from socket");
                            }
                            break block13;
                        }
                        break block14;
                    }
                    catch (Throwable var2_3) {}
                }
                var1_1 = f.e(this.f0, 0);
                var2_2 = this.j0;
                var3_6 = new Integer(var1_1);
                if ((var2_2 = (f)var2_2.get(var3_6)) == null || var2_2.j) ** GOTO lbl-1000
                synchronized (var2_2) {
                    block15: {
                        try {
                            var2_2.i(this.f0, 0);
                            var2_2.j = true;
                            if (ax.qb.e.c0 <= 3) break block15;
                            e.x0.println(var2_2);
                            ax.qb.d.a(e.x0, this.f0, 0, this.h0.getLength());
                        }
                        catch (Throwable var3_7) {
                            break;
                        }
                    }
                    var2_2.notify();
                }
            }
            ** try [egrp 2[TRYBLOCK] [17, 16, 15 : 182->184)] { 
lbl32:
            // 1 sources

            throw var3_7;
lbl33:
            // 2 sources

            catch (Exception var2_4) {}
        }
        this.h();
        return;
lbl37:
        // 2 sources

        catch (SocketTimeoutException var2_5) {}
lbl38:
        // 1 sources

        ** finally { 
lbl39:
        // 1 sources

        this.h();
        throw var2_3;
    }
}

