/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.service;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.IBinder;
import ax.Q2.g;
import ax.s3.u;
import ax.u3.C;
import ax.u3.D;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

@SuppressLint(value={"DefaultLocale"})
public class FtpServerService
extends Service {
    private static final Logger o = ax.Q2.g.a(FtpServerService.class);
    private static d p;
    private final IBinder a = new c(this);
    private e b;
    private ServerSocket c;
    private f d;
    private D e;
    private int f;
    private String g;
    private boolean h;
    private WifiManager i;
    private int j;
    private String k;
    private List<b> l = new ArrayList<b>();
    private HashSet<InetAddress> m = new HashSet();
    private HashMap<InetAddress, Integer> n = new HashMap();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void A(b b8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.l.remove(b8);
                        if (this.l.size() > 0) break block4;
                        this.stopSelf();
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

    private void D() throws IOException {
        ServerSocket serverSocket;
        this.c = serverSocket = new ServerSocket();
        serverSocket.setReuseAddress(true);
        this.c.bind(new InetSocketAddress(this.f));
    }

    private void E(Intent object) {
        this.k = object.getStringExtra("extra_ip_address");
        this.f = object.getIntExtra("extra_port_number", 0);
        this.g = object.getStringExtra("extra_password");
        if (p == null) {
            object = new d(this);
            p = object;
            ((Thread)object).start();
        }
    }

    private void F() {
        Object object = this.b;
        if (object != null) {
            object.c();
        }
        p.a(true);
        object = p;
        if (object != null) {
            ((Thread)object).interrupt();
            try {
                p.join(10000L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            if (!p.isAlive()) {
                p = null;
            }
        }
        this.t();
    }

    static /* synthetic */ HashSet g(FtpServerService ftpServerService) {
        return ftpServerService.m;
    }

    static /* synthetic */ void h(FtpServerService ftpServerService, InetAddress inetAddress) {
        ftpServerService.y(inetAddress);
    }

    static /* synthetic */ void i(FtpServerService ftpServerService, b b8) {
        ftpServerService.A(b8);
    }

    static /* synthetic */ f m(FtpServerService ftpServerService, f f8) {
        ftpServerService.d = f8;
        return f8;
    }

    private void r() {
        this.j = C.a((Context)this, 0L, "FtpServerService");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void s(b b8) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.l.size() != 0) break block3;
                        Intent intent = new Intent((Context)this, FtpServerService.class);
                        this.startService(intent);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.l.add(b8);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void t() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    for (b b8 : this.l) {
                        if (b8 == null) continue;
                        b8.a();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    private void u() {
        ServerSocket serverSocket = this.c;
        if (serverSocket != null) {
            try {
                serverSocket.close();
                return;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private Notification v() {
        String string = FtpServerService.w(this.k, this.f);
        return u.j((Context)this).d(this, string);
    }

    public static String w(String string, int n8) {
        return String.format(Locale.US, "ftp://%s:%d", string, n8);
    }

    public static boolean x() {
        d d8 = p;
        return d8 != null && d8.isAlive();
    }

    private void y(InetAddress inetAddress) {
        Integer n8 = this.n.get(inetAddress);
        n8 = n8 == null ? Integer.valueOf(1) : Integer.valueOf(n8 + 1);
        this.n.put(inetAddress, n8);
        if (n8 >= 10) {
            this.m.add(inetAddress);
        }
    }

    private void z() {
        C.d(this.j);
    }

    public void B(e e8) {
        this.b = e8;
    }

    public void C(boolean bl) {
        this.h = bl;
    }

    public IBinder onBind(Intent intent) {
        this.E(intent);
        try {
            this.startForeground(301, this.v());
        }
        catch (IllegalStateException illegalStateException) {
            ax.Ha.c.i((Context)this).f().b("Foreground not allowed : ftp server service").h();
        }
        return this.a;
    }

    public void onCreate() {
        super.onCreate();
        this.i = (WifiManager)this.getApplicationContext().getSystemService("wifi");
        this.e = new D((Context)this, 3, "FTP_SERVER");
    }

    public void onDestroy() {
        this.stopForeground(true);
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        this.E(intent);
    }

    public int onStartCommand(Intent intent, int n8, int n9) {
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        this.F();
        return true;
    }

    private class b
    extends Thread {
        private boolean c0;
        private String d0;
        private boolean e0;
        final FtpServerService f0;
        private Socket q;

        public b(FtpServerService ftpServerService, Socket socket, boolean bl, String string, boolean bl2) {
            this.f0 = ftpServerService;
            this.q = socket;
            this.c0 = bl;
            this.d0 = string;
            this.e0 = bl2;
        }

        public void a() {
            Socket socket = this.q;
            if (socket != null) {
                try {
                    socket.close();
                    return;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }

        /*
         * Exception decompiling
         */
        @Override
        public void run() {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [11, 10 : 203->211)] java.lang.Throwable
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }
    }

    public class c
    extends Binder {
        final FtpServerService e;

        public c(FtpServerService ftpServerService) {
            this.e = ftpServerService;
        }

        public FtpServerService a() {
            return this.e;
        }
    }

    class d
    extends Thread {
        final FtpServerService c0;
        private boolean q;

        d(FtpServerService ftpServerService) {
            this.c0 = ftpServerService;
            this.q = false;
        }

        void a(boolean bl) {
            this.q = bl;
        }

        @Override
        public void run() {
            IOException iOException2;
            block12: {
                block11: {
                    try {
                        this.c0.D();
                        this.c0.e.a();
                        this.c0.r();
                        if (this.c0.b == null) break block11;
                        this.c0.b.b();
                    }
                    catch (IOException iOException2) {
                        break block12;
                    }
                }
                while (!this.q) {
                    if (this.c0.d != null && !this.c0.d.isAlive()) {
                        try {
                            this.c0.d.join();
                        }
                        catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        FtpServerService.m(this.c0, null);
                    }
                    if (this.c0.d == null) {
                        FtpServerService ftpServerService = this.c0;
                        FtpServerService.m(ftpServerService, new f(ftpServerService));
                        this.c0.d.start();
                    }
                    try {
                        Thread.sleep(1000L);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    if (this.c0.d.isAlive() || this.c0.i.getWifiState() != 1) continue;
                    this.c0.stopSelf();
                    break;
                }
                if (this.c0.b != null) {
                    this.c0.b.c();
                }
                this.c0.z();
                this.c0.e.c();
                this.c0.u();
                return;
            }
            iOException2.printStackTrace();
            this.c0.stopSelf();
            if (this.c0.b != null) {
                this.c0.b.c();
            }
        }
    }

    public static interface e {
        public void a(String var1);

        public void b();

        public void c();
    }

    private class f
    extends Thread {
        final FtpServerService q;

        private f(FtpServerService ftpServerService) {
            this.q = ftpServerService;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            try {
                while (true) {
                    Socket socket = this.q.c.accept();
                    FtpServerService ftpServerService = this.q;
                    boolean bl2 = ftpServerService.h;
                    String string = this.q.g;
                    boolean bl = this.q.l.size() >= 30;
                    b b8 = new b(ftpServerService, socket, bl2, string, bl);
                    this.q.s(b8);
                    b8.start();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
    }
}

