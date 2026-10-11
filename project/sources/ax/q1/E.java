package ax.q1;

import ax.P0.C0912v;
import ax.P0.InterfaceC0902k;
import ax.q1.U;
import java.io.IOException;

/* loaded from: classes.dex */
public class E implements U {
    private final U a;

    public E(U u) {
        this.a = u;
    }

    @Override // ax.q1.U
    public int a(InterfaceC0902k interfaceC0902k, int i, boolean z) throws IOException {
        return this.a.a(interfaceC0902k, i, z);
    }

    @Override // ax.q1.U
    public void b(ax.S0.G g, int i, int i2) {
        this.a.b(g, i, i2);
    }

    @Override // ax.q1.U
    public int c(InterfaceC0902k interfaceC0902k, int i, boolean z, int i2) throws IOException {
        return this.a.c(interfaceC0902k, i, z, i2);
    }

    @Override // ax.q1.U
    public void d(long j) {
        this.a.d(j);
    }

    @Override // ax.q1.U
    public void e(C0912v c0912v) {
        this.a.e(c0912v);
    }

    @Override // ax.q1.U
    public void f(long j, int i, int i2, int i3, U.a aVar) {
        this.a.f(j, i, i2, i3, aVar);
    }

    @Override // ax.q1.U
    public void g(ax.S0.G g, int i) {
        this.a.g(g, i);
    }
}
