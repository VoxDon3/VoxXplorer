package ax.K5;

import ax.K5.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes3.dex */
final class q<R extends l> extends BasePendingResult<R> {
    private final l o;

    public q(g gVar, l lVar) {
        super(gVar);
        this.o = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R c(Status status) {
        return (R) this.o;
    }
}
