/*
 * Decompiled with CFR 0.152.
 */
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

public class SystemForegroundService
extends j
implements a.b {
    private static final String f = i.i("SystemFgService");
    private static SystemForegroundService g = null;
    private Handler b;
    private boolean c;
    a d;
    NotificationManager e;

    private void f() {
        a a8;
        this.b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager)this.getApplicationContext().getSystemService("notification");
        this.d = a8 = new a(this.getApplicationContext());
        a8.n(this);
    }

    @Override
    public void b(int n8, int n9, Notification notification) {
        this.b.post(new Runnable(){
            final Notification c0;
            final int d0;
            final SystemForegroundService e0;
            final int q;
            {
                this.e0 = systemForegroundService;
                this.q = n8;
                this.c0 = notification;
                this.d0 = n9;
            }

            @Override
            public void run() {
                int n8 = Build.VERSION.SDK_INT;
                if (n8 >= 31) {
                    androidx.work.impl.foreground.SystemForegroundService$e.a(this.e0, this.q, this.c0, this.d0);
                    return;
                }
                if (n8 >= 29) {
                    androidx.work.impl.foreground.SystemForegroundService$d.a(this.e0, this.q, this.c0, this.d0);
                    return;
                }
                this.e0.startForeground(this.q, this.c0);
            }
        });
    }

    @Override
    public void c(int n8, Notification notification) {
        this.b.post(new Runnable(){
            final Notification c0;
            final SystemForegroundService d0;
            final int q;
            {
                this.d0 = systemForegroundService;
                this.q = n8;
                this.c0 = notification;
            }

            @Override
            public void run() {
                this.d0.e.notify(this.q, this.c0);
            }
        });
    }

    @Override
    public void d(int n8) {
        this.b.post(new Runnable(){
            final SystemForegroundService c0;
            final int q;
            {
                this.c0 = systemForegroundService;
                this.q = n8;
            }

            @Override
            public void run() {
                this.c0.e.cancel(this.q);
            }
        });
    }

    @Override
    public void onCreate() {
        super.onCreate();
        g = this;
        this.f();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.d.l();
    }

    @Override
    public int onStartCommand(Intent intent, int n8, int n9) {
        super.onStartCommand(intent, n8, n9);
        if (this.c) {
            i.e().f(f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.d.l();
            this.f();
            this.c = false;
        }
        if (intent != null) {
            this.d.m(intent);
        }
        return 3;
    }

    @Override
    public void stop() {
        this.c = true;
        i.e().a(f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            this.stopForeground(true);
        }
        g = null;
        this.stopSelf();
    }

    static class d {
        static void a(Service service, int n8, Notification notification, int n9) {
            service.startForeground(n8, notification, n9);
        }
    }

    static class e {
        static void a(Service service, int n8, Notification notification, int n9) {
            try {
                service.startForeground(n8, notification, n9);
                return;
            }
            catch (ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
                i.e().l(f, "Unable to start foreground service", foregroundServiceStartNotAllowedException);
                return;
            }
        }
    }
}

