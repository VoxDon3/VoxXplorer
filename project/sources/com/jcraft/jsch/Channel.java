package com.jcraft.jsch;

import ax.d5.C1940a;
import ax.d5.C1941b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public abstract class Channel {
    static int u;
    private static Vector<Channel> v = new Vector<>();
    int a;
    protected Session s;
    volatile int b = -1;
    protected byte[] c = Util.v("foo");
    volatile int d = 1048576;
    volatile int e = this.d;
    volatile int f = Http2.INITIAL_MAX_FRAME_SIZE;
    volatile long g = 0;
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
    int t = 0;

    static class PassiveInputStream extends MyPipedInputStream {
        C1941b l0;

        PassiveInputStream(C1941b c1941b, int i) throws IOException {
            super(c1941b, i);
            this.l0 = c1941b;
        }

        @Override // ax.d5.C1940a, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1941b c1941b = this.l0;
            if (c1941b != null) {
                c1941b.close();
            }
            this.l0 = null;
        }
    }

    Channel() {
        synchronized (v) {
            int i = u;
            u = i + 1;
            this.a = i;
            v.addElement(this);
        }
    }

    static void e(Channel channel) {
        synchronized (v) {
            v.removeElement(channel);
        }
    }

    static void g(Session session) {
        Channel[] channelArr;
        int i;
        int i2;
        synchronized (v) {
            channelArr = new Channel[v.size()];
            i2 = 0;
            for (int i3 = 0; i3 < v.size(); i3++) {
                try {
                    Channel elementAt = v.elementAt(i3);
                    if (elementAt.s == session) {
                        int i4 = i2 + 1;
                        try {
                            channelArr[i2] = elementAt;
                        } catch (Exception unused) {
                        }
                        i2 = i4;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        for (i = 0; i < i2; i++) {
            channelArr[i].f();
        }
    }

    static Channel k(int i, Session session) {
        synchronized (v) {
            for (int i2 = 0; i2 < v.size(); i2++) {
                try {
                    Channel elementAt = v.elementAt(i2);
                    if (elementAt.a == i && elementAt.s == session) {
                        return elementAt;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    static Channel l(String str, Session session) {
        ChannelSession channelSession = str.equals("session") ? new ChannelSession() : null;
        if (str.equals("shell")) {
            channelSession = new ChannelShell();
        }
        ChannelSession channelSession2 = channelSession;
        if (str.equals("exec")) {
            channelSession2 = new ChannelExec();
        }
        Channel channel = channelSession2;
        if (str.equals("x11")) {
            channel = new ChannelX11();
        }
        Channel channel2 = channel;
        if (str.equals("auth-agent@openssh.com")) {
            channel2 = new ChannelAgentForwarding();
        }
        Channel channel3 = channel2;
        if (str.equals("direct-tcpip")) {
            channel3 = new ChannelDirectTCPIP();
        }
        Channel channel4 = channel3;
        if (str.equals("forwarded-tcpip")) {
            channel4 = new ChannelForwardedTCPIP();
        }
        Channel channel5 = channel4;
        if (str.equals("sftp")) {
            ChannelSftp channelSftp = new ChannelSftp();
            channelSftp.a1(session.w("use_sftp_write_flush_workaround").equals("yes"));
            channel5 = channelSftp;
        }
        Channel channel6 = channel5;
        if (str.equals("subsystem")) {
            channel6 = new ChannelSubsystem();
        }
        Channel channel7 = channel6;
        if (str.equals("direct-streamlocal@openssh.com")) {
            channel7 = new ChannelDirectStreamLocal();
        }
        if (channel7 == null) {
            return null;
        }
        channel7.C(session);
        return channel7;
    }

    void A(int i) {
        this.h = i;
    }

    synchronized void B(long j) {
        this.g = j;
    }

    void C(Session session) {
        this.s = session;
    }

    public void D() throws JSchException {
    }

    void E(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.i.f(bArr, i, i2);
        } catch (NullPointerException unused) {
        }
    }

    void F(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.i.g(bArr, i, i2);
        } catch (NullPointerException unused) {
        }
    }

    synchronized void a(long j) {
        this.g += j;
        if (this.t > 0) {
            notifyAll();
        }
    }

    void b() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.l = true;
        this.k = true;
        int o = o();
        if (o == -1) {
            return;
        }
        try {
            Buffer buffer = new Buffer(100);
            Packet packet = new Packet(buffer);
            packet.c();
            buffer.s((byte) 97);
            buffer.v(o);
            synchronized (this) {
                p().m0(packet);
            }
        } catch (Exception unused) {
        }
    }

    public void c() throws JSchException {
        d(0);
    }

    public void d(int i) throws JSchException {
        this.r = i;
        try {
            u();
            D();
        } catch (Exception e) {
            this.n = false;
            f();
            if (!(e instanceof JSchException)) {
                throw new JSchException(e.toString(), e);
            }
            throw ((JSchException) e);
        }
    }

    public void f() {
        try {
            synchronized (this) {
                if (this.n) {
                    this.n = false;
                    b();
                    this.k = true;
                    this.l = true;
                    this.j = null;
                    try {
                        IO io = this.i;
                        if (io != null) {
                            io.a();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } finally {
            e(this);
        }
    }

    void h() {
        if (this.k) {
            return;
        }
        this.k = true;
        int o = o();
        if (o == -1) {
            return;
        }
        try {
            Buffer buffer = new Buffer(100);
            Packet packet = new Packet(buffer);
            packet.c();
            buffer.s((byte) 96);
            buffer.v(o);
            synchronized (this) {
                try {
                    if (!this.m) {
                        p().m0(packet);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    void i() {
        this.l = true;
        try {
            this.i.d();
        } catch (NullPointerException unused) {
        }
    }

    protected Packet j() {
        Buffer buffer = new Buffer(200);
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte) 90);
        buffer.y(this.c);
        buffer.v(this.a);
        buffer.v(this.e);
        buffer.v(this.f);
        return packet;
    }

    void m(Buffer buffer) {
        z(buffer.i());
        B(buffer.r());
        A(buffer.i());
    }

    public InputStream n() throws IOException {
        int i;
        Session session = this.s;
        if (session != null && s() && session.A().isEnabled(2)) {
            session.A().a(2, "getInputStream() should be called before connect()");
        }
        try {
            i = Integer.parseInt(p().w("max_input_buffer_size"));
        } catch (Exception unused) {
            i = 32768;
        }
        MyPipedInputStream myPipedInputStream = new MyPipedInputStream(32768, i);
        this.i.k(new PassiveOutputStream(myPipedInputStream, 32768 < i), false);
        return myPipedInputStream;
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

    protected void u() throws Exception {
        Session p = p();
        if (!p.J()) {
            throw new JSchException("session is down");
        }
        p.m0(j());
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.r;
        int i = j != 0 ? 1 : 2000;
        synchronized (this) {
            while (o() == -1 && p.J() && i > 0) {
                if (j <= 0 || System.currentTimeMillis() - currentTimeMillis <= j) {
                    long j2 = j == 0 ? 10L : j;
                    try {
                        this.t = 1;
                        wait(j2);
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        this.t = 0;
                        throw th;
                    }
                    this.t = 0;
                    i--;
                } else {
                    i = 0;
                }
            }
        }
        if (!p.J()) {
            throw new JSchException("session is down");
        }
        if (o() == -1) {
            throw new JSchException("channel is not opened.");
        }
        if (!this.o) {
            throw new JSchException("channel is not opened.");
        }
        this.n = true;
    }

    protected void v() throws Exception {
        Buffer buffer = new Buffer(200);
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte) 91);
        buffer.v(o());
        buffer.v(this.a);
        buffer.v(this.e);
        buffer.v(this.f);
        p().m0(packet);
    }

    protected void w(int i) {
        try {
            Buffer buffer = new Buffer(200);
            Packet packet = new Packet(buffer);
            packet.c();
            buffer.s((byte) 92);
            buffer.v(o());
            buffer.v(i);
            buffer.y(Util.v("open failed"));
            buffer.y(Util.c);
            p().m0(packet);
        } catch (Exception unused) {
        }
    }

    void x(int i) {
        this.p = i;
    }

    void y(int i) {
        this.e = i;
    }

    synchronized void z(int i) {
        this.b = i;
        if (this.t > 0) {
            notifyAll();
        }
    }

    /* renamed from: com.jcraft.jsch.Channel$1, reason: invalid class name */
    class AnonymousClass1 extends OutputStream implements AutoCloseable {
        private Buffer c0;
        private Packet d0;
        private boolean e0;
        byte[] f0;
        final /* synthetic */ Channel g0;
        final /* synthetic */ Channel h0;
        private int q;

        private synchronized void a() throws IOException {
            this.c0 = new Buffer(this.h0.h);
            this.d0 = new Packet(this.c0);
            try {
                if ((this.c0.b.length - 14) - this.h0.p().v() <= 0) {
                    this.c0 = null;
                    this.d0 = null;
                    throw new IOException("failed to initialize the channel.");
                }
            } catch (JSchException e) {
                throw new IOException("failed to initialize the channel.", e);
            }
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.d0 == null) {
                try {
                    a();
                } catch (IOException unused) {
                    return;
                }
            }
            if (this.e0) {
                return;
            }
            if (this.q > 0) {
                flush();
            }
            this.g0.h();
            this.e0 = true;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            if (this.e0) {
                throw new IOException("Already closed");
            }
            if (this.q == 0) {
                return;
            }
            this.d0.c();
            this.c0.s((byte) 94);
            this.c0.v(this.h0.b);
            this.c0.v(this.q);
            this.c0.E(this.q);
            try {
                int i = this.q;
                this.q = 0;
                synchronized (this.g0) {
                    try {
                        if (!this.g0.m) {
                            this.h0.p().n0(this.d0, this.g0, i);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                close();
                throw new IOException(e.toString(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            byte[] bArr = this.f0;
            bArr[0] = (byte) i;
            write(bArr, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.d0 == null) {
                a();
            }
            if (!this.e0) {
                byte[] bArr2 = this.c0.b;
                int length = bArr2.length;
                while (i2 > 0) {
                    try {
                        int v = this.h0.p().v();
                        int i3 = this.q;
                        int i4 = i2 > (length - (i3 + 14)) - v ? (length - (i3 + 14)) - v : i2;
                        if (i4 <= 0) {
                            flush();
                        } else {
                            System.arraycopy(bArr, i, bArr2, i3 + 14, i4);
                            this.q += i4;
                            i += i4;
                            i2 -= i4;
                        }
                    } catch (JSchException e) {
                        throw new IOException(e.toString(), e);
                    }
                }
                return;
            }
            throw new IOException("Already closed");
        }
    }

    static class MyPipedInputStream extends C1940a {
        private int j0;
        private int k0;

        MyPipedInputStream() throws IOException {
            this.j0 = 1024;
            this.k0 = 1024;
        }

        private int o() {
            int i = this.i0;
            int i2 = this.h0;
            if (i < i2) {
                return this.g0.length - i2;
            }
            if (i2 < i) {
                return i2 == -1 ? this.g0.length : i - i2;
            }
            return 0;
        }

        synchronized void m(int i) throws IOException {
            int i2;
            try {
                int o = o();
                if (o < i) {
                    byte[] bArr = this.g0;
                    int length = bArr.length - o;
                    int length2 = bArr.length;
                    while (length2 - length < i) {
                        length2 *= 2;
                    }
                    int i3 = this.k0;
                    if (length2 > i3) {
                        length2 = i3;
                    }
                    if (length2 - length < i) {
                        return;
                    }
                    byte[] bArr2 = new byte[length2];
                    int i4 = this.i0;
                    int i5 = this.h0;
                    if (i4 < i5) {
                        byte[] bArr3 = this.g0;
                        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                    } else if (i5 < i4) {
                        if (i5 != -1) {
                            System.arraycopy(this.g0, 0, bArr2, 0, i5);
                            byte[] bArr4 = this.g0;
                            int i6 = this.i0;
                            System.arraycopy(bArr4, i6, bArr2, length2 - (bArr4.length - i6), bArr4.length - i6);
                            this.i0 = length2 - (this.g0.length - this.i0);
                        }
                    } else if (i5 == i4) {
                        byte[] bArr5 = this.g0;
                        System.arraycopy(bArr5, 0, bArr2, 0, bArr5.length);
                        this.h0 = this.g0.length;
                    }
                    this.g0 = bArr2;
                } else if (this.g0.length == o && o > (i2 = this.j0)) {
                    int i7 = o / 2;
                    if (i7 >= i2) {
                        i2 = i7;
                    }
                    this.g0 = new byte[i2];
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void p() throws IOException {
            if (available() != 0) {
                return;
            }
            this.i0 = 0;
            byte[] bArr = this.g0;
            this.h0 = 1;
            bArr[0] = 0;
            read();
        }

        MyPipedInputStream(int i) throws IOException {
            this.j0 = 1024;
            this.k0 = 1024;
            this.g0 = new byte[i];
            this.j0 = i;
            this.k0 = i;
        }

        MyPipedInputStream(int i, int i2) throws IOException {
            this(i);
            this.k0 = i2;
        }

        MyPipedInputStream(C1941b c1941b, int i) throws IOException {
            super(c1941b);
            this.j0 = 1024;
            this.k0 = 1024;
            this.g0 = new byte[i];
            this.j0 = i;
        }
    }

    static class PassiveOutputStream extends C1941b {
        private MyPipedInputStream c0;

        PassiveOutputStream(C1940a c1940a, boolean z) throws IOException {
            super(c1940a);
            this.c0 = null;
            if (z && (c1940a instanceof MyPipedInputStream)) {
                this.c0 = (MyPipedInputStream) c1940a;
            }
        }

        @Override // ax.d5.C1941b, java.io.OutputStream
        public void write(int i) throws IOException {
            MyPipedInputStream myPipedInputStream = this.c0;
            if (myPipedInputStream != null) {
                myPipedInputStream.m(1);
            }
            super.write(i);
        }

        @Override // ax.d5.C1941b, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            MyPipedInputStream myPipedInputStream = this.c0;
            if (myPipedInputStream != null) {
                myPipedInputStream.m(i2);
            }
            super.write(bArr, i, i2);
        }
    }
}
