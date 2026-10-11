/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.E4;
import ax.b6.G4;
import ax.b6.G5;
import ax.b6.H4;
import ax.b6.J4;
import ax.b6.K4;
import ax.b6.P4;
import ax.b6.R4;
import ax.b6.S4;
import ax.b6.X4;
import ax.b6.Y3;
import ax.b6.Z4;
import ax.b6.a4;
import ax.b6.c5;
import ax.b6.e5;
import ax.b6.k5;
import ax.b6.l4;
import ax.b6.l5;
import ax.b6.m4;
import ax.b6.n5;

final class I4
implements k5 {
    private static final R4 b = new H4();
    private final R4 a;

    public I4() {
        this(new J4(l4.c(), b));
    }

    private I4(R4 r42) {
        this.a = m4.f(r42, "messageInfoFactory");
    }

    @Override
    public final <T> l5<T> a(Class<T> clazz) {
        n5.o(clazz);
        S4 s42 = this.a.a(clazz);
        if (s42.c()) {
            return Z4.j(n5.f(), a4.a(), s42.a());
        }
        c5 c52 = e5.a();
        E4 e42 = G4.a();
        G5<?, ?> g52 = n5.f();
        Y3<Object> y32 = K4.a[s42.b().ordinal()] != 1 ? a4.a() : null;
        return X4.n(clazz, s42, c52, e42, g52, y32, P4.a());
    }
}

