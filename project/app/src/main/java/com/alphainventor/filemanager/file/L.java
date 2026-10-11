/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.Z2.b;
import ax.Z2.s;
import ax.b3.E;
import ax.b3.K;
import ax.b3.a;
import ax.c3.F;
import ax.c3.G;
import ax.c3.H;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.g0;
import ax.c3.j0;
import ax.c3.x;
import ax.g3.k;
import ax.u3.c;
import ax.u3.q;
import ax.u3.t;
import com.alphainventor.filemanager.file.M;
import com.alphainventor.filemanager.file.c;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.file.p;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.HostKey;
import com.jcraft.jsch.HostKeyConf;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchChangedHostKeyException;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.JSchUnknownHostKeyException;
import com.jcraft.jsch.KeyPair;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.SftpProgressMonitor;
import com.jcraft.jsch.SocketFactory;
import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class L
extends m {
    static SocketFactory A;
    private static final Logger y;
    static j z;
    private final Object h = new Object();
    private boolean i;
    private Session j;
    private Session k;
    private AtomicInteger l;
    private AtomicInteger m;
    private h n;
    private h o;
    private String p;
    private String q;
    private String r;
    private String s;
    private int t;
    private String u;
    private String v;
    private Handler w = new Handler(Looper.getMainLooper());
    private Runnable x = new Runnable(this){
        final L q;
        {
            this.q = l8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            Object object = this.q.h;
            synchronized (object) {
                Throwable throwable2;
                block4: {
                    block3: {
                        try {
                            if (!this.q.F0()) break block3;
                            y.fine("SFTP session idle timeout disconnect");
                            this.q.v0();
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }
    };

    static {
        y = Logger.getLogger("FileManager.SftpFileHelper");
        A = new SocketFactory(){

            @Override
            public InputStream a(Socket socket) throws IOException {
                return socket.getInputStream();
            }

            @Override
            public OutputStream b(Socket socket) throws IOException {
                return socket.getOutputStream();
            }

            @Override
            public Socket c(String inetAddressArray, int n8) throws IOException, UnknownHostException {
                if ((inetAddressArray = InetAddress.getAllByName((String)inetAddressArray)) != null && inetAddressArray.length != 0) {
                    for (int i8 = 0; i8 < inetAddressArray.length; ++i8) {
                        Socket socket = new Socket();
                        try {
                            InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddressArray[i8], n8);
                            socket.connect(inetSocketAddress, 15000);
                            return socket;
                        }
                        catch (Exception exception) {
                            try {
                                socket.close();
                            }
                            catch (Exception exception2) {
                                // empty catch block
                            }
                            if (i8 != inetAddressArray.length - 1) continue;
                            if (exception instanceof IOException) {
                                throw exception;
                            }
                            throw new IOException(exception);
                        }
                    }
                    throw new SocketException("not reachable");
                }
                throw new SocketException("Impossible: empty address list");
            }
        };
    }

    public L() {
        L.E0();
    }

    public static j A0(Context context) {
        if (z == null) {
            z = new j(context.getApplicationContext());
        }
        return z;
    }

    private e B0() throws ax.b3.j {
        return this.x0(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Session C0(String object, String string, String object2, int n8, String object3, String object4, f f8) throws JSchException {
        boolean bl = object3 != null;
        try {
            JSch jSch = new JSch();
            if (object4 != null) {
                j0 j02 = new j0((String)object4);
                jSch.o(j02);
            }
            if (bl) {
                boolean bl2 = TextUtils.isEmpty((CharSequence)string);
                object4 = !bl2 ? (Object)string.getBytes("UTF-8") : null;
                object3 = !TextUtils.isEmpty((CharSequence)object3) ? (Object)((String)object3).getBytes("UTF-8") : null;
                jSch.d("name", (byte[])object3, null, (byte[])object4);
            }
            object = jSch.l((String)object, (String)object2, n8);
            if (!bl) {
                ((Session)object).a0(string);
                object2 = new g(string, null);
                ((Session)object).j0((UserInfo)object2);
            }
            if (f8 != null) {
                ((Session)object).X(f8);
            }
            ((Session)object).h0(A);
            ((Session)object).q();
            return object;
        }
        catch (RuntimeException runtimeException) {
            throw new JSchException("sftp session error", runtimeException);
        }
        catch (NullPointerException nullPointerException) {
            throw new JSchException("unsupported key", nullPointerException);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new JSchException("unsupported encoding", unsupportedEncodingException);
        }
    }

    private e D0() throws ax.b3.j {
        return this.x0(false);
    }

    private static void E0() {
        JSch.n("PreferredAuthentications", "gssapi-with-mic,publickey,password,keyboard-interactive");
        JSch.n("MaxAuthTries", "3");
        boolean bl = false;
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
            if (algorithmParameters != null) {
                bl = true;
            }
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        JSch.n("kex", "curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256,diffie-hellman-group14-sha1");
        JSch.n("cipher.s2c", "aes128-ctr,aes192-ctr,aes256-ctr,aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com");
        JSch.n("cipher.c2s", "aes128-ctr,aes192-ctr,aes256-ctr,aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com");
        if (bl) {
            JSch.n("server_host_key", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256,ssh-rsa,ssh-dss");
            JSch.n("PubkeyAcceptedAlgorithms", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256,ssh-rsa,ssh-dss");
            JSch.n("PubkeyAcceptedAlgorithmsOldServer", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,ssh-rsa,rsa-sha2-256,rsa-sha2-512,ssh-dss");
        } else {
            JSch.n("server_host_key", "ssh-ed25519,rsa-sha2-512,rsa-sha2-256,ssh-rsa,ssh-dss");
            JSch.n("PubkeyAcceptedAlgorithms", "ssh-ed25519,rsa-sha2-512,rsa-sha2-256,ssh-rsa,ssh-dss");
            JSch.n("PubkeyAcceptedAlgorithmsOldServer", "ssh-ed25519,ssh-rsa,rsa-sha2-256,rsa-sha2-512,ssh-dss");
        }
    }

    private boolean F0() {
        AtomicInteger atomicInteger = this.l;
        boolean bl = atomicInteger == null || atomicInteger.get() == 0;
        atomicInteger = this.m;
        boolean bl2 = atomicInteger == null || atomicInteger.get() == 0;
        return bl && bl2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean G0(o var0, n var1_5) {
        block21: {
            block28: {
                block24: {
                    block27: {
                        block23: {
                            block26: {
                                block22: {
                                    block25: {
                                        var3_17 = var1_5.p();
                                        var2_18 = false;
                                        if (var3_17 > 524288L) {
                                            return false;
                                        }
                                        var7_19 = null;
                                        var8_20 = null;
                                        var6_21 = null;
                                        var5_22 = null;
                                        try {
                                            var0 = var0.J((n)var1_5, 0L);
                                        }
                                        catch (Throwable var0_1) {
                                            break block21;
                                        }
                                        catch (RuntimeException var1_13) {
                                            var0 = var7_19;
                                            break block22;
                                        }
                                        catch (OutOfMemoryError var1_15) {
                                            var0 = var8_20;
                                            break block23;
                                        }
                                        catch (IOException var0_2) {
                                            break block24;
                                        }
                                        catch (ax.b3.j var0_3) {
                                            break block24;
                                        }
                                        catch (JSchException var0_4) {
                                            // empty catch block
                                            break block24;
                                        }
                                        try {
                                            var1_5 = F.h((InputStream)var0, (int)var1_5.p());
                                            var5_22 = new JSch();
                                            var1_5 = KeyPair.v((JSch)var5_22, (byte[])var1_5, null);
                                            if (var1_5 != null) {
                                                var2_18 = true;
                                            }
                                            if (var0 == null) break block25;
                                        }
                                        catch (Throwable var1_6) {
                                            var5_22 = var0;
                                            var0 = var1_6;
                                            break block21;
                                        }
                                        catch (RuntimeException var1_7) {
                                        }
                                        catch (OutOfMemoryError var1_8) {
                                            break block23;
                                        }
                                        catch (IOException var1_9) lbl-1000:
                                        // 3 sources

                                        {
                                            while (true) {
                                                var6_21 = var0;
                                                var0 = var1_10;
                                                break block24;
                                                break;
                                            }
                                        }
                                        F.a((AutoCloseable)var0);
                                    }
                                    return var2_18;
                                    catch (ax.b3.j var1_11) {
                                        ** GOTO lbl-1000
                                    }
                                    catch (JSchException var1_12) {
                                        ** continue;
                                    }
                                }
                                var5_22 = var0;
                                {
                                    ax.Ha.c.h().f().b("SSH KEY RUNTIME").l((Throwable)var1_14).h();
                                    if (var0 == null) break block26;
                                }
                                F.a((AutoCloseable)var0);
                            }
                            return false;
                        }
                        var5_22 = var0;
                        {
                            ax.Ha.c.h().f().b("SSH KEY OOM").l((Throwable)var1_16).h();
                            if (var0 == null) break block27;
                        }
                        F.a((AutoCloseable)var0);
                    }
                    return false;
                }
                var5_22 = var6_21;
                {
                    var0.printStackTrace();
                    if (var6_21 == null) break block28;
                }
                F.a((AutoCloseable)var6_21);
            }
            return false;
        }
        if (var5_22 != null) {
            F.a((AutoCloseable)var5_22);
        }
        throw var0;
    }

    private void H0(boolean bl) {
        this.i = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void K0(Session object) {
        Object object2 = this.h;
        synchronized (object2) {
            try {
                this.j = object;
                this.l = object = new AtomicInteger(0);
                try {
                    this.j.g0(15000);
                }
                catch (JSchException jSchException) {}
            }
            catch (Throwable throwable) {}
            throw throwable;
            this.n = object = new h(this.j);
            this.M0();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void L0(Session object) {
        Object object2 = this.h;
        synchronized (object2) {
            try {
                this.k = object;
                this.m = object = new AtomicInteger(0);
                try {
                    this.k.g0(15000);
                }
                catch (JSchException jSchException) {}
            }
            catch (Throwable throwable) {}
            throw throwable;
            this.o = object = new h(this.k);
            this.M0();
            return;
        }
    }

    private void M0() {
        this.w.removeCallbacks(this.x);
        if (this.F0()) {
            this.w.postDelayed(this.x, 180000L);
        }
    }

    private void N0(boolean bl) throws JSchException {
        Object object = bl ? this.j : this.k;
        if (object != null && ((Session)object).J()) {
            return;
        }
        y.fine("SFTP session created");
        boolean bl2 = this.v != null;
        object = new f(bl2, false);
        object = L.C0(this.q, this.r, this.s, this.t, this.u, this.v, (f)object);
        if (bl) {
            this.K0((Session)object);
            return;
        }
        this.L0((Session)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void O0(n object, G object2, long l8, Long l9, boolean bl, c c8, ax.g3.i i8) throws ax.b3.j, a {
        Throwable throwable2;
        SftpException sftpException2;
        Object object3;
        Object object4;
        e e8;
        block18: {
            block19: {
                e8 = this.D0();
                object4 = null;
                object3 = null;
                try {
                    block17: {
                        SftpProgressMonitor sftpProgressMonitor;
                        block16: {
                            try {
                                object3 = object2 = ((G)object2).b();
                                object4 = object2;
                                object3 = object2;
                                object4 = object2;
                                sftpProgressMonitor = new SftpProgressMonitor(){
                                    long a;
                                    final ax.g3.i b;
                                    final long c;
                                    final c d;
                                    final L e;
                                    {
                                        this.e = l8;
                                        this.b = i8;
                                        this.c = l9;
                                        this.d = c8;
                                        this.a = 0L;
                                    }

                                    @Override
                                    public void a() {
                                    }

                                    @Override
                                    public boolean b(long l8) {
                                        this.a = l8 = this.a + l8;
                                        Object object = this.b;
                                        if (object != null) {
                                            object.a(l8, this.c);
                                        }
                                        return (object = this.d) == null || !object.isCancelled();
                                    }

                                    @Override
                                    public void c(int n8, String string, String string2, long l8) {
                                        this.a = 0L;
                                    }
                                };
                                if (!bl) break block16;
                                object3 = object2;
                                object4 = object2;
                                e8.g((InputStream)object2, ((n)object).E(), sftpProgressMonitor);
                                break block17;
                            }
                            catch (SftpException sftpException2) {
                                break block18;
                            }
                        }
                        object3 = object2;
                        object4 = object2;
                        e8.h((InputStream)object2, ((n)object).E(), sftpProgressMonitor);
                    }
                    if (c8 != null) {
                        object3 = object2;
                        object4 = object2;
                        if (c8.isCancelled()) {
                            object3 = object2;
                            object4 = object2;
                            object3 = object2;
                            object4 = object2;
                            object = new a();
                            object3 = object2;
                            object4 = object2;
                            throw object;
                        }
                    }
                    if (l9 != null) {
                        object3 = object2;
                        object4 = object2;
                        l8 = l9;
                        if (l8 > 0L) {
                            object3 = object2;
                            try {
                                e8.n(((n)object).E(), (int)(l9 / 1000L));
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                        }
                    }
                    if (object2 == null) break block19;
                }
                catch (Throwable throwable2) {}
                try {
                    ((InputStream)object2).close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            e8.j();
            return;
        }
        object3 = object4;
        throw this.u0("sftp writeFile", sftpException2);
        if (object3 != null) {
            try {
                ((InputStream)object3).close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        e8.j();
        throw throwable2;
    }

    static /* synthetic */ void o0() {
        L.E0();
    }

    static /* synthetic */ void p0(L l8, Session session) {
        l8.K0(session);
    }

    static /* synthetic */ void q0(L l8, boolean bl) {
        l8.H0(bl);
    }

    private void s0() {
        this.w.removeCallbacks(this.x);
    }

    static f t0(String object, String charSequence, int n8) throws JSchException {
        JSchException jSchException2;
        block13: {
            f f8;
            block12: {
                block11: {
                    NullPointerException nullPointerException2;
                    block10: {
                        f8 = new f(true, true);
                        try {
                            JSch jSch = new JSch();
                            object = jSch.l((String)object, (String)charSequence, n8);
                            ((Session)object).X(f8);
                            ((Session)object).q();
                            ((Session)object).s();
                            return f8;
                        }
                        catch (RuntimeException runtimeException) {
                        }
                        catch (NullPointerException nullPointerException2) {
                            break block10;
                        }
                        catch (JSchException jSchException2) {
                            break block11;
                        }
                        if (f8.e == null) {
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append("sftp session error : ");
                            ((StringBuilder)charSequence).append(runtimeException.getMessage());
                            throw new JSchException(((StringBuilder)charSequence).toString(), runtimeException);
                        }
                        break block12;
                    }
                    if (f8.e == null) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("unsupported key : ");
                        ((StringBuilder)charSequence).append(((Throwable)nullPointerException2).getMessage());
                        throw new JSchException(((StringBuilder)charSequence).toString(), nullPointerException2);
                    }
                    break block12;
                }
                if (f8.e == null) break block13;
            }
            return f8;
        }
        throw jSchException2;
    }

    private ax.b3.j u0(String string, SftpException sftpException) {
        int n8 = sftpException.q;
        if (n8 == 3) {
            return new ax.b3.e(string, sftpException);
        }
        if (n8 == 2) {
            return new ax.b3.t(sftpException);
        }
        return ax.b3.d.b(string, sftpException);
    }

    private void v0() {
        Session session = this.j;
        if (session != null && session.J()) {
            this.j.s();
        }
        if ((session = this.k) != null && session.J()) {
            this.k.s();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String w0(String object) {
        Object object2;
        try {
            object2 = new StringReader((String)object);
            BufferedReader bufferedReader = new BufferedReader((Reader)object2);
            object = bufferedReader.readLine();
            if (object == null) return "########";
        }
        catch (IOException iOException) {
            return "########";
        }
        object = object2 = ((String)object).replaceAll("-", "").trim();
        if (!((String)object2).startsWith("BEGIN")) return object;
        return ((String)object2).substring(5).trim();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private e x0(boolean bl) throws ax.b3.j {
        Throwable throwable2;
        block9: {
            Object object;
            Object object2 = this.h;
            // MONITORENTER : object2
            try {
                this.N0(bl);
                object = bl ? this.n : this.o;
            }
            catch (Throwable throwable2) {
                break block9;
            }
            ChannelSftp channelSftp = ((h)object).f();
            if (channelSftp == null) {
                object = new ax.b3.j("open channel returns null");
                throw object;
            }
            this.s0();
            if (bl) {
                this.l.incrementAndGet();
                e e8 = new e(this, (h)object, channelSftp, this.l);
                // MONITOREXIT : object2
                return e8;
            }
            this.m.incrementAndGet();
            e e9 = new e(this, (h)object, channelSftp, this.m);
            // MONITOREXIT : object2
            return e9;
        }
        // MONITOREXIT : object2
        try {
            throw throwable2;
        }
        catch (K k8) {
            throw new ax.b3.j(k8.getMessage(), k8);
        }
        catch (JSchException jSchException) {
            throw ax.b3.d.b("getChannelWrapper", jSchException);
        }
    }

    public static int y0() {
        return 22;
    }

    @Override
    public InputStream A(String string, String string2, String string3) {
        return this.w(string, string2);
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<n> C(n object, m.f object2) throws ax.b3.j {
        Throwable throwable2;
        block10: {
            if (!object.n()) {
                throw new ax.b3.t();
            }
            ax.u3.b.c(object.isDirectory());
            Object object3 = ((n)object).E();
            object = this.B0();
            ArrayList<n> arrayList = new ArrayList<n>();
            try {
                object2 = ((e)object).d((String)object3).iterator();
                while (true) {
                    Comparable<StringBuilder> comparable;
                    String string;
                    if (!object2.hasNext()) {
                        ((e)object).j();
                        return arrayList;
                    }
                    Object object4 = object2.next();
                    if (!(object4 instanceof ChannelSftp.LsEntry) || d0.C(string = ((ChannelSftp.LsEntry)(object4 = (ChannelSftp.LsEntry)object4)).j())) continue;
                    if (!(TextUtils.isEmpty((CharSequence)string) || string.startsWith("/") || string.endsWith("/"))) {
                        string = d0.Q((String)object3, string);
                        comparable = new Comparable<StringBuilder>(this, (e)object, ((ChannelSftp.LsEntry)object4).h(), string);
                        arrayList.add((n)comparable);
                        continue;
                    }
                    object4 = ax.Ha.c.h().d("SFTP CHILD NAME:").j();
                    comparable = new Comparable<StringBuilder>();
                    ((StringBuilder)comparable).append((String)object3);
                    ((StringBuilder)comparable).append(":");
                    ((StringBuilder)comparable).append(string);
                    ((ax.Ha.b)object4).g(((StringBuilder)comparable).toString()).h();
                }
            }
            catch (Throwable throwable2) {
                break block10;
            }
            catch (SftpException sftpException) {}
            int n8 = sftpException.q;
            if (n8 == 3) {
                object3 = new ax.b3.e(sftpException);
                throw object3;
            }
            if (n8 == 4) {
                ((e)object).a();
                object3 = new E(sftpException);
                throw object3;
            }
            ((e)object).a();
            throw this.u0("listChildren", sftpException);
        }
        ((e)object).j();
        throw throwable2;
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, c c8, ax.g3.i i8) throws ax.b3.j, a {
        ax.u3.b.a(n8.n());
        this.O0(n8, g8, l8, l9, false, c8, i8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n n8, n comparable, c object, ax.g3.i i8) throws ax.b3.j, a {
        Throwable throwable2;
        block5: {
            ax.u3.b.a(comparable.n());
            object = this.B0();
            try {
                long l8 = n8.p();
                ((e)object).k(n8.E(), ((n)comparable).E());
                if (i8 != null) {
                    i8.a(l8, l8);
                }
                ((e)object).j();
                return;
            }
            catch (Throwable throwable2) {
                break block5;
            }
            catch (SftpException sftpException) {}
            {
                sftpException.printStackTrace();
                comparable = new Comparable<n>();
                ((StringBuilder)comparable).append("moveFile 2:");
                ((StringBuilder)comparable).append(sftpException.q);
                throw this.u0(((StringBuilder)comparable).toString(), sftpException);
            }
        }
        ((e)object).j();
        throw throwable2;
    }

    @Override
    public void F(n n8, n n9, c c8, ax.g3.i i8) throws ax.b3.j, a {
        this.D(n9, this.s(n8), n8.s(), n8.p(), n8.q(), n8.D(), false, c8, i8);
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    @Override
    public String H(n n8) {
        if (!this.Z(n8)) {
            return null;
        }
        return com.alphainventor.filemanager.file.m.S(n8);
    }

    @Override
    public void I(n n8) throws ax.b3.j {
        ax.u3.b.g("not support delete file recursively");
    }

    void I0(String string, String string2, String string3, int n8, String string4, String string5) {
        this.q = string;
        this.r = string2;
        this.s = string3;
        this.t = n8;
        this.u = string4;
        this.v = string5;
    }

    @Override
    public InputStream J(n object, long l8) throws ax.b3.j {
        e e8 = this.B0();
        try {
            object = new i(this, e8, e8.b(((n)object).E(), l8));
            return object;
        }
        catch (SftpException sftpException) {
            throw this.u0("sftp getInputStream", sftpException);
        }
    }

    public void J0(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.p = this.x();
            return;
        }
        this.p = string;
    }

    @Override
    public void K(Activity object, Fragment fragment, c.a a8) {
        try {
            object = new d(this.p(), this, a8, this.t());
            ((q)object).i(new Object[0]);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            if (a8 != null) {
                a8.B();
                a8.T(false, exception.getMessage());
            }
            return;
        }
    }

    @Override
    public boolean L() {
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean M(n n8) {
        Throwable throwable2;
        e e8;
        block7: {
            e e9 = null;
            e e10 = null;
            e8 = null;
            try {
                e e11;
                e8 = e11 = this.B0();
                e9 = e11;
                e10 = e11;
                e11.f(n8.E());
                e11.j();
                return true;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            catch (ax.b3.j j8) {
                e10 = e9;
            }
            catch (SftpException sftpException) {
                // empty catch block
            }
            e8 = e10;
            {
                ((Throwable)((Object)n8)).printStackTrace();
                if (e10 != null) {
                    e10.j();
                }
                return false;
            }
        }
        if (e8 != null) {
            e8.j();
        }
        throw throwable2;
    }

    @Override
    public boolean N(n n8) {
        return this.l(n8);
    }

    @Override
    public boolean O() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void P(n n8) throws ax.b3.j {
        Throwable throwable2;
        e e8;
        block6: {
            e8 = this.B0();
            try {
                if (e8.o(n8.E()).k()) {
                    e8.m(n8.E());
                } else {
                    e8.l(n8.E());
                }
                e8.j();
                return;
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (SftpException sftpException) {}
            sftpException.printStackTrace();
            throw this.u0("delete", sftpException);
        }
        e8.j();
        throw throwable2;
    }

    @Override
    public boolean Q(n n8, n n9) {
        return true;
    }

    @Override
    public boolean a() {
        return this.i;
    }

    @Override
    public void b() {
        this.s0();
        this.H0(false);
        this.v0();
    }

    @Override
    public boolean c0() {
        return false;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean h0() {
        return true;
    }

    @Override
    public void j0(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, c c8, ax.g3.i i8) throws ax.b3.j, a {
        this.O0(n8, g8, l8, l9, true, c8, i8);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    void m(n n8, String string, boolean bl, boolean bl2, ax.g3.h h8, c c8) throws ax.b3.j {
        synchronized (this) {
            try {
                this.o(n8, string, bl, bl2, h8, c8);
                return;
            }
            catch (Throwable throwable) {
                while (true) {
                    RuntimeException var1_3;
                    try {}
                    catch (Throwable throwable2) {
                        continue;
                    }
                    throw var1_3;
                }
            }
        }
    }

    @Override
    public String r() {
        return this.p;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public n z(String object) throws ax.b3.j {
        Throwable throwable22;
        e e8 = this.B0();
        M m8 = new M(this, e8, e8.e((String)object), (String)object);
        e8.j();
        return m8;
        {
            catch (Throwable throwable22) {
            }
            catch (SftpException sftpException) {}
            {
                sftpException.printStackTrace();
                int n8 = sftpException.q;
                if (n8 == 2) {
                    object = new M(this, (String)object);
                    e8.j();
                    return object;
                }
                if (n8 != 4) throw this.u0("getFileInfo", sftpException);
            }
            {
                e8.a();
                object = new ax.b3.j(sftpException);
                throw object;
            }
        }
        e8.j();
        throw throwable22;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String z0() throws ax.b3.j {
        Throwable throwable2222222;
        e e8 = this.B0();
        String string = e8.c();
        e8.j();
        return string;
        {
            catch (Throwable throwable2222222) {
            }
            catch (SftpException sftpException) {}
            {
                throw this.u0("getHomePath", sftpException);
            }
        }
        e8.j();
        throw throwable2222222;
    }

    private static class d
    extends q<Object, Void, Boolean> {
        String h;
        int i;
        String j;
        String k;
        L l;
        c.a m;
        String n;
        String o;
        String p;
        boolean q;
        f r;
        String s;

        public d(Context context, L l8, c.a a8, int n8) {
            super(q.e.c0);
            this.l = l8;
            this.m = a8;
            this.y(L.A0(context).k(n8));
            this.q = false;
        }

        public d(ax.Z2.o o8, c.a a8) {
            super(q.e.c0);
            this.m = a8;
            this.y(o8);
            this.q = true;
        }

        private void y(ax.Z2.o o8) {
            this.h = o8.d();
            this.i = o8.h();
            this.j = o8.k();
            this.k = o8.g();
            this.n = o8.f();
            this.o = o8.i();
            this.p = o8.e();
        }

        @Override
        protected void r() {
            super.r();
            c.a a8 = this.m;
            if (a8 != null) {
                a8.B();
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(Object ... var1_1) {
            block31: {
                block29: {
                    block30: {
                        var1_1 = this.l;
                        if (var1_1 != null) {
                            var1_1.i();
                        }
                        var3_6 = null;
                        try {
                            L.o0();
                            if (this.q) {
                                if (this.p == null) {
                                    this.r = L.t0(this.j, this.h, this.i);
                                    var1_1 = Boolean.FALSE;
                                    var3_6 = this.l;
                                    if (var3_6 != null) {
                                        var3_6.j();
                                    }
                                    return var1_1;
                                }
                            }
                            ** GOTO lbl-1000
                        }
                        catch (JSchException var1_2) {
                            ** GOTO lbl-1000
                        }
                        catch (Throwable var3_7) {
                            break block29;
                        }
                        {
                            var4_8 = new f(true, false);
                            var1_1 = var4_8;
                        }
                        try {
                            var1_1 = var3_6 = L.C0(this.j, this.k, this.h, this.i, this.o, this.p, var4_8);
                            break block30;
                        }
                        catch (JSchException var4_9) {
                            var3_6 = var1_1;
                            var1_1 = var4_9;
                            ** GOTO lbl-1000
                        }
                        catch (JSchChangedHostKeyException | JSchUnknownHostKeyException var1_3) {
                            var1_4 = var4_8;
                            this.r = var4_8;
                            var1_4 = var4_8;
                            var3_6 = Boolean.FALSE;
                            var1_4 = this.l;
                            if (var1_4 != null) {
                                var1_4.j();
                            }
                            return var3_6;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var2_10 = this.p != null;
                            var4_8 = new f(var2_10, false);
                            var1_1 = var4_8;
                        }
                        {
                            var1_1 = var3_6 = L.C0(this.j, this.k, this.h, this.i, this.o, this.p, var4_8);
                        }
                    }
                    var3_6 = this.l;
                    if (var3_6 != null) {
                        L.p0((L)var3_6, (Session)var1_1);
                        this.l.I0(this.j, this.k, this.h, this.i, this.o, this.p);
                        L.q0(this.l, true);
                        var1_1 = this.n;
                        if (var1_1 == null) {
                            this.n = this.l.z0();
                        }
lbl54:
                        // 4 sources

                        while (true) {
                            this.l.J0(this.n);
lbl56:
                            // 2 sources

                            while (true) {
                                var3_6 = Boolean.TRUE;
                                var1_1 = this.l;
                                if (var1_1 != null) {
                                    var1_1.j();
                                }
                                return var3_6;
                            }
                            break;
                        }
                    }
                    break block31;
lbl-1000:
                    // 2 sources

                    {
                        this.s = var1_1.getMessage();
                        if (!(var1_1 instanceof JSchUnknownHostKeyException) && !(var1_1 instanceof JSchChangedHostKeyException) || this.p == null) ** GOTO lbl-1000
                        this.r = var3_6;
                        var1_1 = Boolean.FALSE;
                        var3_6 = this.l;
                        if (var3_6 != null) {
                            var3_6.j();
                        }
                        return var1_1;
                    }
lbl-1000:
                    // 1 sources

                    {
                        var1_1.printStackTrace();
                        var1_1 = Boolean.FALSE;
                        var3_6 = this.l;
                        if (var3_6 != null) {
                            var3_6.j();
                        }
                        return var1_1;
                    }
                }
                var1_1 = this.l;
                if (var1_1 != null) {
                    var1_1.j();
                }
                throw var3_7;
                catch (ax.b3.j var1_5) {
                    ** continue;
                }
            }
            var1_1.s();
            ** while (true)
        }

        protected void x(Boolean bl) {
            if (this.m != null) {
                if (!TextUtils.isEmpty((CharSequence)this.n)) {
                    this.n = d0.U(this.n);
                }
                if (!bl.booleanValue()) {
                    if (this.r != null) {
                        this.m.T(bl, this.r);
                        return;
                    }
                    this.m.T(bl, this.s);
                    return;
                }
                this.m.T(bl, this.n);
            }
        }
    }

    class e {
        h a;
        ChannelSftp b;
        AtomicInteger c;
        final L d;

        e(L l8, h h8, ChannelSftp channelSftp, AtomicInteger atomicInteger) {
            this.d = l8;
            this.a = h8;
            this.b = channelSftp;
            this.c = atomicInteger;
        }

        void a() {
            this.b.f();
        }

        InputStream b(String string, long l8) throws SftpException {
            return this.b.i0(string, null, l8);
        }

        String c() throws SftpException {
            return this.b.k0();
        }

        Vector d(String string) throws SftpException {
            return this.b.s0(this.i(string));
        }

        SftpATTRS e(String string) throws SftpException {
            return this.b.u0(this.i(string));
        }

        void f(String string) throws SftpException {
            this.b.v0(string);
        }

        void g(InputStream inputStream, String string, SftpProgressMonitor sftpProgressMonitor) throws SftpException {
            this.b.w0(inputStream, this.i(string), sftpProgressMonitor, 0);
        }

        void h(InputStream inputStream, String string, SftpProgressMonitor sftpProgressMonitor) throws SftpException {
            this.b.w0(inputStream, this.i(string), sftpProgressMonitor, 4);
        }

        String i(String string) {
            int n8;
            int n9 = 0;
            int n10 = 0;
            for (int i8 = 0; i8 < string.length(); ++i8) {
                block8: {
                    block7: {
                        char c8 = string.charAt(i8);
                        if (c8 == '\\' || c8 == '?') break block7;
                        n8 = n10;
                        if (c8 != '*') break block8;
                    }
                    n8 = n10 + 1;
                }
                n10 = n8;
            }
            if (n10 == 0) {
                return string;
            }
            StringBuffer stringBuffer = new StringBuffer(string.length() + n10);
            for (n8 = n9; n8 < string.length(); ++n8) {
                char c9 = string.charAt(n8);
                if (c9 == '\\' || c9 == '?' || c9 == '*') {
                    stringBuffer.append('\\');
                }
                stringBuffer.append(c9);
            }
            return stringBuffer.toString();
        }

        void j() {
            int n8 = this.c.decrementAndGet();
            this.a.i(this.b);
            if (n8 <= 0) {
                this.d.M0();
            }
        }

        void k(String string, String string2) throws SftpException {
            this.b.A0(this.i(string), this.i(string2));
        }

        void l(String string) throws SftpException {
            this.b.B0(this.i(string));
        }

        void m(String string) throws SftpException {
            this.b.C0(this.i(string));
        }

        void n(String string, int n8) throws SftpException {
            this.b.Z0(this.i(string), n8);
        }

        SftpATTRS o(String string) throws SftpException {
            return this.b.c1(this.i(string));
        }
    }

    public static class f
    implements HostKeyConf {
        private String a;
        private boolean b;
        private String c;
        private String d;
        private HostKey e;

        f(boolean bl, boolean bl2) {
            String string = bl ? "yes" : "no";
            this.a = string;
            this.b = bl2;
        }

        @Override
        public void a(HostKey hostKey, String string, String string2) {
            this.e = hostKey;
            this.c = string;
            this.d = string2;
        }

        @Override
        public boolean b() {
            return this.b;
        }

        @Override
        public String c() {
            return this.a;
        }

        public String e() {
            return j0.f(this.e);
        }

        public String f() {
            return this.d;
        }

        public String g() {
            return this.c;
        }
    }

    static class g
    implements UserInfo,
    UIKeyboardInteractive {
        private String a;
        private String b;

        g(String string, String string2) {
            this.a = string;
            this.b = string2;
        }

        @Override
        public boolean a(String string) {
            return TextUtils.isEmpty((CharSequence)this.b) ^ true;
        }

        @Override
        public String b() {
            return this.b;
        }

        @Override
        public boolean c(String string) {
            Logger logger = y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sftp prompt : ");
            stringBuilder.append(string);
            logger.fine(stringBuilder.toString());
            return TextUtils.isEmpty((CharSequence)this.a) ^ true;
        }

        @Override
        public void d(String string) {
            Logger logger = y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sftp prompt : ");
            stringBuilder.append(string);
            logger.fine(stringBuilder.toString());
        }

        @Override
        public String[] e(String string, String object, String charSequence, String[] stringArray, boolean[] blArray) {
            if (stringArray != null) {
                int n8 = stringArray.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    string = stringArray[i8];
                    object = y;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("sftp prompt KI : ");
                    ((StringBuilder)charSequence).append(string);
                    ((Logger)object).fine(((StringBuilder)charSequence).toString());
                }
            }
            if (stringArray != null && stringArray.length == 1) {
                return new String[]{this.a};
            }
            return null;
        }

        @Override
        public String f() {
            return this.a;
        }

        @Override
        public boolean g(String string) {
            Logger logger = y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sftp prompt : ");
            stringBuilder.append(string);
            logger.fine(stringBuilder.toString());
            return true;
        }
    }

    static class h
    extends t<ChannelSftp> {
        Session b;

        public h(Session session) {
            this.b = session;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public ChannelSftp f() throws K {
            JSchException jSchException2;
            block4: {
                ChannelSftp channelSftp;
                block3: {
                    try {
                        ChannelSftp channelSftp2;
                        channelSftp = channelSftp2 = (ChannelSftp)super.a();
                        if (!channelSftp2.r()) break block3;
                        channelSftp = this.h();
                    }
                    catch (JSchException jSchException2) {
                        break block4;
                    }
                }
                if (!channelSftp.s()) {
                    channelSftp.c();
                }
                return channelSftp;
            }
            jSchException2.printStackTrace();
            ax.Ha.c.h().f().d("SFTP CHANNEL OPEN ERROR 1").l(jSchException2).h();
            throw new K("Could not acquire channel", jSchException2);
        }

        protected void g(ChannelSftp channelSftp) {
            channelSftp.f();
        }

        protected ChannelSftp h() throws K {
            try {
                ChannelSftp channelSftp = (ChannelSftp)this.b.K("sftp");
                return channelSftp;
            }
            catch (JSchException jSchException) {
                ax.Ha.c.h().f().d("SFTP CHANNEL OPEN ERROR 2").l(jSchException).h();
                throw new K("Could not open channel", jSchException);
            }
        }

        public void i(ChannelSftp channelSftp) {
            if (channelSftp == null) {
                y.severe("Null channel object error");
                return;
            }
            if (channelSftp.s()) {
                super.e(channelSftp);
            }
        }
    }

    class i
    extends H {
        e c0;
        boolean d0;
        final L e0;

        i(L l8, e e8, InputStream inputStream) {
            this.e0 = l8;
            super(inputStream);
            this.d0 = false;
            this.c0 = e8;
        }

        @Override
        public void close() throws IOException {
            if (!this.d0) {
                super.close();
                this.c0.j();
                this.d0 = true;
            }
        }
    }

    public static class j
    extends g0 {
        Context a;
        c0 b;

        j(Context context) {
            this.a = context;
            this.b = new c0(ax.Q2.f.I0);
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("SFTPPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("name_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("host_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("port_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("username_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("password_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("initialPath_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("name_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("hostkey_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("created_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            object.remove(stringBuilder.toString()).commit();
            stringBuilder = this.a.getSharedPreferences("SFTPKeyPrefs", 0).edit();
            object = new StringBuilder();
            ((StringBuilder)object).append("privateKey_");
            ((StringBuilder)object).append(n8);
            stringBuilder.remove(((StringBuilder)object).toString()).commit();
        }

        @Override
        public s f(int n8) {
            Object object = this.a.getSharedPreferences("SFTPPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("name_");
            charSequence.append(n8);
            charSequence = object.getString(charSequence.toString(), null);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append("username_");
            charSequence2.append(n8);
            charSequence2 = object.getString(charSequence2.toString(), "anonymous");
            CharSequence charSequence3 = new StringBuilder();
            charSequence3.append("initialPath_");
            charSequence3.append(n8);
            charSequence3 = object.getString(charSequence3.toString(), null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            long l8 = object.getLong(stringBuilder.toString(), 0L);
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            long l9 = object.getLong(stringBuilder.toString(), 0L);
            stringBuilder = new StringBuilder();
            stringBuilder.append("host_");
            stringBuilder.append(n8);
            object = object.getString(stringBuilder.toString(), null);
            return new s(ax.Q2.f.I0, n8, (String)charSequence, (String)charSequence2, (String)object, (String)charSequence3, l8, l9);
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("SFTPPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        @Override
        public ax.Z2.o k(int n8) {
            ax.Z2.o o8 = new ax.Z2.o();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SFTPPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("version_");
            ((StringBuilder)charSequence).append(n8);
            int n9 = sharedPreferences.getInt(((StringBuilder)charSequence).toString(), 0);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("host_");
            ((StringBuilder)charSequence).append(n8);
            charSequence = sharedPreferences.getString(((StringBuilder)charSequence).toString(), "");
            o8.s((String)charSequence);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append("port_");
            charSequence2.append(n8);
            o8.z(sharedPreferences.getInt(charSequence2.toString(), 22));
            charSequence2 = new StringBuilder();
            charSequence2.append("username_");
            charSequence2.append(n8);
            o8.D(sharedPreferences.getString(charSequence2.toString(), "anonymous"));
            charSequence2 = new StringBuilder();
            charSequence2.append("password_");
            charSequence2.append(n8);
            charSequence2 = sharedPreferences.getString(charSequence2.toString(), "");
            o8.y(this.b.a(n9, (String)charSequence, (String)charSequence2));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("initialPath_");
            ((StringBuilder)charSequence).append(n8);
            o8.v(sharedPreferences.getString(((StringBuilder)charSequence).toString(), null));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("name_");
            ((StringBuilder)charSequence).append(n8);
            o8.q(sharedPreferences.getString(((StringBuilder)charSequence).toString(), ""));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("hostkey_");
            ((StringBuilder)charSequence).append(n8);
            o8.t(sharedPreferences.getString(((StringBuilder)charSequence).toString(), null));
            sharedPreferences = this.a.getSharedPreferences("SFTPKeyPrefs", 0);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("privateKey_");
            ((StringBuilder)charSequence).append(n8);
            o8.A(sharedPreferences.getString(((StringBuilder)charSequence).toString(), null));
            return o8;
        }

        @Override
        public void l(int n8, ax.Z2.o o8, k k8, boolean bl) {
            int n9 = n8;
            if (n8 == -100) {
                n9 = this.m();
            }
            if (bl) {
                new d(o8, new c.a(){
                    final k a;
                    final int b;
                    final ax.Z2.o c;
                    final j d;
                    {
                        this.d = j8;
                        this.a = k8;
                        this.b = n8;
                        this.c = o8;
                    }

                    @Override
                    public void B() {
                        this.a.b(ax.Q2.f.I0);
                    }

                    @Override
                    public void T(boolean bl, Object object) {
                        if (bl) {
                            this.d.o(this.b, this.c);
                            ax.Q2.f f8 = ax.Q2.f.I0;
                            object = ax.c3.x.d(f8, this.b);
                            new m.d(((o)object).u()).i(new Long[0]);
                            ax.Z2.b.k().s(((o)object).T(), ((o)object).V());
                            this.a.c(f8, this.b);
                            return;
                        }
                        if (object instanceof f) {
                            f f9 = (f)object;
                            object = new HashMap<String, String>();
                            ((HashMap)object).put("host_key", f9.e());
                            ((HashMap)object).put("key_type", f9.g());
                            ((HashMap)object).put("key_fingerprint", f9.f());
                            this.a.d(ax.Q2.f.I0, this.b, (Map<String, Object>)object);
                            return;
                        }
                        object = object instanceof String ? (String)object : null;
                        this.a.a(ax.Q2.f.I0, this.c.d(), this.c.h(), this.c.k(), (String)object);
                    }
                }).h(new Object[0]);
                return;
            }
            this.o(n9, o8);
            k8.c(ax.Q2.f.I0, n9);
        }

        int m() {
            return this.a.getSharedPreferences("SFTPPrefs", 0).getInt("count", 0);
        }

        public List<s> n() {
            ArrayList<s> arrayList = new ArrayList<s>();
            Object object = this.a;
            SharedPreferences sharedPreferences = object.getSharedPreferences("SFTPPrefs", 0);
            int n8 = sharedPreferences.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                object = new StringBuilder();
                ((StringBuilder)object).append("host_");
                ((StringBuilder)object).append(i8);
                if (sharedPreferences.getString(((StringBuilder)object).toString(), null) == null) continue;
                arrayList.add(this.f(i8));
            }
            return arrayList;
        }

        void o(int n8, ax.Z2.o o8) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SFTPPrefs", 0);
            boolean bl = n8 >= sharedPreferences.getInt("count", 0);
            sharedPreferences = sharedPreferences.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            Object object = sharedPreferences.putInt(stringBuilder.toString(), 3);
            stringBuilder = new StringBuilder();
            stringBuilder.append("host_");
            stringBuilder.append(n8);
            stringBuilder = object.putString(stringBuilder.toString(), o8.d());
            object = new StringBuilder();
            ((StringBuilder)object).append("port_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.putInt(((StringBuilder)object).toString(), o8.h());
            stringBuilder = new StringBuilder();
            stringBuilder.append("username_");
            stringBuilder.append(n8);
            object = object.putString(stringBuilder.toString(), o8.k());
            stringBuilder = new StringBuilder();
            stringBuilder.append("password_");
            stringBuilder.append(n8);
            stringBuilder = object.putString(stringBuilder.toString(), this.b.e(o8.d(), o8.g()));
            object = new StringBuilder();
            ((StringBuilder)object).append("initialPath_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.putString(((StringBuilder)object).toString(), o8.f());
            object = new StringBuilder();
            ((StringBuilder)object).append("name_");
            ((StringBuilder)object).append(n8);
            stringBuilder.putString(((StringBuilder)object).toString(), o8.b());
            if (o8.e() != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("hostkey_");
                stringBuilder.append(n8);
                sharedPreferences.putString(stringBuilder.toString(), o8.e());
            }
            if (bl) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("created_");
                stringBuilder.append(n8);
                sharedPreferences.putLong(stringBuilder.toString(), System.currentTimeMillis());
                stringBuilder = new StringBuilder();
                stringBuilder.append("sortindex_");
                stringBuilder.append(n8);
                sharedPreferences.putLong(stringBuilder.toString(), System.currentTimeMillis());
            }
            if (bl) {
                sharedPreferences.putInt("count", n8 + 1);
            }
            sharedPreferences.commit();
            sharedPreferences = this.a.getSharedPreferences("SFTPKeyPrefs", 0).edit();
            stringBuilder = new StringBuilder();
            stringBuilder.append("privateKey_");
            stringBuilder.append(n8);
            sharedPreferences.putString(stringBuilder.toString(), o8.i());
            sharedPreferences.commit();
        }

        public void p(int n8, String string) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("SFTPPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hostkey_");
            stringBuilder.append(n8);
            editor.putString(stringBuilder.toString(), string).commit();
        }
    }
}

