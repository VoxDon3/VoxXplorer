/*
 * Decompiled with CFR 0.152.
 */
package ax.w1;

import ax.P0.E;
import ax.S0.G;
import ax.q1.U;

abstract class e {
    protected final U a;

    protected e(U u8) {
        this.a = u8;
    }

    public final boolean a(G g8, long l8) throws E {
        return this.b(g8) && this.c(g8, l8);
    }

    protected abstract boolean b(G var1) throws E;

    protected abstract boolean c(G var1, long var2) throws E;

    public static final class a
    extends E {
        public a(String string) {
            super(string, null, false, 1);
        }
    }
}

