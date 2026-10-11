package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ax.M5.C0821p;

/* renamed from: com.google.android.gms.measurement.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3652f2 extends BroadcastReceiver {
    private final q5 a;
    private boolean b;
    private boolean c;

    C3652f2(q5 q5Var) {
        C0821p.l(q5Var);
        this.a = q5Var;
    }

    public final void b() {
        this.a.v0();
        this.a.l().n();
        if (this.b) {
            return;
        }
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.l0().A();
        this.a.k().K().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
        this.b = true;
    }

    public final void c() {
        this.a.v0();
        this.a.l().n();
        this.a.l().n();
        if (this.b) {
            this.a.k().K().a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.k().G().b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.a.v0();
        String action = intent.getAction();
        this.a.k().K().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.a.k().L().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean A = this.a.l0().A();
        if (this.c != A) {
            this.c = A;
            this.a.l().D(new RunnableC3645e2(this, A));
        }
    }
}
