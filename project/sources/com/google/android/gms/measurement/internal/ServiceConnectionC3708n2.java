package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import ax.b6.AbstractBinderC1523c0;
import ax.b6.InterfaceC1532d0;

/* renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC3708n2 implements ServiceConnection {
    final /* synthetic */ C3714o2 c0;
    private final String q;

    ServiceConnectionC3708n2(C3714o2 c3714o2, String str) {
        this.c0 = c3714o2;
        this.q = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.c0.a.k().L().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC1532d0 w = AbstractBinderC1523c0.w(iBinder);
            if (w == null) {
                this.c0.a.k().L().a("Install Referrer Service implementation was not found");
            } else {
                this.c0.a.k().K().a("Install Referrer Service connected");
                this.c0.a.l().D(new RunnableC3720p2(this, w, this));
            }
        } catch (RuntimeException e) {
            this.c0.a.k().L().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.c0.a.k().K().a("Install Referrer Service disconnected");
    }
}
