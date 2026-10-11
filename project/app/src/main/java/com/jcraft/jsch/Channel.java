/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import ax.d5.a;
import ax.d5.b;
import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.ChannelAgentForwarding;
import com.jcraft.jsch.ChannelDirectStreamLocal;
import com.jcraft.jsch.ChannelDirectTCPIP;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelForwardedTCPIP;
import com.jcraft.jsch.ChannelSession;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelShell;
import com.jcraft.jsch.ChannelSubsystem;
import com.jcraft.jsch.ChannelX11;
import com.jcraft.jsch.IO;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.Util;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public abstract class Channel {
    static int u;
    private static Vector<Channel> v;
    int a;
    volatile int b = -1;
    protected byte[] c = Util.v("foo");
    volatile int d;
    volatile int e = this.d = 0x100000;
    volatile int f = 16384;
    volatile long g = 0L;
    volatile int h = 0;
    IO i = null;
    Thread j = null;
    volatile boolean k = false;
    volatile boolean l = false;
    volatile boolean m = false;
    volatile boolean n = false;
    volatile boolean o = false;
    volatile int p = -1;
    volatile int q = 0;
    volatile int r = 0;
    protected Session s;
    int t = 0;

    static {
        v = new Vector();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Channel() {
        Vector<Channel> vector = v;
        synchronized (vector) {
            int n8 = u;
            u = n8 + 1;
            this.a = n8;
            v.addElement(this);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void e(Channel channel) {
        Vector<Channel> vector = v;
        synchronized (vector) {
            v.removeElement(channel);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void g(Session session) {
        Vector<Channel> vector = v;
        synchronized (vector) {
            try {
                Channel[] channelArray = new Channel[v.size()];
                int n8 = 0;
                int n9 = 0;
                int n10 = 0;
                while (true) {
                    int n11;
                    if (n9 < (n11 = v.size())) {
                        Channel channel = v.elementAt(n9);
                        Session session2 = channel.s;
                        n11 = n10;
                        if (session2 == session) {
                            channelArray[n10] = channel;
                            n11 = n10 + 1;
                        }
                    }
                    // MONITOREXIT @DISABLED, blocks:[0, 4, 7] lbl19 : MonitorExitStatement: MONITOREXIT : var5_2
                    n9 = n8;
                    while (true) {
                        if (n9 >= n10) {
                            return;
                        }
                        channelArray[n9].f();
                        ++n9;
                    }
                    catch (Exception exception) {
                        n11 = n10;
                    }
                    ++n9;
                    n10 = n11;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Channel k(int n8, Session session) {
        Vector<Channel> vector = v;
        synchronized (vector) {
            Throwable throwable2;
            block6: {
                int n9 = 0;
                while (true) {
                    try {
                        if (n9 >= v.size()) break;
                        Channel channel = v.elementAt(n9);
                        if (channel.a == n8 && channel.s == session) {
                            return channel;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    ++n9;
                }
                return null;
            }
            throw throwable2;
        }
    }

    static Channel l(String string, Session session) {
        Channel channel = string.equals("session") ? new ChannelSession() : null;
        if (string.equals("shell")) {
            channel = new ChannelShell();
        }
        if (string.equals("exec")) {
            channel = new ChannelExec();
        }
        if (string.equals("x11")) {
            channel = new ChannelX11();
        }
        if (string.equals("auth-agent@openssh.com")) {
            channel = new ChannelAgentForwarding();
        }
        if (string.equals("direct-tcpip")) {
            channel = new ChannelDirectTCPIP();
        }
        if (string.equals("forwarded-tcpip")) {
            channel = new ChannelForwardedTCPIP();
        }
        if (string.equals("sftp")) {
            channel = new ChannelSftp();
            ((ChannelSftp)channel).a1(session.w("use_sftp_write_flush_workaround").equals("yes"));
        }
        if (string.equals("subsystem")) {
            channel = new ChannelSubsystem();
        }
        if (string.equals("direct-streamlocal@openssh.com")) {
            channel = new ChannelDirectStreamLocal();
        }
        if (channel == null) {
            return null;
        }
        channel.C(session);
        return channel;
    }

    void A(int n8) {
        this.h = n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void B(long l8) {
        synchronized (this) {
            this.g = l8;
            return;
        }
    }

    void C(Session session) {
        this.s = session;
    }

    public void D() throws JSchException {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void E(byte[] byArray, int n8, int n9) throws IOException {
        try {
            this.i.f(byArray, n8, n9);
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void F(byte[] byArray, int n8, int n9) throws IOException {
        try {
            this.i.g(byArray, n8, n9);
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a(long l8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.g += l8;
                        if (this.t <= 0) break block4;
                        this.notifyAll();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void b() {
        Packet packet;
        if (this.m) {
            return;
        }
        this.m = true;
        this.l = true;
        this.k = true;
        int n8 = this.o();
        if (n8 == -1) {
            return;
        }
        try {
            Buffer buffer = new Buffer(100);
            packet = new Packet(buffer);
            packet.c();
            buffer.s((byte)97);
            buffer.v(n8);
            synchronized (this) {
            }
        }
        catch (Exception exception) {
            return;
        }
        {
            this.p().m0(packet);
            return;
        }
    }

    public void c() throws JSchException {
        this.d(0);
    }

    public void d(int n8) throws JSchException {
        this.r = n8;
        try {
            this.u();
            this.D();
            return;
        }
        catch (Exception exception) {
            this.n = false;
            this.f();
            if (exception instanceof JSchException) {
                throw (JSchException)exception;
            }
            throw new JSchException(((Object)exception).toString(), exception);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void f() {
        block13: {
            Throwable throwable32;
            Throwable throwable222;
            block14: {
                block12: {
                    try {
                        if (this.n) break block12;
                        // MONITOREXIT : this
                    }
                    catch (Throwable throwable222) {}
                    Channel.e(this);
                    return;
                }
                this.n = false;
                // MONITOREXIT : this
                break block14;
                try {
                    this.b();
                    this.k = true;
                    this.l = true;
                    this.j = null;
                    IO iO = this.i;
                    if (iO != null) {
                        iO.a();
                    }
                    break block13;
                }
                catch (Throwable throwable32) {}
            }
            throw throwable222;
            Channel.e(this);
            throw throwable32;
            catch (Exception exception) {}
        }
        Channel.e(this);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void h() {
        Packet packet;
        if (this.k) {
            return;
        }
        this.k = true;
        int n8 = this.o();
        if (n8 == -1) {
            return;
        }
        try {
            Buffer buffer = new Buffer(100);
            packet = new Packet(buffer);
            packet.c();
            buffer.s((byte)96);
            buffer.v(n8);
            synchronized (this) {
            }
        }
        catch (Exception exception) {
            return;
        }
        {
            try {
                if (this.m) return;
                this.p().m0(packet);
                return;
            }
            catch (Throwable throwable) {}
            {
                throw throwable;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void i() {
        this.l = true;
        try {
            this.i.d();
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    protected Packet j() {
        Buffer buffer = new Buffer(200);
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte)90);
        buffer.y(this.c);
        buffer.v(this.a);
        buffer.v(this.e);
        buffer.v(this.f);
        return packet;
    }

    void m(Buffer buffer) {
        this.z(buffer.i());
        this.B(buffer.r());
        this.A(buffer.i());
    }

    public InputStream n() throws IOException {
        int n8;
        Object object = this.s;
        if (object != null && this.s() && ((Session)object).A().isEnabled(2)) {
            ((Session)object).A().a(2, "getInputStream() should be called before connect()");
        }
        try {
            n8 = Integer.parseInt(this.p().w("max_input_buffer_size"));
        }
        catch (Exception exception) {
            n8 = 32768;
        }
        object = new MyPipedInputStream(32768, n8);
        boolean bl = 32768 < n8;
        this.i.k(new PassiveOutputStream((a)object, bl), false);
        return object;
    }

    int o() {
        return this.b;
    }

    public Session p() throws JSchException {
        Session session = this.s;
        if (session != null) {
            return session;
        }
        throw new JSchException("session is not available");
    }

    void q() throws JSchException {
    }

    public boolean r() {
        return this.m;
    }

    public boolean s() {
        Session session = this.s;
        return session != null && session.J() && this.n;
    }

    abstract void t();

    /*
     * Exception decompiling
     */
    protected void u() throws Exception {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [4 : 127->135)] java.lang.Throwable
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

    protected void v() throws Exception {
        Buffer buffer = new Buffer(200);
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte)91);
        buffer.v(this.o());
        buffer.v(this.a);
        buffer.v(this.e);
        buffer.v(this.f);
        this.p().m0(packet);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void w(int n8) {
        try {
            Buffer buffer = new Buffer(200);
            Packet packet = new Packet(buffer);
            packet.c();
            buffer.s((byte)92);
            buffer.v(this.o());
            buffer.v(n8);
            buffer.y(Util.v("open failed"));
            buffer.y(Util.c);
            this.p().m0(packet);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    void x(int n8) {
        this.p = n8;
    }

    void y(int n8) {
        this.e = n8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void z(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.b = n8;
                        if (this.t <= 0) break block4;
                        this.notifyAll();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    static class MyPipedInputStream
    extends a {
        private int j0 = 1024;
        private int k0 = 1024;

        MyPipedInputStream() throws IOException {
        }

        MyPipedInputStream(int n8) throws IOException {
            this.g0 = new byte[n8];
            this.j0 = n8;
            this.k0 = n8;
        }

        MyPipedInputStream(int n8, int n9) throws IOException {
            this(n8);
            this.k0 = n9;
        }

        MyPipedInputStream(b b8, int n8) throws IOException {
            super(b8);
            this.g0 = new byte[n8];
            this.j0 = n8;
        }

        private int o() {
            int n8 = this.i0;
            int n9 = this.h0;
            if (n8 < n9) {
                return this.g0.length - n9;
            }
            if (n9 < n8) {
                if (n9 == -1) {
                    return this.g0.length;
                }
                return n8 - n9;
            }
            return 0;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void m(int n8) throws IOException {
            synchronized (this) {
                Throwable throwable2;
                block16: {
                    block18: {
                        int n9;
                        block15: {
                            int n10;
                            byte[] byArray;
                            block17: {
                                int n11;
                                try {
                                    n9 = this.o();
                                    if (n9 >= n8) break block15;
                                    byArray = this.g0;
                                    n11 = byArray.length - n9;
                                    n9 = byArray.length;
                                }
                                catch (Throwable throwable2) {
                                    break block16;
                                }
                                while (n9 - n11 < n8) {
                                    n9 *= 2;
                                }
                                {
                                    int n12 = this.k0;
                                    n10 = n9;
                                    if (n9 > n12) {
                                        n10 = n12;
                                    }
                                    if (n10 - n11 >= n8) break block17;
                                }
                                return;
                            }
                            byArray = new byte[n10];
                            n9 = this.i0;
                            n8 = this.h0;
                            if (n9 < n8) {
                                byte[] byArray2 = this.g0;
                                System.arraycopy(byArray2, 0, byArray, 0, byArray2.length);
                            } else if (n8 < n9) {
                                if (n8 != -1) {
                                    System.arraycopy(this.g0, 0, byArray, 0, n8);
                                    byte[] byArray3 = this.g0;
                                    n8 = this.i0;
                                    System.arraycopy(byArray3, n8, byArray, n10 - (byArray3.length - n8), byArray3.length - n8);
                                    this.i0 = n10 - (this.g0.length - this.i0);
                                }
                            } else if (n8 == n9) {
                                byte[] byArray4 = this.g0;
                                System.arraycopy(byArray4, 0, byArray, 0, byArray4.length);
                                this.h0 = this.g0.length;
                            }
                            this.g0 = byArray;
                            break block18;
                        }
                        if (this.g0.length == n9 && n9 > (n8 = this.j0)) {
                            if ((n9 /= 2) >= n8) {
                                n8 = n9;
                            }
                            this.g0 = new byte[n8];
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void p() throws IOException {
            synchronized (this) {
                int n8 = this.available();
                if (n8 != 0) {
                    return;
                }
                this.i0 = 0;
                byte[] byArray = this.g0;
                this.h0 = 1;
                byArray[0] = 0;
                this.read();
                return;
            }
        }
    }

    static class PassiveInputStream
    extends MyPipedInputStream {
        b l0;

        PassiveInputStream(b b8, int n8) throws IOException {
            super(b8, n8);
            this.l0 = b8;
        }

        @Override
        public void close() throws IOException {
            b b8 = this.l0;
            if (b8 != null) {
                b8.close();
            }
            this.l0 = null;
        }
    }

    static class PassiveOutputStream
    extends b {
        private MyPipedInputStream c0 = null;

        PassiveOutputStream(a a8, boolean bl) throws IOException {
            super(a8);
            if (bl && a8 instanceof MyPipedInputStream) {
                this.c0 = (MyPipedInputStream)a8;
            }
        }

        @Override
        public void write(int n8) throws IOException {
            MyPipedInputStream myPipedInputStream = this.c0;
            if (myPipedInputStream != null) {
                myPipedInputStream.m(1);
            }
            super.write(n8);
        }

        @Override
        public void write(byte[] byArray, int n8, int n9) throws IOException {
            MyPipedInputStream myPipedInputStream = this.c0;
            if (myPipedInputStream != null) {
                myPipedInputStream.m(n9);
            }
            super.write(byArray, n8, n9);
        }
    }
}

