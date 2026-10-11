/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ax.M5.p;
import com.google.android.gms.measurement.internal.e2;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.q5;

class f2
extends BroadcastReceiver {
    private final q5 a;
    private boolean b;
    private boolean c;

    f2(q5 q52) {
        p.l(q52);
        this.a = q52;
    }

    static /* bridge */ /* synthetic */ q5 a(f2 f22) {
        return f22.a;
    }

    public final void b() {
        this.a.v0();
        ((f3)this.a.l()).n();
        if (this.b) {
            return;
        }
        this.a.a().registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.l0().A();
        this.a.k().K().b("Registering connectivity change receiver. Network connected", this.c);
        this.b = true;
    }

    public final void c() {
        this.a.v0();
        ((f3)this.a.l()).n();
        ((f3)this.a.l()).n();
        if (!this.b) {
            return;
        }
        this.a.k().K().a("Unregistering connectivity change receiver");
        this.b = false;
        this.c = false;
        Context context = this.a.a();
        try {
            context.unregisterReceiver((BroadcastReceiver)this);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.a.k().G().b("Failed to unregister the network broadcast receiver", illegalArgumentException);
            return;
        }
    }

    public void onReceive(Context object, Intent intent) {
        this.a.v0();
        object = intent.getAction();
        this.a.k().K().b("NetworkBroadcastReceiver received action", object);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(object)) {
            boolean bl = this.a.l0().A();
            if (this.c != bl) {
                this.c = bl;
                this.a.l().D(new e2(this, bl));
            }
            return;
        }
        this.a.k().L().b("NetworkBroadcastReceiver received unknown action", object);
    }
}

