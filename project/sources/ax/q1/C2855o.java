package ax.q1;

import ax.P0.C0912v;
import ax.P0.InterfaceC0902k;
import ax.q1.U;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: ax.q1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2855o implements U {
    private final byte[] a = new byte[4096];

    @Override // ax.q1.U
    public /* synthetic */ int a(InterfaceC0902k interfaceC0902k, int i, boolean z) {
        return T.b(this, interfaceC0902k, i, z);
    }

    @Override // ax.q1.U
    public void b(ax.S0.G g, int i, int i2) {
        g.c0(i);
    }

    @Override // ax.q1.U
    public int c(InterfaceC0902k interfaceC0902k, int i, boolean z, int i2) throws IOException {
        int c = interfaceC0902k.c(this.a, 0, Math.min(this.a.length, i));
        if (c != -1) {
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
    public /* synthetic */ void g(ax.S0.G g, int i) {
        T.c(this, g, i);
    }

    @Override // ax.q1.U
    public void e(C0912v c0912v) {
    }

    @Override // ax.q1.U
    public void f(long j, int i, int i2, int i3, U.a aVar) {
    }
}
