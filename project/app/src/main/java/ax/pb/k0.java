/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.nb.g;
import ax.nb.h;
import ax.nb.k;
import ax.pb.E;
import ax.pb.F;
import ax.pb.L;
import ax.pb.P;
import ax.pb.Q;
import ax.pb.Z;
import ax.pb.a0;
import ax.pb.b;
import ax.pb.c;
import ax.pb.d;
import ax.pb.e;
import ax.pb.i0;
import ax.pb.l0;
import ax.pb.p0;
import ax.pb.q0;
import ax.pb.r;
import ax.pb.s;
import ax.pb.t;
import ax.pb.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class k0
extends ax.rb.c
implements Z {
    static final byte[] F0 = new byte[65535];
    static final E G0 = new E();
    static ax.qb.e H0 = ax.qb.e.a();
    static HashMap I0 = null;
    int A0;
    int B0;
    int C0 = 0;
    boolean D0;
    String E0 = null;
    InetAddress i0;
    int j0;
    ax.jb.b k0;
    Socket l0;
    int m0;
    int n0;
    OutputStream o0;
    InputStream p0;
    byte[] q0 = new byte[512];
    v r0 = new v();
    long s0 = System.currentTimeMillis() + (long)Z.T;
    LinkedList t0 = new LinkedList();
    t u0 = null;
    LinkedList v0 = new LinkedList();
    a w0 = new a(this);
    int x0 = Z.N;
    int y0 = Z.w;
    int z0 = Z.x;

    k0(ax.jb.b b8, int n8, InetAddress inetAddress, int n9) {
        this.A0 = Z.y;
        this.B0 = Z.O;
        this.D0 = Z.z;
        this.k0 = b8;
        this.m0 = n8;
        this.i0 = inetAddress;
        this.j0 = n9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static k0 s(ax.jb.b object, int n8) {
        synchronized (k0.class) {
            return ax.pb.k0.t((ax.jb.b)object, n8, Z.u, Z.v, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static k0 t(ax.jb.b object, int n8, InetAddress inetAddress, int n9, String string) {
        synchronized (k0.class) {
            LinkedList linkedList = Z.R;
            synchronized (linkedList) {
                Throwable throwable2;
                int n10;
                Object object2;
                int n11;
                Object object3;
                block9: {
                    object3 = object;
                    n11 = n8;
                    object2 = inetAddress;
                    n10 = n9;
                    try {
                        if (Z.S == 1) break block9;
                        ListIterator listIterator = linkedList.listIterator();
                        do {
                            object3 = object;
                            n11 = n8;
                            object2 = inetAddress;
                            n10 = n9;
                            if (!listIterator.hasNext()) break block9;
                        } while (!((k0)(object2 = (k0)listIterator.next())).w((ax.jb.b)object, n8, inetAddress, n9, string) || (n11 = Z.S) != 0 && ((k0)object2).v0.size() >= n11);
                    }
                    catch (Throwable throwable2) {}
                    return object2;
                }
                object = new k0((ax.jb.b)object3, n11, (InetAddress)object2, n10);
                Z.R.add(0, object);
                return object;
                throw throwable2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void x(int n8, s object) throws IOException {
        byte[] byArray = this.q0;
        synchronized (byArray) {
            Throwable throwable2;
            block14: {
                Object object2;
                int n9;
                block13: {
                    Object object3;
                    if (n8 == 139) {
                        try {
                            this.z();
                            break block13;
                        }
                        catch (Throwable throwable2) {
                            break block14;
                        }
                    }
                    n9 = n8;
                    if (n8 == 0) {
                        n9 = 445;
                    }
                    object2 = new Socket();
                    this.l0 = object2;
                    if (this.i0 != null) {
                        object3 = new InetSocketAddress(this.i0, this.j0);
                        ((Socket)object2).bind((SocketAddress)object3);
                    }
                    object3 = this.l0;
                    object2 = new InetSocketAddress(this.k0.f(), n9);
                    ((Socket)object3).connect((SocketAddress)object2, Z.U);
                    this.l0.setSoTimeout(Z.T);
                    this.o0 = this.l0.getOutputStream();
                    this.p0 = this.l0.getInputStream();
                }
                this.n0 = n8 = this.n0 + 1;
                if (n8 == 32000) {
                    this.n0 = 1;
                }
                object2 = G0;
                ((s)object2).n0 = this.n0;
                n9 = ((s)object2).e(this.q0, 4);
                ax.qb.b.m(n9 & 0xFFFF, this.q0, 0);
                if (ax.qb.e.c0 >= 4) {
                    H0.println(object2);
                    if (ax.qb.e.c0 >= 6) {
                        ax.qb.d.a(H0, this.q0, 4, n9);
                    }
                }
                this.o0.write(this.q0, 0, n9 + 4);
                this.o0.flush();
                if (this.j() == null) {
                    object = new IOException("transport closed in negotiate");
                    throw object;
                }
                n8 = ax.qb.b.c(this.q0, 2) & 0xFFFF;
                if (n8 >= 33 && n8 + 4 <= ((Object)(object2 = (Object)this.q0)).length) {
                    ax.rb.c.k(this.p0, (byte[])object2, 36, n8 - 32);
                    ((s)object).d(this.q0, 4);
                    if (ax.qb.e.c0 >= 4) {
                        H0.println(object);
                        if (ax.qb.e.c0 >= 6) {
                            ax.qb.d.a(H0, this.q0, 4, n9);
                        }
                    }
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid payload size: ");
                ((StringBuilder)object).append(n8);
                object2 = new IOException(((StringBuilder)object).toString());
                throw object2;
            }
            throw throwable2;
        }
    }

    @Override
    protected void c() throws IOException {
        int n8;
        int n9;
        Object object;
        block12: {
            block13: {
                object = new F(this.w0);
                n9 = 139;
                try {
                    this.x(this.m0, (s)object);
                    break block12;
                }
                catch (NoRouteToHostException noRouteToHostException) {
                }
                catch (ConnectException connectException) {
                    break block13;
                }
                int n10 = this.m0;
                n8 = n9;
                if (n10 != 0) {
                    n8 = n10 == 445 ? n9 : 445;
                }
                this.m0 = n8;
                this.x(n8, (s)object);
                break block12;
            }
            int n11 = this.m0;
            n8 = n9;
            if (n11 != 0) {
                n8 = n11 == 445 ? n9 : 445;
            }
            this.m0 = n8;
            this.x(n8, (s)object);
        }
        if (((F)object).C0 <= 10) {
            object = this.w0;
            if ((((a)object).d & Integer.MIN_VALUE) != Integer.MIN_VALUE && ((a)object).o != 8 && Z.G == 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unexpected encryption key length: ");
                ((StringBuilder)object).append(this.w0.o);
                throw new a0(((StringBuilder)object).toString());
            }
            this.E0 = this.k0.g();
            object = this.w0;
            this.x0 = !(((a)object).j || ((a)object).i && Z.C) ? (this.x0 &= 0xFFFB) : (this.x0 |= 4);
            this.y0 = n9 = Math.min(this.y0, ((a)object).a);
            if (n9 < 1) {
                this.y0 = 1;
            }
            this.z0 = Math.min(this.z0, this.w0.b);
            n8 = this.B0;
            n9 = this.w0.d;
            this.B0 = n8 &= n9;
            if ((n9 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                this.B0 = n8 | Integer.MIN_VALUE;
            }
            if (((n9 = this.B0) & 4) == 0) {
                if (Z.A) {
                    this.B0 = n9 | 4;
                } else {
                    this.D0 = false;
                    this.x0 &= Short.MAX_VALUE;
                }
            }
            return;
        }
        throw new a0("This client does not support the negotiated dialect.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void d(boolean bl) throws IOException {
        Throwable throwable2;
        block7: {
            Object object = this.v0.listIterator();
            try {
                while (object.hasNext()) {
                    ((i0)object.next()).b(bl);
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            object = this.l0;
            if (object != null) {
                ((Socket)object).shutdownOutput();
            }
            if ((object = this.o0) != null) {
                ((OutputStream)object).close();
            }
            if ((object = this.p0) != null) {
                ((InputStream)object).close();
            }
            if ((object = this.l0) != null) {
                ((Socket)object).close();
            }
            this.u0 = null;
            this.l0 = null;
            this.E0 = null;
            return;
        }
        this.u0 = null;
        this.l0 = null;
        this.E0 = null;
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void e(ax.rb.b object) throws IOException {
        Object object2 = (s)object;
        ((s)object2).q0 = this.D0;
        boolean bl = (this.B0 & Integer.MIN_VALUE) == Integer.MIN_VALUE;
        ((s)object2).s0 = bl;
        byte[] byArray = F0;
        synchronized (byArray) {
            Throwable throwable2;
            block11: {
                int n8;
                block8: {
                    Z z8;
                    block12: {
                        block9: {
                            int n9;
                            block10: {
                                try {
                                    System.arraycopy(this.q0, 0, byArray, 0, 36);
                                    n8 = ax.qb.b.c(byArray, 2) & 0xFFFF;
                                    if (n8 < 33 || n8 + 4 > this.A0) break block8;
                                    n9 = ax.qb.b.f(byArray, 9);
                                    if (((s)object2).d0 != 46 || n9 != 0 && n9 != -2147483643) break block9;
                                    z8 = (L)object2;
                                    ax.rb.c.k(this.p0, byArray, 36, 27);
                                    ((s)object2).d(byArray, 4);
                                    n9 = ((L)z8).J0 - 59;
                                    if (((s)z8).p0 <= 0 || n9 <= 0 || n9 >= 4) break block10;
                                    ax.rb.c.k(this.p0, byArray, 63, n9);
                                }
                                catch (Throwable throwable2) {
                                    break block11;
                                }
                            }
                            if ((n9 = ((L)z8).I0) > 0) {
                                ax.rb.c.k(this.p0, ((L)z8).F0, ((L)z8).G0, n9);
                            }
                            break block12;
                        }
                        ax.rb.c.k(this.p0, byArray, 36, n8 - 32);
                        ((s)object2).d(byArray, 4);
                        if (object2 instanceof Q) {
                            ((Q)object2).nextElement();
                        }
                    }
                    if ((z8 = this.u0) != null && ((s)object2).i0 == 0) {
                        ((t)z8).d(byArray, 4, (s)object2);
                    }
                    if (ax.qb.e.c0 >= 4) {
                        H0.println(object);
                        if (ax.qb.e.c0 >= 6) {
                            ax.qb.d.a(H0, byArray, 4, n8);
                        }
                    }
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid payload size: ");
                ((StringBuilder)object).append(n8);
                object2 = new IOException(((StringBuilder)object).toString());
                throw object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void f(ax.rb.a a8) throws IOException {
        byte[] byArray = F0;
        synchronized (byArray) {
            Throwable throwable2;
            block7: {
                int n8;
                block5: {
                    try {
                        s s8;
                        a8 = (s)a8;
                        n8 = ((s)a8).e(byArray, 4);
                        ax.qb.b.m(0xFFFF & n8, byArray, 0);
                        if (ax.qb.e.c0 < 4) break block5;
                        do {
                            H0.println(a8);
                            if (!(a8 instanceof b)) break;
                            s8 = ((b)a8).E0;
                            a8 = s8;
                        } while (s8 != null);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    if (ax.qb.e.c0 >= 6) {
                        ax.qb.d.a(H0, F0, 4, n8);
                    }
                }
                this.o0.write(F0, 0, n8 + 4);
                return;
            }
            throw throwable2;
        }
    }

    @Override
    protected void g() throws IOException {
        int n8 = ax.qb.b.c(this.q0, 2) & 0xFFFF;
        if (n8 >= 33 && n8 + 4 <= this.A0) {
            this.p0.skip(n8 - 32);
            return;
        }
        InputStream inputStream = this.p0;
        inputStream.skip(inputStream.available());
    }

    @Override
    protected void i(ax.rb.a a8) throws IOException {
        int n8;
        this.n0 = n8 = this.n0 + 1;
        if (n8 == 32000) {
            this.n0 = 1;
        }
        ((s)a8).n0 = this.n0;
    }

    @Override
    protected ax.rb.a j() throws IOException {
        Object object;
        do {
            if (ax.rb.c.k(this.p0, this.q0, 0, 4) >= 4) continue;
            return null;
        } while ((object = this.q0)[0] == -123);
        if (ax.rb.c.k(this.p0, (byte[])object, 4, 32) < 32) {
            return null;
        }
        if (ax.qb.e.c0 >= 4) {
            object = H0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("New data read: ");
            stringBuilder.append(this);
            ((PrintStream)object).println(stringBuilder.toString());
            ax.qb.d.a(H0, this.q0, 4, 32);
        }
        while (true) {
            if ((object = this.q0)[0] == 0 && object[1] == 0 && object[4] == -1 && object[5] == 83 && object[6] == 77 && object[7] == 66) {
                this.r0.n0 = ax.qb.b.d((byte[])object, 34) & 0xFFFF;
                return this.r0;
            }
            int n8 = 0;
            while (n8 < 35) {
                object = this.q0;
                int n9 = n8 + 1;
                object[n8] = object[n9];
                n8 = n9;
            }
            n8 = this.p0.read();
            if (n8 == -1) {
                return null;
            }
            this.q0[35] = (byte)n8;
        }
    }

    /*
     * Exception decompiling
     */
    void m(s var1_1, s var2_2) throws a0 {
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

    public void n() throws a0 {
        try {
            super.a(Z.Q);
            return;
        }
        catch (ax.rb.d d8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to connect: ");
            stringBuilder.append(this.k0);
            throw new a0(stringBuilder.toString(), (Throwable)d8);
        }
    }

    void o(String string, String[] stringArray) {
        int n8 = stringArray.length - 1;
        int n9 = string.length();
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        while (true) {
            int n13;
            int n14;
            block8: {
                block7: {
                    if (n10 == n8) {
                        stringArray[n8] = string.substring(n12);
                        return;
                    }
                    if (n11 == n9) break block7;
                    n14 = n10;
                    n13 = n12;
                    if (string.charAt(n11) != '\\') break block8;
                }
                stringArray[n10] = string.substring(n12, n11);
                n13 = n11 + 1;
                n14 = n10 + 1;
            }
            if (n11 >= n9) {
                while (n14 < stringArray.length) {
                    stringArray[n14] = "";
                    ++n14;
                }
                return;
            }
            ++n11;
            n10 = n14;
            n12 = n13;
        }
    }

    protected void p(ax.rb.a a8) throws IOException {
        try {
            this.f(a8);
            return;
        }
        catch (IOException iOException) {
            if (ax.qb.e.c0 > 2) {
                iOException.printStackTrace(H0);
            }
            try {
                this.b(true);
            }
            catch (IOException iOException2) {
                iOException2.printStackTrace(H0);
            }
            throw iOException;
        }
    }

    e q(r r8, String string, int n8) throws a0 {
        int n9;
        q0 q02;
        Object object;
        block9: {
            int n10;
            block8: {
                object = this.r(r8).a("IPC$", null);
                q02 = new q0();
                ((l0)object).b(new p0(string), q02);
                n10 = q02.Z0;
                if (n10 == 0) {
                    return null;
                }
                if (n8 == 0) break block8;
                n9 = n8;
                if (n10 >= n8) break block9;
            }
            n9 = n10;
        }
        object = new e();
        String[] stringArray = new String[4];
        long l8 = System.currentTimeMillis();
        long l9 = d.e;
        n8 = 0;
        while (true) {
            ((e)object).j0 = r8.g0;
            ((e)object).e0 = q02.b1[n8].j;
            ((e)object).k0 = l8 + l9 * 1000L;
            if (string.equals("")) {
                ((e)object).f0 = q02.b1[n8].k.substring(1).toLowerCase();
            } else {
                this.o(q02.b1[n8].l, stringArray);
                ((e)object).f0 = stringArray[1];
                ((e)object).g0 = stringArray[2];
                ((e)object).i0 = stringArray[3];
            }
            ((e)object).d0 = q02.Y0;
            if (++n8 == n9) {
                return ((e)object).l0;
            }
            ((e)object).f(new e());
            object = ((e)object).l0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    i0 r(r r8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                long l8;
                long l9;
                Object object;
                Object object2;
                try {
                    object2 = this.v0.listIterator();
                    while (object2.hasNext()) {
                        object = (i0)object2.next();
                        if (!((i0)object).e(r8)) continue;
                        ((i0)object).i = r8;
                        return object;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                int n8 = Z.T;
                if (n8 > 0 && (l9 = this.s0) < (l8 = System.currentTimeMillis())) {
                    this.s0 = (long)n8 + l8;
                    object = this.v0.listIterator();
                    while (object.hasNext()) {
                        object2 = (i0)object.next();
                        if (((i0)object2).j >= l8) continue;
                        ((i0)object2).b(false);
                    }
                }
                object2 = new i0(this.k0, this.m0, this.i0, this.j0, r8);
                ((i0)object2).h = this;
                this.v0.add(object2);
                return object2;
            }
            throw throwable2;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[");
        stringBuilder.append(this.k0);
        stringBuilder.append(":");
        stringBuilder.append(this.m0);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    boolean u(int n8) throws a0 {
        try {
            this.a(Z.Q);
            return (this.B0 & n8) == n8;
        }
        catch (IOException iOException) {
            throw new a0(iOException.getMessage(), (Throwable)iOException);
        }
    }

    boolean v(r r8) {
        r r9;
        return (this.x0 & 4) != 0 && this.u0 == null && r8 != (r9 = r.q0) && !r9.equals(r8);
    }

    boolean w(ax.jb.b object, int n8, InetAddress inetAddress, int n9, String string) {
        int n10;
        String string2 = string;
        if (string == null) {
            string2 = ((ax.jb.b)object).g();
        }
        return ((string = this.E0) == null || string2.equalsIgnoreCase(string)) && ((ax.jb.b)object).equals(this.k0) && (n8 == 0 || n8 == (n10 = this.m0) || n8 == 445 && n10 == 139) && (inetAddress == (object = this.i0) || inetAddress != null && inetAddress.equals(object)) && n9 == this.j0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void y(s var1_1, s var2_7) throws a0 {
        this.n();
        var1_1.j0 |= this.x0;
        var1_1.q0 = this.D0;
        var1_1.z0 = var2_7;
        if (var1_1.y0 == null) {
            var1_1.y0 = this.u0;
        }
        if (var2_7 != null) ** GOTO lbl11
        this.p((ax.rb.a)var1_1);
        return;
lbl11:
        // 1 sources

        if (!(var1_1 instanceof P)) ** GOTO lbl-1000
        var2_7.d0 = var1_1.d0;
        var6_9 = (P)var1_1;
        var5_10 = (Q)var2_7;
        var6_9.a1 = this.z0;
        var5_10.s();
        c.b(var6_9, var5_10);
        var6_9.nextElement();
        if (var6_9.hasMoreElements()) {
            var7_11 = new v();
            super.l(var6_9, var7_11, Z.Q);
            if (var7_11.i0 != 0) {
                this.m(var6_9, var7_11);
            }
            var6_9.nextElement();
        } else {
            this.i(var6_9);
        }
        ** synchronized (this)
lbl-1000:
        // 1 sources

        {
            block23: {
                var2_7.r0 = false;
                var5_10.c0 = false;
                this.f0.put(var6_9, var5_10);
                do {
                    this.p(var6_9);
                } while (var6_9.hasMoreElements() && var6_9.nextElement() != null);
                var3_12 = Z.Q;
                var5_10.q = System.currentTimeMillis() + var3_12;
                while (var5_10.hasMoreElements()) {
                    this.wait(var3_12);
                    var3_12 = var5_10.q - System.currentTimeMillis();
                    if (var3_12 > 0L) continue;
                    var1_1 = new StringBuilder();
                    var1_1.append(this);
                    var1_1.append(" timedout waiting for response to ");
                    var1_1.append(var6_9);
                    var2_7 = new ax.rb.d(var1_1.toString());
                    throw var2_7;
                }
                if (var2_7.i0 == 0) break block23;
                this.m(var6_9, var5_10);
            }
            this.f0.remove(var6_9);
        }
        c.c(var6_9.b1);
        c.c(var5_10.U0);
        ** GOTO lbl67
lbl-1000:
        // 1 sources

        {
            var2_7.d0 = var1_1.d0;
            super.l((ax.rb.a)var1_1, (ax.rb.b)var2_7, Z.Q);
lbl67:
            // 2 sources

            this.m((s)var1_1, (s)var2_7);
            return;
            catch (IOException var1_2) {
                throw new a0(var1_2.getMessage(), (Throwable)var1_2);
            }
            catch (a0 var1_3) {
                throw var1_3;
            }
            catch (Throwable var1_4) {}
            c.c(var6_9.b1);
            c.c(var5_10.U0);
            throw var1_4;
        }
        {
            block24: {
                catch (Throwable var1_5) {
                    break block24;
                }
                catch (InterruptedException var2_8) {}
                var1_1 = new ax.rb.d(var2_8);
                throw var1_1;
            }
            try {
                this.f0.remove(var6_9);
                throw var1_5;
            }
            catch (Throwable var1_6) {}
            {
                throw var1_6;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void z() throws IOException {
        block6: {
            block7: {
                Object object;
                Object object2;
                block8: {
                    block9: {
                        object2 = new ax.nb.b(this.k0.a(), 32, null);
                        do {
                            object = new Socket();
                            this.l0 = object;
                            if (this.i0 != null) {
                                ((Socket)object).bind(new InetSocketAddress(this.i0, this.j0));
                            }
                            this.l0.connect(new InetSocketAddress(this.k0.f(), 139), Z.U);
                            this.l0.setSoTimeout(Z.T);
                            this.o0 = this.l0.getOutputStream();
                            this.p0 = this.l0.getInputStream();
                            k k8 = new k((ax.nb.b)object2, g.u());
                            object = this.o0;
                            byte[] byArray = this.q0;
                            ((OutputStream)object).write(byArray, 0, k8.d(byArray, 0));
                            if (ax.rb.c.k(this.p0, this.q0, 0, 4) < 4) break block6;
                            int n8 = this.q0[0] & 0xFF;
                            if (n8 == -1) break block7;
                            if (n8 == 130) break block8;
                            if (n8 != 131) break block9;
                            n8 = this.p0.read() & 0xFF;
                            if (n8 != 128 && n8 != 130) {
                                this.b(true);
                                throw new h(2, n8);
                            }
                            this.l0.close();
                            ((ax.nb.b)object2).a = object = this.k0.k();
                        } while (object != null);
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Failed to establish session with ");
                        ((StringBuilder)object2).append(this.k0);
                        throw new IOException(((StringBuilder)object2).toString());
                    }
                    this.b(true);
                    throw new h(2, 0);
                }
                if (ax.qb.e.c0 < 4) return;
                object = H0;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("session established ok with ");
                ((StringBuilder)object2).append(this.k0);
                ((PrintStream)object).println(((StringBuilder)object2).toString());
                return;
            }
            this.b(true);
            throw new h(2, -1);
        }
        try {
            this.l0.close();
        }
        catch (IOException iOException) {
            throw new a0("EOF during NetBIOS session request");
        }
        throw new a0("EOF during NetBIOS session request");
    }

    class a {
        int a;
        int b;
        int c;
        int d;
        String e;
        int f;
        int g;
        boolean h;
        boolean i;
        boolean j;
        int k;
        int l;
        long m;
        int n;
        int o;
        byte[] p;
        byte[] q;
        final k0 r;

        a(k0 k02) {
            this.r = k02;
        }
    }
}

