package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1495j;
import ax.c3.C1835x;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.g0;
import ax.c3.j0;
import ax.u3.AbstractC3199q;
import ax.u3.AbstractC3202t;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.HostKey;
import com.jcraft.jsch.HostKeyConf;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchChangedHostKeyException;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.JSchUnknownHostKeyException;
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
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class L extends AbstractC3594m {
    static j z;
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
    private static final Logger y = Logger.getLogger("FileManager.SftpFileHelper");
    static SocketFactory A = new b();
    private final Object h = new Object();
    private Handler w = new Handler(Looper.getMainLooper());
    private Runnable x = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (L.this.h) {
                try {
                    if (L.this.F0()) {
                        L.y.fine("SFTP session idle timeout disconnect");
                        L.this.v0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    class b implements SocketFactory {
        b() {
        }

        @Override // com.jcraft.jsch.SocketFactory
        public InputStream a(Socket socket) throws IOException {
            return socket.getInputStream();
        }

        @Override // com.jcraft.jsch.SocketFactory
        public OutputStream b(Socket socket) throws IOException {
            return socket.getOutputStream();
        }

        @Override // com.jcraft.jsch.SocketFactory
        public Socket c(String str, int i) throws IOException, UnknownHostException {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            if (allByName == null || allByName.length == 0) {
                throw new SocketException("Impossible: empty address list");
            }
            for (int i2 = 0; i2 < allByName.length; i2++) {
                Socket socket = new Socket();
                try {
                    socket.connect(new InetSocketAddress(allByName[i2], i), 15000);
                    return socket;
                } catch (Exception e) {
                    try {
                        socket.close();
                    } catch (Exception unused) {
                    }
                    if (i2 == allByName.length - 1) {
                        if (e instanceof IOException) {
                            throw e;
                        }
                        throw new IOException(e);
                    }
                }
            }
            throw new SocketException("not reachable");
        }
    }

    class c implements SftpProgressMonitor {
        long a = 0;
        final /* synthetic */ ax.g3.i b;
        final /* synthetic */ long c;
        final /* synthetic */ InterfaceC3185c d;

        c(ax.g3.i iVar, long j, InterfaceC3185c interfaceC3185c) {
            this.b = iVar;
            this.c = j;
            this.d = interfaceC3185c;
        }

        @Override // com.jcraft.jsch.SftpProgressMonitor
        public void a() {
        }

        @Override // com.jcraft.jsch.SftpProgressMonitor
        public boolean b(long j) {
            long j2 = this.a + j;
            this.a = j2;
            ax.g3.i iVar = this.b;
            if (iVar != null) {
                iVar.a(j2, this.c);
            }
            InterfaceC3185c interfaceC3185c = this.d;
            return interfaceC3185c == null || !interfaceC3185c.isCancelled();
        }

        @Override // com.jcraft.jsch.SftpProgressMonitor
        public void c(int i, String str, String str2, long j) {
            this.a = 0L;
        }
    }

    class e {
        h a;
        ChannelSftp b;
        AtomicInteger c;

        e(h hVar, ChannelSftp channelSftp, AtomicInteger atomicInteger) {
            this.a = hVar;
            this.b = channelSftp;
            this.c = atomicInteger;
        }

        void a() {
            this.b.f();
        }

        InputStream b(String str, long j) throws SftpException {
            return this.b.i0(str, null, j);
        }

        String c() throws SftpException {
            return this.b.k0();
        }

        Vector d(String str) throws SftpException {
            return this.b.s0(i(str));
        }

        SftpATTRS e(String str) throws SftpException {
            return this.b.u0(i(str));
        }

        void f(String str) throws SftpException {
            this.b.v0(str);
        }

        void g(InputStream inputStream, String str, SftpProgressMonitor sftpProgressMonitor) throws SftpException {
            this.b.w0(inputStream, i(str), sftpProgressMonitor, 0);
        }

        void h(InputStream inputStream, String str, SftpProgressMonitor sftpProgressMonitor) throws SftpException {
            this.b.w0(inputStream, i(str), sftpProgressMonitor, 4);
        }

        String i(String str) {
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt == '\\' || charAt == '?' || charAt == '*') {
                    i++;
                }
            }
            if (i == 0) {
                return str;
            }
            StringBuffer stringBuffer = new StringBuffer(str.length() + i);
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt2 = str.charAt(i3);
                if (charAt2 == '\\' || charAt2 == '?' || charAt2 == '*') {
                    stringBuffer.append('\\');
                }
                stringBuffer.append(charAt2);
            }
            return stringBuffer.toString();
        }

        void j() {
            int decrementAndGet = this.c.decrementAndGet();
            this.a.i(this.b);
            if (decrementAndGet <= 0) {
                L.this.M0();
            }
        }

        void k(String str, String str2) throws SftpException {
            this.b.A0(i(str), i(str2));
        }

        void l(String str) throws SftpException {
            this.b.B0(i(str));
        }

        void m(String str) throws SftpException {
            this.b.C0(i(str));
        }

        void n(String str, int i) throws SftpException {
            this.b.Z0(i(str), i);
        }

        SftpATTRS o(String str) throws SftpException {
            return this.b.c1(i(str));
        }
    }

    public static class f implements HostKeyConf {
        private String a;
        private boolean b;
        private String c;
        private String d;
        private HostKey e;

        f(boolean z, boolean z2) {
            this.a = z ? "yes" : "no";
            this.b = z2;
        }

        @Override // com.jcraft.jsch.HostKeyConf
        public void a(HostKey hostKey, String str, String str2) {
            this.e = hostKey;
            this.c = str;
            this.d = str2;
        }

        @Override // com.jcraft.jsch.HostKeyConf
        public boolean b() {
            return this.b;
        }

        @Override // com.jcraft.jsch.HostKeyConf
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

    static class g implements UserInfo, UIKeyboardInteractive {
        private String a;
        private String b;

        g(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.jcraft.jsch.UserInfo
        public boolean a(String str) {
            return !TextUtils.isEmpty(this.b);
        }

        @Override // com.jcraft.jsch.UserInfo
        public String b() {
            return this.b;
        }

        @Override // com.jcraft.jsch.UserInfo
        public boolean c(String str) {
            L.y.fine("sftp prompt : " + str);
            return !TextUtils.isEmpty(this.a);
        }

        @Override // com.jcraft.jsch.UserInfo
        public void d(String str) {
            L.y.fine("sftp prompt : " + str);
        }

        @Override // com.jcraft.jsch.UIKeyboardInteractive
        public String[] e(String str, String str2, String str3, String[] strArr, boolean[] zArr) {
            if (strArr != null) {
                for (String str4 : strArr) {
                    L.y.fine("sftp prompt KI : " + str4);
                }
            }
            if (strArr == null || strArr.length != 1) {
                return null;
            }
            return new String[]{this.a};
        }

        @Override // com.jcraft.jsch.UserInfo
        public String f() {
            return this.a;
        }

        @Override // com.jcraft.jsch.UserInfo
        public boolean g(String str) {
            L.y.fine("sftp prompt : " + str);
            return true;
        }
    }

    static class h extends AbstractC3202t<ChannelSftp> {
        Session b;

        public h(Session session) {
            this.b = session;
        }

        public ChannelSftp f() throws ax.b3.K {
            try {
                ChannelSftp channelSftp = (ChannelSftp) super.a();
                if (channelSftp.r()) {
                    channelSftp = d();
                }
                if (!channelSftp.s()) {
                    channelSftp.c();
                }
                return channelSftp;
            } catch (JSchException e) {
                e.printStackTrace();
                ax.Ha.c.h().f().d("SFTP CHANNEL OPEN ERROR 1").l(e).h();
                throw new ax.b3.K("Could not acquire channel", e);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3202t
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(ChannelSftp channelSftp) {
            channelSftp.f();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3202t
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public ChannelSftp d() throws ax.b3.K {
            try {
                return (ChannelSftp) this.b.K("sftp");
            } catch (JSchException e) {
                ax.Ha.c.h().f().d("SFTP CHANNEL OPEN ERROR 2").l(e).h();
                throw new ax.b3.K("Could not open channel", e);
            }
        }

        public void i(ChannelSftp channelSftp) {
            if (channelSftp == null) {
                L.y.severe("Null channel object error");
            } else if (channelSftp.s()) {
                super.e(channelSftp);
            }
        }
    }

    class i extends ax.c3.H {
        e c0;
        boolean d0;

        i(e eVar, InputStream inputStream) {
            super(inputStream);
            this.d0 = false;
            this.c0 = eVar;
        }

        @Override // ax.c3.H, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.d0) {
                return;
            }
            super.close();
            this.c0.j();
            this.d0 = true;
        }
    }

    public static class j extends g0 {
        Context a;
        c0 b = new c0(ax.Q2.f.I0);

        class a implements InterfaceC3584c.a {
            final /* synthetic */ ax.g3.k a;
            final /* synthetic */ int b;
            final /* synthetic */ ax.Z2.o c;

            a(ax.g3.k kVar, int i, ax.Z2.o oVar) {
                this.a = kVar;
                this.b = i;
                this.c = oVar;
            }

            @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
            public void B() {
                this.a.b(ax.Q2.f.I0);
            }

            @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
            public void T(boolean z, Object obj) {
                if (z) {
                    j.this.o(this.b, this.c);
                    ax.Q2.f fVar = ax.Q2.f.I0;
                    C3596o d = C1835x.d(fVar, this.b);
                    new AbstractC3594m.d(d.u()).i(new Long[0]);
                    ax.Z2.b.k().s(d.T(), d.V());
                    this.a.c(fVar, this.b);
                    return;
                }
                if (!(obj instanceof f)) {
                    this.a.a(ax.Q2.f.I0, this.c.d(), this.c.h(), this.c.k(), obj instanceof String ? (String) obj : null);
                    return;
                }
                f fVar2 = (f) obj;
                HashMap hashMap = new HashMap();
                hashMap.put("host_key", fVar2.e());
                hashMap.put("key_type", fVar2.g());
                hashMap.put("key_fingerprint", fVar2.f());
                this.a.d(ax.Q2.f.I0, this.b, hashMap);
            }
        }

        j(Context context) {
            this.a = context;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("SFTPPrefs", 0).edit().remove("version_" + i).remove("name_" + i).remove("host_" + i).remove("port_" + i).remove("username_" + i).remove("password_" + i).remove("initialPath_" + i).remove("name_" + i).remove("hostkey_" + i).remove("created_" + i).remove("sortindex_" + i).commit();
            this.a.getSharedPreferences("SFTPKeyPrefs", 0).edit().remove("privateKey_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SFTPPrefs", 0);
            return new ax.Z2.s(ax.Q2.f.I0, i, sharedPreferences.getString("name_" + i, null), sharedPreferences.getString("username_" + i, "anonymous"), sharedPreferences.getString("host_" + i, null), sharedPreferences.getString("initialPath_" + i, null), sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("SFTPPrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        @Override // ax.c3.g0
        public ax.Z2.o k(int i) {
            ax.Z2.o oVar = new ax.Z2.o();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SFTPPrefs", 0);
            int i2 = sharedPreferences.getInt("version_" + i, 0);
            String string = sharedPreferences.getString("host_" + i, HttpUrl.FRAGMENT_ENCODE_SET);
            oVar.s(string);
            oVar.z(sharedPreferences.getInt("port_" + i, 22));
            oVar.D(sharedPreferences.getString("username_" + i, "anonymous"));
            oVar.y(this.b.a(i2, string, sharedPreferences.getString("password_" + i, HttpUrl.FRAGMENT_ENCODE_SET)));
            oVar.v(sharedPreferences.getString("initialPath_" + i, null));
            oVar.q(sharedPreferences.getString("name_" + i, HttpUrl.FRAGMENT_ENCODE_SET));
            oVar.t(sharedPreferences.getString("hostkey_" + i, null));
            oVar.A(this.a.getSharedPreferences("SFTPKeyPrefs", 0).getString("privateKey_" + i, null));
            return oVar;
        }

        @Override // ax.c3.g0
        public void l(int i, ax.Z2.o oVar, ax.g3.k kVar, boolean z) {
            if (i == -100) {
                i = m();
            }
            if (z) {
                new d(oVar, new a(kVar, i, oVar)).h(new Object[0]);
            } else {
                o(i, oVar);
                kVar.c(ax.Q2.f.I0, i);
            }
        }

        int m() {
            return this.a.getSharedPreferences("SFTPPrefs", 0).getInt("count", 0);
        }

        public List<ax.Z2.s> n() {
            ArrayList arrayList = new ArrayList();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SFTPPrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.getString("host_" + i2, null) != null) {
                    arrayList.add(f(i2));
                }
            }
            return arrayList;
        }

        void o(int i, ax.Z2.o oVar) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SFTPPrefs", 0);
            boolean z = i >= sharedPreferences.getInt("count", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("version_" + i, 3).putString("host_" + i, oVar.d()).putInt("port_" + i, oVar.h()).putString("username_" + i, oVar.k()).putString("password_" + i, this.b.e(oVar.d(), oVar.g())).putString("initialPath_" + i, oVar.f()).putString("name_" + i, oVar.b());
            if (oVar.e() != null) {
                edit.putString("hostkey_" + i, oVar.e());
            }
            if (z) {
                edit.putLong("created_" + i, System.currentTimeMillis());
                edit.putLong("sortindex_" + i, System.currentTimeMillis());
            }
            if (z) {
                edit.putInt("count", i + 1);
            }
            edit.commit();
            SharedPreferences.Editor edit2 = this.a.getSharedPreferences("SFTPKeyPrefs", 0).edit();
            edit2.putString("privateKey_" + i, oVar.i());
            edit2.commit();
        }

        public void p(int i, String str) {
            this.a.getSharedPreferences("SFTPPrefs", 0).edit().putString("hostkey_" + i, str).commit();
        }
    }

    public L() {
        E0();
    }

    public static j A0(Context context) {
        if (z == null) {
            z = new j(context.getApplicationContext());
        }
        return z;
    }

    private e B0() throws C1495j {
        return x0(true);
    }

    static Session C0(String str, String str2, String str3, int i2, String str4, String str5, f fVar) throws JSchException {
        boolean z2 = str4 != null;
        try {
            JSch jSch = new JSch();
            if (str5 != null) {
                jSch.o(new j0(str5));
            }
            if (z2) {
                jSch.d("name", !TextUtils.isEmpty(str4) ? str4.getBytes("UTF-8") : null, null, !TextUtils.isEmpty(str2) ? str2.getBytes("UTF-8") : null);
            }
            Session l = jSch.l(str, str3, i2);
            if (!z2) {
                l.a0(str2);
                l.j0(new g(str2, null));
            }
            if (fVar != null) {
                l.X(fVar);
            }
            l.h0(A);
            l.q();
            return l;
        } catch (UnsupportedEncodingException e2) {
            throw new JSchException("unsupported encoding", e2);
        } catch (NullPointerException e3) {
            throw new JSchException("unsupported key", e3);
        } catch (RuntimeException e4) {
            throw new JSchException("sftp session error", e4);
        }
    }

    private e D0() throws C1495j {
        return x0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void E0() {
        JSch.n("PreferredAuthentications", "gssapi-with-mic,publickey,password,keyboard-interactive");
        JSch.n("MaxAuthTries", "3");
        boolean z2 = false;
        try {
            if (AlgorithmParameters.getInstance("EC") != null) {
                z2 = true;
            }
        } catch (NoSuchAlgorithmException unused) {
        }
        JSch.n("kex", "curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256,diffie-hellman-group14-sha1");
        JSch.n("cipher.s2c", "aes128-ctr,aes192-ctr,aes256-ctr,aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com");
        JSch.n("cipher.c2s", "aes128-ctr,aes192-ctr,aes256-ctr,aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com");
        if (z2) {
            JSch.n("server_host_key", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256,ssh-rsa,ssh-dss");
            JSch.n("PubkeyAcceptedAlgorithms", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256,ssh-rsa,ssh-dss");
            JSch.n("PubkeyAcceptedAlgorithmsOldServer", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,ssh-rsa,rsa-sha2-256,rsa-sha2-512,ssh-dss");
        } else {
            JSch.n("server_host_key", "ssh-ed25519,rsa-sha2-512,rsa-sha2-256,ssh-rsa,ssh-dss");
            JSch.n("PubkeyAcceptedAlgorithms", "ssh-ed25519,rsa-sha2-512,rsa-sha2-256,ssh-rsa,ssh-dss");
            JSch.n("PubkeyAcceptedAlgorithmsOldServer", "ssh-ed25519,ssh-rsa,rsa-sha2-256,rsa-sha2-512,ssh-dss");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F0() {
        AtomicInteger atomicInteger = this.l;
        boolean z2 = atomicInteger == null || atomicInteger.get() == 0;
        AtomicInteger atomicInteger2 = this.m;
        return z2 && (atomicInteger2 == null || atomicInteger2.get() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean G0(com.voxdon.xplorer.file.C3596o r6, com.voxdon.xplorer.file.AbstractC3595n r7) {
        /*
            long r0 = r7.p()
            r2 = 524288(0x80000, double:2.590327E-318)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto Ld
            return r4
        Ld:
            r0 = 0
            r2 = 0
            java.io.InputStream r6 = r6.J(r7, r0)     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L41 java.lang.OutOfMemoryError -> L5d java.io.IOException -> L79 ax.b3.C1495j -> L7b com.jcraft.jsch.JSchException -> L7d
            long r0 = r7.p()     // Catch: java.lang.Throwable -> L2f java.lang.RuntimeException -> L32 java.lang.OutOfMemoryError -> L35 java.io.IOException -> L38 ax.b3.C1495j -> L3b com.jcraft.jsch.JSchException -> L3d
            int r7 = (int) r0     // Catch: java.lang.Throwable -> L2f java.lang.RuntimeException -> L32 java.lang.OutOfMemoryError -> L35 java.io.IOException -> L38 ax.b3.C1495j -> L3b com.jcraft.jsch.JSchException -> L3d
            byte[] r7 = ax.c3.F.h(r6, r7)     // Catch: java.lang.Throwable -> L2f java.lang.RuntimeException -> L32 java.lang.OutOfMemoryError -> L35 java.io.IOException -> L38 ax.b3.C1495j -> L3b com.jcraft.jsch.JSchException -> L3d
            com.jcraft.jsch.JSch r0 = new com.jcraft.jsch.JSch     // Catch: java.lang.Throwable -> L2f java.lang.RuntimeException -> L32 java.lang.OutOfMemoryError -> L35 java.io.IOException -> L38 ax.b3.C1495j -> L3b com.jcraft.jsch.JSchException -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.RuntimeException -> L32 java.lang.OutOfMemoryError -> L35 java.io.IOException -> L38 ax.b3.C1495j -> L3b com.jcraft.jsch.JSchException -> L3d
            com.jcraft.jsch.KeyPair r7 = com.jcraft.jsch.KeyPair.v(r0, r7, r2)     // Catch: java.lang.Throwable -> L2f java.lang.RuntimeException -> L32 java.lang.OutOfMemoryError -> L35 java.io.IOException -> L38 ax.b3.C1495j -> L3b com.jcraft.jsch.JSchException -> L3d
            if (r7 == 0) goto L29
            r4 = 1
        L29:
            if (r6 == 0) goto L2e
            ax.c3.F.a(r6)
        L2e:
            return r4
        L2f:
            r7 = move-exception
            r2 = r6
            goto L87
        L32:
            r7 = move-exception
            r2 = r6
            goto L42
        L35:
            r7 = move-exception
            r2 = r6
            goto L5e
        L38:
            r7 = move-exception
        L39:
            r2 = r6
            goto L7e
        L3b:
            r7 = move-exception
            goto L39
        L3d:
            r7 = move-exception
            goto L39
        L3f:
            r7 = move-exception
            goto L87
        L41:
            r7 = move-exception
        L42:
            ax.Ha.b r6 = ax.Ha.c.h()     // Catch: java.lang.Throwable -> L3f
            ax.Ha.b r6 = r6.f()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "SSH KEY RUNTIME"
            ax.Ha.b r6 = r6.b(r0)     // Catch: java.lang.Throwable -> L3f
            ax.Ha.b r6 = r6.l(r7)     // Catch: java.lang.Throwable -> L3f
            r6.h()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L5c
            ax.c3.F.a(r2)
        L5c:
            return r4
        L5d:
            r7 = move-exception
        L5e:
            ax.Ha.b r6 = ax.Ha.c.h()     // Catch: java.lang.Throwable -> L3f
            ax.Ha.b r6 = r6.f()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "SSH KEY OOM"
            ax.Ha.b r6 = r6.b(r0)     // Catch: java.lang.Throwable -> L3f
            ax.Ha.b r6 = r6.l(r7)     // Catch: java.lang.Throwable -> L3f
            r6.h()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L78
            ax.c3.F.a(r2)
        L78:
            return r4
        L79:
            r7 = move-exception
            goto L7e
        L7b:
            r7 = move-exception
            goto L7e
        L7d:
            r7 = move-exception
        L7e:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L86
            ax.c3.F.a(r2)
        L86:
            return r4
        L87:
            if (r2 == 0) goto L8c
            ax.c3.F.a(r2)
        L8c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.L.G0(com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(boolean z2) {
        this.i = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(Session session) {
        synchronized (this.h) {
            this.j = session;
            this.l = new AtomicInteger(0);
            try {
                this.j.g0(15000);
            } catch (JSchException unused) {
            }
            this.n = new h(this.j);
            M0();
        }
    }

    private void L0(Session session) {
        synchronized (this.h) {
            this.k = session;
            this.m = new AtomicInteger(0);
            try {
                this.k.g0(15000);
            } catch (JSchException unused) {
            }
            this.o = new h(this.k);
            M0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0() {
        this.w.removeCallbacks(this.x);
        if (F0()) {
            this.w.postDelayed(this.x, 180000L);
        }
    }

    private void N0(boolean z2) throws JSchException {
        Session session = z2 ? this.j : this.k;
        if (session == null || !session.J()) {
            y.fine("SFTP session created");
            Session C0 = C0(this.q, this.r, this.s, this.t, this.u, this.v, new f(this.v != null, false));
            if (z2) {
                K0(C0);
            } else {
                L0(C0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r14.longValue() <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r1.n(r10.E(), (int) (r14.longValue() / 1000));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void O0(com.voxdon.xplorer.file.AbstractC3595n r10, ax.c3.G r11, long r12, java.lang.Long r14, boolean r15, ax.u3.InterfaceC3185c r16, ax.g3.i r17) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            r9 = this;
            com.voxdon.xplorer.file.L$e r1 = r9.D0()
            r2 = 0
            java.io.InputStream r2 = r11.b()     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
            com.voxdon.xplorer.file.L$c r3 = new com.voxdon.xplorer.file.L$c     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
            r4 = r9
            r6 = r12
            r8 = r16
            r5 = r17
            r3.<init>(r5, r6, r8)     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
            if (r15 == 0) goto L24
            java.lang.String r11 = r10.E()     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
            r1.g(r2, r11, r3)     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
            goto L2b
        L1e:
            r0 = move-exception
            r10 = r0
            goto L6d
        L21:
            r0 = move-exception
            r10 = r0
            goto L66
        L24:
            java.lang.String r11 = r10.E()     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
            r1.h(r2, r11, r3)     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
        L2b:
            if (r16 == 0) goto L3a
            boolean r11 = r16.isCancelled()     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
            if (r11 != 0) goto L34
            goto L3a
        L34:
            ax.b3.a r10 = new ax.b3.a     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
            r10.<init>()     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
            throw r10     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
        L3a:
            if (r14 == 0) goto L57
            long r11 = r14.longValue()     // Catch: java.lang.Throwable -> L1e com.jcraft.jsch.SftpException -> L21
            r5 = 0
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 <= 0) goto L57
            java.lang.String r10 = r10.E()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L56
            long r11 = r14.longValue()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L56
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            int r12 = (int) r11     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L56
            r1.n(r10, r12)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L56
            goto L57
        L56:
        L57:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L62
        L5d:
            r0 = move-exception
            r10 = r0
            r10.printStackTrace()
        L62:
            r1.j()
            return
        L66:
            java.lang.String r11 = "sftp writeFile"
            ax.b3.j r10 = r9.u0(r11, r10)     // Catch: java.lang.Throwable -> L1e
            throw r10     // Catch: java.lang.Throwable -> L1e
        L6d:
            if (r2 == 0) goto L78
            r2.close()     // Catch: java.io.IOException -> L73
            goto L78
        L73:
            r0 = move-exception
            r11 = r0
            r11.printStackTrace()
        L78:
            r1.j()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.L.O0(com.voxdon.xplorer.file.n, ax.c3.G, long, java.lang.Long, boolean, ax.u3.c, ax.g3.i):void");
    }

    private void s0() {
        this.w.removeCallbacks(this.x);
    }

    static f t0(String str, String str2, int i2) throws JSchException {
        f fVar = new f(true, true);
        try {
            Session l = new JSch().l(str, str2, i2);
            l.X(fVar);
            l.q();
            l.s();
            return fVar;
        } catch (JSchException e2) {
            if (fVar.e == null) {
                throw e2;
            }
            return fVar;
        } catch (NullPointerException e3) {
            if (fVar.e == null) {
                throw new JSchException("unsupported key : " + e3.getMessage(), e3);
            }
            return fVar;
        } catch (RuntimeException e4) {
            if (fVar.e == null) {
                throw new JSchException("sftp session error : " + e4.getMessage(), e4);
            }
            return fVar;
        }
    }

    private C1495j u0(String str, SftpException sftpException) {
        int i2 = sftpException.q;
        return i2 == 3 ? new C1490e(str, sftpException) : i2 == 2 ? new ax.b3.t(sftpException) : C1489d.b(str, sftpException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        Session session = this.j;
        if (session != null && session.J()) {
            this.j.s();
        }
        Session session2 = this.k;
        if (session2 == null || !session2.J()) {
            return;
        }
        this.k.s();
    }

    public static String w0(String str) {
        try {
            String readLine = new BufferedReader(new StringReader(str)).readLine();
            if (readLine == null) {
                return "########";
            }
            String trim = readLine.replaceAll("-", HttpUrl.FRAGMENT_ENCODE_SET).trim();
            return trim.startsWith("BEGIN") ? trim.substring(5).trim() : trim;
        } catch (IOException unused) {
            return "########";
        }
    }

    private e x0(boolean z2) throws C1495j {
        try {
            synchronized (this.h) {
                try {
                    N0(z2);
                    h hVar = z2 ? this.n : this.o;
                    ChannelSftp f2 = hVar.f();
                    if (f2 == null) {
                        throw new C1495j("open channel returns null");
                    }
                    s0();
                    if (z2) {
                        this.l.incrementAndGet();
                        return new e(hVar, f2, this.l);
                    }
                    this.m.incrementAndGet();
                    return new e(hVar, f2, this.m);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (ax.b3.K e2) {
            throw new C1495j(e2.getMessage(), e2);
        } catch (JSchException e3) {
            throw C1489d.b("getChannelWrapper", e3);
        }
    }

    public static int y0() {
        return 22;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        return w(str, str2);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        C3184b.c(abstractC3595n.isDirectory());
        String E = abstractC3595n.E();
        e B0 = B0();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                Iterator it = B0.d(E).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof ChannelSftp.LsEntry) {
                        ChannelSftp.LsEntry lsEntry = (ChannelSftp.LsEntry) next;
                        String j2 = lsEntry.j();
                        if (!d0.C(j2)) {
                            if (!TextUtils.isEmpty(j2) && !j2.startsWith("/") && !j2.endsWith("/")) {
                                arrayList.add(new M(this, B0, lsEntry.h(), d0.Q(E, j2)));
                            }
                            ax.Ha.c.h().d("SFTP CHILD NAME:").j().g(E + ":" + j2).h();
                        }
                    }
                }
                B0.j();
                return arrayList;
            } catch (SftpException e2) {
                int i2 = e2.q;
                if (i2 == 3) {
                    throw new C1490e(e2);
                }
                if (i2 == 4) {
                    B0.a();
                    throw new ax.b3.E(e2);
                }
                B0.a();
                throw u0("listChildren", e2);
            }
        } catch (Throwable th) {
            B0.j();
            throw th;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g2, String str, long j2, Long l, C3597p c3597p, boolean z2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n.n());
        O0(abstractC3595n, g2, j2, l, false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n2.n());
        e B0 = B0();
        try {
            try {
                long p = abstractC3595n.p();
                B0.k(abstractC3595n.E(), abstractC3595n2.E());
                if (iVar != null) {
                    iVar.a(p, p);
                }
            } catch (SftpException e2) {
                e2.printStackTrace();
                throw u0("moveFile 2:" + e2.q, e2);
            }
        } finally {
            B0.j();
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        D(abstractC3595n2, s(abstractC3595n), abstractC3595n.s(), abstractC3595n.p(), Long.valueOf(abstractC3595n.q()), abstractC3595n.D(), false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (Z(abstractC3595n)) {
            return AbstractC3594m.S(abstractC3595n);
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        C3184b.g("not support delete file recursively");
    }

    void I0(String str, String str2, String str3, int i2, String str4, String str5) {
        this.q = str;
        this.r = str2;
        this.s = str3;
        this.t = i2;
        this.u = str4;
        this.v = str5;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j2) throws C1495j {
        e B0 = B0();
        try {
            return new i(B0, B0.b(abstractC3595n.E(), j2));
        } catch (SftpException e2) {
            throw u0("sftp getInputStream", e2);
        }
    }

    public void J0(String str) {
        if (TextUtils.isEmpty(str)) {
            this.p = x();
        } else {
            this.p = str;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        try {
            new d(p(), this, aVar, t()).i(new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            if (aVar != null) {
                aVar.B();
                aVar.T(false, e2.getMessage());
            }
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        e eVar = null;
        try {
            try {
                eVar = B0();
                eVar.f(abstractC3595n.E());
                eVar.j();
                return true;
            } finally {
                if (0 != 0) {
                    eVar.j();
                }
            }
        } catch (C1495j | SftpException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        return l(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        e B0 = B0();
        try {
            try {
                if (B0.o(abstractC3595n.E()).k()) {
                    B0.m(abstractC3595n.E());
                } else {
                    B0.l(abstractC3595n.E());
                }
                B0.j();
            } catch (SftpException e2) {
                e2.printStackTrace();
                throw u0("delete", e2);
            }
        } catch (Throwable th) {
            B0.j();
            throw th;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        return this.i;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
        s0();
        H0(false);
        v0();
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean c0() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean g0() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean h0() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public void j0(AbstractC3595n abstractC3595n, ax.c3.G g2, String str, long j2, Long l, C3597p c3597p, boolean z2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        O0(abstractC3595n, g2, j2, l, true, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    synchronized void m(AbstractC3595n abstractC3595n, String str, boolean z2, boolean z3, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        try {
            o(abstractC3595n, str, z2, z3, hVar, interfaceC3185c);
        } catch (Throwable th) {
            th = th;
            while (true) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public String r() {
        return this.p;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        e B0 = B0();
        try {
            return new M(this, B0, B0.e(str), str);
        } catch (SftpException e2) {
            e2.printStackTrace();
            int i2 = e2.q;
            if (i2 == 2) {
                return new M(this, str);
            }
            if (i2 != 4) {
                throw u0("getFileInfo", e2);
            }
            B0.a();
            throw new C1495j(e2);
        } finally {
            B0.j();
        }
    }

    public String z0() throws C1495j {
        e B0 = B0();
        try {
            try {
                return B0.c();
            } catch (SftpException e2) {
                throw u0("getHomePath", e2);
            }
        } finally {
            B0.j();
        }
    }

    private static class d extends AbstractC3199q<Object, Void, Boolean> {
        String h;
        int i;
        String j;
        String k;
        L l;
        InterfaceC3584c.a m;
        String n;
        String o;
        String p;
        boolean q;
        f r;
        String s;

        public d(Context context, L l, InterfaceC3584c.a aVar, int i) {
            super(AbstractC3199q.e.CONNECT);
            this.l = l;
            this.m = aVar;
            y(L.A0(context).k(i));
            this.q = false;
        }

        private void y(ax.Z2.o oVar) {
            this.h = oVar.d();
            this.i = oVar.h();
            this.j = oVar.k();
            this.k = oVar.g();
            this.n = oVar.f();
            this.o = oVar.i();
            this.p = oVar.e();
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            super.r();
            InterfaceC3584c.a aVar = this.m;
            if (aVar != null) {
                aVar.B();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0049: MOVE (r11 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:74), block:B:49:0x0049 */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Object... objArr) {
            f fVar;
            Session C0;
            L l = this.l;
            if (l != null) {
                l.i();
            }
            f fVar2 = null;
            try {
                try {
                    L.E0();
                } catch (JSchException e) {
                    e = e;
                }
                try {
                    if (!this.q) {
                        C0 = L.C0(this.j, this.k, this.h, this.i, this.o, this.p, new f(this.p != null, false));
                    } else {
                        if (this.p == null) {
                            this.r = L.t0(this.j, this.h, this.i);
                            Boolean bool = Boolean.FALSE;
                            L l2 = this.l;
                            if (l2 != null) {
                                l2.j();
                            }
                            return bool;
                        }
                        f fVar3 = new f(true, false);
                        try {
                            C0 = L.C0(this.j, this.k, this.h, this.i, this.o, this.p, fVar3);
                        } catch (JSchChangedHostKeyException | JSchUnknownHostKeyException unused) {
                            this.r = fVar3;
                            Boolean bool2 = Boolean.FALSE;
                            L l3 = this.l;
                            if (l3 != null) {
                                l3.j();
                            }
                            return bool2;
                        }
                    }
                    L l4 = this.l;
                    if (l4 != null) {
                        l4.K0(C0);
                        this.l.I0(this.j, this.k, this.h, this.i, this.o, this.p);
                        this.l.H0(true);
                        if (this.n == null) {
                            try {
                                this.n = this.l.z0();
                            } catch (C1495j unused2) {
                            }
                        }
                        this.l.J0(this.n);
                    } else {
                        C0.s();
                    }
                    Boolean bool3 = Boolean.TRUE;
                    L l5 = this.l;
                    if (l5 != null) {
                        l5.j();
                    }
                    return bool3;
                } catch (JSchException e2) {
                    e = e2;
                    fVar2 = fVar;
                    this.s = e.getMessage();
                    if (((e instanceof JSchUnknownHostKeyException) || (e instanceof JSchChangedHostKeyException)) && this.p != null) {
                        this.r = fVar2;
                        Boolean bool4 = Boolean.FALSE;
                        L l6 = this.l;
                        if (l6 != null) {
                            l6.j();
                        }
                        return bool4;
                    }
                    e.printStackTrace();
                    Boolean bool5 = Boolean.FALSE;
                    L l7 = this.l;
                    if (l7 != null) {
                        l7.j();
                    }
                    return bool5;
                }
            } finally {
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (this.m != null) {
                if (!TextUtils.isEmpty(this.n)) {
                    this.n = d0.U(this.n);
                }
                if (bool.booleanValue()) {
                    this.m.T(bool.booleanValue(), this.n);
                } else if (this.r != null) {
                    this.m.T(bool.booleanValue(), this.r);
                } else {
                    this.m.T(bool.booleanValue(), this.s);
                }
            }
        }

        public d(ax.Z2.o oVar, InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.m = aVar;
            y(oVar);
            this.q = true;
        }
    }
}
