/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import ax.p5.p;
import ax.p5.u;
import ax.w5.a;

public class AlarmManagerSchedulerBroadcastReceiver
extends BroadcastReceiver {
    public static /* synthetic */ void a() {
    }

    public void onReceive(Context object, Intent intent) {
        String string = intent.getData().getQueryParameter("backendName");
        String string2 = intent.getData().getQueryParameter("extras");
        int n8 = Integer.valueOf(intent.getData().getQueryParameter("priority"));
        int n9 = intent.getExtras().getInt("attemptNumber");
        u.f((Context)object);
        object = p.a().b(string).d(ax.A5.a.b(n8));
        if (string2 != null) {
            ((p.a)object).c(Base64.decode((String)string2, (int)0));
        }
        u.c().e().m(((p.a)object).a(), n9, new a());
    }
}

