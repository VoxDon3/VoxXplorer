package ax.N1;

import ax.N1.t;
import ax.P0.C0912v;
import ax.P0.D;
import ax.P0.InterfaceC0902k;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.InterfaceC0979l;
import ax.S0.d0;
import ax.q1.T;
import ax.q1.U;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
final class w implements U {
    private final U a;
    private final t.a b;
    private t h;
    private C0912v i;
    private boolean j;
    private final d c = new d();
    private int e = 0;
    private int f = 0;
    private byte[] g = d0.f;
    private final G d = new G();

    public w(U u, t.a aVar) {
        this.a = u;
        this.b = aVar;
    }

    private void i(int i) {
        int length = this.g.length;
        int i2 = this.f;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.e;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.g;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.e, bArr2, 0, i3);
        this.e = 0;
        this.f = i3;
        this.g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(e eVar, long j, int i) {
        C0968a.i(this.i);
        byte[] a = this.c.a(eVar.a, eVar.c);
        this.d.Y(a);
        this.a.g(this.d, a.length);
        long j2 = eVar.b;
        if (j2 == -9223372036854775807L) {
            C0968a.g(this.i.t == Long.MAX_VALUE);
        } else {
            long j3 = this.i.t;
            j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
        }
        this.a.f(j, i | 1, a.length, 0, null);
    }

    @Override // ax.q1.U
    public /* synthetic */ int a(InterfaceC0902k interfaceC0902k, int i, boolean z) {
        return T.b(this, interfaceC0902k, i, z);
    }

    @Override // ax.q1.U
    public void b(G g, int i, int i2) {
        if (this.h == null) {
            this.a.b(g, i, i2);
            return;
        }
        i(i);
        g.q(this.g, this.f, i);
        this.f += i;
    }

    @Override // ax.q1.U
    public int c(InterfaceC0902k interfaceC0902k, int i, boolean z, int i2) throws IOException {
        if (this.h == null) {
            return this.a.c(interfaceC0902k, i, z, i2);
        }
        i(i);
        int c = interfaceC0902k.c(this.g, this.f, i);
        if (c != -1) {
            this.f += c;
            return c;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // ax.q1.U
    public /* synthetic */ void d(long j) {
        T.a(this, j);
    }

    @Override // ax.q1.U
    public void e(C0912v c0912v) {
        C0968a.e(c0912v.o);
        C0968a.a(D.k(c0912v.o) == 3);
        if (!c0912v.equals(this.i)) {
            this.i = c0912v;
            this.h = this.b.b(c0912v) ? this.b.c(c0912v) : null;
        }
        if (this.h == null) {
            this.a.e(c0912v);
        } else {
            this.a.e(c0912v.b().y0("application/x-media3-cues").U(c0912v.o).C0(Long.MAX_VALUE).Y(this.b.a(c0912v)).P());
        }
    }

    @Override // ax.q1.U
    public void f(final long j, final int i, int i2, int i3, U.a aVar) {
        if (this.h == null) {
            this.a.f(j, i, i2, i3, aVar);
            return;
        }
        C0968a.b(aVar == null, "DRM on subtitles is not supported");
        int i4 = (this.f - i3) - i2;
        try {
            this.h.c(this.g, i4, i2, t.b.b(), new InterfaceC0979l() { // from class: ax.N1.v
                @Override // ax.S0.InterfaceC0979l
                public final void accept(Object obj) {
                    w.this.j((e) obj, j, i);
                }
            });
        } catch (RuntimeException e) {
            if (!this.j) {
                throw e;
            }
            C0987u.i("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.e = i5;
        if (i5 == this.f) {
            this.e = 0;
            this.f = 0;
        }
    }

    @Override // ax.q1.U
    public /* synthetic */ void g(G g, int i) {
        T.c(this, g, i);
    }

    public void k(boolean z) {
        this.j = z;
    }
}
