/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import ax.d1.h;
import ax.i.s;
import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelForwardedTCPIP;
import com.jcraft.jsch.ChannelSession;
import com.jcraft.jsch.ChannelX11;
import com.jcraft.jsch.Cipher;
import com.jcraft.jsch.Compression;
import com.jcraft.jsch.ConfigRepository;
import com.jcraft.jsch.HASH;
import com.jcraft.jsch.HostKey;
import com.jcraft.jsch.HostKeyConf;
import com.jcraft.jsch.HostKeyRepository;
import com.jcraft.jsch.IO;
import com.jcraft.jsch.IdentityFile;
import com.jcraft.jsch.IdentityRepository;
import com.jcraft.jsch.IdentityRepositoryWrapper;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchChangedHostKeyException;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.JSchRevokedHostKeyException;
import com.jcraft.jsch.JSchSessionDisconnectException;
import com.jcraft.jsch.JSchStrictKexException;
import com.jcraft.jsch.JSchUnknownHostKeyException;
import com.jcraft.jsch.KeyExchange;
import com.jcraft.jsch.KnownHosts;
import com.jcraft.jsch.Logger;
import com.jcraft.jsch.MAC;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.PortWatcher;
import com.jcraft.jsch.Proxy;
import com.jcraft.jsch.Random;
import com.jcraft.jsch.ServerSocketFactory;
import com.jcraft.jsch.Signature;
import com.jcraft.jsch.SocketFactory;
import com.jcraft.jsch.UserInfo;
import com.jcraft.jsch.Util;
import com.jcraft.jsch.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Vector;
import javax.crypto.AEADBadTagException;

public class Session {
    static Random x0;
    private static final byte[] y0;
    private static final byte[] z0;
    private volatile boolean A;
    private boolean B;
    private boolean C;
    private volatile boolean D;
    private volatile boolean E;
    private boolean F;
    private boolean G;
    private volatile boolean H;
    private Thread I;
    private Object J;
    boolean K;
    boolean L;
    InputStream M;
    OutputStream N;
    Buffer O;
    Packet P;
    SocketFactory Q;
    private Hashtable<String, String> R;
    private Proxy S;
    private UserInfo T;
    private HostKeyConf U;
    private String V;
    private int W;
    private int X;
    private IdentityRepository Y;
    private HostKeyRepository Z;
    private byte[] a;
    private volatile String[] a0;
    private byte[] b;
    private volatile boolean b0;
    private byte[] c;
    protected boolean c0;
    private byte[] d;
    private long d0;
    private byte[] e;
    int e0;
    private byte[] f;
    int f0;
    private byte[] g;
    String g0;
    private byte[] h;
    String h0;
    private byte[] i;
    int i0;
    private byte[] j;
    String j0;
    private byte[] k;
    byte[] k0;
    private int l;
    JSch l0;
    private int m;
    Logger m0;
    String[] n;
    private volatile boolean n0;
    private Cipher o;
    private volatile boolean o0;
    private Cipher p;
    private volatile String[] p0;
    private MAC q;
    int[] q0;
    private MAC r;
    int[] r0;
    private byte[] s;
    private int s0;
    private byte[] t;
    private int t0;
    private Compression u;
    Runnable u0;
    private Compression v;
    private GlobalRequestReply v0;
    private IO w;
    private HostKey w0;
    private Socket x;
    private int y;
    private volatile boolean z;

    static {
        y0 = Util.v("keepalive@jcraft.com");
        z0 = Util.v("no-more-sessions@openssh.com");
    }

