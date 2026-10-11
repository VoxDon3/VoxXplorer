/*
 * Decompiled with CFR 0.152.
 */
package ax.G0;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.d;
import androidx.lifecycle.o;
import ax.G0.h;
import ax.Gb.l;

public class j
extends Service
implements h {
    private final o a = new o(this);

    @Override
    public d getLifecycle() {
        return this.a.a();
    }

    public IBinder onBind(Intent intent) {
        l.f(intent, "intent");
        this.a.b();
        return null;
    }

    public void onCreate() {
        this.a.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.a.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int n8) {
        this.a.e();
        super.onStart(intent, n8);
    }

    public int onStartCommand(Intent intent, int n8, int n9) {
        return super.onStartCommand(intent, n8, n9);
    }
}

