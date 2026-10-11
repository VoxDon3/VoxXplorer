package ax.i1;

import androidx.media3.exoplayer.C0618p0;
import ax.S0.C0968a;
import ax.i1.InterfaceC2206C;
import ax.i1.InterfaceC2209F;
import ax.l1.InterfaceC2445D;
import java.io.IOException;

/* renamed from: ax.i1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2235z implements InterfaceC2206C, InterfaceC2206C.a {
    private final long c0;
    private final ax.m1.b d0;
    private InterfaceC2209F e0;
    private InterfaceC2206C f0;
    private InterfaceC2206C.a g0;
    private a h0;
    private boolean i0;
    private long j0 = -9223372036854775807L;
    public final InterfaceC2209F.b q;

    /* renamed from: ax.i1.z$a */
    public interface a {
        void a(InterfaceC2209F.b bVar);

        void b(InterfaceC2209F.b bVar, IOException iOException);
    }

    public C2235z(InterfaceC2209F.b bVar, ax.m1.b bVar2, long j) {
        this.q = bVar;
        this.d0 = bVar2;
        this.c0 = j;
    }

    private long r(long j) {
        long j2 = this.j0;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean a(C0618p0 c0618p0) {
        InterfaceC2206C interfaceC2206C = this.f0;
        return interfaceC2206C != null && interfaceC2206C.a(c0618p0);
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long b() {
        return ((InterfaceC2206C) ax.S0.d0.i(this.f0)).b();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean c() {
        InterfaceC2206C interfaceC2206C = this.f0;
        return interfaceC2206C != null && interfaceC2206C.c();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long d() {
        return ((InterfaceC2206C) ax.S0.d0.i(this.f0)).d();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public void e(long j) {
        ((InterfaceC2206C) ax.S0.d0.i(this.f0)).e(j);
    }

    @Override // ax.i1.InterfaceC2206C.a
    public void f(InterfaceC2206C interfaceC2206C) {
        ((InterfaceC2206C.a) ax.S0.d0.i(this.g0)).f(this);
        a aVar = this.h0;
        if (aVar != null) {
            aVar.a(this.q);
        }
    }

    @Override // ax.i1.InterfaceC2206C
    public long g(InterfaceC2445D[] interfaceC2445DArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j) {
        long j2 = this.j0;
        long j3 = (j2 == -9223372036854775807L || j != this.c0) ? j : j2;
        this.j0 = -9223372036854775807L;
        return ((InterfaceC2206C) ax.S0.d0.i(this.f0)).g(interfaceC2445DArr, zArr, e0VarArr, zArr2, j3);
    }

    public void j(InterfaceC2209F.b bVar) {
        long r = r(this.c0);
        InterfaceC2206C i = ((InterfaceC2209F) C0968a.e(this.e0)).i(bVar, this.d0, r);
        this.f0 = i;
        if (this.g0 != null) {
            i.n(this, r);
        }
    }

    @Override // ax.i1.InterfaceC2206C
    public void l() throws IOException {
        try {
            InterfaceC2206C interfaceC2206C = this.f0;
            if (interfaceC2206C != null) {
                interfaceC2206C.l();
                return;
            }
            InterfaceC2209F interfaceC2209F = this.e0;
            if (interfaceC2209F != null) {
                interfaceC2209F.k();
            }
        } catch (IOException e) {
            a aVar = this.h0;
            if (aVar == null) {
                throw e;
            }
            if (this.i0) {
                return;
            }
            this.i0 = true;
            aVar.b(this.q, e);
        }
    }

    @Override // ax.i1.InterfaceC2206C
    public long m(long j) {
        return ((InterfaceC2206C) ax.S0.d0.i(this.f0)).m(j);
    }

    @Override // ax.i1.InterfaceC2206C
    public void n(InterfaceC2206C.a aVar, long j) {
        this.g0 = aVar;
        InterfaceC2206C interfaceC2206C = this.f0;
        if (interfaceC2206C != null) {
            interfaceC2206C.n(this, r(this.c0));
        }
    }

    public long o() {
        return this.j0;
    }

    public long p() {
        return this.c0;
    }

    @Override // ax.i1.InterfaceC2206C
    public long q(long j, ax.Y0.Z z) {
        return ((InterfaceC2206C) ax.S0.d0.i(this.f0)).q(j, z);
    }

    @Override // ax.i1.InterfaceC2206C
    public long s() {
        return ((InterfaceC2206C) ax.S0.d0.i(this.f0)).s();
    }

    @Override // ax.i1.InterfaceC2206C
    public q0 t() {
        return ((InterfaceC2206C) ax.S0.d0.i(this.f0)).t();
    }

    @Override // ax.i1.f0.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void i(InterfaceC2206C interfaceC2206C) {
        ((InterfaceC2206C.a) ax.S0.d0.i(this.g0)).i(this);
    }

    @Override // ax.i1.InterfaceC2206C
    public void v(long j, boolean z) {
        ((InterfaceC2206C) ax.S0.d0.i(this.f0)).v(j, z);
    }

    public void w(long j) {
        this.j0 = j;
    }

    public void x() {
        if (this.f0 != null) {
            ((InterfaceC2209F) C0968a.e(this.e0)).e(this.f0);
        }
    }

    public void y(InterfaceC2209F interfaceC2209F) {
        C0968a.g(this.e0 == null);
        this.e0 = interfaceC2209F;
    }
}
