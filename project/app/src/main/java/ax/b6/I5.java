/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.F5;
import ax.b6.G5;
import ax.b6.c6;
import ax.b6.k4;
import java.io.IOException;

final class I5
extends G5<F5, F5> {
    I5() {
    }

    private static void m(Object object, F5 f52) {
        ((k4)object).zzb = f52;
    }

    @Override
    final /* synthetic */ int a(Object object) {
        return ((F5)object).a();
    }

    @Override
    final /* synthetic */ Object b(Object object, Object object2) {
        object = (F5)object;
        object2 = (F5)object2;
        if (F5.k().equals(object2)) {
            return object;
        }
        if (F5.k().equals(object)) {
            return F5.c((F5)object, (F5)object2);
        }
        return ((F5)object).b((F5)object2);
    }

    @Override
    final /* synthetic */ void c(Object object, int n8, B3 b32) {
        ((F5)object).e(n8 << 3 | 2, b32);
    }

    @Override
    final /* synthetic */ void d(Object object, c6 c62) throws IOException {
        ((F5)object).g(c62);
    }

    @Override
    final /* synthetic */ int e(Object object) {
        return ((F5)object).i();
    }

    @Override
    final /* synthetic */ void f(Object object, int n8, long l8) {
        ((F5)object).e(n8 << 3, l8);
    }

    @Override
    final /* synthetic */ void g(Object object, c6 c62) throws IOException {
        ((F5)object).j(c62);
    }

    @Override
    final /* synthetic */ void h(Object object, Object object2) {
        I5.m(object, (F5)object2);
    }

    @Override
    final /* synthetic */ Object i(Object object) {
        F5 f52;
        F5 f53 = f52 = ((k4)object).zzb;
        if (f52 == F5.k()) {
            f53 = F5.l();
            I5.m(object, f53);
        }
        return f53;
    }

    @Override
    final /* synthetic */ void j(Object object, Object object2) {
        I5.m(object, (F5)object2);
    }

    @Override
    final /* synthetic */ Object k(Object object) {
        return ((k4)object).zzb;
    }

    @Override
    final void l(Object object) {
        ((k4)object).zzb.m();
    }
}

