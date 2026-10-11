package ax.ne;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import ax.bc.InterfaceC1731c;
import ax.ne.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
class m extends InterfaceC1731c.a {
    private static final Handler i = new Handler(Looper.getMainLooper());
    private final ComponentName f;
    private IBinder g;
    private final Set<ServiceConnection> e = new HashSet();
    private boolean h = false;

    public m(i.f fVar) {
        this.f = fVar.a;
    }

    public static /* synthetic */ void r(m mVar) {
        Iterator<ServiceConnection> it = mVar.e.iterator();
        while (it.hasNext()) {
            it.next().onServiceDisconnected(mVar.f);
        }
        mVar.e.clear();
        n.b(mVar);
    }

    public static /* synthetic */ void w(m mVar, IBinder iBinder) {
        Iterator<ServiceConnection> it = mVar.e.iterator();
        while (it.hasNext()) {
            it.next().onServiceConnected(mVar.f, iBinder);
        }
    }

    public void B(ServiceConnection serviceConnection) {
        if (serviceConnection != null) {
            this.e.add(serviceConnection);
        }
    }

    @Override // ax.bc.InterfaceC1731c
    public void M1(final IBinder iBinder) {
        i.post(new Runnable() { // from class: ax.ne.j
            @Override // java.lang.Runnable
            public final void run() {
                m.w(m.this, iBinder);
            }
        });
        this.g = iBinder;
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: ax.ne.k
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    m.this.T();
                }
            }, 0);
        } catch (RemoteException unused) {
        }
    }

    @Override // ax.bc.InterfaceC1731c
    public void T() {
        this.g = null;
        if (this.h) {
            return;
        }
        this.h = true;
        i.post(new Runnable() { // from class: ax.ne.l
            @Override // java.lang.Runnable
            public final void run() {
                m.r(m.this);
            }
        });
    }

    public void a2() {
        this.e.clear();
    }
}
