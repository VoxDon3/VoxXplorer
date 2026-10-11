/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.service;

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
import android.os.Parcelable;
import android.os.SystemClock;
import ax.Ha.c;
import ax.L0.a;
import ax.Q2.d;
import ax.Q2.f;
import ax.Q2.g;
import ax.c3.x;
import ax.s3.u;
import ax.u3.B;
import ax.u3.D;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.service.b;
import com.example.android.uamp.MusicService;
import java.io.Serializable;
import java.util.Set;
import java.util.logging.Logger;

public class HttpServerService
extends Service {
    private static final Logger n = ax.Q2.g.a(HttpServerService.class);
    private static boolean o = false;
    private static HttpServerService p = null;
    private static boolean q = false;
    private e a;
    private boolean b;
    private boolean c;
    private Handler d = new Handler(Looper.getMainLooper());
    private Set<o> e = new ax.B.b<o>();
    private int f;
    private boolean g;
    private long h;
    private D i;
    private b.a j = new b.a(this){
        final HttpServerService a;
        {
            this.a = httpServerService;
        }

        @Override
        public void a(int n8) {
            if (n8 == 0) {
                HttpServerService.b(this.a, com.alphainventor.filemanager.service.HttpServerService$e.c0);
                this.a.r();
            } else {
                HttpServerService.b(this.a, com.alphainventor.filemanager.service.HttpServerService$e.d0);
                if (n8 > this.a.f) {
                    this.a.m();
                }
            }
            HttpServerService.d(this.a, n8);
        }
    };
    Runnable k = new Runnable(this){
        final HttpServerService q;
        {
            this.q = httpServerService;
        }

        @Override
        public void run() {
            Object object = n;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Timeout http multimedia server! : ");
            stringBuilder.append((Object)this.q.a);
            object.fine(stringBuilder.toString());
            object = this.q;
            if (((HttpServerService)((Object)object)).l && ((HttpServerService)((Object)object)).a != com.alphainventor.filemanager.service.HttpServerService$e.d0) {
                if (this.q.b && MusicService.I()) {
                    this.q.r();
                    return;
                }
                if (q) {
                    this.q.u();
                    return;
                }
                this.q.w();
                this.q.m();
                return;
            }
            object = this.q;
            if (((HttpServerService)((Object)object)).l && ((HttpServerService)((Object)object)).c && !this.q.b && !MusicService.G()) {
                if (q) {
                    this.q.u();
                    return;
                }
                this.q.w();
                this.q.m();
                return;
            }
            this.q.k();
        }
    };
    boolean l;
    BroadcastReceiver m = new BroadcastReceiver(this){
        final HttpServerService a;
        {
            this.a = httpServerService;
        }

        public void onReceive(Context object, Intent object2) {
            int n8 = object2.getIntExtra("state", 0);
            object2 = n;
            object = new StringBuilder();
            ((StringBuilder)object).append("music playback stop received : ");
            ((StringBuilder)object).append(this.a.b);
            ((StringBuilder)object).append(":");
            ((StringBuilder)object).append(n8);
            ((Logger)object2).fine(((StringBuilder)object).toString());
            if (this.a.b) {
                if (n8 == 1) {
                    HttpServerService.g(this.a, false);
                }
                this.a.s();
            }
        }
    };

    static /* synthetic */ e b(HttpServerService httpServerService, e e8) {
        httpServerService.a = e8;
        return e8;
    }

    static /* synthetic */ int d(HttpServerService httpServerService, int n8) {
        httpServerService.f = n8;
        return n8;
    }

    static /* synthetic */ boolean g(HttpServerService httpServerService, boolean bl) {
        httpServerService.b = bl;
        return bl;
    }

    public static Uri l(int n8, n n9) {
        Uri.Builder builder = new Uri.Builder().scheme("http");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("127.0.0.1:");
        stringBuilder.append(n8);
        return builder.encodedAuthority(stringBuilder.toString()).path(ax.o3.c.C(n9)).build();
    }

    private Notification n(Intent intent, boolean bl) {
        return u.j((Context)this).e(this, intent, bl);
    }

    public static e p() {
        if (o) {
            return p.o();
        }
        return com.alphainventor.filemanager.service.HttpServerService$e.q;
    }

    public static void q(Context context, f f8, int n8, boolean bl, boolean bl2, boolean bl3, Intent intent) {
        Intent intent2 = new Intent(context, HttpServerService.class);
        intent2.putExtra("location", (Serializable)((Object)f8));
        intent2.putExtra("location_key", n8);
        intent2.putExtra("play_intent", (Parcelable)intent);
        intent2.putExtra("music_playback", bl);
        intent2.putExtra("is_multimedia", bl2);
        bl = bl3;
        if (!bl3) {
            bl = bl3;
            if (B.V(context)) {
                bl = true;
            }
        }
        intent2.putExtra("need_foreground", bl);
        if (bl) {
            try {
                B.f0(context, intent2, true, true);
                q = true;
                return;
            }
            catch (IllegalStateException illegalStateException) {
                ax.Ha.c.i(context).f().b("START HTTP SERVICE FOREGROUND").l(illegalStateException).h();
                return;
            }
        }
        context.startService(intent2);
    }

    public static void v(Context object) {
        int n8 = HttpServerService.p().ordinal();
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2 && (object = p) != null) {
                    object.t();
                    return;
                }
            } else {
                object = p;
                if (object != null && object.b && MusicService.I()) {
                    p.r();
                    return;
                }
                object = p;
                if (object != null) {
                    object.r();
                    return;
                }
            }
        } else {
            object = p;
            if (object != null) {
                object.t();
            }
        }
    }

    private void w() {
        if (this.h > 0L) {
            if (SystemClock.uptimeMillis() - this.h < 100L) {
                this.d.postDelayed(new Runnable(this){
                    final HttpServerService q;
                    {
                        this.q = httpServerService;
                    }

                    @Override
                    public void run() {
                        this.q.stopSelf();
                    }
                }, 100L);
                return;
            }
            this.stopSelf();
            return;
        }
        this.stopSelf();
    }

    void k() {
        if (!this.b && ax.Q2.b.h().m()) {
            if (this.g) {
                this.stopForeground(true);
                this.g = false;
                return;
            }
        } else if (!this.b) {
            ax.Q2.b.h().m();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void m() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (!this.l) break block4;
                        n.fine("Cancel timeout to stop multimedia server");
                        this.d.removeCallbacks(this.k);
                        this.l = false;
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

    e o() {
        return this.a;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        n.fine("Http server created");
        this.a = com.alphainventor.filemanager.service.HttpServerService$e.q;
        this.l = false;
        IntentFilter intentFilter = new IntentFilter("local.intent.action.LOCAL_PLAYBACK_STOP");
        ax.L0.a.b((Context)this).c(this.m, intentFilter);
        this.i = new D((Context)this, 3, "HTTP_SERVER");
    }

    public void onDestroy() {
        super.onDestroy();
        this.m();
        com.alphainventor.filemanager.service.b.f((Context)this).n(this.j);
        for (o o8 : this.e) {
            com.alphainventor.filemanager.service.b.f((Context)this).o(o8);
        }
        this.e.clear();
        if (this.g) {
            this.stopForeground(true);
            this.g = false;
        }
        o = false;
        p = null;
        ax.L0.a.b((Context)this).f(this.m);
        this.i.c();
        n.fine("Http server stopped");
    }

    public int onStartCommand(Intent object, int n8, int n9) {
        boolean bl;
        boolean bl2;
        Object object2;
        if (object == null) {
            object2 = null;
            bl2 = true;
            bl = true;
        } else {
            object2 = (Intent)object.getParcelableExtra("play_intent");
            bl2 = object.getBooleanExtra("is_multimedia", true);
            bl = object.getBooleanExtra("need_foreground", true);
        }
        if (bl) {
            try {
                q = false;
                this.startForeground(232, this.n((Intent)object2, bl2));
                this.h = SystemClock.uptimeMillis();
                this.g = true;
            }
            catch (IllegalStateException illegalStateException) {
                ax.Ha.c.i((Context)this).f().b("Foreground not allowed : http server service").h();
            }
        }
        p = this;
        o = true;
        if (object == null) {
            if (!com.alphainventor.filemanager.service.b.f((Context)this).i()) {
                this.w();
            }
            return 2;
        }
        object2 = (f)((Object)object.getSerializableExtra("location"));
        n8 = object.getIntExtra("location_key", 0);
        if (object2 == null) {
            object = ax.Ha.c.i((Context)this).f().b("HTTP SERVER NO LOCATION").j();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("op:");
            ((StringBuilder)object2).append(com.alphainventor.filemanager.service.b.f((Context)this).i());
            ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
            if (!com.alphainventor.filemanager.service.b.f((Context)this).i()) {
                this.w();
            }
            return 2;
        }
        object2 = x.d((f)((Object)object2), n8);
        if (object.getBooleanExtra("music_playback", false)) {
            this.b = true;
            if (this.e.size() == 0) {
                this.c = true;
            }
        } else {
            this.c = false;
        }
        if (!this.e.contains(object2)) {
            this.e.add((o)object2);
            com.alphainventor.filemanager.service.b.f((Context)this).e((o)object2);
        }
        com.alphainventor.filemanager.service.b.f((Context)this).d(this.j);
        this.m();
        this.a = com.alphainventor.filemanager.service.HttpServerService$e.q;
        this.r();
        this.i.a();
        return 2;
    }

    public void onTimeout(int n8, int n9) {
        super.onTimeout(n8, n9);
        ax.Q2.d.c("http server service timeout", new Exception("HttpServerServiceTimeout"));
        ax.o3.d.a(this, 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void r() {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                block10: {
                    block9: {
                        try {
                            if (this.a != com.alphainventor.filemanager.service.HttpServerService$e.q) break block9;
                            Logger logger = n;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Start timeout to stop multimedia server : onstart : (music:");
                            stringBuilder.append(this.b);
                            stringBuilder.append(")");
                            logger.fine(stringBuilder.toString());
                            this.d.postDelayed(this.k, 180000L);
                            break block10;
                        }
                        catch (Throwable throwable2) {
                            break block11;
                        }
                    }
                    if (this.b) {
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
                }
                this.l = true;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void s() {
        synchronized (this) {
            n.fine("Start timeout to stop multimedia server : music playback stop");
            this.d.postDelayed(this.k, 3000L);
            this.l = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void t() {
        synchronized (this) {
            n.fine("Start timeout to stop multimedia server : onResume UI");
            this.d.postDelayed(this.k, 3000L);
            this.l = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void u() {
        synchronized (this) {
            n.fine("Start timeout to stop multimedia server : wating foreground");
            this.d.postDelayed(this.k, 30000L);
            this.l = true;
            return;
        }
    }

    public static final class e
    extends Enum<e> {
        public static final /* enum */ e c0;
        public static final /* enum */ e d0;
        private static final e[] e0;
        public static final /* enum */ e q;

        static {
            q = new e();
            c0 = new e();
            d0 = new e();
            e0 = com.alphainventor.filemanager.service.HttpServerService$e.d();
        }

        private static /* synthetic */ e[] d() {
            return new e[]{q, c0, d0};
        }

        public static e valueOf(String string) {
            return Enum.valueOf(e.class, string);
        }

        public static e[] values() {
            return (e[])e0.clone();
        }
    }
}

