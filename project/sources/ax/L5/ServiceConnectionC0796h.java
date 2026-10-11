package ax.L5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import ax.J5.C0742c;
import ax.J5.C0744e;
import ax.K5.a;
import ax.M5.AbstractC0808c;
import ax.M5.AbstractC0813h;
import ax.M5.C0821p;
import ax.M5.InterfaceC0815j;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

/* renamed from: ax.L5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC0796h implements a.f, ServiceConnection {
    private final String c0;
    private final ComponentName d0;
    private final Context e0;
    private final InterfaceC0791c f0;
    private final Handler g0;
    private final InterfaceC0797i h0;
    private IBinder i0;
    private boolean j0;
    private String k0;
    private String l0;
    private final String q;

    private final void s() {
        if (Thread.currentThread() != this.g0.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // ax.K5.a.f
    public final boolean a() {
        s();
        return this.i0 != null;
    }

    @Override // ax.K5.a.f
    public final void b() {
        s();
        String.valueOf(this.i0);
        try {
            this.e0.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.j0 = false;
        this.i0 = null;
    }

    @Override // ax.K5.a.f
    public final Set<Scope> d() {
        return Collections.EMPTY_SET;
    }

    @Override // ax.K5.a.f
    public final void e(String str) {
        s();
        this.k0 = str;
        b();
    }

    @Override // ax.K5.a.f
    public final boolean f() {
        s();
        return this.j0;
    }

    @Override // ax.K5.a.f
    public final String g() {
        String str = this.q;
        if (str != null) {
            return str;
        }
        C0821p.l(this.d0);
        return this.d0.getPackageName();
    }

    @Override // ax.K5.a.f
    public final void h(AbstractC0808c.InterfaceC0151c interfaceC0151c) {
        s();
        String.valueOf(this.i0);
        if (a()) {
            try {
                e("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.d0;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.q).setAction(this.c0);
            }
            boolean bindService = this.e0.bindService(intent, this, AbstractC0813h.b());
            this.j0 = bindService;
            if (!bindService) {
                this.i0 = null;
                this.h0.r(new C0742c(16));
            }
            String.valueOf(this.i0);
        } catch (SecurityException e) {
            this.j0 = false;
            this.i0 = null;
            throw e;
        }
    }

    @Override // ax.K5.a.f
    public final boolean j() {
        return false;
    }

    @Override // ax.K5.a.f
    public final int k() {
        return 0;
    }

    @Override // ax.K5.a.f
    public final C0744e[] l() {
        return new C0744e[0];
    }

    @Override // ax.K5.a.f
    public final String m() {
        return this.k0;
    }

    @Override // ax.K5.a.f
    public final boolean o() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.g0.post(new Runnable() { // from class: ax.L5.w
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC0796h.this.q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.g0.post(new Runnable() { // from class: ax.L5.v
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC0796h.this.p();
            }
        });
    }

    final /* synthetic */ void p() {
        this.j0 = false;
        this.i0 = null;
        this.f0.w(1);
    }

    final /* synthetic */ void q(IBinder iBinder) {
        this.j0 = false;
        this.i0 = iBinder;
        String.valueOf(iBinder);
        this.f0.B(new Bundle());
    }

    public final void r(String str) {
        this.l0 = str;
    }

    @Override // ax.K5.a.f
    public final void i(AbstractC0808c.e eVar) {
    }

    @Override // ax.K5.a.f
    public final void c(InterfaceC0815j interfaceC0815j, Set<Scope> set) {
    }
}