    Session(JSch jSch, String string, String string2, int n8) throws JSchException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SSH-2.0-JSCH_");
        stringBuilder.append(JSch.g);
        this.b = Util.v(stringBuilder.toString());
        this.l = 0;
        this.m = 0;
        this.n = null;
        this.y = 0;
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = false;
        this.F = true;
        this.G = false;
        this.H = false;
        this.I = null;
        this.J = new Object();
        this.K = false;
        this.L = false;
        this.M = null;
        this.N = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.V = null;
        this.W = 0;
        this.X = 1;
        this.Y = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = 0L;
        this.e0 = 6;
        this.f0 = 0;
        this.g0 = "127.0.0.1";
        this.h0 = "127.0.0.1";
        this.i0 = 22;
        this.j0 = null;
        this.k0 = null;
        this.n0 = false;
        this.o0 = false;
        this.p0 = null;
        this.q0 = new int[1];
        this.r0 = new int[1];
        this.s0 = 8;
        this.t0 = 8;
        this.v0 = new GlobalRequestReply();
        this.w0 = null;
        this.l0 = jSch;
        this.O = new Buffer();
        this.P = new Packet(this.O);
        this.j0 = string;
        this.g0 = string2;
        this.h0 = string2;
        this.i0 = n8;
        this.d();
        if (this.j0 == null) {
            this.j0 = Util.o("user.name");
        }
        if (this.j0 != null) {
            return;
        }
        throw new JSchException("username is not given.");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void H(String var1_1) throws JSchException {
        block10: {
            var3_4 = this.u;
            if (var1_1.equals("none")) {
                this.u = null;
                if (var3_4 == null) return;
                var3_4.a();
                return;
            }
            var4_5 = this.w((String)var1_1);
            if (var4_5 == null) return;
            if (!var1_1.equals("zlib")) {
                if (this.H == false) return;
                if (var1_1.equals("zlib@openssh.com") == false) return;
            }
            this.u = Class.forName(var4_5).asSubclass(Compression.class).getDeclaredConstructor(null).newInstance(null);
            ** GOTO lbl18
            {
                catch (Throwable var1_2) {
                    break block10;
                }
lbl18:
                // 1 sources

                try {
                    var2_7 = Integer.parseInt(this.w("compression_level"));
                }
                catch (Exception var1_3) {
                    var2_7 = 6;
                }
                try {
                    this.u.d(1, var2_7, this);
                    if (var3_4 == null) return;
                    var3_4.a();
                    return;
                }
                catch (Exception var4_6) {}
                {
                    var1_1 = new JSchException(var4_6.toString(), var4_6);
                    throw var1_1;
                }
            }
        }
        if (var3_4 == null) throw var1_2;
        var3_4.a();
        throw var1_2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void I(String object) throws JSchException {
        Throwable throwable2222222;
        Compression compression = this.v;
        if (((String)object).equals("none")) {
            this.v = null;
            if (compression == null) return;
            compression.a();
            return;
        }
        Object object2 = this.w((String)object);
        if (object2 == null || !((String)object).equals("zlib") && (!this.H || !((String)object).equals("zlib@openssh.com"))) return;
        this.v = object = Class.forName((String)object2).asSubclass(Compression.class).getDeclaredConstructor(null).newInstance(null);
        object.d(0, 0, this);
        if (compression == null) return;
        compression.a();
        return;
        {
            catch (Throwable throwable2222222) {
            }
            catch (Exception exception) {}
            {
                object2 = new JSchException(((Object)exception).toString(), exception);
                throw object2;
            }
        }
        if (compression == null) throw throwable2222222;
        compression.a();
        throw throwable2222222;
    }

    /*
     * WARNING - void declaration
     */
    private KeyExchange N(Buffer object) throws Exception {
        int n8 = ((Buffer)object).i();
        if (n8 != ((Buffer)object).j()) {
            ((Buffer)object).c();
            this.d = new byte[((Buffer)object).c - 5];
        } else {
            this.d = new byte[n8 - 1 - ((Buffer)object).c()];
        }
        byte[] byArray = ((Buffer)object).b;
        n8 = ((Buffer)object).d;
        object = this.d;
        System.arraycopy(byArray, n8, object, 0, ((Object)object).length);
        if (this.D) {
            if (this.F || this.G) {
                this.E = this.o();
                if (this.E) {
                    if (this.A().isEnabled(1)) {
                        this.A().a(1, "Doing strict KEX");
                    }
                    if (this.l != 1) {
                        throw new JSchStrictKexException("KEXINIT not first packet from server");
                    }
                } else if (this.G) {
                    throw new JSchStrictKexException("Strict KEX not supported by server");
                }
            }
            if (this.B) {
                this.A = this.n();
                if (this.A && this.A().isEnabled(1)) {
                    this.A().a(1, "ext-info messaging supported by server");
                }
            }
        }
        if (!this.n0) {
            this.T();
        }
        object = KeyExchange.l(this, this.d, this.c);
        this.n = object;
        if (!(object[0].equals("ext-info-c") || this.n[0].equals("ext-info-s") || this.n[0].equals("kex-strict-c-v00@openssh.com") || this.n[0].equals("kex-strict-s-v00@openssh.com"))) {
            Throwable var1_3;
            block18: {
                if (!this.H && (this.n[2].equals("none") || this.n[3].equals("none"))) {
                    throw new JSchException("NONE Cipher should not be chosen before authentification is successed.");
                }
                try {
                    object = Class.forName(this.w(this.n[0])).asSubclass(KeyExchange.class).getDeclaredConstructor(null).newInstance(null);
                }
                catch (NoClassDefFoundError noClassDefFoundError) {
                    break block18;
                }
                catch (Exception exception) {}
                ((KeyExchange)object).b(this, this.a, this.b, this.d, this.c);
                return object;
            }
            throw new JSchException(var1_3.toString(), (Throwable)var1_3);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Invalid Kex negotiated: ");
        ((StringBuilder)object).append(this.n[0]);
        throw new JSchException(((StringBuilder)object).toString());
    }

    private void O(Buffer buffer, KeyExchange keyExchange) throws Exception {
        try {
            this.l0(keyExchange);
            this.n0 = false;
            if (this.E) {
                this.l = 0;
                if (this.A().isEnabled(1)) {
                    this.A().a(1, "Reset incoming sequence number after receiving SSH_MSG_NEWKEYS for strict KEX");
                }
            }
            return;
        }
        finally {
            keyExchange.a();
        }
    }

    private void P() throws JSchException {
        String[] stringArray;
        if (!this.w("ClearAllForwardings").equals("yes") && (stringArray = this.l0.g()) != null) {
            int n8;
            stringArray = stringArray.a(this.h0);
            String[] stringArray2 = stringArray.b("LocalForward");
            int n9 = 0;
            if (stringArray2 != null) {
                for (n8 = 0; n8 < stringArray2.length; ++n8) {
                    this.b0(stringArray2[n8]);
                }
            }
            if ((stringArray = stringArray.b("RemoteForward")) != null) {
                for (n8 = n9; n8 < stringArray.length; ++n8) {
                    this.f0(stringArray[n8]);
                }
            }
        }
    }

    private void S() throws Exception {
        this.P.c();
        this.O.s((byte)7);
        this.O.v(1);
        this.O.y(Util.v("ext-info-in-auth@openssh.com"));
        this.O.y(Util.v("0"));
        this.m0(this.P);
        if (this.A().isEnabled(1)) {
            this.A().a(1, "SSH_MSG_EXT_INFO sent");
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void T() throws Exception {
        block37: {
            block36: {
                if (this.n0) {
                    return;
                }
                var4_1 /* !! */  = this.w("cipher.c2s");
                var3_2 = this.w("cipher.s2c");
                var7_3 = this.g(this.w("CheckCiphers"));
                var6_4 = var4_1 /* !! */ ;
                var5_5 = var3_2;
                if (var7_3 != null) {
                    var6_4 = var4_1 /* !! */ ;
                    var5_5 = var3_2;
                    if (((String[])var7_3).length > 0) {
                        if (this.A().isEnabled(0)) {
                            var5_5 = this.A();
                            var6_4 = new StringBuilder();
                            var6_4.append("cipher.c2s proposal before removing unavailable algos is: ");
                            var6_4.append((String)var4_1 /* !! */ );
                            var5_5.a(0, var6_4.toString());
                            var5_5 = this.A();
                            var6_4 = new StringBuilder();
                            var6_4.append("cipher.s2c proposal before removing unavailable algos is: ");
                            var6_4.append((String)var3_2);
                            var5_5.a(0, var6_4.toString());
                        }
                        var4_1 /* !! */  = Util.j((String)var4_1 /* !! */ , (String[])var7_3);
                        var3_2 = Util.j((String)var3_2, (String[])var7_3);
                        if (var4_1 /* !! */  == null) throw new JSchException("There are not any available ciphers.");
                        if (var3_2 == null) throw new JSchException("There are not any available ciphers.");
                        var6_4 = var4_1 /* !! */ ;
                        var5_5 = var3_2;
                        if (this.A().isEnabled(0)) {
                            var5_5 = this.A();
                            var6_4 = new StringBuilder();
                            var6_4.append("cipher.c2s proposal after removing unavailable algos is: ");
                            var6_4.append((String)var4_1 /* !! */ );
                            var5_5.a(0, var6_4.toString());
                            var5_5 = this.A();
                            var6_4 = new StringBuilder();
                            var6_4.append("cipher.s2c proposal after removing unavailable algos is: ");
                            var6_4.append((String)var3_2);
                            var5_5.a(0, var6_4.toString());
                            var6_4 = var4_1 /* !! */ ;
                            var5_5 = var3_2;
                        }
                    }
                }
                var7_3 = this.w("mac.c2s");
                var3_2 = this.w("mac.s2c");
                var4_1 /* !! */  = this.m(this.w("CheckMacs"));
                if (var4_1 /* !! */  != null && var4_1 /* !! */ .length > 0) {
                    if (this.A().isEnabled(0)) {
                        var8_6 = this.A();
                        var9_7 = new StringBuilder();
                        var9_7.append("mac.c2s proposal before removing unavailable algos is: ");
                        var9_7.append((String)var7_3);
                        var8_6.a(0, var9_7.toString());
                        var8_6 = this.A();
                        var9_7 = new StringBuilder();
                        var9_7.append("mac.s2c proposal before removing unavailable algos is: ");
                        var9_7.append((String)var3_2);
                        var8_6.a(0, var9_7.toString());
                    }
                    var7_3 = Util.j((String)var7_3, var4_1 /* !! */ );
                    var3_2 = Util.j((String)var3_2, var4_1 /* !! */ );
                    if (var7_3 == null) throw new JSchException("There are not any available macs.");
                    if (var3_2 == null) throw new JSchException("There are not any available macs.");
                    if (this.A().isEnabled(0)) {
                        var4_1 /* !! */  = this.A();
                        var8_6 = new StringBuilder();
                        var8_6.append("mac.c2s proposal after removing unavailable algos is: ");
                        var8_6.append((String)var7_3);
                        var4_1 /* !! */ .a(0, var8_6.toString());
                        var7_3 = this.A();
                        var4_1 /* !! */  = new StringBuilder();
                        var4_1 /* !! */ .append("mac.s2c proposal after removing unavailable algos is: ");
                        var4_1 /* !! */ .append((String)var3_2);
                        var7_3.a(0, var4_1 /* !! */ .toString());
                    }
                }
                var4_1 /* !! */  = this.w("kex");
                var7_3 = this.k(this.w("CheckKexes"));
                var3_2 = var4_1 /* !! */ ;
                if (var7_3 != null) {
                    var3_2 = var4_1 /* !! */ ;
                    if (((String[])var7_3).length > 0) {
                        if (this.A().isEnabled(0)) {
                            var3_2 = this.A();
                            var8_6 = new StringBuilder();
                            var8_6.append("kex proposal before removing unavailable algos is: ");
                            var8_6.append((String)var4_1 /* !! */ );
                            var3_2.a(0, var8_6.toString());
                        }
                        if ((var4_1 /* !! */  = Util.j((String)var4_1 /* !! */ , (String[])var7_3)) == null) throw new JSchException("There are not any available kexes.");
                        var3_2 = var4_1 /* !! */ ;
                        if (this.A().isEnabled(0)) {
                            var3_2 = this.A();
                            var7_3 = new StringBuilder();
                            var7_3.append("kex proposal after removing unavailable algos is: ");
                            var7_3.append((String)var4_1 /* !! */ );
                            var3_2.a(0, var7_3.toString());
                            var3_2 = var4_1 /* !! */ ;
                        }
                    }
                }
                var4_1 /* !! */  = var3_2;
                if (this.B) {
                    var4_1 /* !! */  = var3_2;
                    if (!this.H) {
                        var4_1 /* !! */  = new StringBuilder();
                        var4_1 /* !! */ .append((String)var3_2);
                        var4_1 /* !! */ .append(",ext-info-c");
                        var4_1 /* !! */  = var4_1 /* !! */ .toString();
                    }
                }
                if (this.F) break block36;
                var7_3 = var4_1 /* !! */ ;
                if (!this.G) break block37;
            }
            var7_3 = var4_1 /* !! */ ;
            if (this.D) {
                var3_2 = new StringBuilder();
                var3_2.append((String)var4_1 /* !! */ );
                var3_2.append(",kex-strict-c-v00@openssh.com");
                var7_3 = var3_2.toString();
            }
        }
        var4_1 /* !! */  = this.w("server_host_key");
        var8_6 = this.p(this.w("CheckSignatures"));
        this.p0 = var8_6;
        var3_2 = var4_1 /* !! */ ;
        if (var8_6 != null) {
            var3_2 = var4_1 /* !! */ ;
            if (((String[])var8_6).length > 0) {
                if (this.A().isEnabled(0)) {
                    var3_2 = this.A();
                    var9_7 = new StringBuilder();
                    var9_7.append("server_host_key proposal before removing unavailable algos is: ");
                    var9_7.append((String)var4_1 /* !! */ );
                    var3_2.a(0, var9_7.toString());
                }
                if ((var4_1 /* !! */  = Util.j((String)var4_1 /* !! */ , (String[])var8_6)) == null) throw new JSchException("There are not any available sig algorithm.");
                var3_2 = var4_1 /* !! */ ;
                if (this.A().isEnabled(0)) {
                    var8_6 = this.A();
                    var3_2 = new StringBuilder();
                    var3_2.append("server_host_key proposal after removing unavailable algos is: ");
                    var3_2.append((String)var4_1 /* !! */ );
                    var8_6.a(0, var3_2.toString());
                    var3_2 = var4_1 /* !! */ ;
                }
            }
        }
        var8_6 = var3_2;
        if (!this.w("prefer_known_host_key_types").equals("yes")) ** GOTO lbl219
        if (this.A().isEnabled(0)) {
            var4_1 /* !! */  = this.A();
            var8_6 = new StringBuilder();
            var8_6.append("server_host_key proposal before known_host reordering is: ");
            var8_6.append((String)var3_2);
            var4_1 /* !! */ .a(0, var8_6.toString());
        }
        var10_8 = this.y();
        var4_1 /* !! */  = this.g0;
        var9_7 = this.V;
        if (var9_7 != null) {
            var4_1 /* !! */  = var9_7;
        }
        var8_6 = var4_1 /* !! */ ;
        if (var9_7 == null) {
            var8_6 = var4_1 /* !! */ ;
            if (this.i0 != 22) {
                var8_6 = new StringBuilder();
                var8_6.append("[");
                var8_6.append((String)var4_1 /* !! */ );
                var8_6.append("]:");
                var8_6.append(this.i0);
                var8_6 = var8_6.toString();
            }
        }
        var10_8 = var10_8.e((String)var8_6, null);
        var4_1 /* !! */  = var3_2;
        if (var10_8 == null) ** GOTO lbl209
        var4_1 /* !! */  = var3_2;
        if (var10_8.length <= 0) ** GOTO lbl209
        var9_7 = new ArrayList<Object>();
        var11_9 = new ArrayList<String>(Arrays.asList(Util.u((String)var3_2, ",")));
        var12_10 = var11_9.iterator();
        block3: while (true) {
            if (var12_10.hasNext()) {
                var8_6 = (String)var12_10.next();
                var4_1 /* !! */  = !(var8_6.equals("rsa-sha2-256") || var8_6.equals("rsa-sha2-512") || var8_6.equals("ssh-rsa-sha224@ssh.com") || var8_6.equals("ssh-rsa-sha256@ssh.com") || var8_6.equals("ssh-rsa-sha384@ssh.com") || var8_6.equals("ssh-rsa-sha512@ssh.com")) ? var8_6 : "ssh-rsa";
            } else {
                var4_1 /* !! */  = var3_2;
                if (var9_7.size() > 0) {
                    var9_7.addAll(var11_9);
                    var4_1 /* !! */  = ax.d1.h.a(",", var9_7);
                }
lbl209:
                // 5 sources

                var8_6 = var4_1 /* !! */ ;
                if (this.A().isEnabled(0)) {
                    var8_6 = this.A();
                    var3_2 = new StringBuilder();
                    var3_2.append("server_host_key proposal after known_host reordering is: ");
                    var3_2.append((String)var4_1 /* !! */ );
                    var8_6.a(0, var3_2.toString());
                    var8_6 = var4_1 /* !! */ ;
                }
lbl219:
                // 4 sources

                this.n0 = true;
                this.d0 = System.currentTimeMillis();
                var9_7 = new Buffer();
                var3_2 = new Packet((Buffer)var9_7);
                var3_2.c();
                var9_7.s((byte)20);
                var4_1 /* !! */  = Session.x0;
                synchronized (var4_1 /* !! */ ) {
                    Session.x0.a(var9_7.b, var9_7.c, 16);
                    var9_7.E(16);
                }
                var9_7.y(Util.v((String)var7_3));
                var9_7.y(Util.v((String)var8_6));
                var9_7.y(Util.v((String)var6_4));
                var9_7.y(Util.v((String)var5_5));
                var9_7.y(Util.v(this.w("mac.c2s")));
                var9_7.y(Util.v(this.w("mac.s2c")));
                var9_7.y(Util.v(this.w("compression.c2s")));
                var9_7.y(Util.v(this.w("compression.s2c")));
                var9_7.y(Util.v(this.w("lang.c2s")));
                var9_7.y(Util.v(this.w("lang.s2c")));
                var9_7.s((byte)0);
                var9_7.v(0);
                var9_7.C(5);
                var4_1 /* !! */  = (String[])new byte[var9_7.j()];
                this.c = (byte[])var4_1 /* !! */ ;
                var9_7.e((byte[])var4_1 /* !! */ );
                this.m0((Packet)var3_2);
                if (this.A().isEnabled(1) == false) return;
                this.A().a(1, "SSH_MSG_KEXINIT sent");
                return;
            }
            var2_12 = var10_8.length;
            var1_11 = 0;
            while (true) {
                if (var1_11 >= var2_12) continue block3;
                if (var10_8[var1_11].f().equals(var4_1 /* !! */ )) {
                    var9_7.add(var8_6);
                    var12_10.remove();
                    continue block3;
                }
                ++var1_11;
            }
            break;
        }
    }

    private void U() throws Exception {
        this.P.c();
        this.O.s((byte)21);
        this.m0(this.P);
        if (this.A().isEnabled(1)) {
            this.A().a(1, "SSH_MSG_NEWKEYS sent");
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int a(String object, int n8) throws JSchException {
        GlobalRequestReply globalRequestReply = this.v0;
        synchronized (globalRequestReply) {
            try {
                int n9;
                int n10;
                Buffer buffer = new Buffer(200);
                Object object2 = new Packet(buffer);
                object = ChannelForwardedTCPIP.L((String)object);
                this.v0.f(Thread.currentThread());
                this.v0.d(n8);
                try {
                    ((Packet)object2).c();
                    buffer.s((byte)80);
                    buffer.y(Util.v("tcpip-forward"));
                    buffer.s((byte)1);
                    buffer.y(Util.v((String)object));
                    buffer.v(n8);
                    this.m0((Packet)object2);
                    n10 = this.v0.b();
                    n9 = 0;
                }
                catch (Exception exception) {
                    this.v0.f(null);
                    object2 = new JSchException(((Object)exception).toString(), exception);
                    throw object2;
                }
                while (true) {
                    if (n9 < 10 && n10 == -1) {
                        Thread.sleep(1000L);
                    }
                    this.v0.f(null);
                    if (n10 == 1) {
                        return this.v0.a();
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("remote port forwarding failed for listen port ");
                    ((StringBuilder)object2).append(n8);
                    object = new JSchException(((StringBuilder)object2).toString());
                    throw object;
                    catch (Exception exception) {}
                    ++n9;
                    n10 = this.v0.b();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(Packet object) throws Exception {
        boolean bl = this.D;
        boolean bl2 = this.E;
        boolean bl3 = this.F;
        boolean bl4 = this.G;
        boolean bl5 = ((Packet)object).a.h() == 21 && bl2;
        Object object2 = this.J;
        synchronized (object2) {
            try {
                this.t((Packet)object);
                IO iO = this.w;
                if (iO != null) {
                    int n8;
                    iO.e((Packet)object);
                    this.m = n8 = this.m + 1;
                    if (n8 == 0 && (bl3 || bl4) && bl) {
                        object = new JSchStrictKexException("outgoing sequence number wrapped during initial KEX");
                        throw object;
                    }
                    if (bl5) {
                        this.m = 0;
                    }
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl19 : MonitorExitStatement: MONITOREXIT : var8_8
                if (bl5 && this.w != null && this.A().isEnabled(1)) {
                    this.A().a(1, "Reset outgoing sequence number after sending SSH_MSG_NEWKEYS for strict KEX");
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private void d() throws JSchException {
        Object object = this.l0.g();
        if (object != null) {
            String[] stringArray;
            Object object2;
            int n8;
            Object object3;
            ConfigRepository.Config config = object.a(this.h0);
            if (this.j0 == null && (object3 = config.c()) != null) {
                this.j0 = object3;
            }
            if ((object3 = config.d()) != null) {
                this.g0 = object3;
            }
            if ((n8 = config.a()) != -1) {
                this.i0 = n8;
            }
            this.h(config, "kex");
            this.h(config, "server_host_key");
            this.h(config, "prefer_known_host_key_types");
            this.h(config, "enable_server_sig_algs");
            this.h(config, "enable_ext_info_in_auth");
            this.h(config, "enable_strict_kex");
            this.h(config, "require_strict_kex");
            this.h(config, "enable_pubkey_auth_query");
            this.h(config, "try_additional_pubkey_algorithms");
            this.h(config, "enable_auth_none");
            this.h(config, "use_sftp_write_flush_workaround");
            this.h(config, "cipher.c2s");
            this.h(config, "cipher.s2c");
            this.h(config, "mac.c2s");
            this.h(config, "mac.s2c");
            this.h(config, "compression.c2s");
            this.h(config, "compression.s2c");
            this.h(config, "compression_level");
            this.h(config, "StrictHostKeyChecking");
            this.h(config, "HashKnownHosts");
            this.h(config, "PreferredAuthentications");
            this.h(config, "PubkeyAcceptedAlgorithms");
            this.h(config, "FingerprintHash");
            this.h(config, "MaxAuthTries");
            this.h(config, "ClearAllForwardings");
            object3 = config.getValue("HostKeyAlias");
            if (object3 != null) {
                this.W((String)object3);
            }
            if ((object3 = config.getValue("UserKnownHostsFile")) != null) {
                object2 = new KnownHosts(this.l0);
                ((KnownHosts)object2).o((String)object3);
                this.Y((HostKeyRepository)object2);
            }
            if ((stringArray = config.b("IdentityFile")) != null) {
                object3 = object.a("").b("IdentityFile");
                if (object3 != null) {
                    n8 = 0;
                    while (true) {
                        object = object3;
                        if (n8 < ((String[])object3).length) {
                            this.l0.b(object3[n8]);
                            ++n8;
                            continue;
                        }
                        break;
                    }
                } else {
                    object = new String[]{};
                }
                if (stringArray.length - ((String[])object).length > 0) {
                    IdentityRepositoryWrapper identityRepositoryWrapper = new IdentityRepositoryWrapper(this.l0.i(), true);
                    for (n8 = 0; n8 < stringArray.length; ++n8) {
                        block22: {
                            object2 = stringArray[n8];
                            int n9 = 0;
                            while (true) {
                                object3 = object2;
                                if (n9 >= ((String[])object).length) break block22;
                                if (((String)object2).equals(object[n9])) break;
                                ++n9;
                            }
                            object3 = null;
                        }
                        if (object3 == null) continue;
                        identityRepositoryWrapper.e(IdentityFile.h((String)object3, null, this.l0.a));
                    }
                    this.Z(identityRepositoryWrapper);
                }
            }
            if ((object = config.getValue("ServerAliveInterval")) != null) {
                try {
                    this.g0(Integer.parseInt((String)object));
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
            }
            if ((object = config.getValue("ConnectTimeout")) != null) {
                try {
                    this.i0(Integer.parseInt((String)object));
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
            }
            if ((object = config.getValue("MaxAuthTries")) != null) {
                this.V("MaxAuthTries", (String)object);
            }
            if ((object = config.getValue("ClearAllForwardings")) != null) {
                this.V("ClearAllForwardings", (String)object);
            }
        }
    }

    private void e(ChannelSession channelSession) throws JSchException {
        Object object = this.l0.g();
        if (object != null) {
            ConfigRepository.Config config = object.a(this.h0);
            if ((object = config.getValue("ForwardAgent")) != null) {
                channelSession.H(((String)object).equals("yes"));
            }
            if ((object = config.getValue("RequestTTY")) != null) {
                channelSession.I(((String)object).equals("yes"));
            }
        }
    }

    static boolean f(String object) {
        try {
            object = Class.forName((String)object).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null);
            object.k(0, new byte[object.d()], new byte[object.l()]);
            return true;
        }
        catch (Exception | NoClassDefFoundError throwable) {
            return false;
        }
    }

    private String[] g(String object) {
        Object object2;
        Object object3 = object2 = null;
        if (object != null) {
            if (object.length() == 0) {
                object3 = object2;
            } else {
                int n8;
                if (this.A().isEnabled(1)) {
                    object3 = this.A();
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("CheckCiphers: ");
                    ((StringBuilder)object2).append((String)object);
                    object3.a(1, ((StringBuilder)object2).toString());
                }
                object2 = this.w("cipher.c2s");
                String string = this.w("cipher.s2c");
                object3 = new Vector();
                String[] stringArray = Util.u((String)object, ",");
                int n9 = 0;
                for (n8 = 0; n8 < stringArray.length; ++n8) {
                    object = stringArray[n8];
                    if (string.indexOf((String)object) == -1 && ((String)object2).indexOf((String)object) == -1 || Session.f(this.w((String)object))) continue;
                    ((Vector)object3).addElement(object);
                }
                if (((Vector)object3).size() == 0) {
                    return null;
                }
                int n10 = ((Vector)object3).size();
                object = new String[n10];
                System.arraycopy(((Vector)object3).toArray(), 0, object, 0, ((Vector)object3).size());
                object3 = object;
                if (this.A().isEnabled(1)) {
                    n8 = n9;
                    while (true) {
                        object3 = object;
                        if (n8 >= n10) break;
                        object2 = this.A();
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append(object[n8]);
                        ((StringBuilder)object3).append(" is not available.");
                        object2.a(1, ((StringBuilder)object3).toString());
                        ++n8;
                    }
                }
            }
        }
        return object3;
    }

    private void h(ConfigRepository.Config config, String string) {
        String string2;
        String string3 = string2 = config.getValue(string);
        if (string2 == null) {
            string3 = string2;
            if (string.equals("PubkeyAcceptedAlgorithms")) {
                string3 = config.getValue("PubkeyAcceptedKeyTypes");
            }
        }
        if (string3 != null) {
            this.V(string, string3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void i(String var1_1, int var2_2, KeyExchange var3_3) throws JSchException {
        block41: {
            block40: {
                block39: {
                    block38: {
                        var8_4 = this.U;
                        var9_5 = var8_4 != null ? var8_4.c() : this.w("StrictHostKeyChecking");
                        var8_4 = this.V;
                        if (var8_4 != null) {
                            var1_1 = var8_4;
                        }
                        var14_6 = var3_3.g();
                        var11_7 = var3_3.j();
                        var13_8 = var3_3.d();
                        var8_4 = var1_1;
                        if (this.V == null) {
                            var8_4 = var1_1;
                            if (var2_2 != 22) {
                                var8_4 = new StringBuilder();
                                var8_4.append("[");
                                var8_4.append((String)var1_1);
                                var8_4.append("]:");
                                var8_4.append(var2_2);
                                var8_4 = var8_4.toString();
                            }
                        }
                        var12_9 = this.y();
                        this.w0 = this.w("HashKnownHosts").equals("yes") != false && var12_9 instanceof KnownHosts != false ? ((KnownHosts)var12_9).i((String)var8_4, var14_6) : new HostKey((String)var8_4, var14_6);
                        var1_1 = this.U;
                        if (var1_1 != null) {
                            var1_1.a(this.w0, var11_7, var13_8);
                            if (this.U.b()) {
                                return;
                            }
                        }
                        synchronized (var12_9) {
                            var6_10 = var12_9.c((String)var8_4, var14_6);
                        }
                        var7_11 = var9_5.equals("ask");
                        var5_12 = 0;
                        if (!var7_11 && !var9_5.equals("yes") || var6_10 != 2) break block38;
                        synchronized (var12_9) {
                            var10_13 = var12_9.a();
                        }
                        var1_1 = var10_13;
                        if (var10_13 == null) {
                            var1_1 = "known_hosts";
                        }
                        if (this.T == null) ** GOTO lbl75
                        var10_13 = new StringBuilder();
                        var10_13.append("WARNING: REMOTE HOST IDENTIFICATION HAS CHANGED!\nIT IS POSSIBLE THAT SOMEONE IS DOING SOMETHING NASTY!\nSomeone could be eavesdropping on you right now (man-in-the-middle attack)!\nIt is also possible that the ");
                        var10_13.append(var11_7);
                        var10_13.append(" host key has just been changed.\nThe fingerprint for the ");
                        var10_13.append(var11_7);
                        var10_13.append(" key sent by the remote host ");
                        var10_13.append((String)var8_4);
                        var10_13.append(" is\n");
                        var10_13.append(var13_8);
                        var10_13.append(".\nPlease contact your system administrator.\nAdd correct host key in ");
                        var10_13.append((String)var1_1);
                        var10_13.append(" to get rid of this message.");
                        var15_14 = var10_13.toString();
                        if (var9_5.equals("ask")) {
                            var10_13 = this.T;
                            var1_1 = new StringBuilder();
                            var1_1.append(var15_14);
                            var1_1.append("\nDo you want to delete the old key and insert the new key?");
                            var7_11 = var10_13.g(var1_1.toString());
                        } else {
                            this.T.d(var15_14);
lbl75:
                            // 2 sources

                            var7_11 = false;
                        }
                        if (!var7_11) {
                            var1_1 = new StringBuilder();
                            var1_1.append("HostKey has been changed: ");
                            var1_1.append((String)var8_4);
                            throw new JSchChangedHostKeyException(var1_1.toString());
                        }
                        synchronized (var12_9) {
                            var12_9.d((String)var8_4, var3_3.i(), null);
                        }
                        var4_15 = 1;
                        break block39;
                    }
                    var4_15 = 0;
                }
                if (var9_5.equals("ask")) break block40;
                var2_2 = var4_15;
                if (!var9_5.equals("yes")) break block41;
            }
            var2_2 = var4_15;
            if (var6_10 != 0) {
                var2_2 = var4_15;
                if (var4_15 == 0) {
                    if (var9_5.equals("yes")) {
                        if (var6_10 == 1) {
                            var1_1 = new StringBuilder();
                            var1_1.append("UnknownHostKey: ");
                            var1_1.append((String)var8_4);
                            var1_1.append(". ");
                            var1_1.append(var11_7);
                            var1_1.append(" key fingerprint is ");
                            var1_1.append(var13_8);
                            throw new JSchUnknownHostKeyException(var1_1.toString());
                        }
                        var1_1 = new StringBuilder();
                        var1_1.append("HostKey has been changed: ");
                        var1_1.append((String)var8_4);
                        throw new JSchChangedHostKeyException(var1_1.toString());
                    }
                    var10_13 = this.T;
                    if (var10_13 != null) {
                        var1_1 = new StringBuilder();
                        var1_1.append("The authenticity of host '");
                        var1_1.append((String)var8_4);
                        var1_1.append("' can't be established.\n");
                        var1_1.append(var11_7);
                        var1_1.append(" key fingerprint is ");
                        var1_1.append(var13_8);
                        var1_1.append(".\nAre you sure you want to continue connecting?");
                        if (!var10_13.g(var1_1.toString())) {
                            var1_1 = new StringBuilder();
                            var1_1.append("reject HostKey: ");
                            var1_1.append((String)var8_4);
                            throw new JSchException(var1_1.toString());
                        }
                        var2_2 = 1;
                    } else {
                        if (var6_10 == 1) {
                            var1_1 = new StringBuilder();
                            var1_1.append("UnknownHostKey: ");
                            var1_1.append((String)var8_4);
                            var1_1.append(". ");
                            var1_1.append(var11_7);
                            var1_1.append(" key fingerprint is ");
                            var1_1.append(var13_8);
                            throw new JSchUnknownHostKeyException(var1_1.toString());
                        }
                        var1_1 = new StringBuilder();
                        var1_1.append("HostKey has been changed: ");
                        var1_1.append((String)var8_4);
                        throw new JSchChangedHostKeyException(var1_1.toString());
                    }
                }
            }
        }
        var4_15 = var2_2;
        if (var9_5.equals("no")) {
            var4_15 = var2_2;
            if (1 == var6_10) {
                var4_15 = 1;
            }
        }
        if (var6_10 == 0) {
            var1_1 = var12_9.e((String)var8_4, var3_3.i());
            var3_3 = Util.c(Util.x(var14_6, 0, var14_6.length, true));
            for (var2_2 = var5_12; var2_2 < ((Object)var1_1).length; ++var2_2) {
                if (!var1_1[var2_2].d().equals(var3_3) || !var1_1[var2_2].e().equals("@revoked")) continue;
                var3_3 = this.T;
                if (var3_3 != null) {
                    var1_1 = new StringBuilder();
                    var1_1.append("The ");
                    var1_1.append(var11_7);
                    var1_1.append(" host key for ");
                    var1_1.append((String)var8_4);
                    var1_1.append(" is marked as revoked.\nThis could mean that a stolen key is being used to impersonate this host.");
                    var3_3.d(var1_1.toString());
                }
                if (this.A().isEnabled(1)) {
                    var3_3 = this.A();
                    var1_1 = new StringBuilder();
                    var1_1.append("Host '");
                    var1_1.append((String)var8_4);
                    var1_1.append("' has provided revoked key.");
                    var3_3.a(1, var1_1.toString());
                }
                var1_1 = new StringBuilder();
                var1_1.append("revoked HostKey: ");
                var1_1.append((String)var8_4);
                throw new JSchRevokedHostKeyException(var1_1.toString());
            }
        }
        if (var6_10 == 0 && this.A().isEnabled(1)) {
            var1_1 = this.A();
            var3_3 = new StringBuilder();
            var3_3.append("Host '");
            var3_3.append((String)var8_4);
            var3_3.append("' is known and matches the ");
            var3_3.append(var11_7);
            var3_3.append(" host key");
            var1_1.a(1, var3_3.toString());
        }
        if (var4_15 != 0 && this.A().isEnabled(2)) {
            var1_1 = this.A();
            var3_3 = new StringBuilder();
            var3_3.append("Permanently added '");
            var3_3.append((String)var8_4);
            var3_3.append("' (");
            var3_3.append(var11_7);
            var3_3.append(") to the list of known hosts.");
            var1_1.a(2, var3_3.toString());
        }
        if (var4_15 == 0) return;
        synchronized (var12_9) {
            var12_9.b(this.w0, this.T);
            return;
        }
    }

    static boolean j(Session session, String string) {
        try {
            Class.forName(string).asSubclass(KeyExchange.class).getDeclaredConstructor(null).newInstance(null).b(session, null, null, null, null);
            return true;
        }
        catch (Exception | NoClassDefFoundError throwable) {
            return false;
        }
    }

    private String[] k(String stringArray) {
        Object object;
        Object object2 = object = null;
        if (stringArray != null) {
            if (stringArray.length() == 0) {
                object2 = object;
            } else {
                int n8;
                if (this.A().isEnabled(1)) {
                    object2 = this.A();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("CheckKexes: ");
                    ((StringBuilder)object).append((String)stringArray);
                    object2.a(1, ((StringBuilder)object).toString());
                }
                object2 = new Vector();
                stringArray = Util.u((String)stringArray, ",");
                int n9 = 0;
                for (n8 = 0; n8 < stringArray.length; ++n8) {
                    if (Session.j(this, this.w(stringArray[n8]))) continue;
                    ((Vector)object2).addElement(stringArray[n8]);
                }
                if (((Vector)object2).size() == 0) {
                    return null;
                }
                int n10 = ((Vector)object2).size();
                stringArray = new String[n10];
                System.arraycopy(((Vector)object2).toArray(), 0, stringArray, 0, ((Vector)object2).size());
                object2 = stringArray;
                if (this.A().isEnabled(1)) {
                    n8 = n9;
                    while (true) {
                        object2 = stringArray;
                        if (n8 >= n10) break;
                        object2 = this.A();
                        object = new StringBuilder();
                        ((StringBuilder)object).append(stringArray[n8]);
                        ((StringBuilder)object).append(" is not available.");
                        object2.a(1, ((StringBuilder)object).toString());
                        ++n8;
                    }
                }
            }
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k0(Buffer object, Cipher object2, MAC mAC, int n8, int n9) throws JSchException {
        Object object3;
        block11: {
            int n10;
            if (object2.i() && (mAC == null || !mAC.f())) {
                n10 = n9;
                if (mAC != null) {
                    mAC.e(this.l);
                    mAC.b(((Buffer)object).b, 0, n8);
                    n10 = n9;
                }
            } else {
                throw new JSchException("Packet corrupt");
            }
            while (n10 > 0) {
                IOException iOException2;
                block10: {
                    try {
                        ((Buffer)object).A();
                        object2 = ((Buffer)object).b;
                        n8 = n10 > ((Object)object2).length ? ((Object)object2).length : n10;
                    }
                    catch (IOException iOException2) {
                        break block10;
                    }
                    this.w.c((byte[])object2, 0, n8);
                    if (mAC != null) {
                        mAC.b(((Buffer)object).b, 0, n8);
                    }
                    n10 -= n8;
                    continue;
                }
                object3 = iOException2;
                if (this.A().isEnabled(3)) {
                    object3 = this.A();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("start_discard finished early due to ");
                    stringBuilder.append(iOException2.getMessage());
                    object3.b(3, stringBuilder.toString(), iOException2);
                    object3 = iOException2;
                }
                break block11;
            }
            object3 = null;
        }
        if (mAC != null) {
            mAC.c(((Buffer)object).b, 0);
        }
        object = new JSchException("Packet corrupt");
        if (object3 != null) {
            ((Throwable)object).addSuppressed((Throwable)object3);
        }
        throw object;
    }

    static boolean l(String object) {
        try {
            object = Class.forName((String)object).asSubclass(MAC.class).getDeclaredConstructor(null).newInstance(null);
            object.a(new byte[object.d()]);
            return true;
        }
        catch (Exception | NoClassDefFoundError throwable) {
            return false;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l0(KeyExchange var1_1) throws Exception {
        block15: {
            block16: {
                var5_9 = var1_1.h();
                var6_10 = var1_1.e();
                var1_1 = var1_1.f();
                if (this.e == null) {
                    var7_11 = new byte[var6_10.length];
                    this.e = var7_11;
                    System.arraycopy(var6_10, 0, var7_11, 0, var6_10.length);
                }
                this.O.A();
                this.O.t(var5_9);
                this.O.t(var6_10);
                this.O.s((byte)65);
                this.O.t(this.e);
                var7_11 = this.O;
                var1_1.b(var7_11.b, 0, var7_11.c);
                this.f = var1_1.c();
                var7_11 = this.O;
                var2_12 = var7_11.c;
                var3_13 = var2_12 - this.e.length - 1;
                var7_11 = var7_11.b;
                var7_11[var3_13] = (byte)(var7_11[var3_13] + 1);
                var1_1.b((byte[])var7_11, 0, var2_12);
                this.g = var1_1.c();
                var8_14 = this.O;
                var7_11 = var8_14.b;
                var7_11[var3_13] = (byte)(var7_11[var3_13] + 1);
                var1_1.b((byte[])var7_11, 0, var8_14.c);
                this.h = var1_1.c();
                var7_11 = this.O;
                var8_14 = var7_11.b;
                var8_14[var3_13] = (byte)(var8_14[var3_13] + true);
                var1_1.b((byte[])var8_14, 0, var7_11.c);
                this.i = var1_1.c();
                var8_14 = this.O;
                var7_11 = var8_14.b;
                var7_11[var3_13] = (byte)(var7_11[var3_13] + 1);
                var1_1.b((byte[])var7_11, 0, var8_14.c);
                this.j = var1_1.c();
                var8_14 = this.O;
                var7_11 = var8_14.b;
                var7_11[var3_13] = (byte)(var7_11[var3_13] + 1);
                var1_1.b((byte[])var7_11, 0, var8_14.c);
                this.k = var1_1.c();
                this.o = Class.forName(this.w(this.n[3])).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null);
lbl45:
                // 2 sources

                while ((var3_13 = this.o.d()) > (var2_12 = ((byte[])(var7_11 = this.i)).length)) {
                    ** GOTO lbl52
                }
                ** GOTO lbl-1000
                {
                    catch (NoClassDefFoundError var1_7) {
                        break block15;
                    }
                    catch (Exception var1_8) {
                        break block15;
                    }
lbl52:
                    // 1 sources

                    try {
                        this.O.A();
                        this.O.t(var5_9);
                        this.O.t(var6_10);
                        this.O.t(this.i);
                        var7_11 = this.O;
                        var1_1.b(var7_11.b, 0, var7_11.c);
                        var8_14 = var1_1.c();
                        var9_15 = this.i;
                        var7_11 = new byte[var9_15.length + ((Object)var8_14).length];
                        System.arraycopy(var9_15, 0, var7_11, 0, var9_15.length);
                        System.arraycopy(var8_14, 0, var7_11, this.i.length, ((Object)var8_14).length);
                        this.i = var7_11;
                        ** GOTO lbl45
                    }
                    catch (NoClassDefFoundError var1_2) {
                        break block15;
                    }
                    catch (Exception var1_4) {
                        break block15;
                    }
lbl-1000:
                    // 1 sources

                    {
                        this.o.k(1, (byte[])var7_11, this.g);
                        this.s0 = this.o.l();
                        var4_16 = this.o.m();
                        if (var4_16) break block16;
                        this.q = var8_14 = Class.forName(this.w(this.n[5])).asSubclass(MAC.class).getDeclaredConstructor(null).newInstance(null);
                        var7_11 = this.O;
                        var9_15 = this.k;
                        var2_12 = var8_14.d();
                    }
                    ** try [egrp 3[TRYBLOCK] [11, 10 : 670->1072)] { 
lbl79:
                    // 1 sources

                    var7_11 = this.u((Buffer)var7_11, var5_9, var6_10, var9_15, (HASH)var1_1, var2_12);
                    this.k = var7_11;
                    this.q.a((byte[])var7_11);
                    this.s = new byte[this.q.d()];
                    this.t = new byte[this.q.d()];
                }
lbl85:
                // 1 sources

                catch (NoClassDefFoundError var1_5) {
                    break block15;
                }
lbl87:
                // 1 sources

                catch (Exception var1_6) {
                    break block15;
                }
            }
            this.p = Class.forName(this.w(this.n[2])).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null);
            while ((var2_12 = this.p.d()) > ((byte[])(var7_11 = this.h)).length) {
                this.O.A();
                this.O.t(var5_9);
                this.O.t(var6_10);
                this.O.t(this.h);
                var7_11 = this.O;
                var1_1.b(var7_11.b, 0, var7_11.c);
                var9_15 = var1_1.c();
                var7_11 = this.h;
                var8_14 = new byte[((byte[])var7_11).length + var9_15.length];
                System.arraycopy(var7_11, 0, var8_14, 0, ((Object)var7_11).length);
                System.arraycopy(var9_15, 0, var8_14, this.h.length, var9_15.length);
                this.h = (byte[])var8_14;
            }
            this.p.k(0, (byte[])var7_11, this.f);
            this.t0 = this.p.l();
            if (!this.p.m()) {
                var7_11 = Class.forName(this.w(this.n[4])).asSubclass(MAC.class).getDeclaredConstructor(null).newInstance(null);
                this.r = var7_11;
                var1_1 = this.u(this.O, var5_9, var6_10, this.j, (HASH)var1_1, var7_11.d());
                this.j = (byte[])var1_1;
                this.r.a((byte[])var1_1);
            }
            this.H(this.n[6]);
            this.I(this.n[7]);
            return;
        }
        if (var1_3 instanceof JSchException) {
            throw var1_3;
        }
        throw new JSchException(var1_3.toString(), (Throwable)var1_3);
    }

    private String[] m(String object) {
        Object object2;
        Object object3 = object2 = null;
        if (object != null) {
            if (object.length() == 0) {
                object3 = object2;
            } else {
                int n8;
                if (this.A().isEnabled(1)) {
                    object3 = this.A();
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("CheckMacs: ");
                    ((StringBuilder)object2).append((String)object);
                    object3.a(1, ((StringBuilder)object2).toString());
                }
                object2 = this.w("mac.c2s");
                String string = this.w("mac.s2c");
                object3 = new Vector();
                String[] stringArray = Util.u((String)object, ",");
                int n9 = 0;
                for (n8 = 0; n8 < stringArray.length; ++n8) {
                    object = stringArray[n8];
                    if (string.indexOf((String)object) == -1 && ((String)object2).indexOf((String)object) == -1 || Session.l(this.w((String)object))) continue;
                    ((Vector)object3).addElement(object);
                }
                if (((Vector)object3).size() == 0) {
                    return null;
                }
                int n10 = ((Vector)object3).size();
                object = new String[n10];
                System.arraycopy(((Vector)object3).toArray(), 0, object, 0, ((Vector)object3).size());
                object3 = object;
                if (this.A().isEnabled(1)) {
                    n8 = n9;
                    while (true) {
                        object3 = object;
                        if (n8 >= n10) break;
                        object3 = this.A();
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(object[n8]);
                        ((StringBuilder)object2).append(" is not available.");
                        object3.a(1, ((StringBuilder)object2).toString());
                        ++n8;
                    }
                }
            }
        }
        return object3;
    }

    private boolean n() {
        Object object = new Buffer(this.d);
        ((Buffer)object).C(17);
        object = ((Buffer)object).p();
        int n8 = 0;
        int n9 = 0;
        while (n8 < ((Object)object).length) {
            while (n8 < ((Object)object).length && object[n8] != 44) {
                ++n8;
            }
            if (n9 == n8) continue;
            if ("ext-info-s".equals(Util.d((byte[])object, n9, n8 - n9))) {
                return true;
            }
            n8 = n9 = n8 + 1;
        }
        return false;
    }

    private boolean o() {
        Object object = new Buffer(this.d);
        ((Buffer)object).C(17);
        object = ((Buffer)object).p();
        int n8 = 0;
        int n9 = 0;
        while (n8 < ((Object)object).length) {
            while (n8 < ((Object)object).length && object[n8] != 44) {
                ++n8;
            }
            if (n9 == n8) continue;
            if ("kex-strict-s-v00@openssh.com".equals(Util.d((byte[])object, n9, n8 - n9))) {
                return true;
            }
            n8 = n9 = n8 + 1;
        }
        return false;
    }

    private String[] p(String stringArray) {
        Object object;
        Object object2 = object = null;
        if (stringArray != null) {
            if (stringArray.length() == 0) {
                object2 = object;
            } else {
                int n8;
                if (this.A().isEnabled(1)) {
                    object2 = this.A();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("CheckSignatures: ");
                    ((StringBuilder)object).append((String)stringArray);
                    object2.a(1, ((StringBuilder)object).toString());
                }
                object2 = new Vector();
                object = Util.u((String)stringArray, ",");
                int n9 = 0;
                for (n8 = 0; n8 < ((String[])object).length; ++n8) {
                    try {
                        Class.forName(JSch.f(object[n8])).asSubclass(Signature.class).getDeclaredConstructor(null).newInstance(null).e();
                        continue;
                    }
                    catch (Exception | NoClassDefFoundError throwable) {
                        ((Vector)object2).addElement(object[n8]);
                    }
                }
                if (((Vector)object2).size() == 0) {
                    return null;
                }
                int n10 = ((Vector)object2).size();
                stringArray = new String[n10];
                System.arraycopy(((Vector)object2).toArray(), 0, stringArray, 0, ((Vector)object2).size());
                object2 = stringArray;
                if (this.A().isEnabled(1)) {
                    n8 = n9;
                    while (true) {
                        object2 = stringArray;
                        if (n8 >= n10) break;
                        object2 = this.A();
                        object = new StringBuilder();
                        ((StringBuilder)object).append(stringArray[n8]);
                        ((StringBuilder)object).append(" is not available.");
                        object2.a(1, ((StringBuilder)object).toString());
                        ++n8;
                    }
                }
            }
        }
        return object2;
    }

    private byte[] u(Buffer buffer, byte[] byArray, byte[] byArray2, byte[] byArray3, HASH hASH, int n8) throws Exception {
        int n9 = hASH.d();
        while (byArray3.length < n8) {
            buffer.A();
            buffer.t(byArray);
            buffer.t(byArray2);
            buffer.t(byArray3);
            hASH.b(buffer.b, 0, buffer.c);
            byte[] byArray4 = new byte[byArray3.length + n9];
            System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
            System.arraycopy(hASH.c(), 0, byArray4, byArray3.length, n9);
            Util.g(byArray3);
            byArray3 = byArray4;
        }
        return byArray3;
    }

    public Logger A() {
        Logger logger = this.m0;
        if (logger != null) {
            return logger;
        }
        return this.l0.j();
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

    public Channel K(String object) throws JSchException {
        if (this.z) {
            try {
                object = Channel.l((String)object, this);
                this.c((Channel)object);
                ((Channel)object).q();
                if (object instanceof ChannelSession) {
                    this.e((ChannelSession)object);
                }
                return object;
            }
            catch (Exception exception) {
                return null;
            }
        }
        throw new JSchException("session is down");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Forwarding L(String var1_1) throws JSchException {
        block15: {
            block14: {
                block13: {
                    var4_3 = var1_1.split(" ");
                    if (((String[])var4_3).length > 1) {
                        var1_1 = new Vector<E>();
                        for (var2_6 = 0; var2_6 < ((String[])var4_3).length; ++var2_6) {
                            if (var4_3[var2_6].length() == 0) continue;
                            var1_1.addElement(var4_3[var2_6].trim());
                        }
                        var4_3 = new StringBuilder();
                        var2_6 = 0;
                        while (var2_6 < var1_1.size()) {
                            var4_3.append((String)var1_1.elementAt(var2_6));
                            var2_6 = var3_7 = var2_6 + 1;
                            if (var3_7 >= var1_1.size()) continue;
                            var4_3.append(":");
                            var2_6 = var3_7;
                        }
                        var1_1 = var4_3.toString();
                    }
                    var6_8 = new Forwarding();
                    try {
                        var2_6 = var1_1.lastIndexOf(":");
                        if (var2_6 == -1) ** GOTO lbl-1000
                    }
lbl24:
                    // 2 sources

                    catch (NumberFormatException var4_4) {}
                    var6_8.d = Integer.parseInt(var1_1.substring(var1_1.lastIndexOf(":") + 1));
                    var4_3 = var1_1.substring(0, var1_1.lastIndexOf(":"));
                    {
                        catch (NumberFormatException var4_5) {}
                    }
                    try {
                        if (var4_3.lastIndexOf(":") == -1) {
                            var7_12 = new StringBuilder();
                            var7_12.append("parseForwarding: ");
                            var7_12.append((String)var1_1);
                            var5_9 = new JSchException(var7_12.toString());
                            throw var5_9;
                        }
                        var6_8.c = var4_3.substring(var4_3.lastIndexOf(":") + 1);
                        ** GOTO lbl53
                    }
                    catch (NumberFormatException var1_2) {
                        var1_1 = var4_3;
                        ** GOTO lbl50
                    }
lbl-1000:
                    // 1 sources

                    {
                        var4_3 = new StringBuilder();
                        var4_3.append("parseForwarding: ");
                        var4_3.append((String)var1_1);
                        var5_11 = new JSchException(var4_3.toString());
                        throw var5_11;
lbl50:
                        // 2 sources

                        ** try [egrp 3[TRYBLOCK] [4 : 273->483)] { 
lbl51:
                        // 1 sources

                        var6_8.e = var1_1.substring(var1_1.lastIndexOf(":") + 1);
                        var4_3 = var1_1;
lbl53:
                        // 2 sources

                        var1_1 = var4_3.substring(0, var4_3.lastIndexOf(":"));
                        var2_6 = var1_1.lastIndexOf(":");
                        var4_3 = "127.0.0.1";
                        if (var2_6 == -1) {
                            var6_8.b = Integer.parseInt((String)var1_1);
                            var6_8.a = "127.0.0.1";
                            return var6_8;
                        }
                        var6_8.b = Integer.parseInt(var1_1.substring(var1_1.lastIndexOf(":") + 1));
                        var5_10 = var1_1.substring(0, var1_1.lastIndexOf(":"));
                        if (var5_10.length() == 0) break block13;
                        var1_1 = var5_10;
                        if (!var5_10.equals("*")) break block14;
                    }
                    break block15;
                }
                var1_1 = "0.0.0.0";
            }
            if (var1_1.equals("localhost")) {
                var1_1 = var4_3;
            }
            var6_8.a = var1_1;
            return var6_8;
        }
        var1_1 = new StringBuilder();
        var1_1.append("parseForwarding: ");
        var1_1.append(var4_4.toString());
        throw new JSchException(var1_1.toString(), var4_4);
    }

    /*
     * Unable to fully structure code
     */
    Buffer M(Buffer var1_1) throws Exception {
        block53: {
            block55: {
                block54: {
                    var11_4 = this;
                    var12_5 = var11_4.o;
                    var3_6 = var12_5 != null && var12_5.j() != false;
                    var12_5 = var11_4.o;
                    var4_7 = var12_5 != null && var12_5.m() != false;
                    var5_8 = var3_6 == false && var4_7 == false && var11_4.o != null && (var12_5 = var11_4.q) != null && var12_5.f() != false;
                    block4: while (true) {
                        block57: {
                            block56: {
                                var1_1.A();
                                if (!var3_6) break block56;
                                var11_4.w.c(var1_1.b, var1_1.c, 4);
                                var1_1.c += 4;
                                var11_4.o.e(var11_4.l);
                                var12_5 = new byte[4];
                                var11_4.o.a(var1_1.b, 0, 4, (byte[])var12_5, 0);
                                var2_9 = var12_5[0] << 24 & -16777216 | var12_5[1] << 16 & 0xFF0000 | var12_5[2] << 8 & 65280 | var12_5[3] & 255;
                                if (var2_9 < 5 || var2_9 > 262144) {
                                    var11_4.k0((Buffer)var1_1, var11_4.o, var11_4.q, 0, 262144);
                                }
                                var6_10 = var2_9 + var11_4.o.g();
                                var2_9 = var1_1.c;
                                var14_14 = var1_1.b;
                                if (var2_9 + var6_10 > ((byte[])var14_14).length) {
                                    var13_13 = new byte[var2_9 + var6_10];
                                    System.arraycopy(var14_14, 0, var13_13, 0, var2_9);
                                    var1_1.b = (byte[])var13_13;
                                }
                                if (var6_10 % var11_4.s0 != 0) {
                                    var13_13 = new StringBuilder();
                                    var13_13.append("Bad packet length ");
                                    var13_13.append(var6_10);
                                    var13_13 = var13_13.toString();
                                    if (var11_4.A().isEnabled(4)) {
                                        var11_4.A().a(4, (String)var13_13);
                                    }
                                    var11_4.k0((Buffer)var1_1, var11_4.o, var11_4.q, 0, 262144 - var11_4.s0);
                                }
                                var11_4.w.c(var1_1.b, var1_1.c, var6_10);
                                var2_9 = var6_10 - var11_4.o.g();
                                var1_1.c += var2_9;
                                try {
                                    var14_14 = var11_4.o;
                                    var13_13 = var1_1.b;
                                    var14_14.h((byte[])var13_13, 0, var2_9 + 4, (byte[])var13_13, 0);
                                }
                                catch (AEADBadTagException var1_2) {
                                    throw new JSchException("Packet corrupt", var1_2);
                                }
                                System.arraycopy(var12_5, 0, var1_1.b, 0, 4);
                                break block57;
                            }
                            if (!var4_7 && !var5_8) {
                                var11_4.w.c(var1_1.b, var1_1.c, var11_4.s0);
                                var2_9 = var1_1.c;
                                var6_10 = var11_4.s0;
                                var1_1.c = var2_9 + var6_10;
                                var12_5 = var11_4.o;
                                if (var12_5 != null) {
                                    var13_13 = var1_1.b;
                                    var12_5.a((byte[])var13_13, 0, var6_10, (byte[])var13_13, 0);
                                }
                                if ((var2_9 = (var12_5 = (Object)var1_1.b)[0] << 24 & -16777216 | var12_5[1] << 16 & 0xFF0000 | var12_5[2] << 8 & 65280 | var12_5[3] & 255) < 5 || var2_9 > 262144) {
                                    var11_4.k0((Buffer)var1_1, var11_4.o, var11_4.q, 0, 262144);
                                }
                                if ((var6_10 = var1_1.c) + (var2_9 = var2_9 + 4 - var11_4.s0) > ((Object)(var12_5 = (Object)var1_1.b)).length) {
                                    var13_13 = new byte[var6_10 + var2_9];
                                    System.arraycopy(var12_5, 0, var13_13, 0, var6_10);
                                    var1_1.b = (byte[])var13_13;
                                }
                                if (var2_9 % var11_4.s0 != 0) {
                                    var12_5 = new StringBuilder();
                                    var12_5.append("Bad packet length ");
                                    var12_5.append(var2_9);
                                    var12_5 = var12_5.toString();
                                    if (var11_4.A().isEnabled(4)) {
                                        var11_4.A().a(4, (String)var12_5);
                                    }
                                    var11_4.k0((Buffer)var1_1, var11_4.o, var11_4.q, 0, 262144 - var11_4.s0);
                                }
                                if (var2_9 > 0) {
                                    var11_4.w.c(var1_1.b, var1_1.c, var2_9);
                                    var1_1.c += var2_9;
                                    var12_5 = var11_4.o;
                                    if (var12_5 != null) {
                                        var13_13 = var1_1.b;
                                        var6_10 = var11_4.s0;
                                        var12_5.a((byte[])var13_13, var6_10, var2_9, (byte[])var13_13, var6_10);
                                    }
                                }
                                if ((var12_5 = var11_4.q) != null) {
                                    var12_5.e(var11_4.l);
                                    var11_4.q.b(var1_1.b, 0, var1_1.c);
                                    var11_4.q.c(var11_4.s, 0);
                                    var13_13 = var11_4.w;
                                    var12_5 = var11_4.t;
                                    var13_13.c((byte[])var12_5, 0, ((Object)var12_5).length);
                                    if (!Util.b(var11_4.s, var11_4.t)) {
                                        var6_10 = var11_4.s0;
                                        if (var2_9 + var6_10 <= 262144) {
                                            super.k0((Buffer)var1_1, var11_4.o, var11_4.q, var1_1.c, 262144 - var2_9 - var6_10);
                                            continue;
                                        }
                                        throw new IOException("MAC Error");
                                    }
                                }
                            } else {
                                var11_4.w.c(var1_1.b, var1_1.c, 4);
                                var1_1.c += 4;
                                var12_5 = var1_1.b;
                                var6_10 = var12_5[0] << 24 & -16777216 | var12_5[1] << 16 & 0xFF0000 | var12_5[2] << 8 & 65280 | var12_5[3] & 255;
                                if (var6_10 < 5 || var6_10 > 262144) {
                                    var11_4.k0((Buffer)var1_1, var11_4.o, var11_4.q, 0, 262144);
                                }
                                var2_9 = var6_10;
                                if (var4_7) {
                                    var2_9 = var6_10 + var11_4.o.g();
                                }
                                if ((var6_10 = var1_1.c) + var2_9 > ((Object)(var12_5 = (Object)var1_1.b)).length) {
                                    var13_13 = new byte[var6_10 + var2_9];
                                    System.arraycopy(var12_5, 0, var13_13, 0, var6_10);
                                    var1_1.b = var13_13;
                                }
                                if (var2_9 % var11_4.s0 != 0) {
                                    var12_5 = new StringBuilder();
                                    var12_5.append("Bad packet length ");
                                    var12_5.append(var2_9);
                                    var12_5 = var12_5.toString();
                                    if (var11_4.A().isEnabled(4)) {
                                        var11_4.A().a(4, (String)var12_5);
                                    }
                                    var11_4.k0((Buffer)var1_1, var11_4.o, var11_4.q, 0, 262144 - var11_4.s0);
                                }
                                var11_4.w.c(var1_1.b, var1_1.c, var2_9);
                                var1_1.c += var2_9;
                                if (var4_7) {
                                    try {
                                        var11_4.o.f(var1_1.b, 0, 4);
                                        var13_13 = var11_4.o;
                                        var12_5 = var1_1.b;
                                        var13_13.h((byte[])var12_5, 4, var2_9, (byte[])var12_5, 4);
                                        var1_1.c -= var11_4.o.g();
                                    }
                                    catch (AEADBadTagException var1_3) {
                                        throw new JSchException("Packet corrupt", var1_3);
                                    }
                                }
                                var11_4.q.e(var11_4.l);
                                var11_4.q.b(var1_1.b, 0, var1_1.c);
                                var11_4.q.c(var11_4.s, 0);
                                var12_5 = var11_4.w;
                                var13_13 = var11_4.t;
                                var12_5.c((byte[])var13_13, 0, ((byte[])var13_13).length);
                                if (!Util.b(var11_4.s, var11_4.t)) break block53;
                                var12_5 = var11_4.o;
                                var13_13 = var1_1.b;
                                var12_5.a((byte[])var13_13, 4, var2_9, (byte[])var13_13, 4);
                            }
                        }
                        var11_4.l = var2_9 = var11_4.l + 1;
                        if (var2_9 == 0 && (var11_4.F || var11_4.G) && var11_4.D) {
                            throw new JSchStrictKexException("incoming sequence number wrapped during initial KEX");
                        }
                        var12_5 = var11_4.v;
                        if (var12_5 != null) {
                            var14_14 = var1_1.b;
                            var2_9 = var14_14[4];
                            var13_13 = var11_4.q0;
                            var13_13[0] = var1_1.c - 5 - var2_9;
                            if ((var12_5 = (Object)var12_5.c((byte[])var14_14, 5, (int[])var13_13)) == null) {
                                if (var11_4.A().isEnabled(3)) {
                                    var11_4.A().a(3, "fail in inflater");
                                }
                                break block54;
                            }
                            var1_1.b = (byte[])var12_5;
                            var1_1.c = var11_4.q0[0] + 5;
                        }
                        if ((var2_9 = var1_1.h() & 255) == 1) break block55;
                        if (var11_4.D && var11_4.E) break block54;
                        if (var2_9 == 2) continue;
                        if (var2_9 == 3) {
                            var1_1.B();
                            var1_1.i();
                            var1_1.o();
                            var2_9 = var1_1.i();
                            if (!var11_4.A().isEnabled(1)) continue;
                            var12_5 = var11_4.A();
                            var13_13 = new StringBuilder();
                            var13_13.append("Received SSH_MSG_UNIMPLEMENTED for ");
                            var13_13.append(var2_9);
                            var12_5.a(1, var13_13.toString());
                            continue;
                        }
                        if (var2_9 == 4) {
                            var1_1.B();
                            var1_1.i();
                            var1_1.o();
                            continue;
                        }
                        if (var2_9 == 93) {
                            var1_1.B();
                            var1_1.i();
                            var1_1.o();
                            var12_5 = Channel.k(var1_1.i(), (Session)var11_4);
                            if (var12_5 == null) continue;
                            var12_5.a(var1_1.r());
                            continue;
                        }
                        if (var2_9 != 7) break;
                        var1_1.B();
                        var1_1.i();
                        var1_1.o();
                        if (!var11_4.B) {
                            var12_5 = var11_4.A();
                            var2_9 = var6_10 = 1;
                            if (var12_5.isEnabled(1)) {
                                var11_4.A().a(1, "Ignoring SSH_MSG_EXT_INFO while enable_server_sig_algs != yes");
                                var2_9 = var6_10;
                            }
                        } else {
                            var6_10 = 1;
                            if (var11_4.H) {
                                var2_9 = var6_10;
                                if (var11_4.A().isEnabled(1)) {
                                    var11_4.A().a(1, "Ignoring SSH_MSG_EXT_INFO received after SSH_MSG_USERAUTH_SUCCESS");
                                    var2_9 = var6_10;
                                }
                            } else if (var11_4.n0) {
                                var2_9 = var6_10;
                                if (var11_4.A().isEnabled(1)) {
                                    var11_4.A().a(1, "Ignoring SSH_MSG_EXT_INFO received before SSH_MSG_NEWKEYS");
                                    var2_9 = var6_10;
                                }
                            } else {
                                if (var11_4.A().isEnabled(1)) {
                                    var11_4.A().a(1, "SSH_MSG_EXT_INFO received");
                                }
                                var2_9 = 0;
                            }
                        }
                        var9_12 = var1_1.r();
                        var7_11 = 0L;
                        while (true) {
                            if (var7_11 < var9_12) ** break;
                            continue block4;
                            var13_13 = var1_1.p();
                            var12_5 = var1_1.p();
                            if (var2_9 == 0 && Util.c((byte[])var13_13).equals("server-sig-algs")) {
                                var12_5 = Util.c((byte[])var12_5);
                                if (var11_4.A().isEnabled(1)) {
                                    var13_13 = var11_4.A();
                                    var14_14 = new StringBuilder();
                                    var14_14.append("server-sig-algs=<");
                                    var14_14.append((String)var12_5);
                                    var14_14.append(">");
                                    var13_13.a(1, var14_14.toString());
                                }
                                var13_13 = var12_5;
                                if (var11_4.b0) {
                                    if (!var12_5.isEmpty()) {
                                        var13_13 = new StringBuilder();
                                        var13_13.append((String)var12_5);
                                        var13_13.append(",rsa-sha2-256,rsa-sha2-512");
                                        var12_5 = var13_13.toString();
                                    } else {
                                        var12_5 = "rsa-sha2-256,rsa-sha2-512";
                                    }
                                    var13_13 = var12_5;
                                    if (var11_4.A().isEnabled(1)) {
                                        var11_4.A().a(1, "OpenSSH 7.4 detected: adding rsa-sha2-256 & rsa-sha2-512 to server-sig-algs");
                                        var13_13 = var12_5;
                                    }
                                }
                                var11_4.a0 = Util.u((String)var13_13, ",");
                            }
                            ++var7_11;
                        }
                        break;
                    }
                    if (var2_9 == 52) {
                        var11_4.H = true;
                        if (var11_4.v == null && var11_4.u == null) {
                            super.H(var11_4.n[6]);
                            super.I(var11_4.n[7]);
                        }
                    }
                }
                var1_1.B();
                return var1_1;
            }
            var1_1.B();
            var1_1.i();
            var1_1.o();
            var2_9 = var1_1.i();
            var11_4 = var1_1.p();
            var12_5 = var1_1.p();
            var1_1 = Util.c((byte[])var11_4);
            var12_5 = Util.c((byte[])var12_5);
            var11_4 = new StringBuilder();
            var11_4.append("SSH_MSG_DISCONNECT: ");
            var11_4.append(var2_9);
            var11_4.append(" ");
            var11_4.append((String)var1_1);
            var11_4.append(" ");
            var11_4.append((String)var12_5);
            throw new JSchSessionDisconnectException(var11_4.toString(), var2_9, (String)var1_1, (String)var12_5);
        }
        throw new JSchException("Packet corrupt");
    }

    /*
     * Exception decompiling
     */
    void Q() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [6 : 276->343)] java.lang.Exception
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

    public void R() throws Exception {
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte)80);
        buffer.y(y0);
        buffer.s((byte)1);
        this.m0(packet);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void V(String string, String string2) {
        Object object = this.J;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        if (this.R != null) break block5;
                        Hashtable hashtable = new Hashtable();
                        this.R = hashtable;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (string.equals("PubkeyAcceptedKeyTypes")) {
                    this.R.put("PubkeyAcceptedAlgorithms", string2);
                } else {
                    this.R.put(string, string2);
                }
                return;
            }
            throw throwable2;
        }
    }

    public void W(String string) {
        this.V = string;
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

    public void a0(String string) {
        if (string != null) {
            this.k0 = Util.v(string);
        }
    }

    public int b0(String object) throws JSchException {
        object = this.L((String)object);
        return this.c0(((Forwarding)object).a, ((Forwarding)object).b, ((Forwarding)object).c, ((Forwarding)object).d);
    }

    void c(Channel channel) {
        channel.C(this);
    }

    public int c0(String string, int n8, String string2, int n9) throws JSchException {
        return this.d0(string, n8, string2, n9, null);
    }

    public int d0(String string, int n8, String string2, int n9, ServerSocketFactory serverSocketFactory) throws JSchException {
        return this.e0(string, n8, string2, n9, serverSocketFactory, 0);
    }

    public int e0(String charSequence, int n8, String string, int n9, ServerSocketFactory object, int n10) throws JSchException {
        PortWatcher portWatcher = PortWatcher.a(this, (String)charSequence, n8, string, n9, (ServerSocketFactory)object);
        portWatcher.h(n10);
        object = new Thread(new e(portWatcher));
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("PortWatcher Thread for ");
        ((StringBuilder)charSequence).append(string);
        ((Thread)object).setName(((StringBuilder)charSequence).toString());
        boolean bl = this.c0;
        if (bl) {
            ((Thread)object).setDaemon(bl);
        }
        ((Thread)object).start();
        return portWatcher.b;
    }

    public int f0(String object) throws JSchException {
        object = this.L((String)object);
        int n8 = this.a(((Forwarding)object).a, ((Forwarding)object).b);
        ChannelForwardedTCPIP.G(this, ((Forwarding)object).a, ((Forwarding)object).b, n8, ((Forwarding)object).c, ((Forwarding)object).d, null);
        return n8;
    }

    public void g0(int n8) throws JSchException {
        this.i0(n8);
        this.W = n8;
    }

    public void h0(SocketFactory socketFactory) {
        this.Q = socketFactory;
    }

    public void i0(int n8) throws JSchException {
        Socket socket = this.x;
        if (socket == null) {
            if (n8 >= 0) {
                this.y = n8;
                return;
            }
            throw new JSchException("invalid timeout value");
        }
        try {
            socket.setSoTimeout(n8);
            this.y = n8;
            return;
        }
        catch (Exception exception) {
            throw new JSchException(((Object)exception).toString(), exception);
        }
    }

    public void j0(UserInfo userInfo) {
        this.T = userInfo;
    }

    void m0(Packet packet) throws Exception {
        long l8 = this.D();
        while (this.n0) {
            if (l8 > 0L && System.currentTimeMillis() - this.d0 > l8 && !this.o0) {
                throw new JSchException("timeout in waiting for rekeying process.");
            }
            byte by = packet.a.h();
            if (by == 20 || by == 21 || by == 30 || by == 31 || by == 31 || by == 32 || by == 33 || by == 34 || by == 1) break;
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {}
        }
        this.b(packet);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void n0(Packet packet, Channel channel, int n8) throws Exception {
        long l8 = this.D();
        int n9 = n8;
        while (true) {
            block33: {
                int n10;
                long l9;
                long l10;
                block34: {
                    if (this.n0) {
                        if (l8 > 0L) {
                            if (System.currentTimeMillis() - this.d0 > l8) throw new JSchException("timeout in waiting for rekeying process.");
                        }
                        try {
                            Thread.sleep(10L);
                        }
                        catch (InterruptedException interruptedException) {}
                        continue;
                    }
                    // MONITORENTER : channel
                    l10 = channel.g;
                    l9 = n9;
                    n10 = 1;
                    if (l10 >= l9) break block34;
                    ++channel.t;
                    channel.wait(100L);
                    n8 = channel.t;
                    catch (Throwable throwable) {
                        --channel.t;
                        throw throwable;
                    }
                    catch (InterruptedException interruptedException) {
                        n8 = channel.t;
                    }
                    channel.t = n8 - 1;
                }
                if (this.n0) {
                    // MONITOREXIT : channel
                    continue;
                }
                if (channel.g >= l9) {
                    channel.g -= l9;
                    // MONITOREXIT : channel
                } else {
                    int n11;
                    byte by;
                    block32: {
                        block31: {
                            int n12;
                            long l11;
                            // MONITOREXIT : channel
                            if (channel.m) throw new IOException("channel is broken");
                            if (!channel.s()) throw new IOException("channel is broken");
                            // MONITORENTER : channel
                            l10 = channel.g;
                            n8 = 0;
                            by = 0;
                            n11 = 0;
                            if (l10 <= 0L) break block31;
                            l10 = l11 = channel.g;
                            if (l11 > l9) {
                                l10 = l9;
                            }
                            if (l10 != l9) {
                                n12 = (int)l10;
                                n8 = this.p != null ? this.t0 : 8;
                                MAC mAC = this.r;
                                if (mAC != null) {
                                    n11 = mAC.d();
                                }
                                n8 = packet.e(n12, n8, n11);
                            }
                            by = packet.a.h();
                            n12 = channel.o();
                            n9 -= (int)l10;
                            channel.g -= l10;
                            n11 = n10;
                            n10 = n12;
                            break block32;
                        }
                        n10 = -1;
                        n11 = 0;
                        n8 = 0;
                    }
                    // MONITOREXIT : channel
                    if (n11 != 0) {
                        this.b(packet);
                        if (n9 == 0) {
                            return;
                        }
                        packet.f(by, n10, n8, n9);
                    }
                    // MONITORENTER : channel
                    if (this.n0) {
                        // MONITOREXIT : channel
                        continue;
                    }
                    l9 = channel.g;
                    l10 = n9;
                    if (l9 < l10) break block33;
                    channel.g -= l10;
                    // MONITOREXIT : channel
                }
                this.b(packet);
                return;
            }
            // MONITOREXIT : channel
            continue;
            break;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    public void q() throws JSchException {
        this.r(this.y);
    }

    /*
     * Exception decompiling
     */
    public void r(int var1_1) throws JSchException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [8, 7 : 235->318)] java.lang.Throwable
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
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void s() {
        block20: {
            Object object;
            Object object2;
            if (!this.z) {
                return;
            }
            if (this.A().isEnabled(1)) {
                object2 = this.A();
                object = new StringBuilder();
                ((StringBuilder)object).append("Disconnecting from ");
                ((StringBuilder)object).append(this.g0);
                ((StringBuilder)object).append(" port ");
                ((StringBuilder)object).append(this.i0);
                object2.a(1, ((StringBuilder)object).toString());
            }
            Channel.g(this);
            this.z = false;
            PortWatcher.c(this);
            ChannelForwardedTCPIP.H(this);
            ChannelX11.J(this);
            object2 = this.J;
            // MONITORENTER : object2
            if (this.I != null) {
                Thread.yield();
                this.I.interrupt();
                this.I = null;
            }
            this.u0 = null;
            try {
                object2 = this.w;
                if (object2 != null) {
                    object2 = ((IO)object2).a;
                    if (object2 != null) {
                        ((InputStream)object2).close();
                    }
                    if ((object2 = this.w.b) != null) {
                        ((OutputStream)object2).close();
                    }
                    if ((object2 = this.w.c) != null) {
                        ((OutputStream)object2).close();
                    }
                }
                if ((object = this.S) == null) {
                    object2 = this.x;
                    if (object2 != null) {
                        ((Socket)object2).close();
                    }
                    break block20;
                }
                // MONITORENTER : object
                this.S.close();
            }
            catch (Exception exception) {}
            this.S = null;
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

    void t(Packet packet) throws Exception {
        Object object;
        Object object2;
        Object object3 = this.u;
        if (object3 != null) {
            object2 = this.r0;
            object = packet.a;
            object2[0] = ((Buffer)object).c;
            ((Buffer)object).b = object3.b(((Buffer)object).b, 5, (int[])object2);
            packet.a.c = this.r0[0];
        }
        int n8 = (object3 = this.p) != null ? this.t0 : 8;
        boolean bl = true;
        boolean bl2 = object3 != null && object3.j();
        object3 = this.p;
        boolean bl3 = object3 != null && object3.m();
        boolean bl4 = !bl2 && !bl3 && this.p != null && (object3 = this.r) != null && object3.f();
        if (bl2 || bl3 || bl4) {
            bl = false;
        }
        packet.b(n8, bl);
        object2 = packet.a;
        object3 = ((Buffer)object2).b;
        if (bl2) {
            this.p.e(this.m);
            this.p.a((byte[])object3, 0, 4, (byte[])object3, 0);
            this.p.h((byte[])object3, 0, packet.a.c, (byte[])object3, 0);
            packet.a.E(this.p.g());
            return;
        }
        if (bl3) {
            this.p.f((byte[])object3, 0, 4);
            this.p.h((byte[])object3, 4, packet.a.c - 4, (byte[])object3, 4);
            packet.a.E(this.p.g());
            return;
        }
        if (bl4) {
            this.p.a((byte[])object3, 4, ((Buffer)object2).c - 4, (byte[])object3, 4);
            this.r.e(this.m);
            object3 = this.r;
            object2 = packet.a;
            object3.b(((Buffer)object2).b, 0, ((Buffer)object2).c);
            object2 = this.r;
            object3 = packet.a;
            object2.c(((Buffer)object3).b, ((Buffer)object3).c);
            packet.a.E(this.r.d());
            return;
        }
        object2 = this.r;
        if (object2 != null) {
            object2.e(this.m);
            object = this.r;
            object2 = packet.a;
            object.b(((Buffer)object2).b, 0, ((Buffer)object2).c);
            object = this.r;
            object2 = packet.a;
            object.c(((Buffer)object2).b, ((Buffer)object2).c);
        }
        if ((object2 = (Object)this.p) != null) {
            object2.a((byte[])object3, 0, packet.a.c, (byte[])object3, 0);
        }
        if ((object3 = this.r) != null) {
            packet.a.E(object3.d());
        }
    }

    int v() {
        int n8;
        Cipher cipher = this.p;
        MAC mAC = this.r;
        int n9 = 20;
        if (cipher != null && (cipher.j() || cipher.m())) {
            n8 = n9;
            if (cipher.g() > 20) {
                n8 = cipher.g();
            }
        } else {
            n8 = n9;
            if (mAC != null) {
                n8 = n9;
                if (mAC.d() > 20) {
                    n8 = mAC.d();
                }
            }
        }
        return 64 + n8;
    }

    public String w(String object) {
        String string = object;
        if (((String)object).equals("PubkeyAcceptedKeyTypes")) {
            string = "PubkeyAcceptedAlgorithms";
        }
        if ((object = this.R) != null && (object = ((Hashtable)object).get(string)) instanceof String) {
            return (String)object;
        }
        object = JSch.f(string);
        if (ax.i.s.a(object)) {
            return object;
        }
        return null;
    }

    public String x() {
        return this.g0;
    }

    public HostKeyRepository y() {
        HostKeyRepository hostKeyRepository;
        HostKeyRepository hostKeyRepository2 = hostKeyRepository = this.Z;
        if (hostKeyRepository == null) {
            hostKeyRepository2 = this.l0.h();
        }
        return hostKeyRepository2;
    }

    IdentityRepository z() {
        IdentityRepository identityRepository;
        IdentityRepository identityRepository2 = identityRepository = this.Y;
        if (identityRepository == null) {
            identityRepository2 = this.l0.i();
        }
        return identityRepository2;
    }

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
        private Thread a = null;
        private int b = -1;
        private int c = 0;

        private GlobalRequestReply() {
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

        void d(int n8) {
            this.c = n8;
        }

        void e(int n8) {
            this.b = n8;
        }

        void f(Thread thread) {
            this.a = thread;
            this.b = -1;
        }
    }
}

