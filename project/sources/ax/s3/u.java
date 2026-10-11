package ax.s3;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import ax.P.l;
import ax.X2.Q;
import ax.c3.C1832u;
import ax.c3.K;
import ax.s3.t;
import ax.u3.C3194l;
import com.voxdon.xplorer.R;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class u {
    private static u b;
    private Context a;

    private u(Context context) {
        this.a = context.getApplicationContext();
        k();
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
                t.a aVar = new t.a();
                aVar.a = "important_operation";
                aVar.b = this.a.getString(R.string.file_operation_progress);
                aVar.d = 4;
                aVar.e = true;
                aVar.g = true;
                aVar.i = false;
                aVar.j = true;
                t.a aVar2 = new t.a();
                aVar2.a = "service";
                aVar2.b = this.a.getString(R.string.file_service);
                aVar2.d = 2;
                aVar2.e = false;
                aVar2.g = false;
                aVar2.i = true;
                aVar2.j = false;
                t.a aVar3 = new t.a();
                aVar3.a = "alarm";
                aVar3.b = this.a.getString(R.string.notifications);
                aVar3.d = 3;
                aVar3.e = false;
                aVar3.g = false;
                aVar3.i = false;
                aVar3.j = true;
                t.a aVar4 = new t.a();
                aVar4.a = "music_player";
                aVar4.b = this.a.getString(R.string.music_player);
                aVar4.d = 3;
                aVar4.e = false;
                aVar4.g = false;
                aVar4.i = true;
                aVar4.j = false;
                t.e(this.a, new t.a[]{aVar, aVar2, aVar3, aVar4});
            } catch (Resources.NotFoundException e) {
                ax.Ha.c.h().f().d("Notification Init Error").l(e).h();
            }
        }
    }

    public void a(int i) {
        try {
            ((NotificationManager) this.a.getSystemService("notification")).cancel(i);
        } catch (NullPointerException e) {
            ax.Ha.c.h().f().b("Noti cancel").l(e).h();
        }
    }

    public Notification b(Service service, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        PendingIntent a = C3194l.a(service, 102, z ? C1832u.D(service, false) : C1832u.t(service), 0, false);
        l.d dVar = new l.d(service, "important_operation");
        dVar.r(2);
        if (charSequence == null) {
            dVar.j(service.getString(R.string.app_name));
        } else {
            dVar.j(charSequence);
        }
        dVar.p(false);
        dVar.f(true);
        dVar.i(charSequence2);
        dVar.v(R.drawable.stat_command_error);
        dVar.h(a);
        dVar.x(HttpUrl.FRAGMENT_ENCODE_SET);
        Notification c = dVar.c();
        c.flags |= 32;
        if (Q.f0()) {
            c.flags |= 2;
        }
        return c;
    }

    public Notification c(Service service, CharSequence charSequence, int i, boolean z) {
        PendingIntent a = C3194l.a(service, 100, C1832u.t(service), 0, false);
        l.d dVar = new l.d(service, "important_operation");
        dVar.j(service.getString(R.string.app_name));
        if (z) {
            dVar.q(true);
        }
        dVar.p(true);
        dVar.u(true);
        dVar.i(charSequence);
        dVar.v(R.drawable.stat_progress_anim);
        dVar.h(a);
        dVar.s(100, i, false);
        dVar.m(1);
        dVar.x(HttpUrl.FRAGMENT_ENCODE_SET);
        return dVar.c();
    }

    public Notification d(Service service, String str) {
        return new l.d(service, "service").v(R.drawable.noti_server).x(service.getString(R.string.noti_server_is_on)).j(service.getString(R.string.noti_server_is_on)).i(str).h(C3194l.a(service, 0, C1832u.D(service, false), 0, false)).A(System.currentTimeMillis()).p(true).m(1).c();
    }

    public Notification e(Service service, Intent intent, boolean z) {
        PendingIntent a = C3194l.a(service, 0, C1832u.D(service, false), 134217728, false);
        l.d dVar = new l.d(service, "service");
        dVar.j(service.getString(R.string.app_name));
        if (z) {
            dVar.i(service.getString(R.string.playing_multimedia));
        } else {
            dVar.i(service.getString(R.string.local_http_server));
        }
        dVar.v(R.drawable.stat_play_arrow);
        dVar.h(a);
        dVar.x(HttpUrl.FRAGMENT_ENCODE_SET);
        dVar.m(1);
        return dVar.c();
    }

    public Notification f(Intent intent, String str, String str2) {
        PendingIntent a = C3194l.a(this.a, 104, intent, 0, false);
        l.d dVar = new l.d(this.a, "important_operation");
        dVar.r(2);
        dVar.j(str);
        dVar.p(false);
        dVar.f(true);
        dVar.i(str2);
        dVar.v(R.drawable.stat_command_error);
        dVar.h(a);
        dVar.x(HttpUrl.FRAGMENT_ENCODE_SET);
        return dVar.c();
    }

    public Notification g(Service service) {
        return new l.d(service, "important_operation").v(R.drawable.stat_progress_anim0).j(service.getString(R.string.scanning_for_files)).u(true).p(false).m(2).c();
    }

    public Notification h(Context context, K k, CharSequence charSequence) {
        PendingIntent a = C3194l.a(context, 0, C1832u.K(context, k), 0, false);
        l.d dVar = new l.d(context, "alarm");
        dVar.j(context.getString(R.string.noti_storage_full));
        dVar.p(false);
        dVar.f(true);
        dVar.i(charSequence);
        dVar.v(R.drawable.stat_storage_full);
        dVar.h(a);
        dVar.x(charSequence);
        dVar.r(2);
        return dVar.c();
    }

    public Notification i(CharSequence charSequence, CharSequence charSequence2) {
        PendingIntent a = C3194l.a(this.a, 120, C1832u.D(this.a, false), 0, false);
        l.d dVar = new l.d(this.a, "important_operation");
        dVar.r(2);
        if (charSequence == null) {
            dVar.j(this.a.getString(R.string.app_name));
        } else {
            dVar.j(charSequence);
        }
        dVar.p(false);
        dVar.f(true);
        dVar.i(charSequence2);
        dVar.v(R.drawable.stat_command_error);
        dVar.h(a);
        dVar.x(HttpUrl.FRAGMENT_ENCODE_SET);
        return dVar.c();
    }

    public void l(int i, Notification notification) {
        ((NotificationManager) this.a.getSystemService("notification")).notify(i, notification);
    }
}
