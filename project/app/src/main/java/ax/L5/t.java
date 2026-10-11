/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ax.L5.s;

public final class t
extends BroadcastReceiver {
    Context a;
    private final s b;

    public t(s s8) {
        this.b = s8;
    }

    public final void a(Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Context context = this.a;
                        if (context == null) break block3;
                        context.unregisterReceiver((BroadcastReceiver)this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.a = null;
                return;
            }
            throw throwable2;
        }
    }

    public final void onReceive(Context object, Intent intent) {
        object = intent.getData();
        object = object != null ? object.getSchemeSpecificPart() : null;
        if ("com.google.android.gms".equals(object)) {
            this.b.a();
            this.b();
        }
    }
}

