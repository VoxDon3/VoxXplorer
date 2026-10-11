/*
 * Decompiled with CFR 0.152.
 */
package ax.s3;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import ax.Ha.c;
import ax.P.l;
import ax.X2.Q;
import ax.c3.K;
import ax.s3.t;
import ax.u3.l;

public class u {
    private static u b;
    private Context a;

    private u(Context context) {
        this.a = context.getApplicationContext();
        this.k();
    }

    public static u j(Context context) {
        if (b == null) {
            b = new u(context);
        }
        return b;
    }

    private void k() {
        if (Q.A()) {
            try {
                t.a a8 = new t.a();
                a8.a = "important_operation";
                a8.b = this.a.getString(2131952053);
                a8.d = 4;
                a8.e = true;
                a8.g = true;
                a8.i = false;
                a8.j = true;
                t.a a9 = new t.a();
                a9.a = "service";
                a9.b = this.a.getString(2131952054);
                a9.d = 2;
                a9.e = false;
                a9.g = false;
                a9.i = true;
                a9.j = false;
                t.a a10 = new t.a();
                a10.a = "alarm";
                a10.b = this.a.getString(2131952461);
                a10.d = 3;
                a10.e = false;
                a10.g = false;
                a10.i = false;
                a10.j = true;
                t.a a11 = new t.a();
                a11.a = "music_player";
                a11.b = this.a.getString(2131952441);
                a11.d = 3;
                a11.e = false;
                a11.g = false;
                a11.i = true;
                a11.j = false;
                t.e(this.a, new t.a[]{a8, a9, a10, a11});
                return;
            }
            catch (Resources.NotFoundException notFoundException) {
                c.h().f().d("Notification Init Error").l(notFoundException).h();
            }
        }
    }

    public void a(int n8) {
        try {
            ((NotificationManager)this.a.getSystemService("notification")).cancel(n8);
            return;
        }
        catch (NullPointerException nullPointerException) {
            c.h().f().b("Noti cancel").l(nullPointerException).h();
            return;
        }
    }

    public Notification b(Service service, CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        Intent intent = bl ? ax.c3.u.D((Context)service, false) : ax.c3.u.t((Context)service);
        intent = l.a((Context)service, 102, intent, 0, false);
        l.d d8 = new l.d((Context)service, "important_operation");
        d8.r(2);
        if (charSequence == null) {
            d8.j(service.getString(2131951672));
        } else {
            d8.j(charSequence);
        }
        d8.p(false);
        d8.f(true);
        d8.i(charSequence2);
        d8.v(2131231459);
        d8.h((PendingIntent)intent);
        d8.x("");
        service = d8.c();
        service.flags |= 0x20;
        if (Q.f0()) {
            service.flags |= 2;
        }
        return service;
    }

    public Notification c(Service service, CharSequence charSequence, int n8, boolean bl) {
        PendingIntent pendingIntent = l.a((Context)service, 100, ax.c3.u.t((Context)service), 0, false);
        l.d d8 = new l.d((Context)service, "important_operation");
        d8.j(service.getString(2131951672));
        if (bl) {
            d8.q(true);
        }
        d8.p(true);
        d8.u(true);
        d8.i(charSequence);
        d8.v(2131231461);
        d8.h(pendingIntent);
        d8.s(100, n8, false);
        d8.m(1);
        d8.x("");
        return d8.c();
    }

    public Notification d(Service service, String string) {
        PendingIntent pendingIntent = l.a((Context)service, 0, ax.c3.u.D((Context)service, false), 0, false);
        return new l.d((Context)service, "service").v(2131231434).x(service.getString(2131952459)).j(service.getString(2131952459)).i(string).h(pendingIntent).A(System.currentTimeMillis()).p(true).m(1).c();
    }

    public Notification e(Service service, Intent intent, boolean bl) {
        intent = l.a((Context)service, 0, ax.c3.u.D((Context)service, false), 0x8000000, false);
        l.d d8 = new l.d((Context)service, "service");
        d8.j(service.getString(2131951672));
        if (bl) {
            d8.i(service.getString(2131952504));
        } else {
            d8.i(service.getString(2131952144));
        }
        d8.v(2131231460);
        d8.h((PendingIntent)intent);
        d8.x("");
        d8.m(1);
        return d8.c();
    }

    public Notification f(Intent intent, String string, String string2) {
        intent = l.a(this.a, 104, intent, 0, false);
        l.d d8 = new l.d(this.a, "important_operation");
        d8.r(2);
        d8.j(string);
        d8.p(false);
        d8.f(true);
        d8.i(string2);
        d8.v(2131231459);
        d8.h((PendingIntent)intent);
        d8.x("");
        return d8.c();
    }

    public Notification g(Service service) {
        return new l.d((Context)service, "important_operation").v(2131231462).j(service.getString(2131952556)).u(true).p(false).m(2).c();
    }

    public Notification h(Context context, K k8, CharSequence charSequence) {
        k8 = l.a(context, 0, ax.c3.u.K(context, k8), 0, false);
        l.d d8 = new l.d(context, "alarm");
        d8.j(context.getString(2131952460));
        d8.p(false);
        d8.f(true);
        d8.i(charSequence);
        d8.v(2131231467);
        d8.h((PendingIntent)k8);
        d8.x(charSequence);
        d8.r(2);
        return d8.c();
    }

    public Notification i(CharSequence charSequence, CharSequence charSequence2) {
        Intent intent = ax.c3.u.D(this.a, false);
        intent = l.a(this.a, 120, intent, 0, false);
        l.d d8 = new l.d(this.a, "important_operation");
        d8.r(2);
        if (charSequence == null) {
            d8.j(this.a.getString(2131951672));
        } else {
            d8.j(charSequence);
        }
        d8.p(false);
        d8.f(true);
        d8.i(charSequence2);
        d8.v(2131231459);
        d8.h((PendingIntent)intent);
        d8.x("");
        return d8.c();
    }

    public void l(int n8, Notification notification) {
        ((NotificationManager)this.a.getSystemService("notification")).notify(n8, notification);
    }
}

