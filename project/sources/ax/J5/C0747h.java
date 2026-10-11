package ax.J5;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import ax.L5.InterfaceC0794f;
import ax.M5.C0821p;
import ax.P.l;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import okhttp3.HttpUrl;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {ax.Y5.d.class, ax.Y5.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: ax.J5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0747h extends C0748i {
    private String c;
    private static final Object e = new Object();
    private static final C0747h f = new C0747h();
    public static final int d = C0748i.a;

    public static C0747h o() {
        return f;
    }

    @Override // ax.J5.C0748i
    public Intent b(Context context, int i, String str) {
        return super.b(context, i, str);
    }

    @Override // ax.J5.C0748i
    public PendingIntent c(Context context, int i, int i2) {
        return super.c(context, i, i2);
    }

    @Override // ax.J5.C0748i
    public final String e(int i) {
        return super.e(i);
    }

    @Override // ax.J5.C0748i
    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return super.g(context);
    }

    @Override // ax.J5.C0748i
    public int h(Context context, int i) {
        return super.h(context, i);
    }

    @Override // ax.J5.C0748i
    public final boolean j(int i) {
        return super.j(i);
    }

    public Dialog l(Activity activity, int i, int i2) {
        return m(activity, i, i2, null);
    }

    public Dialog m(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return r(activity, i, ax.M5.E.b(activity, b(activity, i, ax.ba.d.d), i2), onCancelListener, null);
    }

    public PendingIntent n(Context context, C0742c c0742c) {
        return c0742c.B() ? c0742c.z() : c(context, c0742c.k(), 0);
    }

    @ResultIgnorabilityUnspecified
    public boolean p(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m = m(activity, i, i2, onCancelListener);
        if (m == null) {
            return false;
        }
        u(activity, m, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void q(Context context, int i) {
        v(context, i, null, d(context, i, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Dialog r(Context context, int i, ax.M5.E e2, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(ax.M5.B.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b = ax.M5.B.b(context, i);
        if (b != null) {
            if (e2 == null) {
                e2 = onClickListener;
            }
            builder.setPositiveButton(b, e2);
        }
        String f2 = ax.M5.B.f(context, i);
        if (f2 != null) {
            builder.setTitle(f2);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog s(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(ax.M5.B.c(activity, 18));
        builder.setPositiveButton(HttpUrl.FRAGMENT_ENCODE_SET, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        u(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @ResultIgnorabilityUnspecified
    public final ax.L5.t t(Context context, ax.L5.s sVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        ax.L5.t tVar = new ax.L5.t(sVar);
        ax.Y5.i.n(context, tVar, intentFilter);
        tVar.a(context);
        if (i(context, "com.google.android.gms")) {
            return tVar;
        }
        sVar.a();
        tVar.b();
        return null;
    }

    final void u(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.f) {
                C0755p.d3(dialog, onCancelListener).c3(((androidx.fragment.app.f) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC0743d.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void v(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            w(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e2 = ax.M5.B.e(context, i);
        String d2 = ax.M5.B.d(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) C0821p.l(context.getSystemService("notification"));
        l.d w = new l.d(context).o(true).f(true).j(e2).w(new l.b().h(d2));
        if (ax.R5.i.c(context)) {
            C0821p.o(ax.R5.l.e());
            w.v(context.getApplicationInfo().icon).r(2);
            if (ax.R5.i.d(context)) {
                w.a(ax.I5.a.a, resources.getString(ax.I5.b.o), pendingIntent);
            } else {
                w.h(pendingIntent);
            }
        } else {
            w.v(R.drawable.stat_sys_warning).x(resources.getString(ax.I5.b.h)).A(System.currentTimeMillis()).h(pendingIntent).i(d2);
        }
        if (ax.R5.l.h()) {
            C0821p.o(ax.R5.l.h());
            synchronized (e) {
                str2 = this.c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(ax.I5.b.g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(ax.s3.n.a("com.google.android.gms.availability", string, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            w.g(str2);
        }
        Notification c = w.c();
        if (i == 1 || i == 2 || i == 3) {
            C0752m.b.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, c);
    }

    final void w(Context context) {
        new r(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean x(Activity activity, InterfaceC0794f interfaceC0794f, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog r = r(activity, i, ax.M5.E.c(interfaceC0794f, b(activity, i, ax.ba.d.d), 2), onCancelListener, null);
        if (r == null) {
            return false;
        }
        u(activity, r, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean y(Context context, C0742c c0742c, int i) {
        PendingIntent n;
        if (ax.S5.b.a(context) || (n = n(context, c0742c)) == null) {
            return false;
        }
        v(context, c0742c.k(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, n, i, true), ax.Y5.j.a | 134217728));
        return true;
    }
}
