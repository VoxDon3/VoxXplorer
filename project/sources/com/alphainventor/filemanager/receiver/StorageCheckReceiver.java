package com.voxdon.xplorer.receiver;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.util.AndroidRuntimeException;
import ax.Ha.c;
import ax.Q2.a;
import ax.Q2.b;
import ax.c3.K;
import ax.s3.u;
import ax.t3.j;
import ax.u3.C3180B;
import ax.u3.C3194l;
import ax.u3.C3197o;
import com.voxdon.xplorer.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public class StorageCheckReceiver extends BroadcastReceiver {
    public static void a(Context context, K k) {
        if (K.e.equals(k)) {
            u.j(context).a(201);
        } else if (K.f.equals(k)) {
            u.j(context).a(202);
        } else {
            u.j(context).a(201);
            u.j(context).a(202);
        }
    }

    public static void b(Context context, boolean z) {
        if (j.I(context)) {
            try {
                Intent intent = new Intent(context, (Class<?>) StorageCheckReceiver.class);
                intent.setAction("filemanager.intent.action.STORAGE_CHECK");
                PendingIntent b = C3194l.b(context, 200, intent, 0);
                Calendar calendar = Calendar.getInstance();
                int i = calendar.get(11);
                calendar.set(11, 21);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long timeInMillis = calendar.getTimeInMillis();
                if (21 - i <= 1) {
                    timeInMillis += 86400000;
                }
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                alarmManager.cancel(b);
                alarmManager.setInexactRepeating(1, timeInMillis, 86400000L, b);
            } catch (NullPointerException | SecurityException e) {
                c.h().f().d("AlarmManager Error").l(e).h();
            }
        }
    }

    private static void c(Context context, CharSequence charSequence, K k, int i) {
        try {
            u.j(context).l(i, u.j(context).h(context, k, charSequence));
            a.i().m("notification", "storage_full_notified").c("loc", k.d().I()).e();
        } catch (AndroidRuntimeException | SecurityException unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        b.k(context);
        if (j.I(context) && C3197o.e(context)) {
            if (ax.Z2.j.F().n0(context)) {
                c(context, Html.fromHtml(context.getString(R.string.storage_is_full, context.getString(R.string.location_mainstorage), "<font color='red'>" + C3180B.P(ax.Z2.j.F().P()) + "</font>")), K.e, 201);
            }
            if (ax.Z2.j.F().t0() && ax.Z2.j.F().u0(context)) {
                c(context, Html.fromHtml(context.getString(R.string.storage_is_full, context.getString(R.string.location_sdcard), "<font color='red'>" + C3180B.P(ax.Z2.j.F().U()) + "</font>")), K.f, 202);
            }
        }
    }
}
