/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.k;
import ax.P0.v;
import ax.S0.G;
import ax.q1.T;
import ax.q1.U;
import java.io.EOFException;
import java.io.IOException;

public final class o
implements U {
    private final byte[] a = new byte[4096];

    @Override
    public /* synthetic */ int a(k k8, int n8, boolean bl) {
        return T.b(this, k8, n8, bl);
    }

    @Override
    public void b(G g8, int n8, int n9) {
        g8.c0(n8);
    }

    @Override
    public int c(k k8, int n8, boolean bl, int n9) throws IOException {
        n8 = Math.min(this.a.length, n8);
        if ((n8 = k8.c(this.a, 0, n8)) == -1) {
            if (bl) {
                return -1;
            }
            throw new EOFException();
        }
        return n8;
    }

    @Override
    public /* synthetic */ void d(long l8) {
        T.a(this, l8);
    }

    @Override
    public void e(v v8) {
    }

    @Override
    public void f(long l8, int n8, int n9, int n10, U.a a8) {
    }

    @Override
    public /* synthetic */ void g(G g8, int n8) {
        T.c(this, g8, n8);
    }
}

