package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ax.J5.C0742c;
import ax.J5.C0747h;
import ax.L5.InterfaceC0794f;
import ax.f1.C2015i;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class E extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean b;
    protected final AtomicReference c;
    private final Handler d;
    protected final C0747h e;

    E(InterfaceC0794f interfaceC0794f, C0747h c0747h) {
        super(interfaceC0794f);
        this.c = new AtomicReference(null);
        this.d = new ax.Y5.k(Looper.getMainLooper());
        this.e = c0747h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C0742c c0742c, int i) {
        this.c.set(null);
        m(c0742c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.c.set(null);
        n();
    }

    private static final int p(B b) {
        if (b == null) {
            return -1;
        }
        return b.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i, int i2, Intent intent) {
        B b = (B) this.c.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.e.g(b());
                if (g == 0) {
                    o();
                    return;
                } else {
                    if (b == null) {
                        return;
                    }
                    if (b.b().k() == 18 && g == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            o();
            return;
        } else if (i2 == 0) {
            if (b != null) {
                l(new C0742c(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, b.b().toString()), p(b));
                return;
            }
            return;
        }
        if (b != null) {
            l(b.b(), b.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.c.set(bundle.getBoolean("resolving_error", false) ? new B(new C0742c(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        B b = (B) this.c.get();
        if (b == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", b.a());
        bundle.putInt("failed_status", b.b().k());
        bundle.putParcelable("failed_resolution", b.b().z());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.b = false;
    }

    protected abstract void m(C0742c c0742c, int i);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new C0742c(13, null), p((B) this.c.get()));
    }

    public final void s(C0742c c0742c, int i) {
        AtomicReference atomicReference;
        B b = new B(c0742c, i);
        do {
            atomicReference = this.c;
            if (C2015i.a(atomicReference, null, b)) {
                this.d.post(new D(this, b));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
