/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.U4;
import ax.b6.W3;
import ax.b6.Y3;
import ax.b6.c6;
import ax.b6.d4;
import ax.b6.k4;
import java.io.IOException;
import java.util.Map;

final class b4
extends Y3<k4.c> {
    b4() {
    }

    @Override
    final int a(Map.Entry<?, ?> object) {
        object = (k4.c)object.getKey();
        throw new NoSuchMethodError();
    }

    @Override
    final d4<k4.c> b(Object object) {
        return ((k4.d)object).zzc;
    }

    @Override
    final Object c(W3 w32, U4 u42, int n8) {
        return w32.b(u42, n8);
    }

    @Override
    final void d(c6 object, Map.Entry<?, ?> entry) throws IOException {
        object = (k4.c)entry.getKey();
        throw new NoSuchMethodError();
    }

    @Override
    final boolean e(U4 u42) {
        return u42 instanceof k4.d;
    }

    @Override
    final d4<k4.c> f(Object object) {
        return ((k4.d)object).I();
    }

    @Override
    final void g(Object object) {
        ((Y3)this).b(object).q();
    }
}

