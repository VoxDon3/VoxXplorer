/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import ax.N1.d;
import ax.N1.e;
import ax.N1.t;
import ax.N1.v;
import ax.P0.D;
import ax.P0.k;
import ax.S0.G;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.u;
import ax.q1.T;
import ax.q1.U;
import java.io.EOFException;
import java.io.IOException;

final class w
implements U {
    private final U a;
    private final t.a b;
    private final d c;
    private final G d;
    private int e;
    private int f;
    private byte[] g;
    private t h;
    private ax.P0.v i;
    private boolean j;

    public w(U u8, t.a a8) {
        this.a = u8;
        this.b = a8;
        this.c = new d();
        this.e = 0;
        this.f = 0;
        this.g = d0.f;
        this.d = new G();
    }

    public static /* synthetic */ void h(w w8, long l8, int n8, e e8) {
        w8.j(e8, l8, n8);
    }

    private void i(int n8) {
        byte[] byArray;
        int n9 = this.g.length;
        int n10 = this.f;
        if (n9 - n10 >= n8) {
            return;
        }
        byte[] byArray2 = (n8 = Math.max((n10 -= this.e) * 2, n8 + n10)) <= (byArray = this.g).length ? byArray : new byte[n8];
        System.arraycopy(byArray, this.e, byArray2, 0, n10);
        this.e = 0;
        this.f = n10;
        this.g = byArray2;
    }

    private void j(e e8, long l8, int n8) {
        ax.S0.a.i(this.i);
        byte[] byArray = this.c.a(e8.a, e8.c);
        this.d.Y(byArray);
        this.a.g(this.d, byArray.length);
        long l9 = e8.b;
        if (l9 == -9223372036854775807L) {
            boolean bl = this.i.t == Long.MAX_VALUE;
            ax.S0.a.g(bl);
        } else {
            long l10 = this.i.t;
            l8 = l10 == Long.MAX_VALUE ? (l8 += l9) : l9 + l10;
        }
        this.a.f(l8, n8 | 1, byArray.length, 0, null);
    }

    @Override
    public /* synthetic */ int a(k k8, int n8, boolean bl) {
        return T.b(this, k8, n8, bl);
    }

    @Override
    public void b(G g8, int n8, int n9) {
        if (this.h == null) {
            this.a.b(g8, n8, n9);
            return;
        }
        this.i(n8);
        g8.q(this.g, this.f, n8);
        this.f += n8;
    }

    @Override
    public int c(k k8, int n8, boolean bl, int n9) throws IOException {
        if (this.h == null) {
            return this.a.c(k8, n8, bl, n9);
        }
        this.i(n8);
        n8 = k8.c(this.g, this.f, n8);
        if (n8 == -1) {
            if (bl) {
                return -1;
            }
            throw new EOFException();
        }
        this.f += n8;
        return n8;
    }

    @Override
    public /* synthetic */ void d(long l8) {
        T.a(this, l8);
    }

    @Override
    public void e(ax.P0.v v8) {
        ax.S0.a.e(v8.o);
        boolean bl = D.k(v8.o) == 3;
        ax.S0.a.a(bl);
        if (!v8.equals(this.i)) {
            this.i = v8;
            t t8 = this.b.b(v8) ? this.b.c(v8) : null;
            this.h = t8;
        }
        if (this.h == null) {
            this.a.e(v8);
            return;
        }
        this.a.e(v8.b().y0("application/x-media3-cues").U(v8.o).C0(Long.MAX_VALUE).Y(this.b.a(v8)).P());
    }

    @Override
    public void f(long l8, int n8, int n9, int n10, U.a object) {
        RuntimeException runtimeException2;
        block4: {
            if (this.h == null) {
                this.a.f(l8, n8, n9, n10, (U.a)object);
                return;
            }
            boolean bl = object == null;
            ax.S0.a.b(bl, "DRM on subtitles is not supported");
            n10 = this.f - n10 - n9;
            try {
                object = this.h;
                byte[] byArray = this.g;
                t.b b8 = t.b.b();
                v v8 = new v(this, l8, n8);
                object.c(byArray, n10, n9, b8, v8);
            }
            catch (RuntimeException runtimeException2) {
                if (!this.j) break block4;
                u.i("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException2);
            }
            this.e = n8 = n10 + n9;
            if (n8 == this.f) {
                this.e = 0;
                this.f = 0;
            }
            return;
        }
        throw runtimeException2;
    }

    @Override
    public /* synthetic */ void g(G g8, int n8) {
        T.c(this, g8, n8);
    }

    public void k(boolean bl) {
        this.j = bl;
    }
}

