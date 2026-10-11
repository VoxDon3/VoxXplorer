package ax.b6;

import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* renamed from: ax.b6.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1605l1 extends W0.a {
    private final /* synthetic */ String f0;
    private final /* synthetic */ String g0;
    private final /* synthetic */ boolean h0;
    private final /* synthetic */ I0 i0;
    private final /* synthetic */ W0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1605l1(W0 w0, String str, String str2, boolean z, I0 i0) {
        super(w0);
        this.f0 = str;
        this.g0 = str2;
        this.h0 = z;
        this.i0 = i0;
        this.j0 = w0;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        h0 = this.j0.i;
        ((H0) C0821p.l(h0)).getUserProperties(this.f0, this.g0, this.h0, this.i0);
    }

    @Override // ax.b6.W0.a
    protected final void b() {
        this.i0.n(null);
    }
}
