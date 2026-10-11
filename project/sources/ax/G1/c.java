package ax.G1;

import ax.P0.C;
import ax.S0.F;
import ax.S0.G;
import ax.S0.M;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c extends ax.z1.c {
    private final G a = new G();
    private final F b = new F();
    private M c;

    @Override // ax.z1.c
    protected C b(ax.z1.b bVar, ByteBuffer byteBuffer) {
        M m = this.c;
        if (m == null || bVar.k0 != m.f()) {
            M m2 = new M(bVar.g0);
            this.c = m2;
            m2.a(bVar.g0 - bVar.k0);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.Z(array, limit);
        this.b.o(array, limit);
        this.b.r(39);
        long h = (this.b.h(1) << 32) | this.b.h(32);
        this.b.r(20);
        int h2 = this.b.h(12);
        int h3 = this.b.h(8);
        this.a.c0(14);
        C.a d = h3 != 0 ? h3 != 255 ? h3 != 4 ? h3 != 5 ? h3 != 6 ? null : g.d(this.a, h, this.c) : d.d(this.a, h, this.c) : f.d(this.a) : a.d(this.a, h2, h) : new e();
        return d == null ? new C(new C.a[0]) : new C(d);
    }
}
