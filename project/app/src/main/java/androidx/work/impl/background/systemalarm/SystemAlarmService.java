/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import ax.B2.i;
import ax.G0.j;
import ax.L2.y;

public class SystemAlarmService
extends j
implements e.c {
    private static final String d = i.i("SystemAlarmService");
    private e b;
    private boolean c;

    private void e() {
        e e8;
        this.b = e8 = new e((Context)this);
        e8.l(this);
    }

    @Override
    public void a() {
        this.c = true;
        i.e().a(d, "All commands completed in dispatcher");
        y.a();
        this.stopSelf();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.e();
        this.c = false;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.j();
    }

    @Override
    public int onStartCommand(Intent intent, int n8, int n9) {
        super.onStartCommand(intent, n8, n9);
        if (this.c) {
            i.e().f(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.b.j();
            this.e();
            this.c = false;
        }
        if (intent != null) {
            this.b.a(intent, n9);
        }
        return 3;
    }
}

