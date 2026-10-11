package ax.H5;

import android.os.RemoteException;
import ax.K5.a;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
final class m extends n {
    m(ax.K5.g gVar) {
        super(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC3608b
    protected final /* bridge */ /* synthetic */ void l(a.b bVar) throws RemoteException {
        i iVar = (i) bVar;
        ((u) iVar.D()).B(new l(this), iVar.m0());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ ax.K5.l c(Status status) {
        return status;
    }
}
