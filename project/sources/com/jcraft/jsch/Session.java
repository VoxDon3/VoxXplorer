package com.jcraft.jsch;

import ax.d1.h;
import ax.i.s;
import com.jcraft.jsch.ConfigRepository;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class Session {
    static Random x0;
    private static final byte[] y0 = Util.v("keepalive@jcraft.com");
    private static final byte[] z0 = Util.v("no-more-sessions@openssh.com");
    private UserInfo T;
    private HostKeyConf U;
    private byte[] a;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    String g0;
    private byte[] h;
    String h0;
    private byte[] i;
    int i0;
    private byte[] j;
    String j0;
    private byte[] k;
    JSch l0;
    Logger m0;
    private Cipher o;
    private Cipher p;
    private MAC q;
    private MAC r;
    private byte[] s;
    private byte[] t;
    private Compression u;
    Runnable u0;
    private Compression v;
    private IO w;
    private Socket x;
    private byte[] b = Util.v("SSH-2.0-JSCH_" + JSch.g);
    private int l = 0;
    private int m = 0;
    String[] n = null;
    private int y = 0;
    private volatile boolean z = false;
    private volatile boolean A = false;
    private boolean B = true;
    private boolean C = true;
    private volatile boolean D = true;
    private volatile boolean E = false;
    private boolean F = true;
    private boolean G = false;
    private volatile boolean H = false;
    private Thread I = null;
    private Object J = new Object();
    boolean K = false;
    boolean L = false;
    InputStream M = null;
    OutputStream N = null;
    SocketFactory Q = null;
    private Hashtable<String, String> R = null;
    private Proxy S = null;
    private String V = null;
    private int W = 0;
    private int X = 1;
    private IdentityRepository Y = null;
    private HostKeyRepository Z = null;
    private volatile String[] a0 = null;
    private volatile boolean b0 = false;
    protected boolean c0 = false;
    private long d0 = 0;
    int e0 = 6;
    int f0 = 0;
    byte[] k0 = null;
    private volatile boolean n0 = false;
    private volatile boolean o0 = false;
    private volatile String[] p0 = null;
    int[] q0 = new int[1];
    int[] r0 = new int[1];
    private int s0 = 8;
    private int t0 = 8;
    private GlobalRequestReply v0 = new GlobalRequestReply();
    private HostKey w0 = null;
    Buffer O = new Buffer();
    Packet P = new Packet(this.O);

    static class Forwarding {
        String a = null;
        int b = -1;
        String c = null;
        int d = -1;
        String e = null;

        Forwarding() {
        }
    }

    private static class GlobalRequestReply {
        private Thread a;
        private int b;
        private int c;

        private GlobalRequestReply() {
            this.a = null;
            this.b = -1;
            this.c = 0;
        }

        int a() {
            return this.c;
        }

        int b() {
            return this.b;
        }

        Thread c() {
            return this.a;
        }

        void d(int i) {
            this.c = i;
        }

        void e(int i) {
            this.b = i;
        }

        void f(Thread thread) {
            this.a = thread;
            this.b = -1;
        }
    }

    Session(JSch jSch, String str, String str2, int i) throws JSchException {
        this.g0 = "127.0.0.1";
        this.h0 = "127.0.0.1";
        this.i0 = 22;
        this.j0 = null;
        this.l0 = jSch;
        this.j0 = str;
        this.g0 = str2;
        this.h0 = str2;
        this.i0 = i;
        d();
        if (this.j0 == null) {
            this.j0 = Util.o("user.name");
        }
        if (this.j0 == null) {
            throw new JSchException("username is not given.");
        }
    }

    private void H(String str) throws JSchException {
        int i;
        Compression compression = this.u;
        if (str.equals("none")) {
            this.u = null;
            if (compression != null) {
                return;
            } else {
                return;
            }
        }
        String w = w(str);
        if (w != null) {
            if (str.equals("zlib") || (this.H && str.equals("zlib@openssh.com"))) {
                try {
                    try {
                        this.u = (Compression) Class.forName(w).asSubclass(Compression.class).getDeclaredConstructor(null).newInstance(null);
                        try {
                            i = Integer.parseInt(w("compression_level"));
                        } catch (Exception unused) {
                            i = 6;
                        }
                        this.u.d(1, i, this);
                        if (compression != null) {
                            compression.a();
                        }
                    } catch (Exception e) {
                        throw new JSchException(e.toString(), e);
                    }
                } finally {
                    if (compression != null) {
                        compression.a();
                    }
                }
            }
        }
    }

    private void I(String str) throws JSchException {
        Compression compression = this.v;
        if (str.equals("none")) {
            this.v = null;
            if (compression != null) {
                return;
            } else {
                return;
            }
        }
        String w = w(str);
        if (w != null) {
            if (str.equals("zlib") || (this.H && str.equals("zlib@openssh.com"))) {
                try {
                    try {
                        Compression compression2 = (Compression) Class.forName(w).asSubclass(Compression.class).getDeclaredConstructor(null).newInstance(null);
                        this.v = compression2;
                        compression2.d(0, 0, this);
                        if (compression != null) {
                            compression.a();
                        }
                    } catch (Exception e) {
                        throw new JSchException(e.toString(), e);
                    }
                } finally {
                    if (compression != null) {
                        compression.a();
                    }
                }
            }
        }
    }

    private KeyExchange N(Buffer buffer) throws Exception {
        int i = buffer.i();
        if (i != buffer.j()) {
            buffer.c();
            this.d = new byte[buffer.c - 5];
        } else {
            this.d = new byte[(i - 1) - buffer.c()];
        }
        byte[] bArr = buffer.b;
        int i2 = buffer.d;
        byte[] bArr2 = this.d;
        System.arraycopy(bArr, i2, bArr2, 0, bArr2.length);
        if (this.D) {
            if (this.F || this.G) {
                this.E = o();
                if (this.E) {
                    if (A().isEnabled(1)) {
                        A().a(1, "Doing strict KEX");
                    }
                    if (this.l != 1) {
                        throw new JSchStrictKexException("KEXINIT not first packet from server");
                    }
                } else if (this.G) {
                    throw new JSchStrictKexException("Strict KEX not supported by server");
                }
            }
            if (this.B) {
                this.A = n();
                if (this.A && A().isEnabled(1)) {
                    A().a(1, "ext-info messaging supported by server");
                }
            }
        }
        if (!this.n0) {
            T();
        }
        String[] l = KeyExchange.l(this, this.d, this.c);
        this.n = l;
        if (l[0].equals("ext-info-c") || this.n[0].equals("ext-info-s") || this.n[0].equals("kex-strict-c-v00@openssh.com") || this.n[0].equals("kex-strict-s-v00@openssh.com")) {
            throw new JSchException("Invalid Kex negotiated: " + this.n[0]);
        }
        if (!this.H && (this.n[2].equals("none") || this.n[3].equals("none"))) {
            throw new JSchException("NONE Cipher should not be chosen before authentification is successed.");
        }
        try {
            KeyExchange keyExchange = (KeyExchange) Class.forName(w(this.n[0])).asSubclass(KeyExchange.class).getDeclaredConstructor(null).newInstance(null);
            keyExchange.b(this, this.a, this.b, this.d, this.c);
            return keyExchange;
        } catch (Exception | NoClassDefFoundError e) {
            throw new JSchException(e.toString(), e);
        }
    }

    private void O(Buffer buffer, KeyExchange keyExchange) throws Exception {
        try {
            l0(keyExchange);
            keyExchange.a();
            this.n0 = false;
            if (this.E) {
                this.l = 0;
                if (A().isEnabled(1)) {
                    A().a(1, "Reset incoming sequence number after receiving SSH_MSG_NEWKEYS for strict KEX");
                }
            }
        } catch (Throwable th) {
            keyExchange.a();
            throw th;
        }
    }

    private void P() throws JSchException {
        ConfigRepository g;
        if (w("ClearAllForwardings").equals("yes") || (g = this.l0.g()) == null) {
            return;
        }
        ConfigRepository.Config a = g.a(this.h0);
        String[] b = a.b("LocalForward");
        if (b != null) {
            for (String str : b) {
                b0(str);
            }
        }
        String[] b2 = a.b("RemoteForward");
        if (b2 != null) {
            for (String str2 : b2) {
                f0(str2);
            }
        }
    }

    private void S() throws Exception {
        this.P.c();
        this.O.s((byte) 7);
        this.O.v(1);
        this.O.y(Util.v("ext-info-in-auth@openssh.com"));
        this.O.y(Util.v("0"));
        m0(this.P);
        if (A().isEnabled(1)) {
            A().a(1, "SSH_MSG_EXT_INFO sent");
        }
    }

    private void T() throws Exception {
        if (this.n0) {
            return;
        }
        String w = w("cipher.c2s");
        String w2 = w("cipher.s2c");
        String[] g = g(w("CheckCiphers"));
        if (g != null && g.length > 0) {
            if (A().isEnabled(0)) {
                A().a(0, "cipher.c2s proposal before removing unavailable algos is: " + w);
                A().a(0, "cipher.s2c proposal before removing unavailable algos is: " + w2);
            }
            w = Util.j(w, g);
            w2 = Util.j(w2, g);
            if (w == null || w2 == null) {
                throw new JSchException("There are not any available ciphers.");
            }
            if (A().isEnabled(0)) {
                A().a(0, "cipher.c2s proposal after removing unavailable algos is: " + w);
                A().a(0, "cipher.s2c proposal after removing unavailable algos is: " + w2);
            }
        }
        String w3 = w("mac.c2s");
        String w4 = w("mac.s2c");
        String[] m = m(w("CheckMacs"));
        if (m != null && m.length > 0) {
            if (A().isEnabled(0)) {
                A().a(0, "mac.c2s proposal before removing unavailable algos is: " + w3);
                A().a(0, "mac.s2c proposal before removing unavailable algos is: " + w4);
            }
            String j = Util.j(w3, m);
            String j2 = Util.j(w4, m);
            if (j == null || j2 == null) {
                throw new JSchException("There are not any available macs.");
            }
            if (A().isEnabled(0)) {
                A().a(0, "mac.c2s proposal after removing unavailable algos is: " + j);
                A().a(0, "mac.s2c proposal after removing unavailable algos is: " + j2);
            }
        }
        String w5 = w("kex");
        String[] k = k(w("CheckKexes"));
        if (k != null && k.length > 0) {
            if (A().isEnabled(0)) {
                A().a(0, "kex proposal before removing unavailable algos is: " + w5);
            }
            w5 = Util.j(w5, k);
            if (w5 == null) {
                throw new JSchException("There are not any available kexes.");
            }
            if (A().isEnabled(0)) {
                A().a(0, "kex proposal after removing unavailable algos is: " + w5);
            }
        }
        if (this.B && !this.H) {
            w5 = w5 + ",ext-info-c";
        }
        if ((this.F || this.G) && this.D) {
            w5 = w5 + ",kex-strict-c-v00@openssh.com";
        }
        String w6 = w("server_host_key");
        String[] p = p(w("CheckSignatures"));
        this.p0 = p;
        if (p != null && p.length > 0) {
            if (A().isEnabled(0)) {
                A().a(0, "server_host_key proposal before removing unavailable algos is: " + w6);
            }
            w6 = Util.j(w6, p);
            if (w6 == null) {
                throw new JSchException("There are not any available sig algorithm.");
            }
            if (A().isEnabled(0)) {
                A().a(0, "server_host_key proposal after removing unavailable algos is: " + w6);
            }
        }
        if (w("prefer_known_host_key_types").equals("yes")) {
            if (A().isEnabled(0)) {
                A().a(0, "server_host_key proposal before known_host reordering is: " + w6);
            }
            HostKeyRepository y = y();
            String str = this.g0;
            String str2 = this.V;
            if (str2 != null) {
                str = str2;
            }
            if (str2 == null && this.i0 != 22) {
                str = "[" + str + "]:" + this.i0;
            }
            HostKey[] e = y.e(str, null);
            if (e != null && e.length > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(Arrays.asList(Util.u(w6, ",")));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    String str4 = (str3.equals("rsa-sha2-256") || str3.equals("rsa-sha2-512") || str3.equals("ssh-rsa-sha224@ssh.com") || str3.equals("ssh-rsa-sha256@ssh.com") || str3.equals("ssh-rsa-sha384@ssh.com") || str3.equals("ssh-rsa-sha512@ssh.com")) ? "ssh-rsa" : str3;
                    int length = e.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (e[i].f().equals(str4)) {
                            arrayList.add(str3);
                            it.remove();
                            break;
                        }
                        i++;
                    }
                }
                if (arrayList.size() > 0) {
                    arrayList.addAll(arrayList2);
                    w6 = h.a(",", arrayList);
                }
            }
            if (A().isEnabled(0)) {
                A().a(0, "server_host_key proposal after known_host reordering is: " + w6);
            }
        }
        this.n0 = true;
        this.d0 = System.currentTimeMillis();
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte) 20);
        synchronized (x0) {
            x0.a(buffer.b, buffer.c, 16);
            buffer.E(16);
        }
        buffer.y(Util.v(w5));
        buffer.y(Util.v(w6));
        buffer.y(Util.v(w));
        buffer.y(Util.v(w2));
        buffer.y(Util.v(w("mac.c2s")));
        buffer.y(Util.v(w("mac.s2c")));
        buffer.y(Util.v(w("compression.c2s")));
        buffer.y(Util.v(w("compression.s2c")));
        buffer.y(Util.v(w("lang.c2s")));
        buffer.y(Util.v(w("lang.s2c")));
        buffer.s((byte) 0);
        buffer.v(0);
        buffer.C(5);
        byte[] bArr = new byte[buffer.j()];
        this.c = bArr;
        buffer.e(bArr);
        m0(packet);
        if (A().isEnabled(1)) {
            A().a(1, "SSH_MSG_KEXINIT sent");
        }
    }

    private void U() throws Exception {
        this.P.c();
        this.O.s((byte) 21);
        m0(this.P);
        if (A().isEnabled(1)) {
            A().a(1, "SSH_MSG_NEWKEYS sent");
        }
    }

    private int a(String str, int i) throws JSchException {
        int a;
        synchronized (this.v0) {
            Buffer buffer = new Buffer(200);
            Packet packet = new Packet(buffer);
            String L = ChannelForwardedTCPIP.L(str);
            this.v0.f(Thread.currentThread());
            this.v0.d(i);
            try {
                packet.c();
                buffer.s((byte) 80);
                buffer.y(Util.v("tcpip-forward"));
                buffer.s((byte) 1);
                buffer.y(Util.v(L));
                buffer.v(i);
                m0(packet);
                int b = this.v0.b();
                int i2 = 0;
                while (i2 < 10 && b == -1) {
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception unused) {
                    }
                    i2++;
                    b = this.v0.b();
                }
                this.v0.f(null);
                if (b != 1) {
                    throw new JSchException("remote port forwarding failed for listen port " + i);
                }
                a = this.v0.a();
            } catch (Exception e) {
                this.v0.f(null);
                throw new JSchException(e.toString(), e);
            }
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r8.m = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(com.jcraft.jsch.Packet r9) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r8.D
            boolean r1 = r8.E
            boolean r2 = r8.F
            boolean r3 = r8.G
            com.jcraft.jsch.Buffer r4 = r9.a
            byte r4 = r4.h()
            r5 = 21
            r6 = 0
            r7 = 1
            if (r4 != r5) goto L18
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            java.lang.Object r4 = r8.J
            monitor-enter(r4)
            r8.t(r9)     // Catch: java.lang.Throwable -> L3c
            com.jcraft.jsch.IO r5 = r8.w     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L42
            r5.e(r9)     // Catch: java.lang.Throwable -> L3c
            int r9 = r8.m     // Catch: java.lang.Throwable -> L3c
            int r9 = r9 + r7
            r8.m = r9     // Catch: java.lang.Throwable -> L3c
            if (r9 != 0) goto L3e
            if (r2 != 0) goto L31
            if (r3 == 0) goto L3e
        L31:
            if (r0 != 0) goto L34
            goto L3e
        L34:
            com.jcraft.jsch.JSchStrictKexException r9 = new com.jcraft.jsch.JSchStrictKexException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "outgoing sequence number wrapped during initial KEX"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            throw r9     // Catch: java.lang.Throwable -> L3c
        L3c:
            r9 = move-exception
            goto L5d
        L3e:
            if (r1 == 0) goto L42
            r8.m = r6     // Catch: java.lang.Throwable -> L3c
        L42:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L5c
            com.jcraft.jsch.IO r9 = r8.w
            if (r9 == 0) goto L5c
            com.jcraft.jsch.Logger r9 = r8.A()
            boolean r9 = r9.isEnabled(r7)
            if (r9 == 0) goto L5c
            com.jcraft.jsch.Logger r9 = r8.A()
            java.lang.String r0 = "Reset outgoing sequence number after sending SSH_MSG_NEWKEYS for strict KEX"
            r9.a(r7, r0)
        L5c:
            return
        L5d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.b(com.jcraft.jsch.Packet):void");
    }

    private void d() throws JSchException {
        String c;
        ConfigRepository g = this.l0.g();
        if (g == null) {
            return;
        }
        ConfigRepository.Config a = g.a(this.h0);
        if (this.j0 == null && (c = a.c()) != null) {
            this.j0 = c;
        }
        String d = a.d();
        if (d != null) {
            this.g0 = d;
        }
        int a2 = a.a();
        if (a2 != -1) {
            this.i0 = a2;
        }
        h(a, "kex");
        h(a, "server_host_key");
        h(a, "prefer_known_host_key_types");
        h(a, "enable_server_sig_algs");
        h(a, "enable_ext_info_in_auth");
        h(a, "enable_strict_kex");
        h(a, "require_strict_kex");
        h(a, "enable_pubkey_auth_query");
        h(a, "try_additional_pubkey_algorithms");
        h(a, "enable_auth_none");
        h(a, "use_sftp_write_flush_workaround");
        h(a, "cipher.c2s");
        h(a, "cipher.s2c");
        h(a, "mac.c2s");
        h(a, "mac.s2c");
        h(a, "compression.c2s");
        h(a, "compression.s2c");
        h(a, "compression_level");
        h(a, "StrictHostKeyChecking");
        h(a, "HashKnownHosts");
        h(a, "PreferredAuthentications");
        h(a, "PubkeyAcceptedAlgorithms");
        h(a, "FingerprintHash");
        h(a, "MaxAuthTries");
        h(a, "ClearAllForwardings");
        String value = a.getValue("HostKeyAlias");
        if (value != null) {
            W(value);
        }
        String value2 = a.getValue("UserKnownHostsFile");
        if (value2 != null) {
            KnownHosts knownHosts = new KnownHosts(this.l0);
            knownHosts.o(value2);
            Y(knownHosts);
        }
        String[] b = a.b("IdentityFile");
        if (b != null) {
            String[] b2 = g.a(HttpUrl.FRAGMENT_ENCODE_SET).b("IdentityFile");
            if (b2 != null) {
                for (String str : b2) {
                    this.l0.b(str);
                }
            } else {
                b2 = new String[0];
            }
            if (b.length - b2.length > 0) {
                IdentityRepositoryWrapper identityRepositoryWrapper = new IdentityRepositoryWrapper(this.l0.i(), true);
                for (String str2 : b) {
                    int i = 0;
                    while (true) {
                        if (i >= b2.length) {
                            break;
                        }
                        if (str2.equals(b2[i])) {
                            str2 = null;
                            break;
                        }
                        i++;
                    }
                    if (str2 != null) {
                        identityRepositoryWrapper.e(IdentityFile.h(str2, null, this.l0.a));
                    }
                }
                Z(identityRepositoryWrapper);
            }
        }
        String value3 = a.getValue("ServerAliveInterval");
        if (value3 != null) {
            try {
                g0(Integer.parseInt(value3));
            } catch (NumberFormatException unused) {
            }
        }
        String value4 = a.getValue("ConnectTimeout");
        if (value4 != null) {
            try {
                i0(Integer.parseInt(value4));
            } catch (NumberFormatException unused2) {
            }
        }
        String value5 = a.getValue("MaxAuthTries");
        if (value5 != null) {
            V("MaxAuthTries", value5);
        }
        String value6 = a.getValue("ClearAllForwardings");
        if (value6 != null) {
            V("ClearAllForwardings", value6);
        }
    }

    private void e(ChannelSession channelSession) throws JSchException {
        ConfigRepository g = this.l0.g();
        if (g == null) {
            return;
        }
        ConfigRepository.Config a = g.a(this.h0);
        String value = a.getValue("ForwardAgent");
        if (value != null) {
            channelSession.H(value.equals("yes"));
        }
        String value2 = a.getValue("RequestTTY");
        if (value2 != null) {
            channelSession.I(value2.equals("yes"));
        }
    }

    static boolean f(String str) {
        try {
            Cipher cipher = (Cipher) Class.forName(str).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null);
            cipher.k(0, new byte[cipher.d()], new byte[cipher.l()]);
            return true;
        } catch (Exception | NoClassDefFoundError unused) {
            return false;
        }
    }

    private String[] g(String str) {
        String[] strArr = null;
        if (str != null && str.length() != 0) {
            if (A().isEnabled(1)) {
                A().a(1, "CheckCiphers: " + str);
            }
            String w = w("cipher.c2s");
            String w2 = w("cipher.s2c");
            Vector vector = new Vector();
            for (String str2 : Util.u(str, ",")) {
                if ((w2.indexOf(str2) != -1 || w.indexOf(str2) != -1) && !f(w(str2))) {
                    vector.addElement(str2);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            int size = vector.size();
            strArr = new String[size];
            System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
            if (A().isEnabled(1)) {
                for (int i = 0; i < size; i++) {
                    A().a(1, strArr[i] + " is not available.");
                }
            }
        }
        return strArr;
    }

    private void h(ConfigRepository.Config config, String str) {
        String value = config.getValue(str);
        if (value == null && str.equals("PubkeyAcceptedAlgorithms")) {
            value = config.getValue("PubkeyAcceptedKeyTypes");
        }
        if (value != null) {
            V(str, value);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(java.lang.String r12, int r13, com.jcraft.jsch.KeyExchange r14) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.i(java.lang.String, int, com.jcraft.jsch.KeyExchange):void");
    }

    static boolean j(Session session, String str) {
        try {
            ((KeyExchange) Class.forName(str).asSubclass(KeyExchange.class).getDeclaredConstructor(null).newInstance(null)).b(session, null, null, null, null);
            return true;
        } catch (Exception | NoClassDefFoundError unused) {
            return false;
        }
    }

    private String[] k(String str) {
        String[] strArr = null;
        if (str != null && str.length() != 0) {
            if (A().isEnabled(1)) {
                A().a(1, "CheckKexes: " + str);
            }
            Vector vector = new Vector();
            String[] u = Util.u(str, ",");
            for (int i = 0; i < u.length; i++) {
                if (!j(this, w(u[i]))) {
                    vector.addElement(u[i]);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            int size = vector.size();
            strArr = new String[size];
            System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
            if (A().isEnabled(1)) {
                for (int i2 = 0; i2 < size; i2++) {
                    A().a(1, strArr[i2] + " is not available.");
                }
            }
        }
        return strArr;
    }

    private void k0(Buffer buffer, Cipher cipher, MAC mac, int i, int i2) throws JSchException {
        IOException e;
        if (!cipher.i() || (mac != null && mac.f())) {
            throw new JSchException("Packet corrupt");
        }
        if (mac != null) {
            mac.e(this.l);
            mac.b(buffer.b, 0, i);
        }
        while (i2 > 0) {
            try {
                buffer.A();
                byte[] bArr = buffer.b;
                int length = i2 > bArr.length ? bArr.length : i2;
                this.w.c(bArr, 0, length);
                if (mac != null) {
                    mac.b(buffer.b, 0, length);
                }
                i2 -= length;
            } catch (IOException e2) {
                e = e2;
                if (A().isEnabled(3)) {
                    A().b(3, "start_discard finished early due to " + e.getMessage(), e);
                }
            }
        }
        e = null;
        if (mac != null) {
            mac.c(buffer.b, 0);
        }
        JSchException jSchException = new JSchException("Packet corrupt");
        if (e == null) {
            throw jSchException;
        }
        jSchException.addSuppressed(e);
        throw jSchException;
    }

    static boolean l(String str) {
        try {
            MAC mac = (MAC) Class.forName(str).asSubclass(MAC.class).getDeclaredConstructor(null).newInstance(null);
            mac.a(new byte[mac.d()]);
            return true;
        } catch (Exception | NoClassDefFoundError unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l0(com.jcraft.jsch.KeyExchange r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.l0(com.jcraft.jsch.KeyExchange):void");
    }

    private String[] m(String str) {
        String[] strArr = null;
        if (str != null && str.length() != 0) {
            if (A().isEnabled(1)) {
                A().a(1, "CheckMacs: " + str);
            }
            String w = w("mac.c2s");
            String w2 = w("mac.s2c");
            Vector vector = new Vector();
            for (String str2 : Util.u(str, ",")) {
                if ((w2.indexOf(str2) != -1 || w.indexOf(str2) != -1) && !l(w(str2))) {
                    vector.addElement(str2);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            int size = vector.size();
            strArr = new String[size];
            System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
            if (A().isEnabled(1)) {
                for (int i = 0; i < size; i++) {
                    A().a(1, strArr[i] + " is not available.");
                }
            }
        }
        return strArr;
    }

    private boolean n() {
        Buffer buffer = new Buffer(this.d);
        buffer.C(17);
        byte[] p = buffer.p();
        int i = 0;
        int i2 = 0;
        while (i < p.length) {
            while (i < p.length && p[i] != 44) {
                i++;
            }
            if (i2 != i) {
                if ("ext-info-s".equals(Util.d(p, i2, i - i2))) {
                    return true;
                }
                i2 = i + 1;
                i = i2;
            }
        }
        return false;
    }

    private boolean o() {
        Buffer buffer = new Buffer(this.d);
        buffer.C(17);
        byte[] p = buffer.p();
        int i = 0;
        int i2 = 0;
        while (i < p.length) {
            while (i < p.length && p[i] != 44) {
                i++;
            }
            if (i2 != i) {
                if ("kex-strict-s-v00@openssh.com".equals(Util.d(p, i2, i - i2))) {
                    return true;
                }
                i2 = i + 1;
                i = i2;
            }
        }
        return false;
    }

    private String[] p(String str) {
        String[] strArr = null;
        if (str != null && str.length() != 0) {
            if (A().isEnabled(1)) {
                A().a(1, "CheckSignatures: " + str);
            }
            Vector vector = new Vector();
            String[] u = Util.u(str, ",");
            for (int i = 0; i < u.length; i++) {
                try {
                    ((Signature) Class.forName(JSch.f(u[i])).asSubclass(Signature.class).getDeclaredConstructor(null).newInstance(null)).e();
                } catch (Exception | NoClassDefFoundError unused) {
                    vector.addElement(u[i]);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            int size = vector.size();
            strArr = new String[size];
            System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
            if (A().isEnabled(1)) {
                for (int i2 = 0; i2 < size; i2++) {
                    A().a(1, strArr[i2] + " is not available.");
                }
            }
        }
        return strArr;
    }

    private byte[] u(Buffer buffer, byte[] bArr, byte[] bArr2, byte[] bArr3, HASH hash, int i) throws Exception {
        int d = hash.d();
        while (bArr3.length < i) {
            buffer.A();
            buffer.t(bArr);
            buffer.t(bArr2);
            buffer.t(bArr3);
            hash.b(buffer.b, 0, buffer.c);
            byte[] bArr4 = new byte[bArr3.length + d];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(hash.c(), 0, bArr4, bArr3.length, d);
            Util.g(bArr3);
            bArr3 = bArr4;
        }
        return bArr3;
    }

    public Logger A() {
        Logger logger = this.m0;
        return logger != null ? logger : this.l0.j();
    }

    String[] B() {
        return this.a0;
    }

    byte[] C() {
        return this.e;
    }

    public int D() {
        return this.y;
    }

    public String[] E() {
        return this.p0;
    }

    public UserInfo F() {
        return this.T;
    }

    public String G() {
        return this.j0;
    }

    public boolean J() {
        return this.z;
    }

    public Channel K(String str) throws JSchException {
        if (!this.z) {
            throw new JSchException("session is down");
        }
        try {
            Channel l = Channel.l(str, this);
            c(l);
            l.q();
            if (l instanceof ChannelSession) {
                e((ChannelSession) l);
            }
            return l;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[Catch: NumberFormatException -> 0x00e0, TRY_ENTER, TryCatch #2 {NumberFormatException -> 0x00e0, blocks: (B:27:0x0057, B:39:0x00aa, B:42:0x00ba, B:44:0x00d7, B:47:0x00e4, B:50:0x00ee, B:54:0x00f1, B:30:0x00fa, B:31:0x010e, B:58:0x009e), top: B:26:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1 A[Catch: NumberFormatException -> 0x00e0, TryCatch #2 {NumberFormatException -> 0x00e0, blocks: (B:27:0x0057, B:39:0x00aa, B:42:0x00ba, B:44:0x00d7, B:47:0x00e4, B:50:0x00ee, B:54:0x00f1, B:30:0x00fa, B:31:0x010e, B:58:0x009e), top: B:26:0x0057 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.jcraft.jsch.Session.Forwarding L(java.lang.String r10) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.L(java.lang.String):com.jcraft.jsch.Session$Forwarding");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x054b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.jcraft.jsch.Buffer M(com.jcraft.jsch.Buffer r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.M(com.jcraft.jsch.Buffer):com.jcraft.jsch.Buffer");
    }

    void Q() {
        int i;
        int i2;
        byte b;
        this.u0 = new f(this);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        while (true) {
            KeyExchange keyExchange = null;
            while (true) {
                int i3 = 0;
                while (this.z && this.u0 != null) {
                    try {
                        try {
                            buffer = M(buffer);
                            int h = buffer.h() & 255;
                            if (keyExchange != null && keyExchange.k() == h) {
                                this.d0 = System.currentTimeMillis();
                                boolean n = keyExchange.n(buffer);
                                if (!n) {
                                    throw new JSchException("verify: " + n);
                                }
                            } else if (h == 20) {
                                keyExchange = N(buffer);
                            } else if (h != 21) {
                                switch (h) {
                                    case 80:
                                        buffer.i();
                                        buffer.o();
                                        buffer.p();
                                        if (buffer.c() == 0) {
                                            break;
                                        } else {
                                            packet.c();
                                            buffer.s((byte) 82);
                                            m0(packet);
                                            break;
                                        }
                                    case 81:
                                    case 82:
                                        Thread c = this.v0.c();
                                        if (c == null) {
                                            break;
                                        } else {
                                            this.v0.e(h == 81 ? 1 : 0);
                                            if (h == 81 && this.v0.a() == 0) {
                                                buffer.i();
                                                buffer.o();
                                                this.v0.d(buffer.i());
                                            }
                                            c.interrupt();
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (h) {
                                            case 90:
                                                buffer.i();
                                                buffer.o();
                                                String c2 = Util.c(buffer.p());
                                                if (!"forwarded-tcpip".equals(c2) && ((!"x11".equals(c2) || !this.K) && (!"auth-agent@openssh.com".equals(c2) || !this.L))) {
                                                    packet.c();
                                                    buffer.s((byte) 92);
                                                    buffer.v(buffer.i());
                                                    buffer.v(1);
                                                    byte[] bArr = Util.c;
                                                    buffer.y(bArr);
                                                    buffer.y(bArr);
                                                    m0(packet);
                                                    break;
                                                } else {
                                                    final Channel l = Channel.l(c2, this);
                                                    c(l);
                                                    l.m(buffer);
                                                    l.q();
                                                    Thread thread = new Thread(new Runnable() { // from class: com.jcraft.jsch.g
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            Channel.this.t();
                                                        }
                                                    });
                                                    thread.setName("Channel " + c2 + " " + this.g0);
                                                    boolean z = this.c0;
                                                    if (z) {
                                                        thread.setDaemon(z);
                                                    }
                                                    thread.start();
                                                    break;
                                                }
                                                break;
                                            case 91:
                                                buffer.i();
                                                buffer.o();
                                                Channel k = Channel.k(buffer.i(), this);
                                                int i4 = buffer.i();
                                                long r = buffer.r();
                                                int i5 = buffer.i();
                                                if (k == null) {
                                                    break;
                                                } else {
                                                    k.B(r);
                                                    k.A(i5);
                                                    k.o = true;
                                                    k.z(i4);
                                                    break;
                                                }
                                            case 92:
                                                buffer.i();
                                                buffer.o();
                                                Channel k2 = Channel.k(buffer.i(), this);
                                                if (k2 == null) {
                                                    break;
                                                } else {
                                                    k2.x(buffer.i());
                                                    k2.m = true;
                                                    k2.l = true;
                                                    k2.z(0);
                                                    break;
                                                }
                                            case 93:
                                                buffer.i();
                                                buffer.o();
                                                Channel k3 = Channel.k(buffer.i(), this);
                                                if (k3 != null) {
                                                    k3.a(buffer.r());
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 94:
                                                buffer.i();
                                                buffer.c();
                                                buffer.c();
                                                Channel k4 = Channel.k(buffer.i(), this);
                                                byte[] q = buffer.q(iArr, iArr2);
                                                if (k4 != null && (i = iArr2[0]) != 0) {
                                                    try {
                                                        try {
                                                            k4.E(q, iArr[0], i);
                                                            k4.y(k4.e - iArr2[0]);
                                                            if (k4.e < k4.d / 2) {
                                                                packet.c();
                                                                buffer.s((byte) 93);
                                                                buffer.v(k4.o());
                                                                buffer.v(k4.d - k4.e);
                                                                synchronized (k4) {
                                                                    try {
                                                                        if (!k4.m) {
                                                                            m0(packet);
                                                                        }
                                                                    } finally {
                                                                    }
                                                                }
                                                                k4.y(k4.d);
                                                                break;
                                                            } else {
                                                                continue;
                                                            }
                                                        } catch (Exception unused) {
                                                            k4.f();
                                                            break;
                                                        }
                                                    } catch (Exception unused2) {
                                                        continue;
                                                    }
                                                }
                                                break;
                                            case 95:
                                                buffer.i();
                                                buffer.o();
                                                Channel k5 = Channel.k(buffer.i(), this);
                                                buffer.i();
                                                byte[] q2 = buffer.q(iArr, iArr2);
                                                if (k5 != null && (i2 = iArr2[0]) != 0) {
                                                    k5.F(q2, iArr[0], i2);
                                                    k5.y(k5.e - iArr2[0]);
                                                    if (k5.e < k5.d / 2) {
                                                        packet.c();
                                                        buffer.s((byte) 93);
                                                        buffer.v(k5.o());
                                                        buffer.v(k5.d - k5.e);
                                                        synchronized (k5) {
                                                            try {
                                                                if (!k5.m) {
                                                                    m0(packet);
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        k5.y(k5.d);
                                                        break;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                break;
                                            case 96:
                                                buffer.i();
                                                buffer.o();
                                                Channel k6 = Channel.k(buffer.i(), this);
                                                if (k6 == null) {
                                                    break;
                                                } else {
                                                    k6.i();
                                                    break;
                                                }
                                            case 97:
                                                buffer.i();
                                                buffer.o();
                                                Channel k7 = Channel.k(buffer.i(), this);
                                                if (k7 == null) {
                                                    break;
                                                } else {
                                                    k7.f();
                                                    break;
                                                }
                                            case 98:
                                                buffer.i();
                                                buffer.o();
                                                int i6 = buffer.i();
                                                byte[] p = buffer.p();
                                                boolean z2 = buffer.c() != 0;
                                                Channel k8 = Channel.k(i6, this);
                                                if (k8 != null) {
                                                    if (Util.c(p).equals("exit-status")) {
                                                        k8.x(buffer.i());
                                                        b = 99;
                                                    } else {
                                                        b = 100;
                                                    }
                                                    if (!z2) {
                                                        break;
                                                    } else {
                                                        packet.c();
                                                        buffer.s(b);
                                                        buffer.v(k8.o());
                                                        m0(packet);
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            case 99:
                                                buffer.i();
                                                buffer.o();
                                                Channel k9 = Channel.k(buffer.i(), this);
                                                if (k9 != null) {
                                                    k9.q = 1;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 100:
                                                buffer.i();
                                                buffer.o();
                                                Channel k10 = Channel.k(buffer.i(), this);
                                                if (k10 != null) {
                                                    k10.q = 0;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            default:
                                                throw new IOException("Unknown SSH message type " + h);
                                        }
                                }
                            }
                        } catch (InterruptedIOException e) {
                            if (!this.n0 && i3 < this.X) {
                                R();
                            } else if (!this.n0 || i3 >= this.X) {
                                throw e;
                            }
                            i3++;
                        }
                    } catch (Exception e2) {
                        this.n0 = false;
                        if (A().isEnabled(1)) {
                            A().a(1, "Caught an exception, leaving main loop due to " + e2.getMessage());
                        }
                    }
                }
                try {
                    s();
                } catch (NullPointerException | Exception unused3) {
                }
                this.z = false;
                return;
            }
            U();
            O(buffer, keyExchange);
        }
        throw e;
    }

    public void R() throws Exception {
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte) 80);
        buffer.y(y0);
        buffer.s((byte) 1);
        m0(packet);
    }

    public void V(String str, String str2) {
        synchronized (this.J) {
            try {
                if (this.R == null) {
                    this.R = new Hashtable<>();
                }
                if (str.equals("PubkeyAcceptedKeyTypes")) {
                    this.R.put("PubkeyAcceptedAlgorithms", str2);
                } else {
                    this.R.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void W(String str) {
        this.V = str;
    }

    public void X(HostKeyConf hostKeyConf) {
        this.U = hostKeyConf;
    }

    public void Y(HostKeyRepository hostKeyRepository) {
        this.Z = hostKeyRepository;
    }

    public void Z(IdentityRepository identityRepository) {
        this.Y = identityRepository;
    }

    public void a0(String str) {
        if (str != null) {
            this.k0 = Util.v(str);
        }
    }

    public int b0(String str) throws JSchException {
        Forwarding L = L(str);
        return c0(L.a, L.b, L.c, L.d);
    }

    void c(Channel channel) {
        channel.C(this);
    }

    public int c0(String str, int i, String str2, int i2) throws JSchException {
        return d0(str, i, str2, i2, null);
    }

    public int d0(String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory) throws JSchException {
        return e0(str, i, str2, i2, serverSocketFactory, 0);
    }

    public int e0(String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory, int i3) throws JSchException {
        PortWatcher a = PortWatcher.a(this, str, i, str2, i2, serverSocketFactory);
        a.h(i3);
        Thread thread = new Thread(new e(a));
        thread.setName("PortWatcher Thread for " + str2);
        boolean z = this.c0;
        if (z) {
            thread.setDaemon(z);
        }
        thread.start();
        return a.b;
    }

    public int f0(String str) throws JSchException {
        Forwarding L = L(str);
        int a = a(L.a, L.b);
        ChannelForwardedTCPIP.G(this, L.a, L.b, a, L.c, L.d, null);
        return a;
    }

    public void g0(int i) throws JSchException {
        i0(i);
        this.W = i;
    }

    public void h0(SocketFactory socketFactory) {
        this.Q = socketFactory;
    }

    public void i0(int i) throws JSchException {
        Socket socket = this.x;
        if (socket == null) {
            if (i < 0) {
                throw new JSchException("invalid timeout value");
            }
            this.y = i;
        } else {
            try {
                socket.setSoTimeout(i);
                this.y = i;
            } catch (Exception e) {
                throw new JSchException(e.toString(), e);
            }
        }
    }

    public void j0(UserInfo userInfo) {
        this.T = userInfo;
    }

    void m0(Packet packet) throws Exception {
        long D = D();
        while (this.n0) {
            if (D > 0 && System.currentTimeMillis() - this.d0 > D && !this.o0) {
                throw new JSchException("timeout in waiting for rekeying process.");
            }
            byte h = packet.a.h();
            if (h == 20 || h == 21 || h == 30 || h == 31 || h == 31 || h == 32 || h == 33 || h == 34 || h == 1) {
                break;
            } else {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused) {
                }
            }
        }
        b(packet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r13.m != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r13.s() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r9 = 0;
        r9 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r13.g <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        r3 = r13.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r3 <= r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r3 == r7) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        r5 = (int) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r11.p == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        r6 = r11.t0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        r7 = r11.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r7 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        r9 = r7.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        r9 = r12.e(r5, r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r6 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        r5 = r12.a.h();
        r6 = r13.o();
        r14 = r14 - ((int) r3);
        r13.g -= r3;
        r3 = r9;
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        if (r2 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        b(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r14 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        r12.f(r9, r6, r3, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        if (r11.n0 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        if (r13.g < r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r13.g -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d4, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        b(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c3, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c6, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00dd, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00af, code lost:
    
        r6 = -1;
        r2 = false;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x008b, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00df, code lost:
    
        throw r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void n0(com.jcraft.jsch.Packet r12, com.jcraft.jsch.Channel r13, int r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.n0(com.jcraft.jsch.Packet, com.jcraft.jsch.Channel, int):void");
    }

    public void q() throws JSchException {
        r(this.y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x034c, code lost:
    
        if (A().isEnabled(1) == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x034e, code lost:
    
        r5 = "Authentications that can continue: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0351, code lost:
    
        if (r10 >= r9.length) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0353, code lost:
    
        r5 = r5 + r9[r10];
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0367, code lost:
    
        if (r10 >= r9.length) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0369, code lost:
    
        r5 = r5 + ",";
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x037b, code lost:
    
        A().a(1, r5);
        A().a(1, "Next authentication method: " + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03af, code lost:
    
        if (w("userauth." + r14) == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03b1, code lost:
    
        r5 = (com.jcraft.jsch.UserAuth) java.lang.Class.forName(w("userauth." + r14)).asSubclass(com.jcraft.jsch.UserAuth.class).getDeclaredConstructor(null).newInstance(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0403, code lost:
    
        if (r5 == null) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0405, code lost:
    
        r7 = r5.a(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0409, code lost:
    
        if (r7 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0413, code lost:
    
        if (A().isEnabled(1) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0415, code lost:
    
        A().a(1, "Authentication succeeded (" + r14 + ").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x043d, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0481, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0439, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0469, code lost:
    
        r0 = r0.a();
        r5 = com.jcraft.jsch.Util.u(r0, ",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0477, code lost:
    
        if (r8.equals(r0) == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0479, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x047c, code lost:
    
        r8 = r0;
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x047b, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0435, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0467, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0437, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0468, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0433, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0447, code lost:
    
        if (A().isEnabled(2) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0449, code lost:
    
        A().a(2, "an exception during authentication\n" + r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0465, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0490, code lost:
    
        if (r16.f0 < r16.e0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x049a, code lost:
    
        if (A().isEnabled(1) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x049c, code lost:
    
        A().a(1, "Login trials exceeds " + r16.e0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04b6, code lost:
    
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04bd, code lost:
    
        if (r12 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04bf, code lost:
    
        r5 = "Auth cancel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04c4, code lost:
    
        r2.append(r5);
        r2.append(" for methods '");
        r2.append(r8);
        r2.append("'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04db, code lost:
    
        throw new com.jcraft.jsch.JSchException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04c2, code lost:
    
        r5 = "Auth fail";
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0402, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03e3, code lost:
    
        if (A().isEnabled(2) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03e5, code lost:
    
        A().a(2, "failed to load " + r14 + " method");
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x028e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0581, code lost:
    
        r16.n0 = false;
        r16.o0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0585, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(int r17) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 1645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.r(int):void");
    }

    public void s() {
        if (this.z) {
            if (A().isEnabled(1)) {
                A().a(1, "Disconnecting from " + this.g0 + " port " + this.i0);
            }
            Channel.g(this);
            this.z = false;
            PortWatcher.c(this);
            ChannelForwardedTCPIP.H(this);
            ChannelX11.J(this);
            synchronized (this.J) {
                try {
                    if (this.I != null) {
                        Thread.yield();
                        this.I.interrupt();
                        this.I = null;
                    }
                } finally {
                }
            }
            this.u0 = null;
            try {
                IO io = this.w;
                if (io != null) {
                    InputStream inputStream = io.a;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    OutputStream outputStream = this.w.b;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    OutputStream outputStream2 = this.w.c;
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                }
                Proxy proxy = this.S;
                if (proxy == null) {
                    Socket socket = this.x;
                    if (socket != null) {
                        socket.close();
                    }
                } else {
                    synchronized (proxy) {
                        this.S.close();
                    }
                    this.S = null;
                }
            } catch (Exception unused) {
            }
            this.w = null;
            this.x = null;
            this.l = 0;
            this.m = 0;
            this.D = true;
            this.E = false;
            this.A = false;
            this.a0 = null;
            this.l0.m(this);
        }
    }

    void t(Packet packet) throws Exception {
        MAC mac;
        Compression compression = this.u;
        if (compression != null) {
            int[] iArr = this.r0;
            Buffer buffer = packet.a;
            iArr[0] = buffer.c;
            buffer.b = compression.b(buffer.b, 5, iArr);
            packet.a.c = this.r0[0];
        }
        Cipher cipher = this.p;
        int i = cipher != null ? this.t0 : 8;
        boolean z = cipher != null && cipher.j();
        Cipher cipher2 = this.p;
        boolean z2 = cipher2 != null && cipher2.m();
        boolean z3 = (z || z2 || this.p == null || (mac = this.r) == null || !mac.f()) ? false : true;
        packet.b(i, (z || z2 || z3) ? false : true);
        byte[] bArr = packet.a.b;
        if (z) {
            this.p.e(this.m);
            this.p.a(bArr, 0, 4, bArr, 0);
            this.p.h(bArr, 0, packet.a.c, bArr, 0);
            packet.a.E(this.p.g());
            return;
        }
        if (z2) {
            this.p.f(bArr, 0, 4);
            this.p.h(bArr, 4, packet.a.c - 4, bArr, 4);
            packet.a.E(this.p.g());
            return;
        }
        if (z3) {
            this.p.a(bArr, 4, r2.c - 4, bArr, 4);
            this.r.e(this.m);
            MAC mac2 = this.r;
            Buffer buffer2 = packet.a;
            mac2.b(buffer2.b, 0, buffer2.c);
            MAC mac3 = this.r;
            Buffer buffer3 = packet.a;
            mac3.c(buffer3.b, buffer3.c);
            packet.a.E(this.r.d());
            return;
        }
        MAC mac4 = this.r;
        if (mac4 != null) {
            mac4.e(this.m);
            MAC mac5 = this.r;
            Buffer buffer4 = packet.a;
            mac5.b(buffer4.b, 0, buffer4.c);
            MAC mac6 = this.r;
            Buffer buffer5 = packet.a;
            mac6.c(buffer5.b, buffer5.c);
        }
        Cipher cipher3 = this.p;
        if (cipher3 != null) {
            cipher3.a(bArr, 0, packet.a.c, bArr, 0);
        }
        MAC mac7 = this.r;
        if (mac7 != null) {
            packet.a.E(mac7.d());
        }
    }

    int v() {
        Cipher cipher = this.p;
        MAC mac = this.r;
        int i = 20;
        if (cipher == null || !(cipher.j() || cipher.m())) {
            if (mac != null && mac.d() > 20) {
                i = mac.d();
            }
        } else if (cipher.g() > 20) {
            i = cipher.g();
        }
        return 64 + i;
    }

    public String w(String str) {
        if (str.equals("PubkeyAcceptedKeyTypes")) {
            str = "PubkeyAcceptedAlgorithms";
        }
        Hashtable<String, String> hashtable = this.R;
        if (hashtable != null) {
            String str2 = hashtable.get(str);
            if (str2 instanceof String) {
                return str2;
            }
        }
        String f = JSch.f(str);
        if (s.a(f)) {
            return f;
        }
        return null;
    }

    public String x() {
        return this.g0;
    }

    public HostKeyRepository y() {
        HostKeyRepository hostKeyRepository = this.Z;
        return hostKeyRepository == null ? this.l0.h() : hostKeyRepository;
    }

    IdentityRepository z() {
        IdentityRepository identityRepository = this.Y;
        return identityRepository == null ? this.l0.i() : identityRepository;
    }
}
