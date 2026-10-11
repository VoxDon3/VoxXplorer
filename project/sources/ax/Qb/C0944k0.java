package ax.Qb;

import java.util.concurrent.Executor;

/* renamed from: ax.Qb.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0944k0 {
    public static final G a(Executor executor) {
        G g;
        X x = executor instanceof X ? (X) executor : null;
        return (x == null || (g = x.q) == null) ? new C0942j0(executor) : g;
    }
}
