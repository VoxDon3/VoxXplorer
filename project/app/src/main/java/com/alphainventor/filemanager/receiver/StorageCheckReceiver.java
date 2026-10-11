/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.receiver;

import android.app.AlarmManager;
import android.app.Notification;
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
import ax.u3.B;
import ax.u3.l;
import ax.u3.o;
import java.util.Calendar;

public class StorageCheckReceiver
extends BroadcastReceiver {
    public static void a(Context context, K k8) {
        if (K.e.equals(k8)) {
            u.j(context).a(201);
            return;
        }
        if (K.f.equals(k8)) {
            u.j(context).a(202);
            return;
        }
        u.j(context).a(201);
        u.j(context).a(202);
    }

    public static void b(Context context, boolean bl) {
        if (j.I(context)) {
            long l8;
            Intent intent;
            block4: {
                long l9;
                intent = new Intent(context, StorageCheckReceiver.class);
                intent.setAction("filemanager.intent.action.STORAGE_CHECK");
                intent = l.b(context, 200, intent, 0);
                Calendar calendar = Calendar.getInstance();
                int n8 = calendar.get(11);
                calendar.set(11, 21);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                l8 = l9 = calendar.getTimeInMillis();
                if (21 - n8 > 1) break block4;
                l8 = l9 + 86400000L;
            }
            try {
                context = (AlarmManager)context.getSystemService("alarm");
                context.cancel((PendingIntent)intent);
                context.setInexactRepeating(1, l8, 86400000L, (PendingIntent)intent);
                return;
            }
            catch (NullPointerException | SecurityException runtimeException) {
                c.h().f().d("AlarmManager Error").l(runtimeException).h();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void c(Context context, CharSequence charSequence, K k8, int n8) {
        try {
            charSequence = u.j(context).h(context, k8, charSequence);
            u.j(context).l(n8, (Notification)charSequence);
            a.i().m("notification", "storage_full_notified").c("loc", k8.d().I()).e();
            return;
        }
        catch (AndroidRuntimeException | SecurityException throwable) {
            return;
        }
    }

    public void onReceive(Context context, Intent object) {
        b.k(context);
        if (j.I(context) && o.e(context)) {
            float f8;
            String string;
            if (ax.Z2.j.F().n0(context)) {
                string = context.getString(2131952168);
                f8 = ax.Z2.j.F().P();
                object = new StringBuilder();
                ((StringBuilder)object).append("<font color='red'>");
                ((StringBuilder)object).append(B.P(f8));
                ((StringBuilder)object).append("</font>");
                StorageCheckReceiver.c(context, (CharSequence)Html.fromHtml((String)context.getString(2131952632, new Object[]{string, ((StringBuilder)object).toString()})), K.e, 201);
            }
            if (ax.Z2.j.F().t0() && ax.Z2.j.F().u0(context)) {
                string = context.getString(2131952181);
                f8 = ax.Z2.j.F().U();
                object = new StringBuilder();
                ((StringBuilder)object).append("<font color='red'>");
                ((StringBuilder)object).append(B.P(f8));
                ((StringBuilder)object).append("</font>");
                StorageCheckReceiver.c(context, (CharSequence)Html.fromHtml((String)context.getString(2131952632, new Object[]{string, ((StringBuilder)object).toString()})), K.f, 202);
            }
        }
    }
}

