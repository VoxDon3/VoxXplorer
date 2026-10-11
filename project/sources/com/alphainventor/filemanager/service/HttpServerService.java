package com.voxdon.xplorer.service;

import android.app.Notification;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import ax.Q2.f;
import ax.Q2.g;
import ax.c3.C1835x;
import ax.o3.C2686c;
import ax.s3.u;
import ax.u3.C3180B;
import ax.u3.C3182D;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.service.b;
import com.example.android.uamp.MusicService;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class HttpServerService extends Service {
    private static final Logger n = g.a(HttpServerService.class);
    private static boolean o = false;
    private static HttpServerService p = null;
    private static boolean q = false;
    private e a;
    private boolean b;
    private boolean c;
    private int f;
    private boolean g;
    private long h;
    private C3182D i;
    boolean l;
    private Handler d = new Handler(Looper.getMainLooper());
    private Set<C3596o> e = new ax.B.b();
    private b.a j = new a();
    Runnable k = new b();
    BroadcastReceiver m = new c();

    class a implements b.a {
        a() {
        }

        @Override // com.voxdon.xplorer.service.b.a
        public void a(int i) {
            if (i == 0) {
                HttpServerService.this.a = e.STARTED_NO_CLIENT;
                HttpServerService.this.r();
            } else {
                HttpServerService.this.a = e.STARTED_RUNNING_CLIENT;
                if (i > HttpServerService.this.f) {
                    HttpServerService.this.m();
                }
            }
            HttpServerService.this.f = i;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServerService.n.fine("Timeout http multimedia server! : " + HttpServerService.this.a);
            HttpServerService httpServerService = HttpServerService.this;
            if (httpServerService.l && httpServerService.a != e.STARTED_RUNNING_CLIENT) {
                if (HttpServerService.this.b && MusicService.I()) {
                    HttpServerService.this.r();
                    return;
                } else if (HttpServerService.q) {
                    HttpServerService.this.u();
                    return;
                } else {
                    HttpServerService.this.w();
                    HttpServerService.this.m();
                    return;
                }
            }
            HttpServerService httpServerService2 = HttpServerService.this;
            if (!httpServerService2.l || !httpServerService2.c || HttpServerService.this.b || MusicService.G()) {
                HttpServerService.this.k();
            } else if (HttpServerService.q) {
                HttpServerService.this.u();
            } else {
                HttpServerService.this.w();
                HttpServerService.this.m();
            }
        }
    }

    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("state", 0);
            HttpServerService.n.fine("music playback stop received : " + HttpServerService.this.b + ":" + intExtra);
            if (HttpServerService.this.b) {
                if (intExtra == 1) {
                    HttpServerService.this.b = false;
                }
                HttpServerService.this.s();
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServerService.this.stopSelf();
        }
    }

    public enum e {
        NOT_STARTED,
        STARTED_NO_CLIENT,
        STARTED_RUNNING_CLIENT
    }

    public static Uri l(int i, AbstractC3595n abstractC3595n) {
        return new Uri.Builder().scheme("http").encodedAuthority("127.0.0.1:" + i).path(C2686c.C(abstractC3595n)).build();
    }

    private Notification n(Intent intent, boolean z) {
        return u.j(this).e(this, intent, z);
    }

    public static e p() {
        return o ? p.o() : e.NOT_STARTED;
    }

    public static void q(Context context, f fVar, int i, boolean z, boolean z2, boolean z3, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) HttpServerService.class);
        intent2.putExtra("location", fVar);
        intent2.putExtra("location_key", i);
        intent2.putExtra("play_intent", intent);
        intent2.putExtra("music_playback", z);
        intent2.putExtra("is_multimedia", z2);
        if (!z3 && C3180B.V(context)) {
            z3 = true;
        }
        intent2.putExtra("need_foreground", z3);
        if (!z3) {
            context.startService(intent2);
            return;
        }
        try {
            C3180B.f0(context, intent2, true, true);
            q = true;
        } catch (IllegalStateException e2) {
            ax.Ha.c.i(context).f().b("START HTTP SERVICE FOREGROUND").l(e2).h();
        }
    }

    public static void v(Context context) {
        HttpServerService httpServerService;
        int ordinal = p().ordinal();
        if (ordinal == 0) {
            HttpServerService httpServerService2 = p;
            if (httpServerService2 != null) {
                httpServerService2.t();
                return;
            }
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2 && (httpServerService = p) != null) {
                httpServerService.t();
                return;
            }
            return;
        }
        HttpServerService httpServerService3 = p;
        if (httpServerService3 != null && httpServerService3.b && MusicService.I()) {
            p.r();
            return;
        }
        HttpServerService httpServerService4 = p;
        if (httpServerService4 != null) {
            httpServerService4.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.h <= 0) {
            stopSelf();
        } else if (SystemClock.uptimeMillis() - this.h < 100) {
            this.d.postDelayed(new d(), 100L);
        } else {
            stopSelf();
        }
    }

    void k() {
        if (this.b || !ax.Q2.b.h().m()) {
            if (this.b) {
                return;
            }
            ax.Q2.b.h().m();
        } else if (this.g) {
            stopForeground(true);
            this.g = false;
        }
    }

    synchronized void m() {
        if (this.l) {
            n.fine("Cancel timeout to stop multimedia server");
            this.d.removeCallbacks(this.k);
            this.l = false;
        }
    }

    e o() {
        return this.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        n.fine("Http server created");
        this.a = e.NOT_STARTED;
        this.l = false;
        ax.L0.a.b(this).c(this.m, new IntentFilter("local.intent.action.LOCAL_PLAYBACK_STOP"));
        this.i = new C3182D(this, 3, "HTTP_SERVER");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m();
        com.voxdon.xplorer.service.b.f(this).n(this.j);
        Iterator<C3596o> it = this.e.iterator();
        while (it.hasNext()) {
            com.voxdon.xplorer.service.b.f(this).o(it.next());
        }
        this.e.clear();
        if (this.g) {
            stopForeground(true);
            this.g = false;
        }
        o = false;
        p = null;
        ax.L0.a.b(this).f(this.m);
        this.i.c();
        n.fine("Http server stopped");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Intent intent2;
        boolean booleanExtra;
        boolean booleanExtra2;
        if (intent == null) {
            intent2 = null;
            booleanExtra = true;
            booleanExtra2 = true;
        } else {
            intent2 = (Intent) intent.getParcelableExtra("play_intent");
            booleanExtra = intent.getBooleanExtra("is_multimedia", true);
            booleanExtra2 = intent.getBooleanExtra("need_foreground", true);
        }
        if (booleanExtra2) {
            try {
                q = false;
                startForeground(232, n(intent2, booleanExtra));
                this.h = SystemClock.uptimeMillis();
                this.g = true;
            } catch (IllegalStateException unused) {
                ax.Ha.c.i(this).f().b("Foreground not allowed : http server service").h();
            }
        }
        p = this;
        o = true;
        if (intent == null) {
            if (!com.voxdon.xplorer.service.b.f(this).i()) {
                w();
            }
            return 2;
        }
        f fVar = (f) intent.getSerializableExtra("location");
        int intExtra = intent.getIntExtra("location_key", 0);
        if (fVar == null) {
            ax.Ha.c.i(this).f().b("HTTP SERVER NO LOCATION").j().g("op:" + com.voxdon.xplorer.service.b.f(this).i()).h();
            if (!com.voxdon.xplorer.service.b.f(this).i()) {
                w();
            }
            return 2;
        }
        C3596o d2 = C1835x.d(fVar, intExtra);
        if (intent.getBooleanExtra("music_playback", false)) {
            this.b = true;
            if (this.e.size() == 0) {
                this.c = true;
            }
        } else {
            this.c = false;
        }
        if (!this.e.contains(d2)) {
            this.e.add(d2);
            com.voxdon.xplorer.service.b.f(this).e(d2);
        }
        com.voxdon.xplorer.service.b.f(this).d(this.j);
        m();
        this.a = e.NOT_STARTED;
        r();
        this.i.a();
        return 2;
    }

    public void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        ax.Q2.d.c("http server service timeout", new Exception("HttpServerServiceTimeout"));
        stopForeground(1);
    }

    synchronized void r() {
        try {
            if (this.a == e.NOT_STARTED) {
                n.fine("Start timeout to stop multimedia server : onstart : (music:" + this.b + ")");
                this.d.postDelayed(this.k, 180000L);
            } else if (this.b) {
                n.fine("Start timeout to stop multimedia server : music playback pause");
                if (this.g) {
                    this.d.postDelayed(this.k, 600000L);
                } else {
                    this.d.postDelayed(this.k, 1800000L);
                }
            } else if (ax.Q2.b.h().m()) {
                n.fine("Start timeout to stop multimedia server : foreground");
                this.d.postDelayed(this.k, 3000L);
            } else {
                n.fine("Start timeout to stop multimedia server : background");
                this.d.postDelayed(this.k, 600000L);
            }
            this.l = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void s() {
        n.fine("Start timeout to stop multimedia server : music playback stop");
        this.d.postDelayed(this.k, 3000L);
        this.l = true;
    }

    synchronized void t() {
        n.fine("Start timeout to stop multimedia server : onResume UI");
        this.d.postDelayed(this.k, 3000L);
        this.l = true;
    }

    synchronized void u() {
        n.fine("Start timeout to stop multimedia server : wating foreground");
        this.d.postDelayed(this.k, 30000L);
        this.l = true;
    }
}
