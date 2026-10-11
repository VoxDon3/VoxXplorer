/*
 * Decompiled with CFR 0.152.
 */
package ax.ne;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import ax.bc.c;
import ax.ne.i;
import ax.ne.j;
import ax.ne.k;
import ax.ne.l;
import ax.ne.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class m
extends c.a {
    private static final Handler i = new Handler(Looper.getMainLooper());
    private final Set<ServiceConnection> e = new HashSet<ServiceConnection>();
    private final ComponentName f;
    private IBinder g;
    private boolean h = false;

    public m(i.f f8) {
        this.f = f8.a;
    }

    public static /* synthetic */ void r(m m8) {
        Iterator<ServiceConnection> iterator = m8.e.iterator();
        while (iterator.hasNext()) {
            iterator.next().onServiceDisconnected(m8.f);
        }
        m8.e.clear();
        n.b(m8);
    }

    public static /* synthetic */ void w(m m8, IBinder iBinder) {
        Iterator<ServiceConnection> iterator = m8.e.iterator();
        while (iterator.hasNext()) {
            iterator.next().onServiceConnected(m8.f, iBinder);
        }
    }

    public void B(ServiceConnection serviceConnection) {
        if (serviceConnection != null) {
            this.e.add(serviceConnection);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void M1(IBinder iBinder) {
        i.post((Runnable)new j(this, iBinder));
        this.g = iBinder;
        try {
            k k8 = new k(this);
            iBinder.linkToDeath((IBinder.DeathRecipient)k8, 0);
            return;
        }
        catch (RemoteException remoteException) {
            return;
        }
    }

    @Override
    public void T() {
        this.g = null;
        if (this.h) {
            return;
        }
        this.h = true;
        i.post((Runnable)new l(this));
    }

    public void a2() {
        this.e.clear();
    }
}

