package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import ax.J5.C0742c;
import ax.M5.AbstractC0808c;
import ax.M5.C0821p;
import ax.f6.InterfaceC2057e;

/* loaded from: classes3.dex */
public final class J4 implements ServiceConnection, AbstractC0808c.a, AbstractC0808c.b {
    private volatile T1 c0;
    final /* synthetic */ C3689k4 d0;
    private volatile boolean q;

    protected J4(C3689k4 c3689k4) {
        this.d0 = c3689k4;
    }

    @Override // ax.M5.AbstractC0808c.a
    public final void B(Bundle bundle) {
        C0821p.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C0821p.l(this.c0);
                this.d0.l().D(new K4(this, this.c0.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.c0 = null;
                this.q = false;
            }
        }
    }

    public final void a() {
        this.d0.n();
        Context a = this.d0.a();
        synchronized (this) {
            try {
                if (this.q) {
                    this.d0.k().K().a("Connection attempt already in progress");
                    return;
                }
                if (this.c0 != null && (this.c0.f() || this.c0.a())) {
                    this.d0.k().K().a("Already awaiting connection attempt");
                    return;
                }
                this.c0 = new T1(a, Looper.getMainLooper(), this, this);
                this.d0.k().K().a("Connecting to remote service");
                this.q = true;
                C0821p.l(this.c0);
                this.c0.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent) {
        J4 j4;
        this.d0.n();
        Context a = this.d0.a();
        ax.Q5.b b = ax.Q5.b.b();
        synchronized (this) {
            try {
                if (this.q) {
                    this.d0.k().K().a("Connection attempt already in progress");
                    return;
                }
                this.d0.k().K().a("Using local app measurement service");
                this.q = true;
                j4 = this.d0.c;
                b.a(a, intent, j4, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.c0 != null && (this.c0.a() || this.c0.f())) {
            this.c0.b();
        }
        this.c0 = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        J4 j4;
        C0821p.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.q = false;
                this.d0.k().G().a("Service connected with null binder");
                return;
            }
            InterfaceC2057e interfaceC2057e = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    interfaceC2057e = queryLocalInterface instanceof InterfaceC2057e ? (InterfaceC2057e) queryLocalInterface : new O1(iBinder);
                    this.d0.k().K().a("Bound to IMeasurementService interface");
                } else {
                    this.d0.k().G().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.d0.k().G().a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC2057e == null) {
                this.q = false;
                try {
                    ax.Q5.b b = ax.Q5.b.b();
                    Context a = this.d0.a();
                    j4 = this.d0.c;
                    b.c(a, j4);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.d0.l().D(new I4(this, interfaceC2057e));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0821p.e("MeasurementServiceConnection.onServiceDisconnected");
        this.d0.k().F().a("Service disconnected");
        this.d0.l().D(new L4(this, componentName));
    }

    @Override // ax.M5.AbstractC0808c.b
    public final void r(C0742c c0742c) {
        C0821p.e("MeasurementServiceConnection.onConnectionFailed");
        V1 E = this.d0.a.E();
        if (E != null) {
            E.L().b("Service connection failed", c0742c);
        }
        synchronized (this) {
            this.q = false;
            this.c0 = null;
        }
        this.d0.l().D(new M4(this));
    }

    @Override // ax.M5.AbstractC0808c.a
    public final void w(int i) {
        C0821p.e("MeasurementServiceConnection.onConnectionSuspended");
        this.d0.k().F().a("Service connection suspended");
        this.d0.l().D(new O4(this));
    }
}
