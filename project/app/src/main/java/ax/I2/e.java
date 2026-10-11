/*
 * Decompiled with CFR 0.152.
 */
package ax.I2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ax.B2.i;
import ax.Gb.l;
import ax.I2.f;
import ax.I2.h;
import ax.N2.c;

public abstract class e<T>
extends h<T> {
    private final BroadcastReceiver f;

    public e(Context context, c c8) {
        l.f(context, "context");
        l.f(c8, "taskExecutor");
        super(context, c8);
        this.f = new BroadcastReceiver(this){
            final e<T> a;
            {
                this.a = e8;
            }

            public void onReceive(Context context, Intent intent) {
                l.f(context, "context");
                l.f(intent, "intent");
                this.a.k(intent);
            }
        };
    }

    @Override
    public void h() {
        i i8 = i.e();
        String string = ax.I2.f.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": registering receiver");
        i8.a(string, stringBuilder.toString());
        this.d().registerReceiver(this.f, this.j());
    }

    @Override
    public void i() {
        i i8 = i.e();
        String string = ax.I2.f.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": unregistering receiver");
        i8.a(string, stringBuilder.toString());
        this.d().unregisterReceiver(this.f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent var1);
}

