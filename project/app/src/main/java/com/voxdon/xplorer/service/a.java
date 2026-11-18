/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import ax.Q2.f;
import ax.Q2.g;
import ax.X2.Q;
import ax.b3.t;
import ax.c3.K;
import ax.c3.d0;
import ax.rd.d;
import ax.rd.e;
import ax.rd.h;
import ax.rd.i;
import ax.rd.j;
import ax.rd.k;
import ax.td.c;
import ax.u3.b;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

@SuppressLint(value={"DefaultLocale", "SimpleDateFormat"})
public class a {
    private static final Logger E = ax.Q2.g.a(a.class);
    private static final String[] F = new String[]{"CWD", "CDUP", "SMNT", "PORT", "PASV", "MODE", "TYPE", "STRU", "ALL0", "REST", "STOR", "STOU", "RETR", "LIST", "NLST", "APPE", "RNFR", "RNT0", "DELE", "RMD", "MKD", "STAT", "SITE", "MLST", "MLST", "PBSZ", "PROT"};
    private static final Map<String, SSLContext> G = new j.ConcurrentHashMap();
    private long A;
    private boolean B;
    private boolean C;
    private SSLContext D;
    private Context a;
    private Socket b;
    private BufferedOutputStream c;
    private n d;
    private n e;
    private String f;
    private boolean g = false;
    private ServerSocket h;
    private InetAddress i;
    private int j;
    private boolean k;
    private String l;
    private String m;
    private String n;
    private HashSet<String> o = new HashSet();
    private n p;
    private SimpleDateFormat q;
    private SimpleDateFormat r;
    private SimpleDateFormat s;
    private SimpleDateFormat t;
    private Map<K, o> u;
    private Map<K, n> v;
    private List<K> w;
    private Map<K, String> x;
    private boolean y;
    private boolean z;

