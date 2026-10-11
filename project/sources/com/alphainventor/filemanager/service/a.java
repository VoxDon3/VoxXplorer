package com.voxdon.xplorer.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import ax.Q2.f;
import ax.Q2.g;
import ax.X2.Q;
import ax.b3.C1495j;
import ax.c3.C1835x;
import ax.c3.K;
import ax.c3.d0;
import ax.o3.h;
import ax.pd.c;
import ax.rd.C3032b;
import ax.rd.d;
import ax.rd.e;
import ax.rd.i;
import ax.rd.j;
import ax.rd.k;
import ax.u3.C3184b;
import ax.ud.C3239c;
import ax.ud.C3240d;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

@SuppressLint({"DefaultLocale", "SimpleDateFormat"})
/* loaded from: classes.dex */
public class a {
    private static final Logger E = g.a(a.class);
    private static final String[] F = {"CWD", "CDUP", "SMNT", "PORT", "PASV", "MODE", "TYPE", "STRU", "ALL0", "REST", "STOR", "STOU", "RETR", "LIST", "NLST", "APPE", "RNFR", "RNT0", "DELE", "RMD", "MKD", "STAT", "SITE", "MLST", "MLST", "PBSZ", "PROT"};
    private static final Map<String, SSLContext> G = new ConcurrentHashMap();
    private long A;
    private boolean B;
    private boolean C;
    private SSLContext D;
    private Context a;
    private Socket b;
    private BufferedOutputStream c;
    private AbstractC3595n d;
    private AbstractC3595n e;
    private String f;
    private ServerSocket h;
    private InetAddress i;
    private int j;
    private boolean k;
    private String l;
    private String m;
    private String n;
    private AbstractC3595n p;
    private SimpleDateFormat q;
    private SimpleDateFormat r;
    private SimpleDateFormat s;
    private SimpleDateFormat t;
    private Map<K, C3596o> u;
    private Map<K, AbstractC3595n> v;
    private List<K> w;
    private Map<K, String> x;
    private boolean y;
    private boolean z;
    private boolean g = false;
    private HashSet<String> o = new HashSet<>();

    /* renamed from: com.voxdon.xplorer.service.a$a, reason: collision with other inner class name */
    static class C0527a {
        String a;
        boolean b;
        boolean c;

        C0527a() {
        }

        void a() {
            this.a = null;
            this.b = false;
            this.c = false;
        }
    }

    public a(Context context, Socket socket, BufferedOutputStream bufferedOutputStream, boolean z, String str) throws IOException {
        Locale locale = Locale.US;
        this.q = new SimpleDateFormat(" MMM dd HH:mm ", locale);
        this.r = new SimpleDateFormat(" MMM dd  yyyy ", locale);
        this.s = new SimpleDateFormat("yyyyMMddHHmmss.SSS", locale);
        this.u = new ConcurrentHashMap();
        this.v = new ConcurrentHashMap();
        this.w = new ArrayList();
        this.x = new ConcurrentHashMap();
        this.a = context;
        this.b = socket;
        this.z = z;
        this.c = bufferedOutputStream;
        this.s.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        this.m = str;
        if (TextUtils.isEmpty(str)) {
            this.k = true;
        }
    }

    private static String A(String str) {
        if (TextUtils.isEmpty(str)) {
            return "127.0.0.1";
        }
        int indexOf = str.indexOf(37);
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }

