/*
 * Decompiled with CFR 0.152.
 */
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
import ax.J5.c;
import ax.M5.c;
import ax.M5.p;
import ax.Q5.b;
import ax.f6.e;
import com.google.android.gms.measurement.internal.I4;
import com.google.android.gms.measurement.internal.K4;
import com.google.android.gms.measurement.internal.L4;
import com.google.android.gms.measurement.internal.M4;
import com.google.android.gms.measurement.internal.O1;
import com.google.android.gms.measurement.internal.O4;
import com.google.android.gms.measurement.internal.T1;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;
import com.google.android.gms.measurement.internal.z2;

public final class J4
implements ServiceConnection,
c.a,
c.b {
    private volatile T1 c0;
    final k4 d0;
    private volatile boolean q;

    protected J4(k4 k42) {
        this.d0 = k42;
    }

    static /* bridge */ /* synthetic */ void c(J4 j42, boolean bl) {
        j42.q = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void B(Bundle object) {
        p.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            Throwable throwable3;
            block5: {
                try {
                    try {
                        p.l(this.c0);
                        e e8 = (e)this.c0.D();
                        object = ((f3)this.d0).l();
                        K4 k42 = new K4(this, e8);
                        ((z2)object).D(k42);
                    }
                    catch (DeadObjectException | IllegalStateException throwable2) {
                        this.c0 = null;
                        this.q = false;
                    }
                }
                catch (Throwable throwable3) {
                    break block5;
                }
                return;
            }
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        ((f3)this.d0).n();
        Context context = ((f3)this.d0).a();
        synchronized (this) {
            Throwable throwable2;
            block5: {
                T1 t12;
                try {
                    if (this.q) {
                        ((f3)this.d0).k().K().a("Connection attempt already in progress");
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                if (this.c0 != null && (this.c0.f() || this.c0.a())) {
                    ((f3)this.d0).k().K().a("Already awaiting connection attempt");
                    return;
                }
                this.c0 = t12 = new T1(context, Looper.getMainLooper(), this, this);
                ((f3)this.d0).k().K().a("Connecting to remote service");
                this.q = true;
                p.l(this.c0);
                this.c0.q();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Intent intent) {
        ((f3)this.d0).n();
        Context context = ((f3)this.d0).a();
        b b8 = b.b();
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (this.q) {
                        ((f3)this.d0).k().K().a("Connection attempt already in progress");
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                ((f3)this.d0).k().K().a("Using local app measurement service");
                this.q = true;
                b8.a(context, intent, k4.m0(this.d0), 129);
                return;
            }
            throw throwable2;
        }
    }

    public final void d() {
        if (this.c0 != null && (this.c0.a() || this.c0.f())) {
            this.c0.b();
        }
        this.c0 = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName object, IBinder object2) {
        p.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            Throwable throwable2;
            if (object2 == null) {
                try {
                    this.q = false;
                    ((f3)this.d0).k().G().a("Service connected with null binder");
                    return;
                }
                catch (Throwable throwable2) {}
            } else {
                IInterface iInterface = null;
                z2 z22 = null;
                object = z22;
                try {
                    String string = object2.getInterfaceDescriptor();
                    object = z22;
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(string)) {
                        object = z22;
                        iInterface = object2.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        object = z22;
                        if (iInterface instanceof e) {
                            object = z22;
                            object2 = (e)iInterface;
                        } else {
                            object = z22;
                            object2 = new O1((IBinder)object2);
                        }
                        object = object2;
                        ((f3)this.d0).k().K().a("Bound to IMeasurementService interface");
                        object = object2;
                    } else {
                        object = z22;
                        ((f3)this.d0).k().G().b("Got binder with a wrong descriptor", string);
                        object = iInterface;
                    }
                }
                catch (RemoteException remoteException) {
                    ((f3)this.d0).k().G().a("Service connect failed to get IMeasurementService");
                }
                if (object == null) {
                    this.q = false;
                    try {
                        b.b().c(((f3)this.d0).a(), k4.m0(this.d0));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {}
                } else {
                    z22 = ((f3)this.d0).l();
                    object2 = new I4(this, (e)object);
                    z22.D((Runnable)object2);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        p.e("MeasurementServiceConnection.onServiceDisconnected");
        ((f3)this.d0).k().F().a("Service disconnected");
        ((f3)this.d0).l().D(new L4(this, componentName));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void r(c c8) {
        p.e("MeasurementServiceConnection.onConnectionFailed");
        V1 v12 = this.d0.a.E();
        if (v12 != null) {
            v12.L().b("Service connection failed", c8);
        }
        synchronized (this) {
            this.q = false;
            this.c0 = null;
        }
        ((f3)this.d0).l().D(new M4(this));
    }

    @Override
    public final void w(int n8) {
        p.e("MeasurementServiceConnection.onConnectionSuspended");
        ((f3)this.d0).k().F().a("Service connection suspended");
        ((f3)this.d0).l().D(new O4(this));
    }
}

