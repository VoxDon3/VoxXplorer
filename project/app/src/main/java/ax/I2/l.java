/*
 * Decompiled with CFR 0.152.
 */
package ax.I2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import ax.B2.i;
import ax.G2.b;
import ax.I2.e;
import ax.I2.k;
import ax.N2.c;

public final class l
extends e<b> {
    private final ConnectivityManager g;

    public l(Context object, c c8) {
        ax.Gb.l.f(object, "context");
        ax.Gb.l.f(c8, "taskExecutor");
        super((Context)object, c8);
        object = this.d().getSystemService("connectivity");
        ax.Gb.l.d(object, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.g = (ConnectivityManager)object;
    }

    @Override
    public IntentFilter j() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override
    public void k(Intent intent) {
        ax.Gb.l.f(intent, "intent");
        if (ax.Gb.l.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            i.e().a(k.b(), "Network broadcast received");
            this.g(k.c(this.g));
        }
    }

    public b l() {
        return k.c(this.g);
    }
}