    private Socket B() {
        ServerSocket serverSocket = this.h;
        if (serverSocket != null) {
            try {
                Socket accept = serverSocket.accept();
                d();
                return E(accept);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        try {
            Socket socket = new Socket(this.i, this.j);
            socket.setSoTimeout(30000);
            return E(socket);
        } catch (Exception e2) {
            e2.printStackTrace();
            d();
            return null;
        }
    }

    private void D(String str, C0527a c0527a) {
        String upperCase = str.toUpperCase(Locale.US);
        if (!"TLS".equals(upperCase) && !"SSL".equals(upperCase)) {
            O("504 Unsupported AUTH type\r\n");
            return;
        }
        if (this.B) {
            O("503 Control connection is already protected\r\n");
            return;
        }
        SSLContext s = s(this.a, r());
        this.D = s;
        if (s == null) {
            O("431 TLS is not available\r\n");
            return;
        }
        O("234 AUTH TLS OK\r\n");
        try {
            SSLSocketFactory socketFactory = this.D.getSocketFactory();
            Socket socket = this.b;
            SSLSocket sSLSocket = (SSLSocket) socketFactory.createSocket(socket, socket.getInetAddress().getHostAddress(), this.b.getPort(), false);
            sSLSocket.setUseClientMode(false);
            sSLSocket.setNeedClientAuth(false);
            sSLSocket.startHandshake();
            this.b = sSLSocket;
            this.c = new BufferedOutputStream(sSLSocket.getOutputStream());
            this.B = true;
            c0527a.c = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Socket E(Socket socket) throws IOException {
        if (!this.C) {
            return socket;
        }
        SSLContext sSLContext = this.D;
        if (sSLContext == null) {
            f(socket);
            return null;
        }
        SSLSocket sSLSocket = (SSLSocket) sSLContext.getSocketFactory().createSocket(socket, socket.getInetAddress().getHostAddress(), socket.getPort(), false);
        sSLSocket.setUseClientMode(false);
        sSLSocket.setNeedClientAuth(false);
        return sSLSocket;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F(com.voxdon.xplorer.file.AbstractC3595n r10, boolean r11, long r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.service.a.F(com.voxdon.xplorer.file.n, boolean, long):void");
    }

    private static void G(Context context, String str, KeyStore keyStore) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            keyStore.store(byteArrayOutputStream, "filemanager".toCharArray());
            h.h(context, str, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean H(Socket socket, byte[] bArr) {
        return I(socket, bArr, 0, bArr.length);
    }

    private boolean I(Socket socket, byte[] bArr, int i, int i2) {
        try {
            socket.getOutputStream().write(bArr, i, i2);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0057 -> B:18:0x0048). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0051 -> B:18:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void J(com.voxdon.xplorer.file.AbstractC3595n r5, long r6) {
        /*
            r4 = this;
            com.voxdon.xplorer.file.o r0 = r4.p(r5)
            java.net.Socket r1 = r4.B()
            if (r1 != 0) goto L13
            java.lang.String r5 = "425 Error opening data socket\r\n"
            r4.O(r5)
            r4.f(r1)
            return
        L13:
            java.lang.String r2 = "150 Sending file\r\n"
            r4.O(r2)
            boolean r2 = r4.N(r1)
            java.lang.String r3 = "426 Data socket or network error\r\n"
            if (r2 != 0) goto L27
            r4.O(r3)
            r4.f(r1)
            return
        L27:
            r2 = 0
            java.io.InputStream r2 = r0.J(r5, r6)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4c java.lang.Throwable -> L52
            r5 = 65536(0x10000, float:9.18355E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4c java.lang.Throwable -> L52
        L30:
            int r6 = r2.read(r5)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4c java.lang.Throwable -> L52
            if (r6 < 0) goto L43
            r7 = 0
            boolean r6 = r4.I(r1, r5, r7, r6)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4c java.lang.Throwable -> L52
            if (r6 != 0) goto L30
            r4.O(r3)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4c java.lang.Throwable -> L52
            goto L48
        L41:
            r5 = move-exception
            goto L5e
        L43:
            java.lang.String r5 = "226 File transmission succeeded\r\n"
            r4.O(r5)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4c java.lang.Throwable -> L52
        L48:
            r2.close()     // Catch: java.io.IOException -> L5a
            goto L5a
        L4c:
            r4.O(r3)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L5a
            goto L48
        L52:
            java.lang.String r5 = "550 Operation on invalid file\r\n"
            r4.O(r5)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L5a
            goto L48
        L5a:
            r4.f(r1)
            return
        L5e:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L63
        L63:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.service.a.J(com.voxdon.xplorer.file.n, long):void");
    }

    private void K(String str, String str2) {
        Socket B = B();
        if (B == null) {
            O("425 Error opening data socket\r\n");
            f(B);
            return;
        }
        O(String.format(Locale.US, "150 Opening %s mode data connection for %s\r\n", this.g ? "BINARY" : "ASCII", str));
        if (!N(B)) {
            O("426 Data socket or network error\r\n");
            f(B);
        } else {
            if (H(B, str2.getBytes())) {
                O("226 Data transmission succeeded\r\n");
            } else {
                O("426 Data socket or network error\r\n");
            }
            f(B);
        }
    }

    private int L() {
        d();
        try {
            ServerSocket serverSocket = new ServerSocket(0, 5);
            this.h = serverSocket;
            return serverSocket.getLocalPort();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    private void M(AbstractC3595n abstractC3595n, String str) {
        this.e = abstractC3595n;
        this.f = str;
    }

    private boolean N(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return true;
        }
        try {
            ((SSLSocket) socket).startHandshake();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void a(StringBuilder sb, boolean z, AbstractC3595n abstractC3595n, String str) {
        if (z) {
            sb.append(" ");
        }
        if (abstractC3595n.isDirectory()) {
            sb.append("Type=dir;Modify=");
            sb.append(this.s.format(new Date(abstractC3595n.q())));
            sb.append(";Perm=el; ");
            if (str == null) {
                sb.append(abstractC3595n.B());
            } else {
                sb.append(str);
            }
        } else {
            sb.append("Type=file;Size=");
            sb.append(abstractC3595n.p());
            sb.append(";Modify=");
            sb.append(this.s.format(new Date(abstractC3595n.q())));
            sb.append(";Perm=");
            sb.append("r");
            if (abstractC3595n.P() == f.o0) {
                sb.append("w");
            } else if (abstractC3595n.j()) {
                sb.append("w");
            }
            sb.append("; ");
            if (str == null) {
                sb.append(abstractC3595n.B());
            } else {
                sb.append(str);
            }
        }
        sb.append("\r\n");
    }

    private void b(K k, String str) {
        if (!f.Y(k.d())) {
            C3184b.g("Not local file location in FTP!");
            return;
        }
        C3596o e = C1835x.e(k);
        if (!e.a()) {
            e.h(null);
            if (!e.a()) {
                return;
            }
        }
        try {
            e.n0();
            AbstractC3595n z = e.z(k.e());
            this.u.put(k, e);
            this.v.put(k, z);
            this.x.put(k, str);
            this.w.add(k);
        } catch (C1495j unused) {
            e.k0(false);
        }
    }

    private boolean c(String str, String str2) {
        if (TextUtils.isEmpty(this.n) || this.n.equals(str)) {
            return TextUtils.isEmpty(this.m) || this.m.equals(str2);
        }
        return false;
    }

    private void d() {
        ServerSocket serverSocket = this.h;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.h = null;
        }
    }

    private void f(Socket socket) {
        if (socket == null || socket.isClosed()) {
            return;
        }
        try {
            socket.getOutputStream().close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String g(AbstractC3595n abstractC3595n, boolean z, boolean z2) {
        if (abstractC3595n.B().contains("*") || abstractC3595n.B().contains(File.separator)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String q = q(abstractC3595n);
        if (z) {
            a(sb, false, abstractC3595n, q);
        } else {
            if (!z2) {
                if (abstractC3595n.isDirectory()) {
                    sb.append("drwxr-xr-x 1 owner group");
                } else {
                    sb.append("-rw-r--r-- 1 owner group");
                }
                sb.append(String.format(Locale.US, "%13d", Long.valueOf(abstractC3595n.p())));
                sb.append((System.currentTimeMillis() - abstractC3595n.q() > 15552000000L ? this.r : this.q).format(new Date(abstractC3595n.q())));
            }
            sb.append(q);
            sb.append("\r\n");
        }
        return sb.toString();
    }

    private static X509Certificate h(String str, KeyPair keyPair) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        Date date = new Date(currentTimeMillis - 86400000);
        Date date2 = new Date(currentTimeMillis + 315360000000L);
        c cVar = new c("CN=Cx File Explorer FTPS Server");
        C3240d c3240d = new C3240d(cVar, new BigInteger(160, new SecureRandom()), date, date2, cVar, keyPair.getPublic());
        c3240d.a(e.k0, true, new C3032b(false));
        c3240d.a(e.g0, true, new k(160));
        c3240d.a(e.y0, false, new d(j.e0));
        c3240d.a(e.i0, false, k(str));
        return new C3239c().a(c3240d.b(new ax.Md.a("SHA256withRSA").b(keyPair.getPrivate())));
    }

    private static KeyStore i(String str) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        X509Certificate h = h(str, generateKeyPair);
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        keyStore.setKeyEntry("ftp_server", generateKeyPair.getPrivate(), "filemanager".toCharArray(), new Certificate[]{h});
        return keyStore;
    }

    private static SSLContext j(Context context, String str) throws Exception {
        KeyStore x = x(context, str);
        if (x == null) {
            x = i(str);
            G(context, str, x);
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(x, "filemanager".toCharArray());
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        sSLContext.init(keyManagerFactory.getKeyManagers(), null, new SecureRandom());
        return sSLContext;
    }

    private static i k(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && !"127.0.0.1".equals(str)) {
            arrayList.add(new ax.rd.h(7, str));
        }
        return new i((ax.rd.h[]) arrayList.toArray(new ax.rd.h[arrayList.size()]));
    }

    private String l(String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Paramater is empty");
        }
        if (v(str)) {
            return "/";
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            str = str.substring(0, str.length() - 1);
        }
        return str.startsWith(str2) ? str : d0.Q(this.f, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.voxdon.xplorer.file.AbstractC3595n o(java.lang.String r6) throws ax.b3.C1495j {
        /*
            r5 = this;
            boolean r0 = r5.v(r6)
            if (r0 == 0) goto L9
            com.voxdon.xplorer.file.n r6 = r5.d
            return r6
        L9:
            java.util.Map<ax.c3.K, java.lang.String> r0 = r5.x
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            ax.c3.K r2 = (ax.c3.K) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<ax.c3.K, com.voxdon.xplorer.file.n> r3 = r5.v
            java.lang.Object r3 = r3.get(r2)
            com.voxdon.xplorer.file.n r3 = (com.voxdon.xplorer.file.AbstractC3595n) r3
            if (r3 != 0) goto L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = ":"
            r6.append(r1)
            ax.Z2.j r2 = ax.Z2.j.F()
            java.lang.String r2 = r2.T()
            r6.append(r2)
            r6.append(r1)
            ax.Z2.j r1 = ax.Z2.j.F()
            boolean r1 = r1.t0()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            ax.u3.C3184b.g(r6)
            goto L13
        L60:
            boolean r4 = ax.c3.d0.I(r1, r6)
            if (r4 != 0) goto L6c
            boolean r4 = ax.c3.d0.G(r1, r6)
            if (r4 == 0) goto L13
        L6c:
            java.lang.String r0 = r3.E()
            java.lang.String r3 = "/"
            boolean r4 = r3.equals(r0)
            if (r4 == 0) goto L87
            java.lang.String r0 = ""
            java.lang.String r0 = r6.replaceFirst(r1, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L85
            goto L8e
        L85:
            r3 = r0
            goto L8e
        L87:
            java.lang.String r3 = r6.replaceFirst(r1, r0)
            goto L8e
        L8c:
            r2 = 0
            r3 = r2
        L8e:
            if (r3 == 0) goto Lba
            java.util.Map<ax.c3.K, com.voxdon.xplorer.file.o> r6 = r5.u
            java.lang.Object r6 = r6.get(r2)
            com.voxdon.xplorer.file.o r6 = (com.voxdon.xplorer.file.C3596o) r6
            if (r6 == 0) goto L9f
            com.voxdon.xplorer.file.n r6 = r6.z(r3)
            return r6
        L9f:
            ax.b3.j r6 = new ax.b3.j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No file operator available : "
            r0.append(r1)
            java.lang.String r1 = r2.k()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        Lba:
            ax.b3.t r0 = new ax.b3.t
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "File not exist : "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.service.a.o(java.lang.String):com.voxdon.xplorer.file.n");
    }

    private C3596o p(AbstractC3595n abstractC3595n) {
        return this.u.get(abstractC3595n.R());
    }

    private String q(AbstractC3595n abstractC3595n) {
        if (!d0.E(abstractC3595n)) {
            return abstractC3595n.B();
        }
        String str = this.x.get(abstractC3595n.R());
        if (str != null) {
            return d0.h(str);
        }
        C3184b.g("root path is not available");
        return abstractC3595n.B();
    }

    private String r() {
        InetAddress localAddress = this.b.getLocalAddress();
        return localAddress != null ? A(localAddress.getHostAddress()) : "127.0.0.1";
    }

    private static SSLContext s(Context context, String str) {
        SSLContext sSLContext;
        String A = A(str);
        Map<String, SSLContext> map = G;
        SSLContext sSLContext2 = map.get(A);
        if (sSLContext2 != null) {
            return sSLContext2;
        }
        synchronized (a.class) {
            sSLContext = map.get(A);
            if (sSLContext == null) {
                try {
                    sSLContext = j(context, A);
                    map.put(A, sSLContext);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return sSLContext;
    }

    private boolean u(AbstractC3595n abstractC3595n) {
        return abstractC3595n.isDirectory() && (abstractC3595n.R() == K.h ? true : abstractC3595n.d()) && w(abstractC3595n);
    }

    private boolean v(String str) {
        return "/".equals(str);
    }

    private boolean w(AbstractC3595n abstractC3595n) {
        return abstractC3595n.E().startsWith(abstractC3595n.R().e()) || "/".equals(abstractC3595n.E());
    }

    private static KeyStore x(Context context, String str) {
        String c = h.c(context, str);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(c, 2);
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(new ByteArrayInputStream(decode), "filemanager".toCharArray());
            if (keyStore.containsAlias("ftp_server")) {
                return keyStore;
            }
            h.e(context, str);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            h.e(context, str);
            return null;
        }
    }

    private String y(String str) {
        return String.format(Locale.US, "550 %s: No such file or directory.\r\n", str);
    }

    private boolean z(String str) {
        return this.o.contains(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:262:0x0990
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0a78 A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #42 {all -> 0x0075, blocks: (B:668:0x0067, B:670:0x006d, B:15:0x0083, B:36:0x0094, B:40:0x00a4, B:42:0x00a8, B:43:0x00ae, B:47:0x00bc, B:49:0x00c0, B:50:0x00c4, B:52:0x00d2, B:53:0x00db, B:55:0x00e7, B:56:0x00f0, B:60:0x0100, B:62:0x010c, B:65:0x0119, B:68:0x0121, B:69:0x0126, B:70:0x0140, B:74:0x0151, B:76:0x0155, B:77:0x015a, B:81:0x016d, B:82:0x0174, B:84:0x017c, B:85:0x0184, B:88:0x0194, B:91:0x01a3, B:94:0x01c1, B:96:0x01c9, B:98:0x01d3, B:100:0x01db, B:102:0x01e5, B:104:0x01ec, B:106:0x01f5, B:109:0x0206, B:111:0x020e, B:114:0x0215, B:115:0x0247, B:118:0x0256, B:121:0x0260, B:124:0x0265, B:128:0x026b, B:130:0x0275, B:132:0x0277, B:140:0x0281, B:143:0x0293, B:146:0x02a4, B:136:0x02ae, B:147:0x02b6, B:649:0x02c7, B:651:0x02d1, B:653:0x02d7, B:659:0x02e2, B:662:0x02e9, B:663:0x0305, B:634:0x0327, B:636:0x0331, B:638:0x0337, B:642:0x0342, B:645:0x0349, B:646:0x036c, B:156:0x038d, B:158:0x0394, B:159:0x0399, B:161:0x03a9, B:163:0x03b3, B:165:0x03b9, B:167:0x03c4, B:168:0x03c9, B:170:0x03d3, B:172:0x03d7, B:173:0x03eb, B:175:0x03f9, B:177:0x0405, B:178:0x041d, B:179:0x0422, B:180:0x042a, B:182:0x042f, B:181:0x0434, B:183:0x043d, B:623:0x044a, B:625:0x0458, B:628:0x045f, B:630:0x0465, B:631:0x046c, B:611:0x048f, B:613:0x049a, B:614:0x04bf, B:616:0x04c9, B:617:0x04d2, B:618:0x04a2, B:191:0x04ff, B:193:0x0507, B:196:0x050f, B:198:0x0517, B:199:0x051e, B:201:0x0526, B:203:0x052e, B:204:0x0533, B:206:0x053f, B:208:0x054b, B:210:0x0557, B:213:0x055e, B:216:0x0566, B:218:0x056b, B:217:0x0570, B:219:0x0579, B:221:0x0581, B:222:0x0588, B:445:0x0592, B:447:0x059c, B:450:0x05a7, B:452:0x05b5, B:455:0x05bd, B:457:0x05c3, B:460:0x05ca, B:462:0x05d7, B:463:0x05dd, B:464:0x05e1, B:225:0x05fc, B:425:0x0604, B:427:0x060e, B:430:0x0619, B:432:0x0627, B:433:0x062b, B:435:0x0631, B:436:0x0637, B:438:0x063e, B:439:0x0644, B:440:0x064e, B:227:0x0665, B:400:0x066d, B:402:0x0677, B:405:0x0682, B:407:0x0690, B:410:0x0699, B:412:0x069f, B:415:0x06a6, B:418:0x06b4, B:417:0x06bb, B:419:0x06c2, B:420:0x06c7, B:229:0x06df, B:383:0x06e7, B:385:0x06f1, B:388:0x06fc, B:390:0x0706, B:393:0x070b, B:395:0x0711, B:396:0x071a, B:397:0x0723, B:231:0x073b, B:338:0x0743, B:340:0x0749, B:342:0x074f, B:345:0x075b, B:347:0x075f, B:349:0x0766, B:351:0x0782, B:352:0x0787, B:354:0x078d, B:355:0x0792, B:357:0x0798, B:358:0x079f, B:362:0x07b1, B:363:0x080f, B:373:0x084d, B:366:0x07b8, B:368:0x07c2, B:370:0x07c8, B:372:0x07d8, B:375:0x080c, B:376:0x081a, B:378:0x0852, B:233:0x086a, B:316:0x0872, B:318:0x087c, B:321:0x0887, B:323:0x0891, B:326:0x089a, B:328:0x08a0, B:330:0x08a6, B:333:0x08ad, B:334:0x08b4, B:335:0x08b9, B:235:0x08d1, B:300:0x08d9, B:237:0x0901, B:239:0x0909, B:243:0x091b, B:245:0x0925, B:248:0x0930, B:250:0x093a, B:253:0x0941, B:256:0x0953, B:258:0x095d, B:283:0x0962, B:285:0x0968, B:288:0x0970, B:289:0x0973, B:291:0x097a, B:292:0x0981, B:293:0x0986, B:265:0x098b, B:262:0x0990, B:294:0x0999, B:297:0x0912, B:269:0x08be, B:336:0x08c3, B:270:0x08cc, B:381:0x0857, B:380:0x085c, B:379:0x0865, B:273:0x0728, B:398:0x072d, B:274:0x0736, B:423:0x06cc, B:422:0x06d1, B:421:0x06da, B:443:0x0652, B:442:0x0657, B:441:0x0660, B:467:0x05e9, B:466:0x05ee, B:465:0x05f7, B:472:0x09a7, B:474:0x09ad, B:476:0x09b1, B:482:0x09c0, B:487:0x09d0, B:490:0x09f0, B:506:0x0a0a, B:565:0x0a10, B:568:0x0a15, B:569:0x0a1b, B:571:0x0a21, B:574:0x0a31, B:514:0x0a78, B:516:0x0a7e, B:528:0x0abc, B:543:0x0af0, B:551:0x0af9, B:552:0x0afc, B:554:0x0aff, B:555:0x0b06, B:508:0x0a4c, B:511:0x0a54, B:497:0x0b12, B:501:0x0b1d, B:503:0x0b23, B:504:0x0b27, B:595:0x0b56, B:597:0x0b62, B:619:0x04e4, B:620:0x04e9, B:621:0x04f2, B:278:0x0476, B:277:0x047b, B:632:0x0484, B:647:0x0371, B:282:0x0376, B:281:0x037b, B:664:0x030c, B:666:0x0311, B:665:0x0316, B:519:0x0a8c, B:523:0x0aa0, B:527:0x0ab9, B:545:0x0af5, B:531:0x0ac4, B:532:0x0acc, B:534:0x0ad2, B:537:0x0ade, B:542:0x0ae8), top: B:667:0x0067, inners: #6, #22, #27, #35, #40, #43, #53, #55, #57, #58, #62, #63, #64, #65, #67, #67, #66, #64, #63, #61, #60, #58, #56, #55, #54, #53, #52, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0afd  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v22, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(java.lang.String r34, com.voxdon.xplorer.service.a.C0527a r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 2933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.service.a.C(java.lang.String, com.voxdon.xplorer.service.a$a, boolean):void");
    }

    public void O(String str) {
        P(str.getBytes());
    }

    public void P(byte[] bArr) {
        try {
            this.c.write(bArr);
            this.c.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void e() {
        d();
        for (C3596o c3596o : this.u.values()) {
            if (Q.X1() && c3596o.Y()) {
                c3596o.n(null);
            }
            c3596o.k0(true);
        }
        this.u.clear();
        this.x.clear();
        this.v.clear();
        this.w.clear();
    }

    InputStream m() throws IOException {
        return this.b.getInputStream();
    }

    BufferedOutputStream n() {
        return this.c;
    }

    public void t() {
        this.o.addAll(Arrays.asList(F));
        ax.Z2.j.F().K0();
        b(K.e, "/device");
        K k = K.h;
        C3605y c3605y = new C3605y((C3604x) C1835x.e(k).u(), new File("/"), k, true, false, true, false, 0L, 0L);
        this.d = c3605y;
        M(c3605y, "/");
        boolean t0 = ax.Z2.j.F().t0();
        this.y = t0;
        if (t0) {
            b(K.f, "/sdcard");
        }
        if (this.z && ax.t3.j.B(this.a)) {
            b(k, "/system");
        }
        List<K> A = ax.Z2.j.F().A();
        if (A != null) {
            int i = 2;
            for (K k2 : A) {
                if (f.j0(k2.d())) {
                    b(k2, "/sdcard" + i);
                    i++;
                }
            }
        }
        List<K> B = ax.Z2.j.F().B();
        HashSet hashSet = new HashSet();
        if (B != null) {
            for (K k3 : B) {
                if (f.Y(k3.d())) {
                    String f = k3.f(this.a);
                    String str = f;
                    int i2 = 2;
                    while (hashSet.contains(str)) {
                        str = f + " " + i2;
                        i2++;
                    }
                    b(k3, "/" + str);
                    hashSet.add(str);
                }
            }
        }
    }
}
