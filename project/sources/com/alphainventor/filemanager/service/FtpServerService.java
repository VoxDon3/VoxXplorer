package com.voxdon.xplorer.service;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.IBinder;
import ax.Q2.g;
import ax.s3.u;
import ax.u3.C3181C;
import ax.u3.C3182D;
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

@SuppressLint({"DefaultLocale"})
/* loaded from: classes.dex */
public class FtpServerService extends Service {
    private static final Logger o = g.a(FtpServerService.class);
    private static d p;
    private e b;
    private ServerSocket c;
    private f d;
    private C3182D e;
    private int f;
    private String g;
    private boolean h;
    private WifiManager i;
    private int j;
    private String k;
    private final IBinder a = new c();
    private List<b> l = new ArrayList();
    private HashSet<InetAddress> m = new HashSet<>();
    private HashMap<InetAddress, Integer> n = new HashMap<>();

    private class b extends Thread {
        private boolean c0;
        private String d0;
        private boolean e0;
        private Socket q;

        public b(Socket socket, boolean z, String str, boolean z2) {
            this.q = socket;
            this.c0 = z;
            this.d0 = str;
            this.e0 = z2;
        }

        public void a() {
            Socket socket = this.q;
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00fd, code lost:
        
            if (r9 == null) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
        
            r9.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x00db, code lost:
        
            if (r9 == null) goto L77;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.service.FtpServerService.b.run():void");
        }
    }

    public class c extends Binder {
        public c() {
        }

        public FtpServerService a() {
            return FtpServerService.this;
        }
    }

    class d extends Thread {
        private boolean q = false;

        d() {
        }

        void a(boolean z) {
            this.q = z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                FtpServerService.this.D();
                FtpServerService.this.e.a();
                FtpServerService.this.r();
                if (FtpServerService.this.b != null) {
                    FtpServerService.this.b.b();
                }
                while (true) {
                    if (!this.q) {
                        if (FtpServerService.this.d != null && !FtpServerService.this.d.isAlive()) {
                            try {
                                FtpServerService.this.d.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            FtpServerService.this.d = null;
                        }
                        if (FtpServerService.this.d == null) {
                            FtpServerService ftpServerService = FtpServerService.this;
                            ftpServerService.d = new f();
                            FtpServerService.this.d.start();
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        if (!FtpServerService.this.d.isAlive() && FtpServerService.this.i.getWifiState() == 1) {
                            FtpServerService.this.stopSelf();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (FtpServerService.this.b != null) {
                    FtpServerService.this.b.c();
                }
                FtpServerService.this.z();
                FtpServerService.this.e.c();
                FtpServerService.this.u();
            } catch (IOException e3) {
                e3.printStackTrace();
                FtpServerService.this.stopSelf();
                if (FtpServerService.this.b != null) {
                    FtpServerService.this.b.c();
                }
            }
        }
    }

    public interface e {
        void a(String str);

        void b();

        void c();
    }

    private class f extends Thread {
        private f() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Socket accept = FtpServerService.this.c.accept();
                    FtpServerService ftpServerService = FtpServerService.this;
                    b bVar = ftpServerService.new b(accept, ftpServerService.h, FtpServerService.this.g, FtpServerService.this.l.size() >= 30);
                    FtpServerService.this.s(bVar);
                    bVar.start();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A(b bVar) {
        this.l.remove(bVar);
        if (this.l.size() <= 0) {
            stopSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        this.c = serverSocket;
        serverSocket.setReuseAddress(true);
        this.c.bind(new InetSocketAddress(this.f));
    }

    private void E(Intent intent) {
        this.k = intent.getStringExtra("extra_ip_address");
        this.f = intent.getIntExtra("extra_port_number", 0);
        this.g = intent.getStringExtra("extra_password");
        if (p == null) {
            d dVar = new d();
            p = dVar;
            dVar.start();
        }
    }

    private void F() {
        e eVar = this.b;
        if (eVar != null) {
            eVar.c();
        }
        p.a(true);
        d dVar = p;
        if (dVar != null) {
            dVar.interrupt();
            try {
                p.join(10000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            if (!p.isAlive()) {
                p = null;
            }
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.j = C3181C.a(this, 0L, "FtpServerService");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void s(b bVar) {
        try {
            if (this.l.size() == 0) {
                startService(new Intent(this, (Class<?>) FtpServerService.class));
            }
            this.l.add(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void t() {
        for (b bVar : this.l) {
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        ServerSocket serverSocket = this.c;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    private Notification v() {
        return u.j(this).d(this, w(this.k, this.f));
    }

    public static String w(String str, int i) {
        return String.format(Locale.US, "ftp://%s:%d", str, Integer.valueOf(i));
    }

    public static boolean x() {
        d dVar = p;
        return dVar != null && dVar.isAlive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(InetAddress inetAddress) {
        Integer num = this.n.get(inetAddress);
        Integer valueOf = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
        this.n.put(inetAddress, valueOf);
        if (valueOf.intValue() >= 10) {
            this.m.add(inetAddress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        C3181C.d(this.j);
    }

    public void B(e eVar) {
        this.b = eVar;
    }

    public void C(boolean z) {
        this.h = z;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        E(intent);
        try {
            startForeground(301, v());
        } catch (IllegalStateException unused) {
            ax.Ha.c.i(this).f().b("Foreground not allowed : ftp server service").h();
        }
        return this.a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.i = (WifiManager) getApplicationContext().getSystemService("wifi");
        this.e = new C3182D(this, 3, "FTP_SERVER");
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        E(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        F();
        return true;
    }
}
