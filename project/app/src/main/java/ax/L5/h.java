/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import ax.J5.e;
import ax.K5.a;
import ax.L5.c;
import ax.L5.i;
import ax.L5.v;
import ax.L5.w;
import ax.M5.c;
import ax.M5.j;
import ax.M5.p;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

public final class h
implements a.f,
ServiceConnection {
    private final String c0;
    private final ComponentName d0;
    private final Context e0;
    private final c f0;
    private final Handler g0;
    private final i h0;
    private IBinder i0;
    private boolean j0;
    private String k0;
    private String l0;
    private final String q;

    private final void s() {
        Handler handler = this.g0;
        if (Thread.currentThread() == handler.getLooper().getThread()) {
            return;
        }
        throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }

    @Override
    public final boolean a() {
        this.s();
        return this.i0 != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b() {
        this.s();
        String.valueOf(this.i0);
        try {
            this.e0.unbindService((ServiceConnection)this);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        this.j0 = false;
        this.i0 = null;
    }

    @Override
    public final void c(j j8, Set<Scope> set) {
    }

    @Override
    public final Set<Scope> d() {
        return Collections.EMPTY_SET;
    }

    @Override
    public final void e(String string) {
        this.s();
        this.k0 = string;
        this.b();
    }

    @Override
    public final boolean f() {
        this.s();
        return this.j0;
    }

    @Override
    public final String g() {
        String string = this.q;
        if (string != null) {
            return string;
        }
        p.l(this.d0);
        return this.d0.getPackageName();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void h(c.c c8) {
        SecurityException securityException2;
        block8: {
            boolean bl;
            block7: {
                block6: {
                    this.s();
                    String.valueOf(this.i0);
                    if (this.a()) {
                        try {
                            this.e("connect() called when already connected");
                        }
                        catch (Exception exception) {}
                    }
                    try {
                        c8 = new Intent();
                        ComponentName componentName = this.d0;
                        if (componentName == null) break block6;
                        c8.setComponent(componentName);
                        break block7;
                    }
                    catch (SecurityException securityException2) {
                        break block8;
                    }
                }
                c8.setPackage(this.q).setAction(this.c0);
            }
            this.j0 = bl = this.e0.bindService((Intent)c8, (ServiceConnection)this, ax.M5.h.b());
            if (!bl) {
                this.i0 = null;
                this.h0.r(new ax.J5.c(16));
            }
            String.valueOf(this.i0);
            return;
        }
        this.j0 = false;
        this.i0 = null;
        throw securityException2;
    }

    @Override
    public final void i(c.e e8) {
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final int k() {
        return 0;
    }

    @Override
    public final e[] l() {
        return new e[0];
    }

    @Override
    public final String m() {
        return this.k0;
    }

    @Override
    public final boolean o() {
        return false;
    }

    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        object = new w(this, iBinder);
        this.g0.post((Runnable)object);
    }

    public final void onServiceDisconnected(ComponentName object) {
        object = new v(this);
        this.g0.post((Runnable)object);
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
        iBinder = new Bundle();
        this.f0.B((Bundle)iBinder);
    }

    public final void r(String string) {
        this.l0 = string;
    }
}

