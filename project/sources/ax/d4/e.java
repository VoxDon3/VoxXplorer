package ax.d4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ax.d4.c;

/* loaded from: classes.dex */
class e implements c {
    final c.a c0;
    boolean d0;
    private boolean e0;
    private final BroadcastReceiver f0 = new a();
    private final Context q;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z = eVar.d0;
            eVar.d0 = eVar.h(context);
            e eVar2 = e.this;
            boolean z2 = eVar2.d0;
            if (z != z2) {
                eVar2.c0.a(z2);
            }
        }
    }

    public e(Context context, c.a aVar) {
        this.q = context.getApplicationContext();
        this.c0 = aVar;
    }

    private void m() {
        if (this.e0) {
            return;
        }
        this.d0 = h(this.q);
        this.q.registerReceiver(this.f0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.e0 = true;
    }

    private void n() {
        if (this.e0) {
            this.q.unregisterReceiver(this.f0);
            this.e0 = false;
        }
    }

    @Override // ax.d4.i
    public void a() {
        n();
    }

    @Override // ax.d4.i
    public void b() {
        m();
    }

    boolean h(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // ax.d4.i
    public void f() {
    }
}
