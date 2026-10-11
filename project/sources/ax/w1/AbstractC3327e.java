package ax.w1;

import ax.P0.E;
import ax.S0.G;
import ax.q1.U;

/* renamed from: ax.w1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3327e {
    protected final U a;

    /* renamed from: ax.w1.e$a */
    public static final class a extends E {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    protected AbstractC3327e(U u) {
        this.a = u;
    }

    public final boolean a(G g, long j) throws E {
        return b(g) && c(g, j);
    }

    protected abstract boolean b(G g) throws E;

    protected abstract boolean c(G g, long j) throws E;
}
