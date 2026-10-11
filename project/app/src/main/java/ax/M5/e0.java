/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import ax.M5.U;
import ax.M5.c;
import ax.M5.i0;
import ax.M5.p;

public final class e0
extends U {
    private c e;
    private final int f;

    public e0(c c8, int n8) {
        this.e = c8;
        this.f = n8;
    }

    @Override
    public final void R0(int n8, IBinder iBinder, Bundle bundle) {
        p.m(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
        this.e.N(n8, iBinder, bundle, this.f);
        this.e = null;
    }

    @Override
    public final void c1(int n8, IBinder iBinder, i0 i02) {
        c c8 = this.e;
        p.m(c8, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        p.l(i02);
        c.c0(c8, i02);
        this.R0(n8, iBinder, i02.q);
    }

    @Override
    public final void q0(int n8, Bundle bundle) {
        Log.wtf((String)"GmsClient", (String)"received deprecated onAccountValidationComplete callback, ignoring", (Throwable)new Exception());
    }
}