    public a(Context context, Socket socket, BufferedOutputStream bufferedOutputStream, boolean bl, String string) throws IOException {
        Locale locale = Locale.US;
        this.q = new SimpleDateFormat(" MMM dd HH:mm ", locale);
        this.r = new SimpleDateFormat(" MMM dd  yyyy ", locale);
        this.s = new SimpleDateFormat("yyyyMMddHHmmss.SSS", locale);
        this.u = new j.ConcurrentHashMap();
        this.v = new j.ConcurrentHashMap();
        this.w = new ArrayList<K>();
        this.x = new j.ConcurrentHashMap();
        this.a = context;
        this.b = socket;
        this.z = bl;
        this.c = bufferedOutputStream;
        this.s.setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"GMT"));
        this.m = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.k = true;
        }
    }

    private static String A(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "127.0.0.1";
        }
        int n8 = string.indexOf(37);
        String string2 = string;
        if (n8 >= 0) {
            string2 = string.substring(0, n8);
        }
        return string2;
    }

    private Socket B() {
        Closeable closeable = this.h;
        if (closeable == null) {
            try {
                closeable = new Socket(this.i, this.j);
                ((Socket)closeable).setSoTimeout(30000);
                closeable = this.E((Socket)closeable);
                return closeable;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.d();
            }
        } else {
            try {
                closeable = closeable.accept();
                this.d();
                closeable = this.E((Socket)closeable);
                return closeable;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return null;
    }

    private void D(String object, a a8) {
        if (!"TLS".equals(object = ((String)object).toUpperCase(Locale.US)) && !"SSL".equals(object)) {
            this.O("504 Unsupported AUTH type\r\n");
            return;
        }
        if (this.B) {
            this.O("503 Control connection is already protected\r\n");
            return;
        }
        this.D = object = com.voxdon.xplorer.service.a.s(this.a, this.r());
        if (object == null) {
            this.O("431 TLS is not available\r\n");
            return;
        }
        this.O("234 AUTH TLS OK\r\n");
        try {
            object = this.D.getSocketFactory();
            Closeable closeable = this.b;
            object = (SSLSocket)((SSLSocketFactory)object).createSocket((Socket)closeable, closeable.getInetAddress().getHostAddress(), this.b.getPort(), false);
            ((SSLSocket)object).setUseClientMode(false);
            ((SSLSocket)object).setNeedClientAuth(false);
            ((SSLSocket)object).startHandshake();
            this.b = object;
            closeable = new BufferedOutputStream(((Socket)object).getOutputStream());
            this.c = closeable;
            this.B = true;
            a8.c = true;
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    private Socket E(Socket socket) throws IOException {
        if (!this.C) {
            return socket;
        }
        SSLContext sSLContext = this.D;
        if (sSLContext == null) {
            this.f(socket);
            return null;
        }
        socket = (SSLSocket)sSLContext.getSocketFactory().createSocket(socket, socket.getInetAddress().getHostAddress(), socket.getPort(), false);
        ((SSLSocket)socket).setUseClientMode(false);
        ((SSLSocket)socket).setNeedClientAuth(false);
        return socket;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void F(n object, boolean bl, long l8) {
        Throwable throwable;
        Object object2;
        Object object3;
        block39: {
            block43: {
                block41: {
                    block42: {
                        RuntimeException var1_9;
                        block40: {
                            Object object4;
                            Object object5;
                            Object object6;
                            long l9;
                            block38: {
                                com.voxdon.xplorer.file.e e8;
                                Object var12_29;
                                Object object7;
                                block37: {
                                    Socket socket = this.B();
                                    if (socket == null) {
                                        this.O("425 Error opening data socket\r\n");
                                        this.f(socket);
                                        return;
                                    }
                                    long l10 = l8 - 0L;
                                    l9 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                                    if (l9 > 0 && object.p() < l8) {
                                        this.O("451 File IO error\r\n");
                                        return;
                                    }
                                    object3 = Locale.US;
                                    object2 = this.g ? "BINARY" : "ASCII";
                                    this.O(String.format((Locale)object3, "150 Opening %s mode data connection for writing\r\n", object2));
                                    if (!this.N(socket)) {
                                        this.O("426 Data socket or network error\r\n");
                                        this.f(socket);
                                        return;
                                    }
                                    object7 = null;
                                    object6 = null;
                                    object3 = null;
                                    object5 = null;
                                    object4 = null;
                                    var12_29 = null;
                                    e8 = (com.voxdon.xplorer.file.e)this.p((n)object).u();
                                    object2 = socket.getInputStream();
                                    if (l9 <= 0) break block37;
                                    object3 = var12_29;
                                    object4 = object7;
                                    object5 = object6;
                                    try {
                                        e8.l0(((n)object).E(), l8);
                                        object3 = var12_29;
                                        object4 = object7;
                                        object5 = object6;
                                        object = e8.c(((n)object).E(), true);
                                        break block38;
                                    }
                                    catch (Throwable throwable2) {
                                        break block39;
                                    }
                                    catch (IOException iOException) {
                                        object3 = object4;
                                        break block40;
                                    }
                                    catch (FileNotFoundException fileNotFoundException) {
                                        throwable = object5;
                                        break block41;
                                    }
                                }
                                object3 = var12_29;
                                object4 = object7;
                                object5 = object6;
                                object = e8.c(((n)object).E(), bl);
                            }
                            if (object != null) {
                                object3 = object;
                                object4 = object;
                                object5 = object;
                                object6 = new byte[65536];
                                while (true) {
                                    object3 = object;
                                    object4 = object;
                                    object5 = object;
                                    l9 = ((InputStream)object2).read((byte[])object6);
                                    if (l9 < 0) break;
                                    if (l9 == false) {
                                        object3 = object;
                                        object4 = object;
                                        object5 = object;
                                        try {
                                            Thread.sleep(5L);
                                        }
                                        catch (InterruptedException interruptedException) {}
                                        continue;
                                    }
                                    object3 = object;
                                    object4 = object;
                                    object5 = object;
                                    ((OutputStream)object).write((byte[])object6, 0, (int)l9);
                                }
                                object3 = object;
                                object4 = object;
                                object5 = object;
                                ((OutputStream)object).flush();
                                object3 = object;
                                object4 = object;
                                object5 = object;
                                this.O("226 Data transmission for writing succeeded\r\n");
                            } else {
                                object3 = object;
                                object4 = object;
                                object5 = object;
                                this.O("451 Permission denied\r\n");
                            }
                            if (object2 != null) {
                                try {
                                    ((InputStream)object2).close();
                                }
                                catch (IOException iOException) {
                                    // empty catch block
                                }
                            }
                            if (object == null) return;
                            try {
                                ((OutputStream)object).close();
                                return;
                            }
                            catch (IOException iOException) {
                                return;
                            }
                            catch (Throwable throwable3) {
                                object3 = null;
                                object2 = object4;
                                break block39;
                            }
                            catch (IOException iOException) {
                                object4 = null;
                                object2 = object3;
                                object3 = object4;
                            }
                            catch (FileNotFoundException fileNotFoundException) {
                                throwable = null;
                                object2 = object5;
                                break block41;
                            }
                        }
                        var1_9.printStackTrace();
                        this.O("451 File IO error\r\n");
                        if (object2 == null) break block42;
                        try {
                            ((InputStream)object2).close();
                        }
                        catch (IOException iOException) {
                            // empty catch block
                        }
                    }
                    if (object3 == null) return;
                    ((OutputStream)object3).close();
                    return;
                    catch (Throwable throwable4) {}
                    break block39;
                }
                this.O("550 No such file or directory.\r\n");
                if (object2 == null) break block43;
                try {
                    ((InputStream)object2).close();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            if (throwable == null) return;
            ((OutputStream)((Object)throwable)).close();
            return;
            catch (Throwable throwable5) {
                object3 = throwable;
                throwable = throwable5;
            }
        }
        if (object2 != null) {
            try {
                ((InputStream)object2).close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (object3 == null) throw throwable;
        try {
            ((OutputStream)object3).close();
            throw throwable;
        }
        catch (IOException iOException) {
            throw throwable;
        }
    }

    private static void G(Context context, String string, KeyStore keyStore) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            keyStore.store(byteArrayOutputStream, "filemanager".toCharArray());
            ax.o3.h.h(context, string, Base64.encodeToString((byte[])byteArrayOutputStream.toByteArray(), (int)2));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private boolean H(Socket socket, byte[] byArray) {
        return this.I(socket, byArray, 0, byArray.length);
    }

    private boolean I(Socket socket, byte[] byArray, int n8, int n9) {
        try {
            socket.getOutputStream().write(byArray, n8, n9);
            return true;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return false;
        }
    }

    /*
     * Exception decompiling
     */
    private void J(n var1_1, long var2_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [23, 22, 20, 21 : 172->179)] java.lang.Throwable
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

    private void K(String string, String string2) {
        Socket socket = this.B();
        if (socket == null) {
            this.O("425 Error opening data socket\r\n");
            this.f(socket);
            return;
        }
        Locale locale = Locale.US;
        String string3 = this.g ? "BINARY" : "ASCII";
        this.O(String.format(locale, "150 Opening %s mode data connection for %s\r\n", string3, string));
        if (!this.N(socket)) {
            this.O("426 Data socket or network error\r\n");
            this.f(socket);
            return;
        }
        if (this.H(socket, string2.getBytes())) {
            this.O("226 Data transmission succeeded\r\n");
        } else {
            this.O("426 Data socket or network error\r\n");
        }
        this.f(socket);
    }

    private int L() {
        this.d();
        try {
            ServerSocket serverSocket;
            this.h = serverSocket = new ServerSocket(0, 5);
            int n8 = serverSocket.getLocalPort();
            return n8;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return 0;
        }
    }

    private void M(n n8, String string) {
        this.e = n8;
        this.f = string;
    }

    private boolean N(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return true;
        }
        try {
            ((SSLSocket)socket).startHandshake();
            return true;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return false;
        }
    }

    private void a(StringBuilder stringBuilder, boolean bl, n n8, String string) {
        if (bl) {
            stringBuilder.append(" ");
        }
        if (n8.isDirectory()) {
            stringBuilder.append("Type=dir;Modify=");
            stringBuilder.append(this.s.format(new Date(n8.q())));
            stringBuilder.append(";Perm=el; ");
            if (string == null) {
                stringBuilder.append(n8.B());
            } else {
                stringBuilder.append(string);
            }
        } else {
            stringBuilder.append("Type=file;Size=");
            stringBuilder.append(n8.p());
            stringBuilder.append(";Modify=");
            stringBuilder.append(this.s.format(new Date(n8.q())));
            stringBuilder.append(";Perm=");
            stringBuilder.append("r");
            if (n8.P() == ax.Q2.f.o0) {
                stringBuilder.append("w");
            } else if (n8.j()) {
                stringBuilder.append("w");
            }
            stringBuilder.append("; ");
            if (string == null) {
                stringBuilder.append(n8.B());
            } else {
                stringBuilder.append(string);
            }
        }
        stringBuilder.append("\r\n");
    }

    private void b(K k8, String string) {
        block7: {
            o o8;
            block6: {
                if (!ax.Q2.f.Y(k8.d())) {
                    ax.u3.b.g("Not local file location in FTP!");
                    return;
                }
                o8 = ax.c3.x.e(k8);
                if (o8.a()) break block6;
                o8.h(null);
                if (!o8.a()) break block7;
            }
            try {
                o8.n0();
                n n8 = o8.z(k8.e());
                this.u.put(k8, o8);
                this.v.put(k8, n8);
                this.x.put(k8, string);
                this.w.add(k8);
                return;
            }
            catch (ax.b3.j j8) {
                o8.k0(false);
            }
        }
    }

    private boolean c(String string, String string2) {
        if (!TextUtils.isEmpty((CharSequence)this.n) && !this.n.equals(string)) {
            return false;
        }
        return TextUtils.isEmpty((CharSequence)this.m) || this.m.equals(string2);
    }

    private void d() {
        ServerSocket serverSocket = this.h;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            this.h = null;
        }
    }

    private void f(Socket socket) {
        if (socket != null && !socket.isClosed()) {
            try {
                socket.getOutputStream().close();
                socket.close();
                return;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private String g(n n8, boolean bl, boolean bl2) {
        if (!n8.B().contains("*") && !n8.B().contains(File.separator)) {
            StringBuilder stringBuilder = new StringBuilder();
            String string = this.q(n8);
            if (bl) {
                this.a(stringBuilder, false, n8, string);
            } else {
                if (!bl2) {
                    if (n8.isDirectory()) {
                        stringBuilder.append("drwxr-xr-x 1 owner group");
                    } else {
                        stringBuilder.append("-rw-r--r-- 1 owner group");
                    }
                    stringBuilder.append(String.format(Locale.US, "%13d", n8.p()));
                    SimpleDateFormat simpleDateFormat = System.currentTimeMillis() - n8.q() > 15552000000L ? this.r : this.q;
                    stringBuilder.append(simpleDateFormat.format(new Date(n8.q())));
                }
                stringBuilder.append(string);
                stringBuilder.append("\r\n");
            }
            return stringBuilder.toString();
        }
        return null;
    }

    private static X509Certificate h(String object, KeyPair keyPair) throws Exception {
        long l8 = System.currentTimeMillis();
        Object object2 = new Date(l8 - 86400000L);
        Date date = new Date(l8 + 315360000000L);
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append("CN=");
        ((StringBuilder)object3).append("Vox Xplorer");
        ((StringBuilder)object3).append(" FTPS Server");
        object3 = new ax.pd.c(((StringBuilder)object3).toString());
        object2 = new ax.ud.d((ax.pd.c)object3, new BigInteger(160, new SecureRandom()), (Date)object2, date, (ax.pd.c)object3, keyPair.getPublic());
        ((c)object2).a(ax.rd.e.k0, true, new ax.rd.b(false));
        ((c)object2).a(ax.rd.e.g0, true, new k(160));
        ((c)object2).a(ax.rd.e.y0, false, new d(ax.rd.j.e0));
        ((c)object2).a(ax.rd.e.i0, false, com.voxdon.xplorer.service.a.k((String)object));
        object = new ax.Md.a("SHA256withRSA").b(keyPair.getPrivate());
        return new ax.ud.c().a(((c)object2).b((ax.Ld.a)object));
    }

    private static KeyStore i(String object) throws Exception {
        Object object2 = KeyPairGenerator.getInstance("RSA");
        ((KeyPairGenerator)object2).initialize(2048);
        object2 = ((KeyPairGenerator)object2).generateKeyPair();
        object = com.voxdon.xplorer.service.a.h((String)object, (KeyPair)object2);
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        keyStore.setKeyEntry("ftp_server", ((KeyPair)object2).getPrivate(), "filemanager".toCharArray(), new Certificate[]{object});
        return keyStore;
    }

    private static SSLContext j(Context object, String object2) throws Exception {
        KeyStore keyStore;
        KeyStore keyStore2 = keyStore = com.voxdon.xplorer.service.a.x((Context)object, (String)object2);
        if (keyStore == null) {
            keyStore2 = com.voxdon.xplorer.service.a.i((String)object2);
            com.voxdon.xplorer.service.a.G((Context)object, (String)object2, keyStore2);
        }
        object = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        ((KeyManagerFactory)object).init(keyStore2, "filemanager".toCharArray());
        object2 = SSLContext.getInstance("TLSv1.2");
        ((SSLContext)object2).init(((KeyManagerFactory)object).getKeyManagers(), null, new SecureRandom());
        return object2;
    }

    private static i k(String string) {
        ArrayList<h> arrayList = new ArrayList<h>();
        if (!TextUtils.isEmpty((CharSequence)string) && !"127.0.0.1".equals(string)) {
            arrayList.add(new h(7, string));
        }
        return new i(arrayList.toArray(new h[arrayList.size()]));
    }

    private String l(String string) throws IllegalArgumentException {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            if (this.v(string)) {
                return "/";
            }
            String string2 = File.separator;
            String string3 = string;
            if (string.endsWith(string2)) {
                string3 = string.substring(0, string.length() - 1);
            }
            if (string3.startsWith(string2)) {
                return string3;
            }
            return d0.Q(this.f, string3);
        }
        throw new IllegalArgumentException("Paramater is empty");
    }

    private n o(String object) throws ax.b3.j {
        K k8;
        Object object2;
        block8: {
            if (this.v((String)object)) {
                return this.d;
            }
            Object object3 = this.x.entrySet().iterator();
            object2 = object;
            while (object3.hasNext()) {
                object = object3.next();
                k8 = (K)object.getKey();
                String string = (String)object.getValue();
                object = this.v.get(k8);
                if (object == null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append(ax.Z2.j.F().T());
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append(ax.Z2.j.F().t0());
                    object2 = ((StringBuilder)object).toString();
                    ax.u3.b.g((String)object2);
                    continue;
                }
                if (!d0.I(string, (String)object2) && !d0.G(string, (String)object2)) continue;
                object3 = ((n)object).E();
                object = "/";
                if ("/".equals(object3)) {
                    object3 = ((String)object2).replaceFirst(string, "");
                    if (!TextUtils.isEmpty((CharSequence)object3)) {
                        object = object3;
                    }
                } else {
                    object = ((String)object2).replaceFirst(string, (String)object3);
                }
                break block8;
            }
            k8 = null;
            object = null;
        }
        if (object != null) {
            object2 = this.u.get(k8);
            if (object2 != null) {
                return ((o)object2).z((String)object);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("No file operator available : ");
            ((StringBuilder)object).append(k8.k());
            throw new ax.b3.j(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("File not exist : ");
        ((StringBuilder)object).append((String)object2);
        throw new t(((StringBuilder)object).toString());
    }

    private o p(n n8) {
        return this.u.get(n8.R());
    }

    private String q(n n8) {
        if (d0.E(n8)) {
            String string = this.x.get(n8.R());
            if (string != null) {
                return d0.h(string);
            }
            ax.u3.b.g("root path is not available");
            return n8.B();
        }
        return n8.B();
    }

    private String r() {
        InetAddress inetAddress = this.b.getLocalAddress();
        if (inetAddress != null) {
            return com.voxdon.xplorer.service.a.A(inetAddress.getHostAddress());
        }
        return "127.0.0.1";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static SSLContext s(Context context, String object) {
        Map<String, SSLContext> map = G;
        String string = com.voxdon.xplorer.service.a.A((String)object);
        if ((object = map.get(string)) != null) {
            return object;
        }
        synchronized (a.class) {
            Throwable throwable2;
            block7: {
                block6: {
                    try {
                        SSLContext sSLContext = map.get(string);
                        object = sSLContext;
                        if (sSLContext != null) break block6;
                        try {
                            object = com.voxdon.xplorer.service.a.j(context, string);
                            map.put(string, (SSLContext)object);
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return null;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }

    private boolean u(n n8) {
        boolean bl = n8.R() == K.h ? true : n8.d();
        return n8.isDirectory() && bl && this.w(n8);
    }

    private boolean v(String string) {
        return "/".equals(string);
    }

    private boolean w(n n8) {
        String string = n8.R().e();
        return n8.E().startsWith(string) || "/".equals(n8.E());
        {
        }
    }

    private static KeyStore x(Context context, String string) {
        Exception exception2;
        block4: {
            KeyStore keyStore;
            Object object = ax.o3.h.c(context, string);
            if (TextUtils.isEmpty((CharSequence)object)) {
                return null;
            }
            try {
                byte[] byArray = Base64.decode((String)object, (int)2);
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                object = new ByteArrayInputStream(byArray);
                keyStore.load((InputStream)object, "filemanager".toCharArray());
                if (!keyStore.containsAlias("ftp_server")) {
                    ax.o3.h.e(context, string);
                    return null;
                }
            }
            catch (Exception exception2) {
                break block4;
            }
            return keyStore;
        }
        exception2.printStackTrace();
        ax.o3.h.e(context, string);
        return null;
    }

    private String y(String string) {
        return String.format(Locale.US, "550 %s: No such file or directory.\r\n", string);
    }

    private boolean z(String string) {
        return this.o.contains(string);
    }

    /*
     * Exception decompiling
     */
    public void C(String var1_1, a var2_70, boolean var3_71) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 155->165)] java.lang.Throwable
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

    public void O(String string) {
        this.P(string.getBytes());
    }

    public void P(byte[] byArray) {
        try {
            ((OutputStream)this.c).write(byArray);
            this.c.flush();
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public void e() {
        this.d();
        for (o o8 : this.u.values()) {
            if (Q.X1() && o8.Y()) {
                o8.n(null);
            }
            o8.k0(true);
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
        Serializable serializable;
        int n8;
        boolean bl;
        this.o.addAll(Arrays.asList(F));
        ax.Z2.j.F().K0();
        this.b(K.e, "/device");
        Object object = K.h;
        Object object2 = new y((x)ax.c3.x.e((K)object).u(), new File("/"), (K)object, true, false, true, false, 0L, 0L);
        this.d = object2;
        this.M((n)object2, "/");
        this.y = bl = ax.Z2.j.F().t0();
        if (bl) {
            this.b(K.f, "/sdcard");
        }
        if (this.z && ax.t3.j.B(this.a)) {
            this.b((K)object, "/system");
        }
        if ((object2 = ax.Z2.j.F().A()) != null) {
            object = object2.iterator();
            n8 = 2;
            while (object.hasNext()) {
                object2 = (K)object.next();
                if (!ax.Q2.f.j0(((K)object2).d())) continue;
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("/sdcard");
                ((StringBuilder)serializable).append(n8);
                this.b((K)object2, ((StringBuilder)serializable).toString());
                ++n8;
            }
        }
        object2 = ax.Z2.j.F().B();
        serializable = new HashSet();
        if (object2 != null) {
            Iterator<K> iterator = object2.iterator();
            while (iterator.hasNext()) {
                K k8 = iterator.next();
                if (!ax.Q2.f.Y(k8.d())) continue;
                object2 = object = k8.f(this.a);
                n8 = 2;
                while (((HashSet)serializable).contains(object2)) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(" ");
                    ((StringBuilder)object2).append(n8);
                    object2 = ((StringBuilder)object2).toString();
                    ++n8;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("/");
                ((StringBuilder)object).append((String)object2);
                this.b(k8, ((StringBuilder)object).toString());
                ((HashSet)serializable).add(object2);
            }
        }
    }

    static class a {
        String a;
        boolean b;
        boolean c;

        a() {
        }

        void a() {
            this.a = null;
            this.b = false;
            this.c = false;
        }
    }
}

