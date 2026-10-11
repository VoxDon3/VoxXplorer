package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.foreground.a;
import ax.B2.i;
import ax.G0.j;

/* loaded from: classes.dex */
public class SystemForegroundService extends j implements a.b {
    private static final String f = i.i("SystemFgService");
    private static SystemForegroundService g = null;
    private Handler b;
    private boolean c;
    androidx.work.impl.foreground.a d;
    NotificationManager e;

    class a implements Runnable {
        final /* synthetic */ Notification c0;
        final /* synthetic */ int d0;
        final /* synthetic */ int q;

        a(int i, Notification notification, int i2) {
            this.q = i;
            this.c0 = notification;
            this.d0 = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                e.a(SystemForegroundService.this, this.q, this.c0, this.d0);
            } else if (i >= 29) {
                d.a(SystemForegroundService.this, this.q, this.c0, this.d0);
            } else {
                SystemForegroundService.this.startForeground(this.q, this.c0);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ Notification c0;
        final /* synthetic */ int q;

        b(int i, Notification notification) {
            this.q = i;
            this.c0 = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.e.notify(this.q, this.c0);
        }
    }

    class c implements Runnable {
        final /* synthetic */ int q;

        c(int i) {
            this.q = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.e.cancel(this.q);
        }
    }

    static class d {
        static void a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    static class e {
        static void a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                i.e().l(SystemForegroundService.f, "Unable to start foreground service", e);
            }
        }
    }

    private void f() {
        this.b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.d = aVar;
        aVar.n(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i, int i2, Notification notification) {
        this.b.post(new a(i, notification, i2));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i, Notification notification) {
        this.b.post(new b(i, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i) {
        this.b.post(new c(i));
    }

    @Override // ax.G0.j, android.app.Service
    public void onCreate() {
        super.onCreate();
        g = this;
        f();
    }

    @Override // ax.G0.j, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.d.l();
    }

    @Override // ax.G0.j, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            i.e().f(f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.d.l();
            f();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.d.m(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.c = true;
        i.e().a(f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        g = null;
        stopSelf();
    }
}
