package ax.u3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: ax.u3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3189g {
    private static C3189g b;
    Context a;

    C3189g(Context context) {
        this.a = context.getApplicationContext();
    }

    public static C3189g a() {
        if (b == null) {
            ax.Ha.c.h().b("LocalBroadcast not initialized").j().h();
        }
        return b;
    }

    public static void b(Context context) {
        b = new C3189g(context);
    }

    public void c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        ax.L0.a.b(this.a).c(broadcastReceiver, intentFilter);
    }

    public void d(String str, BroadcastReceiver broadcastReceiver) {
        ax.L0.a.b(this.a).c(broadcastReceiver, new IntentFilter(str));
    }

    public void e(Intent intent) {
        ax.L0.a.b(this.a).d(intent);
    }

    public void f(String str) {
        ax.L0.a.b(this.a).d(new Intent(str));
    }

    public void g(Intent intent) {
        ax.L0.a.b(this.a).e(intent);
    }

    public void h(BroadcastReceiver broadcastReceiver) {
        ax.L0.a.b(this.a).f(broadcastReceiver);
    }
}
