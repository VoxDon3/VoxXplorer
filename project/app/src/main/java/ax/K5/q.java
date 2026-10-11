/*
 * Decompiled with CFR 0.152.
 */
package ax.K5;

import ax.K5.g;
import ax.K5.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class q<R extends l>
extends BasePendingResult<R> {
    private final l o;

    public q(g g8, l l8) {
        super(g8);
        this.o = l8;
    }

    @Override
    protected final R c(Status status) {
        return (R)this.o;
    }
}

