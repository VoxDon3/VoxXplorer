/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.net.Uri;
import ax.S0.G;
import ax.U0.g;
import ax.U0.k;
import ax.U0.z;
import java.io.IOException;
import java.util.List;
import java.util.Map;

final class x
implements g {
    private final g a;
    private final int b;
    private final a c;
    private final byte[] d;
    private int e;

    public x(g g8, int n8, a a8) {
        boolean bl = n8 > 0;
        ax.S0.a.a(bl);
        this.a = g8;
        this.b = n8;
        this.c = a8;
        this.d = new byte[1];
        this.e = n8;
    }

    private boolean q() throws IOException {
        int n8;
        if (this.a.c(this.d, 0, 1) == -1) {
            return false;
        }
        int n9 = (this.d[0] & 0xFF) << 4;
        if (n9 == 0) {
            return true;
        }
        byte[] byArray = new byte[n9];
        int n10 = n9;
        int n11 = 0;
        while (true) {
            if (n10 <= 0) break;
            n8 = this.a.c(byArray, n11, n10);
            if (n8 == -1) {
                return false;
            }
            n11 += n8;
            n10 -= n8;
        }
        for (n8 = n9; n8 > 0 && byArray[n8 - 1] == 0; --n8) {
        }
        if (n8 > 0) {
            this.c.b(new G(byArray, n8));
        }
        return true;
    }

    @Override
    public Uri b() {
        return this.a.b();
    }

    @Override
    public int c(byte[] byArray, int n8, int n9) throws IOException {
        if (this.e == 0) {
            if (this.q()) {
                this.e = this.b;
            } else {
                return -1;
            }
        }
        if ((n8 = this.a.c(byArray, n8, Math.min(this.e, n9))) != -1) {
            this.e -= n8;
        }
        return n8;
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void d(z z8) {
        ax.S0.a.e(z8);
        this.a.d(z8);
    }

    @Override
    public long f(k k8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<String, List<String>> l() {
        return this.a.l();
    }

    public static interface a {
        public void b(G var1);
    }
}

