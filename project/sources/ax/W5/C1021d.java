package ax.W5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import ax.J5.C0752m;
import ax.L5.InterfaceC0791c;
import ax.L5.InterfaceC0797i;
import ax.M5.AbstractC0812g;
import ax.M5.C0809d;

/* renamed from: ax.W5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1021d extends AbstractC0812g {
    private final Bundle J0;

    public C1021d(Context context, Looper looper, C0809d c0809d, ax.E5.c cVar, InterfaceC0791c interfaceC0791c, InterfaceC0797i interfaceC0797i) {
        super(context, looper, 16, c0809d, interfaceC0791c, interfaceC0797i);
        this.J0 = cVar == null ? new Bundle() : cVar.a();
    }

    @Override // ax.M5.AbstractC0808c
    protected final Bundle A() {
        return this.J0;
    }

    @Override // ax.M5.AbstractC0808c
    protected final String E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // ax.M5.AbstractC0808c
    protected final String F() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // ax.M5.AbstractC0808c
    public final boolean S() {
        return true;
    }

    @Override // ax.M5.AbstractC0808c, ax.K5.a.f
    public final int k() {
        return C0752m.a;
    }

    @Override // ax.M5.AbstractC0808c, ax.K5.a.f
    public final boolean o() {
        C0809d j0 = j0();
        return (TextUtils.isEmpty(j0.b()) || j0.e(ax.E5.b.a).isEmpty()) ? false : true;
    }

    @Override // ax.M5.AbstractC0808c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof C1024e ? (C1024e) queryLocalInterface : new C1024e(iBinder);
    }
}
