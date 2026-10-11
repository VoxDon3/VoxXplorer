package ax.c1;

import ax.N1.t;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.X1.C1141b;
import ax.X1.C1144e;
import ax.X1.C1147h;
import ax.X1.K;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.M;
import ax.q1.r;
import java.io.IOException;

/* renamed from: ax.c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1804a implements f {
    private static final M f = new M();
    final r a;
    private final C0912v b;
    private final ax.S0.M c;
    private final t.a d;
    private final boolean e;

    C1804a(r rVar, C0912v c0912v, ax.S0.M m, t.a aVar, boolean z) {
        this.a = rVar;
        this.b = c0912v;
        this.c = m;
        this.d = aVar;
        this.e = z;
    }

    @Override // ax.c1.f
    public void a(InterfaceC2859t interfaceC2859t) {
        this.a.a(interfaceC2859t);
    }

    @Override // ax.c1.f
    public boolean b(InterfaceC2858s interfaceC2858s) throws IOException {
        return this.a.f(interfaceC2858s, f) == 0;
    }

    @Override // ax.c1.f
    public void c() {
        this.a.b(0L, 0L);
    }

    @Override // ax.c1.f
    public boolean d() {
        r e = this.a.e();
        return (e instanceof C1147h) || (e instanceof C1141b) || (e instanceof C1144e) || (e instanceof ax.J1.f);
    }

    @Override // ax.c1.f
    public boolean e() {
        r e = this.a.e();
        return (e instanceof K) || (e instanceof ax.K1.h);
    }

    @Override // ax.c1.f
    public f f() {
        r fVar;
        C0968a.g(!e());
        C0968a.h(this.a.e() == this.a, "Can't recreate wrapped extractors. Outer type: " + this.a.getClass());
        r rVar = this.a;
        if (rVar instanceof k) {
            fVar = new k(this.b.d, this.c, this.d, this.e);
        } else if (rVar instanceof C1147h) {
            fVar = new C1147h();
        } else if (rVar instanceof C1141b) {
            fVar = new C1141b();
        } else if (rVar instanceof C1144e) {
            fVar = new C1144e();
        } else {
            if (!(rVar instanceof ax.J1.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.a.getClass().getSimpleName());
            }
            fVar = new ax.J1.f();
        }
        return new C1804a(fVar, this.b, this.c, this.d, this.e);
    }
}
