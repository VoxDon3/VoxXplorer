/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import ax.J5.c;
import ax.J5.h;
import ax.L5.f;
import ax.Y5.k;
import ax.f1.i;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.D;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

public abstract class E
extends LifecycleCallback
implements DialogInterface.OnCancelListener {
    protected volatile boolean b;
    protected final AtomicReference c = new AtomicReference<Object>(null);
    private final Handler d = new k(Looper.getMainLooper());
    protected final h e;

    E(f f8, h h8) {
        super(f8);
        this.e = h8;
    }

    private final void l(c c8, int n8) {
        this.c.set(null);
        this.m(c8, n8);
    }

    private final void o() {
        this.c.set(null);
        this.n();
    }

    private static final int p(B b8) {
        if (b8 == null) {
            return -1;
        }
        return b8.a();
    }

    static /* bridge */ /* synthetic */ void q(E e8, c c8, int n8) {
        e8.l(c8, n8);
    }

    static /* bridge */ /* synthetic */ void r(E e8) {
        e8.o();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void e(int n8, int n9, Intent intent) {
        B b8 = (B)this.c.get();
        if (n8 != 1) {
            if (n8 == 2) {
                n8 = this.e.g((Context)this.b());
                if (n8 == 0) {
                    this.o();
                    return;
                }
                if (b8 == null || b8.b().k() == 18 && n8 == 18) {
                    return;
                }
            }
        } else {
            if (n9 == -1) {
                this.o();
                return;
            }
            if (n9 == 0) {
                if (b8 == null) return;
                n8 = 13;
                if (intent != null) {
                    n8 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                this.l(new c(n8, null, b8.b().toString()), E.p(b8));
                return;
            }
        }
        if (b8 == null) return;
        this.l(b8.b(), b8.a());
    }

    @Override
    public final void f(Bundle object) {
        super.f((Bundle)object);
        if (object != null) {
            AtomicReference atomicReference = this.c;
            object = object.getBoolean("resolving_error", false) ? new B(new c(object.getInt("failed_status"), (PendingIntent)object.getParcelable("failed_resolution")), object.getInt("failed_client_id", -1)) : null;
            atomicReference.set(object);
        }
    }

    @Override
    public final void i(Bundle bundle) {
        super.i(bundle);
        B b8 = (B)this.c.get();
        if (b8 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", b8.a());
        bundle.putInt("failed_status", b8.b().k());
        bundle.putParcelable("failed_resolution", (Parcelable)b8.b().z());
    }

    @Override
    public void j() {
        super.j();
        this.b = true;
    }

    @Override
    public void k() {
        super.k();
        this.b = false;
    }

    protected abstract void m(c var1, int var2);

    protected abstract void n();

    public final void onCancel(DialogInterface dialogInterface) {
        this.l(new c(13, null), E.p((B)this.c.get()));
    }

    public final void s(c object, int n8) {
        B b8 = new B((c)object, n8);
        do {
            if (!i.a((AtomicReference)(object = this.c), null, b8)) continue;
            this.d.post((Runnable)new D(this, b8));
            return;
        } while (((AtomicReference)object).get() == null);
    }
}

