/*
 * Decompiled with CFR 0.152.
 */
package ax.G1;

import ax.G1.a;
import ax.G1.d;
import ax.G1.e;
import ax.G1.f;
import ax.G1.g;
import ax.P0.C;
import ax.S0.F;
import ax.S0.G;
import ax.S0.M;
import ax.V0.i;
import ax.z1.b;
import java.nio.ByteBuffer;

public final class c
extends ax.z1.c {
    private final G a = new G();
    private final F b = new F();
    private M c;

    @Override
    protected C b(b object, ByteBuffer byteBuffer) {
        M m8 = this.c;
        if (m8 == null || ((b)object).k0 != m8.f()) {
            this.c = m8 = new M(((i)object).g0);
            m8.a(((i)object).g0 - ((b)object).k0);
        }
        object = byteBuffer.array();
        int n8 = byteBuffer.limit();
        this.a.Z((byte[])object, n8);
        this.b.o((byte[])object, n8);
        this.b.r(39);
        long l8 = (long)this.b.h(1) << 32 | (long)this.b.h(32);
        this.b.r(20);
        int n9 = this.b.h(12);
        n8 = this.b.h(8);
        this.a.c0(14);
        object = n8 != 0 ? (n8 != 255 ? (n8 != 4 ? (n8 != 5 ? (n8 != 6 ? null : g.d(this.a, l8, this.c)) : d.d(this.a, l8, this.c)) : f.d(this.a)) : ax.G1.a.d(this.a, n9, l8)) : new e();
        if (object == null) {
            return new C(new C.a[0]);
        }
        return new C(new C.a[]{object});
    }
}

