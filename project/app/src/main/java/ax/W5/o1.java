/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.A0;
import ax.W5.H0;
import ax.W5.I0;
import ax.W5.J0;
import ax.W5.M1;
import ax.W5.O1;
import ax.W5.g0;
import ax.W5.j1;
import ax.W5.v1;
import ax.W5.x1;
import java.io.IOException;

final class o1
implements v1 {
    private final j1 a;
    private final M1 b;
    private final A0 c;

    private o1(M1 m12, A0 a02, j1 j12) {
        this.b = m12;
        this.c = a02;
        this.a = j12;
    }

    static o1 a(M1 m12, A0 a02, j1 j12) {
        return new o1(m12, a02, j12);
    }

    @Override
    public final int b(Object object) {
        return this.b.b(object).hashCode();
    }

    @Override
    public final void c(Object object) {
        this.b.e(object);
        this.c.b(object);
    }

    @Override
    public final void d(Object object, byte[] object2, int n8, int n9, g0 g02) throws IOException {
        object2 = (J0)object;
        if (object2.zzc == O1.a()) {
            object2.zzc = O1.d();
        }
        object = (I0)object;
        throw null;
    }

    @Override
    public final Object e() {
        j1 j12 = this.a;
        if (j12 instanceof J0) {
            return ((J0)j12).c();
        }
        return ((H0)((J0)j12).o(5, null, null)).e();
    }

    @Override
    public final void f(Object object, Object object2) {
        x1.d(this.b, object, object2);
    }

    @Override
    public final boolean g(Object object) {
        this.c.a(object);
        throw null;
    }

    @Override
    public final boolean h(Object object, Object object2) {
        return this.b.b(object).equals(this.b.b(object2));
    }
}

