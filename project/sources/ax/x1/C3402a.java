package ax.x1;

import ax.S0.G;
import ax.q1.C2857q;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.M;
import ax.q1.P;
import ax.q1.r;
import java.io.IOException;
import java.util.List;

/* renamed from: ax.x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3402a implements r {
    private final G a = new G(4);
    private final P b = new P(-1, -1, "image/heif");

    private boolean g(InterfaceC2858s interfaceC2858s, int i) throws IOException {
        this.a.X(4);
        interfaceC2858s.p(this.a.f(), 0, 4);
        return this.a.O() == ((long) i);
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.b.a(interfaceC2859t);
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        this.b.b(j, j2);
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.j(4);
        return g(interfaceC2858s, 1718909296) && g(interfaceC2858s, 1751476579);
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        return this.b.f(interfaceC2858s, m);
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    @Override // ax.q1.r
    public void d() {
    }
}
