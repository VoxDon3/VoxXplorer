/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import ax.M5.V;
import ax.M5.c;
import ax.M5.l;

public final class f0
implements ServiceConnection {
    final c c0;
    private final int q;

    public f0(c c8, int n8) {
        this.c0 = c8;
        this.q = n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        object = this.c0;
        if (iBinder == null) {
            c.d0((c)object, 16);
            return;
        }
        Object object2 = c.W((c)object);
        synchronized (object2) {
            try {
                c c8 = this.c0;
                object = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = object != null && object instanceof l ? (l)object : new V(iBinder);
                c.a0(c8, (l)object);
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl12 : MonitorExitStatement: MONITOREXIT : var3_4
                this.c0.e0(0, null, this.q);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName object) {
        Object object2 = c.W(this.c0);
        synchronized (object2) {
            c.a0(this.c0, null);
        }
        object = this.c0;
        int n8 = this.q;
        object = object.m0;
        object.sendMessage(object.obtainMessage(6, n8, 1));
    }
}

