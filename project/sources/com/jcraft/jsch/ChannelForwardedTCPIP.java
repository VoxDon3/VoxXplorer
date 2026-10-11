package com.jcraft.jsch;

import ax.d5.C1941b;
import com.jcraft.jsch.Channel;
import java.io.InputStream;
import java.net.Socket;
import java.util.Vector;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public class ChannelForwardedTCPIP extends Channel {
    private static Vector<Config> z = new Vector<>();
    private Socket w = null;
    private ForwardedTCPIPDaemon x = null;
    private Config y = null;

    static abstract class Config {
        Session a;
        int b;
        int c;
        String d;
        String e;

        Config() {
        }
    }

    static class ConfigDaemon extends Config {
        Object[] f;

        ConfigDaemon() {
        }
    }

    static class ConfigLHost extends Config {
        int f;
        SocketFactory g;

        ConfigLHost() {
        }
    }

    ChannelForwardedTCPIP() {
        this.d = 131072;
        this.e = 131072;
        this.f = Http2.INITIAL_MAX_FRAME_SIZE;
        this.i = new IO();
        this.n = true;
    }

    static void G(Session session, String str, int i, int i2, String str2, int i3, SocketFactory socketFactory) throws JSchException {
        String L = L(str);
        synchronized (z) {
            try {
                if (K(session, L, i) != null) {
                    throw new JSchException("PortForwardingR: remote port " + i + " is already registered.");
                }
                ConfigLHost configLHost = new ConfigLHost();
                configLHost.a = session;
                configLHost.b = i;
                configLHost.c = i2;
                configLHost.e = str2;
                configLHost.f = i3;
                configLHost.d = L;
                configLHost.g = socketFactory;
                z.addElement(configLHost);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void H(Session session) {
        int[] iArr;
        int i;
        int i2;
        synchronized (z) {
            try {
                iArr = new int[z.size()];
                i2 = 0;
                for (int i3 = 0; i3 < z.size(); i3++) {
                    Config elementAt = z.elementAt(i3);
                    if (elementAt.a == session) {
                        iArr[i2] = elementAt.b;
                        i2++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (i = 0; i < i2; i++) {
            I(session, iArr[i]);
        }
    }

    static void I(Session session, int i) {
        J(session, null, i);
    }

    static void J(Session session, String str, int i) {
        synchronized (z) {
            try {
                Config K = K(session, L(str), i);
                if (K == null) {
                    K = K(session, null, i);
                }
                if (K == null) {
                    return;
                }
                z.removeElement(K);
                if (str == null) {
                    str = K.d;
                }
                if (str == null) {
                    str = "0.0.0.0";
                }
                Buffer buffer = new Buffer(200);
                Packet packet = new Packet(buffer);
                try {
                    packet.c();
                    buffer.s((byte) 80);
                    buffer.y(Util.v("cancel-tcpip-forward"));
                    buffer.s((byte) 0);
                    buffer.y(Util.v(str));
                    buffer.v(i);
                    session.m0(packet);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Config K(Session session, String str, int i) {
        int i2;
        synchronized (z) {
            for (int i3 = 0; i3 < z.size(); i3++) {
                try {
                    Config elementAt = z.elementAt(i3);
                    if (elementAt.a == session && (((i2 = elementAt.b) == i || (i2 == 0 && elementAt.c == i)) && (str == null || elementAt.d.equals(str)))) {
                        return elementAt;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    static String L(String str) {
        return str == null ? "localhost" : (str.length() == 0 || str.equals("*")) ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    @Override // com.jcraft.jsch.Channel
    void m(Buffer buffer) {
        Session session;
        z(buffer.i());
        B(buffer.r());
        A(buffer.i());
        byte[] p = buffer.p();
        int i = buffer.i();
        buffer.p();
        buffer.i();
        try {
            session = p();
        } catch (JSchException unused) {
            session = null;
        }
        Config K = K(session, Util.c(p), i);
        this.y = K;
        if (K == null) {
            this.y = K(session, null, i);
        }
        if (this.y == null && session.A().isEnabled(3)) {
            session.A().a(3, "ChannelForwardedTCPIP: " + Util.c(p) + ":" + i + " is not registered.");
        }
    }

    @Override // com.jcraft.jsch.Channel
    public void t() {
        IO io;
        InputStream inputStream;
        try {
            Config config = this.y;
            if (config instanceof ConfigDaemon) {
                ConfigDaemon configDaemon = (ConfigDaemon) config;
                this.x = (ForwardedTCPIPDaemon) Class.forName(configDaemon.e).asSubclass(ForwardedTCPIPDaemon.class).getDeclaredConstructor(null).newInstance(null);
                C1941b c1941b = new C1941b();
                this.i.i(new Channel.PassiveInputStream(c1941b, 32768), false);
                this.x.G0(this, n(), c1941b);
                this.x.C0(configDaemon.f);
                new Thread(this.x).start();
            } else {
                ConfigLHost configLHost = (ConfigLHost) config;
                SocketFactory socketFactory = configLHost.g;
                Socket i = socketFactory == null ? Util.i(configLHost.e, configLHost.f, 10000) : socketFactory.c(configLHost.e, configLHost.f);
                this.w = i;
                i.setTcpNoDelay(true);
                this.i.h(this.w.getInputStream());
                this.i.j(this.w.getOutputStream());
            }
            v();
            this.j = Thread.currentThread();
            Buffer buffer = new Buffer(this.h);
            Packet packet = new Packet(buffer);
            try {
                Session p = p();
                while (true) {
                    if (this.j == null || (io = this.i) == null || (inputStream = io.a) == null) {
                        break;
                    }
                    byte[] bArr = buffer.b;
                    int read = inputStream.read(bArr, 14, (bArr.length - 14) - p.v());
                    if (read <= 0) {
                        h();
                        break;
                    }
                    packet.c();
                    buffer.s((byte) 94);
                    buffer.v(this.b);
                    buffer.v(read);
                    buffer.E(read);
                    synchronized (this) {
                        try {
                            if (this.m) {
                                break;
                            } else {
                                p.n0(packet, this, read);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Exception unused) {
            }
            f();
        } catch (Exception unused2) {
            w(1);
            this.m = true;
            f();
        }
    }
}
