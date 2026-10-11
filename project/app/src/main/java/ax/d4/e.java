/*
 * Decompiled with CFR 0.152.
 */
package ax.d4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import ax.d4.c;

class e
implements c {
    final c.a c0;
    boolean d0;
    private boolean e0;
    private final BroadcastReceiver f0 = new BroadcastReceiver(this){
        final e a;
        {
            this.a = e8;
        }

        public void onReceive(Context object, Intent object2) {
            object2 = this.a;
            boolean bl = ((e)object2).d0;
            ((e)object2).d0 = ((e)object2).h((Context)object);
            object = this.a;
            boolean bl2 = object.d0;
            if (bl != bl2) {
                object.c0.a(bl2);
            }
        }
    };
    private final Context q;

    public e(Context context, c.a a8) {
        this.q = context.getApplicationContext();
        this.c0 = a8;
    }

    private void m() {
        if (this.e0) {
            return;
        }
        this.d0 = this.h(this.q);
        this.q.registerReceiver(this.f0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.e0 = true;
    }

    private void n() {
        if (!this.e0) {
            return;
        }
        this.q.unregisterReceiver(this.f0);
        this.e0 = false;
    }

    @Override
    public void a() {
        this.n();
    }

    @Override
    public void b() {
        this.m();
    }

    @Override
    public void f() {
    }

    boolean h(Context context) {
        return (context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && context.isConnected();
    }
}

