package ax.H5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ax.J5.C0752m;
import ax.K5.g;
import ax.M5.AbstractC0812g;
import ax.M5.C0809d;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class i extends AbstractC0812g {
    private final GoogleSignInOptions J0;

    public i(Context context, Looper looper, C0809d c0809d, GoogleSignInOptions googleSignInOptions, g.a aVar, g.b bVar) {
        super(context, looper, 91, c0809d, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar2.e(ax.X5.b.a());
        if (!c0809d.d().isEmpty()) {
            Iterator<Scope> it = c0809d.d().iterator();
            while (it.hasNext()) {
                aVar2.d(it.next(), new Scope[0]);
            }
        }
        this.J0 = aVar2.a();
    }

    @Override // ax.M5.AbstractC0808c
    protected final String E() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // ax.M5.AbstractC0808c
    protected final String F() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // ax.M5.AbstractC0808c, ax.K5.a.f
    public final int k() {
        return C0752m.a;
    }

    public final GoogleSignInOptions m0() {
        return this.J0;
    }

    @Override // ax.M5.AbstractC0808c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof u ? (u) queryLocalInterface : new u(iBinder);
    }
}
