package ax.Qb;

import java.util.concurrent.CancellationException;

/* renamed from: ax.Qb.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0938h0 {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
