/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import ax.I5.a;
import ax.J5.c;
import ax.J5.d;
import ax.J5.f;
import ax.J5.g;
import ax.J5.i;
import ax.J5.m;
import ax.J5.p;
import ax.J5.r;
import ax.L5.s;
import ax.L5.t;
import ax.M5.B;
import ax.M5.E;
import ax.P.l;
import ax.R5.l;
import ax.S5.b;
import ax.Y5.e;
import ax.Y5.j;
import ax.s3.n;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@RestrictedInheritance(allowedOnPath=".*java.*/com/google/android/gms.*", allowlistAnnotations={ax.Y5.d.class, e.class}, explanation="Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link="go/gmscore-restrictedinheritance")
public class h
extends i {
    public static final int d;
    private static final Object e;
    private static final h f;
    private String c;

    static {
        e = new Object();
        f = new h();
        d = i.a;
    }

    public static h o() {
        return f;
    }

    @Override
    public Intent b(Context context, int n8, String string) {
        return super.b(context, n8, string);
    }

    @Override
    public PendingIntent c(Context context, int n8, int n9) {
        return super.c(context, n8, n9);
    }

    @Override
    public final String e(int n8) {
        return super.e(n8);
    }

    @Override
    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return super.g(context);
    }

    @Override
    public int h(Context context, int n8) {
        return super.h(context, n8);
    }

    @Override
    public final boolean j(int n8) {
        return super.j(n8);
    }

    public Dialog l(Activity activity, int n8, int n9) {
        return this.m(activity, n8, n9, null);
    }

    public Dialog m(Activity activity, int n8, int n9, DialogInterface.OnCancelListener onCancelListener) {
        return this.r((Context)activity, n8, E.b(activity, this.b((Context)activity, n8, "d"), n9), onCancelListener, null);
    }

    public PendingIntent n(Context context, c c8) {
        if (c8.B()) {
            return c8.z();
        }
        return this.c(context, c8.k(), 0);
    }

    @ResultIgnorabilityUnspecified
    public boolean p(Activity activity, int n8, int n9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialog = this.m(activity, n8, n9, onCancelListener);
        if (dialog == null) {
            return false;
        }
        this.u(activity, dialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void q(Context context, int n8) {
        this.v(context, n8, null, this.d(context, n8, 0, "n"));
    }

    final Dialog r(Context object, int n8, E e8, DialogInterface.OnCancelListener object2, DialogInterface.OnClickListener onClickListener) {
        Object object3 = null;
        if (n8 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        object.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(object.getResources().getResourceEntryName(typedValue.resourceId))) {
            object3 = new AlertDialog.Builder(object, 5);
        }
        typedValue = object3;
        if (object3 == null) {
            typedValue = new AlertDialog.Builder(object);
        }
        typedValue.setMessage((CharSequence)B.c(object, n8));
        if (object2 != null) {
            typedValue.setOnCancelListener(object2);
        }
        if ((object3 = B.b(object, n8)) != null) {
            object2 = e8;
            if (e8 == null) {
                object2 = onClickListener;
            }
            typedValue.setPositiveButton((CharSequence)object3, (DialogInterface.OnClickListener)object2);
        }
        if ((object = B.f(object, n8)) != null) {
            typedValue.setTitle((CharSequence)object);
        }
        Log.w((String)"GoogleApiAvailability", (String)String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", n8), (Throwable)new IllegalArgumentException());
        return typedValue.create();
    }

    public final Dialog s(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar((Context)activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)activity);
        builder.setView((View)progressBar);
        builder.setMessage((CharSequence)B.c((Context)activity, 18));
        builder.setPositiveButton((CharSequence)"", null);
        builder = builder.create();
        this.u(activity, (Dialog)builder, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return builder;
    }

    @ResultIgnorabilityUnspecified
    public final t t(Context context, s s8) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        t t8 = new t(s8);
        ax.Y5.i.n(context, t8, intentFilter);
        t8.a(context);
        if (!this.i(context, "com.google.android.gms")) {
            s8.a();
            t8.b();
            return null;
        }
        return t8;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void u(Activity object, Dialog dialog, String string, DialogInterface.OnCancelListener onCancelListener) {
        String var3_5;
        DialogInterface.OnCancelListener var4_6;
        DialogInterface.OnCancelListener var2_4;
        try {
            boolean bl = object instanceof androidx.fragment.app.f;
            if (bl) {
                androidx.fragment.app.FragmentManager fragmentManager = ((androidx.fragment.app.f)object).getSupportFragmentManager();
                p.d3((Dialog)var2_4, (DialogInterface.OnCancelListener)var4_6).c3(fragmentManager, (String)var3_5);
                return;
            }
        }
        catch (NoClassDefFoundError noClassDefFoundError) {}
        FragmentManager fragmentManager = object.getFragmentManager();
        ax.J5.d.a((Dialog)var2_4, (DialogInterface.OnCancelListener)var4_6).show(fragmentManager, (String)var3_5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @TargetApi(value=20)
    final void v(Context object, int n8, String object2, PendingIntent object3) {
        Log.w((String)"GoogleApiAvailability", (String)String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", n8, null), (Throwable)new IllegalArgumentException());
        if (n8 == 18) {
            this.w((Context)object);
            return;
        }
        if (object3 == null) {
            if (n8 == 6) {
                Log.w((String)"GoogleApiAvailability", (String)"Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
            return;
        }
        Object object4 = B.e((Context)object, n8);
        String string = B.d((Context)object, n8);
        object2 = object.getResources();
        NotificationManager notificationManager = (NotificationManager)ax.M5.p.l(object.getSystemService("notification"));
        object4 = new l.d((Context)object).o(true).f(true).j((CharSequence)object4).w(new l.b().h(string));
        if (ax.R5.i.c((Context)object)) {
            ax.M5.p.o(l.e());
            ((l.d)object4).v(object.getApplicationInfo().icon).r(2);
            if (ax.R5.i.d((Context)object)) {
                ((l.d)object4).a(ax.I5.a.a, object2.getString(ax.I5.b.o), (PendingIntent)object3);
            } else {
                ((l.d)object4).h((PendingIntent)object3);
            }
        } else {
            ((l.d)object4).v(17301642).x(object2.getString(ax.I5.b.h)).A(System.currentTimeMillis()).h((PendingIntent)object3).i(string);
        }
        if (l.h()) {
            ax.M5.p.o(l.h());
            object2 = e;
            synchronized (object2) {
                object3 = this.c;
            }
            object2 = object3;
            if (object3 == null) {
                object3 = "com.google.android.gms.availability";
                string = ax.J5.f.a(notificationManager, "com.google.android.gms.availability");
                object = object.getResources().getString(ax.I5.b.g);
                if (string == null) {
                    ax.s3.g.a(notificationManager, n.a("com.google.android.gms.availability", (CharSequence)object, 4));
                    object2 = object3;
                } else {
                    object2 = object3;
                    if (!((String)object).contentEquals(ax.s3.i.a((NotificationChannel)string))) {
                        g.a((NotificationChannel)string, (CharSequence)object);
                        ax.s3.g.a(notificationManager, (NotificationChannel)string);
                        object2 = object3;
                    }
                }
            }
            ((l.d)object4).g((String)object2);
        }
        object = ((l.d)object4).c();
        if (n8 != 1 && n8 != 2 && n8 != 3) {
            n8 = 39789;
        } else {
            m.b.set(false);
            n8 = 10436;
        }
        notificationManager.notify(n8, (Notification)object);
    }

    final void w(Context context) {
        new r(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean x(Activity activity, ax.L5.f f8, int n8, int n9, DialogInterface.OnCancelListener onCancelListener) {
        if ((f8 = this.r((Context)activity, n8, E.c(f8, this.b((Context)activity, n8, "d"), 2), onCancelListener, null)) == null) {
            return false;
        }
        this.u(activity, (Dialog)f8, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean y(Context context, c c8, int n8) {
        PendingIntent pendingIntent;
        if (!b.a(context) && (pendingIntent = this.n(context, c8)) != null) {
            this.v(context, c8.k(), null, PendingIntent.getActivity((Context)context, (int)0, (Intent)GoogleApiActivity.a(context, pendingIntent, n8, true), (int)(j.a | 0x8000000)));
            return true;
        }
        return false;
    }
}

