package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import ax.B2.i;
import ax.G0.j;
import ax.L2.y;

/* loaded from: classes.dex */
public class SystemAlarmService extends j implements e.c {
    private static final String d = i.i("SystemAlarmService");
    private e b;
    private boolean c;

    private void e() {
        e eVar = new e(this);
        this.b = eVar;
        eVar.l(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void a() {
        this.c = true;
        i.e().a(d, "All commands completed in dispatcher");
        y.a();
        stopSelf();
    }

    @Override // ax.G0.j, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.c = false;
    }

    @Override // ax.G0.j, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.j();
    }

    @Override // ax.G0.j, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            i.e().f(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.b.j();
            e();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.a(intent, i2);
        return 3;
    }
}
