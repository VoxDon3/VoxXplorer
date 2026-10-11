/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ax.Ha.c;
import ax.L0.a;

public class g {
    private static g b;
    Context a;

    g(Context context) {
        this.a = context.getApplicationContext();
    }

    public static g a() {
        if (b == null) {
            c.h().b("LocalBroadcast not initialized").j().h();
        }
        return b;
    }

    public static void b(Context context) {
        b = new g(context);
    }

    public void c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        ax.L0.a.b(this.a).c(broadcastReceiver, intentFilter);
    }

    public void d(String string, BroadcastReceiver broadcastReceiver) {
        string = new IntentFilter(string);
        ax.L0.a.b(this.a).c(broadcastReceiver, (IntentFilter)string);
    }

    public void e(Intent intent) {
        ax.L0.a.b(this.a).d(intent);
    }

    public void f(String string) {
        string = new Intent(string);
        ax.L0.a.b(this.a).d((Intent)string);
    }

    public void g(Intent intent) {
        ax.L0.a.b(this.a).e(intent);
    }

    public void h(BroadcastReceiver broadcastReceiver) {
        ax.L0.a.b(this.a).f(broadcastReceiver);
    }
}

